package tr0;

import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltr0/t;", "Ljp0/b;", "Ltr0/o;", "<init>", "()V", "", "expression", "data", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t implements jp0.b, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f114963a = new t();

    private t() {
    }

    public String a(Object obj) {
        return o.a.a(this, obj);
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        String strA = a(expression);
        if (strA == null) {
            return null;
        }
        String upperCase = strA.toUpperCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }
}
