package net.time4j.engine;

import java.io.Serializable;
import net.time4j.engine.i0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class i0<U, T extends i0<U, T>> extends q<T> implements Comparable<T>, Serializable {
    private k0<T> F(U u11) {
        return t().I(u11);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public abstract int compareTo(T t11);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.q
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public abstract f0<U, T> t();

    public T G(long j11, U u11) {
        return (T) H(net.time4j.base.c.k(j11), u11);
    }

    public T H(long j11, U u11) {
        if (j11 == 0) {
            return u();
        }
        try {
            return F(u11).b(u(), j11);
        } catch (IllegalArgumentException e11) {
            ArithmeticException arithmeticException = new ArithmeticException("Result beyond boundaries of time axis.");
            arithmeticException.initCause(e11);
            throw arithmeticException;
        }
    }

    public long I(T t11, U u11) {
        return F(u11).a(u(), t11);
    }
}
