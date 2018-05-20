package com.example.bios.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabs);
        ArrayList<Fragment> fragments = new ArrayList<>();
        ArrayList<String> titles = new ArrayList<>();
        MyFragmentPagerApabter fragmentPagerApabter = new MyFragmentPagerApabter(getSupportFragmentManager(), fragments, titles);
        AboutCairoFragment aboutCairoFragment = new AboutCairoFragment(new FragmentModel("About Cairo", "LOCATION : \nnear the head of the nile river delta egypt northeastern africa\n\nTIME ZONE : \n 2 pm cairo time noon greenwich mean time gmt\n\nELEVATION : \n 194 m 636 ft\n\nLATITUDE AND LONGITUDE : \n 43 40 n 79 22 w\n\nCLIMATE : \ndesert climate with hot summers and mild winters rain is rare and hamsin_dust storms can occur in the spring\n\nMOUNTARY UNITS : \negyptian pounds\n\n"
                + "INTRODUCTION :\nLocated on the banks of the Nile River, Cairo is Africa's largest city, as well as the largest city in the Arab world. In the course of its thousand-year history it has been the capital of the great Egyptian dynasties of the Middle Ages, a British colonial enclave, and a modern industrialized city\n",
                R.drawable.map_of_cairo, 0, 0, R.drawable.background2));
        fragments.add(aboutCairoFragment);
        EltahrirFragment eltahrirFragment = new EltahrirFragment(new FragmentModel("El tahrir Square", "Tahrir Square\n" +
                "(Arabic: ميدان التحرير)\n     " +
                "English: (Liberation Square) \n    " +
                "is a major public town square in Downtown Cairo, Egypt. The square has been the location and focus for political demonstrations in Cairo, most notably those that led to the 2011 Egyptian revolution and the resignation of President",
                R.drawable.tahrirsquare, R.drawable.a800px_tahrir_square___february_9__2011, R.drawable.a____________, R.drawable.a80060));
        fragments.add(eltahrirFragment);
        ALazharFragment aLazharFragment = new ALazharFragment(new FragmentModel("Alazhar", "The mosque and university are named in honor of Fatima Az-Zahraa, the daughter of Muhammad, from whom the Fatimid Dynasty claimed descent. The mosque was built in two years beginning in 971 AD. The school of theology (madrassa) connected with it was founded in 988 as an Ismaili Shia school, but it later became a Sunni school, which it remains to this day. It claims to be the oldest Islamic university in the world",
                R.drawable.cairo___islamic, 0, 0, R.drawable.aazhar1));
        fragments.add(aLazharFragment);
        ThePyramidsFragment thePyramidsFragment = new ThePyramidsFragment(new FragmentModel("The Pyramids of Giza", "The ancient Egyptians built Giza pyramids as tombs for the pharaohs and their queens. They believed that when a pharaoh died he became Osiris, the king of the dead. They believed that for the dead pharaoh to carry out his duties as king of the dead his ka. Then they mummified their bodies and keep things that they will need them in the afterlife. It Known as ‘mr’ or ‘mir’ by the Egyptians. It starts to build During the third and fourth dynasties of the Old Kingdom, more than 4,000 years later. There are many different shapes and sizes from before the beginning of the Old Kingdom to the end of the Middle Kingdom. It Built during a time when Egypt was one of the richest and most powerful civilizations in the world. there are about 100 pyramids have been discovered in Egypt.",
                R.drawable.private_tour_giza_pyramids_and_sphinx_in_cairo_124917, R.drawable.pyramids_of_giza, R.drawable.egypt_pyramids_of_giza_great_pyramid_with_tomb_of_senegemib_inti_in_front, R.drawable.egypt_cairo_pyramids_of_giza_and_camels_2));
        fragments.add(thePyramidsFragment);
        titles.add("About ");
        titles.add("Eltahrir ");
        titles.add("Alazhar ");
        titles.add("The Pyramids");
        viewPager.setAdapter(fragmentPagerApabter);
        tabLayout.setupWithViewPager(viewPager);
        /* switch (position) {
            case 0:
                view= LayoutInflater.from(context).inflate(R.layout.aboutfragment_layout,null);
                break;
            case 1:
                basic.setText("El tahrir Square ");
                content.setText("Tahrir Square\\\n" +
                        "(Arabic: ميدان التحرير)\\\n" +
                        "English: (Liberation Square)\\\n" +
                        "is a major public town square in Downtown Cairo, Egypt. The square has been the location and focus for political demonstrations in Cairo, most notably those that led to the 2011 Egyptian revolution and the resignation of President");
                String text = content.getText().toString().replace("\\\n", System.getProperty("line.separator"));
                content.setText(text);
                imageView1.setImageResource(R.drawable.tahrirsquare);
                imageView2.setImageResource(R.drawable.a800px_tahrir_square___february_9__2011);
                imageView3.setImageResource(R.drawable.a____________);
                background.setImageResource(R.drawable.a80060);
                break;
            case 2:
                basic.setText(" Alazhar ");
                content.setText("The mosque and university are named in honor of Fatima Az-Zahraa, the daughter of Muhammad, from whom the Fatimid Dynasty claimed descent. The mosque was built in two years beginning in 971 AD. The school of theology (madrassa) connected with it was founded in 988 as an Ismaili Shia school, but it later became a Sunni school, which it remains to this day. It claims to be the oldest Islamic university in the world");
                String text1 = content.getText().toString().replace("\\\n", System.getProperty("line.separator"));
                content.setText(text1);
                imageView1.setImageResource(R.drawable.cairo___islamic);
                background.setImageResource(R.drawable.aazhar1);
                ((ViewManager)imageView2.getParent()).removeView(imageView2);
                ((ViewManager)imageView3.getParent()).removeView(imageView3);
                break;
            case 3:
                basic.setText("Pyramids of giza ");
                content.setText("The ancient Egyptians built Giza pyramids as tombs for the pharaohs and their queens. They believed that when a pharaoh died he became Osiris, the king of the dead. They believed that for the dead pharaoh to carry out his duties as king of the dead his ka. Then they mummified their bodies and keep things that they will need them in the afterlife. It Known as ‘mr’ or ‘mir’ by the Egyptians. It starts to build During the third and fourth dynasties of the Old Kingdom, more than 4,000 years later. There are many different shapes and sizes from before the beginning of the Old Kingdom to the end of the Middle Kingdom. It Built during a time when Egypt was one of the richest and most powerful civilizations in the world. there are about 100 pyramids have been discovered in Egypt.");
                String text2 = content.getText().toString().replace("\\\n", System.getProperty("line.separator"));
                content.setText(text2);
                imageView1.setImageResource(R.drawable.private_tour_giza_pyramids_and_sphinx_in_cairo_124917);
                imageView2.setImageResource(R.drawable.pyramids_of_giza);
                imageView3.setImageResource(R.drawable.egypt_pyramids_of_giza_great_pyramid_with_tomb_of_senegemib_inti_in_front);
                background.setImageResource(R.drawable.egypt_cairo_pyramids_of_giza_and_camels_2);
                break;
            default:

        }*/

    }
}
