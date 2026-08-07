package com.withpersona.sdk2.camera.camera2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.Image;
import android.media.ImageReader;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.SurfaceHolder;
import bg0.CameraChoice;
import bg0.o;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.plaid.internal.EnumC4419g;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.withpersona.sdk2.camera.NoActiveRecordingError;
import com.withpersona.sdk2.camera.camera2.Camera2Manager;
import ezvcard.property.Gender;
import ezvcard.property.Kind;
import java.io.File;
import java.io.FileOutputStream;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import wn0.p;
import zf0.l0;
import zf0.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0004;\u009c\u0001=BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019H\u0086@¢\u0006\u0004\b\u001d\u0010\u001bJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019H\u0086@¢\u0006\u0004\b\u001e\u0010\u001bJ\u0015\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b#\u0010!J\r\u0010$\u001a\u00020\u0016¢\u0006\u0004\b$\u0010\u0018J\u0010\u0010%\u001a\u00020\u0016H\u0083@¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b&\u0010\u001bJ,\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+H\u0083@¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00162\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u0004\u0018\u00010\u001c*\u000203H\u0002¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0017\u0010R\u001a\u00020M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010b\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010PR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010i\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010p\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010t\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010v\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010HR\u0016\u0010x\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010HR\u0016\u0010z\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010HR\u0016\u0010|\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010HR#\u0010\u0080\u0001\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00190}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001d\u0010\u0083\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u007fR$\u0010\u0089\u0001\u001a\n\u0012\u0005\u0012\u00030\u0081\u00010\u0084\u00018\u0006¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010HR\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u0092\u0001\u001a\u00030\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010&R\u0019\u0010\u0095\u0001\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001f\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u0002030\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010\u0097\u0001R\u0019\u0010\u009b\u0001\u001a\u00030\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010\u009a\u0001¨\u0006\u009d\u0001"}, d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbg0/i;", "cameraChoice", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "previewView", "Lbg0/a;", "analyzer", "Lfg0/a;", "videoCaptureMethod", "Lej0/a;", "webRtcManager", "", "isAudioRequired", "Leg0/a;", "cameraStatsManager", "Lfi0/c;", "sdkFilesManager", "<init>", "(Landroid/content/Context;Lbg0/i;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lbg0/a;Lfg0/a;Lej0/a;ZLeg0/a;Lfi0/c;)V", "Ljn0/h0;", "T", "()V", "Ljn0/s;", "W", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/File;", "X", "Q", "analyzerEnabled", "S", "(Z)V", "enable", "G", "H", "L", Gender.FEMALE, "Landroid/hardware/camera2/CameraManager;", "manager", "", "cameraId", "Landroid/os/Handler;", "handler", "Landroid/hardware/camera2/CameraDevice;", Gender.OTHER, "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Landroid/os/Handler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/media/ImageReader;", Gender.MALE, "()Landroid/media/ImageReader;", "Landroid/media/Image;", "image", "P", "(Landroid/media/Image;)V", "R", "(Landroid/media/Image;)Ljava/io/File;", "a", "Landroid/content/Context;", "b", "Lbg0/i;", "c", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "J", "()Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", DateTokenConverter.CONVERTER_KEY, "Lbg0/a;", "e", "Lfg0/a;", "f", "Lej0/a;", "g", "Z", "h", "Leg0/a;", IntegerTokenConverter.CONVERTER_KEY, "Lfi0/c;", "Lzf0/u;", "j", "Lzf0/u;", "I", "()Lzf0/u;", "cameraProperties", "Lkotlinx/coroutines/CoroutineScope;", "k", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "l", "Ljava/lang/String;", "m", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroid/hardware/camera2/CameraCharacteristics;", "n", "Landroid/hardware/camera2/CameraCharacteristics;", "characteristics", "", "o", "orientation", "Lbg0/o;", "p", "Lbg0/o;", "mediaRecorderWrapper", "q", "Landroid/hardware/camera2/CameraDevice;", "camera", "Landroid/os/HandlerThread;", "r", "Landroid/os/HandlerThread;", "cameraThread", "s", "Landroid/os/Handler;", "cameraHandler", "Lcom/withpersona/sdk2/camera/camera2/b;", "t", "Lcom/withpersona/sdk2/camera/camera2/b;", "session", "u", "recordingStarted", "v", "isAnalyzerEnabled", "w", "isImageCaptureRequested", "x", "isPreviewSurfaceAvailable", "Lkotlinx/coroutines/flow/MutableStateFlow;", "y", "Lkotlinx/coroutines/flow/MutableStateFlow;", "imageCaptureResult", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$c;", "z", "_state", "Lkotlinx/coroutines/flow/StateFlow;", "A", "Lkotlinx/coroutines/flow/StateFlow;", "K", "()Lkotlinx/coroutines/flow/StateFlow;", "state", "B", "isPreviewStarted", "Landroid/view/SurfaceHolder$Callback;", "C", "Landroid/view/SurfaceHolder$Callback;", "surfaceHolderCallback", "", "D", "analysisSizeScaling", "E", "Landroid/media/ImageReader;", "imageReader", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "imageProcessingFlow", "Landroid/os/ConditionVariable;", "Landroid/os/ConditionVariable;", "processImageHaltedCv", "Error", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Camera2Manager {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final StateFlow<c> state;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean isPreviewStarted;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private SurfaceHolder.Callback surfaceHolderCallback;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private float analysisSizeScaling;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private ImageReader imageReader;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private MutableSharedFlow<Image> imageProcessingFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private ConditionVariable processImageHaltedCv;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CameraChoice cameraChoice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Camera2PreviewView previewView;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bg0.a analyzer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final fg0.a videoCaptureMethod;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ej0.a webRtcManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isAudioRequired;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final eg0.a cameraStatsManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final fi0.c sdkFilesManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final u cameraProperties;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String cameraId;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final CameraManager cameraManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CameraCharacteristics characteristics;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int orientation;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final o mediaRecorderWrapper;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private CameraDevice camera;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final HandlerThread cameraThread;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Handler cameraHandler;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private b session;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private volatile boolean recordingStarted;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private volatile boolean isAnalyzerEnabled;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private volatile boolean isImageCaptureRequested;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private volatile boolean isPreviewSurfaceAvailable;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<s<File>> imageCaptureResult;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<c> _state;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\n\u000bB\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0003\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "MissingPermissionsCameraError", "InitializationError", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error$InitializationError;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error$MissingPermissionsCameraError;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends Exception {

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error$InitializationError;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InitializationError extends Error {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitializationError(String message, Throwable cause) {
                super(message, cause, null);
                p013kotlin.jvm.internal.s.k(message, "message");
                p013kotlin.jvm.internal.s.k(cause, "cause");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error$MissingPermissionsCameraError;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error;", "<init>", "()V", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class MissingPermissionsCameraError extends Error {
            public MissingPermissionsCameraError() {
                super(null);
            }
        }

        public /* synthetic */ Error(String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th2);
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }

        private Error(String str, Throwable th2) {
            super(str, th2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$1", f = "Camera2Manager.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57215n;

        /* JADX INFO: renamed from: com.withpersona.sdk2.camera.camera2.Camera2Manager$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C1155a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Camera2Manager f57217a;

            C1155a(Camera2Manager camera2Manager) {
                this.f57217a = camera2Manager;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Image image, Continuation<? super h0> continuation) throws Exception {
                this.f57217a.P(image);
                return h0.f84049a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return Camera2Manager.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f57215n;
            if (i11 == 0) {
                t.b(obj);
                MutableSharedFlow mutableSharedFlow = Camera2Manager.this.imageProcessingFlow;
                C1155a c1155a = new C1155a(Camera2Manager.this);
                this.f57215n = 1;
                if (mutableSharedFlow.collect(c1155a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$c;", "", "a", DateTokenConverter.CONVERTER_KEY, "b", "c", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$c$a;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$c$b;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$c$c;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$c$d;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$c$a;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f57218a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1835001754;
            }

            public String toString() {
                return "Created";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$c$b;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f57219a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1111701481;
            }

            public String toString() {
                return "Destroyed";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.camera.camera2.Camera2Manager$c$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$c$c;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$c;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error;", AnalyticsAttribute.Error, "<init>", "(Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error;", "()Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Error error;

            public Error(Error error) {
                p013kotlin.jvm.internal.s.k(error, "error");
                this.error = error;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Error getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && p013kotlin.jvm.internal.s.f(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$c$d;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class d implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f57221a = new d();

            private d() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -465774081;
            }

            public String toString() {
                return "Started";
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$destroy$2", f = "Camera2Manager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57222n;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return Camera2Manager.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f57222n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Object value = Camera2Manager.this._state.getValue();
            c.b bVar = c.b.f57219a;
            if (p013kotlin.jvm.internal.s.f(value, bVar)) {
                return h0.f84049a;
            }
            Camera2Manager.this._state.setValue(bVar);
            Camera2Manager.this.getPreviewView().getHolder().removeCallback(Camera2Manager.this.surfaceHolderCallback);
            Camera2Manager.this.processImageHaltedCv.block(2000L);
            Camera2Manager.this.mediaRecorderWrapper.f();
            Camera2Manager.this.imageReader.close();
            b bVar2 = Camera2Manager.this.session;
            if (bVar2 != null) {
                bVar2.e();
            }
            Camera2Manager.this.session = null;
            CameraDevice cameraDevice = Camera2Manager.this.camera;
            if (cameraDevice != null) {
                cameraDevice.close();
            }
            Camera2Manager.this.camera = null;
            Camera2Manager.this.cameraStatsManager.a();
            CoroutineScopeKt.cancel$default(Camera2Manager.this.coroutineScope, null, 1, null);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$initializeCamera$2", f = "Camera2Manager.kt", i = {1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_HEADER_BOLT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {"camera"}, s = {"L$0"})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f57224n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f57225o;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return Camera2Manager.this.new e(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0070  */
        /* JADX WARN: Code duplicated, block: B:25:0x009a  */
        /* JADX WARN: Code duplicated, block: B:28:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:33:0x0119  */
        /* JADX WARN: Code duplicated, block: B:40:0x015d  */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
        
            if (r2 == r7) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x014d, code lost:
        
            if (r0 == r7) goto L36;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws android.hardware.camera2.CameraAccessException {
            /*
                Method dump skipped, instruction units count: 357
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.camera.camera2.Camera2Manager.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/withpersona/sdk2/camera/camera2/Camera2Manager$f", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "Landroid/hardware/camera2/CameraDevice;", Kind.DEVICE, "Ljn0/h0;", "onOpened", "(Landroid/hardware/camera2/CameraDevice;)V", "onDisconnected", "", AnalyticsAttribute.Error, "onError", "(Landroid/hardware/camera2/CameraDevice;I)V", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation<CameraDevice> f57227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Camera2Manager f57228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f57229c;

        /* JADX WARN: Multi-variable type inference failed */
        f(CancellableContinuation<? super CameraDevice> cancellableContinuation, Camera2Manager camera2Manager, String str) {
            this.f57227a = cancellableContinuation;
            this.f57228b = camera2Manager;
            this.f57229c = str;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice device) {
            p013kotlin.jvm.internal.s.k(device, "device");
            this.f57228b.camera = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice device, int error) {
            String str;
            p013kotlin.jvm.internal.s.k(device, "device");
            if (error == 1) {
                str = "Camera in use";
            } else if (error == 2) {
                str = "Maximum cameras in use";
            } else if (error == 3) {
                str = "Device policy";
            } else if (error != 4) {
                str = error != 5 ? "Unknown" : "Fatal (service)";
            } else {
                str = "Fatal (device)";
            }
            RuntimeException runtimeException = new RuntimeException("Camera " + this.f57229c + " error: (" + error + ") " + str);
            if (this.f57227a.isActive()) {
                CancellableContinuation<CameraDevice> cancellableContinuation = this.f57227a;
                s.Companion companion = s.INSTANCE;
                cancellableContinuation.resumeWith(s.b(t.a(runtimeException)));
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice device) {
            p013kotlin.jvm.internal.s.k(device, "device");
            this.f57227a.resumeWith(s.b(device));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", i = {}, l = {332}, m = "requestImageCapture-IoAF18A", n = {}, s = {})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f57230n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f57232p;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f57230n = obj;
            this.f57232p |= Integer.MIN_VALUE;
            Object objQ = Camera2Manager.this.Q(this);
            return objQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objQ : s.a(objQ);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Ljava/io/File;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$requestImageCapture$2", f = "Camera2Manager.kt", i = {}, l = {342}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends File>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57233n;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Ljava/io/File;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$requestImageCapture$2$imageResult$1", f = "Camera2Manager.kt", i = {}, l = {343}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends File>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f57235n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Camera2Manager f57236o;

            /* JADX INFO: renamed from: com.withpersona.sdk2.camera.camera2.Camera2Manager$h$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Ljava/io/File;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {2, 0, 0})
            @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$requestImageCapture$2$imageResult$1$1", f = "Camera2Manager.kt", i = {}, l = {346}, m = "invokeSuspend", n = {}, s = {})
            static final class C1157a extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends File>>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f57237n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ Camera2Manager f57238o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1157a(Camera2Manager camera2Manager, Continuation<? super C1157a> continuation) {
                    super(2, continuation);
                    this.f57238o = camera2Manager;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                    return new C1157a(this.f57238o, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f57237n;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t.b(obj);
                        return obj;
                    }
                    t.b(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.f57238o.imageCaptureResult);
                    this.f57237n = 1;
                    Object objFirst = FlowKt.first(flowFilterNotNull, this);
                    return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends File>> continuation) {
                    return ((C1157a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Camera2Manager camera2Manager, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f57236o = camera2Manager;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f57236o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f57235n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                CoroutineContext coroutineContext = this.f57236o.coroutineScope.getCoroutineContext();
                C1157a c1157a = new C1157a(this.f57236o, null);
                this.f57235n = 1;
                Object objWithContext = BuildersKt.withContext(coroutineContext, c1157a, this);
                return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends File>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return Camera2Manager.this.new h(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f57233n;
            if (i11 == 0) {
                t.b(obj);
                if (Camera2Manager.this.isImageCaptureRequested) {
                    s.Companion companion = s.INSTANCE;
                    return s.a(s.b(t.a(new RuntimeException("Image capture already requested."))));
                }
                Camera2Manager.this.imageCaptureResult.setValue(null);
                Camera2Manager.this.isImageCaptureRequested = true;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(Camera2Manager.this, null);
                this.f57233n = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            Object value = ((s) obj).getValue();
            Camera2Manager.this.isImageCaptureRequested = false;
            return s.a(value);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends File>> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"com/withpersona/sdk2/camera/camera2/Camera2Manager$i", "Landroid/view/SurfaceHolder$Callback;", "Landroid/view/SurfaceHolder;", "holder", "Ljn0/h0;", "surfaceDestroyed", "(Landroid/view/SurfaceHolder;)V", "", "format", Snapshot.WIDTH, Snapshot.HEIGHT, "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "surfaceCreated", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i implements SurfaceHolder.Callback {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$1$surfaceCreated$1$1", f = "Camera2Manager.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f57240n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Camera2Manager f57241o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Camera2Manager camera2Manager, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f57241o = camera2Manager;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f57241o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f57240n;
                if (i11 == 0) {
                    t.b(obj);
                    Camera2Manager camera2Manager = this.f57241o;
                    this.f57240n = 1;
                    if (Camera2Manager.U(camera2Manager, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$1$surfaceDestroyed$1", f = "Camera2Manager.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f57242n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Camera2Manager f57243o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Camera2Manager camera2Manager, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f57243o = camera2Manager;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f57243o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f57242n;
                if (i11 == 0) {
                    t.b(obj);
                    Camera2Manager camera2Manager = this.f57243o;
                    this.f57242n = 1;
                    if (camera2Manager.F(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(Camera2Manager camera2Manager) {
            BuildersKt__Builders_commonKt.launch$default(camera2Manager.coroutineScope, null, null, new a(camera2Manager, null), 3, null);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
            p013kotlin.jvm.internal.s.k(holder, "holder");
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder holder) {
            p013kotlin.jvm.internal.s.k(holder, "holder");
            Camera2Manager.this.isPreviewSurfaceAvailable = true;
            Camera2Manager.this.getPreviewView().setCameraPreviewSize(Camera2Manager.this.cameraChoice.getSize().getWidth(), Camera2Manager.this.cameraChoice.getSize().getHeight(), Camera2Manager.this.orientation);
            Camera2PreviewView previewView = Camera2Manager.this.getPreviewView();
            final Camera2Manager camera2Manager = Camera2Manager.this;
            previewView.post(new Runnable() { // from class: bg0.d
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2Manager.i.b(camera2Manager);
                }
            });
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder holder) {
            p013kotlin.jvm.internal.s.k(holder, "holder");
            Camera2Manager.this.isPreviewSurfaceAvailable = false;
            BuildersKt__Builders_commonKt.launch$default(Camera2Manager.this.coroutineScope, null, null, new b(Camera2Manager.this, null), 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$start$2$1", f = "Camera2Manager.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57244n;

        j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return Camera2Manager.this.new j(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f57244n;
            if (i11 == 0) {
                t.b(obj);
                Camera2Manager camera2Manager = Camera2Manager.this;
                this.f57244n = 1;
                if (Camera2Manager.U(camera2Manager, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", i = {0}, l = {174}, m = "start$initializeCameraAndSetState", n = {"this$0"}, s = {"L$0"})
    static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f57246n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f57247o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f57248p;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f57247o = obj;
            this.f57248p |= Integer.MIN_VALUE;
            return Camera2Manager.U(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE}, m = "startVideo-IoAF18A", n = {"$this$startVideo_IoAF18A_u24lambda_u242"}, s = {"L$0"})
    static final class l extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f57249n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f57250o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f57252q;

        l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f57250o = obj;
            this.f57252q |= Integer.MIN_VALUE;
            Object objW = Camera2Manager.this.W(this);
            return objW == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objW : s.a(objW);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Manager", f = "Camera2Manager.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_DARK_APPEARANCE_VALUE}, m = "stopVideo-IoAF18A", n = {}, s = {})
    static final class m extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f57253n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f57255p;

        m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f57253n = obj;
            this.f57255p |= Integer.MIN_VALUE;
            Object objX = Camera2Manager.this.X(this);
            return objX == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objX : s.a(objX);
        }
    }

    public Camera2Manager(Context context, CameraChoice cameraChoice, Camera2PreviewView previewView, bg0.a analyzer, fg0.a videoCaptureMethod, ej0.a aVar, boolean z11, eg0.a cameraStatsManager, fi0.c sdkFilesManager) throws CameraAccessException {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(cameraChoice, "cameraChoice");
        p013kotlin.jvm.internal.s.k(previewView, "previewView");
        p013kotlin.jvm.internal.s.k(analyzer, "analyzer");
        p013kotlin.jvm.internal.s.k(videoCaptureMethod, "videoCaptureMethod");
        p013kotlin.jvm.internal.s.k(cameraStatsManager, "cameraStatsManager");
        p013kotlin.jvm.internal.s.k(sdkFilesManager, "sdkFilesManager");
        this.context = context;
        this.cameraChoice = cameraChoice;
        this.previewView = previewView;
        this.analyzer = analyzer;
        this.videoCaptureMethod = videoCaptureMethod;
        this.webRtcManager = aVar;
        this.isAudioRequired = z11;
        this.cameraStatsManager = cameraStatsManager;
        this.sdkFilesManager = sdkFilesManager;
        this.cameraProperties = cameraChoice.getCameraProperties();
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        this.coroutineScope = CoroutineScope;
        String id2 = cameraChoice.getId();
        this.cameraId = id2;
        Object systemService = context.getSystemService("camera");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        this.cameraManager = cameraManager;
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(id2);
        p013kotlin.jvm.internal.s.j(cameraCharacteristics, "getCameraCharacteristics(...)");
        this.characteristics = cameraCharacteristics;
        Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int iIntValue = ((Number) obj).intValue();
        this.orientation = iIntValue;
        Object upper = cameraChoice.g().getUpper();
        p013kotlin.jvm.internal.s.j(upper, "getUpper(...)");
        this.mediaRecorderWrapper = new o(context, cameraChoice, ((Number) upper).intValue(), iIntValue, z11);
        HandlerThread handlerThread = new HandlerThread("CameraThread");
        handlerThread.start();
        this.cameraThread = handlerThread;
        this.cameraHandler = new Handler(handlerThread.getLooper());
        this.isAnalyzerEnabled = true;
        this.imageCaptureResult = StateFlowKt.MutableStateFlow(null);
        MutableStateFlow<c> MutableStateFlow = StateFlowKt.MutableStateFlow(c.a.f57218a);
        this._state = MutableStateFlow;
        this.state = MutableStateFlow;
        this.analysisSizeScaling = 1.0f;
        this.imageReader = M();
        this.imageProcessingFlow = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.SUSPEND, 1, null);
        this.processImageHaltedCv = new ConditionVariable();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F(Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getDefault(), new d(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final Object L(Continuation<? super h0> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new e(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageReader M() {
        ImageReader imageReaderNewInstance = ImageReader.newInstance((int) (this.cameraChoice.getSize().getWidth() * this.analysisSizeScaling), (int) (this.cameraChoice.getSize().getHeight() * this.analysisSizeScaling), 35, 3);
        imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: bg0.b
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                Camera2Manager.N(this.f17127a, imageReader);
            }
        }, this.cameraHandler);
        p013kotlin.jvm.internal.s.j(imageReaderNewInstance, "also(...)");
        return imageReaderNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(Camera2Manager camera2Manager, ImageReader imageReader) {
        ej0.a aVar;
        Image imageAcquireNextImage = imageReader.acquireNextImage();
        int rotation = camera2Manager.cameraChoice.getRotation();
        if (camera2Manager.videoCaptureMethod == fg0.a.Stream && (aVar = camera2Manager.webRtcManager) != null) {
            aVar.c(imageAcquireNextImage, rotation);
        }
        if (imageAcquireNextImage == null || camera2Manager.imageProcessingFlow.tryEmit(imageAcquireNextImage)) {
            return;
        }
        imageAcquireNextImage.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final Object O(CameraManager cameraManager, String str, Handler handler, Continuation<? super CameraDevice> continuation) throws CameraAccessException {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cameraManager.openCamera(str, new f(cancellableContinuationImpl, this, str), handler);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(Image image) throws Exception {
        try {
            try {
                if (p013kotlin.jvm.internal.s.f(this._state.getValue(), c.b.f57219a)) {
                    this.processImageHaltedCv.open();
                    un0.a.a(image, null);
                    return;
                }
                if (!this.isAnalyzerEnabled && !this.isImageCaptureRequested) {
                    un0.a.a(image, null);
                    return;
                }
                if (this.isImageCaptureRequested) {
                    File fileR = R(image);
                    if (fileR != null) {
                        this.imageCaptureResult.setValue(s.a(s.b(fileR)));
                    }
                } else if (this.isAnalyzerEnabled) {
                    try {
                        this.analyzer.b(image, this.orientation);
                    } catch (Exception unused) {
                    }
                }
                h0 h0Var = h0.f84049a;
                un0.a.a(image, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    un0.a.a(image, th2);
                    throw th3;
                }
            }
        } catch (IllegalArgumentException unused2) {
        }
    }

    private final File R(Image image) {
        Bitmap bitmapC = l0.c(image, this.orientation);
        if (bitmapC == null) {
            return null;
        }
        File fileD = this.sdkFilesManager.d("jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(fileD);
        try {
            bitmapC.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            sn0.b.a(fileOutputStream, null);
            bitmapC.recycle();
            return fileD;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object U(Camera2Manager camera2Manager, Continuation<? super h0> continuation) {
        k kVar;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i11 = kVar.f57248p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f57248p = i11 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object obj = kVar.f57247o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kVar.f57248p;
        try {
            if (i12 == 0) {
                t.b(obj);
                kVar.f57246n = camera2Manager;
                kVar.f57248p = 1;
                if (camera2Manager.L(kVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                camera2Manager = (Camera2Manager) kVar.f57246n;
                t.b(obj);
            }
            camera2Manager._state.setValue(c.d.f57221a);
        } catch (Exception e11) {
            camera2Manager._state.setValue(new c.Error(new Error.InitializationError("Unable to initialize Camera2 classes", e11)));
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 V(Camera2Manager camera2Manager) {
        if (camera2Manager.isPreviewSurfaceAvailable) {
            BuildersKt__Builders_commonKt.launch$default(camera2Manager.coroutineScope, null, null, camera2Manager.new j(null), 3, null);
        }
        return h0.f84049a;
    }

    public final void G(boolean enable) {
        b bVar = this.session;
        if (bVar != null) {
            bVar.i(enable);
            bVar.l();
        }
    }

    public final void H() {
        b bVar = this.session;
        if (bVar != null) {
            bVar.j(this.cameraChoice.getSize().getWidth() / 2, this.cameraChoice.getSize().getHeight() / 2, new Size((int) (((double) this.cameraChoice.getSize().getWidth()) * 0.15d), (int) (((double) this.cameraChoice.getSize().getHeight()) * 0.15d)), DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
            bVar.l();
        }
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final u getCameraProperties() {
        return this.cameraProperties;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final Camera2PreviewView getPreviewView() {
        return this.previewView;
    }

    public final StateFlow<c> K() {
        return this.state;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q(Continuation<? super s<? extends File>> continuation) {
        g gVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f57232p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f57232p = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objWithContext = gVar.f57230n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gVar.f57232p;
        if (i12 == 0) {
            t.b(objWithContext);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            h hVar = new h(null);
            gVar.f57232p = 1;
            objWithContext = BuildersKt.withContext(main, hVar, gVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        return ((s) objWithContext).getValue();
    }

    public final void S(boolean analyzerEnabled) {
        this.isAnalyzerEnabled = analyzerEnabled;
    }

    public final void T() {
        boolean z11 = this.isAudioRequired && androidx.core.content.b.checkSelfPermission(this.context, "android.permission.RECORD_AUDIO") != 0;
        if (androidx.core.content.b.checkSelfPermission(this.context, "android.permission.CAMERA") != 0 || z11) {
            this._state.setValue(new c.Error(new Error.MissingPermissionsCameraError()));
            return;
        }
        if (this.isPreviewStarted) {
            return;
        }
        this.isPreviewStarted = true;
        this.isPreviewSurfaceAvailable = false;
        this.surfaceHolderCallback = new i();
        this.mediaRecorderWrapper.n(new wn0.a() { // from class: bg0.c
            @Override // wn0.a
            public final Object invoke() {
                return Camera2Manager.V(this.f17128a);
            }
        });
        this.previewView.a();
        this.previewView.getHolder().addCallback(this.surfaceHolderCallback);
        this.cameraStatsManager.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W(Continuation<? super s<Boolean>> continuation) {
        l lVar;
        Camera2Manager camera2Manager;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i11 = lVar.f57252q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f57252q = i11 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object obj = lVar.f57250o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = lVar.f57252q;
        try {
            if (i12 == 0) {
                t.b(obj);
                if (this.recordingStarted) {
                    s.Companion companion = s.INSTANCE;
                    return s.b(Boxing.boxBoolean(false));
                }
                s.Companion companion2 = s.INSTANCE;
                o oVar = this.mediaRecorderWrapper;
                lVar.f57249n = this;
                lVar.f57252q = 1;
                if (oVar.o(lVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                camera2Manager = this;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                camera2Manager = (Camera2Manager) lVar.f57249n;
                t.b(obj);
            }
            camera2Manager.recordingStarted = true;
            s.Companion companion3 = s.INSTANCE;
            return s.b(Boxing.boxBoolean(true));
        } catch (Throwable th2) {
            s.Companion companion4 = s.INSTANCE;
            return s.b(t.a(th2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X(Continuation<? super s<? extends File>> continuation) {
        m mVar;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i11 = mVar.f57255p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f57255p = i11 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        Object objP = mVar.f57253n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = mVar.f57255p;
        if (i12 == 0) {
            t.b(objP);
            if (!this.recordingStarted) {
                s.Companion companion = s.INSTANCE;
                return s.b(t.a(new NoActiveRecordingError()));
            }
            this.recordingStarted = false;
            o oVar = this.mediaRecorderWrapper;
            mVar.f57255p = 1;
            objP = oVar.p(mVar);
            if (objP == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objP);
        }
        File file = (File) objP;
        if (file != null) {
            return s.b(file);
        }
        s.Companion companion2 = s.INSTANCE;
        return s.b(t.a(new RuntimeException("Recording failed.")));
    }
}
