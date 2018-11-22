package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava;
    private String broj;
    public MedunarodniBroj(String drzava, String broj){
        this.drzava=drzava;
        this.broj=broj;
    }
    public String getDrzava(){
        return drzava;
    }
    public String getBroj(){
        return broj;
    }
    @Override
    public String ispisi() {
        String vrati=getDrzava();
        vrati+="/" + getBroj();
        return vrati;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
