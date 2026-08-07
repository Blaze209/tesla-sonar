package qm0;

import fm0.e;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b<T> extends AtomicLong implements e<T> {
    @Override // fm0.h
    public final boolean offer(T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
