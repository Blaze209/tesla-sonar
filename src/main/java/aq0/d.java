package aq0;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements Serializable, Iterable<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f14924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f14925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient c f14926e;

    d(c cVar, String[] strArr, String str, long j11, long j12) {
        this.f14924c = j11;
        this.f14925d = strArr == null ? e.f14928b : strArr;
        this.f14926e = cVar;
        this.f14923b = str;
        this.f14922a = j12;
    }

    private Map<String, Integer> d() {
        c cVar = this.f14926e;
        if (cVar == null) {
            return null;
        }
        return cVar.B();
    }

    public String a(String str) {
        Map<String, Integer> mapD = d();
        if (mapD == null) {
            throw new IllegalStateException("No header mapping was specified, the record values can't be accessed by name");
        }
        Integer num = mapD.get(str);
        if (num == null) {
            throw new IllegalArgumentException(String.format("Mapping for %s not found, expected one of %s", str, mapD.keySet()));
        }
        try {
            return this.f14925d[num.intValue()];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException(String.format("Index for header '%s' is %d but CSVRecord only has %d values!", str, num, Integer.valueOf(this.f14925d.length)));
        }
    }

    public String b() {
        return this.f14923b;
    }

    public List<String> e() {
        return (List) stream().collect(Collectors.toList());
    }

    public String[] f() {
        return this.f14925d;
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return e().iterator();
    }

    public Stream<String> stream() {
        return Stream.of((Object[]) this.f14925d);
    }

    public String toString() {
        return "CSVRecord [comment='" + this.f14923b + "', recordNumber=" + this.f14924c + ", values=" + Arrays.toString(this.f14925d) + "]";
    }
}
