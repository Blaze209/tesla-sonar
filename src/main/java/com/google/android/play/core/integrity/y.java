package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes5.dex */
final class y extends a.AbstractC0673a.AbstractC0674a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f43193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f43195c;

    y() {
    }

    @Override // com.google.android.play.core.integrity.a.AbstractC0673a.AbstractC0674a
    public final a.AbstractC0673a a() {
        if (this.f43195c == 3) {
            return new z(this.f43193a, this.f43194b, null, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f43195c & 1) == 0) {
            sb2.append(" cloudProjectNumber");
        }
        if ((this.f43195c & 2) == 0) {
            sb2.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.play.core.integrity.a.AbstractC0673a.AbstractC0674a
    public final a.AbstractC0673a.AbstractC0674a b(long j11) {
        this.f43193a = j11;
        this.f43195c = (byte) (this.f43195c | 1);
        return this;
    }

    public final a.AbstractC0673a.AbstractC0674a c(int i11) {
        this.f43194b = i11;
        this.f43195c = (byte) (this.f43195c | 2);
        return this;
    }
}
