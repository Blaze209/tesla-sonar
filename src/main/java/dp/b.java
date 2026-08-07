package dp;

import android.content.Context;
import com.facebook.soloader.NoBaseApkException;
import com.facebook.soloader.d0;
import com.facebook.soloader.p;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f60801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f60802b;

    public b(Context context, a aVar) {
        this.f60801a = context;
        this.f60802b = aVar;
    }

    @Override // dp.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, d0[] d0VarArr) {
        String str = this.f60801a.getApplicationInfo().sourceDir;
        if (new File(str).exists()) {
            p.g("soloader.recovery.CheckBaseApkExists", "Base apk exists: " + str);
            return false;
        }
        StringBuilder sb2 = new StringBuilder("Base apk does not exist: ");
        sb2.append(str);
        sb2.append(". ");
        this.f60802b.b(sb2);
        throw new NoBaseApkException(sb2.toString(), unsatisfiedLinkError);
    }
}
