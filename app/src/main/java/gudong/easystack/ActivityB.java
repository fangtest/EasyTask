package gudong.easystack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by fangtest on 15-7-19.
 */
public class ActivityB extends Activity {

    TextView tv;
    Button btn;


    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String s = "onNewTntent " + ActivityB.class.getName() + getTaskId();
        tv.setText(s);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        tv.setText(ActivityB.class.getName() + getTaskId());


        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityB.this, ActivityC.class);
                startActivity(intent);
            }
        });
    }
}
