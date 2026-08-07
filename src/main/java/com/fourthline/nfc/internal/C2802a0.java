package com.fourthline.nfc.internal;

import android.content.Context;
import android.nfc.NfcAdapter;
import androidx.p002activity.result.ActivityResultRegistry;
import com.fourthline.core.ContextExtensionsKt;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.TimestampProviderInternal;
import com.fourthline.core.location.FourthlineLocationHelper;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.nfc.ExtraNfcScannerConfig;
import com.fourthline.nfc.NfcScannerCallback;
import com.fourthline.nfc.NfcScannerConfig;
import com.fourthline.nfc.NfcScannerSecurityKey;
import java.io.File;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2802a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NfcScannerConfig f24624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExtraNfcScannerConfig f24625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final NfcScannerCallback f24626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f24627e;

    public C2802a0(Context context, NfcScannerConfig nfcScannerConfig, ExtraNfcScannerConfig extraNfcScannerConfig, NfcScannerCallback nfcScannerCallback) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(nfcScannerConfig, "nfcScannerConfig");
        p013kotlin.jvm.internal.s.k(nfcScannerCallback, "nfcScannerCallback");
        this.f24623a = context;
        this.f24624b = nfcScannerConfig;
        this.f24625c = extraNfcScannerConfig;
        this.f24626d = nfcScannerCallback;
        this.f24627e = context.getApplicationContext();
    }

    public final ActivityResultRegistry a() {
        Object obj = this.f24623a;
        if ((obj instanceof h.d ? (h.d) obj : null) != null) {
            return ((h.d) obj).getActivityResultRegistry();
        }
        throw new IllegalStateException("Can't retrieve activityResultRegistry. Context's holder (Activity, Fragment etc) should implement ActivityResultRegistryOwner");
    }

    public final CoroutineContext b() {
        return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
    }

    public final InterfaceC2830u c() {
        return new C2831v();
    }

    public final G d() {
        Context applicationContext = this.f24627e;
        p013kotlin.jvm.internal.s.j(applicationContext, "applicationContext");
        return new G(new File(ContextExtensionsKt.getFourthlineDirectory(applicationContext)));
    }

    public final NfcAdapter e() {
        return NfcAdapter.getDefaultAdapter(this.f24627e);
    }

    public final K f() {
        return new Q(this.f24624b, this.f24625c);
    }

    public final TimestampProvider g() {
        return new TimestampProviderInternal();
    }

    public final LocationProvider a(ActivityResultRegistry activityResultRegistry) {
        p013kotlin.jvm.internal.s.k(activityResultRegistry, "activityResultRegistry");
        Context applicationContext = this.f24627e;
        p013kotlin.jvm.internal.s.j(applicationContext, "applicationContext");
        return FourthlineLocationHelper.getLocationProvider(applicationContext, activityResultRegistry);
    }

    public final X a(G jpeg2kConverter) {
        p013kotlin.jvm.internal.s.k(jpeg2kConverter, "jpeg2kConverter");
        return new F(jpeg2kConverter);
    }

    public final I0 a(X nfcImageConverter) {
        p013kotlin.jvm.internal.s.k(nfcImageConverter, "nfcImageConverter");
        NfcScannerSecurityKey key = this.f24624b.getKey();
        if (key instanceof NfcScannerSecurityKey.BapKey) {
            return new B((NfcScannerSecurityKey.BapKey) this.f24624b.getKey(), this.f24625c);
        }
        if (!(key instanceof NfcScannerSecurityKey.BacKey) && !(key instanceof NfcScannerSecurityKey.PaceKey)) {
            throw new NoWhenBranchMatchedException();
        }
        return new J(this.f24624b.getKey(), this.f24625c, nfcImageConverter);
    }

    public /* synthetic */ C2802a0(Context context, NfcScannerConfig nfcScannerConfig, ExtraNfcScannerConfig extraNfcScannerConfig, NfcScannerCallback nfcScannerCallback, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, nfcScannerConfig, (i11 & 4) != 0 ? null : extraNfcScannerConfig, nfcScannerCallback);
    }

    public final G0 a(I0 tagReaderService, TimestampProvider timestampProvider, v0 nfcScannerCallbackProxy, LocationProvider locationProvider, InterfaceC2830u dispatchersProvider, CoroutineContext coroutineContext) {
        p013kotlin.jvm.internal.s.k(tagReaderService, "tagReaderService");
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(nfcScannerCallbackProxy, "nfcScannerCallbackProxy");
        p013kotlin.jvm.internal.s.k(locationProvider, "locationProvider");
        p013kotlin.jvm.internal.s.k(dispatchersProvider, "dispatchersProvider");
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        return new H0(tagReaderService, nfcScannerCallbackProxy, timestampProvider, locationProvider, dispatchersProvider, coroutineContext);
    }

    public final v0 a(K nfcAnalytics) {
        p013kotlin.jvm.internal.s.k(nfcAnalytics, "nfcAnalytics");
        return new u0(this.f24626d, nfcAnalytics);
    }
}
