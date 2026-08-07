package io.sentry.android.core.util;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile T f79764a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1682a<T> f79765b;

    /* JADX INFO: renamed from: io.sentry.android.core.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC1682a<T> {
        T a(Context context);
    }

    public a(InterfaceC1682a<T> interfaceC1682a) {
        this.f79765b = interfaceC1682a;
    }

    public T a(Context context) {
        if (this.f79764a == null) {
            synchronized (this) {
                try {
                    if (this.f79764a == null) {
                        this.f79764a = this.f79765b.a(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f79764a;
    }
}
