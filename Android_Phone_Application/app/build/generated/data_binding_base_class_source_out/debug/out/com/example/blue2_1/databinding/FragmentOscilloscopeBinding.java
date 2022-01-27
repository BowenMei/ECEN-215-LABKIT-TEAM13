// Generated by view binder compiler. Do not edit!
package com.example.blue2_1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.blue2_1.R;
import com.jjoe64.graphview.GraphView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentOscilloscopeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final GraphView oscilloscopeGraph;

  @NonNull
  public final GraphView oscilloscopeGraph1;

  @NonNull
  public final TextView textOscilloscope;

  private FragmentOscilloscopeBinding(@NonNull ConstraintLayout rootView,
      @NonNull GraphView oscilloscopeGraph, @NonNull GraphView oscilloscopeGraph1,
      @NonNull TextView textOscilloscope) {
    this.rootView = rootView;
    this.oscilloscopeGraph = oscilloscopeGraph;
    this.oscilloscopeGraph1 = oscilloscopeGraph1;
    this.textOscilloscope = textOscilloscope;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentOscilloscopeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentOscilloscopeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_oscilloscope, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentOscilloscopeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.oscilloscope_graph;
      GraphView oscilloscopeGraph = ViewBindings.findChildViewById(rootView, id);
      if (oscilloscopeGraph == null) {
        break missingId;
      }

      id = R.id.oscilloscope_graph1;
      GraphView oscilloscopeGraph1 = ViewBindings.findChildViewById(rootView, id);
      if (oscilloscopeGraph1 == null) {
        break missingId;
      }

      id = R.id.text_oscilloscope;
      TextView textOscilloscope = ViewBindings.findChildViewById(rootView, id);
      if (textOscilloscope == null) {
        break missingId;
      }

      return new FragmentOscilloscopeBinding((ConstraintLayout) rootView, oscilloscopeGraph,
          oscilloscopeGraph1, textOscilloscope);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}