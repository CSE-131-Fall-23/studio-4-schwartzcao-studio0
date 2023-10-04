package studio4;

import java.awt.Color;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;


import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
//		StdDraw.setPenColor(255, 109, 182);
//		// red, green, blue
//		StdDraw.filledRectangle(0.5, 0.5,  0.5,  0.3);
//		// centerX, centerY, halfWidth, halfHeight
//		
//		StdDraw.setPenColor(0, 0, 182);
//		StdDraw.filledEllipse(0.5, 0.5, 0.2, 0.1);
//		// centerX, centerY, semiMajor axis, semiMinor axis
//		
		StdDraw.setPenColor(0,200,0);
		double[] x = {0.5,0.75, 0.5};
		double[] y = {0.4, 0.5, 0.5};

		
		StdDraw.filledPolygon(x, y);
		
		
	}
}