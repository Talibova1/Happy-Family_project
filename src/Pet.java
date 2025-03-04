import java.util.Arrays;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(String species,String nickname){
        this.species=species;
        this.nickname=nickname;
    }
    public Pet(String species,String nickname,int age,int trickLevel,String[] habits){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habits=habits;
    }
    public Pet(){

    }

    public void eat(){
        System.out.println("I am eating.");
    }
    public void respond(){
        System.out.println("Hello, owner. I am "+nickname+". I miss you!");
    }
    public void foul(){
        System.out.println("I need to cover it up.");
    }
    public String getSpecies(){
        return species;
    }
    public String getNickname(){
        return nickname;
    }
    public int getAge(){
        return age;
    }
    public int getTrickLevel(){
        return trickLevel;
    }
    public String[] getHabits(){
        return habits;
    }
    public void setSpecies(String species){
        this.species=species;
    }
    public void setNickname(String nickname){
        this.nickname=nickname;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setTrickLevel(int trickLevel){
        this.trickLevel=trickLevel;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }
    @Override
    public String toString(){
        return "%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}".formatted(species,nickname, age, trickLevel, Arrays.toString(habits));

    }
}
