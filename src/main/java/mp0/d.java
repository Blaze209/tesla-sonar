package mp0;

import defpackage.j;
import java.util.List;
import java.util.Map;
import lp0.ArrayOperationInputData;
import lp0.f;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u00012\u00020\u0002J!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ=\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003*\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmp0/d;", "Llp0/f;", "Lsp0/d;", "Lmp0/c;", "data", "Lj;", "evaluator", "", "c", "(Lmp0/c;Lj;)Ljava/lang/Object;", "Llp0/b;", "operationInput", "Lkotlin/Function2;", "arrayOperation", "evaluateOrDefault", "(Llp0/b;Lj;Lwn0/p;)Ljava/lang/Object;", "toOccurrenceCheckInput", "(Llp0/b;)Lmp0/c;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface d extends f, sp0.d {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: mp0.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llp0/b;", "input", "Lj;", "logicEvaluator", "", "a", "(Llp0/b;Lj;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class C1977a extends u implements p<ArrayOperationInputData, j, Object> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ d f92427c;

            /* JADX INFO: renamed from: mp0.d$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* synthetic */ class C1978a extends p013kotlin.jvm.internal.p implements p<OccurrenceCheckInputData, j, Object> {
                C1978a(Object obj) {
                    super(2, obj, d.class, "check", "check(Loperations/array/occurence/OccurrenceCheckInputData;LLogicEvaluator;)Ljava/lang/Object;", 0);
                }

                @Override // wn0.p
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(OccurrenceCheckInputData p11, j p12) {
                    s.k(p11, "p0");
                    s.k(p12, "p1");
                    return ((d) this.receiver).c(p11, p12);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1977a(d dVar) {
                super(2);
                this.f92427c = dVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ArrayOperationInputData input, j logicEvaluator) {
                s.k(input, "input");
                s.k(logicEvaluator, "logicEvaluator");
                return a.d(this.f92427c, input, logicEvaluator, new C1978a(this.f92427c));
            }
        }

        public static Object b(d dVar, Object obj, Object obj2, j evaluator) {
            s.k(evaluator, "evaluator");
            return dVar.e(obj, obj2, evaluator, new C1977a(dVar));
        }

        public static ArrayOperationInputData c(d dVar, List<? extends Object> expressionValues, Object obj, j evaluator) {
            s.k(expressionValues, "expressionValues");
            s.k(evaluator, "evaluator");
            return f.a.a(dVar, expressionValues, obj, evaluator);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Object d(d dVar, ArrayOperationInputData arrayOperationInputData, j jVar, p<? super OccurrenceCheckInputData, ? super j, ? extends Object> pVar) {
            Object objInvoke;
            OccurrenceCheckInputData occurrenceCheckInputDataG = g(dVar, arrayOperationInputData);
            return (occurrenceCheckInputDataG == null || (objInvoke = pVar.invoke(occurrenceCheckInputDataG, jVar)) == null) ? arrayOperationInputData.getOperationDefault() : objInvoke;
        }

        public static Boolean e(d dVar, Map<String, ? extends Object> map, List<? extends Object> expressionValues) {
            s.k(expressionValues, "expressionValues");
            return Boolean.FALSE;
        }

        public static Object f(d dVar, Object obj, Object obj2, j evaluator, p<? super ArrayOperationInputData, ? super j, ? extends Object> arrayOperation) {
            s.k(evaluator, "evaluator");
            s.k(arrayOperation, "arrayOperation");
            return f.a.c(dVar, obj, obj2, evaluator, arrayOperation);
        }

        private static OccurrenceCheckInputData g(d dVar, ArrayOperationInputData arrayOperationInputData) {
            if (arrayOperationInputData.a() == null || arrayOperationInputData.b() == null || arrayOperationInputData.b().isEmpty()) {
                return null;
            }
            return new OccurrenceCheckInputData(arrayOperationInputData.b(), arrayOperationInputData.a(), arrayOperationInputData.getOperationDefault());
        }

        public static List<Object> h(d dVar, List<? extends Object> expression, Object obj, j evaluator) {
            s.k(expression, "expression");
            s.k(evaluator, "evaluator");
            return f.a.d(dVar, expression, obj, evaluator);
        }

        public static boolean i(d dVar, Object obj) {
            return sp0.d.a.a(dVar, obj);
        }
    }

    Object c(OccurrenceCheckInputData data, j evaluator);
}
