package io.sentry.android.replay.capture;

import android.annotation.TargetApi;
import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.b7;
import io.sentry.protocol.x;
import io.sentry.q7;
import io.sentry.r7;
import io.sentry.transport.p;
import io.sentry.z0;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import jn0.h0;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u001a\b!\u0018\u0000 22\u00020\u0001:\u0002y8BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0093\u0001\u0010.\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0004¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00152\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00152\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010;R\u001a\u0010\t\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010E\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010?R\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010N\u001a\u00020J8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010K\u001a\u0004\bL\u0010MR$\u0010$\u001a\u0004\u0018\u00010\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR/\u00101\u001a\u0004\u0018\u0001002\b\u0010T\u001a\u0004\u0018\u0001008@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u00103R/\u0010_\u001a\u0004\u0018\u00010\u001e2\b\u0010T\u001a\u0004\u0018\u00010\u001e8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010V\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001a\u0010d\u001a\u00020`8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b]\u0010a\u001a\u0004\bb\u0010cR/\u0010&\u001a\u0004\u0018\u00010%2\b\u0010T\u001a\u0004\u0018\u00010%8D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010V\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR+\u0010m\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020\u000b8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bi\u0010V\u001a\u0004\bZ\u0010j\"\u0004\bk\u0010lR+\u0010p\u001a\u00020\u00102\u0006\u0010T\u001a\u00020\u00108V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010V\u001a\u0004\b@\u0010n\"\u0004\b<\u0010oR+\u0010\u0014\u001a\u00020\u00132\u0006\u0010T\u001a\u00020\u00138V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bq\u0010V\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR \u0010x\u001a\b\u0012\u0004\u0012\u00020+0*8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bD\u0010v\u001a\u0004\bq\u0010w¨\u0006z"}, d2 = {"Lio/sentry/android/replay/capture/a;", "Lio/sentry/android/replay/capture/h;", "Lio/sentry/q7;", "options", "Lio/sentry/z0;", "scopes", "Lio/sentry/transport/p;", "dateProvider", "Ljava/util/concurrent/ScheduledExecutorService;", "replayExecutor", "Lkotlin/Function1;", "Lio/sentry/protocol/x;", "Lio/sentry/android/replay/i;", "replayCacheProvider", "<init>", "(Lio/sentry/q7;Lio/sentry/z0;Lio/sentry/transport/p;Ljava/util/concurrent/ScheduledExecutorService;Lwn0/l;)V", "", "segmentId", "replayId", "Lio/sentry/r7$b;", "replayType", "Ljn0/h0;", "j", "(ILio/sentry/protocol/x;Lio/sentry/r7$b;)V", IntegerTokenConverter.CONVERTER_KEY, "()V", DateTokenConverter.CONVERTER_KEY, "stop", "", "duration", "Ljava/util/Date;", "currentSegmentTimestamp", Snapshot.HEIGHT, Snapshot.WIDTH, "frameRate", "bitRate", "cache", "", "screenAtStart", "", "Lio/sentry/e;", "breadcrumbs", "Ljava/util/Deque;", "Lio/sentry/rrweb/b;", "events", "Lio/sentry/android/replay/capture/h$c;", "n", "(JLjava/util/Date;Lio/sentry/protocol/x;IIIIILio/sentry/r7$b;Lio/sentry/android/replay/i;Ljava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/h$c;", "Lio/sentry/android/replay/s;", "recorderConfig", "s", "(Lio/sentry/android/replay/s;)V", "Landroid/view/MotionEvent;", "event", "c", "(Landroid/view/MotionEvent;)V", "b", "Lio/sentry/q7;", "Lio/sentry/z0;", "Lio/sentry/transport/p;", "e", "Ljava/util/concurrent/ScheduledExecutorService;", "u", "()Ljava/util/concurrent/ScheduledExecutorService;", "f", "Lwn0/l;", "g", "Lkotlin/Lazy;", "r", "persistingExecutor", "Lio/sentry/android/replay/gestures/b;", "h", "Lio/sentry/android/replay/gestures/b;", "gestureConverter", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "z", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isTerminating", "Lio/sentry/android/replay/i;", "p", "()Lio/sentry/android/replay/i;", "setCache", "(Lio/sentry/android/replay/i;)V", "<set-?>", "k", "Lkotlin/properties/d;", "t", "()Lio/sentry/android/replay/s;", "B", "l", "y", "()Ljava/util/Date;", "m", "(Ljava/util/Date;)V", "segmentTimestamp", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "v", "()Ljava/util/concurrent/atomic/AtomicLong;", "replayStartTimestamp", "x", "()Ljava/lang/String;", "D", "(Ljava/lang/String;)V", "o", "()Lio/sentry/protocol/x;", "A", "(Lio/sentry/protocol/x;)V", "currentReplayId", "()I", "(I)V", "currentSegment", "q", "w", "()Lio/sentry/r7$b;", "C", "(Lio/sentry/r7$b;)V", "Ljava/util/Deque;", "()Ljava/util/Deque;", "currentEvents", "a", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
public abstract class a implements io.sentry.android.replay.capture.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q7 options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z0 scopes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p dateProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ScheduledExecutorService replayExecutor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<x, io.sentry.android.replay.i> replayCacheProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy persistingExecutor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.android.replay.gestures.b gestureConverter;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isTerminating;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.i cache;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.properties.d recorderConfig;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.properties.d segmentTimestamp;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final AtomicLong replayStartTimestamp;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.properties.d screenAtStart;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.properties.d currentReplayId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.properties.d currentSegment;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.properties.d replayType;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Deque<io.sentry.rrweb.b> currentEvents;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final /* synthetic */ co0.m<Object>[] f79893t = {o0.f(new z(a.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0)), o0.f(new z(a.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0)), o0.f(new z(a.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0)), o0.f(new z(a.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0)), o0.f(new z(a.class, "currentSegment", "getCurrentSegment()I", 0)), o0.f(new z(a.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0))};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f79894u = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lio/sentry/android/replay/capture/a$b;", "Ljava/util/concurrent/ThreadFactory;", "<init>", "()V", "Ljava/lang/Runnable;", "r", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "", "a", "I", "cnt", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r11) {
            s.k(r11, "r");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryReplayPersister-");
            int i11 = this.cnt;
            this.cnt = i11 + 1;
            sb2.append(i11);
            Thread thread = new Thread(r11, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/sentry/android/replay/util/k;", "b", "()Lio/sentry/android/replay/util/k;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.a<io.sentry.android.replay.util.k> {
        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final io.sentry.android.replay.util.k invoke() {
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new b());
            s.h(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
            return new io.sentry.android.replay.util.k(scheduledExecutorServiceNewSingleThreadScheduledExecutor, a.this.options);
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, d2 = {"io/sentry/android/replay/capture/a$d", "Lkotlin/properties/d;", "", "Lkotlin/Function0;", "Ljn0/h0;", "task", "a", "(Lwn0/a;)V", "thisRef", "Lco0/m;", "property", "getValue", "(Ljava/lang/Object;Lco0/m;)Ljava/lang/Object;", "value", "setValue", "(Ljava/lang/Object;Lco0/m;Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements p013kotlin.properties.d<Object, x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AtomicReference<x> value;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f79915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f79916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f79917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f79918e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class RunnableC1685a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ wn0.a f79919a;

            public RunnableC1685a(wn0.a aVar) {
                this.f79919a = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f79919a.invoke();
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        public static final class b extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f79920c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f79921d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f79922e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f79923f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f79924g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f79920c = str;
                this.f79921d = obj;
                this.f79922e = obj2;
                this.f79923f = aVar;
                this.f79924g = str2;
            }

            public final void b() throws Exception {
                Object obj = this.f79922e;
                io.sentry.android.replay.i cache = this.f79923f.getCache();
                if (cache != null) {
                    cache.k0(this.f79924g, String.valueOf(obj));
                }
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() throws Exception {
                b();
                return h0.f84049a;
            }
        }

        public d(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f79915b = aVar;
            this.f79916c = str;
            this.f79917d = aVar2;
            this.f79918e = str2;
            this.value = new AtomicReference<>(obj);
        }

        private final void a(wn0.a<h0> task) {
            if (this.f79915b.options.getThreadChecker().a()) {
                this.f79915b.r().submit(new io.sentry.android.replay.util.l("CaptureStrategy.runInBackground", new RunnableC1685a(task)));
                return;
            }
            try {
                task.invoke();
            } catch (Throwable th2) {
                this.f79915b.options.getLogger().a(b7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // p013kotlin.properties.d, p013kotlin.properties.c
        public x getValue(Object thisRef, co0.m<?> property) {
            s.k(property, "property");
            return this.value.get();
        }

        @Override // p013kotlin.properties.d
        public void setValue(Object thisRef, co0.m<?> property, x value) {
            s.k(property, "property");
            x andSet = this.value.getAndSet(value);
            if (s.f(andSet, value)) {
                return;
            }
            a(new b(this.f79916c, andSet, value, this.f79917d, this.f79918e));
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, d2 = {"io/sentry/android/replay/capture/a$e", "Lkotlin/properties/d;", "", "Lkotlin/Function0;", "Ljn0/h0;", "task", "a", "(Lwn0/a;)V", "thisRef", "Lco0/m;", "property", "getValue", "(Ljava/lang/Object;Lco0/m;)Ljava/lang/Object;", "value", "setValue", "(Ljava/lang/Object;Lco0/m;Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements p013kotlin.properties.d<Object, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AtomicReference<Integer> value;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f79926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f79927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f79928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f79929e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$e$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class RunnableC1686a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ wn0.a f79930a;

            public RunnableC1686a(wn0.a aVar) {
                this.f79930a = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f79930a.invoke();
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        public static final class b extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f79931c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f79932d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f79933e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f79934f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f79935g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f79931c = str;
                this.f79932d = obj;
                this.f79933e = obj2;
                this.f79934f = aVar;
                this.f79935g = str2;
            }

            public final void b() throws Exception {
                Object obj = this.f79933e;
                io.sentry.android.replay.i cache = this.f79934f.getCache();
                if (cache != null) {
                    cache.k0(this.f79935g, String.valueOf(obj));
                }
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() throws Exception {
                b();
                return h0.f84049a;
            }
        }

        public e(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f79926b = aVar;
            this.f79927c = str;
            this.f79928d = aVar2;
            this.f79929e = str2;
            this.value = new AtomicReference<>(obj);
        }

        private final void a(wn0.a<h0> task) {
            if (this.f79926b.options.getThreadChecker().a()) {
                this.f79926b.r().submit(new io.sentry.android.replay.util.l("CaptureStrategy.runInBackground", new RunnableC1686a(task)));
                return;
            }
            try {
                task.invoke();
            } catch (Throwable th2) {
                this.f79926b.options.getLogger().a(b7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // p013kotlin.properties.d, p013kotlin.properties.c
        public Integer getValue(Object thisRef, co0.m<?> property) {
            s.k(property, "property");
            return this.value.get();
        }

        @Override // p013kotlin.properties.d
        public void setValue(Object thisRef, co0.m<?> property, Integer value) {
            s.k(property, "property");
            Integer andSet = this.value.getAndSet(value);
            if (s.f(andSet, value)) {
                return;
            }
            a(new b(this.f79927c, andSet, value, this.f79928d, this.f79929e));
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, d2 = {"io/sentry/android/replay/capture/a$f", "Lkotlin/properties/d;", "", "Lkotlin/Function0;", "Ljn0/h0;", "task", "a", "(Lwn0/a;)V", "thisRef", "Lco0/m;", "property", "getValue", "(Ljava/lang/Object;Lco0/m;)Ljava/lang/Object;", "value", "setValue", "(Ljava/lang/Object;Lco0/m;Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements p013kotlin.properties.d<Object, r7.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AtomicReference<r7.b> value;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f79937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f79938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f79939d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f79940e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$f$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class RunnableC1687a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ wn0.a f79941a;

            public RunnableC1687a(wn0.a aVar) {
                this.f79941a = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f79941a.invoke();
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        public static final class b extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f79942c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f79943d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f79944e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f79945f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f79946g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f79942c = str;
                this.f79943d = obj;
                this.f79944e = obj2;
                this.f79945f = aVar;
                this.f79946g = str2;
            }

            public final void b() throws Exception {
                Object obj = this.f79944e;
                io.sentry.android.replay.i cache = this.f79945f.getCache();
                if (cache != null) {
                    cache.k0(this.f79946g, String.valueOf(obj));
                }
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() throws Exception {
                b();
                return h0.f84049a;
            }
        }

        public f(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f79937b = aVar;
            this.f79938c = str;
            this.f79939d = aVar2;
            this.f79940e = str2;
            this.value = new AtomicReference<>(obj);
        }

        private final void a(wn0.a<h0> task) {
            if (this.f79937b.options.getThreadChecker().a()) {
                this.f79937b.r().submit(new io.sentry.android.replay.util.l("CaptureStrategy.runInBackground", new RunnableC1687a(task)));
                return;
            }
            try {
                task.invoke();
            } catch (Throwable th2) {
                this.f79937b.options.getLogger().a(b7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // p013kotlin.properties.d, p013kotlin.properties.c
        public r7.b getValue(Object thisRef, co0.m<?> property) {
            s.k(property, "property");
            return this.value.get();
        }

        @Override // p013kotlin.properties.d
        public void setValue(Object thisRef, co0.m<?> property, r7.b value) {
            s.k(property, "property");
            r7.b andSet = this.value.getAndSet(value);
            if (s.f(andSet, value)) {
                return;
            }
            a(new b(this.f79938c, andSet, value, this.f79939d, this.f79940e));
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, d2 = {"io/sentry/android/replay/capture/a$g", "Lkotlin/properties/d;", "", "Lkotlin/Function0;", "Ljn0/h0;", "task", "a", "(Lwn0/a;)V", "thisRef", "Lco0/m;", "property", "getValue", "(Ljava/lang/Object;Lco0/m;)Ljava/lang/Object;", "value", "setValue", "(Ljava/lang/Object;Lco0/m;Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements p013kotlin.properties.d<Object, ScreenshotRecorderConfig> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AtomicReference<ScreenshotRecorderConfig> value;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f79948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f79949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f79950d;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$g$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class RunnableC1688a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ wn0.a f79951a;

            public RunnableC1688a(wn0.a aVar) {
                this.f79951a = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f79951a.invoke();
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        public static final class b extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f79952c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f79953d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f79954e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f79955f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar) {
                super(0);
                this.f79952c = str;
                this.f79953d = obj;
                this.f79954e = obj2;
                this.f79955f = aVar;
            }

            public final void b() throws Exception {
                Object obj = this.f79953d;
                ScreenshotRecorderConfig screenshotRecorderConfig = (ScreenshotRecorderConfig) this.f79954e;
                if (screenshotRecorderConfig == null) {
                    return;
                }
                io.sentry.android.replay.i cache = this.f79955f.getCache();
                if (cache != null) {
                    cache.k0("config.height", String.valueOf(screenshotRecorderConfig.getRecordingHeight()));
                }
                io.sentry.android.replay.i cache2 = this.f79955f.getCache();
                if (cache2 != null) {
                    cache2.k0("config.width", String.valueOf(screenshotRecorderConfig.getRecordingWidth()));
                }
                io.sentry.android.replay.i cache3 = this.f79955f.getCache();
                if (cache3 != null) {
                    cache3.k0("config.frame-rate", String.valueOf(screenshotRecorderConfig.getFrameRate()));
                }
                io.sentry.android.replay.i cache4 = this.f79955f.getCache();
                if (cache4 != null) {
                    cache4.k0("config.bit-rate", String.valueOf(screenshotRecorderConfig.getBitRate()));
                }
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() throws Exception {
                b();
                return h0.f84049a;
            }
        }

        public g(Object obj, a aVar, String str, a aVar2) {
            this.f79948b = aVar;
            this.f79949c = str;
            this.f79950d = aVar2;
            this.value = new AtomicReference<>(obj);
        }

        private final void a(wn0.a<h0> task) {
            if (this.f79948b.options.getThreadChecker().a()) {
                this.f79948b.r().submit(new io.sentry.android.replay.util.l("CaptureStrategy.runInBackground", new RunnableC1688a(task)));
                return;
            }
            try {
                task.invoke();
            } catch (Throwable th2) {
                this.f79948b.options.getLogger().a(b7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // p013kotlin.properties.d, p013kotlin.properties.c
        public ScreenshotRecorderConfig getValue(Object thisRef, co0.m<?> property) {
            s.k(property, "property");
            return this.value.get();
        }

        @Override // p013kotlin.properties.d
        public void setValue(Object thisRef, co0.m<?> property, ScreenshotRecorderConfig value) {
            s.k(property, "property");
            ScreenshotRecorderConfig andSet = this.value.getAndSet(value);
            if (s.f(andSet, value)) {
                return;
            }
            a(new b(this.f79949c, andSet, value, this.f79950d));
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, d2 = {"io/sentry/android/replay/capture/a$h", "Lkotlin/properties/d;", "", "Lkotlin/Function0;", "Ljn0/h0;", "task", "a", "(Lwn0/a;)V", "thisRef", "Lco0/m;", "property", "getValue", "(Ljava/lang/Object;Lco0/m;)Ljava/lang/Object;", "value", "setValue", "(Ljava/lang/Object;Lco0/m;Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements p013kotlin.properties.d<Object, Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AtomicReference<Date> value;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f79957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f79958c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f79959d;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$h$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class RunnableC1689a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ wn0.a f79960a;

            public RunnableC1689a(wn0.a aVar) {
                this.f79960a = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f79960a.invoke();
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        public static final class b extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f79961c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f79962d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f79963e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f79964f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar) {
                super(0);
                this.f79961c = str;
                this.f79962d = obj;
                this.f79963e = obj2;
                this.f79964f = aVar;
            }

            public final void b() throws Exception {
                Object obj = this.f79962d;
                Date date = (Date) this.f79963e;
                io.sentry.android.replay.i cache = this.f79964f.getCache();
                if (cache != null) {
                    cache.k0("segment.timestamp", date == null ? null : io.sentry.l.h(date));
                }
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() throws Exception {
                b();
                return h0.f84049a;
            }
        }

        public h(Object obj, a aVar, String str, a aVar2) {
            this.f79957b = aVar;
            this.f79958c = str;
            this.f79959d = aVar2;
            this.value = new AtomicReference<>(obj);
        }

        private final void a(wn0.a<h0> task) {
            if (this.f79957b.options.getThreadChecker().a()) {
                this.f79957b.r().submit(new io.sentry.android.replay.util.l("CaptureStrategy.runInBackground", new RunnableC1689a(task)));
                return;
            }
            try {
                task.invoke();
            } catch (Throwable th2) {
                this.f79957b.options.getLogger().a(b7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // p013kotlin.properties.d, p013kotlin.properties.c
        public Date getValue(Object thisRef, co0.m<?> property) {
            s.k(property, "property");
            return this.value.get();
        }

        @Override // p013kotlin.properties.d
        public void setValue(Object thisRef, co0.m<?> property, Date value) {
            s.k(property, "property");
            Date andSet = this.value.getAndSet(value);
            if (s.f(andSet, value)) {
                return;
            }
            a(new b(this.f79958c, andSet, value, this.f79959d));
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, d2 = {"io/sentry/android/replay/capture/a$i", "Lkotlin/properties/d;", "", "Lkotlin/Function0;", "Ljn0/h0;", "task", "a", "(Lwn0/a;)V", "thisRef", "Lco0/m;", "property", "getValue", "(Ljava/lang/Object;Lco0/m;)Ljava/lang/Object;", "value", "setValue", "(Ljava/lang/Object;Lco0/m;Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements p013kotlin.properties.d<Object, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AtomicReference<String> value;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f79966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f79967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f79968d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f79969e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$i$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class RunnableC1690a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ wn0.a f79970a;

            public RunnableC1690a(wn0.a aVar) {
                this.f79970a = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f79970a.invoke();
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        public static final class b extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f79971c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f79972d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f79973e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a f79974f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f79975g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f79971c = str;
                this.f79972d = obj;
                this.f79973e = obj2;
                this.f79974f = aVar;
                this.f79975g = str2;
            }

            public final void b() throws Exception {
                Object obj = this.f79973e;
                io.sentry.android.replay.i cache = this.f79974f.getCache();
                if (cache != null) {
                    cache.k0(this.f79975g, String.valueOf(obj));
                }
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() throws Exception {
                b();
                return h0.f84049a;
            }
        }

        public i(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f79966b = aVar;
            this.f79967c = str;
            this.f79968d = aVar2;
            this.f79969e = str2;
            this.value = new AtomicReference<>(obj);
        }

        private final void a(wn0.a<h0> task) {
            if (this.f79966b.options.getThreadChecker().a()) {
                this.f79966b.r().submit(new io.sentry.android.replay.util.l("CaptureStrategy.runInBackground", new RunnableC1690a(task)));
                return;
            }
            try {
                task.invoke();
            } catch (Throwable th2) {
                this.f79966b.options.getLogger().a(b7.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        @Override // p013kotlin.properties.d, p013kotlin.properties.c
        public String getValue(Object thisRef, co0.m<?> property) {
            s.k(property, "property");
            return this.value.get();
        }

        @Override // p013kotlin.properties.d
        public void setValue(Object thisRef, co0.m<?> property, String value) {
            s.k(property, "property");
            String andSet = this.value.getAndSet(value);
            if (s.f(andSet, value)) {
                return;
            }
            a(new b(this.f79967c, andSet, value, this.f79968d, this.f79969e));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(q7 options, z0 z0Var, p dateProvider, ScheduledExecutorService replayExecutor, wn0.l<? super x, io.sentry.android.replay.i> lVar) {
        s.k(options, "options");
        s.k(dateProvider, "dateProvider");
        s.k(replayExecutor, "replayExecutor");
        this.options = options;
        this.scopes = z0Var;
        this.dateProvider = dateProvider;
        this.replayExecutor = replayExecutor;
        this.replayCacheProvider = lVar;
        this.persistingExecutor = jn0.m.b(new c());
        this.gestureConverter = new io.sentry.android.replay.gestures.b(dateProvider);
        this.isTerminating = new AtomicBoolean(false);
        this.recorderConfig = new g(null, this, "", this);
        this.segmentTimestamp = new h(null, this, "segment.timestamp", this);
        this.replayStartTimestamp = new AtomicLong();
        this.screenAtStart = new i(null, this, "replay.screen-at-start", this, "replay.screen-at-start");
        this.currentReplayId = new d(x.f81078b, this, "replay.id", this, "replay.id");
        this.currentSegment = new e(-1, this, "segment.id", this, "segment.id");
        this.replayType = new f(null, this, "replay.type", this, "replay.type");
        this.currentEvents = new ConcurrentLinkedDeque();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.sentry.android.replay.capture.h.c o(a aVar, long j11, Date date, x xVar, int i11, int i12, int i13, int i14, int i15, r7.b bVar, io.sentry.android.replay.i iVar, String str, List list, Deque deque, int i16, Object obj) {
        if (obj == null) {
            return aVar.n(j11, date, xVar, i11, i12, i13, i14, i15, (i16 & 256) != 0 ? aVar.w() : bVar, (i16 & 512) != 0 ? aVar.cache : iVar, (i16 & 1024) != 0 ? aVar.x() : str, (i16 & 2048) != 0 ? null : list, (i16 & 4096) != 0 ? aVar.currentEvents : deque);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSegmentInternal");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduledExecutorService r() {
        return (ScheduledExecutorService) this.persistingExecutor.getValue();
    }

    public void A(x xVar) {
        s.k(xVar, "<set-?>");
        this.currentReplayId.setValue(this, f79893t[3], xVar);
    }

    public final void B(ScreenshotRecorderConfig screenshotRecorderConfig) {
        this.recorderConfig.setValue(this, f79893t[0], screenshotRecorderConfig);
    }

    public void C(r7.b bVar) {
        s.k(bVar, "<set-?>");
        this.replayType.setValue(this, f79893t[5], bVar);
    }

    protected final void D(String str) {
        this.screenAtStart.setValue(this, f79893t[2], str);
    }

    @Override // io.sentry.android.replay.capture.h
    public void c(MotionEvent event) {
        List<io.sentry.rrweb.d> listA;
        s.k(event, "event");
        ScreenshotRecorderConfig screenshotRecorderConfigT = t();
        if (screenshotRecorderConfigT == null || (listA = this.gestureConverter.a(event, screenshotRecorderConfigT)) == null) {
            return;
        }
        v.E(this.currentEvents, listA);
    }

    @Override // io.sentry.android.replay.capture.h
    public void d() {
    }

    @Override // io.sentry.android.replay.capture.h
    public void e(int i11) {
        this.currentSegment.setValue(this, f79893t[4], Integer.valueOf(i11));
    }

    @Override // io.sentry.android.replay.capture.h
    public int f() {
        return ((Number) this.currentSegment.getValue(this, f79893t[4])).intValue();
    }

    @Override // io.sentry.android.replay.capture.h
    public void i() {
        m(io.sentry.l.d());
    }

    @Override // io.sentry.android.replay.capture.h
    public void j(int segmentId, x replayId, r7.b replayType) {
        io.sentry.android.replay.i iVar;
        s.k(replayId, "replayId");
        wn0.l<x, io.sentry.android.replay.i> lVar = this.replayCacheProvider;
        if (lVar == null || (iVar = lVar.invoke(replayId)) == null) {
            iVar = new io.sentry.android.replay.i(this.options, replayId);
        }
        this.cache = iVar;
        A(replayId);
        e(segmentId);
        if (replayType == null) {
            replayType = this instanceof m ? r7.b.SESSION : r7.b.BUFFER;
        }
        C(replayType);
        m(io.sentry.l.d());
        this.replayStartTimestamp.set(this.dateProvider.a());
    }

    @Override // io.sentry.android.replay.capture.h
    public x l() {
        return (x) this.currentReplayId.getValue(this, f79893t[3]);
    }

    @Override // io.sentry.android.replay.capture.h
    public void m(Date date) {
        this.segmentTimestamp.setValue(this, f79893t[1], date);
    }

    protected final io.sentry.android.replay.capture.h.c n(long duration, Date currentSegmentTimestamp, x replayId, int segmentId, int height, int width, int frameRate, int bitRate, r7.b replayType, io.sentry.android.replay.i cache, String screenAtStart, List<io.sentry.e> breadcrumbs, Deque<io.sentry.rrweb.b> events) {
        s.k(currentSegmentTimestamp, "currentSegmentTimestamp");
        s.k(replayId, "replayId");
        s.k(replayType, "replayType");
        s.k(events, "events");
        return io.sentry.android.replay.capture.h.INSTANCE.c(this.scopes, this.options, duration, currentSegmentTimestamp, replayId, segmentId, height, width, replayType, cache, frameRate, bitRate, screenAtStart, breadcrumbs, events);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    protected final io.sentry.android.replay.i getCache() {
        return this.cache;
    }

    protected final Deque<io.sentry.rrweb.b> q() {
        return this.currentEvents;
    }

    @Override // io.sentry.android.replay.capture.h
    public void s(ScreenshotRecorderConfig recorderConfig) {
        s.k(recorderConfig, "recorderConfig");
        B(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.h
    public void stop() throws Exception {
        io.sentry.android.replay.i iVar = this.cache;
        if (iVar != null) {
            iVar.close();
        }
        this.replayStartTimestamp.set(0L);
        m(null);
        x EMPTY_ID = x.f81078b;
        s.j(EMPTY_ID, "EMPTY_ID");
        A(EMPTY_ID);
    }

    public final ScreenshotRecorderConfig t() {
        return (ScreenshotRecorderConfig) this.recorderConfig.getValue(this, f79893t[0]);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    protected final ScheduledExecutorService getReplayExecutor() {
        return this.replayExecutor;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    protected final AtomicLong getReplayStartTimestamp() {
        return this.replayStartTimestamp;
    }

    public r7.b w() {
        return (r7.b) this.replayType.getValue(this, f79893t[5]);
    }

    protected final String x() {
        return (String) this.screenAtStart.getValue(this, f79893t[2]);
    }

    public Date y() {
        return (Date) this.segmentTimestamp.getValue(this, f79893t[1]);
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    protected final AtomicBoolean getIsTerminating() {
        return this.isTerminating;
    }
}
