package com.plaid.link.result;

import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.u;
import wn0.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/plaid/link/result/LinkErrorType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class LinkErrorType$Companion$jsonToObject$2 extends u implements a<Map<String, ? extends LinkErrorType>> {
    public static final LinkErrorType$Companion$jsonToObject$2 INSTANCE = new LinkErrorType$Companion$jsonToObject$2();

    public LinkErrorType$Companion$jsonToObject$2() {
        super(0);
    }

    @Override // wn0.a
    public final Map<String, ? extends LinkErrorType> invoke() {
        LinkErrorType.INVALID_REQUEST invalid_request = LinkErrorType.INVALID_REQUEST.INSTANCE;
        Pair pairA = x.a(invalid_request.getJson(), invalid_request);
        LinkErrorType.INVALID_INPUT invalid_input = LinkErrorType.INVALID_INPUT.INSTANCE;
        Pair pairA2 = x.a(invalid_input.getJson(), invalid_input);
        LinkErrorType.INSTITUTION_ERROR institution_error = LinkErrorType.INSTITUTION_ERROR.INSTANCE;
        Pair pairA3 = x.a(institution_error.getJson(), institution_error);
        LinkErrorType.RATE_LIMIT_EXCEEDED rate_limit_exceeded = LinkErrorType.RATE_LIMIT_EXCEEDED.INSTANCE;
        Pair pairA4 = x.a(rate_limit_exceeded.getJson(), rate_limit_exceeded);
        LinkErrorType.API_ERROR api_error = LinkErrorType.API_ERROR.INSTANCE;
        Pair pairA5 = x.a(api_error.getJson(), api_error);
        LinkErrorType.ITEM_ERROR item_error = LinkErrorType.ITEM_ERROR.INSTANCE;
        Pair pairA6 = x.a(item_error.getJson(), item_error);
        LinkErrorType.ASSET_REPORT_ERROR asset_report_error = LinkErrorType.ASSET_REPORT_ERROR.INSTANCE;
        Pair pairA7 = x.a(asset_report_error.getJson(), asset_report_error);
        LinkErrorType.RECAPTCHA_ERROR recaptcha_error = LinkErrorType.RECAPTCHA_ERROR.INSTANCE;
        Pair pairA8 = x.a(recaptcha_error.getJson(), recaptcha_error);
        LinkErrorType.OAUTH_ERROR oauth_error = LinkErrorType.OAUTH_ERROR.INSTANCE;
        Pair pairA9 = x.a(oauth_error.getJson(), oauth_error);
        LinkErrorType.PAYMENT_ERROR payment_error = LinkErrorType.PAYMENT_ERROR.INSTANCE;
        Pair pairA10 = x.a(payment_error.getJson(), payment_error);
        LinkErrorType.BANK_TRANSFER_ERROR bank_transfer_error = LinkErrorType.BANK_TRANSFER_ERROR.INSTANCE;
        Pair pairA11 = x.a(bank_transfer_error.getJson(), bank_transfer_error);
        LinkErrorType.DEPOSIT_SWITCH_ERROR deposit_switch_error = LinkErrorType.DEPOSIT_SWITCH_ERROR.INSTANCE;
        Pair pairA12 = x.a(deposit_switch_error.getJson(), deposit_switch_error);
        LinkErrorType.SANDBOX_ERROR sandbox_error = LinkErrorType.SANDBOX_ERROR.INSTANCE;
        return v0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, pairA10, pairA11, pairA12, x.a(sandbox_error.getJson(), sandbox_error));
    }
}
