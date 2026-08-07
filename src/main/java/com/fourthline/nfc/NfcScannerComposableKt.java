package com.fourthline.nfc;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.nfc.internal.C2802a0;
import com.fourthline.nfc.internal.G0;
import com.fourthline.nfc.internal.U;
import com.fourthline.nfc.internal.r;
import jn0.h0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p020r2.Function0;
import p020r2.k0;
import p020r2.k2;
import p020r2.l;
import p020r2.l0;
import p020r2.o;
import p020r2.w2;
import wn0.p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0003\u001a'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0013*\u00020\u0000H\u0082\u0010¢\u0006\u0004\b\u0011\u0010\u0014\"\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0015*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u001a\u001a\u00020\u0013*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014¨\u0006\u001b"}, d2 = {"Landroid/content/Context;", "", "isNfcEnabled", "(Landroid/content/Context;)Z", "isNfcSupported", "Lcom/fourthline/nfc/NfcScannerConfig;", "config", "Lcom/fourthline/nfc/ExtraNfcScannerConfig;", "extraConfig", "Lcom/fourthline/nfc/NfcScannerCallback;", "callback", "Ljn0/h0;", "NfcScanner", "(Lcom/fourthline/nfc/NfcScannerConfig;Lcom/fourthline/nfc/ExtraNfcScannerConfig;Lcom/fourthline/nfc/NfcScannerCallback;Lr2/l;I)V", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/fourthline/nfc/internal/U;", "kotlin.jvm.PlatformType", "a", "(Landroid/content/Context;Lcom/fourthline/nfc/NfcScannerConfig;Lcom/fourthline/nfc/ExtraNfcScannerConfig;Lcom/fourthline/nfc/NfcScannerCallback;)Lcom/fourthline/nfc/internal/U;", "Landroid/app/Activity;", "(Landroid/content/Context;)Landroid/app/Activity;", "Landroid/nfc/NfcAdapter;", "c", "(Landroid/content/Context;)Landroid/nfc/NfcAdapter;", "nfcAdapter", "b", "activity", "fourthline-nfc_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NfcScannerComposableKt {
    public static final void NfcScanner(final NfcScannerConfig config, final ExtraNfcScannerConfig extraConfig, NfcScannerCallback callback, l lVar, final int i11) {
        int i12;
        final NfcScannerCallback nfcScannerCallback;
        s.k(config, "config");
        s.k(extraConfig, "extraConfig");
        s.k(callback, "callback");
        l lVarV = lVar.v(564587947);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.n(config) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.n(extraConfig) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= (i11 & 512) == 0 ? lVarV.n(callback) : lVarV.K(callback) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && lVarV.b()) {
            lVarV.j();
            nfcScannerCallback = callback;
        } else {
            if (o.J()) {
                o.S(564587947, i12, -1, "com.fourthline.nfc.NfcScanner (NfcScannerComposable.kt:41)");
            }
            final Context context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            lVarV.o(-1555543352);
            Object objI = lVarV.I();
            l.Companion companion = l.INSTANCE;
            if (objI == companion.a()) {
                objI = a(context, config, extraConfig, callback);
                lVarV.B(objI);
            }
            U u11 = (U) objI;
            lVarV.l();
            lVarV.o(-1555536682);
            Object objI2 = lVarV.I();
            if (objI2 == companion.a()) {
                objI2 = u11.c();
                lVarV.B(objI2);
            }
            final NfcAdapter nfcAdapter = (NfcAdapter) objI2;
            lVarV.l();
            lVarV.o(-1555534571);
            Object objI3 = lVarV.I();
            if (objI3 == companion.a()) {
                objI3 = u11.b();
                lVarV.B(objI3);
            }
            final G0 g11 = (G0) objI3;
            lVarV.l();
            lVarV.o(-1555532272);
            Object objI4 = lVarV.I();
            if (objI4 == companion.a()) {
                objI4 = g11.a();
                lVarV.B(objI4);
            }
            final LocationProvider locationProvider = (LocationProvider) objI4;
            lVarV.l();
            h0 h0Var = h0.f84049a;
            lVarV.o(-1555529388);
            boolean zK = ((i12 & 896) == 256 || ((i12 & 512) != 0 && lVarV.K(callback))) | lVarV.K(nfcAdapter) | lVarV.K(locationProvider) | lVarV.K(context) | lVarV.K(g11);
            Object objI5 = lVarV.I();
            if (zK || objI5 == companion.a()) {
                nfcScannerCallback = callback;
                wn0.l lVar2 = new wn0.l() { // from class: com.fourthline.nfc.a
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return NfcScannerComposableKt.a(nfcAdapter, nfcScannerCallback, locationProvider, context, g11, (l0) obj);
                    }
                };
                lVarV.B(lVar2);
                objI5 = lVar2;
            } else {
                nfcScannerCallback = callback;
            }
            lVarV.l();
            Function0.c(h0Var, (wn0.l) objI5, lVarV, 6);
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new p() { // from class: com.fourthline.nfc.b
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return NfcScannerComposableKt.a(config, extraConfig, nfcScannerCallback, i11, (l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(NfcScannerConfig nfcScannerConfig, ExtraNfcScannerConfig extraNfcScannerConfig, NfcScannerCallback nfcScannerCallback, int i11, l lVar, int i12) {
        NfcScanner(nfcScannerConfig, extraNfcScannerConfig, nfcScannerCallback, lVar, k2.a(i11 | 1));
        return h0.f84049a;
    }

    public static final boolean isNfcEnabled(Context context) {
        s.k(context, "<this>");
        NfcAdapter nfcAdapterC = c(context);
        if (nfcAdapterC != null) {
            return nfcAdapterC.isEnabled();
        }
        return false;
    }

    public static final boolean isNfcSupported(Context context) {
        s.k(context, "<this>");
        return c(context) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k0 a(final NfcAdapter nfcAdapter, NfcScannerCallback nfcScannerCallback, final LocationProvider locationProvider, final Context context, G0 g11, l0 DisposableEffect) {
        s.k(DisposableEffect, "$this$DisposableEffect");
        if (nfcAdapter == null) {
            nfcScannerCallback.onFail(NfcScannerError.NFC_NOT_SUPPORTED);
        } else if (nfcAdapter.isEnabled()) {
            LocationProvider.DefaultImpls.requestLocation$default(locationProvider, null, null, 3, null);
            nfcAdapter.enableReaderMode(b(context), g11, 387, null);
            nfcScannerCallback.onStepUpdate(NfcScannerStep.LOOKING_FOR_DOCUMENT);
        } else {
            nfcScannerCallback.onFail(NfcScannerError.NFC_NOT_ENABLED);
        }
        return new k0() { // from class: com.fourthline.nfc.NfcScannerComposableKt$NfcScanner$lambda$6$lambda$5$$inlined$onDispose$1
            @Override // p020r2.k0
            public void dispose() {
                locationProvider.cancelLocationRequest();
                NfcAdapter nfcAdapter2 = nfcAdapter;
                if (nfcAdapter2 != null) {
                    nfcAdapter2.disableReaderMode(NfcScannerComposableKt.b(context));
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Activity b(Context context) {
        Activity activityA = a(context);
        if (activityA != null) {
            return activityA;
        }
        throw new IllegalStateException("Composable NFC scanner should run inside of an activity!");
    }

    private static final NfcAdapter c(Context context) {
        NfcManager nfcManager = (NfcManager) context.getSystemService("nfc");
        if (nfcManager != null) {
            return nfcManager.getDefaultAdapter();
        }
        return null;
    }

    private static final U a(Context context, NfcScannerConfig nfcScannerConfig, ExtraNfcScannerConfig extraNfcScannerConfig, NfcScannerCallback nfcScannerCallback) {
        return r.a().a(new C2802a0(context, nfcScannerConfig, extraNfcScannerConfig, nfcScannerCallback)).a();
    }

    private static final Activity a(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            s.j(context, "getBaseContext(...)");
        }
        return (Activity) context;
    }
}
