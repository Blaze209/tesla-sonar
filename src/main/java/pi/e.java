package pi;

import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\u001a%\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000j\u0002`\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006*(\b\u0002\u0010\u0007\"\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000*(\b\u0002\u0010\t\"\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¨\u0006\n"}, d2 = {"", "", "", "Lcom/apollographql/apollo3/internal/JsonMap;", "", "a", "(Ljava/util/Map;)Z", "JsonMap", "", "MutableJsonMap", "apollo-runtime"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class e {
    public static final boolean a(Map<String, ? extends Object> map) {
        s.k(map, "<this>");
        return map.keySet().contains("hasNext");
    }
}
