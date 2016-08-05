package com.example.gpa_calculator;


import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.widget.Toast;

public class Prefs  extends PreferenceActivity   implements OnSharedPreferenceChangeListener{
	ListPreference l;
	public void onCreate(Bundle save)
	{
		super.onCreate(save);
		addPreferencesFromResource(R.xml.prefs);
		l = (ListPreference) findPreference("list");	
		
		
		l.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
		    public boolean onPreferenceChange(Preference preference, Object newValue) {
		        Toast.makeText(getApplicationContext(),  "All changes will occur after  \n"
		        		+ "restarting the app", Toast.LENGTH_SHORT).show();
		        // Restart Activity to apply Theme

		        return true;
		    }
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(this);
prefs.registerOnSharedPreferenceChangeListener(this);
		*/
		
	
	//l.setOnPreferenceChangeListener((OnPreferenceChangeListener) this);
		
		
	}


	@Override
	public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
		
		
		/*

l.setOnPreferenceChangeListener(new OnPreferenceChangeListener() {

    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        // TODO Auto-generated method stub
        Toast.makeText(Prefs.this, "All changes will occur after  \n"
        		+ "restarting the app", Toast.LENGTH_LONG).show();
        return true;
    }
});
		*/
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
    
}