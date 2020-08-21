package com.fadhilah.assetku;

/*public class User extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }
}*/

public class User {
    public String id;
    public String userName;
    public String email;
    public String password;

    public User(String id, String userName, String email, String password) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

}