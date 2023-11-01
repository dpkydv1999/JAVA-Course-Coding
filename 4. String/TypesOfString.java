//Types of String 
public class TypesOfString{
    public static void main(String[] args) {
        //1. Immutable String
        String brand = "deepak";
        System.out.println(brand);
        brand.concat("Bengaluru");
        System.out.println(brand); // No changes in String object

        //2. Mutable String
        StringBuilder brand1 = new StringBuilder("deepak");
        System.out.println(brand1);
        brand1.append("Kathmandu");
        System.out.println(brand1); //Changes occurred in String object
    }
}