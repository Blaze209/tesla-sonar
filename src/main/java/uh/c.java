package uh;

import android.content.Context;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f116194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f116195b = new Object();

    public static long a(b bVar) {
        if (bVar == null) {
            return 0L;
        }
        String str = String.format("%s%s%s%s%s", bVar.g(), bVar.i(), Long.valueOf(bVar.a()), bVar.k(), bVar.d());
        if (qh.f.b(str)) {
            return 0L;
        }
        Adler32 adler32 = new Adler32();
        adler32.reset();
        adler32.update(str.getBytes());
        return adler32.getValue();
    }

    public static b b(Context context) {
        if (context == null) {
            return null;
        }
        synchronized (f116195b) {
            try {
                String strJ = d.b(context).j();
                if (qh.f.b(strJ)) {
                    return null;
                }
                if (strJ.endsWith("\n")) {
                    strJ = strJ.substring(0, strJ.length() - 1);
                }
                b bVar = new b();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strB = qh.d.b(context);
                String strD = qh.d.d(context);
                bVar.h(strB);
                bVar.c(strB);
                bVar.e(jCurrentTimeMillis);
                bVar.f(strD);
                bVar.j(strJ);
                bVar.b(a(bVar));
                return bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized b c(Context context) {
        b bVar = f116194a;
        if (bVar != null) {
            return bVar;
        }
        if (context == null) {
            return null;
        }
        b bVarB = b(context);
        f116194a = bVarB;
        return bVarB;
    }
}
