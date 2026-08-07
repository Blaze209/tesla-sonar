package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public class b extends ViewGroup {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    static final int[] f14308g0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final Comparator<f> f14309h0 = new a();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Interpolator f14310i0 = new InterpolatorC0242b();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final n f14311j0 = new n();
    private int A;
    private int B;
    private int C;
    private float D;
    private float E;
    private float F;
    private float G;
    private int H;
    private VelocityTracker I;
    private int J;
    private int K;
    private int L;
    private int M;
    private boolean N;
    private EdgeEffect O;
    private EdgeEffect P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private int T;
    private List<j> U;
    private j V;
    private j W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14312a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private List<i> f14313a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<f> f14314b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f14315b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f14316c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f14317c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f14318d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private ArrayList<View> f14319d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    androidx.viewpager.widget.a f14320e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final Runnable f14321e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f14322f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f14323f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f14324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Parcelable f14325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ClassLoader f14326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Scroller f14327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f14328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private l f14329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f14331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f14332o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f14333p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f14334q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f14335r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f14336s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f14337t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f14338u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f14339v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f14340w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f14341x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f14342y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f14343z;

    static class a implements Comparator<f> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f14348b - fVar2.f14348b;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.b$b, reason: collision with other inner class name */
    static class InterpolatorC0242b implements Interpolator {
        InterpolatorC0242b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12 = f11 - 1.0f;
            return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.setScrollState(0);
            b.this.C();
        }
    }

    class d implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f14345a = new Rect();

        d() {
        }

        @Override // androidx.core.view.a0
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            WindowInsetsCompat windowInsetsCompatB0 = ViewCompat.b0(view, windowInsetsCompat);
            if (windowInsetsCompatB0.p()) {
                return windowInsetsCompatB0;
            }
            Rect rect = this.f14345a;
            rect.left = windowInsetsCompatB0.k();
            rect.top = windowInsetsCompatB0.m();
            rect.right = windowInsetsCompatB0.l();
            rect.bottom = windowInsetsCompatB0.j();
            int childCount = b.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                WindowInsetsCompat windowInsetsCompatG = ViewCompat.g(b.this.getChildAt(i11), windowInsetsCompatB0);
                rect.left = Math.min(windowInsetsCompatG.k(), rect.left);
                rect.top = Math.min(windowInsetsCompatG.m(), rect.top);
                rect.right = Math.min(windowInsetsCompatG.l(), rect.right);
                rect.bottom = Math.min(windowInsetsCompatG.j(), rect.bottom);
            }
            return windowInsetsCompatB0.r(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f14348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f14349c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f14350d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f14351e;

        f() {
        }
    }

    class h extends androidx.core.view.a {
        h() {
        }

        private boolean n() {
            androidx.viewpager.widget.a aVar = b.this.f14320e;
            return aVar != null && aVar.d() > 1;
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(b.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = b.this.f14320e) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.d());
            accessibilityEvent.setFromIndex(b.this.f14322f);
            accessibilityEvent.setToIndex(b.this.f14322f);
        }

        @Override // androidx.core.view.a
        public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.t0(b.class.getName());
            accessibilityNodeInfoCompat.X0(n());
            if (b.this.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.a(4096);
            }
            if (b.this.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.a(PKIFailureInfo.certRevoked);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i11, Bundle bundle) {
            if (super.j(view, i11, bundle)) {
                return true;
            }
            if (i11 == 4096) {
                if (!b.this.canScrollHorizontally(1)) {
                    return false;
                }
                b bVar = b.this;
                bVar.setCurrentItem(bVar.f14322f + 1);
                return true;
            }
            if (i11 != 8192 || !b.this.canScrollHorizontally(-1)) {
                return false;
            }
            b bVar2 = b.this;
            bVar2.setCurrentItem(bVar2.f14322f - 1);
            return true;
        }
    }

    public interface i {
        void a(@NonNull b bVar, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2);
    }

    public interface j {
        void a(int i11, float f11, int i12);

        void b(int i11);

        void c(int i11);
    }

    public interface k {
    }

    private class l extends DataSetObserver {
        l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            b.this.g();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            b.this.g();
        }
    }

    public static class m extends r6.a {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14360c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Parcelable f14361d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ClassLoader f14362e;

        static class a implements Parcelable.ClassLoaderCreator<m> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i11) {
                return new m[i11];
            }
        }

        public m(@NonNull Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f14360c + "}";
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f14360c);
            parcel.writeParcelable(this.f14361d, i11);
        }

        m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f14360c = parcel.readInt();
            this.f14361d = parcel.readParcelable(classLoader);
            this.f14362e = classLoader;
        }
    }

    static class n implements Comparator<View> {
        n() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z11 = gVar.f14352a;
            if (z11 != gVar2.f14352a) {
                return z11 ? 1 : -1;
            }
            return gVar.f14356e - gVar2.f14356e;
        }
    }

    public b(@NonNull Context context) {
        super(context);
        this.f14314b = new ArrayList<>();
        this.f14316c = new f();
        this.f14318d = new Rect();
        this.f14324g = -1;
        this.f14325h = null;
        this.f14326i = null;
        this.f14334q = -3.4028235E38f;
        this.f14335r = Float.MAX_VALUE;
        this.f14341x = 1;
        this.H = -1;
        this.Q = true;
        this.R = false;
        this.f14321e0 = new c();
        this.f14323f0 = 0;
        t();
    }

    private boolean A(int i11) {
        if (this.f14314b.size() == 0) {
            if (this.Q) {
                return false;
            }
            this.S = false;
            w(0, BitmapDescriptorFactory.HUE_RED, 0);
            if (this.S) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarR = r();
        int clientWidth = getClientWidth();
        int i12 = this.f14330m;
        int i13 = clientWidth + i12;
        float f11 = clientWidth;
        int i14 = fVarR.f14348b;
        float f12 = ((i11 / f11) - fVarR.f14351e) / (fVarR.f14350d + (i12 / f11));
        this.S = false;
        w(i14, f12, (int) (i13 * f12));
        if (this.S) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean B(float f11) {
        boolean z11;
        boolean z12;
        float f12 = this.D - f11;
        this.D = f11;
        float scrollX = getScrollX() + f12;
        float clientWidth = getClientWidth();
        float f13 = this.f14334q * clientWidth;
        float f14 = this.f14335r * clientWidth;
        boolean z13 = false;
        f fVar = this.f14314b.get(0);
        ArrayList<f> arrayList = this.f14314b;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f14348b != 0) {
            f13 = fVar.f14351e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (fVar2.f14348b != this.f14320e.d() - 1) {
            f14 = fVar2.f14351e * clientWidth;
            z12 = false;
        } else {
            z12 = true;
        }
        if (scrollX < f13) {
            if (z11) {
                this.O.onPull(Math.abs(f13 - scrollX) / clientWidth);
                z13 = true;
            }
            scrollX = f13;
        } else if (scrollX > f14) {
            if (z12) {
                this.P.onPull(Math.abs(scrollX - f14) / clientWidth);
                z13 = true;
            }
            scrollX = f14;
        }
        int i11 = (int) scrollX;
        this.D += scrollX - i11;
        scrollTo(i11, getScrollY());
        A(i11);
        return z13;
    }

    private void E(int i11, int i12, int i13, int i14) {
        if (i12 > 0 && !this.f14314b.isEmpty()) {
            if (!this.f14327j.isFinished()) {
                this.f14327j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i12 - getPaddingLeft()) - getPaddingRight()) + i14)) * (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)), getScrollY());
                return;
            }
        }
        f fVarS = s(this.f14322f);
        int iMin = (int) ((fVarS != null ? Math.min(fVarS.f14351e, this.f14335r) : BitmapDescriptorFactory.HUE_RED) * ((i11 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            f(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private void F() {
        int i11 = 0;
        while (i11 < getChildCount()) {
            if (!((g) getChildAt(i11).getLayoutParams()).f14352a) {
                removeViewAt(i11);
                i11--;
            }
            i11++;
        }
    }

    private void G(boolean z11) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z11);
        }
    }

    private boolean H() {
        this.H = -1;
        m();
        this.O.onRelease();
        this.P.onRelease();
        return this.O.isFinished() || this.P.isFinished();
    }

    private void I(int i11, boolean z11, int i12, boolean z12) {
        f fVarS = s(i11);
        int clientWidth = fVarS != null ? (int) (getClientWidth() * Math.max(this.f14334q, Math.min(fVarS.f14351e, this.f14335r))) : 0;
        if (z11) {
            L(clientWidth, 0, i12);
            if (z12) {
                j(i11);
                return;
            }
            return;
        }
        if (z12) {
            j(i11);
        }
        f(false);
        scrollTo(clientWidth, 0);
        A(clientWidth);
    }

    private void M() {
        if (this.f14317c0 != 0) {
            ArrayList<View> arrayList = this.f14319d0;
            if (arrayList == null) {
                this.f14319d0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                this.f14319d0.add(getChildAt(i11));
            }
            Collections.sort(this.f14319d0, f14311j0);
        }
    }

    private void d(f fVar, int i11, f fVar2) {
        int i12;
        int i13;
        f fVar3;
        f fVar4;
        int iD = this.f14320e.d();
        int clientWidth = getClientWidth();
        float f11 = clientWidth > 0 ? this.f14330m / clientWidth : BitmapDescriptorFactory.HUE_RED;
        if (fVar2 != null) {
            int i14 = fVar2.f14348b;
            int i15 = fVar.f14348b;
            if (i14 < i15) {
                float f12 = fVar2.f14351e + fVar2.f14350d + f11;
                int i16 = i14 + 1;
                int i17 = 0;
                while (i16 <= fVar.f14348b && i17 < this.f14314b.size()) {
                    f fVar5 = this.f14314b.get(i17);
                    while (true) {
                        fVar4 = fVar5;
                        if (i16 <= fVar4.f14348b || i17 >= this.f14314b.size() - 1) {
                            break;
                        }
                        i17++;
                        fVar5 = this.f14314b.get(i17);
                    }
                    while (i16 < fVar4.f14348b) {
                        f12 += this.f14320e.f(i16) + f11;
                        i16++;
                    }
                    fVar4.f14351e = f12;
                    f12 += fVar4.f14350d + f11;
                    i16++;
                }
            } else if (i14 > i15) {
                int size = this.f14314b.size() - 1;
                float f13 = fVar2.f14351e;
                while (true) {
                    i14--;
                    if (i14 < fVar.f14348b || size < 0) {
                        break;
                    }
                    f fVar6 = this.f14314b.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i14 >= fVar3.f14348b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.f14314b.get(size);
                    }
                    while (i14 > fVar3.f14348b) {
                        f13 -= this.f14320e.f(i14) + f11;
                        i14--;
                    }
                    f13 -= fVar3.f14350d + f11;
                    fVar3.f14351e = f13;
                }
            }
        }
        int size2 = this.f14314b.size();
        float f14 = fVar.f14351e;
        int i18 = fVar.f14348b;
        int i19 = i18 - 1;
        this.f14334q = i18 == 0 ? f14 : -3.4028235E38f;
        int i21 = iD - 1;
        this.f14335r = i18 == i21 ? (fVar.f14350d + f14) - 1.0f : Float.MAX_VALUE;
        int i22 = i11 - 1;
        while (i22 >= 0) {
            f fVar7 = this.f14314b.get(i22);
            while (true) {
                i13 = fVar7.f14348b;
                if (i19 <= i13) {
                    break;
                }
                f14 -= this.f14320e.f(i19) + f11;
                i19--;
            }
            f14 -= fVar7.f14350d + f11;
            fVar7.f14351e = f14;
            if (i13 == 0) {
                this.f14334q = f14;
            }
            i22--;
            i19--;
        }
        float f15 = fVar.f14351e + fVar.f14350d + f11;
        int i23 = fVar.f14348b + 1;
        int i24 = i11 + 1;
        while (i24 < size2) {
            f fVar8 = this.f14314b.get(i24);
            while (true) {
                i12 = fVar8.f14348b;
                if (i23 >= i12) {
                    break;
                }
                f15 += this.f14320e.f(i23) + f11;
                i23++;
            }
            if (i12 == i21) {
                this.f14335r = (fVar8.f14350d + f15) - 1.0f;
            }
            fVar8.f14351e = f15;
            f15 += fVar8.f14350d + f11;
            i24++;
            i23++;
        }
        this.R = false;
    }

    private void f(boolean z11) {
        boolean z12 = this.f14323f0 == 2;
        if (z12) {
            setScrollingCacheEnabled(false);
            if (!this.f14327j.isFinished()) {
                this.f14327j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f14327j.getCurrX();
                int currY = this.f14327j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A(currX);
                    }
                }
            }
        }
        this.f14340w = false;
        for (int i11 = 0; i11 < this.f14314b.size(); i11++) {
            f fVar = this.f14314b.get(i11);
            if (fVar.f14349c) {
                fVar.f14349c = false;
                z12 = true;
            }
        }
        if (z12) {
            if (z11) {
                ViewCompat.h0(this, this.f14321e0);
            } else {
                this.f14321e0.run();
            }
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private int h(int i11, float f11, int i12, int i13) {
        if (Math.abs(i13) <= this.L || Math.abs(i12) <= this.J) {
            i11 += (int) (f11 + (i11 >= this.f14322f ? 0.4f : 0.6f));
        } else if (i12 <= 0) {
            i11++;
        }
        if (this.f14314b.size() <= 0) {
            return i11;
        }
        f fVar = this.f14314b.get(0);
        ArrayList<f> arrayList = this.f14314b;
        return Math.max(fVar.f14348b, Math.min(i11, arrayList.get(arrayList.size() - 1).f14348b));
    }

    private void i(int i11, float f11, int i12) {
        j jVar = this.V;
        if (jVar != null) {
            jVar.a(i11, f11, i12);
        }
        List<j> list = this.U;
        if (list != null) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                j jVar2 = this.U.get(i13);
                if (jVar2 != null) {
                    jVar2.a(i11, f11, i12);
                }
            }
        }
        j jVar3 = this.W;
        if (jVar3 != null) {
            jVar3.a(i11, f11, i12);
        }
    }

    private void j(int i11) {
        j jVar = this.V;
        if (jVar != null) {
            jVar.c(i11);
        }
        List<j> list = this.U;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = this.U.get(i12);
                if (jVar2 != null) {
                    jVar2.c(i11);
                }
            }
        }
        j jVar3 = this.W;
        if (jVar3 != null) {
            jVar3.c(i11);
        }
    }

    private void k(int i11) {
        j jVar = this.V;
        if (jVar != null) {
            jVar.b(i11);
        }
        List<j> list = this.U;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = this.U.get(i12);
                if (jVar2 != null) {
                    jVar2.b(i11);
                }
            }
        }
        j jVar3 = this.W;
        if (jVar3 != null) {
            jVar3.b(i11);
        }
    }

    private void m() {
        this.f14342y = false;
        this.f14343z = false;
        VelocityTracker velocityTracker = this.I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.I = null;
        }
    }

    private Rect o(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private f r() {
        int i11;
        int clientWidth = getClientWidth();
        float f11 = BitmapDescriptorFactory.HUE_RED;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f12 = clientWidth > 0 ? this.f14330m / clientWidth : 0.0f;
        int i12 = 0;
        boolean z11 = true;
        f fVar = null;
        int i13 = -1;
        float f13 = 0.0f;
        while (i12 < this.f14314b.size()) {
            f fVar2 = this.f14314b.get(i12);
            if (!z11 && fVar2.f14348b != (i11 = i13 + 1)) {
                fVar2 = this.f14316c;
                fVar2.f14351e = f11 + f13 + f12;
                fVar2.f14348b = i11;
                fVar2.f14350d = this.f14320e.f(i11);
                i12--;
            }
            f fVar3 = fVar2;
            f11 = fVar3.f14351e;
            float f14 = fVar3.f14350d + f11 + f12;
            if (!z11 && scrollX < f11) {
                break;
            }
            if (scrollX < f14 || i12 == this.f14314b.size() - 1) {
                return fVar3;
            }
            int i14 = fVar3.f14348b;
            float f15 = fVar3.f14350d;
            i12++;
            i13 = i14;
            f13 = f15;
            fVar = fVar3;
            z11 = false;
        }
        return fVar;
    }

    private void setScrollingCacheEnabled(boolean z11) {
        if (this.f14339v != z11) {
            this.f14339v = z11;
        }
    }

    private static boolean u(@NonNull View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean v(float f11, float f12) {
        if (f11 >= this.B || f12 <= BitmapDescriptorFactory.HUE_RED) {
            return f11 > ((float) (getWidth() - this.B)) && f12 < BitmapDescriptorFactory.HUE_RED;
        }
        return true;
    }

    private void x(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.H) {
            int i11 = actionIndex == 0 ? 1 : 0;
            this.D = motionEvent.getX(i11);
            this.H = motionEvent.getPointerId(i11);
            VelocityTracker velocityTracker = this.I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    void C() {
        D(this.f14322f);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00cc A[PHI: r7 r10 r15
      0x00cc: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:64:0x00f0, B:61:0x00da, B:53:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    void D(int i11) {
        f fVarS;
        String hexString;
        f fVarA;
        f fVarQ;
        f fVar;
        int i12 = this.f14322f;
        if (i12 != i11) {
            fVarS = s(i12);
            this.f14322f = i11;
        } else {
            fVarS = null;
        }
        if (this.f14320e == null) {
            M();
            return;
        }
        if (this.f14340w) {
            M();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f14320e.p(this);
        int i13 = this.f14341x;
        int iMax = Math.max(0, this.f14322f - i13);
        int iD = this.f14320e.d();
        int iMin = Math.min(iD - 1, this.f14322f + i13);
        if (iD != this.f14312a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f14312a + ", found: " + iD + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f14320e.getClass());
        }
        int i14 = 0;
        while (true) {
            if (i14 < this.f14314b.size()) {
                fVarA = this.f14314b.get(i14);
                int i15 = fVarA.f14348b;
                int i16 = this.f14322f;
                if (i15 >= i16) {
                    if (i15 != i16) {
                        break;
                    } else {
                        break;
                    }
                }
                i14++;
            }
            fVarA = null;
            break;
        }
        if (fVarA == null && iD > 0) {
            fVarA = a(this.f14322f, i14);
        }
        if (fVarA != null) {
            int i17 = i14 - 1;
            f fVar2 = i17 >= 0 ? this.f14314b.get(i17) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - fVarA.f14350d) + (getPaddingLeft() / clientWidth);
            float f11 = 0.0f;
            for (int i18 = this.f14322f - 1; i18 >= 0; i18--) {
                if (f11 < paddingLeft || i18 >= iMax) {
                    if (fVar2 == null || i18 != fVar2.f14348b) {
                        f11 += a(i18, i17 + 1).f14350d;
                        i14++;
                        if (i17 >= 0) {
                            fVar = this.f14314b.get(i17);
                        } else {
                            fVar = null;
                        }
                    } else {
                        f11 += fVar2.f14350d;
                        i17--;
                        if (i17 >= 0) {
                            fVar = this.f14314b.get(i17);
                        } else {
                            fVar = null;
                        }
                    }
                    fVar2 = fVar;
                } else {
                    if (fVar2 == null) {
                        break;
                    }
                    if (i18 == fVar2.f14348b && !fVar2.f14349c) {
                        this.f14314b.remove(i17);
                        this.f14320e.a(this, i18, fVar2.f14347a);
                        i17--;
                        i14--;
                        if (i17 >= 0) {
                            fVar = this.f14314b.get(i17);
                        } else {
                            fVar = null;
                        }
                        fVar2 = fVar;
                    }
                }
            }
            float f12 = fVarA.f14350d;
            int i19 = i14 + 1;
            if (f12 < 2.0f) {
                f fVar3 = i19 < this.f14314b.size() ? this.f14314b.get(i19) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i21 = this.f14322f;
                while (true) {
                    i21++;
                    if (i21 >= iD) {
                        break;
                    }
                    if (f12 >= paddingRight && i21 > iMin) {
                        if (fVar3 == null) {
                            break;
                        }
                        if (i21 == fVar3.f14348b && !fVar3.f14349c) {
                            this.f14314b.remove(i19);
                            this.f14320e.a(this, i21, fVar3.f14347a);
                            if (i19 < this.f14314b.size()) {
                                fVar3 = this.f14314b.get(i19);
                            }
                        }
                    } else if (fVar3 == null || i21 != fVar3.f14348b) {
                        f fVarA2 = a(i21, i19);
                        i19++;
                        f12 += fVarA2.f14350d;
                        fVar3 = i19 < this.f14314b.size() ? this.f14314b.get(i19) : null;
                    } else {
                        f12 += fVar3.f14350d;
                        i19++;
                        if (i19 < this.f14314b.size()) {
                            fVar3 = this.f14314b.get(i19);
                        }
                    }
                }
            }
            d(fVarA, i14, fVarS);
            this.f14320e.m(this, this.f14322f, fVarA.f14347a);
        }
        this.f14320e.c(this);
        int childCount = getChildCount();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            g gVar = (g) childAt.getLayoutParams();
            gVar.f14357f = i22;
            if (!gVar.f14352a && gVar.f14354c == BitmapDescriptorFactory.HUE_RED && (fVarQ = q(childAt)) != null) {
                gVar.f14354c = fVarQ.f14350d;
                gVar.f14356e = fVarQ.f14348b;
            }
        }
        M();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            f fVarP = viewFindFocus != null ? p(viewFindFocus) : null;
            if (fVarP == null || fVarP.f14348b != this.f14322f) {
                for (int i23 = 0; i23 < getChildCount(); i23++) {
                    View childAt2 = getChildAt(i23);
                    f fVarQ2 = q(childAt2);
                    if (fVarQ2 != null && fVarQ2.f14348b == this.f14322f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    void J(int i11, boolean z11, boolean z12) {
        K(i11, z11, z12, 0);
    }

    void K(int i11, boolean z11, boolean z12, int i12) {
        androidx.viewpager.widget.a aVar = this.f14320e;
        if (aVar == null || aVar.d() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z12 && this.f14322f == i11 && this.f14314b.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i11 < 0) {
            i11 = 0;
        } else if (i11 >= this.f14320e.d()) {
            i11 = this.f14320e.d() - 1;
        }
        int i13 = this.f14341x;
        int i14 = this.f14322f;
        if (i11 > i14 + i13 || i11 < i14 - i13) {
            for (int i15 = 0; i15 < this.f14314b.size(); i15++) {
                this.f14314b.get(i15).f14349c = true;
            }
        }
        boolean z13 = this.f14322f != i11;
        if (!this.Q) {
            D(i11);
            I(i11, z11, i12, z13);
        } else {
            this.f14322f = i11;
            if (z13) {
                j(i11);
            }
            requestLayout();
        }
    }

    void L(int i11, int i12, int i13) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f14327j;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f14328k ? this.f14327j.getCurrX() : this.f14327j.getStartX();
            this.f14327j.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i14 = scrollX;
        int scrollY = getScrollY();
        int i15 = i11 - i14;
        int i16 = i12 - scrollY;
        if (i15 == 0 && i16 == 0) {
            f(false);
            C();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i17 = clientWidth / 2;
        float f11 = clientWidth;
        float f12 = i17;
        float fL = f12 + (l(Math.min(1.0f, (Math.abs(i15) * 1.0f) / f11)) * f12);
        int iAbs2 = Math.abs(i13);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fL / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i15) / ((f11 * this.f14320e.f(this.f14322f)) + this.f14330m)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.f14328k = false;
        this.f14327j.startScroll(i14, scrollY, i15, i16, iMin);
        ViewCompat.g0(this);
    }

    f a(int i11, int i12) {
        f fVar = new f();
        fVar.f14348b = i11;
        fVar.f14347a = this.f14320e.g(this, i11);
        fVar.f14350d = this.f14320e.f(i11);
        if (i12 < 0 || i12 >= this.f14314b.size()) {
            this.f14314b.add(fVar);
            return fVar;
        }
        this.f14314b.add(i12, fVar);
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i11, int i12) {
        f fVarQ;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() == 0 && (fVarQ = q(childAt)) != null && fVarQ.f14348b == this.f14322f) {
                    childAt.addFocusables(arrayList, i11, i12);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i12 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f fVarQ;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (fVarQ = q(childAt)) != null && fVarQ.f14348b == this.f14322f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean zU = gVar.f14352a | u(view);
        gVar.f14352a = zU;
        if (!this.f14338u) {
            super.addView(view, i11, layoutParams);
        } else {
            if (zU) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.f14355d = true;
            addViewInLayout(view, i11, layoutParams);
        }
    }

    public void b(@NonNull j jVar) {
        if (this.U == null) {
            this.U = new ArrayList();
        }
        this.U.add(jVar);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    public boolean c(int i11) {
        boolean zY;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb2.append(" => ");
                        sb2.append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i11);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i11 == 17 || i11 == 1) {
                zY = y();
            } else if (i11 == 66 || i11 == 2) {
                zY = z();
            } else {
                zY = false;
            }
        } else if (i11 == 17) {
            zY = (viewFindFocus == null || o(this.f14318d, viewFindNextFocus).left < o(this.f14318d, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : y();
        } else if (i11 == 66) {
            zY = (viewFindFocus == null || o(this.f14318d, viewFindNextFocus).left > o(this.f14318d, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : z();
        } else {
            zY = false;
        }
        if (zY) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i11));
        }
        return zY;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i11) {
        if (this.f14320e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i11 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f14334q));
        }
        return i11 > 0 && scrollX < ((int) (((float) clientWidth) * this.f14335r));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f14328k = true;
        if (this.f14327j.isFinished() || !this.f14327j.computeScrollOffset()) {
            f(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f14327j.getCurrX();
        int currY = this.f14327j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!A(currX)) {
                this.f14327j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.g0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || n(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarQ;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (fVarQ = q(childAt)) != null && fVarQ.f14348b == this.f14322f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f14320e) != null && aVar.d() > 1)) {
            if (!this.O.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f14334q * width);
                this.O.setSize(height, width);
                zDraw = this.O.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.P.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f14335r + 1.0f)) * width2);
                this.P.setSize(height2, width2);
                zDraw |= this.P.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.O.finish();
            this.P.finish();
        }
        if (zDraw) {
            ViewCompat.g0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f14331n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    protected boolean e(View view, boolean z11, int i11, int i12, int i13) {
        int i14;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i15 = i12 + scrollX;
                if (i15 >= childAt.getLeft() && i15 < childAt.getRight() && (i14 = i13 + scrollY) >= childAt.getTop() && i14 < childAt.getBottom() && e(childAt, true, i11, i15 - childAt.getLeft(), i14 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z11 && view.canScrollHorizontally(-i11);
    }

    void g() {
        int iD = this.f14320e.d();
        this.f14312a = iD;
        boolean z11 = this.f14314b.size() < (this.f14341x * 2) + 1 && this.f14314b.size() < iD;
        int iMax = this.f14322f;
        int i11 = 0;
        boolean z12 = false;
        while (i11 < this.f14314b.size()) {
            f fVar = this.f14314b.get(i11);
            int iE = this.f14320e.e(fVar.f14347a);
            if (iE != -1) {
                if (iE == -2) {
                    this.f14314b.remove(i11);
                    i11--;
                    if (!z12) {
                        this.f14320e.p(this);
                        z12 = true;
                    }
                    this.f14320e.a(this, fVar.f14348b, fVar.f14347a);
                    int i12 = this.f14322f;
                    if (i12 == fVar.f14348b) {
                        iMax = Math.max(0, Math.min(i12, iD - 1));
                    }
                } else {
                    int i13 = fVar.f14348b;
                    if (i13 != iE) {
                        if (i13 == this.f14322f) {
                            iMax = iE;
                        }
                        fVar.f14348b = iE;
                    }
                }
                z11 = true;
            }
            i11++;
        }
        if (z12) {
            this.f14320e.c(this);
        }
        Collections.sort(this.f14314b, f14309h0);
        if (z11) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                g gVar = (g) getChildAt(i14).getLayoutParams();
                if (!gVar.f14352a) {
                    gVar.f14354c = BitmapDescriptorFactory.HUE_RED;
                }
            }
            J(iMax, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return this.f14320e;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i11, int i12) {
        if (this.f14317c0 == 2) {
            i12 = (i11 - 1) - i12;
        }
        return ((g) this.f14319d0.get(i12).getLayoutParams()).f14357f;
    }

    public int getCurrentItem() {
        return this.f14322f;
    }

    public int getOffscreenPageLimit() {
        return this.f14341x;
    }

    public int getPageMargin() {
        return this.f14330m;
    }

    float l(float f11) {
        return (float) Math.sin((f11 - 0.5f) * 0.47123894f);
    }

    public boolean n(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return keyEvent.hasModifiers(2) ? y() : c(17);
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? z() : c(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return c(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return c(1);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f14321e0);
        Scroller scroller = this.f14327j;
        if (scroller != null && !scroller.isFinished()) {
            this.f14327j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i11;
        float f11;
        super.onDraw(canvas);
        if (this.f14330m <= 0 || this.f14331n == null || this.f14314b.size() <= 0 || this.f14320e == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f12 = width;
        float f13 = this.f14330m / f12;
        int i12 = 0;
        f fVar = this.f14314b.get(0);
        float f14 = fVar.f14351e;
        int size = this.f14314b.size();
        int i13 = fVar.f14348b;
        int i14 = this.f14314b.get(size - 1).f14348b;
        while (i13 < i14) {
            while (true) {
                i11 = fVar.f14348b;
                if (i13 <= i11 || i12 >= size) {
                    break;
                }
                i12++;
                fVar = this.f14314b.get(i12);
            }
            if (i13 == i11) {
                float f15 = fVar.f14351e;
                float f16 = fVar.f14350d;
                f11 = (f15 + f16) * f12;
                f14 = f15 + f16 + f13;
            } else {
                float f17 = this.f14320e.f(i13);
                f11 = (f14 + f17) * f12;
                f14 += f17 + f13;
            }
            if (this.f14330m + f11 > scrollX) {
                this.f14331n.setBounds(Math.round(f11), this.f14332o, Math.round(this.f14330m + f11), this.f14333p);
                this.f14331n.draw(canvas);
            }
            if (f11 > scrollX + width) {
                return;
            }
            i13++;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            H();
            return false;
        }
        if (action != 0) {
            if (this.f14342y) {
                return true;
            }
            if (this.f14343z) {
                return false;
            }
        }
        if (action == 0) {
            float x11 = motionEvent.getX();
            this.F = x11;
            this.D = x11;
            float y11 = motionEvent.getY();
            this.G = y11;
            this.E = y11;
            this.H = motionEvent.getPointerId(0);
            this.f14343z = false;
            this.f14328k = true;
            this.f14327j.computeScrollOffset();
            if (this.f14323f0 != 2 || Math.abs(this.f14327j.getFinalX() - this.f14327j.getCurrX()) <= this.M) {
                f(false);
                this.f14342y = false;
            } else {
                this.f14327j.abortAnimation();
                this.f14340w = false;
                C();
                this.f14342y = true;
                G(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i11 = this.H;
            if (i11 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i11);
                float x12 = motionEvent.getX(iFindPointerIndex);
                float f11 = x12 - this.D;
                float fAbs = Math.abs(f11);
                float y12 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y12 - this.G);
                if (f11 != BitmapDescriptorFactory.HUE_RED && !v(this.D, f11) && e(this, false, (int) f11, (int) x12, (int) y12)) {
                    this.D = x12;
                    this.E = y12;
                    this.f14343z = true;
                    return false;
                }
                int i12 = this.C;
                if (fAbs > i12 && fAbs * 0.5f > fAbs2) {
                    this.f14342y = true;
                    G(true);
                    setScrollState(1);
                    float f12 = this.F;
                    float f13 = this.C;
                    this.D = f11 > BitmapDescriptorFactory.HUE_RED ? f12 + f13 : f12 - f13;
                    this.E = y12;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i12) {
                    this.f14343z = true;
                }
                if (this.f14342y && B(x12)) {
                    ViewCompat.g0(this);
                }
            }
        } else if (action == 6) {
            x(motionEvent);
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent);
        return this.f14342y;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean z12;
        f fVarQ;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f14352a) {
                    int i19 = gVar.f14353b;
                    int i21 = i19 & 7;
                    int i22 = i19 & 112;
                    if (i21 != 1) {
                        if (i21 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i21 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i15 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i22 != 16) {
                            if (i22 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i22 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i16 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i23 = paddingLeft + scrollX;
                            childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, paddingTop + childAt.getMeasuredHeight());
                            i17++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i16 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i24 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i24;
                        int i25 = paddingLeft + scrollX;
                        childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, paddingTop + childAt.getMeasuredHeight());
                        i17++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i15 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i26 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i26;
                    if (i22 != 16) {
                        if (i22 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i22 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i16 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i27 = paddingLeft + scrollX;
                        childAt.layout(i27, paddingTop, childAt.getMeasuredWidth() + i27, paddingTop + childAt.getMeasuredHeight());
                        i17++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i16 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i28 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i28;
                    int i29 = paddingLeft + scrollX;
                    childAt.layout(i29, paddingTop, childAt.getMeasuredWidth() + i29, paddingTop + childAt.getMeasuredHeight());
                    i17++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i31 = (i15 - paddingLeft) - paddingRight;
        for (int i32 = 0; i32 < childCount; i32++) {
            View childAt2 = getChildAt(i32);
            if (childAt2.getVisibility() != 8) {
                g gVar2 = (g) childAt2.getLayoutParams();
                if (!gVar2.f14352a && (fVarQ = q(childAt2)) != null) {
                    float f11 = i31;
                    int i33 = ((int) (fVarQ.f14351e * f11)) + paddingLeft;
                    if (gVar2.f14355d) {
                        gVar2.f14355d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f11 * gVar2.f14354c), 1073741824), View.MeasureSpec.makeMeasureSpec((i16 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i33, paddingTop, childAt2.getMeasuredWidth() + i33, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f14332o = paddingTop;
        this.f14333p = i16 - paddingBottom;
        this.T = i17;
        if (this.Q) {
            z12 = false;
            I(this.f14322f, false, 0, false);
        } else {
            z12 = false;
        }
        this.Q = z12;
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        g gVar;
        g gVar2;
        int i13;
        setMeasuredDimension(View.getDefaultSize(0, i11), View.getDefaultSize(0, i12));
        int measuredWidth = getMeasuredWidth();
        this.B = Math.min(measuredWidth / 10, this.A);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            boolean z11 = true;
            int i15 = 1073741824;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f14352a) {
                int i16 = gVar2.f14353b;
                int i17 = i16 & 7;
                int i18 = i16 & 112;
                boolean z12 = i18 == 48 || i18 == 80;
                if (i17 != 3 && i17 != 5) {
                    z11 = false;
                }
                int i19 = Integer.MIN_VALUE;
                if (z12) {
                    i13 = Integer.MIN_VALUE;
                    i19 = 1073741824;
                } else {
                    i13 = z11 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i21 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i21 != -2) {
                    if (i21 == -1) {
                        i21 = paddingLeft;
                    }
                    i19 = 1073741824;
                } else {
                    i21 = paddingLeft;
                }
                int i22 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i22 == -2) {
                    i22 = measuredHeight;
                    i15 = i13;
                } else if (i22 == -1) {
                    i22 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, i19), View.MeasureSpec.makeMeasureSpec(i22, i15));
                if (z12) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z11) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i14++;
        }
        this.f14336s = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f14337t = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f14338u = true;
        C();
        this.f14338u = false;
        int childCount2 = getChildCount();
        for (int i23 = 0; i23 < childCount2; i23++) {
            View childAt2 = getChildAt(i23);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f14352a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f14354c), 1073741824), this.f14337t);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i11, Rect rect) {
        int i12;
        int i13;
        int i14;
        f fVarQ;
        int childCount = getChildCount();
        if ((i11 & 2) != 0) {
            i13 = childCount;
            i12 = 0;
            i14 = 1;
        } else {
            i12 = childCount - 1;
            i13 = -1;
            i14 = -1;
        }
        while (i12 != i13) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 0 && (fVarQ = q(childAt)) != null && fVarQ.f14348b == this.f14322f && childAt.requestFocus(i11, rect)) {
                return true;
            }
            i12 += i14;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.a());
        androidx.viewpager.widget.a aVar = this.f14320e;
        if (aVar != null) {
            aVar.j(mVar.f14361d, mVar.f14362e);
            J(mVar.f14360c, false, true);
        } else {
            this.f14324g = mVar.f14360c;
            this.f14325h = mVar.f14361d;
            this.f14326i = mVar.f14362e;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f14360c = this.f14322f;
        androidx.viewpager.widget.a aVar = this.f14320e;
        if (aVar != null) {
            mVar.f14361d = aVar.k();
        }
        return mVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 != i13) {
            int i15 = this.f14330m;
            E(i11, i13, i15, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.viewpager.widget.a aVar;
        if (this.N) {
            return true;
        }
        boolean zH = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f14320e) == null || aVar.d() == 0) {
            return false;
        }
        if (this.I == null) {
            this.I = VelocityTracker.obtain();
        }
        this.I.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f14327j.abortAnimation();
            this.f14340w = false;
            C();
            float x11 = motionEvent.getX();
            this.F = x11;
            this.D = x11;
            float y11 = motionEvent.getY();
            this.G = y11;
            this.E = y11;
            this.H = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.D = motionEvent.getX(actionIndex);
                        this.H = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        x(motionEvent);
                        this.D = motionEvent.getX(motionEvent.findPointerIndex(this.H));
                    }
                } else if (this.f14342y) {
                    I(this.f14322f, true, 0, false);
                    zH = H();
                }
            } else if (!this.f14342y) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.H);
                if (iFindPointerIndex == -1) {
                    zH = H();
                } else {
                    float x12 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x12 - this.D);
                    float y12 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y12 - this.E);
                    if (fAbs > this.C && fAbs > fAbs2) {
                        this.f14342y = true;
                        G(true);
                        float f11 = this.F;
                        this.D = x12 - f11 > BitmapDescriptorFactory.HUE_RED ? f11 + this.C : f11 - this.C;
                        this.E = y12;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f14342y) {
                        zH = B(motionEvent.getX(motionEvent.findPointerIndex(this.H)));
                    }
                }
            } else if (this.f14342y) {
                zH = B(motionEvent.getX(motionEvent.findPointerIndex(this.H)));
            }
        } else if (this.f14342y) {
            VelocityTracker velocityTracker = this.I;
            velocityTracker.computeCurrentVelocity(1000, this.K);
            int xVelocity = (int) velocityTracker.getXVelocity(this.H);
            this.f14340w = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f fVarR = r();
            float f12 = clientWidth;
            K(h(fVarR.f14348b, ((scrollX / f12) - fVarR.f14351e) / (fVarR.f14350d + (this.f14330m / f12)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.H)) - this.F)), true, true, xVelocity);
            zH = H();
        }
        if (zH) {
            ViewCompat.g0(this);
        }
        return true;
    }

    f p(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return q(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    f q(View view) {
        for (int i11 = 0; i11 < this.f14314b.size(); i11++) {
            f fVar = this.f14314b.get(i11);
            if (this.f14320e.h(view, fVar.f14347a)) {
                return fVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f14338u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    f s(int i11) {
        for (int i12 = 0; i12 < this.f14314b.size(); i12++) {
            f fVar = this.f14314b.get(i12);
            if (fVar.f14348b == i11) {
                return fVar;
            }
        }
        return null;
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.f14320e;
        if (aVar2 != null) {
            aVar2.n(null);
            this.f14320e.p(this);
            for (int i11 = 0; i11 < this.f14314b.size(); i11++) {
                f fVar = this.f14314b.get(i11);
                this.f14320e.a(this, fVar.f14348b, fVar.f14347a);
            }
            this.f14320e.c(this);
            this.f14314b.clear();
            F();
            this.f14322f = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.f14320e;
        this.f14320e = aVar;
        this.f14312a = 0;
        if (aVar != null) {
            if (this.f14329l == null) {
                this.f14329l = new l();
            }
            this.f14320e.n(this.f14329l);
            this.f14340w = false;
            boolean z11 = this.Q;
            this.Q = true;
            this.f14312a = this.f14320e.d();
            if (this.f14324g >= 0) {
                this.f14320e.j(this.f14325h, this.f14326i);
                J(this.f14324g, false, true);
                this.f14324g = -1;
                this.f14325h = null;
                this.f14326i = null;
            } else if (z11) {
                requestLayout();
            } else {
                C();
            }
        }
        List<i> list = this.f14313a0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f14313a0.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f14313a0.get(i12).a(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i11) {
        this.f14340w = false;
        J(i11, !this.Q, false);
    }

    public void setOffscreenPageLimit(int i11) {
        if (i11 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i11 + " too small; defaulting to 1");
            i11 = 1;
        }
        if (i11 != this.f14341x) {
            this.f14341x = i11;
            C();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.V = jVar;
    }

    public void setPageMargin(int i11) {
        int i12 = this.f14330m;
        this.f14330m = i11;
        int width = getWidth();
        E(width, width, i11, i12);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f14331n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z11, k kVar) {
        setPageTransformer(z11, kVar, 2);
    }

    void setScrollState(int i11) {
        if (this.f14323f0 == i11) {
            return;
        }
        this.f14323f0 = i11;
        k(i11);
    }

    void t() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f14327j = new Scroller(context, f14310i0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.C = viewConfiguration.getScaledPagingTouchSlop();
        this.J = (int) (400.0f * f11);
        this.K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.O = new EdgeEffect(context);
        this.P = new EdgeEffect(context);
        this.L = (int) (25.0f * f11);
        this.M = (int) (2.0f * f11);
        this.A = (int) (f11 * 16.0f);
        ViewCompat.p0(this, new h());
        if (ViewCompat.y(this) == 0) {
            ViewCompat.z0(this, 1);
        }
        ViewCompat.E0(this, new d());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f14331n;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    protected void w(int i11, float f11, int i12) {
        int iMax;
        int width;
        int left;
        if (this.T > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f14352a) {
                    int i14 = gVar.f14353b & 7;
                    if (i14 != 1) {
                        if (i14 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i14 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = iMax;
                    width = paddingLeft;
                    paddingLeft = i15;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        i(i11, f11, i12);
        this.S = true;
    }

    boolean y() {
        int i11 = this.f14322f;
        if (i11 <= 0) {
            return false;
        }
        setCurrentItem(i11 - 1, true);
        return true;
    }

    boolean z() {
        androidx.viewpager.widget.a aVar = this.f14320e;
        if (aVar == null || this.f14322f >= aVar.d() - 1) {
            return false;
        }
        setCurrentItem(this.f14322f + 1, true);
        return true;
    }

    public static class g extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f14352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f14354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f14355d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14356e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f14357f;

        public g() {
            super(-1, -1);
            this.f14354c = BitmapDescriptorFactory.HUE_RED;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14354c = BitmapDescriptorFactory.HUE_RED;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f14308g0);
            this.f14353b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageTransformer(boolean z11, k kVar, int i11) {
        boolean z12 = kVar != null;
        setChildrenDrawingOrderEnabled(z12);
        if (z12) {
            this.f14317c0 = z11 ? 2 : 1;
            this.f14315b0 = i11;
        } else {
            this.f14317c0 = 0;
        }
        if (z12) {
            C();
        }
    }

    public void setCurrentItem(int i11, boolean z11) {
        this.f14340w = false;
        J(i11, z11, false);
    }

    public void setPageMarginDrawable(int i11) {
        setPageMarginDrawable(androidx.core.content.b.getDrawable(getContext(), i11));
    }

    public b(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14314b = new ArrayList<>();
        this.f14316c = new f();
        this.f14318d = new Rect();
        this.f14324g = -1;
        this.f14325h = null;
        this.f14326i = null;
        this.f14334q = -3.4028235E38f;
        this.f14335r = Float.MAX_VALUE;
        this.f14341x = 1;
        this.H = -1;
        this.Q = true;
        this.R = false;
        this.f14321e0 = new c();
        this.f14323f0 = 0;
        t();
    }
}
