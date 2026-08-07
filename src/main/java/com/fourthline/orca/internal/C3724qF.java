package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3724qF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GenericVerificationStatus f34782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdvStatus f34783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final QesStatus f34784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BavStatus f34785e;

    public C3724qF(String onboardingStatus, GenericVerificationStatus c4075yg, IdvStatus c3261fh, QesStatus vv2, BavStatus c3882u2) {
        p013kotlin.jvm.internal.s.k(onboardingStatus, "onboardingStatus");
        this.f34781a = onboardingStatus;
        this.f34782b = c4075yg;
        this.f34783c = c3261fh;
        this.f34784d = vv2;
        this.f34785e = c3882u2;
    }

    public final BavStatus a() {
        return this.f34785e;
    }

    public final GenericVerificationStatus b() {
        return this.f34782b;
    }

    public final IdvStatus c() {
        return this.f34783c;
    }

    public final QesStatus d() {
        return this.f34784d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3724qF)) {
            return false;
        }
        C3724qF c3724qF = (C3724qF) obj;
        return p013kotlin.jvm.internal.s.f(this.f34781a, c3724qF.f34781a) && p013kotlin.jvm.internal.s.f(this.f34782b, c3724qF.f34782b) && p013kotlin.jvm.internal.s.f(this.f34783c, c3724qF.f34783c) && p013kotlin.jvm.internal.s.f(this.f34784d, c3724qF.f34784d) && p013kotlin.jvm.internal.s.f(this.f34785e, c3724qF.f34785e);
    }

    public int hashCode() {
        int iHashCode = this.f34781a.hashCode() * 31;
        GenericVerificationStatus c4075yg = this.f34782b;
        int iHashCode2 = (iHashCode + (c4075yg == null ? 0 : c4075yg.hashCode())) * 31;
        IdvStatus c3261fh = this.f34783c;
        int iHashCode3 = (iHashCode2 + (c3261fh == null ? 0 : c3261fh.hashCode())) * 31;
        QesStatus vv2 = this.f34784d;
        int iHashCode4 = (iHashCode3 + (vv2 == null ? 0 : vv2.hashCode())) * 31;
        BavStatus c3882u2 = this.f34785e;
        return iHashCode4 + (c3882u2 != null ? c3882u2.hashCode() : 0);
    }

    public String toString() {
        return "WorkflowStatus(onboardingStatus=" + this.f34781a + ", genericVerificationStatus=" + this.f34782b + ", idvStatus=" + this.f34783c + ", qesStatus=" + this.f34784d + ", bavStatus=" + this.f34785e + ")";
    }

    public /* synthetic */ C3724qF(String str, GenericVerificationStatus c4075yg, IdvStatus c3261fh, QesStatus vv2, BavStatus c3882u2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : c4075yg, (i11 & 4) != 0 ? null : c3261fh, (i11 & 8) != 0 ? null : vv2, (i11 & 16) != 0 ? null : c3882u2);
    }
}
