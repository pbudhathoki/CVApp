// Generated by view binder compiler. Do not edit!
package com.example.cvbuilderapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cvbuilderapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemWorkBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView companyNameTextView;

  @NonNull
  public final TextView durationTextView;

  @NonNull
  public final TextView locationTextView;

  @NonNull
  public final ImageView logoImageView;

  @NonNull
  public final TextView rolesTextView;

  private ItemWorkBinding(@NonNull LinearLayout rootView, @NonNull TextView companyNameTextView,
      @NonNull TextView durationTextView, @NonNull TextView locationTextView,
      @NonNull ImageView logoImageView, @NonNull TextView rolesTextView) {
    this.rootView = rootView;
    this.companyNameTextView = companyNameTextView;
    this.durationTextView = durationTextView;
    this.locationTextView = locationTextView;
    this.logoImageView = logoImageView;
    this.rolesTextView = rolesTextView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemWorkBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemWorkBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_work, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemWorkBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.company_name_text_view;
      TextView companyNameTextView = ViewBindings.findChildViewById(rootView, id);
      if (companyNameTextView == null) {
        break missingId;
      }

      id = R.id.duration_text_view;
      TextView durationTextView = ViewBindings.findChildViewById(rootView, id);
      if (durationTextView == null) {
        break missingId;
      }

      id = R.id.location_text_view;
      TextView locationTextView = ViewBindings.findChildViewById(rootView, id);
      if (locationTextView == null) {
        break missingId;
      }

      id = R.id.logo_image_view;
      ImageView logoImageView = ViewBindings.findChildViewById(rootView, id);
      if (logoImageView == null) {
        break missingId;
      }

      id = R.id.roles_text_view;
      TextView rolesTextView = ViewBindings.findChildViewById(rootView, id);
      if (rolesTextView == null) {
        break missingId;
      }

      return new ItemWorkBinding((LinearLayout) rootView, companyNameTextView, durationTextView,
          locationTextView, logoImageView, rolesTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
