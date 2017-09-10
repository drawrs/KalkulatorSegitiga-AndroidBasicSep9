// Generated code from Butter Knife. Do not modify!
package com.khilman.kalkulatorsegitiga;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HasilHitungActivity_ViewBinding implements Unbinder {
  private HasilHitungActivity target;

  @UiThread
  public HasilHitungActivity_ViewBinding(HasilHitungActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public HasilHitungActivity_ViewBinding(HasilHitungActivity target, View source) {
    this.target = target;

    target.txtNilaiAlas = Utils.findRequiredViewAsType(source, R.id.txtNilaiAlas, "field 'txtNilaiAlas'", TextView.class);
    target.txtNilaiTinggi = Utils.findRequiredViewAsType(source, R.id.txtNilaiTinggi, "field 'txtNilaiTinggi'", TextView.class);
    target.txtHasilLuas = Utils.findRequiredViewAsType(source, R.id.txtHasilLuas, "field 'txtHasilLuas'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HasilHitungActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtNilaiAlas = null;
    target.txtNilaiTinggi = null;
    target.txtHasilLuas = null;
  }
}
