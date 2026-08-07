package w;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f120196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, z> f120197b = new ArrayMap(4);

    static final class a extends CameraManager.AvailabilityCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f120198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final CameraManager.AvailabilityCallback f120199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f120200c = new Object();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f120201d = false;

        a(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback) {
            this.f120198a = executor;
            this.f120199b = availabilityCallback;
        }

        void d() {
            synchronized (this.f120200c) {
                this.f120201d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f120200c) {
                try {
                    if (!this.f120201d) {
                        this.f120198a.execute(new Runnable() { // from class: w.k0
                            @Override // java.lang.Runnable
                            public final void run() {
                                e.a(this.f120185a.f120199b);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(@NonNull final String str) {
            synchronized (this.f120200c) {
                try {
                    if (!this.f120201d) {
                        this.f120198a.execute(new Runnable() { // from class: w.j0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f120179a.f120199b.onCameraAvailable(str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(@NonNull final String str) {
            synchronized (this.f120200c) {
                try {
                    if (!this.f120201d) {
                        this.f120198a.execute(new Runnable() { // from class: w.l0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f120191a.f120199b.onCameraUnavailable(str);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public interface b {
        @NonNull
        static b c(@NonNull Context context, @NonNull Handler handler) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                return new p0(context);
            }
            if (i11 >= 29) {
                return new o0(context);
            }
            return i11 >= 28 ? n0.i(context) : q0.h(context, handler);
        }

        void a(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback);

        void b(@NonNull String str, @NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback);

        @NonNull
        CameraCharacteristics d(@NonNull String str);

        @NonNull
        Set<Set<String>> e();

        @NonNull
        String[] f();

        void g(@NonNull CameraManager.AvailabilityCallback availabilityCallback);
    }

    private m0(b bVar) {
        this.f120196a = bVar;
    }

    @NonNull
    public static m0 a(@NonNull Context context) {
        return b(context, h0.m.a());
    }

    @NonNull
    public static m0 b(@NonNull Context context, @NonNull Handler handler) {
        return new m0(b.c(context, handler));
    }

    @NonNull
    public z c(@NonNull String str) {
        z zVarH;
        synchronized (this.f120197b) {
            zVarH = this.f120197b.get(str);
            if (zVarH == null) {
                try {
                    zVarH = z.h(this.f120196a.d(str), str);
                    this.f120197b.put(str, zVarH);
                } catch (AssertionError e11) {
                    throw new CameraAccessExceptionCompat(10002, e11.getMessage(), e11);
                }
            }
        }
        return zVarH;
    }

    @NonNull
    public String[] d() {
        return this.f120196a.f();
    }

    @NonNull
    public Set<Set<String>> e() {
        return this.f120196a.e();
    }

    public void f(@NonNull String str, @NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) {
        this.f120196a.b(str, executor, stateCallback);
    }

    public void g(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        this.f120196a.a(executor, availabilityCallback);
    }

    public void h(@NonNull CameraManager.AvailabilityCallback availabilityCallback) {
        this.f120196a.g(availabilityCallback);
    }
}
