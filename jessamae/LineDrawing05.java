import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing05
{
	public static void main(String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		int num;
		int length = 1;
		terminal.enterPrivateMode();
		for(int m=1;m<=20;m=m+2){
			num=(length/2)+(length%2);
			for(int j=1;j<=length;j=j+1){
				terminal.setCursorPosition(11-j,m);
				if(11-j <= 10-length+num){	
					terminal.putCharacter('X');
					
				}else{
					terminal.putCharacter('Y');
				}
				
			}
			terminal.setCursorPosition(10,m+1);
			terminal.putCharacter('|');
			length++;
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}