package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes5.dex */
final class e extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f43143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f43144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f43145d;

    e() {
    }

    @Override // com.google.android.play.core.integrity.t
    final t a(b bVar) {
        this.f43144c = bVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.t
    final t b(long j11) {
        this.f43143b = j11;
        this.f43145d = (byte) 1;
        return this;
    }

    @Override // com.google.android.play.core.integrity.t
    final t c(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f43142a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.t
    final u d() {
        String str;
        b bVar;
        if (this.f43145d == 1 && (str = this.f43142a) != null && (bVar = this.f43144c) != null) {
            return new u(str, this.f43143b, bVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f43142a == null) {
            sb2.append(" token");
        }
        if (this.f43145d == 0) {
            sb2.append(" requestTokenSessionId");
        }
        if (this.f43144c == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
