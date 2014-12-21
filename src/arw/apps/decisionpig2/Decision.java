package arw.apps.decisionpig2;

import java.util.Random;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;


public class Decision extends Activity {


	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	
		Random rnd = new Random();
        int screen = (int) rnd.nextInt(3)+1;

        switch(screen){
        
        case 1:
        	setContentView(R.layout.activity_decide_school);
            break;
        case 2:
        	setContentView(R.layout.activity_decide_prof);
            break;
        case 3:
        	setContentView(R.layout.activity_decide_biker);
            break;
        }
					
		 MediaPlayer spoke = MediaPlayer.create(this, R.raw.spoken);
		 spoke.start();
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.decision, menu);
		return true;
	}
	
	  
	
}

