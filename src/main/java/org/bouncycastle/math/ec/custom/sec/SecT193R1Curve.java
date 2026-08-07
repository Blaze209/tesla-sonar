package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes10.dex */
public class SecT193R1Curve extends ECCurve.AbstractF2m {
    private static final ECFieldElement[] SECT193R1_AFFINE_ZS = {new SecT193FieldElement(ECConstants.ONE)};
    private static final int SECT193R1_DEFAULT_COORDS = 6;
    protected SecT193R1Point infinity;

    public SecT193R1Curve() {
        super(193, 15, 0, 0);
        this.infinity = new SecT193R1Point(this, null, null);
        this.f98910a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.f98911b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.order = new BigInteger(1, Hex.decodeStrict("01000000000000000000000000C7F34A778F443ACC920EBA49"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    protected ECCurve cloneCurve() {
        return new SecT193R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i11, final int i12) {
        final long[] jArr = new long[i12 * 8];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            ECPoint eCPoint = eCPointArr[i11 + i14];
            Nat256.copy64(((SecT193FieldElement) eCPoint.getRawXCoord()).f98960x, 0, jArr, i13);
            Nat256.copy64(((SecT193FieldElement) eCPoint.getRawYCoord()).f98960x, 0, jArr, i13 + 4);
            i13 += 8;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecT193R1Curve.1
            private ECPoint createPoint(long[] jArr2, long[] jArr3) {
                return SecT193R1Curve.this.createRawPoint(new SecT193FieldElement(jArr2), new SecT193FieldElement(jArr3), SecT193R1Curve.SECT193R1_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i12;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i15) {
                long[] jArrCreate64 = Nat256.create64();
                long[] jArrCreate65 = Nat256.create64();
                int i16 = 0;
                for (int i17 = 0; i17 < i12; i17++) {
                    long j11 = ((i17 ^ i15) - 1) >> 31;
                    for (int i18 = 0; i18 < 4; i18++) {
                        long j12 = jArrCreate64[i18];
                        long[] jArr2 = jArr;
                        jArrCreate64[i18] = j12 ^ (jArr2[i16 + i18] & j11);
                        jArrCreate65[i18] = jArrCreate65[i18] ^ (jArr2[(i16 + 4) + i18] & j11);
                    }
                    i16 += 8;
                }
                return createPoint(jArrCreate64, jArrCreate65);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i15) {
                long[] jArrCreate64 = Nat256.create64();
                long[] jArrCreate65 = Nat256.create64();
                int i16 = i15 * 8;
                for (int i17 = 0; i17 < 4; i17++) {
                    long[] jArr2 = jArr;
                    jArrCreate64[i17] = jArr2[i16 + i17];
                    jArrCreate65[i17] = jArr2[4 + i16 + i17];
                }
                return createPoint(jArrCreate64, jArrCreate65);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    protected ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecT193R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT193FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return 193;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 15;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 193;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return false;
    }

    public boolean isTrinomial() {
        return true;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i11) {
        return i11 == 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    protected ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecT193R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
