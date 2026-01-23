package extends1.ex4.ex_1;

public class Album extends Item{

    public String artiest;


    public Album(String name, int price, String artiest) {
        super(name, price);
        this.artiest = artiest;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("-아티스트 : " + artiest );
    }
}
