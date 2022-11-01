package aziendatrasporti;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 L'azienda di trasporti locale deve gestire gli autobus che operano in un certo territorio. 
 * Per ogni autobus dobbiamo memorizzare il modello, l'ultima manutenzione effettuata,
 * la linea nella quale opera, l'orario di uscita e di rientro dalla rimessa e in quali giorni risulta operativo. 
 * Realizzare un programma che consenta di aggiungere/eliminare i diversi autobus e di consultare/modificare le informazioni corrispondenti.
 */

public class TestAziendaTrasporti {
    static int counter = 0;
    static ArrayList<Autobus> bus = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choice;
        do{
            choice = menu();
            operation(choice);
        }while(choice != 6);
    }

    private static int menu() {
        int choice;
        println("\n\nBENVENUTO IN AZIENDA TRASPORT");
        println("\nOpzioni:");
        println("\tAggiungi un autobus[1]");
        println("\tRimuovi un autobus [2]");
        println("\tManutenzione bus [3]");
        println("\tModifica impostazioni del mezzo [4]");
        println("\tVisualizza bus [5]");
        println("\tEsci [6]");
        
        do{
            print("\nScelta: ");
            choice = input.nextInt();
        }while(choice < 1 || choice >6);
        
        return choice;
    }

    private static void println(Object x) {
        System.out.println(x);
    }
    
    private static void print(Object x) {
        System.out.print(x);
    }

    private static void operation(int choice) {
        switch(choice){
            case 1:
                addBus();
                break;
            
            case 2:
                removeBus();
                break;
            
            case 3:
                updateCheck();
                break;
            
            case 4:
                busSettings();
                break;
            
            case 5:
                showBus();
                break;
            
            

        }
    }

    private static void addBus() {
        
        
        println("AGGIUNTA DI BUS");
        println("Compilare i seguenti campi:");
        
        //Compilazione del modello
        println("\t1. Modello");
        print("\t\tMarca: ");
        String marca = input.next();
        print("\t\tCilindrata: ");
        int cilindrata = input.nextInt();
        print("\t\tCavalli: ");
        int cavalli = input.nextInt();
        print("\t\tCapacità serbatoio: ");
        int fuelCapacity = input.nextInt();
        print("\t\tCapacità persone: ");
        int peopleCapacity = input.nextInt();
        
        Model model = new Model(marca, cilindrata, cavalli, fuelCapacity, peopleCapacity);
        
        //Compilazione della linea
        
        println("\t2. Linea");
        print("\t\tLocalità di partenza: ");
        String startStop = input.next();
        print("\t\tCapolinea: ");
        String finalStop = input.next();
        print("\t\tNumero di fermate: ");
        int nStops = input.nextInt();
        print("\t\tDistanza in chilometri: ");
        int kmLenght = input.nextInt();
        
        
        
        
        //compilazione dell'orario di partenza e di rientro
        println("\t3. Orari");
        print("\t\tOraio di partenza: ");
        String leaveTime = input.next();
        print("\t\tOrario di arrivo: ");
        String arriveTime = input.next();
        print("\t\tOrario di rientro: ");
        String backTime = input.next();
        
        
        Orario leave = new Orario(leaveTime);
        Orario arrive = new Orario(arriveTime);
        Orario back = new Orario(backTime);
        
        Line line = new Line(startStop, finalStop, leave, arrive, back, nStops, kmLenght);
        println("\t4. Giorni operativi");
        //Giorni oprativi
        GiorniOperativi od = new GiorniOperativi();
        
        
        bus.add(new Autobus(model, line, od ));
        counter++;
           
    }
        
        
        
        
        
    

    private static void removeBus() {
        if(counter == 0){
            println("Nessun autobus registrato...");
            return;
        }
        
        println("RIMOZIONE AUTOBUS");
        println("Di quale bus vuoi fare la manutenzione?");
        println("\n\tNum\t\tMarca\t\tPartenza\t\tArrivo");
        for(int i = 0; i<bus.size(); i++){
            println("\t"+i+"\t\t"+bus.get(i).getModel().getMarca()+"\t\t"+bus.get(i).getLine().getStartStop()+"\t\t"+bus.get(i).getLine().getFinalStop());
        }
        
        print("\nScelta: ");
        int choice = input.nextInt();
        
        bus.remove(choice);
        counter--;
            
    }

    private static void updateCheck() {
        if(counter == 0){
            println("Nessun autobus registrato...");
            return;
        }
        
        println("MANUTENZIONE DI AUTOBUS");
        println("Di quale bus vuoi rinnovare la manutenzione?");
        println("\n\tNum\t\tMarca\t\tPartenza\t\tArrivo");
        for(int i = 0; i<bus.size(); i++){
            println("\t"+i+"\t\t"+bus.get(i).getModel().getMarca()+"\t\t"+bus.get(i).getLine().getStartStop()+"\t\t"+bus.get(i).getLine().getFinalStop());
        }
        
        print("\nScelta: ");
        int choice = input.nextInt();
        
        bus.get(choice).setLastCheck(new Date());
        
            
    }

    private static void busSettings() {
        if(counter == 0){
            println("Nessun autobus registrato...");
            return;
        }
        
        println("MODIFICA DI AUTOBUS");
        println("Quali di questi vuoi cambiare?");
        println("\n\tNum\t\tMarca\t\tPartenza\t\tArrivo");
        for(int i = 0; i<bus.size(); i++)
            println("\t"+i+"\t\t"+bus.get(i).getModel().getMarca()+"\t\t"+bus.get(i).getLine().getStartStop()+"\t\t"+bus.get(i).getLine().getFinalStop());
        
        
        print("\nScelta: ");
        int choice = input.nextInt();
        
        bus.get(choice).Info();
        int option;
        do{
            println("Decidi cosa modificare:");
            println("\tGiorni Operativi [0]");
            println("\tLocalità di partenza [1]");
            println("\tLocalità di arrivo [2]");
            println("\tNumero di fermate [3]");
            println("\tChilometri di distanza [4]");
            println("\tOrario di partenza [5]");
            println("\tOrario di arrivo [6]");
            println("\tOrario di rientro [7]");
            println("\tNiente [8]");
            
            print("Scelta: ");
            option = input.nextInt();
            
            String loc, ora;
            int n;
            
            switch(option){
                case 0:
                    bus.get(choice).setOperativeDays(new GiorniOperativi());
                    break;
                
                case 1:
                    print("\nNuova località di partenza: ");
                    loc = input.next();
                    bus.get(choice).getLine().setStartStop(loc);
                    break;
                    
                case 2:
                    print("\nNuova località di arrivo: ");
                    loc = input.next();
                    bus.get(choice).getLine().setFinalStop(loc);
                    break;
                    
                case 3:
                    print("Nuovo numero di fermate: ");
                    n = input.nextInt();
                    bus.get(choice).getLine().setnStops(n);
                    break;
                    
                case 4:
                    print("Nuovo numero di chilometri: ");
                    n = input.nextInt();
                    bus.get(choice).getLine().setKmLenght(n);
                    break;
                    
                case 5:
                    print("Nuovo orario di partenza: ");
                    ora = input.next();
                    bus.get(choice).getLine().setLeaveTime(new Orario(ora));
                    break;
                    
                case 6:
                    print("Nuovo orario di arrivo: ");
                    ora = input.next();
                    bus.get(choice).getLine().setArriveTime(new Orario(ora));
                    break;
                    
                case 7:
                    print("Nuovo orario di rientro: ");
                    ora = input.next();
                    bus.get(choice).getLine().setBackTime(new Orario(ora));
                    break;
                    
                
            }
        }while(option != 8);
        
        
    }

    private static void showBus() {
        if(counter == 0){
            println("Nessun autobus registrato...");
            return;
        }
        
        println("VISUALIZZAZIONE BUS");
        println("Marca\t\t\tPartenza\t\tArrivo\t\tOra partenza\t\tOrario di arrivo");
        
        for(Autobus b : bus)
            println(b.getModel().getMarca()+"\t\t\t"+b.getLine().getStartStop()+"\t\t\t"+b.getLine().getFinalStop()+"\t\t\t"+b.getLine().getLeaveTime()+"\t\t\t\t"+b.getLine().getArriveTime());

    }
    
}
