package com.plaid.link.result;

import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.u;
import wn0.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/plaid/link/result/LinkAccountType;", "", "Lcom/plaid/link/result/LinkAccountSubtype;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class LinkAccountSubtype$Companion$accountTypeToMap$2 extends u implements a<Map<LinkAccountType, ? extends Map<String, ? extends LinkAccountSubtype>>> {
    public static final LinkAccountSubtype$Companion$accountTypeToMap$2 INSTANCE = new LinkAccountSubtype$Companion$accountTypeToMap$2();

    public LinkAccountSubtype$Companion$accountTypeToMap$2() {
        super(0);
    }

    @Override // wn0.a
    public final Map<LinkAccountType, ? extends Map<String, ? extends LinkAccountSubtype>> invoke() {
        LinkAccountType.CREDIT credit = LinkAccountType.CREDIT.INSTANCE;
        LinkAccountSubtype.Companion companion = LinkAccountSubtype.INSTANCE;
        return v0.m(x.a(credit, companion.getCreditMap()), x.a(LinkAccountType.DEPOSITORY.INSTANCE, companion.getDepositoryMap()), x.a(LinkAccountType.INVESTMENT.INSTANCE, companion.getInvestmentMap()), x.a(LinkAccountType.LOAN.INSTANCE, companion.getLoanMap()));
    }
}
