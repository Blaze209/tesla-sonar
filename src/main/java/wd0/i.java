package wd0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.tesla.logging.TeslaLog;
import java.io.File;
import java.util.concurrent.Callable;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lwd0/i;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)V", "b", "report_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f121692a = new i();

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(Context context) {
        com.tesla.report.upload.a aVarC = com.tesla.report.upload.a.INSTANCE.c(context);
        File[] fileArrListFiles = e.f121681a.h(context).listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        TeslaLog.INSTANCE.d("Reporting", "Uploading all report files...");
        for (File file : fileArrListFiles) {
            if (System.currentTimeMillis() - file.lastModified() > CoreConstants.MILLIS_IN_ONE_WEEK) {
                TeslaLog.INSTANCE.d("Reporting", "Deleting " + file.getName() + " file's older than seven days.");
                file.delete();
            } else {
                s.h(file);
                com.tesla.report.upload.a.h(aVarC, file, null, 2, null).r();
            }
        }
        return h0.f84049a;
    }

    public final void b(final Context context) {
        s.k(context, "context");
        File[] fileArrListFiles = e.f121681a.h(context).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        io.reactivex.rxjava3.core.b.f(new Callable() { // from class: wd0.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return i.c(context);
            }
        }).k(vm0.a.c()).g();
    }

    public final void d(Context context) {
        s.k(context, "context");
        Context applicationContext = context.getApplicationContext();
        e eVar = e.f121681a;
        s.h(applicationContext);
        eVar.j(applicationContext);
    }
}
