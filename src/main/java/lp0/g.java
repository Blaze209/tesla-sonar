package lp0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import defpackage.j;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0012\u001a\u0004\u0018\u00010\u0007*\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Llp0/g;", "Ljp0/a;", "Llp0/a;", "<init>", "()V", "Llp0/b;", "operationInput", "", "initialValue", "Lj;", "evaluator", "g", "(Llp0/b;Ljava/lang/Object;Lj;)Ljava/lang/Object;", "accumulator", "evaluatedValue", "", "", "mappingOperation", "h", "(Lj;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;", "current", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", "expression", "data", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lj;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g implements jp0.a, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f90663a = new g();

    private g() {
    }

    private final Object g(ArrayOperationInputData operationInput, Object initialValue, j evaluator) {
        List<Object> listB = operationInput.b();
        if (listB != null) {
            Iterator<T> it = listB.iterator();
            Object objH = initialValue;
            while (it.hasNext()) {
                objH = f90663a.h(evaluator, objH, it.next(), operationInput.a());
                if (objH == null) {
                    return operationInput.getOperationDefault();
                }
            }
            if (objH != null) {
                return objH;
            }
        }
        return initialValue;
    }

    private final Object h(j jVar, Object obj, Object obj2, Map<String, ? extends Object> map) {
        if (map != null) {
            return jVar.a(map, f90663a.i(obj, obj2));
        }
        return null;
    }

    private final Map<String, Object> i(Object accumulator, Object current) {
        return v0.m(x.a("accumulator", accumulator), x.a("current", current));
    }

    @Override // lp0.a
    public ArrayOperationInputData a(List<? extends Object> list, Object obj, j jVar) {
        return a.C1929a.a(this, list, obj, jVar);
    }

    @Override // jp0.a
    public Object b(Object expression, Object data, j evaluator) {
        s.k(evaluator, "evaluator");
        List<? extends Object> listC = yr0.a.c(expression);
        g gVar = f90663a;
        return gVar.g(gVar.a(listC, data, evaluator), yr0.c.c(listC), evaluator);
    }

    @Override // lp0.a
    public Object d(Map<String, ? extends Object> map, List<? extends Object> list) {
        return a.C1929a.b(this, map, list);
    }

    @Override // xr0.a
    public List<Object> f(List<? extends Object> list, Object obj, j jVar) {
        return a.C1929a.c(this, list, obj, jVar);
    }
}
