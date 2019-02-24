package ru.itpark;

public class CalculateBonus {
    public int calculate (int currentPurchase, int totalPurchases){

        int standartBonus = 50;
        int silverBonus = 70;
        int goldBonus = 100;
        int amountOfPurchases = currentPurchase + totalPurchases;

        if (currentPurchase > 1_000 & totalPurchases < 15_000){
            amountOfPurchases = totalPurchases + currentPurchase + (currentPurchase / 1_000) * standartBonus;
        }
        if (currentPurchase > 1_000 & totalPurchases > 15_000 & totalPurchases <= 150_000){
            amountOfPurchases = totalPurchases + currentPurchase + (currentPurchase / 1_000) * silverBonus;
        }
        if (currentPurchase > 1_000 & totalPurchases > 150_000){
            amountOfPurchases = totalPurchases + currentPurchase + (currentPurchase / 1_000) * goldBonus;
        }
        return amountOfPurchases;
    }
}
