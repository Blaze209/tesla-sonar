package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f44353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Task<String>> f44354b = new androidx.collection.a();

    interface a {
        Task<String> start();
    }

    u0(Executor executor) {
        this.f44353a = executor;
    }

    public static /* synthetic */ Task a(u0 u0Var, String str, Task task) {
        synchronized (u0Var) {
            u0Var.f44354b.remove(str);
        }
        return task;
    }

    synchronized Task<String> b(final String str, a aVar) {
        Task<String> task = this.f44354b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task taskContinueWithTask = aVar.start().continueWithTask(this.f44353a, new Continuation() { // from class: com.google.firebase.messaging.t0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return u0.a(this.f44350a, str, task2);
            }
        });
        this.f44354b.put(str, (Task<String>) taskContinueWithTask);
        return taskContinueWithTask;
    }
}
