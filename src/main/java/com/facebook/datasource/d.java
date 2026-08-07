package com.facebook.datasource;

import pk.n;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements n<c<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f21547a;

        a(Throwable th2) {
            this.f21547a = th2;
        }

        @Override // pk.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c<T> get() {
            return d.b(this.f21547a);
        }
    }

    public static <T> n<c<T>> a(Throwable th2) {
        return new a(th2);
    }

    public static <T> c<T> b(Throwable th2) {
        i iVarU = i.u();
        iVarU.m(th2);
        return iVarU;
    }
}
