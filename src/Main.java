//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[][] weeklySchedule = {
                {"Monday", "Go to gym", "Study Java", "Grocery shopping"},
                {"Tuesday", "Team meeting", "Work on project"},
                {"Wednesday", "Dentist appointment", "Read a book"},
                {"Thursday", "Practice coding", "Watch a movie"},
                {"Friday", "Dinner with friends", "Go to a concert"},
                {"Saturday", "Clean the house", "Relax"},
                {"Sunday", "Family time", "Prepare for the week"}
        };

        Human Revane=new Human("Revane","Talibova",1986);
        Human Anar=new Human("Anar","Talibov",1980);

        Pet dog=new Pet("dog","Ares",3,55,new String[5]);
        Human Zainab=new Human("Zainab","Talibova",2005,135,dog,Revane,Anar,weeklySchedule);
        System.out.println(Zainab);


    }
}