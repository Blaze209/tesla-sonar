package hq0;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.Address;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class a implements b, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<iq0.a<String, Object>> f73275a = new ArrayList();

    @Override // hq0.b
    public String a(String str) {
        String string;
        StringBuilder sb2 = new StringBuilder(256);
        if (str != null) {
            sb2.append(str);
        }
        if (!this.f73275a.isEmpty()) {
            if (sb2.length() > 0) {
                sb2.append('\n');
            }
            sb2.append("Exception Context:\n");
            int i11 = 0;
            for (iq0.a<String, Object> aVar : this.f73275a) {
                sb2.append("\t[");
                i11++;
                sb2.append(i11);
                sb2.append(CoreConstants.COLON_CHAR);
                sb2.append(aVar.getKey());
                sb2.append("=");
                Object value = aVar.getValue();
                if (value == null) {
                    sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
                } else {
                    try {
                        string = value.toString();
                    } catch (Exception e11) {
                        string = "Exception thrown on toString(): " + c.a(e11);
                    }
                    sb2.append(string);
                }
                sb2.append("]\n");
            }
            sb2.append("---------------------------------");
        }
        return sb2.toString();
    }
}
