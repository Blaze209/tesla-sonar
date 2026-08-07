package com.plaid.link.result;

import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.u;
import wn0.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/plaid/link/result/LinkAccountSubtype$DEPOSITORY;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class LinkAccountSubtype$Companion$depositoryMap$2 extends u implements a<Map<String, ? extends LinkAccountSubtype.DEPOSITORY>> {
    public static final LinkAccountSubtype$Companion$depositoryMap$2 INSTANCE = new LinkAccountSubtype$Companion$depositoryMap$2();

    public LinkAccountSubtype$Companion$depositoryMap$2() {
        super(0);
    }

    @Override // wn0.a
    public final Map<String, ? extends LinkAccountSubtype.DEPOSITORY> invoke() {
        LinkAccountSubtype.DEPOSITORY.ALL all = LinkAccountSubtype.DEPOSITORY.ALL.INSTANCE;
        Pair pairA = x.a(all.getJson(), all);
        LinkAccountSubtype.DEPOSITORY.CASH_MANAGEMENT cash_management = LinkAccountSubtype.DEPOSITORY.CASH_MANAGEMENT.INSTANCE;
        Pair pairA2 = x.a(cash_management.getJson(), cash_management);
        LinkAccountSubtype.DEPOSITORY.CD cd2 = LinkAccountSubtype.DEPOSITORY.CD.INSTANCE;
        Pair pairA3 = x.a(cd2.getJson(), cd2);
        LinkAccountSubtype.DEPOSITORY.CHECKING checking = LinkAccountSubtype.DEPOSITORY.CHECKING.INSTANCE;
        Pair pairA4 = x.a(checking.getJson(), checking);
        LinkAccountSubtype.DEPOSITORY.EBT ebt = LinkAccountSubtype.DEPOSITORY.EBT.INSTANCE;
        Pair pairA5 = x.a(ebt.getJson(), ebt);
        LinkAccountSubtype.DEPOSITORY.HSA hsa = LinkAccountSubtype.DEPOSITORY.HSA.INSTANCE;
        Pair pairA6 = x.a(hsa.getJson(), hsa);
        LinkAccountSubtype.DEPOSITORY.MONEY_MARKET money_market = LinkAccountSubtype.DEPOSITORY.MONEY_MARKET.INSTANCE;
        Pair pairA7 = x.a(money_market.getJson(), money_market);
        LinkAccountSubtype.DEPOSITORY.PAYPAL paypal = LinkAccountSubtype.DEPOSITORY.PAYPAL.INSTANCE;
        Pair pairA8 = x.a(paypal.getJson(), paypal);
        LinkAccountSubtype.DEPOSITORY.PREPAID prepaid = LinkAccountSubtype.DEPOSITORY.PREPAID.INSTANCE;
        Pair pairA9 = x.a(prepaid.getJson(), prepaid);
        LinkAccountSubtype.DEPOSITORY.SAVINGS savings = LinkAccountSubtype.DEPOSITORY.SAVINGS.INSTANCE;
        return v0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, x.a(savings.getJson(), savings));
    }
}
