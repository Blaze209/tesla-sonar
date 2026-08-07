package com.plaid.link.result;

import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.u;
import wn0.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/plaid/link/result/LinkAccountSubtype$INVESTMENT;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class LinkAccountSubtype$Companion$investmentMap$2 extends u implements a<Map<String, ? extends LinkAccountSubtype.INVESTMENT>> {
    public static final LinkAccountSubtype$Companion$investmentMap$2 INSTANCE = new LinkAccountSubtype$Companion$investmentMap$2();

    public LinkAccountSubtype$Companion$investmentMap$2() {
        super(0);
    }

    @Override // wn0.a
    public final Map<String, ? extends LinkAccountSubtype.INVESTMENT> invoke() {
        LinkAccountSubtype.INVESTMENT.ALL all = LinkAccountSubtype.INVESTMENT.ALL.INSTANCE;
        Pair pairA = x.a(all.getJson(), all);
        LinkAccountSubtype.INVESTMENT.BROKERAGE brokerage = LinkAccountSubtype.INVESTMENT.BROKERAGE.INSTANCE;
        Pair pairA2 = x.a(brokerage.getJson(), brokerage);
        LinkAccountSubtype.INVESTMENT.CASH_ISA cash_isa = LinkAccountSubtype.INVESTMENT.CASH_ISA.INSTANCE;
        Pair pairA3 = x.a(cash_isa.getJson(), cash_isa);
        LinkAccountSubtype.INVESTMENT.EDUCATION_SAVINGS_ACCOUNT education_savings_account = LinkAccountSubtype.INVESTMENT.EDUCATION_SAVINGS_ACCOUNT.INSTANCE;
        Pair pairA4 = x.a(education_savings_account.getJson(), education_savings_account);
        LinkAccountSubtype.INVESTMENT.FIXED_ANNUITY fixed_annuity = LinkAccountSubtype.INVESTMENT.FIXED_ANNUITY.INSTANCE;
        Pair pairA5 = x.a(fixed_annuity.getJson(), fixed_annuity);
        LinkAccountSubtype.INVESTMENT.GIC gic = LinkAccountSubtype.INVESTMENT.GIC.INSTANCE;
        Pair pairA6 = x.a(gic.getJson(), gic);
        LinkAccountSubtype.INVESTMENT.HEALTH_REIMBURSEMENT_ARRANGEMENT health_reimbursement_arrangement = LinkAccountSubtype.INVESTMENT.HEALTH_REIMBURSEMENT_ARRANGEMENT.INSTANCE;
        Pair pairA7 = x.a(health_reimbursement_arrangement.getJson(), health_reimbursement_arrangement);
        LinkAccountSubtype.INVESTMENT.HSA hsa = LinkAccountSubtype.INVESTMENT.HSA.INSTANCE;
        Pair pairA8 = x.a(hsa.getJson(), hsa);
        LinkAccountSubtype.INVESTMENT.INVESTMENT_401A investment_401a = LinkAccountSubtype.INVESTMENT.INVESTMENT_401A.INSTANCE;
        Pair pairA9 = x.a(investment_401a.getJson(), investment_401a);
        LinkAccountSubtype.INVESTMENT.INVESTMENT_401K investment_401k = LinkAccountSubtype.INVESTMENT.INVESTMENT_401K.INSTANCE;
        Pair pairA10 = x.a(investment_401k.getJson(), investment_401k);
        LinkAccountSubtype.INVESTMENT.INVESTMENT_403B investment_403b = LinkAccountSubtype.INVESTMENT.INVESTMENT_403B.INSTANCE;
        Pair pairA11 = x.a(investment_403b.getJson(), investment_403b);
        LinkAccountSubtype.INVESTMENT.INVESTMENT_457B investment_457b = LinkAccountSubtype.INVESTMENT.INVESTMENT_457B.INSTANCE;
        Pair pairA12 = x.a(investment_457b.getJson(), investment_457b);
        LinkAccountSubtype.INVESTMENT.INVESTMENT_529 investment_529 = LinkAccountSubtype.INVESTMENT.INVESTMENT_529.INSTANCE;
        Pair pairA13 = x.a(investment_529.getJson(), investment_529);
        LinkAccountSubtype.INVESTMENT.IRA ira = LinkAccountSubtype.INVESTMENT.IRA.INSTANCE;
        Pair pairA14 = x.a(ira.getJson(), ira);
        LinkAccountSubtype.INVESTMENT.ISA isa = LinkAccountSubtype.INVESTMENT.ISA.INSTANCE;
        Pair pairA15 = x.a(isa.getJson(), isa);
        LinkAccountSubtype.INVESTMENT.KEOGH keogh = LinkAccountSubtype.INVESTMENT.KEOGH.INSTANCE;
        Pair pairA16 = x.a(keogh.getJson(), keogh);
        LinkAccountSubtype.INVESTMENT.LIF lif = LinkAccountSubtype.INVESTMENT.LIF.INSTANCE;
        Pair pairA17 = x.a(lif.getJson(), lif);
        LinkAccountSubtype.INVESTMENT.LIRA lira = LinkAccountSubtype.INVESTMENT.LIRA.INSTANCE;
        Pair pairA18 = x.a(lira.getJson(), lira);
        LinkAccountSubtype.INVESTMENT.LRIF lrif = LinkAccountSubtype.INVESTMENT.LRIF.INSTANCE;
        Pair pairA19 = x.a(lrif.getJson(), lrif);
        LinkAccountSubtype.INVESTMENT.LRSP lrsp = LinkAccountSubtype.INVESTMENT.LRSP.INSTANCE;
        Pair pairA20 = x.a(lrsp.getJson(), lrsp);
        LinkAccountSubtype.INVESTMENT.MUTUAL_FUND mutual_fund = LinkAccountSubtype.INVESTMENT.MUTUAL_FUND.INSTANCE;
        Pair pairA21 = x.a(mutual_fund.getJson(), mutual_fund);
        LinkAccountSubtype.INVESTMENT.NON_TAXABLE_BROKERAGE_ACCOUNTT non_taxable_brokerage_accountt = LinkAccountSubtype.INVESTMENT.NON_TAXABLE_BROKERAGE_ACCOUNTT.INSTANCE;
        Pair pairA22 = x.a(non_taxable_brokerage_accountt.getJson(), non_taxable_brokerage_accountt);
        LinkAccountSubtype.INVESTMENT.PENSION pension = LinkAccountSubtype.INVESTMENT.PENSION.INSTANCE;
        Pair pairA23 = x.a(pension.getJson(), pension);
        LinkAccountSubtype.INVESTMENT.PRIF prif = LinkAccountSubtype.INVESTMENT.PRIF.INSTANCE;
        Pair pairA24 = x.a(prif.getJson(), prif);
        LinkAccountSubtype.INVESTMENT.PROFIT_SHARING_PLAN profit_sharing_plan = LinkAccountSubtype.INVESTMENT.PROFIT_SHARING_PLAN.INSTANCE;
        Pair pairA25 = x.a(profit_sharing_plan.getJson(), profit_sharing_plan);
        LinkAccountSubtype.INVESTMENT.QSHR qshr = LinkAccountSubtype.INVESTMENT.QSHR.INSTANCE;
        Pair pairA26 = x.a(qshr.getJson(), qshr);
        LinkAccountSubtype.INVESTMENT.RDSP rdsp = LinkAccountSubtype.INVESTMENT.RDSP.INSTANCE;
        Pair pairA27 = x.a(rdsp.getJson(), rdsp);
        LinkAccountSubtype.INVESTMENT.RESP resp = LinkAccountSubtype.INVESTMENT.RESP.INSTANCE;
        Pair pairA28 = x.a(resp.getJson(), resp);
        LinkAccountSubtype.INVESTMENT.RETIREMENT retirement = LinkAccountSubtype.INVESTMENT.RETIREMENT.INSTANCE;
        Pair pairA29 = x.a(retirement.getJson(), retirement);
        LinkAccountSubtype.INVESTMENT.RLIF rlif = LinkAccountSubtype.INVESTMENT.RLIF.INSTANCE;
        Pair pairA30 = x.a(rlif.getJson(), rlif);
        LinkAccountSubtype.INVESTMENT.ROTH roth = LinkAccountSubtype.INVESTMENT.ROTH.INSTANCE;
        Pair pairA31 = x.a(roth.getJson(), roth);
        LinkAccountSubtype.INVESTMENT.ROTH_401K roth_401k = LinkAccountSubtype.INVESTMENT.ROTH_401K.INSTANCE;
        Pair pairA32 = x.a(roth_401k.getJson(), roth_401k);
        LinkAccountSubtype.INVESTMENT.RRIF rrif = LinkAccountSubtype.INVESTMENT.RRIF.INSTANCE;
        Pair pairA33 = x.a(rrif.getJson(), rrif);
        LinkAccountSubtype.INVESTMENT.RRSP rrsp = LinkAccountSubtype.INVESTMENT.RRSP.INSTANCE;
        Pair pairA34 = x.a(rrsp.getJson(), rrsp);
        LinkAccountSubtype.INVESTMENT.SARSEP sarsep = LinkAccountSubtype.INVESTMENT.SARSEP.INSTANCE;
        Pair pairA35 = x.a(sarsep.getJson(), sarsep);
        LinkAccountSubtype.INVESTMENT.SEP_IRA sep_ira = LinkAccountSubtype.INVESTMENT.SEP_IRA.INSTANCE;
        Pair pairA36 = x.a(sep_ira.getJson(), sep_ira);
        LinkAccountSubtype.INVESTMENT.SIMPLE_IRA simple_ira = LinkAccountSubtype.INVESTMENT.SIMPLE_IRA.INSTANCE;
        Pair pairA37 = x.a(simple_ira.getJson(), simple_ira);
        LinkAccountSubtype.INVESTMENT.SIPP sipp = LinkAccountSubtype.INVESTMENT.SIPP.INSTANCE;
        Pair pairA38 = x.a(sipp.getJson(), sipp);
        LinkAccountSubtype.INVESTMENT.STOCK_PLAN stock_plan = LinkAccountSubtype.INVESTMENT.STOCK_PLAN.INSTANCE;
        Pair pairA39 = x.a(stock_plan.getJson(), stock_plan);
        LinkAccountSubtype.INVESTMENT.TFSA tfsa = LinkAccountSubtype.INVESTMENT.TFSA.INSTANCE;
        Pair pairA40 = x.a(tfsa.getJson(), tfsa);
        LinkAccountSubtype.INVESTMENT.THRIFT_SAVINGS_PLAN thrift_savings_plan = LinkAccountSubtype.INVESTMENT.THRIFT_SAVINGS_PLAN.INSTANCE;
        Pair pairA41 = x.a(thrift_savings_plan.getJson(), thrift_savings_plan);
        LinkAccountSubtype.INVESTMENT.TRUST trust = LinkAccountSubtype.INVESTMENT.TRUST.INSTANCE;
        Pair pairA42 = x.a(trust.getJson(), trust);
        LinkAccountSubtype.INVESTMENT.UGMA ugma = LinkAccountSubtype.INVESTMENT.UGMA.INSTANCE;
        Pair pairA43 = x.a(ugma.getJson(), ugma);
        LinkAccountSubtype.INVESTMENT.UTMA utma = LinkAccountSubtype.INVESTMENT.UTMA.INSTANCE;
        Pair pairA44 = x.a(utma.getJson(), utma);
        LinkAccountSubtype.INVESTMENT.VARIABLE_ANNUITY variable_annuity = LinkAccountSubtype.INVESTMENT.VARIABLE_ANNUITY.INSTANCE;
        return v0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, pairA13, pairA14, pairA15, pairA16, pairA17, pairA18, pairA19, pairA20, pairA21, pairA22, pairA23, pairA24, pairA25, pairA26, pairA27, pairA28, pairA29, pairA30, pairA31, pairA32, pairA33, pairA34, pairA35, pairA36, pairA37, pairA38, pairA39, pairA40, pairA41, pairA42, pairA43, pairA44, x.a(variable_annuity.getJson(), variable_annuity));
    }
}
