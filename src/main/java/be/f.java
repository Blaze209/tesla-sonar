package be;

import be.h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.ActionComponentData;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0007J\u001f\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lbe/f;", "Lbe/h;", "T", "Lce/f;", "state", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lbe/h;)V", "Lcom/adyen/checkout/components/core/ActionComponentData;", "actionComponentData", "a", "(Lcom/adyen/checkout/components/core/ActionComponentData;)V", "Lbe/g;", "componentError", "b", "(Lbe/g;)V", "e", "", "requiredPermission", "Lme/d;", "permissionCallback", "c", "(Ljava/lang/String;Lme/d;)V", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface f<T extends h<?>> extends ce.f {
    void a(ActionComponentData actionComponentData);

    void b(g componentError);

    void c(String requiredPermission, me.d permissionCallback);

    void d(T state);

    void e(T state);
}
