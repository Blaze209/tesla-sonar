package bh0;

import android.content.Context;
import hi0.InquirySessionConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<Context> f17289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<hh0.s> f17290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qj0.i<hg0.a> f17291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qj0.i<rh0.c> f17292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qj0.i<fh0.h> f17293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final qj0.i<vi0.a> f17294f;

    public l2(qj0.i<Context> iVar, qj0.i<hh0.s> iVar2, qj0.i<hg0.a> iVar3, qj0.i<rh0.c> iVar4, qj0.i<fh0.h> iVar5, qj0.i<vi0.a> iVar6) {
        this.f17289a = iVar;
        this.f17290b = iVar2;
        this.f17291c = iVar3;
        this.f17292d = iVar4;
        this.f17293e = iVar5;
        this.f17294f = iVar6;
    }

    public static l2 a(qj0.i<Context> iVar, qj0.i<hh0.s> iVar2, qj0.i<hg0.a> iVar3, qj0.i<rh0.c> iVar4, qj0.i<fh0.h> iVar5, qj0.i<vi0.a> iVar6) {
        return new l2(iVar, iVar2, iVar3, iVar4, iVar5, iVar6);
    }

    public static com.withpersona.sdk2.inquiry.internal.p c(String str, String str2, j2 j2Var, InquirySessionConfig inquirySessionConfig, boolean z11, Context context, hh0.s sVar, hg0.a aVar, rh0.c cVar, fh0.h hVar, vi0.a aVar2) {
        return new com.withpersona.sdk2.inquiry.internal.p(str, str2, j2Var, inquirySessionConfig, z11, context, sVar, aVar, cVar, hVar, aVar2);
    }

    public com.withpersona.sdk2.inquiry.internal.p b(String str, String str2, j2 j2Var, InquirySessionConfig inquirySessionConfig, boolean z11) {
        return c(str, str2, j2Var, inquirySessionConfig, z11, this.f17289a.get(), this.f17290b.get(), this.f17291c.get(), this.f17292d.get(), this.f17293e.get(), this.f17294f.get());
    }
}
