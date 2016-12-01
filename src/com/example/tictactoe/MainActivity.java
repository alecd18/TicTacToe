package com.example.tictactoe;


import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends Activity {

	Button buttons[];
	int counter = 0;
	TextView text;
	Button reset;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		
		buttons = new Button[9];
		buttons[0] = (Button)findViewById(R.id.button1);
	    buttons[1] = (Button)findViewById(R.id.button2);
	    buttons[2] = (Button)findViewById(R.id.button3);
	    buttons[3] = (Button)findViewById(R.id.button4);
	    buttons[4] = (Button)findViewById(R.id.button5);
	    buttons[5] = (Button)findViewById(R.id.button6);
	    buttons[6] = (Button)findViewById(R.id.button7);
	    buttons[7] = (Button)findViewById(R.id.button8);
	    buttons[8] = (Button)findViewById(R.id.button9);
	    text = (TextView)findViewById(R.id.textView1);
	    reset = (Button)findViewById(R.id.button10);
	}

	public void makeMove(View v)
	{
		Button button = (Button)v;
		if (counter % 2 == 0)
		{
			button.setText("X");
			button.setClickable(false);
			checkXWinner();
			checkTie();
		}
		else
		{
			button.setText("O");
			button.setClickable(false);
			checkOWinner();
			checkTie();
		}
		counter++;
	}
	
	public void checkXWinner()
	{
		if (buttons[0].getText() == "X" && buttons[1].getText() == "X" && buttons[2].getText() == "X")
		{
			text.setText("X's WIN!");
			disableButtons();
		}
		else if (buttons[3].getText() == "X" && buttons[4].getText() == "X" && buttons[5].getText() == "X")
		{
			text.setText("X's WIN!");
			disableButtons();
		}
		else if (buttons[6].getText() == "X" && buttons[7].getText() == "X" && buttons[8].getText() == "X")
		{
			text.setText("X's WIN!");
			disableButtons();
		}
		else if (buttons[0].getText() == "X" && buttons[3].getText() == "X" && buttons[6].getText() == "X")
		{
			text.setText("X's WIN!");
			disableButtons();
		}
		else if (buttons[1].getText() == "X" && buttons[4].getText() == "X" && buttons[7].getText() == "X")
		{
			text.setText("X's WIN!");
			disableButtons();
		}
		else if (buttons[2].getText() == "X" && buttons[5].getText() == "X" && buttons[8].getText() == "X")
		{
			text.setText("X's WIN!");
			disableButtons();
		}
		else if (buttons[0].getText() == "X" && buttons[4].getText() == "X" && buttons[8].getText() == "X")
		{
			text.setText("X's WIN!");
			disableButtons();
		}
		else if (buttons[2].getText() == "X" && buttons[4].getText() == "X" && buttons[6].getText() == "X")
		{
			text.setText("X's WIN!");
			disableButtons();
		}
	}
	
	public void checkOWinner()
	{
		if (buttons[0].getText() == "O" && buttons[1].getText() == "O" && buttons[2].getText() == "O")
		{
			text.setText("O's WIN!");
			disableButtons();
		}
		else if (buttons[3].getText() == "O" && buttons[4].getText() == "O" && buttons[5].getText() == "O")
		{
			text.setText("O's WIN!");
			disableButtons();
		}
		else if (buttons[6].getText() == "O" && buttons[7].getText() == "O" && buttons[8].getText() == "O")
		{
			text.setText("O's WIN!");
			disableButtons();
		}
		else if (buttons[0].getText() == "O" && buttons[3].getText() == "O" && buttons[6].getText() == "O")
		{
			text.setText("O's WIN!");
			disableButtons();
		}
		else if (buttons[1].getText() == "O" && buttons[4].getText() == "O" && buttons[7].getText() == "O")
		{
			text.setText("O's WIN!");
			disableButtons();
		}
		else if (buttons[2].getText() == "O" && buttons[5].getText() == "O" && buttons[8].getText() == "O")
		{
			text.setText("O's WIN!");
			disableButtons();
		}
		else if (buttons[0].getText() == "O" && buttons[4].getText() == "O" && buttons[8].getText() == "O")
		{
			text.setText("O's WIN!");
			disableButtons();
		}
		else if (buttons[2].getText() == "O" && buttons[4].getText() == "O" && buttons[6].getText() == "O")
		{
			text.setText("O's WIN!");
			disableButtons();
		}
	}
	
	public boolean allClicked()
	{
		boolean allClicked;
		for (int i = 0; i < buttons.length; i++)
		{
			if (buttons[i].getText() != "X" && buttons[i].getText() != "O")
				return false;
		}
		return true;
	}
	
	public void checkTie()
	{
		if (allClicked())
			text.setText("TIE GAME!");
	}
	
	public void disableButtons()
	{
		buttons[0].setClickable(false);
	    buttons[1].setClickable(false);
	    buttons[2].setClickable(false);
	    buttons[3].setClickable(false);
	    buttons[4].setClickable(false);
	    buttons[5].setClickable(false);
	    buttons[6].setClickable(false);
	    buttons[7].setClickable(false);
	    buttons[8].setClickable(false);
	}
	
	public void reset(View v)
	{
		buttons[0].setClickable(true);
	    buttons[1].setClickable(true);
	    buttons[2].setClickable(true);
	    buttons[3].setClickable(true);
	    buttons[4].setClickable(true);
	    buttons[5].setClickable(true);
	    buttons[6].setClickable(true);
	    buttons[7].setClickable(true);
	    buttons[8].setClickable(true);
	    
	    buttons[0].setText("");
	    buttons[1].setText("");
	    buttons[2].setText("");
	    buttons[3].setText("");
	    buttons[4].setText("");
	    buttons[5].setText("");
	    buttons[6].setText("");
	    buttons[7].setText("");
	    buttons[8].setText("");
	    
	    text.setText("");
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
