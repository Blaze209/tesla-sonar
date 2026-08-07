package sz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f111944a = new a();

    public static class a implements rz.j {
        @Override // rz.j
        public boolean a(Field field, Method method) {
            tz.a aVar = (tz.a) method.getAnnotation(tz.a.class);
            return aVar == null || !aVar.value();
        }
    }

    public static String a(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 'g';
        cArr[1] = 'e';
        cArr[2] = 't';
        char cCharAt = str.charAt(0);
        if (cCharAt >= 'a' && cCharAt <= 'z') {
            cCharAt = (char) (cCharAt - ' ');
        }
        cArr[3] = cCharAt;
        for (int i11 = 1; i11 < length; i11++) {
            cArr[i11 + 3] = str.charAt(i11);
        }
        return new String(cArr);
    }

    public static String b(String str) {
        int length = str.length();
        char[] cArr = new char[length + 2];
        cArr[0] = 'i';
        cArr[1] = 's';
        char cCharAt = str.charAt(0);
        if (cCharAt >= 'a' && cCharAt <= 'z') {
            cCharAt = (char) (cCharAt - ' ');
        }
        cArr[2] = cCharAt;
        for (int i11 = 1; i11 < length; i11++) {
            cArr[i11 + 2] = str.charAt(i11);
        }
        return new String(cArr);
    }
}
