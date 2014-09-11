package id.creatorb.warna;

import id.creatorb.warna.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.graphics.Color;
import android.widget.RadioButton;

public class Colors extends Activity {

	private LinearLayout background;
	private RadioGroup backgroundButtons;
	private RadioButton putihButton;
	private RadioButton merahButton;
	private RadioButton biruButton;
	private RadioButton hijauButton;
	private RadioButton hitamButton;
	private RadioButton unguButton;
	private RadioButton kuningButton;
	private RadioButton coklatButton;
	private RadioButton pinkButton;
	private RadioButton orangeButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        background = (LinearLayout)findViewById(R.id.Layout);
        backgroundButtons = (RadioGroup)findViewById(R.id.backgroundColors);
        backgroundButtons.setOnCheckedChangeListener(backgroundColorListener);
        
        putihButton = (RadioButton)findViewById(R.id.putihButton);
        merahButton = (RadioButton)findViewById(R.id.merahButton);
        biruButton = (RadioButton)findViewById(R.id.biruButton);
        hijauButton = (RadioButton)findViewById(R.id.hijauButton);
        hitamButton = (RadioButton)findViewById(R.id.hitamButton);
        unguButton = (RadioButton)findViewById(R.id.unguButton);
        kuningButton = (RadioButton)findViewById(R.id.kuningButton);
        coklatButton = (RadioButton)findViewById(R.id.coklatButton);
        pinkButton = (RadioButton)findViewById(R.id.pinkButton);
        orangeButton = (RadioButton)findViewById(R.id.orangeButton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    private OnCheckedChangeListener backgroundColorListener = new OnCheckedChangeListener()
    {
    	public void onCheckedChanged(RadioGroup group, int checkedId)
    	{
    		switch (checkedId)
    		{
    			case R.id.putihButton:
    				background.setBackgroundColor(Color.parseColor("#FFFFFF"));
    			break;
    			case R.id.merahButton:
    				background.setBackgroundColor(Color.parseColor("#FF0000"));
    			break;
    			case R.id.biruButton:
    				background.setBackgroundColor(Color.parseColor("#0000FF"));
    			break;
    			case R.id.hijauButton:
    				background.setBackgroundColor(Color.parseColor("#00FF00"));
    			break;
    			case R.id.hitamButton:
    				background.setBackgroundColor(Color.parseColor("#000000"));
    				//hitamButton.setTextColor(Color.parseColor("#FFFFFF"));
    			break;
    			case R.id.unguButton:
    				background.setBackgroundColor(Color.parseColor("#800080"));
    			break;
    			case R.id.kuningButton:
    				background.setBackgroundColor(Color.parseColor("#FFFF00"));
    			break;
    			case R.id.coklatButton:
    				background.setBackgroundColor(Color.parseColor("#D2691E"));
    			break;
    			case R.id.pinkButton:
    				background.setBackgroundColor(Color.parseColor("#FF1493"));
    			break;
    			case R.id.abuButton:
    				background.setBackgroundColor(Color.parseColor("#808080"));
    			break;
    			case R.id.emasButton:
    				background.setBackgroundColor(Color.parseColor("#FFD700"));
    			break;
    			case R.id.orangeButton:
    				background.setBackgroundColor(Color.parseColor("#FFA500"));
    			break;
    			case R.id.silverButton:
    				background.setBackgroundColor(Color.parseColor("#C0C0C0"));
    			break;
    			
    		}
    	}
    };
}