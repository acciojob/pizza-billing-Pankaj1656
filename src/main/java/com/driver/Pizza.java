package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean cheeseAdded;
    private Boolean addToppings;
    private Boolean paperBag;
    public static int vegPizzaBasePrice=300;
    public static int NonVegPizzaBasePrice=400;
    private int cheesePrice=80;
    private int toppingsForVeg=70;
    private int toppingsForNonVeg=120;
    public int takeAwayPrice=20;
    private int myToppingsPrice=0;
    private int basePrice=0;
    private Boolean BillCreated=false;
   private boolean isBillingDone=false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.basePrice=isVeg?vegPizzaBasePrice:NonVegPizzaBasePrice;
        this.price=basePrice;
        this.bill="";
        this.paperBag=false;
        this.addToppings=false;
        this.cheeseAdded=false;
    }

    public int getPrice(){
//        if(cheeseAdded){
//            this.price+=cheesePrice;
//        }
//        if(addToppings){
//            myToppingsPrice=isVeg?toppingsForVeg:toppingsForNonVeg;
//            this.price+=this.myToppingsPrice;
//        }
//        if(paperBag){
//            this.price+=takeAwayPrice;
//        }
        return this.price;
    }

    public void addExtraCheese(){
        if(!cheeseAdded){
            cheeseAdded=true;
            this.price+=cheesePrice;
        }
        return;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!addToppings){
            addToppings=true;
            myToppingsPrice=isVeg?toppingsForVeg:toppingsForNonVeg;
            this.price+=this.myToppingsPrice;
        }
        return;
    }

    public void addTakeaway(){
        // your code goes here
        if(!paperBag){
            paperBag=true;
            this.price+=takeAwayPrice;
        }
        return;
    }


    public String getBill(){
        // your code goes here
//        Base Price Of The Pizza: 300
//        Extra Cheese Added: 80
//        Extra Toppings Added: 70
//        Paperbag Added: 20
//        Total Price: 470
        if(!isBillingDone){
            isBillingDone=true;
            bill="Base Price Of The Pizza:" + this.basePrice+"\n";
            if(cheeseAdded){
                bill+="Extra Cheese Added:"+cheesePrice+"\n";
            }
            if(addToppings){
                bill+="Extra Toppings Added:" + myToppingsPrice+"\n";
            }
            if(paperBag){
                bill+="Paperbag Added:" + takeAwayPrice +"\n";
            }
            bill+="Total price:" +this.price+ "\n";
        }

        return this.bill;
    }
}
