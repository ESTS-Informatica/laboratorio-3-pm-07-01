
/**
 * Write a description of class Lorry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lorry extends GroundTransportation
{
    private int numberOfPallets;
    private int trailers;

    public Lorry(int numberOfPallets, int trailers, String licensePlate)
    {
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }
    
    public int getNumberOfPallets() {
        return numberOfPallets;
    }

    public void setNumberOfPallets(int numberOfPallets) {
        this.numberOfPallets = numberOfPallets;
    }

    public int getTrailers() {
        return trailers;
    }

    public void setTrailers(int trailers) {
        this.trailers = trailers;
    }
    
    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append(String.format("%15s: %d\n", "Numero de paletes", this.numberOfPallets));
        sb.append(String.format("%15s: %d\n", "Atrelados", this.trailers));
        
        return sb.toString();
    }
}
