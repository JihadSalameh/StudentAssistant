package com.example.studentassistant;

public class Elements {

    private String atomicNum;
    private String name;
    private String symbol;
    private String characteristics;

    public Elements(String atomicNum, String name, String symbol, String characteristics) {
        this.atomicNum = atomicNum;
        this.name = name;
        this.symbol = symbol;
        this.characteristics = characteristics;
    }

    public String getAtomicNum() {
        return atomicNum;
    }

    public void setAtomicNum(String atomicNum) {
        this.atomicNum = atomicNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    @Override
    public String toString() {
        return "AtomicNum = " + atomicNum + '\n' +
                "name = " + name + '\n' +
                "symbol = " + symbol + '\n' +
                "characteristics = " + characteristics;
    }

}
