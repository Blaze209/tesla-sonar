package androidx.camera.core.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class c extends t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f3145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f3146b;

    c(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f3145a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f3146b = handler;
    }

    @Override // androidx.camera.core.impl.t0
    @NonNull
    public Executor b() {
        return this.f3145a;
    }

    @Override // androidx.camera.core.impl.t0
    @NonNull
    public Handler c() {
        return this.f3146b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            if (this.f3145a.equals(t0Var.b()) && this.f3146b.equals(t0Var.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f3145a.hashCode() ^ 1000003) * 1000003) ^ this.f3146b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f3145a + ", schedulerHandler=" + this.f3146b + "}";
    }
}
