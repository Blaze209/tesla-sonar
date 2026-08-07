package xr0;

import defpackage.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J;\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00022\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\t\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lxr0/a;", "", "", "expression", "data", "Lj;", "evaluator", "f", "(Ljava/util/List;Ljava/lang/Object;Lj;)Ljava/util/List;", "unwrapOperationData", "(Ljava/lang/Object;Ljava/lang/Object;Lj;)Ljava/lang/Object;", "operations-api"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: xr0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C2683a {
        public static List<Object> a(a aVar, List<? extends Object> expression, Object obj, j evaluator) {
            s.k(expression, "expression");
            s.k(evaluator, "evaluator");
            Object objB = b(aVar, v.q0(expression), obj, evaluator);
            if (objB instanceof List) {
                return (List) objB;
            }
            return null;
        }

        private static Object b(a aVar, Object obj, Object obj2, j jVar) {
            if (!(obj instanceof List)) {
                if (!yr0.a.f(obj)) {
                    return obj;
                }
                s.i(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                return jVar.a((Map) obj, obj2);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(v.y(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(b(aVar, it.next(), obj2, jVar));
            }
            return arrayList;
        }
    }

    List<Object> f(List<? extends Object> expression, Object data, j evaluator);
}
