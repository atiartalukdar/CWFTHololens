package info.androidhive.tabsswipe;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Aboutus extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        ActionBar ab = getActionBar();
        ab.setTitle("About us");
        ab.setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            // action with ID action_refresh was selected
            case R.id.send_data:
                Intent intent = new Intent(Aboutus.this, SentDataToEarth.class);
                startActivity(intent);;
                break;
            // action with ID action_settings was selected
            case R.id.aboutus:
                Intent intent1 = new Intent(Aboutus.this, Aboutus.class);
                startActivity(intent1);
                break;
            default:
                break;
        }

        return true;
    }
}
