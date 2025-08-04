
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coinproblem {
    public static void main(String[] args) {
        // Define a
        Integer[] coins={1,2,5,10,20,50,100,500,2000};
        int amount=1435;
        List<Integer> result=getchange(amount, coins);
        System.out.println(result);
        System.out.println("no of coins :"+result.size());
        

    }
    public static List<Integer> getchange(int amount,Integer[] coins){
        Arrays.sort(coins,(a,b)->Integer.compare(b,a));
        List<Integer> purse=new ArrayList<>();
        for(int coin:coins){
            while(amount>=coin){
                purse.add(coin);
                amount-=coin;
                }

            }
            return purse;
        }
    }

