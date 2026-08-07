package mk0;

import java.security.AccessControlException;
import java.security.AccessController;

/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kk0.b f92286a = kk0.b.i("freemarker.security");

    public static String a(String str, String str2) {
        try {
            return (String) AccessController.doPrivileged(new c(str, str2));
        } catch (AccessControlException unused) {
            kk0.b bVar = f92286a;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Insufficient permissions to read system property ");
            stringBuffer.append(e.h(str));
            stringBuffer.append(", using default value ");
            stringBuffer.append(e.h(str2));
            bVar.u(stringBuffer.toString());
            return str2;
        }
    }
}
