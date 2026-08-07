package com.withpersona.sdk2.inquiry.internal;

import bh0.s2;
import hi0.InquirySessionConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements t.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s2 f58235a;

    u(s2 s2Var) {
        this.f58235a = s2Var;
    }

    public static qj0.i<t.a> b(s2 s2Var) {
        return qj0.f.a(new u(s2Var));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.t.a
    public t a(String str, String str2, String str3, InquirySessionConfig inquirySessionConfig) {
        return this.f58235a.b(str, str2, str3, inquirySessionConfig);
    }
}
