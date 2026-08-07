package dp;

import android.content.Context;
import com.facebook.soloader.b0;
import com.facebook.soloader.d0;
import com.facebook.soloader.f0;
import com.facebook.soloader.p;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f60803a;

    public c(Context context) {
        this.f60803a = context;
    }

    @Override // dp.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, d0[] d0VarArr) {
        if (!(unsatisfiedLinkError instanceof b0)) {
            return false;
        }
        p.b("SoLoader", "Checking /data/app missing libraries.");
        File file = new File(this.f60803a.getApplicationInfo().nativeLibraryDir);
        if (!file.exists()) {
            p.b("SoLoader", "Native library directory " + file + " does not exist, exiting /data/app recovery.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (d0 d0Var : d0VarArr) {
            if (d0Var instanceof com.facebook.soloader.c) {
                com.facebook.soloader.c cVar = (com.facebook.soloader.c) d0Var;
                try {
                    for (f0.c cVar2 : cVar.o()) {
                        if (!new File(file, cVar2.f23939a).exists()) {
                            arrayList.add(cVar2.f23939a);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        p.b("SoLoader", "Missing libraries from " + file + ": " + arrayList.toString() + ", will run prepare on tbe backup so source");
                        cVar.e(0);
                        break;
                    }
                    p.b("SoLoader", "No libraries missing from " + file);
                    return false;
                } catch (Exception e11) {
                    p.c("SoLoader", "Encountered an exception while recovering from /data/app failure ", e11);
                    return false;
                }
            }
        }
        for (d0 d0Var2 : d0VarArr) {
            if ((d0Var2 instanceof com.facebook.soloader.f) && !(d0Var2 instanceof com.facebook.soloader.c)) {
                ((com.facebook.soloader.f) d0Var2).h();
            }
        }
        p.b("SoLoader", "Successfully recovered from /data/app disk failure.");
        return true;
    }
}
