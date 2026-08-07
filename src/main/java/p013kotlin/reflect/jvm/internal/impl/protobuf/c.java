package p013kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* JADX INFO: loaded from: classes9.dex */
class c extends ByteString {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f88328g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f88329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteString f88330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ByteString f88331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f88332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f88333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f88334f;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Stack<ByteString> f88335a;

        private b() {
            this.f88335a = new Stack<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ByteString b(ByteString byteString, ByteString byteString2) {
            c(byteString);
            c(byteString2);
            ByteString byteStringPop = this.f88335a.pop();
            while (!this.f88335a.isEmpty()) {
                byteStringPop = new c(this.f88335a.pop(), byteStringPop);
            }
            return byteStringPop;
        }

        private void c(ByteString byteString) {
            if (byteString.e()) {
                e(byteString);
                return;
            }
            if (byteString instanceof c) {
                c cVar = (c) byteString;
                c(cVar.f88330b);
                c(cVar.f88331c);
            } else {
                String strValueOf = String.valueOf(byteString.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(strValueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        private int d(int i11) {
            int iBinarySearch = Arrays.binarySearch(c.f88328g, i11);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void e(ByteString byteString) {
            int iD = d(byteString.size());
            int i11 = c.f88328g[iD + 1];
            if (this.f88335a.isEmpty() || this.f88335a.peek().size() >= i11) {
                this.f88335a.push(byteString);
                return;
            }
            int i12 = c.f88328g[iD];
            ByteString byteStringPop = this.f88335a.pop();
            while (true) {
                if (this.f88335a.isEmpty() || this.f88335a.peek().size() >= i12) {
                    break;
                } else {
                    byteStringPop = new c(this.f88335a.pop(), byteStringPop);
                }
            }
            c cVar = new c(byteStringPop, byteString);
            while (!this.f88335a.isEmpty()) {
                if (this.f88335a.peek().size() >= c.f88328g[d(cVar.size()) + 1]) {
                    break;
                } else {
                    cVar = new c(this.f88335a.pop(), cVar);
                }
            }
            this.f88335a.push(cVar);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$c, reason: collision with other inner class name */
    private static class C1868c implements Iterator<p013kotlin.reflect.jvm.internal.impl.protobuf.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Stack<c> f88336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p013kotlin.reflect.jvm.internal.impl.protobuf.b f88337b;

        private p013kotlin.reflect.jvm.internal.impl.protobuf.b a(ByteString byteString) {
            while (byteString instanceof c) {
                c cVar = (c) byteString;
                this.f88336a.push(cVar);
                byteString = cVar.f88330b;
            }
            return (p013kotlin.reflect.jvm.internal.impl.protobuf.b) byteString;
        }

        private p013kotlin.reflect.jvm.internal.impl.protobuf.b b() {
            while (!this.f88336a.isEmpty()) {
                p013kotlin.reflect.jvm.internal.impl.protobuf.b bVarA = a(this.f88336a.pop().f88331c);
                if (!bVarA.isEmpty()) {
                    return bVarA;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public p013kotlin.reflect.jvm.internal.impl.protobuf.b next() {
            p013kotlin.reflect.jvm.internal.impl.protobuf.b bVar = this.f88337b;
            if (bVar == null) {
                throw new NoSuchElementException();
            }
            this.f88337b = b();
            return bVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f88337b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C1868c(ByteString byteString) {
            this.f88336a = new Stack<>();
            this.f88337b = a(byteString);
        }
    }

    private class d implements ByteString.ByteIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C1868c f88338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ByteString.ByteIterator f88339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f88340c;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f88340c > 0;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.reflect.jvm.internal.impl.protobuf.ByteString$ByteIterator] */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            if (!this.f88339b.hasNext()) {
                this.f88339b = this.f88338a.next().iterator();
            }
            this.f88340c--;
            return this.f88339b.nextByte();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.reflect.jvm.internal.impl.protobuf.ByteString$ByteIterator] */
        private d() {
            C1868c c1868c = new C1868c(c.this);
            this.f88338a = c1868c;
            this.f88339b = c1868c.next().iterator();
            this.f88340c = c.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        int i12 = 1;
        while (i11 > 0) {
            arrayList.add(Integer.valueOf(i11));
            int i13 = i12 + i11;
            i12 = i11;
            i11 = i13;
        }
        arrayList.add(Integer.MAX_VALUE);
        f88328g = new int[arrayList.size()];
        int i14 = 0;
        while (true) {
            int[] iArr = f88328g;
            if (i14 >= iArr.length) {
                return;
            }
            iArr[i14] = ((Integer) arrayList.get(i14)).intValue();
            i14++;
        }
    }

    static ByteString n(ByteString byteString, ByteString byteString2) {
        c cVar = byteString instanceof c ? (c) byteString : null;
        if (byteString2.size() == 0) {
            return byteString;
        }
        if (byteString.size() == 0) {
            return byteString2;
        }
        int size = byteString.size() + byteString2.size();
        if (size < 128) {
            return o(byteString, byteString2);
        }
        if (cVar != null && cVar.f88331c.size() + byteString2.size() < 128) {
            return new c(cVar.f88330b, o(cVar.f88331c, byteString2));
        }
        if (cVar == null || cVar.f88330b.d() <= cVar.f88331c.d() || cVar.d() <= byteString2.d()) {
            return size >= f88328g[Math.max(byteString.d(), byteString2.d()) + 1] ? new c(byteString, byteString2) : new b().b(byteString, byteString2);
        }
        return new c(cVar.f88330b, new c(cVar.f88331c, byteString2));
    }

    private static p013kotlin.reflect.jvm.internal.impl.protobuf.b o(ByteString byteString, ByteString byteString2) {
        int size = byteString.size();
        int size2 = byteString2.size();
        byte[] bArr = new byte[size + size2];
        byteString.copyTo(bArr, 0, 0, size);
        byteString2.copyTo(bArr, 0, size, size2);
        return new p013kotlin.reflect.jvm.internal.impl.protobuf.b(bArr);
    }

    private boolean p(ByteString byteString) {
        C1868c c1868c = new C1868c(this);
        p013kotlin.reflect.jvm.internal.impl.protobuf.b next = c1868c.next();
        C1868c c1868c2 = new C1868c(byteString);
        p013kotlin.reflect.jvm.internal.impl.protobuf.b next2 = c1868c2.next();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int size = next.size() - i11;
            int size2 = next2.size() - i12;
            int iMin = Math.min(size, size2);
            if (!(i11 == 0 ? next.l(next2, i12, iMin) : next2.l(next, i11, iMin))) {
                return false;
            }
            i13 += iMin;
            int i14 = this.f88329a;
            if (i13 >= i14) {
                if (i13 == i14) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                next = c1868c.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
            if (iMin == size2) {
                next2 = c1868c2.next();
                i12 = 0;
            } else {
                i12 += iMin;
            }
        }
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected void b(byte[] bArr, int i11, int i12, int i13) {
        int i14 = i11 + i13;
        int i15 = this.f88332d;
        if (i14 <= i15) {
            this.f88330b.b(bArr, i11, i12, i13);
        } else {
            if (i11 >= i15) {
                this.f88331c.b(bArr, i11 - i15, i12, i13);
                return;
            }
            int i16 = i15 - i11;
            this.f88330b.b(bArr, i11, i12, i16);
            this.f88331c.b(bArr, 0, i12 + i16, i13 - i16);
        }
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int d() {
        return this.f88333e;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected boolean e() {
        return this.f88329a >= f88328g[this.f88333e];
    }

    public boolean equals(Object obj) {
        int iH;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (this.f88329a != byteString.size()) {
            return false;
        }
        if (this.f88329a == 0) {
            return true;
        }
        if (this.f88334f == 0 || (iH = byteString.h()) == 0 || this.f88334f == iH) {
            return p(byteString);
        }
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int f(int i11, int i12, int i13) {
        int i14 = i12 + i13;
        int i15 = this.f88332d;
        if (i14 <= i15) {
            return this.f88330b.f(i11, i12, i13);
        }
        if (i12 >= i15) {
            return this.f88331c.f(i11, i12 - i15, i13);
        }
        int i16 = i15 - i12;
        return this.f88331c.f(this.f88330b.f(i11, i12, i16), 0, i13 - i16);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int g(int i11, int i12, int i13) {
        int i14 = i12 + i13;
        int i15 = this.f88332d;
        if (i14 <= i15) {
            return this.f88330b.g(i11, i12, i13);
        }
        if (i12 >= i15) {
            return this.f88331c.g(i11, i12 - i15, i13);
        }
        int i16 = i15 - i12;
        return this.f88331c.g(this.f88330b.g(i11, i12, i16), 0, i13 - i16);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int h() {
        return this.f88334f;
    }

    public int hashCode() {
        int iF = this.f88334f;
        if (iF == 0) {
            int i11 = this.f88329a;
            iF = f(i11, 0, i11);
            if (iF == 0) {
                iF = 1;
            }
            this.f88334f = iF;
        }
        return iF;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean isValidUtf8() {
        int iG = this.f88330b.g(0, 0, this.f88332d);
        ByteString byteString = this.f88331c;
        return byteString.g(iG, 0, byteString.size()) == 0;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    void j(OutputStream outputStream, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f88332d;
        if (i13 <= i14) {
            this.f88330b.j(outputStream, i11, i12);
        } else {
            if (i11 >= i14) {
                this.f88331c.j(outputStream, i11 - i14, i12);
                return;
            }
            int i15 = i14 - i11;
            this.f88330b.j(outputStream, i11, i15);
            this.f88331c.j(outputStream, 0, i12 - i15);
        }
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.newInstance(new e());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f88329a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public String toString(String str) {
        return new String(toByteArray(), str);
    }

    private c(ByteString byteString, ByteString byteString2) {
        this.f88334f = 0;
        this.f88330b = byteString;
        this.f88331c = byteString2;
        int size = byteString.size();
        this.f88332d = size;
        this.f88329a = size + byteString2.size();
        this.f88333e = Math.max(byteString.d(), byteString2.d()) + 1;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new d();
    }

    private class e extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C1868c f88342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private p013kotlin.reflect.jvm.internal.impl.protobuf.b f88343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f88344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f88345d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f88346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f88347f;

        public e() {
            n();
        }

        private void c() {
            if (this.f88343b != null) {
                int i11 = this.f88345d;
                int i12 = this.f88344c;
                if (i11 == i12) {
                    this.f88346e += i12;
                    this.f88345d = 0;
                    if (!this.f88342a.hasNext()) {
                        this.f88343b = null;
                        this.f88344c = 0;
                    } else {
                        p013kotlin.reflect.jvm.internal.impl.protobuf.b next = this.f88342a.next();
                        this.f88343b = next;
                        this.f88344c = next.size();
                    }
                }
            }
        }

        private void n() {
            C1868c c1868c = new C1868c(c.this);
            this.f88342a = c1868c;
            p013kotlin.reflect.jvm.internal.impl.protobuf.b next = c1868c.next();
            this.f88343b = next;
            this.f88344c = next.size();
            this.f88345d = 0;
            this.f88346e = 0;
        }

        private int o(byte[] bArr, int i11, int i12) {
            int i13 = i12;
            while (i13 > 0) {
                c();
                if (this.f88343b == null) {
                    if (i13 != i12) {
                        break;
                    }
                    return -1;
                }
                int iMin = Math.min(this.f88344c - this.f88345d, i13);
                if (bArr != null) {
                    this.f88343b.copyTo(bArr, this.f88345d, i11, iMin);
                    i11 += iMin;
                }
                this.f88345d += iMin;
                i13 -= iMin;
            }
            return i12 - i13;
        }

        @Override // java.io.InputStream
        public int available() {
            return c.this.size() - (this.f88346e + this.f88345d);
        }

        @Override // java.io.InputStream
        public void mark(int i11) {
            this.f88347f = this.f88346e + this.f88345d;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) {
            bArr.getClass();
            if (i11 < 0 || i12 < 0 || i12 > bArr.length - i11) {
                throw new IndexOutOfBoundsException();
            }
            return o(bArr, i11, i12);
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            n();
            o(null, 0, this.f88347f);
        }

        @Override // java.io.InputStream
        public long skip(long j11) {
            if (j11 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j11 > 2147483647L) {
                j11 = 2147483647L;
            }
            return o(null, 0, (int) j11);
        }

        @Override // java.io.InputStream
        public int read() {
            c();
            p013kotlin.reflect.jvm.internal.impl.protobuf.b bVar = this.f88343b;
            if (bVar == null) {
                return -1;
            }
            int i11 = this.f88345d;
            this.f88345d = i11 + 1;
            return bVar.k(i11) & 255;
        }
    }
}
