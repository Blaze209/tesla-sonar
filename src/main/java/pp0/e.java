package pp0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpp0/e;", "Ljp0/b;", "Lsp0/d;", "<init>", "()V", "", "expression", "data", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements jp0.b, sp0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f103541a = new e();

    private e() {
    }

    public boolean a(Object obj) {
        return sp0.d.a.a(this, obj);
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        List<Object> listC = yr0.a.c(expression);
        List<Object> list = listC;
        Object obj = null;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Boolean)) {
                    for (Object obj2 : list) {
                        if (f103541a.a(obj2)) {
                            obj = obj2;
                            break;
                        }
                    }
                    return obj == null ? v.A0(listC) : obj;
                }
            }
        }
        for (Object obj3 : list) {
            if (f103541a.a(obj3)) {
                obj = obj3;
                break;
            }
        }
        return Boolean.valueOf(obj != null);
    }
}
