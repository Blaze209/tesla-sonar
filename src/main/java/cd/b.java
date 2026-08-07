package cd;

import android.webkit.MimeTypeMap;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f19065a = "application/octet-stream";

    public static String a(String str) {
        if (str != null) {
            return str.equals(f19065a) ? "bin" : MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        }
        return "";
    }

    public static String b(String str, String str2) {
        String strA = a(str2);
        if (strA == null || strA.isEmpty()) {
            return str;
        }
        if (str.endsWith("." + strA)) {
            return str;
        }
        String str3 = str + "." + strA;
        return str3.endsWith(".") ? fq0.b.e(str3, ".") : str3;
    }
}
