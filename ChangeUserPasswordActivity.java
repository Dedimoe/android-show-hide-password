package net.dedim.myApp1;

/**
 * The Functions created by Dedimoe on 05/05/19.
 */

public class ChangeUserPasswordActivity extends BaseActivity {

    EditText Password_old;
    EditText Password_new;
    EditText Password_new2;
    CheckBox ShowPassword;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setHomepageBarColor();
        setContentView(R.layout.activity_change_user_password);

        this.setupView();
    }

    private void setupView() {
        Password_old = (EditText) findViewById(R.id.Password_old);
        Password_new = (EditText) findViewById(R.id.Password_new);
        Password_new2 = (EditText) findViewById(R.id.Password_new2);
        
        //show or hide password text
        ShowPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean value) {
                if (value)
                {
                    // Show Password
                    Password_old.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    Password_new.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    Password_new2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else
                {
                    // Hide Password
                    Password_old.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    Password_new.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    Password_new2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });
    }
    
}
