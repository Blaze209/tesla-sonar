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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0003*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForInstantDebitsContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/financialconnections/launcher/a$b;", "Lcom/stripe/android/financialconnections/launcher/f;", "<init>", "()V", "Lcom/stripe/android/financialconnections/launcher/b;", "c", "(Lcom/stripe/android/financialconnections/launcher/b;)Lcom/stripe/android/financialconnections/launcher/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/stripe/android/financialconnections/launcher/a$b;)Landroid/content/Intent;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "b", "(ILandroid/content/Intent;)Lcom/stripe/android/financialconnections/launcher/f;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FinancialConnectionsSheetForInstantDebitsContract extends ActivityResultContract<a.ForInstantDebits, f> {
    private final f c(b bVar) {
        if (bVar instanceof b.a) {
            return f.a.f50246a;
        }
        if (bVar instanceof b.Failed) {
            return new f.Failed(((b.Failed) bVar).getError());
        }
        if (!(bVar instanceof b.Completed)) {
            throw new NoWhenBranchMatchedException();
        }
        b.Completed completed = (b.Completed) bVar;
        return completed.getInstantDebits() == null ? new f.Failed(new IllegalArgumentException("Instant debits result is missing")) : new f.Completed(completed.getInstantDebits().getPaymentMethodId(), completed.getInstantDebits().getLast4(), completed.getInstantDebits().getBankName());
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, a.ForInstantDebits input) {
        s.k(context, "context");
        s.k(input, "input");
        return FinancialConnectionsSheetActivity.INSTANCE.c(context, input);
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f parseResult(int resultCode, Intent intent) {
        b bVar;
        f fVarC;
        return (intent == null || (bVar = (b) intent.getParcelableExtra("com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result")) == null || (fVarC = c(bVar)) == null) ? new f.Failed(new IllegalArgumentException("Failed to retrieve a ConnectionsSheetResult.")) : fVarC;
    }
}
