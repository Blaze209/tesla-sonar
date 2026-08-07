package wa;

import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lya/b;", "connection", "Ljn0/h0;", "a", "(Lya/b;)V", "room-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/room/util/DBUtil")
final /* synthetic */ class c {
    public static final void a(ya.b connection) {
        p013kotlin.jvm.internal.s.k(connection, "connection");
        List listC = v.c();
        ya.d dVarL1 = connection.L1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (dVarL1.I1()) {
            try {
                listC.add(dVarL1.q3(0));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    un0.a.a(dVarL1, th2);
                    throw th3;
                }
            }
        }
        h0 h0Var = h0.f84049a;
        un0.a.a(dVarL1, null);
        for (String str : v.a(listC)) {
            if (t.b0(str, "room_fts_content_sync_", false, 2, null)) {
                ya.a.a(connection, "DROP TRIGGER IF EXISTS " + str);
            }
        }
    }
}
