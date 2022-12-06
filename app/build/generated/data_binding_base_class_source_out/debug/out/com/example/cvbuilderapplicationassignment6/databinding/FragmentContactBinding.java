// Generated by view binder compiler. Do not edit!
package com.example.cvbuilderapplicationassignment6.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cvbuilderapplicationassignment6.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentContactBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout emailLl;

  @NonNull
  public final LinearLayout githubLl;

  @NonNull
  public final LinearLayout linkedinLl;

  @NonNull
  public final LinearLayout mobileLl;

  @NonNull
  public final LinearLayout resumeLl;

  private FragmentContactBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout emailLl,
      @NonNull LinearLayout githubLl, @NonNull LinearLayout linkedinLl,
      @NonNull LinearLayout mobileLl, @NonNull LinearLayout resumeLl) {
    this.rootView = rootView;
    this.emailLl = emailLl;
    this.githubLl = githubLl;
    this.linkedinLl = linkedinLl;
    this.mobileLl = mobileLl;
    this.resumeLl = resumeLl;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentContactBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_contact, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentContactBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.email_ll;
      LinearLayout emailLl = ViewBindings.findChildViewById(rootView, id);
      if (emailLl == null) {
        break missingId;
      }

      id = R.id.github_ll;
      LinearLayout githubLl = ViewBindings.findChildViewById(rootView, id);
      if (githubLl == null) {
        break missingId;
      }

      id = R.id.linkedin_ll;
      LinearLayout linkedinLl = ViewBindings.findChildViewById(rootView, id);
      if (linkedinLl == null) {
        break missingId;
      }

      id = R.id.mobile_ll;
      LinearLayout mobileLl = ViewBindings.findChildViewById(rootView, id);
      if (mobileLl == null) {
        break missingId;
      }

      id = R.id.resume_ll;
      LinearLayout resumeLl = ViewBindings.findChildViewById(rootView, id);
      if (resumeLl == null) {
        break missingId;
      }

      return new FragmentContactBinding((LinearLayout) rootView, emailLl, githubLl, linkedinLl,
          mobileLl, resumeLl);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}