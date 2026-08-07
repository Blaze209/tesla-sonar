package p013kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ByteString implements Iterable<Byte> {
    public static final ByteString EMPTY = new b(new byte[0]);

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    ByteString() {
    }

    private static ByteString a(Iterator<ByteString> it, int i11) {
        if (i11 == 1) {
            return it.next();
        }
        int i12 = i11 >>> 1;
        return a(it, i12).concat(a(it, i11 - i12));
    }

    public static ByteString copyFrom(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new b(bArr2);
    }

    public static ByteString copyFromUtf8(String str) {
        try {
            return new b(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
    }

    public static Output newOutput() {
        return new Output(128);
    }

    protected abstract void b(byte[] bArr, int i11, int i12, int i13);

    public ByteString concat(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return c.n(this, byteString);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append(Marker.ANY_NON_NULL_MARKER);
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public void copyTo(byte[] bArr, int i11, int i12, int i13) {
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i12 < 0) {
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Target offset < 0: ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i13 < 0) {
            StringBuilder sb4 = new StringBuilder(23);
            sb4.append("Length < 0: ");
            sb4.append(i13);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i14 = i11 + i13;
        if (i14 > size()) {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Source end offset < 0: ");
            sb5.append(i14);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        int i15 = i12 + i13;
        if (i15 <= bArr.length) {
            if (i13 > 0) {
                b(bArr, i11, i12, i13);
            }
        } else {
            StringBuilder sb6 = new StringBuilder(34);
            sb6.append("Target end offset < 0: ");
            sb6.append(i15);
            throw new IndexOutOfBoundsException(sb6.toString());
        }
    }

    protected abstract int d();

    protected abstract boolean e();

    protected abstract int f(int i11, int i12, int i13);

    protected abstract int g(int i11, int i12, int i13);

    protected abstract int h();

    void i(OutputStream outputStream, int i11, int i12) {
        if (i11 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Source offset < 0: ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i12 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i12);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i13 = i11 + i12;
        if (i13 <= size()) {
            if (i12 > 0) {
                j(outputStream, i11, i12);
            }
        } else {
            StringBuilder sb4 = new StringBuilder(39);
            sb4.append("Source end offset exceeded: ");
            sb4.append(i13);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    @Override // java.lang.Iterable
    public abstract Iterator<Byte> iterator();

    abstract void j(OutputStream outputStream, int i11, int i12);

    public abstract CodedInputStream newCodedInput();

    public abstract int size();

    public byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        b(bArr, 0, 0, size);
        return bArr;
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String toString(String str);

    public String toStringUtf8() {
        try {
            return toString("UTF-8");
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported?", e11);
        }
    }

    public static final class Output extends OutputStream {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f88244f = new byte[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f88245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<ByteString> f88246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f88247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f88248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f88249e;

        Output(int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f88245a = i11;
            this.f88246b = new ArrayList<>();
            this.f88248d = new byte[i11];
        }

        private byte[] c(byte[] bArr, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i11));
            return bArr2;
        }

        private void n(int i11) {
            this.f88246b.add(new b(this.f88248d));
            int length = this.f88247c + this.f88248d.length;
            this.f88247c = length;
            this.f88248d = new byte[Math.max(this.f88245a, Math.max(i11, length >>> 1))];
            this.f88249e = 0;
        }

        private void o() {
            int i11 = this.f88249e;
            byte[] bArr = this.f88248d;
            if (i11 >= bArr.length) {
                this.f88246b.add(new b(this.f88248d));
                this.f88248d = f88244f;
            } else if (i11 > 0) {
                this.f88246b.add(new b(c(bArr, i11)));
            }
            this.f88247c += this.f88249e;
            this.f88249e = 0;
        }

        public synchronized int size() {
            return this.f88247c + this.f88249e;
        }

        public synchronized ByteString toByteString() {
            o();
            return ByteString.copyFrom(this.f88246b);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i11) {
            try {
                if (this.f88249e == this.f88248d.length) {
                    n(1);
                }
                byte[] bArr = this.f88248d;
                int i12 = this.f88249e;
                this.f88249e = i12 + 1;
                bArr[i12] = (byte) i11;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i11, int i12) {
            try {
                byte[] bArr2 = this.f88248d;
                int length = bArr2.length;
                int i13 = this.f88249e;
                if (i12 <= length - i13) {
                    System.arraycopy(bArr, i11, bArr2, i13, i12);
                    this.f88249e += i12;
                } else {
                    int length2 = bArr2.length - i13;
                    System.arraycopy(bArr, i11, bArr2, i13, length2);
                    int i14 = i12 - length2;
                    n(i14);
                    System.arraycopy(bArr, i11 + length2, this.f88248d, 0, i14);
                    this.f88249e = i14;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        Collection arrayList;
        if (!(iterable instanceof Collection)) {
            arrayList = new ArrayList();
            Iterator<ByteString> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            arrayList = (Collection) iterable;
        }
        if (arrayList.isEmpty()) {
            return EMPTY;
        }
        return a(arrayList.iterator(), arrayList.size());
    }
}
