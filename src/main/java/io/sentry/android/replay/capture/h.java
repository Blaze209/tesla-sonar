package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import expo.modules.kotlin.activityresult.DataPersistorKt;
import io.sentry.android.replay.GeneratedVideo;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.f4;
import io.sentry.protocol.x;
import io.sentry.q7;
import io.sentry.r7;
import io.sentry.x0;
import io.sentry.z0;
import io.sentry.z3;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jn0.h0;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b`\u0018\u0000 72\u00020\u0001:\u00027$J/\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\fJ+\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0018H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0000H&¢\u0006\u0004\b&\u0010'R\u001c\u0010,\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u00101\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00106\u001a\u0004\u0018\u00010\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00068"}, d2 = {"Lio/sentry/android/replay/capture/h;", "", "", "segmentId", "Lio/sentry/protocol/x;", "replayId", "Lio/sentry/r7$b;", "replayType", "Ljn0/h0;", "j", "(ILio/sentry/protocol/x;Lio/sentry/r7$b;)V", "stop", "()V", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "", "isTerminating", "Lkotlin/Function1;", "Ljava/util/Date;", "onSegmentSent", "k", "(ZLwn0/l;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", "Lio/sentry/android/replay/i;", "", PlaceTypes.STORE, "g", "(Landroid/graphics/Bitmap;Lwn0/p;)V", "Lio/sentry/android/replay/s;", "recorderConfig", "s", "(Lio/sentry/android/replay/s;)V", "Landroid/view/MotionEvent;", "event", "c", "(Landroid/view/MotionEvent;)V", "h", "()Lio/sentry/android/replay/capture/h;", "f", "()I", "e", "(I)V", "currentSegment", "l", "()Lio/sentry/protocol/x;", "setCurrentReplayId", "(Lio/sentry/protocol/x;)V", "currentReplayId", "getSegmentTimestamp", "()Ljava/util/Date;", "m", "(Ljava/util/Date;)V", "segmentTimestamp", "a", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f80002a;

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u008d\u0001\u0010#\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u0099\u0001\u0010-\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b-\u0010.J=\u00103\u001a\u0002012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010/\u001a\u00020\u00172\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u000201\u0018\u000100H\u0000¢\u0006\u0004\b3\u00104¨\u00065"}, d2 = {"Lio/sentry/android/replay/capture/h$a;", "", "<init>", "()V", "Lio/sentry/e;", "", "e", "(Lio/sentry/e;)Z", "f", "Lio/sentry/q7;", "options", "Ljava/io/File;", MediaStreamTrack.VIDEO_TRACK_KIND, "Lio/sentry/protocol/x;", "currentReplayId", "Ljava/util/Date;", "segmentTimestamp", "", "segmentId", Snapshot.HEIGHT, Snapshot.WIDTH, "frameCount", "frameRate", "", "videoDuration", "Lio/sentry/r7$b;", "replayType", "", "screenAtStart", "", "breadcrumbs", "Ljava/util/Deque;", "Lio/sentry/rrweb/b;", "events", "Lio/sentry/android/replay/capture/h$c;", "b", "(Lio/sentry/q7;Ljava/io/File;Lio/sentry/protocol/x;Ljava/util/Date;IIIIIJLio/sentry/r7$b;Ljava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/h$c;", "Lio/sentry/z0;", "scopes", "duration", "currentSegmentTimestamp", "replayId", "Lio/sentry/android/replay/i;", "cache", "bitRate", "c", "(Lio/sentry/z0;Lio/sentry/q7;JLjava/util/Date;Lio/sentry/protocol/x;IIILio/sentry/r7$b;Lio/sentry/android/replay/i;IILjava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/h$c;", "until", "Lkotlin/Function1;", "Ljn0/h0;", "callback", "g", "(Ljava/util/Deque;JLwn0/l;)V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f80002a = new Companion();

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/rrweb/b;", "event", "Ljn0/h0;", "a", "(Lio/sentry/rrweb/b;)V"}, k = 3, mv = {1, 9, 0})
        static final class C1691a extends u implements wn0.l<io.sentry.rrweb.b, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Date f80003c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ List<io.sentry.rrweb.b> f80004d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1691a(Date date, List<io.sentry.rrweb.b> list) {
                super(1);
                this.f80003c = date;
                this.f80004d = list;
            }

            public final void a(io.sentry.rrweb.b event) {
                s.k(event, "event");
                if (event.e() >= this.f80003c.getTime()) {
                    this.f80004d.add(event);
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(io.sentry.rrweb.b bVar) {
                a(bVar);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.h$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return mn0.a.d(Long.valueOf(((io.sentry.rrweb.b) t11).e()), Long.valueOf(((io.sentry.rrweb.b) t12).e()));
            }
        }

        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:14:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:35:0x0128  */
        private final c b(q7 options, File video, x currentReplayId, Date segmentTimestamp, int segmentId, int height, int width, int frameCount, int frameRate, long videoDuration, r7.b replayType, String screenAtStart, List<io.sentry.e> breadcrumbs, Deque<io.sentry.rrweb.b> events) {
            boolean z11;
            io.sentry.rrweb.b bVarA;
            Object obj;
            Date dateE = io.sentry.l.e(segmentTimestamp.getTime() + videoDuration);
            s.j(dateE, "getDateTime(...)");
            r7 r7Var = new r7();
            r7Var.W(currentReplayId);
            r7Var.j0(currentReplayId);
            r7Var.m0(segmentId);
            r7Var.n0(dateE);
            r7Var.k0(segmentTimestamp);
            r7Var.l0(replayType);
            r7Var.s0(video);
            ArrayList arrayList = new ArrayList();
            io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
            gVar.f(segmentTimestamp.getTime());
            gVar.l(height);
            gVar.n(width);
            arrayList.add(gVar);
            io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
            jVar.f(segmentTimestamp.getTime());
            jVar.C(segmentId);
            jVar.w(videoDuration);
            jVar.x(frameCount);
            jVar.D(video.length());
            jVar.y(frameRate);
            jVar.z(height);
            jVar.G(width);
            jVar.A(0);
            jVar.E(0);
            arrayList.add(jVar);
            LinkedList linkedList = new LinkedList();
            io.sentry.e eVar = null;
            for (io.sentry.e eVar2 : breadcrumbs) {
                if (eVar != null) {
                    Companion companion = f80002a;
                    z11 = companion.e(eVar) && companion.f(eVar2) && eVar2.p().getTime() + DeviceOrientationRequest.OUTPUT_PERIOD_FAST >= segmentTimestamp.getTime();
                }
                if ((eVar2.p().getTime() >= segmentTimestamp.getTime() || z11) && eVar2.p().getTime() < dateE.getTime() && (bVarA = options.getReplayController().getReplayBreadcrumbConverter().a(eVar2)) != null) {
                    arrayList.add(bVarA);
                    io.sentry.rrweb.a aVar = bVarA instanceof io.sentry.rrweb.a ? (io.sentry.rrweb.a) bVarA : null;
                    if (s.f(aVar != null ? aVar.n() : null, "navigation")) {
                        io.sentry.rrweb.a aVar2 = (io.sentry.rrweb.a) bVarA;
                        Map<String, Object> mapO = aVar2.o();
                        if (mapO != null) {
                            s.h(mapO);
                            obj = mapO.get("to");
                            if (obj == null) {
                                obj = null;
                            }
                        } else {
                            obj = null;
                        }
                        if (obj instanceof String) {
                            Map<String, Object> mapO2 = aVar2.o();
                            s.h(mapO2);
                            Object obj2 = mapO2.get("to");
                            s.i(obj2, "null cannot be cast to non-null type kotlin.String");
                            linkedList.add((String) obj2);
                        }
                    }
                }
                eVar = eVar2;
            }
            if (screenAtStart != null && !s.f(v.q0(linkedList), screenAtStart)) {
                linkedList.addFirst(screenAtStart);
            }
            g(events, dateE.getTime(), new C1691a(segmentTimestamp, arrayList));
            if (segmentId == 0) {
                arrayList.add(new io.sentry.rrweb.h(options));
            }
            z3 z3Var = new z3();
            z3Var.c(Integer.valueOf(segmentId));
            z3Var.b(v.a1(arrayList, new b()));
            r7Var.r0(linkedList);
            return new c.Created(r7Var, z3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
        public static final void d(n0 n0Var, x0 scope) {
            s.k(scope, "scope");
            n0Var.f86529a = new ArrayList(scope.n());
        }

        private final boolean e(io.sentry.e eVar) {
            if (eVar == null || !s.f(eVar.j(), "network.event")) {
                return false;
            }
            Map<String, Object> mapL = eVar.l();
            s.j(mapL, "getData(...)");
            Object obj = mapL.get("action");
            if (obj == null) {
                obj = null;
            }
            return s.f(obj, "NETWORK_AVAILABLE");
        }

        private final boolean f(io.sentry.e eVar) {
            return s.f(eVar.j(), "network.event") && eVar.l().containsKey("network_type");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void h(Companion companion, Deque deque, long j11, wn0.l lVar, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                lVar = null;
            }
            companion.g(deque, j11, lVar);
        }

        /* JADX WARN: Type inference failed for: r7v2, types: [T, java.util.List] */
        public final c c(z0 scopes, q7 options, long duration, Date currentSegmentTimestamp, x replayId, int segmentId, int height, int width, r7.b replayType, io.sentry.android.replay.i cache, int frameRate, int bitRate, String screenAtStart, List<io.sentry.e> breadcrumbs, Deque<io.sentry.rrweb.b> events) {
            GeneratedVideo generatedVideoH;
            List<io.sentry.e> list;
            s.k(options, "options");
            s.k(currentSegmentTimestamp, "currentSegmentTimestamp");
            s.k(replayId, "replayId");
            s.k(replayType, "replayType");
            s.k(events, "events");
            if (cache == null || (generatedVideoH = io.sentry.android.replay.i.H(cache, Math.min(duration, DataPersistorKt.EXPIRATION_TIME), currentSegmentTimestamp.getTime(), segmentId, height, width, frameRate, bitRate, null, 128, null)) == null) {
                return c.b.f80007a;
            }
            File video = generatedVideoH.getVideo();
            int frameCount = generatedVideoH.getFrameCount();
            long duration2 = generatedVideoH.getDuration();
            if (breadcrumbs == null) {
                final n0 n0Var = new n0();
                n0Var.f86529a = v.m();
                if (scopes != null) {
                    scopes.s(new f4() { // from class: io.sentry.android.replay.capture.g
                        @Override // io.sentry.f4
                        public final void a(x0 x0Var) {
                            h.Companion.d(n0Var, x0Var);
                        }
                    });
                }
                list = (List) n0Var.f86529a;
            } else {
                list = breadcrumbs;
            }
            return b(options, video, replayId, currentSegmentTimestamp, segmentId, height, width, frameCount, frameRate, duration2, replayType, screenAtStart, list, events);
        }

        public final void g(Deque<io.sentry.rrweb.b> events, long until, wn0.l<? super io.sentry.rrweb.b, h0> callback) {
            s.k(events, "events");
            Iterator<io.sentry.rrweb.b> it = events.iterator();
            s.j(it, "iterator(...)");
            while (it.hasNext()) {
                io.sentry.rrweb.b next = it.next();
                if (next.e() < until) {
                    if (callback != null) {
                        s.h(next);
                        callback.invoke(next);
                    }
                    it.remove();
                }
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public static /* synthetic */ void a(h hVar, int i11, x xVar, r7.b bVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i12 & 1) != 0) {
                i11 = 0;
            }
            if ((i12 & 2) != 0) {
                xVar = new x();
            }
            if ((i12 & 4) != 0) {
                bVar = null;
            }
            hVar.j(i11, xVar, bVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/sentry/android/replay/capture/h$c;", "", "<init>", "()V", "a", "b", "Lio/sentry/android/replay/capture/h$c$a;", "Lio/sentry/android/replay/capture/h$c$b;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.h$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lio/sentry/android/replay/capture/h$c$a;", "Lio/sentry/android/replay/capture/h$c;", "Lio/sentry/r7;", "replay", "Lio/sentry/z3;", "recording", "<init>", "(Lio/sentry/r7;Lio/sentry/z3;)V", "Lio/sentry/z0;", "scopes", "Lio/sentry/h0;", "hint", "Ljn0/h0;", "a", "(Lio/sentry/z0;Lio/sentry/h0;)V", "", "segmentId", DateTokenConverter.CONVERTER_KEY, "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/sentry/r7;", "c", "()Lio/sentry/r7;", "b", "Lio/sentry/z3;", "getRecording", "()Lio/sentry/z3;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Created extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final r7 replay;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final z3 recording;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Created(r7 replay, z3 recording) {
                super(null);
                s.k(replay, "replay");
                s.k(recording, "recording");
                this.replay = replay;
                this.recording = recording;
            }

            public static /* synthetic */ void b(Created created, z0 z0Var, io.sentry.h0 h0Var, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    h0Var = new io.sentry.h0();
                }
                created.a(z0Var, h0Var);
            }

            public final void a(z0 scopes, io.sentry.h0 hint) {
                s.k(hint, "hint");
                if (scopes != null) {
                    r7 r7Var = this.replay;
                    hint.l(this.recording);
                    h0 h0Var = h0.f84049a;
                    scopes.t(r7Var, hint);
                }
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final r7 getReplay() {
                return this.replay;
            }

            public final void d(int segmentId) {
                this.replay.m0(segmentId);
                List<? extends io.sentry.rrweb.b> listA = this.recording.a();
                if (listA != null) {
                    for (io.sentry.rrweb.b bVar : listA) {
                        if (bVar instanceof io.sentry.rrweb.j) {
                            ((io.sentry.rrweb.j) bVar).C(segmentId);
                        }
                    }
                }
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Created)) {
                    return false;
                }
                Created created = (Created) other;
                return s.f(this.replay, created.replay) && s.f(this.recording, created.recording);
            }

            public int hashCode() {
                return (this.replay.hashCode() * 31) + this.recording.hashCode();
            }

            public String toString() {
                return "Created(replay=" + this.replay + ", recording=" + this.recording + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/sentry/android/replay/capture/h$c$b;", "Lio/sentry/android/replay/capture/h$c;", "<init>", "()V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f80007a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    void c(MotionEvent event);

    void d();

    void e(int i11);

    int f();

    void g(Bitmap bitmap, p<? super io.sentry.android.replay.i, ? super Long, h0> store);

    h h();

    void i();

    void j(int segmentId, x replayId, r7.b replayType);

    void k(boolean isTerminating, wn0.l<? super Date, h0> onSegmentSent);

    x l();

    void m(Date date);

    void s(ScreenshotRecorderConfig recorderConfig);

    void stop();
}
