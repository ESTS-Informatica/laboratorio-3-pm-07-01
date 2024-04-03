
/**
 * Write a description of class Program here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AppStart 
{
    public static void main(String[] args) 
    {
        ShippingCompany company = new ShippingCompany("RELIABLE-MOVING");
        company.getInService().add(new GroundTransportation("ABC123"));
        company.getInService().add(new AirTransportation("Avião 1", 150));
        company.getInService().add(new AirTransportation("Avião 2", 200));
        company.getInService().add(new Lorry(60,3,"DEF456"));
        company.getInService().add(new Van(10 , "GHI789"));

        System.out.println("Transportes criados:");
        for (Transport transport : company.getInService()) {
            System.out.println(transport);
        }
    }
}
