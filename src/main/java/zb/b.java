package zb;

import defpackage.j;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lzb/b;", "Ljp0/a;", "Lxr0/a;", "<init>", "()V", "", "expression", "data", "Lj;", "evaluator", "b", "(Ljava/lang/Object;Ljava/lang/Object;Lj;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements jp0.a, xr0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f128029a = new b();

    private b() {
    }

    @Override // jp0.a
    public Object b(Object expression, Object data, j evaluator) {
        s.k(evaluator, "evaluator");
        List<? extends Object> listC = yr0.a.c(expression);
        List<Object> listF = f128029a.f(listC, data, evaluator);
        Map<String, ? extends Object> mapA = yr0.c.a(listC);
        if (mapA != null && listF != null) {
            for (Object obj : listF) {
                if (s.f(evaluator.a(mapA, obj), Boolean.TRUE)) {
                    return obj;
                }
            }
        }
        return null;
    }

    @Override // xr0.a
    public List<Object> f(List<? extends Object> list, Object obj, j jVar) {
        return xr0.a.C2683a.a(this, list, obj, jVar);
    }
}
