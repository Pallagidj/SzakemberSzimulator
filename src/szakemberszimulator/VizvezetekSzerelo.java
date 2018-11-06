
package szakemberszimulator;


public class VizvezetekSzerelo extends MesterEmber {
    
    private int tapasztalat;
    
    public  VizvezetekSzerelo(String nev,int NapiDij,int tapasztalat){
    super(nev,NapiDij);
    this.tapasztalat=tapasztalat;
    }
    
    @Override
    public boolean munkatVallal(int nap){
        if (nap>1 && nap<30 && !FoglaltNapok[nap-1] && !FoglaltNapok[nap-1] && !FoglaltNapok[nap]) {
            FoglaltNapok[nap-2] =true;
            FoglaltNapok[nap-1]=true;
            FoglaltNapok[nap]=true;
            return true;
        }
        return false;
    }
    
}
