package c0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.c3;
import androidx.core.util.Consumer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Range<Integer> f18481p = c3.f3148a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f18482a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Size f18483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final b0 f18484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Range<Integer> f18485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.camera.core.impl.j0 f18486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f18487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final com.google.common.util.concurrent.s<Surface> f18488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.concurrent.futures.c.a<Surface> f18489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.common.util.concurrent.s<Void> f18490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final androidx.concurrent.futures.c.a<Void> f18491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.concurrent.futures.c.a<Void> f18492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final DeferrableSurface f18493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private h f18494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private i f18495n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Executor f18496o;

    class a implements j0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a f18497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.s f18498b;

        a(androidx.concurrent.futures.c.a aVar, com.google.common.util.concurrent.s sVar) {
            this.f18497a = aVar;
            this.f18498b = sVar;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r11) {
            u5.h.i(this.f18497a.c(null));
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            if (th2 instanceof f) {
                u5.h.i(this.f18498b.cancel(false));
            } else {
                u5.h.i(this.f18497a.c(null));
            }
        }
    }

    class b extends DeferrableSurface {
        b(Size size, int i11) {
            super(size, i11);
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        @NonNull
        protected com.google.common.util.concurrent.s<Surface> o() {
            return z1.this.f18488g;
        }
    }

    class c implements j0.c<Surface> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.s f18501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.concurrent.futures.c.a f18502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f18503c;

        c(com.google.common.util.concurrent.s sVar, androidx.concurrent.futures.c.a aVar, String str) {
            this.f18501a = sVar;
            this.f18502b = aVar;
            this.f18503c = str;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Surface surface) {
            j0.n.t(this.f18501a, this.f18502b);
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                this.f18502b.c(null);
                return;
            }
            u5.h.i(this.f18502b.f(new f(this.f18503c + " cancelled.", th2)));
        }
    }

    class d implements j0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Consumer f18505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Surface f18506b;

        d(Consumer consumer, Surface surface) {
            this.f18505a = consumer;
            this.f18506b = surface;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r11) {
            this.f18505a.accept(g.c(0, this.f18506b));
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
            u5.h.j(th2 instanceof f, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2);
            this.f18505a.accept(g.c(1, this.f18506b));
        }
    }

    private static final class f extends RuntimeException {
        f(@NonNull String str, @NonNull Throwable th2) {
            super(str, th2);
        }
    }

    public static abstract class g {
        g() {
        }

        @NonNull
        static g c(int i11, @NonNull Surface surface) {
            return new c0.g(i11, surface);
        }

        public abstract int a();

        @NonNull
        public abstract Surface b();
    }

    public static abstract class h {
        h() {
        }

        @NonNull
        public static h g(@NonNull Rect rect, int i11, int i12, boolean z11, @NonNull Matrix matrix, boolean z12) {
            return new c0.h(rect, i11, i12, z11, matrix, z12);
        }

        @NonNull
        public abstract Rect a();

        public abstract int b();

        @NonNull
        public abstract Matrix c();

        public abstract int d();

        public abstract boolean e();

        public abstract boolean f();
    }

    public interface i {
        void a(@NonNull h hVar);
    }

    public z1(@NonNull Size size, @NonNull androidx.camera.core.impl.j0 j0Var, boolean z11, @NonNull b0 b0Var, @NonNull Range<Integer> range, @NonNull Runnable runnable) {
        this.f18483b = size;
        this.f18486e = j0Var;
        this.f18487f = z11;
        u5.h.b(b0Var.e(), "SurfaceRequest's DynamicRange must always be fully specified.");
        this.f18484c = b0Var;
        this.f18485d = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        com.google.common.util.concurrent.s sVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: c0.r1
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return z1.b(atomicReference, str, aVar);
            }
        });
        androidx.concurrent.futures.c.a<Void> aVar = (androidx.concurrent.futures.c.a) u5.h.g((androidx.concurrent.futures.c.a) atomicReference.get());
        this.f18492k = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        com.google.common.util.concurrent.s<Void> sVarA2 = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: c0.s1
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar2) {
                return z1.h(atomicReference2, str, aVar2);
            }
        });
        this.f18490i = sVarA2;
        j0.n.j(sVarA2, new a(aVar, sVarA), i0.c.b());
        androidx.concurrent.futures.c.a aVar2 = (androidx.concurrent.futures.c.a) u5.h.g((androidx.concurrent.futures.c.a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        com.google.common.util.concurrent.s<Surface> sVarA3 = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: c0.t1
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar3) {
                return z1.c(atomicReference3, str, aVar3);
            }
        });
        this.f18488g = sVarA3;
        this.f18489h = (androidx.concurrent.futures.c.a) u5.h.g((androidx.concurrent.futures.c.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.f18493l = bVar;
        com.google.common.util.concurrent.s<Void> sVarK = bVar.k();
        j0.n.j(sVarA3, new c(sVarK, aVar2, str), i0.c.b());
        sVarK.b(new Runnable() { // from class: c0.u1
            @Override // java.lang.Runnable
            public final void run() {
                this.f18439a.f18488g.cancel(true);
            }
        }, i0.c.b());
        this.f18491j = q(i0.c.b(), runnable);
    }

    public static /* synthetic */ Object b(AtomicReference atomicReference, String str, androidx.concurrent.futures.c.a aVar) {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    public static /* synthetic */ Object c(AtomicReference atomicReference, String str, androidx.concurrent.futures.c.a aVar) {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    public static /* synthetic */ Object g(z1 z1Var, AtomicReference atomicReference, androidx.concurrent.futures.c.a aVar) {
        z1Var.getClass();
        atomicReference.set(aVar);
        return "SurfaceRequest-surface-recreation(" + z1Var.hashCode() + ")";
    }

    public static /* synthetic */ Object h(AtomicReference atomicReference, String str, androidx.concurrent.futures.c.a aVar) {
        atomicReference.set(aVar);
        return str + "-status";
    }

    private androidx.concurrent.futures.c.a<Void> q(@NonNull Executor executor, @NonNull Runnable runnable) {
        final AtomicReference atomicReference = new AtomicReference(null);
        j0.n.j(androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: c0.w1
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return z1.g(this.f18464a, atomicReference, aVar);
            }
        }), new e(runnable), executor);
        return (androidx.concurrent.futures.c.a) u5.h.g((androidx.concurrent.futures.c.a) atomicReference.get());
    }

    @SuppressLint({"PairedRegistration"})
    public void j(@NonNull Executor executor, @NonNull Runnable runnable) {
        this.f18492k.a(runnable, executor);
    }

    public void k() {
        synchronized (this.f18482a) {
            this.f18495n = null;
            this.f18496o = null;
        }
    }

    @NonNull
    public androidx.camera.core.impl.j0 l() {
        return this.f18486e;
    }

    @NonNull
    public DeferrableSurface m() {
        return this.f18493l;
    }

    @NonNull
    public b0 n() {
        return this.f18484c;
    }

    @NonNull
    public Range<Integer> o() {
        return this.f18485d;
    }

    @NonNull
    public Size p() {
        return this.f18483b;
    }

    public boolean r() {
        x();
        return this.f18491j.c(null);
    }

    public boolean s() {
        return this.f18487f;
    }

    public boolean t() {
        return this.f18488g.isDone();
    }

    public void u(@NonNull final Surface surface, @NonNull Executor executor, @NonNull final Consumer<g> consumer) {
        if (this.f18489h.c(surface) || this.f18488g.isCancelled()) {
            j0.n.j(this.f18490i, new d(consumer, surface), executor);
            return;
        }
        u5.h.i(this.f18488g.isDone());
        try {
            this.f18488g.get();
            executor.execute(new Runnable() { // from class: c0.x1
                @Override // java.lang.Runnable
                public final void run() {
                    consumer.accept(z1.g.c(3, surface));
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: c0.y1
                @Override // java.lang.Runnable
                public final void run() {
                    consumer.accept(z1.g.c(4, surface));
                }
            });
        }
    }

    public void v(@NonNull Executor executor, @NonNull final i iVar) {
        final h hVar;
        synchronized (this.f18482a) {
            this.f18495n = iVar;
            this.f18496o = executor;
            hVar = this.f18494m;
        }
        if (hVar != null) {
            executor.execute(new Runnable() { // from class: c0.v1
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.a(hVar);
                }
            });
        }
    }

    public void w(@NonNull final h hVar) {
        final i iVar;
        Executor executor;
        synchronized (this.f18482a) {
            this.f18494m = hVar;
            iVar = this.f18495n;
            executor = this.f18496o;
        }
        if (iVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: c0.q1
            @Override // java.lang.Runnable
            public final void run() {
                iVar.a(hVar);
            }
        });
    }

    public boolean x() {
        return this.f18489h.f(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }

    class e implements j0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f18508a;

        e(Runnable runnable) {
            this.f18508a = runnable;
        }

        @Override // j0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r11) {
            this.f18508a.run();
        }

        @Override // j0.c
        public void onFailure(@NonNull Throwable th2) {
        }
    }
}
