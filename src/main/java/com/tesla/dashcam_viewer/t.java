package com.tesla.dashcam_viewer;

import android.content.Context;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 $2\u00020\u0001:\u0001+B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014JI\u0010\u0018\u001a6\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017\u0018\u00010\u0015j\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017\u0018\u0001`\u00172\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0014¢\u0006\u0004\b$\u0010%J?\u0010&\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u0005H\u0014¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0004¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000bH\u0004¢\u0006\u0004\b*\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b\u0006\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00106\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.R$\u0010<\u001a\u0004\u0018\u0001078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b!\u00108\u001a\u0004\b4\u00109\"\u0004\b:\u0010;R\"\u0010C\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010H\u001a\u0004\u0018\u00010\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b?\u0010D\u001a\u0004\b=\u0010E\"\u0004\bF\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\"\u0010N\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b5\u0010,\u001a\u0004\bI\u0010.\"\u0004\bL\u0010MR\"\u0010T\u001a\u00020 8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\b2\u0010Q\"\u0004\bR\u0010SR\u001a\u0010X\u001a\u00020U8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010V\u001a\u0004\bO\u0010W¨\u0006Y"}, d2 = {"Lcom/tesla/dashcam_viewer/t;", "", "Ljn0/a0;", "version", "fps", "", "isDownloadFrame", "Landroid/content/Context;", "appContext", "<init>", "(IIZLandroid/content/Context;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljn0/h0;", "b", "()V", "Ljn0/c0;", "videoStartTimeEpochMs", "epochMs", "", "camera", "n", "(JJLjava/lang/String;)V", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "l", "(Ljava/lang/String;)Ljava/util/ArrayList;", "frameIndex", "", "frame", "checkForExistingFrame", "p", "(JJLjava/util/List;Ljava/lang/String;Z)V", "Ljava/io/File;", "f", "(JLjava/lang/String;)Ljava/io/File;", "relativeMs", "m", "(J)J", "r", "(JJLjava/util/List;Ljava/lang/String;Z)Z", "o", "(JLjava/lang/String;)V", "c", "a", "I", "getVersion-pVg5ArA", "()I", "getFps-pVg5ArA", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "e", "j", "headerEntrySize", "Ljava/io/RandomAccessFile;", "Ljava/io/RandomAccessFile;", "()Ljava/io/RandomAccessFile;", "setChunkFile", "(Ljava/io/RandomAccessFile;)V", "chunkFile", "g", "J", "h", "()J", "setCurrentIndex-VKZWuLQ", "(J)V", "currentIndex", "Ljn0/c0;", "()Ljn0/c0;", "setCurrentChunkStartEpochMs-ADd3fzo", "(Ljn0/c0;)V", "currentChunkStartEpochMs", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "currentCamera", "setFrameCapacity-WZ4Q5Ns", "(I)V", "frameCapacity", "k", "Ljava/io/File;", "()Ljava/io/File;", "setCacheDirectory", "(Ljava/io/File;)V", "cacheDirectory", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "()Ljava/util/concurrent/locks/ReentrantLock;", "lock", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class t {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final com.tesla.logging.g f56009n = com.tesla.logging.g.INSTANCE.a("DashcamViewer_Cache");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int fps;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isDownloadFrame;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int headerEntrySize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private RandomAccessFile chunkFile;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long currentIndex;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private jn0.c0 currentChunkStartEpochMs;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String currentCamera;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int frameCapacity;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private File cacheDirectory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock lock;

    /* JADX INFO: renamed from: com.tesla.dashcam_viewer.t$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJU\u0010\u0010\u001a2\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0004j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006`\u00062\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/tesla/dashcam_viewer/t$a;", "", "<init>", "()V", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "unitData", "", "startCode", "", "packetOffset", "Lbo0/j;", "b", "(Ljava/util/ArrayList;Ljava/util/List;I)Lbo0/j;", "frameData", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "Ljn0/y;", "cameraIndex", "", "a", "(B)Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "c", "()Lcom/tesla/logging/g;", "Ljn0/a0;", "HEADER_SIZE", "I", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final bo0.j b(ArrayList<Byte> unitData, List<Byte> startCode, int packetOffset) {
            int size;
            if (packetOffset >= 0 && packetOffset < unitData.size() && packetOffset <= (size = unitData.size() - startCode.size())) {
                while (!p013kotlin.jvm.internal.s.f(unitData.subList(packetOffset, startCode.size() + packetOffset), startCode)) {
                    if (packetOffset != size) {
                        packetOffset++;
                    }
                }
                return bo0.n.w(packetOffset, startCode.size() + packetOffset);
            }
            return null;
        }

        public final String a(byte cameraIndex) {
            boolean zA = d.f55787a.a();
            if (cameraIndex == jn0.y.b((byte) 0)) {
                return h.FRONT.getValue();
            }
            if (cameraIndex == jn0.y.b((byte) 1)) {
                return h.FRONT.getValue();
            }
            if (cameraIndex == jn0.y.b((byte) 2)) {
                return h.FRONT.getValue();
            }
            if (cameraIndex == jn0.y.b((byte) 3)) {
                return zA ? h.LEFT_PILLAR.getValue() : h.LEFT_REPEATER.getValue();
            }
            if (cameraIndex == jn0.y.b((byte) 4)) {
                return zA ? h.RIGHT_PILLAR.getValue() : h.RIGHT_REPEATER.getValue();
            }
            if (cameraIndex == jn0.y.b((byte) 5)) {
                return h.LEFT_REPEATER.getValue();
            }
            if (cameraIndex == jn0.y.b((byte) 6)) {
                return h.RIGHT_REPEATER.getValue();
            }
            if (cameraIndex == jn0.y.b((byte) 7)) {
                return h.BACK.getValue();
            }
            com.tesla.logging.g gVarC = c();
            String str = "invalid camera index " + jn0.y.e(cameraIndex);
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVarC.getTag();
            String strG = gVarC.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return null;
        }

        public final com.tesla.logging.g c() {
            return t.f56009n;
        }

        public final ArrayList<ArrayList<Byte>> d(ArrayList<Byte> frameData) {
            int iE;
            p013kotlin.jvm.internal.s.k(frameData, "frameData");
            ArrayList<ArrayList<Byte>> arrayList = new ArrayList<>();
            int i11 = 0;
            while (i11 + 9 < frameData.size() && (iE = o.e(frameData, i11 + 5, i11 + 9) + i11 + 9) <= frameData.size()) {
                List<Byte> listSubList = frameData.subList(i11, iE);
                p013kotlin.jvm.internal.s.j(listSubList, "subList(...)");
                Integer numB = o.b(listSubList);
                if ((numB != null && numB.intValue() == 31) || ((numB != null && numB.intValue() == 28) || ((numB != null && numB.intValue() == 30) || ((numB != null && numB.intValue() == 29) || (numB != null && numB.intValue() == 26))))) {
                    arrayList.add(new ArrayList<>(listSubList));
                } else {
                    int last = 13;
                    while (last < listSubList.size()) {
                        bo0.j jVarB = b(new ArrayList<>(listSubList), o.a(), last);
                        if (jVarB == null) {
                            arrayList.add(new ArrayList<>(p013kotlin.collections.v.P0(o.a(), listSubList.subList(last, listSubList.size()))));
                            break;
                        }
                        arrayList.add(new ArrayList<>(p013kotlin.collections.v.P0(o.a(), listSubList.subList(last, jVarB.getFirst()))));
                        last = jVarB.getLast() + 1;
                    }
                }
                i11 = iE;
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    public /* synthetic */ t(int i11, int i12, boolean z11, Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, z11, context);
    }

    public static /* synthetic */ void q(t tVar, long j11, long j12, List list, String str, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeFrame-oBBDFbM");
        }
        tVar.p(j11, j12, list, str, (i11 & 16) != 0 ? true : z11);
    }

    public final void b() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            c();
            if (this.cacheDirectory.exists()) {
                sn0.h.B(this.cacheDirectory);
            }
            this.cacheDirectory.mkdirs();
        } finally {
            reentrantLock.unlock();
        }
    }

    protected final void c() throws IOException {
        RandomAccessFile randomAccessFile = this.chunkFile;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        this.chunkFile = null;
        this.currentChunkStartEpochMs = null;
        this.currentCamera = null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    protected final File getCacheDirectory() {
        return this.cacheDirectory;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    protected final RandomAccessFile getChunkFile() {
        return this.chunkFile;
    }

    protected File f(long videoStartTimeEpochMs, String camera) {
        p013kotlin.jvm.internal.s.k(camera, "camera");
        if (this.isDownloadFrame) {
            return new File(this.cacheDirectory, "chunk_" + jn0.c0.f(videoStartTimeEpochMs) + "_" + camera + "_download.h264chunk");
        }
        return new File(this.cacheDirectory, "chunk_" + jn0.c0.f(videoStartTimeEpochMs) + "_" + camera + ".h264chunk");
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    protected final jn0.c0 getCurrentChunkStartEpochMs() {
        return this.currentChunkStartEpochMs;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getCurrentIndex() {
        return this.currentIndex;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    protected final int getFrameCapacity() {
        return this.frameCapacity;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public int getHeaderEntrySize() {
        return this.headerEntrySize;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    protected final ReentrantLock getLock() {
        return this.lock;
    }

    public final ArrayList<ArrayList<Byte>> l(String camera) {
        p013kotlin.jvm.internal.s.k(camera, "camera");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            jn0.c0 c0Var = this.currentChunkStartEpochMs;
            if (c0Var == null) {
                f56009n.j("getNalUnitsOfNextFrame, no next frame, currentChunkStartEpochMs is null");
                return null;
            }
            p013kotlin.jvm.internal.s.h(c0Var);
            o(c0Var.getData(), camera);
            if (this.chunkFile == null) {
                f56009n.j("getNalUnitsOfNextFrame, no next frame, chunkFile is null");
                return null;
            }
            if (Long.compare(this.currentIndex ^ Long.MIN_VALUE, jn0.c0.b(((long) this.frameCapacity) & 4294967295L) ^ Long.MIN_VALUE) >= 0) {
                com.tesla.logging.g gVar = f56009n;
                String str = "getNalUnitsOfNextFrame, invalid currentIndex=" + jn0.c0.f(this.currentIndex) + " camera=" + camera;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g(str);
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
                c();
                return null;
            }
            long jB = jn0.c0.b(jn0.c0.b(this.currentIndex * jn0.c0.b(((long) getHeaderEntrySize()) & 4294967295L)) + jn0.c0.b(((long) 16) & 4294967295L));
            RandomAccessFile randomAccessFile = this.chunkFile;
            if (randomAccessFile != null) {
                randomAccessFile.seek(jB);
            }
            byte[] bArr = new byte[4];
            RandomAccessFile randomAccessFile2 = this.chunkFile;
            Integer numValueOf = randomAccessFile2 != null ? Integer.valueOf(randomAccessFile2.read(bArr)) : null;
            byte[] bArr2 = new byte[4];
            RandomAccessFile randomAccessFile3 = this.chunkFile;
            Integer numValueOf2 = randomAccessFile3 != null ? Integer.valueOf(randomAccessFile3.read(bArr2)) : null;
            if (numValueOf != null && numValueOf.intValue() == 4 && numValueOf2 != null && numValueOf2.intValue() == 4) {
                int iF = o.f(bArr);
                int iF2 = o.f(bArr2);
                if (iF == 0) {
                    return null;
                }
                this.currentIndex = jn0.c0.b(this.currentIndex + jn0.c0.b(1L));
                if (iF2 == 0) {
                    f56009n.j("getNalUnitsOfNextFrame, returning gap data");
                    return new ArrayList<>();
                }
                RandomAccessFile randomAccessFile4 = this.chunkFile;
                if (randomAccessFile4 != null) {
                    randomAccessFile4.seek(((long) iF) & 4294967295L);
                }
                byte[] bArr3 = new byte[iF2];
                RandomAccessFile randomAccessFile5 = this.chunkFile;
                if (randomAccessFile5 != null) {
                    randomAccessFile5.read(bArr3);
                }
                return INSTANCE.d(new ArrayList<>(p013kotlin.collections.n.q1(bArr3)));
            }
            f56009n.j("getNalUnitsOfNextFrame, no next frame, invalid header, offsetCount: " + numValueOf + ", sizeCount: " + numValueOf2);
            return null;
        } finally {
            reentrantLock.unlock();
        }
    }

    protected long m(long relativeMs) {
        return jn0.j0.a((jn0.j0.e(relativeMs) / 1000.0d) * jn0.j0.c(this.fps));
    }

    public final void n(long videoStartTimeEpochMs, long epochMs, String camera) {
        p013kotlin.jvm.internal.s.k(camera, "camera");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            o(videoStartTimeEpochMs, camera);
            jn0.c0 c0Var = this.currentChunkStartEpochMs;
            if (c0Var != null && this.chunkFile != null) {
                p013kotlin.jvm.internal.s.h(c0Var);
                if (Long.compare(epochMs ^ Long.MIN_VALUE, c0Var.getData() ^ Long.MIN_VALUE) < 0) {
                    com.tesla.logging.g gVar = f56009n;
                    String str = "Invalid seek: epochMs < currentChunkStartEpochMs (" + jn0.c0.f(epochMs) + " < " + this.currentChunkStartEpochMs + ")";
                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                    String tag = gVar.getTag();
                    String strG = gVar.g(str);
                    zb0.a aVar = zb0.a.f128044a;
                    Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry : mapF.entrySet()) {
                        zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    firebaseCrashlytics.recordException(new Exception(strG));
                    TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                    vr0.a.INSTANCE.a(strG, new Object[0]);
                    return;
                }
                jn0.c0 c0Var2 = this.currentChunkStartEpochMs;
                p013kotlin.jvm.internal.s.h(c0Var2);
                long jM = m(jn0.c0.b(epochMs - c0Var2.getData()));
                if (Long.compare(jM ^ Long.MIN_VALUE, jn0.c0.b(((long) this.frameCapacity) & 4294967295L) ^ Long.MIN_VALUE) < 0) {
                    this.currentIndex = jM;
                    f56009n.j("Sought to epochMs=" + jn0.c0.f(epochMs) + " index=" + jn0.c0.f(this.currentIndex) + " camera=" + camera);
                    jn0.h0 h0Var = jn0.h0.f84049a;
                    return;
                }
                com.tesla.logging.g gVar2 = f56009n;
                String str2 = "Invalid seek: newIndex >= frameCapacity (" + jn0.c0.f(jM) + " >= " + jn0.a0.e(this.frameCapacity) + ")";
                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                String tag2 = gVar2.getTag();
                String strG2 = gVar2.g(str2);
                zb0.a aVar2 = zb0.a.f128044a;
                Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry2 : mapF2.entrySet()) {
                    zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                }
                firebaseCrashlytics2.recordException(new Exception(strG2));
                TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                vr0.a.INSTANCE.a(strG2, new Object[0]);
                c();
                return;
            }
            com.tesla.logging.g gVar3 = f56009n;
            TeslaLog teslaLog3 = TeslaLog.INSTANCE;
            String tag3 = gVar3.getTag();
            String strG3 = gVar3.g("Invalid seek: no file open");
            zb0.a aVar3 = zb0.a.f128044a;
            Map mapF3 = p013kotlin.collections.v0.f(jn0.x.a(tag3, strG3));
            FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry3 : mapF3.entrySet()) {
                zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
            }
            firebaseCrashlytics3.recordException(new Exception(strG3));
            TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
            vr0.a.INSTANCE.a(strG3, new Object[0]);
        } finally {
            reentrantLock.unlock();
        }
    }

    protected final void o(long videoStartTimeEpochMs, String camera) throws IOException {
        p013kotlin.jvm.internal.s.k(camera, "camera");
        if (jn0.c0.c(videoStartTimeEpochMs, this.currentChunkStartEpochMs) && this.chunkFile != null && p013kotlin.jvm.internal.s.f(this.currentCamera, camera)) {
            return;
        }
        c();
        try {
            File fileF = f(videoStartTimeEpochMs, camera);
            f56009n.j("Opening cache file " + fileF);
            if (fileF.exists()) {
                this.chunkFile = new RandomAccessFile(fileF, "rw");
            } else {
                sn0.h.o(fileF, new byte[jn0.a0.b(jn0.a0.b(this.frameCapacity * getHeaderEntrySize()) + 16)]);
                this.chunkFile = new RandomAccessFile(fileF, "rw");
                byte[] bArrI = o.i(this.version);
                byte[] bArrI2 = o.i(this.fps);
                byte[] bArrH = o.h(videoStartTimeEpochMs);
                RandomAccessFile randomAccessFile = this.chunkFile;
                if (randomAccessFile != null) {
                    randomAccessFile.seek(0L);
                }
                RandomAccessFile randomAccessFile2 = this.chunkFile;
                if (randomAccessFile2 != null) {
                    randomAccessFile2.write(bArrI);
                }
                RandomAccessFile randomAccessFile3 = this.chunkFile;
                if (randomAccessFile3 != null) {
                    randomAccessFile3.write(bArrI2);
                }
                RandomAccessFile randomAccessFile4 = this.chunkFile;
                if (randomAccessFile4 != null) {
                    randomAccessFile4.write(bArrH);
                }
            }
            this.currentChunkStartEpochMs = jn0.c0.a(videoStartTimeEpochMs);
            this.currentCamera = camera;
        } catch (Exception e11) {
            com.tesla.logging.g gVar = f56009n;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("Error opening/creating chunk file: " + e11);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            this.chunkFile = null;
            this.currentChunkStartEpochMs = null;
            this.currentCamera = null;
        }
    }

    public final void p(long videoStartTimeEpochMs, long frameIndex, List<Byte> frame, String camera, boolean checkForExistingFrame) {
        p013kotlin.jvm.internal.s.k(frame, "frame");
        p013kotlin.jvm.internal.s.k(camera, "camera");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            r(videoStartTimeEpochMs, frameIndex, frame, camera, checkForExistingFrame);
        } finally {
            reentrantLock.unlock();
        }
    }

    protected boolean r(long videoStartTimeEpochMs, long frameIndex, List<Byte> frame, String camera, boolean checkForExistingFrame) throws IOException {
        p013kotlin.jvm.internal.s.k(frame, "frame");
        p013kotlin.jvm.internal.s.k(camera, "camera");
        if (Long.compare(frameIndex ^ Long.MIN_VALUE, jn0.c0.b(((long) this.frameCapacity) & 4294967295L) ^ Long.MIN_VALUE) >= 0) {
            com.tesla.logging.g gVar = f56009n;
            String str = "Invalid write: frameIndex >= frameCapacity (" + camera + ":" + jn0.c0.f(frameIndex) + " >= " + jn0.a0.e(this.frameCapacity) + ")";
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return false;
        }
        o(videoStartTimeEpochMs, camera);
        if (this.chunkFile == null) {
            return false;
        }
        long jB = jn0.c0.b(jn0.c0.b(jn0.c0.b(((long) getHeaderEntrySize()) & 4294967295L) * frameIndex) + jn0.c0.b(4294967295L & ((long) 16)));
        if (checkForExistingFrame) {
            try {
                RandomAccessFile randomAccessFile = this.chunkFile;
                if (randomAccessFile != null) {
                    randomAccessFile.seek(jB);
                }
                byte[] bArr = new byte[4];
                RandomAccessFile randomAccessFile2 = this.chunkFile;
                Integer numValueOf = randomAccessFile2 != null ? Integer.valueOf(randomAccessFile2.read(bArr)) : null;
                byte[] bArr2 = new byte[4];
                RandomAccessFile randomAccessFile3 = this.chunkFile;
                Integer numValueOf2 = randomAccessFile3 != null ? Integer.valueOf(randomAccessFile3.read(bArr2)) : null;
                if (numValueOf != null && numValueOf.intValue() == 4 && numValueOf2 != null && numValueOf2.intValue() == 4) {
                    int iF = o.f(bArr);
                    int iF2 = o.f(bArr2);
                    if (iF != 0 || iF2 != 0) {
                        return false;
                    }
                }
            } catch (Exception e11) {
                com.tesla.logging.g gVar2 = f56009n;
                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                String tag2 = gVar2.getTag();
                String strG2 = gVar2.g("error reading file: " + e11);
                zb0.a aVar2 = zb0.a.f128044a;
                Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry2 : mapF2.entrySet()) {
                    zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                }
                firebaseCrashlytics2.recordException(new Exception(strG2));
                TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                vr0.a.INSTANCE.a(strG2, new Object[0]);
                return false;
            }
        }
        try {
            RandomAccessFile randomAccessFile4 = this.chunkFile;
            if (randomAccessFile4 != null) {
                p013kotlin.jvm.internal.s.h(randomAccessFile4);
                randomAccessFile4.seek(randomAccessFile4.length());
            }
            RandomAccessFile randomAccessFile5 = this.chunkFile;
            Long lValueOf = randomAccessFile5 != null ? Long.valueOf(randomAccessFile5.getFilePointer()) : null;
            RandomAccessFile randomAccessFile6 = this.chunkFile;
            if (randomAccessFile6 != null) {
                randomAccessFile6.write(p013kotlin.collections.v.g1(frame));
            }
            RandomAccessFile randomAccessFile7 = this.chunkFile;
            if (randomAccessFile7 != null) {
                randomAccessFile7.seek(jB);
            }
            byte[] bArrI = lValueOf != null ? o.i(jn0.a0.b((int) lValueOf.longValue())) : null;
            byte[] bArrI2 = o.i(jn0.a0.b(frame.size()));
            RandomAccessFile randomAccessFile8 = this.chunkFile;
            if (randomAccessFile8 != null) {
                randomAccessFile8.write(bArrI);
            }
            RandomAccessFile randomAccessFile9 = this.chunkFile;
            if (randomAccessFile9 == null) {
                return true;
            }
            randomAccessFile9.write(bArrI2);
            return true;
        } catch (Exception e12) {
            com.tesla.logging.g gVar3 = f56009n;
            String str2 = "Error writing frame to cache " + camera + ":" + jn0.c0.f(frameIndex) + ": " + e12;
            TeslaLog teslaLog3 = TeslaLog.INSTANCE;
            String tag3 = gVar3.getTag();
            String strG3 = gVar3.g(str2);
            zb0.a aVar3 = zb0.a.f128044a;
            Map mapF3 = p013kotlin.collections.v0.f(jn0.x.a(tag3, strG3));
            FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry3 : mapF3.entrySet()) {
                zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
            }
            firebaseCrashlytics3.recordException(new Exception(strG3));
            TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
            vr0.a.INSTANCE.a(strG3, new Object[0]);
            return false;
        }
    }

    private t(int i11, int i12, boolean z11, Context appContext) {
        p013kotlin.jvm.internal.s.k(appContext, "appContext");
        this.version = i11;
        this.fps = i12;
        this.isDownloadFrame = z11;
        this.appContext = appContext;
        this.headerEntrySize = 8;
        this.frameCapacity = jn0.a0.b(jn0.a0.b(i12 * 60) * 60);
        this.cacheDirectory = new File(appContext.getCacheDir(), "H264ChunkedFrameCache");
        this.lock = new ReentrantLock();
        try {
            if (this.cacheDirectory.exists()) {
                return;
            }
            if (this.cacheDirectory.mkdir()) {
                f56009n.j("make cacheDirectory success: " + this.cacheDirectory);
                return;
            }
            com.tesla.logging.g gVar = f56009n;
            String str = "make cacheDirectory failed: " + this.cacheDirectory;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        } catch (Exception e11) {
            com.tesla.logging.g gVar2 = f56009n;
            TeslaLog teslaLog2 = TeslaLog.INSTANCE;
            String tag2 = gVar2.getTag();
            String strG2 = gVar2.g("make cacheDirectory error: " + e11);
            zb0.a aVar2 = zb0.a.f128044a;
            Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry2 : mapF2.entrySet()) {
                zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            firebaseCrashlytics2.recordException(new Exception(strG2));
            TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
            vr0.a.INSTANCE.a(strG2, new Object[0]);
        }
    }
}
