package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public class n0 extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i11, int i12) {
            super(i11, i12);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public n0(@NonNull Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void forceUniformHeight(int i11, int i12) {
        int i13;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i14 = 0;
        while (i14 < i11) {
            View virtualChildAt = getVirtualChildAt(i14);
            if (virtualChildAt.getVisibility() != 8) {
                a aVar = (a) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i15 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = virtualChildAt.getMeasuredWidth();
                    i13 = i12;
                    measureChildWithMargins(virtualChildAt, i13, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i15;
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

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void forceUniformWidth(int i11, int i12) {
        int i13;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i14 = 0;
        while (i14 < i11) {
            View virtualChildAt = getVirtualChildAt(i14);
            if (virtualChildAt.getVisibility() != 8) {
                a aVar = (a) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i15 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = virtualChildAt.getMeasuredHeight();
                    i13 = i12;
                    measureChildWithMargins(virtualChildAt, iMakeMeasureSpec, 0, i13, 0);
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

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i11;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = h1.b(this);
        for (int i12 = 0; i12 < virtualChildCount; i12++) {
            View virtualChildAt = getVirtualChildAt(i12);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i12)) {
                a aVar = (a) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, zB ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                a aVar2 = (a) virtualChildAt2.getLayoutParams();
                if (zB) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i11 = this.mDividerWidth;
                    right = left - i11;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i11 = this.mDividerWidth;
                right = left - i11;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View virtualChildAt = getVirtualChildAt(i11);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i11)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((a) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    void drawHorizontalDivider(Canvas canvas, int i11) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i11, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i11);
        this.mDivider.draw(canvas);
    }

    void drawVerticalDivider(Canvas canvas, int i11) {
        this.mDivider.setBounds(i11, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i11, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i11;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i12 = this.mBaselineAlignedChildIndex;
        if (childCount <= i12) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i12);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i11 = this.mGravity & 112) != 48) {
            if (i11 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i11 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    int getChildrenSkipCount(View view, int i11) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    int getLocationOffset(View view) {
        return 0;
    }

    int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    View getVirtualChildAt(int i11) {
        return getChildAt(i11);
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    protected boolean hasDividerBeforeChildAt(int i11) {
        if (i11 == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i11 == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) != 0) {
            for (int i12 = i11 - 1; i12 >= 0; i12--) {
                if (getChildAt(i12).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x0100  */
    /* JADX WARN: Code duplicated, block: B:48:0x0105  */
    void layoutHorizontal(int i11, int i12, int i13, int i14) {
        int paddingLeft;
        int i15;
        int i16;
        char c11;
        char c12;
        int i17;
        int childrenSkipCount;
        int i18;
        int baseline;
        int i19;
        int i21;
        int i22;
        int measuredHeight;
        int i23;
        boolean zB = h1.b(this);
        int paddingTop = getPaddingTop();
        int i24 = i14 - i12;
        int paddingBottom = i24 - getPaddingBottom();
        int paddingBottom2 = (i24 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i25 = this.mGravity;
        int i26 = i25 & 112;
        boolean z11 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int iB = androidx.core.view.k.b(8388615 & i25, ViewCompat.A(this));
        char c13 = 2;
        char c14 = 1;
        if (iB != 1) {
            paddingLeft = iB != 5 ? getPaddingLeft() : ((getPaddingLeft() + i13) - i11) - this.mTotalLength;
        } else {
            paddingLeft = getPaddingLeft() + (((i13 - i11) - this.mTotalLength) / 2);
        }
        if (zB) {
            i15 = virtualChildCount - 1;
            i16 = -1;
        } else {
            i15 = 0;
            i16 = 1;
        }
        int i27 = 0;
        while (i27 < virtualChildCount) {
            int i28 = i15 + (i16 * i27);
            int i29 = i27;
            View virtualChildAt = getVirtualChildAt(i28);
            if (virtualChildAt == null) {
                paddingLeft += measureNullChild(i28);
                childrenSkipCount = i29;
                i17 = paddingTop;
                c11 = c13;
                c12 = c14;
            } else {
                c11 = c13;
                c12 = c14;
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight2 = virtualChildAt.getMeasuredHeight();
                    a aVar = (a) virtualChildAt.getLayoutParams();
                    int i31 = paddingLeft;
                    if (z11) {
                        i18 = measuredHeight2;
                        baseline = ((LinearLayout.LayoutParams) aVar).height != -1 ? virtualChildAt.getBaseline() : -1;
                        i19 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i19 < 0) {
                            i19 = i26;
                        }
                        i21 = i19 & 112;
                        i17 = paddingTop;
                        if (i21 != 16) {
                            if (i21 != 48) {
                                i22 = i17 + ((LinearLayout.LayoutParams) aVar).topMargin;
                                if (baseline != -1) {
                                    i22 += iArr[c12] - baseline;
                                }
                            } else if (i21 != 80) {
                                i22 = i17;
                            } else {
                                i22 = (paddingBottom - i18) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[c11] - (virtualChildAt.getMeasuredHeight() - baseline);
                                }
                            }
                            if (hasDividerBeforeChildAt(i28)) {
                                i23 = i31 + this.mDividerWidth;
                            } else {
                                i23 = i31;
                            }
                            int i32 = ((LinearLayout.LayoutParams) aVar).leftMargin + i23;
                            setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i32, i22, measuredWidth, i18);
                            int nextLocationOffset = i32 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                            childrenSkipCount = getChildrenSkipCount(virtualChildAt, i28) + i29;
                            paddingLeft = nextLocationOffset;
                        } else {
                            i22 = i17 + ((paddingBottom2 - i18) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        }
                        i22 -= measuredHeight;
                        if (hasDividerBeforeChildAt(i28)) {
                            i23 = i31 + this.mDividerWidth;
                        } else {
                            i23 = i31;
                        }
                        int i33 = ((LinearLayout.LayoutParams) aVar).leftMargin + i23;
                        setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i33, i22, measuredWidth, i18);
                        int nextLocationOffset2 = i33 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i28) + i29;
                        paddingLeft = nextLocationOffset2;
                    } else {
                        i18 = measuredHeight2;
                    }
                    i19 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i19 < 0) {
                        i19 = i26;
                    }
                    i21 = i19 & 112;
                    i17 = paddingTop;
                    if (i21 != 16) {
                        if (i21 != 48) {
                            i22 = i17 + ((LinearLayout.LayoutParams) aVar).topMargin;
                            if (baseline != -1) {
                                i22 += iArr[c12] - baseline;
                            }
                        } else if (i21 != 80) {
                            i22 = i17;
                        } else {
                            i22 = (paddingBottom - i18) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[c11] - (virtualChildAt.getMeasuredHeight() - baseline);
                            }
                        }
                        if (hasDividerBeforeChildAt(i28)) {
                            i23 = i31 + this.mDividerWidth;
                        } else {
                            i23 = i31;
                        }
                        int i34 = ((LinearLayout.LayoutParams) aVar).leftMargin + i23;
                        setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i34, i22, measuredWidth, i18);
                        int nextLocationOffset3 = i34 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i28) + i29;
                        paddingLeft = nextLocationOffset3;
                    } else {
                        i22 = i17 + ((paddingBottom2 - i18) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    }
                    i22 -= measuredHeight;
                    if (hasDividerBeforeChildAt(i28)) {
                        i23 = i31 + this.mDividerWidth;
                    } else {
                        i23 = i31;
                    }
                    int i35 = ((LinearLayout.LayoutParams) aVar).leftMargin + i23;
                    setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i35, i22, measuredWidth, i18);
                    int nextLocationOffset4 = i35 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + getNextLocationOffset(virtualChildAt);
                    childrenSkipCount = getChildrenSkipCount(virtualChildAt, i28) + i29;
                    paddingLeft = nextLocationOffset4;
                } else {
                    i17 = paddingTop;
                    childrenSkipCount = i29;
                }
            }
            i27 = childrenSkipCount + 1;
            c13 = c11;
            c14 = c12;
            paddingTop = i17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    void layoutVertical(int i11, int i12, int i13, int i14) {
        int paddingTop;
        int i15;
        int i16;
        int i17;
        int paddingLeft = getPaddingLeft();
        int i18 = i13 - i11;
        int paddingRight = i18 - getPaddingRight();
        int paddingRight2 = (i18 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i19 = this.mGravity;
        int i21 = i19 & 112;
        int i22 = i19 & 8388615;
        if (i21 != 16) {
            paddingTop = i21 != 80 ? getPaddingTop() : ((getPaddingTop() + i14) - i12) - this.mTotalLength;
        } else {
            paddingTop = getPaddingTop() + (((i14 - i12) - this.mTotalLength) / 2);
        }
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                paddingTop += measureNullChild(childrenSkipCount);
            } else {
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    a aVar = (a) virtualChildAt.getLayoutParams();
                    int i23 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i23 < 0) {
                        i23 = i22;
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
                        if (hasDividerBeforeChildAt(childrenSkipCount)) {
                            paddingTop += this.mDividerHeight;
                        }
                        int i25 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                        setChildFrame(virtualChildAt, i24, i25 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                        paddingTop = i25 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + getNextLocationOffset(virtualChildAt);
                        childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                    } else {
                        i15 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        i16 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    i17 = i15 - i16;
                    int i26 = i17;
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        paddingTop += this.mDividerHeight;
                    }
                    int i27 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    setChildFrame(virtualChildAt, i26, i27 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                    paddingTop = i27 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + getNextLocationOffset(virtualChildAt);
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                }
                childrenSkipCount++;
            }
            childrenSkipCount++;
        }
    }

    void measureChildBeforeLayout(View view, int i11, int i12, int i13, int i14, int i15) {
        measureChildWithMargins(view, i12, i13, i14, i15);
    }

    /* JADX WARN: Code duplicated, block: B:203:0x0461  */
    void measureHorizontal(int i11, int i12) {
        int i13;
        int i14;
        float f11;
        int i15;
        int i16;
        int i17;
        int i18;
        int iMax;
        int i19;
        int baseline;
        int i21;
        int i22;
        byte b11;
        int i23;
        int i24;
        int i25;
        boolean z11;
        View view;
        boolean z12;
        int baseline2;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z13 = this.mBaselineAligned;
        boolean z14 = this.mUseLargestChild;
        int i26 = 1073741824;
        boolean z15 = mode == 1073741824;
        boolean z16 = z14;
        int childrenSkipCount = 0;
        int i27 = 0;
        int iMax2 = 0;
        boolean z17 = false;
        int iCombineMeasuredStates = 0;
        boolean z18 = false;
        boolean z19 = true;
        float f12 = 0.0f;
        int iMax3 = 0;
        int iMax4 = 0;
        while (true) {
            i13 = i27;
            if (childrenSkipCount >= virtualChildCount) {
                break;
            }
            boolean z21 = z13;
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(childrenSkipCount);
            } else {
                if (virtualChildAt.getVisibility() == 8) {
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        this.mTotalLength += this.mDividerWidth;
                    }
                    a aVar = (a) virtualChildAt.getLayoutParams();
                    float f13 = ((LinearLayout.LayoutParams) aVar).weight;
                    float f14 = f12 + f13;
                    if (mode == i26 && ((LinearLayout.LayoutParams) aVar).width == 0 && f13 > BitmapDescriptorFactory.HUE_RED) {
                        if (z15) {
                            this.mTotalLength += ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin;
                        } else {
                            int i28 = this.mTotalLength;
                            this.mTotalLength = Math.max(i28, ((LinearLayout.LayoutParams) aVar).leftMargin + i28 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                        }
                        if (z21) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            virtualChildAt.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        } else {
                            z17 = true;
                        }
                        i24 = i13;
                        i25 = 1073741824;
                        z11 = z16;
                        view = virtualChildAt;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar).width != 0 || f13 <= BitmapDescriptorFactory.HUE_RED) {
                            b11 = -2;
                            i23 = Integer.MIN_VALUE;
                        } else {
                            b11 = -2;
                            ((LinearLayout.LayoutParams) aVar).width = -2;
                            i23 = 0;
                        }
                        virtualChildCount = virtualChildCount;
                        mode = mode;
                        iArr = iArr;
                        i24 = i13;
                        i25 = 1073741824;
                        z11 = z16;
                        iArr2 = iArr2;
                        int i29 = i23;
                        measureChildBeforeLayout(virtualChildAt, childrenSkipCount, i11, f14 == BitmapDescriptorFactory.HUE_RED ? this.mTotalLength : 0, i12, 0);
                        view = virtualChildAt;
                        if (i29 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar).width = i29;
                        }
                        int measuredWidth = view.getMeasuredWidth();
                        if (z15) {
                            this.mTotalLength += ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + getNextLocationOffset(view);
                        } else {
                            int i31 = this.mTotalLength;
                            this.mTotalLength = Math.max(i31, i31 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + getNextLocationOffset(view));
                        }
                        if (z11) {
                            iMax2 = Math.max(measuredWidth, iMax2);
                        }
                    }
                    if (mode2 == i25 || ((LinearLayout.LayoutParams) aVar).height != -1) {
                        z12 = false;
                    } else {
                        z12 = true;
                        z18 = true;
                    }
                    int i32 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    int measuredHeight = view.getMeasuredHeight() + i32;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (z21 && (baseline2 = view.getBaseline()) != -1) {
                        int i33 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i33 < 0) {
                            i33 = this.mGravity;
                        }
                        int i34 = (((i33 & 112) >> 4) & (-2)) >> 1;
                        iArr[i34] = Math.max(iArr[i34], baseline2);
                        iArr2[i34] = Math.max(iArr2[i34], measuredHeight - baseline2);
                    }
                    int iMax5 = Math.max(i24, measuredHeight);
                    z19 = z19 && ((LinearLayout.LayoutParams) aVar).height == -1;
                    if (((LinearLayout.LayoutParams) aVar).weight > BitmapDescriptorFactory.HUE_RED) {
                        if (!z12) {
                            i32 = measuredHeight;
                        }
                        iMax4 = Math.max(iMax4, i32);
                    } else {
                        if (z12 == 0) {
                            i32 = measuredHeight;
                        }
                        iMax3 = Math.max(iMax3, i32);
                    }
                    childrenSkipCount += getChildrenSkipCount(view, childrenSkipCount);
                    i27 = iMax5;
                    f12 = f14;
                }
                childrenSkipCount++;
                z16 = z11;
                iArr2 = iArr2;
                z13 = z21;
                mode = mode;
                iArr = iArr;
                virtualChildCount = virtualChildCount;
                i26 = 1073741824;
            }
            virtualChildCount = virtualChildCount;
            mode = mode;
            iArr = iArr;
            iArr2 = iArr2;
            i27 = i13;
            z11 = z16;
            childrenSkipCount++;
            z16 = z11;
            iArr2 = iArr2;
            z13 = z21;
            mode = mode;
            iArr = iArr;
            virtualChildCount = virtualChildCount;
            i26 = 1073741824;
        }
        boolean z22 = z13;
        int i35 = virtualChildCount;
        int i36 = mode;
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int i37 = iCombineMeasuredStates;
        boolean z23 = z16;
        if (this.mTotalLength > 0) {
            i14 = i35;
            if (hasDividerBeforeChildAt(i14)) {
                this.mTotalLength += this.mDividerWidth;
            }
        } else {
            i14 = i35;
        }
        int i38 = iArr3[1];
        int iMax6 = (i38 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? i13 : Math.max(i13, Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i38, iArr3[2]))) + Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))));
        if (z23) {
            i15 = i36;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                this.mTotalLength = 0;
                int childrenSkipCount2 = 0;
                while (childrenSkipCount2 < i14) {
                    View virtualChildAt2 = getVirtualChildAt(childrenSkipCount2);
                    if (virtualChildAt2 == null) {
                        this.mTotalLength += measureNullChild(childrenSkipCount2);
                    } else {
                        if (virtualChildAt2.getVisibility() == 8) {
                            childrenSkipCount2 += getChildrenSkipCount(virtualChildAt2, childrenSkipCount2);
                        } else {
                            a aVar2 = (a) virtualChildAt2.getLayoutParams();
                            if (z15) {
                                this.mTotalLength += ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + getNextLocationOffset(virtualChildAt2);
                            } else {
                                f12 = f12;
                                int i39 = this.mTotalLength;
                                this.mTotalLength = Math.max(i39, i39 + iMax2 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + getNextLocationOffset(virtualChildAt2));
                            }
                        }
                        childrenSkipCount2++;
                        f12 = f12;
                        iMax6 = iMax6;
                    }
                    childrenSkipCount2++;
                    f12 = f12;
                    iMax6 = iMax6;
                }
            }
            f11 = f12;
        } else {
            f11 = f12;
            i15 = i36;
        }
        int iMax7 = iMax6;
        int paddingLeft = this.mTotalLength + getPaddingLeft() + getPaddingRight();
        this.mTotalLength = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i11, 0);
        int i41 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
        if (z17 || (i41 != 0 && f11 > BitmapDescriptorFactory.HUE_RED)) {
            float f15 = this.mWeightSum;
            if (f15 > BitmapDescriptorFactory.HUE_RED) {
                f11 = f15;
            }
            iArr3[3] = -1;
            iArr3[2] = -1;
            iArr3[1] = -1;
            iArr3[0] = -1;
            iArr4[3] = -1;
            iArr4[2] = -1;
            iArr4[1] = -1;
            iArr4[0] = -1;
            this.mTotalLength = 0;
            int iCombineMeasuredStates2 = i37;
            int iMax8 = -1;
            int i42 = 0;
            while (i42 < i14) {
                View virtualChildAt3 = getVirtualChildAt(i42);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    iResolveSizeAndState = iResolveSizeAndState;
                } else {
                    a aVar3 = (a) virtualChildAt3.getLayoutParams();
                    float f16 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f16 > BitmapDescriptorFactory.HUE_RED) {
                        int i43 = (int) ((i41 * f16) / f11);
                        f11 -= f16;
                        i41 -= i43;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i22 = 1073741824;
                            if (i15 == 1073741824) {
                                if (i43 <= 0) {
                                    i43 = 0;
                                }
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i43, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & (-16777216));
                        } else {
                            i22 = 1073741824;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i43;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i22), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & (-16777216));
                    }
                    if (z15) {
                        this.mTotalLength += virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + getNextLocationOffset(virtualChildAt3);
                    } else {
                        int i44 = this.mTotalLength;
                        this.mTotalLength = Math.max(i44, virtualChildAt3.getMeasuredWidth() + i44 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + getNextLocationOffset(virtualChildAt3));
                    }
                    boolean z24 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i45 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i45;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z24) {
                        i45 = measuredHeight2;
                    }
                    int iMax9 = Math.max(iMax3, i45);
                    if (z19) {
                        i19 = -1;
                        boolean z25 = ((LinearLayout.LayoutParams) aVar3).height == -1;
                        if (z22 && (baseline = virtualChildAt3.getBaseline()) != i19) {
                            i21 = ((LinearLayout.LayoutParams) aVar3).gravity;
                            if (i21 < 0) {
                                i21 = this.mGravity;
                            }
                            int i46 = (((i21 & 112) >> 4) & (-2)) >> 1;
                            iArr3[i46] = Math.max(iArr3[i46], baseline);
                            iArr4[i46] = Math.max(iArr4[i46], measuredHeight2 - baseline);
                        }
                        iMax3 = iMax9;
                        z19 = z25;
                    } else {
                        i19 = -1;
                    }
                    if (z22) {
                        i21 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i21 < 0) {
                            i21 = this.mGravity;
                        }
                        int i47 = (((i21 & 112) >> 4) & (-2)) >> 1;
                        iArr3[i47] = Math.max(iArr3[i47], baseline);
                        iArr4[i47] = Math.max(iArr4[i47], measuredHeight2 - baseline);
                    }
                    iMax3 = iMax9;
                    z19 = z25;
                }
                i42++;
                iResolveSizeAndState = iResolveSizeAndState;
            }
            i16 = iResolveSizeAndState;
            i17 = -16777216;
            this.mTotalLength += getPaddingLeft() + getPaddingRight();
            int i48 = iArr3[1];
            iMax7 = (i48 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i48, iArr3[2]))) + Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))));
            i18 = iCombineMeasuredStates2;
            iMax = iMax3;
        } else {
            iMax = Math.max(iMax3, iMax4);
            if (z23 && i15 != 1073741824) {
                for (int i49 = 0; i49 < i14; i49++) {
                    View virtualChildAt4 = getVirtualChildAt(i49);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) virtualChildAt4.getLayoutParams())).weight > BitmapDescriptorFactory.HUE_RED) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i16 = iResolveSizeAndState;
            i18 = i37;
            i17 = -16777216;
        }
        if (z19 || mode2 == 1073741824) {
            iMax = iMax7;
        }
        setMeasuredDimension(i16 | (i18 & i17), View.resolveSizeAndState(Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i12, i18 << 16));
        if (z18) {
            forceUniformHeight(i14, i11);
        }
    }

    int measureNullChild(int i11) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0163  */
    void measureVertical(int i11, int i12) {
        int i13;
        int iMax;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        View view;
        boolean z11;
        int iMax2;
        boolean z12;
        int iMax3;
        int i24;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int i25 = this.mBaselineAlignedChildIndex;
        boolean z13 = this.mUseLargestChild;
        int childrenSkipCount = 0;
        int i26 = 0;
        int iMax4 = 0;
        int i27 = 0;
        int i28 = 0;
        int iMax5 = 0;
        boolean z14 = false;
        boolean z15 = false;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        boolean z16 = true;
        while (true) {
            int i29 = 8;
            if (childrenSkipCount >= virtualChildCount) {
                float f12 = f11;
                int i31 = i26;
                int i32 = virtualChildCount;
                int i33 = mode2;
                boolean z17 = z13;
                int i34 = iMax4;
                int iMax6 = i27;
                int iCombineMeasuredStates = i28;
                if (this.mTotalLength > 0) {
                    i13 = i32;
                    if (hasDividerBeforeChildAt(i13)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i13 = i32;
                }
                int i35 = i33;
                if (z17 && (i35 == Integer.MIN_VALUE || i35 == 0)) {
                    this.mTotalLength = 0;
                    int childrenSkipCount2 = 0;
                    while (childrenSkipCount2 < i13) {
                        View virtualChildAt = getVirtualChildAt(childrenSkipCount2);
                        if (virtualChildAt == null) {
                            this.mTotalLength += measureNullChild(childrenSkipCount2);
                        } else if (virtualChildAt.getVisibility() == i29) {
                            childrenSkipCount2 += getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                        } else {
                            a aVar = (a) virtualChildAt.getLayoutParams();
                            int i36 = this.mTotalLength;
                            this.mTotalLength = Math.max(i36, i36 + i34 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + getNextLocationOffset(virtualChildAt));
                        }
                        childrenSkipCount2++;
                        i29 = 8;
                    }
                }
                int paddingTop = this.mTotalLength + getPaddingTop() + getPaddingBottom();
                this.mTotalLength = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i12, 0);
                int i37 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
                if (z14 || (i37 != 0 && f12 > BitmapDescriptorFactory.HUE_RED)) {
                    float f13 = this.mWeightSum;
                    if (f13 <= BitmapDescriptorFactory.HUE_RED) {
                        f13 = f12;
                    }
                    this.mTotalLength = 0;
                    float f14 = f13;
                    int i38 = i37;
                    int i39 = 0;
                    while (i39 < i13) {
                        View virtualChildAt2 = getVirtualChildAt(i39);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i35 = i35;
                            i39 = i39;
                        } else {
                            a aVar2 = (a) virtualChildAt2.getLayoutParams();
                            float f15 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f15 > BitmapDescriptorFactory.HUE_RED) {
                                int i41 = (int) ((i38 * f15) / f14);
                                f14 -= f15;
                                i38 -= i41;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i15 = 1073741824;
                                    if (i35 == 1073741824) {
                                        virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i41 > 0 ? i41 : 0, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & (-256));
                                } else {
                                    i15 = 1073741824;
                                }
                                int measuredHeight = virtualChildAt2.getMeasuredHeight() + i41;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i15));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & (-256));
                            } else {
                                i35 = i35;
                            }
                            int i42 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i42;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            if (mode != 1073741824) {
                                i14 = -1;
                                if (((LinearLayout.LayoutParams) aVar2).width == -1) {
                                    measuredWidth = i42;
                                }
                            } else {
                                i14 = -1;
                            }
                            int iMax7 = Math.max(iMax5, measuredWidth);
                            boolean z18 = z16 && ((LinearLayout.LayoutParams) aVar2).width == i14;
                            int i43 = this.mTotalLength;
                            this.mTotalLength = Math.max(i43, i43 + virtualChildAt2.getMeasuredHeight() + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + getNextLocationOffset(virtualChildAt2));
                            iMax5 = iMax7;
                            z16 = z18;
                        }
                        i39++;
                        i35 = i35;
                    }
                    this.mTotalLength += getPaddingTop() + getPaddingBottom();
                    iMax = iMax5;
                } else {
                    iMax = Math.max(iMax5, i31);
                    if (z17 && i35 != 1073741824) {
                        for (int i44 = 0; i44 < i13; i44++) {
                            View virtualChildAt3 = getVirtualChildAt(i44);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) virtualChildAt3.getLayoutParams())).weight > BitmapDescriptorFactory.HUE_RED) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i34, 1073741824));
                            }
                        }
                    }
                }
                if (!z16 && mode != 1073741824) {
                    iMax6 = iMax;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax6 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i11, iCombineMeasuredStates), iResolveSizeAndState);
                if (z15) {
                    forceUniformWidth(i13, i12);
                    return;
                }
                return;
            }
            float f16 = f11;
            View virtualChildAt4 = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt4 == null) {
                this.mTotalLength += measureNullChild(childrenSkipCount);
            } else {
                if (virtualChildAt4.getVisibility() == 8) {
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt4, childrenSkipCount);
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                    a aVar3 = (a) virtualChildAt4.getLayoutParams();
                    float f17 = ((LinearLayout.LayoutParams) aVar3).weight;
                    float f18 = f16 + f17;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f17 > BitmapDescriptorFactory.HUE_RED) {
                        int i45 = this.mTotalLength;
                        this.mTotalLength = Math.max(i45, ((LinearLayout.LayoutParams) aVar3).topMargin + i45 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        iMax2 = i26;
                        i19 = virtualChildCount;
                        i21 = mode2;
                        z14 = true;
                        i23 = i27;
                        i22 = i28;
                        z11 = z13;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar3).height != 0 || f17 <= BitmapDescriptorFactory.HUE_RED) {
                            i16 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) aVar3).height = -2;
                            i16 = 0;
                        }
                        if (f18 == BitmapDescriptorFactory.HUE_RED) {
                            int i46 = i28;
                            i18 = this.mTotalLength;
                            i17 = i46;
                        } else {
                            i17 = i28;
                            i18 = 0;
                        }
                        int i47 = iMax4;
                        i19 = virtualChildCount;
                        i21 = mode2;
                        i22 = i17;
                        i23 = i27;
                        view = virtualChildAt4;
                        z11 = z13;
                        iMax2 = i26;
                        measureChildBeforeLayout(view, childrenSkipCount, i11, 0, i12, i18);
                        if (i16 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar3).height = i16;
                        }
                        int measuredHeight2 = view.getMeasuredHeight();
                        int i48 = this.mTotalLength;
                        this.mTotalLength = Math.max(i48, i48 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + getNextLocationOffset(view));
                        iMax4 = z11 ? Math.max(measuredHeight2, i47) : i47;
                    }
                    if (i25 >= 0 && i25 == childrenSkipCount + 1) {
                        view = virtualChildAt4;
                        this.mBaselineChildTop = this.mTotalLength;
                    }
                    if (childrenSkipCount < i25 && ((LinearLayout.LayoutParams) aVar3).weight > BitmapDescriptorFactory.HUE_RED) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar3).width != -1) {
                        z12 = false;
                    } else {
                        z12 = true;
                        z15 = true;
                    }
                    int i49 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i49;
                    iMax3 = Math.max(i23, measuredWidth2);
                    int i51 = iMax4;
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i22, view.getMeasuredState());
                    if (z16) {
                        i24 = iCombineMeasuredStates2;
                        z16 = ((LinearLayout.LayoutParams) aVar3).width == -1;
                        if (((LinearLayout.LayoutParams) aVar3).weight > BitmapDescriptorFactory.HUE_RED) {
                            if (!z12) {
                                i49 = measuredWidth2;
                            }
                            iMax2 = Math.max(iMax2, i49);
                        } else {
                            if (!z12) {
                                i49 = measuredWidth2;
                            }
                            iMax5 = Math.max(iMax5, i49);
                        }
                        childrenSkipCount += getChildrenSkipCount(view, childrenSkipCount);
                        f11 = f18;
                        iMax4 = i51;
                        i28 = i24;
                    } else {
                        i24 = iCombineMeasuredStates2;
                    }
                    if (((LinearLayout.LayoutParams) aVar3).weight > BitmapDescriptorFactory.HUE_RED) {
                        if (!z12) {
                            i49 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i49);
                    } else {
                        if (!z12) {
                            i49 = measuredWidth2;
                        }
                        iMax5 = Math.max(iMax5, i49);
                    }
                    childrenSkipCount += getChildrenSkipCount(view, childrenSkipCount);
                    f11 = f18;
                    iMax4 = i51;
                    i28 = i24;
                }
                childrenSkipCount++;
                i27 = iMax3;
                i26 = iMax2;
                z13 = z11;
                mode2 = i21;
                virtualChildCount = i19;
            }
            iMax2 = i26;
            i19 = virtualChildCount;
            i21 = mode2;
            z11 = z13;
            f11 = f16;
            iMax3 = i27;
            childrenSkipCount++;
            i27 = iMax3;
            i26 = iMax2;
            z13 = z11;
            mode2 = i21;
            virtualChildCount = i19;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.mOrientation == 1) {
            layoutVertical(i11, i12, i13, i14);
        } else {
            layoutHorizontal(i11, i12, i13, i14);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        if (this.mOrientation == 1) {
            measureVertical(i11, i12);
        } else {
            measureHorizontal(i11, i12);
        }
    }

    public void setBaselineAligned(boolean z11) {
        this.mBaselineAligned = z11;
    }

    public void setBaselineAlignedChildIndex(int i11) {
        if (i11 >= 0 && i11 < getChildCount()) {
            this.mBaselineAlignedChildIndex = i11;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i11) {
        this.mDividerPadding = i11;
    }

    public void setGravity(int i11) {
        if (this.mGravity != i11) {
            if ((8388615 & i11) == 0) {
                i11 |= 8388611;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            this.mGravity = i11;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i11) {
        int i12 = i11 & 8388615;
        int i13 = this.mGravity;
        if ((8388615 & i13) != i12) {
            this.mGravity = i12 | ((-8388616) & i13);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z11) {
        this.mUseLargestChild = z11;
    }

    public void setOrientation(int i11) {
        if (this.mOrientation != i11) {
            this.mOrientation = i11;
            requestLayout();
        }
    }

    public void setShowDividers(int i11) {
        if (i11 != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i11;
    }

    public void setVerticalGravity(int i11) {
        int i12 = i11 & 112;
        int i13 = this.mGravity;
        if ((i13 & 112) != i12) {
            this.mGravity = i12 | (i13 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f11) {
        this.mWeightSum = Math.max(BitmapDescriptorFactory.HUE_RED, f11);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public n0(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public a generateDefaultLayoutParams() {
        int i11 = this.mOrientation;
        if (i11 == 0) {
            return new a(-2, -2);
        }
        if (i11 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    public n0(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        b1 b1VarV = b1.v(context, attributeSet, i.j.f73927l1, i11, 0);
        ViewCompat.n0(this, context, i.j.f73927l1, attributeSet, b1VarV.r(), i11, 0);
        int iK = b1VarV.k(i.j.f73937n1, -1);
        if (iK >= 0) {
            setOrientation(iK);
        }
        int iK2 = b1VarV.k(i.j.f73932m1, -1);
        if (iK2 >= 0) {
            setGravity(iK2);
        }
        boolean zA = b1VarV.a(i.j.f73942o1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.mWeightSum = b1VarV.i(i.j.f73952q1, -1.0f);
        this.mBaselineAlignedChildIndex = b1VarV.k(i.j.f73947p1, -1);
        this.mUseLargestChild = b1VarV.a(i.j.f73967t1, false);
        setDividerDrawable(b1VarV.g(i.j.f73957r1));
        this.mShowDividers = b1VarV.k(i.j.f73972u1, 0);
        this.mDividerPadding = b1VarV.f(i.j.f73962s1, 0);
        b1VarV.w();
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }
}
