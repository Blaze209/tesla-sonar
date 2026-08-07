package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes.dex */
final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f9900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s7.p f9901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f9902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9903d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f9904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private PowerManager.WakeLock f9905b;

        public a(Context context) {
            this.f9904a = context;
        }

        @SuppressLint({"WakelockTimeout"})
        public void a(boolean z11, boolean z12) {
            if (z11 && this.f9905b == null) {
                PowerManager powerManager = (PowerManager) this.f9904a.getSystemService("power");
                if (powerManager == null) {
                    s7.t.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.f9905b = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = this.f9905b;
            if (wakeLock == null) {
                return;
            }
            if (z11 && z12) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public h3(Context context, Looper looper, s7.j jVar) {
        this.f9900a = new a(context.getApplicationContext());
        this.f9901b = jVar.c(looper, null);
    }

    public void c(final boolean z11) {
        if (this.f9902c == z11) {
            return;
        }
        this.f9902c = z11;
        final boolean z12 = this.f9903d;
        this.f9901b.g(new Runnable() { // from class: androidx.media3.exoplayer.g3
            @Override // java.lang.Runnable
            public final void run() {
                this.f9855a.f9900a.a(z11, z12);
            }
        });
    }

    public void d(final boolean z11) {
        if (this.f9903d == z11) {
            return;
        }
        this.f9903d = z11;
        if (this.f9902c) {
            this.f9901b.g(new Runnable() { // from class: androidx.media3.exoplayer.f3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9840a.f9900a.a(true, z11);
                }
            });
        }
    }
}
