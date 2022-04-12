package com.company;


// leaf class
public class GameTitle extends Games {
    private int price;
    public GameTitle(String name, int price) {
        super(name);
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public void listGames() {
        System.out.println(getName() + " este disponibil cu " + getPrice() + "$");
    }
    @Override
    public void addGame(Games game) {
        throw new UnsupportedOperationException();
    }
    @Override
    public void removeGame(Games game) {
        throw new UnsupportedOperationException();
    }
}