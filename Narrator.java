public class Narrator {
    private String name;

    public Narrator(String name){
        this.name = name;
    }

    //Getter
    public String getName(){
        return name;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Narrator: " + name;
    }
}