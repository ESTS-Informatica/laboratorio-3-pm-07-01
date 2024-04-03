import java.util.HashSet;
import java.util.ArrayList;

/**
 * Write a description of class ShippingCompany here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShippingCompany extends HashSet<Transport>
{
    private String name;
    private ArrayList<Transport> inService;

    public ShippingCompany(String name)
    {
        inService = new ArrayList<Transport>();
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transport> getInService() {
        return inService;
    }

    public void setInService(ArrayList<Transport> inService) {
        this.inService = inService;
    }
    
    @Override
    public String toString()
    {
        
        final StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Nome", this.name));
        sb.append("Veículos em Serviço:\n");
        for (Transport transport : inService) {
            sb.append(transport.toString()).append("\n");
        }
        
        return sb.toString();

    }
}
