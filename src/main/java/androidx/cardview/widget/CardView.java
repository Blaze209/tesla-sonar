package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f3785h = {R.attr.colorBackground};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final c f3786i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f3787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f3789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f3790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Rect f3791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Rect f3792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f3793g;

    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f3794a;

        a() {
        }

        @Override // androidx.cardview.widget.b
        public void a(int i11, int i12, int i13, int i14) {
            CardView.this.f3792f.set(i11, i12, i13, i14);
            CardView cardView = CardView.this;
            Rect rect = cardView.f3791e;
            CardView.super.setPadding(i11 + rect.left, i12 + rect.top, i13 + rect.right, i14 + rect.bottom);
        }

        @Override // androidx.cardview.widget.b
        public boolean b() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.b
        public void c(Drawable drawable) {
            this.f3794a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.b
        public Drawable d() {
            return this.f3794a;
        }

        @Override // androidx.cardview.widget.b
        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.b
        public View f() {
            return CardView.this;
        }
    }

    static {
        androidx.cardview.widget.a aVar = new androidx.cardview.widget.a();
        f3786i = aVar;
        aVar.n();
    }

    public CardView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return f3786i.j(this.f3793g);
    }

    public float getCardElevation() {
        return f3786i.d(this.f3793g);
    }

    public int getContentPaddingBottom() {
        return this.f3791e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f3791e.left;
    }

    public int getContentPaddingRight() {
        return this.f3791e.right;
    }

    public int getContentPaddingTop() {
        return this.f3791e.top;
    }

    public float getMaxCardElevation() {
        return f3786i.b(this.f3793g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f3788b;
    }

    public float getRadius() {
        return f3786i.a(this.f3793g);
    }

    public boolean getUseCompatPadding() {
        return this.f3787a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        c cVar = f3786i;
        if (cVar instanceof androidx.cardview.widget.a) {
            super.onMeasure(i11, i12);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cVar.f(this.f3793g)), View.MeasureSpec.getSize(i11)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i12);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i12 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cVar.c(this.f3793g)), View.MeasureSpec.getSize(i12)), mode2);
        }
        super.onMeasure(i11, i12);
    }

    public void setCardBackgroundColor(int i11) {
        f3786i.o(this.f3793g, ColorStateList.valueOf(i11));
    }

    public void setCardElevation(float f11) {
        f3786i.i(this.f3793g, f11);
    }

    public void setContentPadding(int i11, int i12, int i13, int i14) {
        this.f3791e.set(i11, i12, i13, i14);
        f3786i.e(this.f3793g);
    }

    public void setMaxCardElevation(float f11) {
        f3786i.g(this.f3793g, f11);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i11) {
        this.f3790d = i11;
        super.setMinimumHeight(i11);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i11) {
        this.f3789c = i11;
        super.setMinimumWidth(i11);
    }

    @Override // android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i11, int i12, int i13, int i14) {
    }

    public void setPreventCornerOverlap(boolean z11) {
        if (z11 != this.f3788b) {
            this.f3788b = z11;
            f3786i.k(this.f3793g);
        }
    }

    public void setRadius(float f11) {
        f3786i.h(this.f3793g, f11);
    }

    public void setUseCompatPadding(boolean z11) {
        if (this.f3787a != z11) {
            this.f3787a = z11;
            f3786i.m(this.f3793g);
        }
    }

    public CardView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m1.a.f90894a);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f3786i.o(this.f3793g, colorStateList);
    }

    public CardView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i11);
        Rect rect = new Rect();
        this.f3791e = rect;
        this.f3792f = new Rect();
        a aVar = new a();
        this.f3793g = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m1.d.f90898a, i11, m1.c.f90897a);
        if (typedArrayObtainStyledAttributes.hasValue(m1.d.f90901d)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(m1.d.f90901d);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f3785h);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(m1.b.f90896b);
            } else {
                color = getResources().getColor(m1.b.f90895a);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(m1.d.f90902e, BitmapDescriptorFactory.HUE_RED);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(m1.d.f90903f, BitmapDescriptorFactory.HUE_RED);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(m1.d.f90904g, BitmapDescriptorFactory.HUE_RED);
        this.f3787a = typedArrayObtainStyledAttributes.getBoolean(m1.d.f90906i, false);
        this.f3788b = typedArrayObtainStyledAttributes.getBoolean(m1.d.f90905h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(m1.d.f90907j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(m1.d.f90909l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(m1.d.f90911n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(m1.d.f90910m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(m1.d.f90908k, dimensionPixelSize);
        float f11 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f3789c = typedArrayObtainStyledAttributes.getDimensionPixelSize(m1.d.f90899b, 0);
        this.f3790d = typedArrayObtainStyledAttributes.getDimensionPixelSize(m1.d.f90900c, 0);
        typedArrayObtainStyledAttributes.recycle();
        f3786i.l(aVar, context, colorStateList, dimension, dimension2, f11);
    }
}
