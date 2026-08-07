package com.withpersona.sdk2.inquiry.internal;

import bh0.j2;
import bh0.l2;
import hi0.InquirySessionConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements p.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2 f58216a;

    q(l2 l2Var) {
        this.f58216a = l2Var;
    }

    public static qj0.i<p.b> b(l2 l2Var) {
        return qj0.f.a(new q(l2Var));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.p.b
    public p a(String str, String str2, j2 j2Var, InquirySessionConfig inquirySessionConfig, boolean z11) {
        return this.f58216a.b(str, str2, j2Var, inquirySessionConfig, z11);
    }
}
