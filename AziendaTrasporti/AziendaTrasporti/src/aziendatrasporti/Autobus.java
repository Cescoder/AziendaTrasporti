
package aziendatrasporti;

import java.util.Date;


public class Autobus {
    //ATTRIBUTI
    private Model model;
    private Date lastCheck;
    private Line line;
    private GiorniOperativi operativeDays;
    
    //COSTRUTTORE
    public Autobus(Model model, Line line, GiorniOperativi operativeDays) {
        this.model = model;
        this.line = line;
        this.operativeDays = operativeDays;
        this.lastCheck = new Date();
    }
    
    
    //Metodo di info bus
    public void Info() {
        println("INFO BUS");
        println(model.toString());
        println("Ultima manutenzione: "+lastCheck);
        println(line.toString());
        println(operativeDays.toString());
    }
    
    //Setters and getters

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Date getLastCheck() {
        return lastCheck;
    }

    public void setLastCheck(Date lastCheck) {
        this.lastCheck = lastCheck;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    public void setOperativeDays(GiorniOperativi operativeDays) {
        this.operativeDays = operativeDays;
    }
    
    //Metodi di stampa
    void println(Object x){
        System.out.println(x);
    }
    
    void print(Object x){
        System.out.print(x);
    }
    

    
    
    

    
    
    
    
    
    
}
