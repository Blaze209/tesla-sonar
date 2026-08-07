package com.facebook.react.views.scroll;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.e0;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.u0;
import com.facebook.react.uimanager.w;
import com.facebook.react.uimanager.x;
import com.facebook.react.uimanager.z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import so.n;
import so.p;

/* JADX INFO: loaded from: classes4.dex */
public class f extends HorizontalScrollView implements z, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, d, e0, j.c, j.e, j.a, j.b, j.d {
    private static boolean J = false;
    private static String K = "f";
    private static int L = Integer.MIN_VALUE;
    private static Field M = null;
    private static boolean N = false;
    private u0 A;
    private final j.h B;
    private final ValueAnimator C;
    private x D;
    private long E;
    private int F;
    private View G;
    private com.facebook.react.views.scroll.b H;
    private final Rect I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f23549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OverScroller f23550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f23551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f23552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Rect f23554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p f23555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23557j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Runnable f23558k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23559l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f23560m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f23561n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f23562o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f23563p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23564q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f23565r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f23566s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<Integer> f23567t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f23568u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f23569v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f23570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f23571x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f23572y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f23573z;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f23574a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23575b = 0;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeAnimatedModule nativeAnimatedModule;
            if (f.this.f23553f) {
                f.this.f23553f = false;
                this.f23575b = 0;
                ViewCompat.i0(f.this, this, 20L);
                return;
            }
            j.s(f.this);
            int i11 = this.f23575b + 1;
            this.f23575b = i11;
            if (i11 < 3) {
                if (f.this.f23557j && !this.f23574a) {
                    this.f23574a = true;
                    f.this.t(0);
                }
                ViewCompat.i0(f.this, this, 20L);
                return;
            }
            f.this.f23558k = null;
            if (f.this.f23561n) {
                j.j(f.this);
            }
            ReactContext reactContext = (ReactContext) f.this.getContext();
            if (reactContext != null && (nativeAnimatedModule = (NativeAnimatedModule) reactContext.getNativeModule(NativeAnimatedModule.class)) != null) {
                nativeAnimatedModule.userDrivenScrollEnded(f.this.getId());
            }
            f.this.o();
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23577a;

