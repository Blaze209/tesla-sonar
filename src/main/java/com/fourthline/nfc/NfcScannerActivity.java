package com.fourthline.nfc;

import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.os.Bundle;
import androidx.appcompat.app.c;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsInterface;
import com.fourthline.core.DeviceMetadataKt;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.nfc.internal.C2802a0;
import com.fourthline.nfc.internal.G0;
import com.fourthline.nfc.internal.U;
import com.fourthline.nfc.internal.r;
import com.fourthline.nfc.internal.v0;
import com.fourthline.nfc.internal.x0;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0006R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010)¨\u0006+"}, d2 = {"Lcom/fourthline/nfc/NfcScannerActivity;", "Landroidx/appcompat/app/c;", "Lcom/fourthline/nfc/NfcScanner;", "Lcom/fourthline/nfc/NfcScannerCallback;", "Lcom/fourthline/nfc/NfcScannerDataSource;", "<init>", "()V", "Ljn0/h0;", "b", "e", "f", "Lcom/fourthline/nfc/internal/U;", "kotlin.jvm.PlatformType", "a", "()Lcom/fourthline/nfc/internal/U;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "Lcom/fourthline/nfc/internal/G0;", "Lcom/fourthline/nfc/internal/G0;", "nfcTagReader", "Lcom/fourthline/nfc/internal/v0;", "Lcom/fourthline/nfc/internal/v0;", "callback", "Landroid/nfc/NfcAdapter;", DateTokenConverter.CONVERTER_KEY, "()Landroid/nfc/NfcAdapter;", "nfcAdapter", "Lcom/fourthline/core/location/LocationProvider;", "c", "()Lcom/fourthline/core/location/LocationProvider;", "locationProvider", "Lcom/fourthline/nfc/NfcScannerStep;", "getStep", "()Lcom/fourthline/nfc/NfcScannerStep;", "step", "", "isSupported", "()Z", "isEnabled", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NfcScannerActivity extends c implements NfcScanner, NfcScannerCallback, NfcScannerDataSource {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private G0 nfcTagReader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private v0 callback;

    private final U a() {
        return r.a().a(new C2802a0(this, getConfig(), null, this, 4, null)).a();
    }

    private final void b() {
        v0 v0Var = this.callback;
        if (v0Var == null) {
            s.B("callback");
            v0Var = null;
        }
        if (!isSupported()) {
            v0Var.onFail(NfcScannerError.NFC_NOT_SUPPORTED);
        } else {
            if (isEnabled()) {
                return;
            }
            v0Var.onFail(NfcScannerError.NFC_NOT_ENABLED);
        }
    }

    private final LocationProvider c() {
        G0 g11 = this.nfcTagReader;
        if (g11 == null) {
            s.B("nfcTagReader");
            g11 = null;
        }
        return g11.a();
    }

    private final NfcAdapter d() {
        NfcManager nfcManager = (NfcManager) getSystemService("nfc");
        if (nfcManager != null) {
            return nfcManager.getDefaultAdapter();
        }
        return null;
    }

    private final void e() {
        if (isEnabled()) {
            NfcAdapter nfcAdapterD = d();
            v0 v0Var = null;
            if (nfcAdapterD != null) {
                G0 g11 = this.nfcTagReader;
                if (g11 == null) {
                    s.B("nfcTagReader");
                    g11 = null;
                }
                nfcAdapterD.enableReaderMode(this, g11, 387, null);
            }
            v0 v0Var2 = this.callback;
            if (v0Var2 == null) {
                s.B("callback");
            } else {
                v0Var = v0Var2;
            }
            v0Var.onStepUpdate(NfcScannerStep.LOOKING_FOR_DOCUMENT);
        }
    }

    private final void f() {
        NfcAdapter nfcAdapterD;
        if (!isEnabled() || (nfcAdapterD = d()) == null) {
            return;
        }
        nfcAdapterD.disableReaderMode(this);
    }

    @Override // com.fourthline.nfc.NfcScanner
    public NfcScannerStep getStep() {
        v0 v0Var = this.callback;
        return v0Var != null ? v0Var.a() : NfcScannerStep.LOOKING_FOR_DOCUMENT;
    }

    @Override // com.fourthline.nfc.NfcScanner
    public boolean isEnabled() {
        NfcAdapter nfcAdapterD = d();
        if (nfcAdapterD != null) {
            return nfcAdapterD.isEnabled();
        }
        return false;
    }

    @Override // com.fourthline.nfc.NfcScanner
    public boolean isSupported() {
        return d() != null;
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!DeviceMetadataKt.isDeviceRooted()) {
            U uA = a();
            this.nfcTagReader = uA.b();
            this.callback = uA.a();
        } else {
            AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
            if (analytics != null) {
                analytics.trackNew(x0.f24730a);
            }
            onFail(NfcScannerError.UNKNOWN);
            finish();
        }
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onPause() {
        super.onPause();
        f();
        c().cancelLocationRequest();
        G0 g11 = this.nfcTagReader;
        if (g11 == null) {
            s.B("nfcTagReader");
            g11 = null;
        }
        CoroutineScopeKt.cancel$default(g11, null, 1, null);
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onResume() {
        super.onResume();
        b();
        e();
        LocationProvider.DefaultImpls.requestLocation$default(c(), null, null, 3, null);
    }
}
