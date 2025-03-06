public class FindPrimes{
    public static void main(String[] args){

        int number= Integer.parseInt(args[0]);

        boolean Prime=true;
        for (int i =2; i<=number;i++){
            for (int j=2;j<=i;j++){
                if (i%j==0){
                    Prime=false;
                    break;
                }
            }
            if (Prime){
                System.out.println(i);
                }
            }
        }

    }

