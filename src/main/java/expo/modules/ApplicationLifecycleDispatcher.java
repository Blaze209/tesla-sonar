package expo.modules;

import android.app.Application;
import android.content.res.Configuration;
import expo.modules.core.interfaces.ApplicationLifecycleListener;
import expo.modules.core.interfaces.Package;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lexpo/modules/ApplicationLifecycleDispatcher;", "", "<init>", "()V", "Landroid/app/Application;", Kind.APPLICATION, "", "Lexpo/modules/core/interfaces/ApplicationLifecycleListener;", "getCachedListeners", "(Landroid/app/Application;)Ljava/util/List;", "Ljn0/h0;", "onApplicationCreate", "(Landroid/app/Application;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/app/Application;Landroid/content/res/Configuration;)V", "listeners", "Ljava/util/List;", "expo_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ApplicationLifecycleDispatcher {
    public static final ApplicationLifecycleDispatcher INSTANCE = new ApplicationLifecycleDispatcher();
    private static List<? extends ApplicationLifecycleListener> listeners;

    private ApplicationLifecycleDispatcher() {
    }

    private final List<ApplicationLifecycleListener> getCachedListeners(Application application) {
        List list = listeners;
        if (list != null) {
            return list;
        }
        List<Package> packageList = ExpoModulesPackage.INSTANCE.getPackageList();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = packageList.iterator();
        while (it.hasNext()) {
            List<? extends ApplicationLifecycleListener> listCreateApplicationLifecycleListeners = ((Package) it.next()).createApplicationLifecycleListeners(application);
            s.j(listCreateApplicationLifecycleListeners, "createApplicationLifecycleListeners(...)");
            v.E(arrayList, listCreateApplicationLifecycleListeners);
        }
        listeners = arrayList;
        return arrayList;
    }

    public static final void onApplicationCreate(Application application) {
        s.k(application, "application");
        Iterator<T> it = INSTANCE.getCachedListeners(application).iterator();
        while (it.hasNext()) {
            ((ApplicationLifecycleListener) it.next()).onCreate(application);
        }
    }

    public static final void onConfigurationChanged(Application application, Configuration newConfig) {
        s.k(application, "application");
        s.k(newConfig, "newConfig");
        Iterator<T> it = INSTANCE.getCachedListeners(application).iterator();
        while (it.hasNext()) {
            ((ApplicationLifecycleListener) it.next()).onConfigurationChanged(newConfig);
        }
    }
}
