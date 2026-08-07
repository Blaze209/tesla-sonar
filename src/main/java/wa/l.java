package wa;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lya/b;", "connection", "", "a", "(Lya/b;)I", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class l {
    public static final int a(ya.b connection) throws Exception {
        p013kotlin.jvm.internal.s.k(connection, "connection");
        ya.d dVarL1 = connection.L1("SELECT changes()");
        try {
            dVarL1.I1();
            int i11 = (int) dVarL1.getLong(0);
            un0.a.a(dVarL1, null);
            return i11;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(dVarL1, th2);
                throw th3;
            }
        }
    }
}
