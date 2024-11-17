package org.example;

public class Company {

    private int id;
    private String name;
    private double giro;
    private String[] developerNames;


    public Company(int id, String name, double giro, String[] developerNames){
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;
    }

    //getters

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getGiro(){
        return giro;
    }

    public String[] getDeveloperNames(){
        return developerNames;
    }

    //setters

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGiro(double giro){
        if(giro < 0){
            this.giro = 0;
        }else{
            this.giro = giro;
        }

    }

    public void addEmployee(int index, String name){
        if(index < 0 || index > developerNames.length){
            System.out.println("Index out of bounds!");
            return;
        }

        if(developerNames[index] == null){
            developerNames[index] = name;
        }else{
            System.out.println("Developer slot is already occupied!");
        }
    }

    public String toString(){
        return "Company [id=" + id + ", name=" + name + ", giro=" + giro + "]";
    }

}
