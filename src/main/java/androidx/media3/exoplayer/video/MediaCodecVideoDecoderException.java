package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;

/* JADX INFO: loaded from: classes3.dex */
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11180e;

    public MediaCodecVideoDecoderException(Throwable th2, androidx.media3.exoplayer.mediacodec.j jVar, Surface surface) {
        super(th2, jVar);
        this.f11179d = System.identityHashCode(surface);
        this.f11180e = surface == null || surface.isValid();
    }
}
