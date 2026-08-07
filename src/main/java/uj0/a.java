package uj0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.JsonLogicException;
import defpackage.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Luj0/a;", "Lj;", "Luj0/b;", "operations", "<init>", "(Luj0/b;)V", "", "logic", "data", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "c", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "", "Ljp0/b;", "operator", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;Ljava/lang/Object;)Ljp0/b;", "expression", "a", "Luj0/b;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LogicOperations operations;

    public a(LogicOperations operations) {
        s.k(operations, "operations");
        this.operations = operations;
    }

    private final Object b(Object logic, Object data) {
        if (!(logic instanceof List)) {
            if (!(logic instanceof Map)) {
                return logic;
            }
            Map<?, ?> map = (Map) logic;
            return map.isEmpty() ? data : c(map, data);
        }
        Iterable iterable = (Iterable) logic;
        ArrayList arrayList = new ArrayList(v.y(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next(), data));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    private final Object c(Map<?, ?> logic, Object data) throws JsonLogicException {
        Object objB;
        Object objP0 = v.p0(logic.keySet());
        Object obj = logic.get(objP0);
        if (v.g0(this.operations.a().keySet(), objP0)) {
            jp0.a aVar = this.operations.a().get(objP0);
            if (aVar != null) {
                return aVar.b(obj, data, this);
            }
            return null;
        }
        jp0.b bVarD = d(this.operations.b(), objP0);
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            objB = new ArrayList(v.y(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                objB.add(b(it.next(), data));
            }
        } else {
            objB = obj instanceof Map ? b(obj, data) : b(obj, data);
        }
        return bVarD.f(objB, data);
    }

    private final jp0.b d(Map<String, ? extends jp0.b> map, Object obj) throws JsonLogicException {
        jp0.b bVar = map.get(obj);
        if (bVar != null) {
            return bVar;
        }
        throw new JsonLogicException("Operation " + obj + " not found.");
    }

    @Override // defpackage.j
    public Object a(Map<String, ? extends Object> expression, Object data) {
        s.k(expression, "expression");
        return b(expression, data);
    }
}
