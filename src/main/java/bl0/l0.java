package bl0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u00150\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010%R\u001a\u0010(\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010\u0014¨\u0006)"}, d2 = {"Lbl0/l0;", "Lbl0/y;", "encodedParametersBuilder", "<init>", "(Lbl0/y;)V", "Lbl0/x;", "build", "()Lbl0/x;", "", "name", "", "b", "(Ljava/lang/String;)Ljava/util/List;", "", "contains", "(Ljava/lang/String;)Z", "", "names", "()Ljava/util/Set;", "isEmpty", "()Z", "", "a", "value", "Ljn0/h0;", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "Ldl0/w;", "stringValues", "e", "(Ldl0/w;)V", "", "values", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/Iterable;)V", "clear", "()V", "Lbl0/y;", "Z", "c", "caseInsensitiveName", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l0 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y encodedParametersBuilder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean caseInsensitiveName;

    public l0(y encodedParametersBuilder) {
        p013kotlin.jvm.internal.s.k(encodedParametersBuilder, "encodedParametersBuilder");
        this.encodedParametersBuilder = encodedParametersBuilder;
        this.caseInsensitiveName = encodedParametersBuilder.getCaseInsensitiveName();
    }

    @Override // dl0.x
    public Set<Map.Entry<String, List<String>>> a() {
        return m0.d(this.encodedParametersBuilder).a();
    }

    @Override // dl0.x
    public List<String> b(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        List<String> listB = this.encodedParametersBuilder.b(a.m(name, false, 1, null));
        if (listB == null) {
            return null;
        }
        List<String> list = listB;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a.k((String) it.next(), 0, 0, true, null, 11, null));
        }
        return arrayList;
    }

    @Override // bl0.y
    public x build() {
        return m0.d(this.encodedParametersBuilder);
    }

    @Override // dl0.x
    /* JADX INFO: renamed from: c, reason: from getter */
    public boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    @Override // dl0.x
    public void clear() {
        this.encodedParametersBuilder.clear();
    }

    @Override // dl0.x
    public boolean contains(String name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        return this.encodedParametersBuilder.contains(a.m(name, false, 1, null));
    }

    @Override // dl0.x
    public void d(String name, Iterable<String> values) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(values, "values");
        y yVar = this.encodedParametersBuilder;
        String strM = a.m(name, false, 1, null);
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(values, 10));
        Iterator<String> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(a.n(it.next()));
        }
        yVar.d(strM, arrayList);
    }

    @Override // dl0.x
    public void e(dl0.w stringValues) {
        p013kotlin.jvm.internal.s.k(stringValues, "stringValues");
        m0.c(this.encodedParametersBuilder, stringValues);
    }

    @Override // dl0.x
    public void f(String name, String value) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(value, "value");
        this.encodedParametersBuilder.f(a.m(name, false, 1, null), a.n(value));
    }

    @Override // dl0.x
    public boolean isEmpty() {
        return this.encodedParametersBuilder.isEmpty();
    }

    @Override // dl0.x
    public Set<String> names() {
        Set<String> setNames = this.encodedParametersBuilder.names();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(setNames, 10));
        Iterator<T> it = setNames.iterator();
        while (it.hasNext()) {
            arrayList.add(a.k((String) it.next(), 0, 0, false, null, 15, null));
        }
        return p013kotlin.collections.v.r1(arrayList);
    }
}
