package androidx.datastore.preferences.protobuf;

import com.plaid.internal.EnumC4419g;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f8181a;

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b11, byte b12, byte b13, byte b14, char[] cArr, int i11) throws InvalidProtocolBufferException {
            if (m(b12) || (((b11 << 28) + (b12 + 112)) >> 30) != 0 || m(b13) || m(b14)) {
                throw InvalidProtocolBufferException.d();
            }
            int iR = ((b11 & 7) << 18) | (r(b12) << 12) | (r(b13) << 6) | r(b14);
            cArr[i11] = l(iR);
            cArr[i11 + 1] = q(iR);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte b11, char[] cArr, int i11) {
            cArr[i11] = (char) b11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b11, byte b12, byte b13, char[] cArr, int i11) throws InvalidProtocolBufferException {
            if (m(b12) || ((b11 == -32 && b12 < -96) || ((b11 == -19 && b12 >= -96) || m(b13)))) {
                throw InvalidProtocolBufferException.d();
            }
            cArr[i11] = (char) (((b11 & 15) << 12) | (r(b12) << 6) | r(b13));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b11, byte b12, char[] cArr, int i11) throws InvalidProtocolBufferException {
            if (b11 < -62 || m(b12)) {
                throw InvalidProtocolBufferException.d();
            }
            cArr[i11] = (char) (((b11 & 31) << 6) | r(b12));
        }

        private static char l(int i11) {
            return (char) ((i11 >>> 10) + 55232);
        }

        private static boolean m(byte b11) {
            return b11 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b11) {
            return b11 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b11) {
            return b11 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b11) {
            return b11 < -32;
        }

        private static char q(int i11) {
            return (char) ((i11 & 1023) + 56320);
        }

        private static int r(byte b11) {
            return b11 & 63;
        }
    }

    static abstract class b {
        b() {
        }

        abstract String a(byte[] bArr, int i11, int i12);

        abstract int b(String str, byte[] bArr, int i11, int i12);
    }

    static final class c extends b {
        c() {
        }

        @Override // androidx.datastore.preferences.protobuf.o1.b
        String a(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException {
            if ((i11 | i12 | ((bArr.length - i11) - i12)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            int i13 = i11 + i12;
            char[] cArr = new char[i12];
            int i14 = 0;
            while (i11 < i13) {
                byte b11 = bArr[i11];
                if (!a.n(b11)) {
                    break;
                }
                i11++;
                a.i(b11, cArr, i14);
                i14++;
            }
            int i15 = i14;
            while (i11 < i13) {
                int i16 = i11 + 1;
                byte b12 = bArr[i11];
                if (a.n(b12)) {
                    int i17 = i15 + 1;
                    a.i(b12, cArr, i15);
                    int i18 = i16;
                    while (i18 < i13) {
                        byte b13 = bArr[i18];
                        if (!a.n(b13)) {
                            break;
                        }
                        i18++;
                        a.i(b13, cArr, i17);
                        i17++;
                    }
                    i15 = i17;
                    i11 = i18;
                } else if (a.p(b12)) {
                    if (i16 >= i13) {
                        throw InvalidProtocolBufferException.d();
                    }
                    i11 += 2;
                    a.k(b12, bArr[i16], cArr, i15);
                    i15++;
                } else if (a.o(b12)) {
                    if (i16 >= i13 - 1) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int i19 = i11 + 2;
                    i11 += 3;
                    a.j(b12, bArr[i16], bArr[i19], cArr, i15);
                    i15++;
                } else {
                    if (i16 >= i13 - 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    byte b14 = bArr[i16];
                    int i21 = i11 + 3;
                    byte b15 = bArr[i11 + 2];
                    i11 += 4;
                    a.h(b12, b14, b15, bArr[i21], cArr, i15);
                    i15 += 2;
                }
            }
            return new String(cArr, 0, i15);
        }

        @Override // androidx.datastore.preferences.protobuf.o1.b
        int b(String str, byte[] bArr, int i11, int i12) {
            int i13;
            int i14;
            char cCharAt;
            int length = str.length();
            int i15 = i12 + i11;
            int i16 = 0;
            while (i16 < length && (i14 = i16 + i11) < i15 && (cCharAt = str.charAt(i16)) < 128) {
                bArr[i14] = (byte) cCharAt;
                i16++;
            }
            if (i16 == length) {
                return i11 + length;
            }
            int i17 = i11 + i16;
            while (i16 < length) {
                char cCharAt2 = str.charAt(i16);
                if (cCharAt2 < 128 && i17 < i15) {
                    bArr[i17] = (byte) cCharAt2;
                    i17++;
                } else if (cCharAt2 < 2048 && i17 <= i15 - 2) {
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) ((cCharAt2 >>> 6) | 960);
                    i17 += 2;
                    bArr[i18] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i17 > i15 - 3) {
                        if (i17 > i15 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i13 = i16 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i13)))) {
                                throw new d(i16, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i17);
                        }
                        int i19 = i16 + 1;
                        if (i19 != str.length()) {
                            char cCharAt3 = str.charAt(i19);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i17] = (byte) ((codePoint >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                                bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i21 = i17 + 3;
                                bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i17 += 4;
                                bArr[i21] = (byte) ((codePoint & 63) | 128);
                                i16 = i19;
                            } else {
                                i16 = i19;
                            }
                        }
                        throw new d(i16 - 1, length);
                    }
                    bArr[i17] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i22 = i17 + 2;
                    bArr[i17 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i17 += 3;
                    bArr[i22] = (byte) ((cCharAt2 & '?') | 128);
                }
                i16++;
            }
            return i17;
        }
    }

    static class d extends IllegalArgumentException {
        d(int i11, int i12) {
            super("Unpaired surrogate at index " + i11 + " of " + i12);
        }
    }

    static final class e extends b {
        e() {
        }

        static boolean c() {
            return n1.B() && n1.C();
        }

        @Override // androidx.datastore.preferences.protobuf.o1.b
        String a(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException {
            Charset charset = y.f8238b;
            String str = new String(bArr, i11, i12, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i11, i12 + i11))) {
                throw InvalidProtocolBufferException.d();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.o1.b
        int b(String str, byte[] bArr, int i11, int i12) {
            long j11;
            long j12;
            long j13;
            int i13;
            char cCharAt;
            long j14 = i11;
            long j15 = ((long) i12) + j14;
            int length = str.length();
            if (length > i12 || bArr.length - i12 < i11) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i11 + i12));
            }
            int i14 = 0;
            while (true) {
                j11 = 1;
                if (i14 >= length || (cCharAt = str.charAt(i14)) >= 128) {
                    break;
                }
                n1.H(bArr, j14, (byte) cCharAt);
                i14++;
                j14 = 1 + j14;
            }
            if (i14 == length) {
                return (int) j14;
            }
            while (i14 < length) {
                char cCharAt2 = str.charAt(i14);
                if (cCharAt2 < 128 && j14 < j15) {
                    n1.H(bArr, j14, (byte) cCharAt2);
                    j13 = j15;
                    j12 = j11;
                    j14 += j11;
                } else if (cCharAt2 >= 2048 || j14 > j15 - 2) {
                    j12 = j11;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j14 > j15 - 3) {
                        j13 = j15;
                        if (j14 > j13 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i13 = i14 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i13)))) {
                                throw new d(i14, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j14);
                        }
                        int i15 = i14 + 1;
                        if (i15 != length) {
                            char cCharAt3 = str.charAt(i15);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                n1.H(bArr, j14, (byte) ((codePoint >>> 18) | EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                n1.H(bArr, j14 + j12, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j16 = j14 + 3;
                                n1.H(bArr, j14 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j14 += 4;
                                n1.H(bArr, j16, (byte) ((codePoint & 63) | 128));
                                i14 = i15;
                            } else {
                                i14 = i15;
                            }
                        }
                        throw new d(i14 - 1, length);
                    }
                    n1.H(bArr, j14, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j17 = j14 + 2;
                    j13 = j15;
                    n1.H(bArr, j14 + j12, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j14 += 3;
                    n1.H(bArr, j17, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j12 = j11;
                    long j18 = j14 + j12;
                    n1.H(bArr, j14, (byte) ((cCharAt2 >>> 6) | 960));
                    j14 += 2;
                    n1.H(bArr, j18, (byte) ((cCharAt2 & '?') | 128));
                    j13 = j15;
                }
                i14++;
                j11 = j12;
                j15 = j13;
            }
            return (int) j14;
        }
    }

    static {
        f8181a = (!e.c() || androidx.datastore.preferences.protobuf.d.c()) ? new c() : new e();
    }

    static String a(byte[] bArr, int i11, int i12) {
        return f8181a.a(bArr, i11, i12);
    }

    static int b(String str, byte[] bArr, int i11, int i12) {
        return f8181a.b(str, bArr, i11, i12);
    }

    static int c(String str) {
        int length = str.length();
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int iD = length;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt >= 2048) {
                iD += d(str, i11);
                break;
            }
            iD += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (iD >= length) {
            return iD;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iD) + 4294967296L));
    }

    private static int d(String str, int i11) {
        int length = str.length();
        int i12 = 0;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 2048) {
                i12 += (127 - cCharAt) >>> 31;
            } else {
                i12 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i11) < 65536) {
                        throw new d(i11, length);
                    }
                    i11++;
                }
            }
            i11++;
        }
        return i12;
    }
}
