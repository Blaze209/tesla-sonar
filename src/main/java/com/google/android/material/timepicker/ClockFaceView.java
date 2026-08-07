package com.google.android.material.timepicker;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class ClockFaceView extends g implements ClockHandView.c {
    private final ClockHandView C;
    private final Rect D;
    private final RectF E;
    private final Rect F;
    private final SparseArray<TextView> G;
    private final androidx.core.view.a H;
    private final int[] I;
    private final float[] J;
    private final int K;
    private final int L;
    private final int M;
    private final int N;
    private String[] O;
    private float P;
    private final ColorStateList Q;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.setRadius(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.C.j()) - ClockFaceView.this.K);
            return true;
        }
    }

    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            int iIntValue = ((Integer) view.getTag(zs.g.B)).intValue();
            if (iIntValue > 0) {
                accessibilityNodeInfoCompat.g1((View) ClockFaceView.this.G.get(iIntValue - 1));
            }
            accessibilityNodeInfoCompat.w0(AccessibilityNodeInfoCompat.e.b(0, 1, iIntValue, 1, false, view.isSelected()));
            accessibilityNodeInfoCompat.u0(true);
            accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7746i);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i11, Bundle bundle) {
            if (i11 != 16) {
                return super.j(view, i11, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.D);
            float fCenterX = ClockFaceView.this.D.centerX();
            float fCenterY = ClockFaceView.this.D.centerY();
            ClockFaceView.this.C.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.C.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(@NonNull Context context) {
        this(context, null);
    }

    private void J() {
        RectF rectFF = this.C.f();
        TextView textViewM = M(rectFF);
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            TextView textView = this.G.get(i11);
            if (textView != null) {
                textView.setSelected(textView == textViewM);
                textView.getPaint().setShader(L(rectFF, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient L(RectF rectF, TextView textView) {
        textView.getHitRect(this.D);
        this.E.set(this.D);
        textView.getLineBounds(0, this.F);
        RectF rectF2 = this.E;
        Rect rect = this.F;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.E)) {
            return new RadialGradient(rectF.centerX() - this.E.left, rectF.centerY() - this.E.top, rectF.width() * 0.5f, this.I, this.J, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private TextView M(RectF rectF) {
        float f11 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            TextView textView2 = this.G.get(i11);
            if (textView2 != null) {
                textView2.getHitRect(this.D);
                this.E.set(this.D);
                this.E.union(rectF);
                float fWidth = this.E.width() * this.E.height();
                if (fWidth < f11) {
                    textView = textView2;
                    f11 = fWidth;
                }
            }
        }
        return textView;
    }

    private static float N(float f11, float f12, float f13) {
        return Math.max(Math.max(f11, f12), f13);
    }

    private void P(int i11) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.G.size();
        boolean z11 = false;
        for (int i12 = 0; i12 < Math.max(this.O.length, size); i12++) {
            TextView textView = this.G.get(i12);
            if (i12 >= this.O.length) {
                removeView(textView);
                this.G.remove(i12);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(zs.i.f128746h, (ViewGroup) this, false);
                    this.G.put(i12, textView);
                    addView(textView);
                }
                textView.setText(this.O[i12]);
                textView.setTag(zs.g.B, Integer.valueOf(i12));
                int i13 = (i12 / 12) + 1;
                textView.setTag(zs.g.f128710n, Integer.valueOf(i13));
                if (i13 > 1) {
                    z11 = true;
                }
                ViewCompat.p0(textView, this.H);
                textView.setTextColor(this.Q);
                if (i11 != 0) {
                    textView.setContentDescription(getResources().getString(i11, this.O[i12]));
                }
            }
        }
        this.C.o(z11);
    }

    @Override // com.google.android.material.timepicker.g
    protected void D() {
        super.D();
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            this.G.get(i11).setVisibility(0);
        }
    }

    int K() {
        return this.C.e();
    }

    void O(int i11) {
        this.C.m(i11);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void d(float f11, boolean z11) {
        if (Math.abs(this.P - f11) > 0.001f) {
            this.P = f11;
            J();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.n1(accessibilityNodeInfo).v0(AccessibilityNodeInfoCompat.d.b(1, this.O.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        J();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iN = (int) (this.N / N(this.L / displayMetrics.heightPixels, this.M / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iN, 1073741824);
        setMeasuredDimension(iN, iN);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public void setHandRotation(float f11) {
        this.C.setHandRotation(f11);
        J();
    }

    @Override // com.google.android.material.timepicker.g
    public void setRadius(int i11) {
        if (i11 != B()) {
            super.setRadius(i11);
            this.C.setCircleRadius(B());
        }
    }

    public void setValues(String[] strArr, int i11) {
        this.O = strArr;
        P(i11);
    }

    public ClockFaceView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.P);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.D = new Rect();
        this.E = new RectF();
        this.F = new Rect();
        this.G = new SparseArray<>();
        this.J = new float[]{BitmapDescriptorFactory.HUE_RED, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zs.m.f129025r2, i11, zs.l.L);
        Resources resources = getResources();
        ColorStateList colorStateListA = pt.c.a(context, typedArrayObtainStyledAttributes, zs.m.f129049t2);
        this.Q = colorStateListA;
        LayoutInflater.from(context).inflate(zs.i.f128747i, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(zs.g.f128708m);
        this.C = clockHandView;
        this.K = resources.getDimensionPixelSize(zs.e.L);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.I = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = j.a.a(context, zs.d.f128613g).getDefaultColor();
        ColorStateList colorStateListA2 = pt.c.a(context, typedArrayObtainStyledAttributes, zs.m.f129037s2);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.H = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        setValues(strArr, 0);
        this.L = resources.getDimensionPixelSize(zs.e.f128619a0);
        this.M = resources.getDimensionPixelSize(zs.e.f128621b0);
        this.N = resources.getDimensionPixelSize(zs.e.N);
    }
}
