package com.stripe.android.financialconnections.exception;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/exception/UnclassifiedError;", "Lcom/stripe/android/financialconnections/exception/FinancialConnectionsError;", "name", "", "message", "(Ljava/lang/String;Ljava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UnclassifiedError extends FinancialConnectionsError {
    public /* synthetic */ UnclassifiedError(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnclassifiedError(String name, String str) {
        super(name, null, null, 0, null, str, 30, null);
        s.k(name, "name");
    }
}
