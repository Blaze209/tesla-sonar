package dp;

import com.facebook.soloader.a0;
import com.facebook.soloader.b0;
import com.facebook.soloader.d0;
import com.facebook.soloader.p;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f60812a;

    public j(int i11) {
        this.f60812a = i11;
    }

    private boolean b(d0[] d0VarArr, String str) {
        for (d0 d0Var : d0VarArr) {
            if (d0Var instanceof com.facebook.soloader.c) {
                com.facebook.soloader.c cVar = (com.facebook.soloader.c) d0Var;
                try {
                    p.b("SoLoader", "Preparing BackupSoSource for the first time " + cVar.c());
                    cVar.e(0);
                    for (d0 d0Var2 : d0VarArr) {
                        if ((d0Var2 instanceof com.facebook.soloader.f) && !(d0Var2 instanceof com.facebook.soloader.c)) {
                            ((com.facebook.soloader.f) d0Var2).h();
                        }
                    }
                    return true;
                } catch (Exception e11) {
                    p.c("SoLoader", "Encountered an exception while reunpacking BackupSoSource " + cVar.c() + " for library " + str + ": ", e11);
                    break;
                }
            }
        }
        return false;
    }

    private void c(Error error, String str) {
        p.b("SoLoader", "Reunpacking BackupSoSources due to " + error + ", retrying for specific library " + str);
    }

    private boolean d(d0[] d0VarArr, String str, int i11) {
        try {
            for (d0 d0Var : d0VarArr) {
                if ((d0Var instanceof com.facebook.soloader.c) && ((com.facebook.soloader.c) d0Var).x(str, i11)) {
                    return true;
                }
            }
            return false;
        } catch (IOException e11) {
            p.b("SoLoader", "Failed to run recovery for backup so source due to: " + e11);
            return false;
        }
    }

    @Override // dp.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, d0[] d0VarArr) {
        if (!(unsatisfiedLinkError instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) unsatisfiedLinkError;
        String strA = b0Var.a();
        String message = b0Var.getMessage();
        if (strA == null) {
            p.b("SoLoader", "No so name provided in ULE, cannot recover");
            return false;
        }
        if (b0Var instanceof a0) {
            if ((this.f60812a & 1) == 0) {
                return false;
            }
            c(b0Var, strA);
            return d(d0VarArr, strA, 0);
        }
        if (message == null || !(message.contains("/app/") || message.contains("/mnt/"))) {
            return false;
        }
        c(b0Var, strA);
        return b(d0VarArr, strA);
    }
}
