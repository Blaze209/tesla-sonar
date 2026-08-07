package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f44333c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static l1 f44334d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f44335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f44336b = new d6.k();

    public n(Context context) {
        this.f44335a = context;
    }

    public static /* synthetic */ Task a(Context context, Intent intent, boolean z11, Task task) {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? e(context, intent, z11).continueWith(new d6.k(), new Continuation() { // from class: com.google.firebase.messaging.l
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return Integer.valueOf(DownloaderService.STATUS_FORBIDDEN);
            }
        }) : task;
    }

    public static /* synthetic */ Integer c(Task task) {
        return -1;
    }

    private static Task<Integer> e(Context context, Intent intent, boolean z11) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        l1 l1VarF = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z11) {
            return l1VarF.d(intent).continueWith(new d6.k(), new Continuation() { // from class: com.google.firebase.messaging.m
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return n.c(task);
                }
            });
        }
        if (v0.b().e(context)) {
            g1.e(context, l1VarF, intent);
        } else {
            l1VarF.d(intent);
        }
        return Tasks.forResult(-1);
    }

    private static l1 f(Context context, String str) {
        l1 l1Var;
        synchronized (f44333c) {
            try {
                if (f44334d == null) {
                    f44334d = new l1(context, str);
                }
                l1Var = f44334d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return l1Var;
    }

    @KeepForSdk
    public Task<Integer> g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.f44335a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public Task<Integer> h(final Context context, final Intent intent) {
        boolean z11 = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z12 = (intent.getFlags() & 268435456) != 0;
        return (!z11 || z12) ? Tasks.call(this.f44336b, new Callable() { // from class: com.google.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(v0.b().g(context, intent));
            }
        }).continueWithTask(this.f44336b, new Continuation() { // from class: com.google.firebase.messaging.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return n.a(context, intent, z12, task);
            }
        }) : e(context, intent, z12);
    }
}
