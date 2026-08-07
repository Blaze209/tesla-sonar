package sp0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lsp0/c;", "", "value", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/lang/Object;", "normalizeNumberString", "unwrapSingleNestedValue", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface c {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        private static Object a(c cVar, Object obj) {
            String string;
            Integer numX;
            Object objU = null;
            String str = obj instanceof String ? (String) obj : null;
            if (str != null && (numX = t.x(str)) != null) {
                objU = numX;
            } else if (str != null) {
                objU = t.u(str);
            }
            return (objU == null || (string = objU.toString()) == null) ? obj : string;
        }

        private static Object b(c cVar, Object obj) {
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.size() == 1) {
                    return b(cVar, v.q0(list));
                }
            }
            return obj;
        }

        public static Object c(c cVar, Object obj) {
            Object objB = b(cVar, obj);
            return !s.f(objB, obj) ? new SingleNestedValue(a(cVar, objB)) : a(cVar, obj);
        }
    }

    Object d(Object value);
}
