package lp0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import defpackage.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0014\u001a\u00020\u0013*\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Llp0/c;", "Ljp0/a;", "Llp0/f;", "Lsp0/d;", "<init>", "()V", "Llp0/b;", "operationInput", "Lj;", "evaluator", "", "", "h", "(Llp0/b;Lj;)Ljava/util/List;", "evaluatedValue", "", "", "mappingOperation", "operationDefault", "", IntegerTokenConverter.CONVERTER_KEY, "(Lj;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Object;)Z", "expression", "data", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lj;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements jp0.a, f, sp0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f90660a = new c();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends p implements wn0.p<ArrayOperationInputData, j, List<? extends Object>> {
        a(Object obj) {
            super(2, obj, c.class, "filterOrEmptyList", "filterOrEmptyList(Loperations/array/ArrayOperationInputData;LLogicEvaluator;)Ljava/util/List;", 0);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Object> invoke(ArrayOperationInputData p11, j p12) {
            s.k(p11, "p0");
            s.k(p12, "p1");
            return ((c) this.receiver).h(p11, p12);
        }
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Object> h(ArrayOperationInputData operationInput, j evaluator) {
        List<Object> listB = operationInput.b();
        if (listB == null) {
            listB = v.m();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (f90660a.i(evaluator, obj, operationInput.a(), operationInput.getOperationDefault())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean i(j jVar, Object obj, Map<String, ? extends Object> map, Object obj2) {
        Object objA;
        if (map != null && (objA = jVar.a(map, obj)) != null) {
            obj2 = objA;
        }
        return j(obj2);
    }

    @Override // lp0.a
    public ArrayOperationInputData a(List<? extends Object> list, Object obj, j jVar) {
        return f.a.a(this, list, obj, jVar);
    }

    @Override // jp0.a
    public Object b(Object expression, Object data, j evaluator) {
        s.k(evaluator, "evaluator");
        return e(expression, data, evaluator, new a(this));
    }

    @Override // lp0.a
    public Object d(Map<String, ? extends Object> map, List<? extends Object> list) {
        return f.a.b(this, map, list);
    }

    @Override // lp0.f
    public Object e(Object obj, Object obj2, j jVar, wn0.p<? super ArrayOperationInputData, ? super j, ? extends Object> pVar) {
        return f.a.c(this, obj, obj2, jVar, pVar);
    }

    @Override // xr0.a
    public List<Object> f(List<? extends Object> list, Object obj, j jVar) {
        return f.a.d(this, list, obj, jVar);
    }

    public boolean j(Object obj) {
        return sp0.d.a.a(this, obj);
    }
}
