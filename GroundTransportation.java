
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
        return this.fees * 0.03 ;
    }
}
