package wg0;

import android.content.Context;
import qj0.i;
import zf0.u;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i<Context> f121849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i<com.withpersona.sdk2.inquiry.governmentid.network.a> f121850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i<ai0.a> f121851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i<mg0.a> f121852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i<gi0.a> f121853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i<eg0.a> f121854f;

    public g(i<Context> iVar, i<com.withpersona.sdk2.inquiry.governmentid.network.a> iVar2, i<ai0.a> iVar3, i<mg0.a> iVar4, i<gi0.a> iVar5, i<eg0.a> iVar6) {
        this.f121849a = iVar;
        this.f121850b = iVar2;
        this.f121851c = iVar3;
        this.f121852d = iVar4;
        this.f121853e = iVar5;
        this.f121854f = iVar6;
    }

    public static g a(i<Context> iVar, i<com.withpersona.sdk2.inquiry.governmentid.network.a> iVar2, i<ai0.a> iVar3, i<mg0.a> iVar4, i<gi0.a> iVar5, i<eg0.a> iVar6) {
        return new g(iVar, iVar2, iVar3, iVar4, iVar5, iVar6);
    }

    public static f c(Context context, String str, String str2, String str3, String str4, com.withpersona.sdk2.inquiry.governmentid.network.a aVar, GovernmentIdRequestArguments governmentIdRequestArguments, ai0.a aVar2, mg0.a aVar3, gi0.a aVar4, String str5, u uVar, eg0.a aVar5) {
        return new f(context, str, str2, str3, str4, aVar, governmentIdRequestArguments, aVar2, aVar3, aVar4, str5, uVar, aVar5);
    }

    public f b(String str, String str2, String str3, String str4, GovernmentIdRequestArguments governmentIdRequestArguments, String str5, u uVar) {
        return c(this.f121849a.get(), str, str2, str3, str4, this.f121850b.get(), governmentIdRequestArguments, this.f121851c.get(), this.f121852d.get(), this.f121853e.get(), str5, uVar, this.f121854f.get());
    }
}
