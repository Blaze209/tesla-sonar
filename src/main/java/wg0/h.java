package wg0;

import qj0.i;
import zf0.u;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f121855a;

    h(g gVar) {
        this.f121855a = gVar;
    }

    public static i<f.a> b(g gVar) {
        return qj0.f.a(new h(gVar));
    }

    @Override // wg0.f.a
    public f a(String str, String str2, String str3, String str4, GovernmentIdRequestArguments governmentIdRequestArguments, String str5, u uVar) {
        return this.f121855a.b(str, str2, str4, str3, governmentIdRequestArguments, str5, uVar);
    }
}
