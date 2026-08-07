package com.google.android.play.core.integrity;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class b0 extends a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f43137b;

    /* synthetic */ b0(String str, Set set, zt.k kVar) {
        this.f43136a = str;
        this.f43137b = set;
    }

    @Override // com.google.android.play.core.integrity.a.d
    public final String b() {
        return this.f43136a;
    }

    @Override // com.google.android.play.core.integrity.a.d
    public final Set<Integer> c() {
        return this.f43137b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a.d) {
            a.d dVar = (a.d) obj;
            String str = this.f43136a;
            if (str != null ? str.equals(dVar.b()) : dVar.b() == null) {
                if (this.f43137b.equals(dVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f43136a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f43137b.hashCode();
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f43136a + ", verdictOptOut=" + this.f43137b.toString() + "}";
    }
}
