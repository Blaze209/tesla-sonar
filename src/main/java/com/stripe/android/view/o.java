package com.stripe.android.view;

import android.text.Editable;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/o;", "Lcom/stripe/android/view/StripeEditText$b;", "Lcom/stripe/android/view/StripeEditText;", "backUpTarget", "<init>", "(Lcom/stripe/android/view/StripeEditText;)V", "Ljn0/h0;", "a", "()V", "Lcom/stripe/android/view/StripeEditText;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class o implements StripeEditText.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final StripeEditText backUpTarget;

    public o(StripeEditText backUpTarget) {
        p013kotlin.jvm.internal.s.k(backUpTarget, "backUpTarget");
        this.backUpTarget = backUpTarget;
    }

    @Override // com.stripe.android.view.StripeEditText.b
    public void a() {
        String string;
        Editable text = this.backUpTarget.getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        if (string.length() > 1) {
            StripeEditText stripeEditText = this.backUpTarget;
            String strSubstring = string.substring(0, string.length() - 1);
            p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
            stripeEditText.setText(strSubstring);
        }
        this.backUpTarget.requestFocus();
        StripeEditText stripeEditText2 = this.backUpTarget;
        stripeEditText2.setSelection(stripeEditText2.length());
    }
}
