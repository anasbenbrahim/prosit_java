public class Zoo {
     Animal[] animals;
     String name;
     String city;
     int nbrCage = 25;

    public Zoo() {
    }

    public Zoo(String name, String city, int nbrCage) {
        animals = new Animal[nbrCage];
        this.name = name;
        this.city = city;
        this.nbrCage = nbrCage;
    }

    public void displayZoo(){
        System.out.println(name + " " + city + " " + nbrCage);
    }

    public String toString() {
        return name + " " + city + " " + nbrCage ;
    }
}
