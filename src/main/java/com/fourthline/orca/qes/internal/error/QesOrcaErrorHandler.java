package com.fourthline.orca.qes.internal.error;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.orca.internal.AbstractC3658ot;
import com.fourthline.orca.internal.Bo;
import com.fourthline.orca.internal.InterfaceC2931Re;
import com.fourthline.orca.internal.ZD;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesOrcaErrorHandler;", "Lcom/fourthline/orca/internal/Re;", "Lcom/fourthline/orca/internal/Bo;", "Lcom/fourthline/orca/internal/ZD;", "workerErrorHandler", "Lcom/fourthline/orca/qes/internal/error/QesError;", "qesErrorHandler", "Lcom/fourthline/orca/internal/ot;", "qesAgreementsErrorHandler", "<init>", "(Lcom/fourthline/orca/internal/Re;Lcom/fourthline/orca/internal/Re;Lcom/fourthline/orca/internal/Re;)V", AnalyticsAttribute.Error, "", "source", "Ljn0/h0;", "handleError", "(Lcom/fourthline/orca/internal/Bo;Ljava/lang/String;)V", "Lkotlin/Function0;", "onRetry", "handleRecoverableError", "(Lcom/fourthline/orca/internal/Bo;Ljava/lang/String;Lwn0/a;)V", "Lcom/fourthline/orca/internal/Re;", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QesOrcaErrorHandler implements InterfaceC2931Re {
    public static final int $stable = 0;
    private final InterfaceC2931Re qesAgreementsErrorHandler;
    private final InterfaceC2931Re qesErrorHandler;
    private final InterfaceC2931Re workerErrorHandler;

    public QesOrcaErrorHandler(InterfaceC2931Re workerErrorHandler, InterfaceC2931Re qesErrorHandler, InterfaceC2931Re qesAgreementsErrorHandler) {
        s.k(workerErrorHandler, "workerErrorHandler");
        s.k(qesErrorHandler, "qesErrorHandler");
        s.k(qesAgreementsErrorHandler, "qesAgreementsErrorHandler");
        this.workerErrorHandler = workerErrorHandler;
        this.qesErrorHandler = qesErrorHandler;
        this.qesAgreementsErrorHandler = qesAgreementsErrorHandler;
    }

    @Override // com.fourthline.orca.internal.InterfaceC2931Re
    public /* bridge */ /* synthetic */ void handleRecoverableError(Throwable th2, String str, wn0.a aVar) {
        handleRecoverableError((Bo) th2, str, (wn0.a<h0>) aVar);
    }

    @Override // com.fourthline.orca.internal.InterfaceC2931Re
    public void handleError(Bo error, String source) {
        s.k(error, "error");
        s.k(source, "source");
        if (error instanceof ZD) {
            this.workerErrorHandler.handleError(error, source);
        } else if (error instanceof QesError) {
            this.qesErrorHandler.handleError(error, source);
        } else {
            if (!(error instanceof AbstractC3658ot)) {
                throw new IllegalStateException("FL Developer error. This handler does not expect any other error type");
            }
            this.qesAgreementsErrorHandler.handleError(error, source);
        }
    }

    public void handleRecoverableError(Bo error, String source, wn0.a<h0> onRetry) {
        s.k(error, "error");
        s.k(source, "source");
        s.k(onRetry, "onRetry");
        if (error instanceof ZD) {
            this.workerErrorHandler.handleRecoverableError(error, source, onRetry);
        } else if (error instanceof QesError) {
            this.qesErrorHandler.handleRecoverableError(error, source, onRetry);
        } else {
            if (!(error instanceof AbstractC3658ot)) {
                throw new IllegalStateException("FL Developer error. This handler does not expect any other error type");
            }
            this.qesAgreementsErrorHandler.handleRecoverableError(error, source, onRetry);
        }
    }
}
