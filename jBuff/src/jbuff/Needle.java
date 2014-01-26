package jbuff;

import java.awt.Color;
import static java.awt.Color.red;
import java.util.Random;

public class Needle {
	 private Random generator;
       
        public double ylow;
        public double yhigh;
        public double angle;
        public String status;

        public Needle() {
                generator = new Random();
        }
        
        public void drop() {
                this.ylow = 6 * generator.nextDouble();
                this.angle = 180 * generator.nextDouble();
                
                this.yhigh = ylow + Math.sin(Math.toRadians(angle));
                
        }
        
       
}
