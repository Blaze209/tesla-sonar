package rz;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Field;
import java.util.HashMap;
import xz.b0;
import xz.r;
import xz.s;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    protected static void a(s sVar, b0 b0Var) {
        switch (b0Var.l()) {
            case 1:
                sVar.v(184, "java/lang/Boolean", CoreConstants.VALUE_OF, "(Z)Ljava/lang/Boolean;", false);
                break;
            case 2:
                sVar.v(184, "java/lang/Character", CoreConstants.VALUE_OF, "(C)Ljava/lang/Character;", false);
                break;
            case 3:
                sVar.v(184, "java/lang/Byte", CoreConstants.VALUE_OF, "(B)Ljava/lang/Byte;", false);
                break;
            case 4:
                sVar.v(184, "java/lang/Short", CoreConstants.VALUE_OF, "(S)Ljava/lang/Short;", false);
                break;
            case 5:
                sVar.v(184, "java/lang/Integer", CoreConstants.VALUE_OF, "(I)Ljava/lang/Integer;", false);
                break;
            case 6:
                sVar.v(184, "java/lang/Float", CoreConstants.VALUE_OF, "(F)Ljava/lang/Float;", false);
                break;
            case 7:
                sVar.v(184, "java/lang/Long", CoreConstants.VALUE_OF, "(J)Ljava/lang/Long;", false);
                break;
            case 8:
                sVar.v(184, "java/lang/Double", CoreConstants.VALUE_OF, "(D)Ljava/lang/Double;", false);
                break;
        }
    }

    public static b[] b(Class<?> cls, j jVar) {
        HashMap map = new HashMap();
        if (jVar == null) {
            jVar = c.f109258a;
        }
        while (cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                String name = field.getName();
                if (!map.containsKey(name)) {
                    b bVar = new b(cls, field, jVar);
                    if (bVar.g()) {
                        map.put(name, bVar);
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return (b[]) map.values().toArray(new b[map.size()]);
    }

    public static String c(String str) {
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

    public static String d(String str) {
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

    public static String e(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 's';
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

    public static r[] f(int i11) {
        r[] rVarArr = new r[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            rVarArr[i12] = new r();
        }
        return rVarArr;
    }
}
