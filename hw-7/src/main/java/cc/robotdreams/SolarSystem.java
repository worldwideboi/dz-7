package cc.robotdreams;

public enum SolarSystem
{
    MERCURY(0, 100),
    VENUS(100, 200, MERCURY),
    EARTH(100, 300, VENUS),
    MARS(100, 400, EARTH),
    JUPITER(100, 500, MARS),
    SATURN(100, 600, JUPITER),
    URANUS(100, 700, SATURN),
    NEPTUNE(100, 800, URANUS);

    final public int num;
    final public int prevDistance;
    final public int radius;
    final public int sunDistance;
    final public SolarSystem previous;

    protected SolarSystem next; //Сделал protected,чтобы в Main вывести ))

    SolarSystem(int prevDistance, int radius, SolarSystem previous){
        this.prevDistance = prevDistance;
        this.radius = radius;

        if (previous == null){
            this.num = 1;
            this.sunDistance = 100;
            this.previous = null;
        }else{
            this.num = previous.num + 1;
            this.sunDistance = previous.sunDistance + prevDistance;
            this.previous = previous;
            this.previous.next = this;
        }

    }
    SolarSystem(int prevDistance, int radius){
        this(prevDistance, radius, null);
    }
}
