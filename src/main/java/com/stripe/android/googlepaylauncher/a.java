package com.stripe.android.googlepaylauncher;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/googlepaylauncher/f$d;", "Lf30/i$a;", "a", "(Lcom/stripe/android/googlepaylauncher/f$d;)Lf30/i$a;", "Lcom/stripe/android/googlepaylauncher/h$c;", "b", "(Lcom/stripe/android/googlepaylauncher/h$c;)Lf30/i$a;", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: com.stripe.android.googlepaylauncher.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C0848a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f50747b;

        static {
            int[] iArr = new int[f.BillingAddressConfig.b.values().length];
            try {
                iArr[f.BillingAddressConfig.b.Min.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.BillingAddressConfig.b.Full.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f50746a = iArr;
            int[] iArr2 = new int[h.BillingAddressConfig.b.values().length];
            try {
                iArr2[h.BillingAddressConfig.b.Min.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[h.BillingAddressConfig.b.Full.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f50747b = iArr2;
        }
    }

    public static final f30.i.BillingAddressParameters a(f.BillingAddressConfig dVar) {
        f30.i.BillingAddressParameters.b bVar;
        s.k(dVar, "<this>");
        boolean zC = dVar.getIsRequired();
        int i11 = C0848a.f50746a[dVar.getFormat().ordinal()];
        if (i11 == 1) {
            bVar = f30.i.BillingAddressParameters.b.Min;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = f30.i.BillingAddressParameters.b.Full;
        }
        return new f30.i.BillingAddressParameters(zC, bVar, dVar.getIsPhoneNumberRequired());
    }

    public static final f30.i.BillingAddressParameters b(h.BillingAddressConfig billingAddressConfig) {
        f30.i.BillingAddressParameters.b bVar;
        s.k(billingAddressConfig, "<this>");
        boolean isRequired = billingAddressConfig.getIsRequired();
        int i11 = C0848a.f50747b[billingAddressConfig.getFormat().ordinal()];
        if (i11 == 1) {
            bVar = f30.i.BillingAddressParameters.b.Min;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = f30.i.BillingAddressParameters.b.Full;
        }
        return new f30.i.BillingAddressParameters(isRequired, bVar, billingAddressConfig.getIsPhoneNumberRequired());
    }
}
