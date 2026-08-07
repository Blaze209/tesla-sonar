package com.stripe.android.paymentsheet;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/a;", "", "a", "b", "Lcom/stripe/android/paymentsheet/a$a;", "Lcom/stripe/android/paymentsheet/a$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/a$a;", "Lcom/stripe/android/paymentsheet/a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "", "displayMessage", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;)V", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C0968a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Exception cause;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String displayMessage;

        public C0968a(Exception cause, String str) {
            p013kotlin.jvm.internal.s.k(cause, "cause");
            this.cause = cause;
            this.displayMessage = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Exception getCause() {
            return this.cause;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDisplayMessage() {
            return this.displayMessage;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/a$b;", "Lcom/stripe/android/paymentsheet/a;", "", "clientSecret", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String clientSecret;

        public b(String clientSecret) {
            p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }
    }
}
