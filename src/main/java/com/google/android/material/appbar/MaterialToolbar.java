package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.b0;
import st.h;
import zs.l;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f41457f = l.M;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ImageView.ScaleType[] f41458g = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f41459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f41460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView.ScaleType f41462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f41463e;

    public MaterialToolbar(@NonNull Context context) {
        this(context, null);
    }

    private Pair<Integer, Integer> a(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i11 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i11 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i11 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void b(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : com.google.android.material.drawable.c.g(background);
        if (colorStateListValueOf != null) {
            st.g gVar = new st.g();
            gVar.b0(colorStateListValueOf);
            gVar.Q(context);
            gVar.a0(ViewCompat.v(this));
            ViewCompat.t0(this, gVar);
        }
    }

    private void c(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i11 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i12 = measuredWidth2 + i11;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i11, 0), Math.max(i12 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i11 += iMax;
            i12 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i12 - i11, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i11, view.getTop(), i12, view.getBottom());
    }

    private void d() {
        if (this.f41460b || this.f41461c) {
            TextView textViewG = b0.g(this);
            TextView textViewE = b0.e(this);
            if (textViewG == null && textViewE == null) {
                return;
            }
            Pair<Integer, Integer> pairA = a(textViewG, textViewE);
            if (this.f41460b && textViewG != null) {
                c(textViewG, pairA);
            }
            if (!this.f41461c || textViewE == null) {
                return;
            }
            c(textViewE, pairA);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable == null || this.f41459a == null) {
            return drawable;
        }
        Drawable drawableR = l5.a.r(drawable.mutate());
        l5.a.n(drawableR, this.f41459a.intValue());
        return drawableR;
    }

    private void f() {
        ImageView imageViewC = b0.c(this);
        if (imageViewC != null) {
            Boolean bool = this.f41463e;
            if (bool != null) {
                imageViewC.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f41462d;
            if (scaleType != null) {
                imageViewC.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f41462d;
    }

    public Integer getNavigationIconTint() {
        return this.f41459a;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(int i11) {
        Menu menu = getMenu();
        boolean z11 = menu instanceof androidx.appcompat.view.menu.e;
        if (z11) {
            ((androidx.appcompat.view.menu.e) menu).h0();
        }
        super.inflateMenu(i11);
        if (z11) {
            ((androidx.appcompat.view.menu.e) menu).g0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        d();
        f();
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        h.d(this, f11);
    }

    public void setLogoAdjustViewBounds(boolean z11) {
        Boolean bool = this.f41463e;
        if (bool == null || bool.booleanValue() != z11) {
            this.f41463e = Boolean.valueOf(z11);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.f41462d != scaleType) {
            this.f41462d = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(e(drawable));
    }

    public void setNavigationIconTint(int i11) {
        this.f41459a = Integer.valueOf(i11);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z11) {
        if (this.f41461c != z11) {
            this.f41461c = z11;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z11) {
        if (this.f41460b != z11) {
            this.f41460b = z11;
            requestLayout();
        }
    }

    public MaterialToolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, zs.c.C0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(@NonNull Context context, AttributeSet attributeSet, int i11) {
        int i12 = f41457f;
        super(wt.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        Context context2 = getContext();
        TypedArray typedArrayI = a0.i(context2, attributeSet, m.Z5, i11, i12, new int[0]);
        if (typedArrayI.hasValue(m.f128849c6)) {
            setNavigationIconTint(typedArrayI.getColor(m.f128849c6, -1));
        }
        this.f41460b = typedArrayI.getBoolean(m.f128873e6, false);
        this.f41461c = typedArrayI.getBoolean(m.f128861d6, false);
        int i13 = typedArrayI.getInt(m.f128837b6, -1);
        if (i13 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f41458g;
            if (i13 < scaleTypeArr.length) {
                this.f41462d = scaleTypeArr[i13];
            }
        }
        if (typedArrayI.hasValue(m.f128825a6)) {
            this.f41463e = Boolean.valueOf(typedArrayI.getBoolean(m.f128825a6, false));
        }
        typedArrayI.recycle();
        b(context2);
    }
}
