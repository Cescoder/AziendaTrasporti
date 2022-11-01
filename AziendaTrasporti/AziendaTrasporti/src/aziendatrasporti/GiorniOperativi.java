package aziendatrasporti;

import static aziendatrasporti.TestAziendaTrasporti.input;


public class GiorniOperativi {
    //ATTRIBUTI
    private String[] days = new String[7];
    
    //COSTRUTTORE
    public GiorniOperativi(){
        boolean f = true;
        String[] names = {"Lunedi", "Martedi", "Mercoledi", "Giovedi", "Venerdi", "Sabato", "Domenica"};
        
        int choice;
        do{
            println("\tScegli i giorni: ");
            for(int i = 0; i<7; i++)
                if(names[i] != null)
                    println("\t\t"+names[i]+" "+(i+1));
            
            println("\t\tEsci 8");
            
            println("\nScelta: ");
            choice = input.nextInt();
            
            
            switch(choice){
                case 1:
                    days[0] = "Lunedi";
                    break;
                    
                case 2:
                    days[1] = "Martedi";
                    break;
                    
                case 3:
                    days[2] = "Mercoledi";
                    break;
                    
                case 4:
                    days[3] = "Giovedi";
                    break;
                    
                case 5:
                    days[4] = "Venerdi";
                    break;
                    
                case 6:
                    days[5] = "Sabato";
                    break;
                    
                case 7:
                    days[6] = "Domenica";
                    break;
                
                case 8:
                    f = false;
                    
            }
            if(f)
                names[choice-1] = null;
        }while(choice != 8);
    }
    
    //toString
    @Override
    public String toString() {
        String d = "Giorni Operativi: ";
        for(int i = 0; i<days.length; i++)
            if(days[i] != null)
                d = d+days[i];
        
        return d;
    }
    
    
    //Metodo di stampa
    private void println(Object x) {
        System.out.println(x);
    }
    
    //Getters
    public String[] getDays() {
        return days;
    }
    
    //Setters
    public void setDays(String[] days) {
        this.days = days;
    }
    
    
    
}
