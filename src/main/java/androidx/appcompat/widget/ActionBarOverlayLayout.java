package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements d0, androidx.core.view.x, androidx.core.view.y {
    static final int[] F = {i.a.f73725b, R.attr.windowContentOverlay};
    ViewPropertyAnimator A;
    final AnimatorListenerAdapter B;
    private final Runnable C;
    private final Runnable D;
    private final androidx.core.view.z E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ContentFrameLayout f2420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ActionBarContainer f2421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e0 f2422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f2423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f2427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f2428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f2430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f2431n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f2432o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Rect f2433p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f2434q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f2435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f2436s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f2437t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    private WindowInsetsCompat f2438u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    private WindowInsetsCompat f2439v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    private WindowInsetsCompat f2440w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    private WindowInsetsCompat f2441x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private d f2442y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private OverScroller f2443z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f2428k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f2428k = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f2421d.animate().translationY(BitmapDescriptorFactory.HUE_RED).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f2421d.animate().translationY(-ActionBarOverlayLayout.this.f2421d.getHeight()).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    public interface d {
        void a();

        void b();

        void c();

        void d();

        void e(boolean z11);

        void onWindowVisibilityChanged(int i11);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i11, int i12) {
            super(i11, i12);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(@NonNull Context context) {
        this(context, null);
    }

    private void b() {
        m();
        this.D.run();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private boolean i(@NonNull View view, @NonNull Rect rect, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        e eVar = (e) view.getLayoutParams();
        if (z11) {
            int i11 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i12 = rect.left;
            if (i11 != i12) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i12;
                z15 = true;
            } else {
                z15 = false;
            }
        } else {
            z15 = false;
        }
        if (z12) {
            int i13 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            int i14 = rect.top;
            if (i13 != i14) {
                ((ViewGroup.MarginLayoutParams) eVar).topMargin = i14;
                z15 = true;
            }
        }
        if (z14) {
            int i15 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            int i16 = rect.right;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i16;
                z15 = true;
            }
        }
        if (z13) {
            int i17 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i18 = rect.bottom;
            if (i17 != i18) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i18;
                return true;
            }
        }
        return z15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e0 l(View view) {
        if (view instanceof e0) {
            return (e0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void n(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(F);
        this.f2418a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f2423f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f2424g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f2443z = new OverScroller(context);
    }

    private void p() {
        m();
        postDelayed(this.D, 600L);
    }

    private void q() {
        m();
        postDelayed(this.C, 600L);
    }

    private void s() {
        m();
        this.C.run();
    }

    private boolean t(float f11) {
        this.f2443z.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f2443z.getFinalY() > this.f2421d.getHeight();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean a() {
        r();
        return this.f2422e.a();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean c() {
        r();
        return this.f2422e.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.d0
    public boolean d() {
        r();
        return this.f2422e.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2423f == null || this.f2424g) {
            return;
        }
        int bottom = this.f2421d.getVisibility() == 0 ? (int) (this.f2421d.getBottom() + this.f2421d.getTranslationY() + 0.5f) : 0;
        this.f2423f.setBounds(0, bottom, getWidth(), this.f2423f.getIntrinsicHeight() + bottom);
        this.f2423f.draw(canvas);
    }

    @Override // androidx.appcompat.widget.d0
    public boolean e() {
        r();
        return this.f2422e.e();
    }

    @Override // androidx.appcompat.widget.d0
    public boolean f() {
        r();
        return this.f2422e.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.d0
    public void g(int i11) {
        r();
        if (i11 == 2) {
            this.f2422e.j();
        } else if (i11 == 5) {
            this.f2422e.o();
        } else {
            if (i11 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2421d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.E.a();
    }

    public CharSequence getTitle() {
        r();
        return this.f2422e.getTitle();
    }

    @Override // androidx.appcompat.widget.d0
    public void h() {
        r();
        this.f2422e.l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    void m() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean o() {
        return this.f2425h;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        r();
        WindowInsetsCompat windowInsetsCompatZ = WindowInsetsCompat.z(windowInsets, this);
        boolean zI = i(this.f2421d, new Rect(windowInsetsCompatZ.k(), windowInsetsCompatZ.m(), windowInsetsCompatZ.l(), windowInsetsCompatZ.j()), true, true, false, true);
        ViewCompat.f(this, windowInsetsCompatZ, this.f2431n);
        Rect rect = this.f2431n;
        WindowInsetsCompat windowInsetsCompatN = windowInsetsCompatZ.n(rect.left, rect.top, rect.right, rect.bottom);
        this.f2438u = windowInsetsCompatN;
        boolean z11 = true;
        if (!this.f2439v.equals(windowInsetsCompatN)) {
            this.f2439v = this.f2438u;
            zI = true;
        }
        if (this.f2432o.equals(this.f2431n)) {
            z11 = zI;
        } else {
            this.f2432o.set(this.f2431n);
        }
        if (z11) {
            requestLayout();
        }
        return windowInsetsCompatZ.a().c().b().x();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        n(getContext());
        ViewCompat.m0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i17 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i16, i17, measuredWidth + i16, measuredHeight + i17);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int measuredHeight;
        r();
        measureChildWithMargins(this.f2421d, i11, 0, i12, 0);
        e eVar = (e) this.f2421d.getLayoutParams();
        int iMax = Math.max(0, this.f2421d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f2421d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f2421d.getMeasuredState());
        boolean z11 = (ViewCompat.M(this) & 256) != 0;
        if (z11) {
            measuredHeight = this.f2418a;
            if (this.f2426i && this.f2421d.getTabContainer() != null) {
                measuredHeight += this.f2418a;
            }
        } else {
            measuredHeight = this.f2421d.getVisibility() != 8 ? this.f2421d.getMeasuredHeight() : 0;
        }
        this.f2433p.set(this.f2431n);
        WindowInsetsCompat windowInsetsCompat = this.f2438u;
        this.f2440w = windowInsetsCompat;
        if (this.f2425h || z11) {
            this.f2440w = new WindowInsetsCompat.a(this.f2440w).d(k5.e.c(windowInsetsCompat.k(), this.f2440w.m() + measuredHeight, this.f2440w.l(), this.f2440w.j())).a();
        } else {
            Rect rect = this.f2433p;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f2440w = windowInsetsCompat.n(0, measuredHeight, 0, 0);
        }
        i(this.f2420c, this.f2433p, true, true, true, true);
        if (!this.f2441x.equals(this.f2440w)) {
            WindowInsetsCompat windowInsetsCompat2 = this.f2440w;
            this.f2441x = windowInsetsCompat2;
            ViewCompat.g(this.f2420c, windowInsetsCompat2);
        }
        measureChildWithMargins(this.f2420c, i11, 0, i12, 0);
        e eVar2 = (e) this.f2420c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f2420c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f2420c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f2420c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i11, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i12, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        if (!this.f2427j || !z11) {
            return false;
        }
        if (t(f12)) {
            b();
        } else {
            s();
        }
        this.f2428k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f11, float f12) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
    }

    @Override // androidx.core.view.y
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        onNestedScroll(view, i11, i12, i13, i14, i15);
    }

    @Override // androidx.core.view.x
    public void onNestedScrollAccepted(View view, View view2, int i11, int i12) {
        if (i12 == 0) {
            onNestedScrollAccepted(view, view2, i11);
        }
    }

    @Override // androidx.core.view.x
    public boolean onStartNestedScroll(View view, View view2, int i11, int i12) {
        return i12 == 0 && onStartNestedScroll(view, view2, i11);
    }

    @Override // androidx.core.view.x
    public void onStopNestedScroll(View view, int i11) {
        if (i11 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i11) {
        super.onWindowSystemUiVisibilityChanged(i11);
        r();
        int i12 = this.f2430m ^ i11;
        this.f2430m = i11;
        boolean z11 = (i11 & 4) == 0;
        boolean z12 = (i11 & 256) != 0;
        d dVar = this.f2442y;
        if (dVar != null) {
            dVar.e(!z12);
            if (z11 || !z12) {
                this.f2442y.a();
            } else {
                this.f2442y.c();
            }
        }
        if ((i12 & 256) == 0 || this.f2442y == null) {
            return;
        }
        ViewCompat.m0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
        this.f2419b = i11;
        d dVar = this.f2442y;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i11);
        }
    }

    void r() {
        if (this.f2420c == null) {
            this.f2420c = (ContentFrameLayout) findViewById(i.f.f73801b);
            this.f2421d = (ActionBarContainer) findViewById(i.f.f73802c);
            this.f2422e = l(findViewById(i.f.f73800a));
        }
    }

    public void setActionBarHideOffset(int i11) {
        m();
        this.f2421d.setTranslationY(-Math.max(0, Math.min(i11, this.f2421d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f2442y = dVar;
        if (getWindowToken() != null) {
            this.f2442y.onWindowVisibilityChanged(this.f2419b);
            int i11 = this.f2430m;
            if (i11 != 0) {
                onWindowSystemUiVisibilityChanged(i11);
                ViewCompat.m0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z11) {
        this.f2426i = z11;
    }

    public void setHideOnContentScrollEnabled(boolean z11) {
        if (z11 != this.f2427j) {
            this.f2427j = z11;
            if (z11) {
                return;
            }
            m();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i11) {
        r();
        this.f2422e.setIcon(i11);
    }

    public void setLogo(int i11) {
        r();
        this.f2422e.v(i11);
    }

    @Override // androidx.appcompat.widget.d0
    public void setMenu(Menu menu, androidx.appcompat.view.menu.j.a aVar) {
        r();
        this.f2422e.setMenu(menu, aVar);
    }

    @Override // androidx.appcompat.widget.d0
    public void setMenuPrepared() {
        r();
        this.f2422e.setMenuPrepared();
    }

    public void setOverlayMode(boolean z11) {
        this.f2425h = z11;
        this.f2424g = z11 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z11) {
    }

    public void setUiOptions(int i11) {
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowCallback(Window.Callback callback) {
        r();
        this.f2422e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.d0
    public void setWindowTitle(CharSequence charSequence) {
        r();
        this.f2422e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2419b = 0;
        this.f2431n = new Rect();
        this.f2432o = new Rect();
        this.f2433p = new Rect();
        this.f2434q = new Rect();
        this.f2435r = new Rect();
        this.f2436s = new Rect();
        this.f2437t = new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.f7692b;
        this.f2438u = windowInsetsCompat;
        this.f2439v = windowInsetsCompat;
        this.f2440w = windowInsetsCompat;
        this.f2441x = windowInsetsCompat;
        this.B = new a();
        this.C = new b();
        this.D = new c();
        n(context);
        this.E = new androidx.core.view.z(this);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // androidx.core.view.x
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr, int i13) {
        if (i13 == 0) {
            onNestedPreScroll(view, i11, i12, iArr);
        }
    }

    @Override // androidx.core.view.x
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14, int i15) {
        if (i15 == 0) {
            onNestedScroll(view, i11, i12, i13, i14);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        this.E.b(view, view2, i11);
        this.f2429l = getActionBarHideOffset();
        m();
        d dVar = this.f2442y;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        if ((i11 & 2) == 0 || this.f2421d.getVisibility() != 0) {
            return false;
        }
        return this.f2427j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f2427j && !this.f2428k) {
            if (this.f2429l <= this.f2421d.getHeight()) {
                q();
            } else {
                p();
            }
        }
        d dVar = this.f2442y;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        int i15 = this.f2429l + i12;
        this.f2429l = i15;
        setActionBarHideOffset(i15);
    }

    public void setIcon(Drawable drawable) {
        r();
        this.f2422e.setIcon(drawable);
    }
}
