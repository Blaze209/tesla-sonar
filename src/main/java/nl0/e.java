package nl0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0005¨\u0006\u000b"}, d2 = {"Lnl0/e;", "", "T", "Lnl0/f;", "<init>", "()V", "instance", "Ljn0/h0;", "F1", "(Ljava/lang/Object;)V", "dispose", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class e<T> implements f<T> {
    @Override // nl0.f
    public void F1(T instance) {
        s.k(instance, "instance");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        f.a.a(this);
    }

    @Override // nl0.f
    public void dispose() {
    }
}
