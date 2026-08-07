package bh0;

import hh0.InquiryAttributes;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<com.withpersona.sdk2.inquiry.internal.network.e> f17220a;

    public d(qj0.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f17220a = iVar;
    }

    public static d a(qj0.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new d(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.c c(InquiryAttributes inquiryAttributes, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.c(inquiryAttributes, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.c b(InquiryAttributes inquiryAttributes) {
        return c(inquiryAttributes, this.f17220a.get());
    }
}
