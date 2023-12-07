package model;

public class Card {
    private double money;

    public Card(String getCardNumber, String getOneTimePassword) {
        this.number = number;
        this.password = password;
    }

    String number;
    String password;
    public Card(int amount){
        this.money = amount;
    }
    public double getAmount() {
        return money;
    }

    public void setAmount(double amount) {
        this.money = amount;
    }


}
