package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.NonNull;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import fv.EventMetadata;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes5.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f44061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jv.e f44062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kv.b f44063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fv.f f44064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fv.p f44065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k0 f44066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ev.i f44067g;

    t0(b0 b0Var, jv.e eVar, kv.b bVar, fv.f fVar, fv.p pVar, k0 k0Var, ev.i iVar) {
        this.f44061a = b0Var;
        this.f44062b = eVar;
        this.f44063c = bVar;
        this.f44064d = fVar;
        this.f44065e = pVar;
        this.f44066f = k0Var;
        this.f44067g = iVar;
    }

    public static /* synthetic */ void a(t0 t0Var, gv.f0.e.d dVar, EventMetadata eventMetadata, boolean z11) {
        t0Var.getClass();
        bv.g.f().b("disk worker: log non-fatal event to persistence");
        t0Var.f44062b.w(dVar, eventMetadata.getSessionId(), z11);
    }

    private gv.f0.e.d d(gv.f0.e.d dVar, fv.f fVar, fv.p pVar) {
        return e(dVar, fVar, pVar, Collections.EMPTY_MAP);
    }

    private gv.f0.e.d e(gv.f0.e.d dVar, fv.f fVar, fv.p pVar, Map<String, String> map) {
        gv.f0.e.d.b bVarH = dVar.h();
        String strC = fVar.c();
        if (strC != null) {
            bVarH.d(gv.f0.e.d.AbstractC1439d.a().b(strC).a());
        } else {
            bv.g.f().i("No log data to include with this event.");
        }
        List<gv.f0.c> listO = o(pVar.g(map));
        List<gv.f0.c> listO2 = o(pVar.h());
        if (!listO.isEmpty() || !listO2.isEmpty()) {
            bVarH.b(dVar.b().i().e(listO).g(listO2).a());
        }
        return bVarH.a();
    }

    private gv.f0.e.d f(gv.f0.e.d dVar, Map<String, String> map) {
        return g(e(dVar, this.f44064d, this.f44065e, map), this.f44065e);
    }

    private gv.f0.e.d g(gv.f0.e.d dVar, fv.p pVar) {
        List<gv.f0.e.d.AbstractC1440e> listI = pVar.i();
        if (listI.isEmpty()) {
            return dVar;
        }
        gv.f0.e.d.b bVarH = dVar.h();
        bVarH.e(gv.f0.e.d.f.a().b(listI).a());
        return bVarH.a();
    }

    private static gv.f0.a h(ApplicationExitInfo applicationExitInfo) {
        String strI = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strI = i(traceInputStream);
            }
        } catch (IOException e11) {
            bv.g.f().k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e11);
        }
        return gv.f0.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(strI).a();
    }

    public static String i(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[PKIFailureInfo.certRevoked];
                while (true) {
                    int i11 = bufferedInputStream.read(bArr);
                    if (i11 == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i11);
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            bufferedInputStream.close();
            throw th5;
        }
    }

    public static t0 j(Context context, k0 k0Var, jv.g gVar, a aVar, fv.f fVar, fv.p pVar, mv.d dVar, lv.j jVar, p0 p0Var, m mVar, ev.i iVar) {
        return new t0(new b0(context, k0Var, aVar, dVar, jVar), new jv.e(gVar, jVar, mVar), kv.b.b(context, jVar, p0Var), fVar, pVar, k0Var, iVar);
    }

    private c0 k(c0 c0Var) {
        if (c0Var.b().h() != null && c0Var.b().g() != null) {
            return c0Var;
        }
        FirebaseInstallationId firebaseInstallationIdD = this.f44066f.d(true);
        return c0.a(c0Var.b().t(firebaseInstallationIdD.getFid()).s(firebaseInstallationIdD.getAuthToken()), c0Var.d(), c0Var.c());
    }

    private ApplicationExitInfo n(String str, List<ApplicationExitInfo> list) {
        long jQ = this.f44062b.q(str);
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = tb.m.a(it.next());
            if (applicationExitInfoA.getTimestamp() < jQ) {
                return null;
            }
            if (applicationExitInfoA.getReason() == 6) {
                return applicationExitInfoA;
            }
        }
        return null;
    }

    @NonNull
    private static List<gv.f0.c> o(@NonNull Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(gv.f0.c.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.s0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((gv.f0.c) obj).b().compareTo(((gv.f0.c) obj2).b());
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean s(@NonNull Task<c0> task) {
        if (!task.isSuccessful()) {
            bv.g.f().l("Crashlytics report could not be enqueued to DataTransport", task.getException());
            return false;
        }
        c0 result = task.getResult();
        bv.g.f().b("Crashlytics report successfully enqueued to DataTransport: " + result.d());
        File fileC = result.c();
        if (fileC.delete()) {
            bv.g.f().b("Deleted report file: " + fileC.getPath());
            return true;
        }
        bv.g.f().k("Crashlytics could not delete report file: " + fileC.getPath());
        return true;
    }

    private void t(@NonNull Throwable th2, @NonNull Thread thread, @NonNull String str, @NonNull final EventMetadata eventMetadata, boolean z11) {
        final boolean zEquals = str.equals(AppMeasurement.CRASH_ORIGIN);
        final gv.f0.e.d dVarF = f(this.f44061a.d(th2, thread, str, eventMetadata.getTimestamp(), 4, 8, z11), eventMetadata.a());
        if (z11) {
            this.f44062b.w(dVarF, eventMetadata.getSessionId(), zEquals);
        } else {
            this.f44067g.diskWrite.e(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.q0
                @Override // java.lang.Runnable
                public final void run() {
                    t0.a(this.f44048a, dVarF, eventMetadata, zEquals);
                }
            });
        }
    }

    public void l(@NonNull String str, @NonNull List<n0> list, gv.f0.a aVar) {
        bv.g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<n0> it = list.iterator();
        while (it.hasNext()) {
            gv.f0.d.b bVarB = it.next().b();
            if (bVarB != null) {
                arrayList.add(bVarB);
            }
        }
        this.f44062b.l(str, gv.f0.d.a().b(Collections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void m(long j11, String str) {
        this.f44062b.k(str, j11);
    }

    public boolean p() {
        return this.f44062b.r();
    }

    public SortedSet<String> q() {
        return this.f44062b.p();
    }

    public void r(@NonNull String str, long j11) {
        this.f44062b.x(this.f44061a.e(str, j11));
    }

    public void u(@NonNull Throwable th2, @NonNull Thread thread, @NonNull String str, long j11) {
        bv.g.f().i("Persisting fatal event for session " + str);
        t(th2, thread, AppMeasurement.CRASH_ORIGIN, new EventMetadata(str, j11), true);
    }

    public void v(@NonNull Throwable th2, @NonNull Thread thread, @NonNull EventMetadata eventMetadata) {
        bv.g.f().i("Persisting non-fatal event for session " + eventMetadata.getSessionId());
        t(th2, thread, AnalyticsAttribute.Error, eventMetadata, false);
    }

    public void w(String str, List<ApplicationExitInfo> list, fv.f fVar, fv.p pVar) {
        ApplicationExitInfo applicationExitInfoN = n(str, list);
        if (applicationExitInfoN == null) {
            bv.g.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        gv.f0.e.d dVarC = this.f44061a.c(h(applicationExitInfoN));
        bv.g.f().b("Persisting anr for session " + str);
        this.f44062b.w(g(d(dVarC, fVar, pVar), pVar), str, true);
    }

    public void x() {
        this.f44062b.i();
    }

    public Task<Void> y(@NonNull Executor executor) {
        return z(executor, null);
    }

    public Task<Void> z(@NonNull Executor executor, String str) {
        List<c0> listU = this.f44062b.u();
        ArrayList arrayList = new ArrayList();
        for (c0 c0Var : listU) {
            if (str == null || str.equals(c0Var.d())) {
                arrayList.add(this.f44063c.c(k(c0Var), str != null).continueWith(executor, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.r0
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return Boolean.valueOf(this.f44054a.s(task));
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }
}
