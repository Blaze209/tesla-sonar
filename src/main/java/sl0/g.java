package sl0;

import androidx.annotation.NonNull;
import ql0.q;
import ql0.s;

/* JADX INFO: loaded from: classes8.dex */
public class g implements s {
    @Override // ql0.s
    public Object a(@NonNull ql0.g gVar, @NonNull q qVar) {
        if (rl0.b.a.BULLET == rl0.b.f108567a.c(qVar)) {
            return new tl0.b(gVar.e(), rl0.b.f108568b.c(qVar).intValue());
        }
        return new tl0.i(gVar.e(), String.valueOf(rl0.b.f108569c.c(qVar)) + ". ");
    }
}
