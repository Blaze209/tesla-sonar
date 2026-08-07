package np0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import yr0.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\n\u001a\u0004\u0018\u00010\u0007*\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\u0004\u0018\u00010\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lnp0/c;", "Ljp0/b;", "Lop0/a;", "<init>", "()V", "", "", "", "expression", "data", "a", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "value", "indexParts", "b", "(Ljava/lang/Object;Ljava/util/List;)Ljava/lang/Object;", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "indexes", "c", "(Ljava/util/List;Ljava/util/List;)Ljava/lang/Object;", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements jp0.b, op0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f95286a = new c();

    private c() {
    }

    private final Object a(List<String> list, Object obj, Object obj2) {
        if (!list.isEmpty()) {
            obj2 = b(obj2, list);
        }
        if (d(obj2, obj)) {
            obj2 = null;
            List list2 = obj instanceof List ? (List) obj : null;
            if (list2 != null) {
                return yr0.c.b(list2);
            }
        }
        return obj2;
    }

    private final Object b(Object value, List<String> indexParts) {
        if (value instanceof List) {
            return indexParts.size() == 1 ? ((List) value).get(d.b((String) v.o0(indexParts))) : c(indexParts, (List) value);
        }
        if (value instanceof Map) {
            value = ((Map) value).get(v.o0(indexParts));
            for (String str : v.i0(indexParts, 1)) {
                Map map = value instanceof Map ? (Map) value : null;
                value = map != null ? map.get(str) : null;
            }
        }
        return value;
    }

    private final Object c(List<String> indexes, List<? extends Object> data) {
        String str = (String) v.q0(indexes);
        if (str == null) {
            return null;
        }
        Object objR0 = v.r0(data, d.b(str));
        return objR0 instanceof List ? f95286a.c(indexes.subList(1, indexes.size()), (List) objR0) : v.r0(data, d.b(str));
    }

    private final boolean d(Object value, Object expression) {
        return (s.f(value, expression) || value == null) && (expression instanceof List) && ((List) expression).size() > 1;
    }

    public List<String> e(Object obj) {
        return op0.a.C2111a.b(this, obj);
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        List<String> listE = e(yr0.a.c(expression));
        if (listE != null) {
            return a(listE, expression, data);
        }
        return null;
    }
}
