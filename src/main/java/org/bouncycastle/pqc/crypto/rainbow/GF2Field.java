package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
class GF2Field {
    public static final int MASK = 255;
    static final byte[][] gfMulTable = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 256, 256);
    static final byte[] gfInvTable = new byte[256];

    static {
        long j11;
        int i11 = 1;
        long j12 = 72340172838076673L;
        while (true) {
            j11 = 506097522914230528L;
            if (i11 > 255) {
                break;
            }
            for (int i12 = 0; i12 < 256; i12 += 8) {
                Pack.longToLittleEndian(gf256Mul_64(j12, j11), gfMulTable[i11], i12);
                j11 += 578721382704613384L;
            }
            j12 += 72340172838076673L;
            i11++;
        }
        for (int i13 = 0; i13 < 256; i13 += 8) {
            Pack.longToLittleEndian(gf256Inv_64(j11), gfInvTable, i13);
            j11 += 578721382704613384L;
        }
    }

    GF2Field() {
    }

    public static short addElem(short s11, short s12) {
        return (short) (s11 ^ s12);
    }

    public static long addElem_64(long j11, long j12) {
        return j11 ^ j12;
    }

    private static short gf16Mul(short s11, short s12) {
        short s13 = (short) (s11 & 3);
        short s14 = (short) ((s11 >>> 2) & 255);
        short s15 = (short) (s12 & 3);
        short s16 = (short) ((s12 >>> 2) & 255);
        short sGf4Mul = gf4Mul(s13, s15);
        short sGf4Mul2 = gf4Mul(s14, s16);
        return (short) ((((((short) (gf4Mul((short) (s14 ^ s13), (short) (s16 ^ s15)) ^ sGf4Mul)) << 2) ^ sGf4Mul) ^ gf4Mul2(sGf4Mul2)) & 255);
    }

    private static short gf16Mul8(short s11) {
        short s12 = (short) (s11 & 3);
        short s13 = (short) ((s11 >>> 2) & 255);
        return (short) ((gf4Mul3(s13) | (gf4Mul2((short) (s12 ^ s13)) << 2)) & 255);
    }

    private static long gf16Mul8_64(long j11) {
        long j12 = 3689348814741910323L & j11;
        long j13 = j11 & (-3689348814741910324L);
        long j14 = (j12 << 2) ^ j13;
        long j15 = j13 >>> 2;
        return j15 ^ gf4Mul2_64(j14 ^ j15);
    }

    private static long gf16Mul_64(long j11, long j12) {
        long jGf4Mul_64 = gf4Mul_64(j11, j12);
        long j13 = 3689348814741910323L & jGf4Mul_64;
        return (gf4Mul_64(((j11 ^ (j11 << 2)) & (-3689348814741910324L)) ^ ((jGf4Mul_64 & (-3689348814741910324L)) >>> 2), ((j12 ^ (j12 << 2)) & (-3689348814741910324L)) ^ 2459565876494606882L) ^ (j13 << 2)) ^ j13;
    }

    private static short gf16Squ(short s11) {
        short s12 = (short) (s11 & 3);
        short sGf4Squ = gf4Squ((short) ((s11 >>> 2) & 255));
        return (short) ((((sGf4Squ << 2) ^ gf4Mul2(sGf4Squ)) ^ gf4Squ(s12)) & 255);
    }

    private static long gf16Squ_64(long j11) {
        long jGf4Squ_64 = gf4Squ_64(j11);
        return jGf4Squ_64 ^ (gf4Mul2_64((-3689348814741910324L) & jGf4Squ_64) >>> 2);
    }

    private static short gf256Inv(short s11) {
        short sGf256Squ = gf256Squ(s11);
        short sGf256Squ2 = gf256Squ(sGf256Squ);
        short sGf256Mul = gf256Mul(gf256Mul(sGf256Squ2, sGf256Squ), gf256Squ(sGf256Squ2));
        return gf256Mul(sGf256Squ, gf256Squ(gf256Mul(gf256Squ(gf256Squ(gf256Squ(sGf256Mul))), sGf256Mul)));
    }

    private static long gf256Inv_64(long j11) {
        long jGf256Squ_64 = gf256Squ_64(j11);
        long jGf256Squ_65 = gf256Squ_64(jGf256Squ_64);
        long jGf256Mul_64 = gf256Mul_64(gf256Mul_64(jGf256Squ_65, jGf256Squ_64), gf256Squ_64(jGf256Squ_65));
        return gf256Mul_64(jGf256Squ_64, gf256Squ_64(gf256Mul_64(gf256Squ_64(gf256Squ_64(gf256Squ_64(jGf256Mul_64))), jGf256Mul_64)));
    }

    private static short gf256Mul(short s11, short s12) {
        short s13 = (short) (s11 & 15);
        short s14 = (short) ((s11 >>> 4) & 255);
        short s15 = (short) (s12 & 15);
        short s16 = (short) ((s12 >>> 4) & 255);
        short sGf16Mul = gf16Mul(s13, s15);
        short sGf16Mul2 = gf16Mul(s14, s16);
        return (short) ((((((short) (gf16Mul((short) (s14 ^ s13), (short) (s16 ^ s15)) ^ sGf16Mul)) << 4) ^ sGf16Mul) ^ gf16Mul8(sGf16Mul2)) & 255);
    }

    private static long gf256Mul_64(long j11, long j12) {
        long jGf16Mul_64 = gf16Mul_64(j11, j12);
        long j13 = 1085102592571150095L & jGf16Mul_64;
        return (gf16Mul_64(((j11 ^ (j11 << 4)) & (-1085102592571150096L)) ^ ((jGf16Mul_64 & (-1085102592571150096L)) >>> 4), ((j12 ^ (j12 << 4)) & (-1085102592571150096L)) ^ 578721382704613384L) ^ (j13 << 4)) ^ j13;
    }

    private static short gf256Squ(short s11) {
        short s12 = (short) (s11 & 15);
        short sGf16Squ = gf16Squ((short) ((s11 >>> 4) & 255));
        return (short) ((((sGf16Squ << 4) ^ gf16Mul8(sGf16Squ)) ^ gf16Squ(s12)) & 255);
    }

    private static long gf256Squ_64(long j11) {
        long jGf16Squ_64 = gf16Squ_64(j11);
        return jGf16Squ_64 ^ (gf16Mul8_64((-1085102592571150096L) & jGf16Squ_64) >>> 4);
    }

    private static short gf4Mul(short s11, short s12) {
        return (short) (((gf4Mul2(s11) * (s12 >>> 1)) ^ ((s12 & 1) * s11)) & 255);
    }

    private static short gf4Mul2(short s11) {
        return (short) ((((s11 >>> 1) * 7) ^ (s11 << 1)) & 255);
    }

    private static long gf4Mul2_64(long j11) {
        long j12 = 6148914691236517205L & j11;
        long j13 = j11 & (-6148914691236517206L);
        return (j13 >>> 1) ^ ((j12 << 1) ^ j13);
    }

    private static short gf4Mul3(short s11) {
        int i11 = (s11 - 2) >>> 1;
        return (short) ((((s11 - 1) & (~i11)) | ((s11 * 3) & i11)) & 255);
    }

    private static long gf4Mul_64(long j11, long j12) {
        long j13 = (((j11 << 1) & j12) ^ ((j12 << 1) & j11)) & (-6148914691236517206L);
        long j14 = j11 & j12;
        return ((j14 & (-6148914691236517206L)) >>> 1) ^ (j14 ^ j13);
    }

    private static short gf4Squ(short s11) {
        return (short) ((s11 ^ (s11 >>> 1)) & 255);
    }

    private static long gf4Squ_64(long j11) {
        return j11 ^ (((-6148914691236517206L) & j11) >>> 1);
    }

    public static short invElem(short s11) {
        return (short) (gfInvTable[s11] & 255);
    }

    public static long invElem_64(long j11) {
        return gf256Inv_64(j11);
    }

    public static short multElem(short s11, short s12) {
        return (short) (gfMulTable[s11][s12] & 255);
    }

    public static long multElem_64(long j11, long j12) {
        return gf256Mul_64(j11, j12);
    }
}
