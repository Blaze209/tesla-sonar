package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat160;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes10.dex */
public class SecP160R1Curve extends ECCurve.AbstractFp {
    private static final int SECP160R1_DEFAULT_COORDS = 2;
    protected SecP160R1Point infinity;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BigInteger f98937q = SecP160R1FieldElement.Q;
    private static final ECFieldElement[] SECP160R1_AFFINE_ZS = {new SecP160R1FieldElement(ECConstants.ONE)};

    public SecP160R1Curve() {
        super(f98937q);
        this.infinity = new SecP160R1Point(this, null, null);
        this.f98910a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.f98911b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.order = new BigInteger(1, Hex.decodeStrict("0100000000000000000001F4C8F927AED3CA752257"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    protected ECCurve cloneCurve() {
        return new SecP160R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i11, final int i12) {
        final int[] iArr = new int[i12 * 10];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            ECPoint eCPoint = eCPointArr[i11 + i14];
            Nat160.copy(((SecP160R1FieldElement) eCPoint.getRawXCoord()).f98938x, 0, iArr, i13);
            Nat160.copy(((SecP160R1FieldElement) eCPoint.getRawYCoord()).f98938x, 0, iArr, i13 + 5);
            i13 += 10;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecP160R1Curve.1
            private ECPoint createPoint(int[] iArr2, int[] iArr3) {
                return SecP160R1Curve.this.createRawPoint(new SecP160R1FieldElement(iArr2), new SecP160R1FieldElement(iArr3), SecP160R1Curve.SECP160R1_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i12;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i15) {
                int[] iArrCreate = Nat160.create();
                int[] iArrCreate2 = Nat160.create();
                int i16 = 0;
                for (int i17 = 0; i17 < i12; i17++) {
                    int i18 = ((i17 ^ i15) - 1) >> 31;
                    for (int i19 = 0; i19 < 5; i19++) {
                        int i21 = iArrCreate[i19];
                        int[] iArr2 = iArr;
                        iArrCreate[i19] = i21 ^ (iArr2[i16 + i19] & i18);
                        iArrCreate2[i19] = iArrCreate2[i19] ^ (iArr2[(i16 + 5) + i19] & i18);
                    }
                    i16 += 10;
                }
                return createPoint(iArrCreate, iArrCreate2);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i15) {
                int[] iArrCreate = Nat160.create();
                int[] iArrCreate2 = Nat160.create();
                int i16 = i15 * 10;
                for (int i17 = 0; i17 < 5; i17++) {
                    int[] iArr2 = iArr;
                    iArrCreate[i17] = iArr2[i16 + i17];
                    iArrCreate2[i17] = iArr2[5 + i16 + i17];
                }
                return createPoint(iArrCreate, iArrCreate2);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    protected ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecP160R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP160R1FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f98937q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f98937q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.random(secureRandom, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.randomMult(secureRandom, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i11) {
        return i11 == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    protected ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP160R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
