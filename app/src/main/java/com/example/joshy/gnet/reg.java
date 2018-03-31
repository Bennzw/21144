package com.example.joshy.gnet;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


//REGISTRATGION

public class reg extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    EditText name, email, age, institution, course, password;


    AppCompatButton login;

    // final int REQUEST_CODE_READ_PHONE_STATE = 1;

    ScrollView scrollView;
    Spinner location;

    Button reg;

    String state = "location";
    String cast="Caste";

    String[] states = {"Location", "East Sikkim","west Sikkim","south sikkim","north sikkim"};

    String[] Caste = {"Cast", "Lepchas","Bhutias","Nepalese"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.Email);
        age = (EditText) findViewById(R.id.age);
        password = (EditText) findViewById(R.id.password);
        institution = (EditText) findViewById(R.id.Institution);
        course = (EditText) findViewById(R.id.course);

        location = (Spinner) findViewById(R.id.spinner);
//        Caste=(Spinner)findViewById(R.id.spinner2);
        scrollView = (ScrollView) findViewById(R.id.scrollView);


        reg = (Button) findViewById(R.id.button2);
        reg.setOnClickListener(this);
        location.setOnItemSelectedListener(this);
        loadSpinnerData();
        setAutoScrolling();

    }

    public static class CitizenBean {
        String name;
        String email;
        String age;
        String location;
        String Caste;

        String institution;
        String course;
        String password;

        public CitizenBean(String name, String email, String age, String location,String Caste, String institution,String course,String password) {
            this.name = name;
            this.email = email;
            this.age = age;
            this.location = location;
            this.Caste = Caste;
            this.institution = institution;
            this.course = course;
            this.password = password;
        }

        public String getName() {
            return this.name;
        }

        public void setname(String name) {
            this.name = name;
        }

        public String getemail() {
            return this.email;
        }

        public void setemail(String email) {
            this.email = email;
        }

        public String getage() {
            return this.age;
        }

        public void setage(String age) {
            this.age = age;
        }

        public String getlocation() {
            return this.location;
        }

        public void setlocation(String location) {
            this.location = location;
        }

        public String Caste() {
            return this.Caste;
        }

        public void Caste(String Caste) {
            this.Caste = Caste;
        }


        public String getinstitution() {
            return this.institution;
        }

        public void setinstitution(String institution) {
            this.institution = institution;
        }

        public String getCourse() {
            return this.course;
        }

        public void setCourse(String course) {
            this.institution = course;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    public void setAutoScrolling() {
        name.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                /*if (hasFocus)
                    scrollView.scrollTo(0, 100);*/
            }
        });

        email.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    scrollView.scrollTo(0, 200);
            }
        });


        location.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                    scrollView.scrollTo(0, 400);
            }
        });

    }


    private void loadSpinnerData() {
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, states) {
            @Override
            public boolean isEnabled(int position) {
                return position != 0;
            }

            @Override
            public View getDropDownView(int position, View convertView, ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                //TextView tv = (TextView) view;
                /*if (position == 0) {
                    tv.setTextColor(getResources().getColor(R.color.colorGray));
                } else {
                    tv.setTextColor(getResources().getColor(R.color.colorDarkGray));
                }*/
                return view;
            }
        };
        arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        location.setAdapter(arrayAdapter);
    }

    public boolean isValidEmail(CharSequence target) {
        return !TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }


    private boolean isValidName(String name) {
        String NAME_PATTERN = "[A-Za-z-\\s]*";
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        state = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {


    }

    @Override
    public void onClick(final View v) {


        reg.setOnClickListener(this);
//        if(new View.OnClickListener(this) {
//            @Override
//            public void onClick(View v) {
//
//            }
//        })
//        {
            Intent intent=new Intent(reg.this,LoginActivity.class);
   startActivity(intent);
//        }

//        Caste.setOnItemSelectedListener(this);
//        loadSpinnerData();
//        setAutoScrolling();

        location.setOnItemSelectedListener(this);
        loadSpinnerData();
        setAutoScrolling();

        name.setFilters(new InputFilter[]{
                new InputFilter() {
                    @Override
                    public CharSequence filter(CharSequence cs, int start, int end, Spanned spanned, int dStart, int dEnd) {
                        if (cs.equals("")) {
                            return cs;
                        }
                        if (cs.toString().matches("[a-zA-Z ]+")) {
                            return cs;
                        }
                        return "";
                    }
                }
        });

    }
    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }
}




