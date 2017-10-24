package com.vikas.takeattendance;

/**
 * Created by vikas on 12-Jul-17.
 */

public class Details {

    private String mName ;
    private String mRoll ;
    public boolean mIsPresent ;

    public Details(String name, String roll) {
        mName = name ;
        mRoll = roll ;
        mIsPresent = false ;
    }

    public String getmName() {
        return mName;
    }

    public String getmRoll() {
        return mRoll;
    }

    public boolean getmIsPresent() {
        return mIsPresent;
    }
}
