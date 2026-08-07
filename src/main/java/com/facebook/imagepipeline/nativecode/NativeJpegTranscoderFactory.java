package com.facebook.imagepipeline.nativecode;

/* JADX INFO: loaded from: classes3.dex */
@pk.d
public class NativeJpegTranscoderFactory implements cn.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21726c;

    @pk.d
    public NativeJpegTranscoderFactory(int i11, boolean z11, boolean z12) {
        this.f21724a = i11;
        this.f21725b = z11;
        this.f21726c = z12;
    }

    @Override // cn.d
    @pk.d
    public cn.c createImageTranscoder(gm.c cVar, boolean z11) {
        if (cVar != gm.b.JPEG) {
            return null;
        }
        return new NativeJpegTranscoder(z11, this.f21724a, this.f21725b, this.f21726c);
    }
}
