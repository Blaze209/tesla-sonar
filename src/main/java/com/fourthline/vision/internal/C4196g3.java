package com.fourthline.vision.internal;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Size;
import android.view.Surface;
import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.fourthline.analytics.internal.AnalyticsInterface;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import java.util.Objects;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4196g3 implements InterfaceC4306w0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f38325f = new d(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f38326g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r6 f38327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4204h3 f38328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4243n f38329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U5 f38330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f38331e;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.g3$a */
    private static final class a extends Throwable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec f38332a;

        public a(MediaCodec mediaCodec) {
            p013kotlin.jvm.internal.s.k(mediaCodec, "mediaCodec");
            this.f38332a = mediaCodec;
        }

        public final MediaCodec getMediaCodec() {
            return this.f38332a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.g3$b */
    private static final class b extends Throwable {
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.g3$c */
    private static final class c extends Throwable {
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.g3$d */
    private static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.g3$e */
    private static final class e extends Throwable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec f38333a;

        public e(MediaCodec mediaCodec) {
            p013kotlin.jvm.internal.s.k(mediaCodec, "mediaCodec");
            this.f38333a = mediaCodec;
        }

        public final MediaCodec getMediaCodec() {
            return this.f38333a;
        }
    }

    public C4196g3(r6 visionInfoProvider, C4204h3 sizeCalculator, C4243n bitrateCalculator, U5 videoCodec) {
        String simpleName;
        p013kotlin.jvm.internal.s.k(visionInfoProvider, "visionInfoProvider");
        p013kotlin.jvm.internal.s.k(sizeCalculator, "sizeCalculator");
        p013kotlin.jvm.internal.s.k(bitrateCalculator, "bitrateCalculator");
        p013kotlin.jvm.internal.s.k(videoCodec, "videoCodec");
        this.f38327a = visionInfoProvider;
        this.f38328b = sizeCalculator;
        this.f38329c = bitrateCalculator;
        this.f38330d = videoCodec;
        if (C4196g3.class.isAnonymousClass()) {
            simpleName = C4196g3.class.getName();
            int length = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length > 23) {
                simpleName = simpleName.substring(simpleName.length() - 23, simpleName.length());
                p013kotlin.jvm.internal.s.j(simpleName, "substring(...)");
            }
        } else {
            simpleName = C4196g3.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                simpleName = simpleName.substring(0, 23);
                p013kotlin.jvm.internal.s.j(simpleName, "substring(...)");
            }
        }
        this.f38331e = simpleName;
    }

    private final Size adjustForRotation(Size size) {
        int orientationHint = this.f38327a.getOrientationHint();
        return (orientationHint == 90 || orientationHint == 270) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    private final Try<Pair<MediaCodec, Surface>> configureAndCreateSurface(Try<MediaCodec> r11, final Size size) {
        return TryKt.handleSuccessWith(r11, new wn0.l() { // from class: com.fourthline.vision.internal.ga
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4196g3.configureAndCreateSurface$lambda$5(this.f38345a, size, (MediaCodec) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Try configureAndCreateSurface$lambda$5(C4196g3 c4196g3, Size size, MediaCodec it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return c4196g3.configureAndCreateSurface(it, size, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Try configureAndCreateSurface$lambda$8$lambda$7(C4196g3 c4196g3, Size size, MediaCodec mediaCodec, Throwable it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        String str = c4196g3.f38331e;
        Objects.toString(size);
        return Try.INSTANCE.raiseError(new a(mediaCodec));
    }

    private final MediaFormat createFormat(Size size) {
        AnalyticsContext context;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.f38330d.getMimeType(), size.getWidth(), size.getHeight());
        int iCalculateBitrate = this.f38329c.calculateBitrate(size.getWidth(), size.getHeight(), 30);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", iCalculateBitrate);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null && (context = analytics.getContext(AnalyticsContext.Scanner)) != null) {
            AbstractC4167c6.setVideoRecordingAttributes(context, size, iCalculateBitrate, this.f38330d.getMimeType());
        }
        p013kotlin.jvm.internal.s.j(mediaFormatCreateVideoFormat, "apply(...)");
        return mediaFormatCreateVideoFormat;
    }

    private final Try<MediaCodec> createMediaCodec() {
        Try failure;
        Try.Companion companion = Try.INSTANCE;
        try {
            this.f38330d.getMimeType();
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(this.f38330d.getMimeType());
            this.f38330d.getMimeType();
            failure = new Try.Success(mediaCodecCreateEncoderByType);
        } catch (Throwable th2) {
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError)) {
                throw th2;
            }
            failure = new Try.Failure(th2);
        }
        return TryKt.handleErrorWith(failure, new wn0.l() { // from class: com.fourthline.vision.internal.fa
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4196g3.createMediaCodec$lambda$4(this.f38321a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Try createMediaCodec$lambda$4(C4196g3 c4196g3, Throwable it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        String str = c4196g3.f38331e;
        c4196g3.f38330d.getMimeType();
        return Try.INSTANCE.raiseError(new b());
    }

    private static /* synthetic */ void getCLASS_TAG$annotations() {
    }

    private final Size getMaxAvailableSize(MediaCodec mediaCodec) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodec.getCodecInfo().getCapabilitiesForType(this.f38330d.getMimeType()).getVideoCapabilities();
        Object upper = videoCapabilities.getSupportedWidths().getUpper();
        p013kotlin.jvm.internal.s.j(upper, "getUpper(...)");
        int iIntValue = ((Number) upper).intValue();
        Object upper2 = videoCapabilities.getSupportedHeights().getUpper();
        p013kotlin.jvm.internal.s.j(upper2, "getUpper(...)");
        Size sizeAdjustForRotation = adjustForRotation(new Size(iIntValue, ((Number) upper2).intValue()));
        Objects.toString(sizeAdjustForRotation);
        return sizeAdjustForRotation;
    }

    private final Try<Pair<MediaCodec, Surface>> handleReset(Try<MediaCodec> r11, final Size size) {
        if (r11 instanceof Try.Failure) {
            Throwable exception = ((Try.Failure) r11).getException();
            return exception instanceof c ? TryKt.handleSuccessWith(createMediaCodec(), new wn0.l() { // from class: com.fourthline.vision.internal.ea
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return C4196g3.handleReset$lambda$13$lambda$12(this.f38304a, size, (MediaCodec) obj);
                }
            }) : Try.INSTANCE.raiseError(exception);
        }
        if (r11 instanceof Try.Success) {
            return tryCalculateSizeAndConfigureAndCreateSurface((MediaCodec) ((Try.Success) r11).getValue(), size);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Try handleReset$lambda$13$lambda$12(C4196g3 c4196g3, Size size, MediaCodec codec) {
        p013kotlin.jvm.internal.s.k(codec, "codec");
        return c4196g3.tryCalculateSizeAndConfigureAndCreateSurface(codec, size);
    }

    private final boolean isFormatSupported(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        return mediaCodec.getCodecInfo().getCapabilitiesForType(this.f38330d.getMimeType()).isFormatSupported(mediaFormat);
    }

    private final Try<Pair<MediaCodec, Surface>> reconfigureIfError(Try<? extends Pair<MediaCodec, ? extends Surface>> r11, final Size size) {
        return TryKt.handleErrorWith(r11, new wn0.l() { // from class: com.fourthline.vision.internal.ja
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4196g3.reconfigureIfError$lambda$9(this.f38484a, size, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Try reconfigureIfError$lambda$9(C4196g3 c4196g3, Size size, Throwable it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof e) {
            return c4196g3.tryCalculateSizeAndConfigureAndCreateSurface(((e) it).getMediaCodec(), size);
        }
        return it instanceof a ? c4196g3.handleReset(c4196g3.tryReset(((a) it).getMediaCodec()), size) : Try.INSTANCE.raiseError(it);
    }

    private final Try<Pair<MediaCodec, Surface>> tryCalculateSizeAndConfigureAndCreateSurface(MediaCodec mediaCodec, Size size) {
        return configureAndCreateSurface(mediaCodec, this.f38328b.calculateSize(size, getMaxAvailableSize(mediaCodec)), false);
    }

    private final Try<MediaCodec> tryReset(MediaCodec mediaCodec) {
        Try failure;
        Try.Companion companion = Try.INSTANCE;
        try {
            mediaCodec.reset();
            failure = new Try.Success(mediaCodec);
        } catch (Throwable th2) {
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError)) {
                throw th2;
            }
            failure = new Try.Failure(th2);
        }
        return TryKt.handleErrorWith(failure, new wn0.l() { // from class: com.fourthline.vision.internal.ha
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4196g3.tryReset$lambda$11(this.f38388a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Try tryReset$lambda$11(C4196g3 c4196g3, Throwable it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        String str = c4196g3.f38331e;
        return Try.INSTANCE.raiseError(new c());
    }

    @Override // com.fourthline.vision.internal.InterfaceC4306w0
    public void subscribe(wn0.p<? super Pair<MediaCodec, ? extends Surface>, ? super Continuation<? super jn0.h0>, ? extends Object> pVar) {
        InterfaceC4306w0.a.subscribe(this, pVar);
    }

    private final Try<Pair<MediaCodec, Surface>> configureAndCreateSurface(final MediaCodec mediaCodec, final Size size, boolean z11) {
        Try failure;
        MediaFormat mediaFormatCreateFormat = createFormat(size);
        if (z11 && !isFormatSupported(mediaCodec, mediaFormatCreateFormat)) {
            Objects.toString(size);
            return Try.INSTANCE.raiseError(new e(mediaCodec));
        }
        Try.Companion companion = Try.INSTANCE;
        try {
            Objects.toString(size);
            mediaCodec.configure(mediaFormatCreateFormat, (Surface) null, (MediaCrypto) null, 1);
            Objects.toString(mediaFormatCreateFormat);
            Surface surfaceCreateInputSurface = mediaCodec.createInputSurface();
            p013kotlin.jvm.internal.s.j(surfaceCreateInputSurface, "createInputSurface(...)");
            mediaCodec.start();
            failure = new Try.Success(jn0.x.a(mediaCodec, surfaceCreateInputSurface));
        } catch (Throwable th2) {
            if ((th2 instanceof VirtualMachineError) || (th2 instanceof ThreadDeath) || (th2 instanceof InterruptedException) || (th2 instanceof LinkageError)) {
                throw th2;
            }
            failure = new Try.Failure(th2);
        }
        return TryKt.handleErrorWith(failure, new wn0.l() { // from class: com.fourthline.vision.internal.ia
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4196g3.configureAndCreateSurface$lambda$8$lambda$7(this.f38422a, size, mediaCodec, (Throwable) obj);
            }
        });
    }

    @Override // com.fourthline.vision.internal.InterfaceC4306w0
    public Pair<MediaCodec, Surface> get() throws AbstractC4255o4.a {
        this.f38327a.getOrientationHint();
        Size sizeAdjustForRotation = adjustForRotation(this.f38327a.getPreviewSize());
        Try<Pair<MediaCodec, Surface>> tryReconfigureIfError = reconfigureIfError(configureAndCreateSurface(createMediaCodec(), sizeAdjustForRotation), sizeAdjustForRotation);
        if (tryReconfigureIfError instanceof Try.Failure) {
            Objects.toString(((Try.Failure) tryReconfigureIfError).getException());
            throw new AbstractC4255o4.a(EnumC4241m4.RECORDING_FAILED, null, 2, null);
        }
        if (tryReconfigureIfError instanceof Try.Success) {
            return (Pair) ((Try.Success) tryReconfigureIfError).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }
}
