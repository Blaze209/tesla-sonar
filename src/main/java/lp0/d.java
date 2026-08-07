package lp0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import defpackage.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0012\u001a\u0004\u0018\u00010\n*\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Llp0/d;", "Ljp0/a;", "Llp0/f;", "<init>", "()V", "Llp0/b;", "operationInput", "Lj;", "evaluator", "", "", "h", "(Llp0/b;Lj;)Ljava/util/List;", "evaluatedValue", "", "", "mappingOperation", "operationDefault", IntegerTokenConverter.CONVERTER_KEY, "(Lj;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "expression", "data", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lj;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements jp0.a, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f90661a = new d();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends p implements wn0.p<ArrayOperationInputData, j, List<? extends Object>> {
        a(Object obj) {
            super(2, obj, d.class, "mapOrEmptyList", "mapOrEmptyList(Loperations/array/ArrayOperationInputData;LLogicEvaluator;)Ljava/util/List;", 0);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Object> invoke(ArrayOperationInputData p11, j p12) {
            s.k(p11, "p0");
            s.k(p12, "p1");
            return ((d) this.receiver).h(p11, p12);
        }
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Object> h(ArrayOperationInputData operationInput, j evaluator) {
        List<Object> listB = operationInput.b();
        if (listB == null) {
            listB = v.m();
        }
        List<Object> list = listB;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f90661a.i(evaluator, it.next(), operationInput.a(), operationInput.getOperationDefault()));
        }
        return arrayList;
    }

    private final Object i(j jVar, Object obj, Map<String, ? extends Object> map, Object obj2) {
        Object objA;
        return (map == null || (objA = jVar.a(map, obj)) == null) ? obj2 : objA;
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
}
