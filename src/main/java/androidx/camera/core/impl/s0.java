package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements d0.a.InterfaceC1210a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f3297a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f3298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0.a f3300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<c0.i, a> f3301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3302f;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private j0.a f3303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f3304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f3305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f3306d;

        a(j0.a aVar, @NonNull Executor executor, @NonNull b bVar, @NonNull c cVar) {
            this.f3303a = aVar;
            this.f3304b = executor;
            this.f3305c = bVar;
            this.f3306d = cVar;
        }

        j0.a a() {
            return this.f3303a;
        }

        void b() {
            try {
                Executor executor = this.f3304b;
                final b bVar = this.f3305c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() { // from class: androidx.camera.core.impl.r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.a();
                    }
                });
            } catch (RejectedExecutionException e11) {
                c0.y0.d("CameraStateRegistry", "Unable to notify camera to configure.", e11);
            }
        }

        void c() {
            try {
                Executor executor = this.f3304b;
                final c cVar = this.f3306d;
                Objects.requireNonNull(cVar);
                executor.execute(new Runnable() { // from class: androidx.camera.core.impl.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.a();
                    }
                });
            } catch (RejectedExecutionException e11) {
                c0.y0.d("CameraStateRegistry", "Unable to notify camera to open.", e11);
            }
        }

        j0.a d(j0.a aVar) {
            j0.a aVar2 = this.f3303a;
            this.f3303a = aVar;
            return aVar2;
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public s0(@NonNull d0.a aVar, int i11) {
        Object obj = new Object();
        this.f3298b = obj;
        this.f3301e = new HashMap();
        this.f3299c = i11;
        synchronized (obj) {
            this.f3300d = aVar;
            this.f3302f = this.f3299c;
        }
    }

    private a b(@NonNull String str) {
        for (c0.i iVar : this.f3301e.keySet()) {
            if (str.equals(((i0) iVar.c()).d())) {
                return this.f3301e.get(iVar);
            }
        }
        return null;
    }

    private static boolean d(j0.a aVar) {
        return aVar != null && aVar.holdsCameraSlot();
    }

    private void f() {
        if (c0.y0.f("CameraStateRegistry")) {
            this.f3297a.setLength(0);
            this.f3297a.append("Recalculating open cameras:\n");
            this.f3297a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f3297a.append("-------------------------------------------------------------------\n");
        }
        int i11 = 0;
        for (Map.Entry<c0.i, a> entry : this.f3301e.entrySet()) {
            if (c0.y0.f("CameraStateRegistry")) {
                this.f3297a.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().a() != null ? entry.getValue().a().toString() : "UNKNOWN"));
            }
            if (d(entry.getValue().a())) {
                i11++;
            }
        }
        if (c0.y0.f("CameraStateRegistry")) {
            this.f3297a.append("-------------------------------------------------------------------\n");
            this.f3297a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i11), Integer.valueOf(this.f3299c)));
            c0.y0.a("CameraStateRegistry", this.f3297a.toString());
        }
        this.f3302f = Math.max(this.f3299c - i11, 0);
    }

    private static void h(c0.i iVar, j0.a aVar) {
        if (eb.a.h()) {
            eb.a.j("CX:State[" + iVar + "]", aVar.ordinal());
        }
    }

    private j0.a k(@NonNull c0.i iVar) {
        a aVarRemove = this.f3301e.remove(iVar);
        if (aVarRemove == null) {
            return null;
        }
        f();
        return aVarRemove.a();
    }

    private j0.a l(@NonNull c0.i iVar, @NonNull j0.a aVar) {
        j0.a aVarD = ((a) u5.h.h(this.f3301e.get(iVar), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).d(aVar);
        j0.a aVar2 = j0.a.OPENING;
        if (aVar == aVar2) {
            u5.h.j(d(aVar) || aVarD == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (aVarD != aVar) {
            h(iVar, aVar);
            f();
        }
        return aVarD;
    }

    @Override // d0.a.InterfaceC1210a
    public void a(int i11, int i12) {
        synchronized (this.f3298b) {
            boolean z11 = true;
            this.f3299c = i12 == 2 ? 2 : 1;
            boolean z12 = i11 != 2 && i12 == 2;
            if (i11 != 2 || i12 == 2) {
                z11 = false;
            }
            if (z12 || z11) {
                f();
            }
        }
    }

    public boolean c() {
        synchronized (this.f3298b) {
            try {
                Iterator<Map.Entry<c0.i, a>> it = this.f3301e.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().a() == j0.a.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    public void e(@NonNull c0.i iVar, @NonNull j0.a aVar, boolean z11) {
        a aVarB;
        synchronized (this.f3298b) {
            try {
                int i11 = this.f3302f;
                if ((aVar == j0.a.RELEASED ? k(iVar) : l(iVar, aVar)) == aVar) {
                    return;
                }
                HashMap map = null;
                if (this.f3300d.b() == 2 && aVar == j0.a.CONFIGURED) {
                    String strA = this.f3300d.a(((i0) iVar.c()).d());
                    if (strA != null) {
                        aVarB = b(strA);
                    } else {
                        aVarB = null;
                    }
                } else {
                    aVarB = null;
                }
                if (i11 < 1 && this.f3302f > 0) {
                    map = new HashMap();
                    for (Map.Entry<c0.i, a> entry : this.f3301e.entrySet()) {
                        if (entry.getValue().a() == j0.a.PENDING_OPEN) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else if (aVar == j0.a.PENDING_OPEN && this.f3302f > 0) {
                    map = new HashMap();
                    map.put(iVar, this.f3301e.get(iVar));
                }
                if (map != null && !z11) {
                    map.remove(iVar);
                }
                if (map != null) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).c();
                    }
                }
                if (aVarB != null) {
                    aVarB.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g(@NonNull c0.i iVar, @NonNull Executor executor, @NonNull b bVar, @NonNull c cVar) {
        synchronized (this.f3298b) {
            u5.h.j(!this.f3301e.containsKey(iVar), "Camera is already registered: " + iVar);
            this.f3301e.put(iVar, new a(null, executor, bVar, cVar));
        }
    }

    public boolean i(@NonNull c0.i iVar) {
        boolean z11;
        synchronized (this.f3298b) {
            try {
                a aVar = (a) u5.h.h(this.f3301e.get(iVar), "Camera must first be registered with registerCamera()");
                z11 = false;
                if (c0.y0.f("CameraStateRegistry")) {
                    this.f3297a.setLength(0);
                    this.f3297a.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", iVar, Integer.valueOf(this.f3302f), Boolean.valueOf(d(aVar.a())), aVar.a()));
                }
                if (this.f3302f > 0 || d(aVar.a())) {
                    j0.a aVar2 = j0.a.OPENING;
                    aVar.d(aVar2);
                    h(iVar, aVar2);
                    z11 = true;
                }
                if (c0.y0.f("CameraStateRegistry")) {
                    this.f3297a.append(String.format(Locale.US, " --> %s", z11 ? "SUCCESS" : "FAIL"));
                    c0.y0.a("CameraStateRegistry", this.f3297a.toString());
                }
                if (z11) {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public boolean j(@NonNull String str, String str2) {
        synchronized (this.f3298b) {
            try {
                boolean z11 = true;
                if (this.f3300d.b() != 2) {
                    return true;
                }
                a aVarB = b(str);
                j0.a aVarA = aVarB != null ? aVarB.a() : null;
                a aVarB2 = str2 != null ? b(str2) : null;
                j0.a aVarA2 = aVarB2 != null ? aVarB2.a() : null;
                j0.a aVar = j0.a.OPEN;
                boolean z12 = aVar.equals(aVarA) || j0.a.CONFIGURED.equals(aVarA);
                boolean z13 = aVar.equals(aVarA2) || j0.a.CONFIGURED.equals(aVarA2);
                if (!z12 || !z13) {
                    z11 = false;
                }
                return z11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
