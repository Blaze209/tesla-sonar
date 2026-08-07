package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;
import zs.e;

/* JADX INFO: loaded from: classes5.dex */
public class b extends com.google.android.material.navigation.c {
    private final int H;
    private final int I;
    private final int J;
    private final int K;
    private boolean L;
    private final List<Integer> M;

    public b(@NonNull Context context) {
        super(context);
        this.M = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.H = resources.getDimensionPixelSize(e.f128624d);
        this.I = resources.getDimensionPixelSize(e.f128626e);
        this.J = resources.getDimensionPixelSize(e.f128620b);
        this.K = resources.getDimensionPixelSize(e.f128622c);
    }

    @Override // com.google.android.material.navigation.c
    @NonNull
    protected com.google.android.material.navigation.a g(@NonNull Context context) {
        return new a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        int measuredWidth = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                if (ViewCompat.A(this) == 1) {
                    int i18 = i15 - measuredWidth;
                    childAt.layout(i18 - childAt.getMeasuredWidth(), 0, i18, i16);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i16);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        androidx.appcompat.view.menu.e menu = getMenu();
        int size = View.MeasureSpec.getSize(i11);
        int size2 = menu.G().size();
        int childCount = getChildCount();
        this.M.clear();
        int size3 = View.MeasureSpec.getSize(i12);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (k(getLabelVisibilityMode(), size2) && r()) {
            View childAt = getChildAt(getSelectedItemPosition());
            int iMax = this.K;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.J, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i15 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = Math.min(size - (this.I * i15), Math.min(iMax, this.J));
            int i16 = size - iMin;
            int iMin2 = Math.min(i16 / (i15 != 0 ? i15 : 1), this.H);
            int i17 = i16 - (i15 * iMin2);
            int i18 = 0;
            while (i18 < childCount) {
                if (getChildAt(i18).getVisibility() != 8) {
                    i14 = i18 == getSelectedItemPosition() ? iMin : iMin2;
                    if (i17 > 0) {
                        i14++;
                        i17--;
                    }
                } else {
                    i14 = 0;
                }
                this.M.add(Integer.valueOf(i14));
                i18++;
            }
        } else {
            int iMin3 = Math.min(size / (size2 != 0 ? size2 : 1), this.J);
            int i19 = size - (size2 * iMin3);
            for (int i21 = 0; i21 < childCount; i21++) {
                if (getChildAt(i21).getVisibility() == 8) {
                    i13 = 0;
                } else if (i19 > 0) {
                    i13 = iMin3 + 1;
                    i19--;
                } else {
                    i13 = iMin3;
                }
                this.M.add(Integer.valueOf(i13));
            }
        }
        int measuredWidth = 0;
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.M.get(i22).intValue(), 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(measuredWidth, size3);
    }

    public boolean r() {
        return this.L;
    }

    public void setItemHorizontalTranslationEnabled(boolean z11) {
        this.L = z11;
    }
}
