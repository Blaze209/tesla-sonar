package com.stripe.android.financialconnections.launcher;

import android.content.Context;
import android.content.Intent;
import androidx.p002activity.result.contract.ActivityResultContract;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.financialconnections.FinancialConnectionsSheetActivity;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/financialconnections/launcher/a$c;", "Li40/d;", "<init>", "()V", "Lcom/stripe/android/financialconnections/launcher/b;", "c", "(Lcom/stripe/android/financialconnections/launcher/b;)Li40/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/stripe/android/financialconnections/launcher/a$c;)Landroid/content/Intent;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "b", "(ILandroid/content/Intent;)Li40/d;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FinancialConnectionsSheetForTokenContract extends ActivityResultContract<a.ForToken, i40.d> {
    private final i40.d c(b bVar) {
        if (bVar instanceof b.a) {
            return i40.d.a.f75827a;
        }
        if (bVar instanceof b.Failed) {
            return new i40.d.Failed(((b.Failed) bVar).getError());
        }
        if (!(bVar instanceof b.Completed)) {
            throw new NoWhenBranchMatchedException();
        }
        b.Completed completed = (b.Completed) bVar;
        if (completed.getFinancialConnectionsSession() == null) {
            return new i40.d.Failed(new IllegalArgumentException("FinancialConnectionsSession is not set"));
        }
        return completed.getToken() == null ? new i40.d.Failed(new IllegalArgumentException("PaymentAccount is not set on FinancialConnectionsSession")) : new i40.d.Completed(completed.getFinancialConnectionsSession(), completed.getToken());
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a.ForToken input) {
        s.k(context, "context");
        s.k(input, "input");
        return FinancialConnectionsSheetActivity.INSTANCE.c(context, input);
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i40.d parseResult(int resultCode, Intent intent) {
        b bVar;
        i40.d dVarC;
        return (intent == null || (bVar = (b) intent.getParcelableExtra("com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result")) == null || (dVarC = c(bVar)) == null) ? new i40.d.Failed(new IllegalArgumentException("Failed to retrieve a ConnectionsSheetResult.")) : dVarC;
    }
}
