package o0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.a0;
import androidx.camera.core.impl.t;
import androidx.camera.core.impl.v;
import androidx.camera.core.impl.x;
import androidx.camera.core.impl.z;
import androidx.camera.core.n;
import c0.s0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a<n> {
    public e(int i11, @NonNull b.a<n> aVar) {
        super(i11, aVar);
    }

    private boolean d(@NonNull s0 s0Var) {
        z zVarA = a0.a(s0Var);
        return (zVarA.d() == v.LOCKED_FOCUSED || zVarA.d() == v.PASSIVE_FOCUSED) && zVarA.g() == t.CONVERGED && zVarA.e() == x.CONVERGED;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // o0.a, o0.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(@NonNull n nVar) {
        if (d(nVar.z())) {
            super.b(nVar);
        } else {
            this.f95560d.a((T) nVar);
        }
    }
}
