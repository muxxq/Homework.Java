public class Student extends Persoana
{
    private int anStudiu;
    private Adresa adresa;

    public Student(String nume,int varsta,int anStudiu,Adresa adresa)
    {
        super(nume,varsta);
        this.anStudiu = anStudiu;
        this.adresa = adresa;
    }
    public Adresa getAdresa()
    {
        return adresa;
    }
    public int getAn()
    {
        return anStudiu;
    }
}
