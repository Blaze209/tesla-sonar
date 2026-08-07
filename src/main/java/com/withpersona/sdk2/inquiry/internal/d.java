package com.withpersona.sdk2.inquiry.internal;

import hh0.InquiryAttributes;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bh0.d f57547a;

    d(bh0.d dVar) {
        this.f57547a = dVar;
    }

    public static qj0.i<c.a> b(bh0.d dVar) {
        return qj0.f.a(new d(dVar));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.c.a
    public c a(InquiryAttributes inquiryAttributes) {
        return this.f57547a.b(inquiryAttributes);
    }
}
