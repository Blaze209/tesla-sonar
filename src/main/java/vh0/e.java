package vh0;

import java.util.List;
import qj0.f;
import qj0.i;
import th0.a1;
import th0.d2;
import zf0.u;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f119378a;

    e(d dVar) {
        this.f119378a = dVar;
    }

    public static i<c.a> b(d dVar) {
        return f.a(new e(dVar));
    }

    @Override // vh0.c.a
    public c a(String str, String str2, String str3, String str4, d2 d2Var, String str5, List<? extends a1> list, String str6, u uVar, long j11) {
        return this.f119378a.b(str, str2, d2Var, list, str4, str3, str5, str6, uVar, j11);
    }
}
