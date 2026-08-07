package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.ILogger;
import io.sentry.b7;
import io.sentry.protocol.DebugImage;
import io.sentry.q7;
import io.sentry.r6;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"NewApi"})
public class AnrV2Integration implements io.sentry.o1, Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final long f79260d = TimeUnit.DAYS.toMillis(91);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f79261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.transport.p f79262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f79263c;

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f79264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.sentry.z0 f79265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SentryAndroidOptions f79266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f79267d;

        a(Context context, io.sentry.z0 z0Var, SentryAndroidOptions sentryAndroidOptions, io.sentry.transport.p pVar) {
            this.f79264a = context;
            this.f79265b = z0Var;
            this.f79266c = sentryAndroidOptions;
            this.f79267d = pVar.a() - AnrV2Integration.f79260d;
        }

        private byte[] a(InputStream inputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i11 = inputStream.read(bArr, 0, 1024);
                    if (i11 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i11);
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        private c b(ApplicationExitInfo applicationExitInfo, boolean z11) {
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                try {
                    if (traceInputStream == null) {
                        c cVar = new c(c.a.NO_DUMP);
                        if (traceInputStream == null) {
                            return cVar;
                        }
                        traceInputStream.close();
                        return cVar;
                    }
                    byte[] bArrA = a(traceInputStream);
                    traceInputStream.close();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArrA)));
                        try {
                            io.sentry.android.core.internal.threaddump.b bVarC = io.sentry.android.core.internal.threaddump.b.c(bufferedReader);
                            io.sentry.android.core.internal.threaddump.c cVar2 = new io.sentry.android.core.internal.threaddump.c(this.f79266c, z11);
                            cVar2.i(bVarC);
                            List<io.sentry.protocol.d0> listF = cVar2.f();
                            List<DebugImage> listC = cVar2.c();
                            if (listF.isEmpty()) {
                                c cVar3 = new c(c.a.NO_DUMP);
                                bufferedReader.close();
                                return cVar3;
                            }
                            c cVar4 = new c(c.a.DUMP, bArrA, listF, listC);
                            bufferedReader.close();
                            return cVar4;
                        } catch (Throwable th2) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        this.f79266c.getLogger().a(b7.WARNING, "Failed to parse ANR thread dump", th4);
                        return new c(c.a.ERROR, bArrA);
                    }
                } catch (Throwable th5) {
                    if (traceInputStream != null) {
                        try {
                            traceInputStream.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                this.f79266c.getLogger().a(b7.WARNING, "Failed to read ANR thread dump", th7);
                return new c(c.a.NO_DUMP);
            }
        }

        private void c(ApplicationExitInfo applicationExitInfo, boolean z11) {
            byte[] bArr;
            long timestamp = applicationExitInfo.getTimestamp();
            boolean z12 = applicationExitInfo.getImportance() != 100;
            c cVarB = b(applicationExitInfo, z12);
            if (cVarB.f79271a == c.a.NO_DUMP) {
                this.f79266c.getLogger().c(b7.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                return;
            }
            b bVar = new b(this.f79266c.getFlushTimeoutMillis(), this.f79266c.getLogger(), timestamp, z11, z12);
            io.sentry.h0 h0VarE = io.sentry.util.n.e(bVar);
            r6 r6Var = new r6();
            c.a aVar = cVarB.f79271a;
            if (aVar == c.a.ERROR) {
                io.sentry.protocol.m mVar = new io.sentry.protocol.m();
                mVar.f("Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.");
                r6Var.D0(mVar);
            } else if (aVar == c.a.DUMP) {
                r6Var.F0(cVarB.f79273c);
                if (cVarB.f79274d != null) {
                    io.sentry.protocol.d dVar = new io.sentry.protocol.d();
                    dVar.e(cVarB.f79274d);
                    r6Var.T(dVar);
                }
            }
            r6Var.C0(b7.FATAL);
            r6Var.G0(io.sentry.l.e(timestamp));
            if (this.f79266c.isAttachAnrThreadDump() && (bArr = cVarB.f79272b) != null) {
                h0VarE.n(io.sentry.b.b(bArr));
            }
            if (this.f79265b.D(r6Var, h0VarE).equals(io.sentry.protocol.x.f81078b) || bVar.h()) {
                return;
            }
            this.f79266c.getLogger().c(b7.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", r6Var.G());
        }

        private void d(List<ApplicationExitInfo> list, Long l11) {
            Collections.reverse(list);
            Iterator<ApplicationExitInfo> it = list.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo applicationExitInfoA = tb.m.a(it.next());
                if (applicationExitInfoA.getReason() == 6) {
                    if (applicationExitInfoA.getTimestamp() < this.f79267d) {
                        this.f79266c.getLogger().c(b7.DEBUG, "ANR happened too long ago %s.", applicationExitInfoA);
                    } else if (l11 == null || applicationExitInfoA.getTimestamp() > l11.longValue()) {
                        c(applicationExitInfoA, false);
                    } else {
                        this.f79266c.getLogger().c(b7.DEBUG, "ANR has already been reported %s.", applicationExitInfoA);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            ApplicationExitInfo applicationExitInfo = null;
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f79264a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() == 0) {
                this.f79266c.getLogger().c(b7.DEBUG, "No records in historical exit reasons.", new Object[0]);
                return;
            }
            io.sentry.cache.g envelopeDiskCache = this.f79266c.getEnvelopeDiskCache();
            if ((envelopeDiskCache instanceof io.sentry.cache.f) && this.f79266c.isEnableAutoSessionTracking()) {
                io.sentry.cache.f fVar = (io.sentry.cache.f) envelopeDiskCache;
                if (!fVar.A()) {
                    this.f79266c.getLogger().c(b7.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                    fVar.s();
                }
            }
            ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
            Long lI = io.sentry.android.core.cache.d.I(this.f79266c);
            Iterator<ApplicationExitInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                ApplicationExitInfo applicationExitInfoA = tb.m.a(it.next());
                if (applicationExitInfoA.getReason() == 6) {
                    arrayList.remove(applicationExitInfoA);
                    applicationExitInfo = applicationExitInfoA;
                    break;
                }
            }
            if (applicationExitInfo == null) {
                this.f79266c.getLogger().c(b7.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
                return;
            }
            if (applicationExitInfo.getTimestamp() < this.f79267d) {
                this.f79266c.getLogger().c(b7.DEBUG, "Latest ANR happened too long ago, returning early.", new Object[0]);
                return;
            }
            if (lI != null && applicationExitInfo.getTimestamp() <= lI.longValue()) {
                this.f79266c.getLogger().c(b7.DEBUG, "Latest ANR has already been reported, returning early.", new Object[0]);
                return;
            }
            if (this.f79266c.isReportHistoricalAnrs()) {
                d(arrayList, lI);
            }
            c(applicationExitInfo, true);
        }
    }

    public static final class b extends io.sentry.hints.d implements io.sentry.hints.c, io.sentry.hints.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f79268d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f79269e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f79270f;

        public b(long j11, ILogger iLogger, long j12, boolean z11, boolean z12) {
            super(j11, iLogger);
            this.f79268d = j12;
            this.f79269e = z11;
            this.f79270f = z12;
        }

        @Override // io.sentry.hints.a
        public Long b() {
            return Long.valueOf(this.f79268d);
        }

        @Override // io.sentry.hints.a
        public boolean c() {
            return false;
        }

        @Override // io.sentry.hints.a
        public String d() {
            return this.f79270f ? "anr_background" : "anr_foreground";
        }

        @Override // io.sentry.hints.c
        public boolean e() {
            return this.f79269e;
        }

        @Override // io.sentry.hints.f
        public boolean f(io.sentry.protocol.x xVar) {
            return true;
        }

        @Override // io.sentry.hints.f
        public void g(io.sentry.protocol.x xVar) {
        }
    }

    public AnrV2Integration(Context context) {
        this(context, io.sentry.transport.n.b());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f79263c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(b7.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.o1
    @SuppressLint({"NewApi"})
    public void n(io.sentry.z0 z0Var, q7 q7Var) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.y.c(q7Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) q7Var : null, "SentryAndroidOptions is required");
        this.f79263c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(b7.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f79263c.isAnrEnabled()));
        if (this.f79263c.getCacheDirPath() == null) {
            this.f79263c.getLogger().c(b7.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f79263c.isAnrEnabled()) {
            try {
                q7Var.getExecutorService().submit(new a(this.f79261a, z0Var, this.f79263c, this.f79262b));
            } catch (Throwable th2) {
                q7Var.getLogger().a(b7.DEBUG, "Failed to start AnrProcessor.", th2);
            }
            q7Var.getLogger().c(b7.DEBUG, "AnrV2Integration installed.", new Object[0]);
            io.sentry.util.p.a("AnrV2");
        }
    }

    AnrV2Integration(Context context, io.sentry.transport.p pVar) {
        this.f79261a = g1.g(context);
        this.f79262b = pVar;
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f79271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final byte[] f79272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final List<io.sentry.protocol.d0> f79273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final List<DebugImage> f79274d;

        enum a {
            DUMP,
            NO_DUMP,
            ERROR
        }

        c(a aVar) {
            this.f79271a = aVar;
            this.f79272b = null;
            this.f79273c = null;
            this.f79274d = null;
        }

        c(a aVar, byte[] bArr) {
            this.f79271a = aVar;
            this.f79272b = bArr;
            this.f79273c = null;
            this.f79274d = null;
        }

        c(a aVar, byte[] bArr, List<io.sentry.protocol.d0> list, List<DebugImage> list2) {
            this.f79271a = aVar;
            this.f79272b = bArr;
            this.f79273c = list;
            this.f79274d = list2;
        }
    }
}
