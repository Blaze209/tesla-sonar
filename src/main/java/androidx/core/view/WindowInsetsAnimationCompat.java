package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsAnimationCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f7659a;

    public static abstract class Callback {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        WindowInsetsCompat mDispachedInsets;
        private final int mDispatchMode;

        public Callback(int i11) {
            this.mDispatchMode = i11;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }

        public void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public abstract WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<WindowInsetsAnimationCompat> list);

        public a onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, a aVar) {
            return aVar;
        }
    }

    private static class b extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Interpolator f7662f = new PathInterpolator(BitmapDescriptorFactory.HUE_RED, 1.1f, BitmapDescriptorFactory.HUE_RED, 1.0f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Interpolator f7663g = new i7.a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Interpolator f7664h = new DecelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final Interpolator f7665i = new AccelerateInterpolator(1.5f);

        private static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Callback f7666a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private WindowInsetsCompat f7667b;

            /* JADX INFO: renamed from: androidx.core.view.WindowInsetsAnimationCompat$b$a$a, reason: collision with other inner class name */
            class C0155a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ WindowInsetsAnimationCompat f7668a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ WindowInsetsCompat f7669b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ WindowInsetsCompat f7670c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f7671d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ View f7672e;

                C0155a(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i11, View view) {
                    this.f7668a = windowInsetsAnimationCompat;
                    this.f7669b = windowInsetsCompat;
                    this.f7670c = windowInsetsCompat2;
                    this.f7671d = i11;
                    this.f7672e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f7668a.e(valueAnimator.getAnimatedFraction());
                    b.k(this.f7672e, b.o(this.f7669b, this.f7670c, this.f7668a.b(), this.f7671d), Collections.singletonList(this.f7668a));
                }
            }

            /* JADX INFO: renamed from: androidx.core.view.WindowInsetsAnimationCompat$b$a$b, reason: collision with other inner class name */
            class C0156b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ WindowInsetsAnimationCompat f7674a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f7675b;

                C0156b(WindowInsetsAnimationCompat windowInsetsAnimationCompat, View view) {
                    this.f7674a = windowInsetsAnimationCompat;
                    this.f7675b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f7674a.e(1.0f);
                    b.i(this.f7675b, this.f7674a);
                }
            }

            class c implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ View f7677a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ WindowInsetsAnimationCompat f7678b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ a f7679c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f7680d;

                c(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, a aVar, ValueAnimator valueAnimator) {
                    this.f7677a = view;
                    this.f7678b = windowInsetsAnimationCompat;
                    this.f7679c = aVar;
                    this.f7680d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    b.l(this.f7677a, this.f7678b, this.f7679c);
                    this.f7680d.start();
                }
            }

            a(View view, Callback callback) {
                this.f7666a = callback;
                WindowInsetsCompat windowInsetsCompatH = ViewCompat.H(view);
                this.f7667b = windowInsetsCompatH != null ? new WindowInsetsCompat.a(windowInsetsCompatH).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f7667b = WindowInsetsCompat.z(windowInsets, view);
                    return b.m(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompatZ = WindowInsetsCompat.z(windowInsets, view);
                if (this.f7667b == null) {
                    this.f7667b = ViewCompat.H(view);
                }
                if (this.f7667b == null) {
                    this.f7667b = windowInsetsCompatZ;
                    return b.m(view, windowInsets);
                }
                Callback callbackN = b.n(view);
                if (callbackN != null && Objects.equals(callbackN.mDispachedInsets, windowInsetsCompatZ)) {
                    return b.m(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                b.e(windowInsetsCompatZ, this.f7667b, iArr, iArr2);
                int i11 = iArr[0];
                int i12 = iArr2[0];
                int i13 = i11 | i12;
                if (i13 == 0) {
                    this.f7667b = windowInsetsCompatZ;
                    return b.m(view, windowInsets);
                }
                WindowInsetsCompat windowInsetsCompat = this.f7667b;
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(i13, b.g(i11, i12), (WindowInsetsCompat.n.c() & i13) != 0 ? 160L : 250L);
                windowInsetsAnimationCompat.e(BitmapDescriptorFactory.HUE_RED);
                ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(windowInsetsAnimationCompat.a());
                a aVarF = b.f(windowInsetsCompatZ, windowInsetsCompat, i13);
                b.j(view, windowInsetsAnimationCompat, windowInsetsCompatZ, false);
                duration.addUpdateListener(new C0155a(windowInsetsAnimationCompat, windowInsetsCompatZ, windowInsetsCompat, i13, view));
                duration.addListener(new C0156b(windowInsetsAnimationCompat, view));
                d0.a(view, new c(view, windowInsetsAnimationCompat, aVarF, duration));
                this.f7667b = windowInsetsCompatZ;
                return b.m(view, windowInsets);
            }
        }

        b(int i11, Interpolator interpolator, long j11) {
            super(i11, interpolator, j11);
        }

        @SuppressLint({"WrongConstant"})
        static void e(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int[] iArr, int[] iArr2) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                k5.e eVarF = windowInsetsCompat.f(i11);
                k5.e eVarF2 = windowInsetsCompat2.f(i11);
                int i12 = eVarF.f84924a;
                int i13 = eVarF2.f84924a;
                boolean z11 = i12 > i13 || eVarF.f84925b > eVarF2.f84925b || eVarF.f84926c > eVarF2.f84926c || eVarF.f84927d > eVarF2.f84927d;
                if (z11 != (i12 < i13 || eVarF.f84925b < eVarF2.f84925b || eVarF.f84926c < eVarF2.f84926c || eVarF.f84927d < eVarF2.f84927d)) {
                    if (z11) {
                        iArr[0] = iArr[0] | i11;
                    } else {
                        iArr2[0] = iArr2[0] | i11;
                    }
                }
            }
        }

        static a f(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i11) {
            k5.e eVarF = windowInsetsCompat.f(i11);
            k5.e eVarF2 = windowInsetsCompat2.f(i11);
            return new a(k5.e.c(Math.min(eVarF.f84924a, eVarF2.f84924a), Math.min(eVarF.f84925b, eVarF2.f84925b), Math.min(eVarF.f84926c, eVarF2.f84926c), Math.min(eVarF.f84927d, eVarF2.f84927d)), k5.e.c(Math.max(eVarF.f84924a, eVarF2.f84924a), Math.max(eVarF.f84925b, eVarF2.f84925b), Math.max(eVarF.f84926c, eVarF2.f84926c), Math.max(eVarF.f84927d, eVarF2.f84927d)));
        }

        static Interpolator g(int i11, int i12) {
            if ((WindowInsetsCompat.n.c() & i11) != 0) {
                return f7662f;
            }
            if ((WindowInsetsCompat.n.c() & i12) != 0) {
                return f7663g;
            }
            if ((i11 & WindowInsetsCompat.n.h()) != 0) {
                return f7664h;
            }
            if ((WindowInsetsCompat.n.h() & i12) != 0) {
                return f7665i;
            }
            return null;
        }

        private static View.OnApplyWindowInsetsListener h(View view, Callback callback) {
            return new a(view, callback);
        }

        static void i(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            Callback callbackN = n(view);
            if (callbackN != null) {
                callbackN.onEnd(windowInsetsAnimationCompat);
                if (callbackN.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    i(viewGroup.getChildAt(i11), windowInsetsAnimationCompat);
                }
            }
        }

        static void j(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsCompat windowInsetsCompat, boolean z11) {
            Callback callbackN = n(view);
            if (callbackN != null) {
                callbackN.mDispachedInsets = windowInsetsCompat;
                if (!z11) {
                    callbackN.onPrepare(windowInsetsAnimationCompat);
                    z11 = callbackN.getDispatchMode() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    j(viewGroup.getChildAt(i11), windowInsetsAnimationCompat, windowInsetsCompat, z11);
                }
            }
        }

        static void k(View view, WindowInsetsCompat windowInsetsCompat, List<WindowInsetsAnimationCompat> list) {
            Callback callbackN = n(view);
            if (callbackN != null) {
                windowInsetsCompat = callbackN.onProgress(windowInsetsCompat, list);
                if (callbackN.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    k(viewGroup.getChildAt(i11), windowInsetsCompat, list);
                }
            }
        }

        static void l(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, a aVar) {
            Callback callbackN = n(view);
            if (callbackN != null) {
                callbackN.onStart(windowInsetsAnimationCompat, aVar);
                if (callbackN.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    l(viewGroup.getChildAt(i11), windowInsetsAnimationCompat, aVar);
                }
            }
        }

        static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(h5.e.M) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static Callback n(View view) {
            Object tag = view.getTag(h5.e.T);
            if (tag instanceof a) {
                return ((a) tag).f7666a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        static WindowInsetsCompat o(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, float f11, int i11) {
            WindowInsetsCompat.a aVar = new WindowInsetsCompat.a(windowInsetsCompat);
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i11 & i12) == 0) {
                    aVar.b(i12, windowInsetsCompat.f(i12));
                } else {
                    k5.e eVarF = windowInsetsCompat.f(i12);
                    k5.e eVarF2 = windowInsetsCompat2.f(i12);
                    float f12 = 1.0f - f11;
                    aVar.b(i12, WindowInsetsCompat.o(eVarF, (int) (((double) ((eVarF.f84924a - eVarF2.f84924a) * f12)) + 0.5d), (int) (((double) ((eVarF.f84925b - eVarF2.f84925b) * f12)) + 0.5d), (int) (((double) ((eVarF.f84926c - eVarF2.f84926c) * f12)) + 0.5d), (int) (((double) ((eVarF.f84927d - eVarF2.f84927d) * f12)) + 0.5d)));
                }
            }
            return aVar.a();
        }

        static void p(View view, Callback callback) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerH = callback != null ? h(view, callback) : null;
            view.setTag(h5.e.T, onApplyWindowInsetsListenerH);
            if (view.getTag(h5.e.L) == null && view.getTag(h5.e.M) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerH);
            }
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f7688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Interpolator f7689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f7690d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f7691e = 1.0f;

        d(int i11, Interpolator interpolator, long j11) {
            this.f7687a = i11;
            this.f7689c = interpolator;
            this.f7690d = j11;
        }

        public long a() {
            return this.f7690d;
        }

        public float b() {
            Interpolator interpolator = this.f7689c;
            return interpolator != null ? interpolator.getInterpolation(this.f7688b) : this.f7688b;
        }

        public int c() {
            return this.f7687a;
        }

        public void d(float f11) {
            this.f7688b = f11;
        }
    }

    public WindowInsetsAnimationCompat(int i11, Interpolator interpolator, long j11) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f7659a = new c(i11, interpolator, j11);
        } else {
            this.f7659a = new b(i11, interpolator, j11);
        }
    }

    static void d(View view, Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.h(view, callback);
        } else {
            b.p(view, callback);
        }
    }

    static WindowInsetsAnimationCompat f(WindowInsetsAnimation windowInsetsAnimation) {
        return new WindowInsetsAnimationCompat(windowInsetsAnimation);
    }

    public long a() {
        return this.f7659a.a();
    }

    public float b() {
        return this.f7659a.b();
    }

    public int c() {
        return this.f7659a.c();
    }

    public void e(float f11) {
        this.f7659a.d(f11);
    }

    private static class c extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final WindowInsetsAnimation f7682f;

        private static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Callback f7683a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private List<WindowInsetsAnimationCompat> f7684b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private ArrayList<WindowInsetsAnimationCompat> f7685c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final HashMap<WindowInsetsAnimation, WindowInsetsAnimationCompat> f7686d;

            a(Callback callback) {
                super(callback.getDispatchMode());
                this.f7686d = new HashMap<>();
                this.f7683a = callback;
            }

            private WindowInsetsAnimationCompat a(WindowInsetsAnimation windowInsetsAnimation) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.f7686d.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat != null) {
                    return windowInsetsAnimationCompat;
                }
                WindowInsetsAnimationCompat windowInsetsAnimationCompatF = WindowInsetsAnimationCompat.f(windowInsetsAnimation);
                this.f7686d.put(windowInsetsAnimation, windowInsetsAnimationCompatF);
                return windowInsetsAnimationCompatF;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f7683a.onEnd(a(windowInsetsAnimation));
                this.f7686d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f7683a.onPrepare(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<WindowInsetsAnimationCompat> arrayList = this.f7685c;
                if (arrayList == null) {
                    ArrayList<WindowInsetsAnimationCompat> arrayList2 = new ArrayList<>(list.size());
                    this.f7685c = arrayList2;
                    this.f7684b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = d1.a(list.get(size));
                    WindowInsetsAnimationCompat windowInsetsAnimationCompatA = a(windowInsetsAnimationA);
                    windowInsetsAnimationCompatA.e(windowInsetsAnimationA.getFraction());
                    this.f7685c.add(windowInsetsAnimationCompatA);
                }
                return this.f7683a.onProgress(WindowInsetsCompat.y(windowInsets), this.f7684b).x();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f7683a.onStart(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        c(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f7682f = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            c1.a();
            return b1.a(aVar.a().g(), aVar.b().g());
        }

        public static k5.e f(WindowInsetsAnimation.Bounds bounds) {
            return k5.e.f(bounds.getUpperBound());
        }

        public static k5.e g(WindowInsetsAnimation.Bounds bounds) {
            return k5.e.f(bounds.getLowerBound());
        }

        public static void h(View view, Callback callback) {
            view.setWindowInsetsAnimationCallback(callback != null ? new a(callback) : null);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.d
        public long a() {
            return this.f7682f.getDurationMillis();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.d
        public float b() {
            return this.f7682f.getInterpolatedFraction();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.d
        public int c() {
            return this.f7682f.getTypeMask();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.d
        public void d(float f11) {
            this.f7682f.setFraction(f11);
        }

        c(int i11, Interpolator interpolator, long j11) {
            this(a1.a(i11, interpolator, j11));
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k5.e f7660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k5.e f7661b;

        public a(k5.e eVar, k5.e eVar2) {
            this.f7660a = eVar;
            this.f7661b = eVar2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public k5.e a() {
            return this.f7660a;
        }

        public k5.e b() {
            return this.f7661b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return c.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f7660a + " upper=" + this.f7661b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f7660a = c.g(bounds);
            this.f7661b = c.f(bounds);
        }
    }

    private WindowInsetsAnimationCompat(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f7659a = new c(windowInsetsAnimation);
        }
    }
}
