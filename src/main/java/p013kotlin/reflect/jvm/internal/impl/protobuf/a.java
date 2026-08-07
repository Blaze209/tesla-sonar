package p013kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
class a extends p013kotlin.reflect.jvm.internal.impl.protobuf.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f88318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f88319d;

    private class b implements ByteString.ByteIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f88320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f88321b;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f88320a < this.f88321b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            int i11 = this.f88320a;
            if (i11 >= this.f88321b) {
                throw new NoSuchElementException();
            }
            byte[] bArr = a.this.f88323a;
            this.f88320a = i11 + 1;
            return bArr[i11];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            int iM = a.this.m();
            this.f88320a = iM;
            this.f88321b = iM + a.this.size();
        }
    }

    a(byte[] bArr, int i11, int i12) {
        super(bArr);
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Offset too small: ");
            sb2.append(i11);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i12 < 0) {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i11);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (((long) i11) + ((long) i12) <= bArr.length) {
            this.f88318c = i11;
            this.f88319d = i12;
            return;
        }
        StringBuilder sb4 = new StringBuilder(48);
        sb4.append("Offset+Length too large: ");
        sb4.append(i11);
        sb4.append(Marker.ANY_NON_NULL_MARKER);
        sb4.append(i12);
        throw new IllegalArgumentException(sb4.toString());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.b, p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    protected void b(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(this.f88323a, m() + i11, bArr, i12, i13);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.b
    public byte k(int i11) {
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("Index too small: ");
            sb2.append(i11);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < size()) {
            return this.f88323a[this.f88318c + i11];
        }
        int size = size();
        StringBuilder sb3 = new StringBuilder(41);
        sb3.append("Index too large: ");
        sb3.append(i11);
        sb3.append(", ");
        sb3.append(size);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.b
    protected int m() {
        return this.f88318c;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.b, p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.f88319d;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.protobuf.b, p013kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new b();
    }
}
