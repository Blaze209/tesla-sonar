package s00;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJW\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u001d\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u001c\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J%\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b&\u0010'J\u001d\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b-\u0010.J'\u00103\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\f2\b\b\u0002\u00102\u001a\u00020\f¢\u0006\u0004\b3\u00104R0\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u000106058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Ls00/q;", "", "<init>", "()V", "", "extension", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "c", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/String;", "srcPath", "destinationPath", "", "resultWidth", "resultHeight", "", "videoBitRate", "uuid", "progressDivider", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "b", "(Ljava/lang/String;Ljava/lang/String;IIFLjava/lang/String;ILcom/facebook/react/bridge/Promise;Lcom/facebook/react/bridge/ReactApplicationContext;)V", "urlString", "g", "(Ljava/lang/String;)I", "fileUrl", "", "args", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;[Ljava/lang/Object;)Ljava/lang/String;", "a", "(Ljava/lang/String;)V", "filePath", "f", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;Lcom/facebook/react/bridge/ReactApplicationContext;)V", "path", "j", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/net/Uri;", "uri", "Landroid/content/ContentResolver;", "contentResolver", "", "h", "(Landroid/net/Uri;Landroid/content/ContentResolver;)J", "Ljava/nio/ByteBuffer;", "buf", "start", "count", "k", "(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;", "", "Lu00/c;", "Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "setCompressorExports", "(Ljava/util/Map;)V", "compressorExports", "[Ljava/lang/String;", "e", "()[Ljava/lang/String;", "exifAttributes", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f109347a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static Map<String, u00.c> compressorExports = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final String[] exifAttributes = {"FNumber", "ApertureValue", "Artist", "BitsPerSample", "BrightnessValue", "CFAPattern", "ColorSpace", "ComponentsConfiguration", "CompressedBitsPerPixel", "Compression", "Contrast", "Copyright", "CustomRendered", "DateTime", "DateTimeDigitized", "DateTimeOriginal", "DefaultCropSize", "DeviceSettingDescription", "DigitalZoomRatio", "DNGVersion", "ExifVersion", "ExposureBiasValue", "ExposureIndex", "ExposureMode", "ExposureProgram", "ExposureTime", "FileSource", "Flash", "FlashpixVersion", "FlashEnergy", "FocalLength", "FocalLengthIn35mmFilm", "FocalPlaneResolutionUnit", "FocalPlaneXResolution", "FocalPlaneYResolution", "FNumber", "GainControl", "GPSAltitude", "GPSAltitudeRef", "GPSAreaInformation", "GPSDateStamp", "GPSDestBearing", "GPSDestBearingRef", "GPSDestDistance", "GPSDestDistanceRef", "GPSDestLatitude", "GPSDestLatitudeRef", "GPSDestLongitude", "GPSDestLongitudeRef", "GPSDifferential", "GPSDOP", "GPSImgDirection", "GPSImgDirectionRef", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSMapDatum", "GPSMeasureMode", "GPSProcessingMethod", "GPSSatellites", "GPSSpeed", "GPSSpeedRef", "GPSStatus", "GPSTimeStamp", "GPSTrack", "GPSTrackRef", "GPSVersionID", "ImageDescription", "ImageLength", "ImageUniqueID", "ImageWidth", "InteroperabilityIndex", "ISOSpeedRatings", "ISOSpeedRatings", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "LightSource", "Make", "MakerNote", "MaxApertureValue", "MeteringMode", "Model", "NewSubfileType", "OECF", "AspectFrame", "PreviewImageLength", "PreviewImageStart", "ThumbnailImage", "Orientation", "PhotometricInterpretation", "PixelXDimension", "PixelYDimension", "PlanarConfiguration", "PrimaryChromaticities", "ReferenceBlackWhite", "RelatedSoundFile", "ResolutionUnit", "RowsPerStrip", "ISO", "JpgFromRaw", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "SamplesPerPixel", "Saturation", "SceneCaptureType", "SceneType", "SensingMethod", "Sharpness", "ShutterSpeedValue", "Software", "SpatialFrequencyResponse", "SpectralSensitivity", "StripByteCounts", "StripOffsets", "SubfileType", "SubjectArea", "SubjectDistance", "SubjectDistanceRange", "SubjectLocation", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeDigitized", "SubSecTimeOriginal", "SubSecTimeOriginal", "ThumbnailImageLength", "ThumbnailImageWidth", "TransferFunction", "UserComment", "WhiteBalance", "WhitePoint", "XResolution", "YCbCrCoefficients", "YCbCrPositioning", "YCbCrSubSampling", "YResolution"};

    private q() {
    }

    public static final void b(String srcPath, String destinationPath, int resultWidth, int resultHeight, float videoBitRate, String uuid, int progressDivider, Promise promise, ReactApplicationContext reactContext) {
        s.k(srcPath, "srcPath");
        s.k(destinationPath, "destinationPath");
        s.k(uuid, "uuid");
        s.k(promise, "promise");
        s.k(reactContext, "reactContext");
        u00.c cVar = new u00.c(reactContext);
        compressorExports.put(uuid, cVar);
        cVar.e(srcPath, destinationPath, resultWidth, resultHeight, (int) videoBitRate, new a(progressDivider, new int[]{0}, uuid, destinationPath, promise));
    }

    public static final String c(String extension, ReactApplicationContext reactContext) {
        s.k(extension, "extension");
        s.k(reactContext, "reactContext");
        File cacheDir = reactContext.getCacheDir();
        t0 t0Var = t0.f86535a;
        String str = String.format("%s/%s." + extension, Arrays.copyOf(new Object[]{cacheDir.getPath(), UUID.randomUUID().toString()}, 2));
        s.j(str, "format(...)");
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    public static final int g(String urlString) throws Throwable {
        Throwable th2;
        HttpURLConnection httpURLConnection;
        IOException e11;
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(urlString).openConnection());
            s.i(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) uRLConnection;
            try {
                try {
                    httpURLConnection.setRequestMethod("HEAD");
                    httpURLConnection.getInputStream();
                    int contentLength = httpURLConnection.getContentLength();
                    httpURLConnection.disconnect();
                    return contentLength;
                } catch (IOException e12) {
                    e11 = e12;
                    throw new RuntimeException(e11);
                }
            } catch (Throwable th3) {
                th2 = th3;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th2;
            }
        } catch (IOException e13) {
            e11 = e13;
            httpURLConnection = null;
        } catch (Throwable th4) {
            th2 = th4;
            httpURLConnection = null;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th2;
        }
    }

    public static final String i(String fileUrl, ReactApplicationContext reactContext, Object... args) {
        s.k(reactContext, "reactContext");
        s.k(args, "args");
        s.h(fileUrl);
        int iIntValue = 0;
        if (t.b0(fileUrl, "content://", false, 2, null)) {
            try {
                Uri uri = Uri.parse(fileUrl);
                j jVar = j.f109326a;
                s.h(uri);
                fileUrl = jVar.e(reactContext, uri);
            } catch (Exception unused) {
                Log.d("react-native-compessor", " Please see this issue: https://github.com/numandev1/react-native-compressor/issues/25");
            }
        } else if (t.b0(fileUrl, "http://", false, 2, null) || t.b0(fileUrl, "https://", false, 2, null)) {
            String strValueOf = args.length > 0 ? String.valueOf(args[0]) : "";
            if (args.length > 1) {
                Object obj = args[1];
                s.i(obj, "null cannot be cast to non-null type kotlin.Int");
                iIntValue = ((Integer) obj).intValue();
            }
            fileUrl = e.INSTANCE.c(fileUrl, strValueOf, iIntValue, reactContext);
            Log.d("react-native-compessor", "getRealPath: " + fileUrl);
        }
        return f109347a.j(fileUrl);
    }

    public static /* synthetic */ ByteBuffer l(q qVar, ByteBuffer byteBuffer, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = byteBuffer.remaining() - i11;
        }
        return qVar.k(byteBuffer, i11, i12);
    }

    public final void a(String uuid) {
        s.k(uuid, "uuid");
        try {
            u00.c cVar = compressorExports.get(uuid);
            if (cVar != null) {
                cVar.c();
            }
            compressorExports.put(uuid, null);
        } catch (Exception unused) {
        }
    }

    public final Map<String, u00.c> d() {
        return compressorExports;
    }

    public final String[] e() {
        return exifAttributes;
    }

    public final void f(String filePath, Promise promise, ReactApplicationContext reactContext) {
        s.k(filePath, "filePath");
        s.k(promise, "promise");
        s.k(reactContext, "reactContext");
        if (t.b0(filePath, "http://", false, 2, null) || t.b0(filePath, "https://", false, 2, null)) {
            promise.resolve(Integer.valueOf(g(filePath)));
            return;
        }
        Uri uri = Uri.parse(i(filePath, reactContext, new Object[0]));
        ContentResolver contentResolver = reactContext.getContentResolver();
        s.h(uri);
        s.h(contentResolver);
        long jH = h(uri, contentResolver);
        if (jH >= 0) {
            promise.resolve(String.valueOf(jH));
        } else {
            promise.resolve("");
        }
    }

    public final long h(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        Cursor cursorQuery;
        s.k(uri, "uri");
        s.k(contentResolver, "contentResolver");
        try {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        } catch (FileNotFoundException unused) {
            assetFileDescriptorOpenAssetFileDescriptor = null;
        }
        long j11 = -1;
        long length = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.getLength() : -1L;
        if (length != -1) {
            return length;
        }
        if (s.f("content", uri.getScheme()) && (cursorQuery = contentResolver.query(uri, new String[]{"_size"}, null, null, null)) != null) {
            try {
                int columnIndex = cursorQuery.getColumnIndex("_size");
                if (columnIndex != -1 && cursorQuery.moveToFirst()) {
                    try {
                        j11 = cursorQuery.getLong(columnIndex);
                    } catch (Throwable unused2) {
                    }
                    cursorQuery.close();
                    return j11;
                }
            } finally {
                cursorQuery.close();
            }
        }
        return -1L;
    }

    public final String j(String path) {
        if (path == null) {
            return null;
        }
        if (t.b0(path, "file:///", false, 2, null)) {
            return path;
        }
        return t.b0(path, "/", false, 2, null) ? new p013kotlin.text.q("^/+").l(path, "file:///") : Pattern.compile("^file:/*").matcher(path).replaceAll("file:///");
    }

    public final ByteBuffer k(ByteBuffer buf, int start, int count) {
        s.k(buf, "buf");
        ByteBuffer byteBufferDuplicate = buf.duplicate();
        byte[] bArr = new byte[count];
        byteBufferDuplicate.position(start);
        byteBufferDuplicate.get(bArr, 0, count);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        s.j(byteBufferWrap, "wrap(...)");
        return byteBufferWrap;
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\n¨\u0006\u0015"}, d2 = {"s00/q$a", "Lu00/a;", "", "index", "", "percent", "Ljn0/h0;", "b", "(IF)V", "c", "(I)V", "", "size", "", "path", DateTokenConverter.CONVERTER_KEY, "(IJLjava/lang/String;)V", "failureMessage", "e", "(ILjava/lang/String;)V", "a", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements u00.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f109350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f109351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f109352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f109353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Promise f109354e;

        a(int i11, int[] iArr, String str, String str2, Promise promise) {
            this.f109350a = i11;
            this.f109351b = iArr;
            this.f109352c = str;
            this.f109353d = str2;
            this.f109354e = promise;
        }

        @Override // u00.a
        public void a(int index) {
            Log.wtf("TAG", "compression has been cancelled");
            this.f109354e.reject(new Throwable("compression has been cancelled"));
            this.f109351b[0] = 0;
        }

        @Override // u00.a
        public void b(int index, float percent) {
            if (percent <= 100.0f) {
                int iRound = Math.round(percent);
                int i11 = this.f109350a;
                if (i11 == 0 || (iRound % i11 == 0 && iRound > this.f109351b[0])) {
                    f.INSTANCE.d(percent / 100, this.f109352c);
                    this.f109351b[0] = iRound;
                }
            }
        }

        @Override // u00.a
        public void d(int index, long size, String path) {
            String str = "file://" + this.f109353d;
            this.f109354e.resolve(str);
            i.c(str);
            this.f109351b[0] = 0;
            q.f109347a.d().put(this.f109352c, null);
        }

        @Override // u00.a
        public void e(int index, String failureMessage) {
            s.k(failureMessage, "failureMessage");
            Log.wtf("failureMessage", failureMessage);
            this.f109354e.reject(new Throwable(failureMessage));
            this.f109351b[0] = 0;
        }

        @Override // u00.a
        public void c(int index) {
        }
    }
}
