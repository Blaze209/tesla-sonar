package ae0;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import java.io.File;
import java.util.List;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import wd0.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lae0/a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "fileNameWithoutExtension", "", "Landroid/net/Uri;", "uris", "Ljava/io/File;", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Ljava/io/File;", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "logger", "report_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f983a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("ZipReportFiles");

    private a() {
    }

    public final File a(Context context, String fileNameWithoutExtension, List<? extends Uri> uris) {
        s.k(context, "context");
        s.k(fileNameWithoutExtension, "fileNameWithoutExtension");
        s.k(uris, "uris");
        try {
            File file = new File(e.f121681a.h(context), fileNameWithoutExtension + ".zip");
            if (file.createNewFile()) {
                logger.j("Created zip file: " + file.getName());
            } else {
                logger.j("File already exists, hopefully is zip? " + file.getName());
            }
            b.f985a.a(uris, file);
            return file;
        } catch (Exception unused) {
            g gVar = logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("Exception thrown zipping files");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return null;
        }
    }
}
