package com.example.as_lesson1;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Theme_choice_code extends AppCompatActivity {
    //Имя настроек
    private static final String SwitchTheme = "SWITCH_THEME";

    // Имя параметра в настройках
    protected static final String AppTheme = "APP_THEME";
    protected static final int PersonalLight = 0;
    protected static final int PersonalDark = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Устанавливать тему надо только до установки макета активити
        setTheme(getAppTheme(R.style.Theme_AS_lesson1));
    }

    protected int getCodeStyle(int codeStyle) {
        SharedPreferences sharedPreferences = getSharedPreferences(SwitchTheme, MODE_PRIVATE);
        return sharedPreferences.getInt(AppTheme, codeStyle);
    }

    protected void setAppTheme(int codeStyle) {
        SharedPreferences sharedPreferences = getSharedPreferences(SwitchTheme, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(AppTheme, codeStyle);
        editor.apply();
    }

    protected int getAppTheme(int codeStyle) {
        return codeStyleToStyleId(getCodeStyle(codeStyle));
    }

    private int codeStyleToStyleId(int codeStyle) {
        switch (codeStyle) {
            case PersonalLight:
                return R.style.PersonalLight;
            case PersonalDark:
                return R.style.PersonalDark;
            default:
                return R.style.Theme_AS_lesson1;
        }
    }
}
