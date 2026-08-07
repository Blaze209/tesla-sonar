package com.stripe.android.core.exception;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/stripe/android/core/exception/LocalStripeException;", "Lcom/stripe/android/core/exception/StripeException;", "", "displayMessage", "analyticsValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "f", "Ljava/lang/String;", "g", "getAnalyticsValue", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LocalStripeException extends StripeException {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String displayMessage;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String analyticsValue;

    public LocalStripeException(String str, String str2) {
        super(null, null, 0, null, str, 15, null);
        this.displayMessage = str;
        this.analyticsValue = str2;
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String a() {
        String str = this.analyticsValue;
        return str == null ? "unknown" : str;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDisplayMessage() {
        return this.displayMessage;
    }
}
