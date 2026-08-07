package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes5.dex */
final class z extends a.AbstractC0673a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f43196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43197b;

    /* synthetic */ z(long j11, int i11, String str, zt.j jVar) {
        this.f43196a = j11;
        this.f43197b = i11;
    }

    @Override // com.google.android.play.core.integrity.a.AbstractC0673a
    public final int a() {
        return this.f43197b;
    }

    @Override // com.google.android.play.core.integrity.a.AbstractC0673a
    public final long b() {
        return this.f43196a;
    }

    @Override // com.google.android.play.core.integrity.a.AbstractC0673a
    final String d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a.AbstractC0673a) {
            a.AbstractC0673a abstractC0673a = (a.AbstractC0673a) obj;
            if (this.f43196a == abstractC0673a.b() && this.f43197b == abstractC0673a.a()) {
                abstractC0673a.d();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j11 = this.f43196a;
        return (((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ this.f43197b) * 1000003;
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f43196a + ", webViewRequestMode=" + this.f43197b + ", sessionId=null}";
    }
}
