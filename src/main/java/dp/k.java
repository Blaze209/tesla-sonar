package dp;

import com.facebook.soloader.a0;
import com.facebook.soloader.b0;
import com.facebook.soloader.d0;
import com.facebook.soloader.f0;
import com.facebook.soloader.p;

/* JADX INFO: loaded from: classes4.dex */
public class k implements h {
    @Override // dp.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, d0[] d0VarArr) {
        if (!(unsatisfiedLinkError instanceof b0) || (unsatisfiedLinkError instanceof a0)) {
            return false;
        }
        String strA = ((b0) unsatisfiedLinkError).a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Reunpacking NonApk UnpackingSoSources due to ");
        sb2.append(unsatisfiedLinkError);
        sb2.append(strA == null ? "" : ", retrying for specific library " + strA);
        p.b("SoLoader", sb2.toString());
        for (d0 d0Var : d0VarArr) {
            if (d0Var instanceof f0) {
                f0 f0Var = (f0) d0Var;
                if (f0Var instanceof com.facebook.soloader.c) {
                    continue;
                } else {
                    try {
                        p.b("SoLoader", "Runpacking " + f0Var.c());
                        f0Var.e(2);
                    } catch (Exception e11) {
                        p.c("SoLoader", "Encountered an exception while reunpacking " + f0Var.c() + " for library " + strA + ": ", e11);
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
