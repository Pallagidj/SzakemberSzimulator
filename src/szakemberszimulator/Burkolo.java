
package szakemberszimulator;

public class Burkolo extends MesterEmber {
    
    //ez egy saját felsorolás típus
    public enum Helyszin{
    Belso,
    Kulso
        }
    private Helyszin szakTerulet;

    public Burkolo(String nev, int NapiDij, Helyszin szakTerulet){
        super(nev,NapiDij);
        this.szakTerulet= szakTerulet;
    }
    
    @Override
    public boolean munkatVallal(int nap) {
        if (!this.FoglaltNapok[nap-1]) {
            this.FoglaltNapok[nap-1]=true;
            return true;
        }
      return false;
    }
    public int osszesSzabadNap(){
        int db=0;
        for (int i = 0; i < this.FoglaltNapok.length; i++) {
            if (this.FoglaltNapok[i]==false) {
                db++;
            }
        }
        return db;
    }
    
    public String toString(){
        String s = super.toString(); //Meghívja a mesterEmber toStringjét!
        String[] sorok =s.split("]");
        
        if (this.szakTerulet==Helyszin.Belso) {
            sorok[0] +="- Belso Burkolo]";
        }
        else if (this.szakTerulet == Helyszin.Kulso) {
            sorok[0] +="-Külső Burkoló]";
            }
        
        
        return sorok[0]+ sorok [1];
    }
    
}
