package expo.modules.interfaces.taskManager;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import expo.modules.ExpoModulesPackageList;
import expo.modules.core.ModulePriorities;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.core.interfaces.Package;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import mn0.a;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/interfaces/taskManager/TaskServiceProviderHelper;", "", "<init>", "()V", "getTaskServiceImpl", "Lexpo/modules/interfaces/taskManager/TaskServiceInterface;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DoNotStrip
public final class TaskServiceProviderHelper {
    public static final TaskServiceProviderHelper INSTANCE = new TaskServiceProviderHelper();

    private TaskServiceProviderHelper() {
    }

    @DoNotStrip
    public final TaskServiceInterface getTaskServiceImpl(Context context) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        s.k(context, "context");
        Method method = ExpoModulesPackageList.class.getMethod("getPackageList", null);
        if (method == null) {
            return null;
        }
        Object objInvoke = method.invoke(null, null);
        List list = objInvoke instanceof List ? (List) objInvoke : null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Package) {
                arrayList.add(obj);
            }
        }
        List listA1 = v.a1(arrayList, new Comparator() { // from class: expo.modules.interfaces.taskManager.TaskServiceProviderHelper$getTaskServiceImpl$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                ModulePriorities modulePriorities = ModulePriorities.INSTANCE;
                return a.d(Integer.valueOf(modulePriorities.get(o0.b(((Package) t12).getClass()).c())), Integer.valueOf(modulePriorities.get(o0.b(((Package) t11).getClass()).c())));
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listA1) {
            if (obj2 instanceof TaskServiceProviderInterface) {
                arrayList2.add(obj2);
            }
        }
        TaskServiceProviderInterface taskServiceProviderInterface = (TaskServiceProviderInterface) v.q0(arrayList2);
        if (taskServiceProviderInterface != null) {
            return taskServiceProviderInterface.getTaskServiceImpl(context);
        }
        return null;
    }
}
