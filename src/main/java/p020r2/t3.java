package p020r2;

import java.util.concurrent.atomic.AtomicReference;
import jn0.h0;
import p013kotlin.Metadata;
import z2.g;
import z2.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nR$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lr2/t3;", "T", "", "<init>", "()V", "a", "()Ljava/lang/Object;", "value", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Lz2/g;", "Landroidx/compose/runtime/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "map", "Ljava/lang/Object;", "writeMutex", "c", "mainThreadValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<g> map = new AtomicReference<>(h.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object writeMutex = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private T mainThreadValue;

    public final T a() {
        long id2 = Thread.currentThread().getId();
        return id2 == b.e() ? this.mainThreadValue : (T) this.map.get().b(id2);
    }

    public final void b(T value) {
        long id2 = Thread.currentThread().getId();
        if (id2 == b.e()) {
            this.mainThreadValue = value;
            return;
        }
        synchronized (this.writeMutex) {
            g gVar = this.map.get();
            if (gVar.d(id2, value)) {
                return;
            }
            this.map.set(gVar.c(id2, value));
            h0 h0Var = h0.f84049a;
        }
    }
}
