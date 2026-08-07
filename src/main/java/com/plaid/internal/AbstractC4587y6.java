package com.plaid.internal;

/* JADX INFO: renamed from: com.plaid.internal.y6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4587y6 {

    /* JADX INFO: renamed from: com.plaid.internal.y6$a */
    public static final class a extends AbstractC4587y6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48245a;

        public a(String receivedRedirectUri) {
            p013kotlin.jvm.internal.s.k(receivedRedirectUri, "receivedRedirectUri");
            this.f48245a = receivedRedirectUri;
        }

        public final String a() {
            return this.f48245a;
        }

        public final String toString() {
            return "OAuth";
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.y6$b */
    public static final class b extends AbstractC4587y6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48246a;

        public b(String receivedRedirectUri) {
            p013kotlin.jvm.internal.s.k(receivedRedirectUri, "receivedRedirectUri");
            this.f48246a = receivedRedirectUri;
        }

        public final String toString() {
            return "OutOfProcess";
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.y6$c */
    public static final class c extends AbstractC4587y6 {
        public final String toString() {
            return "OutOfProcessClosed";
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.y6$d */
    public static final class d extends AbstractC4587y6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f48247a;

        public d(Exception exception) {
            p013kotlin.jvm.internal.s.k(exception, "exception");
            this.f48247a = exception;
        }

        public final Exception a() {
            return this.f48247a;
        }

        public final String toString() {
            return "RedirectError";
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.y6$e */
    public static final class e extends AbstractC4587y6 {
        public final String toString() {
            return "ResumeInProcess";
        }
    }
}
