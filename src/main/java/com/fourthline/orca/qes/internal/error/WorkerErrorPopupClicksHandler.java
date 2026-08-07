package com.fourthline.orca.qes.internal.error;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.orca.internal.C3104bu;
import com.fourthline.orca.internal.InterfaceC3131cf;
import com.fourthline.orca.internal.InterfaceC3807sD;
import com.fourthline.orca.internal.InterfaceC3997wo;
import com.fourthline.orca.internal.ZD;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/WorkerErrorPopupClicksHandler;", "Lcom/fourthline/orca/internal/cf;", "Lcom/fourthline/orca/internal/ZD;", "Lcom/fourthline/orca/internal/wo;", "orcaDestroyer", "Lcom/fourthline/orca/internal/bu;", "qesFlowDataBundle", "<init>", "(Lcom/fourthline/orca/internal/wo;Lcom/fourthline/orca/internal/bu;)V", "Ljn0/s;", "Lcom/fourthline/orca/internal/qp;", "result", "Ljn0/h0;", "finishOrca", "(Ljava/lang/Object;)V", "Lcom/fourthline/orca/internal/sD;", AnalyticsAttribute.Intent, AnalyticsAttribute.Error, "", "source", "Lkotlin/Function0;", "retryBlock", "onPrimaryClicked", "(Lcom/fourthline/orca/internal/sD;Lcom/fourthline/orca/internal/ZD;Ljava/lang/String;Lwn0/a;)V", "onSecondaryClicked", "Lcom/fourthline/orca/internal/wo;", "Lcom/fourthline/orca/internal/bu;", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorkerErrorPopupClicksHandler implements InterfaceC3131cf {
    public static final int $stable = 8;
    private final InterfaceC3997wo orcaDestroyer;
    private final C3104bu qesFlowDataBundle;

    public WorkerErrorPopupClicksHandler(InterfaceC3997wo orcaDestroyer, C3104bu qesFlowDataBundle) {
        s.k(orcaDestroyer, "orcaDestroyer");
        s.k(qesFlowDataBundle, "qesFlowDataBundle");
        this.orcaDestroyer = orcaDestroyer;
        this.qesFlowDataBundle = qesFlowDataBundle;
    }

    private final void finishOrca(Object result) {
        this.orcaDestroyer.a(result);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    public /* bridge */ /* synthetic */ void onPrimaryClicked(InterfaceC3807sD interfaceC3807sD, Throwable th2, String str, wn0.a aVar) {
        onPrimaryClicked(interfaceC3807sD, (ZD) th2, str, (wn0.a<h0>) aVar);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    public /* bridge */ /* synthetic */ void onSecondaryClicked(InterfaceC3807sD interfaceC3807sD, Throwable th2, String str, wn0.a aVar) {
        onSecondaryClicked(interfaceC3807sD, (ZD) th2, str, (wn0.a<h0>) aVar);
    }

    public void onPrimaryClicked(InterfaceC3807sD intent, ZD error, String source, wn0.a<h0> retryBlock) {
        s.k(intent, "intent");
        s.k(error, "error");
        s.k(source, "source");
        s.k(retryBlock, "retryBlock");
        if ((error instanceof ZD.a) || (error instanceof ZD.c)) {
            retryBlock.invoke();
        } else {
            if (!(error instanceof ZD.b)) {
                throw new NoWhenBranchMatchedException();
            }
            jn0.s.Companion companion = jn0.s.INSTANCE;
            finishOrca(jn0.s.b(t.a(QesError.Unexpected.Companion.create$default(QesError.Unexpected.INSTANCE, ((ZD.b) error).getMessage(), null, 2, null))));
        }
    }

    public void onSecondaryClicked(InterfaceC3807sD intent, ZD error, String source, wn0.a<h0> retryBlock) {
        s.k(intent, "intent");
        s.k(error, "error");
        s.k(source, "source");
        s.k(retryBlock, "retryBlock");
        if ((error instanceof ZD.a) || (error instanceof ZD.c)) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            finishOrca(jn0.s.b(t.a(QesError.Canceled.INSTANCE)));
        } else if (!(error instanceof ZD.b)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
