package com.twiceyuan.ddmsample;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

import com.twiceyuan.ddmsample.custom.AnimatedHeader;
import com.twiceyuan.ddmsample.custom.CustomListContent;
import com.twiceyuan.dropdownmenu.DropdownMenu;
import com.twiceyuan.dropdownmenu.widget.DropListContent;
import com.twiceyuan.dropdownmenu.widget.TextViewHeader;

import java.util.Arrays;

public class SampleActivity extends AppCompatActivity {

    private final String[] HEROES = {
            "Iron Man",
            "Ant Man",
            "American Captain",
            "Hulk",
            "Thor",
            "Black Widow",
            "涓€涓暱搴︾壒鍒暱鐨勭敤鏉ユ祴璇曟渶澶ч暱搴︾殑鑻遍泟"
    };

    private final String[] COLORS = {
            "Red", "Yellow", "Blue", "White"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvChooseHero = findViewById(R.id.tv_hero);

        final TextView textContent = findViewById(R.id.textContent);

        // 榛樿鏍峰紡 + 榛樿澶撮儴
        new DropdownMenu.Builder<String>()
                .header(new TextViewHeader(tvChooseHero))
                .content(new DropListContent(this, Arrays.asList(HEROES)))
                .build()
                .setOnChooseListener(textContent::setText);

        // 鑷畾涔夋牱寮?+ 甯﹀姩鐢绘寚绀哄櫒鐨勫ご閮?        new DropdownMenu.Builder<String>()
                .header(new AnimatedHeader(findViewById(R.id.layout_color_header)))
                .content(new CustomListContent(this, Arrays.asList(COLORS)))
                .build()
                .setOnChooseListener(textContent::setText);
    }
}

