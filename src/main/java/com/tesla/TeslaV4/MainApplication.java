package com.tesla.TeslaV4;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.media.AudioManager$AudioPlaybackCallback;
import android.media.AudioPlaybackConfiguration;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.p003lifecycle.ProcessLifecycleOwner;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.o0;
import com.facebook.react.p0;
import com.facebook.react.soloader.OpenSourceMergedSoMapping;
import com.facebook.react.x;
import com.facebook.soloader.SoLoader;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.tesla.TeslaV4.MainApplication;
import com.tesla.dashcam_viewer.f1;
import com.tesla.oapi.CachedResponseListener;
import com.tesla.oapi.OwnerApiEndpoints;
import com.tesla.oapi.ProductsResponseListener;
import com.tesla.oapi.SendOwnerRequest;
import com.tesla.oapi.auth.Auth;
import com.tesla.oapi.auth.InterceptorProvider;
import com.tesla.oapi.auth.OwnerDataModule;
import com.tesla.sessionmanager.VehicleSessionInfo;
import com.teslamotors.plugins.ble.card.OemWalletProvider;
import com.teslamotors.plugins.ble.f0;
import com.teslamotors.plugins.widget.OemWidgetCardProvider;
import expo.modules.ApplicationLifecycleDispatcher;
import fa0.l;
import ie0.e0;
import ie0.r;
import io.reactivex.rxjava3.core.o;
import io.realm.c0;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import jn0.h0;
import jn0.m;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import me0.y;
import okhttp3.Interceptor;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import vb0.NotificationPackage;
import wn0.a;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0001\u0019B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010\u000bJ\u0017\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010\u000bJ\u000f\u0010*\u001a\u00020\fH\u0003¢\u0006\u0004\b*\u0010\u000bJ\u000f\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010\u000bJ\u000f\u0010,\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010\u000bJ\u000f\u0010-\u001a\u00020\fH\u0002¢\u0006\u0004\b-\u0010\u000bJ\u000f\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010\u000bJ\u0017\u0010/\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\fH\u0002¢\u0006\u0004\b1\u0010\u000bJ\u000f\u00102\u001a\u00020\fH\u0002¢\u0006\u0004\b2\u0010\u000bR\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u00104\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010AR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020 0C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010AR\u0014\u0010J\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010A¨\u0006L"}, d2 = {"Lcom/tesla/TeslaV4/MainApplication;", "Landroid/app/Application;", "Lbc/e;", "Lcom/facebook/react/x;", "Lcom/tesla/logging/b;", "Lcom/tesla/oapi/auth/InterceptorProvider;", "Lie0/f;", "Lcom/tesla/oapi/ProductsResponseListener;", "Landroidx/work/c$c;", "Lcom/tesla/oapi/CachedResponseListener;", "<init>", "()V", "Ljn0/h0;", "onCreate", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "", "f", "()Ljava/lang/String;", "eventName", "", StatusResponse.PAYLOAD, "a", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "Lokhttp3/Interceptor;", "provideInterceptor", "()Ljava/util/List;", "vin", "", "cached", "onVehicleDataResponseCached", "(Ljava/lang/String;Z)V", "onProductsResponse", "", "level", "onTrimMemory", "(I)V", "onTerminate", "q", "A", "D", "z", "t", "v", "(Ljava/lang/String;)Z", "C", "B", "Lfa0/a;", "Lkotlin/Lazy;", "p", "()Lfa0/a;", "appState", "Lcom/facebook/react/o0;", "b", DateTokenConverter.CONVERTER_KEY, "()Lcom/facebook/react/o0;", "reactNativeHost", "Landroidx/work/c;", "g", "()Landroidx/work/c;", "workManagerConfiguration", "()Z", "isBackgrounded", "Lio/reactivex/rxjava3/core/o;", "h", "()Lio/reactivex/rxjava3/core/o;", "backgroundedEvents", "w", "isMainProcess", "u", "isBLEProcess", "Companion", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MainApplication extends Application implements bc.e, x, com.tesla.logging.b, InterceptorProvider, ie0.f, ProductsResponseListener, androidx.work.c.InterfaceC0245c, CachedResponseListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy<com.tesla.logging.g> f55581c = m.b(new a() { // from class: fa0.h
        @Override // wn0.a
        public final Object invoke() {
            return MainApplication.x();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy appState = m.b(new a() { // from class: fa0.f
        @Override // wn0.a
        public final Object invoke() {
            return MainApplication.o(this.f64732a);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy reactNativeHost = m.b(new a() { // from class: fa0.g
        @Override // wn0.a
        public final Object invoke() {
            return MainApplication.y(this.f64733a);
        }
    });

    /* JADX INFO: renamed from: com.tesla.TeslaV4.MainApplication$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tesla/TeslaV4/MainApplication$a;", "", "<init>", "()V", "Lcom/tesla/logging/g;", "logger$delegate", "Lkotlin/Lazy;", "b", "()Lcom/tesla/logging/g;", "logger", "", "TAG", "Ljava/lang/String;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.tesla.logging.g b() {
            return (com.tesla.logging.g) MainApplication.f55581c.getValue();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T> implements cm0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b<T> f55584a = new b<>();

        b() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable throwable) {
            s.k(throwable, "throwable");
            MainApplication.INSTANCE.b().d("error when initializing crypto", throwable);
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"com/tesla/TeslaV4/MainApplication$c", "Ltd0/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "text", "Landroid/app/PendingIntent;", AnalyticsAttribute.Intent, "", "id", "Ljn0/h0;", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;I)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements td0.h {
        c() {
        }

        @Override // td0.h
        public void a(Context context, String title, String text, PendingIntent intent, int id2) {
            s.k(context, "context");
            s.k(title, "title");
            s.k(text, "text");
            s.k(intent, "intent");
            nd0.k.INSTANCE.e(context, title, text, intent, id2);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"com/tesla/TeslaV4/MainApplication$d", "Lnd0/d;", "", "a", "()Ljava/lang/String;", "deviceType", "getToken", "token", "", "getIcon", "()I", "icon", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements nd0.d {
        d() {
        }

        @Override // nd0.d
        public String a() {
            String strW = he0.b.m(MainApplication.this.getApplicationContext()).w();
            s.j(strW, "getRemoteNotificationDeviceType(...)");
            return strW;
        }

        @Override // nd0.d
        public int getIcon() {
            return (!r.a() || Build.VERSION.SDK_INT < 29) ? nd0.g.f93834a : fa0.k.f64735a;
        }

        @Override // nd0.d
        public String getToken() {
            Context applicationContext = MainApplication.this.getApplicationContext();
            s.j(applicationContext, "getApplicationContext(...)");
            return jj0.b.a(applicationContext);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/tesla/TeslaV4/MainApplication$e", "Lvb0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/os/Bundle;", "bundle", "Landroid/app/PendingIntent;", AnalyticsAttribute.Intent, "Lvb0/b;", "a", "(Landroid/content/Context;Landroid/os/Bundle;Landroid/app/PendingIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e implements vb0.a {
        e() {
        }

        @Override // vb0.a
        public Object a(Context context, Bundle bundle, PendingIntent pendingIntent, Continuation<? super NotificationPackage> continuation) {
            return new nd0.k(bundle, context).i(pendingIntent, continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class f<T> implements cm0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f<T> f55586a = new f<>();

        f() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable e11) {
            s.k(e11, "e");
            MainApplication.INSTANCE.b().d("Rx unhandled error", e11);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.TeslaV4.MainApplication$onCreate$2", f = "MainApplication.kt", i = {}, l = {355}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f55587n;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return MainApplication.this.new g(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f55587n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    com.tesla.geofence.supercharger.d dVarA = com.tesla.geofence.supercharger.d.INSTANCE.a(MainApplication.this);
                    this.f55587n = 1;
                    if (dVarA.C(false, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
            } catch (Exception e11) {
                MainApplication.INSTANCE.b().d("Failed to resume supercharger geofence monitoring", e11);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/tesla/TeslaV4/MainApplication$h", "Lcom/facebook/react/defaults/d;", "", "getUseDeveloperSupport", "()Z", "", "Lcom/facebook/react/p0;", "getPackages", "()Ljava/util/List;", "", "getJSMainModuleName", "()Ljava/lang/String;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends com.facebook.react.defaults.d {
        h(MainApplication mainApplication) {
            super(mainApplication);
        }

        @Override // com.facebook.react.o0
        protected String getJSMainModuleName() {
            return "index";
        }

        @Override // com.facebook.react.o0
        protected List<p0> getPackages() {
            ArrayList<p0> arrayListA = new com.facebook.react.j(this).a();
            s.j(arrayListA, "getPackages(...)");
            arrayListA.add(new oa0.a());
            arrayListA.add(new xe0.a());
            arrayListA.add(new com.teslamotors.plugins.ble.j());
            arrayListA.add(new com.tesla.dashcam_viewer.g());
            arrayListA.add(l.f64736a.a());
            arrayListA.addAll(na0.a.INSTANCE.a().b());
            return arrayListA;
        }

        @Override // com.facebook.react.o0
        public boolean getUseDeveloperSupport() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/tesla/TeslaV4/MainApplication$i", "Landroid/media/AudioManager$AudioPlaybackCallback;", "", "Landroid/media/AudioPlaybackConfiguration;", "configs", "Ljn0/h0;", "onPlaybackConfigChanged", "(Ljava/util/List;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends AudioManager$AudioPlaybackCallback {
        i() {
        }

        public void onPlaybackConfigChanged(List<AudioPlaybackConfiguration> configs) {
            l.f64736a.c();
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/tesla/TeslaV4/MainApplication$j", "Ljavax/net/ssl/X509TrustManager;", "", "Ljava/security/cert/X509Certificate;", "chain", "", "authType", "Ljn0/h0;", "checkClientTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V", "checkServerTrusted", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j implements X509TrustManager {
        j() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] chain, String authType) {
            s.k(chain, "chain");
            s.k(authType, "authType");
            MainApplication.INSTANCE.b().j("react-native-blob-util trusting client");
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            s.k(chain, "chain");
            s.k(authType, "authType");
            if (chain.length == 0) {
                throw new CertificateException();
            }
            MainApplication.INSTANCE.b().j("react-native-blob-util trusting server");
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            MainApplication.INSTANCE.b().j("react-native-blob-util return empty accepted issuers");
            return new X509Certificate[0];
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class k<T> implements cm0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k<T> f55589a = new k<>();

        k() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Long it) {
            s.k(it, "it");
            MainApplication.INSTANCE.b().a("Heartbeat.");
        }
    }

    private final void A() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            Object systemService = getSystemService("usagestats");
            String str = null;
            UsageStatsManager usageStatsManager = systemService instanceof UsageStatsManager ? (UsageStatsManager) systemService : null;
            if (usageStatsManager != null) {
                int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
                if (appStandbyBucket != 10) {
                    if (appStandbyBucket == 20) {
                        str = "WORKING_SET";
                    } else if (appStandbyBucket == 30) {
                        str = "FREQUENT";
                    } else if (appStandbyBucket == 40) {
                        str = "RARE";
                    } else if (i11 >= 30 && usageStatsManager.getAppStandbyBucket() == 45) {
                        str = "RESTRICTED";
                    }
                }
                if (str != null) {
                    INSTANCE.b().j("App Standby Bucket: " + str);
                }
            }
        }
    }

    private final void B() {
        com.ReactNativeBlobUtil.i.f19747a = new j();
        com.ReactNativeBlobUtil.i.f19748b = provideInterceptor();
    }

    private final void C() {
        if (Build.VERSION.SDK_INT < 28 || w()) {
            return;
        }
        WebView.setDataDirectorySuffix(e0.b(this));
    }

    private final void D() {
        if (w()) {
            return;
        }
        io.reactivex.rxjava3.core.h.l(0L, 15L, TimeUnit.MINUTES).v(k.f55589a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fa0.a o(MainApplication mainApplication) {
        return new fa0.a(mainApplication);
    }

    private final fa0.a p() {
        return (fa0.a) this.appState.getValue();
    }

    @SuppressLint({"CheckResult"})
    private final void q() {
        if (he0.b.m(getApplicationContext()).g() == null) {
            return;
        }
        io.reactivex.rxjava3.core.b.f(new Callable() { // from class: fa0.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return MainApplication.r(this.f64734a);
            }
        }).k(vm0.a.c()).i(new cm0.a() { // from class: fa0.j
            @Override // cm0.a
            public final void run() {
                MainApplication.s();
            }
        }, b.f55584a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 r(MainApplication mainApplication) {
        String publicKeyHex;
        String publicKeyHex2;
        INSTANCE.b().a("initializing crypto...");
        ee0.b bVar = new ee0.b();
        for (String str : v.d1(qb0.a.INSTANCE.b().w(), 2)) {
            rb0.e eVar = rb0.e.f107486a;
            byte[] encoded = eVar.c(mainApplication).getEncoded();
            s.h(encoded);
            VehicleSessionInfo vehicleSessionInfoB = bVar.b(str, encoded, sc0.b.DOMAIN_VEHICLE_SECURITY);
            if (vehicleSessionInfoB != null && (publicKeyHex2 = vehicleSessionInfoB.getPublicKeyHex()) != null) {
                INSTANCE.b().j("initializing VCSEC shared secret for " + str);
                eVar.f(mainApplication, publicKeyHex2, "process initialization");
            }
            VehicleSessionInfo vehicleSessionInfoB2 = bVar.b(str, encoded, sc0.b.DOMAIN_INFOTAINMENT);
            if (vehicleSessionInfoB2 != null && (publicKeyHex = vehicleSessionInfoB2.getPublicKeyHex()) != null) {
                INSTANCE.b().j("initializing INFOTAINMENT shared secret for " + str);
                eVar.f(mainApplication, publicKeyHex, "process initialization");
            }
        }
        rb0.e.f107486a.c(mainApplication);
        INSTANCE.b().a("initializing crypto complete.");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s() {
    }

    private final void t() {
        td0.d.a(new sa0.a(this, new c()));
        jj0.b.c(new nd0.j(new d()));
        com.wix.reactnativenotifications.core.notification.a.n(new e());
    }

    private final boolean u() {
        return e0.e(this);
    }

    private final boolean v(String eventName) {
        return false;
    }

    private final boolean w() {
        return e0.g(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.tesla.logging.g x() {
        return com.tesla.logging.g.INSTANCE.a("MainApplication");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h y(MainApplication mainApplication) {
        return new h(mainApplication);
    }

    private final void z() {
        AudioManager audioManager = (AudioManager) androidx.core.content.b.getSystemService(this, AudioManager.class);
        if (Build.VERSION.SDK_INT < 26 || audioManager == null) {
            return;
        }
        audioManager.registerAudioPlaybackCallback(new i(), null);
    }

    @Override // com.tesla.logging.b
    public void a(String eventName, Object payload) {
        DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter;
        s.k(eventName, "eventName");
        if (v(eventName)) {
            return;
        }
        try {
            ReactContext reactContextE = d().getReactInstanceManager().E();
            if (reactContextE == null || (rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextE.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)) == null) {
                return;
            }
            rCTDeviceEventEmitter.emit(eventName, payload);
        } catch (Exception e11) {
            INSTANCE.b().d("Error emitting event " + eventName, e11);
        }
    }

    @Override // ie0.f
    /* JADX INFO: renamed from: b */
    public boolean getIsBackgrounded() {
        return p().getIsBackgrounded();
    }

    @Override // ie0.f
    public String c() {
        return ie0.f.b.a(this);
    }

    @Override // com.facebook.react.x
    public o0 d() {
        return (o0) this.reactNativeHost.getValue();
    }

    @Override // bc.e
    public String f() {
        return "com.teslamotors.tesla.provider";
    }

    @Override // androidx.work.c.InterfaceC0245c
    public androidx.work.c g() {
        return new androidx.work.c.a().v("com.teslamotors.tesla").w(4).a();
    }

    @Override // ie0.f
    public o<Boolean> h() {
        return p().h();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        s.k(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        ApplicationLifecycleDispatcher.onConfigurationChanged(this, newConfig);
        y.f92038a.e();
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        ta0.a.f113032a.d(this);
        if (u()) {
            qb0.a.INSTANCE.a(this);
            f0.f56845a.o();
        }
        if (w() || u()) {
            com.tesla.logging.e.b(this);
            Companion companion = INSTANCE;
            companion.b().j("package: " + getPackageName());
            companion.b().j("package: com.teslamotors.tesla");
            if (u()) {
                if (Build.VERSION.SDK_INT >= 28) {
                    companion.b().j("BLE PROCESS! '" + Application.getProcessName() + "'");
                } else {
                    companion.b().j("BLE PROCESS!");
                }
                com.tesla.remotelog_core.a.Companion companion2 = com.tesla.remotelog_core.a.INSTANCE;
                Context applicationContext = getApplicationContext();
                s.j(applicationContext, "getApplicationContext(...)");
                companion2.d(applicationContext);
                ke0.e.f85983a.k(qb0.a.INSTANCE.b());
            } else if (Build.VERSION.SDK_INT >= 28) {
                companion.b().j("MAIN PROCESS! '" + Application.getProcessName() + "'");
            } else {
                companion.b().j("MAIN PROCESS!");
            }
            ke0.b.f85979a.b(this);
            if (!w()) {
                ie0.o0.f77607b.b(new ua0.e(this));
            }
            na0.a.Companion companion3 = na0.a.INSTANCE;
            companion3.a().d(this);
            if (!w()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    ra0.e eVar = ra0.e.f107464a;
                    Context applicationContext2 = getApplicationContext();
                    s.j(applicationContext2, "getApplicationContext(...)");
                    eVar.h(applicationContext2, true);
                } else {
                    c0.U0(getApplicationContext());
                }
            }
            wy.b.f(this, null, 2, null);
            f1 f1Var = f1.f55840a;
            f1Var.Z(this);
            bb0.d.f16950a.a(f1Var);
            companion3.a().c(this);
            if (r.a()) {
                if (ie0.m.f77603a.a()) {
                    System.exit(0);
                    throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                }
                if (!w()) {
                    md0.d dVar = md0.d.f91834a;
                    dVar.b(this);
                    dVar.d(ie0.l.INSTANCE.a().a(), this);
                }
                C();
            }
            B();
            nc0.l lVar = nc0.l.ANDROID_APPLICATION_ON_CREATE;
            ld0.d.b(lVar);
            if (u()) {
                Auth auth = Auth.INSTANCE;
                Context applicationContext3 = getApplicationContext();
                s.j(applicationContext3, "getApplicationContext(...)");
                auth.initialize(applicationContext3);
            }
            rd0.i.f107785a.e();
            q();
            if (u()) {
                be0.e eVarA = be0.e.INSTANCE.a();
                ob0.e.f97095a.M(pb0.b.INSTANCE.a(new pb0.a(eVarA), eVarA));
            }
            A();
            D();
            ProcessLifecycleOwner.Companion companion4 = ProcessLifecycleOwner.INSTANCE;
            companion4.a().getLifecycle().a(p());
            nd0.k.INSTANCE.a(this);
            SoLoader.l(this, OpenSourceMergedSoMapping.f23097a);
            OemWalletProvider.INSTANCE.f(this);
            ApplicationLifecycleDispatcher.onApplicationCreate(this);
            ie0.g.a();
            tm0.a.A(f.f55586a);
            t();
            if (w()) {
                va0.a aVar = new va0.a(this);
                td0.m mVarJ = td0.m.j();
                s.j(mVarJ, "getDB(...)");
                oe0.d dVar2 = new oe0.d(mVarJ, OwnerDataModule.getAuthRepository(), OwnerApiEndpoints.INSTANCE.getInstance(this), SendOwnerRequest.INSTANCE.newInstance(this));
                qe0.c.f105355a.f(aVar, dVar2);
                OemWidgetCardProvider.INSTANCE.d(this, aVar, dVar2);
            }
            la0.a.f89740a.a(this);
            z();
            kd0.e.b.d(kd0.e.INSTANCE.a(), lVar, v.e(kd0.a.INSTANCE.a("process_name", e0.b(this))), null, 4, null);
            if (!r.a() || ie0.o0.f77607b.a()) {
                ra0.e.f107464a.k(this);
            }
            if (w()) {
                BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(companion4.a()), Dispatchers.getIO(), null, new g(null), 2, null);
            }
            companion.b().j("anonymousInstallIdentifier: " + qb0.a.INSTANCE.b().E());
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        INSTANCE.b().a("Low Memory Warning - Java Heap");
    }

    @Override // com.tesla.oapi.ProductsResponseListener
    public void onProductsResponse() {
        INSTANCE.b().j("products fetched, triggering features config refresh.");
        com.tesla.features.c.Companion companion = com.tesla.features.c.INSTANCE;
        Context applicationContext = getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        com.tesla.features.c.b.a(companion.a(applicationContext), false, 1, null).r();
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        String str;
        super.onTrimMemory(level);
        if (level == 5) {
            str = "RUNNING_MODERATE";
        } else if (level == 10) {
            str = "RUNNING_LOW";
        } else if (level == 15) {
            str = "RUNNING_CRITICAL";
        } else if (level == 20) {
            str = "UI_HIDDEN";
        } else if (level == 40) {
            str = "BACKGROUND";
        } else if (level != 60) {
            str = level != 80 ? "UNKNOWN" : "COMPLETE";
        } else {
            str = "MODERATE";
        }
        INSTANCE.b().j("onTrimMemory: " + str);
    }

    @Override // com.tesla.oapi.CachedResponseListener
    public void onVehicleDataResponseCached(String vin, boolean cached) {
        s.k(vin, "vin");
        kb0.g gVar = kb0.g.f85866a;
        gVar.z(vin, cached ? kb0.g.c.OFFLINE : kb0.g.c.ONLINE);
        if (cached) {
            return;
        }
        gVar.A(vin);
    }

    @Override // com.tesla.oapi.auth.InterceptorProvider
    public List<Interceptor> provideInterceptor() {
        return v.m();
    }
}
