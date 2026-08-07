package org.spongycastle.math.ec;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.EnumC4419g;
import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ECPoint {
    protected static ECFieldElement[] EMPTY_ZS = new ECFieldElement[0];
    protected ECCurve curve;
    protected Hashtable preCompTable;
    protected boolean withCompression;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected ECFieldElement f99691x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected ECFieldElement f99692y;

    /* JADX INFO: renamed from: zs, reason: collision with root package name */
    protected ECFieldElement[] f99693zs;

    public static abstract class AbstractF2m extends ECPoint {
        protected AbstractF2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
        }

        @Override // org.spongycastle.math.ec.ECPoint
        protected boolean satisfiesCurveEquation() {
            ECFieldElement eCFieldElementMultiplyPlusProduct;
            ECFieldElement eCFieldElementSquarePlusProduct;
            ECCurve curve = getCurve();
            ECFieldElement eCFieldElement = this.f99691x;
            ECFieldElement a11 = curve.getA();
            ECFieldElement b11 = curve.getB();
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem != 6) {
                ECFieldElement eCFieldElement2 = this.f99692y;
                ECFieldElement eCFieldElementMultiply = eCFieldElement2.add(eCFieldElement).multiply(eCFieldElement2);
                if (coordinateSystem != 0) {
                    if (coordinateSystem != 1) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    ECFieldElement eCFieldElement3 = this.f99693zs[0];
                    if (!eCFieldElement3.isOne()) {
                        ECFieldElement eCFieldElementMultiply2 = eCFieldElement3.multiply(eCFieldElement3.square());
                        eCFieldElementMultiply = eCFieldElementMultiply.multiply(eCFieldElement3);
                        a11 = a11.multiply(eCFieldElement3);
                        b11 = b11.multiply(eCFieldElementMultiply2);
                    }
                }
                return eCFieldElementMultiply.equals(eCFieldElement.add(a11).multiply(eCFieldElement.square()).add(b11));
            }
            ECFieldElement eCFieldElement4 = this.f99693zs[0];
            boolean zIsOne = eCFieldElement4.isOne();
            if (eCFieldElement.isZero()) {
                ECFieldElement eCFieldElementSquare = this.f99692y.square();
                if (!zIsOne) {
                    b11 = b11.multiply(eCFieldElement4.square());
                }
                return eCFieldElementSquare.equals(b11);
            }
            ECFieldElement eCFieldElement5 = this.f99692y;
            ECFieldElement eCFieldElementSquare2 = eCFieldElement.square();
            if (zIsOne) {
                eCFieldElementMultiplyPlusProduct = eCFieldElement5.square().add(eCFieldElement5).add(a11);
                eCFieldElementSquarePlusProduct = eCFieldElementSquare2.square().add(b11);
            } else {
                ECFieldElement eCFieldElementSquare3 = eCFieldElement4.square();
                ECFieldElement eCFieldElementSquare4 = eCFieldElementSquare3.square();
                eCFieldElementMultiplyPlusProduct = eCFieldElement5.add(eCFieldElement4).multiplyPlusProduct(eCFieldElement5, a11, eCFieldElementSquare3);
                eCFieldElementSquarePlusProduct = eCFieldElementSquare2.squarePlusProduct(b11, eCFieldElementSquare4);
            }
            return eCFieldElementMultiplyPlusProduct.multiply(eCFieldElementSquare2).equals(eCFieldElementSquarePlusProduct);
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint scaleX(ECFieldElement eCFieldElement) {
            if (isInfinity()) {
                return this;
            }
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem == 5) {
                ECFieldElement rawXCoord = getRawXCoord();
                ECFieldElement rawYCoord = getRawYCoord();
                return getCurve().createRawPoint(rawXCoord, rawYCoord.add(rawXCoord).divide(eCFieldElement).add(rawXCoord.multiply(eCFieldElement)), getRawZCoords(), this.withCompression);
            }
            if (curveCoordinateSystem != 6) {
                return super.scaleX(eCFieldElement);
            }
            ECFieldElement rawXCoord2 = getRawXCoord();
            ECFieldElement rawYCoord2 = getRawYCoord();
            ECFieldElement eCFieldElement2 = getRawZCoords()[0];
            ECFieldElement eCFieldElementMultiply = rawXCoord2.multiply(eCFieldElement.square());
            return getCurve().createRawPoint(eCFieldElementMultiply, rawYCoord2.add(rawXCoord2).add(eCFieldElementMultiply), new ECFieldElement[]{eCFieldElement2.multiply(eCFieldElement)}, this.withCompression);
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint scaleY(ECFieldElement eCFieldElement) {
            if (isInfinity()) {
                return this;
            }
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem != 5 && curveCoordinateSystem != 6) {
                return super.scaleY(eCFieldElement);
            }
            ECFieldElement rawXCoord = getRawXCoord();
            return getCurve().createRawPoint(rawXCoord, getRawYCoord().add(rawXCoord).multiply(eCFieldElement).add(rawXCoord), getRawZCoords(), this.withCompression);
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint subtract(ECPoint eCPoint) {
            return eCPoint.isInfinity() ? this : add(eCPoint.negate());
        }

        public AbstractF2m tau() {
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElement = this.f99691x;
            if (coordinateSystem != 0) {
                if (coordinateSystem != 1) {
                    if (coordinateSystem != 5) {
                        if (coordinateSystem != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                return (AbstractF2m) curve.createRawPoint(eCFieldElement.square(), this.f99692y.square(), new ECFieldElement[]{this.f99693zs[0].square()}, this.withCompression);
            }
            return (AbstractF2m) curve.createRawPoint(eCFieldElement.square(), this.f99692y.square(), this.withCompression);
        }

        public AbstractF2m tauPow(int i11) {
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElement = this.f99691x;
            if (coordinateSystem != 0) {
                if (coordinateSystem != 1) {
                    if (coordinateSystem != 5) {
                        if (coordinateSystem != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                return (AbstractF2m) curve.createRawPoint(eCFieldElement.squarePow(i11), this.f99692y.squarePow(i11), new ECFieldElement[]{this.f99693zs[0].squarePow(i11)}, this.withCompression);
            }
            return (AbstractF2m) curve.createRawPoint(eCFieldElement.squarePow(i11), this.f99692y.squarePow(i11), this.withCompression);
        }

        protected AbstractF2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }
    }

    public static abstract class AbstractFp extends ECPoint {
        protected AbstractFp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
        }

        @Override // org.spongycastle.math.ec.ECPoint
        protected boolean getCompressionYTilde() {
            return getAffineYCoord().testBitZero();
        }

        @Override // org.spongycastle.math.ec.ECPoint
        protected boolean satisfiesCurveEquation() {
            ECFieldElement eCFieldElement = this.f99691x;
            ECFieldElement eCFieldElement2 = this.f99692y;
            ECFieldElement a11 = this.curve.getA();
            ECFieldElement b11 = this.curve.getB();
            ECFieldElement eCFieldElementSquare = eCFieldElement2.square();
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem != 0) {
                if (curveCoordinateSystem == 1) {
                    ECFieldElement eCFieldElement3 = this.f99693zs[0];
                    if (!eCFieldElement3.isOne()) {
                        ECFieldElement eCFieldElementSquare2 = eCFieldElement3.square();
                        ECFieldElement eCFieldElementMultiply = eCFieldElement3.multiply(eCFieldElementSquare2);
                        eCFieldElementSquare = eCFieldElementSquare.multiply(eCFieldElement3);
                        a11 = a11.multiply(eCFieldElementSquare2);
                        b11 = b11.multiply(eCFieldElementMultiply);
                    }
                } else {
                    if (curveCoordinateSystem != 2 && curveCoordinateSystem != 3 && curveCoordinateSystem != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    ECFieldElement eCFieldElement4 = this.f99693zs[0];
                    if (!eCFieldElement4.isOne()) {
                        ECFieldElement eCFieldElementSquare3 = eCFieldElement4.square();
                        ECFieldElement eCFieldElementSquare4 = eCFieldElementSquare3.square();
                        ECFieldElement eCFieldElementMultiply2 = eCFieldElementSquare3.multiply(eCFieldElementSquare4);
                        a11 = a11.multiply(eCFieldElementSquare4);
                        b11 = b11.multiply(eCFieldElementMultiply2);
                    }
                }
            }
            return eCFieldElementSquare.equals(eCFieldElement.square().add(a11).multiply(eCFieldElement).add(b11));
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint subtract(ECPoint eCPoint) {
            return eCPoint.isInfinity() ? this : add(eCPoint.negate());
        }

        protected AbstractFp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }
    }

    public static class F2m extends AbstractF2m {
        public F2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            this(eCCurve, eCFieldElement, eCFieldElement2, false);
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint add(ECPoint eCPoint) {
            ECFieldElement eCFieldElementMultiply;
            ECFieldElement eCFieldElementMultiply2;
            ECFieldElement eCFieldElementMultiply3;
            ECFieldElement eCFieldElement;
            ECFieldElement eCFieldElementAdd;
            ECFieldElement eCFieldElementFromBigInteger;
            if (isInfinity()) {
                return eCPoint;
            }
            if (eCPoint.isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElementMultiply4 = this.f99691x;
            ECFieldElement eCFieldElement2 = eCPoint.f99691x;
            if (coordinateSystem == 0) {
                ECFieldElement eCFieldElement3 = this.f99692y;
                ECFieldElement eCFieldElement4 = eCPoint.f99692y;
                ECFieldElement eCFieldElementAdd2 = eCFieldElementMultiply4.add(eCFieldElement2);
                ECFieldElement eCFieldElementAdd3 = eCFieldElement3.add(eCFieldElement4);
                if (eCFieldElementAdd2.isZero()) {
                    return eCFieldElementAdd3.isZero() ? twice() : curve.getInfinity();
                }
                ECFieldElement eCFieldElementDivide = eCFieldElementAdd3.divide(eCFieldElementAdd2);
                ECFieldElement eCFieldElementAdd4 = eCFieldElementDivide.square().add(eCFieldElementDivide).add(eCFieldElementAdd2).add(curve.getA());
                return new F2m(curve, eCFieldElementAdd4, eCFieldElementDivide.multiply(eCFieldElementMultiply4.add(eCFieldElementAdd4)).add(eCFieldElementAdd4).add(eCFieldElement3), this.withCompression);
            }
            if (coordinateSystem == 1) {
                ECFieldElement eCFieldElement5 = this.f99692y;
                ECFieldElement eCFieldElementMultiply5 = this.f99693zs[0];
                ECFieldElement eCFieldElement6 = eCPoint.f99692y;
                ECFieldElement eCFieldElement7 = eCPoint.f99693zs[0];
                boolean zIsOne = eCFieldElement7.isOne();
                ECFieldElement eCFieldElementAdd5 = eCFieldElementMultiply5.multiply(eCFieldElement6).add(zIsOne ? eCFieldElement5 : eCFieldElement5.multiply(eCFieldElement7));
                ECFieldElement eCFieldElementAdd6 = eCFieldElementMultiply5.multiply(eCFieldElement2).add(zIsOne ? eCFieldElementMultiply4 : eCFieldElementMultiply4.multiply(eCFieldElement7));
                if (eCFieldElementAdd6.isZero()) {
                    return eCFieldElementAdd5.isZero() ? twice() : curve.getInfinity();
                }
                ECFieldElement eCFieldElementSquare = eCFieldElementAdd6.square();
                ECFieldElement eCFieldElementMultiply6 = eCFieldElementSquare.multiply(eCFieldElementAdd6);
                if (!zIsOne) {
                    eCFieldElementMultiply5 = eCFieldElementMultiply5.multiply(eCFieldElement7);
                }
                ECFieldElement eCFieldElementAdd7 = eCFieldElementAdd5.add(eCFieldElementAdd6);
                ECFieldElement eCFieldElementAdd8 = eCFieldElementAdd7.multiplyPlusProduct(eCFieldElementAdd5, eCFieldElementSquare, curve.getA()).multiply(eCFieldElementMultiply5).add(eCFieldElementMultiply6);
                ECFieldElement eCFieldElementMultiply7 = eCFieldElementAdd6.multiply(eCFieldElementAdd8);
                if (!zIsOne) {
                    eCFieldElementSquare = eCFieldElementSquare.multiply(eCFieldElement7);
                }
                return new F2m(curve, eCFieldElementMultiply7, eCFieldElementAdd5.multiplyPlusProduct(eCFieldElementMultiply4, eCFieldElementAdd6, eCFieldElement5).multiplyPlusProduct(eCFieldElementSquare, eCFieldElementAdd7, eCFieldElementAdd8), new ECFieldElement[]{eCFieldElementMultiply6.multiply(eCFieldElementMultiply5)}, this.withCompression);
            }
            if (coordinateSystem != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            if (eCFieldElementMultiply4.isZero()) {
                return eCFieldElement2.isZero() ? curve.getInfinity() : eCPoint.add(this);
            }
            ECFieldElement eCFieldElement8 = this.f99692y;
            ECFieldElement eCFieldElement9 = this.f99693zs[0];
            ECFieldElement eCFieldElement10 = eCPoint.f99692y;
            ECFieldElement eCFieldElement11 = eCPoint.f99693zs[0];
            boolean zIsOne2 = eCFieldElement9.isOne();
            if (zIsOne2) {
                eCFieldElementMultiply = eCFieldElement2;
                eCFieldElementMultiply2 = eCFieldElement10;
            } else {
                eCFieldElementMultiply = eCFieldElement2.multiply(eCFieldElement9);
                eCFieldElementMultiply2 = eCFieldElement10.multiply(eCFieldElement9);
            }
            boolean zIsOne3 = eCFieldElement11.isOne();
            if (zIsOne3) {
                eCFieldElementMultiply3 = eCFieldElement8;
            } else {
                eCFieldElementMultiply4 = eCFieldElementMultiply4.multiply(eCFieldElement11);
                eCFieldElementMultiply3 = eCFieldElement8.multiply(eCFieldElement11);
            }
            ECFieldElement eCFieldElementAdd9 = eCFieldElementMultiply3.add(eCFieldElementMultiply2);
            ECFieldElement eCFieldElementAdd10 = eCFieldElementMultiply4.add(eCFieldElementMultiply);
            if (eCFieldElementAdd10.isZero()) {
                return eCFieldElementAdd9.isZero() ? twice() : curve.getInfinity();
            }
            if (eCFieldElement2.isZero()) {
                ECPoint eCPointNormalize = normalize();
                ECFieldElement xCoord = eCPointNormalize.getXCoord();
                ECFieldElement yCoord = eCPointNormalize.getYCoord();
                ECFieldElement eCFieldElementDivide2 = yCoord.add(eCFieldElement10).divide(xCoord);
                eCFieldElementAdd = eCFieldElementDivide2.square().add(eCFieldElementDivide2).add(xCoord).add(curve.getA());
                if (eCFieldElementAdd.isZero()) {
                    return new F2m(curve, eCFieldElementAdd, curve.getB().sqrt(), this.withCompression);
                }
                ECFieldElement eCFieldElementAdd11 = eCFieldElementDivide2.multiply(xCoord.add(eCFieldElementAdd)).add(eCFieldElementAdd).add(yCoord).divide(eCFieldElementAdd).add(eCFieldElementAdd);
                eCFieldElementFromBigInteger = curve.fromBigInteger(ECConstants.ONE);
                eCFieldElement = eCFieldElementAdd11;
            } else {
                ECFieldElement eCFieldElementSquare2 = eCFieldElementAdd10.square();
                ECFieldElement eCFieldElementMultiply8 = eCFieldElementAdd9.multiply(eCFieldElementMultiply4);
                ECFieldElement eCFieldElementMultiply9 = eCFieldElementAdd9.multiply(eCFieldElementMultiply);
                ECFieldElement eCFieldElementMultiply10 = eCFieldElementMultiply8.multiply(eCFieldElementMultiply9);
                if (eCFieldElementMultiply10.isZero()) {
                    return new F2m(curve, eCFieldElementMultiply10, curve.getB().sqrt(), this.withCompression);
                }
                ECFieldElement eCFieldElementMultiply11 = eCFieldElementAdd9.multiply(eCFieldElementSquare2);
                ECFieldElement eCFieldElementMultiply12 = !zIsOne3 ? eCFieldElementMultiply11.multiply(eCFieldElement11) : eCFieldElementMultiply11;
                ECFieldElement eCFieldElementSquarePlusProduct = eCFieldElementMultiply9.add(eCFieldElementSquare2).squarePlusProduct(eCFieldElementMultiply12, eCFieldElement8.add(eCFieldElement9));
                if (!zIsOne2) {
                    eCFieldElementMultiply12 = eCFieldElementMultiply12.multiply(eCFieldElement9);
                }
                eCFieldElement = eCFieldElementSquarePlusProduct;
                eCFieldElementAdd = eCFieldElementMultiply10;
                eCFieldElementFromBigInteger = eCFieldElementMultiply12;
            }
            return new F2m(curve, eCFieldElementAdd, eCFieldElement, new ECFieldElement[]{eCFieldElementFromBigInteger}, this.withCompression);
        }

        @Override // org.spongycastle.math.ec.ECPoint
        protected ECPoint detach() {
            return new F2m(null, getAffineXCoord(), getAffineYCoord());
        }

        @Override // org.spongycastle.math.ec.ECPoint
        protected boolean getCompressionYTilde() {
            ECFieldElement rawXCoord = getRawXCoord();
            if (rawXCoord.isZero()) {
                return false;
            }
            ECFieldElement rawYCoord = getRawYCoord();
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem == 5 || curveCoordinateSystem == 6) {
                return rawYCoord.testBitZero() != rawXCoord.testBitZero();
            }
            return rawYCoord.divide(rawXCoord).testBitZero();
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECFieldElement getYCoord() {
            int curveCoordinateSystem = getCurveCoordinateSystem();
            if (curveCoordinateSystem != 5 && curveCoordinateSystem != 6) {
                return this.f99692y;
            }
            ECFieldElement eCFieldElement = this.f99691x;
            ECFieldElement eCFieldElement2 = this.f99692y;
            if (isInfinity() || eCFieldElement.isZero()) {
                return eCFieldElement2;
            }
            ECFieldElement eCFieldElementMultiply = eCFieldElement2.add(eCFieldElement).multiply(eCFieldElement);
            if (6 == curveCoordinateSystem) {
                ECFieldElement eCFieldElement3 = this.f99693zs[0];
                if (!eCFieldElement3.isOne()) {
                    return eCFieldElementMultiply.divide(eCFieldElement3);
                }
            }
            return eCFieldElementMultiply;
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint negate() {
            if (!isInfinity()) {
                ECFieldElement eCFieldElement = this.f99691x;
                if (!eCFieldElement.isZero()) {
                    int curveCoordinateSystem = getCurveCoordinateSystem();
                    if (curveCoordinateSystem == 0) {
                        return new F2m(this.curve, eCFieldElement, this.f99692y.add(eCFieldElement), this.withCompression);
                    }
                    if (curveCoordinateSystem == 1) {
                        return new F2m(this.curve, eCFieldElement, this.f99692y.add(eCFieldElement), new ECFieldElement[]{this.f99693zs[0]}, this.withCompression);
                    }
                    if (curveCoordinateSystem == 5) {
                        return new F2m(this.curve, eCFieldElement, this.f99692y.addOne(), this.withCompression);
                    }
                    if (curveCoordinateSystem != 6) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    ECFieldElement eCFieldElement2 = this.f99692y;
                    ECFieldElement eCFieldElement3 = this.f99693zs[0];
                    return new F2m(this.curve, eCFieldElement, eCFieldElement2.add(eCFieldElement3), new ECFieldElement[]{eCFieldElement3}, this.withCompression);
                }
            }
            return this;
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint twice() {
            ECFieldElement eCFieldElementAdd;
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            ECFieldElement eCFieldElementMultiply = this.f99691x;
            if (eCFieldElementMultiply.isZero()) {
                return curve.getInfinity();
            }
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem == 0) {
                ECFieldElement eCFieldElementAdd2 = this.f99692y.divide(eCFieldElementMultiply).add(eCFieldElementMultiply);
                ECFieldElement eCFieldElementAdd3 = eCFieldElementAdd2.square().add(eCFieldElementAdd2).add(curve.getA());
                return new F2m(curve, eCFieldElementAdd3, eCFieldElementMultiply.squarePlusProduct(eCFieldElementAdd3, eCFieldElementAdd2.addOne()), this.withCompression);
            }
            if (coordinateSystem == 1) {
                ECFieldElement eCFieldElementMultiply2 = this.f99692y;
                ECFieldElement eCFieldElement = this.f99693zs[0];
                boolean zIsOne = eCFieldElement.isOne();
                ECFieldElement eCFieldElementMultiply3 = zIsOne ? eCFieldElementMultiply : eCFieldElementMultiply.multiply(eCFieldElement);
                if (!zIsOne) {
                    eCFieldElementMultiply2 = eCFieldElementMultiply2.multiply(eCFieldElement);
                }
                ECFieldElement eCFieldElementSquare = eCFieldElementMultiply.square();
                ECFieldElement eCFieldElementAdd4 = eCFieldElementSquare.add(eCFieldElementMultiply2);
                ECFieldElement eCFieldElementSquare2 = eCFieldElementMultiply3.square();
                ECFieldElement eCFieldElementAdd5 = eCFieldElementAdd4.add(eCFieldElementMultiply3);
                ECFieldElement eCFieldElementMultiplyPlusProduct = eCFieldElementAdd5.multiplyPlusProduct(eCFieldElementAdd4, eCFieldElementSquare2, curve.getA());
                return new F2m(curve, eCFieldElementMultiply3.multiply(eCFieldElementMultiplyPlusProduct), eCFieldElementSquare.square().multiplyPlusProduct(eCFieldElementMultiply3, eCFieldElementMultiplyPlusProduct, eCFieldElementAdd5), new ECFieldElement[]{eCFieldElementMultiply3.multiply(eCFieldElementSquare2)}, this.withCompression);
            }
            if (coordinateSystem != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            ECFieldElement eCFieldElement2 = this.f99692y;
            ECFieldElement eCFieldElement3 = this.f99693zs[0];
            boolean zIsOne2 = eCFieldElement3.isOne();
            ECFieldElement eCFieldElementMultiply4 = zIsOne2 ? eCFieldElement2 : eCFieldElement2.multiply(eCFieldElement3);
            ECFieldElement eCFieldElementSquare3 = zIsOne2 ? eCFieldElement3 : eCFieldElement3.square();
            ECFieldElement a11 = curve.getA();
            ECFieldElement eCFieldElementMultiply5 = zIsOne2 ? a11 : a11.multiply(eCFieldElementSquare3);
            ECFieldElement eCFieldElementAdd6 = eCFieldElement2.square().add(eCFieldElementMultiply4).add(eCFieldElementMultiply5);
            if (eCFieldElementAdd6.isZero()) {
                return new F2m(curve, eCFieldElementAdd6, curve.getB().sqrt(), this.withCompression);
            }
            ECFieldElement eCFieldElementSquare4 = eCFieldElementAdd6.square();
            ECFieldElement eCFieldElementMultiply6 = zIsOne2 ? eCFieldElementAdd6 : eCFieldElementAdd6.multiply(eCFieldElementSquare3);
            ECFieldElement b11 = curve.getB();
            if (b11.bitLength() < (curve.getFieldSize() >> 1)) {
                ECFieldElement eCFieldElementSquare5 = eCFieldElement2.add(eCFieldElementMultiply).square();
                eCFieldElementAdd = eCFieldElementSquare5.add(eCFieldElementAdd6).add(eCFieldElementSquare3).multiply(eCFieldElementSquare5).add(b11.isOne() ? eCFieldElementMultiply5.add(eCFieldElementSquare3).square() : eCFieldElementMultiply5.squarePlusProduct(b11, eCFieldElementSquare3.square())).add(eCFieldElementSquare4);
                if (a11.isZero()) {
                    eCFieldElementAdd = eCFieldElementAdd.add(eCFieldElementMultiply6);
                } else if (!a11.isOne()) {
                    eCFieldElementAdd = eCFieldElementAdd.add(a11.addOne().multiply(eCFieldElementMultiply6));
                }
            } else {
                if (!zIsOne2) {
                    eCFieldElementMultiply = eCFieldElementMultiply.multiply(eCFieldElement3);
                }
                eCFieldElementAdd = eCFieldElementMultiply.squarePlusProduct(eCFieldElementAdd6, eCFieldElementMultiply4).add(eCFieldElementSquare4).add(eCFieldElementMultiply6);
            }
            return new F2m(curve, eCFieldElementSquare4, eCFieldElementAdd, new ECFieldElement[]{eCFieldElementMultiply6}, this.withCompression);
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint twicePlus(ECPoint eCPoint) {
            if (isInfinity()) {
                return eCPoint;
            }
            if (eCPoint.isInfinity()) {
                return twice();
            }
            ECCurve curve = getCurve();
            ECFieldElement eCFieldElement = this.f99691x;
            if (eCFieldElement.isZero()) {
                return eCPoint;
            }
            if (curve.getCoordinateSystem() != 6) {
                return twice().add(eCPoint);
            }
            ECFieldElement eCFieldElement2 = eCPoint.f99691x;
            ECFieldElement eCFieldElement3 = eCPoint.f99693zs[0];
            if (eCFieldElement2.isZero() || !eCFieldElement3.isOne()) {
                return twice().add(eCPoint);
            }
            ECFieldElement eCFieldElement4 = this.f99692y;
            ECFieldElement eCFieldElement5 = this.f99693zs[0];
            ECFieldElement eCFieldElement6 = eCPoint.f99692y;
            ECFieldElement eCFieldElementSquare = eCFieldElement.square();
            ECFieldElement eCFieldElementSquare2 = eCFieldElement4.square();
            ECFieldElement eCFieldElementSquare3 = eCFieldElement5.square();
            ECFieldElement eCFieldElementAdd = curve.getA().multiply(eCFieldElementSquare3).add(eCFieldElementSquare2).add(eCFieldElement4.multiply(eCFieldElement5));
            ECFieldElement eCFieldElementAddOne = eCFieldElement6.addOne();
            ECFieldElement eCFieldElementMultiplyPlusProduct = curve.getA().add(eCFieldElementAddOne).multiply(eCFieldElementSquare3).add(eCFieldElementSquare2).multiplyPlusProduct(eCFieldElementAdd, eCFieldElementSquare, eCFieldElementSquare3);
            ECFieldElement eCFieldElementMultiply = eCFieldElement2.multiply(eCFieldElementSquare3);
            ECFieldElement eCFieldElementSquare4 = eCFieldElementMultiply.add(eCFieldElementAdd).square();
            if (eCFieldElementSquare4.isZero()) {
                return eCFieldElementMultiplyPlusProduct.isZero() ? eCPoint.twice() : curve.getInfinity();
            }
            if (eCFieldElementMultiplyPlusProduct.isZero()) {
                return new F2m(curve, eCFieldElementMultiplyPlusProduct, curve.getB().sqrt(), this.withCompression);
            }
            ECFieldElement eCFieldElementMultiply2 = eCFieldElementMultiplyPlusProduct.square().multiply(eCFieldElementMultiply);
            ECFieldElement eCFieldElementMultiply3 = eCFieldElementMultiplyPlusProduct.multiply(eCFieldElementSquare4).multiply(eCFieldElementSquare3);
            return new F2m(curve, eCFieldElementMultiply2, eCFieldElementMultiplyPlusProduct.add(eCFieldElementSquare4).square().multiplyPlusProduct(eCFieldElementAdd, eCFieldElementAddOne, eCFieldElementMultiply3), new ECFieldElement[]{eCFieldElementMultiply3}, this.withCompression);
        }

        public F2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z11) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
            if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            if (eCFieldElement != null) {
                ECFieldElement.F2m.checkFieldElements(this.f99691x, this.f99692y);
                if (eCCurve != null) {
                    ECFieldElement.F2m.checkFieldElements(this.f99691x, this.curve.getA());
                }
            }
            this.withCompression = z11;
        }

        F2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z11) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
            this.withCompression = z11;
        }
    }

    public static class Fp extends AbstractFp {
        public Fp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            this(eCCurve, eCFieldElement, eCFieldElement2, false);
        }

        /* JADX WARN: Code duplicated, block: B:61:0x0132  */
        /* JADX WARN: Code duplicated, block: B:62:0x013e  */
        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint add(ECPoint eCPoint) {
            int i11;
            ECFieldElement eCFieldElementMultiply;
            ECFieldElement eCFieldElement;
            ECFieldElement eCFieldElement2;
            ECFieldElement eCFieldElement3;
            ECFieldElement[] eCFieldElementArr;
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
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElementMultiply2 = this.f99691x;
            ECFieldElement eCFieldElementMultiply3 = this.f99692y;
            ECFieldElement eCFieldElementMultiply4 = eCPoint.f99691x;
            ECFieldElement eCFieldElementMultiply5 = eCPoint.f99692y;
            if (coordinateSystem == 0) {
                ECFieldElement eCFieldElementSubtract = eCFieldElementMultiply4.subtract(eCFieldElementMultiply2);
                ECFieldElement eCFieldElementSubtract2 = eCFieldElementMultiply5.subtract(eCFieldElementMultiply3);
                if (eCFieldElementSubtract.isZero()) {
                    return eCFieldElementSubtract2.isZero() ? twice() : curve.getInfinity();
                }
                ECFieldElement eCFieldElementDivide = eCFieldElementSubtract2.divide(eCFieldElementSubtract);
                ECFieldElement eCFieldElementSubtract3 = eCFieldElementDivide.square().subtract(eCFieldElementMultiply2).subtract(eCFieldElementMultiply4);
                return new Fp(curve, eCFieldElementSubtract3, eCFieldElementDivide.multiply(eCFieldElementMultiply2.subtract(eCFieldElementSubtract3)).subtract(eCFieldElementMultiply3), this.withCompression);
            }
            char c11 = 0;
            if (coordinateSystem == 1) {
                ECFieldElement eCFieldElementMultiply6 = this.f99693zs[0];
                ECFieldElement eCFieldElement4 = eCPoint.f99693zs[0];
                boolean zIsOne = eCFieldElementMultiply6.isOne();
                boolean zIsOne2 = eCFieldElement4.isOne();
                if (!zIsOne) {
                    eCFieldElementMultiply5 = eCFieldElementMultiply5.multiply(eCFieldElementMultiply6);
                }
                if (!zIsOne2) {
                    eCFieldElementMultiply3 = eCFieldElementMultiply3.multiply(eCFieldElement4);
                }
                ECFieldElement eCFieldElementSubtract4 = eCFieldElementMultiply5.subtract(eCFieldElementMultiply3);
                if (!zIsOne) {
                    eCFieldElementMultiply4 = eCFieldElementMultiply4.multiply(eCFieldElementMultiply6);
                }
                if (!zIsOne2) {
                    eCFieldElementMultiply2 = eCFieldElementMultiply2.multiply(eCFieldElement4);
                }
                ECFieldElement eCFieldElementSubtract5 = eCFieldElementMultiply4.subtract(eCFieldElementMultiply2);
                if (eCFieldElementSubtract5.isZero()) {
                    return eCFieldElementSubtract4.isZero() ? twice() : curve.getInfinity();
                }
                if (zIsOne) {
                    eCFieldElementMultiply6 = eCFieldElement4;
                } else if (!zIsOne2) {
                    eCFieldElementMultiply6 = eCFieldElementMultiply6.multiply(eCFieldElement4);
                }
                ECFieldElement eCFieldElementSquare = eCFieldElementSubtract5.square();
                ECFieldElement eCFieldElementMultiply7 = eCFieldElementSquare.multiply(eCFieldElementSubtract5);
                ECFieldElement eCFieldElementMultiply8 = eCFieldElementSquare.multiply(eCFieldElementMultiply2);
                ECFieldElement eCFieldElementSubtract6 = eCFieldElementSubtract4.square().multiply(eCFieldElementMultiply6).subtract(eCFieldElementMultiply7).subtract(two(eCFieldElementMultiply8));
                return new Fp(curve, eCFieldElementSubtract5.multiply(eCFieldElementSubtract6), eCFieldElementMultiply8.subtract(eCFieldElementSubtract6).multiplyMinusProduct(eCFieldElementSubtract4, eCFieldElementMultiply3, eCFieldElementMultiply7), new ECFieldElement[]{eCFieldElementMultiply7.multiply(eCFieldElementMultiply6)}, this.withCompression);
            }
            if (coordinateSystem != 2 && coordinateSystem != 4) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            ECFieldElement eCFieldElement5 = this.f99693zs[0];
            ECFieldElement eCFieldElement6 = eCPoint.f99693zs[0];
            boolean zIsOne3 = eCFieldElement5.isOne();
            if (zIsOne3 || !eCFieldElement5.equals(eCFieldElement6)) {
                if (!zIsOne3) {
                    ECFieldElement eCFieldElementSquare2 = eCFieldElement5.square();
                    eCFieldElementMultiply4 = eCFieldElementSquare2.multiply(eCFieldElementMultiply4);
                    eCFieldElementMultiply5 = eCFieldElementSquare2.multiply(eCFieldElement5).multiply(eCFieldElementMultiply5);
                }
                boolean zIsOne4 = eCFieldElement6.isOne();
                if (!zIsOne4) {
                    ECFieldElement eCFieldElementSquare3 = eCFieldElement6.square();
                    eCFieldElementMultiply2 = eCFieldElementSquare3.multiply(eCFieldElementMultiply2);
                    eCFieldElementMultiply3 = eCFieldElementSquare3.multiply(eCFieldElement6).multiply(eCFieldElementMultiply3);
                }
                ECFieldElement eCFieldElementSubtract7 = eCFieldElementMultiply2.subtract(eCFieldElementMultiply4);
                ECFieldElement eCFieldElementSubtract8 = eCFieldElementMultiply3.subtract(eCFieldElementMultiply5);
                if (eCFieldElementSubtract7.isZero()) {
                    return eCFieldElementSubtract8.isZero() ? twice() : curve.getInfinity();
                }
                ECFieldElement eCFieldElementSquare4 = eCFieldElementSubtract7.square();
                ECFieldElement eCFieldElementMultiply9 = eCFieldElementSquare4.multiply(eCFieldElementSubtract7);
                ECFieldElement eCFieldElementMultiply10 = eCFieldElementSquare4.multiply(eCFieldElementMultiply2);
                i11 = 1;
                ECFieldElement eCFieldElementSubtract9 = eCFieldElementSubtract8.square().add(eCFieldElementMultiply9).subtract(two(eCFieldElementMultiply10));
                ECFieldElement eCFieldElementMultiplyMinusProduct = eCFieldElementMultiply10.subtract(eCFieldElementSubtract9).multiplyMinusProduct(eCFieldElementSubtract8, eCFieldElementMultiply9, eCFieldElementMultiply3);
                ECFieldElement eCFieldElementMultiply11 = !zIsOne3 ? eCFieldElementSubtract7.multiply(eCFieldElement5) : eCFieldElementSubtract7;
                eCFieldElementMultiply = !zIsOne4 ? eCFieldElementMultiply11.multiply(eCFieldElement6) : eCFieldElementMultiply11;
                eCFieldElement = eCFieldElementMultiplyMinusProduct;
                eCFieldElement2 = eCFieldElementSubtract9;
                eCFieldElement3 = eCFieldElementMultiply == eCFieldElementSubtract7 ? eCFieldElementSquare4 : null;
                if (coordinateSystem == 4) {
                    ECFieldElement eCFieldElementCalculateJacobianModifiedW = calculateJacobianModifiedW(eCFieldElementMultiply, eCFieldElement3);
                    eCFieldElementArr = new ECFieldElement[2];
                    eCFieldElementArr[c11] = eCFieldElementMultiply;
                    eCFieldElementArr[i11] = eCFieldElementCalculateJacobianModifiedW;
                } else {
                    eCFieldElementArr = new ECFieldElement[i11];
                    eCFieldElementArr[c11] = eCFieldElementMultiply;
                }
                return new Fp(curve, eCFieldElement2, eCFieldElement, eCFieldElementArr, this.withCompression);
            }
            ECFieldElement eCFieldElementSubtract10 = eCFieldElementMultiply2.subtract(eCFieldElementMultiply4);
            ECFieldElement eCFieldElementSubtract11 = eCFieldElementMultiply3.subtract(eCFieldElementMultiply5);
            if (eCFieldElementSubtract10.isZero()) {
                return eCFieldElementSubtract11.isZero() ? twice() : curve.getInfinity();
            }
            ECFieldElement eCFieldElementSquare5 = eCFieldElementSubtract10.square();
            ECFieldElement eCFieldElementMultiply12 = eCFieldElementMultiply2.multiply(eCFieldElementSquare5);
            ECFieldElement eCFieldElementMultiply13 = eCFieldElementMultiply4.multiply(eCFieldElementSquare5);
            ECFieldElement eCFieldElementMultiply14 = eCFieldElementMultiply12.subtract(eCFieldElementMultiply13).multiply(eCFieldElementMultiply3);
            ECFieldElement eCFieldElementSubtract12 = eCFieldElementSubtract11.square().subtract(eCFieldElementMultiply12).subtract(eCFieldElementMultiply13);
            ECFieldElement eCFieldElementSubtract13 = eCFieldElementMultiply12.subtract(eCFieldElementSubtract12).multiply(eCFieldElementSubtract11).subtract(eCFieldElementMultiply14);
            eCFieldElementMultiply = eCFieldElementSubtract10.multiply(eCFieldElement5);
            eCFieldElement = eCFieldElementSubtract13;
            eCFieldElement2 = eCFieldElementSubtract12;
            i11 = 1;
            c11 = 0;
            if (coordinateSystem == 4) {
                ECFieldElement eCFieldElementCalculateJacobianModifiedW2 = calculateJacobianModifiedW(eCFieldElementMultiply, eCFieldElement3);
                eCFieldElementArr = new ECFieldElement[2];
                eCFieldElementArr[c11] = eCFieldElementMultiply;
                eCFieldElementArr[i11] = eCFieldElementCalculateJacobianModifiedW2;
            } else {
                eCFieldElementArr = new ECFieldElement[i11];
                eCFieldElementArr[c11] = eCFieldElementMultiply;
            }
            return new Fp(curve, eCFieldElement2, eCFieldElement, eCFieldElementArr, this.withCompression);
        }

        protected ECFieldElement calculateJacobianModifiedW(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            ECFieldElement a11 = getCurve().getA();
            if (a11.isZero() || eCFieldElement.isOne()) {
                return a11;
            }
            if (eCFieldElement2 == null) {
                eCFieldElement2 = eCFieldElement.square();
            }
            ECFieldElement eCFieldElementSquare = eCFieldElement2.square();
            ECFieldElement eCFieldElementNegate = a11.negate();
            return eCFieldElementNegate.bitLength() < a11.bitLength() ? eCFieldElementSquare.multiply(eCFieldElementNegate).negate() : eCFieldElementSquare.multiply(a11);
        }

        @Override // org.spongycastle.math.ec.ECPoint
        protected ECPoint detach() {
            return new Fp(null, getAffineXCoord(), getAffineYCoord());
        }

        protected ECFieldElement doubleProductFromSquares(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3, ECFieldElement eCFieldElement4) {
            return eCFieldElement.add(eCFieldElement2).square().subtract(eCFieldElement3).subtract(eCFieldElement4);
        }

        protected ECFieldElement eight(ECFieldElement eCFieldElement) {
            return four(two(eCFieldElement));
        }

        protected ECFieldElement four(ECFieldElement eCFieldElement) {
            return two(two(eCFieldElement));
        }

        protected ECFieldElement getJacobianModifiedW() {
            ECFieldElement[] eCFieldElementArr = this.f99693zs;
            ECFieldElement eCFieldElement = eCFieldElementArr[1];
            if (eCFieldElement != null) {
                return eCFieldElement;
            }
            ECFieldElement eCFieldElementCalculateJacobianModifiedW = calculateJacobianModifiedW(eCFieldElementArr[0], null);
            eCFieldElementArr[1] = eCFieldElementCalculateJacobianModifiedW;
            return eCFieldElementCalculateJacobianModifiedW;
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECFieldElement getZCoord(int i11) {
            return (i11 == 1 && 4 == getCurveCoordinateSystem()) ? getJacobianModifiedW() : super.getZCoord(i11);
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint negate() {
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            return curve.getCoordinateSystem() != 0 ? new Fp(curve, this.f99691x, this.f99692y.negate(), this.f99693zs, this.withCompression) : new Fp(curve, this.f99691x, this.f99692y.negate(), this.withCompression);
        }

        protected ECFieldElement three(ECFieldElement eCFieldElement) {
            return two(eCFieldElement).add(eCFieldElement);
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint threeTimes() {
            if (!isInfinity()) {
                ECFieldElement eCFieldElement = this.f99692y;
                if (!eCFieldElement.isZero()) {
                    ECCurve curve = getCurve();
                    int coordinateSystem = curve.getCoordinateSystem();
                    if (coordinateSystem != 0) {
                        return coordinateSystem != 4 ? twice().add(this) : twiceJacobianModified(false).add(this);
                    }
                    ECFieldElement eCFieldElement2 = this.f99691x;
                    ECFieldElement eCFieldElementTwo = two(eCFieldElement);
                    ECFieldElement eCFieldElementSquare = eCFieldElementTwo.square();
                    ECFieldElement eCFieldElementAdd = three(eCFieldElement2.square()).add(getCurve().getA());
                    ECFieldElement eCFieldElementSubtract = three(eCFieldElement2).multiply(eCFieldElementSquare).subtract(eCFieldElementAdd.square());
                    if (eCFieldElementSubtract.isZero()) {
                        return getCurve().getInfinity();
                    }
                    ECFieldElement eCFieldElementInvert = eCFieldElementSubtract.multiply(eCFieldElementTwo).invert();
                    ECFieldElement eCFieldElementMultiply = eCFieldElementSubtract.multiply(eCFieldElementInvert).multiply(eCFieldElementAdd);
                    ECFieldElement eCFieldElementSubtract2 = eCFieldElementSquare.square().multiply(eCFieldElementInvert).subtract(eCFieldElementMultiply);
                    ECFieldElement eCFieldElementAdd2 = eCFieldElementSubtract2.subtract(eCFieldElementMultiply).multiply(eCFieldElementMultiply.add(eCFieldElementSubtract2)).add(eCFieldElement2);
                    return new Fp(curve, eCFieldElementAdd2, eCFieldElement2.subtract(eCFieldElementAdd2).multiply(eCFieldElementSubtract2).subtract(eCFieldElement), this.withCompression);
                }
            }
            return this;
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint timesPow2(int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("'e' cannot be negative");
            }
            if (i11 == 0 || isInfinity()) {
                return this;
            }
            if (i11 == 1) {
                return twice();
            }
            ECCurve curve = getCurve();
            ECFieldElement eCFieldElementSubtract = this.f99692y;
            if (eCFieldElementSubtract.isZero()) {
                return curve.getInfinity();
            }
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement a11 = curve.getA();
            ECFieldElement eCFieldElementMultiply = this.f99691x;
            ECFieldElement[] eCFieldElementArr = this.f99693zs;
            int i12 = 0;
            ECFieldElement eCFieldElementFromBigInteger = eCFieldElementArr.length < 1 ? curve.fromBigInteger(ECConstants.ONE) : eCFieldElementArr[0];
            if (!eCFieldElementFromBigInteger.isOne() && coordinateSystem != 0) {
                if (coordinateSystem == 1) {
                    ECFieldElement eCFieldElementSquare = eCFieldElementFromBigInteger.square();
                    eCFieldElementMultiply = eCFieldElementMultiply.multiply(eCFieldElementFromBigInteger);
                    eCFieldElementSubtract = eCFieldElementSubtract.multiply(eCFieldElementSquare);
                    a11 = calculateJacobianModifiedW(eCFieldElementFromBigInteger, eCFieldElementSquare);
                } else if (coordinateSystem == 2) {
                    a11 = calculateJacobianModifiedW(eCFieldElementFromBigInteger, null);
                } else {
                    if (coordinateSystem != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    a11 = getJacobianModifiedW();
                }
            }
            while (i12 < i11) {
                if (eCFieldElementSubtract.isZero()) {
                    return curve.getInfinity();
                }
                ECFieldElement eCFieldElementThree = three(eCFieldElementMultiply.square());
                ECFieldElement eCFieldElementTwo = two(eCFieldElementSubtract);
                ECFieldElement eCFieldElementMultiply2 = eCFieldElementTwo.multiply(eCFieldElementSubtract);
                ECFieldElement eCFieldElementTwo2 = two(eCFieldElementMultiply.multiply(eCFieldElementMultiply2));
                ECFieldElement eCFieldElementTwo3 = two(eCFieldElementMultiply2.square());
                if (!a11.isZero()) {
                    eCFieldElementThree = eCFieldElementThree.add(a11);
                    a11 = two(eCFieldElementTwo3.multiply(a11));
                }
                ECFieldElement eCFieldElementSubtract2 = eCFieldElementThree.square().subtract(two(eCFieldElementTwo2));
                eCFieldElementSubtract = eCFieldElementThree.multiply(eCFieldElementTwo2.subtract(eCFieldElementSubtract2)).subtract(eCFieldElementTwo3);
                eCFieldElementFromBigInteger = eCFieldElementFromBigInteger.isOne() ? eCFieldElementTwo : eCFieldElementTwo.multiply(eCFieldElementFromBigInteger);
                i12++;
                eCFieldElementMultiply = eCFieldElementSubtract2;
            }
            if (coordinateSystem == 0) {
                ECFieldElement eCFieldElement = eCFieldElementSubtract;
                ECFieldElement eCFieldElementInvert = eCFieldElementFromBigInteger.invert();
                ECFieldElement eCFieldElementSquare2 = eCFieldElementInvert.square();
                return new Fp(curve, eCFieldElementMultiply.multiply(eCFieldElementSquare2), eCFieldElement.multiply(eCFieldElementSquare2.multiply(eCFieldElementInvert)), this.withCompression);
            }
            if (coordinateSystem == 1) {
                return new Fp(curve, eCFieldElementMultiply.multiply(eCFieldElementFromBigInteger), eCFieldElementSubtract, new ECFieldElement[]{eCFieldElementFromBigInteger.multiply(eCFieldElementFromBigInteger.square())}, this.withCompression);
            }
            if (coordinateSystem == 2) {
                return new Fp(curve, eCFieldElementMultiply, eCFieldElementSubtract, new ECFieldElement[]{eCFieldElementFromBigInteger}, this.withCompression);
            }
            if (coordinateSystem != 4) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            return new Fp(curve, eCFieldElementMultiply, eCFieldElementSubtract, new ECFieldElement[]{eCFieldElementFromBigInteger, a11}, this.withCompression);
        }

        @Override // org.spongycastle.math.ec.ECPoint
        public ECPoint twice() {
            ECFieldElement eCFieldElementSubtract;
            ECFieldElement eCFieldElementFour;
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            ECFieldElement eCFieldElement = this.f99692y;
            if (eCFieldElement.isZero()) {
                return curve.getInfinity();
            }
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElement2 = this.f99691x;
            if (coordinateSystem == 0) {
                ECFieldElement eCFieldElementDivide = three(eCFieldElement2.square()).add(getCurve().getA()).divide(two(eCFieldElement));
                ECFieldElement eCFieldElementSubtract2 = eCFieldElementDivide.square().subtract(two(eCFieldElement2));
                return new Fp(curve, eCFieldElementSubtract2, eCFieldElementDivide.multiply(eCFieldElement2.subtract(eCFieldElementSubtract2)).subtract(eCFieldElement), this.withCompression);
            }
            if (coordinateSystem == 1) {
                ECFieldElement eCFieldElement3 = this.f99693zs[0];
                boolean zIsOne = eCFieldElement3.isOne();
                ECFieldElement a11 = curve.getA();
                if (!a11.isZero() && !zIsOne) {
                    a11 = a11.multiply(eCFieldElement3.square());
                }
                ECFieldElement eCFieldElementAdd = a11.add(three(eCFieldElement2.square()));
                ECFieldElement eCFieldElementMultiply = zIsOne ? eCFieldElement : eCFieldElement.multiply(eCFieldElement3);
                ECFieldElement eCFieldElementSquare = zIsOne ? eCFieldElement.square() : eCFieldElementMultiply.multiply(eCFieldElement);
                ECFieldElement eCFieldElementFour2 = four(eCFieldElement2.multiply(eCFieldElementSquare));
                ECFieldElement eCFieldElementSubtract3 = eCFieldElementAdd.square().subtract(two(eCFieldElementFour2));
                ECFieldElement eCFieldElementTwo = two(eCFieldElementMultiply);
                ECFieldElement eCFieldElementMultiply2 = eCFieldElementSubtract3.multiply(eCFieldElementTwo);
                ECFieldElement eCFieldElementTwo2 = two(eCFieldElementSquare);
                return new Fp(curve, eCFieldElementMultiply2, eCFieldElementFour2.subtract(eCFieldElementSubtract3).multiply(eCFieldElementAdd).subtract(two(eCFieldElementTwo2.square())), new ECFieldElement[]{two(zIsOne ? two(eCFieldElementTwo2) : eCFieldElementTwo.square()).multiply(eCFieldElementMultiply)}, this.withCompression);
            }
            if (coordinateSystem != 2) {
                if (coordinateSystem == 4) {
                    return twiceJacobianModified(true);
                }
                throw new IllegalStateException("unsupported coordinate system");
            }
            ECFieldElement eCFieldElement4 = this.f99693zs[0];
            boolean zIsOne2 = eCFieldElement4.isOne();
            ECFieldElement eCFieldElementSquare2 = eCFieldElement.square();
            ECFieldElement eCFieldElementSquare3 = eCFieldElementSquare2.square();
            ECFieldElement a12 = curve.getA();
            ECFieldElement eCFieldElementNegate = a12.negate();
            if (eCFieldElementNegate.toBigInteger().equals(BigInteger.valueOf(3L))) {
                ECFieldElement eCFieldElementSquare4 = zIsOne2 ? eCFieldElement4 : eCFieldElement4.square();
                eCFieldElementSubtract = three(eCFieldElement2.add(eCFieldElementSquare4).multiply(eCFieldElement2.subtract(eCFieldElementSquare4)));
                eCFieldElementFour = four(eCFieldElementSquare2.multiply(eCFieldElement2));
            } else {
                ECFieldElement eCFieldElementThree = three(eCFieldElement2.square());
                if (zIsOne2) {
                    eCFieldElementSubtract = eCFieldElementThree.add(a12);
                } else if (a12.isZero()) {
                    eCFieldElementSubtract = eCFieldElementThree;
                } else {
                    ECFieldElement eCFieldElementSquare5 = eCFieldElement4.square().square();
                    eCFieldElementSubtract = eCFieldElementNegate.bitLength() < a12.bitLength() ? eCFieldElementThree.subtract(eCFieldElementSquare5.multiply(eCFieldElementNegate)) : eCFieldElementThree.add(eCFieldElementSquare5.multiply(a12));
                }
                eCFieldElementFour = four(eCFieldElement2.multiply(eCFieldElementSquare2));
            }
            ECFieldElement eCFieldElementSubtract4 = eCFieldElementSubtract.square().subtract(two(eCFieldElementFour));
            ECFieldElement eCFieldElementSubtract5 = eCFieldElementFour.subtract(eCFieldElementSubtract4).multiply(eCFieldElementSubtract).subtract(eight(eCFieldElementSquare3));
            ECFieldElement eCFieldElementTwo3 = two(eCFieldElement);
            if (!zIsOne2) {
                eCFieldElementTwo3 = eCFieldElementTwo3.multiply(eCFieldElement4);
            }
            return new Fp(curve, eCFieldElementSubtract4, eCFieldElementSubtract5, new ECFieldElement[]{eCFieldElementTwo3}, this.withCompression);
        }

        protected Fp twiceJacobianModified(boolean z11) {
            ECFieldElement eCFieldElement = this.f99691x;
            ECFieldElement eCFieldElement2 = this.f99692y;
            ECFieldElement eCFieldElement3 = this.f99693zs[0];
            ECFieldElement jacobianModifiedW = getJacobianModifiedW();
            ECFieldElement eCFieldElementAdd = three(eCFieldElement.square()).add(jacobianModifiedW);
            ECFieldElement eCFieldElementTwo = two(eCFieldElement2);
            ECFieldElement eCFieldElementMultiply = eCFieldElementTwo.multiply(eCFieldElement2);
            ECFieldElement eCFieldElementTwo2 = two(eCFieldElement.multiply(eCFieldElementMultiply));
            ECFieldElement eCFieldElementSubtract = eCFieldElementAdd.square().subtract(two(eCFieldElementTwo2));
            ECFieldElement eCFieldElementTwo3 = two(eCFieldElementMultiply.square());
            ECFieldElement eCFieldElementSubtract2 = eCFieldElementAdd.multiply(eCFieldElementTwo2.subtract(eCFieldElementSubtract)).subtract(eCFieldElementTwo3);
            ECFieldElement eCFieldElementTwo4 = z11 ? two(eCFieldElementTwo3.multiply(jacobianModifiedW)) : null;
            if (!eCFieldElement3.isOne()) {
                eCFieldElementTwo = eCFieldElementTwo.multiply(eCFieldElement3);
            }
            return new Fp(getCurve(), eCFieldElementSubtract, eCFieldElementSubtract2, new ECFieldElement[]{eCFieldElementTwo, eCFieldElementTwo4}, this.withCompression);
        }

        @Override // org.spongycastle.math.ec.ECPoint
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
            ECFieldElement eCFieldElement = this.f99692y;
            if (eCFieldElement.isZero()) {
                return eCPoint;
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem != 0) {
                return coordinateSystem != 4 ? twice().add(eCPoint) : twiceJacobianModified(false).add(eCPoint);
            }
            ECFieldElement eCFieldElement2 = this.f99691x;
            ECFieldElement eCFieldElement3 = eCPoint.f99691x;
            ECFieldElement eCFieldElement4 = eCPoint.f99692y;
            ECFieldElement eCFieldElementSubtract = eCFieldElement3.subtract(eCFieldElement2);
            ECFieldElement eCFieldElementSubtract2 = eCFieldElement4.subtract(eCFieldElement);
            if (eCFieldElementSubtract.isZero()) {
                return eCFieldElementSubtract2.isZero() ? threeTimes() : this;
            }
            ECFieldElement eCFieldElementSquare = eCFieldElementSubtract.square();
            ECFieldElement eCFieldElementSubtract3 = eCFieldElementSquare.multiply(two(eCFieldElement2).add(eCFieldElement3)).subtract(eCFieldElementSubtract2.square());
            if (eCFieldElementSubtract3.isZero()) {
                return curve.getInfinity();
            }
            ECFieldElement eCFieldElementInvert = eCFieldElementSubtract3.multiply(eCFieldElementSubtract).invert();
            ECFieldElement eCFieldElementMultiply = eCFieldElementSubtract3.multiply(eCFieldElementInvert).multiply(eCFieldElementSubtract2);
            ECFieldElement eCFieldElementSubtract4 = two(eCFieldElement).multiply(eCFieldElementSquare).multiply(eCFieldElementSubtract).multiply(eCFieldElementInvert).subtract(eCFieldElementMultiply);
            ECFieldElement eCFieldElementAdd = eCFieldElementSubtract4.subtract(eCFieldElementMultiply).multiply(eCFieldElementMultiply.add(eCFieldElementSubtract4)).add(eCFieldElement3);
            return new Fp(curve, eCFieldElementAdd, eCFieldElement2.subtract(eCFieldElementAdd).multiply(eCFieldElementSubtract4).subtract(eCFieldElement), this.withCompression);
        }

        protected ECFieldElement two(ECFieldElement eCFieldElement) {
            return eCFieldElement.add(eCFieldElement);
        }

        public Fp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z11) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
            if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            this.withCompression = z11;
        }

        Fp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z11) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
            this.withCompression = z11;
        }
    }

    protected ECPoint(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, getInitialZCoords(eCCurve));
    }

    protected static ECFieldElement[] getInitialZCoords(ECCurve eCCurve) {
        int coordinateSystem = eCCurve == null ? 0 : eCCurve.getCoordinateSystem();
        if (coordinateSystem == 0 || coordinateSystem == 5) {
            return EMPTY_ZS;
        }
        ECFieldElement eCFieldElementFromBigInteger = eCCurve.fromBigInteger(ECConstants.ONE);
        if (coordinateSystem != 1 && coordinateSystem != 2) {
            if (coordinateSystem == 3) {
                return new ECFieldElement[]{eCFieldElementFromBigInteger, eCFieldElementFromBigInteger, eCFieldElementFromBigInteger};
            }
            if (coordinateSystem == 4) {
                return new ECFieldElement[]{eCFieldElementFromBigInteger, eCCurve.getA()};
            }
            if (coordinateSystem != 6) {
                throw new IllegalArgumentException("unknown coordinate system");
            }
        }
        return new ECFieldElement[]{eCFieldElementFromBigInteger};
    }

    public abstract ECPoint add(ECPoint eCPoint);

    protected void checkNormalized() {
        if (!isNormalized()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    protected ECPoint createScaledPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return getCurve().createRawPoint(getRawXCoord().multiply(eCFieldElement), getRawYCoord().multiply(eCFieldElement2), this.withCompression);
    }

    protected abstract ECPoint detach();

    public boolean equals(ECPoint eCPoint) {
        ECPoint eCPointNormalize;
        if (eCPoint == null) {
            return false;
        }
        ECCurve curve = getCurve();
        ECCurve curve2 = eCPoint.getCurve();
        boolean z11 = curve == null;
        boolean z12 = curve2 == null;
        boolean zIsInfinity = isInfinity();
        boolean zIsInfinity2 = eCPoint.isInfinity();
        if (zIsInfinity || zIsInfinity2) {
            return zIsInfinity && zIsInfinity2 && (z11 || z12 || curve.equals(curve2));
        }
        if (z11 && z12) {
            eCPointNormalize = this;
        } else if (z11) {
            eCPoint = eCPoint.normalize();
            eCPointNormalize = this;
        } else if (z12) {
            eCPointNormalize = normalize();
        } else {
            if (!curve.equals(curve2)) {
                return false;
            }
            ECPoint[] eCPointArr = {this, curve.importPoint(eCPoint)};
            curve.normalizeAll(eCPointArr);
            eCPointNormalize = eCPointArr[0];
            eCPoint = eCPointArr[1];
        }
        return eCPointNormalize.getXCoord().equals(eCPoint.getXCoord()) && eCPointNormalize.getYCoord().equals(eCPoint.getYCoord());
    }

    public ECFieldElement getAffineXCoord() {
        checkNormalized();
        return getXCoord();
    }

    public ECFieldElement getAffineYCoord() {
        checkNormalized();
        return getYCoord();
    }

    protected abstract boolean getCompressionYTilde();

    public ECCurve getCurve() {
        return this.curve;
    }

    protected int getCurveCoordinateSystem() {
        ECCurve eCCurve = this.curve;
        if (eCCurve == null) {
            return 0;
        }
        return eCCurve.getCoordinateSystem();
    }

    public final ECPoint getDetachedPoint() {
        return normalize().detach();
    }

    public byte[] getEncoded() {
        return getEncoded(this.withCompression);
    }

    public final ECFieldElement getRawXCoord() {
        return this.f99691x;
    }

    public final ECFieldElement getRawYCoord() {
        return this.f99692y;
    }

    protected final ECFieldElement[] getRawZCoords() {
        return this.f99693zs;
    }

    public ECFieldElement getX() {
        return normalize().getXCoord();
    }

    public ECFieldElement getXCoord() {
        return this.f99691x;
    }

    public ECFieldElement getY() {
        return normalize().getYCoord();
    }

    public ECFieldElement getYCoord() {
        return this.f99692y;
    }

    public ECFieldElement getZCoord(int i11) {
        if (i11 < 0) {
            return null;
        }
        ECFieldElement[] eCFieldElementArr = this.f99693zs;
        if (i11 >= eCFieldElementArr.length) {
            return null;
        }
        return eCFieldElementArr[i11];
    }

    public ECFieldElement[] getZCoords() {
        ECFieldElement[] eCFieldElementArr = this.f99693zs;
        int length = eCFieldElementArr.length;
        if (length == 0) {
            return EMPTY_ZS;
        }
        ECFieldElement[] eCFieldElementArr2 = new ECFieldElement[length];
        System.arraycopy(eCFieldElementArr, 0, eCFieldElementArr2, 0, length);
        return eCFieldElementArr2;
    }

    public int hashCode() {
        ECCurve curve = getCurve();
        int i11 = curve == null ? 0 : ~curve.hashCode();
        if (isInfinity()) {
            return i11;
        }
        ECPoint eCPointNormalize = normalize();
        return (i11 ^ (eCPointNormalize.getXCoord().hashCode() * 17)) ^ (eCPointNormalize.getYCoord().hashCode() * EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
    }

    public boolean isCompressed() {
        return this.withCompression;
    }

    public boolean isInfinity() {
        if (this.f99691x == null || this.f99692y == null) {
            return true;
        }
        ECFieldElement[] eCFieldElementArr = this.f99693zs;
        return eCFieldElementArr.length > 0 && eCFieldElementArr[0].isZero();
    }

    public boolean isNormalized() {
        int curveCoordinateSystem = getCurveCoordinateSystem();
        return curveCoordinateSystem == 0 || curveCoordinateSystem == 5 || isInfinity() || this.f99693zs[0].isOne();
    }

    public boolean isValid() {
        return isInfinity() || getCurve() == null || (satisfiesCurveEquation() && satisfiesCofactor());
    }

    public ECPoint multiply(BigInteger bigInteger) {
        return getCurve().getMultiplier().multiply(this, bigInteger);
    }

    public abstract ECPoint negate();

    public ECPoint normalize() {
        int curveCoordinateSystem;
        if (!isInfinity() && (curveCoordinateSystem = getCurveCoordinateSystem()) != 0 && curveCoordinateSystem != 5) {
            ECFieldElement zCoord = getZCoord(0);
            if (!zCoord.isOne()) {
                return normalize(zCoord.invert());
            }
        }
        return this;
    }

    protected boolean satisfiesCofactor() {
        BigInteger cofactor = this.curve.getCofactor();
        return cofactor == null || cofactor.equals(ECConstants.ONE) || !ECAlgorithms.referenceMultiply(this, cofactor).isInfinity();
    }

    protected abstract boolean satisfiesCurveEquation();

    public ECPoint scaleX(ECFieldElement eCFieldElement) {
        return isInfinity() ? this : getCurve().createRawPoint(getRawXCoord().multiply(eCFieldElement), getRawYCoord(), getRawZCoords(), this.withCompression);
    }

    public ECPoint scaleY(ECFieldElement eCFieldElement) {
        return isInfinity() ? this : getCurve().createRawPoint(getRawXCoord(), getRawYCoord().multiply(eCFieldElement), getRawZCoords(), this.withCompression);
    }

    public abstract ECPoint subtract(ECPoint eCPoint);

    public ECPoint threeTimes() {
        return twicePlus(this);
    }

    public ECPoint timesPow2(int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
        ECPoint eCPointTwice = this;
        while (true) {
            i11--;
            if (i11 < 0) {
                return eCPointTwice;
            }
            eCPointTwice = eCPointTwice.twice();
        }
    }

    public String toString() {
        if (isInfinity()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        stringBuffer.append(getRawXCoord());
        stringBuffer.append(CoreConstants.COMMA_CHAR);
        stringBuffer.append(getRawYCoord());
        for (int i11 = 0; i11 < this.f99693zs.length; i11++) {
            stringBuffer.append(CoreConstants.COMMA_CHAR);
            stringBuffer.append(this.f99693zs[i11]);
        }
        stringBuffer.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return stringBuffer.toString();
    }

    public abstract ECPoint twice();

    public ECPoint twicePlus(ECPoint eCPoint) {
        return twice().add(eCPoint);
    }

    protected ECPoint(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        this.preCompTable = null;
        this.curve = eCCurve;
        this.f99691x = eCFieldElement;
        this.f99692y = eCFieldElement2;
        this.f99693zs = eCFieldElementArr;
    }

    public byte[] getEncoded(boolean z11) {
        if (isInfinity()) {
            return new byte[1];
        }
        ECPoint eCPointNormalize = normalize();
        byte[] encoded = eCPointNormalize.getXCoord().getEncoded();
        if (z11) {
            byte[] bArr = new byte[encoded.length + 1];
            bArr[0] = (byte) (eCPointNormalize.getCompressionYTilde() ? 3 : 2);
            System.arraycopy(encoded, 0, bArr, 1, encoded.length);
            return bArr;
        }
        byte[] encoded2 = eCPointNormalize.getYCoord().getEncoded();
        byte[] bArr2 = new byte[encoded.length + encoded2.length + 1];
        bArr2[0] = 4;
        System.arraycopy(encoded, 0, bArr2, 1, encoded.length);
        System.arraycopy(encoded2, 0, bArr2, encoded.length + 1, encoded2.length);
        return bArr2;
    }

    ECPoint normalize(ECFieldElement eCFieldElement) {
        int curveCoordinateSystem = getCurveCoordinateSystem();
        if (curveCoordinateSystem != 1) {
            if (curveCoordinateSystem == 2 || curveCoordinateSystem == 3 || curveCoordinateSystem == 4) {
                ECFieldElement eCFieldElementSquare = eCFieldElement.square();
                return createScaledPoint(eCFieldElementSquare, eCFieldElementSquare.multiply(eCFieldElement));
            }
            if (curveCoordinateSystem != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return createScaledPoint(eCFieldElement, eCFieldElement);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ECPoint) {
            return equals((ECPoint) obj);
        }
        return false;
    }
}
