package com.example.laundry.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;

import com.example.laundry.R;
import com.example.laundry.adapter.Imageslideingadapter;
import com.example.laundry.models.Imageslideitemmodel;
import com.example.laundry.models.Itemlist;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomefragmentFragment extends Fragment {
    private ViewPager2 viewPager2;
    private List<Imageslideitemmodel> imagelist;
    private List<Itemlist> itemlist;
    private View view;


    public HomefragmentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view= inflater.inflate(R.layout.fragment_homefragment, container, false);
        viewPager2=view.findViewById(R.id.imageslideviewpagerid);
        imagelist=new ArrayList<>();
        imagelist.add(new Imageslideitemmodel(R.drawable.splashimage));
        imagelist.add(new Imageslideitemmodel(R.drawable.splashimage));
        imagelist.add(new Imageslideitemmodel(R.drawable.splashimage));
        imagelist.add(new Imageslideitemmodel(R.drawable.splashimage));

        itemlist.add(new Itemlist(R.drawable.splashimage,"Shirt",8));
        itemlist.add(new Itemlist(R.drawable.splashimage,"pant",8));
        itemlist.add(new Itemlist(R.drawable.splashimage,"payjama",8));
        itemlist.add(new Itemlist(R.drawable.splashimage,"panjabi",8));
        itemlist.add(new Itemlist(R.drawable.splashimage,"fotua",8));
        itemlist.add(new Itemlist(R.drawable.splashimage,"jeans pant",8));
        itemlist.add(new Itemlist(R.drawable.splashimage,"towel",8));
        itemlist.add(new Itemlist(R.drawable.splashimage,"jeans shirt",8));
        itemlist.add(new Itemlist(R.drawable.splashimage,"tshirt",8));

        Imageslideingadapter adapter=new Imageslideingadapter(getContext(),imagelist);
//        Display display = getActivity().getWindowManager().getDefaultDisplay();
//        float width = display.getWidth();
//        TranslateAnimation animation = new TranslateAnimation(0, width - 50, 0, 0); // new TranslateAnimation(xFrom,xTo, yFrom,yTo)
//        animation.setDuration(1000); // animation duration
//        animation.setRepeatCount(5); // animation repeat count
//        animation.setRepeatMode(2); // repeat animation (left to right, right to
        // left )
        // animation.setFillAfter(true)
//        viewPager2.setClickable(false);
//        viewPager2.setClipToPadding(false);
//        viewPager2.setClipChildren(false);

//        viewPager2.setOffscreenPageLimit(imagelist.size());
//      CompositePageTransformer compositePageTransformer=new CompositePageTransformer();
////        compositePageTransformer.addTransformer(new MarginPageTransformer(10));
//        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
//            @Override
//            public void transformPage(@NonNull View page, float position) {
//                float r=1-Math.abs(position);
//                page.setScaleY(0.20f * 0.25f );
//            }
//
//        });
//        viewPager2.setPageTransformer(compositePageTransformer);
        viewPager2.setAdapter(adapter);


        return view;
    }
}
