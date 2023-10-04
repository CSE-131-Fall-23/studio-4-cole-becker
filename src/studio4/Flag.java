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
public class Flag {

	public static void main(String[] args) throws FileNotFoundException {
	
		StdDraw.setPenColor(255, 0, 0);

		StdDraw.filledRectangle(0.15, 0.5, (.33/2), 0.3);

		StdDraw.setPenColor(0, 0, 255);

		StdDraw.filledRectangle(0.85, 0.5, (.33/2), .3);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.text(.5, .5, "I hate France");
		StdDraw.line(0, .8, 1, .2);
		StdDraw.line(0, .2, 1, .8);
	}}
