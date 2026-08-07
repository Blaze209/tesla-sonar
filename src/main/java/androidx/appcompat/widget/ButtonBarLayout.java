package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2481c;

    public ButtonBarLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2480b = -1;
        this.f2481c = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.O0);
        ViewCompat.n0(this, context, i.j.O0, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f2479a = typedArrayObtainStyledAttributes.getBoolean(i.j.P0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private int a(int i11) {
        int childCount = getChildCount();
        while (i11 < childCount) {
            if (getChildAt(i11).getVisibility() == 0) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    private boolean b() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z11) {
        setOrientation(z11 ? 1 : 0);
        setGravity(z11 ? 8388613 : 80);
        View viewFindViewById = findViewById(i.f.H);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z11 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f2481c, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int iMakeMeasureSpec;
        boolean z11;
        int size = View.MeasureSpec.getSize(i11);
        int paddingBottom = 0;
        if (this.f2479a) {
            if (size > this.f2480b && b()) {
                setStacked(false);
            }
            this.f2480b = size;
        }
        if (b() || View.MeasureSpec.getMode(i11) != 1073741824) {
            iMakeMeasureSpec = i11;
            z11 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z11 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i12);
        if (this.f2479a && !b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z11 = true;
        }
        if (z11) {
            super.onMeasure(i11, i12);
        }
        int iA = a(0);
        if (iA >= 0) {
            View childAt = getChildAt(iA);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int iA2 = a(iA + 1);
                if (iA2 >= 0) {
                    paddingTop += getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (ViewCompat.B(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
        }
    }

    public void setAllowStacking(boolean z11) {
        if (this.f2479a != z11) {
            this.f2479a = z11;
            if (!z11 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
