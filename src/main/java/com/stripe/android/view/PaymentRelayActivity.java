package com.stripe.android.view;

import a70.Unvalidated;
import android.content.Intent;
import android.os.Bundle;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/PaymentRelayActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ljn0/h0;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaymentRelayActivity extends androidx.appcompat.app.c {
    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setResult(-1, new Intent().putExtras(Unvalidated.INSTANCE.b(getIntent()).i()));
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onResume() {
        super.onResume();
        finish();
    }
}
