package com.fourthline.orca.internal;

import android.app.PendingIntent;
import android.nfc.NfcAdapter;
import androidx.p002activity.ComponentActivity;
import androidx.p003lifecycle.Lifecycle;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3480kn {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kn$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.a.values().length];
            try {
                iArr[Lifecycle.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(int i11, p020r2.l lVar, int i12) {
        a(lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(p020r2.l lVar, final int i11) {
        p020r2.l lVarV = lVar.v(853238935);
        if (i11 == 0 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(853238935, i11, -1, "com.fourthline.orca.core.internal.capabilities.nfc.NfcForegroundDispatcher (NfcForegroundDispatcher.kt:21)");
            }
            final ComponentActivity componentActivity = (ComponentActivity) lVarV.U(AbstractC3311go.b());
            lVarV.o(-260525416);
            boolean zN = lVarV.n(componentActivity);
            Object objI = lVarV.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = NfcAdapter.getDefaultAdapter(componentActivity.getApplicationContext());
                lVarV.B(objI);
            }
            final NfcAdapter nfcAdapter = (NfcAdapter) objI;
            lVarV.l();
            lVarV.o(-260511161);
            boolean zK = lVarV.K(componentActivity) | lVarV.K(nfcAdapter);
            Object objI2 = lVarV.I();
            if (zK || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.z51
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3480kn.a(componentActivity, nfcAdapter, (Lifecycle.a) obj);
                    }
                };
                lVarV.B(objI2);
            }
            lVarV.l();
            AbstractC3140co.a((wn0.l) objI2, lVarV, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.a61
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3480kn.a(i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final jn0.h0 a(NfcAdapter nfcAdapter, ComponentActivity componentActivity) {
        if (nfcAdapter == null) {
            return null;
        }
        nfcAdapter.disableForegroundDispatch(componentActivity);
        return jn0.h0.f84049a;
    }

    private static final void a(ComponentActivity componentActivity, NfcAdapter nfcAdapter) {
        PendingIntent activity = PendingIntent.getActivity(componentActivity, 0, componentActivity.getIntent(), 33554432);
        if (nfcAdapter != null) {
            nfcAdapter.enableForegroundDispatch(componentActivity, activity, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(ComponentActivity componentActivity, NfcAdapter nfcAdapter, Lifecycle.a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        int i11 = a.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 1) {
            a(componentActivity, nfcAdapter);
        } else if (i11 == 2) {
            a(nfcAdapter, componentActivity);
        }
        return jn0.h0.f84049a;
    }
}
