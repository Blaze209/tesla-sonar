package com.stripe.android.model;

import java.util.Iterator;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/r1;", "", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/util/Set;)V", "Ljava/util/Set;", "Companion", "a", "ApplePay", "GooglePay", "Masterpass", "VisaCheckout", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum r1 {
    ApplePay(p013kotlin.collections.d1.c("apple_pay")),
    GooglePay(p013kotlin.collections.d1.i("android_pay", "google")),
    Masterpass(p013kotlin.collections.d1.c("masterpass")),
    VisaCheckout(p013kotlin.collections.d1.c("visa_checkout"));

    private final Set<String> code;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.stripe.android.model.r1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/r1$a;", "", "<init>", "()V", "", "code", "Lcom/stripe/android/model/r1;", "a", "(Ljava/lang/String;)Lcom/stripe/android/model/r1;", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r1 a(String code) {
            r1 next;
            Iterator<r1> it = r1.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (p013kotlin.collections.v.g0(next.code, code)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private Companion() {
        }
    }

    r1(Set set) {
        this.code = set;
    }

    public static EnumEntries<r1> getEntries() {
        return $ENTRIES;
    }
}
