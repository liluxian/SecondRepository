public class CastingDemo {
    public static void main(String[] args) {
        Object object1 = new CircleFromSimpleGeometricObject(1);
        Object object2 = new RectangleFromSimpleGeometricObject(1,1);

        disPlayObject(object1);
        disPlayObject(object2);
    }
    public static void disPlayObject(Object object) {
        if(object instanceof CircleFromSimpleGeometricObject){
            System.out.println("The circle area is " + ((CircleFromSimpleGeometricObject)object).getArea());
            System.out.println("The circle diameter is " + ((CircleFromSimpleGeometricObject)object).getDiameter());
        }
        else if (object instanceof RectangleFromSimpleGeometricObject){
            System.out.println("The rectangle area is " + ((RectangleFromSimpleGeometricObject)object).getArea());
        }
    }
}