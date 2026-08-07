package u60;

import com.fourthline.adapters.serialization.OrcaKeys;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu60/c;", "Lu60/e;", OrcaKeys.METADATA, "", "a", "(Lu60/c;Lu60/e;)Z", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {
    public static final boolean a(c cVar, PaymentMethodMetadata metadata) {
        s.k(cVar, "<this>");
        s.k(metadata, "metadata");
        Set<a> setB = cVar.b(metadata.w());
        if ((setB instanceof Collection) && setB.isEmpty()) {
            return true;
        }
        Iterator<T> it = setB.iterator();
        while (it.hasNext()) {
            if (!((a) it.next()).isMetBy(metadata)) {
                return false;
            }
        }
        return true;
    }
}
