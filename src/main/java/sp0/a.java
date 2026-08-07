package sp0;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lsp0/a;", "", "wrappedValue", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "unwrapList", "(Ljava/util/List;)Ljava/lang/Object;", "unwrapNotBooleanSingleElement", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: sp0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C2383a {
        private static Object a(a aVar, List<?> list) {
            if (yr0.a.g(list)) {
                return Double.valueOf(0.0d);
            }
            return list.isEmpty() ? "" : b(aVar, list);
        }

        private static Object b(a aVar, List<?> list) {
            if (((list.size() != 1 || (v.q0(list) instanceof Boolean)) ? null : list) != null) {
                return aVar.a(v.q0(list));
            }
            return null;
        }

        public static Object c(a aVar, Object obj) {
            if (obj instanceof Number) {
                return Double.valueOf(((Number) obj).doubleValue());
            }
            if (obj instanceof String) {
                Double dU = t.u((String) obj);
                if (dU != null) {
                    return dU;
                }
            } else if (obj instanceof List) {
                Object objA = a(aVar, (List) obj);
                if (objA != null) {
                    return objA;
                }
            } else if (obj instanceof Boolean) {
                return Double.valueOf(yr0.b.a(((Boolean) obj).booleanValue()));
            }
            return obj;
        }
    }

    Object a(Object wrappedValue);
}
