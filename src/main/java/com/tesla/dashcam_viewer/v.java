package com.tesla.dashcam_viewer;

import android.content.Context;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/tesla/dashcam_viewer/v;", "Lcom/tesla/dashcam_viewer/t;", "Ljn0/a0;", "version", "fps", "Landroid/content/Context;", "appContext", "<init>", "(IILandroid/content/Context;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljn0/c0;", "videoStartTimeEpochMs", "", "camera", "Ljava/io/File;", "f", "(JLjava/lang/String;)Ljava/io/File;", "relativeMs", "m", "(J)J", "frameIndex", "", "", "frame", "", "checkForExistingFrame", "isFullFrame", "Ljn0/h0;", "t", "(JJLjava/util/List;Ljava/lang/String;ZZ)V", "epochMs", "s", "(JJLjava/lang/String;)Z", "o", "I", "j", "()I", "headerEntrySize", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v extends t {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final int headerEntrySize;

    public /* synthetic */ v(int i11, int i12, Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, context);
    }

    @Override // com.tesla.dashcam_viewer.t
    protected File f(long videoStartTimeEpochMs, String camera) {
        p013kotlin.jvm.internal.s.k(camera, "camera");
        return new File(getCacheDirectory(), "chunk_" + jn0.c0.f(videoStartTimeEpochMs) + "_" + camera + "_keyframe.h264chunk");
    }

    @Override // com.tesla.dashcam_viewer.t
    /* JADX INFO: renamed from: j, reason: from getter */
    public int getHeaderEntrySize() {
        return this.headerEntrySize;
    }

    @Override // com.tesla.dashcam_viewer.t
    protected long m(long relativeMs) {
        return u.a(relativeMs, jn0.c0.b(((long) 1000) & 4294967295L));
    }

    public final boolean s(long videoStartTimeEpochMs, long epochMs, String camera) {
        p013kotlin.jvm.internal.s.k(camera, "camera");
        ReentrantLock lock = getLock();
        lock.lock();
        try {
            o(videoStartTimeEpochMs, camera);
            if (getChunkFile() == null) {
                lock.unlock();
                return false;
            }
            if (getCurrentChunkStartEpochMs() == null) {
                com.tesla.logging.g gVarC = t.INSTANCE.c();
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVarC.getTag();
                String strG = gVarC.g("Invalid seek: no file open");
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
                lock.unlock();
                return false;
            }
            jn0.c0 currentChunkStartEpochMs = getCurrentChunkStartEpochMs();
            p013kotlin.jvm.internal.s.h(currentChunkStartEpochMs);
            if (Long.compare(epochMs ^ Long.MIN_VALUE, currentChunkStartEpochMs.getData() ^ Long.MIN_VALUE) < 0) {
                com.tesla.logging.g gVarC2 = t.INSTANCE.c();
                String str = "Invalid seek: epochMs < currentChunkStartEpochMs (" + jn0.c0.f(epochMs) + " < " + getCurrentChunkStartEpochMs() + ")";
                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                String tag2 = gVarC2.getTag();
                String strG2 = gVarC2.g(str);
                zb0.a aVar2 = zb0.a.f128044a;
                Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry2 : mapF2.entrySet()) {
                    zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                }
                firebaseCrashlytics2.recordException(new Exception(strG2));
                TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                vr0.a.INSTANCE.a(strG2, new Object[0]);
                lock.unlock();
                return false;
            }
            jn0.c0 currentChunkStartEpochMs2 = getCurrentChunkStartEpochMs();
            p013kotlin.jvm.internal.s.h(currentChunkStartEpochMs2);
            long jM = m(jn0.c0.b(epochMs - currentChunkStartEpochMs2.getData()));
            if (Long.compare(jM ^ Long.MIN_VALUE, jn0.c0.b(((long) getFrameCapacity()) & 4294967295L) ^ Long.MIN_VALUE) >= 0) {
                com.tesla.logging.g gVarC3 = t.INSTANCE.c();
                String str2 = "Invalid seek: newIndex >= frameCapacity (" + jn0.c0.f(jM) + " >= " + jn0.a0.e(getFrameCapacity()) + ")";
                TeslaLog teslaLog3 = TeslaLog.INSTANCE;
                String tag3 = gVarC3.getTag();
                String strG3 = gVarC3.g(str2);
                zb0.a aVar3 = zb0.a.f128044a;
                Map mapF3 = p013kotlin.collections.v0.f(jn0.x.a(tag3, strG3));
                FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry3 : mapF3.entrySet()) {
                    zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
                }
                firebaseCrashlytics3.recordException(new Exception(strG3));
                TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
                vr0.a.INSTANCE.a(strG3, new Object[0]);
                c();
                lock.unlock();
                return false;
            }
            try {
                long jB = jn0.c0.b(jn0.c0.b(jM * jn0.c0.b(((long) getHeaderEntrySize()) & 4294967295L)) + jn0.c0.b(((long) 16) & 4294967295L));
                RandomAccessFile chunkFile = getChunkFile();
                if (chunkFile != null) {
                    chunkFile.seek(jB);
                }
                byte[] bArr = new byte[4];
                RandomAccessFile chunkFile2 = getChunkFile();
                Integer numValueOf = chunkFile2 != null ? Integer.valueOf(chunkFile2.read(bArr)) : null;
                byte[] bArr2 = new byte[4];
                RandomAccessFile chunkFile3 = getChunkFile();
                Integer numValueOf2 = chunkFile3 != null ? Integer.valueOf(chunkFile3.read(bArr2)) : null;
                byte[] bArr3 = new byte[1];
                RandomAccessFile chunkFile4 = getChunkFile();
                Integer numValueOf3 = chunkFile4 != null ? Integer.valueOf(chunkFile4.read(bArr3)) : null;
                if (numValueOf != null && numValueOf.intValue() == 4 && numValueOf2 != null && numValueOf2.intValue() == 4 && numValueOf3 != null && numValueOf3.intValue() == 1) {
                    int iF = o.f(bArr);
                    int iF2 = o.f(bArr2);
                    boolean z11 = bArr3[0] != 0;
                    if (iF == 0 && iF2 == 0) {
                        lock.unlock();
                        return false;
                    }
                    lock.unlock();
                    return z11;
                }
            } catch (Exception e11) {
                com.tesla.logging.g gVarC4 = t.INSTANCE.c();
                TeslaLog teslaLog4 = TeslaLog.INSTANCE;
                String tag4 = gVarC4.getTag();
                String strG4 = gVarC4.g("error reading key frame: " + e11);
                zb0.a aVar4 = zb0.a.f128044a;
                Map mapF4 = p013kotlin.collections.v0.f(jn0.x.a(tag4, strG4));
                FirebaseCrashlytics firebaseCrashlytics4 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry4 : mapF4.entrySet()) {
                    zb0.a.f128044a.a((String) entry4.getKey(), (String) entry4.getValue());
                }
                firebaseCrashlytics4.recordException(new Exception(strG4));
                TeslaLog.setTag$default(teslaLog4, tag4, false, 2, null);
                vr0.a.INSTANCE.a(strG4, new Object[0]);
            }
            jn0.h0 h0Var = jn0.h0.f84049a;
            lock.unlock();
            return false;
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    public final void t(long videoStartTimeEpochMs, long frameIndex, List<Byte> frame, String camera, boolean checkForExistingFrame, boolean isFullFrame) {
        p013kotlin.jvm.internal.s.k(frame, "frame");
        p013kotlin.jvm.internal.s.k(camera, "camera");
        ReentrantLock lock = getLock();
        lock.lock();
        try {
            if (!r(videoStartTimeEpochMs, frameIndex, frame, camera, checkForExistingFrame)) {
                lock.unlock();
                return;
            }
            if (Long.compare(frameIndex ^ Long.MIN_VALUE, jn0.c0.b(((long) getFrameCapacity()) & 4294967295L) ^ Long.MIN_VALUE) >= 0) {
                com.tesla.logging.g gVarC = t.INSTANCE.c();
                String str = "Invalid write: frameIndex >= frameCapacity (" + camera + ":" + jn0.c0.f(frameIndex) + " >= " + jn0.a0.e(getFrameCapacity()) + ")";
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
                lock.unlock();
                return;
            }
            if (getChunkFile() == null) {
                lock.unlock();
                return;
            }
            try {
                long jB = jn0.c0.b(jn0.c0.b(jn0.c0.b(frameIndex * jn0.c0.b(((long) getHeaderEntrySize()) & 4294967295L)) + jn0.c0.b(((long) 16) & 4294967295L)) + jn0.c0.b(4294967295L & ((long) 8)));
                RandomAccessFile chunkFile = getChunkFile();
                if (chunkFile != null) {
                    chunkFile.seek(jB);
                }
                byte[] bArrArray = ByteBuffer.allocate(1).put(isFullFrame ? (byte) 1 : (byte) 0).array();
                RandomAccessFile chunkFile2 = getChunkFile();
                if (chunkFile2 != null) {
                    chunkFile2.write(bArrArray);
                    jn0.h0 h0Var = jn0.h0.f84049a;
                }
            } catch (Exception e11) {
                com.tesla.logging.g gVarC2 = t.INSTANCE.c();
                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                String tag2 = gVarC2.getTag();
                String strG2 = gVarC2.g("error writing key frame: " + e11);
                zb0.a aVar2 = zb0.a.f128044a;
                Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry2 : mapF2.entrySet()) {
                    zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                }
                firebaseCrashlytics2.recordException(new Exception(strG2));
                TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                vr0.a.INSTANCE.a(strG2, new Object[0]);
                jn0.h0 h0Var2 = jn0.h0.f84049a;
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private v(int i11, int i12, Context appContext) {
        super(i11, i12, false, appContext, null);
        p013kotlin.jvm.internal.s.k(appContext, "appContext");
        this.headerEntrySize = 9;
    }
}
