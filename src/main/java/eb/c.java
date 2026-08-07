package eb;

import android.os.Trace;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
final class c {
    public static void a(@NonNull String str, int i11) {
        Trace.beginAsyncSection(str, i11);
    }

    public static void b(@NonNull String str, int i11) {
        Trace.endAsyncSection(str, i11);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }

    public static void d(@NonNull String str, int i11) {
        Trace.setCounter(str, i11);
    }
}
