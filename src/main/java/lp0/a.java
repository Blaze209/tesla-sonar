package lp0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.j;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Llp0/a;", "Lxr0/a;", "", "", "expressionValues", "operationData", "Lj;", "evaluator", "Llp0/b;", "a", "(Ljava/util/List;Ljava/lang/Object;Lj;)Llp0/b;", "", "", "mappingOperation", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface a extends xr0.a {

    /* JADX INFO: renamed from: lp0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C1929a {
        public static ArrayOperationInputData a(a aVar, List<? extends Object> expressionValues, Object obj, j evaluator) {
            s.k(expressionValues, "expressionValues");
            s.k(evaluator, "evaluator");
            List<Object> listF = aVar.f(expressionValues, obj, evaluator);
            Map<String, ? extends Object> mapA = yr0.c.a(expressionValues);
            return new ArrayOperationInputData(listF, mapA, aVar.d(mapA, expressionValues));
        }

        public static Object b(a aVar, Map<String, ? extends Object> map, List<? extends Object> expressionValues) {
            s.k(expressionValues, "expressionValues");
            if (map == null) {
                return yr0.c.b(expressionValues);
            }
            return null;
        }

        public static List<Object> c(a aVar, List<? extends Object> expression, Object obj, j evaluator) {
            s.k(expression, "expression");
            s.k(evaluator, "evaluator");
            return xr0.a.C2683a.a(aVar, expression, obj, evaluator);
        }
    }

    ArrayOperationInputData a(List<? extends Object> expressionValues, Object operationData, j evaluator);

    Object d(Map<String, ? extends Object> mappingOperation, List<? extends Object> expressionValues);
}
