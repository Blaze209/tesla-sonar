package com.stripe.android.view;

import com.google.android.material.textfield.TextInputLayout;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/view/m1;", "Lcom/stripe/android/view/StripeEditText$c;", "Lcom/google/android/material/textfield/TextInputLayout;", "textInputLayout", "<init>", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "", "message", "Ljn0/h0;", "a", "(Ljava/lang/String;)V", "Lcom/google/android/material/textfield/TextInputLayout;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m1 implements StripeEditText.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextInputLayout textInputLayout;

    public m1(TextInputLayout textInputLayout) {
        p013kotlin.jvm.internal.s.k(textInputLayout, "textInputLayout");
        this.textInputLayout = textInputLayout;
    }

    @Override // com.stripe.android.view.StripeEditText.c
    public void a(String message) {
        if (message != null) {
            this.textInputLayout.setError(message);
        } else {
            this.textInputLayout.setError(null);
            this.textInputLayout.setErrorEnabled(false);
        }
    }
}
