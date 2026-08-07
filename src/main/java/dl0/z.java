package dl0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00150\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0012J/\u0010\u001a\u001a\u00020\u00182\u001e\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u0014R,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Ldl0/z;", "Ldl0/w;", "", "caseInsensitiveName", "", "", "", "values", "<init>", "(ZLjava/util/Map;)V", "name", "e", "(Ljava/lang/String;)Ljava/util/List;", "get", "(Ljava/lang/String;)Ljava/lang/String;", "b", "", "names", "()Ljava/util/Set;", "isEmpty", "()Z", "", "a", "Lkotlin/Function2;", "Ljn0/h0;", "body", DateTokenConverter.CONVERTER_KEY, "(Lwn0/p;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "Z", "Ljava/util/Map;", "getValues", "()Ljava/util/Map;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class z implements w {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean caseInsensitiveName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, List<String>> values;

    public z(boolean z11, Map<String, ? extends List<String>> values) {
        p013kotlin.jvm.internal.s.k(values, "values");
        this.caseInsensitiveName = z11;
        Map mapA = z11 ? l.a() : new LinkedHashMap();
        for (Map.Entry<String, ? extends List<String>> entry : values.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            int size = value.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(value.get(i11));
            }
            mapA.put(key, arrayList);
        }
        this.values = mapA;
    }

    private final List<String> e(String name) {
        return this.values.get(name);
    }

    @Override // dl0.w
    public Set<Map.Entry<String, List<String>>> a() {
        return k.a(this.values.entrySet());
    }

    @Override // dl0.w
    public List<String> b(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        return e(name);
    }

    @Override // dl0.w
    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    @Override // dl0.w
    public void d(wn0.p<? super String, ? super List<String>, h0> body) {
        p013kotlin.jvm.internal.s.k(body, "body");
        for (Map.Entry<String, List<String>> entry : this.values.entrySet()) {
            body.invoke(entry.getKey(), entry.getValue());
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof w)) {
            return false;
        }
        w wVar = (w) other;
        if (this.caseInsensitiveName != wVar.getCaseInsensitiveName()) {
            return false;
        }
        return a0.d(a(), wVar.a());
    }

    @Override // dl0.w
    public String get(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        List<String> listE = e(name);
        if (listE != null) {
            return (String) p013kotlin.collections.v.q0(listE);
        }
        return null;
    }

    public int hashCode() {
        return a0.e(a(), Boolean.hashCode(this.caseInsensitiveName) * 31);
    }

    @Override // dl0.w
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    @Override // dl0.w
    public Set<String> names() {
        return k.a(this.values.keySet());
    }
}
