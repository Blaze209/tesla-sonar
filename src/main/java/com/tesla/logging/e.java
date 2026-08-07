package com.tesla.logging;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/tesla/logging/e;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "b", "(Landroid/content/Context;)V", "", "a", "(Landroid/content/Context;)Ljava/lang/String;", "tag", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "Z", "initialized", "logging_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f56373a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static boolean initialized;

    private e() {
    }

    private final String a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        List listL0;
        String str;
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            s.h(processName);
            return processName;
        }
        int iMyPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        Object obj = null;
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || (listL0 = v.l0(runningAppProcesses)) == null) {
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

    public static final void b(Context context) {
        s.k(context, "context");
        if (initialized) {
            return;
        }
        initialized = true;
        String strA = f56373a.a(context);
        String strV = t.h0(strA, ":", false, 2, null) ? t.V(t.v1(strA, ":", null, 2, null), "svc", "ble", false, 4, null) : "main";
        ad0.c cVar = ad0.c.f977e;
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        ad0.c.FileLoggingTreeConfigurationResult fileLoggingTreeConfigurationResultP = cVar.p(applicationContext, strV, strV);
        List<String> listA = fileLoggingTreeConfigurationResultP.a();
        String fatalErrorMessages = fileLoggingTreeConfigurationResultP.getFatalErrorMessages();
        vr0.a.Companion companion = vr0.a.INSTANCE;
        companion.n(cVar);
        companion.n(f.f56375e);
        g gVarA = g.INSTANCE.a("Logging");
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            gVarA.j((String) it.next());
        }
        if (fatalErrorMessages != null) {
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVarA.getTag();
            String strG = gVarA.g(fatalErrorMessages);
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
        gVarA.j("Logging initialized for process `" + strA + "`");
    }

    public final String c(String tag) {
        String string;
        return (tag == null || (string = t.F1(tag).toString()) == null) ? "" : string;
    }
}
