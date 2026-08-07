package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import expo.modules.interfaces.permissions.PermissionsResponse;
import io.sentry.b7;
import io.sentry.c1;
import io.sentry.d1;
import io.sentry.f4;
import io.sentry.m0;
import io.sentry.o1;
import io.sentry.o2;
import io.sentry.q7;
import io.sentry.s7;
import io.sentry.transport.a0;
import io.sentry.util.b0;
import io.sentry.x0;
import io.sentry.x3;
import io.sentry.y3;
import io.sentry.z0;
import io.sentry.z6;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import jn0.h0;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.n0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0003VXKBA\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0019\u0010 \u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010\u0019J\u001f\u0010'\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0017H\u0016¢\u0006\u0004\b,\u0010\u0019J\u000f\u0010-\u001a\u00020\u0017H\u0016¢\u0006\u0004\b-\u0010\u0019J\u0019\u0010/\u001a\u00020\u00172\b\u0010.\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0011H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00172\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u000203H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0017H\u0016¢\u0006\u0004\b9\u0010\u0019J\u000f\u0010:\u001a\u00020)H\u0016¢\u0006\u0004\b:\u0010+J\u000f\u0010;\u001a\u00020\u0017H\u0016¢\u0006\u0004\b;\u0010\u0019J\u0017\u0010>\u001a\u00020\u00172\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0017H\u0016¢\u0006\u0004\b@\u0010\u0019J\u0017\u0010C\u001a\u00020\u00172\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u00172\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u00172\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u001f\u0010P\u001a\u00020\u00172\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020MH\u0016¢\u0006\u0004\bP\u0010QJ\u0015\u0010T\u001a\u00020\u00172\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010ZR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010[R\u0016\u0010^\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010a\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u001b\u0010q\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001b\u0010v\u001a\u00020r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bs\u0010n\u001a\u0004\bt\u0010uR\u001b\u0010{\u001a\u00020w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010n\u001a\u0004\by\u0010zR\u001b\u0010\u0080\u0001\u001a\u00020|8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010}\u001a\u0004\b~\u0010\u007fR\u001c\u0010\u0082\u0001\u001a\u00020|8\u0000X\u0080\u0004¢\u0006\r\n\u0004\b>\u0010}\u001a\u0005\b\u0081\u0001\u0010\u007fR\u001b\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b5\u0010\u0084\u0001R\u0019\u0010\u0088\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R'\u0010\u008a\u0001\u001a\u0011\u0012\u0004\u0012\u00020)\u0012\u0005\u0012\u00030\u0083\u0001\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010[R\u0019\u0010\u008d\u0001\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bT\u0010\u008c\u0001R\u001f\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020h\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010ZR\u0018\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u0098\u0001"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/o1;", "Ljava/io/Closeable;", "Lio/sentry/android/replay/r;", "Lio/sentry/android/replay/gestures/c;", "Lio/sentry/y3;", "Lio/sentry/m0$b;", "Lio/sentry/transport/a0$b;", "Lio/sentry/android/replay/u;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/sentry/transport/p;", "dateProvider", "Lkotlin/Function0;", "Lio/sentry/android/replay/g;", "recorderProvider", "Lkotlin/Function1;", "Lio/sentry/protocol/x;", "Lio/sentry/android/replay/i;", "replayCacheProvider", "<init>", "(Landroid/content/Context;Lio/sentry/transport/p;Lwn0/a;Lwn0/l;)V", "(Landroid/content/Context;Lio/sentry/transport/p;)V", "Ljn0/h0;", "K0", "()V", "H0", "k0", "J0", "O0", "", "unfinishedReplayId", "n0", "(Ljava/lang/String;)V", "s0", "Lio/sentry/z0;", "scopes", "Lio/sentry/q7;", "options", "n", "(Lio/sentry/z0;Lio/sentry/q7;)V", "", "D0", "()Z", "start", IntegerTokenConverter.CONVERTER_KEY, "isTerminating", "H", "(Ljava/lang/Boolean;)V", "y0", "()Lio/sentry/protocol/x;", "Lio/sentry/x3;", "converter", "p", "(Lio/sentry/x3;)V", "J", "()Lio/sentry/x3;", DateTokenConverter.CONVERTER_KEY, "t", "stop", "Landroid/graphics/Bitmap;", "bitmap", "o", "(Landroid/graphics/Bitmap;)V", "close", "Lio/sentry/m0$a;", PermissionsResponse.STATUS_KEY, "B", "(Lio/sentry/m0$a;)V", "Lio/sentry/transport/a0;", "rateLimiter", "I", "(Lio/sentry/transport/a0;)V", "Landroid/view/MotionEvent;", "event", "c", "(Landroid/view/MotionEvent;)V", "", Snapshot.WIDTH, Snapshot.HEIGHT, "C", "(II)V", "Lio/sentry/android/replay/s;", "config", "s", "(Lio/sentry/android/replay/s;)V", "a", "Landroid/content/Context;", "b", "Lio/sentry/transport/p;", "Lwn0/a;", "Lwn0/l;", "e", "Lio/sentry/m0$a;", "lastKnownConnectionStatus", "f", "Z", "debugMaskingEnabled", "g", "Lio/sentry/q7;", "h", "Lio/sentry/z0;", "Lio/sentry/android/replay/g;", "recorder", "Lio/sentry/android/replay/gestures/a;", "j", "Lio/sentry/android/replay/gestures/a;", "gestureRecorder", "Lio/sentry/util/b0;", "k", "Lkotlin/Lazy;", "u0", "()Lio/sentry/util/b0;", "random", "Lio/sentry/android/replay/p;", "l", "z0", "()Lio/sentry/android/replay/p;", "rootViewsSpy", "Lio/sentry/android/replay/util/k;", "m", "w0", "()Lio/sentry/android/replay/util/k;", "replayExecutor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled$sentry_android_replay_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled", "isManualPause$sentry_android_replay_release", "isManualPause", "Lio/sentry/android/replay/capture/h;", "Lio/sentry/android/replay/capture/h;", "captureStrategy", "q", "Lio/sentry/x3;", "replayBreadcrumbConverter", "r", "replayCaptureStrategyProvider", "Lio/sentry/android/replay/util/h;", "Lio/sentry/android/replay/util/h;", "mainLooperHandler", "gestureRecorderProvider", "Lio/sentry/util/a;", "u", "Lio/sentry/util/a;", "lifecycleLock", "Lio/sentry/android/replay/m;", "v", "Lio/sentry/android/replay/m;", "lifecycle", "w", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReplayIntegration implements o1, Closeable, r, io.sentry.android.replay.gestures.c, y3, m0.b, a0.b, u {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final a f79847w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f79848x = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.transport.p dateProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<io.sentry.android.replay.g> recorderProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<io.sentry.protocol.x, i> replayCacheProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private volatile m0.a lastKnownConnectionStatus;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean debugMaskingEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private q7 options;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private z0 scopes;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.g recorder;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.gestures.a gestureRecorder;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy random;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy rootViewsSpy;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Lazy replayExecutor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isEnabled;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isManualPause;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.capture.h captureStrategy;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private x3 replayBreadcrumbConverter;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super Boolean, ? extends io.sentry.android.replay.capture.h> replayCaptureStrategyProvider;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.util.h mainLooperHandler;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private wn0.a<io.sentry.android.replay.gestures.a> gestureRecorderProvider;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a lifecycleLock;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final m lifecycle;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration$a;", "", "<init>", "()V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration$b;", "Lio/sentry/hints/c;", "<init>", "()V", "", "e", "()Z", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b implements io.sentry.hints.c {
        @Override // io.sentry.hints.c
        public boolean e() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration$c;", "Ljava/util/concurrent/ThreadFactory;", "<init>", "()V", "Ljava/lang/Runnable;", "r", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "", "a", "I", "cnt", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r11) {
            p013kotlin.jvm.internal.s.k(r11, "r");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryReplayIntegration-");
            int i11 = this.cnt;
            this.cnt = i11 + 1;
            sb2.append(i11);
            Thread thread = new Thread(r11, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/Date;", "newTimestamp", "Ljn0/h0;", "a", "(Ljava/util/Date;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.l<Date, h0> {
        d() {
            super(1);
        }

        public final void a(Date newTimestamp) {
            p013kotlin.jvm.internal.s.k(newTimestamp, "newTimestamp");
            io.sentry.android.replay.capture.h hVar = ReplayIntegration.this.captureStrategy;
            if (hVar != null) {
                io.sentry.android.replay.capture.h hVar2 = ReplayIntegration.this.captureStrategy;
                Integer numValueOf = hVar2 != null ? Integer.valueOf(hVar2.f()) : null;
                p013kotlin.jvm.internal.s.h(numValueOf);
                hVar.e(numValueOf.intValue() + 1);
            }
            io.sentry.android.replay.capture.h hVar3 = ReplayIntegration.this.captureStrategy;
            if (hVar3 == null) {
                return;
            }
            hVar3.m(newTimestamp);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Date date) {
            a(date);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/sentry/android/replay/i;", "", "frameTimeStamp", "Ljn0/h0;", "a", "(Lio/sentry/android/replay/i;J)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.p<i, Long, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f79873c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n0<String> f79874d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Bitmap bitmap, n0<String> n0Var) {
            super(2);
            this.f79873c = bitmap;
            this.f79874d = n0Var;
        }

        public final void a(i onScreenshotRecorded, long j11) throws IOException {
            p013kotlin.jvm.internal.s.k(onScreenshotRecorded, "$this$onScreenshotRecorded");
            onScreenshotRecorded.B(this.f79873c, j11, this.f79874d.f86529a);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(i iVar, Long l11) throws IOException {
            a(iVar, l11.longValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/sentry/util/b0;", "b", "()Lio/sentry/util/b0;"}, k = 3, mv = {1, 9, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.a<b0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f79875c = new f();

        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b0 invoke() {
            return new b0();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/sentry/android/replay/util/k;", "b", "()Lio/sentry/android/replay/util/k;"}, k = 3, mv = {1, 9, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.a<io.sentry.android.replay.util.k> {
        g() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final io.sentry.android.replay.util.k invoke() {
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new c());
            p013kotlin.jvm.internal.s.h(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
            q7 q7Var = ReplayIntegration.this.options;
            if (q7Var == null) {
                p013kotlin.jvm.internal.s.B("options");
                q7Var = null;
            }
            return new io.sentry.android.replay.util.k(scheduledExecutorServiceNewSingleThreadScheduledExecutor, q7Var);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/sentry/android/replay/p;", "b", "()Lio/sentry/android/replay/p;"}, k = 3, mv = {1, 9, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.a<p> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f79877c = new h();

        h() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p invoke() {
            return p.INSTANCE.b();
        }
    }

    static {
        z6.d().b("maven:io.sentry:sentry-android-replay", "8.29.0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplayIntegration(Context context, io.sentry.transport.p dateProvider, wn0.a<? extends io.sentry.android.replay.g> aVar, wn0.l<? super io.sentry.protocol.x, i> lVar) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(dateProvider, "dateProvider");
        this.context = context;
        this.dateProvider = dateProvider;
        this.recorderProvider = aVar;
        this.replayCacheProvider = lVar;
        this.lastKnownConnectionStatus = m0.a.UNKNOWN;
        this.random = jn0.m.b(f.f79875c);
        this.rootViewsSpy = jn0.m.b(h.f79877c);
        this.replayExecutor = jn0.m.b(new g());
        this.isEnabled = new AtomicBoolean(false);
        this.isManualPause = new AtomicBoolean(false);
        o2 o2VarB = o2.b();
        p013kotlin.jvm.internal.s.j(o2VarB, "getInstance(...)");
        this.replayBreadcrumbConverter = o2VarB;
        this.mainLooperHandler = new io.sentry.android.replay.util.h(null, 1, null);
        this.lifecycleLock = new io.sentry.util.a();
        this.lifecycle = new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void G0(n0 n0Var, x0 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        String screen = it.getScreen();
        n0Var.f86529a = screen != null ? p013kotlin.text.t.u1(screen, CoreConstants.DOT, null, 2, null) : 0;
    }

    private final void H0() throws Exception {
        d1 d1VarA = this.lifecycleLock.a();
        try {
            if (this.isEnabled.get()) {
                m mVar = this.lifecycle;
                n nVar = n.PAUSED;
                if (mVar.b(nVar)) {
                    io.sentry.android.replay.g gVar = this.recorder;
                    if (gVar != null) {
                        gVar.d();
                    }
                    io.sentry.android.replay.capture.h hVar = this.captureStrategy;
                    if (hVar != null) {
                        hVar.d();
                    }
                    this.lifecycle.d(nVar);
                    h0 h0Var = h0.f84049a;
                    un0.a.a(d1VarA, null);
                    return;
                }
            }
            un0.a.a(d1VarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(d1VarA, th2);
                throw th3;
            }
        }
    }

    private final void J0() {
        if (this.recorder instanceof io.sentry.android.replay.e) {
            CopyOnWriteArrayList<io.sentry.android.replay.e> copyOnWriteArrayListP = z0().p();
            io.sentry.android.replay.g gVar = this.recorder;
            p013kotlin.jvm.internal.s.i(gVar, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            copyOnWriteArrayListP.add((io.sentry.android.replay.e) gVar);
        }
        z0().p().add(this.gestureRecorder);
    }

    private final void K0() throws Exception {
        z0 z0Var;
        z0 z0Var2;
        a0 a0VarQ;
        a0 a0VarQ2;
        d1 d1VarA = this.lifecycleLock.a();
        try {
            if (this.isEnabled.get()) {
                m mVar = this.lifecycle;
                n nVar = n.RESUMED;
                if (mVar.b(nVar)) {
                    if (!this.isManualPause.get() && this.lastKnownConnectionStatus != m0.a.DISCONNECTED && (((z0Var = this.scopes) == null || (a0VarQ2 = z0Var.q()) == null || !a0VarQ2.I(io.sentry.k.All)) && ((z0Var2 = this.scopes) == null || (a0VarQ = z0Var2.q()) == null || !a0VarQ.I(io.sentry.k.Replay)))) {
                        this.lifecycle.d(nVar);
                        io.sentry.android.replay.capture.h hVar = this.captureStrategy;
                        if (hVar != null) {
                            hVar.i();
                        }
                        io.sentry.android.replay.g gVar = this.recorder;
                        if (gVar != null) {
                            gVar.i();
                            h0 h0Var = h0.f84049a;
                        }
                        un0.a.a(d1VarA, null);
                        return;
                    }
                    un0.a.a(d1VarA, null);
                    return;
                }
            }
            un0.a.a(d1VarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(d1VarA, th2);
                throw th3;
            }
        }
    }

    private final void O0() {
        if (this.recorder instanceof io.sentry.android.replay.e) {
            CopyOnWriteArrayList<io.sentry.android.replay.e> copyOnWriteArrayListP = z0().p();
            io.sentry.android.replay.g gVar = this.recorder;
            p013kotlin.jvm.internal.s.i(gVar, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            copyOnWriteArrayListP.remove((io.sentry.android.replay.e) gVar);
        }
        z0().p().remove(this.gestureRecorder);
    }

    private final void k0() throws Exception {
        z0 z0Var;
        z0 z0Var2;
        a0 a0VarQ;
        a0 a0VarQ2;
        if (this.captureStrategy instanceof io.sentry.android.replay.capture.m) {
            if (this.lastKnownConnectionStatus == m0.a.DISCONNECTED || !(((z0Var = this.scopes) == null || (a0VarQ2 = z0Var.q()) == null || !a0VarQ2.I(io.sentry.k.All)) && ((z0Var2 = this.scopes) == null || (a0VarQ = z0Var2.q()) == null || !a0VarQ.I(io.sentry.k.Replay)))) {
                H0();
            }
        }
    }

    private final void n0(String unfinishedReplayId) {
        File[] fileArrListFiles;
        q7 q7Var = this.options;
        if (q7Var == null) {
            p013kotlin.jvm.internal.s.B("options");
            q7Var = null;
        }
        String cacheDirPath = q7Var.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        p013kotlin.jvm.internal.s.h(fileArrListFiles);
        for (File file : fileArrListFiles) {
            String name = file.getName();
            p013kotlin.jvm.internal.s.h(name);
            if (p013kotlin.text.t.b0(name, "replay_", false, 2, null)) {
                String string = y0().toString();
                p013kotlin.jvm.internal.s.j(string, "toString(...)");
                if (!p013kotlin.text.t.h0(name, string, false, 2, null) && (p013kotlin.text.t.y0(unfinishedReplayId) || !p013kotlin.text.t.h0(name, unfinishedReplayId, false, 2, null))) {
                    io.sentry.util.i.a(file);
                }
            }
        }
    }

    static /* synthetic */ void r0(ReplayIntegration replayIntegration, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        replayIntegration.n0(str);
    }

    private final void s0() {
        q7 q7Var = this.options;
        q7 q7Var2 = null;
        if (q7Var == null) {
            p013kotlin.jvm.internal.s.B("options");
            q7Var = null;
        }
        c1 executorService = q7Var.getExecutorService();
        p013kotlin.jvm.internal.s.j(executorService, "getExecutorService(...)");
        q7 q7Var3 = this.options;
        if (q7Var3 == null) {
            p013kotlin.jvm.internal.s.B("options");
        } else {
            q7Var2 = q7Var3;
        }
        io.sentry.android.replay.util.f.b(executorService, q7Var2, "ReplayIntegration.finalize_previous_replay", new Runnable() { // from class: io.sentry.android.replay.k
            @Override // java.lang.Runnable
            public final void run() {
                ReplayIntegration.t0(this.f80073a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(ReplayIntegration replayIntegration) {
        q7 q7Var;
        q7 q7Var2 = replayIntegration.options;
        if (q7Var2 == null) {
            p013kotlin.jvm.internal.s.B("options");
            q7Var2 = null;
        }
        io.sentry.cache.t tVarFindPersistingScopeObserver = q7Var2.findPersistingScopeObserver();
        if (tVarFindPersistingScopeObserver != null) {
            q7 q7Var3 = replayIntegration.options;
            if (q7Var3 == null) {
                p013kotlin.jvm.internal.s.B("options");
                q7Var3 = null;
            }
            String str = (String) tVarFindPersistingScopeObserver.B(q7Var3, "replay.json", String.class);
            if (str != null) {
                io.sentry.protocol.x xVar = new io.sentry.protocol.x(str);
                if (p013kotlin.jvm.internal.s.f(xVar, io.sentry.protocol.x.f81078b)) {
                    r0(replayIntegration, null, 1, null);
                    return;
                }
                i.Companion companion = i.INSTANCE;
                q7 q7Var4 = replayIntegration.options;
                if (q7Var4 == null) {
                    p013kotlin.jvm.internal.s.B("options");
                    q7Var4 = null;
                }
                LastSegmentData lastSegmentDataC = companion.c(q7Var4, xVar, replayIntegration.replayCacheProvider);
                if (lastSegmentDataC == null) {
                    r0(replayIntegration, null, 1, null);
                    return;
                }
                q7 q7Var5 = replayIntegration.options;
                if (q7Var5 == null) {
                    p013kotlin.jvm.internal.s.B("options");
                    q7Var5 = null;
                }
                Object objB = tVarFindPersistingScopeObserver.B(q7Var5, "breadcrumbs.json", List.class);
                List<io.sentry.e> list = objB instanceof List ? (List) objB : null;
                io.sentry.android.replay.capture.h.Companion companion2 = io.sentry.android.replay.capture.h.INSTANCE;
                z0 z0Var = replayIntegration.scopes;
                q7 q7Var6 = replayIntegration.options;
                if (q7Var6 == null) {
                    p013kotlin.jvm.internal.s.B("options");
                    q7Var = null;
                } else {
                    q7Var = q7Var6;
                }
                io.sentry.android.replay.capture.h.c cVarC = companion2.c(z0Var, q7Var, lastSegmentDataC.getDuration(), lastSegmentDataC.getTimestamp(), xVar, lastSegmentDataC.getId(), lastSegmentDataC.getRecorderConfig().getRecordingHeight(), lastSegmentDataC.getRecorderConfig().getRecordingWidth(), lastSegmentDataC.getReplayType(), lastSegmentDataC.getCache(), lastSegmentDataC.getRecorderConfig().getFrameRate(), lastSegmentDataC.getRecorderConfig().getBitRate(), lastSegmentDataC.getScreenAtStart(), list, new LinkedList(lastSegmentDataC.c()));
                if (cVarC instanceof io.sentry.android.replay.capture.h.c.Created) {
                    io.sentry.h0 h0VarE = io.sentry.util.n.e(new b());
                    z0 z0Var2 = replayIntegration.scopes;
                    p013kotlin.jvm.internal.s.h(h0VarE);
                    ((io.sentry.android.replay.capture.h.c.Created) cVarC).a(z0Var2, h0VarE);
                }
                replayIntegration.n0(str);
                return;
            }
        }
        r0(replayIntegration, null, 1, null);
    }

    private final b0 u0() {
        return (b0) this.random.getValue();
    }

    private final io.sentry.android.replay.util.k w0() {
        return (io.sentry.android.replay.util.k) this.replayExecutor.getValue();
    }

    @Override // io.sentry.m0.b
    public void B(m0.a status) throws Exception {
        p013kotlin.jvm.internal.s.k(status, "status");
        this.lastKnownConnectionStatus = status;
        if (this.captureStrategy instanceof io.sentry.android.replay.capture.m) {
            if (status == m0.a.DISCONNECTED) {
                H0();
            } else {
                K0();
            }
        }
    }

    @Override // io.sentry.android.replay.u
    public void C(int width, int height) {
        if (this.isEnabled.get() && D0()) {
            q7 q7Var = this.options;
            q7 q7Var2 = null;
            if (q7Var == null) {
                p013kotlin.jvm.internal.s.B("options");
                q7Var = null;
            }
            if (q7Var.getSessionReplay().y()) {
                ScreenshotRecorderConfig.Companion companion = ScreenshotRecorderConfig.INSTANCE;
                Context context = this.context;
                q7 q7Var3 = this.options;
                if (q7Var3 == null) {
                    p013kotlin.jvm.internal.s.B("options");
                } else {
                    q7Var2 = q7Var3;
                }
                s7 sessionReplay = q7Var2.getSessionReplay();
                p013kotlin.jvm.internal.s.j(sessionReplay, "getSessionReplay(...)");
                s(companion.b(context, sessionReplay, width, height));
            }
        }
    }

    public boolean D0() {
        return this.lifecycle.getCurrentState().compareTo(n.STARTED) >= 0 && this.lifecycle.getCurrentState().compareTo(n.STOPPED) < 0;
    }

    @Override // io.sentry.y3
    public void H(Boolean isTerminating) {
        if (this.isEnabled.get() && D0()) {
            io.sentry.protocol.x xVar = io.sentry.protocol.x.f81078b;
            io.sentry.android.replay.capture.h hVar = this.captureStrategy;
            q7 q7Var = null;
            if (xVar.equals(hVar != null ? hVar.l() : null)) {
                q7 q7Var2 = this.options;
                if (q7Var2 == null) {
                    p013kotlin.jvm.internal.s.B("options");
                } else {
                    q7Var = q7Var2;
                }
                q7Var.getLogger().c(b7.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                return;
            }
            io.sentry.android.replay.capture.h hVar2 = this.captureStrategy;
            if (hVar2 != null) {
                hVar2.k(p013kotlin.jvm.internal.s.f(isTerminating, Boolean.TRUE), new d());
            }
            io.sentry.android.replay.capture.h hVar3 = this.captureStrategy;
            this.captureStrategy = hVar3 != null ? hVar3.h() : null;
        }
    }

    @Override // io.sentry.transport.a0.b
    public void I(a0 rateLimiter) throws Exception {
        p013kotlin.jvm.internal.s.k(rateLimiter, "rateLimiter");
        if (this.captureStrategy instanceof io.sentry.android.replay.capture.m) {
            if (rateLimiter.I(io.sentry.k.All) || rateLimiter.I(io.sentry.k.Replay)) {
                H0();
            } else {
                K0();
            }
        }
    }

    @Override // io.sentry.y3
    /* JADX INFO: renamed from: J, reason: from getter */
    public x3 getReplayBreadcrumbConverter() {
        return this.replayBreadcrumbConverter;
    }

    @Override // io.sentry.android.replay.gestures.c
    public void c(MotionEvent event) {
        io.sentry.android.replay.capture.h hVar;
        p013kotlin.jvm.internal.s.k(event, "event");
        if (this.isEnabled.get() && this.lifecycle.c() && (hVar = this.captureStrategy) != null) {
            hVar.c(event);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        a0 a0VarQ;
        d1 d1VarA = this.lifecycleLock.a();
        try {
            if (this.isEnabled.get()) {
                m mVar = this.lifecycle;
                n nVar = n.CLOSED;
                if (mVar.b(nVar)) {
                    q7 q7Var = this.options;
                    if (q7Var == null) {
                        p013kotlin.jvm.internal.s.B("options");
                        q7Var = null;
                    }
                    q7Var.getConnectionStatusProvider().z1(this);
                    z0 z0Var = this.scopes;
                    if (z0Var != null && (a0VarQ = z0Var.q()) != null) {
                        a0VarQ.k0(this);
                    }
                    stop();
                    io.sentry.android.replay.g gVar = this.recorder;
                    if (gVar != null) {
                        gVar.close();
                    }
                    this.recorder = null;
                    z0().close();
                    w0().shutdown();
                    this.lifecycle.d(nVar);
                    h0 h0Var = h0.f84049a;
                    un0.a.a(d1VarA, null);
                    return;
                }
            }
            un0.a.a(d1VarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(d1VarA, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.y3
    public void d() throws Exception {
        this.isManualPause.set(true);
        H0();
    }

    @Override // io.sentry.y3
    public void i() throws Exception {
        this.isManualPause.set(false);
        K0();
    }

    @Override // io.sentry.o1
    public void n(z0 scopes, q7 options) {
        ReplayIntegration replayIntegration;
        q7 q7Var;
        io.sentry.android.replay.g wVar;
        io.sentry.android.replay.gestures.a aVar;
        p013kotlin.jvm.internal.s.k(scopes, "scopes");
        p013kotlin.jvm.internal.s.k(options, "options");
        this.options = options;
        if (Build.VERSION.SDK_INT < 26) {
            options.getLogger().c(b7.INFO, "Session replay is only supported on API 26 and above", new Object[0]);
            return;
        }
        if (!options.getSessionReplay().w() && !options.getSessionReplay().x()) {
            options.getLogger().c(b7.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.scopes = scopes;
        wn0.a<io.sentry.android.replay.g> aVar2 = this.recorderProvider;
        if (aVar2 == null || (wVar = aVar2.invoke()) == null) {
            replayIntegration = this;
            q7Var = options;
            wVar = new w(q7Var, replayIntegration, this, this.mainLooperHandler, w0());
        } else {
            replayIntegration = this;
            q7Var = options;
        }
        replayIntegration.recorder = wVar;
        wn0.a<io.sentry.android.replay.gestures.a> aVar3 = replayIntegration.gestureRecorderProvider;
        if (aVar3 == null || (aVar = aVar3.invoke()) == null) {
            aVar = new io.sentry.android.replay.gestures.a(q7Var, this);
        }
        replayIntegration.gestureRecorder = aVar;
        replayIntegration.isEnabled.set(true);
        q7Var.getConnectionStatusProvider().s3(this);
        a0 a0VarQ = scopes.q();
        if (a0VarQ != null) {
            a0VarQ.t(this);
        }
        io.sentry.util.p.a("Replay");
        s0();
    }

    @Override // io.sentry.android.replay.r
    public void o(Bitmap bitmap) throws Exception {
        p013kotlin.jvm.internal.s.k(bitmap, "bitmap");
        final n0 n0Var = new n0();
        z0 z0Var = this.scopes;
        if (z0Var != null) {
            z0Var.s(new f4() { // from class: io.sentry.android.replay.l
                @Override // io.sentry.f4
                public final void a(x0 x0Var) {
                    ReplayIntegration.G0(n0Var, x0Var);
                }
            });
        }
        io.sentry.android.replay.capture.h hVar = this.captureStrategy;
        if (hVar != null) {
            hVar.g(bitmap, new e(bitmap, n0Var));
        }
        k0();
    }

    @Override // io.sentry.y3
    public void p(x3 converter) {
        p013kotlin.jvm.internal.s.k(converter, "converter");
        this.replayBreadcrumbConverter = converter;
    }

    public final void s(ScreenshotRecorderConfig config) {
        io.sentry.android.replay.g gVar;
        p013kotlin.jvm.internal.s.k(config, "config");
        if (this.isEnabled.get() && D0()) {
            io.sentry.android.replay.capture.h hVar = this.captureStrategy;
            if (hVar != null) {
                hVar.s(config);
            }
            io.sentry.android.replay.g gVar2 = this.recorder;
            if (gVar2 != null) {
                gVar2.s(config);
            }
            if (this.lifecycle.getCurrentState() != n.PAUSED || (gVar = this.recorder) == null) {
                return;
            }
            gVar.d();
        }
    }

    @Override // io.sentry.y3
    public void start() throws Exception {
        io.sentry.android.replay.capture.h fVar;
        q7 q7Var;
        q7 q7Var2;
        d1 d1VarA = this.lifecycleLock.a();
        try {
            if (!this.isEnabled.get()) {
                un0.a.a(d1VarA, null);
                return;
            }
            m mVar = this.lifecycle;
            n nVar = n.STARTED;
            if (!mVar.b(nVar)) {
                q7 q7Var3 = this.options;
                if (q7Var3 == null) {
                    p013kotlin.jvm.internal.s.B("options");
                    q7Var3 = null;
                }
                q7Var3.getLogger().c(b7.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                un0.a.a(d1VarA, null);
                return;
            }
            b0 b0VarU0 = u0();
            q7 q7Var4 = this.options;
            if (q7Var4 == null) {
                p013kotlin.jvm.internal.s.B("options");
                q7Var4 = null;
            }
            boolean zA = io.sentry.android.replay.util.m.a(b0VarU0, q7Var4.getSessionReplay().q());
            if (!zA) {
                q7 q7Var5 = this.options;
                if (q7Var5 == null) {
                    p013kotlin.jvm.internal.s.B("options");
                    q7Var5 = null;
                }
                if (!q7Var5.getSessionReplay().x()) {
                    q7 q7Var6 = this.options;
                    if (q7Var6 == null) {
                        p013kotlin.jvm.internal.s.B("options");
                        q7Var6 = null;
                    }
                    q7Var6.getLogger().c(b7.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    un0.a.a(d1VarA, null);
                    return;
                }
            }
            this.lifecycle.d(nVar);
            wn0.l<? super Boolean, ? extends io.sentry.android.replay.capture.h> lVar = this.replayCaptureStrategyProvider;
            if (lVar == null || (fVar = lVar.invoke(Boolean.valueOf(zA))) == null) {
                if (zA) {
                    q7 q7Var7 = this.options;
                    if (q7Var7 == null) {
                        p013kotlin.jvm.internal.s.B("options");
                        q7Var2 = null;
                    } else {
                        q7Var2 = q7Var7;
                    }
                    fVar = new io.sentry.android.replay.capture.m(q7Var2, this.scopes, this.dateProvider, w0(), this.replayCacheProvider);
                } else {
                    q7 q7Var8 = this.options;
                    if (q7Var8 == null) {
                        p013kotlin.jvm.internal.s.B("options");
                        q7Var = null;
                    } else {
                        q7Var = q7Var8;
                    }
                    fVar = new io.sentry.android.replay.capture.f(q7Var, this.scopes, this.dateProvider, u0(), w0(), this.replayCacheProvider);
                }
            }
            this.captureStrategy = fVar;
            io.sentry.android.replay.g gVar = this.recorder;
            if (gVar != null) {
                gVar.start();
            }
            io.sentry.android.replay.capture.h hVar = this.captureStrategy;
            if (hVar != null) {
                io.sentry.android.replay.capture.h.b.a(hVar, 0, null, null, 7, null);
            }
            J0();
            h0 h0Var = h0.f84049a;
            un0.a.a(d1VarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(d1VarA, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.y3
    public void stop() throws Exception {
        d1 d1VarA = this.lifecycleLock.a();
        try {
            if (this.isEnabled.get()) {
                m mVar = this.lifecycle;
                n nVar = n.STOPPED;
                if (mVar.b(nVar)) {
                    O0();
                    io.sentry.android.replay.g gVar = this.recorder;
                    if (gVar != null) {
                        gVar.reset();
                    }
                    io.sentry.android.replay.g gVar2 = this.recorder;
                    if (gVar2 != null) {
                        gVar2.stop();
                    }
                    io.sentry.android.replay.gestures.a aVar = this.gestureRecorder;
                    if (aVar != null) {
                        aVar.b();
                    }
                    io.sentry.android.replay.capture.h hVar = this.captureStrategy;
                    if (hVar != null) {
                        hVar.stop();
                    }
                    this.captureStrategy = null;
                    this.lifecycle.d(nVar);
                    h0 h0Var = h0.f84049a;
                    un0.a.a(d1VarA, null);
                    return;
                }
            }
            un0.a.a(d1VarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(d1VarA, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.y3
    /* JADX INFO: renamed from: t, reason: from getter */
    public boolean getDebugMaskingEnabled() {
        return this.debugMaskingEnabled;
    }

    public io.sentry.protocol.x y0() {
        io.sentry.protocol.x xVarL;
        io.sentry.android.replay.capture.h hVar = this.captureStrategy;
        if (hVar != null && (xVarL = hVar.l()) != null) {
            return xVarL;
        }
        io.sentry.protocol.x EMPTY_ID = io.sentry.protocol.x.f81078b;
        p013kotlin.jvm.internal.s.j(EMPTY_ID, "EMPTY_ID");
        return EMPTY_ID;
    }

    public final p z0() {
        return (p) this.rootViewsSpy.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(Context context, io.sentry.transport.p dateProvider) {
        this(io.sentry.android.replay.util.c.a(context), dateProvider, null, null);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(dateProvider, "dateProvider");
    }
}
