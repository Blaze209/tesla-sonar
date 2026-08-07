package u5;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.Address;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static void a(Object obj, StringBuilder sb2) {
        int iLastIndexOf;
        if (obj == null) {
            sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append(CoreConstants.CURLY_LEFT);
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
