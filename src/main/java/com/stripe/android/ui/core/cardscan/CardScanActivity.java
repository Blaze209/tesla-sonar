package com.stripe.android.ui.core.cardscan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.stripe.android.stripecardscan.cardscan.CardScanSheetResult;
import f30.PaymentConfiguration;
import h70.h;
import jn0.h0;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w80.o;
import wn0.a;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/ui/core/cardscan/CardScanActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;", "result", "Ljn0/h0;", "p", "(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Ly80/a;", "f", "Lkotlin/Lazy;", "n", "()Ly80/a;", "viewBinding", "g", "a", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardScanActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f54350h = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewBinding = m.b(new c());

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class b extends p implements l<CardScanSheetResult, h0> {
        b(Object obj) {
            super(1, obj, CardScanActivity.class, "onScanFinished", "onScanFinished(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V", 0);
        }

        public final void a(CardScanSheetResult p11) {
            s.k(p11, "p0");
            ((CardScanActivity) this.receiver).p(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(CardScanSheetResult cardScanSheetResult) {
            a(cardScanSheetResult);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ly80/a;", "b", "()Ly80/a;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements a<y80.a> {
        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final y80.a invoke() {
            return y80.a.c(CardScanActivity.this.getLayoutInflater());
        }
    }

    private final y80.a n() {
        return (y80.a) this.viewBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(CardScanSheetResult result) {
        Intent intentPutExtra = new Intent().putExtra("CardScanActivityResult", (Parcelable) result);
        s.j(intentPutExtra, "putExtra(...)");
        setResult(-1, intentPutExtra);
        finish();
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(n().getRoot());
        o.Companion companion = o.INSTANCE;
        String publishableKey = PaymentConfiguration.INSTANCE.a(this).getPublishableKey();
        b bVar = new b(this);
        h.Companion companion2 = h.INSTANCE;
        Context applicationContext = getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        o.Companion.b(companion, this, publishableKey, bVar, companion2.a(applicationContext, d1.c("CardScan")), null, null, 48, null).a();
    }
}
