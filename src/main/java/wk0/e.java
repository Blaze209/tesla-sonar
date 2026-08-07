package wk0;

import bl0.g0;
import bl0.l;
import bl0.r;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\n\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lbl0/r;", "Lkotlin/Function1;", "Lbl0/l;", "Ljn0/h0;", "block", "a", "(Lbl0/r;Lwn0/l;)Lbl0/l;", "Lwk0/c;", "", "urlString", "c", "(Lwk0/c;Ljava/lang/String;)V", "Lwk0/d;", "", "b", "(Lwk0/d;)Z", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {
    public static final l a(r rVar, wn0.l<? super l, h0> block) {
        s.k(rVar, "<this>");
        s.k(block, "block");
        l headers = rVar.getHeaders();
        block.invoke(headers);
        return headers;
    }

    public static final boolean b(HttpRequestData httpRequestData) {
        s.k(httpRequestData, "<this>");
        httpRequestData.getBody();
        return false;
    }

    public static final void c(c cVar, String urlString) {
        s.k(cVar, "<this>");
        s.k(urlString, "urlString");
        g0.j(cVar.getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String(), urlString);
    }
}
