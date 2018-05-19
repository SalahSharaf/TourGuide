package com.example.bios.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyFragmentPagerApabter extends PagerAdapter {
    ArrayList<String> titles = new ArrayList<>();
    ArrayList<String> basics = new ArrayList<>();
    ArrayList<String> about = new ArrayList<>();
   // ArrayList<Integer> picture1 = new ArrayList<>();
   // ArrayList<Integer> picture2 = new ArrayList<>();
   // ArrayList<Integer> picture3 = new ArrayList<>();
    Context context;

    public MyFragmentPagerApabter(Context context) {
        this.context = context;
    }

    public void addFragment(String title) {
        titles.add(title);
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.thepyramidsfragment_layout, null);
        TextView basic = view.findViewById(R.id.basic);
        TextView content = view.findViewById(R.id.content);
        ImageView imageView1, imageView2, imageView3,background;
        imageView1 = view.findViewById(R.id.picture1);
        imageView2 = view.findViewById(R.id.picture2);
        imageView3 = view.findViewById(R.id.picture3);
        background=view.findViewById(R.id.background);
        switch (position) {
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
                imageView1.setImageResource(R.drawable.a24cacf9f75dccd65e31dcacbe7093981);
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

        }
        container.addView(view);
        return view;
    }
}
