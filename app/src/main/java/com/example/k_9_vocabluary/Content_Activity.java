package com.example.k_9_vocabluary;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Content_Activity  extends AppCompatActivity {

    private TextView zagolovok;
    private TextView charakteristik;
    private TextView history;
    private TextView character;
    private TextView using;
    private TextView povadki;
    private TextView plus_minus;
    private ImageView title;
    private ImageView second;
    private int category;
    private int position;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_content);
        zagolovok = findViewById(R.id.zagolovok);
        charakteristik = findViewById(R.id.characteristiki);
        history = findViewById(R.id.history);
        character = findViewById(R.id.character);
        using = findViewById(R.id.using);
        povadki = findViewById(R.id.povadki);
        plus_minus = findViewById(R.id.plus_minus);
        title = findViewById(R.id.main_photo);
        second = findViewById(R.id.second_photo);
        reciveIntent();
    }

    private void reciveIntent() {
        Intent i = getIntent();
        if (i != null)
        {
            category = i.getIntExtra("category", 0);
            position = i.getIntExtra("position", 0);
        }
        switch (category)
        {
            case 1:

                break;
            case 2:
                switch (position)
                {
                    case 0:
                        zagolovok.setText(R.string.australian_tittle);
                        charakteristik.setText(R.string.australian_characteristics);
                        history.setText(R.string.australian_history);
                        character.setText(R.string.australian_character);
                        using.setText(R.string.australian_using);
                        povadki.setText(R.string.australian_povadki);
                        plus_minus.setText(R.string.australian_plus_minus);
                        title.setImageResource(R.drawable.austral_main);
                        second.setImageResource(R.drawable.austral_second);
                        break;
                    case 1:
                        zagolovok.setText(R.string.staff_tittle);
                        charakteristik.setText(R.string.staff_characteristics);
                        history.setText(R.string.staff_history);
                        character.setText(R.string.staff_character);
                        using.setText(R.string.staff_using);
                        povadki.setText(R.string.staff_povadki);
                        plus_minus.setText(R.string.staff_plus_minus);
                        title.setImageResource(R.drawable.staf_main);
                        second.setImageResource(R.drawable.staf_second);
                        break;
                    case 2:
                        zagolovok.setText(R.string.belgian_tittle);
                        charakteristik.setText(R.string.belgian_characteristics);
                        history.setText(R.string.belgian_history);
                        character.setText(R.string.belgian_character);
                        using.setText(R.string.belgian_using);
                        povadki.setText(R.string.belgian_povadki);
                        plus_minus.setText(R.string.belgian_plus_minus);
                        title.setImageResource(R.drawable.belgian_main);
                        second.setImageResource(R.drawable.belgian_second);
                        break;
                    case 3:
                        zagolovok.setText(R.string.boxer_tittle);
                        charakteristik.setText(R.string.boxer_characteristics);
                        history.setText(R.string.boxer_history);
                        character.setText(R.string.boxer_character);
                        using.setText(R.string.boxer_using);
                        povadki.setText(R.string.boxer_povadki);
                        plus_minus.setText(R.string.boxer_plus_minus);
                        title.setImageResource(R.drawable.boxer_main);
                        second.setImageResource(R.drawable.boxer_second);
                        break;
                    case 4:
                        zagolovok.setText(R.string.border_tittle);
                        charakteristik.setText(R.string.border_characteristics);
                        history.setText(R.string.border_history);
                        character.setText(R.string.border_character);
                        using.setText(R.string.border_using);
                        povadki.setText(R.string.border_povadki);
                        plus_minus.setText(R.string.border_plus_minus);
                        title.setImageResource(R.drawable.border_main);
                        second.setImageResource(R.drawable.border_second);
                        break;
                    case 5:
                        zagolovok.setText(R.string.bull_tittle);
                        charakteristik.setText(R.string.bull_characteristics);
                        history.setText(R.string.bull_history);
                        character.setText(R.string.bull_character);
                        using.setText(R.string.bull_using);
                        povadki.setText(R.string.bull_povadki);
                        plus_minus.setText(R.string.bull_plus_minus);
                        title.setImageResource(R.drawable.bull_main);
                        second.setImageResource(R.drawable.bull_second);
                        break;
                    case 6:
                        zagolovok.setText(R.string.european_tittle);
                        charakteristik.setText(R.string.european_characteristics);
                        history.setText(R.string.european_history);
                        character.setText(R.string.european_character);
                        using.setText(R.string.european_using);
                        povadki.setText(R.string.european_povadki);
                        plus_minus.setText(R.string.european_plus_minus);
                        title.setImageResource(R.drawable.european_main);
                        second.setImageResource(R.drawable.european_second);
                        break;
                    case 7:
                        zagolovok.setText(R.string.dober_tittle);
                        charakteristik.setText(R.string.dober_characteristics);
                        history.setText(R.string.dober_history);
                        character.setText(R.string.dober_character);
                        using.setText(R.string.dober_using);
                        povadki.setText(R.string.dober_povadki);
                        plus_minus.setText(R.string.dober_plus_minus);
                        title.setImageResource(R.drawable.doberman_main);
                        second.setImageResource(R.drawable.doberman_second);
                        break;
                    case 8:
                        zagolovok.setText(R.string.golden_tittle);
                        charakteristik.setText(R.string.golden_characteristics);
                        history.setText(R.string.golden_history);
                        character.setText(R.string.golden_character);
                        using.setText(R.string.golden_using);
                        povadki.setText(R.string.golden_povadki);
                        plus_minus.setText(R.string.golden_plus_minus);
                        title.setImageResource(R.drawable.golden_main);
                        second.setImageResource(R.drawable.golden_second);
                        break;
                    case 9:
                        zagolovok.setText(R.string.german_title);
                        charakteristik.setText(R.string.german_charakteristics);
                        history.setText(R.string.german_history);
                        character.setText(R.string.german_charakter);
                        using.setText(R.string.german_using);
                        povadki.setText(R.string.german_povadki);
                        plus_minus.setText(R.string.german_plus_minus);
                        title.setImageResource(R.drawable.german);
                        second.setImageResource(R.drawable.german_second);
                        break;
                    case 10:
                        zagolovok.setText(R.string.terier_tittle);
                        charakteristik.setText(R.string.terier_characteristics);
                        history.setText(R.string.terier_history);
                        character.setText(R.string.terier_character);
                        using.setText(R.string.terier_using);
                        povadki.setText(R.string.terier_povadki);
                        plus_minus.setText(R.string.terier_plus_minus);
                        title.setImageResource(R.drawable.terier_main);
                        second.setImageResource(R.drawable.terier_second);
                        break;
                }
                break;
            case 3:

                break;
        }
    }
}
