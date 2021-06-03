package sef.module8.activity;
//Needs to be completed
//The following program, when run, results in an exception.
//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed. 

public class TryCatchFinallyActivity {
public static void main(String[] args) {
	TryCatchFinallyActivity obj=new TryCatchFinallyActivity();
	obj.catchMeIfYouCan();
	System.out.println("Wish you happy learning");
}

void catchMeIfYouCan();
		try
		{
			int[] arr = {0, 1, 2, 3, 4, 5};

			for (int i = 0; i <= 10; i++) {
				try {

					System.out.println(arr[i]);

				}

			}
	catch(Exception e)

			System.out.println("You are visitor number 100");
			finally
			{
				System.out.println("This is final block");
			}
		}
}

}
