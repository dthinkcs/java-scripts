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
