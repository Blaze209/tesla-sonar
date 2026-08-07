package com.google.android.exoplayer2.video;

import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.k;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f41140d;

    public MediaCodecVideoDecoderException(Throwable th2, k kVar, Surface surface) {
        super(th2, kVar);
        this.f41139c = System.identityHashCode(surface);
        this.f41140d = surface == null || surface.isValid();
    }
}
