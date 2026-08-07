package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class p1 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, ViewManager> f23352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q1 f23353b;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f23354a;

        a(List list) {
            this.f23354a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f23354a.iterator();
            while (it.hasNext()) {
                ((ViewManager) it.next()).trimMemory();
            }
        }
    }

    public p1(q1 q1Var) {
        this.f23352a = jn.c.b();
        this.f23353b = q1Var;
    }

    public static /* synthetic */ void a(List list, int i11) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).onSurfaceStopped(i11);
        }
    }

    public static /* synthetic */ void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).invalidate();
        }
    }

    private ViewManager d(String str) {
        ViewManager<?, ?> viewManagerB = this.f23353b.b(str);
        if (viewManagerB != null) {
            this.f23352a.put(str, viewManagerB);
        }
        return viewManagerB;
    }

    public synchronized ViewManager c(String str) {
        try {
            ViewManager viewManager = this.f23352a.get(str);
            if (viewManager != null) {
                return viewManager;
            }
            String str2 = "RCT" + str;
            ViewManager viewManager2 = this.f23352a.get(str2);
            if (viewManager2 != null) {
                return viewManager2;
            }
            if (this.f23353b == null) {
                throw new IllegalViewOperationException("No ViewManager found for class " + str);
            }
            ViewManager viewManagerD = d(str);
            if (viewManagerD != null) {
                return viewManagerD;
            }
            ViewManager viewManagerD2 = d(str2);
            if (viewManagerD2 != null) {
                return viewManagerD2;
            }
            throw new IllegalViewOperationException("ViewManagerResolver returned null for either " + str + " or " + str2 + ", existing names are: " + this.f23353b.a());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized ViewManager e(String str) {
        ViewManager viewManager = this.f23352a.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.f23353b == null) {
            return null;
        }
        return d(str);
    }

    public void f() {
        final ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f23352a.values());
        }
        Runnable runnable = new Runnable() { // from class: com.facebook.react.uimanager.n1
            @Override // java.lang.Runnable
            public final void run() {
                p1.b(arrayList);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    public void g(final int i11) {
        final ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f23352a.values());
        }
        Runnable runnable = new Runnable() { // from class: com.facebook.react.uimanager.o1
            @Override // java.lang.Runnable
            public final void run() {
                p1.a(arrayList, i11);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(0);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f23352a.values());
        }
        a aVar = new a(arrayList);
        if (UiThreadUtil.isOnUiThread()) {
            aVar.run();
        } else {
            UiThreadUtil.runOnUiThread(aVar);
        }
    }

    public p1(List<ViewManager> list) {
        HashMap mapB = jn.c.b();
        for (ViewManager viewManager : list) {
            mapB.put(viewManager.getName(), viewManager);
        }
        this.f23352a = mapB;
        this.f23353b = null;
    }
}
