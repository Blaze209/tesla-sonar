package om0;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
final class c implements Future<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final am0.b f98077a;

    c(am0.b bVar) {
        this.f98077a = bVar;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        this.f98077a.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j11, TimeUnit timeUnit) {
        return null;
    }
}
