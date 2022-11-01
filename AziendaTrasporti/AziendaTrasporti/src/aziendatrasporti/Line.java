package aziendatrasporti;

class Line {
    //ATTRIBUTI
    private String startStop;
    private String finalStop;
    private Orario leaveTime;
    private Orario arriveTime;
    private Orario backTime;
    private int nStops;
    private double kmLenght;
    
    //COSTRUTTORI
    public Line(String startStop, String finalStop, Orario leaveTime, Orario arriveTime, Orario backTime, int nStops, double kmLenght) {
        this.startStop = startStop;
        this.finalStop = finalStop;
        this.leaveTime = leaveTime;
        this.arriveTime = arriveTime;
        this.backTime = backTime;
        this.nStops = nStops;
        this.kmLenght = kmLenght;
    }
    
    //toString
    @Override
    public String toString() {
        return "Line{" + "startStop=" + startStop + ", finalStop=" + finalStop + ", leaveTime=" + leaveTime + ", arriveTime=" + arriveTime + ", backTime=" + backTime + ", nStops=" + nStops + ", kmLenght=" + kmLenght + '}';
    }
    
    
    
    //Getters

    public String getStartStop() {
        return startStop;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public String getLeaveTime() {
        return leaveTime.toString();
    }

    public String getArriveTime() {
        return arriveTime.toString();
    }

    public String getBackTime() {
        return backTime.toString();
    }

    public int getnStops() {
        return nStops;
    }

    public double getKmLenght() {
        return kmLenght;
    }
    
    //Setters

    public void setStartStop(String startStop) {
        this.startStop = startStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public void setLeaveTime(Orario leaveTime) {
        this.leaveTime = leaveTime;
    }

    public void setArriveTime(Orario arriveTime) {
        this.arriveTime = arriveTime;
    }

    public void setBackTime(Orario backTime) {
        this.backTime = backTime;
    }

    public void setnStops(int nStops) {
        this.nStops = nStops;
    }

    public void setKmLenght(double kmLenght) {
        this.kmLenght = kmLenght;
    }
    
    
    
    

    
    
    
    
}
