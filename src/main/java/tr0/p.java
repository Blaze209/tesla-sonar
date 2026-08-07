package tr0;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltr0/p;", "Ljp0/b;", "<init>", "()V", "", "expression", "data", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p implements jp0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f114955a = new p();

    private p() {
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        List listF1;
        List listI0;
        Object objQ0 = v.q0(yr0.a.c(expression));
        String str = objQ0 instanceof String ? (String) objQ0 : null;
        if (str == null || (listF1 = p013kotlin.text.t.f1(str, new String[]{""}, false, 0, 6, null)) == null || (listI0 = v.i0(listF1, 1)) == null) {
            return null;
        }
        return v.j0(listI0, 1);
    }
}
