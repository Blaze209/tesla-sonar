package org.spongycastle.pqc.math.ntru.polynomial;

import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import org.spongycastle.pqc.math.ntru.euclid.BigIntEuclidean;
import org.spongycastle.pqc.math.ntru.util.ArrayEncoder;
import org.spongycastle.pqc.math.ntru.util.Util;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class IntegerPolynomial implements Polynomial {
    private static final int NUM_EQUAL_RESULTANTS = 3;
    public int[] coeffs;
    private static final int[] PRIMES = {4507, 4513, 4517, 4519, 4523, 4547, 4549, 4561, 4567, 4583, 4591, 4597, 4603, 4621, 4637, 4639, 4643, 4649, 4651, 4657, 4663, 4673, 4679, 4691, 4703, 4721, 4723, 4729, 4733, 4751, 4759, 4783, 4787, 4789, 4793, 4799, 4801, 4813, 4817, 4831, 4861, 4871, 4877, 4889, 4903, 4909, 4919, 4931, 4933, 4937, 4943, 4951, 4957, 4967, 4969, 4973, 4987, 4993, 4999, 5003, 5009, 5011, 5021, 5023, 5039, 5051, 5059, 5077, 5081, 5087, 5099, 5101, 5107, 5113, 5119, 5147, 5153, 5167, 5171, 5179, 5189, 5197, 5209, 5227, 5231, 5233, 5237, 5261, 5273, 5279, 5281, 5297, 5303, 5309, 5323, 5333, 5347, 5351, 5381, 5387, 5393, 5399, 5407, 5413, 5417, 5419, 5431, 5437, 5441, 5443, 5449, 5471, 5477, 5479, 5483, 5501, 5503, 5507, 5519, 5521, 5527, 5531, 5557, 5563, 5569, 5573, 5581, 5591, 5623, 5639, 5641, 5647, 5651, 5653, 5657, 5659, 5669, 5683, 5689, 5693, 5701, 5711, 5717, 5737, 5741, 5743, 5749, 5779, 5783, 5791, 5801, 5807, 5813, 5821, 5827, 5839, 5843, 5849, 5851, 5857, 5861, 5867, 5869, 5879, 5881, 5897, 5903, 5923, 5927, 5939, 5953, 5981, 5987, 6007, 6011, 6029, 6037, 6043, 6047, 6053, 6067, 6073, 6079, 6089, 6091, 6101, 6113, 6121, 6131, 6133, 6143, 6151, 6163, 6173, 6197, 6199, 6203, 6211, 6217, 6221, 6229, 6247, 6257, 6263, 6269, 6271, 6277, 6287, 6299, 6301, 6311, 6317, 6323, 6329, 6337, 6343, 6353, 6359, 6361, 6367, 6373, 6379, 6389, 6397, 6421, 6427, 6449, 6451, 6469, 6473, 6481, 6491, 6521, 6529, 6547, 6551, 6553, 6563, 6569, 6571, 6577, 6581, 6599, 6607, 6619, 6637, 6653, 6659, 6661, 6673, 6679, 6689, 6691, 6701, 6703, 6709, 6719, 6733, 6737, 6761, 6763, 6779, 6781, 6791, 6793, 6803, 6823, 6827, 6829, 6833, 6841, 6857, 6863, 6869, 6871, 6883, 6899, 6907, 6911, 6917, 6947, 6949, 6959, 6961, 6967, 6971, 6977, 6983, 6991, 6997, 7001, 7013, 7019, 7027, 7039, 7043, 7057, 7069, 7079, 7103, 7109, 7121, 7127, 7129, 7151, 7159, 7177, 7187, 7193, 7207, 7211, 7213, 7219, 7229, 7237, 7243, 7247, 7253, 7283, 7297, 7307, 7309, 7321, 7331, 7333, 7349, 7351, 7369, 7393, 7411, 7417, 7433, 7451, 7457, 7459, 7477, 7481, 7487, 7489, 7499, 7507, 7517, 7523, 7529, 7537, 7541, 7547, 7549, 7559, 7561, 7573, 7577, 7583, 7589, 7591, 7603, 7607, 7621, 7639, 7643, 7649, 7669, 7673, 7681, 7687, 7691, 7699, 7703, 7717, 7723, 7727, 7741, 7753, 7757, 7759, 7789, 7793, 7817, 7823, 7829, 7841, 7853, 7867, 7873, 7877, 7879, 7883, 7901, 7907, 7919, 7927, 7933, 7937, 7949, 7951, 7963, 7993, ConnectionsStatusCodes.STATUS_OUT_OF_ORDER_API_CALL, ConnectionsStatusCodes.STATUS_ENDPOINT_UNKNOWN, 8017, ConnectionsStatusCodes.MISSING_PERMISSION_BLUETOOTH_CONNECT, 8053, 8059, 8069, 8081, 8087, 8089, 8093, 8101, 8111, 8117, 8123, 8147, 8161, 8167, 8171, 8179, 8191, 8209, 8219, 8221, 8231, 8233, 8237, 8243, 8263, 8269, 8273, 8287, 8291, 8293, 8297, 8311, 8317, 8329, 8353, 8363, 8369, 8377, 8387, 8389, 8419, 8423, 8429, 8431, 8443, 8447, 8461, 8467, 8501, 8513, 8521, 8527, 8537, 8539, 8543, 8563, 8573, 8581, 8597, 8599, 8609, 8623, 8627, 8629, 8641, 8647, 8663, 8669, 8677, 8681, 8689, 8693, 8699, 8707, 8713, 8719, 8731, 8737, 8741, 8747, 8753, 8761, 8779, 8783, 8803, 8807, 8819, 8821, 8831, 8837, 8839, 8849, 8861, 8863, 8867, 8887, 8893, 8923, 8929, 8933, 8941, 8951, 8963, 8969, 8971, 8999, 9001, 9007, PlacesStatusCodes.REQUEST_DENIED, PlacesStatusCodes.NOT_FOUND, 9029, 9041, 9043, 9049, 9059, 9067, 9091, 9103, 9109, 9127, 9133, 9137, 9151, 9157, 9161, 9173, 9181, 9187, 9199, 9203, 9209, 9221, 9227, 9239, 9241, 9257, 9277, 9281, 9283, 9293, 9311, 9319, 9323, 9337, 9341, 9343, 9349, 9371, 9377, 9391, 9397, 9403, 9413, 9419, 9421, 9431, 9433, 9437, 9439, 9461, 9463, 9467, 9473, 9479, 9491, 9497, 9511, 9521, 9533, 9539, 9547, 9551, 9587, 9601, 9613, 9619, 9623, 9629, 9631, 9643, 9649, 9661, 9677, 9679, 9689, 9697, 9719, 9721, 9733, 9739, 9743, 9749, 9767, 9769, 9781, 9787, 9791, 9803, 9811, 9817, 9829, 9833, 9839, 9851, 9857, 9859, 9871, 9883, 9887, 9901, 9907, 9923, 9929, 9931, 9941, 9949, 9967, 9973};
    private static final List BIGINT_PRIMES = new ArrayList();

    private class CombineTask implements Callable<ModularResultant> {
        private ModularResultant modRes1;
        private ModularResultant modRes2;

        private CombineTask(ModularResultant modularResultant, ModularResultant modularResultant2) {
            this.modRes1 = modularResultant;
            this.modRes2 = modularResultant2;
        }

        @Override // java.util.concurrent.Callable
        public ModularResultant call() {
            return ModularResultant.combineRho(this.modRes1, this.modRes2);
        }
    }

    private class ModResultantTask implements Callable<ModularResultant> {
        private int modulus;

        private ModResultantTask(int i11) {
            this.modulus = i11;
        }

        @Override // java.util.concurrent.Callable
        public ModularResultant call() {
            return IntegerPolynomial.this.resultant(this.modulus);
        }
    }

    private class PrimeGenerator {
        private int index;
        private BigInteger prime;

        private PrimeGenerator() {
            this.index = 0;
        }

        public BigInteger nextPrime() {
            if (this.index < IntegerPolynomial.BIGINT_PRIMES.size()) {
                List list = IntegerPolynomial.BIGINT_PRIMES;
                int i11 = this.index;
                this.index = i11 + 1;
                this.prime = (BigInteger) list.get(i11);
            } else {
                this.prime = this.prime.nextProbablePrime();
            }
            return this.prime;
        }
    }

    static {
        int i11 = 0;
        while (true) {
            int[] iArr = PRIMES;
            if (i11 == iArr.length) {
                return;
            }
            BIGINT_PRIMES.add(BigInteger.valueOf(iArr[i11]));
            i11++;
        }
    }

    public IntegerPolynomial(int i11) {
        this.coeffs = new int[i11];
    }

    private boolean equalsAbsOne() {
        int i11 = 1;
        while (true) {
            int[] iArr = this.coeffs;
            if (i11 >= iArr.length) {
                return Math.abs(iArr[0]) == 1;
            }
            if (iArr[i11] != 0) {
                return false;
            }
            i11++;
        }
    }

    private boolean equalsZero() {
        int i11 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i11 >= iArr.length) {
                return true;
            }
            if (iArr[i11] != 0) {
                return false;
            }
            i11++;
        }
    }

    public static IntegerPolynomial fromBinary(byte[] bArr, int i11, int i12) {
        return new IntegerPolynomial(ArrayEncoder.decodeModQ(bArr, i11, i12));
    }

    public static IntegerPolynomial fromBinary3Sves(byte[] bArr, int i11) {
        return new IntegerPolynomial(ArrayEncoder.decodeMod3Sves(bArr, i11));
    }

    public static IntegerPolynomial fromBinary3Tight(byte[] bArr, int i11) {
        return new IntegerPolynomial(ArrayEncoder.decodeMod3Tight(bArr, i11));
    }

    private IntegerPolynomial mod2ToModq(IntegerPolynomial integerPolynomial, int i11) {
        int i12 = 2;
        if (!Util.is64BitJVM() || i11 != 2048) {
            while (i12 < i11) {
                i12 *= 2;
                int[] iArr = integerPolynomial.coeffs;
                IntegerPolynomial integerPolynomial2 = new IntegerPolynomial(Arrays.copyOf(iArr, iArr.length));
                integerPolynomial2.mult2(i12);
                integerPolynomial2.sub(mult(integerPolynomial, i12).mult(integerPolynomial, i12), i12);
                integerPolynomial = integerPolynomial2;
            }
            return integerPolynomial;
        }
        LongPolynomial2 longPolynomial2 = new LongPolynomial2(this);
        LongPolynomial2 longPolynomial3 = new LongPolynomial2(integerPolynomial);
        while (i12 < i11) {
            i12 *= 2;
            LongPolynomial2 longPolynomial4 = (LongPolynomial2) longPolynomial3.clone();
            int i13 = i12 - 1;
            longPolynomial4.mult2And(i13);
            longPolynomial4.subAnd(longPolynomial2.mult(longPolynomial3).mult(longPolynomial3), i13);
            longPolynomial3 = longPolynomial4;
        }
        return longPolynomial3.toIntegerPolynomial();
    }

    private void mult2(int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i12 >= iArr.length) {
                return;
            }
            int i13 = iArr[i12] * 2;
            iArr[i12] = i13;
            iArr[i12] = i13 % i11;
            i12++;
        }
    }

    private IntegerPolynomial multRecursive(IntegerPolynomial integerPolynomial) {
        int[] iArr = this.coeffs;
        int[] iArr2 = integerPolynomial.coeffs;
        int length = iArr2.length;
        int i11 = 0;
        if (length <= 32) {
            int i12 = (length * 2) - 1;
            IntegerPolynomial integerPolynomial2 = new IntegerPolynomial(new int[i12]);
            for (int i13 = 0; i13 < i12; i13++) {
                for (int iMax = Math.max(0, (i13 - length) + 1); iMax <= Math.min(i13, length - 1); iMax++) {
                    int[] iArr3 = integerPolynomial2.coeffs;
                    iArr3[i13] = iArr3[i13] + (iArr2[iMax] * iArr[i13 - iMax]);
                }
            }
            return integerPolynomial2;
        }
        int i14 = length / 2;
        IntegerPolynomial integerPolynomial3 = new IntegerPolynomial(Arrays.copyOf(iArr, i14));
        IntegerPolynomial integerPolynomial4 = new IntegerPolynomial(Arrays.copyOfRange(iArr, i14, length));
        IntegerPolynomial integerPolynomial5 = new IntegerPolynomial(Arrays.copyOf(iArr2, i14));
        IntegerPolynomial integerPolynomial6 = new IntegerPolynomial(Arrays.copyOfRange(iArr2, i14, length));
        IntegerPolynomial integerPolynomial7 = (IntegerPolynomial) integerPolynomial3.clone();
        integerPolynomial7.add(integerPolynomial4);
        IntegerPolynomial integerPolynomial8 = (IntegerPolynomial) integerPolynomial5.clone();
        integerPolynomial8.add(integerPolynomial6);
        IntegerPolynomial integerPolynomialMultRecursive = integerPolynomial3.multRecursive(integerPolynomial5);
        IntegerPolynomial integerPolynomialMultRecursive2 = integerPolynomial4.multRecursive(integerPolynomial6);
        IntegerPolynomial integerPolynomialMultRecursive3 = integerPolynomial7.multRecursive(integerPolynomial8);
        integerPolynomialMultRecursive3.sub(integerPolynomialMultRecursive);
        integerPolynomialMultRecursive3.sub(integerPolynomialMultRecursive2);
        IntegerPolynomial integerPolynomial9 = new IntegerPolynomial((length * 2) - 1);
        int i15 = 0;
        while (true) {
            int[] iArr4 = integerPolynomialMultRecursive.coeffs;
            if (i15 >= iArr4.length) {
                break;
            }
            integerPolynomial9.coeffs[i15] = iArr4[i15];
            i15++;
        }
        int i16 = 0;
        while (true) {
            int[] iArr5 = integerPolynomialMultRecursive3.coeffs;
            if (i16 >= iArr5.length) {
                break;
            }
            int[] iArr6 = integerPolynomial9.coeffs;
            int i17 = i14 + i16;
            iArr6[i17] = iArr6[i17] + iArr5[i16];
            i16++;
        }
        while (true) {
            int[] iArr7 = integerPolynomialMultRecursive2.coeffs;
            if (i11 >= iArr7.length) {
                return integerPolynomial9;
            }
            int[] iArr8 = integerPolynomial9.coeffs;
            int i18 = (i14 * 2) + i11;
            iArr8[i18] = iArr8[i18] + iArr7[i11];
            i11++;
        }
    }

    private void multShiftSub(IntegerPolynomial integerPolynomial, int i11, int i12, int i13) {
        int length = this.coeffs.length;
        for (int i14 = i12; i14 < length; i14++) {
            int[] iArr = this.coeffs;
            iArr[i14] = (iArr[i14] - (integerPolynomial.coeffs[i14 - i12] * i11)) % i13;
        }
    }

    private void sort(int[] iArr) {
        boolean z11;
        for (boolean z12 = true; z12; z12 = z11) {
            int i11 = 0;
            z11 = false;
            while (i11 != iArr.length - 1) {
                int i12 = iArr[i11];
                int i13 = i11 + 1;
                int i14 = iArr[i13];
                if (i12 > i14) {
                    iArr[i11] = i14;
                    iArr[i13] = i12;
                    z11 = true;
                }
                i11 = i13;
            }
        }
    }

    private BigInteger squareSum() {
        BigInteger bigIntegerAdd = Constants.BIGINT_ZERO;
        int i11 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i11 >= iArr.length) {
                return bigIntegerAdd;
            }
            int i12 = iArr[i11];
            bigIntegerAdd = bigIntegerAdd.add(BigInteger.valueOf(i12 * i12));
            i11++;
        }
    }

    public void add(IntegerPolynomial integerPolynomial, int i11) {
        add(integerPolynomial);
        mod(i11);
    }

    public void center0(int i11) {
        for (int i12 = 0; i12 < this.coeffs.length; i12++) {
            while (true) {
                int[] iArr = this.coeffs;
                int i13 = iArr[i12];
                if (i13 >= (-i11) / 2) {
                    break;
                } else {
                    iArr[i12] = i13 + i11;
                }
            }
            while (true) {
                int[] iArr2 = this.coeffs;
                int i14 = iArr2[i12];
                if (i14 > i11 / 2) {
                    iArr2[i12] = i14 - i11;
                }
            }
        }
    }

    public long centeredNormSq(int i11) {
        int length = this.coeffs.length;
        IntegerPolynomial integerPolynomial = (IntegerPolynomial) clone();
        integerPolynomial.shiftGap(i11);
        long j11 = 0;
        int i12 = 0;
        long j12 = 0;
        while (true) {
            int[] iArr = integerPolynomial.coeffs;
            if (i12 == iArr.length) {
                return j11 - ((j12 * j12) / ((long) length));
            }
            int i13 = iArr[i12];
            j12 += (long) i13;
            j11 += (long) (i13 * i13);
            i12++;
        }
    }

    public void clear() {
        int i11 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i11 >= iArr.length) {
                return;
            }
            iArr[i11] = 0;
            i11++;
        }
    }

    public Object clone() {
        return new IntegerPolynomial((int[]) this.coeffs.clone());
    }

    public int count(int i11) {
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i12 == iArr.length) {
                return i13;
            }
            if (iArr[i12] == i11) {
                i13++;
            }
            i12++;
        }
    }

    int degree() {
        int length = this.coeffs.length - 1;
        while (length > 0 && this.coeffs[length] == 0) {
            length--;
        }
        return length;
    }

    public void div(int i11) {
        int i12 = (i11 + 1) / 2;
        int i13 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i13 >= iArr.length) {
                return;
            }
            int i14 = iArr[i13];
            int i15 = i14 + (i14 > 0 ? i12 : -i12);
            iArr[i13] = i15;
            iArr[i13] = i15 / i11;
            i13++;
        }
    }

    public void ensurePositive(int i11) {
        for (int i12 = 0; i12 < this.coeffs.length; i12++) {
            while (true) {
                int[] iArr = this.coeffs;
                int i13 = iArr[i12];
                if (i13 < 0) {
                    iArr[i12] = i13 + i11;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof IntegerPolynomial) {
            return Arrays.areEqual(this.coeffs, ((IntegerPolynomial) obj).coeffs);
        }
        return false;
    }

    public boolean equalsOne() {
        int i11 = 1;
        while (true) {
            int[] iArr = this.coeffs;
            if (i11 >= iArr.length) {
                return iArr[0] == 1;
            }
            if (iArr[i11] != 0) {
                return false;
            }
            i11++;
        }
    }

    public IntegerPolynomial invertF3() {
        int length = this.coeffs.length;
        int i11 = length + 1;
        IntegerPolynomial integerPolynomial = new IntegerPolynomial(i11);
        integerPolynomial.coeffs[0] = 1;
        IntegerPolynomial integerPolynomial2 = new IntegerPolynomial(i11);
        IntegerPolynomial integerPolynomial3 = new IntegerPolynomial(i11);
        integerPolynomial3.coeffs = Arrays.copyOf(this.coeffs, i11);
        integerPolynomial3.modPositive(3);
        IntegerPolynomial integerPolynomial4 = new IntegerPolynomial(i11);
        int[] iArr = integerPolynomial4.coeffs;
        iArr[0] = -1;
        iArr[length] = 1;
        int i12 = 0;
        while (true) {
            if (integerPolynomial3.coeffs[0] == 0) {
                for (int i13 = 1; i13 <= length; i13++) {
                    int[] iArr2 = integerPolynomial3.coeffs;
                    iArr2[i13 - 1] = iArr2[i13];
                    int[] iArr3 = integerPolynomial2.coeffs;
                    iArr3[i11 - i13] = iArr3[length - i13];
                }
                integerPolynomial3.coeffs[length] = 0;
                integerPolynomial2.coeffs[0] = 0;
                i12++;
                if (integerPolynomial3.equalsZero()) {
                    return null;
                }
            } else {
                if (integerPolynomial3.equalsAbsOne()) {
                    if (integerPolynomial.coeffs[length] != 0) {
                        return null;
                    }
                    IntegerPolynomial integerPolynomial5 = new IntegerPolynomial(length);
                    int i14 = i12 % length;
                    for (int i15 = length - 1; i15 >= 0; i15--) {
                        int i16 = i15 - i14;
                        if (i16 < 0) {
                            i16 += length;
                        }
                        integerPolynomial5.coeffs[i16] = integerPolynomial3.coeffs[0] * integerPolynomial.coeffs[i15];
                    }
                    integerPolynomial5.ensurePositive(3);
                    return integerPolynomial5;
                }
                if (integerPolynomial3.degree() < integerPolynomial4.degree()) {
                    IntegerPolynomial integerPolynomial6 = integerPolynomial2;
                    integerPolynomial2 = integerPolynomial;
                    integerPolynomial = integerPolynomial6;
                    IntegerPolynomial integerPolynomial7 = integerPolynomial4;
                    integerPolynomial4 = integerPolynomial3;
                    integerPolynomial3 = integerPolynomial7;
                }
                if (integerPolynomial3.coeffs[0] == integerPolynomial4.coeffs[0]) {
                    integerPolynomial3.sub(integerPolynomial4, 3);
                    integerPolynomial.sub(integerPolynomial2, 3);
                } else {
                    integerPolynomial3.add(integerPolynomial4, 3);
                    integerPolynomial.add(integerPolynomial2, 3);
                }
            }
        }
    }

    public IntegerPolynomial invertFq(int i11) {
        int length = this.coeffs.length;
        int i12 = length + 1;
        IntegerPolynomial integerPolynomial = new IntegerPolynomial(i12);
        integerPolynomial.coeffs[0] = 1;
        IntegerPolynomial integerPolynomial2 = new IntegerPolynomial(i12);
        IntegerPolynomial integerPolynomial3 = new IntegerPolynomial(i12);
        integerPolynomial3.coeffs = Arrays.copyOf(this.coeffs, i12);
        integerPolynomial3.modPositive(2);
        IntegerPolynomial integerPolynomial4 = new IntegerPolynomial(i12);
        int[] iArr = integerPolynomial4.coeffs;
        iArr[0] = 1;
        iArr[length] = 1;
        int i13 = 0;
        while (true) {
            if (integerPolynomial3.coeffs[0] == 0) {
                for (int i14 = 1; i14 <= length; i14++) {
                    int[] iArr2 = integerPolynomial3.coeffs;
                    iArr2[i14 - 1] = iArr2[i14];
                    int[] iArr3 = integerPolynomial2.coeffs;
                    iArr3[i12 - i14] = iArr3[length - i14];
                }
                integerPolynomial3.coeffs[length] = 0;
                integerPolynomial2.coeffs[0] = 0;
                i13++;
                if (integerPolynomial3.equalsZero()) {
                    return null;
                }
            } else {
                if (integerPolynomial3.equalsOne()) {
                    if (integerPolynomial.coeffs[length] != 0) {
                        return null;
                    }
                    IntegerPolynomial integerPolynomial5 = new IntegerPolynomial(length);
                    int i15 = i13 % length;
                    for (int i16 = length - 1; i16 >= 0; i16--) {
                        int i17 = i16 - i15;
                        if (i17 < 0) {
                            i17 += length;
                        }
                        integerPolynomial5.coeffs[i17] = integerPolynomial.coeffs[i16];
                    }
                    return mod2ToModq(integerPolynomial5, i11);
                }
                if (integerPolynomial3.degree() < integerPolynomial4.degree()) {
                    IntegerPolynomial integerPolynomial6 = integerPolynomial2;
                    integerPolynomial2 = integerPolynomial;
                    integerPolynomial = integerPolynomial6;
                    IntegerPolynomial integerPolynomial7 = integerPolynomial4;
                    integerPolynomial4 = integerPolynomial3;
                    integerPolynomial3 = integerPolynomial7;
                }
                integerPolynomial3.add(integerPolynomial4, 2);
                integerPolynomial.add(integerPolynomial2, 2);
            }
        }
    }

    public void mod(int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i12 >= iArr.length) {
                return;
            }
            iArr[i12] = iArr[i12] % i11;
            i12++;
        }
    }

    public void mod3() {
        int i11 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i11 >= iArr.length) {
                return;
            }
            int i12 = iArr[i11] % 3;
            iArr[i11] = i12;
            if (i12 > 1) {
                iArr[i11] = i12 - 3;
            }
            int i13 = iArr[i11];
            if (i13 < -1) {
                iArr[i11] = i13 + 3;
            }
            i11++;
        }
    }

    void modCenter(int i11) {
        int i12;
        mod(i11);
        for (int i13 = 0; i13 < this.coeffs.length; i13++) {
            while (true) {
                int[] iArr = this.coeffs;
                int i14 = iArr[i13];
                i12 = i11 / 2;
                if (i14 >= i12) {
                    break;
                } else {
                    iArr[i13] = i14 + i11;
                }
            }
            while (true) {
                int[] iArr2 = this.coeffs;
                int i15 = iArr2[i13];
                if (i15 >= i12) {
                    iArr2[i13] = i15 - i11;
                }
            }
        }
    }

    public void modPositive(int i11) {
        mod(i11);
        ensurePositive(i11);
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial, int i11) {
        IntegerPolynomial integerPolynomialMult = mult(integerPolynomial);
        integerPolynomialMult.mod(i11);
        return integerPolynomialMult;
    }

    public void mult3(int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i12 >= iArr.length) {
                return;
            }
            int i13 = iArr[i12] * 3;
            iArr[i12] = i13;
            iArr[i12] = i13 % i11;
            i12++;
        }
    }

    public Resultant resultant() {
        BigInteger bigIntegerMultiply;
        BigInteger bigIntegerAdd;
        int length = this.coeffs.length;
        LinkedList linkedList = new LinkedList();
        BigInteger bigInteger = Constants.BIGINT_ONE;
        PrimeGenerator primeGenerator = new PrimeGenerator();
        BigInteger bigInteger2 = bigInteger;
        int i11 = 1;
        while (true) {
            BigInteger bigIntegerNextPrime = primeGenerator.nextPrime();
            ModularResultant modularResultantResultant = resultant(bigIntegerNextPrime.intValue());
            linkedList.add(modularResultantResultant);
            bigIntegerMultiply = bigInteger.multiply(bigIntegerNextPrime);
            BigIntEuclidean bigIntEuclideanCalculate = BigIntEuclidean.calculate(bigIntegerNextPrime, bigInteger);
            BigInteger bigIntegerMod = bigInteger2.multiply(bigIntEuclideanCalculate.f99865x.multiply(bigIntegerNextPrime)).add(modularResultantResultant.res.multiply(bigIntEuclideanCalculate.f99866y.multiply(bigInteger))).mod(bigIntegerMultiply);
            BigInteger bigIntegerDivide = bigIntegerMultiply.divide(BigInteger.valueOf(2L));
            BigInteger bigIntegerNegate = bigIntegerDivide.negate();
            if (bigIntegerMod.compareTo(bigIntegerDivide) > 0) {
                bigIntegerAdd = bigIntegerMod.subtract(bigIntegerMultiply);
            } else if (bigIntegerMod.compareTo(bigIntegerNegate) < 0) {
                bigIntegerAdd = bigIntegerMod;
                bigIntegerAdd = bigIntegerMod.add(bigIntegerMultiply);
            }
            bigIntegerAdd = bigIntegerMod;
            if (bigIntegerAdd.equals(bigInteger2)) {
                i11++;
                if (i11 >= 3) {
                    break;
                }
            } else {
                i11 = 1;
            }
            bigInteger2 = bigIntegerAdd;
            bigInteger = bigIntegerMultiply;
        }
        while (linkedList.size() > 1) {
            linkedList.addLast(ModularResultant.combineRho((ModularResultant) linkedList.removeFirst(), (ModularResultant) linkedList.removeFirst()));
        }
        BigIntPolynomial bigIntPolynomial = ((ModularResultant) linkedList.getFirst()).rho;
        BigInteger bigIntegerDivide2 = bigIntegerMultiply.divide(BigInteger.valueOf(2L));
        BigInteger bigIntegerNegate2 = bigIntegerDivide2.negate();
        int iCompareTo = bigIntegerAdd.compareTo(bigIntegerDivide2);
        BigInteger bigIntegerSubtract = bigIntegerAdd;
        if (iCompareTo > 0) {
            bigIntegerSubtract = bigIntegerAdd.subtract(bigIntegerMultiply);
        }
        int iCompareTo2 = bigIntegerSubtract.compareTo(bigIntegerNegate2);
        BigInteger bigIntegerAdd2 = bigIntegerSubtract;
        if (iCompareTo2 < 0) {
            bigIntegerAdd2 = bigIntegerSubtract.add(bigIntegerMultiply);
        }
        for (int i12 = 0; i12 < length; i12++) {
            BigInteger bigInteger3 = bigIntPolynomial.coeffs[i12];
            if (bigInteger3.compareTo(bigIntegerDivide2) > 0) {
                bigIntPolynomial.coeffs[i12] = bigInteger3.subtract(bigIntegerMultiply);
            }
            if (bigInteger3.compareTo(bigIntegerNegate2) < 0) {
                bigIntPolynomial.coeffs[i12] = bigInteger3.add(bigIntegerMultiply);
            }
        }
        return new Resultant(bigIntPolynomial, bigIntegerAdd2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Resultant resultantMultiThread() {
        ModularResultant modularResultant;
        Object[] objArr;
        int length = this.coeffs.length;
        BigInteger bigIntegerMultiply = squareSum().pow((length + 1) / 2).multiply(BigInteger.valueOf(2L).pow((degree() + 1) / 2)).multiply(BigInteger.valueOf(2L));
        BigInteger bigIntegerValueOf = BigInteger.valueOf(10000L);
        BigInteger bigIntegerMultiply2 = Constants.BIGINT_ONE;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        Iterator it = BIGINT_PRIMES.iterator();
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        while (true) {
            modularResultant = null;
            objArr = 0;
            Object[] objArr2 = 0;
            if (bigIntegerMultiply2.compareTo(bigIntegerMultiply) >= 0) {
                break;
            }
            bigIntegerValueOf = it.hasNext() ? (BigInteger) it.next() : bigIntegerValueOf.nextProbablePrime();
            linkedBlockingQueue.add(executorServiceNewFixedThreadPool.submit(new ModResultantTask(bigIntegerValueOf.intValue())));
            bigIntegerMultiply2 = bigIntegerMultiply2.multiply(bigIntegerValueOf);
        }
        while (!linkedBlockingQueue.isEmpty()) {
            try {
                Future future = (Future) linkedBlockingQueue.take();
                Future future2 = (Future) linkedBlockingQueue.poll();
                if (future2 == null) {
                    modularResultant = (ModularResultant) future.get();
                    break;
                }
                linkedBlockingQueue.add(executorServiceNewFixedThreadPool.submit(new CombineTask((ModularResultant) future.get(), (ModularResultant) future2.get())));
            } catch (Exception e11) {
                throw new IllegalStateException(e11.toString());
            }
        }
        executorServiceNewFixedThreadPool.shutdown();
        BigInteger bigIntegerAdd = modularResultant.res;
        BigIntPolynomial bigIntPolynomial = modularResultant.rho;
        BigInteger bigIntegerDivide = bigIntegerMultiply2.divide(BigInteger.valueOf(2L));
        BigInteger bigIntegerNegate = bigIntegerDivide.negate();
        if (bigIntegerAdd.compareTo(bigIntegerDivide) > 0) {
            bigIntegerAdd = bigIntegerAdd.subtract(bigIntegerMultiply2);
        }
        if (bigIntegerAdd.compareTo(bigIntegerNegate) < 0) {
            bigIntegerAdd = bigIntegerAdd.add(bigIntegerMultiply2);
        }
        for (int i11 = 0; i11 < length; i11++) {
            BigInteger bigInteger = bigIntPolynomial.coeffs[i11];
            if (bigInteger.compareTo(bigIntegerDivide) > 0) {
                bigIntPolynomial.coeffs[i11] = bigInteger.subtract(bigIntegerMultiply2);
            }
            if (bigInteger.compareTo(bigIntegerNegate) < 0) {
                bigIntPolynomial.coeffs[i11] = bigInteger.add(bigIntegerMultiply2);
            }
        }
        return new Resultant(bigIntPolynomial, bigIntegerAdd);
    }

    public void rotate1() {
        int[] iArr = this.coeffs;
        int i11 = iArr[iArr.length - 1];
        for (int length = iArr.length - 1; length > 0; length--) {
            int[] iArr2 = this.coeffs;
            iArr2[length] = iArr2[length - 1];
        }
        this.coeffs[0] = i11;
    }

    void shiftGap(int i11) {
        modCenter(i11);
        int[] iArrClone = Arrays.clone(this.coeffs);
        sort(iArrClone);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < iArrClone.length - 1) {
            int i15 = i12 + 1;
            int i16 = iArrClone[i15];
            int i17 = iArrClone[i12];
            int i18 = i16 - i17;
            if (i18 > i13) {
                i14 = i17;
                i13 = i18;
            }
            i12 = i15;
        }
        int i19 = iArrClone[0];
        int i21 = iArrClone[iArrClone.length - 1];
        sub((i11 - i21) + i19 > i13 ? (i21 + i19) / 2 : i14 + (i13 / 2) + (i11 / 2));
    }

    public void sub(IntegerPolynomial integerPolynomial, int i11) {
        sub(integerPolynomial);
        mod(i11);
    }

    public int sumCoeffs() {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i11 >= iArr.length) {
                return i12;
            }
            i12 += iArr[i11];
            i11++;
        }
    }

    public byte[] toBinary(int i11) {
        return ArrayEncoder.encodeModQ(this.coeffs, i11);
    }

    public byte[] toBinary3Sves() {
        return ArrayEncoder.encodeMod3Sves(this.coeffs);
    }

    public byte[] toBinary3Tight() {
        BigInteger bigIntegerAdd = Constants.BIGINT_ZERO;
        for (int length = this.coeffs.length - 1; length >= 0; length--) {
            bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.valueOf(3L)).add(BigInteger.valueOf(this.coeffs[length] + 1));
        }
        int iBitLength = (BigInteger.valueOf(3L).pow(this.coeffs.length).bitLength() + 7) / 8;
        byte[] byteArray = bigIntegerAdd.toByteArray();
        if (byteArray.length >= iBitLength) {
            return byteArray.length > iBitLength ? Arrays.copyOfRange(byteArray, 1, byteArray.length) : byteArray;
        }
        byte[] bArr = new byte[iBitLength];
        System.arraycopy(byteArray, 0, bArr, iBitLength - byteArray.length, byteArray.length);
        return bArr;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial toIntegerPolynomial() {
        return (IntegerPolynomial) clone();
    }

    public static IntegerPolynomial fromBinary(InputStream inputStream, int i11, int i12) {
        return new IntegerPolynomial(ArrayEncoder.decodeModQ(inputStream, i11, i12));
    }

    public static IntegerPolynomial fromBinary3Tight(InputStream inputStream, int i11) {
        return new IntegerPolynomial(ArrayEncoder.decodeMod3Tight(inputStream, i11));
    }

    public IntegerPolynomial(int[] iArr) {
        this.coeffs = iArr;
    }

    public void add(IntegerPolynomial integerPolynomial) {
        int[] iArr = integerPolynomial.coeffs;
        int length = iArr.length;
        int[] iArr2 = this.coeffs;
        if (length > iArr2.length) {
            this.coeffs = Arrays.copyOf(iArr2, iArr.length);
        }
        int i11 = 0;
        while (true) {
            int[] iArr3 = integerPolynomial.coeffs;
            if (i11 >= iArr3.length) {
                return;
            }
            int[] iArr4 = this.coeffs;
            iArr4[i11] = iArr4[i11] + iArr3[i11];
            i11++;
        }
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial) {
        int[] iArr;
        int length = this.coeffs.length;
        if (integerPolynomial.coeffs.length == length) {
            IntegerPolynomial integerPolynomialMultRecursive = multRecursive(integerPolynomial);
            if (integerPolynomialMultRecursive.coeffs.length > length) {
                int i11 = length;
                while (true) {
                    iArr = integerPolynomialMultRecursive.coeffs;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    int i12 = i11 - length;
                    iArr[i12] = iArr[i12] + iArr[i11];
                    i11++;
                }
                integerPolynomialMultRecursive.coeffs = Arrays.copyOf(iArr, length);
            }
            return integerPolynomialMultRecursive;
        }
        throw new IllegalArgumentException("Number of coefficients must be the same");
    }

    public void sub(IntegerPolynomial integerPolynomial) {
        int[] iArr = integerPolynomial.coeffs;
        int length = iArr.length;
        int[] iArr2 = this.coeffs;
        if (length > iArr2.length) {
            this.coeffs = Arrays.copyOf(iArr2, iArr.length);
        }
        int i11 = 0;
        while (true) {
            int[] iArr3 = integerPolynomial.coeffs;
            if (i11 >= iArr3.length) {
                return;
            }
            int[] iArr4 = this.coeffs;
            iArr4[i11] = iArr4[i11] - iArr3[i11];
            i11++;
        }
    }

    public IntegerPolynomial(BigIntPolynomial bigIntPolynomial) {
        this.coeffs = new int[bigIntPolynomial.coeffs.length];
        int i11 = 0;
        while (true) {
            BigInteger[] bigIntegerArr = bigIntPolynomial.coeffs;
            if (i11 >= bigIntegerArr.length) {
                return;
            }
            this.coeffs[i11] = bigIntegerArr[i11].intValue();
            i11++;
        }
    }

    void sub(int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i12 >= iArr.length) {
                return;
            }
            iArr[i12] = iArr[i12] - i11;
            i12++;
        }
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public BigIntPolynomial mult(BigIntPolynomial bigIntPolynomial) {
        return new BigIntPolynomial(this).mult(bigIntPolynomial);
    }

    public void mult(int i11) {
        int i12 = 0;
        while (true) {
            int[] iArr = this.coeffs;
            if (i12 >= iArr.length) {
                return;
            }
            iArr[i12] = iArr[i12] * i11;
            i12++;
        }
    }

    public ModularResultant resultant(int i11) {
        int[] iArr = this.coeffs;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        IntegerPolynomial integerPolynomial = new IntegerPolynomial(iArrCopyOf);
        int length = iArrCopyOf.length;
        IntegerPolynomial integerPolynomial2 = new IntegerPolynomial(length);
        int[] iArr2 = integerPolynomial2.coeffs;
        iArr2[0] = -1;
        int i12 = length - 1;
        iArr2[i12] = 1;
        IntegerPolynomial integerPolynomial3 = new IntegerPolynomial(integerPolynomial.coeffs);
        IntegerPolynomial integerPolynomial4 = new IntegerPolynomial(length);
        IntegerPolynomial integerPolynomial5 = new IntegerPolynomial(length);
        integerPolynomial5.coeffs[0] = 1;
        int iDegree = integerPolynomial3.degree();
        IntegerPolynomial integerPolynomial6 = integerPolynomial2;
        IntegerPolynomial integerPolynomial7 = integerPolynomial3;
        int iPow = 1;
        int i13 = i12;
        int i14 = iDegree;
        IntegerPolynomial integerPolynomial8 = integerPolynomial4;
        IntegerPolynomial integerPolynomial9 = integerPolynomial5;
        while (true) {
            int iDegree2 = i13;
            do {
                if (i14 > 0) {
                    int iInvert = (Util.invert(integerPolynomial7.coeffs[i14], i11) * integerPolynomial6.coeffs[iDegree2]) % i11;
                    int i15 = iDegree2 - i14;
                    integerPolynomial6.multShiftSub(integerPolynomial7, iInvert, i15, i11);
                    integerPolynomial8.multShiftSub(integerPolynomial9, iInvert, i15, i11);
                    iDegree2 = integerPolynomial6.degree();
                } else {
                    int iPow2 = (iPow * Util.pow(integerPolynomial7.coeffs[0], iDegree2, i11)) % i11;
                    integerPolynomial9.mult(Util.invert(integerPolynomial7.coeffs[0], i11));
                    integerPolynomial9.mod(i11);
                    integerPolynomial9.mult(iPow2);
                    integerPolynomial9.mod(i11);
                    int[] iArr3 = integerPolynomial9.coeffs;
                    integerPolynomial9.coeffs = Arrays.copyOf(iArr3, iArr3.length - 1);
                    return new ModularResultant(new BigIntPolynomial(integerPolynomial9), BigInteger.valueOf(iPow2), BigInteger.valueOf(i11));
                }
            } while (iDegree2 >= i14);
            iPow = (iPow * Util.pow(integerPolynomial7.coeffs[i14], i13 - iDegree2, i11)) % i11;
            if (i13 % 2 == 1 && i14 % 2 == 1) {
                iPow = (-iPow) % i11;
            }
            IntegerPolynomial integerPolynomial10 = integerPolynomial9;
            integerPolynomial9 = integerPolynomial8;
            integerPolynomial8 = integerPolynomial10;
            IntegerPolynomial integerPolynomial11 = integerPolynomial6;
            integerPolynomial6 = integerPolynomial7;
            integerPolynomial7 = integerPolynomial11;
            i13 = i14;
            i14 = iDegree2;
        }
    }
}
