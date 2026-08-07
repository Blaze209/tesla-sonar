package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends n0 {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    private static int e(View view) {
        int iB = ViewCompat.B(view);
        if (iB > 0) {
            return iB;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return e(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    private boolean f(int i11, int i12) {
        int iCombineMeasuredStates;
        int iE;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == i.f.Q) {
                    view = childAt;
                } else if (id2 == i.f.f73811l) {
                    view2 = childAt;
                } else {
                    if ((id2 != i.f.f73813n && id2 != i.f.f73815p) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i11);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i11, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i11, 0);
            iE = e(view2);
            measuredHeight = view2.getMeasuredHeight() - iE;
            paddingTop += iE;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iE = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i11, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i14 = size - paddingTop;
        if (view2 != null) {
            int i15 = paddingTop - iE;
            int iMin = Math.min(i14, measuredHeight);
            if (iMin > 0) {
                i14 -= iMin;
                iE += iMin;
            }
            view2.measure(i11, View.MeasureSpec.makeMeasureSpec(iE, 1073741824));
            paddingTop = i15 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i14 > 0) {
            view3.measure(i11, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i14, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i11, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i12, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        forceUniformWidth(childCount, i12);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void forceUniformWidth(int i11, int i12) {
        int i13;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i14 = 0;
        while (i14 < i11) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                n0.a aVar = (n0.a) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i15 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = childAt.getMeasuredHeight();
                    i13 = i12;
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i13, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i15;
                } else {
                    i13 = i12;
                }
            } else {
                i13 = i12;
            }
            i14++;
            i12 = i13;
        }
    }

    private void setChildFrame(View view, int i11, int i12, int i13, int i14) {
        view.layout(i11, i12, i13 + i11, i14 + i12);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    @Override // androidx.appcompat.widget.n0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int paddingLeft = getPaddingLeft();
        int i18 = i13 - i11;
        int paddingRight = i18 - getPaddingRight();
        int paddingRight2 = (i18 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i19 = gravity & 112;
        int i21 = gravity & 8388615;
        int paddingTop = i19 != 16 ? i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i14) - i12) - measuredHeight : getPaddingTop() + (((i14 - i12) - measuredHeight) / 2);
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                n0.a aVar = (n0.a) childAt.getLayoutParams();
                int i23 = ((LinearLayout.LayoutParams) aVar).gravity;
                if (i23 < 0) {
                    i23 = i21;
                }
                int iB = androidx.core.view.k.b(i23, ViewCompat.A(this)) & 7;
                if (iB != 1) {
                    if (iB != 5) {
                        i17 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    } else {
                        i15 = paddingRight - measuredWidth;
                        i16 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    int i24 = i17;
                    if (hasDividerBeforeChildAt(i22)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i25 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    setChildFrame(childAt, i24, i25, measuredWidth, measuredHeight2);
                    paddingTop = i25 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                } else {
                    i15 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    i16 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                }
                i17 = i15 - i16;
                int i26 = i17;
                if (hasDividerBeforeChildAt(i22)) {
                    paddingTop += intrinsicHeight;
                }
                int i27 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                setChildFrame(childAt, i26, i27, measuredWidth, measuredHeight2);
                paddingTop = i27 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin;
            }
        }
    }

    @Override // androidx.appcompat.widget.n0, android.view.View
    protected void onMeasure(int i11, int i12) {
        if (f(i11, i12)) {
            return;
        }
        super.onMeasure(i11, i12);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
