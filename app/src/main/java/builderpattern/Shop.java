package builderpattern;

public class Shop {
    public static void main(String[] args) {

     //   Phone p = new Phone("Android", 3, "Qualcomm", 5.5, 3000);
     //

        Phone p = new PhoneBuilder().setOs("Android").setRam(2).getPhone();
        System.out.println(p);
    }
}
