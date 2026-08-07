package iu;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class q0 extends m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f81913b;

    q0(f fVar) {
        Objects.requireNonNull(fVar);
        this.f81913b = fVar;
    }

    @Override // iu.m0
    public final void b() {
        f fVar = this.f81913b;
        synchronized (fVar.f81885f) {
            try {
                if (fVar.f81891l.get() > 0 && fVar.f81891l.decrementAndGet() > 0) {
                    fVar.f81881b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                if (fVar.f81893n != null) {
                    fVar.f81881b.b("Unbind from service.", new Object[0]);
                    fVar.f81880a.unbindService(fVar.f81892m);
                    fVar.f81886g = false;
                    fVar.f81893n = null;
                    fVar.f81892m = null;
                }
                fVar.x();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
