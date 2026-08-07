package xd0;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import wd0.e;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u000e"}, d2 = {"Lxd0/b;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lqc0/a;", "request", "Ljava/io/File;", "b", "(Landroid/content/Context;Lqc0/a;)Ljava/io/File;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "report_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f123289a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("BuildReport");

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c(File it) {
        s.k(it, "it");
        String name = it.getName();
        s.j(name, "getName(...)");
        return name;
    }

    public final File b(Context context, qc0.a request) {
        s.k(context, "context");
        s.k(request, "request");
        String report_id = request.getReport_id();
        List<String> listC = request.c();
        ArrayList arrayList = new ArrayList();
        for (String str : listC) {
            String path = Uri.parse(str).getPath();
            s.h(path);
            File file = new File(path);
            if (!file.exists()) {
                g gVar = logger;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g(str + " does not exist in file system");
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = v0.f(x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
                file = null;
            }
            if (file != null) {
                arrayList.add(file);
            }
        }
        List<File> listE = e.f121681a.e(context);
        g gVar2 = logger;
        List<File> list = listE;
        ArrayList arrayList2 = new ArrayList(v.y(list, 10));
        for (File file2 : list) {
            arrayList2.add(file2.getName() + " exists?" + file2.exists() + " canRead?" + file2.canRead());
        }
        gVar2.k("log files metadata: " + arrayList2, true, true);
        List listP0 = v.P0(e.f121681a.k(context, listE), arrayList);
        List<File> list2 = listP0;
        logger.j("Zipping files: " + v.y0(list2, null, null, null, 0, null, new l() { // from class: xd0.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return b.c((File) obj);
            }
        }, 31, null));
        ae0.a aVar2 = ae0.a.f983a;
        String str2 = report_id + "." + System.currentTimeMillis();
        ArrayList arrayList3 = new ArrayList(v.y(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Uri.fromFile((File) it.next()));
        }
        File fileA = aVar2.a(context, str2, arrayList3);
        for (File file3 : list2) {
            if (file3.exists()) {
                file3.delete();
            }
        }
        return fileA;
    }
}
