package ie;

import android.app.Application;
import androidx.p002activity.ComponentActivity;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.s0;
import ce.a;
import ce.k;
import ch.qos.logback.core.joran.action.Action;
import ezvcard.property.Kind;
import je.a;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import xa.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\b\u0012\u0004\u0012\u00028\u00000\u0007J'\u0010\u000e\u001a\u00028\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JK\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lie/a;", "Lce/a;", "ComponentT", "Lce/k;", "ConfigurationT", "Lje/a;", "DelegateT", "", "Lbe/d;", "checkoutConfiguration", "Landroidx/lifecycle/s0;", "savedStateHandle", "Landroid/app/Application;", Kind.APPLICATION, "b", "(Lbe/d;Landroidx/lifecycle/s0;Landroid/app/Application;)Lje/a;", "Landroidx/activity/ComponentActivity;", "activity", "configuration", "Lbe/a;", "callback", "", Action.KEY_ATTRIBUTE, "c", "(Landroidx/activity/ComponentActivity;Lce/k;Lbe/a;Ljava/lang/String;)Lce/a;", "Lxa/d;", "savedStateRegistryOwner", "Landroidx/lifecycle/f1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "a", "(Lxa/d;Landroidx/lifecycle/f1;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lce/k;Lbe/a;Ljava/lang/String;)Lce/a;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a<ComponentT extends ce.a, ConfigurationT extends k, DelegateT extends je.a> {

    /* JADX INFO: renamed from: ie.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C1635a {
        public static <ComponentT extends ce.a, ConfigurationT extends k, DelegateT extends je.a> ComponentT a(a<ComponentT, ConfigurationT, DelegateT> aVar, ComponentActivity activity, ConfigurationT configuration, be.a callback, String str) {
            s.k(activity, "activity");
            s.k(configuration, "configuration");
            s.k(callback, "callback");
            Application application = activity.getApplication();
            s.j(application, "getApplication(...)");
            return (ComponentT) aVar.a(activity, activity, activity, application, configuration, callback, str);
        }
    }

    ComponentT a(d savedStateRegistryOwner, f1 viewModelStoreOwner, LifecycleOwner lifecycleOwner, Application application, ConfigurationT configuration, be.a callback, String key);

    DelegateT b(be.d checkoutConfiguration, s0 savedStateHandle, Application application);

    ComponentT c(ComponentActivity activity, ConfigurationT configuration, be.a callback, String key);
}
