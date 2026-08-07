package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class SVGLength {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double f45257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final UnitType f45258b;

    public enum UnitType {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45259a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f45259a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45259a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45259a[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private SVGLength() {
        this.f45257a = 0.0d;
        this.f45258b = UnitType.UNKNOWN;
    }

    static ArrayList<SVGLength> a(Dynamic dynamic) {
        int i11 = a.f45259a[dynamic.getType().ordinal()];
        if (i11 == 1) {
            ArrayList<SVGLength> arrayList = new ArrayList<>(1);
            arrayList.add(new SVGLength(dynamic.asDouble()));
            return arrayList;
        }
        int i12 = 0;
        if (i11 == 2) {
            String[] strArrSplit = dynamic.asString().trim().replaceAll(",", " ").split(" ");
            ArrayList<SVGLength> arrayList2 = new ArrayList<>(strArrSplit.length);
            int length = strArrSplit.length;
            while (i12 < length) {
                arrayList2.add(new SVGLength(strArrSplit[i12]));
                i12++;
            }
            return arrayList2;
        }
        if (i11 != 3) {
            return null;
        }
        ReadableArray readableArrayAsArray = dynamic.asArray();
        int size = readableArrayAsArray.size();
        ArrayList<SVGLength> arrayList3 = new ArrayList<>(size);
        while (i12 < size) {
            arrayList3.add(b(readableArrayAsArray.getDynamic(i12)));
            i12++;
        }
        return arrayList3;
    }

    static SVGLength b(Dynamic dynamic) {
        int i11 = a.f45259a[dynamic.getType().ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? new SVGLength() : new SVGLength(dynamic.asString());
        }
        return new SVGLength(dynamic.asDouble());
    }

    static String c(Dynamic dynamic) {
        int i11 = a.f45259a[dynamic.getType().ordinal()];
        if (i11 == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i11 != 2) {
            return null;
        }
        return dynamic.asString();
    }

    SVGLength(double d11) {
        this.f45257a = d11;
        this.f45258b = UnitType.NUMBER;
    }

    SVGLength(String str) {
        String strTrim = str.trim();
        int length = strTrim.length();
        int i11 = length - 1;
        if (length != 0 && !strTrim.equals("normal")) {
            if (strTrim.codePointAt(i11) == 37) {
                this.f45258b = UnitType.PERCENTAGE;
                this.f45257a = Double.valueOf(strTrim.substring(0, i11)).doubleValue();
                return;
            }
            int i12 = length - 2;
            if (i12 > 0) {
                String strSubstring = strTrim.substring(i12);
                strSubstring.getClass();
                switch (strSubstring) {
                    case "cm":
                        this.f45258b = UnitType.CM;
                        length = i12;
                        break;
                    case "em":
                        this.f45258b = UnitType.EMS;
                        length = i12;
                        break;
                    case "ex":
                        this.f45258b = UnitType.EXS;
                        length = i12;
                        break;
                    case "in":
                        this.f45258b = UnitType.IN;
                        length = i12;
                        break;
                    case "mm":
                        this.f45258b = UnitType.MM;
                        length = i12;
                        break;
                    case "pc":
                        this.f45258b = UnitType.PC;
                        length = i12;
                        break;
                    case "pt":
                        this.f45258b = UnitType.PT;
                        length = i12;
                        break;
                    case "px":
                        this.f45258b = UnitType.NUMBER;
                        length = i12;
                        break;
                    default:
                        this.f45258b = UnitType.NUMBER;
                        break;
                }
                this.f45257a = Double.valueOf(strTrim.substring(0, length)).doubleValue();
                return;
            }
            this.f45258b = UnitType.NUMBER;
            this.f45257a = Double.valueOf(strTrim).doubleValue();
            return;
        }
        this.f45258b = UnitType.UNKNOWN;
        this.f45257a = 0.0d;
    }
}
