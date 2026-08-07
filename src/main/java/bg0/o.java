package bg0;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.view.Surface;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.util.GmsVersion;
import java.io.File;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;
import zf0.AudioConfiguration;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00112\u00020\u0001:\u0001 B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0012H\u0086@¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R*\u0010/\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00102\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00101R\u0016\u00105\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00106R\u0016\u00108\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u0011\u0010:\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b3\u00109¨\u0006;"}, d2 = {"Lbg0/o;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbg0/i;", "cameraChoice", "", "fps", "orientationHint", "", "isAudioRequired", "<init>", "(Landroid/content/Context;Lbg0/i;IIZ)V", "isInitialPrepare", "Ljn0/h0;", "m", "(Z)V", "k", "Ljava/io/File;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/io/File;", "Landroid/media/MediaRecorder;", "j", "()Landroid/media/MediaRecorder;", "g", "()I", "o", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "f", "()V", "l", "a", "Landroid/content/Context;", "b", "Lbg0/i;", "c", "I", DateTokenConverter.CONVERTER_KEY, "e", "Z", "Lkotlin/Function0;", "Lwn0/a;", "getOnSurfaceChanged", "()Lwn0/a;", "n", "(Lwn0/a;)V", "onSurfaceChanged", "Landroid/view/Surface;", "Landroid/view/Surface;", "_surface", "h", "Ljava/io/File;", "currentFile", "Landroid/media/MediaRecorder;", "mediaRecorder", "isPrepared", "()Landroid/view/Surface;", "surface", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final boolean f17158l = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CameraChoice cameraChoice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int fps;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int orientationHint;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isAudioRequired;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private wn0.a<h0> onSurfaceChanged;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Surface _surface;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private File currentFile;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private MediaRecorder mediaRecorder;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isPrepared;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper$startRecording$2", f = "MediaRecorderWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17169n;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return o.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f17169n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            try {
                o.this.mediaRecorder.start();
            } catch (IllegalStateException unused) {
                o.this.mediaRecorder.reset();
                o.this.k(false);
                o.this.mediaRecorder.start();
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.MediaRecorderWrapper$stopRecording$2", f = "MediaRecorderWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super File>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17171n;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return o.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            File file;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f17171n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            try {
                o.this.mediaRecorder.stop();
                file = o.this.currentFile;
            } catch (RuntimeException unused) {
                o.this.currentFile.delete();
                file = null;
            }
            o.this.mediaRecorder.release();
            o oVar = o.this;
            oVar.mediaRecorder = oVar.j();
            o.this.k(false);
            return file;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public o(Context context, CameraChoice cameraChoice, int i11, int i12, boolean z11) {
        s.k(context, "context");
        s.k(cameraChoice, "cameraChoice");
        this.context = context;
        this.cameraChoice = cameraChoice;
        this.fps = i11;
        this.orientationHint = i12;
        this.isAudioRequired = z11;
        this._surface = f17158l ? MediaCodec.createPersistentInputSurface() : null;
        this.currentFile = i();
        this.mediaRecorder = j();
    }

    private final int g() {
        int width = this.cameraChoice.getSize().getWidth() * this.cameraChoice.getSize().getHeight();
        if (width <= 172800) {
            return 400000;
        }
        if (width <= 409920) {
            return 500000;
        }
        if (width <= 921600) {
            return 1500000;
        }
        if (width <= 2073600) {
            return 3000000;
        }
        if (width <= 3686400) {
            return GmsVersion.VERSION_MANCHEGO;
        }
        return 10000000;
    }

    private final File i() {
        return new File(this.context.getCacheDir(), "video_recording_" + System.currentTimeMillis() + ".mp4");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaRecorder j() {
        if (Build.VERSION.SDK_INT < 31) {
            return new MediaRecorder();
        }
        n.a();
        return m.a(this.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(boolean isInitialPrepare) throws Throwable {
        if (!isInitialPrepare) {
            this.currentFile = i();
        }
        m(isInitialPrepare);
    }

    private final void m(boolean isInitialPrepare) throws Throwable {
        wn0.a<h0> aVar;
        boolean z11 = yh0.f.e(this.context) && this.isAudioRequired;
        this.mediaRecorder.setVideoSource(2);
        if (z11) {
            this.mediaRecorder.setAudioSource(1);
        }
        this.mediaRecorder.setOutputFormat(2);
        this.mediaRecorder.setVideoFrameRate(this.fps);
        this.mediaRecorder.setVideoSize(this.cameraChoice.getSize().getWidth(), this.cameraChoice.getSize().getHeight());
        this.mediaRecorder.setVideoEncoder(2);
        this.mediaRecorder.setVideoEncodingBitRate(g());
        if (z11) {
            AudioConfiguration audioConfigurationA = zf0.d.a();
            if (audioConfigurationA != null) {
                this.mediaRecorder.setAudioSamplingRate(audioConfigurationA.getSampleRateInHz());
                this.mediaRecorder.setAudioChannels(1);
            }
            this.mediaRecorder.setAudioEncoder(3);
        }
        this.mediaRecorder.setOrientationHint(this.orientationHint);
        boolean z12 = f17158l;
        if (z12) {
            this.mediaRecorder.setInputSurface(h());
        }
        this.mediaRecorder.setOutputFile(this.currentFile.getAbsolutePath());
        this.mediaRecorder.prepare();
        if (z12 || isInitialPrepare || (aVar = this.onSurfaceChanged) == null) {
            return;
        }
        aVar.invoke();
    }

    public final void f() {
        try {
            h().release();
        } catch (RuntimeException unused) {
        }
        try {
            this.mediaRecorder.stop();
        } catch (RuntimeException unused2) {
        } finally {
            this.currentFile.delete();
        }
    }

    public final Surface h() {
        Surface surface = this._surface;
        if (surface != null) {
            return surface;
        }
        Surface surface2 = this.mediaRecorder.getSurface();
        s.j(surface2, "getSurface(...)");
        return surface2;
    }

    public final void l() {
        if (this.isPrepared) {
            return;
        }
        this.isPrepared = true;
        k(true);
    }

    public final void n(wn0.a<h0> aVar) {
        this.onSurfaceChanged = aVar;
    }

    public final Object o(Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getDefault(), new b(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    public final Object p(Continuation<? super File> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new c(null), continuation);
    }
}
