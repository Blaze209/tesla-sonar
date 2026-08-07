package h1;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import androidx.annotation.NonNull;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import g1.m;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final LruCache<String, MediaCodecInfo> f70158a = new LruCache<>(10);

    @NonNull
    public static MediaCodec a(@NonNull m mVar) {
        return b(mVar.getMimeType());
    }

    @NonNull
    private static MediaCodec b(@NonNull String str) throws InvalidConfigException {
        try {
            return MediaCodec.createEncoderByType(str);
        } catch (IOException | IllegalArgumentException e11) {
            throw new InvalidConfigException(e11);
        }
    }

    @NonNull
    public static MediaCodecInfo c(@NonNull m mVar) throws Throwable {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodecB;
        String mimeType = mVar.getMimeType();
        LruCache<String, MediaCodecInfo> lruCache = f70158a;
        synchronized (lruCache) {
            mediaCodecInfo = lruCache.get(mimeType);
        }
        if (mediaCodecInfo != null) {
            return mediaCodecInfo;
        }
        try {
            mediaCodecB = b(mimeType);
            try {
                MediaCodecInfo codecInfo = mediaCodecB.getCodecInfo();
                synchronized (lruCache) {
                    lruCache.put(mimeType, codecInfo);
                }
                mediaCodecB.release();
                return codecInfo;
            } catch (Throwable th2) {
                th = th2;
                if (mediaCodecB != null) {
                    mediaCodecB.release();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            mediaCodecB = null;
        }
    }
}
