public class Square extends Rectangle{
    public Square(){

    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide() {
        return this.getWidth();
    }

    @Override
    public void setSide(double side){
        this.setSide(length);
    }

    @Override
    public void setWidth(double width){
        this.setSide(width);
    }

    @Override
    public String toString() {
        return String.format("Square[%s]", super.toString());
    }
}
