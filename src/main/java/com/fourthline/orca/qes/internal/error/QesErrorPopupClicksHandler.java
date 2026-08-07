package com.fourthline.orca.qes.internal.error;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.orca.internal.InterfaceC3131cf;
import com.fourthline.orca.internal.InterfaceC3807sD;
import com.fourthline.orca.internal.InterfaceC3997wo;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesErrorPopupClicksHandler;", "Lcom/fourthline/orca/internal/cf;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "Lcom/fourthline/orca/internal/wo;", "orcaDestroyer", "<init>", "(Lcom/fourthline/orca/internal/wo;)V", "Ljn0/s;", "Lcom/fourthline/orca/internal/qp;", "result", "Ljn0/h0;", "finishOrca", "(Ljava/lang/Object;)V", "Lcom/fourthline/orca/internal/sD;", AnalyticsAttribute.Intent, AnalyticsAttribute.Error, "", "source", "Lkotlin/Function0;", "retryBlock", "onPrimaryClicked", "(Lcom/fourthline/orca/internal/sD;Lcom/fourthline/orca/qes/internal/error/QesError;Ljava/lang/String;Lwn0/a;)V", "onSecondaryClicked", "Lcom/fourthline/orca/internal/wo;", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QesErrorPopupClicksHandler implements InterfaceC3131cf {
    public static final int $stable = 8;
    private final InterfaceC3997wo orcaDestroyer;

    public QesErrorPopupClicksHandler(InterfaceC3997wo orcaDestroyer) {
        s.k(orcaDestroyer, "orcaDestroyer");
        this.orcaDestroyer = orcaDestroyer;
    }

    private final void finishOrca(Object result) {
        this.orcaDestroyer.a(result);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    public /* bridge */ /* synthetic */ void onPrimaryClicked(InterfaceC3807sD interfaceC3807sD, Throwable th2, String str, wn0.a aVar) {
        onPrimaryClicked(interfaceC3807sD, (QesError) th2, str, (wn0.a<h0>) aVar);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    public /* bridge */ /* synthetic */ void onSecondaryClicked(InterfaceC3807sD interfaceC3807sD, Throwable th2, String str, wn0.a aVar) {
        onSecondaryClicked(interfaceC3807sD, (QesError) th2, str, (wn0.a<h0>) aVar);
    }

    public void onPrimaryClicked(InterfaceC3807sD intent, QesError error, String source, wn0.a<h0> retryBlock) {
        s.k(intent, "intent");
        s.k(error, "error");
        s.k(source, "source");
        s.k(retryBlock, "retryBlock");
        if (!(error instanceof QesError.Canceled) && !(error instanceof QesError.KycRequired) && !(error instanceof QesError.Rejected) && !(error instanceof QesError.TooManyAuthorizationAttempts) && !(error instanceof QesError.TooManyResendOtpAttempts) && !(error instanceof QesError.Unexpected)) {
            throw new NoWhenBranchMatchedException();
        }
        jn0.s.Companion companion = jn0.s.INSTANCE;
        finishOrca(jn0.s.b(t.a(error)));
    }

    public void onSecondaryClicked(InterfaceC3807sD intent, QesError error, String source, wn0.a<h0> retryBlock) {
        s.k(intent, "intent");
        s.k(error, "error");
        s.k(source, "source");
        s.k(retryBlock, "retryBlock");
        if ((error instanceof QesError.KycRequired) || (error instanceof QesError.Rejected) || (error instanceof QesError.TooManyAuthorizationAttempts) || (error instanceof QesError.TooManyResendOtpAttempts) || (error instanceof QesError.Unexpected)) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            finishOrca(jn0.s.b(t.a(error)));
        } else if (!(error instanceof QesError.Canceled)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
