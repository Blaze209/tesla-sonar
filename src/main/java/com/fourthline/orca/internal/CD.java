package com.fourthline.orca.internal;

import android.net.Uri;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class CD implements InterfaceC4109zD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4109zD f25195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f25196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f25197c;

    public CD(InterfaceC4109zD delegate) {
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        this.f25195a = delegate;
        this.f25196b = p013kotlin.collections.d1.i(Un.DriversLicence, Un.ResidencePermit);
        this.f25197c = p013kotlin.collections.d1.i(Un.DriversLicenceDark, Un.ResidencePermitDark);
    }

    @Override // com.fourthline.orca.internal.InterfaceC4109zD
    public Uri a(Un key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        Uri uriA = this.f25195a.a(key);
        if (this.f25196b.contains(key) && AbstractC3166dD.a(uriA)) {
            return this.f25195a.a(Un.IdCard);
        }
        return (this.f25197c.contains(key) && AbstractC3166dD.a(uriA)) ? this.f25195a.a(Un.IdCardDark) : uriA;
    }
}
