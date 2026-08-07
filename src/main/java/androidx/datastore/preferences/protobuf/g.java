package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f8057b = new j(y.f8240d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f8058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Comparator<g> f8059d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8060a = 0;

    class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8061a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f8062b;

        a() {
            this.f8062b = g.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8061a < this.f8062b;
        }

        @Override // androidx.datastore.preferences.protobuf.g.InterfaceC0163g
        public byte nextByte() {
            int i11 = this.f8061a;
            if (i11 >= this.f8062b) {
                throw new NoSuchElementException();
            }
            this.f8061a = i11 + 1;
            return g.this.j(i11);
        }
    }

    class b implements Comparator<g> {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            InterfaceC0163g it = gVar.iterator();
            InterfaceC0163g it2 = gVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int iCompareTo = Integer.valueOf(g.r(it.nextByte())).compareTo(Integer.valueOf(g.r(it2.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(gVar.size()).compareTo(Integer.valueOf(gVar2.size()));
        }
    }

    static abstract class c implements InterfaceC0163g {
        c() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class d implements f {
        private d() {
        }

        @Override // androidx.datastore.preferences.protobuf.g.f
        public byte[] copyFrom(byte[] bArr, int i11, int i12) {
            return Arrays.copyOfRange(bArr, i11, i12 + i11);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private static final class e extends j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f8064f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f8065g;

        e(byte[] bArr, int i11, int i12) {
            super(bArr);
            g.e(i11, i11 + i12, bArr.length);
            this.f8064f = i11;
            this.f8065g = i12;
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        public byte b(int i11) {
            g.d(i11, size());
            return this.f8068e[this.f8064f + i11];
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        protected void i(byte[] bArr, int i11, int i12, int i13) {
            System.arraycopy(this.f8068e, x() + i11, bArr, i12, i13);
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        byte j(int i11) {
            return this.f8068e[this.f8064f + i11];
        }

        @Override // androidx.datastore.preferences.protobuf.g.j, androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.f8065g;
        }

        @Override // androidx.datastore.preferences.protobuf.g.j
        protected int x() {
            return this.f8064f;
        }
    }

    private interface f {
        byte[] copyFrom(byte[] bArr, int i11, int i12);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    public interface InterfaceC0163g extends Iterator<Byte> {
        byte nextByte();
    }

    static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CodedOutputStream f8066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f8067b;

        /* synthetic */ h(int i11, a aVar) {
            this(i11);
        }

        public g a() {
            this.f8066a.c();
            return new j(this.f8067b);
        }

        public CodedOutputStream b() {
            return this.f8066a;
        }

        private h(int i11) {
            byte[] bArr = new byte[i11];
            this.f8067b = bArr;
            this.f8066a = CodedOutputStream.f0(bArr);
        }
    }

    static abstract class i extends g {
        /* synthetic */ i(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.g, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }

        private i() {
        }
    }

    private static class j extends i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final byte[] f8068e;

        j(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.f8068e = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public byte b(int i11) {
            return this.f8068e[i11];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof g) || size() != ((g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iO = o();
            int iO2 = jVar.o();
            if (iO == 0 || iO2 == 0 || iO == iO2) {
                return w(jVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        protected void i(byte[] bArr, int i11, int i12, int i13) {
            System.arraycopy(this.f8068e, i11, bArr, i12, i13);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        byte j(int i11) {
            return this.f8068e[i11];
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final androidx.datastore.preferences.protobuf.h m() {
            return androidx.datastore.preferences.protobuf.h.k(this.f8068e, x(), size(), true);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        protected final int n(int i11, int i12, int i13) {
            return y.h(i11, this.f8068e, x() + i12, i13);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public final g p(int i11, int i12) {
            int iE = g.e(i11, i12, size());
            return iE == 0 ? g.f8057b : new e(this.f8068e, x() + i11, iE);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int size() {
            return this.f8068e.length;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        final void v(androidx.datastore.preferences.protobuf.f fVar) {
            fVar.a(this.f8068e, x(), size());
        }

        final boolean w(g gVar, int i11, int i12) {
            if (i12 > gVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i12 + size());
            }
            int i13 = i11 + i12;
            if (i13 > gVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i11 + ", " + i12 + ", " + gVar.size());
            }
            if (!(gVar instanceof j)) {
                return gVar.p(i11, i13).equals(p(0, i12));
            }
            j jVar = (j) gVar;
            byte[] bArr = this.f8068e;
            byte[] bArr2 = jVar.f8068e;
            int iX = x() + i12;
            int iX2 = x();
            int iX3 = jVar.x() + i11;
            while (iX2 < iX) {
                if (bArr[iX2] != bArr2[iX3]) {
                    return false;
                }
                iX2++;
                iX3++;
            }
            return true;
        }

        protected int x() {
            return 0;
        }
    }

    private static final class k implements f {
        private k() {
        }

        @Override // androidx.datastore.preferences.protobuf.g.f
        public byte[] copyFrom(byte[] bArr, int i11, int i12) {
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            return bArr2;
        }

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f8058c = androidx.datastore.preferences.protobuf.d.c() ? new k(aVar) : new d(aVar);
        f8059d = new b();
    }

    g() {
    }

    static void d(int i11, int i12) {
        if (((i12 - (i11 + 1)) | i11) < 0) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i11);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i11 + ", " + i12);
        }
    }

    static int e(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i11 + " < 0");
        }
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i11 + ", " + i12);
        }
        throw new IndexOutOfBoundsException("End index: " + i12 + " >= " + i13);
    }

    public static g f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static g g(byte[] bArr, int i11, int i12) {
        e(i11, i11 + i12, bArr.length);
        return new j(f8058c.copyFrom(bArr, i11, i12));
    }

    public static g h(String str) {
        return new j(str.getBytes(y.f8238b));
    }

    static h l(int i11) {
        return new h(i11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int r(byte b11) {
        return b11 & 255;
    }

    private String s() {
        if (size() <= 50) {
            return j1.a(this);
        }
        return j1.a(p(0, 47)) + "...";
    }

    static g t(byte[] bArr) {
        return new j(bArr);
    }

    static g u(byte[] bArr, int i11, int i12) {
        return new e(bArr, i11, i12);
    }

    public abstract byte b(int i11);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iN = this.f8060a;
        if (iN == 0) {
            int size = size();
            iN = n(size, 0, size);
            if (iN == 0) {
                iN = 1;
            }
            this.f8060a = iN;
        }
        return iN;
    }

    protected abstract void i(byte[] bArr, int i11, int i12, int i13);

    abstract byte j(int i11);

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public InterfaceC0163g iterator() {
        return new a();
    }

    public abstract androidx.datastore.preferences.protobuf.h m();

    protected abstract int n(int i11, int i12, int i13);

    protected final int o() {
        return this.f8060a;
    }

    public abstract g p(int i11, int i12);

    public final byte[] q() {
        int size = size();
        if (size == 0) {
            return y.f8240d;
        }
        byte[] bArr = new byte[size];
        i(bArr, 0, 0, size);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), s());
    }

    abstract void v(androidx.datastore.preferences.protobuf.f fVar);
}
