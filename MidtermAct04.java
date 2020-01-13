import java.io.*;
import java.util.*;

public class MidtermAct04
{
	public static void main(String []args) throws Exception {
			File jessa = new File("phonebook.txt");
			Scanner input = new Scanner(jessa);
			
			while(input.hasNext()){
				System.out.println(input.nextLine());
			}
			input.close();
			PrintWriter outFile = new PrintWriter("recordfound.txt");
			Scanner in = new Scanner(jessa);

				System.out.println();
				System.out.print("Code: 1001-11");
				System.out.println();
				
				System.out.print("Firstname: Pedro");
				System.out.println();

				System.out.print("Lastname: Hampaslupa");
				System.out.println();

				System.out.print("CP #: 09481801434");
				System.out.println();

			while (in.hasNext()) {
				String xdata = in.nextLine();
				outFile.println(xdata);
			}
			outFile.close();
			in.close();
	}
}
