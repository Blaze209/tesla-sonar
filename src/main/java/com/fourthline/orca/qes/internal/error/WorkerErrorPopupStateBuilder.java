package com.fourthline.orca.qes.internal.error;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.orca.internal.EnumC3689ph;
import com.fourthline.orca.internal.InterfaceC3216ef;
import com.fourthline.orca.internal.InterfaceC3732qh;
import com.fourthline.orca.internal.InterfaceC3807sD;
import com.fourthline.orca.internal.InterfaceC4001ws;
import com.fourthline.orca.internal.QA;
import com.fourthline.orca.internal.ZD;
import com.fourthline.sdk.R;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u000f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/fourthline/orca/qes/internal/error/WorkerErrorPopupStateBuilder;", "Lcom/fourthline/orca/internal/ef;", "Lcom/fourthline/orca/internal/ZD;", "Lcom/fourthline/orca/internal/qh;", "imageServiceLocator", "<init>", "(Lcom/fourthline/orca/internal/qh;)V", AnalyticsAttribute.Error, "Lcom/fourthline/orca/internal/ws;", "buildStateFor", "(Lcom/fourthline/orca/internal/ZD;)Lcom/fourthline/orca/internal/ws;", "connectionLostErrorPopupState$delegate", "Lkotlin/Lazy;", "getConnectionLostErrorPopupState", "()Lcom/fourthline/orca/internal/ws;", "connectionLostErrorPopupState", "recoverableErrorPopupState$delegate", "getRecoverableErrorPopupState", "recoverableErrorPopupState", "fatalErrorPopupState$delegate", "getFatalErrorPopupState", "fatalErrorPopupState", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorkerErrorPopupStateBuilder implements InterfaceC3216ef {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: connectionLostErrorPopupState$delegate, reason: from kotlin metadata */
    private final Lazy connectionLostErrorPopupState;

    /* JADX INFO: renamed from: fatalErrorPopupState$delegate, reason: from kotlin metadata */
    private final Lazy fatalErrorPopupState;

    /* JADX INFO: renamed from: recoverableErrorPopupState$delegate, reason: from kotlin metadata */
    private final Lazy recoverableErrorPopupState;

    public WorkerErrorPopupStateBuilder(final InterfaceC3732qh imageServiceLocator) {
        s.k(imageServiceLocator, "imageServiceLocator");
        this.connectionLostErrorPopupState = m.b(new wn0.a() { // from class: com.fourthline.orca.qes.internal.error.d
            @Override // wn0.a
            public final Object invoke() {
                return WorkerErrorPopupStateBuilder.connectionLostErrorPopupState_delegate$lambda$0(imageServiceLocator);
            }
        });
        this.recoverableErrorPopupState = m.b(new wn0.a() { // from class: com.fourthline.orca.qes.internal.error.e
            @Override // wn0.a
            public final Object invoke() {
                return WorkerErrorPopupStateBuilder.recoverableErrorPopupState_delegate$lambda$1(imageServiceLocator);
            }
        });
        this.fatalErrorPopupState = m.b(new wn0.a() { // from class: com.fourthline.orca.qes.internal.error.f
            @Override // wn0.a
            public final Object invoke() {
                return WorkerErrorPopupStateBuilder.fatalErrorPopupState_delegate$lambda$2(imageServiceLocator);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e connectionLostErrorPopupState_delegate$lambda$0(InterfaceC3732qh interfaceC3732qh) {
        return new InterfaceC4001ws.e(interfaceC3732qh.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_offline, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.g(null, 1, null), false, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e fatalErrorPopupState_delegate$lambda$2(InterfaceC3732qh interfaceC3732qh) {
        return new InterfaceC4001ws.e(interfaceC3732qh.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_unrecoverable_title, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), null, false, 24, null);
    }

    private final InterfaceC4001ws getConnectionLostErrorPopupState() {
        return (InterfaceC4001ws) this.connectionLostErrorPopupState.getValue();
    }

    private final InterfaceC4001ws getFatalErrorPopupState() {
        return (InterfaceC4001ws) this.fatalErrorPopupState.getValue();
    }

    private final InterfaceC4001ws getRecoverableErrorPopupState() {
        return (InterfaceC4001ws) this.recoverableErrorPopupState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e recoverableErrorPopupState_delegate$lambda$1(InterfaceC3732qh interfaceC3732qh) {
        return new InterfaceC4001ws.e(interfaceC3732qh.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_generic_error_title, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.g(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3216ef
    public InterfaceC4001ws buildStateFor(ZD error) {
        s.k(error, "error");
        if (error instanceof ZD.a) {
            return getConnectionLostErrorPopupState();
        }
        if (error instanceof ZD.c) {
            return getRecoverableErrorPopupState();
        }
        if (error instanceof ZD.b) {
            return getFatalErrorPopupState();
        }
        throw new NoWhenBranchMatchedException();
    }
}
