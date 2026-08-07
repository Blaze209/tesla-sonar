package tp0;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltp0/h;", "Ljp0/b;", "Lvp0/a;", "<init>", "()V", "", "first", "second", "b", "(Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;", "", "expression", "data", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Double;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h implements jp0.b, vp0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f114920a = new h();

    private h() {
    }

    private final Double b(Double first, Double second) {
        if (first == null || second == null) {
            return null;
        }
        return Double.valueOf(first.doubleValue() - second.doubleValue());
    }

    @Override // jp0.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double f(Object expression, Object data) {
        List<Double> listC = c(expression);
        int size = listC.size();
        if (size != 0) {
            if (size != 1) {
                return f114920a.b((Double) v.o0(listC), listC.get(1));
            }
            Double d11 = (Double) v.o0(listC);
            if (d11 != null) {
                return Double.valueOf(-d11.doubleValue());
            }
        }
        return null;
    }

    public List<Double> c(Object obj) {
        return vp0.a.C2562a.c(this, obj);
    }
}
