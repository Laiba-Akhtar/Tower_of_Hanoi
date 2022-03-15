import java.util.Scanner;
//number of moves are calculated by 2 ^n-1
class hanoi
{
static void towerOfHanoi(int n, char source, char des, char aux)
{
    if (n == 1)
    {
        System.out.println(source+"-->"+des);
    }
    else{
        
    towerOfHanoi(n - 1,source ,aux , des);
System.out.println(source+"-->"+des);
    towerOfHanoi(n - 1, aux, des, source);
}
}
 
public static void  main(String args[])
{
    Scanner sc=new Scanner(System.in);
	System.out.println("How many number of disks?");
	int n=sc.nextInt();
    
    towerOfHanoi(n, 'B', 'A', 'C'); 
}
}
