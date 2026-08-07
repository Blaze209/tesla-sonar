package sp0;

import com.adyen.checkout.components.core.Address;
import java.util.Collection;
import okhttp3.HttpUrl;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsp0/d;", "", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface d {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static boolean a(d dVar, Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof Number) {
                return ((Number) obj).doubleValue() != 0.0d;
            }
            if (obj instanceof String) {
                return (((CharSequence) obj).length() <= 0 || s.f(obj, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI) || s.f(obj, Address.ADDRESS_NULL_PLACEHOLDER)) ? false : true;
            }
            if (obj instanceof Collection) {
                return !((Collection) obj).isEmpty();
            }
            return ((obj instanceof Object[]) && ((Object[]) obj).length == 0) ? false : true;
        }
    }
}
