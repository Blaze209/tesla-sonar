package com.teslamotors.plugins.widget;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.teslamotors.plugins.widget.OemWidgetCardProvider;
import ie0.e0;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.m;
import oe0.e;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000eH'¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/teslamotors/plugins/widget/OemWidgetCardProvider;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isSupported", "(Landroid/content/Context;)Z", "Lqe0/a;", "dependency", "Loe0/e;", "repository", "Ljn0/h0;", "init", "(Landroid/content/Context;Lqe0/a;Loe0/e;)V", "Lkotlin/Function1;", "resultListener", "authorize", "(Landroid/content/Context;Lwn0/l;)V", "unauthorize", "isAuthorized", "", "getBrandName", "()Ljava/lang/String;", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "handleIntentIfNeeded", "(Landroid/content/Context;Landroid/content/Intent;)V", "getVendor", "vendor", "Companion", "a", "tesla-oem-widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OemWidgetCardProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f57052a;

    /* JADX INFO: renamed from: com.teslamotors.plugins.widget.OemWidgetCardProvider$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/teslamotors/plugins/widget/OemWidgetCardProvider$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lqe0/a;", "widgetDependencies", "Loe0/e;", "vehicleRepository", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Lqe0/a;Loe0/e;)V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "c", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "getLogger$tesla_oem_widget_globalPlayRelease", "()Lcom/tesla/logging/g;", "logger", "", "Lcom/teslamotors/plugins/widget/OemWidgetCardProvider;", "Lkotlin/Lazy;", "()Ljava/util/List;", "instance", "tesla-oem-widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f57052a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final g logger = g.INSTANCE.a("OemWidgetCardProvider");

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final Lazy<List<OemWidgetCardProvider>> instance = m.b(new wn0.a() { // from class: pf0.a
            @Override // wn0.a
            public final Object invoke() {
                return OemWidgetCardProvider.Companion.e();
            }
        });

        private Companion() {
        }

        private final List<OemWidgetCardProvider> b() {
            return instance.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List e() {
            List list = null;
            try {
                OemWidgetCardInjector oemWidgetCardInjector = OemWidgetCardInjector.INSTANCE;
                Object objInvoke = OemWidgetCardInjector.class.getDeclaredMethod("inject", null).invoke(OemWidgetCardInjector.class.getDeclaredField("INSTANCE").get(null), null);
                if (!(objInvoke instanceof List)) {
                    objInvoke = null;
                }
                list = (List) objInvoke;
            } catch (Exception e11) {
                TeslaLog.INSTANCE.e("ReflectionHelper", "can not invoke static method# inject on class# com.teslamotors.plugins.widget.OemWidgetCardInjector", e11);
            }
            return list == null ? v.m() : list;
        }

        public final void c(Context context, Intent intent) {
            Object next;
            s.k(context, "context");
            s.k(intent, "intent");
            if (e0.g(context)) {
                Iterator<T> it = b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((OemWidgetCardProvider) next).isSupported(context));
                OemWidgetCardProvider oemWidgetCardProvider = (OemWidgetCardProvider) next;
                if (oemWidgetCardProvider != null) {
                    oemWidgetCardProvider.handleIntentIfNeeded(context, intent);
                }
            }
        }

        public final void d(Context context, qe0.a widgetDependencies, e vehicleRepository) {
            s.k(context, "context");
            s.k(widgetDependencies, "widgetDependencies");
            s.k(vehicleRepository, "vehicleRepository");
            if (e0.g(context)) {
                logger.j("init widget providers");
                Iterator<T> it = b().iterator();
                while (it.hasNext()) {
                    ((OemWidgetCardProvider) it.next()).init(context, widgetDependencies, vehicleRepository);
                }
            }
        }
    }

    void authorize(Context context, l<? super Boolean, h0> resultListener);

    String getBrandName();

    String getVendor();

    void handleIntentIfNeeded(Context context, Intent intent);

    void init(Context context, qe0.a dependency, e repository);

    boolean isAuthorized(Context context);

    boolean isSupported(Context context);

    void unauthorize(Context context, l<? super Boolean, h0> resultListener);
}
