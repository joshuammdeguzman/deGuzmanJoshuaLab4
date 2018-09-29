package joshua.deguzman.com.deguzmanjoshualab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toastButton = findViewById(R.id.toastButton);
        Button snackButton = findViewById(R.id.snackButton);
        Button snackButton2 = findViewById(R.id.snackButton2);

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = "Toast!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });

        snackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_layout);
                String message = "Snackbar message!";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);

            }
        });

        snackButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View view = findViewById(R.id.main_layout);
                String message = "Snackbar message 2";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackBar2(view, message, duration);
            }
        });
        }
        public void showSnackbar(View view, String message, int duration){
            Snackbar.make(view, message, duration).show();

        }

        public void showSnackBar2(View view, String message, int duration){
            final Snackbar snackbar = Snackbar.make(view, message, duration);
            snackbar.setAction("Dismiss", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    snackbar.dismiss();
                }
            });
            snackbar.show();
            }
        }
