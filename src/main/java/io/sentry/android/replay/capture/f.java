package io.sentry.android.replay.capture;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import ezvcard.property.Gender;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.b7;
import io.sentry.f4;
import io.sentry.protocol.x;
import io.sentry.q7;
import io.sentry.r7;
import io.sentry.transport.p;
import io.sentry.util.b0;
import io.sentry.x0;
import io.sentry.z0;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.j0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000 J2\u00020\u0001:\u0001KBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010#\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00140\fH\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0014H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010&J+\u0010,\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00140\fH\u0016¢\u0006\u0004\b,\u0010-J3\u00102\u001a\u00020\u00142\b\u0010/\u001a\u0004\u0018\u00010.2\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001400H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00142\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00142\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lio/sentry/android/replay/capture/f;", "Lio/sentry/android/replay/capture/a;", "Lio/sentry/q7;", "options", "Lio/sentry/z0;", "scopes", "Lio/sentry/transport/p;", "dateProvider", "Lio/sentry/util/b0;", "random", "Ljava/util/concurrent/ScheduledExecutorService;", "executor", "Lkotlin/Function1;", "Lio/sentry/protocol/x;", "Lio/sentry/android/replay/i;", "replayCacheProvider", "<init>", "(Lio/sentry/q7;Lio/sentry/z0;Lio/sentry/transport/p;Lio/sentry/util/b0;Ljava/util/concurrent/ScheduledExecutorService;Lwn0/l;)V", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Ljn0/h0;", "Q", "(Ljava/io/File;)V", "", "Lio/sentry/android/replay/capture/h$c$a;", Gender.MALE, "(Ljava/util/List;)V", "", "bufferLimit", "S", "(Ljava/util/List;J)V", "", "taskName", "Lio/sentry/android/replay/capture/h$c;", "onSegmentCreated", Gender.OTHER, "(Ljava/lang/String;Lwn0/l;)V", DateTokenConverter.CONVERTER_KEY, "()V", "stop", "", "isTerminating", "Ljava/util/Date;", "onSegmentSent", "k", "(ZLwn0/l;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", PlaceTypes.STORE, "g", "(Landroid/graphics/Bitmap;Lwn0/p;)V", "Lio/sentry/android/replay/s;", "recorderConfig", "s", "(Lio/sentry/android/replay/s;)V", "Lio/sentry/android/replay/capture/h;", "h", "()Lio/sentry/android/replay/capture/h;", "Landroid/view/MotionEvent;", "event", "c", "(Landroid/view/MotionEvent;)V", "v", "Lio/sentry/q7;", "w", "Lio/sentry/z0;", "x", "Lio/sentry/transport/p;", "y", "Lio/sentry/util/b0;", "z", "Ljava/util/List;", "bufferedSegments", "A", "a", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
public final class f extends a {
    public static final int B = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final q7 options;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final z0 scopes;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final p dateProvider;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final b0 random;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final List<h.c.Created> bufferedSegments;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/capture/h$c;", "segment", "Ljn0/h0;", "a", "(Lio/sentry/android/replay/capture/h$c;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.l<h.c, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<Date, h0> f79994d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(wn0.l<? super Date, h0> lVar) {
            super(1);
            this.f79994d = lVar;
        }

        public final void a(h.c segment) throws InterruptedException {
            s.k(segment, "segment");
            f fVar = f.this;
            fVar.M(fVar.bufferedSegments);
            if (segment instanceof h.c.Created) {
                h.c.Created created = (h.c.Created) segment;
                h.c.Created.b(created, f.this.scopes, null, 2, null);
                wn0.l<Date, h0> lVar = this.f79994d;
                Date dateG0 = created.getReplay().g0();
                s.j(dateG0, "getTimestamp(...)");
                lVar.invoke(dateG0);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(h.c cVar) throws InterruptedException {
            a(cVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/capture/h$c;", "segment", "Ljn0/h0;", "a", "(Lio/sentry/android/replay/capture/h$c;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.l<h.c, h0> {
        c() {
            super(1);
        }

        public final void a(h.c segment) {
            s.k(segment, "segment");
            if (segment instanceof h.c.Created) {
                f.this.bufferedSegments.add(segment);
                f fVar = f.this;
                fVar.e(fVar.f() + 1);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(h.c cVar) {
            a(cVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/capture/h$c;", "segment", "Ljn0/h0;", "a", "(Lio/sentry/android/replay/capture/h$c;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements wn0.l<h.c, h0> {
        d() {
            super(1);
        }

        public final void a(h.c segment) {
            s.k(segment, "segment");
            if (segment instanceof h.c.Created) {
                f.this.bufferedSegments.add(segment);
                f fVar = f.this;
                fVar.e(fVar.f() + 1);
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(h.c cVar) {
            a(cVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/capture/h$c$a;", "it", "", "a", "(Lio/sentry/android/replay/capture/h$c$a;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements wn0.l<h.c.Created, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f79997c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f79998d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ j0 f79999e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j11, f fVar, j0 j0Var) {
            super(1);
            this.f79997c = j11;
            this.f79998d = fVar;
            this.f79999e = j0Var;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(h.c.Created it) {
            s.k(it, "it");
            if (it.getReplay().g0().getTime() >= this.f79997c) {
                return Boolean.FALSE;
            }
            f fVar = this.f79998d;
            fVar.e(fVar.f() - 1);
            this.f79998d.Q(it.getReplay().h0());
            this.f79999e.f86523a = true;
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q7 options, z0 z0Var, p dateProvider, b0 random, ScheduledExecutorService executor, wn0.l<? super x, io.sentry.android.replay.i> lVar) {
        super(options, z0Var, dateProvider, executor, lVar);
        s.k(options, "options");
        s.k(dateProvider, "dateProvider");
        s.k(random, "random");
        s.k(executor, "executor");
        this.options = options;
        this.scopes = z0Var;
        this.dateProvider = dateProvider;
        this.random = random;
        this.bufferedSegments = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(List<h.c.Created> list) throws InterruptedException {
        h.c.Created created = (h.c.Created) v.N(list);
        while (created != null) {
            h.c.Created.b(created, this.scopes, null, 2, null);
            created = (h.c.Created) v.N(list);
            Thread.sleep(100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(f fVar, x0 it) {
        s.k(it, "it");
        it.m(fVar.l());
    }

    private final void O(String taskName, final wn0.l<? super h.c, h0> onSegmentCreated) {
        final Date dateE;
        Long lT;
        final ScreenshotRecorderConfig screenshotRecorderConfigT = t();
        if (screenshotRecorderConfigT == null) {
            this.options.getLogger().c(b7.DEBUG, "Recorder config is not set, not creating segment for task: " + taskName, new Object[0]);
            return;
        }
        long jC = this.options.getSessionReplay().c();
        long jA = this.dateProvider.a();
        io.sentry.android.replay.i cache = getCache();
        if (cache == null || (lT = cache.T()) == null || (dateE = io.sentry.l.e(lT.longValue())) == null) {
            dateE = io.sentry.l.e(jA - jC);
        }
        s.h(dateE);
        final long time = jA - dateE.getTime();
        final x xVarL = l();
        getReplayExecutor().submit(new io.sentry.android.replay.util.l("BufferCaptureStrategy." + taskName, new Runnable() { // from class: io.sentry.android.replay.capture.b
            @Override // java.lang.Runnable
            public final void run() {
                f.P(this.f79976a, time, dateE, xVarL, screenshotRecorderConfigT, onSegmentCreated);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(f fVar, long j11, Date date, x xVar, ScreenshotRecorderConfig screenshotRecorderConfig, wn0.l lVar) {
        lVar.invoke(a.o(fVar, j11, date, xVar, fVar.f(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getFrameRate(), screenshotRecorderConfig.getBitRate(), null, null, null, null, null, 7936, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(File file) {
        if (file == null) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            this.options.getLogger().c(b7.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
        } catch (Throwable th2) {
            this.options.getLogger().b(b7.ERROR, th2, "Failed to delete replay segment: %s", file.getAbsolutePath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(f fVar, wn0.p pVar, long j11) {
        io.sentry.android.replay.i cache = fVar.getCache();
        if (cache != null) {
            pVar.invoke(cache, Long.valueOf(j11));
        }
        long jA = fVar.dateProvider.a() - fVar.options.getSessionReplay().c();
        io.sentry.android.replay.i cache2 = fVar.getCache();
        fVar.D(cache2 != null ? cache2.n0(jA) : null);
        fVar.S(fVar.bufferedSegments, jA);
    }

    private final void S(List<h.c.Created> list, long j11) {
        j0 j0Var = new j0();
        v.L(list, new e(j11, this, j0Var));
        if (j0Var.f86523a) {
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    v.x();
                }
                ((h.c.Created) obj).d(i11);
                i11 = i12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(File file, f fVar) {
        io.sentry.util.i.a(file);
        fVar.e(-1);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void c(MotionEvent event) {
        s.k(event, "event");
        super.c(event);
        h.Companion.h(h.INSTANCE, q(), this.dateProvider.a() - this.options.getSessionReplay().c(), null, 4, null);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void d() {
        O("pause", new d());
        super.d();
    }

    @Override // io.sentry.android.replay.capture.h
    public void g(Bitmap bitmap, final wn0.p<? super io.sentry.android.replay.i, ? super Long, h0> store) {
        s.k(store, "store");
        final long jA = this.dateProvider.a();
        getReplayExecutor().submit(new io.sentry.android.replay.util.l("BufferCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.e
            @Override // java.lang.Runnable
            public final void run() {
                f.R(this.f79985a, store, jA);
            }
        }));
    }

    @Override // io.sentry.android.replay.capture.h
    public h h() {
        if (getIsTerminating().get()) {
            this.options.getLogger().c(b7.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        m mVar = new m(this.options, this.scopes, this.dateProvider, getReplayExecutor(), null, 16, null);
        mVar.B(t());
        mVar.j(f(), l(), r7.b.BUFFER);
        return mVar;
    }

    @Override // io.sentry.android.replay.capture.h
    public void k(boolean isTerminating, wn0.l<? super Date, h0> onSegmentSent) {
        s.k(onSegmentSent, "onSegmentSent");
        if (!io.sentry.android.replay.util.m.a(this.random, this.options.getSessionReplay().l())) {
            this.options.getLogger().c(b7.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        z0 z0Var = this.scopes;
        if (z0Var != null) {
            z0Var.s(new f4() { // from class: io.sentry.android.replay.capture.c
                @Override // io.sentry.f4
                public final void a(x0 x0Var) {
                    f.N(this.f79982a, x0Var);
                }
            });
        }
        if (!isTerminating) {
            O("capture_replay", new b(onSegmentSent));
        } else {
            getIsTerminating().set(true);
            this.options.getLogger().c(b7.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void s(ScreenshotRecorderConfig recorderConfig) {
        s.k(recorderConfig, "recorderConfig");
        O("configuration_changed", new c());
        super.s(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void stop() throws Exception {
        io.sentry.android.replay.i cache = getCache();
        final File fileE0 = cache != null ? cache.e0() : null;
        getReplayExecutor().submit(new io.sentry.android.replay.util.l("BufferCaptureStrategy.stop", new Runnable() { // from class: io.sentry.android.replay.capture.d
            @Override // java.lang.Runnable
            public final void run() {
                f.T(fileE0, this);
            }
        }));
        super.stop();
    }
}
