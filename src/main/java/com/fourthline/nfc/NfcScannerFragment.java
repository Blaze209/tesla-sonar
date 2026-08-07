package com.fourthline.nfc;

import android.content.Context;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0006R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*¨\u0006,"}, d2 = {"Lcom/fourthline/nfc/NfcScannerFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/fourthline/nfc/NfcScanner;", "Lcom/fourthline/nfc/NfcScannerCallback;", "Lcom/fourthline/nfc/NfcScannerDataSource;", "<init>", "()V", "Ljn0/h0;", "b", "f", "g", "Lcom/fourthline/nfc/internal/U;", "kotlin.jvm.PlatformType", "a", "()Lcom/fourthline/nfc/internal/U;", "c", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "Lcom/fourthline/nfc/internal/G0;", "Lcom/fourthline/nfc/internal/G0;", "nfcTagReader", "Lcom/fourthline/nfc/internal/v0;", "Lcom/fourthline/nfc/internal/v0;", "callback", "Landroid/nfc/NfcAdapter;", "e", "()Landroid/nfc/NfcAdapter;", "nfcAdapter", "Lcom/fourthline/core/location/LocationProvider;", DateTokenConverter.CONVERTER_KEY, "()Lcom/fourthline/core/location/LocationProvider;", "locationProvider", "Lcom/fourthline/nfc/NfcScannerStep;", "getStep", "()Lcom/fourthline/nfc/NfcScannerStep;", "step", "", "isSupported", "()Z", "isEnabled", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NfcScannerFragment extends Fragment implements NfcScanner, NfcScannerCallback, NfcScannerDataSource {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private G0 nfcTagReader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private v0 callback;

    private final U a() {
        r.a aVarA = r.a();
        Context contextRequireContext = requireContext();
        s.j(contextRequireContext, "requireContext(...)");
        return aVarA.a(new C2802a0(contextRequireContext, getConfig(), null, this, 4, null)).a();
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

    private final void c() {
        getParentFragmentManager().r().n(this).g();
    }

    private final LocationProvider d() {
        G0 g11 = this.nfcTagReader;
        if (g11 == null) {
            s.B("nfcTagReader");
            g11 = null;
        }
        return g11.a();
    }

    private final NfcAdapter e() {
        NfcManager nfcManager = (NfcManager) requireActivity().getSystemService("nfc");
        if (nfcManager != null) {
            return nfcManager.getDefaultAdapter();
        }
        return null;
    }

    private final void f() {
        if (isEnabled()) {
            NfcAdapter nfcAdapterE = e();
            v0 v0Var = null;
            if (nfcAdapterE != null) {
                u uVarRequireActivity = requireActivity();
                G0 g11 = this.nfcTagReader;
                if (g11 == null) {
                    s.B("nfcTagReader");
                    g11 = null;
                }
                nfcAdapterE.enableReaderMode(uVarRequireActivity, g11, 387, null);
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

    private final void g() {
        NfcAdapter nfcAdapterE;
        if (!isEnabled() || (nfcAdapterE = e()) == null) {
            return;
        }
        nfcAdapterE.disableReaderMode(requireActivity());
    }

    @Override // com.fourthline.nfc.NfcScanner
    public NfcScannerStep getStep() {
        v0 v0Var = this.callback;
        return v0Var != null ? v0Var.a() : NfcScannerStep.LOOKING_FOR_DOCUMENT;
    }

    @Override // com.fourthline.nfc.NfcScanner
    public boolean isEnabled() {
        NfcAdapter nfcAdapterE = e();
        if (nfcAdapterE != null) {
            return nfcAdapterE.isEnabled();
        }
        return false;
    }

    @Override // com.fourthline.nfc.NfcScanner
    public boolean isSupported() {
        return e() != null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
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
            c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (DeviceMetadataKt.isDeviceRooted()) {
            return;
        }
        g();
        d().cancelLocationRequest();
        G0 g11 = this.nfcTagReader;
        if (g11 == null) {
            s.B("nfcTagReader");
            g11 = null;
        }
        CoroutineScopeKt.cancel$default(g11, null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (DeviceMetadataKt.isDeviceRooted()) {
            return;
        }
        b();
        f();
        LocationProvider.DefaultImpls.requestLocation$default(d(), null, null, 3, null);
    }
}
