package com.example.front;

public class Table {
    private int id;
    private String name;
    private int weight;
    private int bias;
    private String topology;
    private String afunction;

    public Table(int id,String name, int weight, int bias, String afunction,  String topology) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.bias = bias;
        this.topology = topology;
        this.afunction = afunction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBias() {
        return bias;
    }

    public void setBias(int bias) {
        this.bias = bias;
    }

    public String getTopology() {
        return topology;
    }

    public void setTopology(String topology) {
        this.topology = topology;
    }

    public String getAfunction() {
        return afunction;
    }

    public void setAfunction(String afunction) {
        this.afunction = afunction;
    }
}
