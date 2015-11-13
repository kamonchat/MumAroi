package npru.sangarun.kamonchat.mumaroi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class RestaurList extends AppCompatActivity {
    //Explicit
    private int indexAnInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaur_list);

        //Receive Data
        receiveData();


    }   // Main Method
    private void receiveData() {
        indexAnInt = getIntent().getIntExtra("index", 0);
        Log.d("aoi", "index ==>" + Integer.toString(indexAnInt));
    }
}   // Main Class
