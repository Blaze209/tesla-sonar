package wd0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.tesla.report.upload.UploadReportsWorker;
import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.y;
import java.io.File;
import java.util.concurrent.Callable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lwd0/g;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lqc0/a;", "request", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lqc0/a;)V", "kotlin.jvm.PlatformType", "a", "Landroid/content/Context;", "appContext", "b", "report_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.tesla.logging.g f121687c = com.tesla.logging.g.INSTANCE.a("ReportService");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T, R> implements cm0.h {
        b() {
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y<? extends Boolean> apply(File file) {
            com.tesla.report.upload.a.Companion companion = com.tesla.report.upload.a.INSTANCE;
            Context context = g.this.appContext;
            s.j(context, "access$getAppContext$p(...)");
            com.tesla.report.upload.a aVarC = companion.c(context);
            s.h(file);
            return com.tesla.report.upload.a.h(aVarC, file, null, 2, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c<T> implements cm0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f121690a;

        c(String str) {
            this.f121690a = str;
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            s.k(it, "it");
            g.f121687c.d("error encountered during upload: " + this.f121690a + "!", it);
        }
    }

    public g(Context context) {
        s.k(context, "context");
        this.appContext = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File e(g gVar, qc0.a aVar) throws Exception {
        xd0.b bVar = xd0.b.f123289a;
        Context appContext = gVar.appContext;
        s.j(appContext, "appContext");
        File fileB = bVar.b(appContext, aVar);
        if (fileB != null) {
            return fileB;
        }
        throw new Exception("Failed to create zip file");
    }

    public final void d(final qc0.a request) {
        s.k(request, "request");
        String report_id = request.getReport_id();
        UploadReportsWorker.Companion aVar = UploadReportsWorker.INSTANCE;
        Context appContext = this.appContext;
        s.j(appContext, "appContext");
        aVar.a(appContext, report_id);
        u.k(new Callable() { // from class: wd0.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.e(this.f121684a, request);
            }
        }).j(new b()).e(new c(report_id)).v(vm0.a.c()).r();
    }
}
