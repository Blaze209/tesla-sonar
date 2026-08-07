package com.withpersona.sdk2.inquiry.internal;

import bh0.v2;
import hi0.InquirySessionConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 implements z.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v2 f57540a;

    a0(v2 v2Var) {
        this.f57540a = v2Var;
    }

    public static qj0.i<z.a> b(v2 v2Var) {
        return qj0.f.a(new a0(v2Var));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.z.a
    public z a(String str, String str2, InquirySessionConfig inquirySessionConfig) {
        return this.f57540a.b(str, str2, inquirySessionConfig);
    }
}
