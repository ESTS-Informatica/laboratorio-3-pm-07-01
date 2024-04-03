
/**
 * Write a description of class GroundTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;
    
    public GroundTransportation(String licensePlate)
    {
        this.licensePlate = licensePlate; 
    }
    
    public String getLicensePlate() 
    {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) 
    {
        this.licensePlate = licensePlate;
    }
    
    @Override
    public double getFees() 
    {
        return super.price * 0.03 ;
    }
    
    public double getPriceWithFees()
    {
        return super.price + getFees();
    }
    
    @Override
    public String getTransportType()
    {
        return "Transporte Terrestre";
    }
    
    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append(String.format("%15s: %s\n", "Matricula", this.licensePlate));
        
        return sb.toString();
    }
}
