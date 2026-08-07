package ou;

import com.adyen.checkout.components.core.Address;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public final class w {
    public static String a(String str) {
        return o.a(str);
    }

    public static String b(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i11 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        }
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i12 = 0;
        while (i11 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i12)) != -1) {
            sb2.append((CharSequence) strValueOf, i12, iIndexOf);
            sb2.append(c(objArr[i11]));
            i12 = iIndexOf + 2;
            i11++;
        }
        sb2.append((CharSequence) strValueOf, i12, strValueOf.length());
        if (i11 < objArr.length) {
            String str2 = " [";
            while (i11 < objArr.length) {
                sb2.append(str2);
                sb2.append(c(objArr[i11]));
                i11++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    private static String c(Object obj) {
        if (obj == null) {
            return Address.ADDRESS_NULL_PLACEHOLDER;
        }
        try {
            return obj.toString();
        } catch (Exception e11) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e11);
            return "<" + str + " threw " + e11.getClass().getName() + ">";
        }
    }

    public static String d(String str) {
        return o.e(str);
    }
}
