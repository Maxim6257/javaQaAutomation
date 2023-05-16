public class triangles {
    public static void main(String[] args) {
                //program which output to the console random text;
        System.out.println("Довільний текст");

        //program which convert Celsius to Fahrenheit and Kelvin;
        int celsius = 31; //let it be initial value 43;
        int fahrenheit = celsius * 9 / 5 + 32; //converting Celsius degrees to Fahrenheit due to formula;
        double kelvin = celsius + 273.16; //converting Celsius degrees to Kelvin due to formula;

        //for convenience divided each item;
        System.out.println("Celsius " + "= " + celsius);
        System.out.println("Fahrenheit " + "= " + fahrenheit);
        System.out.println("Kelvin " + "= " + kelvin);

        /*program which calculate Square of rectangular triangular. For example takes triangular with left side 5
         * and upside 4; Formula of square triangular is S = 1/2*(a*b)**/
        int leftSide = 5;
        int upSide = 4;

        int triangleS = (leftSide * upSide) / 2;

        System.out.println("Площа трикутника зі сторонами 5 і 4 = " + triangleS);
    }
    }
