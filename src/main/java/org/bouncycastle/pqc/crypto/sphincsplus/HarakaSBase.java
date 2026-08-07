package org.bouncycastle.pqc.crypto.sphincsplus;

import java.lang.reflect.Array;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.util.Arrays;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes10.dex */
class HarakaSBase {
    protected long[][] haraka512_rc = {new long[]{2652350495371256459L, -4767360454786055294L, -2778808723033108313L, -6138960262205972599L, 4944264682582508575L, 5312892415214084856L, 390034814247088728L, 2584105839607850161L}, new long[]{-2829930801980875922L, 9137660425067592590L, 7974068014816832049L, -4665944065725157058L, 2602240152241800734L, -1525694355931290902L, 8634660511727056099L, 1757945485816280992L}, new long[]{1181946526362588450L, -2765192619992380293L, 3395396416743122529L, -5116273100549372423L, -1285454309797503998L, -3363297609815171261L, -8360835858392998991L, -2371352336613968487L}, new long[]{-2500853454776756032L, 8465221333286591414L, 8817016078209461823L, 9067727467981428858L, 4244107674518258433L, -4347326460570889538L, 1711371409274742987L, 6486926172609168623L}, new long[]{1689001080716996467L, -491496126278250673L, 1273395568185090836L, 5805238412293617850L, -3441289770925384855L, 4592753210857527691L, 7062886034259989751L, -7974393977033172556L}, new long[]{-797818098819718290L, -41460260651793472L, 476036171179798187L, 7391697506481003962L, -855662275170689475L, -3489340839585811635L, -4891525734487956488L, 9110006695579921767L}, new long[]{-886938081943560790L, 4212830408327159617L, -3546674487567282635L, -1955379422127038289L, 3174578079917510314L, 5156046680874954380L, -318545805834821831L, -6176414008149462342L}, new long[]{2529785914229181047L, 2966313764524854080L, 6363694428402697361L, 8292109690175819701L, -8497546332135459587L, -3211108476154815616L, -5526938793786642321L, -4975969843627057770L}, new long[]{3357847021085574721L, -4764837212565187058L, -626391829400648692L, 2124133995575340009L, 7425858999829294301L, -3432032868905637771L, 1119301198758921294L, 1907812968586478892L}, new long[]{-8986524826712832802L, 3356175496741300052L, -5764600317639896362L, 4002747967109689317L, -8718925159733497197L, -1938063772587374661L, -8003749789895945835L, 7302960353763723932L}};
    protected int[][] haraka256_rc = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 10, 8);
    protected final byte[] buffer = new byte[64];
    protected int off = 0;

    protected HarakaSBase() {
    }

    private void Swapn(long[] jArr, int i11, int i12, int i13) {
        long j11;
        long j12;
        if (i11 == 1) {
            j11 = 6148914691236517205L;
            j12 = -6148914691236517206L;
        } else if (i11 == 2) {
            j11 = 3689348814741910323L;
            j12 = -3689348814741910324L;
        } else {
            if (i11 != 4) {
                return;
            }
            j11 = 1085102592571150095L;
            j12 = -1085102592571150096L;
        }
        long j13 = jArr[i12];
        long j14 = jArr[i13];
        jArr[i12] = ((j11 & j14) << i11) | (j13 & j11);
        jArr[i13] = ((j13 & j12) >>> i11) | (j14 & j12);
    }

    private void Swapn32(int[] iArr, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (i11 == 1) {
            i14 = 1431655765;
            i15 = -1431655766;
        } else if (i11 == 2) {
            i14 = 858993459;
            i15 = -858993460;
        } else if (i11 != 4) {
            i14 = 0;
            i15 = 0;
        } else {
            i14 = 252645135;
            i15 = -252645136;
        }
        int i16 = iArr[i12];
        int i17 = iArr[i13];
        iArr[i12] = ((i14 & i17) << i11) | (i16 & i14);
        iArr[i13] = ((i16 & i15) >>> i11) | (i17 & i15);
    }

    private void addRoundKey(long[] jArr, long[] jArr2) {
        jArr[0] = jArr[0] ^ jArr2[0];
        jArr[1] = jArr[1] ^ jArr2[1];
        jArr[2] = jArr[2] ^ jArr2[2];
        jArr[3] = jArr[3] ^ jArr2[3];
        jArr[4] = jArr[4] ^ jArr2[4];
        jArr[5] = jArr[5] ^ jArr2[5];
        jArr[6] = jArr[6] ^ jArr2[6];
        jArr[7] = jArr[7] ^ jArr2[7];
    }

    private void addRoundKey32(int[] iArr, int[] iArr2) {
        iArr[0] = iArr[0] ^ iArr2[0];
        iArr[1] = iArr[1] ^ iArr2[1];
        iArr[2] = iArr[2] ^ iArr2[2];
        iArr[3] = iArr[3] ^ iArr2[3];
        iArr[4] = iArr[4] ^ iArr2[4];
        iArr[5] = iArr[5] ^ iArr2[5];
        iArr[6] = iArr[6] ^ iArr2[6];
        iArr[7] = iArr2[7] ^ iArr[7];
    }

    private void brAesCt64BitsliceSbox(long[] jArr) {
        long j11 = jArr[7];
        long j12 = jArr[6];
        long j13 = jArr[5];
        long j14 = jArr[4];
        long j15 = jArr[3];
        long j16 = jArr[2];
        long j17 = jArr[1];
        long j18 = jArr[0];
        long j19 = j14 ^ j16;
        long j21 = j11 ^ j17;
        long j22 = j11 ^ j14;
        long j23 = j11 ^ j16;
        long j24 = j13 ^ j12;
        long j25 = j24 ^ j18;
        long j26 = j25 ^ j14;
        long j27 = j21 ^ j19;
        long j28 = j25 ^ j11;
        long j29 = j25 ^ j17;
        long j31 = j29 ^ j23;
        long j32 = j15 ^ j27;
        long j33 = j32 ^ j16;
        long j34 = j12 ^ j32;
        long j35 = j33 ^ j18;
        long j36 = j33 ^ j24;
        long j37 = j34 ^ j22;
        long j38 = j18 ^ j37;
        long j39 = j36 ^ j37;
        long j41 = j24 ^ j37;
        long j42 = j27 & j33;
        long j43 = (j31 & j35) ^ j42;
        long j44 = j21 & j41;
        long j45 = (j29 & j25) ^ j44;
        long j46 = j22 & j37;
        long j47 = (j19 & j39) ^ j46;
        long j48 = (j23 & j36) ^ j46;
        long j49 = (j43 ^ j47) ^ j34;
        long j51 = (((j26 & j18) ^ j42) ^ j48) ^ (j36 ^ j23);
        long j52 = (j45 ^ j47) ^ (j21 ^ j41);
        long j53 = (((j28 & j38) ^ j44) ^ j48) ^ (j11 ^ j41);
        long j54 = j49 ^ j51;
        long j55 = j49 & j52;
        long j56 = j53 ^ j55;
        long j57 = (j54 & j56) ^ j51;
        long j58 = ((j51 ^ j55) & (j52 ^ j53)) ^ j53;
        long j59 = j53 & (j56 ^ j58);
        long j61 = j59 ^ (j52 ^ j58);
        long j62 = j54 ^ (j57 & (j56 ^ j59));
        long j63 = j62 ^ j61;
        long j64 = j57 ^ j58;
        long j65 = j57 ^ j62;
        long j66 = j58 ^ j61;
        long j67 = j64 ^ j63;
        long j68 = j58 & j18;
        long j69 = j65 & j41;
        long j71 = j62 & j25;
        long j72 = j57 & j38;
        long j73 = j67 & j39;
        long j74 = j61 & j31;
        long j75 = j58 & j26;
        long j76 = j65 & j21;
        long j77 = j62 & j29;
        long j78 = j64 & j22;
        long j79 = j67 & j19;
        long j81 = j63 & j23;
        long j82 = j78 ^ j79;
        long j83 = j72 ^ j77;
        long j84 = (j66 & j27) ^ j74;
        long j85 = (j66 & j33) ^ j69;
        long j86 = j79 ^ j81;
        long j87 = (j68 ^ j76) ^ j85;
        long j88 = j71 ^ j82;
        long j89 = j69 ^ ((j64 & j37) ^ j73);
        long j91 = j82 ^ j87;
        long j92 = (j57 & j28) ^ j87;
        long j93 = (j73 ^ (j63 & j36)) ^ j88;
        long j94 = j84 ^ j88;
        long j95 = j71 ^ j89;
        long j96 = j92 ^ j93;
        long j97 = (j61 & j35) ^ j94;
        long j98 = (~j93) ^ (j76 ^ j83);
        long j99 = j83 ^ (~j91);
        long j100 = j85 ^ j97;
        long j101 = j95 ^ (~j100);
        long j102 = j86 ^ (~(j95 ^ j96));
        jArr[7] = j89 ^ j94;
        jArr[6] = j101;
        jArr[5] = j102;
        jArr[4] = j100;
        jArr[3] = (j68 ^ j72) ^ j97;
        jArr[2] = (j74 ^ j75) ^ j96;
        jArr[1] = j98;
        jArr[0] = j99;
    }

    private void brAesCt64InterleaveIn(long[] jArr, int i11, int[] iArr, int i12) {
        long j11 = ((long) iArr[i12]) & 4294967295L;
        long j12 = ((long) iArr[i12 + 1]) & 4294967295L;
        long j13 = ((long) iArr[i12 + 2]) & 4294967295L;
        long j14 = ((long) iArr[i12 + 3]) & 4294967295L;
        long j15 = (j11 | (j11 << 16)) & 281470681808895L;
        long j16 = (j12 | (j12 << 16)) & 281470681808895L;
        long j17 = (j13 | (j13 << 16)) & 281470681808895L;
        long j18 = (j14 | (j14 << 16)) & 281470681808895L;
        jArr[i11] = ((j15 | (j15 << 8)) & 71777214294589695L) | (((j17 | (j17 << 8)) & 71777214294589695L) << 8);
        long j19 = ((j18 | (j18 << 8)) & 71777214294589695L) << 8;
        jArr[i11 + 4] = j19 | ((j16 | (j16 << 8)) & 71777214294589695L);
    }

    private void brAesCt64InterleaveOut(int[] iArr, long[] jArr, int i11) {
        long j11 = jArr[i11];
        long j12 = j11 & 71777214294589695L;
        long j13 = jArr[i11 + 4];
        long j14 = j13 & 71777214294589695L;
        long j15 = (j11 >>> 8) & 71777214294589695L;
        long j16 = 71777214294589695L & (j13 >>> 8);
        long j17 = (j12 | (j12 >>> 8)) & 281470681808895L;
        long j18 = ((j14 >>> 8) | j14) & 281470681808895L;
        long j19 = (j15 | (j15 >>> 8)) & 281470681808895L;
        long j21 = (j16 | (j16 >>> 8)) & 281470681808895L;
        int i12 = i11 << 2;
        iArr[i12] = (int) (j17 | (j17 >>> 16));
        iArr[i12 + 1] = (int) (j18 | (j18 >>> 16));
        iArr[i12 + 2] = (int) (j19 | (j19 >>> 16));
        iArr[i12 + 3] = (int) ((j21 >>> 16) | j21);
    }

    private void brAesCt64Ortho(long[] jArr) {
        Swapn(jArr, 1, 0, 1);
        Swapn(jArr, 1, 2, 3);
        Swapn(jArr, 1, 4, 5);
        Swapn(jArr, 1, 6, 7);
        Swapn(jArr, 2, 0, 2);
        Swapn(jArr, 2, 1, 3);
        Swapn(jArr, 2, 4, 6);
        Swapn(jArr, 2, 5, 7);
        Swapn(jArr, 4, 0, 4);
        Swapn(jArr, 4, 1, 5);
        Swapn(jArr, 4, 2, 6);
        Swapn(jArr, 4, 3, 7);
    }

    private static void brAesCtBitsliceSbox(int[] iArr) {
        int i11 = iArr[7];
        int i12 = iArr[6];
        int i13 = iArr[5];
        int i14 = iArr[4];
        int i15 = iArr[3];
        int i16 = iArr[2];
        int i17 = iArr[1];
        int i18 = iArr[0];
        int i19 = i14 ^ i16;
        int i21 = i11 ^ i17;
        int i22 = i11 ^ i14;
        int i23 = i11 ^ i16;
        int i24 = i13 ^ i12;
        int i25 = i24 ^ i18;
        int i26 = i25 ^ i14;
        int i27 = i21 ^ i19;
        int i28 = i25 ^ i11;
        int i29 = i25 ^ i17;
        int i31 = i29 ^ i23;
        int i32 = i15 ^ i27;
        int i33 = i16 ^ i32;
        int i34 = i12 ^ i32;
        int i35 = i33 ^ i18;
        int i36 = i33 ^ i24;
        int i37 = i34 ^ i22;
        int i38 = i18 ^ i37;
        int i39 = i36 ^ i37;
        int i41 = i24 ^ i37;
        int i42 = i27 & i33;
        int i43 = (i31 & i35) ^ i42;
        int i44 = i21 & i41;
        int i45 = (i29 & i25) ^ i44;
        int i46 = i22 & i37;
        int i47 = (i19 & i39) ^ i46;
        int i48 = (i23 & i36) ^ i46;
        int i49 = (i43 ^ i47) ^ i34;
        int i51 = (((i26 & i18) ^ i42) ^ i48) ^ (i36 ^ i23);
        int i52 = (i45 ^ i47) ^ (i21 ^ i41);
        int i53 = (((i28 & i38) ^ i44) ^ i48) ^ (i11 ^ i41);
        int i54 = i49 ^ i51;
        int i55 = i49 & i52;
        int i56 = i53 ^ i55;
        int i57 = (i54 & i56) ^ i51;
        int i58 = ((i51 ^ i55) & (i52 ^ i53)) ^ i53;
        int i59 = i53 & (i56 ^ i58);
        int i61 = i59 ^ (i52 ^ i58);
        int i62 = i54 ^ (i57 & (i56 ^ i59));
        int i63 = i62 ^ i61;
        int i64 = i57 ^ i58;
        int i65 = i57 ^ i62;
        int i66 = i58 ^ i61;
        int i67 = i64 ^ i63;
        int i68 = i18 & i58;
        int i69 = i65 & i41;
        int i71 = i62 & i25;
        int i72 = i57 & i38;
        int i73 = i67 & i39;
        int i74 = i61 & i31;
        int i75 = i58 & i26;
        int i76 = i65 & i21;
        int i77 = i62 & i29;
        int i78 = i64 & i22;
        int i79 = i67 & i19;
        int i81 = i63 & i23;
        int i82 = i78 ^ i79;
        int i83 = i72 ^ i77;
        int i84 = (i66 & i27) ^ i74;
        int i85 = (i66 & i33) ^ i69;
        int i86 = i79 ^ i81;
        int i87 = (i68 ^ i76) ^ i85;
        int i88 = i71 ^ i82;
        int i89 = i69 ^ ((i64 & i37) ^ i73);
        int i91 = i82 ^ i87;
        int i92 = (i57 & i28) ^ i87;
        int i93 = (i73 ^ (i63 & i36)) ^ i88;
        int i94 = i84 ^ i88;
        int i95 = i71 ^ i89;
        int i96 = i92 ^ i93;
        int i97 = (i61 & i35) ^ i94;
        int i98 = (~i93) ^ (i76 ^ i83);
        int i99 = (~i91) ^ i83;
        int i100 = i85 ^ i97;
        int i101 = i95 ^ (~i100);
        int i102 = i86 ^ (~(i95 ^ i96));
        iArr[7] = i89 ^ i94;
        iArr[6] = i101;
        iArr[5] = i102;
        iArr[4] = i100;
        iArr[3] = i97 ^ (i68 ^ i72);
        iArr[2] = (i74 ^ i75) ^ i96;
        iArr[1] = i98;
        iArr[0] = i99;
    }

    private void brAesCtOrtho(int[] iArr) {
        Swapn32(iArr, 1, 0, 1);
        Swapn32(iArr, 1, 2, 3);
        Swapn32(iArr, 1, 4, 5);
        Swapn32(iArr, 1, 6, 7);
        Swapn32(iArr, 2, 0, 2);
        Swapn32(iArr, 2, 1, 3);
        Swapn32(iArr, 2, 4, 6);
        Swapn32(iArr, 2, 5, 7);
        Swapn32(iArr, 4, 0, 4);
        Swapn32(iArr, 4, 1, 5);
        Swapn32(iArr, 4, 2, 6);
        Swapn32(iArr, 4, 3, 7);
    }

    private int brDec32Le(byte[] bArr, int i11) {
        return (bArr[i11 + 3] << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) | ((bArr[i11 + 2] << Tnaf.POW_2_WIDTH) & 16711680);
    }

    private void brEnc32Le(byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < 4; i13++) {
            bArr[i12 + i13] = (byte) (i11 >> (i13 << 3));
        }
    }

    private void brRangeDec32Le(byte[] bArr, int[] iArr, int i11) {
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = (i12 << 2) + i11;
            iArr[i12] = (bArr[i13 + 3] << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) | ((bArr[i13 + 2] << 16) & 16711680);
        }
    }

    private void mixColumns(long[] jArr) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        long j13 = jArr[2];
        long j14 = jArr[3];
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        long j19 = (j11 >>> 16) | (j11 << 48);
        long j21 = (j12 >>> 16) | (j12 << 48);
        long j22 = (j13 >>> 16) | (j13 << 48);
        long j23 = (j14 >>> 16) | (j14 << 48);
        long j24 = (j15 >>> 16) | (j15 << 48);
        long j25 = (j16 >>> 16) | (j16 << 48);
        long j26 = (j17 >>> 16) | (j17 << 48);
        long j27 = (j18 >>> 16) | (j18 << 48);
        long j28 = j18 ^ j27;
        long j29 = j11 ^ j19;
        jArr[0] = (j28 ^ j19) ^ rotr32(j29);
        long j31 = j12 ^ j21;
        jArr[1] = (((j29 ^ j18) ^ j27) ^ j21) ^ rotr32(j31);
        long j32 = j13 ^ j22;
        jArr[2] = (j31 ^ j22) ^ rotr32(j32);
        long j33 = ((j32 ^ j18) ^ j27) ^ j23;
        long j34 = j14 ^ j23;
        jArr[3] = j33 ^ rotr32(j34);
        long j35 = ((j34 ^ j18) ^ j27) ^ j24;
        long j36 = j15 ^ j24;
        jArr[4] = j35 ^ rotr32(j36);
        long j37 = j36 ^ j25;
        long j38 = j16 ^ j25;
        jArr[5] = j37 ^ rotr32(j38);
        long j39 = j38 ^ j26;
        long j41 = j17 ^ j26;
        jArr[6] = j39 ^ rotr32(j41);
        jArr[7] = rotr32(j28) ^ (j41 ^ j27);
    }

    private void mixColumns32(int[] iArr) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = (i11 >>> 8) | (i11 << 24);
        int i21 = (i12 >>> 8) | (i12 << 24);
        int i22 = (i13 >>> 8) | (i13 << 24);
        int i23 = (i14 >>> 8) | (i14 << 24);
        int i24 = (i15 >>> 8) | (i15 << 24);
        int i25 = (i16 >>> 8) | (i16 << 24);
        int i26 = (i17 >>> 8) | (i17 << 24);
        int i27 = (i18 >>> 8) | (i18 << 24);
        int i28 = i18 ^ i27;
        int i29 = i11 ^ i19;
        iArr[0] = (i28 ^ i19) ^ rotr16(i29);
        int i31 = i12 ^ i21;
        iArr[1] = (((i29 ^ i18) ^ i27) ^ i21) ^ rotr16(i31);
        int i32 = i13 ^ i22;
        iArr[2] = (i31 ^ i22) ^ rotr16(i32);
        int i33 = ((i32 ^ i18) ^ i27) ^ i23;
        int i34 = i14 ^ i23;
        iArr[3] = i33 ^ rotr16(i34);
        int i35 = ((i34 ^ i18) ^ i27) ^ i24;
        int i36 = i15 ^ i24;
        iArr[4] = i35 ^ rotr16(i36);
        int i37 = i36 ^ i25;
        int i38 = i16 ^ i25;
        iArr[5] = i37 ^ rotr16(i38);
        int i39 = i38 ^ i26;
        int i41 = i17 ^ i26;
        iArr[6] = i39 ^ rotr16(i41);
        iArr[7] = rotr16(i28) ^ (i41 ^ i27);
    }

    private int rotr16(int i11) {
        return (i11 >>> 16) | (i11 << 16);
    }

    private long rotr32(long j11) {
        return (j11 >>> 32) | (j11 << 32);
    }

    private void shiftRows(long[] jArr) {
        for (int i11 = 0; i11 < jArr.length; i11++) {
            long j11 = jArr[i11];
            jArr[i11] = ((j11 & 1152640029630136320L) << 4) | (WebSocketProtocol.PAYLOAD_SHORT_MAX & j11) | ((4293918720L & j11) >>> 4) | ((983040 & j11) << 12) | ((280375465082880L & j11) >>> 8) | ((1095216660480L & j11) << 8) | (((-1152921504606846976L) & j11) >>> 12);
        }
    }

    private void shiftRows32(int[] iArr) {
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = iArr[i11];
            iArr[i11] = ((i12 & 1056964608) << 2) | (i12 & 255) | ((64512 & i12) >>> 2) | ((i12 & 768) << 6) | ((15728640 & i12) >>> 4) | ((983040 & i12) << 4) | (((-1073741824) & i12) >>> 6);
        }
    }

    protected static void xor(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13, int i14) {
        for (int i15 = 0; i15 < i14; i15++) {
            bArr3[i13 + i15] = (byte) (bArr[i11 + i15] ^ bArr2[i12 + i15]);
        }
    }

    protected void haraka256Perm(byte[] bArr) {
        int[] iArr = new int[8];
        interleaveConstant32(iArr, this.buffer, 0);
        for (int i11 = 0; i11 < 5; i11++) {
            for (int i12 = 0; i12 < 2; i12++) {
                brAesCtBitsliceSbox(iArr);
                shiftRows32(iArr);
                mixColumns32(iArr);
                addRoundKey32(iArr, this.haraka256_rc[(i11 << 1) + i12]);
            }
            for (int i13 = 0; i13 < 8; i13++) {
                int i14 = iArr[i13];
                iArr[i13] = ((i14 & 1077952576) >>> 1) | ((-2122219135) & i14) | ((33686018 & i14) << 1) | ((67372036 & i14) << 2) | ((134744072 & i14) << 3) | ((269488144 & i14) >>> 3) | ((538976288 & i14) >>> 2);
            }
        }
        brAesCtOrtho(iArr);
        for (int i15 = 0; i15 < 4; i15++) {
            int i16 = i15 << 1;
            int i17 = i15 << 2;
            brEnc32Le(bArr, iArr[i16], i17);
            brEnc32Le(bArr, iArr[i16 + 1], i17 + 16);
        }
    }

    protected void haraka512Perm(byte[] bArr) {
        int[] iArr = new int[16];
        long[] jArr = new long[8];
        brRangeDec32Le(this.buffer, iArr, 0);
        for (int i11 = 0; i11 < 4; i11++) {
            brAesCt64InterleaveIn(jArr, i11, iArr, i11 << 2);
        }
        brAesCt64Ortho(jArr);
        for (int i12 = 0; i12 < 5; i12++) {
            for (int i13 = 0; i13 < 2; i13++) {
                brAesCt64BitsliceSbox(jArr);
                shiftRows(jArr);
                mixColumns(jArr);
                addRoundKey(jArr, this.haraka512_rc[(i12 << 1) + i13]);
            }
            for (int i14 = 0; i14 < 8; i14++) {
                long j11 = jArr[i14];
                jArr[i14] = ((j11 & (-8934996522953571328L)) >>> 3) | ((281479271743489L & j11) << 5) | ((562958543486978L & j11) << 12) | ((1125917086973956L & j11) >>> 1) | ((2251834173947912L & j11) << 6) | ((9007336695791648L & j11) << 9) | ((18014673391583296L & j11) >>> 4) | ((36029346783166592L & j11) << 3) | ((2377936887688995072L & j11) >>> 5) | ((148621055480562192L & j11) << 2) | ((576469548530665472L & j11) << 4) | ((1152939097061330944L & j11) >>> 12) | ((4611756388245323776L & j11) >>> 10);
            }
        }
        brAesCt64Ortho(jArr);
        for (int i15 = 0; i15 < 4; i15++) {
            brAesCt64InterleaveOut(iArr, jArr, i15);
        }
        for (int i16 = 0; i16 < 16; i16++) {
            for (int i17 = 0; i17 < 4; i17++) {
                bArr[(i16 << 2) + i17] = (byte) ((iArr[i16] >>> (i17 << 3)) & 255);
            }
        }
    }

    protected void interleaveConstant(long[] jArr, byte[] bArr, int i11) {
        int[] iArr = new int[16];
        brRangeDec32Le(bArr, iArr, i11);
        for (int i12 = 0; i12 < 4; i12++) {
            brAesCt64InterleaveIn(jArr, i12, iArr, i12 << 2);
        }
        brAesCt64Ortho(jArr);
    }

    protected void interleaveConstant32(int[] iArr, byte[] bArr, int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = i12 << 1;
            int i14 = (i12 << 2) + i11;
            iArr[i13] = brDec32Le(bArr, i14);
            iArr[i13 + 1] = brDec32Le(bArr, i14 + 16);
        }
        brAesCtOrtho(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void reset() {
        this.off = 0;
        Arrays.clear(this.buffer);
    }
}
