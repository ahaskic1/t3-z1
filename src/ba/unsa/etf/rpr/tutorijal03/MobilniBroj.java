package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    private int mobilnaMreza;
    private String broj;
    public MobilniBroj(int mobilnaMreza, String broj){
        this.mobilnaMreza=mobilnaMreza;
        this.broj=broj;
    }
    public int getMobilnaMreza(){
        return mobilnaMreza;
    }

    public String getBroj() {
        return broj;
    }

    @Override
    public String ispisi() {
        String vrati="0";
        vrati+=getMobilnaMreza() + "/" +getBroj();
        return vrati;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
