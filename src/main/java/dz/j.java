package dz;

import android.content.Context;
import android.media.AudioManager;
import android.util.Log;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import c0.a2;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.UiThreadUtil;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.mrousavy.camera.frameprocessors.Frame;
import com.plaid.internal.EnumC4419g;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ¨\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0017\u001fB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ$\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000eH\u0087@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010(\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R \u0010/\u001a\b\u0012\u0004\u0012\u00020*0)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R$\u00107\u001a\u0004\u0018\u0001008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010?\u001a\u0004\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010G\u001a\u0004\u0018\u00010@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR*\u0010P\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010H8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010X\u001a\u0004\u0018\u00010Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010\\\u001a\u0004\u0018\u00010Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010S\u001a\u0004\bZ\u0010U\"\u0004\b[\u0010WR(\u0010e\u001a\b\u0012\u0004\u0012\u00020^0]8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001a\u0010k\u001a\u00020f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u001a\u0010q\u001a\u00020l8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR$\u0010w\u001a\u0004\u0018\u00010I8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001a\u0010}\u001a\u00020x8\u0000X\u0080\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R'\u0010\u0084\u0001\u001a\u00020~8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b\u0013\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010\u008a\u0001\u001a\u00030\u0085\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R,\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R(\u0010\u0096\u0001\u001a\u00020~8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u0093\u0001\u0010\u007f\u001a\u0006\b\u0094\u0001\u0010\u0081\u0001\"\u0006\b\u0095\u0001\u0010\u0083\u0001R\u001f\u0010\u009b\u0001\u001a\u00030\u0097\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0014\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R \u0010¡\u0001\u001a\u00030\u009c\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0013\u0010\u0016\u001a\u00020\u00158F¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010§\u0001\u001a\u00030¤\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001¨\u0006©\u0001"}, d2 = {"Ldz/j;", "Ljava/io/Closeable;", "Landroidx/lifecycle/LifecycleOwner;", "Ldz/j1$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ldz/j$b;", "callback", "<init>", "(Landroid/content/Context;Ldz/j$b;)V", "Ljn0/h0;", "C", "()V", "close", "Lkotlin/Function1;", "Ldz/a;", "lambda", "B", "(Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "t", "Lfz/i;", "outputOrientation", "c", "(Lfz/i;)V", "previewOrientation", "n", "a", "Landroid/content/Context;", "c0", "()Landroid/content/Context;", "b", "Ldz/j$b;", "I", "()Ldz/j$b;", "Ldz/a;", "b0", "()Ldz/a;", "setConfiguration$react_native_vision_camera_release", "(Ldz/a;)V", "configuration", "Lcom/google/common/util/concurrent/s;", "Lx0/h;", DateTokenConverter.CONVERTER_KEY, "Lcom/google/common/util/concurrent/s;", "getCameraProvider$react_native_vision_camera_release", "()Lcom/google/common/util/concurrent/s;", "cameraProvider", "Lc0/i;", "e", "Lc0/i;", "J", "()Lc0/i;", "G0", "(Lc0/i;)V", "camera", "Lc0/h1;", "f", "Lc0/h1;", "u0", "()Lc0/h1;", "P0", "(Lc0/h1;)V", "previewOutput", "Lc0/r0;", "g", "Lc0/r0;", "t0", "()Lc0/r0;", "O0", "(Lc0/r0;)V", "photoOutput", "Lz0/r1;", "Lz0/t0;", "h", "Lz0/r1;", "z0", "()Lz0/r1;", "c1", "(Lz0/r1;)V", "videoOutput", "Landroidx/camera/core/f;", IntegerTokenConverter.CONVERTER_KEY, "Landroidx/camera/core/f;", "k0", "()Landroidx/camera/core/f;", "K0", "(Landroidx/camera/core/f;)V", "frameProcessorOutput", "j", "T", "H0", "codeScannerOutput", "", "Lc0/a2;", "k", "Ljava/util/List;", "e0", "()Ljava/util/List;", "J0", "(Ljava/util/List;)V", "currentUseCases", "Ldz/d1;", "l", "Ldz/d1;", "r0", "()Ldz/d1;", "metadataProvider", "Ldz/j1;", "m", "Ldz/j1;", "getOrientationManager$react_native_vision_camera_release", "()Ldz/j1;", "orientationManager", "Lz0/t0;", "w0", "()Lz0/t0;", "T0", "(Lz0/t0;)V", "recorderOutput", "Lkotlinx/coroutines/sync/Mutex;", "o", "Lkotlinx/coroutines/sync/Mutex;", "getMutex$react_native_vision_camera_release", "()Lkotlinx/coroutines/sync/Mutex;", "mutex", "", "Z", "isDestroyed$react_native_vision_camera_release", "()Z", "setDestroyed$react_native_vision_camera_release", "(Z)V", "isDestroyed", "Landroidx/lifecycle/y;", "q", "Landroidx/lifecycle/y;", "n0", "()Landroidx/lifecycle/y;", "lifecycleRegistry", "Lz0/g1;", "r", "Lz0/g1;", "y0", "()Lz0/g1;", "U0", "(Lz0/g1;)V", "recording", "s", "D0", "Y0", "isRecordingCanceled", "Landroid/media/AudioManager;", "Landroid/media/AudioManager;", "H", "()Landroid/media/AudioManager;", "audioManager", "Ljava/util/concurrent/Executor;", "u", "Ljava/util/concurrent/Executor;", "getMainExecutor$react_native_vision_camera_release", "()Ljava/util/concurrent/Executor;", "mainExecutor", "s0", "()Lfz/i;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "v", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements Closeable, LifecycleOwner, j1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b callback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private CameraConfiguration configuration;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.google.common.util.concurrent.s<x0.h> cameraProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private c0.i camera;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private c0.h1 previewOutput;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private c0.r0 photoOutput;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private z0.r1<z0.t0> videoOutput;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private androidx.camera.core.f frameProcessorOutput;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private androidx.camera.core.f codeScannerOutput;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private List<? extends a2> currentUseCases;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final d1 metadataProvider;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final j1 orientationManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private z0.t0 recorderOutput;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Mutex mutex;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isDestroyed;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final androidx.p003lifecycle.y lifecycleRegistry;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private z0.g1 recording;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isRecordingCanceled;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final AudioManager audioManager;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Executor mainExecutor;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"dz/j$a", "Landroidx/lifecycle/u;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$a;", "event", "Ljn0/h0;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$a;)V", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements androidx.p003lifecycle.u {
        a() {
        }

        @Override // androidx.p003lifecycle.u
        public void onStateChanged(LifecycleOwner source, Lifecycle.a event) {
            p013kotlin.jvm.internal.s.k(source, "source");
            p013kotlin.jvm.internal.s.k(event, "event");
            Log.i("CameraSession", "Camera Lifecycle changed to " + event.getTargetState() + "!");
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0013H&¢\u0006\u0004\b\u0018\u0010\u0016J%\u0010\u001e\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ldz/j$b;", "", "", AnalyticsAttribute.Error, "Ljn0/h0;", "onError", "(Ljava/lang/Throwable;)V", "Lcom/mrousavy/camera/frameprocessors/Frame;", "frame", "q", "(Lcom/mrousavy/camera/frameprocessors/Frame;)V", DateTokenConverter.CONVERTER_KEY, "()V", "o", "b", "Lfz/r;", "type", "p", "(Lfz/r;)V", "Lfz/i;", "outputOrientation", "c", "(Lfz/i;)V", "previewOrientation", "n", "", "Ltx/a;", "codes", "Ldz/x;", "scannerFrame", "r", "(Ljava/util/List;Ldz/x;)V", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void b();

        void c(fz.i outputOrientation);

        void d();

        void n(fz.i previewOrientation);

        void o();

        void onError(Throwable error);

        void p(fz.r type);

        void q(Frame frame);

        void r(List<? extends tx.a> codes, CodeScannerFrame scannerFrame);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            j.this.getLifecycleRegistry().o(Lifecycle.State.DESTROYED);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mrousavy.camera.core.CameraSession", f = "CameraSession.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {108, EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 149}, m = "configure", n = {"this", "lambda", "this", "lambda", "provider", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "config", "diff"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f61184n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f61185o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f61186p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f61187q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f61188r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f61190t;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f61188r = obj;
            this.f61190t |= Integer.MIN_VALUE;
            return j.this.B(null, this);
        }
    }

    public j(Context context, b callback) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.context = context;
        this.callback = callback;
        this.cameraProvider = x0.h.INSTANCE.b(context);
        this.currentUseCases = p013kotlin.collections.v.m();
        this.metadataProvider = new d1(context);
        this.orientationManager = new j1(context, this);
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        androidx.p003lifecycle.y yVar = new androidx.p003lifecycle.y(this);
        this.lifecycleRegistry = yVar;
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService;
        Executor mainExecutor = androidx.core.content.b.getMainExecutor(context);
        p013kotlin.jvm.internal.s.j(mainExecutor, "getMainExecutor(...)");
        this.mainExecutor = mainExecutor;
        yVar.o(Lifecycle.State.CREATED);
        getLifecycle().a(new a());
    }

    private final void C() {
        int surfaceRotation = this.orientationManager.h().toSurfaceRotation();
        c0.h1 h1Var = this.previewOutput;
        if (h1Var != null) {
            h1Var.n0(surfaceRotation);
        }
        androidx.camera.core.f fVar = this.codeScannerOutput;
        if (fVar != null) {
            fVar.o0(surfaceRotation);
        }
        int surfaceRotation2 = this.orientationManager.g().toSurfaceRotation();
        c0.r0 r0Var = this.photoOutput;
        if (r0Var != null) {
            r0Var.G0(surfaceRotation2);
        }
        z0.r1<z0.t0> r1Var = this.videoOutput;
        if (r1Var != null) {
            r1Var.Q0(surfaceRotation2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c5 A[Catch: all -> 0x00cc, TryCatch #5 {all -> 0x00cc, blocks: (B:78:0x019a, B:38:0x00ac, B:39:0x00b4, B:40:0x00b7, B:42:0x00c5, B:45:0x00cf, B:47:0x00d3, B:48:0x00da, B:83:0x01a5), top: B:104:0x00ac, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf A[Catch: all -> 0x00cc, TryCatch #5 {all -> 0x00cc, blocks: (B:78:0x019a, B:38:0x00ac, B:39:0x00b4, B:40:0x00b7, B:42:0x00c5, B:45:0x00cf, B:47:0x00d3, B:48:0x00da, B:83:0x01a5), top: B:104:0x00ac, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d3 A[Catch: all -> 0x00cc, TryCatch #5 {all -> 0x00cc, blocks: (B:78:0x019a, B:38:0x00ac, B:39:0x00b4, B:40:0x00b7, B:42:0x00c5, B:45:0x00cf, B:47:0x00d3, B:48:0x00da, B:83:0x01a5), top: B:104:0x00ac, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00da A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #5 {all -> 0x00cc, blocks: (B:78:0x019a, B:38:0x00ac, B:39:0x00b4, B:40:0x00b7, B:42:0x00c5, B:45:0x00cf, B:47:0x00d3, B:48:0x00da, B:83:0x01a5), top: B:104:0x00ac, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f4 A[Catch: all -> 0x00fb, TryCatch #4 {all -> 0x00fb, blocks: (B:49:0x00ee, B:51:0x00f4, B:54:0x0101, B:56:0x0107), top: B:102:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0107 A[Catch: all -> 0x00fb, TRY_LEAVE, TryCatch #4 {all -> 0x00fb, blocks: (B:49:0x00ee, B:51:0x00f4, B:54:0x0101, B:56:0x0107), top: B:102:0x00ee }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0118  */
    /* JADX WARN: Code duplicated, block: B:61:0x011e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0127 A[Catch: all -> 0x0043, TryCatch #3 {all -> 0x0043, blocks: (B:14:0x003e, B:62:0x0121, B:64:0x0127, B:65:0x012a, B:67:0x0130, B:68:0x0133, B:70:0x0139, B:71:0x0142, B:73:0x0148, B:74:0x0151), top: B:100:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0130 A[Catch: all -> 0x0043, TryCatch #3 {all -> 0x0043, blocks: (B:14:0x003e, B:62:0x0121, B:64:0x0127, B:65:0x012a, B:67:0x0130, B:68:0x0133, B:70:0x0139, B:71:0x0142, B:73:0x0148, B:74:0x0151), top: B:100:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0139 A[Catch: all -> 0x0043, TryCatch #3 {all -> 0x0043, blocks: (B:14:0x003e, B:62:0x0121, B:64:0x0127, B:65:0x012a, B:67:0x0130, B:68:0x0133, B:70:0x0139, B:71:0x0142, B:73:0x0148, B:74:0x0151), top: B:100:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0148 A[Catch: all -> 0x0043, TryCatch #3 {all -> 0x0043, blocks: (B:14:0x003e, B:62:0x0121, B:64:0x0127, B:65:0x012a, B:67:0x0130, B:68:0x0133, B:70:0x0139, B:71:0x0142, B:73:0x0148, B:74:0x0151), top: B:100:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00da, please report this as an issue */
    public final Object B(wn0.l<? super CameraConfiguration, jn0.h0> lVar, Continuation<? super jn0.h0> continuation) throws Throwable {
        e eVar;
        j jVar;
        x0.h hVar;
        wn0.l<? super CameraConfiguration, jn0.h0> lVar2;
        Mutex mutex;
        CameraConfiguration cameraConfigurationA;
        CameraConfiguration.Difference differenceB;
        j jVar2;
        Mutex mutex2;
        CameraConfiguration.Difference difference;
        CameraConfiguration cameraConfiguration;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f61190t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f61190t = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objA = eVar.f61188r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f61190t;
        if (i12 == 0) {
            jn0.t.b(objA);
            if (!UiThreadUtil.isOnUiThread()) {
                throw new Error("configure { ... } must be called from the Main UI Thread!");
            }
            Log.i("CameraSession", "configure { ... }: Waiting for lock...");
            try {
                com.google.common.util.concurrent.s<x0.h> sVar = this.cameraProvider;
                Executor executor = this.mainExecutor;
                eVar.f61184n = this;
                eVar.f61185o = lVar;
                eVar.f61190t = 1;
                objA = ez.h.a(sVar, executor, eVar);
                if (objA != coroutine_suspended) {
                    jVar = this;
                }
                return coroutine_suspended;
            } catch (Throwable th2) {
                th = th2;
                jVar = this;
                Log.e("CameraSession", "Failed to get CameraProvider! Error: " + th.getMessage(), th);
                jVar.callback.onError(th);
                return jn0.h0.f84049a;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                difference = (CameraConfiguration.Difference) eVar.f61187q;
                cameraConfiguration = (CameraConfiguration) eVar.f61186p;
                mutex2 = (Mutex) eVar.f61185o;
                jVar2 = (j) eVar.f61184n;
                try {
                    jn0.t.b(objA);
                    cameraConfigurationA = cameraConfiguration;
                    if (difference.getSidePropsChanged()) {
                        r.s(jVar2, cameraConfigurationA);
                    }
                    if (difference.getIsActiveChanged()) {
                        r.k(jVar2, cameraConfigurationA);
                    }
                    if (difference.getOrientationChanged()) {
                        jVar2.orientationManager.j(cameraConfigurationA.getOutputOrientation());
                    }
                    if (difference.getLocationChanged()) {
                        jVar2.metadataProvider.a(cameraConfigurationA.getEnableLocation());
                    }
                    Log.i("CameraSession", "configure { ... }: Completed CameraSession Configuration! (State: " + jVar2.getLifecycle().getState() + ")");
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        Log.e("CameraSession", "Failed to configure CameraSession! Error: " + th.getMessage() + ", Config-Diff: " + difference, th);
                        jVar2.callback.onError(th);
                    } catch (Throwable th4) {
                        th = th4;
                        mutex = mutex2;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                mutex = mutex2;
                jn0.h0 h0Var = jn0.h0.f84049a;
                mutex.unlock(null);
                return jn0.h0.f84049a;
            }
            mutex = (Mutex) eVar.f61187q;
            x0.h hVar2 = (x0.h) eVar.f61186p;
            lVar2 = (wn0.l) eVar.f61185o;
            j jVar3 = (j) eVar.f61184n;
            jn0.t.b(objA);
            hVar = hVar2;
            jVar = jVar3;
            try {
                CameraConfiguration.Companion companion = CameraConfiguration.INSTANCE;
                cameraConfigurationA = companion.a(jVar.configuration);
                try {
                    lVar2.invoke(cameraConfigurationA);
                    differenceB = companion.b(jVar.configuration, cameraConfigurationA);
                    jVar.configuration = cameraConfigurationA;
                    if (!differenceB.b()) {
                        Log.i("CameraSession", "Nothing changed, aborting configure { ... }");
                    } else if (jVar.isDestroyed) {
                        Log.i("CameraSession", "CameraSession is already destroyed. Skipping configure { ... }");
                    } else {
                        Log.i("CameraSession", "configure { ... }: Updating CameraSession Configuration... " + differenceB);
                        try {
                            if (differenceB.getOutputsChanged()) {
                                r.l(jVar, cameraConfigurationA);
                                jVar.C();
                            }
                            if (differenceB.getDeviceChanged()) {
                                eVar.f61184n = jVar;
                                eVar.f61185o = mutex;
                                eVar.f61186p = cameraConfigurationA;
                                eVar.f61187q = differenceB;
                                eVar.f61190t = 3;
                                if (r.i(jVar, hVar, cameraConfigurationA, eVar) != coroutine_suspended) {
                                    jVar2 = jVar;
                                    cameraConfiguration = cameraConfigurationA;
                                    mutex2 = mutex;
                                    difference = differenceB;
                                    cameraConfigurationA = cameraConfiguration;
                                }
                                return coroutine_suspended;
                            }
                            jVar2 = jVar;
                            mutex2 = mutex;
                            difference = differenceB;
                            if (difference.getSidePropsChanged()) {
                                r.s(jVar2, cameraConfigurationA);
                            }
                            if (difference.getIsActiveChanged()) {
                                r.k(jVar2, cameraConfigurationA);
                            }
                            if (difference.getOrientationChanged()) {
                                jVar2.orientationManager.j(cameraConfigurationA.getOutputOrientation());
                            }
                            if (difference.getLocationChanged()) {
                                jVar2.metadataProvider.a(cameraConfigurationA.getEnableLocation());
                            }
                            Log.i("CameraSession", "configure { ... }: Completed CameraSession Configuration! (State: " + jVar2.getLifecycle().getState() + ")");
                        } catch (Throwable th5) {
                            th = th5;
                            jVar2 = jVar;
                            mutex2 = mutex;
                            difference = differenceB;
                            Log.e("CameraSession", "Failed to configure CameraSession! Error: " + th.getMessage() + ", Config-Diff: " + difference, th);
                            jVar2.callback.onError(th);
                        }
                        mutex = mutex2;
                    }
                    jn0.h0 h0Var2 = jn0.h0.f84049a;
                    mutex.unlock(null);
                    return jn0.h0.f84049a;
                } catch (CameraConfiguration.C1247a unused) {
                    jn0.h0 h0Var3 = jn0.h0.f84049a;
                    mutex.unlock(null);
                    return h0Var3;
                }
            } catch (Throwable th6) {
                th = th6;
                mutex.unlock(null);
                throw th;
            }
        }
        lVar = (wn0.l) eVar.f61185o;
        jVar = (j) eVar.f61184n;
        try {
            jn0.t.b(objA);
        } catch (Throwable th7) {
            th = th7;
            Log.e("CameraSession", "Failed to get CameraProvider! Error: " + th.getMessage(), th);
            jVar.callback.onError(th);
            return jn0.h0.f84049a;
        }
        hVar = (x0.h) objA;
        Mutex mutex3 = jVar.mutex;
        eVar.f61184n = jVar;
        eVar.f61185o = lVar;
        eVar.f61186p = hVar;
        eVar.f61187q = mutex3;
        eVar.f61190t = 2;
        if (mutex3.lock(null, eVar) != coroutine_suspended) {
            lVar2 = lVar;
            mutex = mutex3;
            CameraConfiguration.Companion companion2 = CameraConfiguration.INSTANCE;
            cameraConfigurationA = companion2.a(jVar.configuration);
            lVar2.invoke(cameraConfigurationA);
            differenceB = companion2.b(jVar.configuration, cameraConfigurationA);
            jVar.configuration = cameraConfigurationA;
            if (!differenceB.b()) {
                Log.i("CameraSession", "Nothing changed, aborting configure { ... }");
            } else if (jVar.isDestroyed) {
                Log.i("CameraSession", "CameraSession is already destroyed. Skipping configure { ... }");
            } else {
                Log.i("CameraSession", "configure { ... }: Updating CameraSession Configuration... " + differenceB);
                if (differenceB.getOutputsChanged()) {
                    r.l(jVar, cameraConfigurationA);
                    jVar.C();
                }
                if (differenceB.getDeviceChanged()) {
                    eVar.f61184n = jVar;
                    eVar.f61185o = mutex;
                    eVar.f61186p = cameraConfigurationA;
                    eVar.f61187q = differenceB;
                    eVar.f61190t = 3;
                    if (r.i(jVar, hVar, cameraConfigurationA, eVar) != coroutine_suspended) {
                        jVar2 = jVar;
                        cameraConfiguration = cameraConfigurationA;
                        mutex2 = mutex;
                        difference = differenceB;
                        cameraConfigurationA = cameraConfiguration;
                    }
                } else {
                    jVar2 = jVar;
                    mutex2 = mutex;
                    difference = differenceB;
                }
                if (difference.getSidePropsChanged()) {
                    r.s(jVar2, cameraConfigurationA);
                }
                if (difference.getIsActiveChanged()) {
                    r.k(jVar2, cameraConfigurationA);
                }
                if (difference.getOrientationChanged()) {
                    jVar2.orientationManager.j(cameraConfigurationA.getOutputOrientation());
                }
                if (difference.getLocationChanged()) {
                    jVar2.metadataProvider.a(cameraConfigurationA.getEnableLocation());
                }
                Log.i("CameraSession", "configure { ... }: Completed CameraSession Configuration! (State: " + jVar2.getLifecycle().getState() + ")");
                mutex = mutex2;
            }
            jn0.h0 h0Var4 = jn0.h0.f84049a;
            mutex.unlock(null);
            return jn0.h0.f84049a;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: D0, reason: from getter */
    public final boolean getIsRecordingCanceled() {
        return this.isRecordingCanceled;
    }

    public final void G0(c0.i iVar) {
        this.camera = iVar;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final AudioManager getAudioManager() {
        return this.audioManager;
    }

    public final void H0(androidx.camera.core.f fVar) {
        this.codeScannerOutput = fVar;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final b getCallback() {
        return this.callback;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final c0.i getCamera() {
        return this.camera;
    }

    public final void J0(List<? extends a2> list) {
        p013kotlin.jvm.internal.s.k(list, "<set-?>");
        this.currentUseCases = list;
    }

    public final void K0(androidx.camera.core.f fVar) {
        this.frameProcessorOutput = fVar;
    }

    public final void O0(c0.r0 r0Var) {
        this.photoOutput = r0Var;
    }

    public final void P0(c0.h1 h1Var) {
        this.previewOutput = h1Var;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final androidx.camera.core.f getCodeScannerOutput() {
        return this.codeScannerOutput;
    }

    public final void T0(z0.t0 t0Var) {
        this.recorderOutput = t0Var;
    }

    public final void U0(z0.g1 g1Var) {
        this.recording = g1Var;
    }

    public final void Y0(boolean z11) {
        this.isRecordingCanceled = z11;
    }

    /* JADX INFO: renamed from: b0, reason: from getter */
    public final CameraConfiguration getConfiguration() {
        return this.configuration;
    }

    @Override // dz.j1.a
    public void c(fz.i outputOrientation) {
        p013kotlin.jvm.internal.s.k(outputOrientation, "outputOrientation");
        Log.i("CameraSession", "Output orientation changed! " + outputOrientation);
        C();
        this.callback.c(outputOrientation);
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final void c1(z0.r1<z0.t0> r1Var) {
        this.videoOutput = r1Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Log.i("CameraSession", "Closing CameraSession...");
        this.isDestroyed = true;
        this.orientationManager.k();
        if (UiThreadUtil.isOnUiThread()) {
            getLifecycleRegistry().o(Lifecycle.State.DESTROYED);
        } else {
            UiThreadUtil.runOnUiThread(new d());
        }
    }

    public final List<a2> e0() {
        return this.currentUseCases;
    }

    @Override // androidx.p003lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final androidx.camera.core.f getFrameProcessorOutput() {
        return this.frameProcessorOutput;
    }

    @Override // dz.j1.a
    public void n(fz.i previewOrientation) {
        p013kotlin.jvm.internal.s.k(previewOrientation, "previewOrientation");
        Log.i("CameraSession", "Preview orientation changed! " + previewOrientation);
        C();
        this.callback.n(previewOrientation);
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final androidx.p003lifecycle.y getLifecycleRegistry() {
        return this.lifecycleRegistry;
    }

    public final void p() {
        if (androidx.core.content.b.checkSelfPermission(this.context, "android.permission.CAMERA") != 0) {
            throw new h();
        }
    }

    /* JADX INFO: renamed from: r0, reason: from getter */
    public final d1 getMetadataProvider() {
        return this.metadataProvider;
    }

    public final fz.i s0() {
        return this.orientationManager.g();
    }

    public final void t() throws e1 {
        if (androidx.core.content.b.checkSelfPermission(this.context, "android.permission.RECORD_AUDIO") != 0) {
            throw new e1();
        }
    }

    /* JADX INFO: renamed from: t0, reason: from getter */
    public final c0.r0 getPhotoOutput() {
        return this.photoOutput;
    }

    /* JADX INFO: renamed from: u0, reason: from getter */
    public final c0.h1 getPreviewOutput() {
        return this.previewOutput;
    }

    /* JADX INFO: renamed from: w0, reason: from getter */
    public final z0.t0 getRecorderOutput() {
        return this.recorderOutput;
    }

    /* JADX INFO: renamed from: y0, reason: from getter */
    public final z0.g1 getRecording() {
        return this.recording;
    }

    public final z0.r1<z0.t0> z0() {
        return this.videoOutput;
    }
}
