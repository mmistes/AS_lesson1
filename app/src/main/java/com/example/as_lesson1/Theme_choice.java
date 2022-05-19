package com.example.as_lesson1;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import com.google.android.material.radiobutton.MaterialRadioButton;



public class Theme_choice extends Theme_choice_code {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTheme(getAppTheme(R.style.Theme_AS_lesson1));

        setContentView(R.layout.activity_theme_choice);
        initThemeChooser();

    }

    private void initThemeChooser() {
        initRadioButton(findViewById(R.id.theme_choice_light), PersonalLight);
        initRadioButton(findViewById(R.id.theme_choice_dark), PersonalDark);

        RadioGroup rg = findViewById(R.id.radioButtons);
        ((MaterialRadioButton) rg.getChildAt(getCodeStyle(PersonalLight))).setChecked(true);

    }

    private void initRadioButton(View button, final int codeStyle) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // сохраним настройки
                setAppTheme(codeStyle);
                // пересоздадим активити, чтобы тема применилась
                recreate();
            }
        });
    }


    public void Back_click(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}