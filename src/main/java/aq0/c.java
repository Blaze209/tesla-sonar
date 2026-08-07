package aq0;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements Iterable<d>, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f14907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f14908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aq0.b f14909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0259c f14910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f14911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f14912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<String> f14913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f14914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f14915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j f14916j;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14917a;

        static {
            int[] iArr = new int[j.a.values().length];
            f14917a = iArr;
            try {
                iArr[j.a.TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14917a[j.a.EORECORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14917a[j.a.EOF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14917a[j.a.INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14917a[j.a.COMMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    class b implements Iterator<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f14918a;

        b() {
        }

        private d a() {
            try {
                return c.this.J();
            } catch (IOException e11) {
                throw new UncheckedIOException(e11.getClass().getSimpleName() + " reading next record: " + e11.toString(), e11);
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d next() {
            if (c.this.isClosed()) {
                throw new NoSuchElementException("CSVParser has been closed");
            }
            d dVar = this.f14918a;
            this.f14918a = null;
            if (dVar != null) {
                return dVar;
            }
            d dVarA = a();
            if (dVarA != null) {
                return dVarA;
            }
            throw new NoSuchElementException("No more CSV records available");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (c.this.isClosed()) {
                return false;
            }
            if (this.f14918a == null) {
                this.f14918a = a();
            }
            return this.f14918a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: aq0.c$c, reason: collision with other inner class name */
    private static final class C0259c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<String, Integer> f14920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List<String> f14921b;

        C0259c(Map<String, Integer> map, List<String> list) {
            this.f14920a = map;
            this.f14921b = list;
        }
    }

    public c(Reader reader, aq0.b bVar) {
        this(reader, bVar, 0L, 1L);
    }

    private String H(String str) {
        boolean z11 = this.f14916j.f14949d;
        String strK = this.f14909c.K();
        boolean zI = I();
        if (str.equals(strK)) {
            if (!zI || !z11) {
                return null;
            }
        } else if (zI && strK == null && str.isEmpty() && !z11) {
            return null;
        }
        return str;
    }

    private boolean I() {
        return this.f14909c.M() == i.ALL_NON_NULL || this.f14909c.M() == i.NON_NUMERIC;
    }

    private void n(boolean z11) {
        String strY = this.f14909c.Y(this.f14916j.f14947b.toString());
        if (z11 && strY.isEmpty() && this.f14909c.O()) {
            return;
        }
        this.f14913g.add(H(strY));
    }

    private Map<String, Integer> o() {
        return this.f14909c.I() ? new TreeMap(String.CASE_INSENSITIVE_ORDER) : new LinkedHashMap();
    }

    private C0259c p() throws IOException {
        Map<String, Integer> mapO;
        d dVarJ;
        String[] strArrG = this.f14909c.G();
        ArrayList arrayList = null;
        if (strArrG != null) {
            mapO = o();
            if (strArrG.length == 0) {
                d dVarJ2 = J();
                if (dVarJ2 != null) {
                    String[] strArrF = dVarJ2.f();
                    this.f14907a = dVarJ2.b();
                    strArrG = strArrF;
                } else {
                    strArrG = null;
                }
            } else if (this.f14909c.N() && (dVarJ = J()) != null) {
                this.f14907a = dVarJ.b();
            }
            if (strArrG != null) {
                boolean z11 = false;
                for (int i11 = 0; i11 < strArrG.length; i11++) {
                    String str = strArrG[i11];
                    boolean zQ = aq0.b.Q(str);
                    if (zQ && !this.f14909c.B()) {
                        throw new IllegalArgumentException("A header name is missing in " + Arrays.toString(strArrG));
                    }
                    boolean zContainsKey = zQ ? z11 : mapO.containsKey(str);
                    f fVarE = this.f14909c.E();
                    boolean z12 = fVarE == f.ALLOW_ALL;
                    boolean z13 = fVarE == f.ALLOW_EMPTY;
                    if (zContainsKey && !z12 && (!zQ || !z13)) {
                        throw new IllegalArgumentException(String.format("The header contains a duplicate name: \"%s\" in %s. If this is valid then use CSVFormat.Builder.setDuplicateHeaderMode().", str, Arrays.toString(strArrG)));
                    }
                    z11 |= zQ;
                    if (str != null) {
                        mapO.put(str, Integer.valueOf(i11));
                        if (arrayList == null) {
                            arrayList = new ArrayList(strArrG.length);
                        }
                        arrayList.add(str);
                    }
                }
            }
        } else {
            mapO = null;
        }
        return new C0259c(mapO, arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList));
    }

    Map<String, Integer> B() {
        return this.f14910d.f14920a;
    }

    public List<String> C() {
        return Collections.unmodifiableList(this.f14910d.f14921b);
    }

    d J() throws IOException {
        this.f14913g.clear();
        long jC = this.f14911e.c() + this.f14915i;
        StringBuilder sb2 = null;
        do {
            this.f14916j.a();
            this.f14911e.b0(this.f14916j);
            int i11 = a.f14917a[this.f14916j.f14946a.ordinal()];
            if (i11 == 1) {
                n(false);
            } else if (i11 == 2) {
                n(true);
            } else if (i11 != 3) {
                if (i11 == 4) {
                    throw new IOException("(line " + t() + ") invalid parse sequence");
                }
                if (i11 != 5) {
                    throw new IllegalStateException("Unexpected Token type: " + this.f14916j.f14946a);
                }
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                } else {
                    sb2.append('\n');
                }
                sb2.append((CharSequence) this.f14916j.f14947b);
                this.f14916j.f14946a = j.a.TOKEN;
            } else if (this.f14916j.f14948c) {
                n(true);
            } else if (sb2 != null) {
                this.f14908b = sb2.toString();
            }
        } while (this.f14916j.f14946a == j.a.TOKEN);
        if (this.f14913g.isEmpty()) {
            return null;
        }
        this.f14914h++;
        return new d(this, (String[]) this.f14913g.toArray(e.f14928b), sb2 != null ? sb2.toString() : null, this.f14914h, jC);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        h hVar = this.f14911e;
        if (hVar != null) {
            hVar.close();
        }
    }

    public boolean isClosed() {
        return this.f14911e.isClosed();
    }

    @Override // java.lang.Iterable
    public Iterator<d> iterator() {
        return this.f14912f;
    }

    public long t() {
        return this.f14911e.n();
    }

    public c(Reader reader, aq0.b bVar, long j11, long j12) {
        this.f14913g = new ArrayList();
        this.f14916j = new j();
        Objects.requireNonNull(reader, "reader");
        Objects.requireNonNull(bVar, "format");
        this.f14909c = bVar.A();
        this.f14911e = new h(bVar, new g(reader));
        this.f14912f = new b();
        this.f14910d = p();
        this.f14915i = j11;
        this.f14914h = j12 - 1;
    }
}
