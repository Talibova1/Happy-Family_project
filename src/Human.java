public class Human {
    private String name;
    private String surname;
    private int birth_date;
    private int IQ_level;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;
    private Human family;

    public Human(String name,String surname,int birth_date){
        this.name=name;
        this.surname=surname;
        this.birth_date=birth_date;
    }
    public Human(String name,String surname,int birth_date,Human mother,Human father){

        this.name=name;
        this.surname=surname;
        this.birth_date=birth_date;
        this.mother=mother;
        this.father=father;
    }
    public Human(String name,String surname,int birth_date,int IQ_level,Pet pet,Human mother,Human father,String[][] schedule){
        this.name=name;
        this.surname=surname;
        this.birth_date=birth_date;
        this.IQ_level=IQ_level;
        this.pet=pet;
        this.mother=mother;
        this.father=father;
        this.schedule=schedule;

    }
    public Human(){

    }

    public void greetPet() {
        System.out.println("Hello, " + pet);
    }
    public void describePet(){
        String s;
        if (pet.getTrickLevel()>50)
            s="very sly";
        else
            s="almost not sly";

        System.out.printf("I have an %s is %d years old,he is ",pet.getSpecies(),pet.getAge(),s);

    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getBirth_date(){
        return birth_date;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public int getIQ_level() {
        return IQ_level;
    }

    public Pet getPet() {
        return pet;
    }

    public String[][] getSchedule() {
        return schedule;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirth_date(int birth_date) {
        this.birth_date = birth_date;
    }

    public void setIQ_level(int IQ_level) {
        this.IQ_level = IQ_level;
    }

    public void setPet(Pet pet) {
        this.pet=pet;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString(){
        return "{name='%s', surname='%s', year='%d' ,IQ=%d ,\nmother='%s' ,\nfather='%s', \npet='%s';}".formatted(name,surname,birth_date,IQ_level,mother,father,pet);
    }

}

