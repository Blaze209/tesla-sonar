package com.tesla.dashcam_viewer;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Looper;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.Property;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.tesla.logging.TeslaLog;
import ezvcard.property.Gender;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import sb0.SEIMetadataProcessed;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010!\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010\u0010J\u000f\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0004\b'\u0010\u0012J\u000f\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u000eH\u0014¢\u0006\u0004\b)\u0010\u0012J\u000f\u0010*\u001a\u00020\u000eH\u0014¢\u0006\u0004\b*\u0010\u0012J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J/\u00102\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+2\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b4\u0010.J7\u0010;\u001a\u00020\u000e2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\bH\u0014¢\u0006\u0004\b;\u0010<J'\u0010A\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u001a2\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010I\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010Q\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001e\u0010U\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010-\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010\u0016R\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010d\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010f\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010\u0016R\u0016\u0010h\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010\u0016R\u0016\u0010j\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010\u0016R\u0016\u0010m\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010o\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010lR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001a\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0094\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008d\u0001R\u0018\u0010\u0096\u0001\u001a\u00020|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010~R\u0018\u0010\u0098\u0001\u001a\u00020|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010~R\u0018\u0010\u009a\u0001\u001a\u00020|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010~R\u001a\u0010\u009c\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u008d\u0001R\u001a\u0010\u009e\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u008d\u0001R\u0019\u0010\u009f\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b`\u0010\u008d\u0001R\u001a\u0010¡\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u008d\u0001R\u0019\u0010£\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u0081\u0001R\u0017\u0010¦\u0001\u001a\u00030¤\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010¥\u0001R\u0019\u0010§\u0001\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010YR\u0017\u0010ª\u0001\u001a\u00030¨\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010©\u0001R\u001a\u0010¬\u0001\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bl\u0010«\u0001R\u001a\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bA\u0010«\u0001R\u0018\u0010±\u0001\u001a\u00030®\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010µ\u0001\u001a\u00030²\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001¨\u0006¶\u0001"}, d2 = {"Lcom/tesla/dashcam_viewer/u0;", "Landroid/widget/FrameLayout;", "Landroidx/lifecycle/LifecycleOwner;", "Landroid/view/SurfaceHolder$Callback;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lsb0/c;", "data", "Ljn0/h0;", "c0", "(Lsb0/c;)V", Gender.MALE, "()V", "dp", "H", "(I)I", "Z", "b0", "", "timeS", "", "I", "(Ljava/lang/Double;)Ljava/lang/String;", "Landroid/view/View;", "view", "Landroid/animation/ObjectAnimator;", "existing", "Y", "(Landroid/view/View;Landroid/animation/ObjectAnimator;)Landroid/animation/ObjectAnimator;", "animator", "a0", "(Landroid/view/View;Landroid/animation/ObjectAnimator;)V", "d0", "G", "requestLayout", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/SurfaceHolder;", "holder", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "format", Snapshot.WIDTH, Snapshot.HEIGHT, "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "surfaceDestroyed", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "eventPath", "camera", "Ljn0/c0;", "targetTimeMs", "K", "(Ljava/lang/String;Ljava/lang/String;Ljn0/c0;)V", "Lcom/tesla/logging/g;", "a", "Lcom/tesla/logging/g;", "logger", "b", "Landroid/view/SurfaceHolder;", "surfaceHolder", "Lcom/tesla/dashcam_viewer/u1;", "c", "Lcom/tesla/dashcam_viewer/u1;", "getVideoPlayer", "()Lcom/tesla/dashcam_viewer/u1;", "setVideoPlayer", "(Lcom/tesla/dashcam_viewer/u1;)V", "videoPlayer", "Lkotlin/Function0;", DateTokenConverter.CONVERTER_KEY, "Lwn0/a;", "selectEventCallback", "e", "Lkotlinx/coroutines/Job;", "f", "Lkotlinx/coroutines/Job;", "timer", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "g", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "serialDispatcher", "h", "D", "seekBarInitialPercent", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Double;", "seekBarOverridePercent", "j", "isBuffering", "k", "isSaving", "l", "isDragging", "m", "J", "videoDurationMs", "n", "videoStartTimeEpochMs", "Landroidx/constraintlayout/widget/ConstraintLayout;", "o", "Landroidx/constraintlayout/widget/ConstraintLayout;", "videoControlContainer", "Landroid/view/SurfaceView;", "p", "Landroid/view/SurfaceView;", "surfaceView", "Landroid/widget/Button;", "q", "Landroid/widget/Button;", "jumpToEventButton", "Landroid/widget/TextView;", "r", "Landroid/widget/TextView;", "timestampTextView", "s", "Landroid/view/View;", "eventRectangle", "Landroid/widget/SeekBar;", "t", "Landroid/widget/SeekBar;", "seekBar", "Lcom/airbnb/lottie/LottieAnimationView;", "u", "Lcom/airbnb/lottie/LottieAnimationView;", "spinner", "Landroid/widget/ImageView;", "v", "Landroid/widget/ImageView;", "playIcon", "Landroid/widget/LinearLayout;", "w", "Landroid/widget/LinearLayout;", "seiContainer", "x", "brakePaddle", "y", "gearText", "z", "speedText", "A", "fsdText", "B", "turnSignalLeft", "C", "turnSignalRight", "steeringWheel", "E", "acceleratorPedal", Gender.FEMALE, "acceleratorFill", "Lsb0/b;", "Lsb0/b;", "seiClock", "seiJob", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "relayoutRunnable", "Landroid/animation/ObjectAnimator;", "leftBlinkAnimator", "rightBlinkAnimator", "Landroidx/lifecycle/y;", "L", "Landroidx/lifecycle/y;", "lifecycleRegistry", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u0 extends FrameLayout implements LifecycleOwner, SurfaceHolder.Callback {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private TextView fsdText;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private ImageView turnSignalLeft;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private ImageView turnSignalRight;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private ImageView steeringWheel;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private ImageView acceleratorPedal;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private View acceleratorFill;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final sb0.b seiClock;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private Job seiJob;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final Runnable relayoutRunnable;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private ObjectAnimator leftBlinkAnimator;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private ObjectAnimator rightBlinkAnimator;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final androidx.p003lifecycle.y lifecycleRegistry;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.tesla.logging.g logger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private SurfaceHolder surfaceHolder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private u1 videoPlayer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private wn0.a<jn0.h0> selectEventCallback;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean surfaceCreated;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Job timer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ExecutorCoroutineDispatcher serialDispatcher;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private double seekBarInitialPercent;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Double seekBarOverridePercent;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isBuffering;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isSaving;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean isDragging;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long videoDurationMs;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long videoStartTimeEpochMs;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final ConstraintLayout videoControlContainer;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final SurfaceView surfaceView;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Button jumpToEventButton;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final TextView timestampTextView;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private View eventRectangle;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final SeekBar seekBar;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final LottieAnimationView spinner;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final ImageView playIcon;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private LinearLayout seiContainer;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private ImageView brakePaddle;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private TextView gearText;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private TextView speedText;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.RNH264HostingView$1", f = "RNH264HostingView.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56051n;

        /* JADX INFO: renamed from: com.tesla.dashcam_viewer.u0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C1125a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ u0 f56053a;

            C1125a(u0 u0Var) {
                this.f56053a = u0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(SEIMetadataProcessed sEIMetadataProcessed, Continuation<? super jn0.h0> continuation) {
                this.f56053a.c0(sEIMetadataProcessed);
                return jn0.h0.f84049a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return u0.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56051n;
            if (i11 == 0) {
                jn0.t.b(obj);
                StateFlow<SEIMetadataProcessed> stateFlowE = u0.this.seiClock.e();
                C1125a c1125a = new C1125a(u0.this);
                this.f56051n = 1;
                if (stateFlowE.collect(c1125a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.RNH264HostingView$2", f = "RNH264HostingView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56054n;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return u0.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f56054n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            try {
                u0.this.M();
            } catch (Exception e11) {
                com.tesla.logging.g gVar = u0.this.logger;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g("error in setup: " + e11);
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"com/tesla/dashcam_viewer/u0$c", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "Landroid/widget/SeekBar;", "seekBar", "", ReactProgressBarViewManager.PROP_PROGRESS, "", "fromUser", "Ljn0/h0;", "onProgressChanged", "(Landroid/widget/SeekBar;IZ)V", "onStartTrackingTouch", "(Landroid/widget/SeekBar;)V", "onStopTrackingTouch", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements SeekBar.OnSeekBarChangeListener {
        c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            p013kotlin.jvm.internal.s.k(seekBar, "seekBar");
            if (u0.this.isDragging) {
                u0.this.timestampTextView.setText(u0.this.I(Double.valueOf((jn0.j0.e(u0.this.videoStartTimeEpochMs) + (jn0.j0.e(u0.this.videoDurationMs) * (((double) seekBar.getProgress()) / ((double) seekBar.getMax())))) / 1000.0d)));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            AtomicBoolean isDragging;
            p013kotlin.jvm.internal.s.k(seekBar, "seekBar");
            u0.this.logger.j("seekBar start tracking, set isDragging to true");
            u0.this.b0();
            u1 videoPlayer = u0.this.getVideoPlayer();
            if (videoPlayer != null && (isDragging = videoPlayer.getIsDragging()) != null) {
                isDragging.set(true);
            }
            u0.this.isDragging = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            AtomicBoolean isDragging;
            p013kotlin.jvm.internal.s.k(seekBar, "seekBar");
            u0.this.logger.j("seekBar stop tracking, set isDragging to true");
            u0.this.Z();
            u1 videoPlayer = u0.this.getVideoPlayer();
            if (videoPlayer != null && (isDragging = videoPlayer.getIsDragging()) != null) {
                isDragging.set(false);
            }
            u0.this.isDragging = false;
            double progress = ((double) seekBar.getProgress()) / ((double) seekBar.getMax());
            u0.this.seekBarOverridePercent = Double.valueOf(progress);
            u0.this.logger.j("seekBar onProgressChanged progress: " + seekBar.getProgress() + ", percent: " + progress);
            u1 videoPlayer2 = u0.this.getVideoPlayer();
            if (videoPlayer2 != null) {
                videoPlayer2.F(progress);
            }
            if (u0.this.playIcon.getVisibility() == 0) {
                u0.this.playIcon.setVisibility(4);
                u0.this.logger.j("seekBar onProgressChanged, set play icon invisible");
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.RNH264HostingView$startTimer$1", f = "RNH264HostingView.kt", i = {0}, l = {477}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56057n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f56058o;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            d dVar = u0.this.new d(continuation);
            dVar.f56058o = obj;
            return dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Double dM;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56057n;
            if (i11 == 0) {
                jn0.t.b(obj);
                coroutineScope = (CoroutineScope) this.f56058o;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.f56058o;
                jn0.t.b(obj);
            }
            while (CoroutineScopeKt.isActive(coroutineScope)) {
                if (!u0.this.isSaving && !u0.this.isDragging) {
                    u0 u0Var = u0.this;
                    u1 videoPlayer = u0Var.getVideoPlayer();
                    u0.this.timestampTextView.setText(u0Var.I(videoPlayer != null ? videoPlayer.l() : null));
                    u1 videoPlayer2 = u0.this.getVideoPlayer();
                    if (videoPlayer2 != null && (dM = videoPlayer2.m()) != null) {
                        double dDoubleValue = dM.doubleValue();
                        if (u0.this.seekBarOverridePercent != null) {
                            Double d11 = u0.this.seekBarOverridePercent;
                            p013kotlin.jvm.internal.s.h(d11);
                            if (Math.abs(d11.doubleValue() - dDoubleValue) >= 0.1d) {
                                continue;
                            } else {
                                u0.this.seekBarOverridePercent = null;
                            }
                        }
                        u0.this.seekBar.setProgress((int) (dDoubleValue * ((double) u0.this.seekBar.getMax())));
                        this.f56058o = coroutineScope;
                        this.f56057n = 1;
                        if (DelayKt.delay(500L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.RNH264HostingView$surfaceCreated$1", f = "RNH264HostingView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56060n;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return u0.this.new e(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f56060n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            wn0.a aVar = u0.this.selectEventCallback;
            if (aVar != null) {
                aVar.invoke();
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u0(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    private final void G() {
        ObjectAnimator objectAnimator = this.leftBlinkAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.rightBlinkAnimator;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.turnSignalLeft.setAlpha(0.3f);
        this.turnSignalRight.setAlpha(0.3f);
    }

    private final int H(int dp2) {
        return (int) (dp2 * getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String I(Double timeS) {
        if (timeS == null) {
            return "";
        }
        Date date = new Date((long) (timeS.doubleValue() * 1000.0d));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormat.is24HourFormat(getContext()) ? "HH:mm:ss" : "h:mm:ss a", Locale.getDefault());
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(date);
        p013kotlin.jvm.internal.s.j(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(u0 u0Var) {
        int measuredWidth = u0Var.getMeasuredWidth();
        int measuredHeight = u0Var.getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            return;
        }
        u0Var.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        u0Var.layout(u0Var.getLeft(), u0Var.getTop(), u0Var.getRight(), u0Var.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 L(u0 u0Var, String str, String str2, jn0.c0 c0Var) {
        u1 u1Var = u0Var.videoPlayer;
        if (u1Var != null) {
            u1Var.G(str, str2, c0Var);
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        int i11;
        this.surfaceView.setOnClickListener(new View.OnClickListener() { // from class: com.tesla.dashcam_viewer.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u0.N(this.f55927a, view);
            }
        });
        x xVar = x.f56132a;
        boolean zH = xVar.h();
        this.playIcon.bringToFront();
        this.playIcon.setImageDrawable(androidx.core.content.b.getDrawable(getContext(), zH ? d0.f55794f : d0.f55793e));
        this.playIcon.setVisibility(4);
        this.logger.j("setup, set play icon invisible by default");
        this.spinner.setAnimation(zH ? g0.f55875b : g0.f55874a);
        this.spinner.animate();
        this.spinner.bringToFront();
        this.spinner.setVisibility(4);
        this.logger.j("setup, set spinner invisible by default");
        this.seekBar.setOnSeekBarChangeListener(new c());
        if (zH) {
            this.seekBar.setThumb(androidx.core.content.b.getDrawable(getContext(), d0.f55796h));
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(androidx.core.content.b.getColor(getContext(), c0.f55784c));
        gradientDrawable.setCornerRadius(zH ? BitmapDescriptorFactory.HUE_RED : 20.0f);
        this.jumpToEventButton.setBackground(gradientDrawable);
        this.jumpToEventButton.setOnClickListener(new View.OnClickListener() { // from class: com.tesla.dashcam_viewer.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u0.T(this.f55928a, view);
            }
        });
        final View view = new View(getContext());
        view.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(H(3), H(20));
        bVar.f6900i = this.seekBar.getId();
        bVar.f6922t = this.seekBar.getId();
        bVar.f6926v = this.seekBar.getId();
        bVar.setMarginStart((int) (((double) this.seekBar.getWidth()) * 0.8d));
        view.setLayoutParams(bVar);
        view.setBackgroundColor(androidx.core.content.b.getColor(view.getContext(), c0.f55784c));
        this.videoControlContainer.addView(view);
        this.eventRectangle = view;
        this.seekBar.post(new Runnable() { // from class: com.tesla.dashcam_viewer.o0
            @Override // java.lang.Runnable
            public final void run() {
                u0.U(this.f55930a, view);
            }
        });
        this.seekBar.bringToFront();
        gc0.u0 u0VarF = xVar.f();
        gc0.u0.s steering_wheel_type = u0VarF != null ? u0VarF.getSteering_wheel_type() : null;
        if (steering_wheel_type != null) {
            if (steering_wheel_type.getRound() != null) {
                i11 = d0.f55795g;
            } else if (steering_wheel_type.getYoke() != null) {
                i11 = d0.f55802n;
            } else {
                i11 = steering_wheel_type.getSquircle() != null ? d0.f55797i : d0.f55795g;
            }
            this.steeringWheel.setImageResource(i11);
        }
        this.turnSignalLeft.setImageResource(zH ? d0.f55799k : d0.f55798j);
        this.turnSignalRight.setImageResource(zH ? d0.f55801m : d0.f55800l);
        this.surfaceView.getHolder().addCallback(this);
        o1 o1Var = o1.f55932a;
        t tVarK = o1Var.k();
        t tVarG = o1Var.g();
        v vVarI = o1Var.i();
        Context context = getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        u1 u1Var = new u1(tVarK, tVarG, vVarI, context, this);
        this.videoPlayer = u1Var;
        u1Var.K(new wn0.r() { // from class: com.tesla.dashcam_viewer.p0
            @Override // wn0.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return u0.V(this.f55962a, view, (jn0.c0) obj, (jn0.c0) obj2, (jn0.c0) obj3, (jn0.c0) obj4);
            }
        });
        u1 u1Var2 = this.videoPlayer;
        if (u1Var2 != null) {
            u1Var2.O(new wn0.a() { // from class: com.tesla.dashcam_viewer.q0
                @Override // wn0.a
                public final Object invoke() {
                    return u0.X(this.f55965a);
                }
            });
        }
        u1 u1Var3 = this.videoPlayer;
        if (u1Var3 != null) {
            u1Var3.I(new wn0.l() { // from class: com.tesla.dashcam_viewer.r0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return u0.O(this.f55968a, ((Boolean) obj).booleanValue());
                }
            });
        }
        u1 u1Var4 = this.videoPlayer;
        if (u1Var4 != null) {
            u1Var4.N(new wn0.l() { // from class: com.tesla.dashcam_viewer.s0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return u0.P(this.f56006a, ((Boolean) obj).booleanValue());
                }
            });
        }
        u1 u1Var5 = this.videoPlayer;
        if (u1Var5 != null) {
            u1Var5.J(new wn0.l() { // from class: com.tesla.dashcam_viewer.t0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return u0.Q(this.f56022a, ((Double) obj).doubleValue());
                }
            });
        }
        u1 u1Var6 = this.videoPlayer;
        if (u1Var6 != null) {
            u1Var6.M(new wn0.p() { // from class: com.tesla.dashcam_viewer.i0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return u0.R(this.f55880a, ((Double) obj).doubleValue(), (List) obj2);
                }
            });
        }
        u1 u1Var7 = this.videoPlayer;
        if (u1Var7 != null) {
            u1Var7.L(new wn0.a() { // from class: com.tesla.dashcam_viewer.j0
                @Override // wn0.a
                public final Object invoke() {
                    return u0.S(this.f55892a);
                }
            });
        }
        RNH264StreamEvents.INSTANCE.videoPlayerCreated();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(u0 u0Var, View view) {
        if (u0Var.playIcon.getVisibility() == 4) {
            u1 u1Var = u0Var.videoPlayer;
            if (u1Var != null) {
                u1Var.w();
            }
            u0Var.playIcon.setVisibility(0);
            u0Var.logger.j("surfaceView clicked, pause playback, set play icon visible");
        } else {
            u1 u1Var2 = u0Var.videoPlayer;
            if (u1Var2 != null) {
                u1Var2.A();
            }
            u0Var.playIcon.setVisibility(4);
            u0Var.logger.j("surfaceView clicked, resume playback, set play icon invisible");
        }
        if (Build.VERSION.SDK_INT >= 30) {
            u0Var.surfaceView.performHapticFeedback(16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 O(u0 u0Var, boolean z11) {
        u0Var.isBuffering = z11;
        if (!u0Var.isSaving) {
            if (z11 && u0Var.spinner.getVisibility() == 4) {
                u0Var.spinner.setVisibility(0);
                u0Var.logger.j("onBufferingStatusChangeCallback, buffering: true, set spinner visible");
            } else if (!z11 && u0Var.spinner.getVisibility() == 0) {
                u0Var.spinner.setVisibility(4);
                u0Var.logger.j("onBufferingStatusChangeCallback, buffering: false, set spinner invisible");
            }
            if (!z11 && u0Var.playIcon.getVisibility() == 0) {
                u0Var.playIcon.setVisibility(4);
                u0Var.logger.j("onBufferingStatusChangeCallback, buffering: false, set play icon invisible");
            }
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 P(u0 u0Var, boolean z11) {
        u0Var.isSaving = z11;
        u0Var.logger.j("onSavingStatusChangeCallback, saving: " + z11);
        if (z11) {
            if (u0Var.spinner.getVisibility() == 0) {
                u0Var.spinner.setVisibility(4);
                u0Var.logger.j("onSavingStatusChangeCallback, saving: true, set spinner invisible");
            }
            if (u0Var.playIcon.getVisibility() == 4) {
                u0Var.playIcon.setVisibility(0);
                u0Var.logger.j("onSavingStatusChangeCallback, saving: true, set play icon visible");
            }
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Q(u0 u0Var, double d11) {
        u0Var.seiClock.g(d11);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 R(u0 u0Var, double d11, List raw) {
        p013kotlin.jvm.internal.s.k(raw, "raw");
        if (!raw.isEmpty()) {
            u0Var.seiClock.f(d11, raw);
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 S(u0 u0Var) {
        u0Var.seiClock.h();
        u0Var.seiContainer.setVisibility(4);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(u0 u0Var, View view) {
        u1 u1Var = u0Var.videoPlayer;
        if (u1Var != null) {
            u1Var.v();
        }
        SeekBar seekBar = u0Var.seekBar;
        seekBar.setProgress((int) (u0Var.seekBarInitialPercent * ((double) seekBar.getMax())));
        if (u0Var.playIcon.getVisibility() == 0) {
            u0Var.playIcon.setVisibility(4);
            u0Var.logger.j("jumpToEventButton clicked, set play icon invisible");
        }
        if (Build.VERSION.SDK_INT >= 30) {
            u0Var.jumpToEventButton.performHapticFeedback(16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(u0 u0Var, View view) {
        float x11 = (u0Var.seekBar.getX() + (u0Var.seekBar.getWidth() * 0.8f)) - (view.getWidth() / 2.0f);
        float y11 = (u0Var.seekBar.getY() + (u0Var.seekBar.getHeight() / 2.0f)) - (view.getHeight() / 2.0f);
        view.setX(x11);
        view.setY(y11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 V(final u0 u0Var, final View view, jn0.c0 c0Var, jn0.c0 c0Var2, jn0.c0 c0Var3, jn0.c0 c0Var4) {
        u0Var.videoStartTimeEpochMs = c0Var3.getData();
        u0Var.videoDurationMs = c0Var4.getData();
        u0Var.logger.j("onMetadataSetCallback adjustedEpochTimeMs: " + c0Var + ", eventTimeEpochMs: " + c0Var2 + ", videoStartTimeEpochMs: " + c0Var3 + ", videoDurationMs: " + c0Var4);
        final double dE = jn0.j0.e(jn0.c0.b(c0Var.getData() - c0Var3.getData())) / jn0.j0.e(c0Var4.getData());
        final double dE2 = jn0.j0.e(jn0.c0.b(c0Var2.getData() - c0Var3.getData())) / jn0.j0.e(c0Var4.getData());
        u0Var.seekBar.post(new Runnable() { // from class: com.tesla.dashcam_viewer.k0
            @Override // java.lang.Runnable
            public final void run() {
                u0.W(this.f55906a, dE, dE2, view);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(u0 u0Var, double d11, double d12, View view) {
        u0Var.seekBarInitialPercent = d11;
        int max = (int) (d11 * ((double) u0Var.seekBar.getMax()));
        u0Var.seekBar.setProgress(max);
        u0Var.logger.j("onMetadataSetCallback seekBarInitialPercent: " + u0Var.seekBarInitialPercent + ", initialProgress: " + max);
        double width = (((double) u0Var.seekBar.getWidth()) * d12) - ((double) (((float) view.getWidth()) / 2.0f));
        View view2 = u0Var.eventRectangle;
        if (view2 != null) {
            view2.setX((float) width);
        }
        u0Var.logger.j("onMetadataSetCallback eventRectanglePercent: " + d12 + ", newX: " + width);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 X(u0 u0Var) {
        if (u0Var.playIcon.getVisibility() == 0) {
            u0Var.playIcon.setVisibility(4);
            u0Var.logger.j("camera switched, set play icon invisible");
        }
        return jn0.h0.f84049a;
    }

    private final ObjectAnimator Y(View view, ObjectAnimator existing) {
        if (existing == null) {
            existing = ObjectAnimator.ofFloat(view, (Property<View, Float>) FrameLayout.ALPHA, 1.0f, 0.3f);
            existing.setDuration(850L);
            existing.setRepeatMode(1);
            existing.setRepeatCount(-1);
            existing.setInterpolator(new LinearInterpolator());
        }
        if (!existing.isStarted()) {
            existing.start();
        }
        p013kotlin.jvm.internal.s.h(existing);
        return existing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z() {
        Job job = this.timer;
        if (job != null && job.isActive()) {
            this.logger.j("timer already running");
        } else {
            this.timer = BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(this), this.serialDispatcher, null, new d(null), 2, null);
            this.logger.j("timer started");
        }
    }

    private final void a0(View view, ObjectAnimator animator) {
        if (animator != null) {
            animator.cancel();
        }
        view.setAlpha(0.3f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0() {
        Job job = this.timer;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.timer = null;
        this.logger.j("timer stopped");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(SEIMetadataProcessed data) {
        sb0.f.f(sb0.f.f111040a, this.seiContainer, data, false, 0L, 8, null);
        d0(data);
    }

    private final void d0(SEIMetadataProcessed data) {
        if (data.getBlinkerLeft()) {
            this.leftBlinkAnimator = Y(this.turnSignalLeft, this.leftBlinkAnimator);
        } else {
            a0(this.turnSignalLeft, this.leftBlinkAnimator);
            this.leftBlinkAnimator = null;
        }
        if (data.getBlinkerRight()) {
            this.rightBlinkAnimator = Y(this.turnSignalRight, this.rightBlinkAnimator);
        } else {
            a0(this.turnSignalRight, this.rightBlinkAnimator);
            this.rightBlinkAnimator = null;
        }
    }

    public final void K(final String eventPath, final String camera, final jn0.c0 targetTimeMs) {
        p013kotlin.jvm.internal.s.k(eventPath, "eventPath");
        p013kotlin.jvm.internal.s.k(camera, "camera");
        if ((eventPath.length() != 0 || camera.length() != 0) && !this.surfaceCreated) {
            this.selectEventCallback = new wn0.a() { // from class: com.tesla.dashcam_viewer.l0
                @Override // wn0.a
                public final Object invoke() {
                    return u0.L(this.f55914a, eventPath, camera, targetTimeMs);
                }
            };
            return;
        }
        u1 u1Var = this.videoPlayer;
        if (u1Var != null) {
            u1Var.G(eventPath, camera, targetTimeMs);
        }
    }

    @Override // androidx.p003lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    public final u1 getVideoPlayer() {
        return this.videoPlayer;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.lifecycleRegistry.o(Lifecycle.State.STARTED);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        G();
        this.seiClock.k();
        Job job = this.seiJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.seiJob = null;
        this.lifecycleRegistry.o(Lifecycle.State.DESTROYED);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        ViewGroup.LayoutParams layoutParams = this.surfaceView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        int i11 = right - left;
        int i12 = bottom - top;
        this.logger.j("onLayout: left: " + left + ", top: " + top + ", right: " + right + ", bottom: " + bottom + ", width: " + i11 + ", height: " + i12);
        if (layoutParams2.width == i11 && layoutParams2.height == i12) {
            return;
        }
        layoutParams2.width = i11;
        layoutParams2.height = i12;
        this.surfaceView.setLayoutParams(layoutParams2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (p013kotlin.jvm.internal.s.f(Looper.myLooper(), Looper.getMainLooper())) {
            post(this.relayoutRunnable);
        }
    }

    public final void setVideoPlayer(u1 u1Var) {
        this.videoPlayer = u1Var;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        p013kotlin.jvm.internal.s.k(holder, "holder");
        this.logger.j("surfaceChanged  width: " + width + ", height: " + height);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        p013kotlin.jvm.internal.s.k(holder, "holder");
        this.logger.j("surfaceCreated");
        this.surfaceHolder = holder;
        u1 u1Var = this.videoPlayer;
        if (u1Var != null) {
            u1Var.Q(holder);
        }
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(this), null, null, new e(null), 3, null);
        this.surfaceCreated = true;
        Z();
        this.seiClock.h();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        p013kotlin.jvm.internal.s.k(holder, "holder");
        this.logger.j("surfaceDestroyed");
        u1 u1Var = this.videoPlayer;
        if (u1Var != null) {
            u1Var.b0();
        }
        this.surfaceHolder = null;
        b0();
        this.surfaceCreated = false;
        this.seiClock.h();
        this.seiContainer.setVisibility(4);
        G();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ u0(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.logger = com.tesla.logging.g.INSTANCE.a("DashcamViewer_RNH264HV");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        p013kotlin.jvm.internal.s.j(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.serialDispatcher = ExecutorsKt.from(executorServiceNewSingleThreadExecutor);
        this.seekBarInitialPercent = 0.8d;
        sb0.b bVar = new sb0.b(null, 0L, 3, null);
        this.seiClock = bVar;
        this.relayoutRunnable = new Runnable() { // from class: com.tesla.dashcam_viewer.h0
            @Override // java.lang.Runnable
            public final void run() {
                u0.J(this.f55877a);
            }
        };
        androidx.p003lifecycle.y yVar = new androidx.p003lifecycle.y(this);
        this.lifecycleRegistry = yVar;
        yVar.o(Lifecycle.State.CREATED);
        View viewInflate = View.inflate(context, f0.f55839a, this);
        this.videoControlContainer = (ConstraintLayout) viewInflate.findViewById(e0.f55811c);
        this.timestampTextView = (TextView) viewInflate.findViewById(e0.f55822n);
        this.playIcon = (ImageView) viewInflate.findViewById(e0.f55816h);
        this.surfaceView = (SurfaceView) viewInflate.findViewById(e0.f55821m);
        this.spinner = (LottieAnimationView) viewInflate.findViewById(e0.f55819k);
        this.seekBar = (SeekBar) viewInflate.findViewById(e0.f55817i);
        this.jumpToEventButton = (Button) viewInflate.findViewById(e0.f55815g);
        this.seiContainer = (LinearLayout) viewInflate.findViewById(e0.f55825q);
        this.brakePaddle = (ImageView) viewInflate.findViewById(e0.f55812d);
        this.gearText = (TextView) viewInflate.findViewById(e0.f55814f);
        this.speedText = (TextView) viewInflate.findViewById(e0.f55818j);
        this.fsdText = (TextView) viewInflate.findViewById(e0.f55813e);
        this.turnSignalLeft = (ImageView) viewInflate.findViewById(e0.f55823o);
        this.turnSignalRight = (ImageView) viewInflate.findViewById(e0.f55824p);
        this.steeringWheel = (ImageView) viewInflate.findViewById(e0.f55820l);
        this.acceleratorPedal = (ImageView) viewInflate.findViewById(e0.f55810b);
        this.acceleratorFill = viewInflate.findViewById(e0.f55809a);
        bVar.j();
        this.seiJob = androidx.p003lifecycle.x.a(this).e(new a(null));
        androidx.p003lifecycle.x.a(this).c(new b(null));
    }
}
