package ba.unsa.etf.rpr.tutorijal03;

import javax.swing.text.TabExpander;
import javax.swing.text.html.parser.Entity;
import java.util.*;

public class Imenik extends HashMap {
    private Map<String,TelefonskiBroj> imenik;
    public Imenik(){
        imenik=new HashMap<>();
    }
    public void dodaj(String ime,TelefonskiBroj broj){
        this.imenik.put(ime,broj);
    }
    public String dajBroj(String ime){
        return imenik.get(ime).ispisi();
    }
    public String dajIme(TelefonskiBroj broj){
        for(Map.Entry<String,TelefonskiBroj> iterator : imenik.entrySet()) {
            if(iterator.getValue().equals(broj))    return iterator.getKey();
        }
        return null;
    }
    public String naSlovo(char s) {
        String vrati=new String();
        String pomocni=null;
        int k=1;
        for(Map.Entry<String,TelefonskiBroj> iterator: imenik.entrySet()){
            pomocni=iterator.getKey();
            if(s == pomocni.charAt(0)) {
                vrati = vrati + Integer.toString(k) + ". " + iterator.getKey() + " - " + iterator.getValue().ispisi() + new String("\n");
                k++;
            }
        }
        return vrati;
    }
    public Set<String> izGrada(Grad g) {
        SortedSet<String> vrati = new TreeSet<>();
        TelefonskiBroj tb = new FiksniBroj(g,"-1");
        for(Map.Entry<String,TelefonskiBroj> iterator : imenik.entrySet()){
            if(tb.hashCode() == iterator.getValue().hashCode()){
                vrati.add(iterator.getKey());
            }
        }
        return vrati;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> vrati = new HashSet<TelefonskiBroj>();
        TelefonskiBroj tb = new FiksniBroj(g,"-1");
        for(Map.Entry<String,TelefonskiBroj> iterator : imenik.entrySet()){
            if(tb.hashCode() == iterator.getValue().hashCode()){
                vrati.add(iterator.getValue());
            }
        }
        Iterator it = vrati.iterator();

        return vrati;
    }

}
