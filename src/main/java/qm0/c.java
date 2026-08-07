package qm0;

import fm0.e;

/* JADX INFO: loaded from: classes9.dex */
public enum c implements e<Object> {
    INSTANCE;

    public static void complete(nr0.b<?> bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onComplete();
    }

    public static void error(Throwable th2, nr0.b<?> bVar) {
        bVar.onSubscribe(INSTANCE);
        bVar.onError(th2);
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

    @Override // nr0.c
    public void request(long j11) {
        d.validate(j11);
    }

    @Override // fm0.d
    public int requestFusion(int i11) {
        return i11 & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // nr0.c
    public void cancel() {
    }

    @Override // fm0.h
    public void clear() {
    }
}
