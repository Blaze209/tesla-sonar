package dp;

import android.content.Context;
import com.facebook.soloader.d0;
import com.facebook.soloader.p;
import com.facebook.soloader.v;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f60809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f60810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f60811c;

    public g(Context context, a aVar) {
        this.f60809a = context;
        this.f60810b = aVar;
        this.f60811c = aVar.c();
    }

    private boolean b() {
        String strC = c();
        return new File(strC).exists() && this.f60810b.a(strC);
    }

    private String c() {
        return this.f60809a.getApplicationInfo().sourceDir;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d(d0[] d0VarArr) {
        for (int i11 = 0; i11 < d0VarArr.length; i11++) {
            Object[] objArr = d0VarArr[i11];
            if (objArr instanceof v) {
                d0VarArr[i11] = ((v) objArr).b(this.f60809a);
            }
        }
    }

    @Override // dp.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, d0[] d0VarArr) {
        if (b()) {
            d(d0VarArr);
            return true;
        }
        if (this.f60811c == this.f60810b.c()) {
            return false;
        }
        p.g("soloader.recovery.DetectDataAppMove", "Context was updated (perhaps by another thread)");
        return true;
    }
}
