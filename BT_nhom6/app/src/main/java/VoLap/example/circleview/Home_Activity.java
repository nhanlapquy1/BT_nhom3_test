package VoLap.example.circleview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

        import com.example.circleview.R;
        import com.google.android.material.bottomnavigation.BottomNavigationView;
public class  Home_Activity extends AppCompatActivity {
Button bt_GiaoDoAn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bt_GiaoDoAn=(Button)findViewById(R.id.bt_GiaoDoAn);
        bt_GiaoDoAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Dis2=new Intent(Home_Activity.this,GiaoDoAn_activity.class);
                startActivity(Dis2);
            }
        });
    }
}
