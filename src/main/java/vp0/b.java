package vp0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0082\u0010¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvp0/b;", "", "value", "unwrap", "(Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface b {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private static Object a(b bVar, Object obj) {
            while (!(obj instanceof Number)) {
                if (obj instanceof String) {
                    return t.u((String) obj);
                }
                if (!(obj instanceof List)) {
                    return null;
                }
                obj = v.q0((List) obj);
            }
            return Double.valueOf(((Number) obj).doubleValue());
        }

        public static List<Object> b(b bVar, Object obj) {
            List<Object> listC = yr0.a.c(obj);
            ArrayList arrayList = new ArrayList(v.y(listC, 10));
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(a(bVar, it.next()));
            }
            return arrayList;
        }
    }
}
