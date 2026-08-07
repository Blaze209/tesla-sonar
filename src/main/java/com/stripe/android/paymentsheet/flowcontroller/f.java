package com.stripe.android.paymentsheet.flowcontroller;

import android.app.Application;
import androidx.p003lifecycle.s0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Kind;
import g30.g;
import g80.Full;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import w70.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 02\u00020\u0001:\u00011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010/\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/f;", "Landroidx/lifecycle/b;", "Landroid/app/Application;", Kind.APPLICATION, "Landroidx/lifecycle/s0;", "handle", "<init>", "(Landroid/app/Application;Landroidx/lifecycle/s0;)V", "Ljn0/h0;", "l", "()V", "t", "Landroidx/lifecycle/s0;", "h", "()Landroidx/lifecycle/s0;", "Lcom/stripe/android/paymentsheet/flowcontroller/e;", "u", "Lcom/stripe/android/paymentsheet/flowcontroller/e;", "g", "()Lcom/stripe/android/paymentsheet/flowcontroller/e;", "flowControllerStateComponent", "Lw70/j;", "v", "Lw70/j;", IntegerTokenConverter.CONVERTER_KEY, "()Lw70/j;", "m", "(Lw70/j;)V", "paymentSelection", "Lcom/stripe/android/paymentsheet/flowcontroller/c$a;", "w", "Lcom/stripe/android/paymentsheet/flowcontroller/c$a;", "j", "()Lcom/stripe/android/paymentsheet/flowcontroller/c$a;", "n", "(Lcom/stripe/android/paymentsheet/flowcontroller/c$a;)V", "previousConfigureRequest", "Lkotlin/Function0;", "x", "Lwn0/a;", "restartSession", "Lg80/l;", "value", "k", "()Lg80/l;", "o", "(Lg80/l;)V", "state", "y", "a", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f extends androidx.p003lifecycle.b {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final a f53039y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f53040z = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final s0 handle;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final e flowControllerStateComponent;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private volatile j paymentSelection;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private volatile c.ConfigureRequest previousConfigureRequest;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> restartSession;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/f$a;", "", "<init>", "()V", "", "STATE_KEY", "Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Application application, s0 handle) {
        super(application);
        s.k(application, "application");
        s.k(handle, "handle");
        this.handle = handle;
        this.flowControllerStateComponent = com.stripe.android.paymentsheet.flowcontroller.a.a().a(application).b(this).build();
        this.restartSession = g.f67187a.c(this, handle);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final e getFlowControllerStateComponent() {
        return this.flowControllerStateComponent;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final s0 getHandle() {
        return this.handle;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final j getPaymentSelection() {
        return this.paymentSelection;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final c.ConfigureRequest getPreviousConfigureRequest() {
        return this.previousConfigureRequest;
    }

    public final Full k() {
        return (Full) this.handle.f("state");
    }

    public final void l() {
        this.restartSession.invoke();
    }

    public final void m(j jVar) {
        this.paymentSelection = jVar;
    }

    public final void n(c.ConfigureRequest aVar) {
        this.previousConfigureRequest = aVar;
    }

    public final void o(Full lVar) {
        this.handle.n("state", lVar);
    }
}
