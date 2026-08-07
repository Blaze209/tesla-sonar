package com.horcrux.svg;

import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes6.dex */
class n0 {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45466a;

        static {
            int[] iArr = new int[SVGLength.UnitType.values().length];
            f45466a = iArr;
            try {
                iArr[SVGLength.UnitType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45466a[SVGLength.UnitType.PX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45466a[SVGLength.UnitType.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45466a[SVGLength.UnitType.EMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45466a[SVGLength.UnitType.EXS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45466a[SVGLength.UnitType.CM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45466a[SVGLength.UnitType.MM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45466a[SVGLength.UnitType.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f45466a[SVGLength.UnitType.PT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f45466a[SVGLength.UnitType.PC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f45466a[SVGLength.UnitType.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static double a(SVGLength sVGLength, double d11, double d12, double d13, double d14) {
        double d15;
        if (sVGLength == null) {
            return d12;
        }
        SVGLength.UnitType unitType = sVGLength.f45258b;
        double d16 = sVGLength.f45257a;
        switch (a.f45466a[unitType.ordinal()]) {
            case 1:
            case 2:
                d14 = 1.0d;
                d16 *= d14;
                d15 = d16 * d13;
                break;
            case 3:
                d15 = (d16 / 100.0d) * d11;
                break;
            case 4:
                d16 *= d14;
                d15 = d16 * d13;
                break;
            case 5:
                d14 /= 2.0d;
                d16 *= d14;
                d15 = d16 * d13;
                break;
            case 6:
                d14 = 35.43307d;
                d16 *= d14;
                d15 = d16 * d13;
                break;
            case 7:
                d14 = 3.543307d;
                d16 *= d14;
                d15 = d16 * d13;
                break;
            case 8:
                d14 = 90.0d;
                d16 *= d14;
                d15 = d16 * d13;
                break;
            case 9:
                d14 = 1.25d;
                d16 *= d14;
                d15 = d16 * d13;
                break;
            case 10:
                d14 = 15.0d;
                d16 *= d14;
                d15 = d16 * d13;
                break;
            default:
                d15 = d16 * d13;
                break;
        }
        return d15 + d12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static double b(String str, double d11, double d12, double d13) {
        double dDoubleValue;
        String strTrim = str.trim();
        int length = strTrim.length();
        int i11 = length - 1;
        if (length == 0 || strTrim.equals("normal")) {
            return 0.0d;
        }
        if (strTrim.codePointAt(i11) == 37) {
            return (Double.valueOf(strTrim.substring(0, i11)).doubleValue() / 100.0d) * d11;
        }
        int i12 = length - 2;
        if (i12 > 0) {
            String strSubstring = strTrim.substring(i12);
            strSubstring.getClass();
            switch (strSubstring) {
                case "cm":
                    d13 = 35.43307d;
                    length = i12;
                    break;
                case "em":
                    length = i12;
                    break;
                case "in":
                    d13 = 90.0d;
                    length = i12;
                    break;
                case "mm":
                    d13 = 3.543307d;
                    length = i12;
                    break;
                case "pc":
                    d13 = 15.0d;
                    length = i12;
                    break;
                case "pt":
                    d13 = 1.25d;
                    length = i12;
                    break;
                case "px":
                    length = i12;
                    d13 = 1.0d;
                    break;
                default:
                    d13 = 1.0d;
                    break;
            }
            dDoubleValue = Double.valueOf(strTrim.substring(0, length)).doubleValue() * d13;
        } else {
            dDoubleValue = Double.valueOf(strTrim).doubleValue();
        }
        return dDoubleValue * d12;
    }

    static int c(ReadableArray readableArray, float[] fArr, float f11) {
        int size = readableArray.size();
        if (size != 6) {
            return size;
        }
        fArr[0] = (float) readableArray.getDouble(0);
        fArr[1] = (float) readableArray.getDouble(2);
        fArr[2] = ((float) readableArray.getDouble(4)) * f11;
        fArr[3] = (float) readableArray.getDouble(1);
        fArr[4] = (float) readableArray.getDouble(3);
        fArr[5] = ((float) readableArray.getDouble(5)) * f11;
        return 6;
    }
}
