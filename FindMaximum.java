public class FindMaximum {
    public static void main(String[] args){

        int length_of_args= args.length;
        if (length_of_args==2){
            int num1=Integer.parseInt(args[0]);
            int num2=Integer.parseInt(args[1]);
            boolean condition= num1>num2;
            int greater= condition ? num1:num2;
            System.out.println(greater);
        }
        else{
            System.out.println("There is not enough Value");
        }

    }
    
}
