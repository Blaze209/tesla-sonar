package org.bouncycastle.crypto.generators;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import okhttp3.internal.http.StatusLine;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes9.dex */
public class NaccacheSternKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NaccacheSternKeyGenerationParameters param;
    private static int[] smallPrimes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, EnumC4419g.SDK_ASSET_ICON_CANCEL_VALUE, 211, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, EnumC4419g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE, EnumC4419g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE, 307, EnumC4419g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE, EnumC4419g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, HttpStatusCode.UNAUTHORIZED_401, 409, 419, StatusLine.HTTP_MISDIRECTED_REQUEST, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, DownloaderService.STATUS_FILE_DELIVERED_INCORRECTLY, DownloaderService.STATUS_UNKNOWN_ERROR, DownloaderService.STATUS_DEVICE_NOT_FOUND_ERROR, 503, 509, 521, 523, 541, 547, 557};
    private static final BigInteger ONE = BigInteger.valueOf(1);

    private static Vector findFirstPrimes(int i11) {
        Vector vector = new Vector(i11);
        for (int i12 = 0; i12 != i11; i12++) {
            vector.addElement(BigInteger.valueOf(smallPrimes[i12]));
        }
        return vector;
    }

    private static BigInteger generatePrime(int i11, int i12, SecureRandom secureRandom) {
        BigInteger bigIntegerCreateRandomPrime;
        do {
            bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(i11, i12, secureRandom);
        } while (bigIntegerCreateRandomPrime.bitLength() != i11);
        return bigIntegerCreateRandomPrime;
    }

    private static int getInt(SecureRandom secureRandom, int i11) {
        int iNextInt;
        int i12;
        if (((-i11) & i11) == i11) {
            return (int) ((((long) i11) * ((long) (secureRandom.nextInt() & Integer.MAX_VALUE))) >> 31);
        }
        do {
            iNextInt = secureRandom.nextInt() & Integer.MAX_VALUE;
            i12 = iNextInt % i11;
        } while ((iNextInt - i12) + (i11 - 1) < 0);
        return i12;
    }

    private static Vector permuteList(Vector vector, SecureRandom secureRandom) {
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i11 = 0; i11 < vector.size(); i11++) {
            vector3.addElement(vector.elementAt(i11));
        }
        vector2.addElement(vector3.elementAt(0));
        while (true) {
            vector3.removeElementAt(0);
            if (vector3.size() == 0) {
                return vector2;
            }
            vector2.insertElementAt(vector3.elementAt(0), getInt(secureRandom, vector2.size() + 1));
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        long j11;
        BigInteger bigIntegerGeneratePrime;
        BigInteger bigIntegerAdd;
        BigInteger bigIntegerGeneratePrime2;
        boolean z11;
        BigInteger bigInteger;
        BigInteger bigIntegerAdd2;
        BigInteger bigInteger2;
        BigInteger bigIntegerMultiply;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        BigInteger bigIntegerMod;
        BigInteger bigInteger5;
        BigInteger bigInteger6;
        PrintStream printStream;
        StringBuilder sb2;
        String str;
        int i11;
        BigInteger bigIntegerCreateRandomPrime;
        SecureRandom secureRandom;
        int i12;
        BigInteger bigInteger7;
        BigInteger bigInteger8;
        int i13;
        int strength = this.param.getStrength();
        SecureRandom random = this.param.getRandom();
        int certainty = this.param.getCertainty();
        boolean zIsDebug = this.param.isDebug();
        if (zIsDebug) {
            System.out.println("Fetching first " + this.param.getCntSmallPrimes() + " primes.");
        }
        Vector vectorPermuteList = permuteList(findFirstPrimes(this.param.getCntSmallPrimes()), random);
        BigInteger bigIntegerMultiply2 = ONE;
        BigInteger bigIntegerMultiply3 = bigIntegerMultiply2;
        for (int i14 = 0; i14 < vectorPermuteList.size() / 2; i14++) {
            bigIntegerMultiply3 = bigIntegerMultiply3.multiply((BigInteger) vectorPermuteList.elementAt(i14));
        }
        for (int size = vectorPermuteList.size() / 2; size < vectorPermuteList.size(); size++) {
            bigIntegerMultiply2 = bigIntegerMultiply2.multiply((BigInteger) vectorPermuteList.elementAt(size));
        }
        BigInteger bigIntegerMultiply4 = bigIntegerMultiply3.multiply(bigIntegerMultiply2);
        int iBitLength = (((strength - bigIntegerMultiply4.bitLength()) - 48) / 2) + 1;
        BigInteger bigIntegerGeneratePrime3 = generatePrime(iBitLength, certainty, random);
        BigInteger bigIntegerGeneratePrime4 = generatePrime(iBitLength, certainty, random);
        if (zIsDebug) {
            System.out.println("generating p and q");
        }
        BigInteger bigIntegerShiftLeft = bigIntegerGeneratePrime3.multiply(bigIntegerMultiply3).shiftLeft(1);
        BigInteger bigIntegerShiftLeft2 = bigIntegerGeneratePrime4.multiply(bigIntegerMultiply2).shiftLeft(1);
        long j12 = 0;
        while (true) {
            j11 = j12 + 1;
            bigIntegerGeneratePrime = generatePrime(24, certainty, random);
            bigIntegerAdd = bigIntegerGeneratePrime.multiply(bigIntegerShiftLeft).add(ONE);
            if (bigIntegerAdd.isProbablePrime(certainty)) {
                while (true) {
                    do {
                        bigIntegerGeneratePrime2 = generatePrime(24, certainty, random);
                    } while (bigIntegerGeneratePrime.equals(bigIntegerGeneratePrime2));
                    BigInteger bigIntegerMultiply5 = bigIntegerGeneratePrime2.multiply(bigIntegerShiftLeft2);
                    z11 = zIsDebug;
                    bigInteger = ONE;
                    bigIntegerAdd2 = bigIntegerMultiply5.add(bigInteger);
                    if (bigIntegerAdd2.isProbablePrime(certainty)) {
                        break;
                    }
                    zIsDebug = z11;
                }
                bigInteger2 = bigIntegerShiftLeft2;
                if (BigIntegers.modOddIsCoprime(bigIntegerGeneratePrime.multiply(bigIntegerGeneratePrime2), bigIntegerMultiply4)) {
                    BigInteger bigInteger9 = bigIntegerShiftLeft;
                    bigIntegerMultiply = bigIntegerAdd.multiply(bigIntegerAdd2);
                    bigInteger3 = bigInteger9;
                    if (bigIntegerMultiply.bitLength() >= strength) {
                        break;
                    }
                    int i15 = strength;
                    random = random;
                    certainty = certainty;
                    bigInteger7 = bigIntegerGeneratePrime3;
                    bigInteger8 = bigIntegerGeneratePrime4;
                    if (z11) {
                        PrintStream printStream2 = System.out;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("key size too small. Should be ");
                        i13 = i15;
                        sb3.append(i13);
                        sb3.append(" but is actually ");
                        sb3.append(bigIntegerAdd.multiply(bigIntegerAdd2).bitLength());
                        printStream2.println(sb3.toString());
                    } else {
                        i13 = i15;
                    }
                }
                strength = i13;
                bigIntegerGeneratePrime3 = bigInteger7;
                bigIntegerGeneratePrime4 = bigInteger8;
                j12 = j11;
                zIsDebug = z11;
                bigIntegerShiftLeft2 = bigInteger2;
                bigIntegerShiftLeft = bigInteger3;
                random = random;
                certainty = certainty;
            } else {
                z11 = zIsDebug;
                bigInteger2 = bigIntegerShiftLeft2;
            }
            bigInteger3 = bigIntegerShiftLeft;
            bigInteger8 = bigIntegerGeneratePrime4;
            bigInteger7 = bigIntegerGeneratePrime3;
            i13 = strength;
            strength = i13;
            bigIntegerGeneratePrime3 = bigInteger7;
            bigIntegerGeneratePrime4 = bigInteger8;
            j12 = j11;
            zIsDebug = z11;
            bigIntegerShiftLeft2 = bigInteger2;
            bigIntegerShiftLeft = bigInteger3;
            random = random;
            certainty = certainty;
        }
        BigInteger bigInteger10 = bigIntegerGeneratePrime4;
        if (z11) {
            System.out.println("needed " + j11 + " tries to generate p and q.");
        }
        BigInteger bigIntegerMultiply6 = bigIntegerAdd.subtract(bigInteger).multiply(bigIntegerAdd2.subtract(bigInteger));
        if (z11) {
            System.out.println("generating g");
        }
        long j13 = 0;
        while (true) {
            Vector vector = new Vector();
            bigInteger4 = bigIntegerAdd2;
            int i16 = 0;
            while (i16 != vectorPermuteList.size()) {
                BigInteger bigIntegerDivide = bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i16));
                while (true) {
                    j13++;
                    i11 = i16;
                    bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(strength, certainty, random);
                    secureRandom = random;
                    i12 = certainty;
                    if (bigIntegerCreateRandomPrime.modPow(bigIntegerDivide, bigIntegerMultiply).equals(ONE)) {
                        i16 = i11;
                        random = secureRandom;
                        certainty = i12;
                    }
                }
                vector.addElement(bigIntegerCreateRandomPrime);
                i16 = i11 + 1;
                random = secureRandom;
                certainty = i12;
            }
            SecureRandom secureRandom2 = random;
            int i17 = certainty;
            bigIntegerMod = ONE;
            for (int i18 = 0; i18 < vectorPermuteList.size(); i18++) {
                bigIntegerMod = bigIntegerMod.multiply(((BigInteger) vector.elementAt(i18)).modPow(bigIntegerMultiply4.divide((BigInteger) vectorPermuteList.elementAt(i18)), bigIntegerMultiply)).mod(bigIntegerMultiply);
            }
            int i19 = 0;
            while (true) {
                if (i19 >= vectorPermuteList.size()) {
                    BigInteger bigIntegerModPow = bigIntegerMod.modPow(bigIntegerMultiply6.divide(BigInteger.valueOf(4L)), bigIntegerMultiply);
                    BigInteger bigInteger11 = ONE;
                    if (!bigIntegerModPow.equals(bigInteger11)) {
                        if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime), bigIntegerMultiply).equals(bigInteger11)) {
                            if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime2), bigIntegerMultiply).equals(bigInteger11)) {
                                bigInteger5 = bigIntegerGeneratePrime3;
                                if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger5), bigIntegerMultiply).equals(bigInteger11)) {
                                    bigInteger6 = bigInteger10;
                                    if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger6), bigIntegerMultiply).equals(bigInteger11)) {
                                        break;
                                    }
                                    if (z11) {
                                        System.out.println("g has order phi(n)/b\n g: " + bigIntegerMod);
                                    }
                                } else {
                                    if (z11) {
                                        System.out.println("g has order phi(n)/a\n g: " + bigIntegerMod);
                                    }
                                    bigInteger6 = bigInteger10;
                                }
                            } else if (z11) {
                                printStream = System.out;
                                sb2 = new StringBuilder();
                                str = "g has order phi(n)/q'\n g: ";
                                sb2.append(str);
                                sb2.append(bigIntegerMod);
                                printStream.println(sb2.toString());
                            }
                        } else if (z11) {
                            printStream = System.out;
                            sb2 = new StringBuilder();
                            str = "g has order phi(n)/p'\n g: ";
                            sb2.append(str);
                            sb2.append(bigIntegerMod);
                            printStream.println(sb2.toString());
                        }
                    } else if (z11) {
                        printStream = System.out;
                        sb2 = new StringBuilder();
                        str = "g has order phi(n)/4\n g:";
                        sb2.append(str);
                        sb2.append(bigIntegerMod);
                        printStream.println(sb2.toString());
                    }
                    bigIntegerGeneratePrime3 = bigInteger5;
                    strength = strength;
                    random = secureRandom2;
                    certainty = i17;
                    bigInteger10 = bigInteger6;
                    bigIntegerAdd2 = bigInteger4;
                } else if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i19)), bigIntegerMultiply).equals(ONE)) {
                    i19++;
                } else if (z11) {
                    System.out.println("g has order phi(n)/" + vectorPermuteList.elementAt(i19) + "\n g: " + bigIntegerMod);
                }
                bigInteger6 = bigInteger10;
                bigInteger5 = bigIntegerGeneratePrime3;
                bigIntegerGeneratePrime3 = bigInteger5;
                strength = strength;
                random = secureRandom2;
                certainty = i17;
                bigInteger10 = bigInteger6;
                bigIntegerAdd2 = bigInteger4;
            }
        }
        if (z11) {
            System.out.println("needed " + j13 + " tries to generate g");
            System.out.println();
            System.out.println("found new NaccacheStern cipher variables:");
            System.out.println("smallPrimes: " + vectorPermuteList);
            System.out.println("sigma:...... " + bigIntegerMultiply4 + " (" + bigIntegerMultiply4.bitLength() + " bits)");
            PrintStream printStream3 = System.out;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("a:.......... ");
            sb4.append(bigInteger5);
            printStream3.println(sb4.toString());
            System.out.println("b:.......... " + bigInteger6);
            System.out.println("p':......... " + bigIntegerGeneratePrime);
            System.out.println("q':......... " + bigIntegerGeneratePrime2);
            System.out.println("p:.......... " + bigIntegerAdd);
            System.out.println("q:.......... " + bigInteger4);
            System.out.println("n:.......... " + bigIntegerMultiply);
            System.out.println("phi(n):..... " + bigIntegerMultiply6);
            System.out.println("g:.......... " + bigIntegerMod);
            System.out.println();
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NaccacheSternKeyParameters(false, bigIntegerMod, bigIntegerMultiply, bigIntegerMultiply4.bitLength()), (AsymmetricKeyParameter) new NaccacheSternPrivateKeyParameters(bigIntegerMod, bigIntegerMultiply, bigIntegerMultiply4.bitLength(), vectorPermuteList, bigIntegerMultiply6));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (NaccacheSternKeyGenerationParameters) keyGenerationParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("NaccacheStern KeyGen", ConstraintUtils.bitsOfSecurityForFF(keyGenerationParameters.getStrength()), keyGenerationParameters, CryptoServicePurpose.KEYGEN));
    }
}
