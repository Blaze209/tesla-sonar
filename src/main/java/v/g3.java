package v;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final Executor f117001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f117002b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Set<v4> f117003c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Set<v4> f117004d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Set<v4> f117005e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CameraDevice.StateCallback f117006f = new a();

    g3(@NonNull Executor executor) {
        this.f117001a = executor;
    }

    private void a(@NonNull v4 v4Var) {
        v4 next;
        Iterator<v4> it = f().iterator();
        while (it.hasNext() && (next = it.next()) != v4Var) {
            next.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(@NonNull Set<v4> set) {
        for (v4 v4Var : set) {
            v4Var.d().q(v4Var);
        }
    }

    @NonNull
    CameraDevice.StateCallback c() {
        return this.f117006f;
    }

    @NonNull
    List<v4> d() {
        ArrayList arrayList;
        synchronized (this.f117002b) {
            arrayList = new ArrayList(this.f117003c);
        }
        return arrayList;
    }

    @NonNull
    List<v4> e() {
        ArrayList arrayList;
        synchronized (this.f117002b) {
            arrayList = new ArrayList(this.f117005e);
        }
        return arrayList;
    }

    @NonNull
    List<v4> f() {
        ArrayList arrayList;
        synchronized (this.f117002b) {
            arrayList = new ArrayList();
            arrayList.addAll(d());
            arrayList.addAll(e());
        }
        return arrayList;
    }

    void g(@NonNull v4 v4Var) {
        synchronized (this.f117002b) {
            this.f117003c.remove(v4Var);
            this.f117004d.remove(v4Var);
        }
    }

    void h(@NonNull v4 v4Var) {
        synchronized (this.f117002b) {
            this.f117004d.add(v4Var);
        }
    }

    void i(@NonNull v4 v4Var) {
        a(v4Var);
        synchronized (this.f117002b) {
            this.f117005e.remove(v4Var);
        }
    }

    void j(@NonNull v4 v4Var) {
        synchronized (this.f117002b) {
            this.f117003c.add(v4Var);
            this.f117005e.remove(v4Var);
        }
        a(v4Var);
    }

    void k(@NonNull v4 v4Var) {
        synchronized (this.f117002b) {
            this.f117005e.add(v4Var);
        }
    }

    class a extends CameraDevice.StateCallback {
        a() {
        }

        public static /* synthetic */ void a(LinkedHashSet linkedHashSet, int i11) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((v4) it.next()).e(i11);
            }
        }

        private void c() {
            List<v4> listF;
            synchronized (g3.this.f117002b) {
                listF = g3.this.f();
                g3.this.f117005e.clear();
                g3.this.f117003c.clear();
                g3.this.f117004d.clear();
            }
            Iterator<v4> it = listF.iterator();
            while (it.hasNext()) {
                it.next().k();
            }
        }

        private void d(final int i11) {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (g3.this.f117002b) {
                linkedHashSet.addAll(g3.this.f117005e);
                linkedHashSet.addAll(g3.this.f117003c);
            }
            g3.this.f117001a.execute(new Runnable() { // from class: v.f3
                @Override // java.lang.Runnable
                public final void run() {
                    g3.a.a(linkedHashSet, i11);
                }
            });
        }

        private void e() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (g3.this.f117002b) {
                linkedHashSet.addAll(g3.this.f117005e);
                linkedHashSet.addAll(g3.this.f117003c);
            }
            g3.this.f117001a.execute(new Runnable() { // from class: v.e3
                @Override // java.lang.Runnable
                public final void run() {
                    g3.b(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(@NonNull CameraDevice cameraDevice) {
            e();
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(@NonNull CameraDevice cameraDevice) {
            e();
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(@NonNull CameraDevice cameraDevice, int i11) {
            e();
            d(i11);
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(@NonNull CameraDevice cameraDevice) {
        }
    }
}
