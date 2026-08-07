package com.stripe.android.paymentsheet.repositories;

import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\bB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException$a;", "failures", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "getFailures", "()Ljava/util/List;", "", "b", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DuplicatePaymentMethodDetachFailureException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<a> failures;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String message;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/repositories/DuplicatePaymentMethodDetachFailureException$a;", "", "", "paymentMethodId", "", "exception", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String paymentMethodId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Throwable exception;

        public a(String paymentMethodId, Throwable exception) {
            s.k(paymentMethodId, "paymentMethodId");
            s.k(exception, "exception");
            this.paymentMethodId = paymentMethodId;
            this.exception = exception;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Throwable getException() {
            return this.exception;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }
    }

    public DuplicatePaymentMethodDetachFailureException(List<a> failures) {
        s.k(failures, "failures");
        this.failures = failures;
        List<a> list = failures;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        for (a aVar : list) {
            String paymentMethodId = aVar.getPaymentMethodId();
            String message = aVar.getException().getMessage();
            if (message == null) {
                message = "Unknown reason";
            }
            arrayList.add("\n - (paymentMethodId: " + paymentMethodId + ", reason: " + message + ")");
        }
        this.message = "Failed to detach the following duplicates:" + arrayList;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
