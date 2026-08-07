package com.plaid.internal;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;

/* JADX INFO: renamed from: com.plaid.internal.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4348a7 extends C4553v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M6 f46869a;

    public C4348a7(Z6 listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.f46869a = new M6(Y6.SMS_RECEIVER, listener);
    }

    @Override // com.plaid.internal.C4553v
    public final void a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        SmsRetrieverClient client = SmsRetriever.getClient(context);
        p013kotlin.jvm.internal.s.j(client, "getClient(...)");
        client.startSmsRetriever();
        androidx.core.content.b.registerReceiver(context, this.f46869a, new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION), 2);
    }

    @Override // com.plaid.internal.C4553v
    public final void b(Context context) {
        if (context != null) {
            context.unregisterReceiver(this.f46869a);
        }
    }
}
