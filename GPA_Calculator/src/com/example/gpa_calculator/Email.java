package com.example.gpa_calculator;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Email extends Activity implements View.OnClickListener{

	Button sendMail;
	EditText sub,msg;
	String mesg,subj;
	private Toast mToastToShow;
 String  mail="virgodevelopers@gmail.com";
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.email);
     	initializeVars();
		
		sendMail.setOnClickListener(this);
	}

	public void initializeVars()
	{
		try
		{
		sendMail=(Button)findViewById(R.id.button1);
		sub = (EditText) findViewById(R.id.editText1);
		msg = (EditText) findViewById(R.id.editText4);
		
		}
		catch(Exception exp)
		{
			Context context = getApplicationContext();

			
			CharSequence text =exp.getMessage() ;
			showToast( text);
			/*int duration = 000;

			Toast toast = Toast.makeText(context, text, duration);
			toast.show();*/
			
			
			
		
		}
		
		
	}
	
	
	public void showToast(CharSequence text) {
		   // Set the toast and duration
		   int toastDurationInMilliSeconds = 10000;
		   mToastToShow = Toast.makeText(this, text, Toast.LENGTH_LONG);
		 
		   // Set the countdown to display the toast
		   CountDownTimer toastCountDown;
		   toastCountDown = new CountDownTimer(toastDurationInMilliSeconds, 1000 /*Tick duration*/) {
		      public void onTick(long millisUntilFinished) {
		         mToastToShow.show();
		      }
		      public void onFinish() {
		         mToastToShow.cancel();
		         }
		   };
		 
		   // Show the toast and starts the countdown
		   mToastToShow.show();
		   toastCountDown.start();
		}
	
	
	
	
	
	
	
	
	public void getData()
	{
		try
		{
		mesg=msg.getText().toString();
		subj=sub.getText().toString();
		}
		catch(Exception exp)
		{
			Context context = getApplicationContext();

			
			CharSequence text =exp.getMessage() ;
			int duration = Toast.LENGTH_SHORT;

			Toast toast = Toast.makeText(context, text, duration);
			toast.show();
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		getData();
		String emailaddress[] = { mail };
		
		
		Intent mailer=new Intent(android.content.Intent.ACTION_SEND);
		mailer.putExtra(android.content.Intent.EXTRA_EMAIL, emailaddress);
		mailer.putExtra(android.content.Intent.EXTRA_SUBJECT, subj);
		mailer.setType("plain/text");
		mailer.putExtra(android.content.Intent.EXTRA_TEXT, mesg);
		startActivity(mailer);
		
		
		
		
		
		
		
		
		
		
	}
	
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

	
	
	

}
