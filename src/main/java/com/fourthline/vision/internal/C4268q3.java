package com.fourthline.vision.internal;

import android.media.MediaCodec;
import android.view.Surface;
import java.io.File;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.vision.internal.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4268q3 extends AbstractRunnableC4219j3 implements F2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC4306w0 f38775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private RunnableC4181e4 f38776m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Surface f38777n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4268q3(File outputFile, AbstractRunnableC4219j3.a listener, InterfaceC4306w0 mediaCodecDataSource) {
        super(outputFile, listener);
        p013kotlin.jvm.internal.s.k(outputFile, "outputFile");
        p013kotlin.jvm.internal.s.k(listener, "listener");
        p013kotlin.jvm.internal.s.k(mediaCodecDataSource, "mediaCodecDataSource");
        this.f38775l = mediaCodecDataSource;
        this.f38776m = RunnableC4181e4.f38279k.createHandler();
    }

    @Override // com.fourthline.vision.internal.F2
    public void frameAvailableSoon(int i11, float[] textureMatrix, float[] transformMatrix) {
        RunnableC4181e4 runnableC4181e4;
        p013kotlin.jvm.internal.s.k(textureMatrix, "textureMatrix");
        p013kotlin.jvm.internal.s.k(transformMatrix, "transformMatrix");
        if (!super.frameAvailableSoon() || (runnableC4181e4 = this.f38776m) == null) {
            return;
        }
        runnableC4181e4.draw(i11, textureMatrix, transformMatrix);
    }

    public final void prepare() {
        this.f38446e = false;
        this.f38447f = false;
        Pair pair = (Pair) this.f38775l.get();
        MediaCodec mediaCodec = (MediaCodec) pair.a();
        Surface surface = (Surface) pair.b();
        this.f38448g = mediaCodec;
        this.f38777n = surface;
    }

    @Override // com.fourthline.vision.internal.AbstractRunnableC4219j3
    protected void release() {
        Surface surface = this.f38777n;
        if (surface != null) {
            surface.release();
        }
        this.f38777n = null;
        RunnableC4181e4 runnableC4181e4 = this.f38776m;
        if (runnableC4181e4 != null) {
            runnableC4181e4.release();
        }
        this.f38776m = null;
        super.release();
    }

    public final void setEglContext() {
        RunnableC4181e4 runnableC4181e4 = this.f38776m;
        if (runnableC4181e4 != null) {
            Surface surface = this.f38777n;
            p013kotlin.jvm.internal.s.h(surface);
            runnableC4181e4.setEglContext(surface);
        }
    }

    @Override // com.fourthline.vision.internal.AbstractRunnableC4219j3
    protected void signalEndOfInputStream() {
        this.f38448g.signalEndOfInputStream();
        this.f38446e = true;
    }

    @Override // com.fourthline.vision.internal.AbstractRunnableC4219j3
    public boolean frameAvailableSoon() {
        RunnableC4181e4 runnableC4181e4;
        boolean zFrameAvailableSoon = super.frameAvailableSoon();
        if (zFrameAvailableSoon && (runnableC4181e4 = this.f38776m) != null) {
            RunnableC4181e4.draw$default(runnableC4181e4, 0, null, null, 7, null);
        }
        return zFrameAvailableSoon;
    }
}
