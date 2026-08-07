package dp;

import com.facebook.soloader.b0;
import com.facebook.soloader.d0;
import com.facebook.soloader.f0;
import com.facebook.soloader.p;

/* JADX INFO: loaded from: classes4.dex */
public class d implements h {
    @Override // dp.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, d0[] d0VarArr) {
        if (!(unsatisfiedLinkError instanceof b0)) {
            return false;
        }
        p.b("SoLoader", "Checking /data/data missing libraries.");
        boolean z11 = false;
        for (d0 d0Var : d0VarArr) {
            if ((d0Var instanceof f0) && !(d0Var instanceof com.facebook.soloader.c)) {
                f0 f0Var = (f0) d0Var;
                try {
                    for (f0.c cVar : f0Var.o()) {
                        if (f0Var.f(cVar.f23939a) == null) {
                            p.b("SoLoader", "Missing " + cVar.f23939a + " from " + f0Var.c() + ", will force prepare.");
                            f0Var.e(2);
                            z11 = true;
                            break;
                        }
                    }
                } catch (Exception e11) {
                    p.c("SoLoader", "Encountered an exception while recovering from /data/data failure ", e11);
                    return false;
                }
            }
        }
        if (z11) {
            p.b("SoLoader", "Successfully recovered from /data/data disk failure.");
            return true;
        }
        p.b("SoLoader", "No libraries missing from unpacking so paths while recovering /data/data failure");
        return false;
    }
}
