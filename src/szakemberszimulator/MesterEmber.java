
package szakemberszimulator;


public abstract class  MesterEmber {
    
    protected String nev;
    protected int NapiDij;
    protected boolean[] FoglaltNapok;
    
    public  MesterEmber(String nev,int NapiDIj){
    
    this.nev=nev;
    this.NapiDij=NapiDij;
    FoglaltNapok=new boolean[31];
        for (int i = 0; i < FoglaltNapok.length; i++) {
            FoglaltNapok[i]=false;
            
        }
    }
    
    @Override
    public String toString(){
    String s = String.format("[%s-%d Ft] \n",this.nev, this.NapiDij);
    
        for (int i = 0; i < FoglaltNapok.length; i++) {
            s += String.format("%-2d ", i);
        }
        s +="\n";
        for (int i = 0; i < FoglaltNapok.length; i++) {
            s+=String.format("%2s ", FoglaltNapok[i] ? "SZ":"F");
        }
    
    return s;
    }
    public abstract boolean munkatVallal(int nap);
}
