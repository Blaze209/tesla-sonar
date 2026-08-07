package com.fourthline.orca.internal;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.Uri;
import androidx.p002activity.ComponentActivity;
import androidx.p002activity.result.ActivityResultRegistry;
import androidx.p003lifecycle.ViewModelProvider;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.TimestampProviderInternal;
import com.fourthline.core.location.FourthlineLocationHelper;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.nfc.NfcScannerComposableKt;
import com.fourthline.orca.core.flavor.OrcaLocalization;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3152d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f31036f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f31037g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ComponentActivity f31038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OrcaLocalization f31039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f31040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rw f31041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3886u6 f31042e;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3152d(ComponentActivity activity, OrcaLocalization localization, wn0.a finishOrcaActivity) {
        p013kotlin.jvm.internal.s.k(activity, "activity");
        p013kotlin.jvm.internal.s.k(localization, "localization");
        p013kotlin.jvm.internal.s.k(finishOrcaActivity, "finishOrcaActivity");
        this.f31038a = activity;
        this.f31039b = localization;
        this.f31040c = finishOrcaActivity;
        this.f31041d = new Rw(activity, localization);
        this.f31042e = new U0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(C3152d c3152d) {
        return NfcScannerComposableKt.isNfcSupported(c3152d.f31038a);
    }

    public final InterfaceC3029a4 a(C3072b4 cellularManagerImpl) {
        p013kotlin.jvm.internal.s.k(cellularManagerImpl, "cellularManagerImpl");
        return cellularManagerImpl;
    }

    public final Activity b() {
        return this.f31038a;
    }

    public final ActivityResultRegistry d() {
        return this.f31038a.getActivityResultRegistry();
    }

    public final C3902ug i() {
        return new C3902ug(new wn0.a() { // from class: com.fourthline.orca.internal.wz0
            @Override // wn0.a
            public final Object invoke() {
                return C3152d.b(this.f36632a);
            }
        });
    }

    public final Locale j() {
        return this.f31041d.a();
    }

    public final LocationProvider k() {
        return FourthlineLocationHelper.getLocationProvider(this.f31038a);
    }

    public final wn0.a l() {
        return new wn0.a() { // from class: com.fourthline.orca.internal.vz0
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(C3152d.c(this.f36313a));
            }
        };
    }

    public final wn0.a m() {
        return new wn0.a() { // from class: com.fourthline.orca.internal.yz0
            @Override // wn0.a
            public final Object invoke() {
                return C3152d.d(this.f37160a);
            }
        };
    }

    public final Rw n() {
        return this.f31041d;
    }

    public final TimestampProvider o() {
        return new TimestampProviderInternal();
    }

    public final androidx.p003lifecycle.f1 p() {
        return this.f31038a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Locale b(C3152d c3152d) {
        return c3152d.f31041d.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Resources d(C3152d c3152d) {
        return c3152d.f31041d.b();
    }

    public final void a() {
        this.f31041d.c();
    }

    public final ContentResolver c() {
        ContentResolver contentResolver = this.f31038a.getContentResolver();
        p013kotlin.jvm.internal.s.j(contentResolver, "getContentResolver(...)");
        return contentResolver;
    }

    public final List e() {
        return Rw.a(this.f31041d, null, 1, null);
    }

    public final Context f() {
        return this.f31038a;
    }

    public final InterfaceC3886u6 g() {
        return this.f31042e;
    }

    public final Nf h() {
        return new Nf(new wn0.a() { // from class: com.fourthline.orca.internal.xz0
            @Override // wn0.a
            public final Object invoke() {
                return C3152d.a(this.f36864a);
            }
        });
    }

    public final void a(Intent intent) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        Uri data = intent.getData();
        if (data != null) {
            this.f31042e.a(data);
        }
    }

    public final InterfaceC3955vp a(InterfaceC3051ak mainRepository) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        boolean z11 = mainRepository instanceof If;
        return new C6(this.f31038a, mainRepository.getFlavor(), z11 ? false : mainRepository.e().getTenant().getRemoteAssets().getEnabled(), z11 ? false : mainRepository.e().getTenant().getBackButtonOnTop().getEnabled());
    }

    public final InterfaceC3997wo a(Ts resultRepository) {
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        return new C3268fo(resultRepository, this.f31040c);
    }

    public final CoroutineScope a(androidx.p003lifecycle.f1 viewModelStoreOwner) {
        p013kotlin.jvm.internal.s.k(viewModelStoreOwner, "viewModelStoreOwner");
        return androidx.p003lifecycle.d1.a(new ViewModelProvider(viewModelStoreOwner).a(p013kotlin.jvm.internal.o0.b(B5.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Locale a(C3152d c3152d) {
        return c3152d.f31041d.a();
    }

    public final Zk a(Context context, InterfaceC3997wo orcaDestroyer, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        Object systemService = context.getSystemService("connectivity");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        E4 e11 = new E4((ConnectivityManager) systemService, coroutineScope);
        orcaDestroyer.a((AutoCloseable) e11);
        return e11;
    }
}
