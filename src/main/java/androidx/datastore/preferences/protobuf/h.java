package androidx.datastore.preferences.protobuf;

import com.google.android.gms.nearby.uwb.RangingPosition;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile int f8075f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f8076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f8078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    i f8079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8080e;

    private static final class b extends h {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f8081g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f8082h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f8083i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f8084j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f8085k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f8086l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f8087m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f8088n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f8089o;

        private void O() {
            int i11 = this.f8083i + this.f8084j;
            this.f8083i = i11;
            int i12 = i11 - this.f8086l;
            int i13 = this.f8089o;
            if (i12 <= i13) {
                this.f8084j = 0;
                return;
            }
            int i14 = i12 - i13;
            this.f8084j = i14;
            this.f8083i = i11 - i14;
        }

        private void Q() throws InvalidProtocolBufferException {
            if (this.f8083i - this.f8085k >= 10) {
                R();
            } else {
                S();
            }
        }

        private void R() throws InvalidProtocolBufferException {
            for (int i11 = 0; i11 < 10; i11++) {
                byte[] bArr = this.f8081g;
                int i12 = this.f8085k;
                this.f8085k = i12 + 1;
                if (bArr[i12] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void S() throws InvalidProtocolBufferException {
            for (int i11 = 0; i11 < 10; i11++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String A() throws InvalidProtocolBufferException {
            int iL = L();
            if (iL > 0) {
                int i11 = this.f8083i;
                int i12 = this.f8085k;
                if (iL <= i11 - i12) {
                    String str = new String(this.f8081g, i12, iL, y.f8238b);
                    this.f8085k += iL;
                    return str;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String B() throws InvalidProtocolBufferException {
            int iL = L();
            if (iL > 0) {
                int i11 = this.f8083i;
                int i12 = this.f8085k;
                if (iL <= i11 - i12) {
                    String strA = o1.a(this.f8081g, i12, iL);
                    this.f8085k += iL;
                    return strA;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int C() throws InvalidProtocolBufferException {
            if (f()) {
                this.f8087m = 0;
                return 0;
            }
            int iL = L();
            this.f8087m = iL;
            if (p1.a(iL) != 0) {
                return this.f8087m;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int D() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long E() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean F(int i11) throws InvalidProtocolBufferException {
            int iB = p1.b(i11);
            if (iB == 0) {
                Q();
                return true;
            }
            if (iB == 1) {
                P(8);
                return true;
            }
            if (iB == 2) {
                P(L());
                return true;
            }
            if (iB == 3) {
                G();
                a(p1.c(p1.a(i11), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            P(4);
            return true;
        }

        public byte H() throws InvalidProtocolBufferException {
            int i11 = this.f8085k;
            if (i11 == this.f8083i) {
                throw InvalidProtocolBufferException.m();
            }
            byte[] bArr = this.f8081g;
            this.f8085k = i11 + 1;
            return bArr[i11];
        }

        public byte[] I(int i11) throws InvalidProtocolBufferException {
            if (i11 > 0) {
                int i12 = this.f8083i;
                int i13 = this.f8085k;
                if (i11 <= i12 - i13) {
                    int i14 = i11 + i13;
                    this.f8085k = i14;
                    return Arrays.copyOfRange(this.f8081g, i13, i14);
                }
            }
            if (i11 > 0) {
                throw InvalidProtocolBufferException.m();
            }
            if (i11 == 0) {
                return y.f8240d;
            }
            throw InvalidProtocolBufferException.g();
        }

        public int J() throws InvalidProtocolBufferException {
            int i11 = this.f8085k;
            if (this.f8083i - i11 < 4) {
                throw InvalidProtocolBufferException.m();
            }
            byte[] bArr = this.f8081g;
            this.f8085k = i11 + 4;
            return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        }

        public long K() throws InvalidProtocolBufferException {
            int i11 = this.f8085k;
            if (this.f8083i - i11 < 8) {
                throw InvalidProtocolBufferException.m();
            }
            byte[] bArr = this.f8081g;
            this.f8085k = i11 + 8;
            return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
        }

        public int L() {
            int i11;
            int i12 = this.f8085k;
            int i13 = this.f8083i;
            if (i13 != i12) {
                byte[] bArr = this.f8081g;
                int i14 = i12 + 1;
                byte b11 = bArr[i12];
                if (b11 >= 0) {
                    this.f8085k = i14;
                    return b11;
                }
                if (i13 - i14 >= 9) {
                    int i15 = i12 + 2;
                    int i16 = (bArr[i14] << 7) ^ b11;
                    if (i16 < 0) {
                        i11 = i16 ^ RangingPosition.RSSI_UNKNOWN;
                    } else {
                        int i17 = i12 + 3;
                        int i18 = (bArr[i15] << 14) ^ i16;
                        if (i18 >= 0) {
                            i11 = i18 ^ 16256;
                        } else {
                            int i19 = i12 + 4;
                            int i21 = i18 ^ (bArr[i17] << 21);
                            if (i21 < 0) {
                                i11 = (-2080896) ^ i21;
                            } else {
                                i17 = i12 + 5;
                                byte b12 = bArr[i19];
                                int i22 = (i21 ^ (b12 << 28)) ^ 266354560;
                                if (b12 < 0) {
                                    i19 = i12 + 6;
                                    if (bArr[i17] < 0) {
                                        i17 = i12 + 7;
                                        if (bArr[i19] < 0) {
                                            i19 = i12 + 8;
                                            if (bArr[i17] < 0) {
                                                i17 = i12 + 9;
                                                if (bArr[i19] < 0) {
                                                    int i23 = i12 + 10;
                                                    if (bArr[i17] >= 0) {
                                                        i15 = i23;
                                                        i11 = i22;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i11 = i22;
                                }
                                i11 = i22;
                            }
                            i15 = i19;
                        }
                        i15 = i17;
                    }
                    this.f8085k = i15;
                    return i11;
                }
            }
            return (int) N();
        }

        public long M() {
            long j11;
            long j12;
            long j13;
            int i11 = this.f8085k;
            int i12 = this.f8083i;
            if (i12 != i11) {
                byte[] bArr = this.f8081g;
                int i13 = i11 + 1;
                byte b11 = bArr[i11];
                if (b11 >= 0) {
                    this.f8085k = i13;
                    return b11;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b11;
                    if (i15 < 0) {
                        j11 = i15 ^ RangingPosition.RSSI_UNKNOWN;
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            j11 = i17 ^ 16256;
                            i14 = i16;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                long j14 = (-2080896) ^ i19;
                                i14 = i18;
                                j11 = j14;
                            } else {
                                long j15 = i19;
                                i14 = i11 + 5;
                                long j16 = j15 ^ (((long) bArr[i18]) << 28);
                                if (j16 >= 0) {
                                    j13 = 266354560;
                                } else {
                                    int i21 = i11 + 6;
                                    long j17 = j16 ^ (((long) bArr[i14]) << 35);
                                    if (j17 < 0) {
                                        j12 = -34093383808L;
                                    } else {
                                        i14 = i11 + 7;
                                        j16 = j17 ^ (((long) bArr[i21]) << 42);
                                        if (j16 >= 0) {
                                            j13 = 4363953127296L;
                                        } else {
                                            i21 = i11 + 8;
                                            j17 = j16 ^ (((long) bArr[i14]) << 49);
                                            if (j17 < 0) {
                                                j12 = -558586000294016L;
                                            } else {
                                                i14 = i11 + 9;
                                                long j18 = (j17 ^ (((long) bArr[i21]) << 56)) ^ 71499008037633920L;
                                                if (j18 < 0) {
                                                    int i22 = i11 + 10;
                                                    if (bArr[i14] >= 0) {
                                                        i14 = i22;
                                                    }
                                                }
                                                j11 = j18;
                                            }
                                        }
                                    }
                                    j11 = j17 ^ j12;
                                    i14 = i21;
                                }
                                j11 = j16 ^ j13;
                            }
                        }
                    }
                    this.f8085k = i14;
                    return j11;
                }
            }
            return N();
        }

        long N() throws InvalidProtocolBufferException {
            long j11 = 0;
            for (int i11 = 0; i11 < 64; i11 += 7) {
                byte bH = H();
                j11 |= ((long) (bH & 127)) << i11;
                if ((bH & 128) == 0) {
                    return j11;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public void P(int i11) throws InvalidProtocolBufferException {
            if (i11 >= 0) {
                int i12 = this.f8083i;
                int i13 = this.f8085k;
                if (i11 <= i12 - i13) {
                    this.f8085k = i13 + i11;
                    return;
                }
            }
            if (i11 >= 0) {
                throw InvalidProtocolBufferException.m();
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void a(int i11) throws InvalidProtocolBufferException {
            if (this.f8087m != i11) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int e() {
            return this.f8085k - this.f8086l;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean f() {
            return this.f8085k == this.f8083i;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void l(int i11) {
            this.f8089o = i11;
            O();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int m(int i11) throws InvalidProtocolBufferException {
            if (i11 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int iE = i11 + e();
            if (iE < 0) {
                throw InvalidProtocolBufferException.h();
            }
            int i12 = this.f8089o;
            if (iE > i12) {
                throw InvalidProtocolBufferException.m();
            }
            this.f8089o = iE;
            O();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean n() {
            return M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public g o() {
            int iL = L();
            if (iL > 0) {
                int i11 = this.f8083i;
                int i12 = this.f8085k;
                if (iL <= i11 - i12) {
                    g gVarU = (this.f8082h && this.f8088n) ? g.u(this.f8081g, i12, iL) : g.g(this.f8081g, i12, iL);
                    this.f8085k += iL;
                    return gVarU;
                }
            }
            return iL == 0 ? g.f8057b : g.t(I(iL));
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public double p() {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int q() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int r() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long s() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public float t() {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int u() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long v() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int w() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long x() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int y() {
            return h.c(L());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long z() {
            return h.d(M());
        }

        private b(byte[] bArr, int i11, int i12, boolean z11) {
            super();
            this.f8089o = Integer.MAX_VALUE;
            this.f8081g = bArr;
            this.f8083i = i12 + i11;
            this.f8085k = i11;
            this.f8086l = i11;
            this.f8082h = z11;
        }
    }

    private static final class c extends h {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final InputStream f8090g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final byte[] f8091h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f8092i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f8093j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f8094k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f8095l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f8096m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f8097n;

        private static int H(InputStream inputStream) throws InvalidProtocolBufferException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e11) {
                e11.j();
                throw e11;
            }
        }

        private static int I(InputStream inputStream, byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException {
            try {
                return inputStream.read(bArr, i11, i12);
            } catch (InvalidProtocolBufferException e11) {
                e11.j();
                throw e11;
            }
        }

        private g J(int i11) throws IOException {
            byte[] bArrM = M(i11);
            if (bArrM != null) {
                return g.f(bArrM);
            }
            int i12 = this.f8094k;
            int i13 = this.f8092i;
            int length = i13 - i12;
            this.f8096m += i13;
            this.f8094k = 0;
            this.f8092i = 0;
            List<byte[]> listN = N(i11 - length);
            byte[] bArr = new byte[i11];
            System.arraycopy(this.f8091h, i12, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return g.t(bArr);
        }

        private byte[] L(int i11, boolean z11) throws IOException {
            byte[] bArrM = M(i11);
            if (bArrM != null) {
                return z11 ? (byte[]) bArrM.clone() : bArrM;
            }
            int i12 = this.f8094k;
            int i13 = this.f8092i;
            int length = i13 - i12;
            this.f8096m += i13;
            this.f8094k = 0;
            this.f8092i = 0;
            List<byte[]> listN = N(i11 - length);
            byte[] bArr = new byte[i11];
            System.arraycopy(this.f8091h, i12, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] M(int i11) throws InvalidProtocolBufferException {
            if (i11 == 0) {
                return y.f8240d;
            }
            if (i11 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i12 = this.f8096m;
            int i13 = this.f8094k;
            int i14 = i12 + i13 + i11;
            if (i14 - this.f8078c > 0) {
                throw InvalidProtocolBufferException.l();
            }
            int i15 = this.f8097n;
            if (i14 > i15) {
                W((i15 - i12) - i13);
                throw InvalidProtocolBufferException.m();
            }
            int i16 = this.f8092i - i13;
            int i17 = i11 - i16;
            if (i17 >= 4096 && i17 > H(this.f8090g)) {
                return null;
            }
            byte[] bArr = new byte[i11];
            System.arraycopy(this.f8091h, this.f8094k, bArr, 0, i16);
            this.f8096m += this.f8092i;
            this.f8094k = 0;
            this.f8092i = 0;
            while (i16 < i11) {
                int I = I(this.f8090g, bArr, i16, i11 - i16);
                if (I == -1) {
                    throw InvalidProtocolBufferException.m();
                }
                this.f8096m += I;
                i16 += I;
            }
            return bArr;
        }

        private List<byte[]> N(int i11) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i11 > 0) {
                int iMin = Math.min(i11, 4096);
                byte[] bArr = new byte[iMin];
                int i12 = 0;
                while (i12 < iMin) {
                    int i13 = this.f8090g.read(bArr, i12, iMin - i12);
                    if (i13 == -1) {
                        throw InvalidProtocolBufferException.m();
                    }
                    this.f8096m += i13;
                    i12 += i13;
                }
                i11 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void T() {
            int i11 = this.f8092i + this.f8093j;
            this.f8092i = i11;
            int i12 = this.f8096m + i11;
            int i13 = this.f8097n;
            if (i12 <= i13) {
                this.f8093j = 0;
                return;
            }
            int i14 = i12 - i13;
            this.f8093j = i14;
            this.f8092i = i11 - i14;
        }

        private void U(int i11) throws InvalidProtocolBufferException {
            if (b0(i11)) {
                return;
            }
            if (i11 <= (this.f8078c - this.f8096m) - this.f8094k) {
                throw InvalidProtocolBufferException.m();
            }
            throw InvalidProtocolBufferException.l();
        }

        private static long V(InputStream inputStream, long j11) throws InvalidProtocolBufferException {
            try {
                return inputStream.skip(j11);
            } catch (InvalidProtocolBufferException e11) {
                e11.j();
                throw e11;
            }
        }

        private void X(int i11) throws InvalidProtocolBufferException {
            if (i11 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i12 = this.f8096m;
            int i13 = this.f8094k;
            int i14 = i12 + i13 + i11;
            int i15 = this.f8097n;
            if (i14 > i15) {
                W((i15 - i12) - i13);
                throw InvalidProtocolBufferException.m();
            }
            this.f8096m = i12 + i13;
            int i16 = this.f8092i - i13;
            this.f8092i = 0;
            this.f8094k = 0;
            while (i16 < i11) {
                try {
                    long j11 = i11 - i16;
                    long jV = V(this.f8090g, j11);
                    if (jV < 0 || jV > j11) {
                        throw new IllegalStateException(this.f8090g.getClass() + "#skip returned invalid result: " + jV + "\nThe InputStream implementation is buggy.");
                    }
                    if (jV == 0) {
                        break;
                    } else {
                        i16 += (int) jV;
                    }
                } catch (Throwable th2) {
                    this.f8096m += i16;
                    T();
                    throw th2;
                }
            }
            this.f8096m += i16;
            T();
            if (i16 >= i11) {
                return;
            }
            int i17 = this.f8092i;
            int i18 = i17 - this.f8094k;
            this.f8094k = i17;
            U(1);
            while (true) {
                int i19 = i11 - i18;
                int i21 = this.f8092i;
                if (i19 <= i21) {
                    this.f8094k = i19;
                    return;
                } else {
                    i18 += i21;
                    this.f8094k = i21;
                    U(1);
                }
            }
        }

        private void Y() throws InvalidProtocolBufferException {
            if (this.f8092i - this.f8094k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() throws InvalidProtocolBufferException {
            for (int i11 = 0; i11 < 10; i11++) {
                byte[] bArr = this.f8091h;
                int i12 = this.f8094k;
                this.f8094k = i12 + 1;
                if (bArr[i12] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private void a0() throws InvalidProtocolBufferException {
            for (int i11 = 0; i11 < 10; i11++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        private boolean b0(int i11) throws InvalidProtocolBufferException {
            int i12 = this.f8094k;
            int i13 = i12 + i11;
            int i14 = this.f8092i;
            if (i13 <= i14) {
                throw new IllegalStateException("refillBuffer() called when " + i11 + " bytes were already available in buffer");
            }
            int i15 = this.f8078c;
            int i16 = this.f8096m;
            if (i11 > (i15 - i16) - i12 || i16 + i12 + i11 > this.f8097n) {
                return false;
            }
            if (i12 > 0) {
                if (i14 > i12) {
                    byte[] bArr = this.f8091h;
                    System.arraycopy(bArr, i12, bArr, 0, i14 - i12);
                }
                this.f8096m += i12;
                this.f8092i -= i12;
                this.f8094k = 0;
            }
            InputStream inputStream = this.f8090g;
            byte[] bArr2 = this.f8091h;
            int i17 = this.f8092i;
            int I = I(inputStream, bArr2, i17, Math.min(bArr2.length - i17, (this.f8078c - this.f8096m) - i17));
            if (I == 0 || I < -1 || I > this.f8091h.length) {
                throw new IllegalStateException(this.f8090g.getClass() + "#read(byte[]) returned invalid result: " + I + "\nThe InputStream implementation is buggy.");
            }
            if (I <= 0) {
                return false;
            }
            this.f8092i += I;
            T();
            if (this.f8092i >= i11) {
                return true;
            }
            return b0(i11);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String A() throws InvalidProtocolBufferException {
            int iQ = Q();
            if (iQ > 0) {
                int i11 = this.f8092i;
                int i12 = this.f8094k;
                if (iQ <= i11 - i12) {
                    String str = new String(this.f8091h, i12, iQ, y.f8238b);
                    this.f8094k += iQ;
                    return str;
                }
            }
            if (iQ == 0) {
                return "";
            }
            if (iQ < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (iQ > this.f8092i) {
                return new String(L(iQ, false), y.f8238b);
            }
            U(iQ);
            String str2 = new String(this.f8091h, this.f8094k, iQ, y.f8238b);
            this.f8094k += iQ;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public String B() throws IOException {
            byte[] bArrL;
            int iQ = Q();
            int i11 = this.f8094k;
            int i12 = this.f8092i;
            if (iQ <= i12 - i11 && iQ > 0) {
                bArrL = this.f8091h;
                this.f8094k = i11 + iQ;
            } else {
                if (iQ == 0) {
                    return "";
                }
                if (iQ < 0) {
                    throw InvalidProtocolBufferException.g();
                }
                i11 = 0;
                if (iQ <= i12) {
                    U(iQ);
                    bArrL = this.f8091h;
                    this.f8094k = iQ;
                } else {
                    bArrL = L(iQ, false);
                }
            }
            return o1.a(bArrL, i11, iQ);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int C() throws InvalidProtocolBufferException {
            if (f()) {
                this.f8095l = 0;
                return 0;
            }
            int iQ = Q();
            this.f8095l = iQ;
            if (p1.a(iQ) != 0) {
                return this.f8095l;
            }
            throw InvalidProtocolBufferException.c();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int D() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long E() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean F(int i11) throws InvalidProtocolBufferException {
            int iB = p1.b(i11);
            if (iB == 0) {
                Y();
                return true;
            }
            if (iB == 1) {
                W(8);
                return true;
            }
            if (iB == 2) {
                W(Q());
                return true;
            }
            if (iB == 3) {
                G();
                a(p1.c(p1.a(i11), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            W(4);
            return true;
        }

        public byte K() throws InvalidProtocolBufferException {
            if (this.f8094k == this.f8092i) {
                U(1);
            }
            byte[] bArr = this.f8091h;
            int i11 = this.f8094k;
            this.f8094k = i11 + 1;
            return bArr[i11];
        }

        public int O() throws InvalidProtocolBufferException {
            int i11 = this.f8094k;
            if (this.f8092i - i11 < 4) {
                U(4);
                i11 = this.f8094k;
            }
            byte[] bArr = this.f8091h;
            this.f8094k = i11 + 4;
            return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        }

        public long P() throws InvalidProtocolBufferException {
            int i11 = this.f8094k;
            if (this.f8092i - i11 < 8) {
                U(8);
                i11 = this.f8094k;
            }
            byte[] bArr = this.f8091h;
            this.f8094k = i11 + 8;
            return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
        }

        public int Q() {
            int i11;
            int i12 = this.f8094k;
            int i13 = this.f8092i;
            if (i13 != i12) {
                byte[] bArr = this.f8091h;
                int i14 = i12 + 1;
                byte b11 = bArr[i12];
                if (b11 >= 0) {
                    this.f8094k = i14;
                    return b11;
                }
                if (i13 - i14 >= 9) {
                    int i15 = i12 + 2;
                    int i16 = (bArr[i14] << 7) ^ b11;
                    if (i16 < 0) {
                        i11 = i16 ^ RangingPosition.RSSI_UNKNOWN;
                    } else {
                        int i17 = i12 + 3;
                        int i18 = (bArr[i15] << 14) ^ i16;
                        if (i18 >= 0) {
                            i11 = i18 ^ 16256;
                        } else {
                            int i19 = i12 + 4;
                            int i21 = i18 ^ (bArr[i17] << 21);
                            if (i21 < 0) {
                                i11 = (-2080896) ^ i21;
                            } else {
                                i17 = i12 + 5;
                                byte b12 = bArr[i19];
                                int i22 = (i21 ^ (b12 << 28)) ^ 266354560;
                                if (b12 < 0) {
                                    i19 = i12 + 6;
                                    if (bArr[i17] < 0) {
                                        i17 = i12 + 7;
                                        if (bArr[i19] < 0) {
                                            i19 = i12 + 8;
                                            if (bArr[i17] < 0) {
                                                i17 = i12 + 9;
                                                if (bArr[i19] < 0) {
                                                    int i23 = i12 + 10;
                                                    if (bArr[i17] >= 0) {
                                                        i15 = i23;
                                                        i11 = i22;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i11 = i22;
                                }
                                i11 = i22;
                            }
                            i15 = i19;
                        }
                        i15 = i17;
                    }
                    this.f8094k = i15;
                    return i11;
                }
            }
            return (int) S();
        }

        public long R() {
            long j11;
            long j12;
            long j13;
            int i11 = this.f8094k;
            int i12 = this.f8092i;
            if (i12 != i11) {
                byte[] bArr = this.f8091h;
                int i13 = i11 + 1;
                byte b11 = bArr[i11];
                if (b11 >= 0) {
                    this.f8094k = i13;
                    return b11;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b11;
                    if (i15 < 0) {
                        j11 = i15 ^ RangingPosition.RSSI_UNKNOWN;
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            j11 = i17 ^ 16256;
                            i14 = i16;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                long j14 = (-2080896) ^ i19;
                                i14 = i18;
                                j11 = j14;
                            } else {
                                long j15 = i19;
                                i14 = i11 + 5;
                                long j16 = j15 ^ (((long) bArr[i18]) << 28);
                                if (j16 >= 0) {
                                    j13 = 266354560;
                                } else {
                                    int i21 = i11 + 6;
                                    long j17 = j16 ^ (((long) bArr[i14]) << 35);
                                    if (j17 < 0) {
                                        j12 = -34093383808L;
                                    } else {
                                        i14 = i11 + 7;
                                        j16 = j17 ^ (((long) bArr[i21]) << 42);
                                        if (j16 >= 0) {
                                            j13 = 4363953127296L;
                                        } else {
                                            i21 = i11 + 8;
                                            j17 = j16 ^ (((long) bArr[i14]) << 49);
                                            if (j17 < 0) {
                                                j12 = -558586000294016L;
                                            } else {
                                                i14 = i11 + 9;
                                                long j18 = (j17 ^ (((long) bArr[i21]) << 56)) ^ 71499008037633920L;
                                                if (j18 < 0) {
                                                    int i22 = i11 + 10;
                                                    if (bArr[i14] >= 0) {
                                                        i14 = i22;
                                                    }
                                                }
                                                j11 = j18;
                                            }
                                        }
                                    }
                                    j11 = j17 ^ j12;
                                    i14 = i21;
                                }
                                j11 = j16 ^ j13;
                            }
                        }
                    }
                    this.f8094k = i14;
                    return j11;
                }
            }
            return S();
        }

        long S() throws InvalidProtocolBufferException {
            long j11 = 0;
            for (int i11 = 0; i11 < 64; i11 += 7) {
                byte bK = K();
                j11 |= ((long) (bK & 127)) << i11;
                if ((bK & 128) == 0) {
                    return j11;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public void W(int i11) throws InvalidProtocolBufferException {
            int i12 = this.f8092i;
            int i13 = this.f8094k;
            if (i11 > i12 - i13 || i11 < 0) {
                X(i11);
            } else {
                this.f8094k = i13 + i11;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void a(int i11) throws InvalidProtocolBufferException {
            if (this.f8095l != i11) {
                throw InvalidProtocolBufferException.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int e() {
            return this.f8096m + this.f8094k;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean f() {
            return this.f8094k == this.f8092i && !b0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public void l(int i11) {
            this.f8097n = i11;
            T();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int m(int i11) throws InvalidProtocolBufferException {
            if (i11 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i12 = i11 + this.f8096m + this.f8094k;
            if (i12 < 0) {
                throw InvalidProtocolBufferException.h();
            }
            int i13 = this.f8097n;
            if (i12 > i13) {
                throw InvalidProtocolBufferException.m();
            }
            this.f8097n = i12;
            T();
            return i13;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public boolean n() {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public g o() throws InvalidProtocolBufferException {
            int iQ = Q();
            int i11 = this.f8092i;
            int i12 = this.f8094k;
            if (iQ <= i11 - i12 && iQ > 0) {
                g gVarG = g.g(this.f8091h, i12, iQ);
                this.f8094k += iQ;
                return gVarG;
            }
            if (iQ == 0) {
                return g.f8057b;
            }
            if (iQ >= 0) {
                return J(iQ);
            }
            throw InvalidProtocolBufferException.g();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public double p() {
            return Double.longBitsToDouble(P());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int q() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int r() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long s() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public float t() {
            return Float.intBitsToFloat(O());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int u() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long v() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int w() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long x() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public int y() {
            return h.c(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.h
        public long z() {
            return h.d(R());
        }

        private c(InputStream inputStream, int i11) {
            super();
            this.f8097n = Integer.MAX_VALUE;
            y.b(inputStream, "input");
            this.f8090g = inputStream;
            this.f8091h = new byte[i11];
            this.f8092i = 0;
            this.f8094k = 0;
            this.f8096m = 0;
        }
    }

    public static int c(int i11) {
        return (-(i11 & 1)) ^ (i11 >>> 1);
    }

    public static long d(long j11) {
        return (-(j11 & 1)) ^ (j11 >>> 1);
    }

    public static h g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static h h(InputStream inputStream, int i11) {
        if (i11 > 0) {
            return inputStream == null ? i(y.f8240d) : new c(inputStream, i11);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static h i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static h j(byte[] bArr, int i11, int i12) {
        return k(bArr, i11, i12, false);
    }

    static h k(byte[] bArr, int i11, int i12, boolean z11) {
        b bVar = new b(bArr, i11, i12, z11);
        try {
            bVar.m(i12);
            return bVar;
        } catch (InvalidProtocolBufferException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i11);

    public void G() throws InvalidProtocolBufferException {
        boolean zF;
        do {
            int iC = C();
            if (iC == 0) {
                return;
            }
            b();
            this.f8076a++;
            zF = F(iC);
            this.f8076a--;
        } while (zF);
    }

    public abstract void a(int i11);

    public void b() throws InvalidProtocolBufferException {
        if (this.f8076a >= this.f8077b) {
            throw InvalidProtocolBufferException.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void l(int i11);

    public abstract int m(int i11);

    public abstract boolean n();

    public abstract g o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();

    private h() {
        this.f8077b = f8075f;
        this.f8078c = Integer.MAX_VALUE;
        this.f8080e = false;
    }
}
