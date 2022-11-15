public class Rental
{
    private String numar_contract;
    private int nr_ore_si_minute_inchiriere;
    private int nr_minute_suplimentare=0;
    private int pret=0;

    public final static int minute_pe_ora()
    {
        return 60;
    }

    public final static int rata_inchiriere()
    {
        return 40;
    }

    public void setNumar_contract(String x)
    {
        x=numar_contract;
    }
    public void setNr_ore_si_minute_inchiriere(int y)
    {
        y=nr_ore_si_minute_inchiriere;
        if(y>minute_pe_ora())
            nr_minute_suplimentare=y-minute_pe_ora();
        pret=rata_inchiriere()*(y/60)+nr_minute_suplimentare;
        nr_ore_si_minute_inchiriere=y/60;
    }

    public String getNumar_contract()
    {
        return numar_contract;
    }

    public int getNr_ore_inchiriere()
    {
        return nr_ore_si_minute_inchiriere;
    }

    public int getPret()
    {
        return pret;
    }

    public int getNr_minute_suplimentare()
    {
        return nr_minute_suplimentare;
    }

    public Rental(String nr_contract, int minute)
    {
        numar_contract=nr_contract;
        nr_ore_si_minute_inchiriere=minute;
    }

    public Rental()
    {
        numar_contract="A000";
        nr_ore_si_minute_inchiriere=0;
    }
}
