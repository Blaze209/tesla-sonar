package com.plaid.link;

import android.content.Context;
import android.content.Intent;
import androidx.p002activity.result.contract.ActivityResultContract;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.plaid.internal.L2;
import com.plaid.internal.X5;
import com.plaid.internal.link.LinkActivity;
import com.plaid.link.exception.LinkException;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResult;
import com.plaid.link.result.LinkSuccess;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/plaid/link/FastOpenPlaidLink;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/plaid/link/PlaidHandler;", "Lcom/plaid/link/result/LinkResult;", "()V", "createIntent", "Landroid/content/Intent;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "plaidHandler", "parseResult", StatusResponse.RESULT_CODE, "", "result", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FastOpenPlaidLink extends ActivityResultContract<PlaidHandler, LinkResult> {
    @Override // androidx.p002activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, PlaidHandler plaidHandler) {
        s.k(context, "context");
        s.k(plaidHandler, "plaidHandler");
        int i11 = LinkActivity.f47849e;
        s.k(context, "context");
        Plaid.INSTANCE.trackSdkOpen$link_sdk_release();
        Intent intent = new Intent(context, (Class<?>) LinkActivity.class);
        intent.setFlags(67108864);
        return intent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.p002activity.result.contract.ActivityResultContract
    public LinkResult parseResult(int resultCode, Intent result) {
        if (result == null) {
            X5.a.b(X5.f46812a, "Null result returned " + resultCode);
            return L2.b(new LinkException("No result returned."), null);
        }
        try {
            if (resultCode == 96171) {
                LinkSuccess linkSuccess = (LinkSuccess) result.getParcelableExtra("link_result");
                s.h(linkSuccess);
                return linkSuccess;
            }
            LinkExit linkExit = (LinkExit) result.getParcelableExtra("link_result");
            s.h(linkExit);
            return linkExit;
        } catch (Throwable th2) {
            X5.a.a(X5.f46812a, th2, "Invalid result returned " + resultCode);
            return L2.b(new LinkException("Invalid result returned, please ensure you aren't using 3364 as a request code to open other activities"), null);
        }
    }
}
