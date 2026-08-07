package com.plaid.link.result;

import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.u;
import wn0.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/plaid/link/result/LinkAccountSubtype$CREDIT;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class LinkAccountSubtype$Companion$creditMap$2 extends u implements a<Map<String, ? extends LinkAccountSubtype.CREDIT>> {
    public static final LinkAccountSubtype$Companion$creditMap$2 INSTANCE = new LinkAccountSubtype$Companion$creditMap$2();

    public LinkAccountSubtype$Companion$creditMap$2() {
        super(0);
    }

    @Override // wn0.a
    public final Map<String, ? extends LinkAccountSubtype.CREDIT> invoke() {
        LinkAccountSubtype.CREDIT.ALL all = LinkAccountSubtype.CREDIT.ALL.INSTANCE;
        Pair pairA = x.a(all.getJson(), all);
        LinkAccountSubtype.CREDIT.CREDIT_CARD credit_card = LinkAccountSubtype.CREDIT.CREDIT_CARD.INSTANCE;
        Pair pairA2 = x.a(credit_card.getJson(), credit_card);
        LinkAccountSubtype.CREDIT.PAYPAL_CREDIT paypal_credit = LinkAccountSubtype.CREDIT.PAYPAL_CREDIT.INSTANCE;
        return v0.m(pairA, pairA2, x.a(paypal_credit.getJson(), paypal_credit));
    }
}
