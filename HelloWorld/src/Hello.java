public class Hello {

    public static void main(String[] args){

        System.out.println("Hello world! by ankit");
        double ans= calcFeetAndInchesToCentimeters(88);
        System.out.println("the centimeters in 88 inches are "+ans);

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >=0 && (inches >=0 && inches <=12)) {
            double centimeters = feet*12*2.54d + inches*2.54d;
            return centimeters;

        } else {
            return -1;
        }

    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if( inches >=0 ){
            double feet= (int)(inches/12);
            inches = inches%12;
            double x= calcFeetAndInchesToCentimeters(feet,inches);
            //return 0;
            return x;
        }
        return -1;
    }
}
