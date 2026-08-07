package ji;

import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "Lji/d;", "", "name", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;", "apollo-api"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class e {
    public static final String a(List<HttpHeader> list, String name) {
        Object next;
        s.k(list, "<this>");
        s.k(name, "name");
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!t.M(((HttpHeader) next).getName(), name, true));
        HttpHeader httpHeader = (HttpHeader) next;
        if (httpHeader != null) {
            return httpHeader.getValue();
        }
        return null;
    }
}
