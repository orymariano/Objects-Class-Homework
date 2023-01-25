package classObjectsHomework;

public class phoneObjects {
    public static void main(String[] args) {

        Phone Phone1=new Phone();

        Phone1.name="Google Pixel";
        Phone1.model="Pixel 7";
        Phone1.price=499.99;
        Phone1.camera();

        Phone Phone2=new Phone();
        Phone2.name="Samsung";
        Phone2.model="Galaxy S12";
        Phone2.price=699.99;
        Phone2.pay();

        Phone Phone3=new Phone();
        Phone3.name="Apple";
        Phone3.model="Iphone14";
        Phone3.price=999.99;
        Phone3.charge();
    }
}
