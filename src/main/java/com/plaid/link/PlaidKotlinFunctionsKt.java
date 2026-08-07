package com.plaid.link;

import com.plaid.link.configuration.LinkTokenConfiguration;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/plaid/link/configuration/LinkTokenConfiguration$Builder;", "Ljn0/h0;", "initializer", "Lcom/plaid/link/configuration/LinkTokenConfiguration;", "linkTokenConfiguration", "(Lwn0/l;)Lcom/plaid/link/configuration/LinkTokenConfiguration;", "link-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PlaidKotlinFunctionsKt {
    public static final /* synthetic */ LinkTokenConfiguration linkTokenConfiguration(l initializer) {
        s.k(initializer, "initializer");
        LinkTokenConfiguration.Builder builder = new LinkTokenConfiguration.Builder();
        initializer.invoke(builder);
        return builder.build();
    }
}
