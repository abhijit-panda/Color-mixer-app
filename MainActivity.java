package com.example.colormixer;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {
	SeekBar sb1,sb2,sb3;
	RelativeLayout r;
	TextView tv;
	String hex1="00";
	String hex2="00";
	String hex3="00";
	CheckBox cb;
	Thread t1,t2,t3;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sb1=(SeekBar) findViewById(R.id.seekBar1);
        sb2=(SeekBar) findViewById(R.id.seekBar2);
        sb3=(SeekBar) findViewById(R.id.seekBar3);
        r=(RelativeLayout) findViewById(R.id.rl);
        tv=(TextView) findViewById(R.id.textView1);
        cb=(CheckBox) findViewById(R.id.checkBox1);
        
        
        sb1.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				try{
				for(int i=0;i<256;i++)
				{
					
					if(i>15)
					{
						if(progress==i){
					hex1=Integer.toHexString(i);
					tv.setText(hex1+hex2+hex3);
					String s1="#"+hex1+hex2+hex3;
					r.setBackgroundColor(Color.parseColor(s1));
				}
					}
					else if(i<=15)
					{
						if(progress==i){
							hex1="0"+Integer.toHexString(i);
							tv.setText(hex1+hex2+hex3);
							String s4="#"+hex1+hex2+hex3;
							r.setBackgroundColor(Color.parseColor(s4));
						}
					}
					}
					
				}
					catch (Exception e) {
						// TODO: handle exception
					}
				
					
				}
			}
		);
        
				
sb2.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				// TODO Auto-generated method stub
				try{
				for(int i=0;i<256;i++)
				{
					
					if(i>15)
					{
						if(progress==i){
					hex2=Integer.toHexString(i);
					tv.setText(hex1+hex2+hex3);
					String s2="#"+hex1+hex2+hex3;
					r.setBackgroundColor(Color.parseColor(s2));
					}
					}
					else if(i<=15){
						if(progress==i){
							hex2="0"+Integer.toHexString(i);
							tv.setText(hex1+hex2+hex3);
							String s5="#"+hex1+hex2+hex3;
							r.setBackgroundColor(Color.parseColor(s5));
							}
					}
				}
				}
					catch (Exception e) {
						// TODO: handle exception
					}
				
						
				}
			}
		);
sb3.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
	
	@Override
	public void onStopTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onStartTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onProgressChanged(SeekBar seekBar, int progress,
			boolean fromUser) {
		// TODO Auto-generated method stub
		try{
		for(int i=0;i<256;i++)
		{
			
			if(i>15)
			{
				if(progress==i){
			hex3=Integer.toHexString(i);
			tv.setText(hex1+hex2+hex3);
			String s3="#"+hex1+hex2+hex3;
			r.setBackgroundColor(Color.parseColor(s3));
				}
			}
			else if(i<=15)
			{
				if(progress==i){
					hex3="0"+Integer.toHexString(i);
					tv.setText(hex1+hex2+hex3);
					String s6="#"+hex1+hex2+hex3;
					r.setBackgroundColor(Color.parseColor(s6));
						}
			}
			
		}
		}
			catch (Exception e) {
				// TODO: handle exception
			}
		
			
		}
	}
);





cb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
	
	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		t1=new Thread(){
			public void run()
			{
				while(cb.isChecked()){
				Random r=new Random();
				int i=(r.nextInt(255));
				try{
					sb1.setProgress(i);
					sleep(2000);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
			}
		
			
			
		};
		t1.start();
		t2=new Thread(){
			public void run()
			{
				while(cb.isChecked()){
				Random r=new Random();
				int i=(r.nextInt(255));
				try{
					sb2.setProgress(i);
					sleep(2000);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
			}
		
			
			
		};
		t2.start();
		t3=new Thread(){
			public void run()
			{
				while(cb.isChecked()){
				Random r=new Random();
				int i=(r.nextInt(255));
				try{
					sb3.setProgress(i);
					sleep(2000);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
			}
		
			
			
		};
		t3.start();
	}
});



     
    }
    
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
