package tj0;

import java.net.URLEncoder;
import jp0.b;
import p013kotlin.Metadata;
import p013kotlin.text.d;
import tr0.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltj0/a;", "Ljp0/b;", "Ltr0/o;", "<init>", "()V", "", "expression", "data", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements b, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f114642a = new a();

    private a() {
    }

    public String a(Object obj) {
        return o.a.a(this, obj);
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        String strA = a(expression);
        if (strA != null) {
            return URLEncoder.encode(strA, d.UTF_8.name());
        }
        return null;
    }
}
