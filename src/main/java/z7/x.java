package z7;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f127113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Looper f127114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f127115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f127116d;

    public x() {
        this(null);
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f127113a) {
            try {
                if (this.f127114b == null) {
                    s7.a.h(this.f127116d == 0 && this.f127115c == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f127115c = handlerThread;
                    handlerThread.start();
                    this.f127114b = this.f127115c.getLooper();
                }
                this.f127116d++;
                looper = this.f127114b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.f127113a) {
            try {
                s7.a.h(this.f127116d > 0);
                int i11 = this.f127116d - 1;
                this.f127116d = i11;
                if (i11 == 0 && (handlerThread = this.f127115c) != null) {
                    handlerThread.quit();
                    this.f127115c = null;
                    this.f127114b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public x(Looper looper) {
        this.f127113a = new Object();
        this.f127114b = looper;
        this.f127115c = null;
        this.f127116d = 0;
    }
}
