package bh0;

import hi0.InquirySessionConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<com.withpersona.sdk2.inquiry.internal.network.e> f17347a;

    public s2(qj0.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f17347a = iVar;
    }

    public static s2 a(qj0.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new s2(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.t c(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.t(str, str2, str3, inquirySessionConfig, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.t b(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig) {
        return c(str, str2, str3, inquirySessionConfig, this.f17347a.get());
    }
}
