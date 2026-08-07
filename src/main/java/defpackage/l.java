package defpackage;

import java.util.List;
import jp0.b;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll;", "Ljp0/b;", "<init>", "()V", "", "expression", "data", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f89454a = new l();

    private l() {
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        if (expression instanceof String) {
            return t.R1((String) expression).toString();
        }
        if (expression instanceof List) {
            return v.R0((Iterable) expression);
        }
        return null;
    }
}
