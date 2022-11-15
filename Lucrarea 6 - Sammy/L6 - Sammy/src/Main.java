
public class Main
{
    public static void main(String[] args)
    {
        Rental Alin=new Rental("A523",85);
        Rental Dan=new Rental();
        Alin=getData(Alin);
        Dan=getData(Dan);

        System.out.println("Detalii Alin: ");
        System.out.print("\nNumar contract: "+Alin.getNumar_contract()+"\nTimp: "+Alin.getNr_ore_inchiriere()+" ore "+Alin.getNr_minute_suplimentare()+" minute"+"\nPret: "+Alin.getPret());
        System.out.print("\n\nDetalii Dan: ");
        System.out.print("\nNumar contract: "+Dan.getNumar_contract()+"\nTimp: "+Dan.getNr_ore_inchiriere()+" ore "+Dan.getNr_minute_suplimentare()+" minute"+"\nPret: "+Dan.getPret());
    }

    public static Rental getData(Rental detalii)
    {
        int numar_minute=0;
        detalii.setNr_ore_si_minute_inchiriere(numar_minute);
        detalii.getNumar_contract();
        detalii.getNr_ore_inchiriere();
        return detalii;
    }

}