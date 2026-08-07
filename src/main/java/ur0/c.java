package ur0;

import java.util.List;
import jn0.s;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import tr0.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n*\b\u0012\u0004\u0012\u00020\u00070\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lur0/c;", "Ljp0/b;", "Ltr0/o;", "<init>", "()V", "", "", "Lko0/c;", "b", "(Ljava/util/List;)Ljava/util/List;", "", "a", "(Ljava/util/List;)Ljava/lang/Integer;", "expression", "data", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lur0/b;", "Lur0/b;", "formatter", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements jp0.b, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f116525a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final b formatter = new b();

    private c() {
    }

    private final Integer a(List<ko0.c> list) {
        Object objB;
        try {
            s.Companion companion = s.INSTANCE;
            objB = s.b(Integer.valueOf(((ko0.c) v.o0(list)).compareTo((ko0.c) v.A0(list))));
        } catch (Throwable th2) {
            s.Companion companion2 = s.INSTANCE;
            objB = s.b(t.a(th2));
        }
        if (!s.h(objB)) {
            if (s.g(objB)) {
                objB = null;
            }
            return (Integer) objB;
        }
        int iIntValue = ((Number) objB).intValue();
        if (iIntValue > 0) {
            return 1;
        }
        return iIntValue < 0 ? -1 : 0;
    }

    private final List<ko0.c> b(List<? extends Object> list) {
        Object objB;
        try {
            s.Companion companion = s.INSTANCE;
            Object obj = list.get(2);
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.String");
            a aVarValueOf = a.valueOf((String) obj);
            b bVar = formatter;
            Object obj2 = list.get(0);
            p013kotlin.jvm.internal.s.i(obj2, "null cannot be cast to non-null type kotlin.String");
            ko0.c cVarA = bVar.a((String) obj2, aVarValueOf);
            Object obj3 = list.get(1);
            p013kotlin.jvm.internal.s.i(obj3, "null cannot be cast to non-null type kotlin.String");
            objB = s.b(v.p(cVarA, bVar.a((String) obj3, aVarValueOf)));
        } catch (Throwable th2) {
            s.Companion companion2 = s.INSTANCE;
            objB = s.b(t.a(th2));
        }
        if (s.g(objB)) {
            objB = null;
        }
        return (List) objB;
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        List<ko0.c> listB = b(yr0.a.c(expression));
        if (listB != null) {
            return a(listB);
        }
        return null;
    }
}
