package y20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\b*\u00020\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lokio/i;", "", "str", DateTokenConverter.CONVERTER_KEY, "(Lokio/i;Ljava/lang/String;)Lokio/i;", "Lokio/j;", "b", "(Lokio/j;)Ljava/lang/String;", "Lokio/k;", "bytes", "c", "(Lokio/i;Lokio/k;)Lokio/i;", "a", "(Lokio/j;)Lokio/k;", "wf1-workflow-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class j {
    public static final okio.k a(okio.j jVar) {
        p013kotlin.jvm.internal.s.k(jVar, "<this>");
        return jVar.Q0(jVar.readInt());
    }

    public static final String b(okio.j jVar) {
        p013kotlin.jvm.internal.s.k(jVar, "<this>");
        return a(jVar).K();
    }

    public static final okio.i c(okio.i iVar, okio.k bytes) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        p013kotlin.jvm.internal.s.k(bytes, "bytes");
        iVar.writeInt(bytes.D()).A1(bytes);
        return iVar;
    }

    public static final okio.i d(okio.i iVar, String str) {
        p013kotlin.jvm.internal.s.k(iVar, "<this>");
        p013kotlin.jvm.internal.s.k(str, "str");
        return c(iVar, okio.k.INSTANCE.f(str));
    }
}
