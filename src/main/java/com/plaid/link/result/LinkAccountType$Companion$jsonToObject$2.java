package com.plaid.link.result;

import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.u;
import wn0.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/plaid/link/result/LinkAccountType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class LinkAccountType$Companion$jsonToObject$2 extends u implements a<Map<String, ? extends LinkAccountType>> {
    public static final LinkAccountType$Companion$jsonToObject$2 INSTANCE = new LinkAccountType$Companion$jsonToObject$2();

    public LinkAccountType$Companion$jsonToObject$2() {
        super(0);
    }

    @Override // wn0.a
    public final Map<String, ? extends LinkAccountType> invoke() {
        LinkAccountType.CREDIT credit = LinkAccountType.CREDIT.INSTANCE;
        Pair pairA = x.a(credit.getJson(), credit);
        LinkAccountType.DEPOSITORY depository = LinkAccountType.DEPOSITORY.INSTANCE;
        Pair pairA2 = x.a(depository.getJson(), depository);
        LinkAccountType.INVESTMENT investment = LinkAccountType.INVESTMENT.INSTANCE;
        Pair pairA3 = x.a(investment.getJson(), investment);
        LinkAccountType.LOAN loan = LinkAccountType.LOAN.INSTANCE;
        Pair pairA4 = x.a(loan.getJson(), loan);
        LinkAccountType.OTHER other = LinkAccountType.OTHER.INSTANCE;
        return v0.m(pairA, pairA2, pairA3, pairA4, x.a(other.getJson(), other));
    }
}
