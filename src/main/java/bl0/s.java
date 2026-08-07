package bl0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.nio.charset.Charset;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f*\u00020\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lbl0/r;", "Lbl0/c;", "type", "Ljn0/h0;", "e", "(Lbl0/r;Lbl0/c;)V", DateTokenConverter.CONVERTER_KEY, "(Lbl0/r;)Lbl0/c;", "Lbl0/q;", "c", "(Lbl0/q;)Lbl0/c;", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "a", "(Lbl0/q;)Ljava/nio/charset/Charset;", "", "b", "(Lbl0/q;)Ljava/lang/Long;", "ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class s {
    public static final Charset a(q qVar) {
        p013kotlin.jvm.internal.s.k(qVar, "<this>");
        c cVarC = c(qVar);
        if (cVarC != null) {
            return d.a(cVarC);
        }
        return null;
    }

    public static final Long b(q qVar) {
        p013kotlin.jvm.internal.s.k(qVar, "<this>");
        String str = qVar.getHeaders().get(o.f17654a.h());
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }

    public static final c c(q qVar) {
        p013kotlin.jvm.internal.s.k(qVar, "<this>");
        String str = qVar.getHeaders().get(o.f17654a.i());
        if (str != null) {
            return c.INSTANCE.b(str);
        }
        return null;
    }

    public static final c d(r rVar) {
        p013kotlin.jvm.internal.s.k(rVar, "<this>");
        String strH = rVar.getHeaders().h(o.f17654a.i());
        if (strH != null) {
            return c.INSTANCE.b(strH);
        }
        return null;
    }

    public static final void e(r rVar, c type) {
        p013kotlin.jvm.internal.s.k(rVar, "<this>");
        p013kotlin.jvm.internal.s.k(type, "type");
        rVar.getHeaders().k(o.f17654a.i(), type.toString());
    }
}
