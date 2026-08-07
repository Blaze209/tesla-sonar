package ri;

import java.util.List;
import ji.HttpHeader;
import okhttp3.Headers;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "Lji/d;", "Lokhttp3/Headers;", "a", "(Ljava/util/List;)Lokhttp3/Headers;", "apollo-runtime"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class b {
    public static final Headers a(List<HttpHeader> list) {
        s.k(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        for (HttpHeader httpHeader : list) {
            builder.add(httpHeader.getName(), httpHeader.getValue());
        }
        return builder.build();
    }
}
