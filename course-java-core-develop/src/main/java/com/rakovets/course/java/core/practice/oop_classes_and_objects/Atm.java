package com.rakovets.course.java.core.practice.oop_classes_and_objects;
//Создать class Atm описывающий банкомат.

//Создать Fields:
//numberBanknotes20
//numberBanknotes50
//numberBanknotes100

//Создать Constructors:
//Atm(numberBanknotes20, numberBanknotes50, numberBanknotes100)

//Создать Methods:
//getNumberBanknotes20()
//getNumberBanknotes50()
//getNumberBanknotes100()
//addBanknotes20(number)
//addBanknotes50(number)
//addBanknotes100(number)

import java.util.Arrays;

//* Создать Methods:
//isPossibleIssue(amount) - проверяет, возможно ли выдать сумму, которую запросил клиент
//getOptionsCombinationBanknotes(amount) - возвращает все возможные варианты для суммы выдаваемых купюр
//getCash(option) - выдает деньги клиенту, для выбранного им варианта
public class Atm {
    private int numberBanknotes20;
    private int numberBanknotes50;
    private int numberBanknotes100;

    Atm(int numberBanknotes20, int numberBanknotes50, int numberBanknotes100){
        this.numberBanknotes20=numberBanknotes20;
        this.numberBanknotes50=numberBanknotes50;
        this.numberBanknotes100=numberBanknotes100;
    }

    public int getNumberBanknotes20() {
        return numberBanknotes20;
    }

    public int getNumberBanknotes50() {
        return numberBanknotes50;
    }

    public int getNumberBanknotes100() {
        return numberBanknotes100;
    }

    public void addBanknotes20(int number){
        this.numberBanknotes20=this.numberBanknotes20+number;
    }

    public void addBanknotes50(int number){
        this.numberBanknotes50=this.numberBanknotes50+number;
    }

    public void addBanknotes100(int number){
        this.numberBanknotes100=this.numberBanknotes100+number;
    }

    //проверяет, возможно ли выдать сумму, которую запросил клиент
    public boolean isPossibleIssue(int amount){
        boolean isPossible=amount%50%20==0?true:false;
        if (isPossible==true){
            if (this.numberBanknotes100-amount/100>=0){
               if (this.numberBanknotes50-amount%100/50>=0){
                   if (this.numberBanknotes20-amount%100%50/20>=0){
                       isPossible=true;
                   }else {
                       isPossible=false;
                   }
                }else {
                   isPossible=false;
               }
            }else {
                amount=amount-this.numberBanknotes100*100;
                if (this.numberBanknotes50-amount/50>=0){
                    if (this.numberBanknotes20-amount%50/20>=0){
                        isPossible=true;
                    }else {
                        isPossible=false;
                    }
                }else {
                    amount=amount-this.numberBanknotes50*50;
                    if (this.numberBanknotes20-amount/20>=0){
                        isPossible=true;
                    }else {
                        isPossible=false;
                    }
                }
            }
        }
        return isPossible;
    }

    //возвращает все возможные варианты для суммы выдаваемых купюр
    public int[][] getOptionsCombinationBanknotes(int amount){
        int [] mas20=new int[this.numberBanknotes20+1];
        int [] mas50=new int[this.numberBanknotes50+1];
        int [] mas100=new int[this.numberBanknotes100+1];
        int [] [] indexCombinationBanknotes=new int[(this.numberBanknotes20+1)*(this.numberBanknotes50+1)*(this.numberBanknotes100+1)][3];
        int count=1;
       // String combinationBanknotes="";
        for (int i=0; i<mas100.length;i++){
            for (int j=0; j<mas50.length;j++) {
                for (int k=0; k<mas20.length;k++){
                   if(amount==i*100+j*50+k*20){
                       indexCombinationBanknotes[count][0]=i;
                       indexCombinationBanknotes[count][1]=j;
                       indexCombinationBanknotes[count][2]=k;
                       count++;
                      // combinationBanknotes=combinationBanknotes+i+"-100, "+j+"-50, "+k+"-20;  ";
                      }
                   }
                }
            }
        return indexCombinationBanknotes;
    }

    //выдает деньги клиенту, для выбранного им варианта
    public int getCash(int option, int amount){
        int [] [] indexCombinationBanknotes=getOptionsCombinationBanknotes(amount);
        this.numberBanknotes100=this.numberBanknotes100-indexCombinationBanknotes[option][0];
        this.numberBanknotes50=this.numberBanknotes50-indexCombinationBanknotes[option][1];
        this.numberBanknotes20=this.numberBanknotes20-indexCombinationBanknotes[option][2];
        int sumGetCash=100*indexCombinationBanknotes[option][0]+50*indexCombinationBanknotes[option][1]+20*indexCombinationBanknotes[option][2];
        return sumGetCash;
    }
}

