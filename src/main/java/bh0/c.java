package bh0;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<com.withpersona.sdk2.inquiry.internal.network.e> f17212a;

    public c(qj0.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f17212a = iVar;
    }

    public static c a(qj0.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new c(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.a c(String str, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.a(str, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.a b(String str) {
        return c(str, this.f17212a.get());
    }
}
