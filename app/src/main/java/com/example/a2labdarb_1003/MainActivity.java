package com.example.a2labdarb_1003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText editUserInput;
    Button btnCount;

    TextView tvMain;

    TextCounter textCounter;

    Spinner spinSelectionOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editUserInput = findViewById(R.id.editUserInput);
        this.btnCount = findViewById(R.id.btnCount);
        this.tvMain = findViewById(R.id.tvMain);

        this.spinSelectionOptions = (Spinner) findViewById(R.id.spinSelectionOptions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.selection_options,
                android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spinSelectionOptions.setAdapter(adapter);

        textCounter = new TextCounter();
    }

    public void onBtnCountClick(View view) {
        String selectedItem = this.spinSelectionOptions.getSelectedItem().toString();
        if(selectedItem.equalsIgnoreCase("Symbols")){
            int result = TextCounter.countSymbols(this.editUserInput.getText().toString());
            Log.i("CountResult", String.valueOf(result));

            this.tvMain.setText(String.valueOf(result));
        }
        else if(selectedItem.equalsIgnoreCase("Words")){
            int result = textCounter.countWords(this.editUserInput.getText().toString());
            Log.i("CountResult", String.valueOf(result));

            this.tvMain.setText(String.valueOf(result));
        } else{
            Toast.makeText(this, "Not implemented", Toast.LENGTH_LONG).show();
        }
    }
}