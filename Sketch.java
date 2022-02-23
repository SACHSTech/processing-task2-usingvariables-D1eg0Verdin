import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(700, 700);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135, 206, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	
    fill(192, 192, 192);
    rect(width * 0.0925f, height * 0.125f,
         width * .125f, height * 0.875f);
    rect(width * 0.0575f, height * 0.375f,
         width * 0.09f, height * 0.625f);
    rect(width * 0.0175f, height * .2625f, 
         width * 0.075f, height * .7375f);
    rect(width * 0.265f, height * 0.0625f, 
         width * .105f, height * .9375f);
    rect(width * 0.43f, height * 0.3125f, 
         width * 0.145f, width * 0.6875f);
    rect(width * 0.6225f, width * 0.075f, 
         width * 0.12f, height * 0.925f);
    rect(width * .7675f, height * 0.1f, 
         width * 0.1025f, height * 0.9f); 
    
    //grass
    stroke(23, 23, 23);
    fill(52, 140, 59);
    rect(width * 0f, height * 0.75f, 
         width * 1f, height * 0.25f);  
   
    //left pillar
    fill(23, 23, 23);
    rect(width * 0.125f, height * 0.3125f, 
         width * 0.1875f, height * 0.4375f);
    
    //roof of left pillar
    fill(225);
    rect(width * 0.1f, height * 0.2875f,
         width * 0.2375f, height * 0.025f );

    //right rectangle
    fill(225);
    rect(width * 0.3125f, height * 0.4625f, 
         width * 0.4375f, height * 0.2875f);

    //roof of white rectangle
    fill(23, 23, 23);
    rect(width * 0.2875f, height * 0.4375f, 
         width * 0.4875f, height * 0.025f);

    //window for left pillar
    fill(0 ,164 ,239);
    ellipse(width * 0.2175f, height * 0.5f, 
            width * 0.125f, height * 0.1875f);

    //left window details
    stroke(23);
    line(width * 0.2175f, height * 0.375f,
         width * 0.2175f, height * 0.6875f);
    line(width * 0.155f, height * 0.5f, 
         width * 0.28f, height * 0.5f);

    //Door
    fill(78, 53, 36);
    rect(width * 0.375f, height * 0.575f, 
         width * 0.1f, height * 0.175f);
    
    //door handle
    fill(220, 220, 220);
    ellipse(width * 0.4575f, height * 0.675f,
            width * 0.025f, height * 0.025f);

    // right window
    fill(0 ,164 ,239);
    rect(width * 0.5f, height * 0.5125f , 
         width * 0.25f, height * 0.1875f);

    //right window details
    line(width * 0.5f, height * 0.5625f,
         width * 0.75f, height * 0.5625f);
    line(width * 0.5f, height * 0.625f,
         width * 0.75f, height * 0.625f);
    line(width * 0.5625f, height * 0.5125f,
         width * 0.5625f, height * 0.7f);
    line(width * 0.625f, height * 0.5125f,
         width * 0.625f, height * 0.7f);
    line(width * 0.6875f, height * 0.5125f,
         width * 0.6875f, height * 0.7f);
      
    
  }
  
  // define other methods down here.
}