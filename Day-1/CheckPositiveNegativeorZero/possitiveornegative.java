package CheckPositiveNegativeorZero;
  
class possitiveornegative {
    public static void main (String args []){
        int num1 =  -100;

        if ( num1 > 0 ){
            System.out.println("The " + num1 + " is Possitive");
        }
        else if (num1 < 0){
            System.out.println("The " + num1 + " is Negative");
        }
        else {
            System.out.println("The Number is Zero");
        }
    }
    
}
