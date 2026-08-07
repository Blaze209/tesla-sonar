package bv;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import gv.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lbv/i;", "", "<init>", "()V", "", "f", "()Ljava/lang/String;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lgv/f0$e$d$a$c;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)Ljava/util/List;", "e", "(Landroid/content/Context;)Lgv/f0$e$d$a$c;", "processName", "", "pid", "importance", "", "isDefaultProcess", "b", "(Ljava/lang/String;IIZ)Lgv/f0$e$d$a$c;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f18125a = new i();

    private i() {
    }

    public static /* synthetic */ f0.e.d.a.c c(i iVar, String str, int i11, int i12, boolean z11, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        if ((i13 & 8) != 0) {
            z11 = false;
        }
        return iVar.b(str, i11, i12, z11);
    }

    private final String f() {
        String processName;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 <= 33) {
            return (i11 < 28 || (processName = Application.getProcessName()) == null) ? "" : processName;
        }
        String strMyProcessName = Process.myProcessName();
        s.h(strMyProcessName);
        return strMyProcessName;
    }

    public final f0.e.d.a.c a(String processName, int i11, int i12) {
        s.k(processName, "processName");
        return c(this, processName, i11, i12, false, 8, null);
    }

    public final f0.e.d.a.c b(String processName, int pid, int importance, boolean isDefaultProcess) {
        s.k(processName, "processName");
        f0.e.d.a.c cVarA = f0.e.d.a.c.a().e(processName).d(pid).c(importance).b(isDefaultProcess).a();
        s.j(cVarA, "build(...)");
        return cVarA;
    }

    public final List<f0.e.d.a.c> d(Context context) {
        List<ActivityManager.RunningAppProcessInfo> listM;
        s.k(context, "context");
        int i11 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (listM = activityManager.getRunningAppProcesses()) == null) {
            listM = v.m();
        }
        List listL0 = v.l0(listM);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listL0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i11) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            arrayList2.add(f0.e.d.a.c.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(s.f(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    public final f0.e.d.a.c e(Context context) {
        Object next;
        s.k(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = d(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((f0.e.d.a.c) next).c() != iMyPid);
        f0.e.d.a.c cVar = (f0.e.d.a.c) next;
        return cVar == null ? c(this, f(), iMyPid, 0, false, 12, null) : cVar;
    }
}
