package com.plaid.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public final class M6 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y6 f46460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z6 f46461b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46462a;

        static {
            int[] iArr = new int[Y6.values().length];
            try {
                iArr[Y6.SMS_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Y6.NO_SMS_AUTOFILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46462a = iArr;
        }
    }

    public M6(Y6 smsAutofillType, Z6 otpReceiver) {
        p013kotlin.jvm.internal.s.k(smsAutofillType, "smsAutofillType");
        p013kotlin.jvm.internal.s.k(otpReceiver, "otpReceiver");
        this.f46460a = smsAutofillType;
        this.f46461b = otpReceiver;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(intent, "intent");
        if (p013kotlin.jvm.internal.s.f(SmsRetriever.SMS_RETRIEVED_ACTION, intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                p013kotlin.jvm.internal.s.k("SMS Retrieved action extras are null", "message");
                X5.a.b(X5.f46812a, "SMS Retrieved action extras are null");
                J5 j11 = T6.f46721a;
                if (j11 != null) {
                    j11.a("SMS Retrieved action extras are null");
                    return;
                }
                return;
            }
            Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            Integer numValueOf = status != null ? Integer.valueOf(status.getStatusCode()) : null;
            if (numValueOf == null || numValueOf.intValue() != 0) {
                if (numValueOf != null && numValueOf.intValue() == 15) {
                    this.f46461b.a();
                    return;
                }
                return;
            }
            if (a.f46462a[this.f46460a.ordinal()] != 1) {
                return;
            }
            String string = extras.getString(SmsRetriever.EXTRA_SMS_MESSAGE);
            if (string != null) {
                this.f46461b.a(string);
                return;
            }
            p013kotlin.jvm.internal.s.k("SMS Receiver message is null", "message");
            X5.a.b(X5.f46812a, "SMS Receiver message is null");
            J5 j12 = T6.f46721a;
            if (j12 != null) {
                j12.a("SMS Receiver message is null");
            }
        }
    }
}
