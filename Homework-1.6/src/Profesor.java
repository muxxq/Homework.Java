public class Profesor extends Persoana
{
    private Adresa adresa;

    public Profesor(String nume,int varsta,Adresa adresa)
    {
        super(nume,varsta);
        this.adresa = adresa;
    }

    public Adresa getAdresa()
    {
        return adresa;
    }
}
