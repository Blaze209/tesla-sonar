package com.stripe.android.customersheet;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.f1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.y;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 32\u00020\u0001:\u0005%'\u001c\u0018\u001eBQ\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0086@¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010*R\"\u0010/\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010,0,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00101¨\u00064"}, d2 = {"Lcom/stripe/android/customersheet/d;", "", "Landroid/app/Application;", Kind.APPLICATION, "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lh/d;", "activityResultRegistryOwner", "Landroidx/lifecycle/f1;", "viewModelStoreOwner", "Lcom/stripe/android/customersheet/g$c;", "integrationType", "Lw70/h;", "paymentOptionFactory", "La40/d;", "callback", "Lkotlin/Function0;", "", "statusBarColor", "<init>", "(Landroid/app/Application;Landroidx/lifecycle/LifecycleOwner;Lh/d;Landroidx/lifecycle/f1;Lcom/stripe/android/customersheet/g$c;Lw70/h;La40/d;Lwn0/a;)V", "Lcom/stripe/android/customersheet/p;", "result", "Ljn0/h0;", "e", "(Lcom/stripe/android/customersheet/p;)V", "Lcom/stripe/android/customersheet/d$c;", "configuration", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/customersheet/d$c;)V", "f", "()V", "Lcom/stripe/android/customersheet/i;", "g", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Landroid/app/Application;", "b", "Lcom/stripe/android/customersheet/g$c;", "c", "Lw70/h;", "La40/d;", "Lwn0/a;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/customersheet/CustomerSheetContract$a;", "kotlin.jvm.PlatformType", "Landroidx/activity/result/ActivityResultLauncher;", "customerSheetActivityLauncher", "Lcom/stripe/android/customersheet/e;", "Lcom/stripe/android/customersheet/e;", "viewModel", "h", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f49748i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Application application;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.customersheet.g.c integrationType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w70.h paymentOptionFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a40.d callback;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Integer> statusBarColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<CustomerSheetContract.Args> customerSheetActivityLauncher;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.customersheet.e viewModel;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/stripe/android/customersheet/d$a", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Ljn0/h0;", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements DefaultLifecycleObserver {
        a() {
        }

        @Override // androidx.p003lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            p013kotlin.jvm.internal.s.k(owner, "owner");
            d.this.customerSheetActivityLauncher.d();
            super.onDestroy(owner);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.customersheet.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u0004\u0018\u00010!*\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/stripe/android/customersheet/d$b;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/stripe/android/customersheet/b;", "customerAdapter", "La40/d;", "callback", "Lcom/stripe/android/customersheet/d;", "a", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/customersheet/b;La40/d;)Lcom/stripe/android/customersheet/d;", "Landroid/app/Application;", Kind.APPLICATION, "Landroidx/lifecycle/f1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lh/d;", "activityResultRegistryOwner", "Lkotlin/Function0;", "", "statusBarColor", "Lcom/stripe/android/customersheet/g;", "integration", "b", "(Landroid/app/Application;Landroidx/lifecycle/f1;Landroidx/lifecycle/LifecycleOwner;Lh/d;Lwn0/a;Lcom/stripe/android/customersheet/g;La40/d;)Lcom/stripe/android/customersheet/d;", "Lw70/j;", "Lw70/h;", "paymentOptionFactory", "", "canUseGooglePay", "Lcom/stripe/android/customersheet/q;", "c", "(Lw70/j;Lw70/h;Z)Lcom/stripe/android/customersheet/q;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.stripe.android.customersheet.d$b$a */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<Integer> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Fragment f49757c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Fragment fragment) {
                super(0);
                this.f49757c = fragment;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                Window window;
                androidx.fragment.app.u activity = this.f49757c.getActivity();
                if (activity == null || (window = activity.getWindow()) == null) {
                    return null;
                }
                return Integer.valueOf(window.getStatusBarColor());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(Fragment fragment, b customerAdapter, a40.d callback) {
            p013kotlin.jvm.internal.s.k(fragment, "fragment");
            p013kotlin.jvm.internal.s.k(customerAdapter, "customerAdapter");
            p013kotlin.jvm.internal.s.k(callback, "callback");
            Application application = fragment.requireActivity().getApplication();
            Object host = fragment.getHost();
            h.d dVarRequireActivity = host instanceof h.d ? (h.d) host : null;
            if (dVarRequireActivity == null) {
                dVarRequireActivity = fragment.requireActivity();
                p013kotlin.jvm.internal.s.j(dVarRequireActivity, "requireActivity(...)");
            }
            com.stripe.android.customersheet.g.a aVar = new com.stripe.android.customersheet.g.a(customerAdapter);
            p013kotlin.jvm.internal.s.h(application);
            return b(application, fragment, fragment, dVarRequireActivity, new a(fragment), aVar, callback);
        }

        public final d b(Application application, f1 viewModelStoreOwner, LifecycleOwner lifecycleOwner, h.d activityResultRegistryOwner, wn0.a<Integer> statusBarColor, com.stripe.android.customersheet.g integration, a40.d callback) {
            p013kotlin.jvm.internal.s.k(application, "application");
            p013kotlin.jvm.internal.s.k(viewModelStoreOwner, "viewModelStoreOwner");
            p013kotlin.jvm.internal.s.k(lifecycleOwner, "lifecycleOwner");
            p013kotlin.jvm.internal.s.k(activityResultRegistryOwner, "activityResultRegistryOwner");
            p013kotlin.jvm.internal.s.k(statusBarColor, "statusBarColor");
            p013kotlin.jvm.internal.s.k(integration, "integration");
            p013kotlin.jvm.internal.s.k(callback, "callback");
            g40.a.f67321a.f(application, lifecycleOwner, integration);
            com.stripe.android.customersheet.g.c cVarA = integration.getType();
            Resources resources = application.getResources();
            p013kotlin.jvm.internal.s.j(resources, "getResources(...)");
            return new d(application, lifecycleOwner, activityResultRegistryOwner, viewModelStoreOwner, cVarA, new w70.h(resources, new o90.f(application, null, null, null, null, 30, null), application), callback, statusBarColor);
        }

        public final q c(w70.j jVar, w70.h paymentOptionFactory, boolean z11) {
            p013kotlin.jvm.internal.s.k(paymentOptionFactory, "paymentOptionFactory");
            if (!(jVar instanceof w70.j.c)) {
                if (jVar instanceof w70.j.Saved) {
                    return new q.b(((w70.j.Saved) jVar).getPaymentMethod(), paymentOptionFactory.b(jVar));
                }
                return null;
            }
            q.a aVar = new q.a(paymentOptionFactory.b(jVar));
            if (z11) {
                return aVar;
            }
            return null;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.customersheet.d$c, reason: from toString */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 72\u00020\u0001:\u0002\u001f!By\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b&\u0010/R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b0\u0010)R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b(\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0010\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b\u001f\u0010%R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b4\u00103R\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00105\u001a\u0004\b*\u00106¨\u00068"}, d2 = {"Lcom/stripe/android/customersheet/d$c;", "Landroid/os/Parcelable;", "Lcom/stripe/android/paymentsheet/y$b;", "appearance", "", "googlePayEnabled", "", "headerTextForSelectionScreen", "Lcom/stripe/android/paymentsheet/y$c;", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/y$d;", "billingDetailsCollectionConfiguration", "merchantDisplayName", "", "Lcom/stripe/android/model/h;", "preferredNetworks", "allowsRemovalOfLastSavedPaymentMethod", "paymentMethodOrder", "Lcom/stripe/android/paymentsheet/y$e;", "cardBrandAcceptance", "<init>", "(Lcom/stripe/android/paymentsheet/y$b;ZLjava/lang/String;Lcom/stripe/android/paymentsheet/y$c;Lcom/stripe/android/paymentsheet/y$d;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Lcom/stripe/android/paymentsheet/y$e;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/paymentsheet/y$b;", "b", "()Lcom/stripe/android/paymentsheet/y$b;", "Z", "f", "()Z", "c", "Ljava/lang/String;", "g", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/paymentsheet/y$c;", "e", "()Lcom/stripe/android/paymentsheet/y$c;", "Lcom/stripe/android/paymentsheet/y$d;", "()Lcom/stripe/android/paymentsheet/y$d;", "h", "Ljava/util/List;", "j", "()Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/paymentsheet/y$e;", "()Lcom/stripe/android/paymentsheet/y$e;", "k", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Configuration implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final y.Appearance appearance;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean googlePayEnabled;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String headerTextForSelectionScreen;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final y.BillingDetails defaultBillingDetails;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String merchantDisplayName;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<com.stripe.android.model.h> preferredNetworks;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean allowsRemovalOfLastSavedPaymentMethod;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> paymentMethodOrder;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final y.e cardBrandAcceptance;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f49759l = 8;
        public static final Parcelable.Creator<Configuration> CREATOR = new C0806c();

        /* JADX INFO: renamed from: com.stripe.android.customersheet.d$c$a */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001f\u0010\rJ\u001b\u0010!\u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0019¢\u0006\u0004\b!\u0010\u001dJ\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010%R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010&R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010%R\u0016\u0010)\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0016\u0010+\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010*R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010'R\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010,R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/stripe/android/customersheet/d$c$a;", "", "", "merchantDisplayName", "<init>", "(Ljava/lang/String;)V", "Lcom/stripe/android/paymentsheet/y$b;", "appearance", "b", "(Lcom/stripe/android/paymentsheet/y$b;)Lcom/stripe/android/customersheet/d$c$a;", "", "googlePayEnabled", "f", "(Z)Lcom/stripe/android/customersheet/d$c$a;", "headerTextForSelectionScreen", "g", "(Ljava/lang/String;)Lcom/stripe/android/customersheet/d$c$a;", "Lcom/stripe/android/paymentsheet/y$c;", "details", "e", "(Lcom/stripe/android/paymentsheet/y$c;)Lcom/stripe/android/customersheet/d$c$a;", "Lcom/stripe/android/paymentsheet/y$d;", "configuration", "c", "(Lcom/stripe/android/paymentsheet/y$d;)Lcom/stripe/android/customersheet/d$c$a;", "", "Lcom/stripe/android/model/h;", "preferredNetworks", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)Lcom/stripe/android/customersheet/d$c$a;", "allowsRemovalOfLastSavedPaymentMethod", "a", "paymentMethodOrder", "h", "Lcom/stripe/android/customersheet/d$c;", DateTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/customersheet/d$c;", "Ljava/lang/String;", "Lcom/stripe/android/paymentsheet/y$b;", "Z", "Lcom/stripe/android/paymentsheet/y$c;", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/y$d;", "billingDetailsCollectionConfiguration", "Ljava/util/List;", "Lcom/stripe/android/paymentsheet/y$e;", "j", "Lcom/stripe/android/paymentsheet/y$e;", "cardBrandAcceptance", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String merchantDisplayName;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private y.Appearance appearance;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private boolean googlePayEnabled;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private String headerTextForSelectionScreen;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private y.BillingDetails defaultBillingDetails;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            private y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private List<? extends com.stripe.android.model.h> preferredNetworks;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            private boolean allowsRemovalOfLastSavedPaymentMethod;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            private List<String> paymentMethodOrder;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            private y.e cardBrandAcceptance;

            public a(String merchantDisplayName) {
                p013kotlin.jvm.internal.s.k(merchantDisplayName, "merchantDisplayName");
                this.merchantDisplayName = merchantDisplayName;
                j30.a aVar = j30.a.f82462a;
                this.appearance = aVar.a();
                this.headerTextForSelectionScreen = aVar.h();
                this.defaultBillingDetails = aVar.b();
                this.billingDetailsCollectionConfiguration = aVar.c();
                this.preferredNetworks = aVar.j();
                this.allowsRemovalOfLastSavedPaymentMethod = true;
                this.paymentMethodOrder = aVar.i();
                this.cardBrandAcceptance = aVar.d();
            }

            public final a a(boolean allowsRemovalOfLastSavedPaymentMethod) {
                this.allowsRemovalOfLastSavedPaymentMethod = allowsRemovalOfLastSavedPaymentMethod;
                return this;
            }

            public final a b(y.Appearance appearance) {
                p013kotlin.jvm.internal.s.k(appearance, "appearance");
                this.appearance = appearance;
                return this;
            }

            public final a c(y.BillingDetailsCollectionConfiguration configuration) {
                p013kotlin.jvm.internal.s.k(configuration, "configuration");
                this.billingDetailsCollectionConfiguration = configuration;
                return this;
            }

            public final Configuration d() {
                return new Configuration(this.appearance, this.googlePayEnabled, this.headerTextForSelectionScreen, this.defaultBillingDetails, this.billingDetailsCollectionConfiguration, this.merchantDisplayName, this.preferredNetworks, this.allowsRemovalOfLastSavedPaymentMethod, this.paymentMethodOrder, this.cardBrandAcceptance);
            }

            public final a e(y.BillingDetails details) {
                p013kotlin.jvm.internal.s.k(details, "details");
                this.defaultBillingDetails = details;
                return this;
            }

            public final a f(boolean googlePayEnabled) {
                this.googlePayEnabled = googlePayEnabled;
                return this;
            }

            public final a g(String headerTextForSelectionScreen) {
                this.headerTextForSelectionScreen = headerTextForSelectionScreen;
                return this;
            }

            public final a h(List<String> paymentMethodOrder) {
                p013kotlin.jvm.internal.s.k(paymentMethodOrder, "paymentMethodOrder");
                this.paymentMethodOrder = paymentMethodOrder;
                return this;
            }

            public final a i(List<? extends com.stripe.android.model.h> preferredNetworks) {
                p013kotlin.jvm.internal.s.k(preferredNetworks, "preferredNetworks");
                this.preferredNetworks = preferredNetworks;
                return this;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.customersheet.d$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/customersheet/d$c$b;", "", "<init>", "()V", "", "merchantDisplayName", "Lcom/stripe/android/customersheet/d$c$a;", "a", "(Ljava/lang/String;)Lcom/stripe/android/customersheet/d$c$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String merchantDisplayName) {
                p013kotlin.jvm.internal.s.k(merchantDisplayName, "merchantDisplayName");
                return new a(merchantDisplayName);
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.customersheet.d$c$c, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0806c implements Parcelable.Creator<Configuration> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Configuration createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                y.Appearance appearanceCreateFromParcel = y.Appearance.CREATOR.createFromParcel(parcel);
                boolean z11 = true;
                if (parcel.readInt() == 0) {
                    z11 = false;
                }
                String string = parcel.readString();
                y.BillingDetails billingDetailsCreateFromParcel = y.BillingDetails.CREATOR.createFromParcel(parcel);
                y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfigurationCreateFromParcel = y.BillingDetailsCollectionConfiguration.CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(com.stripe.android.model.h.valueOf(parcel.readString()));
                }
                return new Configuration(appearanceCreateFromParcel, z11, string, billingDetailsCreateFromParcel, billingDetailsCollectionConfigurationCreateFromParcel, string2, arrayList, parcel.readInt() != 0, parcel.createStringArrayList(), (y.e) parcel.readParcelable(Configuration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Configuration[] newArray(int i11) {
                return new Configuration[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Configuration(y.Appearance appearance, boolean z11, String str, y.BillingDetails defaultBillingDetails, y.BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, String merchantDisplayName, List<? extends com.stripe.android.model.h> preferredNetworks, boolean z12, List<String> paymentMethodOrder, y.e cardBrandAcceptance) {
            p013kotlin.jvm.internal.s.k(appearance, "appearance");
            p013kotlin.jvm.internal.s.k(defaultBillingDetails, "defaultBillingDetails");
            p013kotlin.jvm.internal.s.k(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            p013kotlin.jvm.internal.s.k(merchantDisplayName, "merchantDisplayName");
            p013kotlin.jvm.internal.s.k(preferredNetworks, "preferredNetworks");
            p013kotlin.jvm.internal.s.k(paymentMethodOrder, "paymentMethodOrder");
            p013kotlin.jvm.internal.s.k(cardBrandAcceptance, "cardBrandAcceptance");
            this.appearance = appearance;
            this.googlePayEnabled = z11;
            this.headerTextForSelectionScreen = str;
            this.defaultBillingDetails = defaultBillingDetails;
            this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
            this.merchantDisplayName = merchantDisplayName;
            this.preferredNetworks = preferredNetworks;
            this.allowsRemovalOfLastSavedPaymentMethod = z12;
            this.paymentMethodOrder = paymentMethodOrder;
            this.cardBrandAcceptance = cardBrandAcceptance;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getAllowsRemovalOfLastSavedPaymentMethod() {
            return this.allowsRemovalOfLastSavedPaymentMethod;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final y.Appearance getAppearance() {
            return this.appearance;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final y.BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
            return this.billingDetailsCollectionConfiguration;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final y.e getCardBrandAcceptance() {
            return this.cardBrandAcceptance;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final y.BillingDetails getDefaultBillingDetails() {
            return this.defaultBillingDetails;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            return p013kotlin.jvm.internal.s.f(this.appearance, configuration.appearance) && this.googlePayEnabled == configuration.googlePayEnabled && p013kotlin.jvm.internal.s.f(this.headerTextForSelectionScreen, configuration.headerTextForSelectionScreen) && p013kotlin.jvm.internal.s.f(this.defaultBillingDetails, configuration.defaultBillingDetails) && p013kotlin.jvm.internal.s.f(this.billingDetailsCollectionConfiguration, configuration.billingDetailsCollectionConfiguration) && p013kotlin.jvm.internal.s.f(this.merchantDisplayName, configuration.merchantDisplayName) && p013kotlin.jvm.internal.s.f(this.preferredNetworks, configuration.preferredNetworks) && this.allowsRemovalOfLastSavedPaymentMethod == configuration.allowsRemovalOfLastSavedPaymentMethod && p013kotlin.jvm.internal.s.f(this.paymentMethodOrder, configuration.paymentMethodOrder) && p013kotlin.jvm.internal.s.f(this.cardBrandAcceptance, configuration.cardBrandAcceptance);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getGooglePayEnabled() {
            return this.googlePayEnabled;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getHeaderTextForSelectionScreen() {
            return this.headerTextForSelectionScreen;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getMerchantDisplayName() {
            return this.merchantDisplayName;
        }

        public int hashCode() {
            int iHashCode = ((this.appearance.hashCode() * 31) + Boolean.hashCode(this.googlePayEnabled)) * 31;
            String str = this.headerTextForSelectionScreen;
            return ((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.defaultBillingDetails.hashCode()) * 31) + this.billingDetailsCollectionConfiguration.hashCode()) * 31) + this.merchantDisplayName.hashCode()) * 31) + this.preferredNetworks.hashCode()) * 31) + Boolean.hashCode(this.allowsRemovalOfLastSavedPaymentMethod)) * 31) + this.paymentMethodOrder.hashCode()) * 31) + this.cardBrandAcceptance.hashCode();
        }

        public final List<String> i() {
            return this.paymentMethodOrder;
        }

        public final List<com.stripe.android.model.h> j() {
            return this.preferredNetworks;
        }

        public String toString() {
            return "Configuration(appearance=" + this.appearance + ", googlePayEnabled=" + this.googlePayEnabled + ", headerTextForSelectionScreen=" + this.headerTextForSelectionScreen + ", defaultBillingDetails=" + this.defaultBillingDetails + ", billingDetailsCollectionConfiguration=" + this.billingDetailsCollectionConfiguration + ", merchantDisplayName=" + this.merchantDisplayName + ", preferredNetworks=" + this.preferredNetworks + ", allowsRemovalOfLastSavedPaymentMethod=" + this.allowsRemovalOfLastSavedPaymentMethod + ", paymentMethodOrder=" + this.paymentMethodOrder + ", cardBrandAcceptance=" + this.cardBrandAcceptance + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            this.appearance.writeToParcel(parcel, flags);
            parcel.writeInt(this.googlePayEnabled ? 1 : 0);
            parcel.writeString(this.headerTextForSelectionScreen);
            this.defaultBillingDetails.writeToParcel(parcel, flags);
            this.billingDetailsCollectionConfiguration.writeToParcel(parcel, flags);
            parcel.writeString(this.merchantDisplayName);
            List<com.stripe.android.model.h> list = this.preferredNetworks;
            parcel.writeInt(list.size());
            Iterator<com.stripe.android.model.h> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().name());
            }
            parcel.writeInt(this.allowsRemovalOfLastSavedPaymentMethod ? 1 : 0);
            parcel.writeStringList(this.paymentMethodOrder);
            parcel.writeParcelable(this.cardBrandAcceptance, flags);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.customersheet.d$d, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u0003R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/customersheet/d$d;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "customerId", "clientSecret", "c", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CustomerSessionClientSecret {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String customerId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String clientSecret;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCustomerId() {
            return this.customerId;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomerSessionClientSecret)) {
                return false;
            }
            CustomerSessionClientSecret customerSessionClientSecret = (CustomerSessionClientSecret) obj;
            return p013kotlin.jvm.internal.s.f(this.customerId, customerSessionClientSecret.customerId) && p013kotlin.jvm.internal.s.f(this.clientSecret, customerSessionClientSecret.clientSecret);
        }

        public int hashCode() {
            return (this.customerId.hashCode() * 31) + this.clientSecret.hashCode();
        }

        public String toString() {
            return "CustomerSessionClientSecret(customerId=" + this.customerId + ", clientSecret=" + this.clientSecret + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\t\u001a\u00020\bH¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H¦@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u0007\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/customersheet/d$e;", "", "<init>", "()V", "Ljn0/s;", "Lcom/stripe/android/customersheet/d$f;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "customerId", "c", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/customersheet/d$d;", DateTokenConverter.CONVERTER_KEY, "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class e {
        static /* synthetic */ Object b(e eVar, Continuation<? super jn0.s<f>> continuation) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return jn0.s.b(new f.a().a());
        }

        public Object a(Continuation<? super jn0.s<f>> continuation) {
            return b(this, continuation);
        }

        public abstract Object c(String str, Continuation<? super jn0.s<String>> continuation);

        public abstract Object d(Continuation<? super jn0.s<CustomerSessionClientSecret>> continuation);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/customersheet/d$f;", "", "", "", "paymentMethodTypes", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<String> paymentMethodTypes;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/customersheet/d$f$a;", "", "<init>", "()V", "Lcom/stripe/android/customersheet/d$f;", "a", "()Lcom/stripe/android/customersheet/d$f;", "", "", "Ljava/util/List;", "paymentMethodTypes", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private List<String> paymentMethodTypes = v.m();

            public final f a() {
                return new f(this.paymentMethodTypes);
            }
        }

        public f(List<String> paymentMethodTypes) {
            p013kotlin.jvm.internal.s.k(paymentMethodTypes, "paymentMethodTypes");
            this.paymentMethodTypes = paymentMethodTypes;
        }

        public final List<String> a() {
            return this.paymentMethodTypes;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class g implements ActivityResultCallback, p013kotlin.jvm.internal.m {
        g() {
        }

        @Override // androidx.p002activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(p p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            d.this.e(p11);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof p013kotlin.jvm.internal.m)) {
                return p013kotlin.jvm.internal.s.f(getFunctionDelegate(), ((p013kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return new p013kotlin.jvm.internal.p(1, d.this, d.class, "onCustomerSheetResult", "onCustomerSheetResult(Lcom/stripe/android/customersheet/InternalCustomerSheetResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/stripe/android/customersheet/i;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lcom/stripe/android/customersheet/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheet$retrievePaymentOptionSelection$2", f = "CustomerSheet.kt", i = {0, 1}, l = {142, 143}, m = "invokeSuspend", n = {"paymentMethodsDeferred", "savedSelection"}, s = {"L$0", "L$0"})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super i>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f49786n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f49787o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ CustomerSheetConfigureRequest f49789q;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "", "Lcom/stripe/android/model/v0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheet$retrievePaymentOptionSelection$2$paymentMethodsDeferred$1", f = "CustomerSheet.kt", i = {}, l = {140, 140}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.s<? extends List<? extends PaymentMethod>>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f49790n;

            a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(continuation);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.s<? extends List<? extends PaymentMethod>>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super jn0.s<? extends List<PaymentMethod>>>) continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
            
                if (r5 == r0) goto L15;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r4.f49790n
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    jn0.t.b(r5)
                    goto L3b
                L12:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1a:
                    jn0.t.b(r5)
                    goto L30
                L1e:
                    jn0.t.b(r5)
                    g40.a r5 = g40.a.f67321a
                    kotlinx.coroutines.Deferred r5 = r5.d()
                    r4.f49790n = r3
                    java.lang.Object r5 = r5.await(r4)
                    if (r5 != r0) goto L30
                    goto L3a
                L30:
                    c40.n r5 = (c40.n) r5
                    r4.f49790n = r2
                    java.lang.Object r5 = r5.a(r4)
                    if (r5 != r0) goto L3b
                L3a:
                    return r0
                L3b:
                    c40.j r5 = (c40.j) r5
                    java.lang.Object r5 = r5.a()
                    jn0.s r5 = jn0.s.a(r5)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.d.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super jn0.s<? extends List<PaymentMethod>>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Lw70/m;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheet$retrievePaymentOptionSelection$2$savedSelectionDeferred$1", f = "CustomerSheet.kt", i = {}, l = {137, 137}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.s<? extends w70.m>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f49791n;

            b(Continuation<? super b> continuation) {
                super(2, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new b(continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
            
                if (r5 == r0) goto L15;
             */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r4.f49791n
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    jn0.t.b(r5)
                    goto L3b
                L12:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1a:
                    jn0.t.b(r5)
                    goto L30
                L1e:
                    jn0.t.b(r5)
                    g40.a r5 = g40.a.f67321a
                    kotlinx.coroutines.Deferred r5 = r5.e()
                    r4.f49791n = r3
                    java.lang.Object r5 = r5.await(r4)
                    if (r5 != r0) goto L30
                    goto L3a
                L30:
                    c40.o r5 = (c40.o) r5
                    r4.f49791n = r2
                    java.lang.Object r5 = r5.i(r4)
                    if (r5 != r0) goto L3b
                L3a:
                    return r0
                L3b:
                    c40.j r5 = (c40.j) r5
                    java.lang.Object r5 = r5.a()
                    jn0.s r5 = jn0.s.a(r5)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.customersheet.d.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.s<? extends w70.m>> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/stripe/android/model/v0;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/v0;"}, k = 3, mv = {1, 9, 0})
        static final class c extends u implements wn0.l<String, PaymentMethod> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f49792c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.customersheet.b.AbstractC0802b f49793d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Object obj, com.stripe.android.customersheet.b.AbstractC0802b abstractC0802b) {
                super(1);
                this.f49792c = obj;
                this.f49793d = abstractC0802b;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PaymentMethod invoke(String it) {
                p013kotlin.jvm.internal.s.k(it, "it");
                Object obj = this.f49792c;
                Object obj2 = null;
                if (jn0.s.g(obj)) {
                    obj = null;
                }
                List list = (List) obj;
                if (list == null) {
                    return null;
                }
                com.stripe.android.customersheet.b.AbstractC0802b abstractC0802b = this.f49793d;
                for (Object obj3 : list) {
                    if (p013kotlin.jvm.internal.s.f(((PaymentMethod) obj3).id, abstractC0802b.getId())) {
                        obj2 = obj3;
                        break;
                    }
                }
                return (PaymentMethod) obj2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(CustomerSheetConfigureRequest fVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f49789q = fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            h hVar = d.this.new h(this.f49789q, continuation);
            hVar.f49787o = obj;
            return hVar;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x006d  */
        /* JADX WARN: Code duplicated, block: B:21:0x0071  */
        /* JADX WARN: Code duplicated, block: B:22:0x0078  */
        /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:39:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:41:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Deferred deferredAsync$default;
            Object objB;
            Object objB2;
            d dVar;
            CustomerSheetConfigureRequest fVar;
            Object objB3;
            com.stripe.android.customersheet.b.AbstractC0802b abstractC0802b;
            w70.j jVarB;
            w70.m mVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f49786n;
            q qVarC = null;
            if (i11 == 0) {
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f49787o;
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new b(null), 3, null);
                deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new a(null), 3, null);
                this.f49787o = deferredAsync$default;
                this.f49786n = 1;
                obj = deferredAsync$default2.await(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                deferredAsync$default = (Deferred) this.f49787o;
                t.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objB = this.f49787o;
                t.b(obj);
            }
            Object value = ((jn0.s) obj).getValue();
            if (jn0.s.h(objB)) {
                mVar = (w70.m) objB;
                if (mVar != null) {
                    objB = com.stripe.android.customersheet.b.AbstractC0802b.INSTANCE.b(mVar);
                } else {
                    objB = null;
                }
            }
            objB2 = jn0.s.b(objB);
            dVar = d.this;
            fVar = this.f49789q;
            if (jn0.s.h(objB2)) {
                try {
                    abstractC0802b = (com.stripe.android.customersheet.b.AbstractC0802b) objB2;
                    if (abstractC0802b != null && (jVarB = abstractC0802b.b(new c(value, abstractC0802b))) != null) {
                        qVarC = d.INSTANCE.c(jVarB, dVar.paymentOptionFactory, fVar.getConfiguration().getGooglePayEnabled());
                    }
                    objB3 = jn0.s.b(qVarC);
                } catch (Throwable th2) {
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    objB3 = jn0.s.b(t.a(th2));
                }
            } else {
                objB3 = jn0.s.b(objB2);
            }
            Throwable thE = jn0.s.e(objB3);
            return thE == null ? new i.d((q) objB3) : new i.c(thE);
            Object value2 = ((jn0.s) obj).getValue();
            this.f49787o = value2;
            this.f49786n = 2;
            Object objAwait = deferredAsync$default.await(this);
            if (objAwait != coroutine_suspended) {
                objB = value2;
                obj = objAwait;
                Object value3 = ((jn0.s) obj).getValue();
                if (jn0.s.h(objB)) {
                    mVar = (w70.m) objB;
                    if (mVar != null) {
                        objB = com.stripe.android.customersheet.b.AbstractC0802b.INSTANCE.b(mVar);
                    } else {
                        objB = null;
                    }
                }
                objB2 = jn0.s.b(objB);
                dVar = d.this;
                fVar = this.f49789q;
                if (jn0.s.h(objB2)) {
                    abstractC0802b = (com.stripe.android.customersheet.b.AbstractC0802b) objB2;
                    if (abstractC0802b != null) {
                        qVarC = d.INSTANCE.c(jVarB, dVar.paymentOptionFactory, fVar.getConfiguration().getGooglePayEnabled());
                    }
                    objB3 = jn0.s.b(qVarC);
                } else {
                    objB3 = jn0.s.b(objB2);
                }
                Throwable thE2 = jn0.s.e(objB3);
                if (thE2 == null) {
                }
            }
            return coroutine_suspended;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super i> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public d(Application application, LifecycleOwner lifecycleOwner, h.d activityResultRegistryOwner, f1 viewModelStoreOwner, com.stripe.android.customersheet.g.c integrationType, w70.h paymentOptionFactory, a40.d callback, wn0.a<Integer> statusBarColor) {
        p013kotlin.jvm.internal.s.k(application, "application");
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "lifecycleOwner");
        p013kotlin.jvm.internal.s.k(activityResultRegistryOwner, "activityResultRegistryOwner");
        p013kotlin.jvm.internal.s.k(viewModelStoreOwner, "viewModelStoreOwner");
        p013kotlin.jvm.internal.s.k(integrationType, "integrationType");
        p013kotlin.jvm.internal.s.k(paymentOptionFactory, "paymentOptionFactory");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        p013kotlin.jvm.internal.s.k(statusBarColor, "statusBarColor");
        this.application = application;
        this.integrationType = integrationType;
        this.paymentOptionFactory = paymentOptionFactory;
        this.callback = callback;
        this.statusBarColor = statusBarColor;
        ActivityResultLauncher<CustomerSheetContract.Args> activityResultLauncherL = activityResultRegistryOwner.getActivityResultRegistry().l("CustomerSheet", new CustomerSheetContract(), new g());
        p013kotlin.jvm.internal.s.j(activityResultLauncherL, "register(...)");
        this.customerSheetActivityLauncher = activityResultLauncherL;
        this.viewModel = (com.stripe.android.customersheet.e) new ViewModelProvider(viewModelStoreOwner, com.stripe.android.customersheet.e.b.f49797a).b(com.stripe.android.customersheet.e.class);
        lifecycleOwner.getLifecycle().a(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(p result) {
        this.callback.a(result.b(this.paymentOptionFactory));
    }

    public final void d(Configuration configuration) {
        p013kotlin.jvm.internal.s.k(configuration, "configuration");
        this.viewModel.g(new CustomerSheetConfigureRequest(configuration));
    }

    public final void f() {
        CustomerSheetConfigureRequest fVarF = this.viewModel.f();
        if (fVarF == null) {
            this.callback.a(new i.c(new IllegalStateException("Must call `configure` first before attempting to present `CustomerSheet`!")));
            return;
        }
        CustomerSheetContract.Args aVar = new CustomerSheetContract.Args(this.integrationType, fVarF.getConfiguration(), this.statusBarColor.invoke());
        Context applicationContext = this.application.getApplicationContext();
        r90.b bVar = r90.b.f107376a;
        androidx.core.app.d dVarA = androidx.core.app.d.a(applicationContext, bVar.a(), bVar.b());
        p013kotlin.jvm.internal.s.j(dVarA, "makeCustomAnimation(...)");
        this.customerSheetActivityLauncher.c(aVar, dVarA);
    }

    public final Object g(Continuation<? super i> continuation) {
        CustomerSheetConfigureRequest fVarF = this.viewModel.f();
        return fVarF == null ? new i.c(new IllegalStateException("Must call `configure` first before attempting to fetch the saved payment option!")) : CoroutineScopeKt.coroutineScope(new h(fVarF, null), continuation);
    }
}
