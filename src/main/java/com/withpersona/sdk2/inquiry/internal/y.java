package com.withpersona.sdk2.inquiry.internal;

import hi0.InquirySessionConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class y implements w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f58267a;

    y(x xVar) {
        this.f58267a = xVar;
    }

    public static qj0.i<w.a> b(x xVar) {
        return qj0.f.a(new y(xVar));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.w.a
    public w a(String str, String str2, InquirySessionConfig inquirySessionConfig, w.TransitionData transitionData) {
        return this.f58267a.b(str, str2, inquirySessionConfig, transitionData);
    }
}
