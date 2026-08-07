package gd;

import android.app.Application;
import androidx.p003lifecycle.s0;
import be.d;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.action.AwaitAction;
import com.adyen.checkout.components.core.action.BaseThreeds2Action;
import com.adyen.checkout.components.core.action.QrCodeAction;
import com.adyen.checkout.components.core.action.RedirectAction;
import com.adyen.checkout.components.core.action.SdkAction;
import com.adyen.checkout.components.core.action.VoucherAction;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.internal.util.LocaleProvider;
import com.adyen.checkout.twint.action.internal.provider.TwintActionComponentProvider;
import com.adyen.checkout.wechatpay.internal.provider.WeChatPayActionComponentProvider;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019¨\u0006\u001a"}, d2 = {"Lgd/a;", "", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "localeProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lcom/adyen/checkout/core/internal/util/LocaleProvider;)V", "Lcom/adyen/checkout/components/core/action/Action;", "action", "Lie/a;", "b", "(Lcom/adyen/checkout/components/core/action/Action;)Lie/a;", "Lbe/d;", "checkoutConfiguration", "Landroidx/lifecycle/s0;", "savedStateHandle", "Landroid/app/Application;", Kind.APPLICATION, "Lje/a;", "a", "(Lcom/adyen/checkout/components/core/action/Action;Lbe/d;Landroidx/lifecycle/s0;Landroid/app/Application;)Lje/a;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AnalyticsManager analyticsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LocaleProvider localeProvider;

    public a(AnalyticsManager analyticsManager, DropInOverrideParams dropInOverrideParams, LocaleProvider localeProvider) {
        s.k(localeProvider, "localeProvider");
        this.analyticsManager = analyticsManager;
        this.localeProvider = localeProvider;
    }

    private final ie.a<?, ?, ?> b(Action action) {
        String paymentMethodType = action.getPaymentMethodType();
        if (s.f(paymentMethodType, "twint")) {
            return new TwintActionComponentProvider<>(this.analyticsManager, (DropInOverrideParams) null, this.localeProvider);
        }
        if (s.f(paymentMethodType, "wechatpaySDK")) {
            return new WeChatPayActionComponentProvider<>(this.analyticsManager, (DropInOverrideParams) null, this.localeProvider);
        }
        throw new CheckoutException("Can't find delegate for action: " + action.getType() + " and type: " + action.getPaymentMethodType(), null, 2, null);
    }

    public final je.a a(Action action, d checkoutConfiguration, s0 savedStateHandle, Application application) {
        ie.a<?, ?, ?> aVarB;
        s.k(action, "action");
        s.k(checkoutConfiguration, "checkoutConfiguration");
        s.k(savedStateHandle, "savedStateHandle");
        s.k(application, "application");
        if (action instanceof AwaitAction) {
            aVarB = new qd.a(this.analyticsManager, null, this.localeProvider);
        } else if (action instanceof QrCodeAction) {
            aVarB = new ye.a(this.analyticsManager, null, this.localeProvider);
        } else if (action instanceof RedirectAction) {
            aVarB = new ef.a(this.analyticsManager, null, this.localeProvider);
        } else if (action instanceof BaseThreeds2Action) {
            aVarB = new ld.a(this.analyticsManager, null, this.localeProvider);
        } else if (action instanceof VoucherAction) {
            aVarB = new qf.a(this.analyticsManager, null, this.localeProvider);
        } else {
            if (!(action instanceof SdkAction)) {
                throw new CheckoutException("Can't find delegate for action: " + action.getType(), null, 2, null);
            }
            aVarB = b(action);
        }
        return aVarB.b(checkoutConfiguration, savedStateHandle, application);
    }

    public /* synthetic */ a(AnalyticsManager analyticsManager, DropInOverrideParams dropInOverrideParams, LocaleProvider localeProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(analyticsManager, dropInOverrideParams, (i11 & 4) != 0 ? new LocaleProvider() : localeProvider);
    }
}
