package com.fourthline.vision.internal;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4261p3 implements InterfaceC4254o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f38749a = new a(null);

    /* JADX INFO: renamed from: com.fourthline.vision.internal.p3$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @SuppressLint({"WrongConstant"})
    private final void copySamples(MediaExtractor mediaExtractor, MediaMuxer mediaMuxer, int i11, long j11, long j12) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(PKIFailureInfo.badSenderNonce);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        boolean z11 = false;
        while (!z11) {
            bufferInfo.offset = 0;
            int sampleData = mediaExtractor.readSampleData(byteBufferAllocate, 0);
            bufferInfo.size = sampleData;
            if (sampleData < 0) {
                bufferInfo.size = 0;
                z11 = true;
            } else {
                long sampleTime = mediaExtractor.getSampleTime();
                if (j11 <= sampleTime && sampleTime < j12) {
                    bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                    bufferInfo.flags = mediaExtractor.getSampleFlags();
                    mediaMuxer.writeSampleData(i11, byteBufferAllocate, bufferInfo);
                }
            }
            mediaExtractor.advance();
            byteBufferAllocate.rewind();
        }
    }

    private final MediaExtractor createExtractor(String str, long j11) throws IOException {
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(str);
        if (j11 > 0) {
            mediaExtractor.seekTo(j11, 1);
        }
        return mediaExtractor;
    }

    private final MediaMuxer createMuxer(String str, MediaMetadataRetriever mediaMetadataRetriever) {
        int i11;
        MediaMuxer mediaMuxer = new MediaMuxer(str, 0);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
        if (strExtractMetadata != null && (i11 = Integer.parseInt(strExtractMetadata)) >= 0) {
            mediaMuxer.setOrientationHint(i11);
        }
        return mediaMuxer;
    }

    private final void mux(MediaMuxer mediaMuxer, Pair<MediaExtractor, Integer> pair, Pair<MediaExtractor, Integer> pair2, long j11, long j12) {
        mediaMuxer.start();
        copySamples(pair.e(), mediaMuxer, pair.f().intValue(), j11, j12);
        if (pair2 != null) {
            copySamples(pair2.e(), mediaMuxer, pair2.f().intValue(), j11, j12);
        }
        mediaMuxer.stop();
    }

    private final MediaFormat selectTrack(MediaExtractor mediaExtractor, String str) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i11 = 0; i11 < trackCount; i11++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i11);
            p013kotlin.jvm.internal.s.j(trackFormat, "getTrackFormat(...)");
            String string = trackFormat.getString("mime");
            if (string != null && p013kotlin.text.t.b0(string, str, false, 2, null)) {
                mediaExtractor.selectTrack(i11);
                return trackFormat;
            }
        }
        throw new IllegalArgumentException("Can't find track for provided mimeType: " + str);
    }

    private final int setupTracks(MediaExtractor mediaExtractor, MediaMuxer mediaMuxer, String str) {
        return mediaMuxer.addTrack(selectTrack(mediaExtractor, str));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f3 A[DONT_GENERATE] */
    @Override // com.fourthline.vision.internal.InterfaceC4254o3
    public void trimVideo(String videoFilePath, String str, String dstPath, long j11, long j12) throws IOException {
        p013kotlin.jvm.internal.s.k(videoFilePath, "videoFilePath");
        p013kotlin.jvm.internal.s.k(dstPath, "dstPath");
        if (C4261p3.class.isAnonymousClass()) {
            String name = C4261p3.class.getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = C4261p3.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        long j13 = 1000;
        long j14 = j11 * j13;
        long j15 = j13 * j12;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(videoFilePath);
        MediaMuxer mediaMuxerCreateMuxer = createMuxer(dstPath, mediaMetadataRetriever);
        MediaExtractor mediaExtractorCreateExtractor = createExtractor(videoFilePath, j14);
        MediaExtractor mediaExtractorCreateExtractor2 = str != null ? createExtractor(str, j14) : null;
        try {
            mux(mediaMuxerCreateMuxer, jn0.x.a(mediaExtractorCreateExtractor, Integer.valueOf(setupTracks(mediaExtractorCreateExtractor, mediaMuxerCreateMuxer, "video/"))), mediaExtractorCreateExtractor2 != null ? jn0.x.a(mediaExtractorCreateExtractor2, Integer.valueOf(setupTracks(mediaExtractorCreateExtractor2, mediaMuxerCreateMuxer, "audio/"))) : null, j14, j15);
        } catch (IllegalStateException unused) {
            if (C4261p3.class.isAnonymousClass()) {
                String name2 = C4261p3.class.getName();
                if (name2.length() <= 23) {
                    p013kotlin.jvm.internal.s.h(name2);
                } else {
                    p013kotlin.jvm.internal.s.h(name2);
                    p013kotlin.jvm.internal.s.j(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
                }
            } else {
                String simpleName2 = C4261p3.class.getSimpleName();
                if (simpleName2.length() <= 23) {
                    p013kotlin.jvm.internal.s.h(simpleName2);
                } else {
                    p013kotlin.jvm.internal.s.h(simpleName2);
                    p013kotlin.jvm.internal.s.j(simpleName2.substring(0, 23), "substring(...)");
                }
            }
        } finally {
            mediaMuxerCreateMuxer.release();
            mediaExtractorCreateExtractor.release();
            if (mediaExtractorCreateExtractor2 != null) {
                mediaExtractorCreateExtractor2.release();
            }
            mediaMetadataRetriever.release();
        }
    }
}
