package javalayout.piyushmittal.com.javalayout;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class JavaLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button btn = new Button(this);
        RelativeLayout.LayoutParams buttonpress = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        buttonpress.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonpress.addRule(RelativeLayout.CENTER_VERTICAL);
        btn.setText("Press Me");
        btn.setBackgroundColor(Color.YELLOW);
        btn.setId(R.id.myButtonId);

        EditText et = new EditText(this);
        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, r.getDisplayMetrics());
        et.setWidth(px);
        RelativeLayout.LayoutParams editText = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        editText.addRule(RelativeLayout.CENTER_HORIZONTAL);
        editText.addRule(RelativeLayout.ABOVE, btn.getId());
        editText.setMargins(0, 0, 0, 80);
        et.setId(R.id.myEditTextId);

        RelativeLayout rl = new RelativeLayout(this);
        rl.setBackgroundColor(Color.BLUE);
        rl.addView(btn, buttonpress);
        rl.addView(et, editText);
        setContentView(rl);
      //  setContentView(R.layout.activity_java_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_java_layout, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
