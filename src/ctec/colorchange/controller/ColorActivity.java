package ctec.colorchange.controller;


import android.widget.*;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

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
		colorList.add(R.color.mintgreen);
		colorList.add(R.color.lightblue);
		colorList.add(R.color.red);
		colorList.add(R.color.white);
		colorList.add(R.color.black);
	}
	
	private void setupListeners()
	{
		colorButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View currentview)
			{//Button click stuff will go here
				int randomIndex = (int) (Math.random()* colorList.size());
				
				
				colorButton.setBackgroundResource(colorList.get(randomIndex));
				
			}
		});
	}
}
