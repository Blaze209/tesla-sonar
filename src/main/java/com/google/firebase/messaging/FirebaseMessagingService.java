package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseMessagingService extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Queue<String> f44210g = new ArrayDeque(10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Rpc f44211f;

    private boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = f44210g;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    private void k(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (l0.t(extras)) {
            l0 l0Var = new l0(extras);
            ExecutorService executorServiceE = o.e();
            try {
                if (new f(this, l0Var, executorServiceE).a()) {
                    executorServiceE.shutdown();
                    return;
                } else {
                    executorServiceE.shutdown();
                    if (j0.D(intent)) {
                        j0.w(intent);
                    }
                }
            } catch (Throwable th2) {
                executorServiceE.shutdown();
                throw th2;
            }
        }
        p(new r0(extras));
    }

    private String l(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private Rpc m(Context context) {
        if (this.f44211f == null) {
            this.f44211f = new Rpc(context.getApplicationContext());
        }
        return this.f44211f;
    }

    private void n(Intent intent) {
        if (!j(intent.getStringExtra("google.message_id"))) {
            t(intent);
        }
        m(this).messageHandled(new CloudMessage(intent));
    }

    private void t(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                o();
                break;
            case "gcm":
                j0.y(intent);
                k(intent);
                break;
            case "send_error":
                s(l(intent), new SendException(intent.getStringExtra(AnalyticsAttribute.Error)));
                break;
            case "send_event":
                q(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }

    @Override // com.google.firebase.messaging.i
    protected Intent e(Intent intent) {
        return v0.b().c();
    }

    @Override // com.google.firebase.messaging.i
    public void f(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            n(intent);
            return;
        }
        if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            r(intent.getStringExtra("token"));
            return;
        }
        Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
    }

    public void o() {
    }

    public void p(@NonNull r0 r0Var) {
    }

    @Deprecated
    public void q(@NonNull String str) {
    }

    public void r(@NonNull String str) {
    }

    @Deprecated
    public void s(@NonNull String str, @NonNull Exception exc) {
    }
}
