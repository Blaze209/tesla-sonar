package ce;

import androidx.p003lifecycle.LifecycleOwner;
import com.adyen.checkout.components.core.ActionComponentData;
import com.adyen.checkout.core.exception.CheckoutException;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Ja\u0010\u0015\u001a\u00020\u00132\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, d2 = {"Lce/e;", "", "Lce/n;", "observerContainer", "<init>", "(Lce/n;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/adyen/checkout/components/core/ActionComponentData;", "detailsFlow", "Lcom/adyen/checkout/core/exception/CheckoutException;", "exceptionFlow", "Lce/s;", "permissionFlow", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Function1;", "Lce/b;", "Ljn0/h0;", "callback", "a", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Landroidx/lifecycle/LifecycleOwner;Lkotlinx/coroutines/CoroutineScope;Lwn0/l;)V", "b", "()V", "Lce/n;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n observerContainer;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/adyen/checkout/components/core/ActionComponentData;", "componentData", "Ljn0/h0;", "a", "(Lcom/adyen/checkout/components/core/ActionComponentData;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<ActionComponentData, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<ce.b, h0> f19072c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.l<? super ce.b, h0> lVar) {
            super(1);
            this.f19072c = lVar;
        }

        public final void a(ActionComponentData componentData) {
            p013kotlin.jvm.internal.s.k(componentData, "componentData");
            this.f19072c.invoke(new ce.b.a(componentData));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(ActionComponentData actionComponentData) {
            a(actionComponentData);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/adyen/checkout/core/exception/CheckoutException;", "exception", "Ljn0/h0;", "a", "(Lcom/adyen/checkout/core/exception/CheckoutException;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<CheckoutException, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<ce.b, h0> f19073c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(wn0.l<? super ce.b, h0> lVar) {
            super(1);
            this.f19073c = lVar;
        }

        public final void a(CheckoutException exception) {
            p013kotlin.jvm.internal.s.k(exception, "exception");
            this.f19073c.invoke(new ce.b.C0392b(new be.g(exception)));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(CheckoutException checkoutException) {
            a(checkoutException);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lce/s;", "requestData", "Ljn0/h0;", "a", "(Lce/s;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<PermissionRequestData, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<ce.b, h0> f19074c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(wn0.l<? super ce.b, h0> lVar) {
            super(1);
            this.f19074c = lVar;
        }

        public final void a(PermissionRequestData requestData) {
            p013kotlin.jvm.internal.s.k(requestData, "requestData");
            this.f19074c.invoke(new ce.b.c(requestData.getRequiredPermission(), requestData.getPermissionCallback()));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(PermissionRequestData permissionRequestData) {
            a(permissionRequestData);
            return h0.f84049a;
        }
    }

    public e(n observerContainer) {
        p013kotlin.jvm.internal.s.k(observerContainer, "observerContainer");
        this.observerContainer = observerContainer;
    }

    public final void a(Flow<ActionComponentData> detailsFlow, Flow<? extends CheckoutException> exceptionFlow, Flow<PermissionRequestData> permissionFlow, LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope, wn0.l<? super ce.b, h0> callback) {
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "lifecycleOwner");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        n nVar = this.observerContainer;
        nVar.b();
        if (detailsFlow != null) {
            nVar.a(detailsFlow, lifecycleOwner, coroutineScope, new a(callback));
        }
        if (exceptionFlow != null) {
            nVar.a(exceptionFlow, lifecycleOwner, coroutineScope, new b(callback));
        }
        if (permissionFlow != null) {
            nVar.a(permissionFlow, lifecycleOwner, coroutineScope, new c(callback));
        }
    }

    public final void b() {
        this.observerContainer.b();
    }

    public /* synthetic */ e(n nVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new n() : nVar);
    }
}
