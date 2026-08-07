package be;

import com.adyen.checkout.components.core.ActionComponentData;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lbe/a;", "", "Lcom/adyen/checkout/components/core/ActionComponentData;", "actionComponentData", "Ljn0/h0;", "a", "(Lcom/adyen/checkout/components/core/ActionComponentData;)V", "Lbe/g;", "componentError", "b", "(Lbe/g;)V", "", "requiredPermission", "Lme/d;", "permissionCallback", "c", "(Ljava/lang/String;Lme/d;)V", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {
    void a(ActionComponentData actionComponentData);

    void b(g componentError);

    void c(String requiredPermission, me.d permissionCallback);
}
