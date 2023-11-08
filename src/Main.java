public class Main {
    public static void main(String[] args) {


        Programmer programmer = new Programmer("Ali","Programmer","Peaksoft");
        System.out.println(programmer);
        programmer.learn("Java-12");
        programmer.walk("Building");
        programmer.eat("Kuurdak");
        programmer.codding("OOP");

        System.out.println("<><><><><><><><><><><><><><><");

        Dancer dancer = new Dancer("Myrzaiym","Danser","Akkula");
        System.out.println(dancer);
        dancer.learn("Tango");
        dancer.walk("Night Bishkek");
        dancer.eat("Lazanie");
        dancer.dansing("Bachata");

        System.out.println("<><><><><><><><><><><><><><><");

        Singer singer = new Singer("Urmat","Singer","solo");
        System.out.println(singer);
        singer.learn("Vokal");
        singer.walk("Mountain");
        singer.eat("Ash");
        singer.singing("Isfana");
        singer.playGitar("Yes of course");
    }
}