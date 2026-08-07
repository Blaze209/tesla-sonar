package sz;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.Address;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class d extends HashMap<String, Object> implements c, f {
    public static String c(Map<String, ? extends Object> map) {
        return i(map, i.f111945a);
    }

    public static String i(Map<String, ? extends Object> map, g gVar) {
        StringBuilder sb2 = new StringBuilder();
        try {
            j(map, sb2, gVar);
        } catch (IOException unused) {
        }
        return sb2.toString();
    }

    public static void j(Map<String, ? extends Object> map, Appendable appendable, g gVar) throws IOException {
        if (map == null) {
            appendable.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else {
            vz.d.f120123i.a(map, appendable, gVar);
        }
    }

    public static void k(String str, Object obj, Appendable appendable, g gVar) throws IOException {
        if (str == null) {
            appendable.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else if (gVar.h(str)) {
            appendable.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            i.a(str, appendable, gVar);
            appendable.append(CoreConstants.DOUBLE_QUOTE_CHAR);
        } else {
            appendable.append(str);
        }
        appendable.append(CoreConstants.COLON_CHAR);
        if (obj instanceof String) {
            gVar.p(appendable, (String) obj);
        } else {
            i.b(obj, appendable, gVar);
        }
    }

    @Override // sz.e
    public void b(Appendable appendable) throws IOException {
        j(this, appendable, i.f111945a);
    }

    @Override // sz.c
    public String d(g gVar) {
        return i(this, gVar);
    }

    @Override // sz.b
    public String e() {
        return i(this, i.f111945a);
    }

    @Override // sz.f
    public void h(Appendable appendable, g gVar) throws IOException {
        j(this, appendable, gVar);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return i(this, i.f111945a);
    }
}
