package com.stripe.android.paymentsheet;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0015¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\bR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/ExternalPaymentMethodProxyActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ljn0/h0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "outState", "onSaveInstanceState", "", "f", "Z", "hasConfirmStarted", "g", "a", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ExternalPaymentMethodProxyActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f52270h = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean hasConfirmStarted;

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            this.hasConfirmStarted = savedInstanceState.getBoolean("has_confirm_started");
        }
        String stringExtra = getIntent().getStringExtra("external_payment_method_type");
        if (stringExtra == null || this.hasConfirmStarted) {
            return;
        }
        this.hasConfirmStarted = true;
        n70.j.f93418a.a();
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onResume() {
        super.onResume();
        String stringExtra = getIntent().getStringExtra("external_payment_method_type");
        e eVar = (e) getIntent().getParcelableExtra("external_payment_method_result");
        if (stringExtra == null && eVar == null) {
            finish();
            return;
        }
        if (eVar != null) {
            if (eVar instanceof e.c) {
                setResult(-1);
            } else if (eVar instanceof e.a) {
                setResult(0);
            } else if (eVar instanceof e.Failed) {
                Intent intentPutExtra = new Intent().putExtra("external_payment_method_error_message", ((e.Failed) eVar).getDisplayMessage());
                p013kotlin.jvm.internal.s.j(intentPutExtra, "putExtra(...)");
                setResult(1, intentPutExtra);
            }
            finish();
        }
    }

    @Override // androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        p013kotlin.jvm.internal.s.k(outState, "outState");
        outState.putBoolean("has_confirm_started", this.hasConfirmStarted);
        super.onSaveInstanceState(outState);
    }
}
