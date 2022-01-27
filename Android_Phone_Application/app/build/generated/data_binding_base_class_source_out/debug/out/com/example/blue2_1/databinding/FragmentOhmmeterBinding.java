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
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentOhmmeterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView resistanceNumber;

  @NonNull
  public final TextView textOhmmeter;

  private FragmentOhmmeterBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView resistanceNumber, @NonNull TextView textOhmmeter) {
    this.rootView = rootView;
    this.resistanceNumber = resistanceNumber;
    this.textOhmmeter = textOhmmeter;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentOhmmeterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentOhmmeterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_ohmmeter, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentOhmmeterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.resistance_number;
      TextView resistanceNumber = ViewBindings.findChildViewById(rootView, id);
      if (resistanceNumber == null) {
        break missingId;
      }

      id = R.id.text_ohmmeter;
      TextView textOhmmeter = ViewBindings.findChildViewById(rootView, id);
      if (textOhmmeter == null) {
        break missingId;
      }

      return new FragmentOhmmeterBinding((ConstraintLayout) rootView, resistanceNumber,
          textOhmmeter);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}