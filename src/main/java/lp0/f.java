package lp0;

import defpackage.j;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001JI\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Llp0/f;", "Llp0/a;", "", "expression", "operationData", "Lj;", "evaluator", "Lkotlin/Function2;", "Llp0/b;", "arrayOperation", "e", "(Ljava/lang/Object;Ljava/lang/Object;Lj;Lwn0/p;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface f extends lp0.a {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static ArrayOperationInputData a(f fVar, List<? extends Object> expressionValues, Object obj, j evaluator) {
            s.k(expressionValues, "expressionValues");
            s.k(evaluator, "evaluator");
            return lp0.a.C1929a.a(fVar, expressionValues, obj, evaluator);
        }

        public static Object b(f fVar, Map<String, ? extends Object> map, List<? extends Object> expressionValues) {
            s.k(expressionValues, "expressionValues");
            return lp0.a.C1929a.b(fVar, map, expressionValues);
        }

        public static Object c(f fVar, Object obj, Object obj2, j evaluator, p<? super ArrayOperationInputData, ? super j, ? extends Object> arrayOperation) {
            s.k(evaluator, "evaluator");
            s.k(arrayOperation, "arrayOperation");
            return arrayOperation.invoke(fVar.a(yr0.a.c(obj), obj2, evaluator), evaluator);
        }

        public static List<Object> d(f fVar, List<? extends Object> expression, Object obj, j evaluator) {
            s.k(expression, "expression");
            s.k(evaluator, "evaluator");
            return lp0.a.C1929a.c(fVar, expression, obj, evaluator);
        }
    }

    Object e(Object expression, Object operationData, j evaluator, p<? super ArrayOperationInputData, ? super j, ? extends Object> arrayOperation);
}
