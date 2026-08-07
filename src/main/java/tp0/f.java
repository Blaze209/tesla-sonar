package tp0;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ltp0/f;", "Ljp0/b;", "Lvp0/a;", "<init>", "()V", "", "expression", "data", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Double;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f implements jp0.b, vp0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f114917a = new f();

    private f() {
    }

    @Override // jp0.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double f(Object expression, Object data) {
        List<Double> listB = b(expression);
        if (listB.size() < 2) {
            listB = null;
        }
        if (listB != null) {
            Double d11 = listB.get(1);
            Double d12 = (Double) v.o0(listB);
            if (d12 != null && d11 != null && !s.b(d11, 0.0d)) {
                return Double.valueOf(d12.doubleValue() % d11.doubleValue());
            }
        }
        return null;
    }

    public List<Double> b(Object obj) {
        return vp0.a.C2562a.c(this, obj);
    }
}
