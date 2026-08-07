package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class DeferrableSurface {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Size f3087k = new Size(0, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final boolean f3088l = c0.y0.f("DeferrableSurface");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final AtomicInteger f3089m = new AtomicInteger(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AtomicInteger f3090n = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f3091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.concurrent.futures.c.a<Void> f3094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.common.util.concurrent.s<Void> f3095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.concurrent.futures.c.a<Void> f3096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.common.util.concurrent.s<Void> f3097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private final Size f3098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f3099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Class<?> f3100j;

    public static final class SurfaceClosedException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        DeferrableSurface f3101a;

        public SurfaceClosedException(@NonNull String str, @NonNull DeferrableSurface deferrableSurface) {
            super(str);
            this.f3101a = deferrableSurface;
        }

        @NonNull
        public DeferrableSurface a() {
            return this.f3101a;
        }
    }

    public static final class SurfaceUnavailableException extends Exception {
        public SurfaceUnavailableException(@NonNull String str) {
            super(str);
        }
    }

    public DeferrableSurface() {
        this(f3087k, 0);
    }

    public static /* synthetic */ Object a(DeferrableSurface deferrableSurface, androidx.concurrent.futures.c.a aVar) {
        synchronized (deferrableSurface.f3091a) {
            deferrableSurface.f3094d = aVar;
        }
        return "DeferrableSurface-termination(" + deferrableSurface + ")";
    }

    public static /* synthetic */ Object b(DeferrableSurface deferrableSurface, androidx.concurrent.futures.c.a aVar) {
        synchronized (deferrableSurface.f3091a) {
            deferrableSurface.f3096f = aVar;
        }
        return "DeferrableSurface-close(" + deferrableSurface + ")";
    }

    public static /* synthetic */ void c(DeferrableSurface deferrableSurface, String str) {
        deferrableSurface.getClass();
        try {
            deferrableSurface.f3095e.get();
            deferrableSurface.n("Surface terminated", f3090n.decrementAndGet(), f3089m.get());
        } catch (Exception e11) {
            c0.y0.c("DeferrableSurface", "Unexpected surface termination for " + deferrableSurface + "\nStack Trace:\n" + str);
            synchronized (deferrableSurface.f3091a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", deferrableSurface, Boolean.valueOf(deferrableSurface.f3093c), Integer.valueOf(deferrableSurface.f3092b)), e11);
            }
        }
    }

    private void n(@NonNull String str, int i11, int i12) {
        if (!f3088l && c0.y0.f("DeferrableSurface")) {
            c0.y0.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        c0.y0.a("DeferrableSurface", str + "[total_surfaces=" + i11 + ", used_surfaces=" + i12 + "](" + this + "}");
    }

    public void d() {
        androidx.concurrent.futures.c.a<Void> aVar;
        synchronized (this.f3091a) {
            try {
                if (this.f3093c) {
                    aVar = null;
                } else {
                    this.f3093c = true;
                    this.f3096f.c(null);
                    if (this.f3092b == 0) {
                        aVar = this.f3094d;
                        this.f3094d = null;
                    } else {
                        aVar = null;
                    }
                    if (c0.y0.f("DeferrableSurface")) {
                        c0.y0.a("DeferrableSurface", "surface closed,  useCount=" + this.f3092b + " closed=true " + this);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public void e() {
        androidx.concurrent.futures.c.a<Void> aVar;
        synchronized (this.f3091a) {
            try {
                int i11 = this.f3092b;
                if (i11 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i12 = i11 - 1;
                this.f3092b = i12;
                if (i12 == 0 && this.f3093c) {
                    aVar = this.f3094d;
                    this.f3094d = null;
                } else {
                    aVar = null;
                }
                if (c0.y0.f("DeferrableSurface")) {
                    c0.y0.a("DeferrableSurface", "use count-1,  useCount=" + this.f3092b + " closed=" + this.f3093c + " " + this);
                    if (this.f3092b == 0) {
                        n("Surface no longer in use", f3090n.get(), f3089m.decrementAndGet());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    @NonNull
    public com.google.common.util.concurrent.s<Void> f() {
        return j0.n.s(this.f3097g);
    }

    public Class<?> g() {
        return this.f3100j;
    }

    @NonNull
    public Size h() {
        return this.f3098h;
    }

    public int i() {
        return this.f3099i;
    }

    @NonNull
    public final com.google.common.util.concurrent.s<Surface> j() {
        synchronized (this.f3091a) {
            try {
                if (this.f3093c) {
                    return j0.n.n(new SurfaceClosedException("DeferrableSurface already closed.", this));
                }
                return o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public com.google.common.util.concurrent.s<Void> k() {
        return j0.n.s(this.f3095e);
    }

    public void l() {
        synchronized (this.f3091a) {
            try {
                int i11 = this.f3092b;
                if (i11 == 0 && this.f3093c) {
                    throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.f3092b = i11 + 1;
                if (c0.y0.f("DeferrableSurface")) {
                    if (this.f3092b == 1) {
                        n("New surface in use", f3090n.get(), f3089m.incrementAndGet());
                    }
                    c0.y0.a("DeferrableSurface", "use count+1, useCount=" + this.f3092b + " " + this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean m() {
        boolean z11;
        synchronized (this.f3091a) {
            z11 = this.f3093c;
        }
        return z11;
    }

    @NonNull
    protected abstract com.google.common.util.concurrent.s<Surface> o();

    public void p(@NonNull Class<?> cls) {
        this.f3100j = cls;
    }

    public DeferrableSurface(@NonNull Size size, int i11) {
        this.f3091a = new Object();
        this.f3092b = 0;
        this.f3093c = false;
        this.f3098h = size;
        this.f3099i = i11;
        com.google.common.util.concurrent.s<Void> sVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: androidx.camera.core.impl.b1
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return DeferrableSurface.a(this.f3129a, aVar);
            }
        });
        this.f3095e = sVarA;
        this.f3097g = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: androidx.camera.core.impl.c1
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return DeferrableSurface.b(this.f3147a, aVar);
            }
        });
        if (c0.y0.f("DeferrableSurface")) {
            n("Surface created", f3090n.incrementAndGet(), f3089m.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            sVarA.b(new Runnable() { // from class: androidx.camera.core.impl.d1
                @Override // java.lang.Runnable
                public final void run() {
                    DeferrableSurface.c(this.f3153a, stackTraceString);
                }
            }, i0.c.b());
        }
    }
}
