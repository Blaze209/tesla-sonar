package w7;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public interface d {
    static long a(d dVar) {
        return dVar.b("exo_len", -1L);
    }

    static Uri c(d dVar) {
        String strD = dVar.d("exo_redir", null);
        if (strD == null) {
            return null;
        }
        return Uri.parse(strD);
    }

    long b(String str, long j11);

    String d(String str, String str2);
}
