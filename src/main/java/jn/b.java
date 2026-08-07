package jn;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0016"}, d2 = {"Ljn/b;", "", "T", "Lu5/f;", "", "maxSize", "<init>", "(I)V", "b", "()Ljava/lang/Object;", "instance", "", "a", "(Ljava/lang/Object;)Z", "Ljn0/h0;", "c", "()V", "", "[Ljava/lang/Object;", "pool", "I", "size", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b<T> implements u5.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object[] pool;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int size;

    public b(int i11) {
        this.pool = new Object[i11];
    }

    @Override // u5.f
    public synchronized boolean a(T instance) {
        s.k(instance, "instance");
        int i11 = this.size;
        Object[] objArr = this.pool;
        if (i11 == objArr.length) {
            return false;
        }
        objArr[i11] = instance;
        this.size = i11 + 1;
        return true;
    }

    @Override // u5.f
    public synchronized T b() {
        int i11 = this.size;
        if (i11 == 0) {
            return null;
        }
        int i12 = i11 - 1;
        this.size = i12;
        T t11 = (T) this.pool[i12];
        s.i(t11, "null cannot be cast to non-null type T of com.facebook.react.common.ClearableSynchronizedPool");
        this.pool[i12] = null;
        return t11;
    }

    public final synchronized void c() {
        try {
            int i11 = this.size;
            for (int i12 = 0; i12 < i11; i12++) {
                this.pool[i12] = null;
            }
            this.size = 0;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
