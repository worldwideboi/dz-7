package cc.robotdreams;

public class Main
{
        public static void main(String[] args) {

                    for (SolarSystem planet : SolarSystem.values()) {
                        System.out.println("Name: " + planet.name());
                        System.out.println("Number: " + planet.num);
                        System.out.println("Previous: " + planet.previous);
                        System.out.println("Next: " + planet.next);
                        System.out.println("Sun Distance: " + planet.sunDistance);
                        System.out.println("Radius: " + planet.radius);
                        System.out.println("Prev Distance: " + planet.prevDistance);
                        System.out.println("--------------------");
                    }
                }

        }

