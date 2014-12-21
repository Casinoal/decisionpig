package arw.apps.decisionpig2;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends Activity implements OnClickListener {

		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
  MediaPlayer hi = MediaPlayer.create(this, R.raw.decision);
  hi.start();

    
        final Handler handler = new Handler();
    handler.postDelayed(new Runnable() {
      @Override
      
      public void run() {
    	    Button btn = (Button)findViewById(R.id.mybutton);
    	    btn.setVisibility(View.VISIBLE); //View.GONE, View.INVISIBLE are available too.
    	 
    	    
    	    Button btn2 = (Button)findViewById(R.id.meet);
    	    btn2.setVisibility(View.VISIBLE); //View.GONE, View.INVISIBLE are available too.
    	    
    	    TextView text = (TextView)findViewById(R.id.textView1);
    	    text.setVisibility(View.VISIBLE); //View.GONE, View.INVISIBLE are available too.
    	    
      }
    }, 3000);
    
    
      
    
    Button btn = (Button) findViewById(R.id.mybutton);
	btn.setOnClickListener(this);

	Button btn2 = (Button) findViewById(R.id.meet);
	btn2.setOnClickListener(this);
        	
	
    }
    	@Override
        public void onClick(View view) {
        	
    		switch (view.getId()) {
    		
    		
    		case R.id.mybutton:
    			Intent launchactivity= new Intent(MainActivity.this,Decision.class);                               
           	 startActivity(launchactivity);
           	 
    			break;
    			
    		case R.id.meet:
        			Intent meetactivity= new Intent(MainActivity.this,MeethePigs.class);                               
               	 startActivity(meetactivity);
               	 
        			break;
    		
    		default:
    			break;
    		}
    		
        	
     
        }          
  
   
    }

	

