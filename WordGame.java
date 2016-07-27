import java.util.Scanner;
class WordGame{

public static void main(String args[]){
int st = 0;
WordGame wg = new WordGame();

System.out.println("Enter the level of difficulty :"+wg.mode(st));
	Scanner sc = new Scanner(System.in);
	st = sc.nextInt();

}



public String mode(int n){
	String s = "";
	if(n == 1){
		System.out.println("easy mode");
	}else if(n == 2){
		System.out.println("medium mode");
	}else if(n == 3){
		System.out.println("difficult mode");
	}
return s;
}
	}