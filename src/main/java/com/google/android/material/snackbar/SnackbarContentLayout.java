package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import nt.i;
import zs.c;
import zs.e;
import zs.g;

/* JADX INFO: loaded from: classes5.dex */
public class SnackbarContentLayout extends LinearLayout implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f42777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Button f42778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeInterpolator f42779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42780d;

    public SnackbarContentLayout(@NonNull Context context) {
        this(context, null);
    }

    private static void d(@NonNull View view, int i11, int i12) {
        if (ViewCompat.W(view)) {
            ViewCompat.F0(view, ViewCompat.F(view), i11, ViewCompat.E(view), i12);
        } else {
            view.setPadding(view.getPaddingLeft(), i11, view.getPaddingRight(), i12);
        }
    }

    private boolean e(int i11, int i12, int i13) {
        boolean z11;
        if (i11 != getOrientation()) {
            setOrientation(i11);
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f42777a.getPaddingTop() == i12 && this.f42777a.getPaddingBottom() == i13) {
            return z11;
        }
        d(this.f42777a, i12, i13);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int i11, int i12) {
        this.f42777a.setAlpha(BitmapDescriptorFactory.HUE_RED);
        long j11 = i12;
        long j12 = i11;
        this.f42777a.animate().alpha(1.0f).setDuration(j11).setInterpolator(this.f42779c).setStartDelay(j12).start();
        if (this.f42778b.getVisibility() == 0) {
            this.f42778b.setAlpha(BitmapDescriptorFactory.HUE_RED);
            this.f42778b.animate().alpha(1.0f).setDuration(j11).setInterpolator(this.f42779c).setStartDelay(j12).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i11, int i12) {
        this.f42777a.setAlpha(1.0f);
        long j11 = i12;
        long j12 = i11;
        this.f42777a.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(j11).setInterpolator(this.f42779c).setStartDelay(j12).start();
        if (this.f42778b.getVisibility() == 0) {
            this.f42778b.setAlpha(1.0f);
            this.f42778b.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(j11).setInterpolator(this.f42779c).setStartDelay(j12).start();
        }
    }

    void c(float f11) {
        if (f11 != 1.0f) {
            this.f42778b.setTextColor(ht.a.j(ht.a.d(this, c.f128599w), this.f42778b.getCurrentTextColor(), f11));
        }
    }

    public Button getActionView() {
        return this.f42778b;
    }

    public TextView getMessageView() {
        return this.f42777a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f42777a = (TextView) findViewById(g.f128721s0);
        this.f42778b = (Button) findViewById(g.f128719r0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(e.f128644n);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(e.f128642m);
        Layout layout = this.f42777a.getLayout();
        boolean z11 = layout != null && layout.getLineCount() > 1;
        if (!z11 || this.f42780d <= 0 || this.f42778b.getMeasuredWidth() <= this.f42780d) {
            if (!z11) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i11, i12);
    }

    public void setMaxInlineActionWidth(int i11) {
        this.f42780d = i11;
    }

    public SnackbarContentLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42779c = i.g(context, c.f128570h0, at.b.f14973b);
    }
}
