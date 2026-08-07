package com.stripe.android.networking;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.action.Action;
import com.stripe.android.model.Token;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import e40.b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import jn0.x;
import org.webrtc.WebrtcBuildVersion;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w30.AnalyticsRequest;
import w30.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 =2\u00020\u0001:\u0002>?BS\b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u000eB)\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u0012B\u001f\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\r\u0010\u0013B1\b\u0011\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\r\u0010\u0015JY\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u001d2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 J3\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001d2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b!\u0010\"J!\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\u00020&2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b)\u0010*J)\u0010-\u001a\u00020&2\n\u0010,\u001a\u00060\u0006j\u0002`+2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0000¢\u0006\u0004\b-\u0010.J-\u0010/\u001a\u00020&2\u000e\u0010,\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`+2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0000¢\u0006\u0004\b/\u0010.J\u001d\u00100\u001a\u00020&2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0000¢\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u00020&2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0000¢\u0006\u0004\b2\u00101J%\u00104\u001a\u00020&2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b4\u00105J#\u00106\u001a\u00020&2\b\u00103\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b6\u00105JW\u00107\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b7\u00108R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lw30/e;", "Landroid/content/pm/PackageManager;", "packageManager", "Landroid/content/pm/PackageInfo;", "packageInfo", "", "packageName", "Ljavax/inject/Provider;", "publishableKeyProvider", "networkTypeProvider", "", "defaultProductUsageTokens", "<init>", "(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljava/util/Set;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "publishableKey", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;)V", "(Landroid/content/Context;Ljavax/inject/Provider;)V", "Lkotlin/Function0;", "(Landroid/content/Context;Lwn0/a;Ljava/util/Set;)V", "productUsageTokens", "sourceType", "Lcom/stripe/android/model/p1$c;", "tokenType", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "threeDS2UiType", "errorMessage", "", "", "o", "(Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/p1$c;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;)Ljava/util/Map;", "z", "(Ljava/lang/String;Lcom/stripe/android/model/p1$c;)Ljava/util/Map;", "Lcom/stripe/android/networking/PaymentAnalyticsEvent;", "event", "uiTypeCode", "Lw30/b;", "p", "(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/lang/String;)Lw30/b;", "y", "(Ljava/util/Set;Lcom/stripe/android/model/p1$c;)Lw30/b;", "Lcom/stripe/android/model/PaymentMethodCode;", "paymentMethodCode", "t", "(Ljava/lang/String;Ljava/util/Set;)Lw30/b;", "u", "q", "(Ljava/util/Set;)Lw30/b;", "r", Action.PAYMENT_METHOD_TYPE, "s", "(Ljava/lang/String;Ljava/lang/String;)Lw30/b;", "x", "v", "(Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/model/p1$c;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;)Lw30/b;", "k", "Ljava/util/Set;", "A", "()Ljava/util/Set;", "l", "b", "ThreeDS2UiType", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaymentAnalyticsRequestFactory extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f51756m = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Set<String> defaultProductUsageTokens;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "", "", "code", "typeName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "a", "None", "Text", "SingleSelect", "MultiSelect", "Oob", "Html", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum ThreeDS2UiType {
        None(null, "none"),
        Text("01", "text"),
        SingleSelect("02", "single_select"),
        MultiSelect("03", "multi_select"),
        Oob(WebrtcBuildVersion.webrtc_commit, "oob"),
        Html("05", "html");

        private final String code;
        private final String typeName;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.stripe.android.networking.PaymentAnalyticsRequestFactory$ThreeDS2UiType$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType$a;", "", "<init>", "()V", "", "uiTypeCode", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "a", "(Ljava/lang/String;)Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ThreeDS2UiType a(String uiTypeCode) {
                ThreeDS2UiType next;
                Iterator<ThreeDS2UiType> it = ThreeDS2UiType.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!s.f(next.code, uiTypeCode));
                ThreeDS2UiType threeDS2UiType = next;
                return threeDS2UiType == null ? ThreeDS2UiType.None : threeDS2UiType;
            }

            private Companion() {
            }
        }

        ThreeDS2UiType(String str, String str2) {
            this.code = str;
            this.typeName = str2;
        }

        public static EnumEntries<ThreeDS2UiType> getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.typeName;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f51758c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f51758c = str;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f51758c;
        }
    }

    public /* synthetic */ PaymentAnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String str, Provider provider, Provider provider2, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(packageManager, packageInfo, str, provider, provider2, (i11 & 32) != 0 ? d1.d() : set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n(wn0.a tmp0) {
        s.k(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    private final Map<String, Object> o(Set<String> productUsageTokens, String sourceType, Token.c tokenType, ThreeDS2UiType threeDS2UiType, String errorMessage) {
        Set setN = d1.n(this.defaultProductUsageTokens, productUsageTokens);
        if (setN.isEmpty()) {
            setN = null;
        }
        Map mapF = setN != null ? v0.f(x.a("product_usage", v.m1(setN))) : null;
        if (mapF == null) {
            mapF = v0.i();
        }
        Map mapF2 = sourceType != null ? v0.f(x.a("source_type", sourceType)) : null;
        if (mapF2 == null) {
            mapF2 = v0.i();
        }
        Map mapR = v0.r(v0.r(mapF, mapF2), z(sourceType, tokenType));
        Map mapF3 = threeDS2UiType != null ? v0.f(x.a("3ds2_ui_type", threeDS2UiType.toString())) : null;
        if (mapF3 == null) {
            mapF3 = v0.i();
        }
        Map mapR2 = v0.r(mapR, mapF3);
        Map mapF4 = errorMessage != null ? v0.f(x.a("error_message", errorMessage)) : null;
        if (mapF4 == null) {
            mapF4 = v0.i();
        }
        return v0.r(mapR2, mapF4);
    }

    public static /* synthetic */ AnalyticsRequest w(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, PaymentAnalyticsEvent paymentAnalyticsEvent, Set set, String str, Token.c cVar, ThreeDS2UiType threeDS2UiType, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            set = d1.d();
        }
        return paymentAnalyticsRequestFactory.v(paymentAnalyticsEvent, set, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : cVar, (i11 & 16) != 0 ? null : threeDS2UiType, (i11 & 32) != 0 ? null : str2);
    }

    private final Map<String, String> z(String sourceType, Token.c tokenType) {
        String code;
        if (tokenType != null) {
            code = tokenType.getCode();
        } else {
            code = sourceType == null ? "unknown" : null;
        }
        Map<String, String> mapF = code != null ? v0.f(x.a("token_type", code)) : null;
        return mapF == null ? v0.i() : mapF;
    }

    public final Set<String> A() {
        return this.defaultProductUsageTokens;
    }

    public final /* synthetic */ AnalyticsRequest p(PaymentAnalyticsEvent event, String uiTypeCode) {
        s.k(event, "event");
        return w(this, event, null, null, null, ThreeDS2UiType.INSTANCE.a(uiTypeCode), null, 46, null);
    }

    public final /* synthetic */ AnalyticsRequest q(Set productUsageTokens) {
        s.k(productUsageTokens, "productUsageTokens");
        return w(this, PaymentAnalyticsEvent.CustomerAttachPaymentMethod, productUsageTokens, null, null, null, null, 60, null);
    }

    public final /* synthetic */ AnalyticsRequest r(Set productUsageTokens) {
        s.k(productUsageTokens, "productUsageTokens");
        return w(this, PaymentAnalyticsEvent.CustomerDetachPaymentMethod, productUsageTokens, null, null, null, null, 60, null);
    }

    public final /* synthetic */ AnalyticsRequest s(String paymentMethodType, String errorMessage) {
        return w(this, PaymentAnalyticsEvent.PaymentIntentConfirm, null, paymentMethodType, null, null, errorMessage, 26, null);
    }

    public final /* synthetic */ AnalyticsRequest t(String paymentMethodCode, Set productUsageTokens) {
        s.k(paymentMethodCode, "paymentMethodCode");
        s.k(productUsageTokens, "productUsageTokens");
        return w(this, PaymentAnalyticsEvent.PaymentMethodCreate, productUsageTokens, paymentMethodCode, null, null, null, 56, null);
    }

    public final /* synthetic */ AnalyticsRequest u(String paymentMethodCode, Set productUsageTokens) {
        s.k(productUsageTokens, "productUsageTokens");
        return w(this, PaymentAnalyticsEvent.PaymentMethodUpdate, productUsageTokens, paymentMethodCode, null, null, null, 56, null);
    }

    public final /* synthetic */ AnalyticsRequest v(PaymentAnalyticsEvent event, Set productUsageTokens, String sourceType, Token.c tokenType, ThreeDS2UiType threeDS2UiType, String errorMessage) {
        s.k(event, "event");
        s.k(productUsageTokens, "productUsageTokens");
        return g(event, o(productUsageTokens, sourceType, tokenType, threeDS2UiType, errorMessage));
    }

    public final /* synthetic */ AnalyticsRequest x(String paymentMethodType, String errorMessage) {
        return w(this, PaymentAnalyticsEvent.SetupIntentConfirm, null, paymentMethodType, null, null, errorMessage, 26, null);
    }

    public final /* synthetic */ AnalyticsRequest y(Set productUsageTokens, Token.c tokenType) {
        s.k(productUsageTokens, "productUsageTokens");
        s.k(tokenType, "tokenType");
        return w(this, PaymentAnalyticsEvent.TokenCreate, productUsageTokens, null, tokenType, null, null, 52, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String packageName, Provider<String> publishableKeyProvider, Provider<String> networkTypeProvider, Set<String> defaultProductUsageTokens) {
        super(packageManager, packageInfo, packageName, publishableKeyProvider, networkTypeProvider, null, 32, null);
        s.k(packageName, "packageName");
        s.k(publishableKeyProvider, "publishableKeyProvider");
        s.k(networkTypeProvider, "networkTypeProvider");
        s.k(defaultProductUsageTokens, "defaultProductUsageTokens");
        this.defaultProductUsageTokens = defaultProductUsageTokens;
    }

    public /* synthetic */ PaymentAnalyticsRequestFactory(Context context, String str, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (Set<String>) ((i11 & 4) != 0 ? d1.d() : set));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentAnalyticsRequestFactory(Context context, String publishableKey, Set<String> defaultProductUsageTokens) {
        this(context, new a(publishableKey), defaultProductUsageTokens);
        s.k(context, "context");
        s.k(publishableKey, "publishableKey");
        s.k(defaultProductUsageTokens, "defaultProductUsageTokens");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PaymentAnalyticsRequestFactory(Context context, Provider<String> publishableKeyProvider) {
        s.k(context, "context");
        s.k(publishableKeyProvider, "publishableKeyProvider");
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        z30.a aVar = z30.a.f126806a;
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        PackageInfo packageInfoA = aVar.a(applicationContext);
        String packageName = context.getApplicationContext().getPackageName();
        this(packageManager, packageInfoA, packageName == null ? "" : packageName, publishableKeyProvider, new b(new w30.x(context)), null, 32, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PaymentAnalyticsRequestFactory(Context context, final wn0.a<String> publishableKeyProvider, Set<String> defaultProductUsageTokens) {
        s.k(context, "context");
        s.k(publishableKeyProvider, "publishableKeyProvider");
        s.k(defaultProductUsageTokens, "defaultProductUsageTokens");
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        z30.a aVar = z30.a.f126806a;
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        PackageInfo packageInfoA = aVar.a(applicationContext);
        String packageName = context.getApplicationContext().getPackageName();
        this(packageManager, packageInfoA, packageName == null ? "" : packageName, new Provider() { // from class: z60.c
            @Override // javax.inject.Provider
            public final Object get() {
                return PaymentAnalyticsRequestFactory.n(publishableKeyProvider);
            }
        }, new b(new w30.x(context)), defaultProductUsageTokens);
    }
}
