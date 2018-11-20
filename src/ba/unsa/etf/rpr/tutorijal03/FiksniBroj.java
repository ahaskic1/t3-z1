package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj extends TelefonskiBroj {
    private Grad grad;
    private String broj;
    public FiksniBroj(Grad grad,String broj){
        this.grad=grad;
        this.broj=broj;
    }
    public String getGrad(){
        return grad.s   ;
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
        return 0;
    }
}
