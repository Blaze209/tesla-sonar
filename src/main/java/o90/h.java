package o90;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "a", "(Ljava/lang/String;)Z", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class h {
    public static final boolean a(String str) {
        s.k(str, "<this>");
        EnumEntries<d> entries = d.getEntries();
        if (entries != null && entries.isEmpty()) {
            return false;
        }
        Iterator<d> it = entries.iterator();
        while (it.hasNext()) {
            List<String> suffixes = it.next().getSuffixes();
            if (!(suffixes instanceof Collection) || !suffixes.isEmpty()) {
                Iterator<T> it2 = suffixes.iterator();
                while (it2.hasNext()) {
                    if (t.K(str, (String) it2.next(), true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
