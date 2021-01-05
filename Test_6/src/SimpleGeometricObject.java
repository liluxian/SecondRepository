public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    /** Construct a default geometric object*/
    public SimpleGeometricObject(){
        dateCreated = new java.util.Date();
    }
    
    /** */
    public SimpleGeometricObject(String color,boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color*/
    public  String getColor(){
        return color;
    }

    /** Set a new color*/
    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    /** set a new filled */
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    /** get dateCreated */
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}