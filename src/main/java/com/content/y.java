package com.content;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import b70.a;
import b70.f;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.bankaccount.navigation.d;
import j40.FinancialConnectionsEvent;
import j40.j;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import s10.e;
import s10.g;
import s10.i;
import wn0.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 32\u00020\u0001:\u00014BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/reactnativestripesdk/y;", "Landroidx/fragment/app/Fragment;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "publishableKey", "stripeAccountId", "clientSecret", "", "isPaymentIntent", "Lb70/a$b;", "collectParams", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLb70/a$b;Lcom/facebook/react/bridge/Promise;)V", "Lb70/f;", IntegerTokenConverter.CONVERTER_KEY, "()Lb70/f;", "Landroid/os/Bundle;", "savedInstanceState", "Ljn0/h0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "()V", "m", "Lcom/facebook/react/bridge/ReactApplicationContext;", "n", "Ljava/lang/String;", "o", "p", "q", "Z", "r", "Lb70/a$b;", "s", "Lcom/facebook/react/bridge/Promise;", "t", "Lb70/f;", "collectBankAccountLauncher", "u", "a", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y extends Fragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext context;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String publishableKey;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final String stripeAccountId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final String clientSecret;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final boolean isPaymentIntent;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final a.USBankAccount collectParams;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Promise promise;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private f collectBankAccountLauncher;

    public y(ReactApplicationContext context, String publishableKey, String str, String clientSecret, boolean z11, a.USBankAccount collectParams, Promise promise) {
        s.k(context, "context");
        s.k(publishableKey, "publishableKey");
        s.k(clientSecret, "clientSecret");
        s.k(collectParams, "collectParams");
        s.k(promise, "promise");
        this.context = context;
        this.publishableKey = publishableKey;
        this.stripeAccountId = str;
        this.clientSecret = clientSecret;
        this.isPaymentIntent = z11;
        this.collectParams = collectParams;
        this.promise = promise;
    }

    private final f i() {
        return f.INSTANCE.b(this, new l() { // from class: com.reactnativestripesdk.x
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return y.j(this.f48937a, (d) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 j(y yVar, d result) {
        WritableMap writableMapD;
        s.k(result, "result");
        if (result instanceof d.Completed) {
            StripeIntent intent = ((d.Completed) result).getResponse().getIntent();
            if (intent.getStatus() == StripeIntent.Status.RequiresPaymentMethod) {
                yVar.promise.resolve(e.d(s10.d.Canceled.toString(), "Bank account collection was canceled."));
            } else if (intent.getStatus() == StripeIntent.Status.RequiresConfirmation) {
                Promise promise = yVar.promise;
                if (yVar.isPaymentIntent) {
                    s.i(intent, "null cannot be cast to non-null type com.stripe.android.model.PaymentIntent");
                    writableMapD = i.d("paymentIntent", i.v((PaymentIntent) intent));
                } else {
                    s.i(intent, "null cannot be cast to non-null type com.stripe.android.model.SetupIntent");
                    writableMapD = i.d("setupIntent", i.y((SetupIntent) intent));
                }
                promise.resolve(writableMapD);
            }
        } else if (result instanceof d.a) {
            yVar.promise.resolve(e.d(s10.d.Canceled.toString(), "Bank account collection was canceled."));
        } else {
            if (!(result instanceof d.Failed)) {
                throw new NoWhenBranchMatchedException();
            }
            yVar.promise.resolve(e.e(s10.d.Failed.toString(), ((d.Failed) result).getError()));
        }
        g.d(yVar, yVar.context);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(StripeSdkModule stripeSdkModule, y yVar, FinancialConnectionsEvent event) {
        s.k(event, "event");
        stripeSdkModule.sendEvent$stripe_stripe_react_native_release(yVar.context, "onFinancialConnectionsEvent", i.s(event));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final StripeSdkModule stripeSdkModule = (StripeSdkModule) this.context.getNativeModule(StripeSdkModule.class);
        if (stripeSdkModule == null || stripeSdkModule.getEventListenerCount() <= 0) {
            return;
        }
        i40.a.d(new j() { // from class: com.reactnativestripesdk.w
            @Override // j40.j
            public final void a(FinancialConnectionsEvent financialConnectionsEvent) {
                y.k(stripeSdkModule, this, financialConnectionsEvent);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        s.k(inflater, "inflater");
        this.collectBankAccountLauncher = i();
        FrameLayout frameLayout = new FrameLayout(requireActivity());
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        i40.a.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.k(view, "view");
        super.onViewCreated(view, savedInstanceState);
        f fVar = null;
        if (this.isPaymentIntent) {
            f fVar2 = this.collectBankAccountLauncher;
            if (fVar2 == null) {
                s.B("collectBankAccountLauncher");
            } else {
                fVar = fVar2;
            }
            fVar.d(this.publishableKey, this.stripeAccountId, this.clientSecret, this.collectParams);
            return;
        }
        f fVar3 = this.collectBankAccountLauncher;
        if (fVar3 == null) {
            s.B("collectBankAccountLauncher");
        } else {
            fVar = fVar3;
        }
        fVar.b(this.publishableKey, this.stripeAccountId, this.clientSecret, this.collectParams);
    }
}
