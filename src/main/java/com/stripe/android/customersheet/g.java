package com.stripe.android.customersheet;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0006\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/customersheet/g;", "", "Lcom/stripe/android/customersheet/g$c;", "type", "<init>", "(Lcom/stripe/android/customersheet/g$c;)V", "a", "Lcom/stripe/android/customersheet/g$c;", "()Lcom/stripe/android/customersheet/g$c;", "b", "c", "Lcom/stripe/android/customersheet/g$a;", "Lcom/stripe/android/customersheet/g$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c type;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/customersheet/g$a;", "Lcom/stripe/android/customersheet/g;", "Lcom/stripe/android/customersheet/b;", "adapter", "<init>", "(Lcom/stripe/android/customersheet/b;)V", "b", "Lcom/stripe/android/customersheet/b;", "()Lcom/stripe/android/customersheet/b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final com.stripe.android.customersheet.b adapter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.stripe.android.customersheet.b adapter) {
            super(c.CustomerAdapter, null);
            p013kotlin.jvm.internal.s.k(adapter, "adapter");
            this.adapter = adapter;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final com.stripe.android.customersheet.b getAdapter() {
            return this.adapter;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/customersheet/g$b;", "Lcom/stripe/android/customersheet/g;", "Lcom/stripe/android/customersheet/d$e;", "customerSessionProvider", "Lcom/stripe/android/customersheet/d$e;", "b", "()Lcom/stripe/android/customersheet/d$e;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends g {
        public final d.e b() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/customersheet/g$c;", "", "", "analyticsValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getAnalyticsValue", "()Ljava/lang/String;", "CustomerAdapter", "CustomerSession", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum c {
        CustomerAdapter("customer_adapter"),
        CustomerSession("customer_session");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String analyticsValue;

        c(String str) {
            this.analyticsValue = str;
        }

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }

        public final String getAnalyticsValue() {
            return this.analyticsValue;
        }
    }

    public /* synthetic */ g(c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getType() {
        return this.type;
    }

    private g(c cVar) {
        this.type = cVar;
    }
}
