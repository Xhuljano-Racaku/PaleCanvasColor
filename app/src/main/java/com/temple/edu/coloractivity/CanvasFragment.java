package com.temple.edu.coloractivity;

        import android.graphics.Color;
        import android.os.Bundle;
        import android.support.annotation.NonNull;
        import android.support.annotation.Nullable;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

public class CanvasFragment extends Fragment {
    View b;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        b = inflater.inflate(R.layout.canvas_fragment, container, false);
        return b;
    }

    public void setBackgroundColor(String color) {
        b.setBackgroundColor(Color.parseColor(color));
    }
}
