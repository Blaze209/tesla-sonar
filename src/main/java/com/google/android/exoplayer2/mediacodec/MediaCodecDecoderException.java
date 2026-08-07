package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.google.android.exoplayer2.decoder.DecoderException;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class MediaCodecDecoderException extends DecoderException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f40137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40138b;

    public MediaCodecDecoderException(Throwable th2, k kVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoder failed: ");
        sb2.append(kVar == null ? null : kVar.f40253a);
        super(sb2.toString(), th2);
        this.f40137a = kVar;
        this.f40138b = p0.f115040a >= 21 ? a(th2) : null;
    }

    private static String a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }
}
