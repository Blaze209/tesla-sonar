package com.fourthline.nfc.internal;

import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsInterface;
import com.fourthline.analytics.internal.AppGenericEvent;
import com.fourthline.nfc.NfcScannerSecurityKey;
import com.fourthline.nfc.NfcSecurityCheck;
import com.fourthline.nfc.NfcSecurityCheckStatus;
import java.util.List;
import net.sf.scuba.smartcards.CardServiceException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class J0 implements I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NfcScannerSecurityKey f24602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IsoDep f24604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected zo0.i f24605d;

    public J0(NfcScannerSecurityKey key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        this.f24602a = key;
        this.f24603b = true;
    }

    protected final void a(zo0.i iVar) {
        p013kotlin.jvm.internal.s.k(iVar, "<set-?>");
        this.f24605d = iVar;
    }

    @Override // com.fourthline.nfc.internal.I0
    public void b() throws NfcException.b {
        try {
            i();
        } catch (Throwable th2) {
            if (!a(th2)) {
                throw new NfcException.b(V.a(th2));
            }
        }
    }

    @Override // com.fourthline.nfc.internal.I0
    public List c() throws NfcException.d, NfcException.f {
        try {
            return j();
        } catch (Throwable th2) {
            if (a(th2)) {
                throw new NfcException.d(V.a(th2));
            }
            throw new NfcException.f(V.a(th2));
        }
    }

    @Override // com.fourthline.nfc.internal.I0
    public void close() {
        this.f24603b = true;
        try {
            if (this.f24605d == null || !g().j()) {
                return;
            }
            g().g();
        } catch (Exception e11) {
            AppGenericEvent appGenericEvent = new AppGenericEvent("nfc_cleanup_failed", e11);
            AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
            if (analytics != null) {
                analytics.trackNew(appGenericEvent);
            }
        }
    }

    public abstract m0 d();

    public abstract List e();

    public abstract I0.a f();

    protected final zo0.i g() {
        zo0.i iVar = this.f24605d;
        if (iVar != null) {
            return iVar;
        }
        p013kotlin.jvm.internal.s.B("isoDepTagService");
        return null;
    }

    public abstract void h();

    public abstract void i();

    public abstract List j();

    @Override // com.fourthline.nfc.internal.I0
    public void a(Tag tag) throws NfcException.e {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        try {
            IsoDep isoDep = IsoDep.get(tag);
            isoDep.setTimeout(15000);
            this.f24604c = isoDep;
            IsoDep isoDep2 = this.f24604c;
            if (isoDep2 == null) {
                p013kotlin.jvm.internal.s.B("isoDepTag");
                isoDep2 = null;
            }
            a(new zo0.i(isoDep2));
            h();
            this.f24603b = false;
        } catch (Throwable th2) {
            if (!a(th2)) {
                throw new NfcException.e(V.a(th2));
            }
        }
    }

    private final boolean b(Throwable th2) {
        String message = th2 != null ? th2.getMessage() : null;
        if (message == null) {
            return false;
        }
        return p013kotlin.text.t.f0(message, "tag was lost", true) || p013kotlin.text.t.f0(message, "not connected", true);
    }

    @Override // com.fourthline.nfc.internal.I0
    public NfcSecurityCheck a() {
        I0.b bVar;
        NfcSecurityCheck nfcSecurityCheck = null;
        for (T t11 : e()) {
            if (t11.isSupported()) {
                if (t11 instanceof z0) {
                    bVar = I0.b.f.f24587b;
                } else if (t11 instanceof C2821k) {
                    bVar = I0.b.d.f24584b;
                } else {
                    if (!(t11 instanceof C2801a)) {
                        return null;
                    }
                    bVar = I0.b.a.f24581b;
                }
                d().a(f(), bVar);
                try {
                    NfcSecurityCheck nfcSecurityCheckA = t11.a();
                    if (nfcSecurityCheckA.getStatus() == NfcSecurityCheckStatus.PASSED) {
                        d().b(f(), bVar);
                    } else {
                        d().a(f(), bVar, null);
                    }
                    nfcSecurityCheck = nfcSecurityCheckA;
                } catch (w0 unused) {
                }
            }
        }
        return nfcSecurityCheck;
    }

    @Override // com.fourthline.nfc.internal.InterfaceC2825o
    public boolean a(Throwable th2) {
        p013kotlin.jvm.internal.s.k(th2, "<this>");
        if (this.f24605d != null && (th2 instanceof Exception) && g().c((Exception) th2)) {
            return true;
        }
        if ((th2 instanceof CardServiceException) && b(th2)) {
            return true;
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            return a(cause);
        }
        return false;
    }
}
