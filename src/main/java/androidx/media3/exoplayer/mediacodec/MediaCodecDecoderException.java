package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;

/* JADX INFO: loaded from: classes3.dex */
public class MediaCodecDecoderException extends DecoderException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f10443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10445c;

    public MediaCodecDecoderException(Throwable th2, j jVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoder failed: ");
        sb2.append(jVar == null ? null : jVar.f10555a);
        super(sb2.toString(), th2);
        this.f10443a = jVar;
        this.f10444b = th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null;
        this.f10445c = a(th2);
    }

    private static int a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getErrorCode();
        }
        return 0;
    }
}
