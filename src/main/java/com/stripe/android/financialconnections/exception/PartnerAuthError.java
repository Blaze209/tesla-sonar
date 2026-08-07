package com.stripe.android.financialconnections.exception;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/financialconnections/exception/PartnerAuthError;", "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "message", "", "(Ljava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PartnerAuthError extends FinancialConnectionsError {
    public PartnerAuthError(String str) {
        super("PartnerAuthError", null, null, 0, null, str, 30, null);
    }
}
