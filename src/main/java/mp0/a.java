package mp0;

import defpackage.j;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lp0.ArrayOperationInputData;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmp0/a;", "Ljp0/a;", "Lmp0/d;", "<init>", "()V", "", "expression", "data", "Lj;", "evaluator", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lj;)Ljava/lang/Object;", "Lmp0/c;", "c", "(Lmp0/c;Lj;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements jp0.a, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f92422a = new a();

    private a() {
    }

    @Override // lp0.a
    public ArrayOperationInputData a(List<? extends Object> list, Object obj, j jVar) {
        return d.a.c(this, list, obj, jVar);
    }

    @Override // jp0.a
    public Object b(Object expression, Object data, j evaluator) {
        s.k(evaluator, "evaluator");
        return g(expression, data, evaluator);
    }

    @Override // mp0.d
    public Object c(OccurrenceCheckInputData data, j evaluator) {
        s.k(data, "data");
        s.k(evaluator, "evaluator");
        Iterator<T> it = data.b().iterator();
        while (it.hasNext()) {
            if (!f92422a.i(evaluator.a(data.a(), it.next()))) {
                return data.getOperationDefault();
            }
        }
        return Boolean.TRUE;
    }

    @Override // lp0.f
    public Object e(Object obj, Object obj2, j jVar, p<? super ArrayOperationInputData, ? super j, ? extends Object> pVar) {
        return d.a.f(this, obj, obj2, jVar, pVar);
    }

    @Override // xr0.a
    public List<Object> f(List<? extends Object> list, Object obj, j jVar) {
        return d.a.h(this, list, obj, jVar);
    }

    public Object g(Object obj, Object obj2, j jVar) {
        return d.a.b(this, obj, obj2, jVar);
    }

    @Override // lp0.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Boolean d(Map<String, ? extends Object> map, List<? extends Object> list) {
        return d.a.e(this, map, list);
    }

    public boolean i(Object obj) {
        return d.a.i(this, obj);
    }
}
