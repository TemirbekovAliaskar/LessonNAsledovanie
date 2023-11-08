public class Person {

    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void learn(String learn){
        System.out.println("Эмнени окуп уйронот :"+learn);
    }
    public void walk (String walk){
        System.out.println("Кайсыл жерде сейилдегенди жакшы корот :"+walk);
    }
    public void eat(String eat){
        System.out.println("Эмне тамакты жакшы корот :"+eat);
    }

    @Override
    public String toString() {
        return "\nname: " + name +
                ", designation:'" + designation + '\'' +
                ';';
    }
}
