package h0;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.y;
import c0.y0;
import com.plaid.internal.EnumC4419g;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String[] f70103c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k[] f70104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final k[] f70105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final k[] f70106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final k[] f70107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final k[] f70108h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final k[][] f70109i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final HashSet<String> f70110j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f70111k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Map<String, h>> f70112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteOrder f70113b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70114a;

        static {
            int[] iArr = new int[y.values().length];
            f70114a = iArr;
            try {
                iArr[y.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70114a[y.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70114a[y.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Pattern f70115c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Pattern f70116d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Pattern f70117e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final List<HashMap<String, k>> f70118f = Collections.list(new a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<Map<String, h>> f70119a = Collections.list(new C1446b());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteOrder f70120b;

        class a implements Enumeration<HashMap<String, k>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f70121a = 0;

            a() {
            }

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, k> nextElement() {
                HashMap<String, k> map = new HashMap<>();
                for (k kVar : i.f70109i[this.f70121a]) {
                    map.put(kVar.f70134b, kVar);
                }
                this.f70121a++;
                return map;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f70121a < i.f70109i.length;
            }
        }

        /* JADX INFO: renamed from: h0.i$b$b, reason: collision with other inner class name */
        class C1446b implements Enumeration<Map<String, h>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f70122a = 0;

            C1446b() {
            }

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<String, h> nextElement() {
                this.f70122a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f70122a < i.f70109i.length;
            }
        }

        class c implements Enumeration<Map<String, h>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final Enumeration<Map<String, h>> f70124a;

            c() {
                this.f70124a = Collections.enumeration(b.this.f70119a);
            }

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<String, h> nextElement() {
                return new HashMap(this.f70124a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f70124a.hasMoreElements();
            }
        }

        b(@NonNull ByteOrder byteOrder) {
            this.f70120b = byteOrder;
        }

        private static Pair<Integer, Integer> b(String str) {
            if (str.contains(",")) {
                String[] strArrSplit = str.split(",", -1);
                Pair<Integer, Integer> pairB = b(strArrSplit[0]);
                if (((Integer) pairB.first).intValue() == 2) {
                    return pairB;
                }
                for (int i11 = 1; i11 < strArrSplit.length; i11++) {
                    Pair<Integer, Integer> pairB2 = b(strArrSplit[i11]);
                    int iIntValue = (((Integer) pairB2.first).equals(pairB.first) || ((Integer) pairB2.second).equals(pairB.first)) ? ((Integer) pairB.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairB.second).intValue() == -1 || !(((Integer) pairB2.first).equals(pairB.second) || ((Integer) pairB2.second).equals(pairB.second))) ? -1 : ((Integer) pairB.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairB = new Pair<>(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairB = new Pair<>(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairB;
            }
            if (!str.contains("/")) {
                try {
                    try {
                        long j11 = Long.parseLong(str);
                        if (j11 < 0 || j11 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                            return j11 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
                        }
                        return new Pair<>(3, 4);
                    } catch (NumberFormatException unused) {
                        return new Pair<>(2, -1);
                    }
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            }
            String[] strArrSplit2 = str.split("/", -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j12 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j13 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j12 >= 0 && j13 >= 0) {
                        if (j12 <= 2147483647L && j13 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair<>(2, -1);
        }

        private void d(@NonNull String str, @NonNull String str2, @NonNull List<Map<String, h>> list) {
            Iterator<Map<String, h>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().containsKey(str)) {
                    return;
                }
            }
            e(str, str2, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Switch 'out' block B:44:0x0146 for B:65:0x0195 already processed. Defaulting to fallback option. */
        private void e(@NonNull String str, String str2, @NonNull List<Map<String, h>> list) {
            int i11;
            int i12;
            b bVar = this;
            String str3 = str;
            String strReplaceAll = str2;
            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
                boolean zFind = f70116d.matcher(strReplaceAll).find();
                boolean zFind2 = f70117e.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                    y0.l("ExifData", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                }
            }
            if ("ISOSpeedRatings".equals(str3)) {
                str3 = "PhotographicSensitivity";
            }
            String str4 = str3;
            int i13 = 2;
            int i14 = 1;
            if (strReplaceAll != null && i.f70110j.contains(str4)) {
                if (str4.equals("GPSTimeStamp")) {
                    Matcher matcher = f70115c.matcher(strReplaceAll);
                    if (!matcher.find()) {
                        y0.l("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll);
                        return;
                    }
                    strReplaceAll = Integer.parseInt((String) u5.h.g(matcher.group(1))) + "/1," + Integer.parseInt((String) u5.h.g(matcher.group(2))) + "/1," + Integer.parseInt((String) u5.h.g(matcher.group(3))) + "/1";
                } else {
                    try {
                        strReplaceAll = new l(Double.parseDouble(strReplaceAll)).toString();
                    } catch (NumberFormatException e11) {
                        y0.m("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll, e11);
                        return;
                    }
                }
            }
            int i15 = 0;
            while (i15 < i.f70109i.length) {
                k kVar = f70118f.get(i15).get(str4);
                if (kVar == null) {
                    i11 = i14;
                } else {
                    if (strReplaceAll != null) {
                        Pair<Integer, Integer> pairB = b(strReplaceAll);
                        int i16 = -1;
                        if (kVar.f70135c == ((Integer) pairB.first).intValue() || kVar.f70135c == ((Integer) pairB.second).intValue()) {
                            i12 = kVar.f70135c;
                        } else {
                            int i17 = kVar.f70136d;
                            if (i17 == -1 || !(i17 == ((Integer) pairB.first).intValue() || kVar.f70136d == ((Integer) pairB.second).intValue())) {
                                i12 = kVar.f70135c;
                                if (i12 == i14 || i12 == 7 || i12 == i13) {
                                }
                            } else {
                                i12 = kVar.f70136d;
                            }
                        }
                        String str5 = "/";
                        switch (i12) {
                            case 1:
                                i11 = i14;
                                list.get(i15).put(str4, h.a(strReplaceAll));
                                continue;
                            case 2:
                            case 7:
                                i11 = i14;
                                list.get(i15).put(str4, h.e(strReplaceAll));
                                continue;
                            case 3:
                                i11 = i14;
                                String[] strArrSplit = strReplaceAll.split(",", -1);
                                int[] iArr = new int[strArrSplit.length];
                                for (int i18 = 0; i18 < strArrSplit.length; i18++) {
                                    iArr[i18] = Integer.parseInt(strArrSplit[i18]);
                                }
                                list.get(i15).put(str4, h.i(iArr, bVar.f70120b));
                                continue;
                            case 4:
                                i11 = i14;
                                String[] strArrSplit2 = strReplaceAll.split(",", -1);
                                long[] jArr = new long[strArrSplit2.length];
                                for (int i19 = 0; i19 < strArrSplit2.length; i19++) {
                                    jArr[i19] = Long.parseLong(strArrSplit2[i19]);
                                }
                                list.get(i15).put(str4, h.g(jArr, bVar.f70120b));
                                continue;
                            case 5:
                                i11 = i14;
                                int i21 = -1;
                                String[] strArrSplit3 = strReplaceAll.split(",", -1);
                                l[] lVarArr = new l[strArrSplit3.length];
                                int i22 = 0;
                                while (i22 < strArrSplit3.length) {
                                    String[] strArrSplit4 = strArrSplit3[i22].split("/", i21);
                                    lVarArr[i22] = new l((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[i11]));
                                    i22++;
                                    i21 = -1;
                                }
                                bVar = this;
                                list.get(i15).put(str4, h.h(lVarArr, bVar.f70120b));
                                continue;
                            case 9:
                                i11 = i14;
                                String[] strArrSplit5 = strReplaceAll.split(",", -1);
                                int[] iArr2 = new int[strArrSplit5.length];
                                for (int i23 = 0; i23 < strArrSplit5.length; i23++) {
                                    iArr2[i23] = Integer.parseInt(strArrSplit5[i23]);
                                }
                                list.get(i15).put(str4, h.c(iArr2, bVar.f70120b));
                                continue;
                            case 10:
                                String[] strArrSplit6 = strReplaceAll.split(",", -1);
                                l[] lVarArr2 = new l[strArrSplit6.length];
                                int i24 = 0;
                                while (i24 < strArrSplit6.length) {
                                    String[] strArrSplit7 = strArrSplit6[i24].split(str5, i16);
                                    int i25 = i14;
                                    lVarArr2[i24] = new l((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[i25]));
                                    i24++;
                                    i14 = i25;
                                    str5 = str5;
                                    i16 = -1;
                                }
                                i11 = i14;
                                list.get(i15).put(str4, h.d(lVarArr2, bVar.f70120b));
                                continue;
                            case 12:
                                String[] strArrSplit8 = strReplaceAll.split(",", -1);
                                double[] dArr = new double[strArrSplit8.length];
                                for (int i26 = 0; i26 < strArrSplit8.length; i26++) {
                                    dArr[i26] = Double.parseDouble(strArrSplit8[i26]);
                                }
                                list.get(i15).put(str4, h.b(dArr, bVar.f70120b));
                                break;
                        }
                    } else {
                        list.get(i15).remove(str4);
                    }
                    i11 = i14;
                }
                i15++;
                i14 = i11;
                i13 = 2;
            }
        }

        @NonNull
        public i a() {
            ArrayList list = Collections.list(new c());
            if (!list.get(1).isEmpty()) {
                d("ExposureProgram", String.valueOf(0), list);
                d("ExifVersion", "0230", list);
                d("ComponentsConfiguration", i.f70111k, list);
                d("MeteringMode", String.valueOf(0), list);
                d("LightSource", String.valueOf(0), list);
                d("FlashpixVersion", "0100", list);
                d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                d("FileSource", String.valueOf(3), list);
                d("SceneType", String.valueOf(1), list);
                d("CustomRendered", String.valueOf(0), list);
                d("SceneCaptureType", String.valueOf(0), list);
                d("Contrast", String.valueOf(0), list);
                d("Saturation", String.valueOf(0), list);
                d("Sharpness", String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                d("GPSVersionID", "2300", list);
                d("GPSSpeedRef", "K", list);
                d("GPSTrackRef", "T", list);
                d("GPSImgDirectionRef", "T", list);
                d("GPSDestBearingRef", "T", list);
                d("GPSDestDistanceRef", "K", list);
            }
            return new i(this.f70120b, list);
        }

        @NonNull
        public b c(@NonNull String str, @NonNull String str2) {
            e(str, str2, this.f70119a);
            return this;
        }

        @NonNull
        public b f(long j11) {
            return c("ExposureTime", String.valueOf(j11 / TimeUnit.SECONDS.toNanos(1L)));
        }

        @NonNull
        public b g(@NonNull y yVar) {
            int i11;
            if (yVar == y.UNKNOWN) {
                return this;
            }
            int i12 = a.f70114a[yVar.ordinal()];
            if (i12 == 1) {
                i11 = 0;
            } else if (i12 == 2) {
                i11 = 32;
            } else {
                if (i12 != 3) {
                    y0.l("ExifData", "Unknown flash state: " + yVar);
                    return this;
                }
                i11 = 1;
            }
            if ((i11 & 1) == 1) {
                c("LightSource", String.valueOf(4));
            }
            return c("Flash", String.valueOf(i11));
        }

        @NonNull
        public b h(float f11) {
            return c("FocalLength", new l((long) (f11 * 1000.0f), 1000L).toString());
        }

        @NonNull
        public b i(int i11) {
            return c("ImageLength", String.valueOf(i11));
        }

        @NonNull
        public b j(int i11) {
            return c("ImageWidth", String.valueOf(i11));
        }

        @NonNull
        public b k(int i11) {
            return c("SensitivityType", String.valueOf(3)).c("PhotographicSensitivity", String.valueOf(Math.min(65535, i11)));
        }

        @NonNull
        public b l(float f11) {
            return c("FNumber", String.valueOf(f11));
        }

        @NonNull
        public b m(int i11) {
            int i12;
            if (i11 == 0) {
                i12 = 1;
            } else if (i11 == 90) {
                i12 = 6;
            } else if (i11 == 180) {
                i12 = 3;
            } else if (i11 != 270) {
                y0.l("ExifData", "Unexpected orientation value: " + i11 + ". Must be one of 0, 90, 180, 270.");
                i12 = 0;
            } else {
                i12 = 8;
            }
            return c("Orientation", String.valueOf(i12));
        }

        @NonNull
        public b n(@NonNull c cVar) {
            String strValueOf;
            int iOrdinal = cVar.ordinal();
            if (iOrdinal != 0) {
                strValueOf = iOrdinal != 1 ? null : String.valueOf(1);
            } else {
                strValueOf = String.valueOf(0);
            }
            return c("WhiteBalance", strValueOf);
        }
    }

    public enum c {
        AUTO,
        MANUAL
    }

    static {
        k[] kVarArr = {new k("ImageWidth", 256, 3, 4), new k("ImageLength", EnumC4419g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, 3, 4), new k("Make", EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, 2), new k("Model", EnumC4419g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 2), new k("Orientation", EnumC4419g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 3), new k("XResolution", EnumC4419g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, 5), new k("YResolution", EnumC4419g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, 5), new k("ResolutionUnit", EnumC4419g.SDK_ASSET_LOADING_INDICATOR_VALUE, 3), new k("Software", EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, 2), new k("DateTime", EnumC4419g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, 2), new k("YCbCrPositioning", 531, 3), new k("SubIFDPointer", 330, 4), new k("ExifIFDPointer", 34665, 4), new k("GPSInfoIFDPointer", 34853, 4)};
        f70104d = kVarArr;
        k[] kVarArr2 = {new k("ExposureTime", 33434, 5), new k("FNumber", 33437, 5), new k("ExposureProgram", 34850, 3), new k("PhotographicSensitivity", 34855, 3), new k("SensitivityType", 34864, 3), new k("ExifVersion", 36864, 2), new k("DateTimeOriginal", 36867, 2), new k("DateTimeDigitized", 36868, 2), new k("ComponentsConfiguration", 37121, 7), new k("ShutterSpeedValue", 37377, 10), new k("ApertureValue", 37378, 5), new k("BrightnessValue", 37379, 10), new k("ExposureBiasValue", 37380, 10), new k("MaxApertureValue", 37381, 5), new k("MeteringMode", 37383, 3), new k("LightSource", 37384, 3), new k("Flash", 37385, 3), new k("FocalLength", 37386, 5), new k("SubSecTime", 37520, 2), new k("SubSecTimeOriginal", 37521, 2), new k("SubSecTimeDigitized", 37522, 2), new k("FlashpixVersion", 40960, 7), new k("ColorSpace", 40961, 3), new k("PixelXDimension", 40962, 3, 4), new k("PixelYDimension", 40963, 3, 4), new k("InteroperabilityIFDPointer", 40965, 4), new k("FocalPlaneResolutionUnit", 41488, 3), new k("SensingMethod", 41495, 3), new k("FileSource", 41728, 7), new k("SceneType", 41729, 7), new k("CustomRendered", 41985, 3), new k("ExposureMode", 41986, 3), new k("WhiteBalance", 41987, 3), new k("SceneCaptureType", 41990, 3), new k("Contrast", 41992, 3), new k("Saturation", 41993, 3), new k("Sharpness", 41994, 3)};
        f70105e = kVarArr2;
        k[] kVarArr3 = {new k("GPSVersionID", 0, 1), new k("GPSLatitudeRef", 1, 2), new k("GPSLatitude", 2, 5, 10), new k("GPSLongitudeRef", 3, 2), new k("GPSLongitude", 4, 5, 10), new k("GPSAltitudeRef", 5, 1), new k("GPSAltitude", 6, 5), new k("GPSTimeStamp", 7, 5), new k("GPSSpeedRef", 12, 2), new k("GPSTrackRef", 14, 2), new k("GPSImgDirectionRef", 16, 2), new k("GPSDestBearingRef", 23, 2), new k("GPSDestDistanceRef", 25, 2)};
        f70106f = kVarArr3;
        f70107g = new k[]{new k("SubIFDPointer", 330, 4), new k("ExifIFDPointer", 34665, 4), new k("GPSInfoIFDPointer", 34853, 4), new k("InteroperabilityIFDPointer", 40965, 4)};
        k[] kVarArr4 = {new k("InteroperabilityIndex", 1, 2)};
        f70108h = kVarArr4;
        f70109i = new k[][]{kVarArr, kVarArr2, kVarArr3, kVarArr4};
        f70110j = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        f70111k = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    i(ByteOrder byteOrder, List<Map<String, h>> list) {
        u5.h.j(list.size() == f70109i.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f70113b = byteOrder;
        this.f70112a = list;
    }

    @NonNull
    public static b b() {
        return new b(ByteOrder.BIG_ENDIAN).c("Orientation", String.valueOf(1)).c("XResolution", "72/1").c("YResolution", "72/1").c("ResolutionUnit", String.valueOf(2)).c("YCbCrPositioning", String.valueOf(1)).c("Make", Build.MANUFACTURER).c("Model", Build.MODEL);
    }

    @NonNull
    public static i c(@NonNull androidx.camera.core.n nVar, int i11) {
        b bVarB = b();
        if (nVar.z() != null) {
            nVar.z().b(bVarB);
        }
        bVarB.m(i11);
        return bVarB.j(nVar.getWidth()).i(nVar.getHeight()).a();
    }

    @NonNull
    Map<String, h> d(int i11) {
        u5.h.c(i11, 0, f70109i.length, "Invalid IFD index: " + i11 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f70112a.get(i11);
    }

    @NonNull
    public ByteOrder e() {
        return this.f70113b;
    }
}
