package hh0;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements qj0.e<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.withpersona.sdk2.inquiry.internal.network.f f72842a;

    public o(com.withpersona.sdk2.inquiry.internal.network.f fVar) {
        this.f72842a = fVar;
    }

    public static o a(com.withpersona.sdk2.inquiry.internal.network.f fVar) {
        return new o(fVar);
    }

    public static String c(com.withpersona.sdk2.inquiry.internal.network.f fVar) {
        return (String) qj0.h.d(fVar.getServerEndpoint());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f72842a);
    }
}
