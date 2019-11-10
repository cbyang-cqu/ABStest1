package com.patac.abstest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

    public class MainActivity1 extends Activity {
        /*设置spinner系统自带的字体颜色，预设变量*/
        private Spinner mSpinner;
        private ArrayAdapter<String> mAdapter ;
        private String [] mStringArray;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main1);
            init11();
            init12();
            init21();
            init31();
            init32();
            init33();
            init41();
            init42();
        }

       /* 跳转至阅读操作指南界面*/
        public void OnNext(View v){
            startActivity(new Intent(com.patac.abstest.MainActivity1.this,TestActivity.class));
        }

        /*初始化，引入相关*/
        private void init11(){
            mSpinner=(Spinner) findViewById(R.id.spinner_carBrand);
            mStringArray=getResources().getStringArray(R.array.carBrand_array);
            //使用自定义的ArrayAdapter
            mAdapter = new TestArrayAdapter(MainActivity1.this,mStringArray);

            //设置下拉列表风格(这句不些也行)
            mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            mSpinner.setAdapter(mAdapter);

            //监听Item选中事件
            mSpinner.setOnItemSelectedListener(new ItemSelectedListenerImpl());

        }
        private void init12(){
            mSpinner=(Spinner) findViewById(R.id.spinner_carNum);
            mStringArray=getResources().getStringArray(R.array.carBrand_num);
            //使用自定义的ArrayAdapter
            mAdapter = new TestArrayAdapter(MainActivity1.this,mStringArray);

            //设置下拉列表风格(这句不些也行)
            mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            mSpinner.setAdapter(mAdapter);

            //监听Item选中事件
            mSpinner.setOnItemSelectedListener(new ItemSelectedListenerImpl());

        }
        private void init21(){
            mSpinner=(Spinner) findViewById(R.id.spinner_place);
            mStringArray=getResources().getStringArray(R.array.place);
            //使用自定义的ArrayAdapter
            mAdapter = new TestArrayAdapter(MainActivity1.this,mStringArray);

            //设置下拉列表风格(这句不些也行)
            mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            mSpinner.setAdapter(mAdapter);

            //监听Item选中事件
            mSpinner.setOnItemSelectedListener(new ItemSelectedListenerImpl());

        }
        private void init31(){
            mSpinner=(Spinner) findViewById(R.id.spinner_year);
            mStringArray=getResources().getStringArray(R.array.year);
            //使用自定义的ArrayAdapter
            mAdapter = new TestArrayAdapter(MainActivity1.this,mStringArray);

            //设置下拉列表风格(这句不些也行)
            mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            mSpinner.setAdapter(mAdapter);

            //监听Item选中事件
            mSpinner.setOnItemSelectedListener(new ItemSelectedListenerImpl());

        }
        private void init32(){
            mSpinner=(Spinner) findViewById(R.id.spinner_month);
            mStringArray=getResources().getStringArray(R.array.month);
            //使用自定义的ArrayAdapter
            mAdapter = new TestArrayAdapter(MainActivity1.this,mStringArray);

            //设置下拉列表风格(这句不些也行)
            mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            mSpinner.setAdapter(mAdapter);

            //监听Item选中事件
            mSpinner.setOnItemSelectedListener(new ItemSelectedListenerImpl());

        }
        private void init33(){
            mSpinner=(Spinner) findViewById(R.id.spinner_day);
            mStringArray=getResources().getStringArray(R.array.day);
            //使用自定义的ArrayAdapter
            mAdapter = new TestArrayAdapter(MainActivity1.this,mStringArray);

            //设置下拉列表风格(这句不些也行)
            mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            mSpinner.setAdapter(mAdapter);

            //监听Item选中事件
            mSpinner.setOnItemSelectedListener(new ItemSelectedListenerImpl());

        }
        private void init41(){
            mSpinner=(Spinner) findViewById(R.id.spinner_testtype);
            mStringArray=getResources().getStringArray(R.array.testtype);
            //使用自定义的ArrayAdapter
            mAdapter = new TestArrayAdapter(MainActivity1.this,mStringArray);

            //设置下拉列表风格(这句不些也行)
            mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            mSpinner.setAdapter(mAdapter);

            //监听Item选中事件
            mSpinner.setOnItemSelectedListener(new ItemSelectedListenerImpl());

        }
        private void init42(){
            mSpinner=(Spinner) findViewById(R.id.spinner_testname);
            mStringArray=getResources().getStringArray(R.array.testname);
            //使用自定义的ArrayAdapter
            mAdapter = new TestArrayAdapter(MainActivity1.this,mStringArray);

            //设置下拉列表风格(这句不些也行)
            mAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            mSpinner.setAdapter(mAdapter);

            //监听Item选中事件
            mSpinner.setOnItemSelectedListener(new ItemSelectedListenerImpl());

        }

        private class ItemSelectedListenerImpl implements OnItemSelectedListener{
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position,long arg3) {
                System.out.println("选中了:"+mStringArray[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}

        }
    }
