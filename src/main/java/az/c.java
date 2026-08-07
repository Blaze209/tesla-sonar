package az;

import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.webrtc.EglBase;
import org.webrtc.HardwareVideoEncoderFactory;
import org.webrtc.SimulcastVideoEncoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderFactory;
import org.webrtc.VideoEncoderFallback;
import org.webrtc.VideoFrame;
import org.webrtc.WrappedNativeVideoEncoder;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0011\u0014\u0017B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Laz/c;", "Lorg/webrtc/VideoEncoderFactory;", "Lorg/webrtc/EglBase$Context;", "sharedContext", "", "enableIntelVp8Encoder", "enableH264HighProfile", "<init>", "(Lorg/webrtc/EglBase$Context;ZZ)V", "Lorg/webrtc/VideoCodecInfo;", "info", "Lorg/webrtc/VideoEncoder;", "createEncoder", "(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoEncoder;", "", "getSupportedCodecs", "()[Lorg/webrtc/VideoCodecInfo;", "a", "Lorg/webrtc/VideoEncoderFactory;", "primary", "b", "fallback", "Lorg/webrtc/SimulcastVideoEncoderFactory;", "c", "Lorg/webrtc/SimulcastVideoEncoderFactory;", "native", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class c implements VideoEncoderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final VideoEncoderFactory primary;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final VideoEncoderFactory fallback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SimulcastVideoEncoderFactory native;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, d2 = {"Laz/c$a;", "Lorg/webrtc/VideoEncoderFactory;", "hardwareVideoEncoderFactory", "<init>", "(Lorg/webrtc/VideoEncoderFactory;)V", "Lorg/webrtc/VideoCodecInfo;", "info", "Lorg/webrtc/VideoEncoder;", "createEncoder", "(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoEncoder;", "", "getSupportedCodecs", "()[Lorg/webrtc/VideoCodecInfo;", "a", "Lorg/webrtc/VideoEncoderFactory;", "b", "softwareVideoEncoderFactory", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a implements VideoEncoderFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final VideoEncoderFactory hardwareVideoEncoderFactory;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final VideoEncoderFactory softwareVideoEncoderFactory;

        public a(VideoEncoderFactory hardwareVideoEncoderFactory) {
            s.k(hardwareVideoEncoderFactory, "hardwareVideoEncoderFactory");
            this.hardwareVideoEncoderFactory = hardwareVideoEncoderFactory;
            this.softwareVideoEncoderFactory = new c00.d();
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoEncoder createEncoder(VideoCodecInfo info) {
            s.k(info, "info");
            VideoEncoder videoEncoderCreateEncoder = this.softwareVideoEncoderFactory.createEncoder(info);
            VideoEncoder videoEncoderCreateEncoder2 = this.hardwareVideoEncoderFactory.createEncoder(info);
            if (videoEncoderCreateEncoder2 == null || videoEncoderCreateEncoder == null) {
                return videoEncoderCreateEncoder == null ? videoEncoderCreateEncoder2 : videoEncoderCreateEncoder;
            }
            return new VideoEncoderFallback(videoEncoderCreateEncoder2, videoEncoderCreateEncoder);
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            ArrayList arrayList = new ArrayList();
            VideoCodecInfo[] supportedCodecs = this.softwareVideoEncoderFactory.getSupportedCodecs();
            s.j(supportedCodecs, "getSupportedCodecs(...)");
            v.F(arrayList, supportedCodecs);
            VideoCodecInfo[] supportedCodecs2 = this.hardwareVideoEncoderFactory.getSupportedCodecs();
            s.j(supportedCodecs2, "getSupportedCodecs(...)");
            v.F(arrayList, supportedCodecs2);
            return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u00109\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R$\u0010@\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006A"}, d2 = {"Laz/c$b;", "Lorg/webrtc/VideoEncoder;", "encoder", "<init>", "(Lorg/webrtc/VideoEncoder;)V", "Lorg/webrtc/VideoEncoder$Settings;", "settings", "Lorg/webrtc/VideoEncoder$Callback;", "callback", "Lorg/webrtc/VideoCodecStatus;", "initEncode", "(Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)Lorg/webrtc/VideoCodecStatus;", "release", "()Lorg/webrtc/VideoCodecStatus;", "Lorg/webrtc/VideoFrame;", "frame", "Lorg/webrtc/VideoEncoder$EncodeInfo;", "encodeInfo", "encode", "(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)Lorg/webrtc/VideoCodecStatus;", "Lorg/webrtc/VideoEncoder$BitrateAllocation;", "allocation", "", "frameRate", "setRateAllocation", "(Lorg/webrtc/VideoEncoder$BitrateAllocation;I)Lorg/webrtc/VideoCodecStatus;", "Lorg/webrtc/VideoEncoder$ScalingSettings;", "getScalingSettings", "()Lorg/webrtc/VideoEncoder$ScalingSettings;", "", "getImplementationName", "()Ljava/lang/String;", "", "webrtcEnvRef", "createNative", "(J)J", "", "isHardwareEncoder", "()Z", "Lorg/webrtc/VideoEncoder$RateControlParameters;", "rcParameters", "setRates", "(Lorg/webrtc/VideoEncoder$RateControlParameters;)Lorg/webrtc/VideoCodecStatus;", "", "Lorg/webrtc/VideoEncoder$ResolutionBitrateLimits;", "getResolutionBitrateLimits", "()[Lorg/webrtc/VideoEncoder$ResolutionBitrateLimits;", "Lorg/webrtc/VideoEncoder$EncoderInfo;", "getEncoderInfo", "()Lorg/webrtc/VideoEncoder$EncoderInfo;", "a", "Lorg/webrtc/VideoEncoder;", "Ljava/util/concurrent/ExecutorService;", "b", "Ljava/util/concurrent/ExecutorService;", "getExecutor", "()Ljava/util/concurrent/ExecutorService;", "executor", "c", "Lorg/webrtc/VideoEncoder$Settings;", "getStreamSettings", "()Lorg/webrtc/VideoEncoder$Settings;", "setStreamSettings", "(Lorg/webrtc/VideoEncoder$Settings;)V", "streamSettings", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class b implements VideoEncoder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final VideoEncoder encoder;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ExecutorService executor;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private VideoEncoder.Settings streamSettings;

        public b(VideoEncoder encoder) {
            s.k(encoder, "encoder");
            this.encoder = encoder;
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            s.j(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
            this.executor = executorServiceNewSingleThreadExecutor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Long l(b bVar, long j11) {
            return Long.valueOf(bVar.encoder.createNative(j11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus m(b bVar, VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo) {
            if (bVar.streamSettings == null) {
                return bVar.encoder.encode(videoFrame, encodeInfo);
            }
            int width = videoFrame.getBuffer().getWidth();
            VideoEncoder.Settings settings = bVar.streamSettings;
            s.h(settings);
            if (width == settings.width) {
                return bVar.encoder.encode(videoFrame, encodeInfo);
            }
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            int width2 = buffer.getWidth();
            int height = buffer.getHeight();
            VideoEncoder.Settings settings2 = bVar.streamSettings;
            s.h(settings2);
            int i11 = settings2.width;
            VideoEncoder.Settings settings3 = bVar.streamSettings;
            s.h(settings3);
            VideoFrame.Buffer bufferCropAndScale = buffer.cropAndScale(0, 0, width2, height, i11, settings3.height);
            VideoCodecStatus videoCodecStatusEncode = bVar.encoder.encode(new VideoFrame(bufferCropAndScale, videoFrame.getRotation(), videoFrame.getTimestampNs()), encodeInfo);
            bufferCropAndScale.release();
            return videoCodecStatusEncode;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoEncoder.EncoderInfo n(b bVar) {
            return bVar.encoder.getEncoderInfo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String o(b bVar) {
            return bVar.encoder.getImplementationName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoEncoder.ResolutionBitrateLimits[] p(b bVar) {
            return bVar.encoder.getResolutionBitrateLimits();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoEncoder.ScalingSettings q(b bVar) {
            return bVar.encoder.getScalingSettings();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus r(b bVar, VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
            Log.i("SimulVideoEncoderFac", t.p("initEncode() thread=" + Thread.currentThread().getName() + " [" + Thread.currentThread().getId() + "]\n                |  encoder=" + bVar.encoder.getImplementationName() + "\n                |  streamSettings:\n                |    numberOfCores=" + settings.numberOfCores + "\n                |    width=" + settings.width + "\n                |    height=" + settings.height + "\n                |    startBitrate=" + settings.startBitrate + "\n                |    maxFramerate=" + settings.maxFramerate + "\n                |    automaticResizeOn=" + settings.automaticResizeOn + "\n                |    numberOfSimulcastStreams=" + settings.numberOfSimulcastStreams + "\n                |    lossNotification=" + settings.capabilities.lossNotification + "\n            ", null, 1, null));
            return bVar.encoder.initEncode(settings, callback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean s(b bVar) {
            return Boolean.valueOf(bVar.encoder.isHardwareEncoder());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus t(b bVar) {
            return bVar.encoder.release();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus u(b bVar, VideoEncoder.BitrateAllocation bitrateAllocation, int i11) {
            return bVar.encoder.setRateAllocation(bitrateAllocation, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoCodecStatus v(b bVar, VideoEncoder.RateControlParameters rateControlParameters) {
            return bVar.encoder.setRates(rateControlParameters);
        }

        @Override // org.webrtc.VideoEncoder
        public long createNative(final long webrtcEnvRef) throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: az.n
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.b.l(this.f15221a, webrtcEnvRef);
                }
            }).get();
            s.j(obj, "get(...)");
            return ((Number) obj).longValue();
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus encode(final VideoFrame frame, final VideoEncoder.EncodeInfo encodeInfo) throws ExecutionException, InterruptedException {
            s.k(frame, "frame");
            Object obj = this.executor.submit(new Callable() { // from class: az.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.b.m(this.f15212a, frame, encodeInfo);
                }
            }).get();
            s.j(obj, "get(...)");
            return (VideoCodecStatus) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public VideoEncoder.EncoderInfo getEncoderInfo() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: az.k
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.b.n(this.f15218a);
                }
            }).get();
            s.j(obj, "get(...)");
            return (VideoEncoder.EncoderInfo) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public String getImplementationName() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: az.m
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.b.o(this.f15220a);
                }
            }).get();
            s.j(obj, "get(...)");
            return (String) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: az.i
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.b.p(this.f15216a);
                }
            }).get();
            s.j(obj, "get(...)");
            return (VideoEncoder.ResolutionBitrateLimits[]) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public VideoEncoder.ScalingSettings getScalingSettings() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: az.j
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.b.q(this.f15217a);
                }
            }).get();
            s.j(obj, "get(...)");
            return (VideoEncoder.ScalingSettings) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus initEncode(final VideoEncoder.Settings settings, final VideoEncoder.Callback callback) throws ExecutionException, InterruptedException {
            s.k(settings, "settings");
            this.streamSettings = settings;
            Object obj = this.executor.submit(new Callable() { // from class: az.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.b.r(this.f15209a, settings, callback);
                }
            }).get();
            s.j(obj, "get(...)");
            return (VideoCodecStatus) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public boolean isHardwareEncoder() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: az.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.b.s(this.f15215a);
                }
            }).get();
            s.j(obj, "get(...)");
            return ((Boolean) obj).booleanValue();
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus release() throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: az.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.b.t(this.f15219a);
                }
            }).get();
            s.j(obj, "get(...)");
            return (VideoCodecStatus) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus setRateAllocation(final VideoEncoder.BitrateAllocation allocation, final int frameRate) throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: az.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.b.u(this.f15204a, allocation, frameRate);
                }
            }).get();
            s.j(obj, "get(...)");
            return (VideoCodecStatus) obj;
        }

        @Override // org.webrtc.VideoEncoder
        public VideoCodecStatus setRates(final VideoEncoder.RateControlParameters rcParameters) throws ExecutionException, InterruptedException {
            Object obj = this.executor.submit(new Callable() { // from class: az.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c.b.v(this.f15207a, rcParameters);
                }
            }).get();
            s.j(obj, "get(...)");
            return (VideoCodecStatus) obj;
        }
    }

    /* JADX INFO: renamed from: az.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Laz/c$c;", "Lorg/webrtc/VideoEncoderFactory;", "factory", "<init>", "(Lorg/webrtc/VideoEncoderFactory;)V", "Lorg/webrtc/VideoCodecInfo;", "videoCodecInfo", "Lorg/webrtc/VideoEncoder;", "createEncoder", "(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoEncoder;", "", "getSupportedCodecs", "()[Lorg/webrtc/VideoCodecInfo;", "a", "Lorg/webrtc/VideoEncoderFactory;", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class C0271c implements VideoEncoderFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final VideoEncoderFactory factory;

        public C0271c(VideoEncoderFactory factory) {
            s.k(factory, "factory");
            this.factory = factory;
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
            VideoEncoder videoEncoderCreateEncoder = this.factory.createEncoder(videoCodecInfo);
            if (videoEncoderCreateEncoder == null) {
                return null;
            }
            return videoEncoderCreateEncoder instanceof WrappedNativeVideoEncoder ? videoEncoderCreateEncoder : new b(videoEncoderCreateEncoder);
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            VideoCodecInfo[] supportedCodecs = this.factory.getSupportedCodecs();
            s.j(supportedCodecs, "getSupportedCodecs(...)");
            return supportedCodecs;
        }
    }

    public c(EglBase.Context context, boolean z11, boolean z12) {
        C0271c c0271c = new C0271c(new HardwareVideoEncoderFactory(context, z11, z12));
        this.primary = c0271c;
        C0271c c0271c2 = new C0271c(new a(c0271c));
        this.fallback = c0271c2;
        this.native = new SimulcastVideoEncoderFactory(c0271c, c0271c2);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo info) {
        return this.native.createEncoder(info);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        VideoCodecInfo[] supportedCodecs = this.native.getSupportedCodecs();
        s.j(supportedCodecs, "getSupportedCodecs(...)");
        return supportedCodecs;
    }
}
