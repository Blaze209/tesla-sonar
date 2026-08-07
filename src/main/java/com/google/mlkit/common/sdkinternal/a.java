package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReferenceQueue f45025a = new ReferenceQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f45026b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: com.google.mlkit.common.sdkinternal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0705a {
        @KeepForSdk
        void a();
    }

    private a() {
    }

    @NonNull
    @KeepForSdk
    public static a a() {
        a aVar = new a();
        aVar.b(aVar, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.p
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = aVar.f45025a;
        final Set set = aVar.f45026b;
        Thread thread = new Thread(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.q
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((s) referenceQueue2.remove()).a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @NonNull
    @KeepForSdk
    public InterfaceC0705a b(@NonNull Object obj, @NonNull Runnable runnable) {
        s sVar = new s(obj, this.f45025a, this.f45026b, runnable, null);
        this.f45026b.add(sVar);
        return sVar;
    }
}
