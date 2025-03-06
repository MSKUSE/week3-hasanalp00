public class FindMinimum {
    public static void main(String[] args){
        int length_of_args= args.length;
        
        if (length_of_args==3){
            int num1=Integer.parseInt(args[0]);
            int num2=Integer.parseInt(args[1]);
            int num3=Integer.parseInt(args[2]);

            boolean min_num1= num1 <num2 && num1 <num3;
            boolean min_num2= num2 <num1 && num2 <num3;
            int minNum= min_num1 ? num1: min_num2 ? num2:num3;

            System.out.println(minNum);
        }
        else{
            System.out.println("It doesnt work because args has "+length_of_args+" elements.");
        }
    }
    
}
