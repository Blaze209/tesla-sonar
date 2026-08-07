package p8;

import a8.o2;
import java.util.List;
import p7.u;
import w8.o0;
import w8.q;

/* JADX INFO: loaded from: classes3.dex */
public interface f {

    public interface b {
        o0 b(int i11, int i12);
    }

    boolean a(q qVar);

    void c(b bVar, long j11, long j12);

    w8.g d();

    u[] e();

    void release();

    public interface a {
        f e(int i11, u uVar, boolean z11, List<u> list, o0 o0Var, o2 o2Var);

        default a a(t9.q.a aVar) {
            return this;
        }

        default a b(boolean z11) {
            return this;
        }

        default a c(int i11) {
            return this;
        }

        default u d(u uVar) {
            return uVar;
        }
    }
}
