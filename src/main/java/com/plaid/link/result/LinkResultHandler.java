package com.plaid.link.result;

import android.content.Intent;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.plaid.link.OpenPlaidLink;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/plaid/link/result/LinkResultHandler;", "", "Lkotlin/Function1;", "Lcom/plaid/link/result/LinkSuccess;", "Ljn0/h0;", "onSuccess", "Lcom/plaid/link/result/LinkExit;", "onExit", "<init>", "(Lwn0/l;Lwn0/l;)V", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "", "onActivityResult", "(IILandroid/content/Intent;)Z", "Lwn0/l;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LinkResultHandler {
    private final l<LinkExit, h0> onExit;
    private final l<LinkSuccess, h0> onSuccess;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkResultHandler(l<? super LinkSuccess, h0> onSuccess, l<? super LinkExit, h0> onExit) {
        s.k(onSuccess, "onSuccess");
        s.k(onExit, "onExit");
        this.onSuccess = onSuccess;
        this.onExit = onExit;
    }

    public final boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != 3364) {
            return false;
        }
        LinkResult result = new OpenPlaidLink().parseResult(resultCode, data);
        if (result instanceof LinkSuccess) {
            this.onSuccess.invoke((LinkSuccess) result);
            return true;
        }
        if (!(result instanceof LinkExit)) {
            return true;
        }
        this.onExit.invoke((LinkExit) result);
        return true;
    }
}
