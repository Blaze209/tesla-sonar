package mi;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmi/g;", "", "value", "Ljn0/h0;", "a", "(Lmi/g;Ljava/lang/Object;)V", "apollo-api"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class b {
    public static final void a(g gVar, Object obj) {
        s.k(gVar, "<this>");
        if (obj == null) {
            gVar.R();
            return;
        }
        if (obj instanceof Map) {
            gVar.h();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                gVar.N(String.valueOf(key));
                a(gVar, value);
            }
            gVar.j();
            return;
        }
        if (obj instanceof List) {
            gVar.f();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                a(gVar, it.next());
            }
            gVar.e();
            return;
        }
        if (obj instanceof Boolean) {
            gVar.K(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            gVar.S1(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            gVar.D(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            gVar.E(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof e) {
            gVar.U1((e) obj);
            return;
        }
        if (obj instanceof String) {
            gVar.w((String) obj);
            return;
        }
        throw new IllegalStateException(("Cannot write " + obj + " to Json").toString());
    }
}
