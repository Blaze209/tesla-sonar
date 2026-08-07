package yr0;

import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0003\u001a'\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "", "b", "(Ljava/util/List;)Ljava/lang/Object;", "c", "", "", "", "a", "(Ljava/util/List;)Ljava/util/Map;", "utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {
    public static final Map<String, Object> a(List<? extends Object> list) {
        s.k(list, "<this>");
        Object objB = b(list);
        if (!a.f(objB)) {
            objB = null;
        }
        if (objB instanceof Map) {
            return (Map) objB;
        }
        return null;
    }

    public static final <T> T b(List<? extends T> list) {
        s.k(list, "<this>");
        return (T) v.r0(list, 1);
    }

    public static final <T> T c(List<? extends T> list) {
        s.k(list, "<this>");
        return (T) v.r0(list, 2);
    }
}
