// Generated by view binder compiler. Do not edit!
package codeflies.com.saalimmvvm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import codeflies.com.saalimmvvm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemDataBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView amountTextView;

  @NonNull
  public final TextView descriptionTextView;

  @NonNull
  public final TextView titleTextView;

  private ItemDataBinding(@NonNull LinearLayout rootView, @NonNull TextView amountTextView,
      @NonNull TextView descriptionTextView, @NonNull TextView titleTextView) {
    this.rootView = rootView;
    this.amountTextView = amountTextView;
    this.descriptionTextView = descriptionTextView;
    this.titleTextView = titleTextView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemDataBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_data, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemDataBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.amountTextView;
      TextView amountTextView = ViewBindings.findChildViewById(rootView, id);
      if (amountTextView == null) {
        break missingId;
      }

      id = R.id.descriptionTextView;
      TextView descriptionTextView = ViewBindings.findChildViewById(rootView, id);
      if (descriptionTextView == null) {
        break missingId;
      }

      id = R.id.titleTextView;
      TextView titleTextView = ViewBindings.findChildViewById(rootView, id);
      if (titleTextView == null) {
        break missingId;
      }

      return new ItemDataBinding((LinearLayout) rootView, amountTextView, descriptionTextView,
          titleTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}