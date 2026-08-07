package ie;

import android.app.Application;
import androidx.p002activity.ComponentActivity;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.f1;
import be.f;
import be.h;
import ce.k;
import ce.o;
import ch.qos.logback.core.joran.action.Action;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentMethod;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import xa.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\f\b\u0002\u0010\u0006*\u0006\u0012\u0002\b\u00030\u0005*\u000e\b\u0003\u0010\b*\b\u0012\u0004\u0012\u00028\u00020\u00072\b\u0012\u0004\u0012\u00028\u00000\tJa\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00028\u00032\u000e\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H&¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lie/b;", "Lce/o;", "ComponentT", "Lce/k;", "ConfigurationT", "Lbe/h;", "ComponentStateT", "Lbe/f;", "ComponentCallbackT", "", "Lxa/d;", "savedStateRegistryOwner", "Landroidx/lifecycle/f1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/adyen/checkout/components/core/PaymentMethod;", "paymentMethod", "configuration", "Landroid/app/Application;", Kind.APPLICATION, "componentCallback", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/Order;", "order", "", Action.KEY_ATTRIBUTE, "a", "(Lxa/d;Landroidx/lifecycle/f1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/PaymentMethod;Lce/k;Landroid/app/Application;Lbe/f;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lce/o;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface b<ComponentT extends o, ConfigurationT extends k, ComponentStateT extends h<?>, ComponentCallbackT extends f<ComponentStateT>> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static <ComponentT extends o, ConfigurationT extends k, ComponentStateT extends h<?>, ComponentCallbackT extends f<ComponentStateT>> ComponentT a(b<ComponentT, ConfigurationT, ComponentStateT, ComponentCallbackT> bVar, ComponentActivity activity, PaymentMethod paymentMethod, ConfigurationT configuration, ComponentCallbackT callback, OrderRequest orderRequest, String str) {
            s.k(activity, "activity");
            s.k(paymentMethod, "paymentMethod");
            s.k(configuration, "configuration");
            s.k(callback, "callback");
            Application application = activity.getApplication();
            s.j(application, "getApplication(...)");
            return (ComponentT) bVar.a(activity, activity, activity, paymentMethod, configuration, application, callback, orderRequest, str);
        }
    }

    ComponentT a(d savedStateRegistryOwner, f1 viewModelStoreOwner, LifecycleOwner lifecycleOwner, PaymentMethod paymentMethod, ConfigurationT configuration, Application application, ComponentCallbackT componentCallback, OrderRequest order, String key);
}
