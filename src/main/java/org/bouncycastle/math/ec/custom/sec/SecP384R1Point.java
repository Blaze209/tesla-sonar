package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat384;

/* JADX INFO: loaded from: classes10.dex */
public class SecP384R1Point extends ECPoint.AbstractFp {
    SecP384R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        if (this == eCPoint) {
            return twice();
        }
        ECCurve curve = getCurve();
        SecP384R1FieldElement secP384R1FieldElement = (SecP384R1FieldElement) this.f98925x;
        SecP384R1FieldElement secP384R1FieldElement2 = (SecP384R1FieldElement) this.f98926y;
        SecP384R1FieldElement secP384R1FieldElement3 = (SecP384R1FieldElement) eCPoint.getXCoord();
        SecP384R1FieldElement secP384R1FieldElement4 = (SecP384R1FieldElement) eCPoint.getYCoord();
        SecP384R1FieldElement secP384R1FieldElement5 = (SecP384R1FieldElement) this.f98927zs[0];
        SecP384R1FieldElement secP384R1FieldElement6 = (SecP384R1FieldElement) eCPoint.getZCoord(0);
        int[] iArrCreate = Nat.create(24);
        int[] iArrCreate2 = Nat.create(24);
        int[] iArrCreate3 = Nat.create(24);
        int[] iArrCreate4 = Nat.create(12);
        int[] iArrCreate5 = Nat.create(12);
        boolean zIsOne = secP384R1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP384R1FieldElement3.f98954x;
            iArr2 = secP384R1FieldElement4.f98954x;
        } else {
            SecP384R1Field.square(secP384R1FieldElement5.f98954x, iArrCreate4, iArrCreate);
            SecP384R1Field.multiply(iArrCreate4, secP384R1FieldElement3.f98954x, iArrCreate3, iArrCreate);
            SecP384R1Field.multiply(iArrCreate4, secP384R1FieldElement5.f98954x, iArrCreate4, iArrCreate);
            SecP384R1Field.multiply(iArrCreate4, secP384R1FieldElement4.f98954x, iArrCreate4, iArrCreate);
            iArr = iArrCreate3;
            iArr2 = iArrCreate4;
        }
        boolean zIsOne2 = secP384R1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP384R1FieldElement.f98954x;
            iArr4 = secP384R1FieldElement2.f98954x;
        } else {
            SecP384R1Field.square(secP384R1FieldElement6.f98954x, iArrCreate5, iArrCreate);
            SecP384R1Field.multiply(iArrCreate5, secP384R1FieldElement.f98954x, iArrCreate2, iArrCreate);
            SecP384R1Field.multiply(iArrCreate5, secP384R1FieldElement6.f98954x, iArrCreate5, iArrCreate);
            SecP384R1Field.multiply(iArrCreate5, secP384R1FieldElement2.f98954x, iArrCreate5, iArrCreate);
            iArr3 = iArrCreate2;
            iArr4 = iArrCreate5;
        }
        int[] iArrCreate6 = Nat.create(r12);
        SecP384R1Field.subtract(iArr3, iArr, iArrCreate6);
        int[] iArrCreate7 = Nat.create(r12);
        SecP384R1Field.subtract(iArr4, iArr2, iArrCreate7);
        if (Nat.isZero(12, iArrCreate6)) {
            return Nat.isZero(12, iArrCreate7) ? twice() : curve.getInfinity();
        }
        SecP384R1Field.square(iArrCreate6, iArrCreate4, iArrCreate);
        int[] iArrCreate8 = Nat.create(12);
        SecP384R1Field.multiply(iArrCreate4, iArrCreate6, iArrCreate8, iArrCreate);
        SecP384R1Field.multiply(iArrCreate4, iArr3, iArrCreate4, iArrCreate);
        SecP384R1Field.negate(iArrCreate8, iArrCreate8);
        Nat384.mul(iArr4, iArrCreate8, iArrCreate2);
        SecP384R1Field.reduce32(Nat.addBothTo(12, iArrCreate4, iArrCreate4, iArrCreate8), iArrCreate8);
        SecP384R1FieldElement secP384R1FieldElement7 = new SecP384R1FieldElement(iArrCreate5);
        SecP384R1Field.square(iArrCreate7, secP384R1FieldElement7.f98954x, iArrCreate);
        int[] iArr5 = secP384R1FieldElement7.f98954x;
        SecP384R1Field.subtract(iArr5, iArrCreate8, iArr5);
        SecP384R1FieldElement secP384R1FieldElement8 = new SecP384R1FieldElement(iArrCreate8);
        SecP384R1Field.subtract(iArrCreate4, secP384R1FieldElement7.f98954x, secP384R1FieldElement8.f98954x);
        Nat384.mul(secP384R1FieldElement8.f98954x, iArrCreate7, iArrCreate3);
        SecP384R1Field.addExt(iArrCreate2, iArrCreate3, iArrCreate2);
        SecP384R1Field.reduce(iArrCreate2, secP384R1FieldElement8.f98954x);
        SecP384R1FieldElement secP384R1FieldElement9 = new SecP384R1FieldElement(iArrCreate6);
        if (!zIsOne) {
            int[] iArr6 = secP384R1FieldElement9.f98954x;
            SecP384R1Field.multiply(iArr6, secP384R1FieldElement5.f98954x, iArr6, iArrCreate);
        }
        if (!zIsOne2) {
            int[] iArr7 = secP384R1FieldElement9.f98954x;
            SecP384R1Field.multiply(iArr7, secP384R1FieldElement6.f98954x, iArr7, iArrCreate);
        }
        return new SecP384R1Point(curve, secP384R1FieldElement7, secP384R1FieldElement8, new ECFieldElement[]{secP384R1FieldElement9});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    protected ECPoint detach() {
        return new SecP384R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP384R1Point(this.curve, this.f98925x, this.f98926y.negate(), this.f98927zs);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint threeTimes() {
        return (isInfinity() || this.f98926y.isZero()) ? this : twice().add(this);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        SecP384R1FieldElement secP384R1FieldElement = (SecP384R1FieldElement) this.f98926y;
        if (secP384R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP384R1FieldElement secP384R1FieldElement2 = (SecP384R1FieldElement) this.f98925x;
        SecP384R1FieldElement secP384R1FieldElement3 = (SecP384R1FieldElement) this.f98927zs[0];
        int[] iArrCreate = Nat.create(24);
        int[] iArrCreate2 = Nat.create(12);
        int[] iArrCreate3 = Nat.create(12);
        int[] iArrCreate4 = Nat.create(12);
        SecP384R1Field.square(secP384R1FieldElement.f98954x, iArrCreate4, iArrCreate);
        int[] iArrCreate5 = Nat.create(12);
        SecP384R1Field.square(iArrCreate4, iArrCreate5, iArrCreate);
        boolean zIsOne = secP384R1FieldElement3.isOne();
        int[] iArr = secP384R1FieldElement3.f98954x;
        if (!zIsOne) {
            SecP384R1Field.square(iArr, iArrCreate3, iArrCreate);
            iArr = iArrCreate3;
        }
        SecP384R1Field.subtract(secP384R1FieldElement2.f98954x, iArr, iArrCreate2);
        SecP384R1Field.add(secP384R1FieldElement2.f98954x, iArr, iArrCreate3);
        SecP384R1Field.multiply(iArrCreate3, iArrCreate2, iArrCreate3, iArrCreate);
        SecP384R1Field.reduce32(Nat.addBothTo(12, iArrCreate3, iArrCreate3, iArrCreate3), iArrCreate3);
        SecP384R1Field.multiply(iArrCreate4, secP384R1FieldElement2.f98954x, iArrCreate4, iArrCreate);
        SecP384R1Field.reduce32(Nat.shiftUpBits(12, iArrCreate4, 2, 0), iArrCreate4);
        SecP384R1Field.reduce32(Nat.shiftUpBits(12, iArrCreate5, 3, 0, iArrCreate2), iArrCreate2);
        SecP384R1FieldElement secP384R1FieldElement4 = new SecP384R1FieldElement(iArrCreate5);
        SecP384R1Field.square(iArrCreate3, secP384R1FieldElement4.f98954x, iArrCreate);
        int[] iArr2 = secP384R1FieldElement4.f98954x;
        SecP384R1Field.subtract(iArr2, iArrCreate4, iArr2);
        int[] iArr3 = secP384R1FieldElement4.f98954x;
        SecP384R1Field.subtract(iArr3, iArrCreate4, iArr3);
        SecP384R1FieldElement secP384R1FieldElement5 = new SecP384R1FieldElement(iArrCreate4);
        SecP384R1Field.subtract(iArrCreate4, secP384R1FieldElement4.f98954x, secP384R1FieldElement5.f98954x);
        int[] iArr4 = secP384R1FieldElement5.f98954x;
        SecP384R1Field.multiply(iArr4, iArrCreate3, iArr4, iArrCreate);
        int[] iArr5 = secP384R1FieldElement5.f98954x;
        SecP384R1Field.subtract(iArr5, iArrCreate2, iArr5);
        SecP384R1FieldElement secP384R1FieldElement6 = new SecP384R1FieldElement(iArrCreate3);
        SecP384R1Field.twice(secP384R1FieldElement.f98954x, secP384R1FieldElement6.f98954x);
        if (!zIsOne) {
            int[] iArr6 = secP384R1FieldElement6.f98954x;
            SecP384R1Field.multiply(iArr6, secP384R1FieldElement3.f98954x, iArr6, iArrCreate);
        }
        return new SecP384R1Point(curve, secP384R1FieldElement4, secP384R1FieldElement5, new ECFieldElement[]{secP384R1FieldElement6});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint twicePlus(ECPoint eCPoint) {
        if (this == eCPoint) {
            return threeTimes();
        }
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return twice();
        }
        return this.f98926y.isZero() ? eCPoint : twice().add(eCPoint);
    }

    SecP384R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
