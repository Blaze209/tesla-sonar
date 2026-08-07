package i80;

import android.app.ActivityManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/appcompat/app/c;", "", "a", "(Landroidx/appcompat/app/c;)Z", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {
    public static final boolean a(androidx.appcompat.app.c cVar) {
        s.k(cVar, "<this>");
        Object systemService = cVar.getSystemService("activity");
        s.i(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) systemService).getAppTasks();
        s.j(appTasks, "getAppTasks(...)");
        List<ActivityManager.AppTask> list = appTasks;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((ActivityManager.AppTask) it.next()).getTaskInfo().persistentId == cVar.getTaskId()) {
                return true;
            }
        }
        return false;
    }
}
