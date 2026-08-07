package qm0;

import fm0.e;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a<T> extends AtomicInteger implements e<T> {
    @Override // fm0.h
    public final boolean offer(T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
