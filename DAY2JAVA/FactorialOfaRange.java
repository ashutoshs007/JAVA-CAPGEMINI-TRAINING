public class FactorialOfaRange {
    public static void main(String[] args){
        for(int num=1;num<=10;num++){
            int fact=1;
            for(int i=1;i<=num;i++){
                fact=fact*i;
            }
            System.out.println(fact);
        }

    }
}
