package bh0;

/* JADX INFO: loaded from: classes8.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<t2> f17339a;

    public q2(qj0.i<t2> iVar) {
        this.f17339a = iVar;
    }

    public static q2 a(qj0.i<t2> iVar) {
        return new q2(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.r c(t2 t2Var, String str, String str2, String str3) {
        return new com.withpersona.sdk2.inquiry.internal.r(t2Var, str, str2, str3);
    }

    public com.withpersona.sdk2.inquiry.internal.r b(String str, String str2, String str3) {
        return c(this.f17339a.get(), str, str2, str3);
    }
}
