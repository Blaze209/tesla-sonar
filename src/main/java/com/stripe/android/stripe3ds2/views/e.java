package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/e;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lcom/stripe/android/stripe3ds2/transactions/b;", "challengeResponseData", "Lq80/q;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/views/o;", "b", "(Lcom/stripe/android/stripe3ds2/transactions/b;Lq80/q;)Lcom/stripe/android/stripe3ds2/views/o;", "Lcom/stripe/android/stripe3ds2/views/n;", "a", "(Lcom/stripe/android/stripe3ds2/transactions/b;Lq80/q;)Lcom/stripe/android/stripe3ds2/views/n;", "Lcom/stripe/android/stripe3ds2/views/q;", "c", "(Lcom/stripe/android/stripe3ds2/transactions/b;)Lcom/stripe/android/stripe3ds2/views/q;", "Landroid/content/Context;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public e(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.context = context;
    }

    public final n a(ChallengeResponseData challengeResponseData, q80.q uiCustomization) {
        p013kotlin.jvm.internal.s.k(challengeResponseData, "challengeResponseData");
        p013kotlin.jvm.internal.s.k(uiCustomization, "uiCustomization");
        n nVar = new n(this.context, null, 0, challengeResponseData.getUiType() == com.stripe.android.stripe3ds2.transactions.d.SingleSelect, 6, null);
        nVar.setTextEntryLabel(challengeResponseData.getChallengeInfoLabel(), uiCustomization.d());
        nVar.setChallengeSelectOptions(challengeResponseData.j(), uiCustomization.c(q80.q.a.SELECT));
        return nVar;
    }

    public final o b(ChallengeResponseData challengeResponseData, q80.q uiCustomization) {
        p013kotlin.jvm.internal.s.k(challengeResponseData, "challengeResponseData");
        p013kotlin.jvm.internal.s.k(uiCustomization, "uiCustomization");
        o oVar = new o(this.context, null, 0, 6, null);
        oVar.setTextEntryLabel(challengeResponseData.getChallengeInfoLabel());
        oVar.setTextBoxCustomization(uiCustomization.b());
        return oVar;
    }

    public final q c(ChallengeResponseData challengeResponseData) {
        p013kotlin.jvm.internal.s.k(challengeResponseData, "challengeResponseData");
        q qVar = new q(this.context, null, 0, 6, null);
        qVar.c(challengeResponseData.getAcsHtml());
        return qVar;
    }
}
