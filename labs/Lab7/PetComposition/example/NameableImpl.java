package Lab7.PetComposition.example;

public class NameableImpl implements Nameable {
    private String name;

    public void setName(String name) {
        if (name.length() < 20) {
            this.name = name;
        } else{
            System.out.println("Name is too long.");
        }
    }
    public String getName(){
        return this.name;
    }
}
