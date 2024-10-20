public class App {
    public static void main(String[] args) throws Exception {

        //2. Print "Printer App" to th console.
        System.out.println("Printer App");

        //3. Print "this app is made by:" to the console
        System.out.println("This app is made by:");

        String creator = "Subham Luitel";   //4. declare string typed variable as creator
        System.out.println(creator);  // 5. print the value of creator. also try to get on the same line as "thsi app is mad by:" + creator

        System.out.print("This app is made by: ");
        System.out.println(creator);


         // 6. declare two numeric variables as number1 and number2. Assign some values to variables
       int number1;
       int number2;
       number1 = 50;
       number2 = 60;
       
       // 7. print the value number1 to the console
       System.out.println(number1);

       // 8. print "the value of number1 is 10"
       System.out.println("The value of number1 is " + number1);

       // 9. print " the value of number2 is 2"
       System.out.println("The value of number2 is " + number2);


       // 10. declare integer typed variable called multiplication
       int multiplication;

       // 11. multiply numer1 and number2
       multiplication = number1 * number2;
       System.out.println(multiplication);
       System.out.println("The product of number1 and number2 is " + multiplication);



       //12. print "5 * 2 = 10" to the console, if number1 was 5 and number2 was 2.
       System.out.println("5 * 2 = 10");


        number1 = 5;
        number2 = 2;
        // Addition
        int addition = number1 + number2;
        System.out.println("The sum of number1 and number2 is " + addition);


        // Division
        double division = (double)number1 /number2;
        System.out.println("The result when number1 is divided by number2 is " + division);


        // Substraction
        int substraction = number1 - number2;
        System.out.println("The difference of number1 and number2 is " + substraction);

}
}