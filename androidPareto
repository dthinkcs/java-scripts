//using Color
view1.setBackgroundColor(Color.argb(255,0,255,0));


//using CheckBox
View checkBox= findViewById(R.id.checkBoxItem1);

//using Intent
public static final String EXTRA_MESSAGE = "com.example.abhishek.lab2q1.MESSAGE";
Intent myIntent = new Intent(this, Main2Activity.class);
myIntent.putExtra(EXTRA_MESSAGE, itemList);
startActivity(myIntent);

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
