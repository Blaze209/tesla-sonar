package x0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.v2;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.k0;
import androidx.p003lifecycle.w;
import c0.a2;
import c0.c2;
import c0.j;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f122500f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static f f122501g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f122502a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<a, x0.b> f122503b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<b, Set<a>> f122504c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque<LifecycleOwner> f122505d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d0.a f122506e;

    static abstract class a {
        a() {
        }

        static a a(@NonNull LifecycleOwner lifecycleOwner, @NonNull CameraUseCaseAdapter.a aVar) {
            return new x0.a(lifecycleOwner, aVar);
        }

        @NonNull
        public abstract CameraUseCaseAdapter.a b();

        @NonNull
        public abstract LifecycleOwner c();
    }

    private static class b implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f122507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LifecycleOwner f122508b;

        b(LifecycleOwner lifecycleOwner, f fVar) {
            this.f122508b = lifecycleOwner;
            this.f122507a = fVar;
        }

        LifecycleOwner a() {
            return this.f122508b;
        }

        @k0(Lifecycle.a.ON_DESTROY)
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            this.f122507a.o(lifecycleOwner);
        }

        @k0(Lifecycle.a.ON_START)
        public void onStart(LifecycleOwner lifecycleOwner) {
            this.f122507a.j(lifecycleOwner);
        }

        @k0(Lifecycle.a.ON_STOP)
        public void onStop(LifecycleOwner lifecycleOwner) {
            this.f122507a.k(lifecycleOwner);
        }
    }

    f() {
    }

    @NonNull
    static f d() {
        f fVar;
        synchronized (f122500f) {
            try {
                if (f122501g == null) {
                    f122501g = new f();
                }
                fVar = f122501g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    private b f(LifecycleOwner lifecycleOwner) {
        synchronized (this.f122502a) {
            try {
                for (b bVar : this.f122504c.keySet()) {
                    if (lifecycleOwner.equals(bVar.a())) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean h(LifecycleOwner lifecycleOwner) {
        synchronized (this.f122502a) {
            try {
                b bVarF = f(lifecycleOwner);
                if (bVarF == null) {
                    return false;
                }
                Iterator<a> it = this.f122504c.get(bVarF).iterator();
                while (it.hasNext()) {
                    if (!((x0.b) u5.h.g(this.f122503b.get(it.next()))).r().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void i(x0.b bVar) {
        synchronized (this.f122502a) {
            try {
                LifecycleOwner lifecycleOwnerJ = bVar.j();
                a aVarA = a.a(lifecycleOwnerJ, CameraUseCaseAdapter.B((v2) bVar.c(), (v2) bVar.k()));
                b bVarF = f(lifecycleOwnerJ);
                Set<a> hashSet = bVarF != null ? this.f122504c.get(bVarF) : new HashSet<>();
                hashSet.add(aVarA);
                this.f122503b.put(aVarA, bVar);
                if (bVarF == null) {
                    b bVar2 = new b(lifecycleOwnerJ, this);
                    this.f122504c.put(bVar2, hashSet);
                    lifecycleOwnerJ.getLifecycle().a(bVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void l(LifecycleOwner lifecycleOwner) {
        synchronized (this.f122502a) {
            try {
                b bVarF = f(lifecycleOwner);
                if (bVarF == null) {
                    return;
                }
                Iterator<a> it = this.f122504c.get(bVarF).iterator();
                while (it.hasNext()) {
                    ((x0.b) u5.h.g(this.f122503b.get(it.next()))).t();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void p(LifecycleOwner lifecycleOwner) {
        synchronized (this.f122502a) {
            try {
                Iterator<a> it = this.f122504c.get(f(lifecycleOwner)).iterator();
                while (it.hasNext()) {
                    x0.b bVar = this.f122503b.get(it.next());
                    if (!((x0.b) u5.h.g(bVar)).r().isEmpty()) {
                        bVar.w();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void a(@NonNull x0.b bVar, c2 c2Var, @NonNull List<j> list, @NonNull Collection<a2> collection, d0.a aVar) {
        synchronized (this.f122502a) {
            try {
                u5.h.a(!collection.isEmpty());
                this.f122506e = aVar;
                LifecycleOwner lifecycleOwnerJ = bVar.j();
                b bVarF = f(lifecycleOwnerJ);
                if (bVarF == null) {
                    return;
                }
                Set<a> set = this.f122504c.get(bVarF);
                d0.a aVar2 = this.f122506e;
                if (aVar2 == null || aVar2.b() != 2) {
                    Iterator<a> it = set.iterator();
                    while (it.hasNext()) {
                        x0.b bVar2 = (x0.b) u5.h.g(this.f122503b.get(it.next()));
                        if (!bVar2.equals(bVar) && !bVar2.r().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    bVar.f().c0(c2Var);
                    bVar.f().a0(list);
                    bVar.d(collection);
                    if (lifecycleOwnerJ.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                        j(lifecycleOwnerJ);
                    }
                } catch (CameraUseCaseAdapter.CameraException e11) {
                    throw new IllegalArgumentException(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void b() {
        synchronized (this.f122502a) {
            try {
                Iterator it = new HashSet(this.f122504c.keySet()).iterator();
                while (it.hasNext()) {
                    o(((b) it.next()).a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    x0.b c(@NonNull LifecycleOwner lifecycleOwner, @NonNull CameraUseCaseAdapter cameraUseCaseAdapter) {
        synchronized (this.f122502a) {
            try {
                u5.h.b(this.f122503b.get(a.a(lifecycleOwner, cameraUseCaseAdapter.D())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                x0.b bVar = new x0.b(lifecycleOwner, cameraUseCaseAdapter);
                if (cameraUseCaseAdapter.J().isEmpty()) {
                    bVar.t();
                }
                if (lifecycleOwner.getLifecycle().getState() == Lifecycle.State.DESTROYED) {
                    return bVar;
                }
                i(bVar);
                return bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    x0.b e(LifecycleOwner lifecycleOwner, @NonNull CameraUseCaseAdapter.a aVar) {
        x0.b bVar;
        synchronized (this.f122502a) {
            bVar = this.f122503b.get(a.a(lifecycleOwner, aVar));
        }
        return bVar;
    }

    Collection<x0.b> g() {
        Collection<x0.b> collectionUnmodifiableCollection;
        synchronized (this.f122502a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f122503b.values());
        }
        return collectionUnmodifiableCollection;
    }

    void j(LifecycleOwner lifecycleOwner) {
        synchronized (this.f122502a) {
            try {
                if (h(lifecycleOwner)) {
                    if (this.f122505d.isEmpty()) {
                        this.f122505d.push(lifecycleOwner);
                    } else {
                        d0.a aVar = this.f122506e;
                        if (aVar == null || aVar.b() != 2) {
                            LifecycleOwner lifecycleOwnerPeek = this.f122505d.peek();
                            if (!lifecycleOwner.equals(lifecycleOwnerPeek)) {
                                l(lifecycleOwnerPeek);
                                this.f122505d.remove(lifecycleOwner);
                                this.f122505d.push(lifecycleOwner);
                            }
                        }
                    }
                    p(lifecycleOwner);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void k(LifecycleOwner lifecycleOwner) {
        synchronized (this.f122502a) {
            try {
                this.f122505d.remove(lifecycleOwner);
                l(lifecycleOwner);
                if (!this.f122505d.isEmpty()) {
                    p(this.f122505d.peek());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void m(@NonNull Collection<a2> collection) {
        synchronized (this.f122502a) {
            try {
                Iterator<a> it = this.f122503b.keySet().iterator();
                while (it.hasNext()) {
                    x0.b bVar = this.f122503b.get(it.next());
                    boolean zIsEmpty = bVar.r().isEmpty();
                    bVar.u(collection);
                    if (!zIsEmpty && bVar.r().isEmpty()) {
                        k(bVar.j());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void n() {
        synchronized (this.f122502a) {
            try {
                Iterator<a> it = this.f122503b.keySet().iterator();
                while (it.hasNext()) {
                    x0.b bVar = this.f122503b.get(it.next());
                    bVar.v();
                    k(bVar.j());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void o(LifecycleOwner lifecycleOwner) {
        synchronized (this.f122502a) {
            try {
                b bVarF = f(lifecycleOwner);
                if (bVarF == null) {
                    return;
                }
                k(lifecycleOwner);
                Iterator<a> it = this.f122504c.get(bVarF).iterator();
                while (it.hasNext()) {
                    this.f122503b.remove(it.next());
                }
                this.f122504c.remove(bVarF);
                bVarF.a().getLifecycle().d(bVarF);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
