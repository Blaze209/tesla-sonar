package com.fourthline.orca.qes.internal.error;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.orca.internal.EnumC3689ph;
import com.fourthline.orca.internal.InterfaceC3216ef;
import com.fourthline.orca.internal.InterfaceC3732qh;
import com.fourthline.orca.internal.InterfaceC3807sD;
import com.fourthline.orca.internal.InterfaceC4001ws;
import com.fourthline.orca.internal.QA;
import com.fourthline.sdk.R;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u000f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/QesErrorPopupStateBuilder;", "Lcom/fourthline/orca/internal/ef;", "Lcom/fourthline/orca/qes/internal/error/QesError;", "Lcom/fourthline/orca/internal/qh;", "imageServiceLocator", "<init>", "(Lcom/fourthline/orca/internal/qh;)V", AnalyticsAttribute.Error, "Lcom/fourthline/orca/internal/ws;", "buildStateFor", "(Lcom/fourthline/orca/qes/internal/error/QesError;)Lcom/fourthline/orca/internal/ws;", "exitErrorPopupState$delegate", "Lkotlin/Lazy;", "getExitErrorPopupState", "()Lcom/fourthline/orca/internal/ws;", "exitErrorPopupState", "tooManyAuthoriseAttemptPopupState$delegate", "getTooManyAuthoriseAttemptPopupState", "tooManyAuthoriseAttemptPopupState", "nonRecoverableErrorPopupState$delegate", "getNonRecoverableErrorPopupState", "nonRecoverableErrorPopupState", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QesErrorPopupStateBuilder implements InterfaceC3216ef {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: exitErrorPopupState$delegate, reason: from kotlin metadata */
    private final Lazy exitErrorPopupState;

    /* JADX INFO: renamed from: nonRecoverableErrorPopupState$delegate, reason: from kotlin metadata */
    private final Lazy nonRecoverableErrorPopupState;

    /* JADX INFO: renamed from: tooManyAuthoriseAttemptPopupState$delegate, reason: from kotlin metadata */
    private final Lazy tooManyAuthoriseAttemptPopupState;

    public QesErrorPopupStateBuilder(final InterfaceC3732qh imageServiceLocator) {
        s.k(imageServiceLocator, "imageServiceLocator");
        this.exitErrorPopupState = m.b(new wn0.a() { // from class: com.fourthline.orca.qes.internal.error.a
            @Override // wn0.a
            public final Object invoke() {
                return QesErrorPopupStateBuilder.exitErrorPopupState_delegate$lambda$0(imageServiceLocator);
            }
        });
        this.tooManyAuthoriseAttemptPopupState = m.b(new wn0.a() { // from class: com.fourthline.orca.qes.internal.error.b
            @Override // wn0.a
            public final Object invoke() {
                return QesErrorPopupStateBuilder.tooManyAuthoriseAttemptPopupState_delegate$lambda$1(imageServiceLocator);
            }
        });
        this.nonRecoverableErrorPopupState = m.b(new wn0.a() { // from class: com.fourthline.orca.qes.internal.error.c
            @Override // wn0.a
            public final Object invoke() {
                return QesErrorPopupStateBuilder.nonRecoverableErrorPopupState_delegate$lambda$2(imageServiceLocator);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e exitErrorPopupState_delegate$lambda$0(InterfaceC3732qh interfaceC3732qh) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(interfaceC3732qh.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_exit, 0, 2, null), new InterfaceC3807sD.g(QA.a.a(aVar, R.string.shared_button_exit_qes, 0, 2, null)), new InterfaceC3807sD.a(null, 1, null), true);
    }

    private final InterfaceC4001ws getExitErrorPopupState() {
        return (InterfaceC4001ws) this.exitErrorPopupState.getValue();
    }

    private final InterfaceC4001ws getNonRecoverableErrorPopupState() {
        return (InterfaceC4001ws) this.nonRecoverableErrorPopupState.getValue();
    }

    private final InterfaceC4001ws getTooManyAuthoriseAttemptPopupState() {
        return (InterfaceC4001ws) this.tooManyAuthoriseAttemptPopupState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e nonRecoverableErrorPopupState_delegate$lambda$2(InterfaceC3732qh interfaceC3732qh) {
        return new InterfaceC4001ws.e(interfaceC3732qh.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_unrecoverable_title, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), null, true, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e tooManyAuthoriseAttemptPopupState_delegate$lambda$1(InterfaceC3732qh interfaceC3732qh) {
        return new InterfaceC4001ws.e(interfaceC3732qh.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_too_many_attempts, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), null, true, 8, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3216ef
    public InterfaceC4001ws buildStateFor(QesError error) {
        s.k(error, "error");
        if (error instanceof QesError.Canceled) {
            return getExitErrorPopupState();
        }
        if ((error instanceof QesError.KycRequired) || (error instanceof QesError.Rejected) || (error instanceof QesError.TooManyResendOtpAttempts) || (error instanceof QesError.Unexpected)) {
            return getNonRecoverableErrorPopupState();
        }
        if (error instanceof QesError.TooManyAuthorizationAttempts) {
            return getTooManyAuthoriseAttemptPopupState();
        }
        throw new NoWhenBranchMatchedException();
    }
}
