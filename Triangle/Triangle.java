public class Triangle{
    private double base;
    private double height;

    public Triangle(){
        base = 1.0;
        height = 1.0;
    }

    public Triangle(double base, double height){
        this.base=base;
        this.height=height;
    }

    public void setBase(double base){
        this.base=base;
    }

    public void setHeight(double height){
        this.height=height;
    }

    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        return (0.5*base*height);
    }

    public String toString(){
        return "Triangle [base= "+base+", height= "+height+"]";
    }

}