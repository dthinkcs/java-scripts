//using Color
view1.setBackgroundColor(Color.argb(255,0,255,0));
//using CheckBox
View checkBox= findViewById(R.id.checkBoxItem1);
// RadioButton
RadioGroup radioGroup = findViewById(R.id.radioGroup); 
RadioGroup radioGroup1 = findViewById(R.id.radioGroup2); 
RadioGroup radioGroup2 = findViewById(R.id.radioGroup3); 
int selectedId = radioGroup.getCheckedRadioButtonId(); 
int selectedId1 = radioGroup1.getCheckedRadioButtonId(); 
int selectedId2 = radioGroup2.getCheckedRadioButtonId();
if (selectedId == findViewById(R.id.radioButton).getId()) { c += 10; } 
if (selectedId1 == findViewById(R.id.radioButton9).getId()) { c += 10; } 
if (selectedId2 == findViewById(R.id.radioButton12).getId()) { c += 10; }

//using Intent
public static final String EXTRA_MESSAGE = "com.example.rishabh.lab2q1.MESSAGE";
Intent myIntent = new Intent(this, Main2Activity.class);
myIntent.putExtra(EXTRA_MESSAGE, itemList);
startActivity(myIntent);

// using Internt getStringExtra
t = findViewById(R.id.textView2);
String s = getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE);
t.setText(s);
Toast.makeText(this, s, Toast.LENGTH_LONG).show();

//using Bundle


//using Toast
Toast.makeText(getApplicationContext(),"string to displed",Toast.LENGTH_LONG).show()

//using Adapter
String[] values= new String[]{"","","",""};
ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.
	R.layout.simple_list_item_1,android.R.id.text1,values);

listView.setAdapter(adapter);

//buttonlistener
listView.setOnItemClickListener(new OnItemClickListener(){
	@Override
	public void onItemClick(AdapterView<?>parent,View view,int position,long id){
		int itemPosition=position;
		String itemValue=(String)listView.getItemAtPosition(position);
	}
});


//using alertDialog
AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
alertDialogBuilder.setTitle("Your Title");
alertDialogBuilder.setMessage("click yes to exit!").setCancelable(false)
.setPositiveButton("Yes",new DialagInterface.OnClickListener(){
	public void onClick(DialagInterface dialog,int id){
		MainActiity.this.finish();
	}
})
.setNegativeButton("No",new DialagInterface.OnClickListener(){
	public void onClick(DialagInterface dialog,int id){
		dialog.cancel();
	}
});

AlertDialog alertDialog= alertDialogBuilder.create();
alertDialog.show();



//using MediaPlayer
MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.sound_file_1);
mediaPlayer.start();

//updating time
private Runnable UpdateSongTime= new Runnable(){
	public void run(){
		startTime= mediaPlayer.getCurrentPositon();
		tx1.setText(String.format("%d min:%d sec",TimeUnit.MILLISECONDS.toMinutes((long)startTime)));
		seekbar.setProgress((int)startTime);
		myHandler.postDelayed(this,100);
	}
};

package com.rishabhjaiswal.mymusicplayeradvancedcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    Button playButton; // toggle look of playButton

    SeekBar mSeekBar;
    TextView elapsedTimeLabel;
    TextView remainingTimeLabel;

    Handler mHandler;

    final int DELTA = 10000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.f);
        playButton = findViewById(R.id.playButton);
        mHandler = new Handler();
        mHandler.postDelayed(updateSongTimings, 100);

        elapsedTimeLabel = findViewById(R.id.elapsedTimeLabel);
        remainingTimeLabel = findViewById(R.id.remainingTimeLabel);
        mSeekBar = findViewById(R.id.seekBar);
        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            // int pos;
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                //pos = i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

