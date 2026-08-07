package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TypedValue f2482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TypedValue f2483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f2484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TypedValue f2485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f2486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TypedValue f2487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f2488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f2489h;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2486e == null) {
            this.f2486e = new TypedValue();
        }
        return this.f2486e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2487f == null) {
            this.f2487f = new TypedValue();
        }
        return this.f2487f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2484c == null) {
            this.f2484c = new TypedValue();
        }
        return this.f2484c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2485d == null) {
            this.f2485d = new TypedValue();
        }
        return this.f2485d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2482a == null) {
            this.f2482a = new TypedValue();
        }
        return this.f2482a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2483b == null) {
            this.f2483b = new TypedValue();
        }
        return this.f2483b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f2489h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f2489h;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        boolean z11;
        int i13;
        int i14;
        float fraction;
        int i15;
        int i16;
        float fraction2;
        int i17;
        int i18;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z12 = true;
        boolean z13 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        if (mode != Integer.MIN_VALUE) {
            z11 = false;
        } else {
            TypedValue typedValue = z13 ? this.f2485d : this.f2484c;
            if (typedValue == null || (i17 = typedValue.type) == 0) {
                z11 = false;
            } else {
                if (i17 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i17 == 6) {
                        int i19 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i19, i19);
                    } else {
                        i18 = 0;
                    }
                    if (i18 > 0) {
                        Rect rect = this.f2488g;
                        i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i18 - (rect.left + rect.right), View.MeasureSpec.getSize(i11)), 1073741824);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                i18 = (int) fraction3;
                if (i18 > 0) {
                    Rect rect2 = this.f2488g;
                    i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i18 - (rect2.left + rect2.right), View.MeasureSpec.getSize(i11)), 1073741824);
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z13 ? this.f2486e : this.f2487f;
            if (typedValue2 != null && (i15 = typedValue2.type) != 0) {
                if (i15 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i15 == 6) {
                        int i21 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i21, i21);
                    } else {
                        i16 = 0;
                    }
                    if (i16 > 0) {
                        Rect rect3 = this.f2488g;
                        i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect3.top + rect3.bottom), View.MeasureSpec.getSize(i12)), 1073741824);
                    }
                }
                i16 = (int) fraction2;
                if (i16 > 0) {
                    Rect rect4 = this.f2488g;
                    i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect4.top + rect4.bottom), View.MeasureSpec.getSize(i12)), 1073741824);
                }
            }
        }
        super.onMeasure(i11, i12);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z11 || mode != Integer.MIN_VALUE) {
            z12 = false;
        } else {
            TypedValue typedValue3 = z13 ? this.f2483b : this.f2482a;
            if (typedValue3 == null || (i13 = typedValue3.type) == 0) {
                z12 = false;
            } else {
                if (i13 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i13 == 6) {
                        int i22 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i22, i22);
                    } else {
                        i14 = 0;
                    }
                    if (i14 > 0) {
                        Rect rect5 = this.f2488g;
                        i14 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i14) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                    } else {
                        z12 = false;
                    }
                }
                i14 = (int) fraction;
                if (i14 > 0) {
                    Rect rect6 = this.f2488g;
                    i14 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i14) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                } else {
                    z12 = false;
                }
            }
        }
        if (z12) {
            super.onMeasure(iMakeMeasureSpec, i12);
        }
    }

    public void setAttachListener(a aVar) {
        this.f2489h = aVar;
    }

    public void setDecorPadding(int i11, int i12, int i13, int i14) {
        this.f2488g.set(i11, i12, i13, i14);
        if (ViewCompat.U(this)) {
            requestLayout();
        }
    }

    public ContentFrameLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f2488g = new Rect();
    }
}
