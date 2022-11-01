/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aziendatrasporti;


class Model {
    
    //ATTRIBUTI
    private String marca;
    private int cilindrata;
    private int cavalli;
    private int fuelCapacity;
    private int peopleCapacity;

    //COSTRUTTORE
    public Model(String marca, int cilindrata, int cavalli,int peopleCapacity, int fuelCapacity) {
        this.marca = marca;
        this.cilindrata = cilindrata;
        this.cavalli = cavalli;
        this.fuelCapacity = fuelCapacity;
        this.peopleCapacity = peopleCapacity;
    }
    
    //toString
    @Override
    public String toString() {
        return "Model{" + "marca=" + marca + ", cilindrata=" + cilindrata + ", cavalli=" + cavalli + ", fuelCapacity=" + fuelCapacity + ", peopleCapacity=" + peopleCapacity + '}';
    }
    
    

    //Getters

    public String getMarca() {
        return marca;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public int getCavalli() {
        return cavalli;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }
    
    //Setters

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setCavalli(int cavalli) {
        this.cavalli = cavalli;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setPeopleCapacity(int peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }
    
    
    
    
    
    

    
    
}
