package hometask_8.task3;

import org.apache.log4j.Logger;

import java.util.*;

public class ZooClub {

    private static final Logger logger = Logger.getLogger(hometask_8.task3.ZooClub.class);


            private static Map<Person, List<Animal>> clubMap = new HashMap<>();
            private static Scanner scanner = new Scanner(System.in);

            public static void main(String[] args) {

                while (true) {
                    displayMenu();
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    switch (choice) {
                        case 1:
                            addPersonToClub();
                            break;
                        case 2:
                            addAnimalToPerson();
                            break;
                        case 3:
                            removeAnimalFromPerson();
                            break;
                        case 4:
                            removePersonFromClub();
                            break;
                        case 5:
                            displayZooClub();
                            break;
                        case 6:
                            System.out.println("Exiting the program. Goodbye!");
                            System.exit(0);
                        default:
                            System.out.println("Invalid choice. Please choose again.");
                    }
                }
            }

            private static void displayMenu() {
                System.out.println("\nZoo Club Menu:");
                System.out.println("1. Add Person to Club");
                System.out.println("2. Add Animal to Person");
                System.out.println("3. Remove Animal from Person");
                System.out.println("4. Remove Person from Club");
                System.out.println("5. Display Zoo Club");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
            }

            private static void addPersonToClub() {
                System.out.print("Enter person's name: ");
                String name = scanner.nextLine();
                System.out.print("Enter person's age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // consume newline

                Person person = new Person(name, age);
                clubMap.put(person, new ArrayList<>());
                System.out.println("Person added to the club: " + person);
            }

            private static void addAnimalToPerson() {
                System.out.print("Enter person's name: ");
                String name = scanner.nextLine();

                Person person = findPersonByName(name);
                if (person != null) {
                    System.out.print("Enter animal's type: ");
                    String type = scanner.nextLine();
                    System.out.print("Enter animal's name: ");
                    String animalName = scanner.nextLine();

                    Animal animal = new Animal(type, animalName);
                    clubMap.get(person).add(animal);
                    System.out.println("Animal added to the person: " + animal);
                } else {
                    System.out.println("Person not found!");
                }
            }

            private static void removeAnimalFromPerson() {
                System.out.print("Enter person's name: ");
                String name = scanner.nextLine();

                Person person = findPersonByName(name);
                if (person != null) {
                    List<Animal> animals = clubMap.get(person);
                    if (!animals.isEmpty()) {
                        System.out.print("Enter animal's name to remove: ");
                        String animalName = scanner.nextLine();

                        animals.removeIf(animal -> animal.getName().equals(animalName));
                        System.out.println("Animal removed from the person.");
                    } else {
                        System.out.println("This person has no animals.");
                    }
                } else {
                    System.out.println("Person not found!");
                }
            }

            private static void removePersonFromClub() {
                System.out.print("Enter person's name to remove: ");
                String name = scanner.nextLine();

                Person person = findPersonByName(name);
                if (person != null) {
                    clubMap.remove(person);
                    System.out.println("Person removed from the club.");
                } else {
                    System.out.println("Person not found!");
                }
            }

            private static void displayZooClub() {
                if (!clubMap.isEmpty()) {
                    for (Map.Entry<Person, List<Animal>> entry : clubMap.entrySet()) {
                        System.out.println(entry.getKey() + " has animals: " + entry.getValue());
                    }
                } else {
                    System.out.println("Zoo Club is empty.");
                }
            }

            private static Person findPersonByName(String name) {
                for (Person person : clubMap.keySet()) {
                    if (person.getName().equals(name)) {
                        return person;
                    }
                }
                return null;
            }
        }
