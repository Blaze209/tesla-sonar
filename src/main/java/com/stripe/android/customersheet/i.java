package com.stripe.android.customersheet;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/customersheet/i;", "", "<init>", "()V", "a", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/customersheet/i$a;", "Lcom/stripe/android/customersheet/i$c;", "Lcom/stripe/android/customersheet/i$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class i {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/customersheet/i$a;", "Lcom/stripe/android/customersheet/i;", "Lcom/stripe/android/customersheet/q;", "selection", "<init>", "(Lcom/stripe/android/customersheet/q;)V", "b", "Lcom/stripe/android/customersheet/q;", "a", "()Lcom/stripe/android/customersheet/q;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q selection;

        public a(q qVar) {
            super(null);
            this.selection = qVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final q getSelection() {
            return this.selection;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/customersheet/i$c;", "Lcom/stripe/android/customersheet/i;", "", "exception", "<init>", "(Ljava/lang/Throwable;)V", "b", "Ljava/lang/Throwable;", "a", "()Ljava/lang/Throwable;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Throwable exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable exception) {
            super(null);
            p013kotlin.jvm.internal.s.k(exception, "exception");
            this.exception = exception;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Throwable getException() {
            return this.exception;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/customersheet/i$d;", "Lcom/stripe/android/customersheet/i;", "Lcom/stripe/android/customersheet/q;", "selection", "<init>", "(Lcom/stripe/android/customersheet/q;)V", "b", "Lcom/stripe/android/customersheet/q;", "a", "()Lcom/stripe/android/customersheet/q;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q selection;

        public d(q qVar) {
            super(null);
            this.selection = qVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final q getSelection() {
            return this.selection;
        }
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private i() {
    }
}
