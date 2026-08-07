package androidx.camera.core.impl;

import android.os.SystemClock;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements c0.k1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f3217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Throwable f3218d;

    public l0(long j11, int i11, Throwable th2) {
        this.f3217c = SystemClock.elapsedRealtime() - j11;
        this.f3216b = i11;
        if (th2 instanceof CameraValidator.CameraIdListIncorrectException) {
            this.f3215a = 2;
            this.f3218d = th2;
            return;
        }
        if (!(th2 instanceof InitializationException)) {
            this.f3215a = 0;
            this.f3218d = th2;
            return;
        }
        Throwable cause = th2.getCause();
        th2 = cause != null ? cause : th2;
        this.f3218d = th2;
        if (th2 instanceof CameraUnavailableException) {
            this.f3215a = 2;
        } else if (th2 instanceof IllegalArgumentException) {
            this.f3215a = 1;
        } else {
            this.f3215a = 0;
        }
    }

    @Override // c0.k1.b
    public long a() {
        return this.f3217c;
    }

    @Override // c0.k1.b
    public Throwable getCause() {
        return this.f3218d;
    }

    @Override // c0.k1.b
    public int getStatus() {
        return this.f3215a;
    }
}
