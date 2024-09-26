package lessonJava.lesson3;

public class Market {
    String name;
    Products[] products = Products.values();
    public Market(String name){
        this.name=name;
    }
    public void showProducts(){
        for (Products product:products){
            System.out.println(product);
        }
    }
}
