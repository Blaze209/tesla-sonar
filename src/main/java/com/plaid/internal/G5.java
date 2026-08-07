package com.plaid.internal;

import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes6.dex */
public final class G5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.gson.f f46326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f46327b;

    public G5() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G5)) {
            return false;
        }
        G5 g11 = (G5) obj;
        return p013kotlin.jvm.internal.s.f(this.f46326a, g11.f46326a) && p013kotlin.jvm.internal.s.f(this.f46327b, g11.f46327b);
    }

    public final int hashCode() {
        com.google.gson.f fVar = this.f46326a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        SocketFactory socketFactory = this.f46327b;
        return iHashCode + (socketFactory != null ? socketFactory.hashCode() : 0);
    }

    public final String toString() {
        return "PlaidRetrofitOptions(gson=" + this.f46326a + ", socketFactory=" + this.f46327b + ")";
    }

    public G5(com.google.gson.f fVar, int i11) {
        this.f46326a = (i11 & 1) != 0 ? null : fVar;
        this.f46327b = null;
    }
}