        static {
            int[] iArr = new int[p.values().length];
            f23577a = iArr;
            try {
                iArr[p.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23577a[p.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23577a[p.VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(Context context) {
        this(context, null);
    }

    private boolean A(View view) {
        int iW = w(view);
        view.getDrawingRect(this.I);
        return iW != 0 && Math.abs(iW) < this.I.width() / 2;
    }

    private boolean B() {
        return false;
    }

    private boolean C(View view) {
        return w(view) == 0;
    }

    private int D(int i11) {
        return getFlingAnimator() == this.C ? j.p(this, i11, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0).x : j.m(this, getScrollX(), getReactScrollViewScrollState().getFinalAnimatedPositionScroll().x, i11) + u(i11);
    }

    private void E(int i11, int i12) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.f23550c;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        int currX = this.f23550c.getCurrX();
        boolean zComputeScrollOffset = this.f23550c.computeScrollOffset();
        this.f23550c.forceFinished(true);
        if (!zComputeScrollOffset) {
            scrollTo((this.f23550c.getCurrX() - currX) + i11, getScrollY());
            return;
        }
        this.f23550c.fling(i11, getScrollY(), (int) (this.f23550c.getCurrVelocity() * Math.signum(this.f23550c.getFinalX() - this.f23550c.getStartX())), 0, 0, i12, 0, 0);
    }

    private void F(View view) {
        int iW = w(view);
        if (iW != 0) {
            scrollBy(iW, 0);
        }
    }

    private void G(int i11, int i12) {
        if (J) {
            qk.a.u(K, "setPendingContentOffsets[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        if (z()) {
            this.f23572y = -1;
            this.f23573z = -1;
        } else {
            this.f23572y = i11;
            this.f23573z = i12;
        }
    }

    private void H(int i11) {
        if (J) {
            qk.a.t(K, "smoothScrollAndSnap[%d] velocity %d", Integer.valueOf(getId()), Integer.valueOf(i11));
        }
        double snapInterval = getSnapInterval();
        double dM = j.m(this, getScrollX(), getReactScrollViewScrollState().getFinalAnimatedPositionScroll().x, i11);
        double D = D(i11);
        double d11 = dM / snapInterval;
        int iFloor = (int) Math.floor(d11);
        int iCeil = (int) Math.ceil(d11);
        int iRound = (int) Math.round(d11);
        int iRound2 = (int) Math.round(D / snapInterval);
        if (i11 > 0 && iCeil == iFloor) {
            iCeil++;
        } else if (i11 < 0 && iFloor == iCeil) {
            iFloor--;
        }
        if (i11 > 0 && iRound < iCeil && iRound2 > iFloor) {
            iRound = iCeil;
        } else if (i11 < 0 && iRound > iFloor && iRound2 < iCeil) {
            iRound = iFloor;
        }
        double d12 = ((double) iRound) * snapInterval;
        if (d12 != dM) {
            this.f23553f = true;
            b((int) d12, getScrollY());
        }
    }

    private void I(int i11) {
        if (J) {
            qk.a.t(K, "smoothScrollToNextPage[%d] direction %d", Integer.valueOf(getId()), Integer.valueOf(i11));
        }
        int width = getWidth();
        int scrollX = getScrollX();
        int i12 = scrollX / width;
        if (scrollX % width != 0) {
            i12++;
        }
        int i13 = i11 == 17 ? i12 - 1 : i12 + 1;
        if (i13 < 0) {
            i13 = 0;
        }
        b(i13 * width, getScrollY());
        y(0, 0);
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private OverScroller getOverScrollerFromParent() {
        if (!N) {
            N = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                M = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                qk.a.I(K, "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = M;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    qk.a.I(K, "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e11);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i11 = this.f23566s;
        return i11 != 0 ? i11 : getWidth();
    }

    private void m(int i11, int i12, int i13, int i14) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().end();
        }
        int i15 = i12 - i11;
        int scrollX = i15 - (i14 - getScrollX());
        scrollTo(scrollX, getScrollY());
        E(scrollX, i15 - getWidth());
    }

    private void n() {
        Runnable runnable = this.f23558k;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f23558k = null;
            getFlingAnimator().cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (B()) {
            gn.a.c(null);
            gn.a.c(this.f23562o);
            throw null;
        }
    }

    private void p() {
        if (B()) {
            gn.a.c(null);
            gn.a.c(this.f23562o);
            throw null;
        }
    }

    private static HorizontalScrollView q(View view, MotionEvent motionEvent) {
        return r(view, motionEvent, true);
    }

    private static HorizontalScrollView r(View view, MotionEvent motionEvent, boolean z11) {
        if (view == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return null;
        }
        if (!z11 && (view instanceof HorizontalScrollView) && ViewCompat.V(view) && (view instanceof f) && ((f) view).f23560m) {
            return (HorizontalScrollView) view;
        }
        if (view instanceof ViewGroup) {
            int i11 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i11 >= viewGroup.getChildCount()) {
                    break;
                }
                HorizontalScrollView horizontalScrollViewR = r(viewGroup.getChildAt(i11), motionEvent, false);
                if (horizontalScrollViewR != null) {
                    return horizontalScrollViewR;
                }
                i11++;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(int i11) {
        int scrollX;
        int iMin;
        int iMax;
        int iIntValue;
        OverScroller overScroller;
        if (J) {
            qk.a.t(K, "smoothScrollAndSnap[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i11));
        }
        if (getChildCount() <= 0) {
            return;
        }
        if (this.f23566s == 0 && this.f23567t == null && this.f23570w == 0) {
            H(i11);
            return;
        }
        boolean z11 = getFlingAnimator() != this.C;
        int iMax2 = Math.max(0, computeHorizontalScrollRange() - getWidth());
        int iD = D(i11);
        if (this.f23565r) {
            iD = getScrollX();
        }
        int width = (getWidth() - ViewCompat.F(this)) - ViewCompat.E(this);
        if (getLayoutDirection() == 1) {
            iD = iMax2 - iD;
            scrollX = -i11;
        } else {
            scrollX = i11;
        }
        List<Integer> list = this.f23567t;
        if (list == null || list.isEmpty()) {
            int i12 = this.f23570w;
            if (i12 != 0) {
                int i13 = this.f23566s;
                if (i13 > 0) {
                    double d11 = ((double) iD) / ((double) i13);
                    double dFloor = Math.floor(d11);
                    int i14 = this.f23566s;
                    int iMax3 = Math.max(v(i12, (int) (dFloor * ((double) i14)), i14, width), 0);
                    int i15 = this.f23570w;
                    double dCeil = Math.ceil(d11);
                    int i16 = this.f23566s;
                    iMin = Math.min(v(i15, (int) (dCeil * ((double) i16)), i16, width), iMax2);
                    iMax2 = iMax2;
                    iMax = iMax3;
                    iIntValue = 0;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int iMin2 = iMax2;
                    int i17 = iMin2;
                    int i18 = 0;
                    int iMax4 = 0;
                    for (int i19 = 0; i19 < viewGroup.getChildCount(); i19++) {
                        View childAt = viewGroup.getChildAt(i19);
                        int iV = v(this.f23570w, childAt.getLeft(), childAt.getWidth(), width);
                        if (iV <= iD && iD - iV < iD - i18) {
                            i18 = iV;
                        }
                        if (iV >= iD && iV - iD < i17 - iD) {
                            i17 = iV;
                        }
                        iMin2 = Math.min(iMin2, iV);
                        iMax4 = Math.max(iMax4, iV);
                    }
                    iMax = Math.max(i18, iMin2);
                    iMin = Math.min(i17, iMax4);
                }
            } else {
                double snapInterval = getSnapInterval();
                double d12 = ((double) iD) / snapInterval;
                int iFloor = (int) (Math.floor(d12) * snapInterval);
                iMin = Math.min((int) (Math.ceil(d12) * snapInterval), iMax2);
                iMax = iFloor;
            }
            iIntValue = 0;
        } else {
            iIntValue = this.f23567t.get(0).intValue();
            List<Integer> list2 = this.f23567t;
            iMax2 = list2.get(list2.size() - 1).intValue();
            iMin = iMax2;
            iMax = 0;
            for (int i21 = 0; i21 < this.f23567t.size(); i21++) {
                int iIntValue2 = this.f23567t.get(i21).intValue();
                if (iIntValue2 <= iD && iD - iIntValue2 < iD - iMax) {
                    iMax = iIntValue2;
                }
                if (iIntValue2 >= iD && iIntValue2 - iD < iMin - iD) {
                    iMin = iIntValue2;
                }
            }
        }
        int i22 = iD - iMax;
        int i23 = iMin - iD;
        int i24 = Math.abs(i22) < Math.abs(i23) ? iMax : iMin;
        int scrollX2 = getScrollX();
        if (getLayoutDirection() == 1) {
            scrollX2 = iMax2 - scrollX2;
        }
        if (this.f23569v || iD < iMax2) {
            if (this.f23568u || iD > iIntValue) {
                if (scrollX > 0) {
                    if (!z11) {
                        scrollX += (int) (((double) i23) * 10.0d);
                    }
                    iD = iMin;
                } else if (scrollX < 0) {
                    if (!z11) {
                        scrollX -= (int) (((double) i22) * 10.0d);
                    }
                    iD = iMax;
                } else {
                    iD = i24;
                }
            } else if (scrollX2 > iIntValue) {
                iD = iIntValue;
            }
        } else if (scrollX2 < iMax2) {
            iD = iMax2;
        }
        int iMin3 = Math.min(Math.max(0, iD), iMax2);
        if (getLayoutDirection() == 1) {
            iMin3 = iMax2 - iMin3;
            scrollX = -scrollX;
        }
        int i25 = iMin3;
        if (z11 || (overScroller = this.f23550c) == null) {
            b(i25, getScrollY());
            return;
        }
        this.f23553f = true;
        int scrollX3 = getScrollX();
        int scrollY = getScrollY();
        if (scrollX == 0) {
            scrollX = i25 - getScrollX();
        }
        overScroller.fling(scrollX3, scrollY, scrollX, 0, i25, i25, 0, 0, (i25 == 0 || i25 == iMax2) ? width / 2 : 0, 0);
        postInvalidateOnAnimation();
    }

    private int v(int i11, int i12, int i13, int i14) {
        int i15;
        if (i11 == 1) {
            return i12;
        }
        if (i11 == 2) {
            i15 = (i14 - i13) / 2;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f23570w);
            }
            i15 = i14 - i13;
        }
        return i12 - i15;
    }

    private int w(View view) {
        view.getDrawingRect(this.I);
        offsetDescendantRectToMyCoords(view, this.I);
        return computeScrollDeltaToGetChildRectOnScreen(this.I);
    }

    private void y(int i11, int i12) {
        if (J) {
            qk.a.u(K, "handlePostTouchScrolling[%d] velocityX %d velocityY %d", Integer.valueOf(getId()), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        if (this.f23558k != null) {
            return;
        }
        if (this.f23561n) {
            j.i(this, i11, i12);
        }
        this.f23553f = false;
        a aVar = new a();
        this.f23558k = aVar;
        ViewCompat.i0(this, aVar, 20L);
    }

    private boolean z() {
        View contentView = getContentView();
        return (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) ? false : true;
    }

    @Override // com.facebook.react.views.scroll.j.d
    public void a(int i11, int i12) {
        scrollTo(i11, i12);
        E(i11, Integer.MAX_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i11, int i12) {
        if (!this.f23557j || this.f23571x) {
            super.addFocusables(arrayList, i11, i12);
            return;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        super.addFocusables(arrayList2, i11, i12);
        for (View view : arrayList2) {
            if (C(view) || c(view) || view.isFocused()) {
                arrayList.add(view);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView
    public boolean arrowScroll(int i11) {
        if (!this.f23557j) {
            return super.arrowScroll(i11);
        }
        boolean z11 = true;
        this.f23571x = true;
        if (getChildCount() > 0) {
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i11);
            View contentView = getContentView();
            if (contentView == null || viewFindNextFocus == null || viewFindNextFocus.getParent() != contentView) {
                I(i11);
            } else {
                if (!C(viewFindNextFocus) && !A(viewFindNextFocus)) {
                    I(i11);
                }
                viewFindNextFocus.requestFocus();
            }
        } else {
            z11 = false;
        }
        this.f23571x = false;
        return z11;
    }

    @Override // com.facebook.react.views.scroll.j.d
    public void b(int i11, int i12) {
        j.r(this, i11, i12);
        G(i11, i12);
    }

    @Override // com.facebook.react.views.scroll.d
    public boolean c(View view) {
        int iW = w(view);
        view.getDrawingRect(this.I);
        return iW != 0 && Math.abs(iW) < this.I.width();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i11) {
        return this.f23560m && super.canScrollHorizontally(i11);
    }

    @Override // com.facebook.react.views.scroll.j.a
    public void d(int i11, int i12) {
        this.C.cancel();
        int iL = j.l(getContext());
        this.C.setDuration(iL).setIntValues(i11, i12);
        this.C.start();
        if (this.f23561n) {
            j.i(this, iL > 0 ? (i12 - i11) / iL : 0, 0);
            j.a(this);
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (x.canChildrenBeTouchTarget(this.D)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.f23564q != 0) {
            View contentView = getContentView();
            if (this.f23563p != null && contentView != null && contentView.getRight() < getWidth()) {
                this.f23563p.setBounds(contentView.getRight(), 0, getWidth(), getHeight());
                this.f23563p.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f23560m || !(keyCode == 21 || keyCode == 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i11) {
        if (J) {
            qk.a.t(K, "fling[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i11));
        }
        if (Build.VERSION.SDK_INT == 28) {
            i11 = (int) (Math.abs(i11) * Math.signum(this.f23549b.getXFlingVelocity()));
        }
        int i12 = i11;
        if (this.f23557j) {
            t(i12);
        } else if (this.f23550c != null) {
            this.f23550c.fling(getScrollX(), getScrollY(), i12, 0, 0, Integer.MAX_VALUE, 0, 0, ((getWidth() - ViewCompat.F(this)) - ViewCompat.E(this)) / 2, 0);
            ViewCompat.g0(this);
        } else {
            super.fling(i12);
        }
        y(i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.z
    public void getClippingRect(Rect rect) {
        rect.set((Rect) gn.a.c(this.f23554g));
    }

    @Override // com.facebook.react.views.scroll.j.a
    public ValueAnimator getFlingAnimator() {
        return this.C;
    }

    @Override // com.facebook.react.views.scroll.j.b
    public long getLastScrollDispatchTime() {
        return this.E;
    }

    @Override // com.facebook.react.uimanager.d0
    public String getOverflow() {
        int i11 = b.f23577a[this.f23555h.ordinal()];
        if (i11 == 1) {
            return "hidden";
        }
        if (i11 == 2) {
            return "scroll";
        }
        if (i11 != 3) {
            return null;
        }
        return "visible";
    }

    @Override // com.facebook.react.uimanager.e0
    public Rect getOverflowInset() {
        return this.f23552e;
    }

    public x getPointerEvents() {
        return this.D;
    }

    @Override // com.facebook.react.views.scroll.j.c
    public j.h getReactScrollViewScrollState() {
        return this.B;
    }

    @Override // com.facebook.react.uimanager.z
    public boolean getRemoveClippedSubviews() {
        return this.f23559l;
    }

    @Override // com.facebook.react.views.scroll.d
    public boolean getScrollEnabled() {
        return this.f23560m;
    }

    @Override // com.facebook.react.views.scroll.j.b
    public int getScrollEventThrottle() {
        return this.F;
    }

    @Override // com.facebook.react.views.scroll.j.e
    public u0 getStateWrapper() {
        return this.A;
    }

    public void l() {
        OverScroller overScroller = this.f23550c;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        this.f23550c.abortAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f23559l) {
            updateClippingRect();
        }
        com.facebook.react.views.scroll.b bVar = this.H;
        if (bVar != null) {
            bVar.f();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        this.G = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        View view3 = this.G;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
        }
        this.G = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.facebook.react.views.scroll.b bVar = this.H;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f23555h != p.VISIBLE) {
            com.facebook.react.uimanager.a.a(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (String) getTag(com.facebook.react.m.f22670t);
        if (str != null) {
            accessibilityNodeInfo.setViewIdResourceName(str);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f23560m) {
            return false;
        }
        if (motionEvent.getAction() == 0 && q(this, motionEvent) != null) {
            return false;
        }
        if (!x.canChildrenBeTouchTarget(this.D)) {
            return true;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                x(motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e11) {
            qk.a.J("ReactNative", "Error intercepting touch event.", e11);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        OverScroller overScroller;
        if (J) {
            qk.a.v(K, "onLayout[%d] l %d t %d r %d b %d", Integer.valueOf(getId()), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
        }
        int i15 = this.f23548a;
        if (i15 != L && (overScroller = this.f23550c) != null && i15 != overScroller.getFinalX() && !this.f23550c.isFinished()) {
            if (J) {
                qk.a.t(K, "onLayout[%d] scroll hack enabled: reset to previous scrollX position of %d", Integer.valueOf(getId()), Integer.valueOf(this.f23548a));
            }
            OverScroller overScroller2 = this.f23550c;
            overScroller2.startScroll(this.f23548a, overScroller2.getFinalY(), 0, 0);
            this.f23550c.forceFinished(true);
            this.f23548a = L;
        }
        if (z()) {
            int scrollX = this.f23572y;
            if (scrollX == -1) {
                scrollX = getScrollX();
            }
            int scrollY = this.f23573z;
            if (scrollY == -1) {
                scrollY = getScrollY();
            }
            scrollTo(scrollX, scrollY);
        }
        j.c(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (this.G == null) {
            return;
        }
        if (view.getLayoutDirection() == 1) {
            m(i11, i13, i15, i17);
        } else {
            com.facebook.react.views.scroll.b bVar = this.H;
            if (bVar != null) {
                bVar.h();
            }
        }
        j.b(this);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        OverScroller overScroller;
        r.a(i11, i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        if (J) {
            qk.a.u(K, "onMeasure[%d] measured width: %d measured height: %d", Integer.valueOf(getId()), Integer.valueOf(size), Integer.valueOf(size2));
        }
        boolean z11 = getMeasuredHeight() != size2;
        setMeasuredDimension(size, size2);
        if (!z11 || (overScroller = this.f23550c) == null) {
            return;
        }
        this.f23548a = overScroller.getCurrX();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onOverScrolled(int i11, int i12, boolean z11, boolean z12) {
        int iMax;
        if (J) {
            qk.a.v(K, "onOverScrolled[%d] scrollX %d scrollY %d clampedX %b clampedY %b", Integer.valueOf(getId()), Integer.valueOf(i11), Integer.valueOf(i12), Boolean.valueOf(z11), Boolean.valueOf(z12));
        }
        OverScroller overScroller = this.f23550c;
        if (overScroller != null && !overScroller.isFinished() && this.f23550c.getCurrX() != this.f23550c.getFinalX() && i11 >= (iMax = Math.max(computeHorizontalScrollRange() - getWidth(), 0))) {
            this.f23550c.abortAnimation();
            i11 = iMax;
        }
        super.onOverScrolled(i11, i12, z11, z12);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i11, int i12, int i13, int i14) {
        if (J) {
            qk.a.v(K, "onScrollChanged[%d] x %d y %d oldx %d oldy %d", Integer.valueOf(getId()), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
        }
        ep.a.c(0L, "ReactHorizontalScrollView.onScrollChanged");
        try {
            super.onScrollChanged(i11, i12, i13, i14);
            this.f23553f = true;
            if (this.f23549b.c(i11, i12)) {
                if (this.f23559l) {
                    updateClippingRect();
                }
                j.u(this, this.f23549b.getXFlingVelocity(), this.f23549b.getYFlingVelocity());
            }
        } finally {
            ep.a.i(0L);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (this.f23559l) {
            updateClippingRect();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f23560m || !x.canBeTouchTarget(this.D)) {
            return false;
        }
        this.f23551d.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.f23556i) {
            j.s(this);
            float xVelocity = this.f23551d.getXVelocity();
            float yVelocity = this.f23551d.getYVelocity();
            j.e(this, xVelocity, yVelocity);
            com.facebook.react.uimanager.events.m.a(this, motionEvent);
            this.f23556i = false;
            y(Math.round(xVelocity), Math.round(yVelocity));
        }
        if (actionMasked == 0) {
            n();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean pageScroll(int i11) {
        boolean zPageScroll = super.pageScroll(i11);
        if (this.f23557j && zPageScroll) {
            y(0, 0);
        }
        return zPageScroll;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null && !this.f23557j) {
            F(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void s() {
        awakenScrollBars();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void scrollTo(int i11, int i12) {
        if (J) {
            qk.a.u(K, "scrollTo[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        super.scrollTo(i11, i12);
        j.s(this);
        G(i11, i12);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        com.facebook.react.uimanager.a.o(this, Integer.valueOf(i11));
    }

    public void setBorderColor(int i11, Integer num) {
        com.facebook.react.uimanager.a.q(this, n.values()[i11], num);
    }

    public void setBorderRadius(float f11) {
        setBorderRadius(f11, so.d.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(String str) {
        com.facebook.react.uimanager.a.s(this, str == null ? null : so.f.fromString(str));
    }

    public void setBorderWidth(int i11, float f11) {
        com.facebook.react.uimanager.a.t(this, n.values()[i11], Float.valueOf(w.f(f11)));
    }

    public void setDecelerationRate(float f11) {
        getReactScrollViewScrollState().h(f11);
        OverScroller overScroller = this.f23550c;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f11);
        }
    }

    public void setDisableIntervalMomentum(boolean z11) {
        this.f23565r = z11;
    }

    public void setEndFillColor(int i11) {
        if (i11 != this.f23564q) {
            this.f23564q = i11;
            this.f23563p = new ColorDrawable(this.f23564q);
        }
    }

    @Override // com.facebook.react.views.scroll.j.b
    public void setLastScrollDispatchTime(long j11) {
        this.E = j11;
    }

    public void setMaintainVisibleContentPosition(com.facebook.react.views.scroll.b.C0459b c0459b) {
        com.facebook.react.views.scroll.b bVar;
        if (c0459b != null && this.H == null) {
            com.facebook.react.views.scroll.b bVar2 = new com.facebook.react.views.scroll.b(this, true);
            this.H = bVar2;
            bVar2.f();
        } else if (c0459b == null && (bVar = this.H) != null) {
            bVar.g();
            this.H = null;
        }
        com.facebook.react.views.scroll.b bVar3 = this.H;
        if (bVar3 != null) {
            bVar3.e(c0459b);
        }
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.f23555h = p.SCROLL;
        } else {
            p pVarFromString = p.fromString(str);
            if (pVarFromString == null) {
                pVarFromString = p.SCROLL;
            }
            this.f23555h = pVarFromString;
        }
        invalidate();
    }

    @Override // com.facebook.react.uimanager.e0
    public void setOverflowInset(int i11, int i12, int i13, int i14) {
        this.f23552e.set(i11, i12, i13, i14);
    }

    public void setPagingEnabled(boolean z11) {
        this.f23557j = z11;
    }

    public void setPointerEvents(x xVar) {
        this.D = xVar;
    }

    public void setRemoveClippedSubviews(boolean z11) {
        if (z11 && this.f23554g == null) {
            this.f23554g = new Rect();
        }
        this.f23559l = z11;
        updateClippingRect();
    }

    public void setScrollEnabled(boolean z11) {
        this.f23560m = z11;
    }

    public void setScrollEventThrottle(int i11) {
        this.F = i11;
    }

    public void setScrollPerfTag(String str) {
        this.f23562o = str;
    }

    public void setSendMomentumEvents(boolean z11) {
        this.f23561n = z11;
    }

    public void setSnapInterval(int i11) {
        this.f23566s = i11;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f23567t = list;
    }

    public void setSnapToAlignment(int i11) {
        this.f23570w = i11;
    }

    public void setSnapToEnd(boolean z11) {
        this.f23569v = z11;
    }

    public void setSnapToStart(boolean z11) {
        this.f23568u = z11;
    }

    public void setStateWrapper(u0 u0Var) {
        this.A = u0Var;
    }

    public int u(int i11) {
        return j.p(this, i11, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0).x;
    }

    @Override // com.facebook.react.uimanager.z
    public void updateClippingRect() {
        if (this.f23559l) {
            ep.a.c(0L, "ReactHorizontalScrollView.updateClippingRect");
            try {
                gn.a.c(this.f23554g);
                a0.a(this, this.f23554g);
                KeyEvent.Callback contentView = getContentView();
                if (contentView instanceof z) {
                    ((z) contentView).updateClippingRect();
                }
            } finally {
                ep.a.i(0L);
            }
        }
    }

    protected void x(MotionEvent motionEvent) {
        com.facebook.react.uimanager.events.m.b(this, motionEvent);
        j.d(this);
        this.f23556i = true;
        p();
        getFlingAnimator().cancel();
    }

    public f(Context context, com.facebook.react.views.scroll.a aVar) {
        super(context);
        this.f23548a = L;
        this.f23549b = new c();
        this.f23551d = new m();
        this.f23552e = new Rect();
        this.f23555h = p.SCROLL;
        this.f23557j = false;
        this.f23560m = true;
        this.f23564q = 0;
        this.f23565r = false;
        this.f23566s = 0;
        this.f23568u = true;
        this.f23569v = true;
        this.f23570w = 0;
        this.f23571x = false;
        this.f23572y = -1;
        this.f23573z = -1;
        this.A = null;
        this.C = ObjectAnimator.ofInt(this, "scrollX", 0, 0);
        this.D = x.AUTO;
        this.E = 0L;
        this.F = 0;
        this.I = new Rect();
        ViewCompat.p0(this, new h());
        this.f23550c = getOverScrollerFromParent();
        this.B = new j.h();
        setOnHierarchyChangeListener(this);
        setClipChildren(false);
    }

    public void setBorderRadius(float f11, int i11) {
        com.facebook.react.uimanager.a.r(this, so.d.values()[i11], Float.isNaN(f11) ? null : new LengthPercentage(w.f(f11), com.facebook.react.uimanager.p.POINT));
    }
}
