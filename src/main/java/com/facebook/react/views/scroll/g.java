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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.e0;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.u0;
import com.facebook.react.uimanager.w;
import com.facebook.react.uimanager.x;
import com.facebook.react.uimanager.z;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.util.List;
import so.n;
import so.p;

/* JADX INFO: loaded from: classes4.dex */
public class g extends ScrollView implements z, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, d, e0, j.c, j.e, j.a, j.b, j.d {
    private static Field I = null;
    private static boolean J = false;
    private int A;
    private u0 B;
    private final j.h C;
    private final ValueAnimator D;
    private x E;
    private long F;
    private int G;
    private com.facebook.react.views.scroll.b H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f23578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OverScroller f23579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f23580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f23581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f23582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Rect f23584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private p f23585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Runnable f23588k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23589l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f23590m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f23591n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f23592o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f23593p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23594q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f23595r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f23596s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<Integer> f23597t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f23598u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f23599v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f23600w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View f23601x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ReadableMap f23602y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f23603z;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f23604a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23605b = 0;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeAnimatedModule nativeAnimatedModule;
            if (g.this.f23583f) {
                g.this.f23583f = false;
                this.f23605b = 0;
                ViewCompat.i0(g.this, this, 20L);
                return;
            }
            j.s(g.this);
            int i11 = this.f23605b + 1;
            this.f23605b = i11;
            if (i11 < 3) {
                if (g.this.f23587j && !this.f23604a) {
                    this.f23604a = true;
                    g.this.r(0);
                }
                ViewCompat.i0(g.this, this, 20L);
                return;
            }
            g.this.f23588k = null;
            if (g.this.f23591n) {
                j.j(g.this);
            }
            ReactContext reactContext = (ReactContext) g.this.getContext();
            if (reactContext != null && (nativeAnimatedModule = (NativeAnimatedModule) reactContext.getNativeModule(NativeAnimatedModule.class)) != null) {
                nativeAnimatedModule.userDrivenScrollEnded(g.this.getId());
            }
            g.this.o();
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23607a;

