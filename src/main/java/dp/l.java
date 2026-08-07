package dp;

import com.facebook.soloader.d0;
import com.facebook.soloader.m;
import com.facebook.soloader.p;

/* JADX INFO: loaded from: classes4.dex */
public class l implements h {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // dp.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, d0[] d0VarArr) {
        for (m mVar : d0VarArr) {
            if (mVar instanceof com.facebook.soloader.b) {
                p.b("SoLoader", "Waiting on SoSource " + mVar.c());
                mVar.a();
            }
        }
        return true;
    }
}
