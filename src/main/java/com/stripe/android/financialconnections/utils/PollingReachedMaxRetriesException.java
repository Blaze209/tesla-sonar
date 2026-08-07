package com.stripe.android.financialconnections.utils;

import com.plaid.internal.EnumC4419g;
import com.stripe.android.core.exception.StripeException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import z50.PollTimingOptions;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/financialconnections/utils/PollingReachedMaxRetriesException;", "Lcom/stripe/android/core/exception/StripeException;", "Lz50/o;", "pollingOptions", "<init>", "(Lz50/o;)V", "", "a", "()Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PollingReachedMaxRetriesException extends StripeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollingReachedMaxRetriesException(PollTimingOptions pollingOptions) {
        super(null, null, EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, null, "reached max number of retries " + pollingOptions.getMaxNumberOfRetries() + ".", 11, null);
        s.k(pollingOptions, "pollingOptions");
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String a() {
        return "pollingReachedMaxRetriesError";
    }
}
