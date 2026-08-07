package pp0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpp0/a;", "Ljp0/b;", "Lsp0/d;", "<init>", "()V", "", "expression", "data", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements jp0.b, sp0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f103537a = new a();

    private a() {
    }

    public boolean a(Object obj) {
        return sp0.d.a.a(this, obj);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[RETURN] */
    @Override // jp0.b
    public Object f(Object expression, Object data) {
        List<Object> listC = yr0.a.c(expression);
        List<Object> list = listC;
        boolean z11 = list instanceof Collection;
        if (!z11 || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Boolean)) {
                    for (Object obj : list) {
                        if (!f103537a.a(obj)) {
                            if (obj == null) {
                                return v.A0(listC);
                            }
                            return obj;
                        }
                    }
                    obj = null;
                    if (obj == null) {
                        return v.A0(listC);
                    }
                    return obj;
                }
            }
        }
        boolean z12 = true;
        if (!z11 || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!f103537a.a(it2.next())) {
                    z12 = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z12);
    }
}
