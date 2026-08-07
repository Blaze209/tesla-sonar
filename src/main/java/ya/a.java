package ya;

import android.database.SQLException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lya/b;", "", "sql", "Ljn0/h0;", "a", "(Lya/b;Ljava/lang/String;)V", "", "errorCode", "errorMsg", "", "b", "(ILjava/lang/String;)Ljava/lang/Void;", "sqlite_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final void a(b bVar, String sql) throws Exception {
        s.k(bVar, "<this>");
        s.k(sql, "sql");
        d dVarL1 = bVar.L1(sql);
        try {
            dVarL1.I1();
            un0.a.a(dVarL1, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(dVarL1, th2);
                throw th3;
            }
        }
    }

    public static final Void b(int i11, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i11);
        if (str != null) {
            sb2.append(", message: " + str);
        }
        throw new SQLException(sb2.toString());
    }
}
