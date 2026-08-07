package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes10.dex */
class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String TAG = "AndroidVideoDecoder";
    private VideoDecoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private int colorFormat;
    private ThreadUtils.ThreadChecker decoderThreadChecker;
    private final BlockingDeque<FrameInfo> frameInfos;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean keyFrameRequired;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    private ThreadUtils.ThreadChecker outputThreadChecker;
    private DecodedTextureMetadata renderedTextureMetadata;
    private volatile boolean running;
    private final EglBase.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private Surface surface;
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;
    private final Object dimensionLock = new Object();
    private final Object renderedTextureMetadataLock = new Object();

    private static class DecodedTextureMetadata {
        final Integer decodeTimeMs;
        final long presentationTimestampUs;

        DecodedTextureMetadata(long j11, Integer num) {
            this.presentationTimestampUs = j11;
            this.decodeTimeMs = num;
        }
    }

    private static class FrameInfo {
        final long decodeStartTimeMs;
        final int rotation;

        FrameInfo(long j11, int i11) {
            this.decodeStartTimeMs = j11;
            this.rotation = i11;
        }
    }

    AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, int i11, EglBase.Context context) {
        if (!isSupportedColorFormat(i11)) {
            throw new IllegalArgumentException("Unsupported color format: " + i11);
        }
        Logging.d(TAG, "ctor name: " + str + " type: " + videoCodecMimeType + " color format: " + i11 + " context: " + context);
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecMimeType;
        this.colorFormat = i11;
        this.sharedContext = context;
        this.frameInfos = new LinkedBlockingDeque();
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14) {
        if (i11 % 2 != 0) {
            throw new AssertionError("Stride is not divisible by two: " + i11);
        }
        int i15 = (i13 + 1) / 2;
        int i16 = i12 % 2;
        int i17 = i16 == 0 ? (i14 + 1) / 2 : i14 / 2;
        int i18 = i11 / 2;
        int i19 = i11 * i12;
        int i21 = i18 * i17;
        int i22 = i19 + ((i18 * i12) / 2);
        int i23 = i22 + i21;
        VideoFrame.I420Buffer i420BufferAllocateI420Buffer = allocateI420Buffer(i13, i14);
        copyPlane(byteBuffer.slice(), i11, i420BufferAllocateI420Buffer.getDataY(), i420BufferAllocateI420Buffer.getStrideY(), i13, i14);
        copyPlane(byteBuffer.slice(), i18, i420BufferAllocateI420Buffer.getDataU(), i420BufferAllocateI420Buffer.getStrideU(), i15, i17);
        if (i16 == 1) {
            ByteBuffer dataU = i420BufferAllocateI420Buffer.getDataU();
            dataU.put(byteBuffer);
        }
        copyPlane(byteBuffer.slice(), i18, i420BufferAllocateI420Buffer.getDataV(), i420BufferAllocateI420Buffer.getStrideV(), i15, i17);
        if (i16 == 1) {
            ByteBuffer dataV = i420BufferAllocateI420Buffer.getDataV();
            dataV.put(byteBuffer);
        }
        return i420BufferAllocateI420Buffer;
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14) {
        return new NV12Buffer(i13, i14, i11, i12, byteBuffer, null).toI420();
    }

    private Thread createOutputThread() {
        return new Thread("AndroidVideoDecoder.outputThread") { // from class: org.webrtc.AndroidVideoDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws Throwable {
                AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                while (AndroidVideoDecoder.this.running) {
                    AndroidVideoDecoder.this.deliverDecodedFrame();
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x008d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void deliverByteFrame(int r9, android.media.MediaCodec.BufferInfo r10, int r11, java.lang.Integer r12) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r1 = r8.dimensionLock
            monitor-enter(r1)
            int r6 = r8.width     // Catch: java.lang.Throwable -> L88
            int r7 = r8.height     // Catch: java.lang.Throwable -> L88
            int r0 = r8.stride     // Catch: java.lang.Throwable -> L88
            int r5 = r8.sliceHeight     // Catch: java.lang.Throwable -> L88
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L88
            int r1 = r10.size
            int r2 = r6 * r7
            int r2 = r2 * 3
            int r2 = r2 / 2
            if (r1 >= r2) goto L2d
            java.lang.String r9 = "AndroidVideoDecoder"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Insufficient output buffer size: "
            r10.append(r11)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            org.webrtc.Logging.e(r9, r10)
            return
        L2d:
            int r2 = r0 * r7
            int r2 = r2 * 3
            int r2 = r2 / 2
            if (r1 >= r2) goto L3f
            if (r5 != r7) goto L3f
            if (r0 <= r6) goto L3f
            int r1 = r1 * 2
            int r0 = r7 * 3
            int r0 = r1 / r0
        L3f:
            r4 = r0
            org.webrtc.MediaCodecWrapper r0 = r8.codec
            java.nio.ByteBuffer r0 = r0.getOutputBuffer(r9)
            int r1 = r10.offset
            java.nio.Buffer r1 = r0.position(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r10.offset
            int r2 = r10.size
            int r1 = r1 + r2
            java.nio.Buffer r1 = r0.limit(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            java.nio.ByteBuffer r3 = r0.slice()
            int r0 = r8.colorFormat
            r1 = 19
            if (r0 != r1) goto L69
            r2 = r8
            org.webrtc.VideoFrame$Buffer r0 = r2.copyI420Buffer(r3, r4, r5, r6, r7)
            goto L6e
        L69:
            r2 = r8
            org.webrtc.VideoFrame$Buffer r0 = r2.copyNV12ToI420Buffer(r3, r4, r5, r6, r7)
        L6e:
            org.webrtc.MediaCodecWrapper r1 = r2.codec
            r3 = 0
            r1.releaseOutputBuffer(r9, r3)
            long r9 = r10.presentationTimeUs
            r3 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r3
            org.webrtc.VideoFrame r1 = new org.webrtc.VideoFrame
            r1.<init>(r0, r11, r9)
            org.webrtc.VideoDecoder$Callback r9 = r2.callback
            r10 = 0
            r9.onDecodedFrame(r1, r12, r10)
            r1.release()
            return
        L88:
            r0 = move-exception
            r2 = r8
        L8a:
            r9 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8d
            throw r9
        L8d:
            r0 = move-exception
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.AndroidVideoDecoder.deliverByteFrame(int, android.media.MediaCodec$BufferInfo, int, java.lang.Integer):void");
    }

    private void deliverTextureFrame(int i11, MediaCodec.BufferInfo bufferInfo, int i12, Integer num) {
        int i13;
        int i14;
        synchronized (this.dimensionLock) {
            i13 = this.width;
            i14 = this.height;
        }
        synchronized (this.renderedTextureMetadataLock) {
            try {
                if (this.renderedTextureMetadata != null) {
                    this.codec.releaseOutputBuffer(i11, false);
                    return;
                }
                this.surfaceTextureHelper.setTextureSize(i13, i14);
                this.surfaceTextureHelper.setFrameRotation(i12);
                this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
                this.codec.releaseOutputBuffer(i11, true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private VideoCodecStatus initDecodeInternal(int i11, int i12) {
        this.decoderThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "initDecodeInternal name: " + this.codecName + " type: " + this.codecType + " width: " + i11 + " height: " + i12 + " color format: " + this.colorFormat);
        if (this.outputThread != null) {
            Logging.e(TAG, "initDecodeInternal called while the codec is already running");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i11;
        this.height = i12;
        this.stride = i11;
        this.sliceHeight = i12;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i11, i12);
                if (this.sharedContext == null) {
                    mediaFormatCreateVideoFormat.setInteger("color-format", this.colorFormat);
                }
                this.codec.configure(mediaFormatCreateVideoFormat, this.surface, null, 0);
                this.codec.start();
                this.running = true;
                Thread threadCreateOutputThread = createOutputThread();
                this.outputThread = threadCreateOutputThread;
                threadCreateOutputThread.start();
                Logging.d(TAG, "initDecodeInternal done");
                return VideoCodecStatus.OK;
            } catch (IllegalArgumentException e11) {
                e = e11;
                Logging.e(TAG, "initDecode failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            } catch (IllegalStateException e12) {
                e = e12;
                Logging.e(TAG, "initDecode failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
            Logging.e(TAG, "Cannot create media decoder " + this.codecName);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private boolean isSupportedColorFormat(int i11) {
        for (int i12 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    private void reformat(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Decoder format changed: " + mediaFormat);
        if (mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            integer = (mediaFormat.getInteger("crop-right") + 1) - mediaFormat.getInteger("crop-left");
            integer2 = (mediaFormat.getInteger("crop-bottom") + 1) - mediaFormat.getInteger("crop-top");
        } else {
            integer = mediaFormat.getInteger(Snapshot.WIDTH);
            integer2 = mediaFormat.getInteger(Snapshot.HEIGHT);
        }
        synchronized (this.dimensionLock) {
            try {
                int i11 = this.width;
                if (integer != i11 || integer2 != this.height) {
                    if (this.hasDecodedFirstFrame) {
                        stopOnOutputThread(new RuntimeException("Unexpected size change. Configured " + this.width + Marker.ANY_MARKER + this.height + ". New " + integer + Marker.ANY_MARKER + integer2));
                        return;
                    }
                    if (integer > 0 && integer2 > 0) {
                        this.width = integer;
                        this.height = integer2;
                    }
                    Logging.w(TAG, "Unexpected format dimensions. Configured " + i11 + Marker.ANY_MARKER + this.height + ". New " + integer + Marker.ANY_MARKER + integer2 + ". Skip it");
                    return;
                }
                if (this.surfaceTextureHelper == null && mediaFormat.containsKey("color-format")) {
                    int integer3 = mediaFormat.getInteger("color-format");
                    this.colorFormat = integer3;
                    Logging.d(TAG, "Color: 0x" + Integer.toHexString(integer3));
                    if (!isSupportedColorFormat(this.colorFormat)) {
                        stopOnOutputThread(new IllegalStateException("Unsupported color format: " + this.colorFormat));
                        return;
                    }
                }
                synchronized (this.dimensionLock) {
                    try {
                        if (mediaFormat.containsKey("stride")) {
                            this.stride = mediaFormat.getInteger("stride");
                        }
                        if (mediaFormat.containsKey("slice-height")) {
                            this.sliceHeight = mediaFormat.getInteger("slice-height");
                        }
                        Logging.d(TAG, "Frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
                        this.stride = Math.max(this.width, this.stride);
                        this.sliceHeight = Math.max(this.height, this.sliceHeight);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private VideoCodecStatus reinitDecode(int i11, int i12) {
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoCodecStatus videoCodecStatusReleaseInternal = releaseInternal();
        return videoCodecStatusReleaseInternal != VideoCodecStatus.OK ? videoCodecStatusReleaseInternal : initDecodeInternal(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e11) {
            Logging.e(TAG, "Media decoder stop failed", e11);
        }
        try {
            this.codec.release();
        } catch (Exception e12) {
            Logging.e(TAG, "Media decoder release failed", e12);
            this.shutdownException = e12;
        }
        Logging.d(TAG, "Release on output thread done");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            Logging.d(TAG, "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, DeviceOrientationRequest.OUTPUT_PERIOD_FAST)) {
                Logging.e(TAG, "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            }
            if (this.shutdownException == null) {
                Object[] objArr = objArr == true ? 1 : 0;
                return VideoCodecStatus.OK;
            }
            Logging.e(TAG, "Media decoder release error", new RuntimeException(this.shutdownException));
            this.shutdownException = null;
            return VideoCodecStatus.ERROR;
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    protected VideoFrame.I420Buffer allocateI420Buffer(int i11, int i12) {
        return JavaI420Buffer.allocate(i11, i12);
    }

    protected void copyPlane(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14) {
        YuvHelper.copyPlane(byteBuffer, i11, byteBuffer2, i12, i13, i14);
    }

    protected SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        int i11;
        int i12;
        VideoCodecStatus videoCodecStatusReinitDecode;
        this.decoderThreadChecker.checkIsOnValidThread();
        MediaCodecWrapper mediaCodecWrapper = this.codec;
        if (mediaCodecWrapper == null || this.callback == null) {
            boolean z11 = mediaCodecWrapper != null;
            Logging.d(TAG, "decode uninitalized, codec: " + z11 + ", callback: " + this.callback);
            return VideoCodecStatus.UNINITIALIZED;
        }
        ByteBuffer byteBuffer = encodedImage.buffer;
        if (byteBuffer == null) {
            Logging.e(TAG, "decode() - no input data");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            Logging.e(TAG, "decode() - input buffer empty");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        synchronized (this.dimensionLock) {
            i11 = this.width;
            i12 = this.height;
        }
        int i13 = encodedImage.encodedWidth;
        int i14 = encodedImage.encodedHeight;
        if (i13 * i14 > 0 && ((i13 != i11 || i14 != i12) && (videoCodecStatusReinitDecode = reinitDecode(i13, i14)) != VideoCodecStatus.OK)) {
            return videoCodecStatusReinitDecode;
        }
        if (this.keyFrameRequired && encodedImage.frameType != EncodedImage.FrameType.VideoFrameKey) {
            Logging.e(TAG, "decode() - key frame required first");
            return VideoCodecStatus.NO_OUTPUT;
        }
        try {
            int iDequeueInputBuffer = this.codec.dequeueInputBuffer(500000L);
            if (iDequeueInputBuffer < 0) {
                Logging.e(TAG, "decode() - no HW buffers available; decoder falling behind");
                return VideoCodecStatus.ERROR;
            }
            try {
                ByteBuffer inputBuffer = this.codec.getInputBuffer(iDequeueInputBuffer);
                if (inputBuffer.capacity() < iRemaining) {
                    Logging.e(TAG, "decode() - HW buffer too small");
                    return VideoCodecStatus.ERROR;
                }
                inputBuffer.put(encodedImage.buffer);
                this.frameInfos.offer(new FrameInfo(SystemClock.elapsedRealtime(), encodedImage.rotation));
                try {
                    this.codec.queueInputBuffer(iDequeueInputBuffer, 0, iRemaining, TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                    if (this.keyFrameRequired) {
                        this.keyFrameRequired = false;
                    }
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e11) {
                    Logging.e(TAG, "queueInputBuffer failed", e11);
                    this.frameInfos.pollLast();
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e12) {
                Logging.e(TAG, "getInputBuffer with index=" + iDequeueInputBuffer + " failed", e12);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e13) {
            Logging.e(TAG, "dequeueInputBuffer failed", e13);
            return VideoCodecStatus.ERROR;
        }
    }

    protected void deliverDecodedFrame() throws Throwable {
        Integer numValueOf;
        int i11;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (iDequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
                return;
            }
            if (iDequeueOutputBuffer < 0) {
                Logging.v(TAG, "dequeueOutputBuffer returned " + iDequeueOutputBuffer);
                return;
            }
            FrameInfo frameInfoPoll = this.frameInfos.poll();
            if (frameInfoPoll != null) {
                numValueOf = Integer.valueOf((int) (SystemClock.elapsedRealtime() - frameInfoPoll.decodeStartTimeMs));
                i11 = frameInfoPoll.rotation;
            } else {
                numValueOf = null;
                i11 = 0;
            }
            this.hasDecodedFirstFrame = true;
            if (this.surfaceTextureHelper != null) {
                deliverTextureFrame(iDequeueOutputBuffer, bufferInfo, i11, numValueOf);
            } else {
                deliverByteFrame(iDequeueOutputBuffer, bufferInfo, i11, numValueOf);
            }
        } catch (IllegalStateException e11) {
            Logging.e(TAG, "deliverDecodedFrame failed", e11);
        }
    }

    @Override // org.webrtc.VideoDecoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        this.callback = callback;
        if (this.sharedContext != null) {
            this.surfaceTextureHelper = createSurfaceTextureHelper();
            this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
            this.surfaceTextureHelper.startListening(this);
        }
        return initDecodeInternal(settings.width, settings.height);
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        long j11;
        Integer num;
        synchronized (this.renderedTextureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata == null) {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
            j11 = decodedTextureMetadata.presentationTimestampUs * 1000;
            num = decodedTextureMetadata.decodeTimeMs;
            this.renderedTextureMetadata = null;
        }
        this.callback.onDecodedFrame(new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j11), num, null);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus release() {
        Logging.d(TAG, "release");
        VideoCodecStatus videoCodecStatusReleaseInternal = releaseInternal();
        if (this.surface != null) {
            releaseSurface();
            this.surface = null;
            this.surfaceTextureHelper.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.frameInfos.clear();
        return videoCodecStatusReleaseInternal;
    }

    protected void releaseSurface() {
        this.surface.release();
    }
}
