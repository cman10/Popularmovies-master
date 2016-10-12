package app.portfolio.popularmovies1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MovieDetails extends Fragment {

    String overview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
     View rootView=inflater.inflate(R.layout.activity_movie_details,container,false);
        TextView textView= (TextView) rootView.findViewById(R.id.textView);

        Intent intent= getActivity().getIntent();
        if (intent!=null && intent.hasExtra("Movie_overview"))
        {
            overview=intent.getStringExtra("Movie_overview");
            textView.setText(overview);

        }

        return rootView;
    }


    public MovieDetails(){

    }
}
