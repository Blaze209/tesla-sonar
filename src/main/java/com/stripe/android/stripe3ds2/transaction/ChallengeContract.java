package com.stripe.android.stripe3ds2.transaction;

import android.content.Context;
import android.content.Intent;
import androidx.p002activity.result.contract.ActivityResultContract;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.stripe3ds2.views.ChallengeActivity;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/stripe3ds2/views/m;", "Lcom/stripe/android/stripe3ds2/transaction/h;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/views/m;)Landroid/content/Intent;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "b", "(ILandroid/content/Intent;)Lcom/stripe/android/stripe3ds2/transaction/h;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChallengeContract extends ActivityResultContract<ChallengeViewArgs, h> {
    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, ChallengeViewArgs input) {
        s.k(context, "context");
        s.k(input, "input");
        Intent intentPutExtras = new Intent(context, (Class<?>) ChallengeActivity.class).putExtras(input.i());
        s.j(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h parseResult(int resultCode, Intent intent) {
        return h.INSTANCE.a(intent);
    }
}
