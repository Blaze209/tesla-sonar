package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.sentry.android.replay.video.MuxerConfig;
import io.sentry.b7;
import io.sentry.d1;
import io.sentry.q7;
import io.sentry.r7;
import io.sentry.z3;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import jn0.h0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 [2\u00020\u0001:\u00014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJQ\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020!2\b\b\u0002\u0010'\u001a\u00020\r¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010\u00162\u0006\u0010+\u001a\u00020\u0014H\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/J!\u00102\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u00162\b\u00101\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>R\u0014\u0010C\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010>R\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001d\u0010L\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR \u0010R\u001a\b\u0012\u0004\u0012\u00020\b0M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR0\u0010W\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160Sj\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016`T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001d\u0010Z\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bX\u0010I\u001a\u0004\bY\u0010K¨\u0006\\"}, d2 = {"Lio/sentry/android/replay/i;", "Ljava/io/Closeable;", "Lio/sentry/q7;", "options", "Lio/sentry/protocol/x;", "replayId", "<init>", "(Lio/sentry/q7;Lio/sentry/protocol/x;)V", "Lio/sentry/android/replay/j;", "frame", "", "J", "(Lio/sentry/android/replay/j;)Z", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Ljn0/h0;", "I", "(Ljava/io/File;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "frameTimestamp", "", AnalyticsContext.Screen, "B", "(Landroid/graphics/Bitmap;JLjava/lang/String;)V", "screenshot", "p", "(Ljava/io/File;JLjava/lang/String;)V", "T", "()Ljava/lang/Long;", "duration", "from", "", "segmentId", Snapshot.HEIGHT, Snapshot.WIDTH, "frameRate", "bitRate", "videoFile", "Lio/sentry/android/replay/c;", "C", "(JJIIIIILjava/io/File;)Lio/sentry/android/replay/c;", "until", "n0", "(J)Ljava/lang/String;", "close", "()V", Action.KEY_ATTRIBUTE, "value", "k0", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Lio/sentry/q7;", "b", "Lio/sentry/protocol/x;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isClosed", "Lio/sentry/util/a;", DateTokenConverter.CONVERTER_KEY, "Lio/sentry/util/a;", "encoderLock", "e", "lock", "f", "framesLock", "Lio/sentry/android/replay/video/c;", "g", "Lio/sentry/android/replay/video/c;", "encoder", "h", "Lkotlin/Lazy;", "e0", "()Ljava/io/File;", "replayCacheDir", "", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "b0", "()Ljava/util/List;", "frames", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "j", "Ljava/util/LinkedHashMap;", "ongoingSegment", "k", "c0", "ongoingSegmentFile", "l", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i implements Closeable {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f80052m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q7 options;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.protocol.x replayId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isClosed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a encoderLock;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a lock;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a framesLock;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.video.c encoder;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy replayCacheDir;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<ReplayFrame> frames;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final LinkedHashMap<String, String> ongoingSegment;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy ongoingSegmentFile;

    /* JADX INFO: renamed from: io.sentry.android.replay.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ9\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013¨\u0006\u001e"}, d2 = {"Lio/sentry/android/replay/i$a;", "", "<init>", "()V", "Lio/sentry/q7;", "options", "Lio/sentry/protocol/x;", "replayId", "Ljava/io/File;", DateTokenConverter.CONVERTER_KEY, "(Lio/sentry/q7;Lio/sentry/protocol/x;)Ljava/io/File;", "Lkotlin/Function1;", "Lio/sentry/android/replay/i;", "replayCacheProvider", "Lio/sentry/android/replay/d;", "c", "(Lio/sentry/q7;Lio/sentry/protocol/x;Lwn0/l;)Lio/sentry/android/replay/d;", "", "ONGOING_SEGMENT", "Ljava/lang/String;", "SEGMENT_KEY_BIT_RATE", "SEGMENT_KEY_FRAME_RATE", "SEGMENT_KEY_HEIGHT", "SEGMENT_KEY_ID", "SEGMENT_KEY_REPLAY_ID", "SEGMENT_KEY_REPLAY_RECORDING", "SEGMENT_KEY_REPLAY_SCREEN_AT_START", "SEGMENT_KEY_REPLAY_TYPE", "SEGMENT_KEY_TIMESTAMP", "SEGMENT_KEY_WIDTH", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: io.sentry.android.replay.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class C1693a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return mn0.a.d(Long.valueOf(((ReplayFrame) t11).getTimestamp()), Long.valueOf(((ReplayFrame) t12).getTimestamp()));
            }
        }

        /* JADX INFO: renamed from: io.sentry.android.replay.i$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return mn0.a.d(Long.valueOf(((io.sentry.rrweb.b) t11).e()), Long.valueOf(((io.sentry.rrweb.b) t12).e()));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean b(i iVar, File file, String str) throws Exception {
            p013kotlin.jvm.internal.s.h(str);
            if (p013kotlin.text.t.L(str, ".jpg", false, 2, null)) {
                File file2 = new File(file, str);
                Long lZ = p013kotlin.text.t.z(sn0.h.D(file2));
                if (lZ != null) {
                    i.t(iVar, file2, lZ.longValue(), null, 4, null);
                }
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:90:0x0206  */
        public final LastSegmentData c(q7 options, io.sentry.protocol.x replayId, wn0.l<? super io.sentry.protocol.x, i> replayCacheProvider) {
            Date dateE;
            r7.b bVarValueOf;
            LastSegmentData lastSegmentData;
            final i iVar;
            List listM;
            String str = "";
            p013kotlin.jvm.internal.s.k(options, "options");
            p013kotlin.jvm.internal.s.k(replayId, "replayId");
            File fileD = d(options, replayId);
            File file = new File(fileD, ".ongoing_segment");
            if (!file.exists()) {
                options.getLogger().c(b7.DEBUG, "No ongoing segment found for replay: %s", replayId);
                io.sentry.util.i.a(fileD);
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), p013kotlin.text.d.UTF_8), PKIFailureInfo.certRevoked);
            try {
                Iterator<String> it = sn0.r.d(bufferedReader).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List listF1 = p013kotlin.text.t.f1(it.next(), new String[]{"="}, false, 2, 2, null);
                    Pair pairA = jn0.x.a((String) listF1.get(0), (String) listF1.get(1));
                    linkedHashMap.put(pairA.e(), pairA.f());
                }
                sn0.b.a(bufferedReader, null);
                String str2 = (String) linkedHashMap.get("config.height");
                Integer numX = str2 != null ? p013kotlin.text.t.x(str2) : null;
                String str3 = (String) linkedHashMap.get("config.width");
                Integer numX2 = str3 != null ? p013kotlin.text.t.x(str3) : null;
                String str4 = (String) linkedHashMap.get("config.frame-rate");
                Integer numX3 = str4 != null ? p013kotlin.text.t.x(str4) : null;
                String str5 = (String) linkedHashMap.get("config.bit-rate");
                Integer numX4 = str5 != null ? p013kotlin.text.t.x(str5) : null;
                String str6 = (String) linkedHashMap.get("segment.id");
                Integer numX5 = str6 != null ? p013kotlin.text.t.x(str6) : null;
                try {
                    String str7 = (String) linkedHashMap.get("segment.timestamp");
                    if (str7 == null) {
                        str7 = "";
                    }
                    dateE = io.sentry.l.f(str7);
                } catch (Throwable unused) {
                    dateE = null;
                }
                try {
                    String str8 = (String) linkedHashMap.get("replay.type");
                    if (str8 != null) {
                        str = str8;
                    }
                    bVarValueOf = r7.b.valueOf(str);
                } catch (Throwable unused2) {
                    bVarValueOf = null;
                }
                if (numX == null || numX2 == null || numX3 == null || numX4 == null || numX5 == null) {
                    lastSegmentData = null;
                } else {
                    lastSegmentData = null;
                    if (numX5.intValue() != -1 && dateE != null && bVarValueOf != null) {
                        ScreenshotRecorderConfig screenshotRecorderConfig = new ScreenshotRecorderConfig(numX2.intValue(), numX.intValue(), 1.0f, 1.0f, numX3.intValue(), numX4.intValue());
                        if (replayCacheProvider == null || (iVar = replayCacheProvider.invoke(replayId)) == null) {
                            iVar = new i(options, replayId);
                        }
                        File fileE0 = iVar.e0();
                        if (fileE0 != null) {
                            fileE0.listFiles(new FilenameFilter() { // from class: io.sentry.android.replay.h
                                @Override // java.io.FilenameFilter
                                public final boolean accept(File file2, String str9) {
                                    return i.Companion.b(iVar, file2, str9);
                                }
                            });
                        }
                        if (iVar.b0().isEmpty()) {
                            options.getLogger().c(b7.DEBUG, "No frames found for replay: %s, deleting the replay", replayId);
                            io.sentry.util.i.a(fileD);
                            return null;
                        }
                        List<ReplayFrame> listB0 = iVar.b0();
                        if (listB0.size() > 1) {
                            p013kotlin.collections.v.C(listB0, new C1693a());
                        }
                        r7.b bVar = r7.b.SESSION;
                        int iIntValue = bVarValueOf == bVar ? numX5.intValue() : 0;
                        if (bVarValueOf != bVar) {
                            dateE = io.sentry.l.e(((ReplayFrame) p013kotlin.collections.v.o0(iVar.b0())).getTimestamp());
                            p013kotlin.jvm.internal.s.h(dateE);
                        }
                        Date date = dateE;
                        long timestamp = (((ReplayFrame) p013kotlin.collections.v.A0(iVar.b0())).getTimestamp() - date.getTime()) + ((long) (1000 / numX3.intValue()));
                        String str9 = (String) linkedHashMap.get("replay.recording");
                        if (str9 != null) {
                            z3 z3Var = (z3) options.getSerializer().c(new StringReader(str9), z3.class);
                            if ((z3Var != null ? z3Var.a() : null) != null) {
                                List<? extends io.sentry.rrweb.b> listA = z3Var.a();
                                p013kotlin.jvm.internal.s.h(listA);
                                listM = new LinkedList(listA);
                            } else {
                                listM = null;
                            }
                            if (listM == null) {
                                listM = p013kotlin.collections.v.m();
                            }
                        } else {
                            listM = p013kotlin.collections.v.m();
                        }
                        return new LastSegmentData(screenshotRecorderConfig, iVar, date, iIntValue, timestamp, bVarValueOf, (String) linkedHashMap.get("replay.screen-at-start"), p013kotlin.collections.v.a1(listM, new b()));
                    }
                }
                options.getLogger().c(b7.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", replayId);
                io.sentry.util.i.a(fileD);
                return lastSegmentData;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(bufferedReader, th2);
                    throw th3;
                }
            }
        }

        public final File d(q7 options, io.sentry.protocol.x replayId) {
            p013kotlin.jvm.internal.s.k(options, "options");
            p013kotlin.jvm.internal.s.k(replayId, "replayId");
            String cacheDirPath = options.getCacheDirPath();
            if (cacheDirPath == null || cacheDirPath.length() == 0) {
                options.getLogger().c(b7.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                return null;
            }
            String cacheDirPath2 = options.getCacheDirPath();
            p013kotlin.jvm.internal.s.h(cacheDirPath2);
            File file = new File(cacheDirPath2, "replay_" + replayId);
            file.mkdirs();
            return file;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", "b", "()Ljava/io/File;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<File> {
        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() throws IOException {
            if (i.this.e0() == null) {
                return null;
            }
            File file = new File(i.this.e0(), ".ongoing_segment");
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "<name for destructuring parameter 0>", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<Map.Entry<String, String>, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f80065c = new c();

        c() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry<String, String> entry) {
            p013kotlin.jvm.internal.s.k(entry, "<name for destructuring parameter 0>");
            return entry.getKey() + '=' + entry.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/io/File;", "b", "()Ljava/io/File;"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<File> {
        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            return i.INSTANCE.d(i.this.options, i.this.replayId);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/j;", "it", "", "a", "(Lio/sentry/android/replay/j;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.l<ReplayFrame, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f80067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f80068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n0<String> f80069e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j11, i iVar, n0<String> n0Var) {
            super(1);
            this.f80067c = j11;
            this.f80068d = iVar;
            this.f80069e = n0Var;
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.String] */
        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(ReplayFrame it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            if (it.getTimestamp() < this.f80067c) {
                this.f80068d.I(it.getScreenshot());
                return Boolean.TRUE;
            }
            n0<String> n0Var = this.f80069e;
            if (n0Var.f86529a == null) {
                n0Var.f86529a = it.getScreen();
            }
            return Boolean.FALSE;
        }
    }

    public i(q7 options, io.sentry.protocol.x replayId) {
        p013kotlin.jvm.internal.s.k(options, "options");
        p013kotlin.jvm.internal.s.k(replayId, "replayId");
        this.options = options;
        this.replayId = replayId;
        this.isClosed = new AtomicBoolean(false);
        this.encoderLock = new io.sentry.util.a();
        this.lock = new io.sentry.util.a();
        this.framesLock = new io.sentry.util.a();
        this.replayCacheDir = jn0.m.b(new d());
        this.frames = new ArrayList();
        this.ongoingSegment = new LinkedHashMap<>();
        this.ongoingSegmentFile = jn0.m.b(new b());
    }

    public static /* synthetic */ GeneratedVideo H(i iVar, long j11, long j12, int i11, int i12, int i13, int i14, int i15, File file, int i16, Object obj) {
        int i17;
        File file2;
        if ((i16 & 128) != 0) {
            File fileE0 = iVar.e0();
            StringBuilder sb2 = new StringBuilder();
            i17 = i11;
            sb2.append(i17);
            sb2.append(".mp4");
            file2 = new File(fileE0, sb2.toString());
        } else {
            i17 = i11;
            file2 = file;
        }
        return iVar.C(j11, j12, i17, i12, i13, i14, i15, file2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(File file) {
        try {
            if (file.delete()) {
                return;
            }
            this.options.getLogger().c(b7.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th2) {
            this.options.getLogger().b(b7.ERROR, th2, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    private final boolean J(ReplayFrame frame) {
        if (frame == null) {
            return false;
        }
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(frame.getScreenshot().getAbsolutePath());
            d1 d1VarA = this.encoderLock.a();
            try {
                io.sentry.android.replay.video.c cVar = this.encoder;
                if (cVar != null) {
                    p013kotlin.jvm.internal.s.h(bitmapDecodeFile);
                    cVar.b(bitmapDecodeFile);
                    h0 h0Var = h0.f84049a;
                }
                un0.a.a(d1VarA, null);
                bitmapDecodeFile.recycle();
                return true;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    un0.a.a(d1VarA, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            this.options.getLogger().a(b7.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th4);
            return false;
        }
    }

    public static /* synthetic */ void t(i iVar, File file, long j11, String str, int i11, Object obj) throws Exception {
        if ((i11 & 4) != 0) {
            str = null;
        }
        iVar.p(file, j11, str);
    }

    public final void B(Bitmap bitmap, long frameTimestamp, String screen) throws IOException {
        p013kotlin.jvm.internal.s.k(bitmap, "bitmap");
        if (e0() == null || bitmap.isRecycled()) {
            return;
        }
        File fileE0 = e0();
        if (fileE0 != null) {
            fileE0.mkdirs();
        }
        File file = new File(e0(), frameTimestamp + ".jpg");
        file.createNewFile();
        synchronized (bitmap) {
            if (bitmap.isRecycled()) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, this.options.getSessionReplay().m().screenshotQuality, fileOutputStream);
                fileOutputStream.flush();
                h0 h0Var = h0.f84049a;
                sn0.b.a(fileOutputStream, null);
                p(file, frameTimestamp, screen);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        }
    }

    public final GeneratedVideo C(long duration, long from, int segmentId, int height, int width, int frameRate, int bitRate, File videoFile) throws Exception {
        d1 d1Var;
        int i11;
        p013kotlin.jvm.internal.s.k(videoFile, "videoFile");
        if (videoFile.exists() && videoFile.length() > 0) {
            videoFile.delete();
        }
        d1 d1VarA = this.framesLock.a();
        try {
            List<ReplayFrame> arrayList = this.frames.isEmpty() ? new ArrayList() : p013kotlin.collections.v.p1(this.frames);
            un0.a.a(d1VarA, null);
            if (arrayList.isEmpty()) {
                this.options.getLogger().c(b7.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                return null;
            }
            d1 d1VarA2 = this.encoderLock.a();
            try {
                d1Var = d1VarA2;
                try {
                    io.sentry.android.replay.video.c cVar = new io.sentry.android.replay.video.c(this.options, new MuxerConfig(videoFile, width, height, frameRate, bitRate, null, 32, null), null, 4, null);
                    cVar.j();
                    un0.a.a(d1Var, null);
                    this.encoder = cVar;
                    long j11 = ((long) 1000) / ((long) frameRate);
                    Object objQ0 = p013kotlin.collections.v.q0(arrayList);
                    long j12 = from + duration;
                    bo0.k kVarV = bo0.n.v(bo0.n.x(from, j12), j11);
                    long first = kVarV.getFirst();
                    long last = kVarV.getLast();
                    long step = kVarV.getStep();
                    if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                        i11 = 0;
                    } else {
                        long j13 = first;
                        int i12 = 0;
                        while (true) {
                            for (ReplayFrame replayFrame : arrayList) {
                                long j14 = j13 + j11;
                                long timestamp = replayFrame.getTimestamp();
                                if (j13 <= timestamp && timestamp <= j14) {
                                    objQ0 = replayFrame;
                                    break;
                                }
                                if (replayFrame.getTimestamp() > j14) {
                                    break;
                                }
                            }
                            if (J((ReplayFrame) objQ0)) {
                                i12++;
                            } else if (objQ0 != null) {
                                I(((ReplayFrame) objQ0).getScreenshot());
                                d1 d1VarA3 = this.framesLock.a();
                                try {
                                    u0.a(this.frames).remove(objQ0);
                                    un0.a.a(d1VarA3, null);
                                    arrayList.remove(objQ0);
                                    objQ0 = null;
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        un0.a.a(d1VarA3, th2);
                                        throw th3;
                                    }
                                }
                            }
                            if (j13 == last) {
                                break;
                            }
                            j13 += step;
                        }
                        i11 = i12;
                    }
                    if (i11 == 0) {
                        this.options.getLogger().c(b7.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                        I(videoFile);
                        return null;
                    }
                    d1 d1VarA4 = this.encoderLock.a();
                    try {
                        io.sentry.android.replay.video.c cVar2 = this.encoder;
                        if (cVar2 != null) {
                            cVar2.i();
                        }
                        io.sentry.android.replay.video.c cVar3 = this.encoder;
                        long jC = cVar3 != null ? cVar3.c() : 0L;
                        this.encoder = null;
                        h0 h0Var = h0.f84049a;
                        un0.a.a(d1VarA4, null);
                        n0(j12);
                        return new GeneratedVideo(videoFile, i11, jC);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            un0.a.a(d1VarA4, th4);
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    Throwable th7 = th;
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        un0.a.a(d1Var, th7);
                        throw th8;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                d1Var = d1VarA2;
            }
        } catch (Throwable th10) {
            try {
                throw th10;
            } catch (Throwable th11) {
                un0.a.a(d1VarA, th10);
                throw th11;
            }
        }
    }

    public final Long T() throws Exception {
        d1 d1VarA = this.framesLock.a();
        try {
            ReplayFrame replayFrame = (ReplayFrame) p013kotlin.collections.v.q0(this.frames);
            Long lValueOf = replayFrame != null ? Long.valueOf(replayFrame.getTimestamp()) : null;
            un0.a.a(d1VarA, null);
            return lValueOf;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(d1VarA, th2);
                throw th3;
            }
        }
    }

    public final List<ReplayFrame> b0() {
        return this.frames;
    }

    public final File c0() {
        return (File) this.ongoingSegmentFile.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        d1 d1VarA = this.encoderLock.a();
        try {
            io.sentry.android.replay.video.c cVar = this.encoder;
            if (cVar != null) {
                cVar.i();
            }
            this.encoder = null;
            h0 h0Var = h0.f84049a;
            un0.a.a(d1VarA, null);
            this.isClosed.set(true);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(d1VarA, th2);
                throw th3;
            }
        }
    }

    public final File e0() {
        return (File) this.replayCacheDir.getValue();
    }

    public final void k0(String key, String value) throws Exception {
        File fileC0;
        File fileC1;
        p013kotlin.jvm.internal.s.k(key, "key");
        d1 d1VarA = this.lock.a();
        try {
            if (this.isClosed.get()) {
                un0.a.a(d1VarA, null);
                return;
            }
            File fileC2 = c0();
            if ((fileC2 == null || !fileC2.exists()) && (fileC0 = c0()) != null) {
                fileC0.createNewFile();
            }
            if (this.ongoingSegment.isEmpty() && (fileC1 = c0()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileC1), p013kotlin.text.d.UTF_8), PKIFailureInfo.certRevoked);
                try {
                    ho0.i<String> iVarD = sn0.r.d(bufferedReader);
                    LinkedHashMap<String, String> linkedHashMap = this.ongoingSegment;
                    Iterator<String> it = iVarD.iterator();
                    while (it.hasNext()) {
                        List listF1 = p013kotlin.text.t.f1(it.next(), new String[]{"="}, false, 2, 2, null);
                        Pair pairA = jn0.x.a((String) listF1.get(0), (String) listF1.get(1));
                        linkedHashMap.put((String) pairA.e(), (String) pairA.f());
                    }
                    sn0.b.a(bufferedReader, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(bufferedReader, th2);
                        throw th3;
                    }
                }
            }
            if (value == null) {
                this.ongoingSegment.remove(key);
            } else {
                this.ongoingSegment.put(key, value);
            }
            File fileC3 = c0();
            if (fileC3 != null) {
                Set<Map.Entry<String, String>> setEntrySet = this.ongoingSegment.entrySet();
                p013kotlin.jvm.internal.s.j(setEntrySet, "<get-entries>(...)");
                sn0.h.q(fileC3, p013kotlin.collections.v.y0(setEntrySet, "\n", null, null, 0, null, c.f80065c, 30, null), null, 2, null);
                h0 h0Var = h0.f84049a;
            }
            un0.a.a(d1VarA, null);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                un0.a.a(d1VarA, th4);
                throw th5;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String n0(long until) throws Exception {
        n0 n0Var = new n0();
        d1 d1VarA = this.framesLock.a();
        try {
            p013kotlin.collections.v.L(this.frames, new e(until, this, n0Var));
            un0.a.a(d1VarA, null);
            return (String) n0Var.f86529a;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                un0.a.a(d1VarA, th2);
                throw th3;
            }
        }
    }

    public final void p(File screenshot, long frameTimestamp, String screen) throws Exception {
        p013kotlin.jvm.internal.s.k(screenshot, "screenshot");
        ReplayFrame replayFrame = new ReplayFrame(screenshot, frameTimestamp, screen);
        d1 d1VarA = this.framesLock.a();
        try {
            this.frames.add(replayFrame);
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
}
