public class Date {
    private int month, day, year; //initialize three private variables.
    Date() {
        this.month = 1;
        this.day = 1;
        this.year = 2022;
    }
     // get and set methods for each provate variables.
    void setMonth(int m){
        this.month = m;
    }void setDay(int d){
        this.day = d;
    }void setYear(int y){
        this.year = y;
    }
    int getMonth(){
        return  this.month;
    }
    int getDay(){
        return  this.day;
    }
    int getYear(){
        return  this.year;
    }
    void display(){
        System.out.println(month+"/"+day+ "/"+year);
    }
    public static void main(String[] args) {
       Date date = new Date();
        date.display();
        date.setDay(3);
       date.setMonth(10);
       date.setYear(1999);
       date.display();
    }
}