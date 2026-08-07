package com.withpersona.sdk2.inquiry.internal;

import bh0.q2;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements r.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q2 f58226a;

    s(q2 q2Var) {
        this.f58226a = q2Var;
    }

    public static qj0.i<r.a> b(q2 q2Var) {
        return qj0.f.a(new s(q2Var));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.r.a
    public r a(String str, String str2, String str3) {
        return this.f58226a.b(str, str2, str3);
    }
}
