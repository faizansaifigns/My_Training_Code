public class packages {
    public static void main(String[] args){
        
        int x=2;
        int y=5;
        // try {
        //     int result =x/y;
        // System.out.println("Result: "+result);
        // } catch (ArithmeticException e) {
        //     System.out.println("An error is occured:"+e.getMessage());
        // }
        try{
            if(x<y){
                throw new ArithmeticException("x is less then y");
            }
        }catch(ArithmeticException e){
            System.out.println("error occured: "+e.getMessage());

        }
        finally{
            System.out.println("i got an error");
        }
        int[] arr={1 ,2 ,4,5};
        try {
             System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of index "+e.getMessage());
        }
       
        
    }

    
}
