// Generated code from Butter Knife. Do not modify!
package com.khilman.kalkulatorsegitiga;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131427429;

  private View view2131427430;

  private View view2131427431;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.nilaiAlas = Utils.findRequiredViewAsType(source, R.id.nilai_alas, "field 'nilaiAlas'", EditText.class);
    target.nilaiTinggi = Utils.findRequiredViewAsType(source, R.id.nilai_tinggi, "field 'nilaiTinggi'", EditText.class);
    target.txtHasil = Utils.findRequiredViewAsType(source, R.id.txtHasil, "field 'txtHasil'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btnHitung, "field 'btnHitung' and method 'onViewClicked'");
    target.btnHitung = Utils.castView(view, R.id.btnHitung, "field 'btnHitung'", Button.class);
    view2131427429 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnClear, "field 'btnClear' and method 'onViewClicked'");
    target.btnClear = Utils.castView(view, R.id.btnClear, "field 'btnClear'", Button.class);
    view2131427430 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btnKirim, "field 'btnKirim' and method 'onViewClicked'");
    target.btnKirim = Utils.castView(view, R.id.btnKirim, "field 'btnKirim'", Button.class);
    view2131427431 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.nilaiAlas = null;
    target.nilaiTinggi = null;
    target.txtHasil = null;
    target.btnHitung = null;
    target.btnClear = null;
    target.btnKirim = null;

    view2131427429.setOnClickListener(null);
    view2131427429 = null;
    view2131427430.setOnClickListener(null);
    view2131427430 = null;
    view2131427431.setOnClickListener(null);
    view2131427431 = null;
  }
}
