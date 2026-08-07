package bh0;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<com.withpersona.sdk2.inquiry.internal.network.e> f17269a;

    public i(qj0.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f17269a = iVar;
    }

    public static i a(qj0.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new i(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.f c(String str, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.f(str, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.f b(String str) {
        return c(str, this.f17269a.get());
    }
}
