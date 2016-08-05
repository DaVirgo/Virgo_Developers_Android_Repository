package com.example.gpa_calculator;



import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class Splash extends Activity
{
	MediaPlayer ourSong;
	@Override


protected void onCreate(Bundle savedInstanceState) 
	{
		
       super.onCreate(savedInstanceState);
	   setContentView(R.layout.starter);
   ourSong=	MediaPlayer.create(Splash.this, R.raw.nutcrackershort);   

   SharedPreferences con=PreferenceManager.getDefaultSharedPreferences(getBaseContext());
    boolean check=con.getBoolean("check", true);
    if(check==true)
    {
    	ourSong.start();
    }
    
    
    Thread t=new Thread()
	   {
		  
		   public void run()
		   {
			   try 
			   {
				   sleep(5000);
			   }
			   catch (InterruptedException e)
			   {
				  e.printStackTrace();
			   }
			   finally
			   {
				   Intent t= new  Intent ("com.example.gpa_calculator.MAINACTIVITY");
				   startActivity(t);
			   }
		   }
	  
	   
	   };
	  
	t.start();
	}

	@Override
	protected void onPause() {

		super.onPause();
		ourSong.release();
		finish();
	}
	
}