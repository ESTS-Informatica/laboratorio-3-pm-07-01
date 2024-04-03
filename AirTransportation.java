
/**
 * Write a description of class AirTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AirTransportation extends Transport
{
    private String name;
    private int numberOfContainers;

    public AirTransportation(String name,int numberOfContainers)
    {
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }
    
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getNumberOfContainers() 
    {
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) 
    {
        this.numberOfContainers = numberOfContainers;
    }
    
    @Override
    public double getFees() 
    {
        return this.price * 0.04 ;
    }
    
    public double getPriceWithFees()
    {
        return super.price + getFees();
    }
    
    @Override
    public String getTransportType()
    {
        return "Transporte Aereo";
    }
    
    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Nome", this.name));
        sb.append(String.format("%15s: %d\n", "NºContentores", this.numberOfContainers));
        
        return sb.toString();
    }
    
}
