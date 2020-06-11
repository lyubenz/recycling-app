
package com.example.android.tflitecamerademo;

import android.os.Bundle;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/** Main {@code Activity} class for the Camera app. */
public class CameraActivity extends AppCompatActivity {

  TabLayout mTabLayout;
  ViewPager mViewPager;
  FragmentTabs mFragmentTabs;
  TabItem tab1, tab2, tab3;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_camera);

    mTabLayout = findViewById(R.id.tabs);
    mViewPager = findViewById(R.id.view_pager);

    tab1 = findViewById(R.id.Tab1);
    tab2 = findViewById(R.id.Tab2);
    tab3 = findViewById(R.id.Tab3);

    mFragmentTabs = new FragmentTabs(getFragmentManager());
    mViewPager.setAdapter(mFragmentTabs);
    mTabLayout.setupWithViewPager(mViewPager);

  }
}
