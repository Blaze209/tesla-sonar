package nl0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00028\u0000H$¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H$¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\u0007J\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, d2 = {"Lnl0/g;", "", "T", "Lnl0/f;", "<init>", "()V", "n", "()Ljava/lang/Object;", "instance", "Ljn0/h0;", "c", "(Ljava/lang/Object;)V", "S2", "F1", "dispose", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class g<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f95128a = AtomicIntegerFieldUpdater.newUpdater(g.class, "borrowed");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f95129b = AtomicIntegerFieldUpdater.newUpdater(g.class, "disposed");
    private volatile /* synthetic */ int borrowed = 0;
    private volatile /* synthetic */ int disposed = 0;
    private volatile /* synthetic */ Object instance = null;

    @Override // nl0.f
    public final void F1(T instance) {
        s.k(instance, "instance");
        if (this.instance != instance) {
            if (this.instance == null && this.borrowed != 0) {
                throw new IllegalStateException("Already recycled or an irrelevant instance tried to be recycled");
            }
            throw new IllegalStateException("Unable to recycle irrelevant instance");
        }
        this.instance = null;
        if (!f95129b.compareAndSet(this, 0, 1)) {
            throw new IllegalStateException("An instance is already disposed");
        }
        c(instance);
    }

    @Override // nl0.f
    public final T S2() {
        int i11;
        do {
            i11 = this.borrowed;
            if (i11 != 0) {
                throw new IllegalStateException("Instance is already consumed");
            }
        } while (!f95128a.compareAndSet(this, i11, 1));
        T tN = n();
        this.instance = tN;
        return tN;
    }

    protected abstract void c(T instance);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        f.a.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nl0.f
    public final void dispose() {
        Object obj;
        if (!f95129b.compareAndSet(this, 0, 1) || (obj = this.instance) == null) {
            return;
        }
        this.instance = null;
        c(obj);
    }

    protected abstract T n();
}