//                mp.seekTo( (int)((seekBar.getProgress()/100.0)*mp.getDuration()) ); // 100
//                Toast.makeText(getApplicationContext(), Integer.toString(seekBar.getProgress()), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mp.seekTo( (int)((seekBar.getProgress()/100.0)*mp.getDuration()) ); // 100
                //Toast.makeText(getApplicationContext(), Integer.toString(seekBar.getProgress()), Toast.LENGTH_SHORT).show();

            }
        });
    }

    Runnable updateSongTimings = new Runnable() {
        public void run() {
            int elapsedTime = mp.getCurrentPosition();
            int songDuration = mp.getDuration();
            elapsedTimeLabel.setText(String.format("%d:%02d",
                    TimeUnit.MILLISECONDS.toMinutes(elapsedTime),
                    TimeUnit.MILLISECONDS.toSeconds(elapsedTime) % 60));

            remainingTimeLabel.setText(String.format("%d:%02d",
                    TimeUnit.MILLISECONDS.toMinutes(songDuration),
                    TimeUnit.MILLISECONDS.toSeconds(songDuration) % 60));

            mSeekBar.setProgress((int)(100 * elapsedTime / (double)songDuration));
            if (!mp.isPlaying()) {
                playButton.setText(">");
            } else {
                playButton.setText("||");
            }
            mHandler.postDelayed(this,100);

        }
    };

    public void pressPlay(View view) {
        if (!mp.isPlaying()) {
            mp.start();
            playButton.setText(">");
        } else {
            mp.pause();
            playButton.setText("||");
        }
    }

    public void pressRewind(View v) {
        mp.seekTo(0);
    }

    public void pressForward(View v) {
        mp.seekTo(mp.getCurrentPosition() + DELTA);
    }

    public void pressBack(View v) {
        mp.seekTo(mp.getCurrentPosition() - DELTA);
    }



    // LABEL STUFF
    public void playBeliever(View v) {
        boolean wasPlaying = false; if (mp.isPlaying()) {wasPlaying = true;}
        if (mp != null) {
            mp.stop();
            mp.reset();
            mp.release();
        }
        mp = MediaPlayer.create(this, R.raw.b); if (wasPlaying == true) {mp.start();}
    }
    public void playFaded(View v) {
        // Toast.makeText(this, Boolean.toString(v.getId() == R.id.playFaded), Toast.LENGTH_SHORT).show();
        boolean wasPlaying = false; if (mp.isPlaying()) {wasPlaying = true;}

        if (mp != null) {
            mp.stop();
            mp.reset();
            mp.release();
        }
        mp = MediaPlayer.create(this, R.raw.f); if (wasPlaying == true) {mp.start();}
    }
    public void playStoneCold(View v) {
        boolean wasPlaying = false; if (mp.isPlaying()) {wasPlaying = true;}

        if (mp != null) {
            mp.stop();
            mp.reset();
            mp.release();
        }
        mp = MediaPlayer.create(this, R.raw.s); if (wasPlaying == true) {mp.start();}
    }


}

// NEW
// MAIN1
package com.rishabhjaiswal.intentcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.rishabh.lab2q1.MESSAGE";
    EditText e1; // = findViewById(R.id.editText);
    EditText e2; // = findViewById(R.id.editText2);
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText2);

    }
//    public void onClick(View v) {
//        Intent myIntent = new Intent(this, Main2Activity.class);
//        myIntent.putExtra(EXTRA_MESSAGE, "Hi");
//        startActivity(myIntent);
//
//    }

    public void operation(View v) {
        int num1 = 0;
        int num2 = 0;
        try{
            num1 = Integer.parseInt(e1.getText().toString());
        }catch (NumberFormatException ex) {
            //handle exception here
            Toast.makeText(this, "Invalid num1", Toast.LENGTH_SHORT).show();
            return;
        }

        try{
            num2 = Integer.parseInt(e2.getText().toString());
        }catch (NumberFormatException ex) {
            //handle exception here
            Toast.makeText(this, "Invalid num2", Toast.LENGTH_SHORT).show();
            return;

        }

        if (v.getId() == R.id.add) {
            result = num1 + num2;
        } else if (v.getId() == R.id.subtract) {
            result = num1 - num2;
        }
        else if (v.getId() == R.id.multiply) {
            result = num1 * num2;
        }

        Intent myIntent = new Intent(this, Main2Activity.class);
        myIntent.putExtra("RESULT_STRING", result + "");
        startActivity(myIntent);


    }
}
// MAIN2
package com.rishabhjaiswal.intentcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t = findViewById(R.id.textView);
        String val = getIntent().getStringExtra("RESULT_STRING");//Extra(MainActivity.EXTRA_MESSAGE);
        t.setText(val);
        Toast.makeText(this, val, Toast.LENGTH_LONG).show();

    }
}

