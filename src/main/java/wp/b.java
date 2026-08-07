package wp;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    public interface a {
        void a(Context context, String[] strArr, String str, File file, wp.c cVar);
    }

    /* JADX INFO: renamed from: wp.b$b, reason: collision with other inner class name */
    public interface InterfaceC2624b {
        String a(String str);

        String[] b();

        void c(String str);

        void d(String str);

        String e(String str);
    }

    public interface c {
    }

    public static void a(Context context, String str, String str2) {
        b(context, str, str2, null);
    }

    public static void b(Context context, String str, String str2, c cVar) {
        new wp.c().f(context, str, str2, cVar);
    }
}
