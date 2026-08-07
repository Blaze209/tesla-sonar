package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat224;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes10.dex */
public class SecP224K1Curve extends ECCurve.AbstractFp {
    private static final int SECP224K1_DEFAULT_COORDS = 2;
    protected SecP224K1Point infinity;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BigInteger f98945q = SecP224K1FieldElement.Q;
    private static final ECFieldElement[] SECP224K1_AFFINE_ZS = {new SecP224K1FieldElement(ECConstants.ONE)};

    public SecP224K1Curve() {
        super(f98945q);
        this.infinity = new SecP224K1Point(this, null, null);
        this.f98910a = fromBigInteger(ECConstants.ZERO);
        this.f98911b = fromBigInteger(BigInteger.valueOf(5L));
        this.order = new BigInteger(1, Hex.decodeStrict("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    protected ECCurve cloneCurve() {
        return new SecP224K1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i11, final int i12) {
        final int[] iArr = new int[i12 * 14];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            ECPoint eCPoint = eCPointArr[i11 + i14];
            Nat224.copy(((SecP224K1FieldElement) eCPoint.getRawXCoord()).f98946x, 0, iArr, i13);
            Nat224.copy(((SecP224K1FieldElement) eCPoint.getRawYCoord()).f98946x, 0, iArr, i13 + 7);
            i13 += 14;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecP224K1Curve.1
            private ECPoint createPoint(int[] iArr2, int[] iArr3) {
                return SecP224K1Curve.this.createRawPoint(new SecP224K1FieldElement(iArr2), new SecP224K1FieldElement(iArr3), SecP224K1Curve.SECP224K1_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i12;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i15) {
                int[] iArrCreate = Nat224.create();
                int[] iArrCreate2 = Nat224.create();
                int i16 = 0;
                for (int i17 = 0; i17 < i12; i17++) {
                    int i18 = ((i17 ^ i15) - 1) >> 31;
                    for (int i19 = 0; i19 < 7; i19++) {
                        int i21 = iArrCreate[i19];
                        int[] iArr2 = iArr;
                        iArrCreate[i19] = i21 ^ (iArr2[i16 + i19] & i18);
                        iArrCreate2[i19] = iArrCreate2[i19] ^ (iArr2[(i16 + 7) + i19] & i18);
                    }
                    i16 += 14;
                }
                return createPoint(iArrCreate, iArrCreate2);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i15) {
                int[] iArrCreate = Nat224.create();
                int[] iArrCreate2 = Nat224.create();
                int i16 = 0;
                for (int i17 = 0; i17 < i12; i17++) {
                    int i18 = ((i17 ^ i15) - 1) >> 31;
                    for (int i19 = 0; i19 < 7; i19++) {
                        int i21 = iArrCreate[i19];
                        int[] iArr2 = iArr;
                        iArrCreate[i19] = i21 ^ (iArr2[i16 + i19] & i18);
                        iArrCreate2[i19] = iArrCreate2[i19] ^ (iArr2[(i16 + 7) + i19] & i18);
                    }
                    i16 += 14;
                }
                return createPoint(iArrCreate, iArrCreate2);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    protected ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecP224K1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP224K1FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f98945q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f98945q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.random(secureRandom, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
        int[] iArrCreate = Nat224.create();
        SecP224K1Field.randomMult(secureRandom, iArrCreate);
        return new SecP224K1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i11) {
        return i11 == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    protected ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP224K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
