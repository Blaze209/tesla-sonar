package androidx.camera.core.impl;

import android.util.Range;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x0.a<Integer> f3311i = x0.a.a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x0.a<Integer> f3312j = x0.a.a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final x0.a<Range<Integer>> f3313k = x0.a.a("camerax.core.captureConfig.resolvedFrameRate", Range.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<DeferrableSurface> f3314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final x0 f3315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f3316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f3317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final List<p> f3318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f3319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final g3 f3320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final z f3321h;

    public interface b {
        void a(@NonNull o3<?> o3Var, @NonNull a aVar);
    }

    v0(List<DeferrableSurface> list, x0 x0Var, int i11, boolean z11, List<p> list2, boolean z12, @NonNull g3 g3Var, z zVar) {
        this.f3314a = list;
        this.f3315b = x0Var;
        this.f3316c = i11;
        this.f3318e = Collections.unmodifiableList(list2);
        this.f3319f = z12;
        this.f3320g = g3Var;
        this.f3321h = zVar;
        this.f3317d = z11;
    }

    @NonNull
    public static v0 b() {
        return new a().h();
    }

    @NonNull
    public List<p> c() {
        return this.f3318e;
    }

    public z d() {
        return this.f3321h;
    }

    @NonNull
    public Range<Integer> e() {
        Range<Integer> range = (Range) this.f3315b.d(f3313k, c3.f3148a);
        Objects.requireNonNull(range);
        return range;
    }

    public int f() {
        Object objD = this.f3320g.d("CAPTURE_CONFIG_ID_KEY");
        if (objD == null) {
            return -1;
        }
        return ((Integer) objD).intValue();
    }

    @NonNull
    public x0 g() {
        return this.f3315b;
    }

    public int h() {
        Integer num = (Integer) this.f3315b.d(o3.D, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    @NonNull
    public List<DeferrableSurface> i() {
        return Collections.unmodifiableList(this.f3314a);
    }

    @NonNull
    public g3 j() {
        return this.f3320g;
    }

    public int k() {
        return this.f3316c;
    }

    public int l() {
        Integer num = (Integer) this.f3315b.d(o3.E, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public boolean m() {
        return this.f3317d;
    }

    public boolean n() {
        return this.f3319f;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<DeferrableSurface> f3322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c2 f3323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f3325d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<p> f3326e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f3327f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private f2 f3328g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private z f3329h;

        public a() {
            this.f3322a = new HashSet();
            this.f3323b = d2.c0();
            this.f3324c = -1;
            this.f3325d = false;
            this.f3326e = new ArrayList();
            this.f3327f = false;
            this.f3328g = f2.g();
        }

        @NonNull
        public static a j(@NonNull o3<?> o3Var) {
            b bVarO = o3Var.o(null);
            if (bVarO != null) {
                a aVar = new a();
                bVarO.a(o3Var, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + o3Var.q(o3Var.toString()));
        }

        @NonNull
        public static a k(@NonNull v0 v0Var) {
            return new a(v0Var);
        }

        public void a(@NonNull Collection<p> collection) {
            Iterator<p> it = collection.iterator();
            while (it.hasNext()) {
                c(it.next());
            }
        }

        public void b(@NonNull g3 g3Var) {
            this.f3328g.f(g3Var);
        }

        public void c(@NonNull p pVar) {
            if (this.f3326e.contains(pVar)) {
                return;
            }
            this.f3326e.add(pVar);
        }

        public <T> void d(@NonNull x0.a<T> aVar, @NonNull T t11) {
            this.f3323b.K(aVar, t11);
        }

        public void e(@NonNull x0 x0Var) {
            for (x0.a<?> aVar : x0Var.g()) {
                Object objD = this.f3323b.d(aVar, null);
                Object objA = x0Var.a(aVar);
                if (objD instanceof b2) {
                    ((b2) objD).a(((b2) objA).c());
                } else {
                    if (objA instanceof b2) {
                        objA = ((b2) objA).clone();
                    }
                    this.f3323b.m(aVar, x0Var.h(aVar), objA);
                }
            }
        }

        public void f(@NonNull DeferrableSurface deferrableSurface) {
            this.f3322a.add(deferrableSurface);
        }

        public void g(@NonNull String str, @NonNull Object obj) {
            this.f3328g.i(str, obj);
        }

        @NonNull
        public v0 h() {
            return new v0(new ArrayList(this.f3322a), i2.b0(this.f3323b), this.f3324c, this.f3325d, new ArrayList(this.f3326e), this.f3327f, g3.c(this.f3328g), this.f3329h);
        }

        public void i() {
            this.f3322a.clear();
        }

        public Range<Integer> l() {
            return (Range) this.f3323b.d(v0.f3313k, c3.f3148a);
        }

        @NonNull
        public Set<DeferrableSurface> m() {
            return this.f3322a;
        }

        public int n() {
            return this.f3324c;
        }

        public boolean o(@NonNull p pVar) {
            return this.f3326e.remove(pVar);
        }

        public void p(@NonNull z zVar) {
            this.f3329h = zVar;
        }

        public void q(@NonNull Range<Integer> range) {
            d(v0.f3313k, range);
        }

        public void r(int i11) {
            this.f3328g.i("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i11));
        }

        public void s(@NonNull x0 x0Var) {
            this.f3323b = d2.d0(x0Var);
        }

        public void t(boolean z11) {
            this.f3325d = z11;
        }

        public void u(int i11) {
            if (i11 != 0) {
                d(o3.D, Integer.valueOf(i11));
            }
        }

        public void v(int i11) {
            this.f3324c = i11;
        }

        public void w(boolean z11) {
            this.f3327f = z11;
        }

        public void x(int i11) {
            if (i11 != 0) {
                d(o3.E, Integer.valueOf(i11));
            }
        }

        private a(v0 v0Var) {
            HashSet hashSet = new HashSet();
            this.f3322a = hashSet;
            this.f3323b = d2.c0();
            this.f3324c = -1;
            this.f3325d = false;
            this.f3326e = new ArrayList();
            this.f3327f = false;
            this.f3328g = f2.g();
            hashSet.addAll(v0Var.f3314a);
            this.f3323b = d2.d0(v0Var.f3315b);
            this.f3324c = v0Var.f3316c;
            this.f3326e.addAll(v0Var.c());
            this.f3327f = v0Var.n();
            this.f3328g = f2.h(v0Var.j());
            this.f3325d = v0Var.f3317d;
        }
    }
}
