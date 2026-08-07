package com.stripe.android.paymentsheet.addresselement;

import java.util.Set;
import jn0.h0;
import p010i90.v0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import z80.AddressSpec;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/f;", "", "<init>", "()V", "", "condensedForm", "Lcom/stripe/android/paymentsheet/addresselement/d$b;", "config", "Lkotlin/Function0;", "Ljn0/h0;", "onNavigation", "Lz80/a;", "a", "(ZLcom/stripe/android/paymentsheet/addresselement/d$b;Lwn0/a;)Lz80/a;", "Lcom/stripe/android/paymentsheet/addresselement/d$a$b;", "configuration", "Li90/v0;", "b", "(Lcom/stripe/android/paymentsheet/addresselement/d$a$b;)Li90/v0;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f52405a = new f();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52406a;

        static {
            int[] iArr = new int[d.AdditionalFieldsConfiguration.b.values().length];
            try {
                iArr[d.AdditionalFieldsConfiguration.b.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.AdditionalFieldsConfiguration.b.OPTIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.AdditionalFieldsConfiguration.b.REQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f52406a = iArr;
        }
    }

    private f() {
    }

    public final AddressSpec a(boolean condensedForm, d.Configuration config, wn0.a<h0> onNavigation) {
        AddressSpec addressSpec;
        Set<String> setC;
        d.AdditionalFieldsConfiguration additionalFields;
        s.k(onNavigation, "onNavigation");
        AddressSpec addressSpecF = null;
        v0 v0VarB = b((config == null || (additionalFields = config.getAdditionalFields()) == null) ? null : additionalFields.getPhone());
        if (condensedForm) {
            addressSpec = new AddressSpec(null, null, null, false, new p010i90.i.ShippingCondensed(config != null ? config.getGooglePlacesApiKey() : null, config != null ? config.e() : null, v0VarB, onNavigation), false, 39, null);
        } else {
            addressSpec = new AddressSpec(null, null, null, false, new p010i90.i.ShippingExpanded(config != null ? config.getGooglePlacesApiKey() : null, config != null ? config.e() : null, v0VarB, onNavigation), false, 39, null);
        }
        if (config != null && (setC = config.c()) != null) {
            addressSpecF = AddressSpec.f(addressSpec, null, setC, null, false, null, false, 61, null);
        }
        return addressSpecF == null ? addressSpec : addressSpecF;
    }

    public final v0 b(d.AdditionalFieldsConfiguration.b configuration) {
        int i11 = configuration == null ? -1 : a.f52406a[configuration.ordinal()];
        if (i11 == -1) {
            return v0.OPTIONAL;
        }
        if (i11 == 1) {
            return v0.HIDDEN;
        }
        if (i11 == 2) {
            return v0.OPTIONAL;
        }
        if (i11 == 3) {
            return v0.REQUIRED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
