package com.tesla.report.upload;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.a0;
import androidx.work.c0;
import androidx.work.e;
import androidx.work.l;
import androidx.work.rxjava3.RxWorker;
import androidx.work.y;
import cc0.f;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import cm0.h;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.tesla.report.upload.UploadReportsWorker;
import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.v;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/tesla/report/upload/UploadReportsWorker;", "Landroidx/work/rxjava3/RxWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Lio/reactivex/rxjava3/core/u;", "Landroidx/work/y$a;", "m", "(Ljava/io/File;)Lio/reactivex/rxjava3/core/u;", "", "message", "l", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/u;", DateTokenConverter.CONVERTER_KEY, "()Lio/reactivex/rxjava3/core/u;", "Lcc0/f;", "Lcc0/f;", "reportTypeParameter", "", "k", "()Ljava/util/List;", "commonAnalyticsParameters", "e", "a", "report_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UploadReportsWorker extends RxWorker {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g f56533f = g.INSTANCE.a("UploadReportsWorker");

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private f reportTypeParameter;

    /* JADX INFO: renamed from: com.tesla.report.upload.UploadReportsWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/tesla/report/upload/UploadReportsWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "", "reportId", "Ljn0/h0;", "a", "(Landroid/content/Context;Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "", "MAX_RETRIES", "I", "KEY_REPORT_ID", "report_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context appContext, String reportId) {
            s.k(appContext, "appContext");
            s.k(reportId, "reportId");
            c0.a aVarI = new c0.a(UploadReportsWorker.class).j(new e.a().d(a0.CONNECTED).b()).m(10L, TimeUnit.SECONDS).i(androidx.work.a.LINEAR, 10000L, TimeUnit.MILLISECONDS);
            Pair[] pairArr = {x.a("UploadReportsWorker-report-id", reportId)};
            androidx.work.g.a aVar = new androidx.work.g.a();
            Pair pair = pairArr[0];
            aVar.b((String) pair.e(), pair.f());
            c0 c0VarB = aVarI.n(aVar.a()).b();
            wb.f.h(appContext).a("upload-report-files-" + reportId, l.KEEP, c0VarB).a();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T1, T2, R> implements cm0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b<T1, T2, R> f56535a = new b<>();

        b() {
        }

        @Override // cm0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(Boolean hasFailures, y.a current) {
            s.k(hasFailures, "hasFailures");
            s.k(current, "current");
            return Boolean.valueOf(hasFailures.booleanValue() || !(current instanceof y.a.c));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c<T, R> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v<y.a> f56536a;

        c(v<y.a> vVar) {
            this.f56536a = vVar;
        }

        public final void a(Boolean hadFailures) {
            s.k(hadFailures, "hadFailures");
            this.f56536a.onSuccess(hadFailures.booleanValue() ? y.a.d() : y.a.e());
        }

        @Override // cm0.h
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            a((Boolean) obj);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d<T, R> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f56537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ UploadReportsWorker f56538b;

        d(String str, UploadReportsWorker uploadReportsWorker) {
            this.f56537a = str;
            this.f56538b = uploadReportsWorker;
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y.a apply(Boolean success) {
            s.k(success, "success");
            if (success.booleanValue()) {
                UploadReportsWorker.f56533f.j("Successfully uploaded report " + this.f56537a + "!");
                pa0.c.c().b(cc0.d.REPORT_UPLOAD_ATTEMPTED, p013kotlin.collections.v.P0(p013kotlin.collections.v.e(qa0.a.g()), this.f56538b.k()));
                return y.a.f(this.f56538b.getInputData());
            }
            String str = "Failed to upload report " + this.f56537a + ". Retrying...";
            g gVar = UploadReportsWorker.f56533f;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return y.a.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadReportsWorker(Context context, WorkerParameters workerParams) {
        super(context.getApplicationContext(), workerParams);
        s.k(context, "context");
        s.k(workerParams, "workerParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(List list, UploadReportsWorker uploadReportsWorker, v emitter) {
        s.k(emitter, "emitter");
        List list2 = list;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(uploadReportsWorker.m((File) it.next()));
        }
        u.c(arrayList).u(Boolean.FALSE, b.f56535a).n(new c(emitter)).r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<f> k() {
        ArrayList arrayList = new ArrayList();
        wd0.c.f121676a.e(getRunAttemptCount());
        f fVar = this.reportTypeParameter;
        if (fVar != null) {
            arrayList.add(fVar);
        }
        return arrayList;
    }

    private final u<y.a> l(String message) {
        g gVar = f56533f;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVar.getTag();
        String strG = gVar.g(message);
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = v0.f(x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
        u<y.a> uVarM = u.m(y.a.a());
        s.j(uVarM, "just(...)");
        return uVarM;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x008c A[LOOP:0: B:21:0x0086->B:23:0x008c, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0053, please report this as an issue */
    private final u<y.a> m(File file) {
        String name = file.getName();
        String strC = sn0.h.C(file);
        int iHashCode = strC.hashCode();
        if (iHashCode != 107332) {
            if (iHashCode != 120609) {
                if (iHashCode == 3143036 && strC.equals(Action.FILE_ATTRIBUTE)) {
                    this.reportTypeParameter = wd0.c.f121676a.b();
                } else {
                    g gVar = f56533f;
                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                    String tag = gVar.getTag();
                    String strG = gVar.g("Failed to compute report type for analytics for report: " + file);
                    zb0.a aVar = zb0.a.f128044a;
                    Map mapF = v0.f(x.a(tag, strG));
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry : mapF.entrySet()) {
                        zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    firebaseCrashlytics.recordException(new Exception(strG));
                    TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                    vr0.a.INSTANCE.a(strG, new Object[0]);
                }
            } else if (strC.equals("zip")) {
                this.reportTypeParameter = wd0.c.f121676a.d();
            } else {
                g gVar2 = f56533f;
                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                String tag2 = gVar2.getTag();
                String strG2 = gVar2.g("Failed to compute report type for analytics for report: " + file);
                zb0.a aVar2 = zb0.a.f128044a;
                Map mapF2 = v0.f(x.a(tag2, strG2));
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                while (r2.hasNext()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics2.recordException(new Exception(strG2));
                TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                vr0.a.INSTANCE.a(strG2, new Object[0]);
            }
        } else if (strC.equals("log")) {
            this.reportTypeParameter = wd0.c.f121676a.c();
        } else {
            g gVar3 = f56533f;
            TeslaLog teslaLog3 = TeslaLog.INSTANCE;
            String tag3 = gVar3.getTag();
            String strG3 = gVar3.g("Failed to compute report type for analytics for report: " + file);
            zb0.a aVar3 = zb0.a.f128044a;
            Map mapF3 = v0.f(x.a(tag3, strG3));
            FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
            while (r2.hasNext()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics3.recordException(new Exception(strG3));
            TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
            vr0.a.INSTANCE.a(strG3, new Object[0]);
        }
        a.Companion companion = a.INSTANCE;
        Context applicationContext = getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        u uVarN = companion.c(applicationContext).g(file, k()).n(new d(name, this));
        s.j(uVarN, "map(...)");
        return uVarN;
    }

    @Override // androidx.work.rxjava3.RxWorker
    public u<y.a> d() {
        String strI = getInputData().i("UploadReportsWorker-report-id");
        if (strI == null || t.y0(strI)) {
            String str = "invalid report id " + strI;
            wd0.c.f121676a.a(p013kotlin.collections.v.P0(p013kotlin.collections.v.p(qa0.a.b(), qa0.a.e(str)), k()));
            return l(str);
        }
        if (getRunAttemptCount() > 20) {
            pa0.c.c().b(cc0.d.REPORT_EXCEEDED_MAX_RETRYS, p013kotlin.collections.v.p(qa0.a.b(), wd0.c.f121676a.e(getRunAttemptCount())));
            return l("Exhausted retries, not uploading report at path " + strI);
        }
        wd0.e eVar = wd0.e.f121681a;
        Context applicationContext = getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        final List<File> listG = eVar.g(applicationContext, strI);
        f56533f.j("Running upload report worker for report id " + strI + " on " + listG.size() + " report sequences. (run attempt=" + getRunAttemptCount() + ")");
        if (listG.isEmpty()) {
            u<y.a> uVarM = u.m(y.a.e());
            s.j(uVarM, "just(...)");
            return uVarM;
        }
        u<y.a> uVarD = u.d(new io.reactivex.rxjava3.core.x() { // from class: zd0.c
            @Override // io.reactivex.rxjava3.core.x
            public final void a(v vVar) {
                UploadReportsWorker.j(listG, this, vVar);
            }
        });
        s.j(uVarD, "create(...)");
        return uVarD;
    }
}
