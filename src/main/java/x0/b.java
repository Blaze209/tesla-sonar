package x0;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.camera.core.CameraControl;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.k0;
import androidx.p003lifecycle.w;
import c0.a2;
import c0.i;
import c0.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UsesNonDefaultVisibleForTesting"})
public final class b implements w, i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LifecycleOwner f122479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CameraUseCaseAdapter f122480c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f122478a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f122481d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f122482e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f122483f = false;

    b(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.f122479b = lifecycleOwner;
        this.f122480c = cameraUseCaseAdapter;
        if (lifecycleOwner.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
            cameraUseCaseAdapter.k();
        } else {
            cameraUseCaseAdapter.A();
        }
        lifecycleOwner.getLifecycle().a(this);
    }

    @Override // c0.i
    @NonNull
    public CameraControl b() {
        return this.f122480c.b();
    }

    @Override // c0.i
    @NonNull
    public n c() {
        return this.f122480c.c();
    }

    void d(Collection<a2> collection) {
        synchronized (this.f122478a) {
            this.f122480c.j(collection);
        }
    }

    @NonNull
    public CameraUseCaseAdapter f() {
        return this.f122480c;
    }

    @NonNull
    public LifecycleOwner j() {
        LifecycleOwner lifecycleOwner;
        synchronized (this.f122478a) {
            lifecycleOwner = this.f122479b;
        }
        return lifecycleOwner;
    }

    n k() {
        return this.f122480c.G();
    }

    @k0(Lifecycle.a.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        synchronized (this.f122478a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f122480c;
            cameraUseCaseAdapter.Y(cameraUseCaseAdapter.J());
        }
    }

    @k0(Lifecycle.a.ON_PAUSE)
    public void onPause(@NonNull LifecycleOwner lifecycleOwner) {
        this.f122480c.n(false);
    }

    @k0(Lifecycle.a.ON_RESUME)
    public void onResume(@NonNull LifecycleOwner lifecycleOwner) {
        this.f122480c.n(true);
    }

    @k0(Lifecycle.a.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        synchronized (this.f122478a) {
            try {
                if (!this.f122482e && !this.f122483f) {
                    this.f122480c.k();
                    this.f122481d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @k0(Lifecycle.a.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        synchronized (this.f122478a) {
            try {
                if (!this.f122482e && !this.f122483f) {
                    this.f122480c.A();
                    this.f122481d = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public List<a2> r() {
        List<a2> listUnmodifiableList;
        synchronized (this.f122478a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f122480c.J());
        }
        return listUnmodifiableList;
    }

    public boolean s(@NonNull a2 a2Var) {
        boolean zContains;
        synchronized (this.f122478a) {
            zContains = this.f122480c.J().contains(a2Var);
        }
        return zContains;
    }

    public void t() {
        synchronized (this.f122478a) {
            try {
                if (this.f122482e) {
                    return;
                }
                onStop(this.f122479b);
                this.f122482e = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void u(Collection<a2> collection) {
        synchronized (this.f122478a) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.retainAll(this.f122480c.J());
            this.f122480c.Y(arrayList);
        }
    }

    void v() {
        synchronized (this.f122478a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f122480c;
            cameraUseCaseAdapter.Y(cameraUseCaseAdapter.J());
        }
    }

    public void w() {
        synchronized (this.f122478a) {
            try {
                if (this.f122482e) {
                    this.f122482e = false;
                    if (this.f122479b.getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                        onStart(this.f122479b);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
