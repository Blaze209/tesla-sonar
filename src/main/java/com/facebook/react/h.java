package com.facebook.react;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.bridge.MemoryPressureListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class h implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<MemoryPressureListener> f22599a = new CopyOnWriteArrayList<>();

    public h(Context context) {
        context.getApplicationContext().registerComponentCallbacks(this);
    }

    private void c(int i11) {
        Iterator<MemoryPressureListener> it = this.f22599a.iterator();
        while (it.hasNext()) {
            it.next().handleMemoryPressure(i11);
        }
    }

    public void a(MemoryPressureListener memoryPressureListener) {
        if (this.f22599a.contains(memoryPressureListener)) {
            return;
        }
        this.f22599a.add(memoryPressureListener);
    }

    public void b(Context context) {
        context.getApplicationContext().unregisterComponentCallbacks(this);
    }

    public void d(MemoryPressureListener memoryPressureListener) {
        this.f22599a.remove(memoryPressureListener);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        c(i11);
    }
}
