package io.sentry.android.replay.video;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.sentry.android.replay.util.n;
import io.sentry.b7;
import io.sentry.q7;
import java.nio.ByteBuffer;
import jn0.h0;
import jn0.m;
import jn0.p;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001a\u0010(\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001b\u0010,\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00101R\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00104R\u0011\u00108\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b\u001c\u00107¨\u00069"}, d2 = {"Lio/sentry/android/replay/video/c;", "", "Lio/sentry/q7;", "options", "Lio/sentry/android/replay/video/a;", "muxerConfig", "Lkotlin/Function0;", "Ljn0/h0;", "onClose", "<init>", "(Lio/sentry/q7;Lio/sentry/android/replay/video/a;Lwn0/a;)V", "", "endOfStream", "a", "(Z)V", "j", "()V", "Landroid/graphics/Bitmap;", "image", "b", "(Landroid/graphics/Bitmap;)V", IntegerTokenConverter.CONVERTER_KEY, "Lio/sentry/q7;", "h", "()Lio/sentry/q7;", "Lio/sentry/android/replay/video/a;", "g", "()Lio/sentry/android/replay/video/a;", "c", "Lwn0/a;", "getOnClose", "()Lwn0/a;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "()Z", "hasExynosCodec", "Landroid/media/MediaCodec;", "e", "Landroid/media/MediaCodec;", "()Landroid/media/MediaCodec;", "mediaCodec", "Landroid/media/MediaFormat;", "f", "()Landroid/media/MediaFormat;", "mediaFormat", "Landroid/media/MediaCodec$BufferInfo;", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "Lio/sentry/android/replay/video/b;", "Lio/sentry/android/replay/video/b;", "frameMuxer", "Landroid/view/Surface;", "Landroid/view/Surface;", "surface", "", "()J", "duration", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q7 options;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final MuxerConfig muxerConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> onClose;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy hasExynosCodec;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final MediaCodec mediaCodec;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy mediaFormat;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final MediaCodec.BufferInfo bufferInfo;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.android.replay.video.b frameMuxer;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Surface surface;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f80219c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            boolean z11 = false;
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            s.j(codecInfos, "getCodecInfos(...)");
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                String name = mediaCodecInfo.getName();
                s.j(name, "getName(...)");
                if (t.h0(name, "c2.exynos", false, 2, null)) {
                    z11 = true;
                    break;
                }
            }
            return Boolean.valueOf(z11);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/media/MediaFormat;", "b", "()Landroid/media/MediaFormat;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.a<MediaFormat> {
        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MediaFormat invoke() {
            int bitRate = c.this.getMuxerConfig().getBitRate();
            try {
                MediaCodecInfo.VideoCapabilities videoCapabilities = c.this.getMediaCodec().getCodecInfo().getCapabilitiesForType(c.this.getMuxerConfig().getMimeType()).getVideoCapabilities();
                if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(bitRate))) {
                    c.this.getOptions().getLogger().c(b7.DEBUG, "Encoder doesn't support the provided bitRate: " + bitRate + ", the value will be clamped to the closest one", new Object[0]);
                    Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(bitRate));
                    s.j(objClamp, "clamp(...)");
                    bitRate = ((Number) objClamp).intValue();
                }
            } catch (Throwable th2) {
                c.this.getOptions().getLogger().a(b7.DEBUG, "Could not retrieve MediaCodec info", th2);
            }
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(c.this.getMuxerConfig().getMimeType(), c.this.getMuxerConfig().getRecordingWidth(), c.this.getMuxerConfig().getRecordingHeight());
            s.j(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
            mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
            mediaFormatCreateVideoFormat.setInteger("bitrate", bitRate);
            mediaFormatCreateVideoFormat.setFloat("frame-rate", c.this.getMuxerConfig().getFrameRate());
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
            return mediaFormatCreateVideoFormat;
        }
    }

    public c(q7 options, MuxerConfig muxerConfig, wn0.a<h0> aVar) {
        s.k(options, "options");
        s.k(muxerConfig, "muxerConfig");
        this.options = options;
        this.muxerConfig = muxerConfig;
        this.onClose = aVar;
        p pVar = p.NONE;
        this.hasExynosCodec = m.a(pVar, a.f80219c);
        MediaCodec mediaCodecCreateByCodecName = d() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(muxerConfig.getMimeType());
        s.h(mediaCodecCreateByCodecName);
        this.mediaCodec = mediaCodecCreateByCodecName;
        this.mediaFormat = m.a(pVar, new b());
        this.bufferInfo = new MediaCodec.BufferInfo();
        String absolutePath = muxerConfig.getFile().getAbsolutePath();
        s.j(absolutePath, "getAbsolutePath(...)");
        this.frameMuxer = new io.sentry.android.replay.video.b(absolutePath, muxerConfig.getFrameRate());
    }

    private final void a(boolean endOfStream) {
        ByteBuffer byteBuffer;
        if (this.options.getSessionReplay().u()) {
            this.options.getLogger().c(b7.DEBUG, "[Encoder]: drainCodec(" + endOfStream + CoreConstants.RIGHT_PARENTHESIS_CHAR, new Object[0]);
        }
        if (endOfStream) {
            if (this.options.getSessionReplay().u()) {
                this.options.getLogger().c(b7.DEBUG, "[Encoder]: sending EOS to encoder", new Object[0]);
            }
            this.mediaCodec.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = this.mediaCodec.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(this.bufferInfo, 100000L);
            if (iDequeueOutputBuffer == -1) {
                if (!endOfStream) {
                    return;
                }
                if (this.options.getSessionReplay().u()) {
                    this.options.getLogger().c(b7.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = this.mediaCodec.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (this.frameMuxer.getStarted()) {
                    throw new RuntimeException("format changed twice");
                }
                MediaFormat outputFormat = this.mediaCodec.getOutputFormat();
                s.j(outputFormat, "getOutputFormat(...)");
                if (this.options.getSessionReplay().u()) {
                    this.options.getLogger().c(b7.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new Object[0]);
                }
                this.frameMuxer.e(outputFormat);
            } else if (iDequeueOutputBuffer < 0) {
                if (this.options.getSessionReplay().u()) {
                    this.options.getLogger().c(b7.DEBUG, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer, new Object[0]);
                }
            } else {
                if (outputBuffers == null || (byteBuffer = outputBuffers[iDequeueOutputBuffer]) == null) {
                    throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                }
                if ((this.bufferInfo.flags & 2) != 0) {
                    if (this.options.getSessionReplay().u()) {
                        this.options.getLogger().c(b7.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                    }
                    this.bufferInfo.size = 0;
                }
                if (this.bufferInfo.size != 0) {
                    if (!this.frameMuxer.getStarted()) {
                        throw new RuntimeException("muxer hasn't started");
                    }
                    this.frameMuxer.c(byteBuffer, this.bufferInfo);
                    if (this.options.getSessionReplay().u()) {
                        this.options.getLogger().c(b7.DEBUG, "[Encoder]: sent " + this.bufferInfo.size + " bytes to muxer", new Object[0]);
                    }
                }
                this.mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((this.bufferInfo.flags & 4) != 0) {
                    if (this.options.getSessionReplay().u()) {
                        if (endOfStream) {
                            this.options.getLogger().c(b7.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                            return;
                        } else {
                            this.options.getLogger().c(b7.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    private final boolean d() {
        return ((Boolean) this.hasExynosCodec.getValue()).booleanValue();
    }

    private final MediaFormat f() {
        return (MediaFormat) this.mediaFormat.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    public final void b(Bitmap image) {
        Surface surface;
        Canvas canvasLockCanvas;
        s.k(image, "image");
        String MANUFACTURER = Build.MANUFACTURER;
        s.j(MANUFACTURER, "MANUFACTURER");
        if (t.f0(MANUFACTURER, "xiaomi", true)) {
            surface = this.surface;
            if (surface != null) {
                canvasLockCanvas = surface.lockCanvas(null);
            } else {
                canvasLockCanvas = null;
            }
        } else {
            s.j(MANUFACTURER, "MANUFACTURER");
            if (t.f0(MANUFACTURER, "motorola", true)) {
                surface = this.surface;
                if (surface != null) {
                    canvasLockCanvas = surface.lockCanvas(null);
                } else {
                    canvasLockCanvas = null;
                }
            } else {
                n nVar = n.f80186a;
                n.a aVar = n.a.SOC_MANUFACTURER;
                if (t.M(n.b(nVar, aVar, null, 2, null), "spreadtrum", true) || t.M(n.b(nVar, aVar, null, 2, null), "unisoc", true)) {
                    surface = this.surface;
                    if (surface != null) {
                        canvasLockCanvas = surface.lockCanvas(null);
                    } else {
                        canvasLockCanvas = null;
                    }
                } else {
                    Surface surface2 = this.surface;
                    if (surface2 != null) {
                        canvasLockCanvas = surface2.lockHardwareCanvas();
                    } else {
                        canvasLockCanvas = null;
                    }
                }
            }
        }
        if (canvasLockCanvas != null) {
            canvasLockCanvas.drawBitmap(image, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        }
        Surface surface3 = this.surface;
        if (surface3 != null) {
            surface3.unlockCanvasAndPost(canvasLockCanvas);
        }
        a(false);
    }

    public final long c() {
        return this.frameMuxer.a();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final MediaCodec getMediaCodec() {
        return this.mediaCodec;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final MuxerConfig getMuxerConfig() {
        return this.muxerConfig;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final q7 getOptions() {
        return this.options;
    }

    public final void i() {
        try {
            wn0.a<h0> aVar = this.onClose;
            if (aVar != null) {
                aVar.invoke();
            }
            a(true);
            this.mediaCodec.stop();
            this.mediaCodec.release();
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
            }
            this.frameMuxer.d();
        } catch (Throwable th2) {
            this.options.getLogger().a(b7.DEBUG, "Failed to properly release video encoder", th2);
        }
    }

    public final void j() {
        this.mediaCodec.configure(f(), (Surface) null, (MediaCrypto) null, 1);
        this.surface = this.mediaCodec.createInputSurface();
        this.mediaCodec.start();
        a(false);
    }

    public /* synthetic */ c(q7 q7Var, MuxerConfig muxerConfig, wn0.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(q7Var, muxerConfig, (i11 & 4) != 0 ? null : aVar);
    }
}
