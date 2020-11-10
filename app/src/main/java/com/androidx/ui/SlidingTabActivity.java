package com.androidx.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.androidx.ui.fragment.OneFragment;
import com.androidx.ui.fragment.ThreeFragment;
import com.androidx.ui.fragment.TowFragment;
import com.androidx.ui.layout.SlidingTabLayout;
import com.androidx.ui.use.TabLayoutBar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

@SuppressLint("NonConstantResourceId")
public class SlidingTabActivity extends AppCompatActivity {

    @BindView(R.id.sliding1)
    public SlidingTabLayout slidingTabLayout1;
    @BindView(R.id.sliding2)
    public SlidingTabLayout slidingTabLayout2;
    @BindView(R.id.sliding3)
    public SlidingTabLayout slidingTabLayout3;
    @BindView(R.id.sliding4)
    public SlidingTabLayout slidingTabLayout4;
    @BindView(R.id.sliding5)
    public SlidingTabLayout slidingTabLayout5;
    @BindView(R.id.sliding6)
    public SlidingTabLayout slidingTabLayout6;
    @BindView(R.id.sliding7)
    public SlidingTabLayout slidingTabLayout7;
    @BindView(R.id.sliding8)
    public SlidingTabLayout slidingTabLayout8;
    @BindView(R.id.sliding9)
    public SlidingTabLayout slidingTabLayout9;
    @BindView(R.id.sliding10)
    public SlidingTabLayout slidingTabLayout10;
    @BindView(R.id.vp2)
    public ViewPager2 viewPager2;

    private Unbinder unbinder;
    private final AppCompatActivity activity = this;
    private TabLayoutBar tab1;
    private TabLayoutBar tab2;
    private TabLayoutBar tab3;
    private TabLayoutBar tab4;
    private TabLayoutBar tab5;
    private TabLayoutBar tab6;
    private TabLayoutBar tab7;
    private TabLayoutBar tab8;
    private TabLayoutBar tab9;
    private TabLayoutBar tab10;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_tab);
        unbinder = ButterKnife.bind(activity);
        initView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        tab1.destroy();
        tab2.destroy();
        tab3.destroy();
        tab4.destroy();
        tab5.destroy();
        tab6.destroy();
        tab7.destroy();
        tab8.destroy();
        tab9.destroy();
        tab10.destroy();
    }

    private void initView() {
        tab1 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(slidingTabLayout1)
                .setTitles(new String[]{"首页1", "消息1", "我的1"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab1.execute();
        tab2 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(slidingTabLayout2)
                .setTitles(new String[]{"首页2", "消息2", "我的2"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab2.execute();
        tab3 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(slidingTabLayout3)
                .setTitles(new String[]{"首页3", "消息3", "我的3"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab3.execute();
        tab4 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(slidingTabLayout4)
                .setTitles(new String[]{"首页4", "消息4", "我的4"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab4.execute();
        tab5 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(slidingTabLayout5)
                .setTitles(new String[]{"首页5", "消息5", "我的5"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab5.execute();
        tab6 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(slidingTabLayout6)
                .setTitles(new String[]{"首页6", "消息6", "我的6"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab6.execute();
        tab7 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(slidingTabLayout7)
                .setTitles(new String[]{"首页7", "消息7", "我的7"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab7.execute();
        tab8 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(slidingTabLayout8)
                .setTitles(new String[]{"首页8", "消息8", "我的8"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab8.execute();
        tab9 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(slidingTabLayout9)
                .setTitles(new String[]{"首页9", "消息9", "我的9"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab9.execute();
        tab10 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(slidingTabLayout10)
                .setTitles(new String[]{"首页10", "消息10", "我的10"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab10.execute();
    }
}
