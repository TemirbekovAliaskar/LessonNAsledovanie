public class Singer extends Person{
    private String banName;

    public Singer(String name, String designation, String banName) {
        super(name, designation);
        this.banName = banName;
    }

    public String getBanName() {
        return banName;
    }

    public void setBanName(String banName) {
        this.banName = banName;
    }

    public void singing(String singing){
        System.out.println("Ыры  :"+singing);
    }
    public void playGitar(String playGitar){
        System.out.println("Гитара черткенди билеби :"+playGitar);
    }

    @Override
    public String toString() {
        return "Singer : " +
                "banName : " + banName + '\'' +
                ':'+ super.toString();
    }
}
