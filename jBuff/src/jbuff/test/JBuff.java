/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jbuff;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * @author Adam Trojnar
 * @date Jan 18, 2014
 */
public class JBuff extends Simulator {
        StatusPanel statusPanel;
	ToolbarPanel toolbarPanel;
	JPanel jBuffMain;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Define some constants to speed up some calculations
      final int maxNeedleLength = 6;
      final int maxDrops = 100;// 10000;
      final int precision = 5;
		final int floorSideSize = 158;
		final int boardSize = 40;
		final int dropDelay = 0;

      // Create a floor of dimensions 60x60 with boards having a width of 6
      JBuff s = new JBuff(floorSideSize, boardSize, maxNeedleLength);

	}
	
	JBuff() {
	}

	JBuff(int floorSideSize, int boardSize, int maxNeedleLength) {

		floor = new Floor(floorSideSize, floorSideSize, boardSize, 10);

		statusPanel = new StatusPanel();
		toolbarPanel = new ToolbarPanel(this,floor);
                JFrame jBuffMain = new JFrame();
                JFrame main = new Interface();
		
                main.setSize(new Dimension(800,600));
                
                jBuffMain.setLocationRelativeTo(null);
		jBuffMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jBuffMain.show();
		Container contentPane = jBuffMain.getContentPane();

		contentPane.setFont(new Font("Helvetica", Font.PLAIN, 14));

		contentPane.setLayout(new BorderLayout());


		contentPane.add(toolbarPanel, BorderLayout.NORTH);
		jBuffMain.add(floor);
		contentPane.add(statusPanel, BorderLayout.SOUTH);

	}

	public void simulate(int needleSize, int maxDrops, int precision, int dropDelay) {

		needle = new GraphicNeedle(needleSize, dropDelay);
		statusPanel.resetStatus();
		statusPanel.setNeedleSize(needleSize);
		statusPanel.setPrecision(precision);

		if(runDrops(maxDrops, precision)) {  // An accurate estimation was reached
			statusPanel.setMessage("A GOOD Estimation was Found!");
		}
		else {   // No good estimation (within the precision) was reached
			statusPanel.setMessage("NO GOOD Estimation was Found!");
		}

		statusPanel.setDropsMax(maxDrops);
		statusPanel.setDropsTotal(totalDrops);
		statusPanel.setDropsCrossing(dropsCrossingCrack);
		statusPanel.setEstimation(estimatedPI);

	}

	synchronized public void pause() {
		if(needle != null) {
			((GraphicNeedle) needle).pause();
		}
	}

	synchronized public void resume() {
		if(needle != null) {
			((GraphicNeedle) needle).resume();
		}
	}

	synchronized public void terminate() {
		if(needle != null) {
			((GraphicNeedle) needle).terminate();
		}
	}

	synchronized public void reset() {
		floor.clean();
		needle = null;
	}

}
