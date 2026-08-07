package com.tesla.TeslaV4.reactnative.module;

import android.app.Activity;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/m0;", "", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.tesla.TeslaV4.reactnative.module.m0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/m0$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "c", "(Lcom/facebook/react/bridge/Promise;Lcom/facebook/react/bridge/ReactApplicationContext;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(cu.b bVar, Activity activity, final Promise promise, Task task) {
            p013kotlin.jvm.internal.s.k(task, "task");
            if (!task.isSuccessful()) {
                Log.d("AndroidUtilModule", "Request failed");
                promise.resolve(Boolean.FALSE);
            } else {
                Log.d("AndroidUtilModule", "Request succeeded");
                Task<Void> taskA = bVar.a(activity, (cu.a) task.getResult());
                p013kotlin.jvm.internal.s.j(taskA, "launchReviewFlow(...)");
                taskA.addOnCompleteListener(new OnCompleteListener() { // from class: com.tesla.TeslaV4.reactnative.module.l0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task2) {
                        m0.Companion.e(promise, task2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(Promise promise, Task it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            Log.d("AndroidUtilModule", "Flow " + (it.isSuccessful() ? "Succeeded" : "Failed"));
            promise.resolve(Boolean.valueOf(it.isSuccessful()));
        }

        public final void c(final Promise promise, ReactApplicationContext context) {
            p013kotlin.jvm.internal.s.k(promise, "promise");
            p013kotlin.jvm.internal.s.k(context, "context");
            final Activity currentActivity = context.getCurrentActivity();
            if (currentActivity == null) {
                Log.d("AndroidUtilModule", "Activity returned null");
                promise.resolve(Boolean.FALSE);
                return;
            }
            final cu.b bVarA = cu.c.a(context);
            p013kotlin.jvm.internal.s.j(bVarA, "create(...)");
            Task<cu.a> taskB = bVarA.b();
            p013kotlin.jvm.internal.s.j(taskB, "requestReviewFlow(...)");
            taskB.addOnCompleteListener(new OnCompleteListener() { // from class: com.tesla.TeslaV4.reactnative.module.k0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    m0.Companion.d(bVarA, currentActivity, promise, task);
                }
            });
        }

        private Companion() {
        }
    }
}
