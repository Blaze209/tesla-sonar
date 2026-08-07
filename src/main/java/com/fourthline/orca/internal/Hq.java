package com.fourthline.orca.internal;

import com.fourthline.core.Gender;
import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.MrzInfo;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class Hq implements Gq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4104z8 f26139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Kp f26140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f26141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f26143e;

    public Hq(C4104z8 bundle, Kp personBundle, int i11) {
        MrzInfo mrzInfoE;
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        this.f26139a = bundle;
        this.f26140b = personBundle;
        this.f26141c = i11;
        Ql qlE = bundle.g().e();
        this.f26143e = (qlE == null || (mrzInfoE = qlE.e()) == null) ? false : !mrzInfoE.getValidationErrors().contains(MrtdMrzInfoValidationError.TRUNCATED_NAMES);
    }

    @Override // com.fourthline.orca.internal.Gq
    public void a(boolean z11) {
        this.f26142d = z11;
    }

    @Override // com.fourthline.orca.internal.Gq
    public void b(String str) {
        this.f26140b.q().b(str);
    }

    @Override // com.fourthline.orca.internal.Gq
    public String c() {
        return this.f26140b.c();
    }

    @Override // com.fourthline.orca.internal.Gq
    public Gender d() {
        return this.f26140b.d();
    }

    @Override // com.fourthline.orca.internal.Gq
    public boolean e() {
        return this.f26140b.j();
    }

    @Override // com.fourthline.orca.internal.Gq
    public boolean f() {
        return this.f26139a.j() != null && this.f26143e;
    }

    @Override // com.fourthline.orca.internal.Gq
    public boolean g() {
        return AbstractC3672p6.a(this.f26140b.q().b(), h());
    }

    @Override // com.fourthline.orca.internal.Gq
    public int h() {
        return this.f26141c;
    }

    @Override // com.fourthline.orca.internal.Gq
    public boolean i() {
        return Gq.a.a(this);
    }

    @Override // com.fourthline.orca.internal.Gq
    public boolean j() {
        return this.f26142d;
    }

    @Override // com.fourthline.orca.internal.Gq
    public boolean k() {
        return this.f26140b.f();
    }

    @Override // com.fourthline.orca.internal.Gq
    public boolean l() {
        return this.f26140b.e();
    }

    @Override // com.fourthline.orca.internal.Gq
    public boolean m() {
        return this.f26139a.j() != null && this.f26143e;
    }

    @Override // com.fourthline.orca.internal.Gq
    public String a() {
        return this.f26140b.a();
    }

    @Override // com.fourthline.orca.internal.Gq
    public Date b() {
        return this.f26140b.b();
    }

    @Override // com.fourthline.orca.internal.Gq
    public void a(String str) {
        this.f26140b.q().c(str);
    }

    @Override // com.fourthline.orca.internal.Gq
    public void a(Gender gender) {
        this.f26140b.q().a(gender);
    }

    @Override // com.fourthline.orca.internal.Gq
    public void a(Date date) {
        this.f26140b.q().a(date);
    }
}
