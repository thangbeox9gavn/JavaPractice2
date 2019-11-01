// chuyển ds kề  -> cạnh
package Pactice3;
import java.util.*;
/**
 *
 * @author hailo
 */
public class Bai11 {
    static LinkedList<Integer> dsKe[];
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n=Integer.parseInt(in.nextLine());
        dsKe= new LinkedList[n+1];
        for(int i=1;i<=n;i++){
            dsKe[i]= new LinkedList<Integer>();
        }
        for(int i=1;i<=n;i++){
            String s=in.nextLine();
            String arr[]= s.trim().split(" ");
            for(int j=0;j<arr.length;j++){
                dsKe[i].add(Integer.parseInt(arr[j]));
            }
        }
        print();
    }
    public static void print(){
        for(int i=1;i<=n;i++){
            for(int j=0;j<dsKe[i].size();j++){
                if(dsKe[i].get(j)>i){
                    System.out.println(i+" "+dsKe[i].get(j));
                }
            }
        }
    }
}
