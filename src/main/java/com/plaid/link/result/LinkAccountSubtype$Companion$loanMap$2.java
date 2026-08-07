package com.plaid.link.result;

import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.u;
import wn0.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/plaid/link/result/LinkAccountSubtype$LOAN_SUBTYPE;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class LinkAccountSubtype$Companion$loanMap$2 extends u implements a<Map<String, ? extends LinkAccountSubtype.LOAN_SUBTYPE>> {
    public static final LinkAccountSubtype$Companion$loanMap$2 INSTANCE = new LinkAccountSubtype$Companion$loanMap$2();

    public LinkAccountSubtype$Companion$loanMap$2() {
        super(0);
    }

    @Override // wn0.a
    public final Map<String, ? extends LinkAccountSubtype.LOAN_SUBTYPE> invoke() {
        LinkAccountSubtype.LOAN_SUBTYPE.ALL all = LinkAccountSubtype.LOAN_SUBTYPE.ALL.INSTANCE;
        Pair pairA = x.a(all.getJson(), all);
        LinkAccountSubtype.LOAN_SUBTYPE.AUTO auto = LinkAccountSubtype.LOAN_SUBTYPE.AUTO.INSTANCE;
        Pair pairA2 = x.a(auto.getJson(), auto);
        LinkAccountSubtype.LOAN_SUBTYPE.BUSINESS business = LinkAccountSubtype.LOAN_SUBTYPE.BUSINESS.INSTANCE;
        Pair pairA3 = x.a(business.getJson(), business);
        LinkAccountSubtype.LOAN_SUBTYPE.COMMERCIAL commercial = LinkAccountSubtype.LOAN_SUBTYPE.COMMERCIAL.INSTANCE;
        Pair pairA4 = x.a(commercial.getJson(), commercial);
        LinkAccountSubtype.LOAN_SUBTYPE.CONSTRUCTION construction = LinkAccountSubtype.LOAN_SUBTYPE.CONSTRUCTION.INSTANCE;
        Pair pairA5 = x.a(construction.getJson(), construction);
        LinkAccountSubtype.LOAN_SUBTYPE.CONSUMER consumer = LinkAccountSubtype.LOAN_SUBTYPE.CONSUMER.INSTANCE;
        Pair pairA6 = x.a(consumer.getJson(), consumer);
        LinkAccountSubtype.LOAN_SUBTYPE.HOME_EQUITY home_equity = LinkAccountSubtype.LOAN_SUBTYPE.HOME_EQUITY.INSTANCE;
        Pair pairA7 = x.a(home_equity.getJson(), home_equity);
        LinkAccountSubtype.LOAN_SUBTYPE.LINE_OF_CREDIT line_of_credit = LinkAccountSubtype.LOAN_SUBTYPE.LINE_OF_CREDIT.INSTANCE;
        Pair pairA8 = x.a(line_of_credit.getJson(), line_of_credit);
        LinkAccountSubtype.LOAN_SUBTYPE.LOAN loan = LinkAccountSubtype.LOAN_SUBTYPE.LOAN.INSTANCE;
        Pair pairA9 = x.a(loan.getJson(), loan);
        LinkAccountSubtype.LOAN_SUBTYPE.MORTGAGE mortgage = LinkAccountSubtype.LOAN_SUBTYPE.MORTGAGE.INSTANCE;
        Pair pairA10 = x.a(mortgage.getJson(), mortgage);
        LinkAccountSubtype.LOAN_SUBTYPE.OTHER other = LinkAccountSubtype.LOAN_SUBTYPE.OTHER.INSTANCE;
        Pair pairA11 = x.a(other.getJson(), other);
        LinkAccountSubtype.LOAN_SUBTYPE.OVERDRAFT overdraft = LinkAccountSubtype.LOAN_SUBTYPE.OVERDRAFT.INSTANCE;
        Pair pairA12 = x.a(overdraft.getJson(), overdraft);
        LinkAccountSubtype.LOAN_SUBTYPE.STUDENT student = LinkAccountSubtype.LOAN_SUBTYPE.STUDENT.INSTANCE;
        return v0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, x.a(student.getJson(), student));
    }
}
