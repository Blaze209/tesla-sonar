package dl0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001aO\u0010\u000b\u001a\u00020\n2\u001e\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u00050\u00042\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u00050\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0010\u001a\u00020\u000e2\u001e\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ldl0/x;", "builder", "c", "(Ldl0/x;Ldl0/x;)Ldl0/x;", "", "", "", "", "a", "b", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Set;Ljava/util/Set;)Z", "entries", "", "seed", "e", "(Ljava/util/Set;I)I", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a0 {
    public static final x c(x xVar, x builder) {
        p013kotlin.jvm.internal.s.k(xVar, "<this>");
        p013kotlin.jvm.internal.s.k(builder, "builder");
        Iterator<T> it = builder.a().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            xVar.d((String) entry.getKey(), (List) entry.getValue());
        }
        return xVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(Set<? extends Map.Entry<String, ? extends List<String>>> set, Set<? extends Map.Entry<String, ? extends List<String>>> set2) {
        return p013kotlin.jvm.internal.s.f(set, set2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(Set<? extends Map.Entry<String, ? extends List<String>>> set, int i11) {
        return (i11 * 31) + set.hashCode();
    }
}
