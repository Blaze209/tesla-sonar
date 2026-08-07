package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b<T> extends d1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f43522a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private T f43523b;

    private enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected b() {
    }

    private boolean c() {
        this.f43522a = a.FAILED;
        this.f43523b = a();
        if (this.f43522a == a.DONE) {
            return false;
        }
        this.f43522a = a.READY;
        return true;
    }

    protected abstract T a();

    protected final T b() {
        this.f43522a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ou.p.r(this.f43522a != a.FAILED);
        int iOrdinal = this.f43522a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f43522a = a.NOT_READY;
        T t11 = (T) p0.a(this.f43523b);
        this.f43523b = null;
        return t11;
    }
}
