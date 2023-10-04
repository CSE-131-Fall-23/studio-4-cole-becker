package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int redComp = in.nextInt();
		int greenComp = in.nextInt();
		int blueComp = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double x = in.nextDouble();
System.out.println(x);
		double y = in.nextDouble();
		System.out.println(y);
		double halfWidth = in.nextDouble();
		System.out.println(halfWidth);	
		double halfHeight = in.nextDouble();
				System.out.println(halfHeight);

		
		StdDraw.setPenColor(redComp, greenComp, blueComp);
	if(isFilled == true)
	{
		StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
	}
	else
	{
		StdDraw.rectangle(x, y, halfWidth, halfHeight);	
	}
	}
}
