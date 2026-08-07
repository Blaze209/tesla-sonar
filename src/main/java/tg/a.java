package tg;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f113408a = false;

    public static String a(Object obj, Object obj2) {
        if (obj == null) {
            obj = "";
        }
        if (obj2 == null) {
            obj2 = "";
        }
        return String.format("%s:%s", obj, obj2);
    }

    public static String b(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "-";
        }
        sb2.append(String.format("[%s] ", str));
        if (objArr != null) {
            int length = objArr.length;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i12 >= objArr.length) {
                    break;
                }
                sb2.append(a(objArr[i11], objArr[i12]));
                if (i12 < length - 1) {
                    sb2.append(",");
                }
                i11 += 2;
            }
            if (i11 == objArr.length - 1) {
                sb2.append(objArr[i11]);
            }
        }
        return sb2.toString();
    }

    public static void c(String str, Object... objArr) {
        if (f113408a) {
            Log.d("OpenId", b(str, objArr));
        }
    }
}
