
import java.util.Scanner;

public class kbc3 {

  public static void main(String[] args) {
  
   Scanner sc=new Scanner(System.in);
    int i;
        for(i=1;i<=39;i++)
        {
            if(i%2!=0)
            System.out.print("*");
            else
System.out.print(" ");

        }System.out.println();
    System.out.println("*      KBC working model by:          *");
System.out.println("*      Tayyab software solutions      *");


 for(i=1;i<=39;i++)
 {
            if(i%2!=0)
            System.out.print("*");
            else
System.out.print(" ");
}System.out.println();
for(i=1;i<=5;i++)
{
  System.out.println("|");
}System.out.println();
System.out.println("       Press 👆 any key to proceed");
char ch=sc.next().charAt(0);
if(ch>='a'||ch<='z')
{
 System.out.println("General Instructions:");
 System.out.println("1.For each question you'll be given four options a,b,c and d.");
 System.out.println("2.You need to enter 'a' or 'b' or 'c' or 'd',for the option you think is correct.");
 System.out.println("3.There will be 6 questions in total.");
 System.out.println("4.In case you mark the incorrect option;the game will be over.");
 System.out.println();
 System.out.println("**BONUS**---You'll be given 2 lifelines,which you can use for first 3 questions.");
 System.out.println();
 
 System.out.println("       Press 👆 any key to proceed.");
 
 char c=sc.next().charAt(0);
if(c>='a'||c<='z')
{
 for(i=1;i<=5;i++)
{
  System.out.println("|");
}
 
 System.out.println("   Press \'S\' key to start the 🧩🎲 game");
 
 char chr=sc.next().charAt(0);
if(chr=='s')
  {int i1=0;
		char user_input;
		String questions[] = new String[]{"1️⃣ Who is the CEO of Google ?", "2️⃣ Where is he from", "3️⃣ Who is the CEO of Facebook", "4️⃣ how many state in india", "5️⃣ What is state of india : ", "6️⃣ What is Japan also known as?" };
		String first_options[] = new String[]{"A)Sunil Parcha", "A)Madurai", "A)Mark Zuckerberg", "A)27", "A)Nagpur", "A)The machine"};
		String second_options[] =new String[]{"B)Sundar Pichai", "B)America", "B)Ankit Sharma", "B)30","B)Delhi", "B)the confu town"};
		String third_options[] = new String[]{"C)Amit bhanada", "C)Delhi", "C)larry page", "C)28", "C)Alaska","C)The land of rising sun"};
		String four_options[] = new String[]{"D)Annabel Fenwick Elliott", "D)Mumbai", "D)Oliver", "D)41" , "D)Dharasala", "D)Intelligents"};
		char answers[] ={'b', 'c','a','c','b','c'};
		int rps[] = new int[]{1000, 2000, 5000, 10000, 20000, 50000};
		int n=0;
		int nameLength = questions.length;
		while(n < nameLength){
			System.out.println("              press any key");
		char charaa;
		charaa=sc.next().charAt(0);
		if(charaa>='a'||charaa<='z')
		{
	System.out.println(questions[n]);
			System.out.print(" " +first_options[n]+"     ");
			System.out.println(second_options[n]);
			System.out.print(" "+third_options[n]+"     ");
			System.out.println(four_options[n]);
		}	System.out.println("   yeh question Rs."  + rps[n] + "\\- ke  liye hai");
		System.out.println();
		System.out.println();
			System.out.println("        Aap answer input kijiye ⌨️");
			
			user_input = sc.next().charAt(0);
			if (answers[n]==user_input) {
				System.out.println("     ☑️EK DUM SAHI JABAB👋👋");
				System.out.println();
			}
	else if(user_input=='l')	
	{if(n==0){
	 System.out.println(questions[0]);
	 System.out.println(" "+first_options[n]+"     "+second_options[n]);
}  if(n==1){
	 System.out.println(questions[1]);
	 System.out.println(" "+first_options[n]+"     "+third_options[n]);
} if(n==2){
	 System.out.println(questions[2]);
	 System.out.println(" "+first_options[n]+"     "+four_options[n]);
} 

user_input = sc.next().charAt(0);
			if (answers[n]==user_input) {
				System.out.println("     ☑️EK DUM SAHI JABAB👋👋");
				System.out.println();
  }}	
		else{
				System.out.println("           APKA JABAB SAHI NHI HAI");
				System.out.println();
				break;
			}
			i1 = i1 + rps[n];
			System.out.println("     ➡️Abhi aap Rs." + i1 + "\\- Jeet cuke hai 💰💰");
			System.out.println();
			n++;
		}
		System.out.println("   )        You Win🎖 Rs." + i1+"\\-💰💰");
		System.out.println();
		System.out.println(" )         Thanks for playing KBC 😊");
    }
  }
}}}
