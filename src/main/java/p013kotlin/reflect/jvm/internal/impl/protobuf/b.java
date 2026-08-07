package p013kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
class b extends ByteString {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final byte[] f88323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f88324b = 0;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.b$b, reason: collision with other inner class name */
    private class C1867b implements ByteString.ByteIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f88325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f88326b;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f88325a < this.f88326b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            try {
                byte[] bArr = b.this.f88323a;
                int i11 = this.f88325a;
                this.f88325a = i11 + 1;
                return bArr[i11];
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new NoSuchElementException(e11.getMessage());
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C1867b() {
            this.f88325a = 0;
            this.f88326b = b.this.size();
        }
    }

    b(byte[] bArr) {
        this.f88323a = bArr;
    }

    static int n(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = i12; i14 < i12 + i13; i14++) {
            i11 = (i11 * 31) + bArr[i14];
        }
        return i11;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected void b(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(this.f88323a, i11, bArr, i12, i13);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int d() {
        return 0;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected boolean e() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof b) {
            return l((b) obj, 0, size());
        }
        if (obj instanceof c) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
        sb2.append("Has a new type of ByteString been created? Found ");
        sb2.append(strValueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int f(int i11, int i12, int i13) {
        return n(i11, this.f88323a, m() + i12, i13);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int g(int i11, int i12, int i13) {
        int iM = m() + i12;
        return e.g(i11, this.f88323a, iM, i13 + iM);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected int h() {
        return this.f88324b;
    }

    public int hashCode() {
        int iF = this.f88324b;
        if (iF == 0) {
            int size = size();
            iF = f(size, 0, size);
            if (iF == 0) {
                iF = 1;
            }
            this.f88324b = iF;
        }
        return iF;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public boolean isValidUtf8() {
        int iM = m();
        return e.f(this.f88323a, iM, size() + iM);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    void j(OutputStream outputStream, int i11, int i12) throws IOException {
        outputStream.write(this.f88323a, m() + i11, i12);
    }

    public byte k(int i11) {
        return this.f88323a[i11];
    }

    boolean l(b bVar, int i11, int i12) {
        if (i12 > bVar.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i12);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 + i12 > bVar.size()) {
            int size2 = bVar.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(i12);
            sb3.append(", ");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f88323a;
        byte[] bArr2 = bVar.f88323a;
        int iM = m() + i12;
        int iM2 = m();
        int iM3 = bVar.m() + i11;
        while (iM2 < iM) {
            if (bArr[iM2] != bArr2[iM3]) {
                return false;
            }
            iM2++;
            iM3++;
        }
        return true;
    }

    protected int m() {
        return 0;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public CodedInputStream newCodedInput() {
        return CodedInputStream.b(this);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f88323a.length;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public String toString(String str) {
        return new String(this.f88323a, m(), size(), str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C1867b();
    }
}
