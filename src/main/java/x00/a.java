package x00;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.reactnativecompressor.CompressorModule;
import java.io.File;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import y00.d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0019\u0010)\u001a\u00020\u001d2\n\u0010(\u001a\u00060&j\u0002`'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\"¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lx00/a;", "", "<init>", "()V", "Landroid/media/MediaFormat;", "format", "", "e", "(Landroid/media/MediaFormat;)I", "f", "c", "(Landroid/media/MediaFormat;)Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "b", "Landroid/media/MediaMetadataRetriever;", "mediaMetadataRetriever", "", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/media/MediaMetadataRetriever;)D", "h", "rotation", "Ljava/io/File;", "cacheFile", "Ly00/d;", "l", "(ILjava/io/File;)Ly00/d;", "inputFormat", "outputFormat", "newBitrate", "Ljn0/h0;", "k", "(Landroid/media/MediaFormat;Landroid/media/MediaFormat;I)V", "Landroid/media/MediaExtractor;", "extractor", "", "isVideo", "a", "(Landroid/media/MediaExtractor;Z)I", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "j", "(Ljava/lang/Exception;)V", "g", "()Z", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f122514a = new a();

    private a() {
    }

    private final Integer b(MediaFormat format) {
        if (format.containsKey("color-range")) {
            return Integer.valueOf(format.getInteger("color-range"));
        }
        return null;
    }

    private final Integer c(MediaFormat format) {
        if (format.containsKey("color-standard")) {
            return Integer.valueOf(format.getInteger("color-standard"));
        }
        return null;
    }

    private final Integer d(MediaFormat format) {
        if (format.containsKey("color-transfer")) {
            return Integer.valueOf(format.getInteger("color-transfer"));
        }
        return null;
    }

    private final int e(MediaFormat format) {
        if (format.containsKey("frame-rate")) {
            return format.getInteger("frame-rate");
        }
        return 30;
    }

    private final int f(MediaFormat format) {
        if (format.containsKey("i-frame-interval")) {
            return format.getInteger("i-frame-interval");
        }
        return 1;
    }

    public final int a(MediaExtractor extractor, boolean isVideo) {
        Boolean boolValueOf;
        s.k(extractor, "extractor");
        int trackCount = extractor.getTrackCount();
        for (int i11 = 0; i11 < trackCount; i11++) {
            MediaFormat trackFormat = extractor.getTrackFormat(i11);
            s.j(trackFormat, "getTrackFormat(...)");
            String string = trackFormat.getString("mime");
            if (isVideo) {
                boolValueOf = string != null ? Boolean.valueOf(t.b0(string, "video/", false, 2, null)) : null;
                s.h(boolValueOf);
                if (boolValueOf.booleanValue()) {
                    return i11;
                }
            } else {
                boolValueOf = string != null ? Boolean.valueOf(t.b0(string, "audio/", false, 2, null)) : null;
                s.h(boolValueOf);
                if (boolValueOf.booleanValue()) {
                    return i11;
                }
            }
        }
        return -5;
    }

    public final boolean g() {
        Iterator itA = p013kotlin.jvm.internal.c.a(new MediaCodecList(0).getCodecInfos());
        while (itA.hasNext()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) itA.next();
            Log.i("CODECS: ", mediaCodecInfo.getName());
            String name = mediaCodecInfo.getName();
            s.j(name, "getName(...)");
            if (t.h0(name, "qti.avc", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public final double h(MediaMetadataRetriever mediaMetadataRetriever) {
        s.k(mediaMetadataRetriever, "mediaMetadataRetriever");
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(19);
        if (strExtractMetadata == null || strExtractMetadata.length() == 0) {
            return 640.0d;
        }
        return Double.parseDouble(strExtractMetadata);
    }

    public final double i(MediaMetadataRetriever mediaMetadataRetriever) {
        s.k(mediaMetadataRetriever, "mediaMetadataRetriever");
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
        if (strExtractMetadata == null || strExtractMetadata.length() == 0) {
            return 368.0d;
        }
        return Double.parseDouble(strExtractMetadata);
    }

    public final void j(Exception exception) {
        s.k(exception, "exception");
        String localizedMessage = exception.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "An error has occurred!";
        }
        Log.e(CompressorModule.NAME, localizedMessage, exception);
    }

    public final void k(MediaFormat inputFormat, MediaFormat outputFormat, int newBitrate) {
        s.k(inputFormat, "inputFormat");
        s.k(outputFormat, "outputFormat");
        int iE = e(inputFormat);
        int iF = f(inputFormat);
        outputFormat.setInteger("color-format", 2130708361);
        outputFormat.setInteger("frame-rate", iE);
        outputFormat.setInteger("i-frame-interval", iF);
        outputFormat.setInteger("bitrate", newBitrate);
        outputFormat.setInteger("bitrate-mode", 2);
        a aVar = f122514a;
        Integer numC = aVar.c(inputFormat);
        if (numC != null) {
            outputFormat.setInteger("color-standard", numC.intValue());
        }
        Integer numD = aVar.d(inputFormat);
        if (numD != null) {
            outputFormat.setInteger("color-transfer", numD.intValue());
        }
        Integer numB = aVar.b(inputFormat);
        if (numB != null) {
            outputFormat.setInteger("color-range", numB.intValue());
        }
        Log.i("Output file parameters", "videoFormat: " + outputFormat);
    }

    public final d l(int rotation, File cacheFile) {
        s.k(cacheFile, "cacheFile");
        d dVar = new d();
        dVar.f(cacheFile);
        dVar.g(rotation);
        return dVar;
    }
}
