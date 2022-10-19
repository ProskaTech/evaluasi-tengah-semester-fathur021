/*
 * created by 21343046_fathur rahmn
 */

public class NO1 {
    public static void main(String[] args){
        int a,i;
        int b = 4;
        int c = 9;
        int d = 9;
        int e = 9;

        
        while(b<9){
            a = (e - b) / 4;
            for(i=0;i<a;i++){
                System.out.print(" ");
            }
            for(i=a+1;i<b/2+a+1;i++){
                System.out.print(i);
            }
            for(i=0;i<a;i++){
                System.out.print(" ");
            }
            System.out.print(" ");
            for(i=0;i<a;i++){
                System.out.print(" ");
            }
            for(i=a+1+b/2;i<b/2+a+1+b/2;i++){
                System.out.print(i);
            }
            System.out.println(" ");
            b = b * 2;
        }

    
        while(d>0){
            a = (c-d) / 2;
            for(i=0;i<a;i++){
                System.out.print(" ");
            }
            for(i=1;i<d+1;i++){
                System.out.print(i);
            }
            for(i=0;i<a;i++){
                System.out.print(" ");
            }
            System.out.println(" ");
            d = d-2;
        }
    }
}