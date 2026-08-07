package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes5.dex */
class i1 extends Binder {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final a f44310n;

    interface a {
        Task<Void> a(Intent intent);
    }

    i1(a aVar) {
        this.f44310n = aVar;
    }

    void b(final l1.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f44310n.a(aVar.f44330a).addOnCompleteListener(new d6.k(), new OnCompleteListener() { // from class: com.google.firebase.messaging.h1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                aVar.d();
            }
        });
    }
}
