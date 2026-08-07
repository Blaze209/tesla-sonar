package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class i extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Binder f44305b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f44307d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ExecutorService f44304a = o.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f44306c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f44308e = 0;

    class a implements i1.a {
        a() {
        }

        @Override // com.google.firebase.messaging.i1.a
        @KeepForSdk
        public Task<Void> a(Intent intent) {
            return i.this.h(intent);
        }
    }

    public static /* synthetic */ void a(i iVar, Intent intent, TaskCompletionSource taskCompletionSource) {
        iVar.getClass();
        try {
            iVar.f(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Intent intent) {
        if (intent != null) {
            g1.c(intent);
        }
        synchronized (this.f44306c) {
            try {
                int i11 = this.f44308e - 1;
                this.f44308e = i11;
                if (i11 == 0) {
                    i(this.f44307d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> h(final Intent intent) {
        if (g(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f44304a.execute(new Runnable() { // from class: com.google.firebase.messaging.h
            @Override // java.lang.Runnable
            public final void run() {
                i.a(this.f44297a, intent, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    protected Intent e(Intent intent) {
        return intent;
    }

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    boolean i(int i11) {
        return stopSelfResult(i11);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f44305b == null) {
                this.f44305b = new i1(new a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f44305b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f44304a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i11, int i12) {
        synchronized (this.f44306c) {
            this.f44307d = i12;
            this.f44308e++;
        }
        Intent intentE = e(intent);
        if (intentE == null) {
            d(intent);
            return 2;
        }
        Task<Void> taskH = h(intentE);
        if (taskH.isComplete()) {
            d(intent);
            return 2;
        }
        taskH.addOnCompleteListener(new d6.k(), new OnCompleteListener() { // from class: com.google.firebase.messaging.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f44290a.d(intent);
            }
        });
        return 3;
    }
}
