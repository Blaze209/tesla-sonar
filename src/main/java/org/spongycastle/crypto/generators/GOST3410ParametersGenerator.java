package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.params.GOST3410Parameters;
import org.spongycastle.crypto.params.GOST3410ValidationParameters;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes10.dex */
public class GOST3410ParametersGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private SecureRandom init_random;
    private int size;
    private int typeproc;

    private int procedure_A(int i11, int i12, BigInteger[] bigIntegerArr, int i13) {
        int i14;
        BigInteger[] bigIntegerArr2;
        int i15;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        int iNextInt = i11;
        while (true) {
            if (iNextInt >= 0 && iNextInt <= 65536) {
                break;
            }
            iNextInt = this.init_random.nextInt() / 32768;
        }
        int iNextInt2 = i12;
        while (true) {
            i14 = 1;
            if (iNextInt2 >= 0 && iNextInt2 <= 65536 && iNextInt2 / 2 != 0) {
                break;
            }
            iNextInt2 = (this.init_random.nextInt() / 32768) + 1;
        }
        BigInteger bigInteger3 = new BigInteger(Integer.toString(iNextInt2));
        BigInteger bigInteger4 = new BigInteger("19381");
        BigInteger bigInteger5 = new BigInteger(Integer.toString(iNextInt));
        int i16 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger5};
        int[] iArr = {i13};
        int i17 = 0;
        int i18 = 0;
        while (iArr[i17] >= 17) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i18 = i17 + 1;
            iArr[i18] = iArr[i17] / 2;
            i17 = i18;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i18 + 1];
        int i19 = 16;
        bigIntegerArr4[i18] = new BigInteger("8003", 16);
        int i21 = i18 - 1;
        int i22 = 0;
        while (i22 < i18) {
            int i23 = iArr[i21] / i19;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i16, bigIntegerArr5, i16, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i23 + 1];
                System.arraycopy(bigIntegerArr5, i16, bigIntegerArr2, i16, length2);
                int i24 = i16;
                while (i24 < i23) {
                    int i25 = i24 + 1;
                    bigIntegerArr2[i25] = bigIntegerArr2[i24].multiply(bigInteger4).add(bigInteger3).mod(TWO.pow(i19));
                    i24 = i25;
                }
                BigInteger bigInteger6 = new BigInteger(WebrtcBuildVersion.maint_version);
                int i26 = i16;
                while (i26 < i23) {
                    bigInteger6 = bigInteger6.add(bigIntegerArr2[i26].multiply(TWO.pow(i26 * 16)));
                    i26++;
                    i16 = i16;
                }
                i15 = i16;
                bigIntegerArr2[i15] = bigIntegerArr2[i23];
                BigInteger bigInteger7 = TWO;
                int i27 = i21 + 1;
                BigInteger bigIntegerAdd = bigInteger7.pow(iArr[i21] - i14).divide(bigIntegerArr4[i27]).add(bigInteger7.pow(iArr[i21] - i14).multiply(bigInteger6).divide(bigIntegerArr4[i27].multiply(bigInteger7.pow(i23 * 16))));
                BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger7);
                BigInteger bigInteger8 = ONE;
                if (bigIntegerMod.compareTo(bigInteger8) == 0) {
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger8);
                }
                BigInteger bigInteger9 = bigIntegerAdd;
                int i28 = i15;
                while (true) {
                    bigInteger = bigInteger3;
                    bigInteger2 = bigInteger4;
                    long j11 = i28;
                    BigInteger bigIntegerMultiply = bigIntegerArr4[i27].multiply(bigInteger9.add(BigInteger.valueOf(j11)));
                    BigInteger bigInteger10 = ONE;
                    BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger10);
                    bigIntegerArr4[i21] = bigIntegerAdd2;
                    BigInteger bigInteger11 = TWO;
                    int i29 = i28;
                    if (bigIntegerAdd2.compareTo(bigInteger11.pow(iArr[i21])) != 1) {
                        if (bigInteger11.modPow(bigIntegerArr4[i27].multiply(bigInteger9.add(BigInteger.valueOf(j11))), bigIntegerArr4[i21]).compareTo(bigInteger10) == 0 && bigInteger11.modPow(bigInteger9.add(BigInteger.valueOf(j11)), bigIntegerArr4[i21]).compareTo(bigInteger10) != 0) {
                            break;
                        }
                        i28 = i29 + 2;
                        bigInteger3 = bigInteger;
                        bigInteger4 = bigInteger2;
                    } else {
                        i16 = i15;
                        i14 = 1;
                        bigInteger3 = bigInteger;
                        bigInteger4 = bigInteger2;
                        bigIntegerArr3 = bigIntegerArr2;
                        i19 = 16;
                    }
                }
            }
            i21--;
            if (i21 < 0) {
                bigIntegerArr[i15] = bigIntegerArr4[i15];
                bigIntegerArr[1] = bigIntegerArr4[1];
                return bigIntegerArr2[i15].intValue();
            }
            i22++;
            i16 = i15;
            bigInteger3 = bigInteger;
            bigInteger4 = bigInteger2;
            bigIntegerArr3 = bigIntegerArr2;
            i14 = 1;
            i19 = 16;
        }
        return bigIntegerArr3[i16].intValue();
    }

    private long procedure_Aa(long j11, long j12, BigInteger[] bigIntegerArr, int i11) {
        int i12;
        BigInteger[] bigIntegerArr2;
        int i13;
        int[] iArr;
        BigInteger bigInteger;
        long jNextInt = j11;
        while (true) {
            if (jNextInt >= 0 && jNextInt <= 4294967296L) {
                break;
            }
            jNextInt = this.init_random.nextInt() * 2;
        }
        long jNextInt2 = j12;
        while (true) {
            i12 = 1;
            if (jNextInt2 >= 0 && jNextInt2 <= 4294967296L && jNextInt2 / 2 != 0) {
                break;
            }
            jNextInt2 = (this.init_random.nextInt() * 2) + 1;
        }
        BigInteger bigInteger2 = new BigInteger(Long.toString(jNextInt2));
        BigInteger bigInteger3 = new BigInteger("97781173");
        BigInteger bigInteger4 = new BigInteger(Long.toString(jNextInt));
        int i14 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger4};
        int[] iArr2 = {i11};
        int i15 = 0;
        int i16 = 0;
        while (iArr2[i15] >= 33) {
            int length = iArr2.length + 1;
            int[] iArr3 = new int[length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            iArr2 = new int[length];
            System.arraycopy(iArr3, 0, iArr2, 0, length);
            i16 = i15 + 1;
            iArr2[i16] = iArr2[i15] / 2;
            i15 = i16;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i16 + 1];
        bigIntegerArr4[i16] = new BigInteger("8000000B", 16);
        int i17 = i16 - 1;
        int i18 = 0;
        while (i18 < i16) {
            int i19 = 32;
            int i21 = iArr2[i17] / 32;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i14, bigIntegerArr5, i14, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i21 + 1];
                System.arraycopy(bigIntegerArr5, i14, bigIntegerArr2, i14, length2);
                int i22 = i14;
                while (i22 < i21) {
                    int i23 = i22 + 1;
                    bigIntegerArr2[i23] = bigIntegerArr2[i22].multiply(bigInteger3).add(bigInteger2).mod(TWO.pow(i19));
                    i22 = i23;
                }
                BigInteger bigInteger5 = new BigInteger(WebrtcBuildVersion.maint_version);
                int i24 = i14;
                while (i24 < i21) {
                    bigInteger5 = bigInteger5.add(bigIntegerArr2[i24].multiply(TWO.pow(i24 * 32)));
                    i24++;
                    i14 = i14;
                }
                i13 = i14;
                bigIntegerArr2[i13] = bigIntegerArr2[i21];
                BigInteger bigInteger6 = TWO;
                int i25 = i17 + 1;
                BigInteger bigIntegerAdd = bigInteger6.pow(iArr2[i17] - i12).divide(bigIntegerArr4[i25]).add(bigInteger6.pow(iArr2[i17] - i12).multiply(bigInteger5).divide(bigIntegerArr4[i25].multiply(bigInteger6.pow(i21 * 32))));
                BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger6);
                BigInteger bigInteger7 = ONE;
                if (bigIntegerMod.compareTo(bigInteger7) == 0) {
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger7);
                }
                BigInteger bigInteger8 = bigIntegerAdd;
                int i26 = i13;
                while (true) {
                    iArr = iArr2;
                    bigInteger = bigInteger2;
                    long j13 = i26;
                    BigInteger bigIntegerMultiply = bigIntegerArr4[i25].multiply(bigInteger8.add(BigInteger.valueOf(j13)));
                    BigInteger bigInteger9 = ONE;
                    BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger9);
                    bigIntegerArr4[i17] = bigIntegerAdd2;
                    BigInteger bigInteger10 = TWO;
                    if (bigIntegerAdd2.compareTo(bigInteger10.pow(iArr[i17])) != 1) {
                        if (bigInteger10.modPow(bigIntegerArr4[i25].multiply(bigInteger8.add(BigInteger.valueOf(j13))), bigIntegerArr4[i17]).compareTo(bigInteger9) == 0 && bigInteger10.modPow(bigInteger8.add(BigInteger.valueOf(j13)), bigIntegerArr4[i17]).compareTo(bigInteger9) != 0) {
                            break;
                        }
                        i26 += 2;
                        bigInteger2 = bigInteger;
                        iArr2 = iArr;
                    } else {
                        i14 = i13;
                        iArr2 = iArr;
                        i12 = 1;
                        bigIntegerArr3 = bigIntegerArr2;
                        i19 = 32;
                        bigInteger2 = bigInteger;
                    }
                }
            }
            i17--;
            if (i17 < 0) {
                bigIntegerArr[i13] = bigIntegerArr4[i13];
                bigIntegerArr[1] = bigIntegerArr4[1];
                return bigIntegerArr2[i13].longValue();
            }
            i18++;
            i14 = i13;
            bigInteger2 = bigInteger;
            iArr2 = iArr;
            bigIntegerArr3 = bigIntegerArr2;
            i12 = 1;
        }
        return bigIntegerArr3[i14].longValue();
    }

    private void procedure_B(int i11, int i12, BigInteger[] bigIntegerArr) {
        int i13;
        int i14;
        int iNextInt = i11;
        while (true) {
            if (iNextInt >= 0 && iNextInt <= 65536) {
                break;
            } else {
                iNextInt = this.init_random.nextInt() / 32768;
            }
        }
        int iNextInt2 = i12;
        while (true) {
            i13 = 1;
            if (iNextInt2 >= 0 && iNextInt2 <= 65536 && iNextInt2 / 2 != 0) {
                break;
            } else {
                iNextInt2 = (this.init_random.nextInt() / 32768) + 1;
            }
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Integer.toString(iNextInt2));
        BigInteger bigInteger2 = new BigInteger("19381");
        int iProcedure_A = procedure_A(iNextInt, iNextInt2, bigIntegerArr2, 256);
        int i15 = 0;
        BigInteger bigInteger3 = bigIntegerArr2[0];
        int iProcedure_A2 = procedure_A(iProcedure_A, iNextInt2, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[65];
        bigIntegerArr3[0] = new BigInteger(Integer.toString(iProcedure_A2));
        while (true) {
            int i16 = i15;
            while (i16 < 64) {
                int i17 = i16 + 1;
                bigIntegerArr3[i17] = bigIntegerArr3[i16].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(16));
                i16 = i17;
            }
            BigInteger bigInteger5 = new BigInteger(WebrtcBuildVersion.maint_version);
            for (int i18 = i15; i18 < 64; i18++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i18].multiply(TWO.pow(i18 * 16)));
            }
            bigIntegerArr3[i15] = bigIntegerArr3[64];
            BigInteger bigInteger6 = TWO;
            BigInteger bigIntegerAdd = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (bigIntegerMod.compareTo(bigInteger7) == 0) {
                bigIntegerAdd = bigIntegerAdd.add(bigInteger7);
            }
            BigInteger bigInteger8 = bigIntegerAdd;
            int i19 = i15;
            while (true) {
                long j11 = i19;
                BigInteger bigIntegerMultiply = bigInteger3.multiply(bigInteger4).multiply(bigInteger8.add(BigInteger.valueOf(j11)));
                BigInteger bigInteger9 = ONE;
                BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger9);
                BigInteger bigInteger10 = TWO;
                i14 = i15;
                if (bigIntegerAdd2.compareTo(bigInteger10.pow(1024)) == i13) {
                    break;
                }
                int i21 = i13;
                if (bigInteger10.modPow(bigInteger3.multiply(bigInteger4).multiply(bigInteger8.add(BigInteger.valueOf(j11))), bigIntegerAdd2).compareTo(bigInteger9) == 0 && bigInteger10.modPow(bigInteger3.multiply(bigInteger8.add(BigInteger.valueOf(j11))), bigIntegerAdd2).compareTo(bigInteger9) != 0) {
                    bigIntegerArr[i14] = bigIntegerAdd2;
                    bigIntegerArr[i21] = bigInteger3;
                    return;
                } else {
                    i19 += 2;
                    i15 = i14;
                    i13 = i21;
                }
            }
            i15 = i14;
        }
    }

    private void procedure_Bb(long j11, long j12, BigInteger[] bigIntegerArr) {
        int i11;
        int i12;
        long jNextInt = j11;
        while (true) {
            if (jNextInt >= 0 && jNextInt <= 4294967296L) {
                break;
            } else {
                jNextInt = this.init_random.nextInt() * 2;
            }
        }
        long jNextInt2 = j12;
        while (true) {
            i11 = 1;
            if (jNextInt2 >= 0 && jNextInt2 <= 4294967296L && jNextInt2 / 2 != 0) {
                break;
            }
            long j13 = jNextInt;
            jNextInt2 = (this.init_random.nextInt() * 2) + 1;
            jNextInt = j13;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Long.toString(jNextInt2));
        BigInteger bigInteger2 = new BigInteger("97781173");
        long jProcedure_Aa = procedure_Aa(jNextInt, jNextInt2, bigIntegerArr2, 256);
        int i13 = 0;
        BigInteger bigInteger3 = bigIntegerArr2[0];
        long jProcedure_Aa2 = procedure_Aa(jProcedure_Aa, jNextInt2, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[33];
        bigIntegerArr3[0] = new BigInteger(Long.toString(jProcedure_Aa2));
        while (true) {
            int i14 = i13;
            while (i14 < 32) {
                int i15 = i14 + 1;
                bigIntegerArr3[i15] = bigIntegerArr3[i14].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(32));
                i14 = i15;
            }
            BigInteger bigInteger5 = new BigInteger(WebrtcBuildVersion.maint_version);
            for (int i16 = i13; i16 < 32; i16++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i16].multiply(TWO.pow(i16 * 32)));
            }
            bigIntegerArr3[i13] = bigIntegerArr3[32];
            BigInteger bigInteger6 = TWO;
            BigInteger bigIntegerAdd = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (bigIntegerMod.compareTo(bigInteger7) == 0) {
                bigIntegerAdd = bigIntegerAdd.add(bigInteger7);
            }
            int i17 = i13;
            while (true) {
                long j14 = i17;
                BigInteger bigIntegerMultiply = bigInteger3.multiply(bigInteger4).multiply(bigIntegerAdd.add(BigInteger.valueOf(j14)));
                BigInteger bigInteger8 = ONE;
                BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger8);
                BigInteger bigInteger9 = TWO;
                i12 = i13;
                if (bigIntegerAdd2.compareTo(bigInteger9.pow(1024)) == i11) {
                    break;
                }
                int i18 = i11;
                if (bigInteger9.modPow(bigInteger3.multiply(bigInteger4).multiply(bigIntegerAdd.add(BigInteger.valueOf(j14))), bigIntegerAdd2).compareTo(bigInteger8) == 0 && bigInteger9.modPow(bigInteger3.multiply(bigIntegerAdd.add(BigInteger.valueOf(j14))), bigIntegerAdd2).compareTo(bigInteger8) != 0) {
                    bigIntegerArr[i12] = bigIntegerAdd2;
                    bigIntegerArr[i18] = bigInteger3;
                    return;
                } else {
                    i17 += 2;
                    i13 = i12;
                    i11 = i18;
                }
            }
            i13 = i12;
        }
    }

    private BigInteger procedure_C(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigIntegerSubtract = bigInteger.subtract(ONE);
        BigInteger bigIntegerDivide = bigIntegerSubtract.divide(bigInteger2);
        int iBitLength = bigInteger.bitLength();
        while (true) {
            BigInteger bigInteger3 = new BigInteger(iBitLength, this.init_random);
            BigInteger bigInteger4 = ONE;
            if (bigInteger3.compareTo(bigInteger4) > 0 && bigInteger3.compareTo(bigIntegerSubtract) < 0) {
                BigInteger bigIntegerModPow = bigInteger3.modPow(bigIntegerDivide, bigInteger);
                if (bigIntegerModPow.compareTo(bigInteger4) != 0) {
                    return bigIntegerModPow;
                }
            }
        }
    }

    public GOST3410Parameters generateParameters() {
        long j11;
        long j12;
        BigInteger[] bigIntegerArr = new BigInteger[2];
        if (this.typeproc == 1) {
            int iNextInt = this.init_random.nextInt();
            int iNextInt2 = this.init_random.nextInt();
            int i11 = this.size;
            if (i11 == 512) {
                procedure_A(iNextInt, iNextInt2, bigIntegerArr, 512);
            } else {
                if (i11 != 1024) {
                    throw new IllegalArgumentException("Ooops! key size 512 or 1024 bit.");
                }
                procedure_B(iNextInt, iNextInt2, bigIntegerArr);
            }
            BigInteger bigInteger = bigIntegerArr[0];
            BigInteger bigInteger2 = bigIntegerArr[1];
            return new GOST3410Parameters(bigInteger, bigInteger2, procedure_C(bigInteger, bigInteger2), new GOST3410ValidationParameters(iNextInt, iNextInt2));
        }
        long jNextLong = this.init_random.nextLong();
        long jNextLong2 = this.init_random.nextLong();
        int i12 = this.size;
        if (i12 == 512) {
            j11 = jNextLong;
            j12 = jNextLong2;
            procedure_Aa(j11, j12, bigIntegerArr, 512);
        } else {
            if (i12 != 1024) {
                throw new IllegalStateException("Ooops! key size 512 or 1024 bit.");
            }
            j11 = jNextLong;
            j12 = jNextLong2;
            procedure_Bb(j11, j12, bigIntegerArr);
        }
        BigInteger bigInteger3 = bigIntegerArr[0];
        BigInteger bigInteger4 = bigIntegerArr[1];
        return new GOST3410Parameters(bigInteger3, bigInteger4, procedure_C(bigInteger3, bigInteger4), new GOST3410ValidationParameters(j11, j12));
    }

    public void init(int i11, int i12, SecureRandom secureRandom) {
        this.size = i11;
        this.typeproc = i12;
        this.init_random = secureRandom;
    }
}
