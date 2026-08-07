package io.realm.internal;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes9.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ReferenceQueue<h> f79080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Thread f79081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f79082c;

    static {
        ReferenceQueue<h> referenceQueue = new ReferenceQueue<>();
        f79080a = referenceQueue;
        Thread thread = new Thread(new e(referenceQueue));
        f79081b = thread;
        f79082c = new g();
        thread.setName("RealmFinalizingDaemon");
        thread.start();
    }

    public void a(h hVar) {
        new NativeObjectReference(this, hVar, f79080a);
    }
}
