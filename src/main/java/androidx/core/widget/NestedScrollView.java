package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.f0;
import androidx.core.view.u;
import androidx.core.view.v;
import androidx.core.view.w;
import androidx.core.view.y;
import androidx.core.view.z;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import z5.q;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements y, v, ScrollingView {
    private static final float E = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final a F = new a();
    private static final int[] G = {R.attr.fillViewport};
    private float A;
    private e B;
    final d C;
    androidx.core.view.h D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f7873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f7874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f7875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private OverScroller f7876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f7877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f7878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    f0 f7879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f7881i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f7882j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f7883k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f7884l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private VelocityTracker f7885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f7886n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f7887o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f7888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f7889q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f7890r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f7891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int[] f7892t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int[] f7893u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f7894v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f7895w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private f f7896x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final z f7897y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final w f7898z;

    static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            q.a(accessibilityEvent, nestedScrollView.getScrollX());
            q.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int scrollRange;
            super.g(view, accessibilityNodeInfoCompat);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityNodeInfoCompat.t0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            accessibilityNodeInfoCompat.X0(true);
            if (nestedScrollView.getScrollY() > 0) {
                accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7755r);
                accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7754q);
                accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.E);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i11, Bundle bundle) {
            if (super.j(view, i11, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i11 != 4096) {
                if (i11 == 8192 || i11 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.R(0, iMax, true);
                    return true;
                }
                if (i11 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.R(0, iMin, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    private static final class c {
        public static void a(View view, float f11) {
            try {
                view.setFrameContentVelocity(f11);
            } catch (LinkageError unused) {
            }
        }
    }

    class d implements androidx.core.view.i {
        d() {
        }

        @Override // androidx.core.view.i
        public float a() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // androidx.core.view.i
        public boolean b(float f11) {
            if (f11 == BitmapDescriptorFactory.HUE_RED) {
                return false;
            }
            c();
            NestedScrollView.this.p((int) f11);
            return true;
        }

        @Override // androidx.core.view.i
        public void c() {
            NestedScrollView.this.f7876d.abortAnimation();
        }
    }

    public interface e {
        void a(NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14);
    }

    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7900a;

        class a implements Parcelable.Creator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i11) {
                return new f[i11];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f7900a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f7900a);
        }

        f(Parcel parcel) {
            super(parcel);
            this.f7900a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private boolean A(View view, int i11, int i12) {
        view.getDrawingRect(this.f7875c);
        offsetDescendantRectToMyCoords(view, this.f7875c);
        return this.f7875c.bottom + i11 >= getScrollY() && this.f7875c.top - i11 <= getScrollY() + i12;
    }

    private void B(int i11, int i12, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i11);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f7898z.e(0, scrollY2, 0, i11 - scrollY2, null, i12, iArr);
    }

    private void C(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f7891s) {
            int i11 = actionIndex == 0 ? 1 : 0;
            this.f7880h = (int) motionEvent.getY(i11);
            this.f7891s = motionEvent.getPointerId(i11);
            VelocityTracker velocityTracker = this.f7885m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void F() {
        VelocityTracker velocityTracker = this.f7885m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7885m = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    private int G(int i11, float f11) {
        float fD;
        int iRound;
        float width = f11 / getWidth();
        float height = i11 / getHeight();
        float fB = h.b(this.f7877e);
        float f12 = BitmapDescriptorFactory.HUE_RED;
        if (fB == BitmapDescriptorFactory.HUE_RED) {
            if (h.b(this.f7878f) != BitmapDescriptorFactory.HUE_RED) {
                fD = h.d(this.f7878f, height, 1.0f - width);
                if (h.b(this.f7878f) == BitmapDescriptorFactory.HUE_RED) {
                    this.f7878f.onRelease();
                }
            }
            iRound = Math.round(f12 * getHeight());
            if (iRound != 0) {
                invalidate();
            }
            return iRound;
        }
        fD = -h.d(this.f7877e, -height, width);
        if (h.b(this.f7877e) == BitmapDescriptorFactory.HUE_RED) {
            this.f7877e.onRelease();
        }
        f12 = fD;
        iRound = Math.round(f12 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    private void H(boolean z11) {
        if (z11) {
            S(2, 1);
        } else {
            U(1);
        }
        this.f7895w = getScrollY();
        postInvalidateOnAnimation();
    }

    private boolean I(int i11, int i12, int i13) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = height + scrollY;
        boolean z11 = false;
        boolean z12 = i11 == 33;
        View viewO = o(z12, i12, i13);
        if (viewO == null) {
            viewO = this;
        }
        if (i12 < scrollY || i13 > i14) {
            J(z12 ? i12 - scrollY : i13 - i14, 0, 1, true);
            z11 = true;
        }
        if (viewO != findFocus()) {
            viewO.requestFocus(i11);
        }
        return z11;
    }

    private int J(int i11, int i12, int i13, boolean z11) {
        return K(i11, -1, null, i12, i13, z11);
    }

    private void L(View view) {
        view.getDrawingRect(this.f7875c);
        offsetDescendantRectToMyCoords(view, this.f7875c);
        int iG = g(this.f7875c);
        if (iG != 0) {
            scrollBy(0, iG);
        }
    }

    private boolean M(Rect rect, boolean z11) {
        int iG = g(rect);
        boolean z12 = iG != 0;
        if (z12) {
            if (z11) {
                scrollBy(0, iG);
                return z12;
            }
            O(0, iG);
        }
        return z12;
    }

    private boolean N(EdgeEffect edgeEffect, int i11) {
        if (i11 > 0) {
            return true;
        }
        return r(-i11) < h.b(edgeEffect) * ((float) getHeight());
    }

    private void P(int i11, int i12, int i13, boolean z11) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f7874b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f7876d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i12 + scrollY, Math.max(0, height - height2))) - scrollY, i13);
            H(z11);
        } else {
            if (!this.f7876d.isFinished()) {
                a();
            }
            scrollBy(i11, i12);
        }
        this.f7874b = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean T(MotionEvent motionEvent) {
        boolean z11;
        if (h.b(this.f7877e) != BitmapDescriptorFactory.HUE_RED) {
            h.d(this.f7877e, BitmapDescriptorFactory.HUE_RED, motionEvent.getX() / getWidth());
            z11 = true;
        } else {
            z11 = false;
        }
        if (h.b(this.f7878f) == BitmapDescriptorFactory.HUE_RED) {
            return z11;
        }
        h.d(this.f7878f, BitmapDescriptorFactory.HUE_RED, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f7876d.abortAnimation();
        U(1);
    }

    private boolean d() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0);
    }

    private boolean e() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    private static int f(int i11, int i12, int i13) {
        if (i12 >= i13 || i11 < 0) {
            return 0;
        }
        return i12 + i11 > i13 ? i13 - i12 : i11;
    }

    private f0 getScrollFeedbackProvider() {
        if (this.f7879g == null) {
            this.f7879g = f0.a(this);
        }
        return this.f7879g;
    }

    private void k(int i11) {
        if (i11 != 0) {
            if (this.f7887o) {
                O(0, i11);
            } else {
                scrollBy(0, i11);
            }
        }
    }

    private boolean l(int i11) {
        if (h.b(this.f7877e) != BitmapDescriptorFactory.HUE_RED) {
            if (N(this.f7877e, i11)) {
                this.f7877e.onAbsorb(i11);
                return true;
            }
            p(-i11);
            return true;
        }
        if (h.b(this.f7878f) == BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        int i12 = -i11;
        if (N(this.f7878f, i12)) {
            this.f7878f.onAbsorb(i12);
            return true;
        }
        p(i12);
        return true;
    }

    private void m() {
        this.f7891s = -1;
        this.f7884l = false;
        F();
        U(0);
        this.f7877e.onRelease();
        this.f7878f.onRelease();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    private View o(boolean z11, int i11, int i12) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = focusables.get(i13);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z13 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13 && z14) {
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else if (z14) {
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private float r(int i11) {
        double dLog = Math.log((Math.abs(i11) * 0.35f) / (this.f7873a * 0.015f));
        float f11 = E;
        return (float) (((double) (this.f7873a * 0.015f)) * Math.exp((((double) f11) / (((double) f11) - 1.0d)) * dLog));
    }

    private boolean t(int i11, int i12) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i12 >= childAt.getTop() - scrollY && i12 < childAt.getBottom() - scrollY && i11 >= childAt.getLeft() && i11 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    private void u() {
        VelocityTracker velocityTracker = this.f7885m;
        if (velocityTracker == null) {
            this.f7885m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void v() {
        this.f7876d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f7888p = viewConfiguration.getScaledTouchSlop();
        this.f7889q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7890r = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void w() {
        if (this.f7885m == null) {
            this.f7885m = VelocityTracker.obtain();
        }
    }

    private void x(int i11, int i12) {
        this.f7880h = i11;
        this.f7891s = i12;
        S(2, 0);
    }

    private boolean y(View view) {
        return !A(view, 0, getHeight());
    }

    private static boolean z(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && z((View) parent, view2);
    }

    boolean D(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z11) {
        boolean z12;
        boolean z13;
        int i19;
        int overScrollMode = getOverScrollMode();
        boolean z14 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z15 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        boolean z17 = overScrollMode == 0 || (overScrollMode == 1 && z15);
        int i21 = i13 + i11;
        int i22 = !z16 ? 0 : i17;
        int i23 = i14 + i12;
        int i24 = !z17 ? 0 : i18;
        int i25 = -i22;
        int i26 = i22 + i15;
        int i27 = -i24;
        int i28 = i24 + i16;
        if (i21 > i26) {
            i21 = i26;
            z12 = true;
        } else if (i21 < i25) {
            z12 = true;
            i21 = i25;
        } else {
            z12 = false;
        }
        if (i23 > i28) {
            i23 = i28;
            z13 = true;
        } else if (i23 < i27) {
            z13 = true;
            i23 = i27;
        } else {
            z13 = false;
        }
        if (!z13 || s(1)) {
            i19 = i21;
        } else {
            int i29 = i21;
            this.f7876d.springBack(i29, i23, 0, 0, 0, getScrollRange());
            i19 = i29;
        }
        onOverScrolled(i19, i23, z12, z13);
        return z12 || z13;
    }

    public boolean E(int i11) {
        boolean z11 = i11 == 130;
        int height = getHeight();
        if (z11) {
            this.f7875c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f7875c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f7875c.top = getScrollY() - height;
            Rect rect2 = this.f7875c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f7875c;
        int i12 = rect3.top;
        int i13 = height + i12;
        rect3.bottom = i13;
        return I(i11, i12, i13);
    }

    int K(int i11, int i12, MotionEvent motionEvent, int i13, int i14, boolean z11) {
        int i15;
        int i16;
        VelocityTracker velocityTracker;
        if (i14 == 1) {
            S(2, i14);
        }
        boolean z12 = false;
        if (i(0, i11, this.f7893u, this.f7892t, i14)) {
            int i17 = i11 - this.f7893u[1];
            i16 = this.f7892t[1];
            i15 = i17;
        } else {
            i15 = i11;
            i16 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z13 = d() && !z11;
        int i18 = i15;
        boolean z14 = D(0, i15, 0, scrollY, 0, scrollRange, 0, 0, true) && !s(i14);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().c(motionEvent.getDeviceId(), motionEvent.getSource(), i12, scrollY2);
        }
        int[] iArr = this.f7893u;
        iArr[1] = 0;
        j(0, scrollY2, 0, i18 - scrollY2, this.f7892t, i14, iArr);
        int i19 = i16 + this.f7892t[1];
        int i21 = i18 - this.f7893u[1];
        int i22 = scrollY + i21;
        if (i22 < 0) {
            if (z13) {
                h.d(this.f7877e, (-i21) / getHeight(), i13 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().b(motionEvent.getDeviceId(), motionEvent.getSource(), i12, true);
                }
                if (!this.f7878f.isFinished()) {
                    this.f7878f.onRelease();
                }
            }
        } else if (i22 > scrollRange && z13) {
            h.d(this.f7878f, i21 / getHeight(), 1.0f - (i13 / getWidth()));
            if (motionEvent != null) {
                getScrollFeedbackProvider().b(motionEvent.getDeviceId(), motionEvent.getSource(), i12, false);
            }
            if (!this.f7877e.isFinished()) {
                this.f7877e.onRelease();
            }
        }
        if (this.f7877e.isFinished() && this.f7878f.isFinished()) {
            z12 = z14;
        } else {
            postInvalidateOnAnimation();
        }
        if (z12 && i14 == 0 && (velocityTracker = this.f7885m) != null) {
            velocityTracker.clear();
        }
        if (i14 == 1) {
            U(i14);
            this.f7877e.onRelease();
            this.f7878f.onRelease();
        }
        return i19;
    }

    public final void O(int i11, int i12) {
        P(i11, i12, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, false);
    }

    void Q(int i11, int i12, int i13, boolean z11) {
        P(i11 - getScrollX(), i12 - getScrollY(), i13, z11);
    }

    void R(int i11, int i12, boolean z11) {
        Q(i11, i12, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, z11);
    }

    public boolean S(int i11, int i12) {
        return this.f7898z.p(i11, i12);
    }

    public void U(int i11) {
        this.f7898z.r(i11);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean c(int i11) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i11);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !A(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i11 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i11 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i11 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            J(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f7875c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f7875c);
            J(g(this.f7875c), 0, 1, true);
            viewFindNextFocus.requestFocus(i11);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && y(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f7876d.isFinished()) {
            return;
        }
        this.f7876d.computeScrollOffset();
        int currY = this.f7876d.getCurrY();
        int iH = h(currY - this.f7895w);
        this.f7895w = currY;
        int[] iArr = this.f7893u;
        iArr[1] = 0;
        i(0, iH, iArr, null, 1);
        int i11 = iH - this.f7893u[1];
        int scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            c.a(this, Math.abs(this.f7876d.getCurrVelocity()));
        }
        if (i11 != 0) {
            int scrollY = getScrollY();
            D(0, i11, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i12 = i11 - scrollY2;
            int[] iArr2 = this.f7893u;
            iArr2[1] = 0;
            j(0, scrollY2, 0, i12, this.f7892t, 1, iArr2);
            i11 = i12 - this.f7893u[1];
        }
        if (i11 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i11 < 0) {
                    if (this.f7877e.isFinished()) {
                        this.f7877e.onAbsorb((int) this.f7876d.getCurrVelocity());
                    }
                } else if (this.f7878f.isFinished()) {
                    this.f7878f.onAbsorb((int) this.f7876d.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f7876d.isFinished()) {
            U(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || n(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return this.f7898z.a(f11, f12, z11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f11, float f12) {
        return this.f7898z.b(f11, f12);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return i(i11, i12, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return this.f7898z.f(i11, i12, i13, i14, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f7877e.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f7877e.setSize(width, height);
            if (this.f7877e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f7878f.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, BitmapDescriptorFactory.HUE_RED);
        this.f7878f.setSize(width2, height2);
        if (this.f7878f.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    protected int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i11 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i12 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i11 - verticalFadingEdgeLength : i11;
        int i13 = rect.bottom;
        if (i13 > i12 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i12, (childAt.getBottom() + layoutParams.bottomMargin) - i11);
        }
        if (rect.top >= scrollY || i13 >= i12) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i12 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f7897y.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    float getVerticalScrollFactorCompat() {
        if (this.A == BitmapDescriptorFactory.HUE_RED) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.A;
    }

    int h(int i11) {
        int height = getHeight();
        if (i11 > 0 && h.b(this.f7877e) != BitmapDescriptorFactory.HUE_RED) {
            int iRound = Math.round(((-height) / 4.0f) * h.d(this.f7877e, ((-i11) * 4.0f) / height, 0.5f));
            if (iRound != i11) {
                this.f7877e.finish();
            }
            return i11 - iRound;
        }
        if (i11 >= 0 || h.b(this.f7878f) == BitmapDescriptorFactory.HUE_RED) {
            return i11;
        }
        float f11 = height;
        int iRound2 = Math.round((f11 / 4.0f) * h.d(this.f7878f, (i11 * 4.0f) / f11, 0.5f));
        if (iRound2 != i11) {
            this.f7878f.finish();
        }
        return i11 - iRound2;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return s(0);
    }

    public boolean i(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        return this.f7898z.d(i11, i12, iArr, iArr2, i13);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f7898z.l();
    }

    public void j(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        this.f7898z.e(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i11, int i12) {
        view.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public boolean n(KeyEvent keyEvent) {
        this.f7875c.setEmpty();
        boolean zE = e();
        int i11 = EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE;
        if (!zE) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? q(33) : c(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? q(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE) : c(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
            }
            if (keyCode == 62) {
                if (keyEvent.isShiftPressed()) {
                    i11 = 33;
                }
                E(i11);
                return false;
            }
            if (keyCode == 92) {
                return q(33);
            }
            if (keyCode == 93) {
                return q(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
            }
            if (keyCode == 122) {
                E(33);
                return false;
            }
            if (keyCode == 123) {
                E(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
                return false;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7882j = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i11;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f7884l) {
            if (u.b(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i11 = 9;
                width = (int) motionEvent.getX();
            } else if (u.b(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i11 = 26;
                axisValue = axisValue2;
            } else {
                i11 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != BitmapDescriptorFactory.HUE_RED) {
                K(-((int) (axisValue * getVerticalScrollFactorCompat())), i11, motionEvent, width, 1, u.b(motionEvent, 8194));
                if (i11 == 0) {
                    return true;
                }
                this.D.g(motionEvent, i11);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action == 2 && this.f7884l) {
            return true;
        }
        int i11 = action & 255;
        if (i11 == 0) {
            int y11 = (int) motionEvent.getY();
            if (t((int) motionEvent.getX(), y11)) {
                this.f7880h = y11;
                this.f7891s = motionEvent.getPointerId(0);
                u();
                this.f7885m.addMovement(motionEvent);
                this.f7876d.computeScrollOffset();
                if (!T(motionEvent) && this.f7876d.isFinished()) {
                    z11 = false;
                }
                this.f7884l = z11;
                S(2, 0);
            } else {
                if (!T(motionEvent) && this.f7876d.isFinished()) {
                    z11 = false;
                }
                this.f7884l = z11;
                F();
            }
        } else if (i11 == 1) {
            this.f7884l = false;
            this.f7891s = -1;
            F();
            if (this.f7876d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            U(0);
        } else if (i11 == 2) {
            int i12 = this.f7891s;
            if (i12 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i12);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i12 + " in onInterceptTouchEvent");
                } else {
                    int y12 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y12 - this.f7880h) > this.f7888p && (2 & getNestedScrollAxes()) == 0) {
                        this.f7884l = true;
                        this.f7880h = y12;
                        w();
                        this.f7885m.addMovement(motionEvent);
                        this.f7894v = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i11 == 3) {
            this.f7884l = false;
            this.f7891s = -1;
            F();
            if (this.f7876d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            U(0);
        } else if (i11 == 6) {
            C(motionEvent);
        }
        return this.f7884l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        int measuredHeight = 0;
        this.f7881i = false;
        View view = this.f7883k;
        if (view != null && z(view, this)) {
            L(this.f7883k);
        }
        this.f7883k = null;
        if (!this.f7882j) {
            if (this.f7896x != null) {
                scrollTo(getScrollX(), this.f7896x.f7900a);
                this.f7896x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i14 - i12) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iF = f(scrollY, paddingTop, measuredHeight);
            if (iF != scrollY) {
                scrollTo(getScrollX(), iF);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f7882j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f7886n && View.MeasureSpec.getMode(i12) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        if (z11) {
            return false;
        }
        dispatchNestedFling(BitmapDescriptorFactory.HUE_RED, f12, true);
        p((int) f12);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f11, float f12) {
        return dispatchNestedPreFling(f11, f12);
    }

    @Override // androidx.core.view.x
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr, int i13) {
        i(i11, i12, iArr, null, i13);
    }

    @Override // androidx.core.view.y
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        B(i14, i15, iArr);
    }

    @Override // androidx.core.view.x
    public void onNestedScrollAccepted(View view, View view2, int i11, int i12) {
        this.f7897y.c(view, view2, i11, i12);
        S(2, i12);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i11, int i12, boolean z11, boolean z12) {
        super.scrollTo(i11, i12);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i11, Rect rect) {
        if (i11 == 2) {
            i11 = EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE;
        } else if (i11 == 1) {
            i11 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i11) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i11);
        if (viewFindNextFocus == null || y(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i11, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.f7896x = fVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f7900a = getScrollY();
        return fVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        e eVar = this.B;
        if (eVar != null) {
            eVar.a(this, i11, i12, i13, i14);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !A(viewFindFocus, 0, i14)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f7875c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f7875c);
        k(g(this.f7875c));
    }

    @Override // androidx.core.view.x
    public boolean onStartNestedScroll(View view, View view2, int i11, int i12) {
        return (i11 & 2) != 0;
    }

    @Override // androidx.core.view.x
    public void onStopNestedScroll(View view, int i11) {
        this.f7897y.e(view, i11);
        U(i11);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        NestedScrollView nestedScrollView;
        ViewParent parent;
        w();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7894v = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(BitmapDescriptorFactory.HUE_RED, this.f7894v);
        if (actionMasked == 0) {
            nestedScrollView = this;
            if (getChildCount() == 0) {
                return false;
            }
            if (nestedScrollView.f7884l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!nestedScrollView.f7876d.isFinished()) {
                a();
            }
            x((int) motionEvent.getY(), motionEvent.getPointerId(0));
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f7891s);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f7891s + " in onTouchEvent");
                } else {
                    int y11 = (int) motionEvent.getY(iFindPointerIndex);
                    int i11 = this.f7880h - y11;
                    int iG = i11 - G(i11, motionEvent.getX(iFindPointerIndex));
                    if (!this.f7884l && Math.abs(iG) > this.f7888p) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f7884l = true;
                        iG = iG > 0 ? iG - this.f7888p : iG + this.f7888p;
                    }
                    int i12 = iG;
                    if (this.f7884l) {
                        nestedScrollView = this;
                        int iK = nestedScrollView.K(i12, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        nestedScrollView.f7880h = y11 - iK;
                        nestedScrollView.f7894v += iK;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f7884l && getChildCount() > 0 && this.f7876d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f7880h = (int) motionEvent.getY(actionIndex);
                this.f7891s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                C(motionEvent);
                this.f7880h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f7891s));
            }
            nestedScrollView = this;
        } else {
            nestedScrollView = this;
            VelocityTracker velocityTracker = nestedScrollView.f7885m;
            velocityTracker.computeCurrentVelocity(1000, nestedScrollView.f7890r);
            int yVelocity = (int) velocityTracker.getYVelocity(nestedScrollView.f7891s);
            if (Math.abs(yVelocity) >= nestedScrollView.f7889q) {
                if (!l(yVelocity)) {
                    int i13 = -yVelocity;
                    float f11 = i13;
                    if (!dispatchNestedPreFling(BitmapDescriptorFactory.HUE_RED, f11)) {
                        dispatchNestedFling(BitmapDescriptorFactory.HUE_RED, f11, true);
                        p(i13);
                    }
                }
            } else if (nestedScrollView.f7876d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m();
        }
        VelocityTracker velocityTracker2 = nestedScrollView.f7885m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public void p(int i11) {
        if (getChildCount() > 0) {
            this.f7876d.fling(getScrollX(), getScrollY(), 0, i11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            H(true);
            if (Build.VERSION.SDK_INT >= 35) {
                c.a(this, Math.abs(this.f7876d.getCurrVelocity()));
            }
        }
    }

    public boolean q(int i11) {
        int childCount;
        boolean z11 = i11 == 130;
        int height = getHeight();
        Rect rect = this.f7875c;
        rect.top = 0;
        rect.bottom = height;
        if (z11 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f7875c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f7875c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f7875c;
        return I(i11, rect3.top, rect3.bottom);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f7881i) {
            this.f7883k = view2;
        } else {
            L(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return M(rect, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        if (z11) {
            F();
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f7881i = true;
        super.requestLayout();
    }

    public boolean s(int i11) {
        return this.f7898z.k(i11);
    }

    @Override // android.view.View
    public void scrollTo(int i11, int i12) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iF = f(i11, width, width2);
            int iF2 = f(i12, height, height2);
            if (iF == getScrollX() && iF2 == getScrollY()) {
                return;
            }
            super.scrollTo(iF, iF2);
        }
    }

    public void setFillViewport(boolean z11) {
        if (z11 != this.f7886n) {
            this.f7886n = z11;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z11) {
        this.f7898z.m(z11);
    }

    public void setOnScrollChangeListener(e eVar) {
        this.B = eVar;
    }

    public void setSmoothScrollingEnabled(boolean z11) {
        this.f7887o = z11;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i11) {
        return S(i11, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        U(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h5.a.f70776c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        onNestedPreScroll(view, i11, i12, iArr, 0);
    }

    @Override // androidx.core.view.x
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14, int i15) {
        B(i14, i15, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        return onStartNestedScroll(view, view2, i11, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f7875c = new Rect();
        this.f7881i = true;
        this.f7882j = false;
        this.f7883k = null;
        this.f7884l = false;
        this.f7887o = true;
        this.f7891s = -1;
        this.f7892t = new int[2];
        this.f7893u = new int[2];
        d dVar = new d();
        this.C = dVar;
        this.D = new androidx.core.view.h(getContext(), dVar);
        this.f7877e = h.a(context, attributeSet);
        this.f7878f = h.a(context, attributeSet);
        this.f7873a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        v();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G, i11, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f7897y = new z(this);
        this.f7898z = new w(this);
        setNestedScrollingEnabled(true);
        ViewCompat.p0(this, F);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        B(i14, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        onNestedScrollAccepted(view, view2, i11, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11) {
        if (getChildCount() <= 0) {
            super.addView(view, i11);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i11, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
