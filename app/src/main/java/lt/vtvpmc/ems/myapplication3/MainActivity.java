package lt.vtvpmc.ems.myapplication3;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {

    private ImageView imageViewOne;
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewOne = (ImageView) findViewById(R.id.imageViewOne);
        buttonOne = (Button) findViewById(R.id.buttonOne);
        buttonTwo = (Button) findViewById(R.id.buttonTwo);
        buttonThree = (Button) findViewById(R.id.buttonThree);
    }

    public  void clickButton(View view){
        switch(view.getId()){
            case R.id.buttonOne:
                imageViewOne.setImageResource(R.drawable.red);
                break;
            case R.id.buttonTwo:
                imageViewOne.setImageResource(R.drawable.green);
                break;

            case R.id.buttonThree:
                imageViewOne.setImageResource(R.drawable.blue);
                break;

        }
    }
}
