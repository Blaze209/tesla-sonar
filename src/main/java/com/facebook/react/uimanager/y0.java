package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
public class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ThreadLocal<double[]> f23434a = new a();

    class a extends ThreadLocal<double[]> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public double[] initialValue() {
            return new double[16];
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23435a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f23435a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23435a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static double a(ReadableMap readableMap, String str) {
        double d11;
        boolean z11 = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z11 = false;
            }
            d11 = Float.parseFloat(string);
        } else {
            d11 = readableMap.getDouble(str);
        }
        return z11 ? d11 : q.l(d11);
    }

    private static float[] b(float f11, float f12, ReadableArray readableArray, boolean z11) {
        if (readableArray == null) {
            return null;
        }
        if (f12 == BitmapDescriptorFactory.HUE_RED && f11 == BitmapDescriptorFactory.HUE_RED) {
            return null;
        }
        float f13 = f11 / 2.0f;
        float f14 = f12 / 2.0f;
        float[] fArr = new float[3];
        fArr[0] = f13;
        fArr[1] = f14;
        fArr[2] = 0.0f;
        int i11 = 0;
        while (i11 < readableArray.size() && i11 < 3) {
            int i12 = b.f23435a[readableArray.getType(i11).ordinal()];
            if (i12 == 1) {
                fArr[i11] = (float) readableArray.getDouble(i11);
            } else if (i12 == 2 && z11) {
                String string = readableArray.getString(i11);
                if (string.endsWith("%")) {
                    fArr[i11] = ((i11 == 0 ? f11 : f12) * Float.parseFloat(string.substring(0, string.length() - 1))) / 100.0f;
                }
            }
            i11++;
        }
        return new float[]{(-f13) + fArr[0], (-f14) + fArr[1], fArr[2]};
    }

    private static double c(String str, double d11) {
        try {
            return str.endsWith("%") ? (Double.parseDouble(str.substring(0, str.length() - 1)) * d11) / 100.0d : Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            qk.a.I("ReactNative", "Invalid translate value: " + str);
            return 0.0d;
        }
    }

    public static void d(ReadableArray readableArray, double[] dArr, float f11, float f12, ReadableArray readableArray2, boolean z11) {
        double[] dArr2 = f23434a.get();
        q.r(dArr);
        float[] fArrB = b(f11, f12, readableArray2, z11);
        int i11 = 0;
        if (fArrB != null) {
            q.r(dArr2);
            q.j(dArr2, fArrB[0], fArrB[1], fArrB[2]);
            q.p(dArr, dArr, dArr2);
        }
        int i12 = 16;
        if (readableArray.size() == 16 && readableArray.getType(0) == ReadableType.Number) {
            q.r(dArr2);
            for (int i13 = 0; i13 < readableArray.size(); i13++) {
                dArr2[i13] = readableArray.getDouble(i13);
            }
            q.p(dArr, dArr, dArr2);
        } else {
            int size = readableArray.size();
            int i14 = 0;
            while (i14 < size) {
                ReadableMap map = readableArray.getMap(i14);
                String strNextKey = map.keySetIterator().nextKey();
                q.r(dArr2);
                if ("matrix".equals(strNextKey)) {
                    ReadableArray array = map.getArray(strNextKey);
                    for (int i15 = i11; i15 < i12; i15++) {
                        dArr2[i15] = array.getDouble(i15);
                    }
                } else if ("perspective".equals(strNextKey)) {
                    q.a(dArr2, map.getDouble(strNextKey));
                } else if ("rotateX".equals(strNextKey)) {
                    q.b(dArr2, a(map, strNextKey));
                } else if ("rotateY".equals(strNextKey)) {
                    q.c(dArr2, a(map, strNextKey));
                } else {
                    if ("rotate".equals(strNextKey) || "rotateZ".equals(strNextKey)) {
                        size = size;
                        i11 = i11;
                        i14 = i14;
                        q.d(dArr2, a(map, strNextKey));
                    } else if ("scale".equals(strNextKey)) {
                        double d11 = map.getDouble(strNextKey);
                        q.e(dArr2, d11);
                        q.f(dArr2, d11);
                    } else if ("scaleX".equals(strNextKey)) {
                        q.e(dArr2, map.getDouble(strNextKey));
                    } else if ("scaleY".equals(strNextKey)) {
                        q.f(dArr2, map.getDouble(strNextKey));
                    } else if ("translate".equals(strNextKey)) {
                        ReadableArray array2 = map.getArray(strNextKey);
                        ReadableType type = array2.getType(i11);
                        ReadableType readableType = ReadableType.String;
                        q.j(dArr2, (type == readableType && z11) ? c(array2.getString(i11), f11) : array2.getDouble(i11), (array2.getType(1) == readableType && z11) ? c(array2.getString(1), f12) : array2.getDouble(1), array2.size() > 2 ? array2.getDouble(2) : 0.0d);
                    } else {
                        size = size;
                        i11 = i11;
                        i14 = i14;
                        if ("translateX".equals(strNextKey)) {
                            q.i(dArr2, (map.getType(strNextKey) == ReadableType.String && z11) ? c(map.getString(strNextKey), f11) : map.getDouble(strNextKey), 0.0d);
                        } else if ("translateY".equals(strNextKey)) {
                            q.i(dArr2, 0.0d, (map.getType(strNextKey) == ReadableType.String && z11) ? c(map.getString(strNextKey), f12) : map.getDouble(strNextKey));
                        } else if ("skewX".equals(strNextKey)) {
                            q.g(dArr2, a(map, strNextKey));
                        } else if ("skewY".equals(strNextKey)) {
                            q.h(dArr2, a(map, strNextKey));
                        } else {
                            qk.a.I("ReactNative", "Unsupported transform type: " + strNextKey);
                        }
                    }
                    q.p(dArr, dArr, dArr2);
                    i14++;
                    size = size;
                    i11 = i11;
                    i12 = 16;
                }
                size = size;
                i11 = i11;
                i14 = i14;
                q.p(dArr, dArr, dArr2);
                i14++;
                size = size;
                i11 = i11;
                i12 = 16;
            }
        }
        int i16 = i11;
        if (fArrB != null) {
            q.r(dArr2);
            q.j(dArr2, -fArrB[i16], -fArrB[1], -fArrB[2]);
            q.p(dArr, dArr, dArr2);
        }
    }
}
