package tr0;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltr0/o;", "", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface o {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static String a(o oVar, Object obj) {
            List<Object> listC = yr0.a.c(obj);
            if (listC.size() <= 1) {
                Object objQ0 = v.q0(listC);
                if (objQ0 instanceof String) {
                    return (String) objQ0;
                }
            }
            return null;
        }
    }
}
