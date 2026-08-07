package vw;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvw/d0;", "", "<init>", "()V", "", "c", "()Ljava/lang/String;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lvw/c0;", "a", "(Landroid/content/Context;)Ljava/util/List;", "b", "(Landroid/content/Context;)Lvw/c0;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f119925a = new d0();

    private d0() {
    }

    private final String c() throws Throwable {
        String processName;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 > 33) {
            String strMyProcessName = Process.myProcessName();
            p013kotlin.jvm.internal.s.j(strMyProcessName, "myProcessName(...)");
            return strMyProcessName;
        }
        if (i11 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String myProcessName = ProcessUtils.getMyProcessName();
        return myProcessName != null ? myProcessName : "";
    }

    public final List<ProcessDetails> a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> listM;
        p013kotlin.jvm.internal.s.k(context, "context");
        int i11 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (listM = activityManager.getRunningAppProcesses()) == null) {
            listM = p013kotlin.collections.v.m();
        }
        List listL0 = p013kotlin.collections.v.l0(listM);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : listL0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i11) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String processName = runningAppProcessInfo.processName;
            p013kotlin.jvm.internal.s.j(processName, "processName");
            arrayList2.add(new ProcessDetails(processName, runningAppProcessInfo.pid, runningAppProcessInfo.importance, p013kotlin.jvm.internal.s.f(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final ProcessDetails b(Context context) {
        Object next;
        p013kotlin.jvm.internal.s.k(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = a(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ProcessDetails) next).getPid() != iMyPid);
        ProcessDetails processDetails = (ProcessDetails) next;
        return processDetails == null ? new ProcessDetails(c(), iMyPid, 0, false) : processDetails;
    }
}
