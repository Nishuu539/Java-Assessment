public class Cylinder extends  Circle{
    private  double height;
    Cylinder(){
        super(4,"Blue");
        height = 21;
    }

    double getVolume(){
        return  this.getArea()*this.height;
    }

    public  static void main(String[] args){
        Cylinder cylinder = new Cylinder();
        System.out.println("Circle Class variables");
        System.out.println(" Colour is " +cylinder.getColor()+" Area is " +cylinder.getArea()+ " Radius is " +cylinder.getRadius());
        System.out.println("Cylinder Class Variables");
        System.out.println(cylinder.getVolume());
    }

}