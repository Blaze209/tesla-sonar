package gk;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* JADX INFO: loaded from: classes3.dex */
@ro0.p
public final class q0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n0 f69110f = new n0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ro0.d[] f69111g = {null, q1.Companion.a(), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f69112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f69113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f69114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f69115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f69116e;

    public /* synthetic */ q0(int i11, v1 v1Var, q1 q1Var, d0 d0Var, d0 d0Var2, p pVar) {
        if (17 != (i11 & 17)) {
            vo0.h1.b(i11, 17, j0.f69073a.getDescriptor());
        }
        this.f69112a = v1Var;
        if ((i11 & 2) == 0) {
            this.f69113b = null;
        } else {
            this.f69113b = q1Var;
        }
        if ((i11 & 4) == 0) {
            this.f69114c = new d0("android", n0.a(f69110f));
        } else {
            this.f69114c = d0Var;
        }
        if ((i11 & 8) == 0) {
            this.f69115d = new d0(DevicePublicKeyStringDef.DIRECT, "1.1.0");
        } else {
            this.f69115d = d0Var2;
        }
        this.f69116e = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return p013kotlin.jvm.internal.s.f(this.f69112a, q0Var.f69112a) && this.f69113b == q0Var.f69113b && p013kotlin.jvm.internal.s.f(this.f69114c, q0Var.f69114c) && p013kotlin.jvm.internal.s.f(this.f69115d, q0Var.f69115d) && p013kotlin.jvm.internal.s.f(this.f69116e, q0Var.f69116e);
    }

    public final int hashCode() {
        int iHashCode = this.f69112a.hashCode() * 31;
        q1 q1Var = this.f69113b;
        int iHashCode2 = (this.f69115d.hashCode() + ((this.f69114c.hashCode() + ((iHashCode + (q1Var == null ? 0 : q1Var.hashCode())) * 31)) * 31)) * 31;
        p pVar = this.f69116e;
        return iHashCode2 + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return "DLLogEvent(event=" + this.f69112a + ", interfaceStyle=" + this.f69113b + ", platform=" + this.f69114c + ", sdk=" + this.f69115d + ", merchant=" + this.f69116e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public q0(v1 event, q1 q1Var, d0 platform, d0 sdk, p pVar) {
        p013kotlin.jvm.internal.s.k(event, "event");
        p013kotlin.jvm.internal.s.k(platform, "platform");
        p013kotlin.jvm.internal.s.k(sdk, "sdk");
        this.f69112a = event;
        this.f69113b = q1Var;
        this.f69114c = platform;
        this.f69115d = sdk;
        this.f69116e = pVar;
    }

    public /* synthetic */ q0(v1 v1Var, p pVar) {
        this(v1Var, null, new d0("android", n0.a(f69110f)), new d0(DevicePublicKeyStringDef.DIRECT, "1.1.0"), pVar);
    }
}
