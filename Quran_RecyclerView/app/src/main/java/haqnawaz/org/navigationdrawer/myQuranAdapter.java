package haqnawaz.org.navigationdrawer;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class myQuranAdapter extends ArrayAdapter<SurahModel> {

    public myQuranAdapter(@NonNull Context context, @NonNull ArrayList<SurahModel> list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        SurahModel surahModel = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.surah_names,parent,false);
        TextView SurahText = convertView.findViewById(R.id.surahNamesTextView);
        SurahText.setText(surahModel.getSurahNameEnglish());
        return convertView;
    }
}

