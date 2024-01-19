package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<SlideModel> imageList = new ArrayList<>(); // Create image list

// imageList.add(new SlideModel("String Url" or R.drawable))
// imageList.add(new SlideModel("String Url" or R.drawable, "title")); // You can add title

        imageList.add(new SlideModel("https://img.freepik.com/free-vector/flat-design-minimal-technology-facebook-post_23-2149146031.jpg?w=900&t=st=1705670320~exp=1705670920~hmac=b34b78e5516ca666137aab3b1eebdaa444d64f57105053020e712dd9fb75ff9e", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://img.freepik.com/free-vector/mobile-atm-withdrawal-isometric-landing-page_107791-453.jpg?w=900&t=st=1705670623~exp=1705671223~hmac=1b5c87cc1825675d7671377be7ff5e738dbe1683c70043b53f97952d8b224c50",  ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://img.freepik.com/free-vector/secure-payment-landing-page-template_23-2148539266.jpg?w=900&t=st=1705670511~exp=1705671111~hmac=6a05aead308952c1760e65fd918f3650dfa9e10d6dc7abe450ceba7f69a67801", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://img.freepik.com/free-vector/concept-payment-online-banking-credit-card-coffee-cup-electronic-money-dark-neon_39422-885.jpg?w=900&t=st=1705670725~exp=1705671325~hmac=22ec37ecc10253f321359a9451715e289a48cd115a8ef43bf14544ad130a0715", ScaleTypes.CENTER_CROP));

        ImageSlider imageSlider = findViewById(R.id.image_slider);
        imageSlider.setImageList(imageList);

        ImageSlider imageSlider1 = findViewById(R.id.image_slider2);
        imageSlider1.setImageList(imageList);

        textView=findViewById(R.id.marquee_txt);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setSelected(true);
    }
}