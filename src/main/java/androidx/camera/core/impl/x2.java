package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class x2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final List<Integer> f3343j = Arrays.asList(1, 5, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<f> f3344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f3345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<CameraDevice.StateCallback> f3346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<CameraCaptureSession.StateCallback> f3347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<p> f3348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f3349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v0 f3350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f3351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InputConfiguration f3352i;

    static class a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        d f3358f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        InputConfiguration f3359g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        f f3361i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Set<f> f3353a = new LinkedHashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final v0.a f3354b = new v0.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final List<CameraDevice.StateCallback> f3355c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final List<CameraCaptureSession.StateCallback> f3356d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final List<p> f3357e = new ArrayList();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f3360h = 0;

        a() {
        }
    }

    public static class b extends a {
        @NonNull
        public static b r(@NonNull o3<?> o3Var, @NonNull Size size) {
            e eVarY = o3Var.Y(null);
            if (eVarY != null) {
                b bVar = new b();
                eVarY.a(size, o3Var, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + o3Var.q(o3Var.toString()));
        }

        @NonNull
        public b A(int i11) {
            this.f3360h = i11;
            return this;
        }

        @NonNull
        public b B(int i11) {
            this.f3354b.v(i11);
            return this;
        }

        @NonNull
        public b C(int i11) {
            if (i11 != 0) {
                this.f3354b.x(i11);
            }
            return this;
        }

        @NonNull
        public b a(@NonNull Collection<p> collection) {
            for (p pVar : collection) {
                this.f3354b.c(pVar);
                if (!this.f3357e.contains(pVar)) {
                    this.f3357e.add(pVar);
                }
            }
            return this;
        }

        @NonNull
        public b b(@NonNull Collection<CameraDevice.StateCallback> collection) {
            Iterator<CameraDevice.StateCallback> it = collection.iterator();
            while (it.hasNext()) {
                f(it.next());
            }
            return this;
        }

        @NonNull
        public b c(@NonNull Collection<p> collection) {
            this.f3354b.a(collection);
            return this;
        }

        @NonNull
        public b d(@NonNull List<CameraCaptureSession.StateCallback> list) {
            Iterator<CameraCaptureSession.StateCallback> it = list.iterator();
            while (it.hasNext()) {
                l(it.next());
            }
            return this;
        }

        @NonNull
        public b e(@NonNull p pVar) {
            this.f3354b.c(pVar);
            if (!this.f3357e.contains(pVar)) {
                this.f3357e.add(pVar);
            }
            return this;
        }

        @NonNull
        public b f(@NonNull CameraDevice.StateCallback stateCallback) {
            if (this.f3355c.contains(stateCallback)) {
                return this;
            }
            this.f3355c.add(stateCallback);
            return this;
        }

        @NonNull
        public b g(@NonNull x0 x0Var) {
            this.f3354b.e(x0Var);
            return this;
        }

        @NonNull
        public b h(@NonNull DeferrableSurface deferrableSurface) {
            return i(deferrableSurface, c0.b0.f18255d);
        }

        @NonNull
        public b i(@NonNull DeferrableSurface deferrableSurface, @NonNull c0.b0 b0Var) {
            this.f3353a.add(f.a(deferrableSurface).b(b0Var).a());
            return this;
        }

        @NonNull
        public b j(@NonNull f fVar) {
            this.f3353a.add(fVar);
            this.f3354b.f(fVar.f());
            Iterator<DeferrableSurface> it = fVar.e().iterator();
            while (it.hasNext()) {
                this.f3354b.f(it.next());
            }
            return this;
        }

        @NonNull
        public b k(@NonNull p pVar) {
            this.f3354b.c(pVar);
            return this;
        }

        @NonNull
        public b l(@NonNull CameraCaptureSession.StateCallback stateCallback) {
            if (this.f3356d.contains(stateCallback)) {
                return this;
            }
            this.f3356d.add(stateCallback);
            return this;
        }

        @NonNull
        public b m(@NonNull DeferrableSurface deferrableSurface) {
            return n(deferrableSurface, c0.b0.f18255d, null, -1);
        }

        @NonNull
        public b n(@NonNull DeferrableSurface deferrableSurface, @NonNull c0.b0 b0Var, String str, int i11) {
            this.f3353a.add(f.a(deferrableSurface).d(str).b(b0Var).c(i11).a());
            this.f3354b.f(deferrableSurface);
            return this;
        }

        @NonNull
        public b o(@NonNull String str, @NonNull Object obj) {
            this.f3354b.g(str, obj);
            return this;
        }

        @NonNull
        public x2 p() {
            return new x2(new ArrayList(this.f3353a), new ArrayList(this.f3355c), new ArrayList(this.f3356d), new ArrayList(this.f3357e), this.f3354b.h(), this.f3358f, this.f3359g, this.f3360h, this.f3361i);
        }

        @NonNull
        public b q() {
            this.f3353a.clear();
            this.f3354b.i();
            return this;
        }

        @NonNull
        public List<p> s() {
            return Collections.unmodifiableList(this.f3357e);
        }

        public boolean t(@NonNull p pVar) {
            return this.f3354b.o(pVar) || this.f3357e.remove(pVar);
        }

        @NonNull
        public b u(@NonNull d dVar) {
            this.f3358f = dVar;
            return this;
        }

        @NonNull
        public b v(@NonNull Range<Integer> range) {
            this.f3354b.q(range);
            return this;
        }

        @NonNull
        public b w(@NonNull x0 x0Var) {
            this.f3354b.s(x0Var);
            return this;
        }

        @NonNull
        public b x(InputConfiguration inputConfiguration) {
            this.f3359g = inputConfiguration;
            return this;
        }

        @NonNull
        public b y(@NonNull DeferrableSurface deferrableSurface) {
            this.f3361i = f.a(deferrableSurface).a();
            return this;
        }

        @NonNull
        public b z(int i11) {
            if (i11 != 0) {
                this.f3354b.u(i11);
            }
            return this;
        }
    }

    public static final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f3362a = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f3363b;

        public c(@NonNull d dVar) {
            this.f3363b = dVar;
        }

        @Override // androidx.camera.core.impl.x2.d
        public void a(@NonNull x2 x2Var, @NonNull g gVar) {
            if (this.f3362a.get()) {
                return;
            }
            this.f3363b.a(x2Var, gVar);
        }

        public void b() {
            this.f3362a.set(true);
        }
    }

    public interface d {
        void a(@NonNull x2 x2Var, @NonNull g gVar);
    }

    public interface e {
        void a(@NonNull Size size, @NonNull o3<?> o3Var, @NonNull b bVar);
    }

    public static abstract class f {

        public static abstract class a {
            @NonNull
            public abstract f a();

            @NonNull
            public abstract a b(@NonNull c0.b0 b0Var);

            @NonNull
            public abstract a c(int i11);

            @NonNull
            public abstract a d(String str);

            @NonNull
            public abstract a e(@NonNull List<DeferrableSurface> list);

            @NonNull
            public abstract a f(int i11);
        }

        @NonNull
        public static a a(@NonNull DeferrableSurface deferrableSurface) {
            return new k.b().g(deferrableSurface).e(Collections.EMPTY_LIST).d(null).c(-1).f(-1).b(c0.b0.f18255d);
        }

        @NonNull
        public abstract c0.b0 b();

        public abstract int c();

        public abstract String d();

        @NonNull
        public abstract List<DeferrableSurface> e();

        @NonNull
        public abstract DeferrableSurface f();

        public abstract int g();
    }

    public enum g {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    public static final class h extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final n0.g f3364j = new n0.g();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f3365k = true;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f3366l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List<d> f3367m = new ArrayList();

        public static /* synthetic */ void a(h hVar, x2 x2Var, g gVar) {
            Iterator<d> it = hVar.f3367m.iterator();
            while (it.hasNext()) {
                it.next().a(x2Var, gVar);
            }
        }

        private List<DeferrableSurface> e() {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.f3353a) {
                arrayList.add(fVar.f());
                Iterator<DeferrableSurface> it = fVar.e().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            return arrayList;
        }

        private void g(@NonNull Range<Integer> range) {
            Range<Integer> range2 = c3.f3148a;
            if (range.equals(range2)) {
                return;
            }
            if (this.f3354b.l().equals(range2)) {
                this.f3354b.q(range);
            } else {
                if (this.f3354b.l().equals(range)) {
                    return;
                }
                this.f3365k = false;
                c0.y0.a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
            }
        }

        private void h(int i11) {
            if (i11 != 0) {
                this.f3354b.u(i11);
            }
        }

        private void i(int i11) {
            if (i11 != 0) {
                this.f3354b.x(i11);
            }
        }

        public void b(@NonNull x2 x2Var) {
            v0 v0VarK = x2Var.k();
            if (v0VarK.k() != -1) {
                this.f3366l = true;
                this.f3354b.v(x2.e(v0VarK.k(), this.f3354b.n()));
            }
            g(v0VarK.e());
            h(v0VarK.h());
            i(v0VarK.l());
            this.f3354b.b(x2Var.k().j());
            this.f3355c.addAll(x2Var.c());
            this.f3356d.addAll(x2Var.l());
            this.f3354b.a(x2Var.j());
            this.f3357e.addAll(x2Var.n());
            if (x2Var.d() != null) {
                this.f3367m.add(x2Var.d());
            }
            if (x2Var.g() != null) {
                this.f3359g = x2Var.g();
            }
            this.f3353a.addAll(x2Var.h());
            this.f3354b.m().addAll(v0VarK.i());
            if (!e().containsAll(this.f3354b.m())) {
                c0.y0.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f3365k = false;
            }
            if (x2Var.m() != this.f3360h && x2Var.m() != 0 && this.f3360h != 0) {
                c0.y0.a("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
                this.f3365k = false;
            } else if (x2Var.m() != 0) {
                this.f3360h = x2Var.m();
            }
            if (x2Var.f3345b != null) {
                if (this.f3361i == x2Var.f3345b || this.f3361i == null) {
                    this.f3361i = x2Var.f3345b;
                } else {
                    c0.y0.a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.f3365k = false;
                }
            }
            this.f3354b.e(v0VarK.g());
        }

        @NonNull
        public x2 c() {
            if (!this.f3365k) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f3353a);
            this.f3364j.c(arrayList);
            return new x2(arrayList, new ArrayList(this.f3355c), new ArrayList(this.f3356d), new ArrayList(this.f3357e), this.f3354b.h(), !this.f3367m.isEmpty() ? new d() { // from class: androidx.camera.core.impl.y2
                @Override // androidx.camera.core.impl.x2.d
                public final void a(x2 x2Var, x2.g gVar) {
                    x2.h.a(this.f3372a, x2Var, gVar);
                }
            } : null, this.f3359g, this.f3360h, this.f3361i);
        }

        public void d() {
            this.f3353a.clear();
            this.f3354b.i();
        }

        public boolean f() {
            return this.f3366l && this.f3365k;
        }
    }

    x2(List<f> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<p> list4, v0 v0Var, d dVar, InputConfiguration inputConfiguration, int i11, f fVar) {
        this.f3344a = list;
        this.f3346c = Collections.unmodifiableList(list2);
        this.f3347d = Collections.unmodifiableList(list3);
        this.f3348e = Collections.unmodifiableList(list4);
        this.f3349f = dVar;
        this.f3350g = v0Var;
        this.f3352i = inputConfiguration;
        this.f3351h = i11;
        this.f3345b = fVar;
    }

    @NonNull
    public static x2 b() {
        return new x2(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new v0.a().h(), null, null, 0, null);
    }

    public static int e(int i11, int i12) {
        List<Integer> list = f3343j;
        return list.indexOf(Integer.valueOf(i11)) >= list.indexOf(Integer.valueOf(i12)) ? i11 : i12;
    }

    @NonNull
    public List<CameraDevice.StateCallback> c() {
        return this.f3346c;
    }

    public d d() {
        return this.f3349f;
    }

    @NonNull
    public x0 f() {
        return this.f3350g.g();
    }

    public InputConfiguration g() {
        return this.f3352i;
    }

    @NonNull
    public List<f> h() {
        return this.f3344a;
    }

    public f i() {
        return this.f3345b;
    }

    @NonNull
    public List<p> j() {
        return this.f3350g.c();
    }

    @NonNull
    public v0 k() {
        return this.f3350g;
    }

    @NonNull
    public List<CameraCaptureSession.StateCallback> l() {
        return this.f3347d;
    }

    public int m() {
        return this.f3351h;
    }

    @NonNull
    public List<p> n() {
        return this.f3348e;
    }

    @NonNull
    public List<DeferrableSurface> o() {
        ArrayList arrayList = new ArrayList();
        for (f fVar : this.f3344a) {
            arrayList.add(fVar.f());
            Iterator<DeferrableSurface> it = fVar.e().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int p() {
        return this.f3350g.k();
    }
}
