package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.v;
import androidx.core.view.w;
import androidx.core.view.x;
import androidx.core.view.y;
import androidx.core.view.z;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public class c extends ViewGroup implements y, x, v {
    private static final String P = "c";
    private static final int[] Q = {R.attr.enabled};
    int A;
    int B;
    androidx.swiperefreshlayout.widget.b C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    private Animation H;
    boolean I;
    private int J;
    boolean K;
    private boolean L;
    private Animation.AnimationListener M;
    private final Animation N;
    private final Animation O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f13961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    j f13962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f13963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f13964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f13965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f13966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final z f13967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f13968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f13969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f13970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f13971k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f13972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f13973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f13974n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f13975o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f13976p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f13977q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f13978r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f13979s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f13980t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final DecelerateInterpolator f13981u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.a f13982v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f13983w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int f13984x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    float f13985y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected int f13986z;

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            c cVar = c.this;
            if (!cVar.f13963c) {
                cVar.l();
                return;
            }
            cVar.C.setAlpha(255);
            c.this.C.start();
            c cVar2 = c.this;
            if (cVar2.I && (jVar = cVar2.f13962b) != null) {
                jVar.a();
            }
            c cVar3 = c.this;
            cVar3.f13974n = cVar3.f13982v.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            c.this.setAnimationProgress(f11);
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.c$c, reason: collision with other inner class name */
    class C0236c extends Animation {
        C0236c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            c.this.setAnimationProgress(1.0f - f11);
        }
    }

    class d extends Animation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f13990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13991b;

        d(int i11, int i12) {
            this.f13990a = i11;
            this.f13991b = i12;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            androidx.swiperefreshlayout.widget.b bVar = c.this.C;
            int i11 = this.f13990a;
            bVar.setAlpha((int) (i11 + ((this.f13991b - i11) * f11)));
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            c cVar = c.this;
            if (cVar.f13979s) {
                return;
            }
            cVar.r(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            c cVar = c.this;
            int iAbs = !cVar.K ? cVar.A - Math.abs(cVar.f13986z) : cVar.A;
            c cVar2 = c.this;
            int i11 = cVar2.f13984x;
            c.this.setTargetOffsetTopAndBottom((i11 + ((int) ((iAbs - i11) * f11))) - cVar2.f13982v.getTop());
            c.this.C.e(1.0f - f11);
        }
    }

    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            c.this.j(f11);
        }
    }

    class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            c cVar = c.this;
            float f12 = cVar.f13985y;
            cVar.setAnimationProgress(f12 + ((-f12) * f11));
            c.this.j(f11);
        }
    }

    public interface i {
    }

    public interface j {
        void a();
    }

    public c(@NonNull Context context) {
        this(context, null);
    }

    private void a(int i11, Animation.AnimationListener animationListener) {
        this.f13984x = i11;
        this.N.reset();
        this.N.setDuration(200L);
        this.N.setInterpolator(this.f13981u);
        if (animationListener != null) {
            this.f13982v.setAnimationListener(animationListener);
        }
        this.f13982v.clearAnimation();
        this.f13982v.startAnimation(this.N);
    }

    private void b(int i11, Animation.AnimationListener animationListener) {
        if (this.f13979s) {
            s(i11, animationListener);
            return;
        }
        this.f13984x = i11;
        this.O.reset();
        this.O.setDuration(200L);
        this.O.setInterpolator(this.f13981u);
        if (animationListener != null) {
            this.f13982v.setAnimationListener(animationListener);
        }
        this.f13982v.clearAnimation();
        this.f13982v.startAnimation(this.O);
    }

    private void d() {
        this.f13982v = new androidx.swiperefreshlayout.widget.a(getContext());
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.C = bVar;
        bVar.l(1);
        this.f13982v.setImageDrawable(this.C);
        this.f13982v.setVisibility(8);
        addView(this.f13982v);
    }

    private void f() {
        if (this.f13961a == null) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (!childAt.equals(this.f13982v)) {
                    this.f13961a = childAt;
                    return;
                }
            }
        }
    }

    private void g(float f11) {
        if (f11 > this.f13965e) {
            m(true, true);
            return;
        }
        this.f13963c = false;
        this.C.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        b(this.f13974n, !this.f13979s ? new e() : null);
        this.C.d(false);
    }

    private boolean h(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void i(float f11) {
        this.C.d(true);
        float fMin = Math.min(1.0f, Math.abs(f11 / this.f13965e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f11) - this.f13965e;
        int i11 = this.B;
        if (i11 <= 0) {
            i11 = this.K ? this.A - this.f13986z : this.A;
        }
        float f12 = i11;
        double dMax = Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(fAbs, f12 * 2.0f) / f12) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i12 = this.f13986z + ((int) ((f12 * fMin) + (f12 * fPow * 2.0f)));
        if (this.f13982v.getVisibility() != 0) {
            this.f13982v.setVisibility(0);
        }
        if (!this.f13979s) {
            this.f13982v.setScaleX(1.0f);
            this.f13982v.setScaleY(1.0f);
        }
        if (this.f13979s) {
            setAnimationProgress(Math.min(1.0f, f11 / this.f13965e));
        }
        if (f11 < this.f13965e) {
            if (this.C.getAlpha() > 76 && !h(this.F)) {
                q();
            }
        } else if (this.C.getAlpha() < 255 && !h(this.G)) {
            p();
        }
        this.C.j(BitmapDescriptorFactory.HUE_RED, Math.min(0.8f, fMax * 0.8f));
        this.C.e(Math.min(1.0f, fMax));
        this.C.g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i12 - this.f13974n);
    }

    private void k(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f13978r) {
            this.f13978r = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void m(boolean z11, boolean z12) {
        if (this.f13963c != z11) {
            this.I = z12;
            f();
            this.f13963c = z11;
            if (z11) {
                a(this.f13974n, this.M);
            } else {
                r(this.M);
            }
        }
    }

    private Animation n(int i11, int i12) {
        d dVar = new d(i11, i12);
        dVar.setDuration(300L);
        this.f13982v.setAnimationListener(null);
        this.f13982v.clearAnimation();
        this.f13982v.startAnimation(dVar);
        return dVar;
    }

    private void o(float f11) {
        float f12 = this.f13976p;
        float f13 = f11 - f12;
        int i11 = this.f13964d;
        if (f13 <= i11 || this.f13977q) {
            return;
        }
        this.f13975o = f12 + i11;
        this.f13977q = true;
        this.C.setAlpha(76);
    }

    private void p() {
        this.G = n(this.C.getAlpha(), 255);
    }

    private void q() {
        this.F = n(this.C.getAlpha(), 76);
    }

    private void s(int i11, Animation.AnimationListener animationListener) {
        this.f13984x = i11;
        this.f13985y = this.f13982v.getScaleX();
        h hVar = new h();
        this.H = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f13982v.setAnimationListener(animationListener);
        }
        this.f13982v.clearAnimation();
        this.f13982v.startAnimation(this.H);
    }

    private void setColorViewAlpha(int i11) {
        this.f13982v.getBackground().setAlpha(i11);
        this.C.setAlpha(i11);
    }

    private void t(Animation.AnimationListener animationListener) {
        this.f13982v.setVisibility(0);
        this.C.setAlpha(255);
        b bVar = new b();
        this.D = bVar;
        bVar.setDuration(this.f13973m);
        if (animationListener != null) {
            this.f13982v.setAnimationListener(animationListener);
        }
        this.f13982v.clearAnimation();
        this.f13982v.startAnimation(this.D);
    }

    public boolean c() {
        View view = this.f13961a;
        return view instanceof ListView ? androidx.core.widget.k.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return this.f13968h.a(f11, f12, z11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f11, float f12) {
        return this.f13968h.b(f11, f12);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return this.f13968h.c(i11, i12, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return this.f13968h.f(i11, i12, i13, i14, iArr);
    }

    public void e(int i11, int i12, int i13, int i14, int[] iArr, int i15, @NonNull int[] iArr2) {
        if (i15 == 0) {
            this.f13968h.e(i11, i12, i13, i14, iArr, i15, iArr2);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i11, int i12) {
        int i13 = this.f13983w;
        if (i13 < 0) {
            return i12;
        }
        if (i12 == i11 - 1) {
            return i13;
        }
        return i12 >= i13 ? i12 + 1 : i12;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f13967g.a();
    }

    public int getProgressCircleDiameter() {
        return this.J;
    }

    public int getProgressViewEndOffset() {
        return this.A;
    }

    public int getProgressViewStartOffset() {
        return this.f13986z;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f13968h.j();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f13968h.l();
    }

    void j(float f11) {
        int i11 = this.f13984x;
        setTargetOffsetTopAndBottom((i11 + ((int) ((this.f13986z - i11) * f11))) - this.f13982v.getTop());
    }

    void l() {
        this.f13982v.clearAnimation();
        this.C.stop();
        this.f13982v.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f13979s) {
            setAnimationProgress(BitmapDescriptorFactory.HUE_RED);
        } else {
            setTargetOffsetTopAndBottom(this.f13986z - this.f13974n);
        }
        this.f13974n = this.f13982v.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f13980t && actionMasked == 0) {
            this.f13980t = false;
        }
        if (!isEnabled() || this.f13980t || c() || this.f13963c || this.f13972l) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.f13986z - this.f13982v.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f13978r = pointerId;
            this.f13977q = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.f13976p = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.f13977q = false;
            this.f13978r = -1;
        } else if (actionMasked == 2) {
            int i11 = this.f13978r;
            if (i11 == -1) {
                Log.e(P, "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i11);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            o(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked == 3) {
            this.f13977q = false;
            this.f13978r = -1;
        } else if (actionMasked == 6) {
            k(motionEvent);
        }
        return this.f13977q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f13961a == null) {
            f();
        }
        View view = this.f13961a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f13982v.getMeasuredWidth();
        int measuredHeight2 = this.f13982v.getMeasuredHeight();
        int i15 = measuredWidth / 2;
        int i16 = measuredWidth2 / 2;
        int i17 = this.f13974n;
        this.f13982v.layout(i15 - i16, i17, i15 + i16, measuredHeight2 + i17);
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f13961a == null) {
            f();
        }
        View view = this.f13961a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f13982v.measure(View.MeasureSpec.makeMeasureSpec(this.J, 1073741824), View.MeasureSpec.makeMeasureSpec(this.J, 1073741824));
        this.f13983w = -1;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            if (getChildAt(i13) == this.f13982v) {
                this.f13983w = i13;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        return dispatchNestedFling(f11, f12, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f11, float f12) {
        return dispatchNestedPreFling(f11, f12);
    }

    @Override // androidx.core.view.x
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr, int i13) {
        if (i13 == 0) {
            onNestedPreScroll(view, i11, i12, iArr);
        }
    }

    @Override // androidx.core.view.y
    public void onNestedScroll(@NonNull View view, int i11, int i12, int i13, int i14, int i15, @NonNull int[] iArr) {
        if (i15 != 0) {
            return;
        }
        int i16 = iArr[1];
        e(i11, i12, i13, i14, this.f13970j, i15, iArr);
        int i17 = i14 - (iArr[1] - i16);
        int i18 = i17 == 0 ? i14 + this.f13970j[1] : i17;
        if (i18 >= 0 || c()) {
            return;
        }
        float fAbs = this.f13966f + Math.abs(i18);
        this.f13966f = fAbs;
        i(fAbs);
        iArr[1] = iArr[1] + i17;
    }

    @Override // androidx.core.view.x
    public void onNestedScrollAccepted(View view, View view2, int i11, int i12) {
        if (i12 == 0) {
            onNestedScrollAccepted(view, view2, i11);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f13997a);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f13963c);
    }

    @Override // androidx.core.view.x
    public boolean onStartNestedScroll(View view, View view2, int i11, int i12) {
        if (i12 == 0) {
            return onStartNestedScroll(view, view2, i11);
        }
        return false;
    }

    @Override // androidx.core.view.x
    public void onStopNestedScroll(View view, int i11) {
        if (i11 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f13980t && actionMasked == 0) {
            this.f13980t = false;
        }
        if (!isEnabled() || this.f13980t || c() || this.f13963c || this.f13972l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f13978r = motionEvent.getPointerId(0);
            this.f13977q = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f13978r);
                if (iFindPointerIndex < 0) {
                    Log.e(P, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f13977q) {
                    float y11 = (motionEvent.getY(iFindPointerIndex) - this.f13975o) * 0.5f;
                    this.f13977q = false;
                    g(y11);
                }
                this.f13978r = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f13978r);
                if (iFindPointerIndex2 < 0) {
                    Log.e(P, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y12 = motionEvent.getY(iFindPointerIndex2);
                o(y12);
                if (this.f13977q) {
                    float f11 = (y12 - this.f13975o) * 0.5f;
                    if (f11 <= BitmapDescriptorFactory.HUE_RED) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    i(f11);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(P, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f13978r = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    k(motionEvent);
                }
            }
        }
        return true;
    }

    void r(Animation.AnimationListener animationListener) {
        C0236c c0236c = new C0236c();
        this.E = c0236c;
        c0236c.setDuration(150L);
        this.f13982v.setAnimationListener(animationListener);
        this.f13982v.clearAnimation();
        this.f13982v.startAnimation(this.E);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        ViewParent parent;
        View view = this.f13961a;
        if (view == null || ViewCompat.V(view)) {
            super.requestDisallowInterceptTouchEvent(z11);
        } else {
            if (this.L || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z11);
        }
    }

    void setAnimationProgress(float f11) {
        this.f13982v.setScaleX(f11);
        this.f13982v.setScaleY(f11);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        f();
        this.C.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr2[i11] = androidx.core.content.b.getColor(context, iArr[i11]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i11) {
        this.f13965e = i11;
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        if (z11) {
            return;
        }
        l();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z11) {
        this.L = z11;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z11) {
        this.f13968h.m(z11);
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }

    public void setOnRefreshListener(j jVar) {
        this.f13962b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i11) {
        setProgressBackgroundColorSchemeResource(i11);
    }

    public void setProgressBackgroundColorSchemeColor(int i11) {
        this.f13982v.setBackgroundColor(i11);
    }

    public void setProgressBackgroundColorSchemeResource(int i11) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.b.getColor(getContext(), i11));
    }

    public void setProgressViewEndTarget(boolean z11, int i11) {
        this.A = i11;
        this.f13979s = z11;
        this.f13982v.invalidate();
    }

    public void setProgressViewOffset(boolean z11, int i11, int i12) {
        this.f13979s = z11;
        this.f13986z = i11;
        this.A = i12;
        this.K = true;
        l();
        this.f13963c = false;
    }

    public void setRefreshing(boolean z11) {
        if (!z11 || this.f13963c == z11) {
            m(z11, false);
            return;
        }
        this.f13963c = z11;
        setTargetOffsetTopAndBottom((!this.K ? this.A + this.f13986z : this.A) - this.f13974n);
        this.I = false;
        t(this.M);
    }

    public void setSize(int i11) {
        if (i11 == 0 || i11 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i11 == 0) {
                this.J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.J = (int) (displayMetrics.density * 40.0f);
            }
            this.f13982v.setImageDrawable(null);
            this.C.l(i11);
            this.f13982v.setImageDrawable(this.C);
        }
    }

    public void setSlingshotDistance(int i11) {
        this.B = i11;
    }

    void setTargetOffsetTopAndBottom(int i11) {
        this.f13982v.bringToFront();
        ViewCompat.a0(this.f13982v, i11);
        this.f13974n = this.f13982v.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i11) {
        return this.f13968h.o(i11);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f13968h.q();
    }

    static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f13997a;

        class a implements Parcelable.Creator<k> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i11) {
                return new k[i11];
            }
        }

        k(Parcelable parcelable, boolean z11) {
            super(parcelable);
            this.f13997a = z11;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeByte(this.f13997a ? (byte) 1 : (byte) 0);
        }

        k(Parcel parcel) {
            super(parcel);
            this.f13997a = parcel.readByte() != 0;
        }
    }

    public c(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13963c = false;
        this.f13965e = -1.0f;
        this.f13969i = new int[2];
        this.f13970j = new int[2];
        this.f13971k = new int[2];
        this.f13978r = -1;
        this.f13983w = -1;
        this.M = new a();
        this.N = new f();
        this.O = new g();
        this.f13964d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f13973m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f13981u = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.J = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i11 = (int) (displayMetrics.density * 64.0f);
        this.A = i11;
        this.f13965e = i11;
        this.f13967g = new z(this);
        this.f13968h = new w(this);
        setNestedScrollingEnabled(true);
        int i12 = -this.J;
        this.f13974n = i12;
        this.f13986z = i12;
        j(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        if (i12 > 0) {
            float f11 = this.f13966f;
            if (f11 > BitmapDescriptorFactory.HUE_RED) {
                float f12 = i12;
                if (f12 > f11) {
                    iArr[1] = (int) f11;
                    this.f13966f = BitmapDescriptorFactory.HUE_RED;
                } else {
                    this.f13966f = f11 - f12;
                    iArr[1] = i12;
                }
                i(this.f13966f);
            }
        }
        if (this.K && i12 > 0 && this.f13966f == BitmapDescriptorFactory.HUE_RED && Math.abs(i12 - iArr[1]) > 0) {
            this.f13982v.setVisibility(8);
        }
        int[] iArr2 = this.f13969i;
        if (dispatchNestedPreScroll(i11 - iArr[0], i12 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        this.f13967g.b(view, view2, i11);
        startNestedScroll(i11 & 2);
        this.f13966f = BitmapDescriptorFactory.HUE_RED;
        this.f13972l = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        return (!isEnabled() || this.f13980t || this.f13963c || (i11 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f13967g.d(view);
        this.f13972l = false;
        float f11 = this.f13966f;
        if (f11 > BitmapDescriptorFactory.HUE_RED) {
            g(f11);
            this.f13966f = BitmapDescriptorFactory.HUE_RED;
        }
        stopNestedScroll();
    }

    @Override // androidx.core.view.x
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14, int i15) {
        onNestedScroll(view, i11, i12, i13, i14, i15, this.f13971k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        onNestedScroll(view, i11, i12, i13, i14, 0, this.f13971k);
    }
}
