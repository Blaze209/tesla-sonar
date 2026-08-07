package androidx.datastore.preferences.protobuf;

import com.google.android.gms.nearby.uwb.RangingPosition;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class CodedOutputStream extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f8016c = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f8017d = n1.B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    j f8018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8019b;

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        OutOfSpaceException(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    private static abstract class b extends CodedOutputStream {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final byte[] f8020e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f8021f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f8022g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f8023h;

        b(int i11) {
            super();
            if (i11 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i11, 20)];
            this.f8020e = bArr;
            this.f8021f = bArr.length;
        }

        final void a1(byte b11) {
            byte[] bArr = this.f8020e;
            int i11 = this.f8022g;
            this.f8022g = i11 + 1;
            bArr[i11] = b11;
            this.f8023h++;
        }

        final void b1(int i11) {
            byte[] bArr = this.f8020e;
            int i12 = this.f8022g;
            int i13 = i12 + 1;
            this.f8022g = i13;
            bArr[i12] = (byte) (i11 & 255);
            int i14 = i12 + 2;
            this.f8022g = i14;
            bArr[i13] = (byte) ((i11 >> 8) & 255);
            int i15 = i12 + 3;
            this.f8022g = i15;
            bArr[i14] = (byte) ((i11 >> 16) & 255);
            this.f8022g = i12 + 4;
            bArr[i15] = (byte) ((i11 >> 24) & 255);
            this.f8023h += 4;
        }

        final void c1(long j11) {
            byte[] bArr = this.f8020e;
            int i11 = this.f8022g;
            int i12 = i11 + 1;
            this.f8022g = i12;
            bArr[i11] = (byte) (j11 & 255);
            int i13 = i11 + 2;
            this.f8022g = i13;
            bArr[i12] = (byte) ((j11 >> 8) & 255);
            int i14 = i11 + 3;
            this.f8022g = i14;
            bArr[i13] = (byte) ((j11 >> 16) & 255);
            int i15 = i11 + 4;
            this.f8022g = i15;
            bArr[i14] = (byte) (255 & (j11 >> 24));
            int i16 = i11 + 5;
            this.f8022g = i16;
            bArr[i15] = (byte) (((int) (j11 >> 32)) & 255);
            int i17 = i11 + 6;
            this.f8022g = i17;
            bArr[i16] = (byte) (((int) (j11 >> 40)) & 255);
            int i18 = i11 + 7;
            this.f8022g = i18;
            bArr[i17] = (byte) (((int) (j11 >> 48)) & 255);
            this.f8022g = i11 + 8;
            bArr[i18] = (byte) (((int) (j11 >> 56)) & 255);
            this.f8023h += 8;
        }

        final void d1(int i11) {
            if (i11 >= 0) {
                f1(i11);
            } else {
                g1(i11);
            }
        }

        final void e1(int i11, int i12) {
            f1(p1.c(i11, i12));
        }

        final void f1(int i11) {
            if (!CodedOutputStream.f8017d) {
                while ((i11 & RangingPosition.RSSI_UNKNOWN) != 0) {
                    byte[] bArr = this.f8020e;
                    int i12 = this.f8022g;
                    this.f8022g = i12 + 1;
                    bArr[i12] = (byte) ((i11 | 128) & 255);
                    this.f8023h++;
                    i11 >>>= 7;
                }
                byte[] bArr2 = this.f8020e;
                int i13 = this.f8022g;
                this.f8022g = i13 + 1;
                bArr2[i13] = (byte) i11;
                this.f8023h++;
                return;
            }
            long j11 = this.f8022g;
            while ((i11 & RangingPosition.RSSI_UNKNOWN) != 0) {
                byte[] bArr3 = this.f8020e;
                int i14 = this.f8022g;
                this.f8022g = i14 + 1;
                n1.H(bArr3, i14, (byte) ((i11 | 128) & 255));
                i11 >>>= 7;
            }
            byte[] bArr4 = this.f8020e;
            int i15 = this.f8022g;
            this.f8022g = i15 + 1;
            n1.H(bArr4, i15, (byte) i11);
            this.f8023h += (int) (((long) this.f8022g) - j11);
        }

        final void g1(long j11) {
            if (!CodedOutputStream.f8017d) {
                while ((j11 & (-128)) != 0) {
                    byte[] bArr = this.f8020e;
                    int i11 = this.f8022g;
                    this.f8022g = i11 + 1;
                    bArr[i11] = (byte) ((((int) j11) | 128) & 255);
                    this.f8023h++;
                    j11 >>>= 7;
                }
                byte[] bArr2 = this.f8020e;
                int i12 = this.f8022g;
                this.f8022g = i12 + 1;
                bArr2[i12] = (byte) j11;
                this.f8023h++;
                return;
            }
            long j12 = this.f8022g;
            while ((j11 & (-128)) != 0) {
                byte[] bArr3 = this.f8020e;
                int i13 = this.f8022g;
                this.f8022g = i13 + 1;
                n1.H(bArr3, i13, (byte) ((((int) j11) | 128) & 255));
                j11 >>>= 7;
            }
            byte[] bArr4 = this.f8020e;
            int i14 = this.f8022g;
            this.f8022g = i14 + 1;
            n1.H(bArr4, i14, (byte) j11);
            this.f8023h += (int) (((long) this.f8022g) - j12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int h0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static class c extends CodedOutputStream {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f8024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f8025f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f8026g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f8027h;

        c(byte[] bArr, int i11, int i12) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i13 = i11 + i12;
            if ((i11 | i12 | (bArr.length - i13)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            this.f8024e = bArr;
            this.f8025f = i11;
            this.f8027h = i11;
            this.f8026g = i13;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D0(int i11, int i12) throws OutOfSpaceException {
            V0(i11, 0);
            E0(i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E0(int i11) throws OutOfSpaceException {
            if (i11 >= 0) {
                X0(i11);
            } else {
                Z0(i11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        final void H0(int i11, p0 p0Var, e1 e1Var) throws OutOfSpaceException {
            V0(i11, 2);
            X0(((androidx.datastore.preferences.protobuf.a) p0Var).d(e1Var));
            e1Var.a(p0Var, this.f8018a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void I0(p0 p0Var) throws OutOfSpaceException {
            X0(p0Var.getSerializedSize());
            p0Var.a(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void J0(int i11, p0 p0Var) throws OutOfSpaceException {
            V0(1, 3);
            W0(2, i11);
            b1(3, p0Var);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void K0(int i11, g gVar) throws OutOfSpaceException {
            V0(1, 3);
            W0(2, i11);
            n0(3, gVar);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void T0(int i11, String str) throws OutOfSpaceException {
            V0(i11, 2);
            U0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void U0(String str) throws OutOfSpaceException {
            int i11 = this.f8027h;
            try {
                int iW = CodedOutputStream.W(str.length() * 3);
                int iW2 = CodedOutputStream.W(str.length());
                if (iW2 != iW) {
                    X0(o1.c(str));
                    this.f8027h = o1.b(str, this.f8024e, this.f8027h, h0());
                    return;
                }
                int i12 = i11 + iW2;
                this.f8027h = i12;
                int iB = o1.b(str, this.f8024e, i12, h0());
                this.f8027h = i11;
                X0((iB - i11) - iW2);
                this.f8027h = iB;
            } catch (o1.d e11) {
                this.f8027h = i11;
                c0(str, e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void V0(int i11, int i12) throws OutOfSpaceException {
            X0(p1.c(i11, i12));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void W0(int i11, int i12) throws OutOfSpaceException {
            V0(i11, 0);
            X0(i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void X0(int i11) throws OutOfSpaceException {
            while ((i11 & RangingPosition.RSSI_UNKNOWN) != 0) {
                try {
                    byte[] bArr = this.f8024e;
                    int i12 = this.f8027h;
                    this.f8027h = i12 + 1;
                    bArr[i12] = (byte) ((i11 | 128) & 255);
                    i11 >>>= 7;
                } catch (IndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8027h), Integer.valueOf(this.f8026g), 1), e11);
                }
            }
            byte[] bArr2 = this.f8024e;
            int i13 = this.f8027h;
            this.f8027h = i13 + 1;
            bArr2[i13] = (byte) i11;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Y0(int i11, long j11) throws OutOfSpaceException {
            V0(i11, 0);
            Z0(j11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void Z0(long j11) throws OutOfSpaceException {
            if (CodedOutputStream.f8017d && h0() >= 10) {
                while ((j11 & (-128)) != 0) {
                    byte[] bArr = this.f8024e;
                    int i11 = this.f8027h;
                    this.f8027h = i11 + 1;
                    n1.H(bArr, i11, (byte) ((((int) j11) | 128) & 255));
                    j11 >>>= 7;
                }
                byte[] bArr2 = this.f8024e;
                int i12 = this.f8027h;
                this.f8027h = i12 + 1;
                n1.H(bArr2, i12, (byte) j11);
                return;
            }
            while ((j11 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f8024e;
                    int i13 = this.f8027h;
                    this.f8027h = i13 + 1;
                    bArr3[i13] = (byte) ((((int) j11) | 128) & 255);
                    j11 >>>= 7;
                } catch (IndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8027h), Integer.valueOf(this.f8026g), 1), e11);
                }
            }
            byte[] bArr4 = this.f8024e;
            int i14 = this.f8027h;
            this.f8027h = i14 + 1;
            bArr4[i14] = (byte) j11;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.f
        public final void a(byte[] bArr, int i11, int i12) throws OutOfSpaceException {
            a1(bArr, i11, i12);
        }

        public final void a1(byte[] bArr, int i11, int i12) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i11, this.f8024e, this.f8027h, i12);
                this.f8027h += i12;
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8027h), Integer.valueOf(this.f8026g), Integer.valueOf(i12)), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void b0() {
        }

        public final void b1(int i11, p0 p0Var) throws OutOfSpaceException {
            V0(i11, 2);
            I0(p0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final int h0() {
            return this.f8026g - this.f8027h;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void i0(byte b11) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f8024e;
                int i11 = this.f8027h;
                this.f8027h = i11 + 1;
                bArr[i11] = b11;
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8027h), Integer.valueOf(this.f8026g), 1), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void j0(int i11, boolean z11) throws OutOfSpaceException {
            V0(i11, 0);
            i0(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void m0(byte[] bArr, int i11, int i12) throws OutOfSpaceException {
            X0(i12);
            a1(bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void n0(int i11, g gVar) throws OutOfSpaceException {
            V0(i11, 2);
            o0(gVar);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void o0(g gVar) throws OutOfSpaceException {
            X0(gVar.size());
            gVar.v(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void t0(int i11, int i12) throws OutOfSpaceException {
            V0(i11, 5);
            u0(i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u0(int i11) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f8024e;
                int i12 = this.f8027h;
                int i13 = i12 + 1;
                this.f8027h = i13;
                bArr[i12] = (byte) (i11 & 255);
                int i14 = i12 + 2;
                this.f8027h = i14;
                bArr[i13] = (byte) ((i11 >> 8) & 255);
                int i15 = i12 + 3;
                this.f8027h = i15;
                bArr[i14] = (byte) ((i11 >> 16) & 255);
                this.f8027h = i12 + 4;
                bArr[i15] = (byte) ((i11 >> 24) & 255);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8027h), Integer.valueOf(this.f8026g), 1), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v0(int i11, long j11) throws OutOfSpaceException {
            V0(i11, 1);
            w0(j11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w0(long j11) throws OutOfSpaceException {
            try {
                byte[] bArr = this.f8024e;
                int i11 = this.f8027h;
                int i12 = i11 + 1;
                this.f8027h = i12;
                bArr[i11] = (byte) (((int) j11) & 255);
                int i13 = i11 + 2;
                this.f8027h = i13;
                bArr[i12] = (byte) (((int) (j11 >> 8)) & 255);
                int i14 = i11 + 3;
                this.f8027h = i14;
                bArr[i13] = (byte) (((int) (j11 >> 16)) & 255);
                int i15 = i11 + 4;
                this.f8027h = i15;
                bArr[i14] = (byte) (((int) (j11 >> 24)) & 255);
                int i16 = i11 + 5;
                this.f8027h = i16;
                bArr[i15] = (byte) (((int) (j11 >> 32)) & 255);
                int i17 = i11 + 6;
                this.f8027h = i17;
                bArr[i16] = (byte) (((int) (j11 >> 40)) & 255);
                int i18 = i11 + 7;
                this.f8027h = i18;
                bArr[i17] = (byte) (((int) (j11 >> 48)) & 255);
                this.f8027h = i11 + 8;
                bArr[i18] = (byte) (((int) (j11 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8027h), Integer.valueOf(this.f8026g), 1), e11);
            }
        }
    }

    private static final class d extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final OutputStream f8028i;

        d(OutputStream outputStream, int i11) {
            super(i11);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f8028i = outputStream;
        }

        private void h1() throws IOException {
            this.f8028i.write(this.f8020e, 0, this.f8022g);
            this.f8022g = 0;
        }

        private void i1(int i11) throws IOException {
            if (this.f8021f - this.f8022g < i11) {
                h1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void D0(int i11, int i12) throws IOException {
            i1(20);
            e1(i11, 0);
            d1(i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void E0(int i11) throws IOException {
            if (i11 >= 0) {
                X0(i11);
            } else {
                Z0(i11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        void H0(int i11, p0 p0Var, e1 e1Var) throws IOException {
            V0(i11, 2);
            l1(p0Var, e1Var);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void I0(p0 p0Var) throws IOException {
            X0(p0Var.getSerializedSize());
            p0Var.a(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void J0(int i11, p0 p0Var) throws IOException {
            V0(1, 3);
            W0(2, i11);
            k1(3, p0Var);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void K0(int i11, g gVar) throws IOException {
            V0(1, 3);
            W0(2, i11);
            n0(3, gVar);
            V0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void T0(int i11, String str) throws IOException {
            V0(i11, 2);
            U0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void U0(String str) throws IOException {
            int iC;
            try {
                int length = str.length() * 3;
                int iW = CodedOutputStream.W(length);
                int i11 = iW + length;
                int i12 = this.f8021f;
                if (i11 > i12) {
                    byte[] bArr = new byte[length];
                    int iB = o1.b(str, bArr, 0, length);
                    X0(iB);
                    a(bArr, 0, iB);
                    return;
                }
                if (i11 > i12 - this.f8022g) {
                    h1();
                }
                int iW2 = CodedOutputStream.W(str.length());
                int i13 = this.f8022g;
                try {
                    if (iW2 == iW) {
                        int i14 = i13 + iW2;
                        this.f8022g = i14;
                        int iB2 = o1.b(str, this.f8020e, i14, this.f8021f - i14);
                        this.f8022g = i13;
                        iC = (iB2 - i13) - iW2;
                        f1(iC);
                        this.f8022g = iB2;
                    } else {
                        iC = o1.c(str);
                        f1(iC);
                        this.f8022g = o1.b(str, this.f8020e, this.f8022g, iC);
                    }
                    this.f8023h += iC;
                } catch (o1.d e11) {
                    this.f8023h -= this.f8022g - i13;
                    this.f8022g = i13;
                    throw e11;
                } catch (ArrayIndexOutOfBoundsException e12) {
                    throw new OutOfSpaceException(e12);
                }
            } catch (o1.d e13) {
                c0(str, e13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void V0(int i11, int i12) throws IOException {
            X0(p1.c(i11, i12));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void W0(int i11, int i12) throws IOException {
            i1(20);
            e1(i11, 0);
            f1(i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void X0(int i11) throws IOException {
            i1(5);
            f1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Y0(int i11, long j11) throws IOException {
            i1(20);
            e1(i11, 0);
            g1(j11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void Z0(long j11) throws IOException {
            i1(10);
            g1(j11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream, androidx.datastore.preferences.protobuf.f
        public void a(byte[] bArr, int i11, int i12) throws IOException {
            j1(bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void b0() throws IOException {
            if (this.f8022g > 0) {
                h1();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void i0(byte b11) throws IOException {
            if (this.f8022g == this.f8021f) {
                h1();
            }
            a1(b11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void j0(int i11, boolean z11) throws IOException {
            i1(11);
            e1(i11, 0);
            a1(z11 ? (byte) 1 : (byte) 0);
        }

        public void j1(byte[] bArr, int i11, int i12) throws IOException {
            int i13 = this.f8021f;
            int i14 = this.f8022g;
            if (i13 - i14 >= i12) {
                System.arraycopy(bArr, i11, this.f8020e, i14, i12);
                this.f8022g += i12;
                this.f8023h += i12;
                return;
            }
            int i15 = i13 - i14;
            System.arraycopy(bArr, i11, this.f8020e, i14, i15);
            int i16 = i11 + i15;
            int i17 = i12 - i15;
            this.f8022g = this.f8021f;
            this.f8023h += i15;
            h1();
            if (i17 <= this.f8021f) {
                System.arraycopy(bArr, i16, this.f8020e, 0, i17);
                this.f8022g = i17;
            } else {
                this.f8028i.write(bArr, i16, i17);
            }
            this.f8023h += i17;
        }

        public void k1(int i11, p0 p0Var) throws IOException {
            V0(i11, 2);
            I0(p0Var);
        }

        void l1(p0 p0Var, e1 e1Var) throws IOException {
            X0(((androidx.datastore.preferences.protobuf.a) p0Var).d(e1Var));
            e1Var.a(p0Var, this.f8018a);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void m0(byte[] bArr, int i11, int i12) throws IOException {
            X0(i12);
            j1(bArr, i11, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void n0(int i11, g gVar) throws IOException {
            V0(i11, 2);
            o0(gVar);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void o0(g gVar) throws IOException {
            X0(gVar.size());
            gVar.v(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void t0(int i11, int i12) throws IOException {
            i1(14);
            e1(i11, 5);
            b1(i12);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void u0(int i11) throws IOException {
            i1(4);
            b1(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void v0(int i11, long j11) throws IOException {
            i1(18);
            e1(i11, 1);
            c1(j11);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public void w0(long j11) throws IOException {
            i1(8);
            c1(j11);
        }
    }

    public static int A(int i11, b0 b0Var) {
        return U(i11) + B(b0Var);
    }

    public static int B(b0 b0Var) {
        return C(b0Var.b());
    }

    static int C(int i11) {
        return W(i11) + i11;
    }

    public static int D(int i11, p0 p0Var) {
        return (U(1) * 2) + V(2, i11) + E(3, p0Var);
    }

    public static int E(int i11, p0 p0Var) {
        return U(i11) + G(p0Var);
    }

    static int F(int i11, p0 p0Var, e1 e1Var) {
        return U(i11) + H(p0Var, e1Var);
    }

    public static int G(p0 p0Var) {
        return C(p0Var.getSerializedSize());
    }

    static int H(p0 p0Var, e1 e1Var) {
        return C(((androidx.datastore.preferences.protobuf.a) p0Var).d(e1Var));
    }

    static int I(int i11) {
        if (i11 > 4096) {
            return 4096;
        }
        return i11;
    }

    public static int J(int i11, g gVar) {
        return (U(1) * 2) + V(2, i11) + g(3, gVar);
    }

    public static int K(int i11, int i12) {
        return U(i11) + L(i12);
    }

    public static int L(int i11) {
        return 4;
    }

    public static int M(int i11, long j11) {
        return U(i11) + N(j11);
    }

    public static int N(long j11) {
        return 8;
    }

    public static int O(int i11, int i12) {
        return U(i11) + P(i12);
    }

    public static int P(int i11) {
        return W(Z(i11));
    }

    public static int Q(int i11, long j11) {
        return U(i11) + R(j11);
    }

    public static int R(long j11) {
        return Y(a0(j11));
    }

    public static int S(int i11, String str) {
        return U(i11) + T(str);
    }

    public static int T(String str) {
        int length;
        try {
            length = o1.c(str);
        } catch (o1.d unused) {
            length = str.getBytes(y.f8238b).length;
        }
        return C(length);
    }

    public static int U(int i11) {
        return W(p1.c(i11, 0));
    }

    public static int V(int i11, int i12) {
        return U(i11) + W(i12);
    }

    public static int W(int i11) {
        return (352 - (Integer.numberOfLeadingZeros(i11) * 9)) >>> 6;
    }

    public static int X(int i11, long j11) {
        return U(i11) + Y(j11);
    }

    public static int Y(long j11) {
        return (640 - (Long.numberOfLeadingZeros(j11) * 9)) >>> 6;
    }

    public static int Z(int i11) {
        return (i11 >> 31) ^ (i11 << 1);
    }

    public static long a0(long j11) {
        return (j11 >> 63) ^ (j11 << 1);
    }

    public static int d(int i11, boolean z11) {
        return U(i11) + e(z11);
    }

    public static int e(boolean z11) {
        return 1;
    }

    public static CodedOutputStream e0(OutputStream outputStream, int i11) {
        return new d(outputStream, i11);
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static CodedOutputStream f0(byte[] bArr) {
        return g0(bArr, 0, bArr.length);
    }

    public static int g(int i11, g gVar) {
        return U(i11) + h(gVar);
    }

    public static CodedOutputStream g0(byte[] bArr, int i11, int i12) {
        return new c(bArr, i11, i12);
    }

    public static int h(g gVar) {
        return C(gVar.size());
    }

    public static int i(int i11, double d11) {
        return U(i11) + j(d11);
    }

    public static int j(double d11) {
        return 8;
    }

    public static int k(int i11, int i12) {
        return U(i11) + l(i12);
    }

    public static int l(int i11) {
        return w(i11);
    }

    public static int m(int i11, int i12) {
        return U(i11) + n(i12);
    }

    public static int n(int i11) {
        return 4;
    }

    public static int o(int i11, long j11) {
        return U(i11) + p(j11);
    }

    public static int p(long j11) {
        return 8;
    }

    public static int q(int i11, float f11) {
        return U(i11) + r(f11);
    }

    public static int r(float f11) {
        return 4;
    }

    @Deprecated
    static int s(int i11, p0 p0Var, e1 e1Var) {
        return (U(i11) * 2) + u(p0Var, e1Var);
    }

    @Deprecated
    public static int t(p0 p0Var) {
        return p0Var.getSerializedSize();
    }

    @Deprecated
    static int u(p0 p0Var, e1 e1Var) {
        return ((androidx.datastore.preferences.protobuf.a) p0Var).d(e1Var);
    }

    public static int v(int i11, int i12) {
        return U(i11) + w(i12);
    }

    public static int w(int i11) {
        return Y(i11);
    }

    public static int x(int i11, long j11) {
        return U(i11) + y(j11);
    }

    public static int y(long j11) {
        return Y(j11);
    }

    public static int z(int i11, b0 b0Var) {
        return (U(1) * 2) + V(2, i11) + A(3, b0Var);
    }

    @Deprecated
    final void A0(int i11, p0 p0Var, e1 e1Var) {
        V0(i11, 3);
        C0(p0Var, e1Var);
        V0(i11, 4);
    }

    @Deprecated
    public final void B0(p0 p0Var) {
        p0Var.a(this);
    }

    @Deprecated
    final void C0(p0 p0Var, e1 e1Var) {
        e1Var.a(p0Var, this.f8018a);
    }

    public abstract void D0(int i11, int i12);

    public abstract void E0(int i11);

    public final void F0(int i11, long j11) {
        Y0(i11, j11);
    }

    public final void G0(long j11) {
        Z0(j11);
    }

    abstract void H0(int i11, p0 p0Var, e1 e1Var);

    public abstract void I0(p0 p0Var);

    public abstract void J0(int i11, p0 p0Var);

    public abstract void K0(int i11, g gVar);

    public final void L0(int i11, int i12) {
        t0(i11, i12);
    }

    public final void M0(int i11) {
        u0(i11);
    }

    public final void N0(int i11, long j11) {
        v0(i11, j11);
    }

    public final void O0(long j11) {
        w0(j11);
    }

    public final void P0(int i11, int i12) {
        W0(i11, Z(i12));
    }

    public final void Q0(int i11) {
        X0(Z(i11));
    }

    public final void R0(int i11, long j11) {
        Y0(i11, a0(j11));
    }

    public final void S0(long j11) {
        Z0(a0(j11));
    }

    public abstract void T0(int i11, String str);

    public abstract void U0(String str);

    public abstract void V0(int i11, int i12);

    public abstract void W0(int i11, int i12);

    public abstract void X0(int i11);

    public abstract void Y0(int i11, long j11);

    public abstract void Z0(long j11);

    @Override // androidx.datastore.preferences.protobuf.f
    public abstract void a(byte[] bArr, int i11, int i12);

    public abstract void b0();

    public final void c() {
        if (h0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void c0(String str, o1.d dVar) throws OutOfSpaceException {
        f8016c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(y.f8238b);
        try {
            X0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e11) {
            throw new OutOfSpaceException(e11);
        }
    }

    boolean d0() {
        return this.f8019b;
    }

    public abstract int h0();

    public abstract void i0(byte b11);

    public abstract void j0(int i11, boolean z11);

    public final void k0(boolean z11) {
        i0(z11 ? (byte) 1 : (byte) 0);
    }

    public final void l0(byte[] bArr) {
        m0(bArr, 0, bArr.length);
    }

    abstract void m0(byte[] bArr, int i11, int i12);

    public abstract void n0(int i11, g gVar);

    public abstract void o0(g gVar);

    public final void p0(int i11, double d11) {
        v0(i11, Double.doubleToRawLongBits(d11));
    }

    public final void q0(double d11) {
        w0(Double.doubleToRawLongBits(d11));
    }

    public final void r0(int i11, int i12) {
        D0(i11, i12);
    }

    public final void s0(int i11) {
        E0(i11);
    }

    public abstract void t0(int i11, int i12);

    public abstract void u0(int i11);

    public abstract void v0(int i11, long j11);

    public abstract void w0(long j11);

    public final void x0(int i11, float f11) {
        t0(i11, Float.floatToRawIntBits(f11));
    }

    public final void y0(float f11) {
        u0(Float.floatToRawIntBits(f11));
    }

    @Deprecated
    public final void z0(int i11, p0 p0Var) {
        V0(i11, 3);
        B0(p0Var);
        V0(i11, 4);
    }

    private CodedOutputStream() {
    }
}
