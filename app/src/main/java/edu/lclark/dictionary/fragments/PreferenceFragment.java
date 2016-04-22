package edu.lclark.dictionary.fragments;

import android.os.Bundle;

import edu.lclark.dictionary.R;

/**
 * Created by student on 4/17/16.
 */
public class PreferenceFragment extends android.preference.PreferenceFragment{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);
    }
}
