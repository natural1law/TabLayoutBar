package com.androidx.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.androidx.ui.fragment.One1Fragment;
import com.androidx.ui.fragment.OneFragment;
import com.androidx.ui.fragment.Three1Fragment;
import com.androidx.ui.fragment.ThreeFragment;
import com.androidx.ui.fragment.Tow1Fragment;
import com.androidx.ui.fragment.TowFragment;
import com.androidx.ui.layout.CommonTabLayout;
import com.androidx.ui.use.TabLayoutBar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

@SuppressLint("NonConstantResourceId")
public class CommonTabActivity extends AppCompatActivity {

    @BindView(R.id.common1)
    public CommonTabLayout commonTabLayout1;
    @BindView(R.id.common2)
    public CommonTabLayout commonTabLayout2;
    @BindView(R.id.common3)
    public CommonTabLayout commonTabLayout3;
    @BindView(R.id.common4)
    public CommonTabLayout commonTabLayout4;
    @BindView(R.id.common5)
    public CommonTabLayout commonTabLayout5;
    @BindView(R.id.common6)
    public CommonTabLayout commonTabLayout6;
    @BindView(R.id.common7)
    public CommonTabLayout commonTabLayout7;
    @BindView(R.id.common8)
    public CommonTabLayout commonTabLayout8;
    @BindView(R.id.common_vp2)
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

    private final int[] unselectedIcon = {R.mipmap.tab_home_unselect, R.mipmap.tab_speech_unselect, R.mipmap.tab_contact_unselect};
    private final int[] selectedIcon = {R.mipmap.tab_home_select, R.mipmap.tab_speech_select, R.mipmap.tab_contact_select};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_tab);
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
    }

    @SuppressLint("ResourceType")
    private void initView() {
        tab1 = TabLayoutBar.builder()
                .setActivity(activity)
                .setTabLayout(commonTabLayout1)
                .setUnselectedIcon(unselectedIcon)
                .setPitchOnIcon(selectedIcon)
                .setContainerViewId(R.id.common_fl)
                .setTitles(new String[]{"首页1", "消息1", "我的1"})
                .setFragments(new Fragment[]{new One1Fragment(), new Tow1Fragment(), new Three1Fragment()})
                .initBuild();
        tab1.execute();

        tab2 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setPitchOnIcon(selectedIcon)
                .setTabLayout(commonTabLayout2)
                .setUnselectedIcon(unselectedIcon)
                .setTitles(new String[]{"首页2", "消息2", "我的2"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab2.execute();

        tab3 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(commonTabLayout3)
                .setUnselectedIcon(unselectedIcon)
                .setPitchOnIcon(selectedIcon)
                .setTitles(new String[]{"首页3", "消息3", "我的3"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab3.execute();

        tab4 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(commonTabLayout4)
                .setUnselectedIcon(unselectedIcon)
                .setPitchOnIcon(selectedIcon)
                .setTitles(new String[]{"首页4", "消息4", "我的4"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab4.execute();

        tab5 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(commonTabLayout5)
                .setUnselectedIcon(unselectedIcon)
                .setPitchOnIcon(selectedIcon)
                .setTitles(new String[]{"首页5", "消息5", "我的5"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab5.execute();

        tab6 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(commonTabLayout6)
                .setUnselectedIcon(unselectedIcon)
                .setPitchOnIcon(selectedIcon)
                .setTitles(new String[]{"首页6", "消息6", "我的6"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab6.execute();

        tab7 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(commonTabLayout7)
                .setUnselectedIcon(unselectedIcon)
                .setPitchOnIcon(selectedIcon)
                .setTitles(new String[]{"首页7", "消息7", "我的7"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab7.execute();

        tab8 = TabLayoutBar.builder()
                .setActivity(activity)
                .setViewPager2(viewPager2)
                .setTabLayout(commonTabLayout8)
                .setUnselectedIcon(unselectedIcon)
                .setPitchOnIcon(selectedIcon)
                .setTitles(new String[]{"首页8", "消息8", "我的8"})
                .setFragments(new Fragment[]{new OneFragment(), new TowFragment(), new ThreeFragment()})
                .initBuild();
        tab8.execute();
    }

}
