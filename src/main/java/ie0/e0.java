package ie0;

import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u000bJ\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Lie0/e0;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "(Landroid/content/Context;)Ljava/lang/String;", "", "g", "(Landroid/content/Context;)Z", "e", "f", DateTokenConverter.CONVERTER_KEY, "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)V", "processName", "c", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "h", "a", "utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f77579a = new e0();

    private e0() {
    }

    public static final String b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        List listL0;
        String str;
        p013kotlin.jvm.internal.s.k(context, "context");
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            p013kotlin.jvm.internal.s.h(processName);
            return processName;
        }
        int iMyPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        Object obj = null;
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || (listL0 = p013kotlin.collections.v.l0(runningAppProcesses)) == null) {
            return "default";
        }
        for (Object obj2 : listL0) {
            if (((ActivityManager.RunningAppProcessInfo) obj2).pid == iMyPid) {
                obj = obj2;
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        return (runningAppProcessInfo == null || (str = runningAppProcessInfo.processName) == null) ? "default" : str;
    }

    public static final String c(Context context, String processName) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(processName, "processName");
        Object systemService = context.getSystemService("activity");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return "Not running";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (p013kotlin.jvm.internal.s.f(runningAppProcessInfo.processName, processName)) {
                int i11 = runningAppProcessInfo.importance;
                if (i11 == 100) {
                    return "Foreground";
                }
                if (i11 == 200) {
                    return "Visible";
                }
                if (i11 == 300) {
                    return "Service";
                }
                if (i11 == 400) {
                    return "Cached";
                }
                if (i11 == 500) {
                    return "Empty";
                }
                if (i11 == 1000) {
                    return "Gone";
                }
                return "Unknown: " + i11;
            }
        }
        return "Not running";
    }

    public static final boolean d(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Object systemService = context.getSystemService("activity");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        return (runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance > 100) ? false : true;
    }

    public static final boolean e(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return p013kotlin.jvm.internal.s.f(b(context), f77579a.a(context));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    public static final boolean f(Context context) {
        boolean zH0;
        String className;
        p013kotlin.jvm.internal.s.k(context, "context");
        Object systemService = context.getSystemService("activity");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) systemService).getAppTasks();
        if (appTasks != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : appTasks) {
                if (((ActivityManager.AppTask) obj).getTaskInfo().baseActivity != null) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ComponentName componentName = ((ActivityManager.AppTask) it.next()).getTaskInfo().baseActivity;
                if (componentName == null || (className = componentName.getClassName()) == null) {
                    zH0 = false;
                } else {
                    Locale ENGLISH = Locale.ENGLISH;
                    p013kotlin.jvm.internal.s.j(ENGLISH, "ENGLISH");
                    String lowerCase = className.toLowerCase(ENGLISH);
                    p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
                    if (lowerCase != null) {
                        p013kotlin.jvm.internal.s.j(ENGLISH, "ENGLISH");
                        String lowerCase2 = "com.teslamotors.TeslaApp.MainActivity".toLowerCase(ENGLISH);
                        p013kotlin.jvm.internal.s.j(lowerCase2, "toLowerCase(...)");
                        zH0 = p013kotlin.text.t.h0(lowerCase, lowerCase2, false, 2, null);
                    } else {
                        zH0 = false;
                    }
                }
                if (zH0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean g(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return p013kotlin.jvm.internal.s.f(b(context), context.getPackageName());
    }

    public static final boolean h(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Object systemService = context.getSystemService("activity");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return true;
        }
        String packageName = context.getPackageName();
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (it.hasNext()) {
            if (p013kotlin.jvm.internal.s.f(it.next().processName, packageName)) {
                return false;
            }
        }
        return true;
    }

    public static final void i(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        Object systemService = context.getSystemService("activity");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        String packageName = context.getPackageName();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (p013kotlin.jvm.internal.s.f(runningAppProcessInfo.processName, packageName)) {
                Process.killProcess(runningAppProcessInfo.pid);
                return;
            }
        }
    }

    public final String a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return context.getPackageName() + ":svc";
    }
}
