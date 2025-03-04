# A Happy Family Mini-Project

## Project Description
This Java project models a family structure with humans and pets, using arrays to store data. 
Key features include:
- Classes for `Pet` and `Human` with relationships (parents, children, pets).
- Array-based storage for habits (Pet) and schedules (Human).
- Methods to simulate interactions (e.g., feeding pets, greeting).

Constraints:
- Uses only arrays (no List/Set/Map until Collections are introduced).
- All homework must comply with this rule.

## Pet Class

### Fields
- species (String)
- nickname (String)
- age (int)
- trickLevel (int, 1-100)
- habits (String[])

### Methods
1. eat(): Prints "I am eating".
2. respond(): Prints "Hello, owner. I am - [nickname]. I miss you!".
3. foul(): Prints "I need to cover it up".

### Constructors
1. Pet(String species, String nickname)
2. Pet(String species, String nickname, int age, int trickLevel, String[] habits)
3. Pet() (Empty)

### toString() Example
dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}

## Human Class

### Fields
- name (String)
- surname (String)
- year (int, birth year)
- iq (int, 1-100)
- pet (Pet object)
- mother (Human object)
- father (Human object)
- schedule (String[][], 2D array: [day][activity])

### Methods
1. greetPet(): Prints "Hello, [pet's nickname]".
2. describePet(): Prints pet info (e.g., "I have a dog. He is 5 years old, he is very sly").
3. feedPet(boolean isTime): (Advanced) Returns true if feeding occurs (see logic below).

### Constructors
1. Human(String name, String surname, int year)
2. Human(String name, String surname, int year, Human mother, Human father)
3. Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule)
4. Human() (Empty)

### toString() Example
Human{name='Michael', surname='Karleone', year=1977, iq=90, mother=Jane Karleone, father=Vito Karleone, pet=dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}}

## Example Usage (Main Class)

public class Main {
  public static void main(String[] args) {
    // Create a pet
    String[] habits = {"play", "sleep"};
    Pet dog = new Pet("dog", "Rock", 5, 75, habits);
    
    // Create parents
    Human mother = new Human("Jane", "Karleone", 1955);
    Human father = new Human("Vito", "Karleone", 1950);
    
    // Create child with family links
    String[][] schedule = {{"Monday", "Gym"}, {"Tuesday", "Study"}};
    Human child = new Human("Michael", "Karleone", 1977, 90, dog, mother, father, schedule);
    
    // Call methods
    child.greetPet();    // Output: Hello, Rock
    child.describePet(); // Output: I have a dog. He is 5 years old, he is very sly
    System.out.println(child); // Print child's details
  }
}

## Advanced Task: feedPet() Logic

Method: feedPet(boolean isTime)
- If isTime == true: Feed the pet and return true.
- If isTime == false:
  1. Generate a random number (0-100).
  2. Compare it to the pet’s trickLevel.
  3. Feed the pet if trickLevel > random number.
  4. Return true/false based on result.

Example Code:
public boolean feedPet(boolean isTime) {
  if (isTime) {
    System.out.println("Hm... I will feed " + pet.nickname);
    return true;
  } else {
    int rand = new Random().nextInt(100);
    if (pet.trickLevel > rand) {
      System.out.println("Hm... I will feed " + pet.nickname);
      return true;
    } else {
      System.out.println("I think " + pet.nickname + " is not hungry.");
      return false;
    }
  }
}

## How to Run
1. Compile and execute Main.java:
   javac Main.java Human.java Pet.java
   java Main
2. Observe output to validate family relationships and method behaviors.
