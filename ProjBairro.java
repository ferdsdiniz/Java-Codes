PRINCIPAL 

import javax.swing.JOptionPane;

public static void main(String args[])
   {
    Bairro func=new Bairro();
    func.NumPesCs=JOptionPane.ShowInputDialog("Numero de Moradores da casa: ");
       //conversão de string para integer
    func.NumPes=Integer.parseInt(JOptionPane.showInputDialog("Renda Familiar: "));
    func.RendaFam=(JOptionPane.showInputDialog("Renda Familiar: "));
    func.setTipoCasa(tcs);
    JOptionPane.showInputDialog("Tipo de casa: "));
    func.setNumHoras(numh);
    JOptionPane.showMessageDialog(null,"Tipo de casa: "+TipoCasa);
   
    }



---------------------------------------------------------------------------------

FAMILIA

import javax.swing.JOptionPane;

public class Familia {
    public int NumPesCs;
    public int RendaFam;
    public String Casa;
    
    
    public void setNumPes(double np){
        NumPesCs = (int) np;
    }
    public double getNumPes(double np){
        return NumPesCs;
    }
    
    
    public void setRendaFam(double rf){
        RendaFam = (int) rf;
    }
    public double getRendaFam(double rf){
        return RendaFam;
    }
    
    
    public void setCasa(String cs){
        Casa = cs;
    }
    public String getCasa(String cs){
        return Casa;
    }
    
    public Familia (){
        this.NumPesCs = Integer.parseInt(JOptionPane.showInputDialog(NumPesCs));
        this.RendaFam = Integer.parseInt(JOptionPane.showInputDialog(RendaFam)); 
        this.Casa = JOptionPane.showInputDialog(Casa);
    }
    
}
---------------------------------------------------------------------------------
BAIRRO


import javax.swing.JOptionPane;

public class Bairro {
    public int NumPesBr;
    public int RendaMedFam;
    public String CasaAlug;
    public String CasaProp;
    
    
    public void setNumPes(double np){
        NumPesBr = (int) np;
    }
    public double getNumPes(double np){
        return NumPesBr;
    }
    
    
    public void setRendaFam(double rf){
        RendaMedFam = (int) rf;
    }
    public double getRendaFam(double rf){
        return RendaMedFam;
    }
    
    
    public void setCasaAlug(String csa){
        CasaAlug = csa;
    }
    public String getCasaAlug(String csa){
        return CasaAlug;
    }


    public void setCasaProp(String csp){
        CasaProp = csp;
    }
    public String getCasaProp(String csp){
        return CasaProp;
    }
    
    
    
    public Bairro (){
        this.NumPesBr = Integer.parseInt(JOptionPane.showInputDialog(NumPesBr));
        this.RendaMedFam = Integer.parseInt(JOptionPane.showInputDialog(RendaMedFam)); 
        this.CasaAlug = JOptionPane.showInputDialog(CasaAlug);
        this.CasaProp = JOptionPane.showInputDialog(CasaProp);
    }
    
}
---------------------------------------------------------------------------------

