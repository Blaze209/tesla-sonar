package bh0;

import hi0.InquirySessionConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<com.withpersona.sdk2.inquiry.internal.network.e> f17393a;

    public v2(qj0.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f17393a = iVar;
    }

    public static v2 a(qj0.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new v2(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.z c(String str, String str2, InquirySessionConfig inquirySessionConfig, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.z(str, str2, inquirySessionConfig, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.z b(String str, String str2, InquirySessionConfig inquirySessionConfig) {
        return c(str, str2, inquirySessionConfig, this.f17393a.get());
    }
}
