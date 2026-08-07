package org.webrtc;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class EncodedImage implements RefCounted {
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameType frameType;

    /* JADX INFO: renamed from: qp, reason: collision with root package name */
    public final Integer f99874qp;
    private final RefCountDelegate refCountDelegate;
    public final int rotation;

    public static class Builder {
        private ByteBuffer buffer;
        private long captureTimeNs;
        private int encodedHeight;
        private int encodedWidth;
        private FrameType frameType;

        /* JADX INFO: renamed from: qp, reason: collision with root package name */
        private Integer f99875qp;
        private Runnable releaseCallback;
        private int rotation;

        public EncodedImage createEncodedImage() {
            return new EncodedImage(this.buffer, this.releaseCallback, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.f99875qp);
        }

        public Builder setBuffer(ByteBuffer byteBuffer, Runnable runnable) {
            this.buffer = byteBuffer;
            this.releaseCallback = runnable;
            return this;
        }

        @Deprecated
        public Builder setCaptureTimeMs(long j11) {
            this.captureTimeNs = TimeUnit.MILLISECONDS.toNanos(j11);
            return this;
        }

        public Builder setCaptureTimeNs(long j11) {
            this.captureTimeNs = j11;
            return this;
        }

        public Builder setEncodedHeight(int i11) {
            this.encodedHeight = i11;
            return this;
        }

        public Builder setEncodedWidth(int i11) {
            this.encodedWidth = i11;
            return this;
        }

        public Builder setFrameType(FrameType frameType) {
            this.frameType = frameType;
            return this;
        }

        public Builder setQp(Integer num) {
            this.f99875qp = num;
            return this;
        }

        public Builder setRotation(int i11) {
            this.rotation = i11;
            return this;
        }

        private Builder() {
        }
    }

    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);

        private final int nativeIndex;

        FrameType(int i11) {
            this.nativeIndex = i11;
        }

        @CalledByNative("FrameType")
        static FrameType fromNativeIndex(int i11) {
            for (FrameType frameType : values()) {
                if (frameType.getNative() == i11) {
                    return frameType;
                }
            }
            throw new IllegalArgumentException("Unknown native frame type: " + i11);
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @CalledByNative
    private ByteBuffer getBuffer() {
        return this.buffer;
    }

    @CalledByNative
    private long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    @CalledByNative
    private int getEncodedHeight() {
        return this.encodedHeight;
    }

    @CalledByNative
    private int getEncodedWidth() {
        return this.encodedWidth;
    }

    @CalledByNative
    private int getFrameType() {
        return this.frameType.getNative();
    }

    @CalledByNative
    private Integer getQp() {
        return this.f99874qp;
    }

    @CalledByNative
    private int getRotation() {
        return this.rotation;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @CalledByNative
    private EncodedImage(ByteBuffer byteBuffer, Runnable runnable, int i11, int i12, long j11, FrameType frameType, int i13, Integer num) {
        this.buffer = byteBuffer;
        this.encodedWidth = i11;
        this.encodedHeight = i12;
        this.captureTimeMs = TimeUnit.NANOSECONDS.toMillis(j11);
        this.captureTimeNs = j11;
        this.frameType = frameType;
        this.rotation = i13;
        this.f99874qp = num;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }
}
