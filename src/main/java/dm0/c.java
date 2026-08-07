package dm0;

import io.reactivex.rxjava3.core.l;
import io.reactivex.rxjava3.core.s;
import io.reactivex.rxjava3.core.w;

/* JADX INFO: loaded from: classes9.dex */
public enum c implements fm0.c<Object> {
    INSTANCE,
    NEVER;

    public static void complete(s<?> sVar) {
        sVar.onSubscribe(INSTANCE);
        sVar.onComplete();
    }

    public static void error(Throwable th2, s<?> sVar) {
        sVar.onSubscribe(INSTANCE);
        sVar.onError(th2);
    }

    @Override // am0.b
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // fm0.h
    public boolean isEmpty() {
        return true;
    }

    @Override // fm0.h
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // fm0.h
    public Object poll() {
        return null;
    }

    @Override // fm0.d
    public int requestFusion(int i11) {
        return i11 & 2;
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(l<?> lVar) {
        lVar.onSubscribe(INSTANCE);
        lVar.onComplete();
    }

    public static void error(Throwable th2, io.reactivex.rxjava3.core.d dVar) {
        dVar.onSubscribe(INSTANCE);
        dVar.onError(th2);
    }

    public static void complete(io.reactivex.rxjava3.core.d dVar) {
        dVar.onSubscribe(INSTANCE);
        dVar.onComplete();
    }

    public static void error(Throwable th2, w<?> wVar) {
        wVar.onSubscribe(INSTANCE);
        wVar.onError(th2);
    }

    public static void error(Throwable th2, l<?> lVar) {
        lVar.onSubscribe(INSTANCE);
        lVar.onError(th2);
    }

    @Override // fm0.h
    public void clear() {
    }

    @Override // am0.b
    public void dispose() {
    }
}
