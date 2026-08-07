package com.withpersona.sdk2.inquiry.internal;

import bh0.t2;
import hi0.InquirySessionConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<hh0.s> f58264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<mg0.a> f58265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qj0.i<t2> f58266c;

    public x(qj0.i<hh0.s> iVar, qj0.i<mg0.a> iVar2, qj0.i<t2> iVar3) {
        this.f58264a = iVar;
        this.f58265b = iVar2;
        this.f58266c = iVar3;
    }

    public static x a(qj0.i<hh0.s> iVar, qj0.i<mg0.a> iVar2, qj0.i<t2> iVar3) {
        return new x(iVar, iVar2, iVar3);
    }

    public static w c(String str, String str2, InquirySessionConfig inquirySessionConfig, w.TransitionData transitionData, hh0.s sVar, mg0.a aVar, t2 t2Var) {
        return new w(str, str2, inquirySessionConfig, transitionData, sVar, aVar, t2Var);
    }

    public w b(String str, String str2, InquirySessionConfig inquirySessionConfig, w.TransitionData transitionData) {
        return c(str, str2, inquirySessionConfig, transitionData, this.f58264a.get(), this.f58265b.get(), this.f58266c.get());
    }
}
