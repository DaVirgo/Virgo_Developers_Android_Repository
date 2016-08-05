package com.example.gpa_calculator;





import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{
	
	float counter=0;
	int visbr=0;
	
	int tot=0;
	 Button add,clear,feed;
	 float res=0;
	 TextView disp;
	 EditText edit1,edit2,edit3,edit4,edit5,edit6,edit7,edit8,edit9,edit10,edit11,edit12;
	 ImageButton ib;
	 protected void onCreate(Bundle savedInstanceState) {
		 
		 super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main_gp);
			SharedPreferences getData=PreferenceManager.getDefaultSharedPreferences(getBaseContext());
			String val=getData.getString("list", "#ffffff");	
			
		    
			LinearLayout li=(LinearLayout)findViewById(R.id.hey);
			li.setBackgroundColor(Color.parseColor(val));
			
			
	     edit1=(EditText)  findViewById(R.id.edit1);
	     edit2=(EditText) findViewById(R.id.edit2);
	     edit3=(EditText) findViewById(R.id.edit3);
	     edit4=(EditText) findViewById(R.id.edit4);
	     edit5=(EditText) findViewById(R.id.edit5);
	     edit6=(EditText) findViewById(R.id.edit6);
	     edit7=(EditText) findViewById(R.id.edit7);
	     edit8=(EditText) findViewById(R.id.edit8);
	     edit9=(EditText) findViewById(R.id.edit9);
	     edit10=(EditText) findViewById(R.id.edit10);
	     edit11=(EditText) findViewById(R.id.edit11);
		 edit12=(EditText) findViewById(R.id.edit12);
		 ib=(ImageButton) findViewById(R.id.iB);  
	     
	     
	     add=(Button) findViewById(R.id.submit);
	     disp=(TextView)  findViewById(R.id.title);
	     clear=(Button) findViewById(R.id.Clear);
	      feed=(Button)  findViewById(R.id.feed);
	     
	      
	      feed.setOnClickListener(this);
	   	  clear.setOnClickListener(this);  
	      add.setOnClickListener(this);
	   ib.setOnClickListener(this);
	 }

	@Override
	public void onClick(View v) {
		 
		switch(v.getId())
		{
		case R.id.submit:
			
			
			
			
			
			
			
		     try 
			     {
			    	String e1=edit1.getText().toString();
		 			String e2=edit2.getText().toString();

			    	String e3=edit3.getText().toString();
		 			String e4=edit4.getText().toString();

			    	String e5=edit5.getText().toString();
		 			String e6=edit6.getText().toString();

			    	String e7=edit7.getText().toString();
		 			String e8=edit8.getText().toString();

			    	String e9=edit9.getText().toString();
		 			String e10=edit10.getText().toString();
		 		      

			    	String e11=edit11.getText().toString();
		 			String e12=edit12.getText().toString();
		 		    
		 			if(e11.equals(null) && e12.equals(null))
		 			{
		 				e11="0";
		 				e12="0";
		 				edit11.setText("0");
						edit12.setText("0");
		 				
		 			}
		 			
		 		
		 			
		 	
		 			float ee1=Float.parseFloat(e1);
		 			int e22=Integer.parseInt(e2);
		 			counter=ee1*e22+counter;
		 			tot=tot+e22;
		 			

		 			float ee3=Float.parseFloat(e3);
		 			int e44=Integer.parseInt(e4);
		 			counter=ee3*e44+counter;
		 			tot=tot+e44;
		 			
		 			float ee5=Float.parseFloat(e5);
		 			int e66=Integer.parseInt(e6);
		 			counter=ee3*e44+counter;
		 			tot=tot+e66;
		 			
		 			float ee7=Float.parseFloat(e7);
		 			int e88=Integer.parseInt(e8);
		 			counter=ee7*e88+counter;
		 			tot=tot+e88;
		 			
		 			
		 			float ee9=Float.parseFloat(e9);
		 			int ee10=Integer.parseInt(e10);
		 			counter=ee9*ee10+counter;
		 			tot=tot+ee10;
		 			
		 			float ee11=Float.parseFloat(e11);
		 			int ee12=Integer.parseInt(e12);
		 			counter=ee11*ee12+counter;
		 			tot=tot+ee12;
		 			
		 			res=counter/tot;
		 			disp.setText("Your GPA is."+res);
			     }
			catch (Exception e)
			     {
				 
				   
				edit11.setText("0");
				edit12.setText("0");
				   
				   
				   
				Context context = getApplicationContext();

			
				CharSequence text = "Error! Empty Fields";
				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
			     }


			
			
		      break;
		
		case R.id.Clear:
			
			edit1.setText("");
			edit2.setText("");
			edit3.setText("");
			edit4.setText("");
			edit5.setText("");
			edit6.setText("");
			edit7.setText("");
			edit8.setText("");
			edit9.setText("");
			edit10.setText("");
			edit11.setText("");
			edit12.setText("");
			counter=0;
			disp.setText("Your GPA is."+counter);
			
			
			
			
			
			break;
		
		case	R.id.feed:
				
			  Intent t= new  Intent (v.getContext(),Email.class);
			   startActivity(t);
				/*
			Context context = getApplicationContext();

			
			CharSequence text = "Error! Empty Fields";
			int duration = Toast.LENGTH_SHORT;

			Toast toast = Toast.makeText(context, text, duration);
			toast.show();*/

			
			break;
			
			
			
		case R.id.iB:

			 // Intent p= new  Intent (v.getContext(),Menu.class);
			 //  startActivity(p);
			 
			 visbr++;
			 if(visbr%2!=0){
			 add.setVisibility(v.INVISIBLE);
			 feed.setVisibility(v.INVISIBLE);
			 clear.setVisibility(v.INVISIBLE);
			 disp.setVisibility(v.INVISIBLE);
			 openOptionsMenu();
			 }
			 
			 
			 else
			 {
				 add.setVisibility(v.VISIBLE);
				 feed.setVisibility(v.VISIBLE);
				 clear.setVisibility(v.VISIBLE);
				 disp.setVisibility(v.VISIBLE);

			 }
						
			
			 
			
			break;
			
			
			
			
			
			
			
		
		}
		
			
		
		
		// add.setVisibility(v.VISIBLE);
		// feed.setVisibility(v.VISIBLE);
		// clear.setVisibility(v.VISIBLE);
		// disp.setVisibility(v.VISIBLE);
		
		
	}
	
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		//Menu a=(Menu) findViewById(R.menu.menu);
		//a.
		MenuInflater cum = getMenuInflater();
		setMenuBackground();
		cum.inflate(R.menu.menu, menu);
		//int pos=0;
		//MenuItem i=menu.findItem(R.id.aboutus);

	  //  SpannableString s = new SpannableString("My red MenuItem");
	  //  s.setSpan(new BackgroundColorSpan(Color.RED), 0, s.length(), 0);
	  //  i.setTitle(s);
	    return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.aboutus:
			Intent i = new Intent("com.example.gpa_calculator.AboutUs");
			startActivity(i);
			break;

		case R.id.prefss:
	///		Intent l = new Intent("com.example.gpa_calculator.Settings");
	  Intent l = new Intent("com.example.gpa_calculator.Prefs");
		startActivity(l);

			break;

		case R.id.exit:
			finish();
			break;

		}
		return true;
	}

	
	 protected void setMenuBackground(){                     
	        // Log.d(TAG, "Enterting setMenuBackGround");  
	        getLayoutInflater().setFactory( new Factory() {  
	            public View onCreateView(String name, Context context, AttributeSet attrs) {
	                if ( name.equalsIgnoreCase( "com.android.internal.view.menu.IconMenuItemView" ) ) {
	                    try { // Ask our inflater to create the view  
	                        LayoutInflater f = getLayoutInflater();  
	                        final View view = f.createView( name, null, attrs );  
	                        /* The background gets refreshed each time a new item is added the options menu.  
	                        * So each time Android applies the default background we need to set our own  
	                        * background. This is done using a thread giving the background change as runnable 
	                        * object */
	                        new Handler().post( new Runnable() {  
	                            public void run () {  
	                            	Resources res = getResources();
	                            	//int title_color = res.getColor(R.color.);
	                            	// sets the background color   
	                            //	int b = getResources().getColor(R.color.title_red);
	                            	
	                            	view.setBackgroundResource( R.color.title_red);
	                                // sets the text color              
	                                ((TextView) view).setTextColor(Color.BLACK);
	                                // sets the text size              
	                                ((TextView) view).setTextSize(18);
	                }
	                        } );  
	                    return view;
	                }
	            catch ( InflateException e ) {}
	            catch ( ClassNotFoundException e ) {}  
	        } 
	        return null;
	    }}); 
	}

}	 
	 




 
	 