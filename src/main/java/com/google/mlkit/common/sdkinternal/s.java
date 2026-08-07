package com.google.mlkit.common.sdkinternal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class s extends PhantomReference implements a.InterfaceC0705a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f45087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f45088b;

    /* synthetic */ s(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, r rVar) {
        super(obj, referenceQueue);
        this.f45087a = set;
        this.f45088b = runnable;
    }

    @Override // com.google.mlkit.common.sdkinternal.a.InterfaceC0705a
    public final void a() {
        if (this.f45087a.remove(this)) {
            clear();
            this.f45088b.run();
        }
    }
}
