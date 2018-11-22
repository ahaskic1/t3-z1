package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    private Grad grad;
    private String broj;
    public FiksniBroj(Grad grad,String broj){
        this.grad=grad;
        this.broj=broj;
    }
    public String getGrad(){
        return grad.s;
    }
    public String getBroj(){
        return broj;
    }
    @Override
    public String ispisi() {
        String vrati= getGrad();
        vrati+="/"+getBroj();
        return vrati;
    }

    @Override
    public int hashCode() {
        switch (grad){
            case SARAJEVO: return 1;
            case BIHAC: return 2;
            case BRCKO: return 3;
            case LIVNO: return 4;
            case TUZLA: return 5;
            case MOSTAR: return 6;
            case ZENICA: return 7;
            case GORAZDE: return 8;
            case ORASIJE: return 9;
            case TRAVNIK: return 10;
            case SIROKIBRIJEG: return 11;
            default: return 0;
        }
    }
}
