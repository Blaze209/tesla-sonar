package com.tesla.app;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.a0;
import androidx.work.e;
import androidx.work.j0;
import androidx.work.k;
import androidx.work.y;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.tesla.logging.g;
import ie0.q;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kd0.i;
import nc0.l;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wb.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/tesla/app/DiskUsageTelemetryWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/y$a;", DateTokenConverter.CONVERTER_KEY, "()Landroidx/work/y$a;", "c", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DiskUsageTelemetryWorker extends Worker {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g f55726d = g.INSTANCE.a("DiskUsageTelemetryWorker");

    /* JADX INFO: renamed from: com.tesla.app.DiskUsageTelemetryWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/tesla/app/DiskUsageTelemetryWorker$a;", "", "<init>", "()V", "Ljava/io/File;", "parent", "Lkd0/i;", "trace", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/io/File;Lkd0/i;)V", Action.FILE_ATTRIBUTE, "", "size", "e", "(Lkd0/i;Ljava/io/File;J)V", "", "name", "f", "(Lkd0/i;Ljava/lang/String;J)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "c", "(Landroid/content/Context;)V", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(File parent, i trace) {
            File[] fileArrListFiles = parent.listFiles();
            if (fileArrListFiles != null) {
                ArrayList<File> arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        arrayList.add(file);
                    }
                }
                for (File file2 : arrayList) {
                    s.h(file2);
                    Long lA = q.a(file2);
                    if (lA != null) {
                        DiskUsageTelemetryWorker.INSTANCE.f(trace, parent.getName() + "_" + file2.getName(), lA.longValue());
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(i trace, File file, long size) {
            String name = file.getName();
            s.j(name, "getName(...)");
            f(trace, name, size);
        }

        private final void f(i trace, String name, long size) {
            if (size >= 1048576) {
                trace.b(name, size);
            }
        }

        public final void c(Context context) {
            s.k(context, "context");
            try {
                e eVarB = new e.a().e(true).d(a0.UNMETERED).g(true).b();
                TimeUnit timeUnit = TimeUnit.HOURS;
                f.h(context).e("DiskUsageTelemetryWorker", k.KEEP, new j0.a(DiskUsageTelemetryWorker.class, 24L, timeUnit, 3L, timeUnit).j(eVarB).m(12L, timeUnit).b());
            } catch (Exception e11) {
                DiskUsageTelemetryWorker.f55726d.d("Disk usage worker scheduling failure", e11);
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DiskUsageTelemetryWorker(Context context, WorkerParameters workerParams) {
        s.k(context, "context");
        s.k(workerParams, "workerParams");
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        super(applicationContext, workerParams);
    }

    @Override // androidx.work.Worker
    public y.a d() {
        try {
            i iVarC = kd0.e.b.c(kd0.e.INSTANCE.a(), l.DISK_USAGE, null, 2, null);
            File cacheDir = getApplicationContext().getCacheDir();
            s.h(cacheDir);
            Long lA = q.a(cacheDir);
            if (lA != null) {
                INSTANCE.e(iVarC, cacheDir, lA.longValue());
            }
            File filesDir = getApplicationContext().getFilesDir();
            s.h(filesDir);
            Long lA2 = q.a(filesDir);
            if (lA2 != null) {
                INSTANCE.e(iVarC, filesDir, lA2.longValue());
            }
            INSTANCE.d(filesDir, iVarC);
            i.a.a(iVarC, null, 1, null);
        } catch (Exception e11) {
            f55726d.d("Disk usage telemetry failure", e11);
        }
        y.a aVarE = y.a.e();
        s.j(aVarE, "success(...)");
        return aVarE;
    }
}
