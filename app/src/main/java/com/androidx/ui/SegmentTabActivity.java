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
import com.androidx.ui.layout.SegmentTabLayout;
import com.androidx.ui.use.TabLayoutBar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

@SuppressLint("NonConstantResourceId")
public class SegmentTabActivity extends AppCompatActivity {

    @BindView(R.id.tl_1)
    public SegmentTabLayout segmentTabLayout1;
    @BindView(R.id.tl_2)
    public SegmentTabLayout segmentTabLayout2;
    @BindView(R.id.tl_3)
    public SegmentTabLayout segmentTabLayout3;
    @BindView(R.id.tl_4)
    public SegmentTabLayout segmentTabLayout4;
    @BindView(R.id.tl_5)
    public SegmentTabLayout segmentTabLayout5;
    @BindView(R.id.vp_2)
    public ViewPager2 viewPager2;

    private Unbinder unbinder;
    private final AppCompatActivity activity = this;
    private TabLayoutBar tab1;
    private TabLayoutBar tab2;
    private TabLayoutBar tab3;
    private TabLayoutBar tab4;
    private TabLayoutBar tab5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segment_tab);
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
    }

    private void initView() {
        tab1 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(segmentTabLayout1)
                .setTitles(new String[]{"首页1", "消息1", "我的1"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab1.execute();
        tab2 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(segmentTabLayout2)
                .setTitles(new String[]{"首页2", "消息2", "我的2"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab2.execute();
        tab3 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(segmentTabLayout3)
                .setTitles(new String[]{"首页3", "消息3", "我的3"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab3.execute();
        tab4 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(segmentTabLayout4)
                .setTitles(new String[]{"首页4", "消息4", "我的4"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab4.execute();
        tab5 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(segmentTabLayout5)
                .setTitles(new String[]{"首页5", "消息5", "我的5"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab5.execute();
    }
}
