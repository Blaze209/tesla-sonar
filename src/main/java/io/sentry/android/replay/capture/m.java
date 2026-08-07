package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.b7;
import io.sentry.f4;
import io.sentry.protocol.x;
import io.sentry.q7;
import io.sentry.r7;
import io.sentry.transport.p;
import io.sentry.x0;
import io.sentry.z0;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001<BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010\u001fJ+\u0010%\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00130\nH\u0016¢\u0006\u0004\b%\u0010&J3\u0010,\u001a\u00020\u00132\b\u0010(\u001a\u0004\u0018\u00010'2\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00130)H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Lio/sentry/android/replay/capture/m;", "Lio/sentry/android/replay/capture/a;", "Lio/sentry/q7;", "options", "Lio/sentry/z0;", "scopes", "Lio/sentry/transport/p;", "dateProvider", "Ljava/util/concurrent/ScheduledExecutorService;", "executor", "Lkotlin/Function1;", "Lio/sentry/protocol/x;", "Lio/sentry/android/replay/i;", "replayCacheProvider", "<init>", "(Lio/sentry/q7;Lio/sentry/z0;Lio/sentry/transport/p;Ljava/util/concurrent/ScheduledExecutorService;Lwn0/l;)V", "", "taskName", "Lio/sentry/android/replay/capture/h$c;", "Ljn0/h0;", "onSegmentCreated", "J", "(Ljava/lang/String;Lwn0/l;)V", "", "segmentId", "replayId", "Lio/sentry/r7$b;", "replayType", "j", "(ILio/sentry/protocol/x;Lio/sentry/r7$b;)V", DateTokenConverter.CONVERTER_KEY, "()V", "stop", "", "isTerminating", "Ljava/util/Date;", "onSegmentSent", "k", "(ZLwn0/l;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", "", PlaceTypes.STORE, "g", "(Landroid/graphics/Bitmap;Lwn0/p;)V", "Lio/sentry/android/replay/s;", "recorderConfig", "s", "(Lio/sentry/android/replay/s;)V", "Lio/sentry/android/replay/capture/h;", "h", "()Lio/sentry/android/replay/capture/h;", "v", "Lio/sentry/q7;", "w", "Lio/sentry/z0;", "x", "Lio/sentry/transport/p;", "y", "a", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m extends a {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f80020z = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final q7 options;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final z0 scopes;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final p dateProvider;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/capture/h$c;", "segment", "Ljn0/h0;", "a", "(Lio/sentry/android/replay/capture/h$c;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.l<h.c, h0> {
        b() {
            super(1);
        }

        public final void a(h.c segment) {
            s.k(segment, "segment");
            if (segment instanceof h.c.Created) {
                h.c.Created created = (h.c.Created) segment;
                h.c.Created.b(created, m.this.scopes, null, 2, null);
                m mVar = m.this;
                mVar.e(mVar.f() + 1);
                m.this.m(created.getReplay().g0());
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(h.c cVar) {
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
                h.c.Created.b((h.c.Created) segment, m.this.scopes, null, 2, null);
                m mVar = m.this;
                mVar.e(mVar.f() + 1);
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

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ File f80027d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(File file) {
            super(1);
            this.f80027d = file;
        }

        public final void a(h.c segment) {
            s.k(segment, "segment");
            if (segment instanceof h.c.Created) {
                h.c.Created.b((h.c.Created) segment, m.this.scopes, null, 2, null);
            }
            m.this.e(-1);
            io.sentry.util.i.a(this.f80027d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(h.c cVar) {
            a(cVar);
            return h0.f84049a;
        }
    }

    public /* synthetic */ m(q7 q7Var, z0 z0Var, p pVar, ScheduledExecutorService scheduledExecutorService, wn0.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(q7Var, z0Var, pVar, scheduledExecutorService, (i11 & 16) != 0 ? null : lVar);
    }

    private final void J(String taskName, final wn0.l<? super h.c, h0> onSegmentCreated) {
        final ScreenshotRecorderConfig screenshotRecorderConfigT = t();
        if (screenshotRecorderConfigT == null) {
            this.options.getLogger().c(b7.DEBUG, "Recorder config is not set, not creating segment for task: " + taskName, new Object[0]);
            return;
        }
        long jA = this.dateProvider.a();
        final Date dateY = y();
        if (dateY == null) {
            return;
        }
        final long time = jA - dateY.getTime();
        final x xVarL = l();
        getReplayExecutor().submit(new io.sentry.android.replay.util.l("SessionCaptureStrategy." + taskName, new Runnable() { // from class: io.sentry.android.replay.capture.i
            @Override // java.lang.Runnable
            public final void run() {
                m.K(this.f80008a, time, dateY, xVarL, screenshotRecorderConfigT, onSegmentCreated);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(m mVar, long j11, Date date, x xVar, ScreenshotRecorderConfig screenshotRecorderConfig, wn0.l lVar) {
        lVar.invoke(a.o(mVar, j11, date, xVar, mVar.f(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getFrameRate(), screenshotRecorderConfig.getBitRate(), null, null, null, null, null, 7936, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(m mVar, wn0.p pVar, long j11, ScreenshotRecorderConfig screenshotRecorderConfig) {
        io.sentry.android.replay.i cache = mVar.getCache();
        if (cache != null) {
            pVar.invoke(cache, Long.valueOf(j11));
        }
        Date dateY = mVar.y();
        if (dateY == null) {
            mVar.options.getLogger().c(b7.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
            return;
        }
        if (mVar.getIsTerminating().get()) {
            mVar.options.getLogger().c(b7.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
            return;
        }
        if (screenshotRecorderConfig == null) {
            mVar.options.getLogger().c(b7.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
            return;
        }
        long jA = mVar.dateProvider.a();
        if (jA - dateY.getTime() >= mVar.options.getSessionReplay().r()) {
            h.c cVarO = a.o(mVar, mVar.options.getSessionReplay().r(), dateY, mVar.l(), mVar.f(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getFrameRate(), screenshotRecorderConfig.getBitRate(), null, null, null, null, null, 7936, null);
            if (cVarO instanceof h.c.Created) {
                h.c.Created created = (h.c.Created) cVarO;
                h.c.Created.b(created, mVar.scopes, null, 2, null);
                mVar.e(mVar.f() + 1);
                mVar.m(created.getReplay().g0());
            }
        }
        if (jA - mVar.getReplayStartTimestamp().get() >= mVar.options.getSessionReplay().p()) {
            mVar.options.getReplayController().stop();
            mVar.options.getLogger().c(b7.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(m mVar, x0 it) {
        s.k(it, "it");
        it.m(mVar.l());
        String screen = it.getScreen();
        mVar.D(screen != null ? t.u1(screen, CoreConstants.DOT, null, 2, null) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(x0 it) {
        s.k(it, "it");
        it.m(x.f81078b);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void d() {
        J("pause", new c());
        super.d();
    }

    @Override // io.sentry.android.replay.capture.h
    public void g(Bitmap bitmap, final wn0.p<? super io.sentry.android.replay.i, ? super Long, h0> store) {
        s.k(store, "store");
        final ScreenshotRecorderConfig screenshotRecorderConfigT = t();
        final long jA = this.dateProvider.a();
        getReplayExecutor().submit(new io.sentry.android.replay.util.l("SessionCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.l
            @Override // java.lang.Runnable
            public final void run() {
                m.L(this.f80015a, store, jA, screenshotRecorderConfigT);
            }
        }));
    }

    @Override // io.sentry.android.replay.capture.h
    public h h() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void j(int segmentId, x replayId, r7.b replayType) {
        s.k(replayId, "replayId");
        super.j(segmentId, replayId, replayType);
        z0 z0Var = this.scopes;
        if (z0Var != null) {
            z0Var.s(new f4() { // from class: io.sentry.android.replay.capture.j
                @Override // io.sentry.f4
                public final void a(x0 x0Var) {
                    m.M(this.f80014a, x0Var);
                }
            });
        }
    }

    @Override // io.sentry.android.replay.capture.h
    public void k(boolean isTerminating, wn0.l<? super Date, h0> onSegmentSent) {
        s.k(onSegmentSent, "onSegmentSent");
        if (this.options.getSessionReplay().u()) {
            this.options.getLogger().c(b7.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        getIsTerminating().set(isTerminating);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void s(ScreenshotRecorderConfig recorderConfig) {
        s.k(recorderConfig, "recorderConfig");
        J("onConfigurationChanged", new b());
        super.s(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void stop() throws Exception {
        io.sentry.android.replay.i cache = getCache();
        J("stop", new d(cache != null ? cache.e0() : null));
        z0 z0Var = this.scopes;
        if (z0Var != null) {
            z0Var.s(new f4() { // from class: io.sentry.android.replay.capture.k
                @Override // io.sentry.f4
                public final void a(x0 x0Var) {
                    m.N(x0Var);
                }
            });
        }
        super.stop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q7 options, z0 z0Var, p dateProvider, ScheduledExecutorService executor, wn0.l<? super x, io.sentry.android.replay.i> lVar) {
        super(options, z0Var, dateProvider, executor, lVar);
        s.k(options, "options");
        s.k(dateProvider, "dateProvider");
        s.k(executor, "executor");
        this.options = options;
        this.scopes = z0Var;
        this.dateProvider = dateProvider;
    }
}
