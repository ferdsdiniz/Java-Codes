
import javax.swing.JOptionPane;


public class Bairro {
    public int NumPesBr;
    public double RendaMedFam = 0;
    public int CasaAlug;
    public int CasaProp;
    public int RetornarNumPes;
    public double RetornarCasaAlug;
    public double RetornarCasaProp;
    public int RetornarTotCasas;
    
    int RetornarRendaMed=0;
    int A[]={1, 2, 3, 4, 5};
    int n= A.length;
    
        
    for (int i=0; i<n; i++){
    RetornarRendaMed=RetornarRendaMed+A[i]; 
}

    public void setNumPes(double np){
        NumPesBr = (int) np;
    }
    public double getNumPes(double np){
        return NumPesBr;
    }
    
    
    public void setRendaMedFam(double rf){
        RendaMedFam = rf;
    }
    public double getRendaMedFam(double rf){
        return RendaMedFam;
    }
    
    
    public void setCasaAlug(int csa){
        CasaAlug = csa;
    }
    public int getCasaAlug(int csa){
        return CasaAlug;
    }


    public void setCasaProp(int csp){
        CasaProp = csp;
    }
    public int getCasaProp(int csp){
        return CasaProp;
    }
    
    
    
    public Bairro (){
        this.NumPesBr = Integer.parseInt(JOptionPane.showInputDialog(NumPesBr));
        this.RendaMedFam = Integer.parseInt(JOptionPane.showInputDialog(RendaMedFam)); 
        this.CasaAlug = Integer.parseInt(JOptionPane.showInputDialog(CasaAlug));
        this.CasaProp = Integer.parseInt(JOptionPane.showInputDialog(CasaProp));
        
        
    }
  
}
