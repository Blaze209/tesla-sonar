package com.fourthline.vision.internal;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public interface X5 {
    boolean isOperational();

    void release();

    boolean setup(MediaFormat mediaFormat);

    void write(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);
}
