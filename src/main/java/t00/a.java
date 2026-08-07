package t00;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.File;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import s00.q;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0012\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lt00/a;", "", "<init>", "()V", "", "f", "", "b", "(F)I", "", "fileUrl", "Lt00/c;", "options", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Ljn0/h0;", "a", "(Ljava/lang/String;Lt00/c;Lcom/facebook/react/bridge/Promise;Lcom/facebook/react/bridge/ReactApplicationContext;)V", "originalHeight", "originalWidth", "originalBitrate", Snapshot.HEIGHT, Snapshot.WIDTH, "c", "(IIIII)I", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f112008a = new a();

    private a() {
    }

    private final int b(float f11) {
        return (int) (f11 * 2000.0f * 1000.0f * 1.13f);
    }

    public final void a(String fileUrl, c options, Promise promise, ReactApplicationContext reactContext) {
        s.k(options, "options");
        s.k(promise, "promise");
        float fO = options.getMaxSize();
        float fP = options.getMinimumFileSizeForCompress();
        try {
            String path = Uri.parse(fileUrl).getPath();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(path);
            if (new File(path).length() / PKIFailureInfo.badCertTemplate <= fP) {
                promise.resolve(fileUrl);
                return;
            }
            s.h(reactContext);
            String strC = q.c("mp4", reactContext);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(19);
            s.h(strExtractMetadata);
            int i11 = Integer.parseInt(strExtractMetadata);
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
            s.h(strExtractMetadata2);
            int i12 = Integer.parseInt(strExtractMetadata2);
            String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(20);
            s.h(strExtractMetadata3);
            int i13 = Integer.parseInt(strExtractMetadata3);
            float f11 = fO / (i12 > i11 ? i12 : i11);
            float f12 = 2;
            int iRound = Math.round((i12 * Math.min(f11, 1.0f)) / f12) * 2;
            int iRound2 = Math.round((i11 * Math.min(f11, 1.0f)) / f12) * 2;
            float fC = c(i11, i12, i13, iRound2, iRound);
            s.h(path);
            String strR = options.getUuid();
            s.h(strR);
            Integer numQ = options.getProgressDivider();
            s.h(numQ);
            q.b(path, strC, iRound, iRound2, fC, strR, numQ.intValue(), promise, reactContext);
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    public final int c(int originalHeight, int originalWidth, int originalBitrate, int height, int width) {
        int iMin = (int) (((int) (originalBitrate / Math.min(originalHeight / height, originalWidth / width))) * 0.8f);
        int iB = (int) (b(0.8f) / (921600.0f / (width * height)));
        if (originalBitrate < iB) {
            return iMin;
        }
        if (iMin > 1669000) {
            return 1669000;
        }
        return Math.max(iMin, iB);
    }
}
