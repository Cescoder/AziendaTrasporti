package aziendatrasporti;

class Orario {
    //ATTRIBUTI
    private int hours;
    private int minutes;
    
    //COSTRUTTORE
    public Orario(String time) {
        this.hours = calculateHours(time);
        this.minutes = calculateMinutes(time);
    }
    
    //Metodi di ricavo di ore e minuti
    private int calculateHours(String time) {
        if(time.substring(0, 1).contains("0"))
            return Integer.parseInt(time.substring(1, time.indexOf(":")));
        
        return Integer.parseInt(time.substring(0, time.indexOf(":")));
    }

    private int calculateMinutes(String time) {
        if(time.substring(time.indexOf(":")+1, time.indexOf(":")+2).contains("0"))
            return Integer.parseInt(time.substring(time.indexOf(":")+2, time.length()));
        
        return Integer.parseInt(time.substring(time.indexOf(":")+1, time.length()));
    }

    @Override
    public String toString() {
        String min = ""+minutes;
        String hrs = ""+hours;
        
        if(minutes<10)
            min = "0"+minutes;
        
        if(hours<10)
            hrs = "0"+hours;
        
        return hrs+":"+min;
    }
    
    
    
    //Getters

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
    
    //Setters

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    

}
 