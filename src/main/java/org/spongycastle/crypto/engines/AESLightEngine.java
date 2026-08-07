package org.spongycastle.crypto.engines;

import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Array;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.math.ec.Tnaf;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
public class AESLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private static final int f99467m1 = -2139062144;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    private static final int f99468m2 = 2139062143;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final int f99469m3 = 27;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final int f99470m4 = -1061109568;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    private static final int f99471m5 = 1061109567;
    private int C0;
    private int C1;
    private int C2;
    private int C3;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;
    private static final byte[] S = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, -128, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, Tnaf.POW_2_WIDTH, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};
    private static final byte[] Si = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, Tnaf.POW_2_WIDTH, 89, 39, -128, -20, 95, 96, 81, 127, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, 171, 77, 154, 47, 94, 188, 99, EnumC4419g.SDK_ASSET_ICON_ARROW_UP_VALUE, 151, 53, 106, EnumC4419g.SDK_ASSET_ICON_OVERRIDE_VALUE, 179, 125, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, 197, 145};

    private static int FFmulX(int i11) {
        return (((i11 & f99467m1) >>> 7) * 27) ^ ((f99468m2 & i11) << 1);
    }

    private static int FFmulX2(int i11) {
        int i12 = (f99471m5 & i11) << 2;
        int i13 = i11 & f99470m4;
        int i14 = i13 ^ (i13 >>> 1);
        return (i14 >>> 5) ^ (i12 ^ (i14 >>> 2));
    }

    private void decryptBlock(int[][] iArr) {
        int i11 = this.C0;
        int i12 = this.ROUNDS;
        int[] iArr2 = iArr[i12];
        int i13 = i11 ^ iArr2[0];
        int i14 = this.C1 ^ iArr2[1];
        int i15 = this.C2 ^ iArr2[2];
        int i16 = i12 - 1;
        int iInv_mcol = iArr2[3] ^ this.C3;
        while (i16 > 1) {
            byte[] bArr = Si;
            int iInv_mcol2 = inv_mcol((((bArr[i13 & 255] & 255) ^ ((bArr[(iInv_mcol >> 8) & 255] & 255) << 8)) ^ ((bArr[(i15 >> 16) & 255] & 255) << 16)) ^ (bArr[(i14 >> 24) & 255] << 24)) ^ iArr[i16][0];
            int iInv_mcol3 = inv_mcol((((bArr[i14 & 255] & 255) ^ ((bArr[(i13 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iInv_mcol >> 16) & 255] & 255) << 16)) ^ (bArr[(i15 >> 24) & 255] << 24)) ^ iArr[i16][1];
            int iInv_mcol4 = inv_mcol((((bArr[i15 & 255] & 255) ^ ((bArr[(i14 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i13 >> 16) & 255] & 255) << 16)) ^ (bArr[(iInv_mcol >> 24) & 255] << 24)) ^ iArr[i16][2];
            int iInv_mcol5 = inv_mcol((bArr[(i13 >> 24) & 255] << 24) ^ (((bArr[iInv_mcol & 255] & 255) ^ ((bArr[(i15 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i14 >> 16) & 255] & 255) << 16)));
            int i17 = i16 - 1;
            int i18 = iInv_mcol5 ^ iArr[i16][3];
            int iInv_mcol6 = inv_mcol((((bArr[iInv_mcol2 & 255] & 255) ^ ((bArr[(i18 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iInv_mcol4 >> 16) & 255] & 255) << 16)) ^ (bArr[(iInv_mcol3 >> 24) & 255] << 24)) ^ iArr[i17][0];
            int iInv_mcol7 = inv_mcol((((bArr[iInv_mcol3 & 255] & 255) ^ ((bArr[(iInv_mcol2 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i18 >> 16) & 255] & 255) << 16)) ^ (bArr[(iInv_mcol4 >> 24) & 255] << 24)) ^ iArr[i17][1];
            int iInv_mcol8 = inv_mcol((((bArr[iInv_mcol4 & 255] & 255) ^ ((bArr[(iInv_mcol3 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iInv_mcol2 >> 16) & 255] & 255) << 16)) ^ (bArr[(i18 >> 24) & 255] << 24)) ^ iArr[i17][2];
            i16 -= 2;
            iInv_mcol = iArr[i17][3] ^ inv_mcol((((bArr[i18 & 255] & 255) ^ ((bArr[(iInv_mcol4 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iInv_mcol3 >> 16) & 255] & 255) << 16)) ^ (bArr[(iInv_mcol2 >> 24) & 255] << 24));
            i13 = iInv_mcol6;
            i14 = iInv_mcol7;
            i15 = iInv_mcol8;
        }
        byte[] bArr2 = Si;
        int iInv_mcol9 = inv_mcol((((bArr2[i13 & 255] & 255) ^ ((bArr2[(iInv_mcol >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i15 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i14 >> 24) & 255] << 24)) ^ iArr[i16][0];
        int iInv_mcol10 = inv_mcol((((bArr2[i14 & 255] & 255) ^ ((bArr2[(i13 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iInv_mcol >> 16) & 255] & 255) << 16)) ^ (bArr2[(i15 >> 24) & 255] << 24)) ^ iArr[i16][1];
        int iInv_mcol11 = inv_mcol((((bArr2[i15 & 255] & 255) ^ ((bArr2[(i14 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i13 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iInv_mcol >> 24) & 255] << 24)) ^ iArr[i16][2];
        int iInv_mcol12 = inv_mcol((bArr2[(i13 >> 24) & 255] << 24) ^ (((bArr2[iInv_mcol & 255] & 255) ^ ((bArr2[(i15 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i14 >> 16) & 255] & 255) << 16))) ^ iArr[i16][3];
        int i19 = (((bArr2[iInv_mcol9 & 255] & 255) ^ ((bArr2[(iInv_mcol12 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iInv_mcol11 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iInv_mcol10 >> 24) & 255] << 24);
        int[] iArr3 = iArr[0];
        this.C0 = i19 ^ iArr3[0];
        this.C1 = ((((bArr2[iInv_mcol10 & 255] & 255) ^ ((bArr2[(iInv_mcol9 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iInv_mcol12 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iInv_mcol11 >> 24) & 255] << 24)) ^ iArr3[1];
        this.C2 = ((((bArr2[iInv_mcol11 & 255] & 255) ^ ((bArr2[(iInv_mcol10 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iInv_mcol9 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iInv_mcol12 >> 24) & 255] << 24)) ^ iArr3[2];
        this.C3 = ((((bArr2[iInv_mcol12 & 255] & 255) ^ ((bArr2[(iInv_mcol11 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iInv_mcol10 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iInv_mcol9 >> 24) & 255] << 24)) ^ iArr3[3];
    }

    private void encryptBlock(int[][] iArr) {
        int i11 = this.C0;
        int[] iArr2 = iArr[0];
        int i12 = i11 ^ iArr2[0];
        int i13 = this.C1 ^ iArr2[1];
        int i14 = this.C2 ^ iArr2[2];
        int iMcol = iArr2[3] ^ this.C3;
        int i15 = 1;
        while (i15 < this.ROUNDS - 1) {
            byte[] bArr = S;
            int iMcol2 = mcol((((bArr[i12 & 255] & 255) ^ ((bArr[(i13 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i14 >> 16) & 255] & 255) << 16)) ^ (bArr[(iMcol >> 24) & 255] << 24)) ^ iArr[i15][0];
            int iMcol3 = mcol((((bArr[i13 & 255] & 255) ^ ((bArr[(i14 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iMcol >> 16) & 255] & 255) << 16)) ^ (bArr[(i12 >> 24) & 255] << 24)) ^ iArr[i15][1];
            int iMcol4 = mcol((((bArr[i14 & 255] & 255) ^ ((bArr[(iMcol >> 8) & 255] & 255) << 8)) ^ ((bArr[(i12 >> 16) & 255] & 255) << 16)) ^ (bArr[(i13 >> 24) & 255] << 24)) ^ iArr[i15][2];
            int iMcol5 = mcol(((((bArr[(i12 >> 8) & 255] & 255) << 8) ^ (bArr[iMcol & 255] & 255)) ^ ((bArr[(i13 >> 16) & 255] & 255) << 16)) ^ (bArr[(i14 >> 24) & 255] << 24));
            int i16 = i15 + 1;
            int i17 = iMcol5 ^ iArr[i15][3];
            int iMcol6 = mcol((((bArr[iMcol2 & 255] & 255) ^ ((bArr[(iMcol3 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iMcol4 >> 16) & 255] & 255) << 16)) ^ (bArr[(i17 >> 24) & 255] << 24)) ^ iArr[i16][0];
            int iMcol7 = mcol((((bArr[iMcol3 & 255] & 255) ^ ((bArr[(iMcol4 >> 8) & 255] & 255) << 8)) ^ ((bArr[(i17 >> 16) & 255] & 255) << 16)) ^ (bArr[(iMcol2 >> 24) & 255] << 24)) ^ iArr[i16][1];
            int iMcol8 = mcol((((bArr[iMcol4 & 255] & 255) ^ ((bArr[(i17 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iMcol2 >> 16) & 255] & 255) << 16)) ^ (bArr[(iMcol3 >> 24) & 255] << 24)) ^ iArr[i16][2];
            i15 += 2;
            iMcol = iArr[i16][3] ^ mcol((((bArr[i17 & 255] & 255) ^ ((bArr[(iMcol2 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iMcol3 >> 16) & 255] & 255) << 16)) ^ (bArr[(iMcol4 >> 24) & 255] << 24));
            i12 = iMcol6;
            i13 = iMcol7;
            i14 = iMcol8;
        }
        byte[] bArr2 = S;
        int iMcol9 = mcol((((bArr2[i12 & 255] & 255) ^ ((bArr2[(i13 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i14 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iMcol >> 24) & 255] << 24)) ^ iArr[i15][0];
        int iMcol10 = mcol((((bArr2[i13 & 255] & 255) ^ ((bArr2[(i14 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iMcol >> 16) & 255] & 255) << 16)) ^ (bArr2[(i12 >> 24) & 255] << 24)) ^ iArr[i15][1];
        int iMcol11 = mcol((((bArr2[i14 & 255] & 255) ^ ((bArr2[(iMcol >> 8) & 255] & 255) << 8)) ^ ((bArr2[(i12 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i13 >> 24) & 255] << 24)) ^ iArr[i15][2];
        int iMcol12 = mcol(((((bArr2[(i12 >> 8) & 255] & 255) << 8) ^ (bArr2[iMcol & 255] & 255)) ^ ((bArr2[(i13 >> 16) & 255] & 255) << 16)) ^ (bArr2[(i14 >> 24) & 255] << 24)) ^ iArr[i15][3];
        int i18 = (((bArr2[iMcol9 & 255] & 255) ^ ((bArr2[(iMcol10 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iMcol11 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iMcol12 >> 24) & 255] << 24);
        int[] iArr3 = iArr[i15 + 1];
        this.C0 = iArr3[0] ^ i18;
        this.C1 = ((((bArr2[iMcol10 & 255] & 255) ^ ((bArr2[(iMcol11 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iMcol12 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iMcol9 >> 24) & 255] << 24)) ^ iArr3[1];
        this.C2 = ((((bArr2[iMcol11 & 255] & 255) ^ ((bArr2[(iMcol12 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iMcol9 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iMcol10 >> 24) & 255] << 24)) ^ iArr3[2];
        this.C3 = ((((bArr2[iMcol12 & 255] & 255) ^ ((bArr2[(iMcol9 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(iMcol10 >> 16) & 255] & 255) << 16)) ^ (bArr2[(iMcol11 >> 24) & 255] << 24)) ^ iArr3[3];
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z11) {
        int i11;
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i12 = length >> 2;
        this.ROUNDS = i12 + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i12 + 7, 4);
        if (i12 == 4) {
            i11 = 1;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt2;
            int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt3;
            int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt4;
            for (int i13 = 1; i13 <= 10; i13++) {
                iLittleEndianToInt ^= subWord(shift(iLittleEndianToInt4, 8)) ^ rcon[i13 - 1];
                int[] iArr2 = iArr[i13];
                iArr2[0] = iLittleEndianToInt;
                iLittleEndianToInt2 ^= iLittleEndianToInt;
                iArr2[1] = iLittleEndianToInt2;
                iLittleEndianToInt3 ^= iLittleEndianToInt2;
                iArr2[2] = iLittleEndianToInt3;
                iLittleEndianToInt4 ^= iLittleEndianToInt3;
                iArr2[3] = iLittleEndianToInt4;
            }
        } else if (i12 == 6) {
            i11 = 1;
            int iLittleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt5;
            int iLittleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt6;
            int iLittleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt7;
            int iLittleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt8;
            int iLittleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = iLittleEndianToInt9;
            int iLittleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = iLittleEndianToInt10;
            int iSubWord = iLittleEndianToInt5 ^ (subWord(shift(iLittleEndianToInt10, 8)) ^ 1);
            int[] iArr3 = iArr[1];
            iArr3[2] = iSubWord;
            int i14 = iLittleEndianToInt6 ^ iSubWord;
            iArr3[3] = i14;
            int i15 = iLittleEndianToInt7 ^ i14;
            int[] iArr4 = iArr[2];
            iArr4[0] = i15;
            int i16 = iLittleEndianToInt8 ^ i15;
            iArr4[1] = i16;
            int i17 = iLittleEndianToInt9 ^ i16;
            iArr4[2] = i17;
            int i18 = iLittleEndianToInt10 ^ i17;
            iArr4[3] = i18;
            int i19 = 2;
            for (int i21 = 3; i21 < 12; i21 += 3) {
                int iSubWord2 = iSubWord ^ (subWord(shift(i18, 8)) ^ i19);
                int[] iArr5 = iArr[i21];
                iArr5[0] = iSubWord2;
                int i22 = i14 ^ iSubWord2;
                iArr5[1] = i22;
                int i23 = i15 ^ i22;
                iArr5[2] = i23;
                int i24 = i16 ^ i23;
                iArr5[3] = i24;
                int i25 = i17 ^ i24;
                int i26 = i21 + 1;
                int[] iArr6 = iArr[i26];
                iArr6[0] = i25;
                int i27 = i18 ^ i25;
                iArr6[1] = i27;
                int iSubWord3 = subWord(shift(i27, 8)) ^ (i19 << 1);
                i19 <<= 2;
                iSubWord = iSubWord2 ^ iSubWord3;
                int[] iArr7 = iArr[i26];
                iArr7[2] = iSubWord;
                i14 = i22 ^ iSubWord;
                iArr7[3] = i14;
                i15 = i23 ^ i14;
                int[] iArr8 = iArr[i21 + 2];
                iArr8[0] = i15;
                i16 = i24 ^ i15;
                iArr8[1] = i16;
                i17 = i25 ^ i16;
                iArr8[2] = i17;
                i18 = i27 ^ i17;
                iArr8[3] = i18;
            }
            int iSubWord4 = (subWord(shift(i18, 8)) ^ i19) ^ iSubWord;
            int[] iArr9 = iArr[12];
            iArr9[0] = iSubWord4;
            int i28 = iSubWord4 ^ i14;
            iArr9[1] = i28;
            int i29 = i28 ^ i15;
            iArr9[2] = i29;
            iArr9[3] = i29 ^ i16;
        } else {
            if (i12 != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int iLittleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt11;
            int iLittleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt12;
            int iLittleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt13;
            int iLittleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt14;
            int iLittleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = iLittleEndianToInt15;
            int iLittleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = iLittleEndianToInt16;
            int iLittleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
            iArr[1][2] = iLittleEndianToInt17;
            int iLittleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
            iArr[1][3] = iLittleEndianToInt18;
            int i31 = 1;
            i11 = 1;
            for (int i32 = 2; i32 < 14; i32 += 2) {
                int iSubWord5 = subWord(shift(iLittleEndianToInt18, 8)) ^ i31;
                i31 <<= 1;
                iLittleEndianToInt11 ^= iSubWord5;
                int[] iArr10 = iArr[i32];
                iArr10[0] = iLittleEndianToInt11;
                iLittleEndianToInt12 ^= iLittleEndianToInt11;
                iArr10[1] = iLittleEndianToInt12;
                iLittleEndianToInt13 ^= iLittleEndianToInt12;
                iArr10[2] = iLittleEndianToInt13;
                iLittleEndianToInt14 ^= iLittleEndianToInt13;
                iArr10[3] = iLittleEndianToInt14;
                iLittleEndianToInt15 ^= subWord(iLittleEndianToInt14);
                int[] iArr11 = iArr[i32 + 1];
                iArr11[0] = iLittleEndianToInt15;
                iLittleEndianToInt16 ^= iLittleEndianToInt15;
                iArr11[1] = iLittleEndianToInt16;
                iLittleEndianToInt17 ^= iLittleEndianToInt16;
                iArr11[2] = iLittleEndianToInt17;
                iLittleEndianToInt18 ^= iLittleEndianToInt17;
                iArr11[3] = iLittleEndianToInt18;
            }
            int iSubWord6 = (subWord(shift(iLittleEndianToInt18, 8)) ^ i31) ^ iLittleEndianToInt11;
            int[] iArr12 = iArr[14];
            iArr12[0] = iSubWord6;
            int i33 = iSubWord6 ^ iLittleEndianToInt12;
            iArr12[1] = i33;
            int i34 = i33 ^ iLittleEndianToInt13;
            iArr12[2] = i34;
            iArr12[3] = i34 ^ iLittleEndianToInt14;
        }
        if (!z11) {
            for (int i35 = i11; i35 < this.ROUNDS; i35++) {
                for (int i36 = 0; i36 < 4; i36++) {
                    int[] iArr13 = iArr[i35];
                    iArr13[i36] = inv_mcol(iArr13[i36]);
                }
            }
        }
        return iArr;
    }

    private static int inv_mcol(int i11) {
        int iShift = shift(i11, 8) ^ i11;
        int iFFmulX = i11 ^ FFmulX(iShift);
        int iFFmulX2 = iShift ^ FFmulX2(iFFmulX);
        return iFFmulX ^ (iFFmulX2 ^ shift(iFFmulX2, 16));
    }

    private static int mcol(int i11) {
        int iShift = shift(i11, 8);
        int i12 = i11 ^ iShift;
        return FFmulX(i12) ^ (iShift ^ shift(i12, 16));
    }

    private void packBlock(byte[] bArr, int i11) {
        int i12 = this.C0;
        bArr[i11] = (byte) i12;
        bArr[i11 + 1] = (byte) (i12 >> 8);
        bArr[i11 + 2] = (byte) (i12 >> 16);
        bArr[i11 + 3] = (byte) (i12 >> 24);
        int i13 = this.C1;
        bArr[i11 + 4] = (byte) i13;
        bArr[i11 + 5] = (byte) (i13 >> 8);
        bArr[i11 + 6] = (byte) (i13 >> 16);
        bArr[i11 + 7] = (byte) (i13 >> 24);
        int i14 = this.C2;
        bArr[i11 + 8] = (byte) i14;
        bArr[i11 + 9] = (byte) (i14 >> 8);
        bArr[i11 + 10] = (byte) (i14 >> 16);
        bArr[i11 + 11] = (byte) (i14 >> 24);
        int i15 = this.C3;
        bArr[i11 + 12] = (byte) i15;
        bArr[i11 + 13] = (byte) (i15 >> 8);
        bArr[i11 + 14] = (byte) (i15 >> 16);
        bArr[i11 + 15] = (byte) (i15 >> 24);
    }

    private static int shift(int i11, int i12) {
        return (i11 << (-i12)) | (i11 >>> i12);
    }

    private static int subWord(int i11) {
        byte[] bArr = S;
        return (bArr[(i11 >> 24) & 255] << 24) | (bArr[i11 & 255] & 255) | ((bArr[(i11 >> 8) & 255] & 255) << 8) | ((bArr[(i11 >> 16) & 255] & 255) << 16);
    }

    private void unpackBlock(byte[] bArr, int i11) {
        int i12 = bArr[i11] & 255;
        this.C0 = i12;
        int i13 = ((bArr[i11 + 1] & 255) << 8) | i12;
        this.C0 = i13;
        int i14 = i13 | ((bArr[i11 + 2] & 255) << 16);
        this.C0 = i14;
        this.C0 = i14 | (bArr[i11 + 3] << 24);
        int i15 = bArr[i11 + 4] & 255;
        this.C1 = i15;
        int i16 = ((bArr[i11 + 5] & 255) << 8) | i15;
        this.C1 = i16;
        int i17 = i16 | ((bArr[i11 + 6] & 255) << 16);
        this.C1 = i17;
        this.C1 = i17 | (bArr[i11 + 7] << 24);
        int i18 = bArr[i11 + 8] & 255;
        this.C2 = i18;
        int i19 = ((bArr[i11 + 9] & 255) << 8) | i18;
        this.C2 = i19;
        int i21 = i19 | ((bArr[i11 + 10] & 255) << 16);
        this.C2 = i21;
        this.C2 = i21 | (bArr[i11 + 11] << 24);
        int i22 = bArr[i11 + 12] & 255;
        this.C3 = i22;
        int i23 = ((bArr[i11 + 13] & 255) << 8) | i22;
        this.C3 = i23;
        int i24 = i23 | ((bArr[i11 + 14] & 255) << 16);
        this.C3 = i24;
        this.C3 = (bArr[i11 + 15] << 24) | i24;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z11);
            this.forEncryption = z11;
        } else {
            throw new IllegalArgumentException("invalid parameter passed to AES init - " + cipherParameters.getClass().getName());
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.WorkingKey == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i11 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.forEncryption) {
            unpackBlock(bArr, i11);
            encryptBlock(this.WorkingKey);
            packBlock(bArr2, i12);
            return 16;
        }
        unpackBlock(bArr, i11);
        decryptBlock(this.WorkingKey);
        packBlock(bArr2, i12);
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
