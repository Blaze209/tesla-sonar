package pp0;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpp0/c;", "Ljp0/b;", "Lsp0/d;", "<init>", "()V", "", "", "a", "(Ljava/util/List;)Ljava/lang/Object;", "expression", "data", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements jp0.b, sp0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f103539a = new c();

    private c() {
    }

    private final Object a(List<? extends Object> list) {
        int size = list.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return v.q0(list);
        }
        if (size != 2) {
            if (size != 3) {
                return b(v.q0(list)) ? yr0.c.b(list) : a(list.subList(2, list.size()));
            }
            return b(v.q0(list)) ? yr0.c.b(list) : yr0.c.c(list);
        }
        if (b(v.q0(list))) {
            return yr0.c.b(list);
        }
        return null;
    }

    public boolean b(Object obj) {
        return sp0.d.a.a(this, obj);
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        return a(yr0.a.c(expression));
    }
}
