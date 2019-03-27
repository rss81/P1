package gen;

import java.io.File;
import java.awt.Desktop;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) throws Exception {
		Scanner kboard = new Scanner(System.in);
        System.out.println("\u000C"); 
        String selection;
        boolean video = true;
        int cnt = 0;
        
        while(video){
           System.out.print("Enter cat or emu : ");           
           selection = kboard.nextLine();
           if (selection.equals("emu")){
            Desktop.getDesktop().open(new File("c:\\emu.mp4"));
            Thread.sleep(14000);            
           }else if(selection.equals("cat")){
            Desktop.getDesktop().open(new File("c:\\Cat Boarding.mp4"));
            Thread.sleep(12000);  
           }
           System.out.println();
           cnt++;
           if (cnt == 3) video = false;
        }
        kboard.close();   

	}

}
