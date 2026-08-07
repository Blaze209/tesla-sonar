package org.bouncycastle.math.ec.custom.sec;

import com.plaid.internal.EnumC4419g;
import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.WTauNafMultiplier;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes10.dex */
public class SecT233K1Curve extends ECCurve.AbstractF2m {
    private static final ECFieldElement[] SECT233K1_AFFINE_ZS = {new SecT233FieldElement(ECConstants.ONE)};
    private static final int SECT233K1_DEFAULT_COORDS = 6;
    protected SecT233K1Point infinity;

    public SecT233K1Curve() {
        super(EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 74, 0, 0);
        this.infinity = new SecT233K1Point(this, null, null);
        this.f98910a = fromBigInteger(BigInteger.valueOf(0L));
        this.f98911b = fromBigInteger(BigInteger.valueOf(1L));
        this.order = new BigInteger(1, Hex.decodeStrict("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"));
        this.cofactor = BigInteger.valueOf(4L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    protected ECCurve cloneCurve() {
        return new SecT233K1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i11, final int i12) {
        final long[] jArr = new long[i12 * 8];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            ECPoint eCPoint = eCPointArr[i11 + i14];
            Nat256.copy64(((SecT233FieldElement) eCPoint.getRawXCoord()).f98961x, 0, jArr, i13);
            Nat256.copy64(((SecT233FieldElement) eCPoint.getRawYCoord()).f98961x, 0, jArr, i13 + 4);
            i13 += 8;
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecT233K1Curve.1
            private ECPoint createPoint(long[] jArr2, long[] jArr3) {
                return SecT233K1Curve.this.createRawPoint(new SecT233FieldElement(jArr2), new SecT233FieldElement(jArr3), SecT233K1Curve.SECT233K1_AFFINE_ZS);
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
    protected ECMultiplier createDefaultMultiplier() {
        return new WTauNafMultiplier();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    protected ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecT233K1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT233FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 74;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return true;
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
        return new SecT233K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
