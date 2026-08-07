package io.sentry.util;

import io.sentry.d1;

/* JADX INFO: loaded from: classes9.dex */
public final class r<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a<T> f81474b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile T f81473a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.util.a f81475c = new io.sentry.util.a();

    public interface a<T> {
        T a();
    }

    public r(a<T> aVar) {
        this.f81474b = aVar;
    }

    public T a() {
        if (this.f81473a == null) {
            d1 d1VarA = this.f81475c.a();
            try {
                if (this.f81473a == null) {
                    this.f81473a = this.f81474b.a();
                }
                if (d1VarA != null) {
                    d1VarA.close();
                }
            } catch (Throwable th2) {
                if (d1VarA != null) {
                    try {
                        d1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return this.f81473a;
    }

    public void b() {
        d1 d1VarA = this.f81475c.a();
        try {
            this.f81473a = null;
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void c(T t11) {
        d1 d1VarA = this.f81475c.a();
        try {
            this.f81473a = t11;
            if (d1VarA != null) {
                d1VarA.close();
            }
        } catch (Throwable th2) {
            if (d1VarA != null) {
                try {
                    d1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
