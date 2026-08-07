package com.fourthline.orca.internal;

import com.fourthline.core.Gender;
import com.fourthline.core.internal.ExtensionsKt;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Kp implements Jp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lp f26629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lp f26630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lp f26631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lp f26632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f26633e;

    public Kp(Lp userInputPersonBundle, Lp nfcPersonBundle, Lp remoteOcrPersonBundle, Lp localOcrPersonBundle) {
        p013kotlin.jvm.internal.s.k(userInputPersonBundle, "userInputPersonBundle");
        p013kotlin.jvm.internal.s.k(nfcPersonBundle, "nfcPersonBundle");
        p013kotlin.jvm.internal.s.k(remoteOcrPersonBundle, "remoteOcrPersonBundle");
        p013kotlin.jvm.internal.s.k(localOcrPersonBundle, "localOcrPersonBundle");
        this.f26629a = userInputPersonBundle;
        this.f26630b = nfcPersonBundle;
        this.f26631c = remoteOcrPersonBundle;
        this.f26632d = localOcrPersonBundle;
        this.f26633e = p013kotlin.collections.v.p(userInputPersonBundle, nfcPersonBundle, remoteOcrPersonBundle, localOcrPersonBundle);
    }

    @Override // com.fourthline.orca.internal.Jp
    public String a() {
        Iterator it = this.f26633e.iterator();
        while (it.hasNext()) {
            String strA = ((Lp) it.next()).a();
            if (strA != null) {
                return strA;
            }
        }
        return null;
    }

    @Override // com.fourthline.orca.internal.Jp
    public Date b() {
        Iterator it = this.f26633e.iterator();
        while (it.hasNext()) {
            Date dateB = ((Lp) it.next()).b();
            if (dateB != null) {
                return dateB;
            }
        }
        return null;
    }

    @Override // com.fourthline.orca.internal.Jp
    public String c() {
        Iterator it = this.f26633e.iterator();
        while (it.hasNext()) {
            String strC = ((Lp) it.next()).c();
            if (strC != null) {
                return strC;
            }
        }
        return null;
    }

    @Override // com.fourthline.orca.internal.Jp
    public Gender d() {
        Iterator it = this.f26633e.iterator();
        while (it.hasNext()) {
            Gender genderD = ((Lp) it.next()).d();
            if (genderD != null) {
                return genderD;
            }
        }
        return null;
    }

    @Override // com.fourthline.orca.internal.Jp
    public boolean e() {
        return Jp.a.c(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Kp)) {
            return false;
        }
        Kp kp2 = (Kp) obj;
        return p013kotlin.jvm.internal.s.f(this.f26629a, kp2.f26629a) && p013kotlin.jvm.internal.s.f(this.f26630b, kp2.f26630b) && p013kotlin.jvm.internal.s.f(this.f26631c, kp2.f26631c) && p013kotlin.jvm.internal.s.f(this.f26632d, kp2.f26632d);
    }

    @Override // com.fourthline.orca.internal.Jp
    public boolean f() {
        return Jp.a.e(this);
    }

    @Override // com.fourthline.orca.internal.Jp
    public String g() {
        Iterator it = this.f26633e.iterator();
        while (it.hasNext()) {
            String strG = ((Lp) it.next()).g();
            if (strG != null) {
                return strG;
            }
        }
        return null;
    }

    @Override // com.fourthline.orca.internal.Jp
    public String h() {
        String strAlpha3Code;
        Iterator it = this.f26633e.iterator();
        do {
            strAlpha3Code = null;
            if (!it.hasNext()) {
                break;
            }
            String strH = ((Lp) it.next()).h();
            if (strH != null) {
                strAlpha3Code = ExtensionsKt.alpha3Code(strH);
            }
        } while (strAlpha3Code == null);
        return strAlpha3Code;
    }

    public int hashCode() {
        return (((((this.f26629a.hashCode() * 31) + this.f26630b.hashCode()) * 31) + this.f26631c.hashCode()) * 31) + this.f26632d.hashCode();
    }

    @Override // com.fourthline.orca.internal.Jp
    public boolean i() {
        return Jp.a.h(this);
    }

    @Override // com.fourthline.orca.internal.Jp
    public boolean j() {
        return Jp.a.d(this);
    }

    @Override // com.fourthline.orca.internal.Jp
    public String k() {
        Iterator it = this.f26633e.iterator();
        while (it.hasNext()) {
            String strK = ((Lp) it.next()).k();
            if (strK != null) {
                return strK;
            }
        }
        return null;
    }

    @Override // com.fourthline.orca.internal.Jp
    public boolean l() {
        return Jp.a.b(this);
    }

    @Override // com.fourthline.orca.internal.Jp
    public String m() {
        Iterator it = this.f26633e.iterator();
        while (it.hasNext()) {
            String strM = ((Lp) it.next()).m();
            if (strM != null) {
                return strM;
            }
        }
        return null;
    }

    public final Lp n() {
        return this.f26632d;
    }

    public final Lp o() {
        return this.f26630b;
    }

    public final Lp p() {
        return this.f26631c;
    }

    public final Lp q() {
        return this.f26629a;
    }

    public String toString() {
        return "PersonBundleByPriority(userInputPersonBundle=" + this.f26629a + ", nfcPersonBundle=" + this.f26630b + ", remoteOcrPersonBundle=" + this.f26631c + ", localOcrPersonBundle=" + this.f26632d + ")";
    }
}
