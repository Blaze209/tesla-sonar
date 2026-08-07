package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f3273a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, j0> f3274b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<j0> f3275c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.common.util.concurrent.s<Void> f3276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.concurrent.futures.c.a<Void> f3277e;

    public static /* synthetic */ void a(p0 p0Var, j0 j0Var) {
        synchronized (p0Var.f3273a) {
            try {
                p0Var.f3275c.remove(j0Var);
                if (p0Var.f3275c.isEmpty()) {
                    u5.h.g(p0Var.f3277e);
                    p0Var.f3277e.c(null);
                    p0Var.f3277e = null;
                    p0Var.f3276d = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ Object b(p0 p0Var, androidx.concurrent.futures.c.a aVar) {
        synchronized (p0Var.f3273a) {
            p0Var.f3277e = aVar;
        }
        return "CameraRepository-deinit";
    }

    @NonNull
    public com.google.common.util.concurrent.s<Void> c() {
        synchronized (this.f3273a) {
            try {
                if (this.f3274b.isEmpty()) {
                    com.google.common.util.concurrent.s<Void> sVarP = this.f3276d;
                    if (sVarP == null) {
                        sVarP = j0.n.p(null);
                    }
                    return sVarP;
                }
                com.google.common.util.concurrent.s<Void> sVarA = this.f3276d;
                if (sVarA == null) {
                    sVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: androidx.camera.core.impl.n0
                        @Override // androidx.concurrent.futures.c.InterfaceC0146c
                        public final Object a(androidx.concurrent.futures.c.a aVar) {
                            return p0.b(this.f3238a, aVar);
                        }
                    });
                    this.f3276d = sVarA;
                }
                this.f3275c.addAll(this.f3274b.values());
                for (final j0 j0Var : this.f3274b.values()) {
                    j0Var.release().b(new Runnable() { // from class: androidx.camera.core.impl.o0
                        @Override // java.lang.Runnable
                        public final void run() {
                            p0.a(this.f3260a, j0Var);
                        }
                    }, i0.c.b());
                }
                this.f3274b.clear();
                return sVarA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public LinkedHashSet<j0> d() {
        LinkedHashSet<j0> linkedHashSet;
        synchronized (this.f3273a) {
            linkedHashSet = new LinkedHashSet<>(this.f3274b.values());
        }
        return linkedHashSet;
    }

    public void e(@NonNull g0 g0Var) {
        synchronized (this.f3273a) {
            try {
                for (String str : g0Var.b()) {
                    c0.y0.a("CameraRepository", "Added camera: " + str);
                    this.f3274b.put(str, g0Var.a(str));
                }
            } catch (CameraUnavailableException e11) {
                throw new InitializationException(e11);
            }
        }
    }
}
