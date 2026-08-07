package p010i90;

import g90.a;
import g90.b;
import g90.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR&\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Li90/e;", "", "Lg90/b;", "schemaRegistry", "<init>", "(Lg90/b;)V", "", "countryCode", "", "Li90/j1;", "a", "(Ljava/lang/String;)Ljava/util/List;", "Ljava/util/List;", "defaultElements", "", "b", "Ljava/util/Map;", "elements", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<j1> defaultElements;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, List<j1>> elements;

    public e(b schemaRegistry) {
        s.k(schemaRegistry, "schemaRegistry");
        this.defaultElements = h.g(schemaRegistry.b().a(), schemaRegistry.b().b());
        Map<String, a> mapA = schemaRegistry.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(mapA.size()));
        Iterator<T> it = mapA.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), h.g(((a) entry.getValue()).a(), (String) entry.getKey()));
        }
        this.elements = linkedHashMap;
    }

    public final List<j1> a(String countryCode) {
        return countryCode != null ? this.elements.get(countryCode) : this.defaultElements;
    }
}
