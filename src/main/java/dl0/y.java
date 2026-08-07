package dl0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\u00160\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001bJ\u0017\u0010!\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0019H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b+\u0010(J\u0017\u0010,\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\bH\u0014¢\u0006\u0004\b,\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b.\u0010\u0015R,\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0/8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Ldl0/y;", "Ldl0/x;", "", "caseInsensitiveName", "", "size", "<init>", "(ZI)V", "", "name", "", "g", "(Ljava/lang/String;)Ljava/util/List;", "", "b", "contains", "(Ljava/lang/String;)Z", "", "names", "()Ljava/util/Set;", "isEmpty", "()Z", "", "a", "value", "Ljn0/h0;", "k", "(Ljava/lang/String;Ljava/lang/String;)V", "h", "(Ljava/lang/String;)Ljava/lang/String;", "f", "Ldl0/w;", "stringValues", "e", "(Ldl0/w;)V", "", "values", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/Iterable;)V", "j", "(Ljava/lang/String;)V", "clear", "()V", "l", "m", "Z", "c", "", "Ljava/util/Map;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class y implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean caseInsensitiveName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, List<String>> values;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "name", "", "values", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.p<String, List<? extends String>, h0> {
        a() {
            super(2);
        }

        public final void a(String name, List<String> values) {
            p013kotlin.jvm.internal.s.k(name, "name");
            p013kotlin.jvm.internal.s.k(values, "values");
            y.this.d(name, values);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(String str, List<? extends String> list) {
            a(str, list);
            return h0.f84049a;
        }
    }

    public y(boolean z11, int i11) {
        this.caseInsensitiveName = z11;
        this.values = z11 ? l.a() : new LinkedHashMap<>(i11);
    }

    private final List<String> g(String name) {
        List<String> list = this.values.get(name);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        l(name);
        this.values.put(name, arrayList);
        return arrayList;
    }

    @Override // dl0.x
    public Set<Map.Entry<String, List<String>>> a() {
        return k.a(this.values.entrySet());
    }

    @Override // dl0.x
    public List<String> b(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        return this.values.get(name);
    }

    @Override // dl0.x
    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    @Override // dl0.x
    public void clear() {
        this.values.clear();
    }

    @Override // dl0.x
    public boolean contains(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        return this.values.containsKey(name);
    }

    @Override // dl0.x
    public void d(String name, Iterable<String> values) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(values, "values");
        List<String> listG = g(name);
        for (String str : values) {
            m(str);
            listG.add(str);
        }
    }

    @Override // dl0.x
    public void e(w stringValues) {
        p013kotlin.jvm.internal.s.k(stringValues, "stringValues");
        stringValues.d(new a());
    }

    @Override // dl0.x
    public void f(String name, String value) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(value, "value");
        m(value);
        g(name).add(value);
    }

    public String h(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        List<String> listB = b(name);
        if (listB != null) {
            return (String) p013kotlin.collections.v.q0(listB);
        }
        return null;
    }

    protected final Map<String, List<String>> i() {
        return this.values;
    }

    @Override // dl0.x
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    public void j(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.values.remove(name);
    }

    public void k(String name, String value) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(value, "value");
        m(value);
        List<String> listG = g(name);
        listG.clear();
        listG.add(value);
    }

    protected void l(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
    }

    protected void m(String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
    }

    @Override // dl0.x
    public Set<String> names() {
        return this.values.keySet();
    }
}