        static {
            int[] iArr = new int[p.values().length];
            f23607a = iArr;
            try {
                iArr[p.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23607a[p.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23607a[p.VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(Context context) {
        this(context, null);
    }

    private void A(int i11) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.f23579b;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        int currY = this.f23579b.getCurrY();
        boolean zComputeScrollOffset = this.f23579b.computeScrollOffset();
        this.f23579b.forceFinished(true);
        if (!zComputeScrollOffset) {
            scrollTo(getScrollX(), i11 + (this.f23579b.getCurrX() - currY));
            return;
        }
        this.f23579b.fling(getScrollX(), i11, 0, (int) (this.f23579b.getCurrVelocity() * Math.signum(this.f23579b.getFinalY() - this.f23579b.getStartY())), 0, 0, 0, Integer.MAX_VALUE);
    }

    private void B(View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
        }
    }

    private void C(int i11, int i12) {
        if (x()) {
            this.f23603z = -1;
            this.A = -1;
        } else {
            this.f23603z = i11;
            this.A = i12;
        }
    }

    private void D(int i11) {
        double snapInterval = getSnapInterval();
        double dM = j.m(this, getScrollY(), getReactScrollViewScrollState().getFinalAnimatedPositionScroll().y, i11);
        double dZ = z(i11);
        double d11 = dM / snapInterval;
        int iFloor = (int) Math.floor(d11);
        int iCeil = (int) Math.ceil(d11);
        int iRound = (int) Math.round(d11);
        int iRound2 = (int) Math.round(dZ / snapInterval);
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
            this.f23583f = true;
            b(getScrollX(), (int) d12);
        }
    }

    private void E(int i11) {
        getReactScrollViewScrollState().l(i11);
        j.k(this);
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private int getMaxScrollY() {
        View view = this.f23601x;
        return Math.max(0, (view == null ? 0 : view.getHeight()) - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private OverScroller getOverScrollerFromParent() {
        if (!J) {
            J = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                I = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                qk.a.I("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = I;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    qk.a.I("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Failed to get mScroller from ScrollView!", e11);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i11 = this.f23596s;
        return i11 != 0 ? i11 : getHeight();
    }

    private void m() {
        Runnable runnable = this.f23588k;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f23588k = null;
            getFlingAnimator().cancel();
        }
    }

    private int n(int i11) {
        if (Build.VERSION.SDK_INT != 28) {
            return i11;
        }
        float fSignum = Math.signum(this.f23578a.getYFlingVelocity());
        if (fSignum == BitmapDescriptorFactory.HUE_RED) {
            fSignum = Math.signum(i11);
        }
        return (int) (Math.abs(i11) * fSignum);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (y()) {
            gn.a.c(null);
            gn.a.c(this.f23592o);
            throw null;
        }
    }

    private void p() {
        if (y()) {
            gn.a.c(null);
            gn.a.c(this.f23592o);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:84:0x0198  */
    public void r(int i11) {
        int iFloor;
        int iMin;
        int iIntValue;
        int top;
        int top2;
        int height;
        int scrollY;
        OverScroller overScroller;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.f23596s == 0 && this.f23597t == null && this.f23600w == 0) {
            D(i11);
            return;
        }
        boolean z11 = getFlingAnimator() != this.D;
        int maxScrollY = getMaxScrollY();
        int iZ = z(i11);
        if (this.f23595r) {
            iZ = getScrollY();
        }
        int height2 = (getHeight() - getPaddingBottom()) - getPaddingTop();
        List<Integer> list = this.f23597t;
        int i12 = 2;
        if (list != null) {
            iIntValue = list.get(0).intValue();
            List<Integer> list2 = this.f23597t;
            maxScrollY = list2.get(list2.size() - 1).intValue();
            iMin = maxScrollY;
            iFloor = 0;
            for (int i13 = 0; i13 < this.f23597t.size(); i13++) {
                int iIntValue2 = this.f23597t.get(i13).intValue();
                if (iIntValue2 <= iZ && iZ - iIntValue2 < iZ - iFloor) {
                    iFloor = iIntValue2;
                }
                if (iIntValue2 >= iZ && iIntValue2 - iZ < iMin - iZ) {
                    iMin = iIntValue2;
                }
            }
        } else {
            int i14 = this.f23600w;
            if (i14 != 0) {
                int i15 = this.f23596s;
                if (i15 > 0) {
                    double d11 = ((double) iZ) / ((double) i15);
                    double dFloor = Math.floor(d11);
                    int i16 = this.f23596s;
                    int iMax = Math.max(t(i14, (int) (dFloor * ((double) i16)), i16, height2), 0);
                    int i17 = this.f23600w;
                    double dCeil = Math.ceil(d11);
                    int i18 = this.f23596s;
                    iMin = Math.min(t(i17, (int) (dCeil * ((double) i18)), i18, height2), maxScrollY);
                    iFloor = iMax;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int iMin2 = maxScrollY;
                    int i19 = iMin2;
                    int i21 = 0;
                    int i22 = 0;
                    int iMax2 = 0;
                    while (i21 < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i21);
                        int i23 = this.f23600w;
                        if (i23 != 1) {
                            if (i23 == i12) {
                                top2 = childAt.getTop();
                                height = (height2 - childAt.getHeight()) / 2;
                            } else {
                                if (i23 != 3) {
                                    throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f23600w);
                                }
                                top2 = childAt.getTop();
                                height = height2 - childAt.getHeight();
                            }
                            top = top2 - height;
                        } else {
                            i12 = i12;
                            top = childAt.getTop();
                        }
                        if (top <= iZ && iZ - top < iZ - i22) {
                            i22 = top;
                        }
                        if (top >= iZ && top - iZ < i19 - iZ) {
                            i19 = top;
                        }
                        iMin2 = Math.min(iMin2, top);
                        iMax2 = Math.max(iMax2, top);
                        i21++;
                        i12 = i12;
                    }
                    iFloor = Math.max(i22, iMin2);
                    iMin = Math.min(i19, iMax2);
                }
                iIntValue = 0;
            } else {
                double snapInterval = getSnapInterval();
                double d12 = ((double) iZ) / snapInterval;
                iFloor = (int) (Math.floor(d12) * snapInterval);
                iMin = Math.min((int) (Math.ceil(d12) * snapInterval), maxScrollY);
            }
            iIntValue = 0;
        }
        int i24 = iZ - iFloor;
        int i25 = iMin - iZ;
        int i26 = Math.abs(i24) < Math.abs(i25) ? iFloor : iMin;
        if (this.f23599v || iZ < maxScrollY) {
            if (!this.f23598u && iZ <= iIntValue) {
                if (getScrollY() <= iIntValue) {
                    iIntValue = iZ;
                }
                scrollY = i11;
            } else if (i11 > 0) {
                scrollY = !z11 ? i11 + ((int) (((double) i25) * 10.0d)) : i11;
                iIntValue = iMin;
            } else if (i11 < 0) {
                scrollY = !z11 ? i11 - ((int) (((double) i24) * 10.0d)) : i11;
                iIntValue = iFloor;
            } else {
                scrollY = i11;
                iIntValue = i26;
            }
        } else if (getScrollY() >= maxScrollY) {
            iIntValue = iZ;
            scrollY = i11;
        } else {
            scrollY = i11;
            iIntValue = maxScrollY;
        }
        int iMin3 = Math.min(Math.max(0, iIntValue), maxScrollY);
        if (z11 || (overScroller = this.f23579b) == null) {
            b(getScrollX(), iMin3);
            return;
        }
        this.f23583f = true;
        int scrollX = getScrollX();
        int scrollY2 = getScrollY();
        if (scrollY == 0) {
            scrollY = iMin3 - getScrollY();
        }
        overScroller.fling(scrollX, scrollY2, 0, scrollY, 0, 0, iMin3, iMin3, 0, (iMin3 == 0 || iMin3 == maxScrollY) ? height2 / 2 : 0);
        postInvalidateOnAnimation();
    }

    private int t(int i11, int i12, int i13, int i14) {
        int i15;
        if (i11 == 1) {
            return i12;
        }
        if (i11 == 2) {
            i15 = (i14 - i13) / 2;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f23600w);
            }
            i15 = i14 - i13;
        }
        return i12 - i15;
    }

    private int u(View view) {
        view.getDrawingRect(this.f23581d);
        offsetDescendantRectToMyCoords(view, this.f23581d);
        return computeScrollDeltaToGetChildRectOnScreen(this.f23581d);
    }

    private void w(int i11, int i12) {
        if (this.f23588k != null) {
            return;
        }
        if (this.f23591n) {
            p();
            j.i(this, i11, i12);
        }
        this.f23583f = false;
        a aVar = new a();
        this.f23588k = aVar;
        ViewCompat.i0(this, aVar, 20L);
    }

    private boolean x() {
        View contentView = getContentView();
        return (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) ? false : true;
    }

    private boolean y() {
        return false;
    }

    private int z(int i11) {
        return getFlingAnimator() == this.D ? j.p(this, 0, i11, 0, getMaxScrollY()).y : j.m(this, getScrollY(), getReactScrollViewScrollState().getFinalAnimatedPositionScroll().y, i11) + s(i11);
    }

    @Override // com.facebook.react.views.scroll.j.d
    public void a(int i11, int i12) {
        scrollTo(i11, i12);
        A(i12);
    }

    @Override // com.facebook.react.views.scroll.j.d
    public void b(int i11, int i12) {
        j.r(this, i11, i12);
        C(i11, i12);
    }

    @Override // com.facebook.react.views.scroll.d
    public boolean c(View view) {
        int iU = u(view);
        view.getDrawingRect(this.f23581d);
        return iU != 0 && Math.abs(iU) < this.f23581d.width();
    }

    @Override // com.facebook.react.views.scroll.j.a
    public void d(int i11, int i12) {
        this.D.cancel();
        int iL = j.l(getContext());
        this.D.setDuration(iL).setIntValues(i11, i12);
        this.D.start();
        if (this.f23591n) {
            j.i(this, 0, iL > 0 ? (i12 - i11) / iL : 0);
            j.a(this);
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (x.canChildrenBeTouchTarget(this.E)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.f23594q != 0) {
            View contentView = getContentView();
            if (this.f23593p != null && contentView != null && contentView.getBottom() < getHeight()) {
                this.f23593p.setBounds(0, contentView.getBottom(), getWidth(), getHeight());
                this.f23593p.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.ScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f23590m || !(keyCode == 19 || keyCode == 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView
    public void fling(int i11) {
        int iN = n(i11);
        if (this.f23587j) {
            r(iN);
        } else if (this.f23579b != null) {
            this.f23579b.fling(getScrollX(), getScrollY(), 0, iN, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            ViewCompat.g0(this);
        } else {
            super.fling(iN);
        }
        w(0, iN);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.z
    public void getClippingRect(Rect rect) {
        rect.set((Rect) gn.a.c(this.f23584g));
    }

    @Override // com.facebook.react.views.scroll.j.a
    @NonNull
    public ValueAnimator getFlingAnimator() {
        return this.D;
    }

    @Override // com.facebook.react.views.scroll.j.b
    public long getLastScrollDispatchTime() {
        return this.F;
    }

    @Override // com.facebook.react.uimanager.d0
    public String getOverflow() {
        int i11 = b.f23607a[this.f23585h.ordinal()];
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
        return this.f23582e;
    }

    public x getPointerEvents() {
        return this.E;
    }

    @Override // com.facebook.react.views.scroll.j.c
    public j.h getReactScrollViewScrollState() {
        return this.C;
    }

    @Override // com.facebook.react.uimanager.z
    public boolean getRemoveClippedSubviews() {
        return this.f23589l;
    }

    @Override // com.facebook.react.views.scroll.d
    public boolean getScrollEnabled() {
        return this.f23590m;
    }

    @Override // com.facebook.react.views.scroll.j.b
    public int getScrollEventThrottle() {
        return this.G;
    }

    @Override // com.facebook.react.views.scroll.j.e
    public u0 getStateWrapper() {
        return this.B;
    }

    public void l() {
        OverScroller overScroller = this.f23579b;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        this.f23579b.abortAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f23589l) {
            updateClippingRect();
        }
        com.facebook.react.views.scroll.b bVar = this.H;
        if (bVar != null) {
            bVar.f();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        this.f23601x = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        View view3 = this.f23601x;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
            this.f23601x = null;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.facebook.react.views.scroll.b bVar = this.H;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f23585h != p.VISIBLE) {
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

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f23590m) {
            return false;
        }
        if (!x.canChildrenBeTouchTarget(this.E)) {
            return true;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                v(motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e11) {
            qk.a.J("ReactNative", "Error intercepting touch event.", e11);
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (x()) {
            int scrollX = this.f23603z;
            if (scrollX == -1) {
                scrollX = getScrollX();
            }
            int scrollY = this.A;
            if (scrollY == -1) {
                scrollY = getScrollY();
            }
            scrollTo(scrollX, scrollY);
        }
        j.c(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (this.f23601x == null) {
            return;
        }
        com.facebook.react.views.scroll.b bVar = this.H;
        if (bVar != null) {
            bVar.h();
        }
        if (isShown() && x()) {
            int scrollY = getScrollY();
            int maxScrollY = getMaxScrollY();
            if (scrollY > maxScrollY) {
                scrollTo(getScrollX(), maxScrollY);
            }
        }
        j.b(this);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        r.a(i11, i12);
        setMeasuredDimension(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onOverScrolled(int i11, int i12, boolean z11, boolean z12) {
        int maxScrollY;
        OverScroller overScroller = this.f23579b;
        if (overScroller != null && this.f23601x != null && !overScroller.isFinished() && this.f23579b.getCurrY() != this.f23579b.getFinalY() && i12 >= (maxScrollY = getMaxScrollY())) {
            this.f23579b.abortAnimation();
            i12 = maxScrollY;
        }
        super.onOverScrolled(i11, i12, z11, z12);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i11, int i12, int i13, int i14) {
        ep.a.c(0L, "ReactScrollView.onScrollChanged");
        try {
            super.onScrollChanged(i11, i12, i13, i14);
            this.f23583f = true;
            if (this.f23578a.c(i11, i12)) {
                if (this.f23589l) {
                    updateClippingRect();
                }
                j.u(this, this.f23578a.getXFlingVelocity(), this.f23578a.getYFlingVelocity());
            }
        } finally {
            ep.a.i(0L);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (this.f23589l) {
            updateClippingRect();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f23590m || !x.canBeTouchTarget(this.E)) {
            return false;
        }
        this.f23580c.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.f23586i) {
            j.s(this);
            float xVelocity = this.f23580c.getXVelocity();
            float yVelocity = this.f23580c.getYVelocity();
            j.e(this, xVelocity, yVelocity);
            com.facebook.react.uimanager.events.m.a(this, motionEvent);
            this.f23586i = false;
            w(Math.round(xVelocity), Math.round(yVelocity));
        }
        if (actionMasked == 0) {
            m();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void q() {
        awakenScrollBars();
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            B(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public int s(int i11) {
        return j.p(this, 0, i11, 0, getMaxScrollY()).y;
    }

    @Override // android.widget.ScrollView, android.view.View
    public void scrollTo(int i11, int i12) {
        super.scrollTo(i11, i12);
        j.s(this);
        C(i11, i12);
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

    public void setContentOffset(ReadableMap readableMap) {
        ReadableMap readableMap2 = this.f23602y;
        if (readableMap2 == null || !readableMap2.equals(readableMap)) {
            this.f23602y = readableMap;
            if (readableMap != null) {
                scrollTo((int) w.g(readableMap.hasKey("x") ? readableMap.getDouble("x") : 0.0d), (int) w.g(readableMap.hasKey("y") ? readableMap.getDouble("y") : 0.0d));
            } else {
                scrollTo(0, 0);
            }
        }
    }

    public void setDecelerationRate(float f11) {
        getReactScrollViewScrollState().h(f11);
        OverScroller overScroller = this.f23579b;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f11);
        }
    }

    public void setDisableIntervalMomentum(boolean z11) {
        this.f23595r = z11;
    }

    public void setEndFillColor(int i11) {
        if (i11 != this.f23594q) {
            this.f23594q = i11;
            this.f23593p = new ColorDrawable(this.f23594q);
        }
    }

    @Override // com.facebook.react.views.scroll.j.b
    public void setLastScrollDispatchTime(long j11) {
        this.F = j11;
    }

    public void setMaintainVisibleContentPosition(com.facebook.react.views.scroll.b.C0459b c0459b) {
        com.facebook.react.views.scroll.b bVar;
        if (c0459b != null && this.H == null) {
            com.facebook.react.views.scroll.b bVar2 = new com.facebook.react.views.scroll.b(this, false);
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
            this.f23585h = p.SCROLL;
        } else {
            p pVarFromString = p.fromString(str);
            if (pVarFromString == null) {
                pVarFromString = p.SCROLL;
            }
            this.f23585h = pVarFromString;
        }
        invalidate();
    }

    @Override // com.facebook.react.uimanager.e0
    public void setOverflowInset(int i11, int i12, int i13, int i14) {
        this.f23582e.set(i11, i12, i13, i14);
    }

    public void setPagingEnabled(boolean z11) {
        this.f23587j = z11;
    }

    public void setPointerEvents(x xVar) {
        this.E = xVar;
    }

    public void setRemoveClippedSubviews(boolean z11) {
        if (z11 && this.f23584g == null) {
            this.f23584g = new Rect();
        }
        this.f23589l = z11;
        updateClippingRect();
    }

    public void setScrollAwayTopPaddingEnabledUnstable(int i11) {
        int childCount = getChildCount();
        gn.a.b(childCount <= 1, "React Native ScrollView should not have more than one child, it should have exactly 1 child; a content View");
        if (childCount > 0) {
            for (int i12 = 0; i12 < childCount; i12++) {
                getChildAt(i12).setTranslationY(i11);
            }
            setPadding(0, 0, 0, i11);
        }
        E(i11);
        setRemoveClippedSubviews(this.f23589l);
    }

    public void setScrollEnabled(boolean z11) {
        this.f23590m = z11;
    }

    public void setScrollEventThrottle(int i11) {
        this.G = i11;
    }

    public void setScrollPerfTag(String str) {
        this.f23592o = str;
    }

    public void setSendMomentumEvents(boolean z11) {
        this.f23591n = z11;
    }

    public void setSnapInterval(int i11) {
        this.f23596s = i11;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f23597t = list;
    }

    public void setSnapToAlignment(int i11) {
        this.f23600w = i11;
    }

    public void setSnapToEnd(boolean z11) {
        this.f23599v = z11;
    }

    public void setSnapToStart(boolean z11) {
        this.f23598u = z11;
    }

    public void setStateWrapper(u0 u0Var) {
        this.B = u0Var;
    }

    @Override // com.facebook.react.uimanager.z
    public void updateClippingRect() {
        if (this.f23589l) {
            ep.a.c(0L, "ReactScrollView.updateClippingRect");
            try {
                gn.a.c(this.f23584g);
                a0.a(this, this.f23584g);
                KeyEvent.Callback contentView = getContentView();
                if (contentView instanceof z) {
                    ((z) contentView).updateClippingRect();
                }
            } finally {
                ep.a.i(0L);
            }
        }
    }

    protected void v(MotionEvent motionEvent) {
        com.facebook.react.uimanager.events.m.b(this, motionEvent);
        j.d(this);
        this.f23586i = true;
        p();
        getFlingAnimator().cancel();
    }

    public g(Context context, com.facebook.react.views.scroll.a aVar) {
        super(context);
        this.f23578a = new c();
        this.f23580c = new m();
        this.f23581d = new Rect();
        this.f23582e = new Rect();
        this.f23585h = p.SCROLL;
        this.f23587j = false;
        this.f23590m = true;
        this.f23594q = 0;
        this.f23595r = false;
        this.f23596s = 0;
        this.f23598u = true;
        this.f23599v = true;
        this.f23600w = 0;
        this.f23602y = null;
        this.f23603z = -1;
        this.A = -1;
        this.B = null;
        this.C = new j.h();
        this.D = ObjectAnimator.ofInt(this, "scrollY", 0, 0);
        this.E = x.AUTO;
        this.F = 0L;
        this.G = 0;
        this.H = null;
        this.f23579b = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
        setClipChildren(false);
        ViewCompat.p0(this, new h());
    }

    public void setBorderRadius(float f11, int i11) {
        com.facebook.react.uimanager.a.r(this, so.d.values()[i11], Float.isNaN(f11) ? null : new LengthPercentage(w.f(f11), com.facebook.react.uimanager.p.POINT));
    }
}
