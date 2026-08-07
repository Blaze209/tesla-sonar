package nb0;

import ce0.c;
import ic0.e;
import ic0.g;
import ic0.h;
import ic0.q;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aE\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f\"\u0015\u0010\u0010\u001a\u00020\r*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lic0/e;", "request", "Lic0/q;", "transport", "Lic0/h;", "result", "", "response", "resultReason", "requestId", "Lic0/g;", "a", "(Lic0/e;Lic0/q;Lic0/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lic0/g;", "", "c", "(Lic0/g;)Z", "isSuccess", "command-utils_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final g a(e request, q transport, h result, String response, String str, String requestId) {
        s.k(request, "request");
        s.k(transport, "transport");
        s.k(result, "result");
        s.k(response, "response");
        s.k(requestId, "requestId");
        String strN = kb0.g.f85866a.n(request.getVin());
        return new g(de0.b.a(request), requestId, response, result, transport, 0, null, 0L, 0L, 0, 0, 0, 0, 0, 0, c.f(request), strN, strN, request.getSourceContext(), null, str, null, null, 6848480, null);
    }

    public static /* synthetic */ g b(e eVar, q qVar, h hVar, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str = "";
        }
        if ((i11 & 16) != 0) {
            str2 = null;
        }
        if ((i11 & 32) != 0) {
            str3 = "";
        }
        return a(eVar, qVar, hVar, str, str2, str3);
    }

    public static final boolean c(g gVar) {
        s.k(gVar, "<this>");
        return a.d(gVar.getResult());
    }
}
