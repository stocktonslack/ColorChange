package ctec.colorchange.controller;


import android.widget.*;
import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ColorActivity extends Activity
{
	private Button colorButton;
	private ArrayList<Integer> colorList;
	private TextView appText;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_color);
		
		colorButton = (Button)	findViewById(R.id.colorButton);
		appText = (TextView) findViewById(R.id.firstTextView);
		colorList = new ArrayList<Integer>();
		
		setupListeners();
		fillTheColorList();
	}
	
	private void fillTheColorList()
	{
		colorlist.add(R.color.mintgreen);
		colorlist.add(R.color.lightblue);
		colorlist.add(R.color.red);
		colorlist.add(R.color.white);
		colorlist.add(R.color.black);
	}
	
	private void setupListeners()
	{
		colorButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentview)
			{//Button click stuff will go here
				int randomIndex = (int) (Math.random()* colorList.size());
				colorButton.setBackgroundResource(R.color.mintgreen);
				colorButton.setBackgroundResource(R.color.lightblue);
				colorButton.setBackgroundResource(R.color.red);
				colorButton.setBackgroundResource(R.color.white);
				colorButton.setBackgroundResource(R.color.black);
				
				colorButton.setBackgroundResource(colorList.get(randomIndex));
				
			}
		});
	}
}
