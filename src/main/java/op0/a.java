package op0;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0003\u001a\u00020\u0002*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lop0/a;", "", "", "isFetchWholeDataValue", "(Ljava/lang/Object;)Z", "", "unwrapNested", "(Ljava/util/List;)Ljava/lang/Object;", "unwrapNestedValue", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: op0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C2111a {
        private static boolean a(a aVar, Object obj) {
            return v.p(null, "", v.m()).contains(obj);
        }

        public static List<String> b(a aVar, Object obj) {
            String string;
            if (obj instanceof List) {
                obj = d(aVar, (List) obj);
            }
            List<String> listF1 = null;
            if (obj instanceof List) {
                return null;
            }
            if (obj != null && (string = obj.toString()) != null) {
                listF1 = t.f1(string, new String[]{"."}, false, 0, 6, null);
            }
            return listF1 == null ? v.m() : listF1;
        }

        private static Object c(a aVar, List<?> list) {
            Object objD;
            return (list.size() <= 1 && (objD = d(aVar, list)) != null) ? objD : list;
        }

        private static Object d(a aVar, List<?> list) {
            Object objQ0 = v.q0(list);
            if (objQ0 instanceof List) {
                return c(aVar, (List) objQ0);
            }
            if (a(aVar, objQ0)) {
                return null;
            }
            return objQ0;
        }
    }
}
