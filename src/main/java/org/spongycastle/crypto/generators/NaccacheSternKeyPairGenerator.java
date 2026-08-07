package org.spongycastle.crypto.generators;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import okhttp3.internal.http.StatusLine;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.spongycastle.crypto.params.NaccacheSternKeyParameters;
import org.spongycastle.crypto.params.NaccacheSternPrivateKeyParameters;

/* JADX INFO: loaded from: classes10.dex */
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
        BigInteger bigInteger = new BigInteger(i11, i12, secureRandom);
        while (bigInteger.bitLength() != i11) {
            bigInteger = new BigInteger(i11, i12, secureRandom);
        }
        return bigInteger;
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
        vector3.removeElementAt(0);
        while (vector3.size() != 0) {
            vector2.insertElementAt(vector3.elementAt(0), getInt(secureRandom, vector2.size() + 1));
            vector3.removeElementAt(0);
        }
        return vector2;
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        long j11;
        BigInteger bigIntegerGeneratePrime;
        BigInteger bigIntegerAdd;
        BigInteger bigIntegerGeneratePrime2;
        boolean z11;
        BigInteger bigInteger;
        BigInteger bigIntegerAdd2;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        BigInteger bigIntegerMod;
        BigInteger bigInteger5;
        int i11;
        BigInteger bigInteger6;
        int i12;
        SecureRandom secureRandom;
        int strength = this.param.getStrength();
        SecureRandom random = this.param.getRandom();
        int certainty = this.param.getCertainty();
        boolean zIsDebug = this.param.isDebug();
        if (zIsDebug) {
            System.out.println("Fetching first " + this.param.getCntSmallPrimes() + " primes.");
        }
        Vector vectorPermuteList = permuteList(findFirstPrimes(this.param.getCntSmallPrimes()), random);
        BigInteger bigIntegerMultiply = ONE;
        BigInteger bigIntegerMultiply2 = bigIntegerMultiply;
        for (int i13 = 0; i13 < vectorPermuteList.size() / 2; i13++) {
            bigIntegerMultiply2 = bigIntegerMultiply2.multiply((BigInteger) vectorPermuteList.elementAt(i13));
        }
        for (int size = vectorPermuteList.size() / 2; size < vectorPermuteList.size(); size++) {
            bigIntegerMultiply = bigIntegerMultiply.multiply((BigInteger) vectorPermuteList.elementAt(size));
        }
        BigInteger bigIntegerMultiply3 = bigIntegerMultiply2.multiply(bigIntegerMultiply);
        int iBitLength = (((strength - bigIntegerMultiply3.bitLength()) - 48) / 2) + 1;
        BigInteger bigIntegerGeneratePrime3 = generatePrime(iBitLength, certainty, random);
        BigInteger bigIntegerGeneratePrime4 = generatePrime(iBitLength, certainty, random);
        if (zIsDebug) {
            System.out.println("generating p and q");
        }
        BigInteger bigIntegerShiftLeft = bigIntegerGeneratePrime3.multiply(bigIntegerMultiply2).shiftLeft(1);
        BigInteger bigIntegerShiftLeft2 = bigIntegerGeneratePrime4.multiply(bigIntegerMultiply).shiftLeft(1);
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
                    BigInteger bigIntegerMultiply4 = bigIntegerGeneratePrime2.multiply(bigIntegerShiftLeft2);
                    z11 = zIsDebug;
                    bigInteger = ONE;
                    bigIntegerAdd2 = bigIntegerMultiply4.add(bigInteger);
                    if (bigIntegerAdd2.isProbablePrime(certainty)) {
                        break;
                    }
                    zIsDebug = z11;
                }
                bigInteger2 = bigIntegerShiftLeft2;
                if (!bigIntegerMultiply3.gcd(bigIntegerGeneratePrime.multiply(bigIntegerGeneratePrime2)).equals(bigInteger)) {
                    continue;
                } else {
                    if (bigIntegerAdd.multiply(bigIntegerAdd2).bitLength() >= strength) {
                        break;
                    }
                    if (z11) {
                        System.out.println("key size too small. Should be " + strength + " but is actually " + bigIntegerAdd.multiply(bigIntegerAdd2).bitLength());
                    }
                }
            } else {
                z11 = zIsDebug;
                bigInteger2 = bigIntegerShiftLeft2;
            }
            j12 = j11;
            zIsDebug = z11;
            bigIntegerShiftLeft2 = bigInteger2;
        }
        if (z11) {
            System.out.println("needed " + j11 + " tries to generate p and q.");
        }
        BigInteger bigIntegerMultiply5 = bigIntegerAdd.multiply(bigIntegerAdd2);
        BigInteger bigIntegerMultiply6 = bigIntegerAdd.subtract(bigInteger).multiply(bigIntegerAdd2.subtract(bigInteger));
        if (z11) {
            System.out.println("generating g");
        }
        long j13 = 0;
        while (true) {
            Vector vector = new Vector();
            bigInteger3 = bigIntegerAdd;
            bigInteger4 = bigIntegerAdd2;
            int i14 = 0;
            while (i14 != vectorPermuteList.size()) {
                BigInteger bigIntegerDivide = bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i14));
                while (true) {
                    j13++;
                    i11 = i14;
                    bigInteger6 = new BigInteger(strength, certainty, random);
                    i12 = strength;
                    secureRandom = random;
                    if (bigInteger6.modPow(bigIntegerDivide, bigIntegerMultiply5).equals(ONE)) {
                        i14 = i11;
                        strength = i12;
                        random = secureRandom;
                    }
                }
                vector.addElement(bigInteger6);
                i14 = i11 + 1;
                strength = i12;
                random = secureRandom;
            }
            int i15 = strength;
            SecureRandom secureRandom2 = random;
            bigIntegerMod = ONE;
            for (int i16 = 0; i16 < vectorPermuteList.size(); i16++) {
                bigIntegerMod = bigIntegerMod.multiply(((BigInteger) vector.elementAt(i16)).modPow(bigIntegerMultiply3.divide((BigInteger) vectorPermuteList.elementAt(i16)), bigIntegerMultiply5)).mod(bigIntegerMultiply5);
            }
            int i17 = 0;
            while (true) {
                if (i17 >= vectorPermuteList.size()) {
                    BigInteger bigIntegerModPow = bigIntegerMod.modPow(bigIntegerMultiply6.divide(BigInteger.valueOf(4L)), bigIntegerMultiply5);
                    BigInteger bigInteger7 = ONE;
                    if (!bigIntegerModPow.equals(bigInteger7)) {
                        if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime), bigIntegerMultiply5).equals(bigInteger7)) {
                            if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime2), bigIntegerMultiply5).equals(bigInteger7)) {
                                if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigIntegerGeneratePrime3), bigIntegerMultiply5).equals(bigInteger7)) {
                                    bigInteger5 = bigIntegerGeneratePrime4;
                                    if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide(bigInteger5), bigIntegerMultiply5).equals(bigInteger7)) {
                                        break;
                                    }
                                    if (!z11) {
                                        break;
                                    }
                                    System.out.println("g has order phi(n)/b\n g: " + bigIntegerMod);
                                    break;
                                }
                                if (z11) {
                                    System.out.println("g has order phi(n)/a\n g: " + bigIntegerMod);
                                }
                            } else if (z11) {
                                System.out.println("g has order phi(n)/q'\n g: " + bigIntegerMod);
                            }
                        } else if (z11) {
                            System.out.println("g has order phi(n)/p'\n g: " + bigIntegerMod);
                        }
                    } else if (z11) {
                        System.out.println("g has order phi(n)/4\n g:" + bigIntegerMod);
                    }
                } else if (!bigIntegerMod.modPow(bigIntegerMultiply6.divide((BigInteger) vectorPermuteList.elementAt(i17)), bigIntegerMultiply5).equals(ONE)) {
                    i17++;
                } else if (z11) {
                    System.out.println("g has order phi(n)/" + vectorPermuteList.elementAt(i17) + "\n g: " + bigIntegerMod);
                }
                bigInteger5 = bigIntegerGeneratePrime4;
                break;
            }
            bigIntegerGeneratePrime4 = bigInteger5;
            bigIntegerAdd2 = bigInteger4;
            bigIntegerAdd = bigInteger3;
            strength = i15;
            random = secureRandom2;
        }
        if (z11) {
            System.out.println("needed " + j13 + " tries to generate g");
            System.out.println();
            System.out.println("found new NaccacheStern cipher variables:");
            System.out.println("smallPrimes: " + vectorPermuteList);
            System.out.println("sigma:...... " + bigIntegerMultiply3 + " (" + bigIntegerMultiply3.bitLength() + " bits)");
            PrintStream printStream = System.out;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("a:.......... ");
            sb2.append(bigIntegerGeneratePrime3);
            printStream.println(sb2.toString());
            System.out.println("b:.......... " + bigInteger5);
            System.out.println("p':......... " + bigIntegerGeneratePrime);
            System.out.println("q':......... " + bigIntegerGeneratePrime2);
            System.out.println("p:.......... " + bigInteger3);
            System.out.println("q:.......... " + bigInteger4);
            System.out.println("n:.......... " + bigIntegerMultiply5);
            System.out.println("phi(n):..... " + bigIntegerMultiply6);
            System.out.println("g:.......... " + bigIntegerMod);
            System.out.println();
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NaccacheSternKeyParameters(false, bigIntegerMod, bigIntegerMultiply5, bigIntegerMultiply3.bitLength()), (AsymmetricKeyParameter) new NaccacheSternPrivateKeyParameters(bigIntegerMod, bigIntegerMultiply5, bigIntegerMultiply3.bitLength(), vectorPermuteList, bigIntegerMultiply6));
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (NaccacheSternKeyGenerationParameters) keyGenerationParameters;
    }
}
