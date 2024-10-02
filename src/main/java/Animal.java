public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal){
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void displayAnimal(){
        System.out.println("family : "+family+" name: "+name+ " age :"+age+" is Mammal :"+isMammal);
    }


    public String toString() {
        return "family :" + family  + ", name : " + name  + ", age : " + age + ", isMammal : " + isMammal ;
    }

    public String getName() {
        return name;
    }


}