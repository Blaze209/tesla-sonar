package tr0;

import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltr0/i;", "Ljp0/b;", "Ltr0/o;", "<init>", "()V", "", "expression", "data", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i implements jp0.b, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f114947a = new i();

    private i() {
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        Object objB;
        List<Object> listC = yr0.a.c(expression);
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            Object obj = listC.get(0);
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = listC.get(1);
            p013kotlin.jvm.internal.s.i(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = listC.get(2);
            p013kotlin.jvm.internal.s.i(obj3, "null cannot be cast to non-null type kotlin.String");
            ReplaceData replaceData = new ReplaceData((String) obj, (String) obj2, (String) obj3);
            k.Companion companion2 = k.INSTANCE;
            Object obj4 = listC.get(3);
            p013kotlin.jvm.internal.s.i(obj4, "null cannot be cast to non-null type kotlin.String");
            objB = jn0.s.b(companion2.a((String) obj4, replaceData).invoke());
        } catch (Throwable th2) {
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        if (jn0.s.e(objB) == null) {
            return objB;
        }
        return null;
    }
}
