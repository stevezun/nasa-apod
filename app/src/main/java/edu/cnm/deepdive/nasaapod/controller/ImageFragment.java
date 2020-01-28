package edu.cnm.deepdive.nasaapod.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import edu.cnm.deepdive.nasaapod.R;

public class ImageFragment extends Fragment {

  private WebView contentView;

  public View onCreateView(@NonNull LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {
    View root = inflater.inflate( R.layout.fragment_image, container, false );
    contentView = root.findViewById( R.id.content_view );
    contentView.setWebViewClient(  );

    return root;
  }
}