package com.company;
//EX 1
 class Fruit{
     String name;
     //Default
    Fruit(){
        System.out.println("Hello from Fruit");
    }
    //Parameterized
    Fruit(String fName){

        name = fName;
        System.out.println("Hello from Fruit "+name);
    }

    // Details
     void showDetails(){
        System.out.println("Hi I'm "+name);
     }
}
//Ex 2
class  Cat{
    String state;
    String color;
    Boolean thirsty;
    String name ;

    Cat(String name,String state, String color , Boolean thirsty){
        this.state =  state;
        this.color = color;
        this.thirsty = thirsty;
        this.name = name;
    }

    void drink(){
        System.out.println("Need Something to drink?");
        if(thirsty){
            System.out.println("Yes I need something to drink\nDrinking");
            this.thirsty = !thirsty;
        }
        else {
            System.out.println("No " +
                    "I'm full");
        }
    }
    void speak(){
        System.out.println("Hi I'm "+ this.name+"\nI'm "+ this.state+"\nMy color is "+this.color  );
    }
}


//Ex 3

 class Album {
    private String name;
    private String artist;
    private Double price;
    private int numberOfCopies;
    public void sellCopies(){
        if(numberOfCopies > 0){
            numberOfCopies--;
            System.out.println("One album has sold!");
        }
        else{
            System.out.println("No more albums available!");
        }
    }
    public void orderCopies(int num){
        numberOfCopies += num;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
        else {
            this.price = 0.0;
        }
    }
    public int getNumberOfCopies() {
        return numberOfCopies;
    }
    public void setNumberOfCopies(int numberOfCopies) {
        if(numberOfCopies > 0) {
            this.numberOfCopies = numberOfCopies;
        }
        else {
            this.numberOfCopies = 0;
        }
    }
}

class StockKeeper {
    private String name;
    StockKeeper(String name){
        setName(name);
    }
    public void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies){
         /*
          Defining states and behaviors for album
          */
        album.setName(name);
        album.setArtist(artist);
        album.setPrice(price);
        album.setNumberOfCopies(numberOfCopies);
          /*
          Printing album details
           */
        System.out.println("Album managed by :"+ getName());
        System.out.println("Album details::::::::::");
        System.out.println("Album name : " + album.getName());
        System.out.println("Album artist : " + album.getArtist());
        System.out.println("Album price : " + album.getPrice());
        System.out.println("Album number of copies : " + album.getNumberOfCopies());
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}






public class DayThree {
    public static void main(String[] args){
//        System.out.println("Day three");
//        System.out.println("\nDefault constructor\n");
//         Fruit apple =  new Fruit();
//         apple.name = "Apple";
//         apple.showDetails();
//         System.out.println("\nParametrized constructor\n");
//        Fruit mango = new Fruit("Mango");
//
//        mango.showDetails();
//            Cat tom = new Cat("tom","happy","blue",false);
//            tom.speak();
//            tom.drink();
//            Cat bob = new Cat("bob","lazy","brown",true);
//
//            bob.speak();
//        bob.drink();
//        bob.drink();
        StockKeeper HP = new StockKeeper("H");
        HP.manageAlbum(new Album(), "Slippery When Wet", "ABC", 100.0,50 );


    }
}
