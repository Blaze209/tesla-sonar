package z0;

import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class g1 implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f126142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0 f126143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f126144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u f126145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f126146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h0.d f126147f;

    g1(@NonNull t0 t0Var, long j11, @NonNull u uVar, boolean z11, boolean z12) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f126142a = atomicBoolean;
        h0.d dVarB = h0.d.b();
        this.f126147f = dVarB;
        this.f126143b = t0Var;
        this.f126144c = j11;
        this.f126145d = uVar;
        this.f126146e = z11;
        if (z12) {
            atomicBoolean.set(true);
        } else {
            dVarB.c("stop");
        }
    }

    @NonNull
    static g1 c(@NonNull w wVar, long j11) {
        u5.h.h(wVar, "The given PendingRecording cannot be null.");
        return new g1(wVar.getRecorder(), j11, wVar.getOutputOptions(), wVar.getIsPersistent(), true);
    }

    @NonNull
    static g1 n(@NonNull w wVar, long j11) {
        u5.h.h(wVar, "The given PendingRecording cannot be null.");
        return new g1(wVar.getRecorder(), j11, wVar.getOutputOptions(), wVar.getIsPersistent(), false);
    }

    private void t(int i11, Throwable th2) {
        this.f126147f.a();
        if (this.f126142a.getAndSet(true)) {
            return;
        }
        this.f126143b.A0(this, i11, th2);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        t(0, null);
    }

    public void d() {
        if (this.f126142a.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        this.f126143b.c0(this);
    }

    protected void finalize() throws Throwable {
        try {
            this.f126147f.d();
            t(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }

    public void i() {
        if (this.f126142a.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        this.f126143b.l0(this);
    }

    @NonNull
    u o() {
        return this.f126145d;
    }

    long p() {
        return this.f126144c;
    }

    public void stop() {
        close();
    }
}
