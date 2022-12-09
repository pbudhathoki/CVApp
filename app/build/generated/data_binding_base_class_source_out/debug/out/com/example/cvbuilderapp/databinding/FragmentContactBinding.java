// Generated by view binder compiler. Do not edit!
package com.example.cvbuilderapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cvbuilderapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentContactBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout emailContact;

  @NonNull
  public final LinearLayout githubContact;

  @NonNull
  public final LinearLayout linkedinContact;

  @NonNull
  public final LinearLayout mobileContact;

  @NonNull
  public final LinearLayout resumeContact;

  private FragmentContactBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout emailContact,
      @NonNull LinearLayout githubContact, @NonNull LinearLayout linkedinContact,
      @NonNull LinearLayout mobileContact, @NonNull LinearLayout resumeContact) {
    this.rootView = rootView;
    this.emailContact = emailContact;
    this.githubContact = githubContact;
    this.linkedinContact = linkedinContact;
    this.mobileContact = mobileContact;
    this.resumeContact = resumeContact;
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
      id = R.id.email_contact;
      LinearLayout emailContact = ViewBindings.findChildViewById(rootView, id);
      if (emailContact == null) {
        break missingId;
      }

      id = R.id.github_contact;
      LinearLayout githubContact = ViewBindings.findChildViewById(rootView, id);
      if (githubContact == null) {
        break missingId;
      }

      id = R.id.linkedin_contact;
      LinearLayout linkedinContact = ViewBindings.findChildViewById(rootView, id);
      if (linkedinContact == null) {
        break missingId;
      }

      id = R.id.mobile_contact;
      LinearLayout mobileContact = ViewBindings.findChildViewById(rootView, id);
      if (mobileContact == null) {
        break missingId;
      }

      id = R.id.resume_contact;
      LinearLayout resumeContact = ViewBindings.findChildViewById(rootView, id);
      if (resumeContact == null) {
        break missingId;
      }

      return new FragmentContactBinding((LinearLayout) rootView, emailContact, githubContact,
          linkedinContact, mobileContact, resumeContact);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
