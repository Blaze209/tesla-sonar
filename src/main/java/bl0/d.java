package bl0;

import java.nio.charset.Charset;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbl0/c;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "b", "(Lbl0/c;Ljava/nio/charset/Charset;)Lbl0/c;", "Lbl0/i;", "a", "(Lbl0/i;)Ljava/nio/charset/Charset;", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    public static final Charset a(i iVar) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        String strC = iVar.c("charset");
        if (strC == null) {
            return null;
        }
        try {
            return Charset.forName(strC);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final c b(c cVar, Charset charset) {
        p013kotlin.jvm.internal.s.k(cVar, "<this>");
        p013kotlin.jvm.internal.s.k(charset, "charset");
        return cVar.g("charset", kl0.a.i(charset));
    }
}
