// Generated by view binder compiler. Do not edit!
package codeflies.com.saalimmvvm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import codeflies.com.saalimmvvm.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemAllcateBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout cardClick;

  @NonNull
  public final ImageView imgallCate;

  @NonNull
  public final LinearLayout itemCart;

  @NonNull
  public final TextView tvallCate;

  private ItemAllcateBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout cardClick, @NonNull ImageView imgallCate,
      @NonNull LinearLayout itemCart, @NonNull TextView tvallCate) {
    this.rootView = rootView;
    this.cardClick = cardClick;
    this.imgallCate = imgallCate;
    this.itemCart = itemCart;
    this.tvallCate = tvallCate;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemAllcateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemAllcateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_allcate, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemAllcateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout cardClick = (ConstraintLayout) rootView;

      id = R.id.imgallCate;
      ImageView imgallCate = ViewBindings.findChildViewById(rootView, id);
      if (imgallCate == null) {
        break missingId;
      }

      id = R.id.item_cart;
      LinearLayout itemCart = ViewBindings.findChildViewById(rootView, id);
      if (itemCart == null) {
        break missingId;
      }

      id = R.id.tvallCate;
      TextView tvallCate = ViewBindings.findChildViewById(rootView, id);
      if (tvallCate == null) {
        break missingId;
      }

      return new ItemAllcateBinding((ConstraintLayout) rootView, cardClick, imgallCate, itemCart,
          tvallCate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
