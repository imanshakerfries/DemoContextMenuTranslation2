package sg.edu.rp.c346.id21014919.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvRegisteredText, tvRegisteredText2;
    String wordClicked = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvRegisteredText = findViewById(R.id.tvRegisteredText);
        tvRegisteredText2 = findViewById(R.id.tvRegisteredText2);

        registerForContextMenu(tvRegisteredText);
        registerForContextMenu(tvRegisteredText2);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_main, menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            tvRegisteredText.setText("Hello ");
            tvRegisteredText2.setText("Bye ");
            return true;
        } else if (id == R.id.italianSelection) {
            tvRegisteredText.setText("Ciao");
            tvRegisteredText2.setText("Addio ");
            return true;
        } else {
            tvRegisteredText.setText("Error translation");
        }


        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }


}