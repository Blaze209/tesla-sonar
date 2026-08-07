package com.fourthline.vision.internal;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class Y5 implements X5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaMuxer f38105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38107c;

    public Y5(File outputFile) {
        p013kotlin.jvm.internal.s.k(outputFile, "outputFile");
        this.f38105a = new MediaMuxer(outputFile.getAbsolutePath(), 0);
        this.f38106b = -1;
    }

    @Override // com.fourthline.vision.internal.X5
    public boolean isOperational() {
        return this.f38107c;
    }

    @Override // com.fourthline.vision.internal.X5
    public void release() {
        try {
            this.f38105a.stop();
            this.f38105a.release();
        } catch (IllegalStateException unused) {
        }
        this.f38107c = false;
    }

    @Override // com.fourthline.vision.internal.X5
    public boolean setup(MediaFormat format) {
        boolean z11;
        p013kotlin.jvm.internal.s.k(format, "format");
        try {
            this.f38106b = this.f38105a.addTrack(format);
            this.f38105a.start();
            z11 = true;
        } catch (IllegalStateException unused) {
            z11 = false;
        }
        this.f38107c = z11;
        return isOperational();
    }

    @Override // com.fourthline.vision.internal.X5
    public void write(ByteBuffer buffer, MediaCodec.BufferInfo bufferInfo) {
        p013kotlin.jvm.internal.s.k(buffer, "buffer");
        p013kotlin.jvm.internal.s.k(bufferInfo, "bufferInfo");
        if (isOperational()) {
            this.f38105a.writeSampleData(this.f38106b, buffer, bufferInfo);
        }
    }
}
