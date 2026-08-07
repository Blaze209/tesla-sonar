package vh0;

import android.content.Context;
import java.util.List;
import qj0.i;
import th0.a1;
import th0.d2;
import zf0.u;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i<Context> f119372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i<a> f119373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i<ai0.a> f119374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i<mg0.a> f119375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i<gi0.a> f119376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i<eg0.a> f119377f;

    public d(i<Context> iVar, i<a> iVar2, i<ai0.a> iVar3, i<mg0.a> iVar4, i<gi0.a> iVar5, i<eg0.a> iVar6) {
        this.f119372a = iVar;
        this.f119373b = iVar2;
        this.f119374c = iVar3;
        this.f119375d = iVar4;
        this.f119376e = iVar5;
        this.f119377f = iVar6;
    }

    public static d a(i<Context> iVar, i<a> iVar2, i<ai0.a> iVar3, i<mg0.a> iVar4, i<gi0.a> iVar5, i<eg0.a> iVar6) {
        return new d(iVar, iVar2, iVar3, iVar4, iVar5, iVar6);
    }

    public static c c(Context context, String str, String str2, d2 d2Var, List<? extends a1> list, a aVar, String str3, String str4, String str5, ai0.a aVar2, mg0.a aVar3, gi0.a aVar4, String str6, u uVar, eg0.a aVar5, long j11) {
        return new c(context, str, str2, d2Var, list, aVar, str3, str4, str5, aVar2, aVar3, aVar4, str6, uVar, aVar5, j11);
    }

    public c b(String str, String str2, d2 d2Var, List<? extends a1> list, String str3, String str4, String str5, String str6, u uVar, long j11) {
        return c(this.f119372a.get(), str, str2, d2Var, list, this.f119373b.get(), str3, str4, str5, this.f119374c.get(), this.f119375d.get(), this.f119376e.get(), str6, uVar, this.f119377f.get(), j11);
    }
}
