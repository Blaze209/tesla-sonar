package h0;

import android.location.Location;
import androidx.annotation.NonNull;
import c0.y0;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f70086c = "g";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f70087d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f70088e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f70089f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<String> f70090g = n();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List<String> f70091h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e7.a f70092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f70093b = false;

    class a extends ThreadLocal<SimpleDateFormat> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    class b extends ThreadLocal<SimpleDateFormat> {
        b() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    class c extends ThreadLocal<SimpleDateFormat> {
        c() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    private static final class d {

        static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final double f70094a;

            a(double d11) {
                this.f70094a = d11;
            }

            double a() {
                return this.f70094a / 2.23694d;
            }
        }

        static a a(double d11) {
            return new a(d11 * 0.621371d);
        }

        static a b(double d11) {
            return new a(d11 * 1.15078d);
        }

        static a c(double d11) {
            return new a(d11);
        }
    }

    private g(e7.a aVar) {
        this.f70092a = aVar;
    }

    private void a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strF = f(jCurrentTimeMillis);
        this.f70092a.h0("DateTime", strF);
        try {
            this.f70092a.h0("SubSecTime", Long.toString(jCurrentTimeMillis - d(strF).getTime()));
        } catch (ParseException unused) {
        }
    }

    private static Date c(String str) {
        return f70087d.get().parse(str);
    }

    private static Date d(String str) {
        return f70089f.get().parse(str);
    }

    private static Date e(String str) {
        return f70088e.get().parse(str);
    }

    private static String f(long j11) {
        return f70089f.get().format(new Date(j11));
    }

    @NonNull
    public static g h(@NonNull File file) {
        return i(file.toString());
    }

    @NonNull
    public static g i(@NonNull String str) {
        return new g(new e7.a(str));
    }

    @NonNull
    public static g j(@NonNull androidx.camera.core.n nVar) {
        ByteBuffer byteBufferL = nVar.N0()[0].l();
        byteBufferL.rewind();
        byte[] bArr = new byte[byteBufferL.capacity()];
        byteBufferL.get(bArr);
        return k(new ByteArrayInputStream(bArr));
    }

    @NonNull
    public static g k(@NonNull InputStream inputStream) {
        return new g(new e7.a(inputStream));
    }

    @NonNull
    public static List<String> n() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    private long x(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return d(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    private long y(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return c(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return e(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return x(str + " " + str2);
    }

    public void A() throws Throwable {
        if (!this.f70093b) {
            a();
        }
        this.f70092a.c0();
    }

    public void b(@NonNull Location location) {
        this.f70092a.i0(location);
    }

    public void g(@NonNull g gVar) {
        ArrayList<String> arrayList = new ArrayList(f70090g);
        arrayList.removeAll(f70091h);
        for (String str : arrayList) {
            String strK = this.f70092a.k(str);
            String strK2 = gVar.f70092a.k(str);
            if (strK != null && !strK.equals(strK2)) {
                gVar.f70092a.h0(str, strK);
            }
        }
    }

    public void l() {
        int i11;
        switch (r()) {
            case 2:
                i11 = 1;
                break;
            case 3:
                i11 = 4;
                break;
            case 4:
                i11 = 3;
                break;
            case 5:
                i11 = 6;
                break;
            case 6:
                i11 = 5;
                break;
            case 7:
                i11 = 8;
                break;
            case 8:
                i11 = 7;
                break;
            default:
                i11 = 2;
                break;
        }
        this.f70092a.h0("Orientation", String.valueOf(i11));
    }

    public void m() {
        int i11;
        switch (r()) {
            case 2:
                i11 = 3;
                break;
            case 3:
                i11 = 2;
                break;
            case 4:
                i11 = 1;
                break;
            case 5:
                i11 = 8;
                break;
            case 6:
                i11 = 7;
                break;
            case 7:
                i11 = 6;
                break;
            case 8:
                i11 = 5;
                break;
            default:
                i11 = 4;
                break;
        }
        this.f70092a.h0("Orientation", String.valueOf(i11));
    }

    public String o() {
        return this.f70092a.k("ImageDescription");
    }

    public int p() {
        return this.f70092a.m("ImageLength", 0);
    }

    public Location q() {
        double dA;
        String strK = this.f70092a.k("GPSProcessingMethod");
        double[] dArrQ = this.f70092a.q();
        double dJ = this.f70092a.j(0.0d);
        double dL = this.f70092a.l("GPSSpeed", 0.0d);
        String strK2 = this.f70092a.k("GPSSpeedRef");
        if (strK2 == null) {
            strK2 = "K";
        }
        long jY = y(this.f70092a.k("GPSDateStamp"), this.f70092a.k("GPSTimeStamp"));
        if (dArrQ == null) {
            return null;
        }
        if (strK == null) {
            strK = f70086c;
        }
        Location location = new Location(strK);
        location.setLatitude(dArrQ[0]);
        location.setLongitude(dArrQ[1]);
        if (dJ != 0.0d) {
            location.setAltitude(dJ);
        }
        if (dL != 0.0d) {
            int iHashCode = strK2.hashCode();
            if (iHashCode != 75) {
                if (iHashCode != 77) {
                    if (iHashCode == 78 && strK2.equals(Gender.NONE)) {
                        dA = d.b(dL).a();
                    }
                } else if (strK2.equals(Gender.MALE)) {
                    dA = d.c(dL).a();
                }
                location.setSpeed((float) dA);
            } else {
                strK2.equals("K");
            }
            dA = d.a(dL).a();
            location.setSpeed((float) dA);
        }
        if (jY != -1) {
            location.setTime(jY);
        }
        return location;
    }

    public int r() {
        return this.f70092a.m("Orientation", 0);
    }

    public int s() {
        switch (r()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
            case 6:
            case 7:
                return 90;
            case 8:
                return EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
            default:
                return 0;
        }
    }

    public long t() {
        long jX = x(this.f70092a.k("DateTimeOriginal"));
        if (jX == -1) {
            return -1L;
        }
        String strK = this.f70092a.k("SubSecTimeOriginal");
        if (strK == null) {
            return jX;
        }
        try {
            long j11 = Long.parseLong(strK);
            while (j11 > 1000) {
                j11 /= 10;
            }
            return jX + j11;
        } catch (NumberFormatException unused) {
            return jX;
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(u()), Integer.valueOf(p()), Integer.valueOf(s()), Boolean.valueOf(w()), Boolean.valueOf(v()), q(), Long.valueOf(t()), o());
    }

    public int u() {
        return this.f70092a.m("ImageWidth", 0);
    }

    public boolean v() {
        return r() == 2;
    }

    public boolean w() {
        int iR = r();
        return iR == 4 || iR == 5 || iR == 7;
    }

    public void z(int i11) {
        if (i11 % 90 != 0) {
            y0.l(f70086c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i11)));
            this.f70092a.h0("Orientation", String.valueOf(0));
            return;
        }
        int i12 = i11 % 360;
        int iR = r();
        while (i12 < 0) {
            i12 += 90;
            switch (iR) {
                case 2:
                    iR = 5;
                    break;
                case 3:
                case 8:
                    iR = 6;
                    break;
                case 4:
                    iR = 7;
                    break;
                case 5:
                    iR = 4;
                    break;
                case 6:
                    iR = 1;
                    break;
                case 7:
                    iR = 2;
                    break;
                default:
                    iR = 8;
                    break;
            }
        }
        while (i12 > 0) {
            i12 -= 90;
            switch (iR) {
                case 2:
                    iR = 7;
                    break;
                case 3:
                    iR = 8;
                    break;
                case 4:
                    iR = 5;
                    break;
                case 5:
                    iR = 2;
                    break;
                case 6:
                    iR = 3;
                    break;
                case 7:
                    iR = 4;
                    break;
                case 8:
                    iR = 1;
                    break;
                default:
                    iR = 6;
                    break;
            }
        }
        this.f70092a.h0("Orientation", String.valueOf(iR));
    }
}
