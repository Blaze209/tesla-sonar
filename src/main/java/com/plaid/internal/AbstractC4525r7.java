package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: renamed from: com.plaid.internal.r7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4525r7 extends Exception {

    /* JADX INFO: renamed from: com.plaid.internal.r7$a */
    public static final class a extends AbstractC4525r7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f48094a = new a();

        public a() {
            super("Cellular network not available.", "ConnectivityManager established that a cellular network is not available, running on a simulator or a device with no sim card is no supported.", null, 4);
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.r7$b */
    public static final class b extends AbstractC4525r7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f48095a = new b();

        public b() {
            super("Invalid URL, please check the format.", "Unable to convert the URL string to an URL object.", null, 4);
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.r7$c */
    public static final class c extends AbstractC4525r7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f48096a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exception) {
            super("Networking error, cause: " + exception.getMessage(), null, exception, 2);
            p013kotlin.jvm.internal.s.k(exception, "exception");
            this.f48096a = exception;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f48096a, ((c) obj).f48096a);
        }

        public final int hashCode() {
            return this.f48096a.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "NetworkRequestException(exception=" + this.f48096a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.r7$d */
    public static final class d extends AbstractC4525r7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48097a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String result) {
            super("Unable to get a valid result from the requested URL (" + result + ").", "Unable to get a redirection path or a result path from the URL, probably the SNAURL is corrupted (or maybe expired).", null, 4);
            p013kotlin.jvm.internal.s.k(result, "result");
            this.f48097a = result;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p013kotlin.jvm.internal.s.f(this.f48097a, ((d) obj).f48097a);
        }

        public final int hashCode() {
            return this.f48097a.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "NoResultFromUrl(result=" + this.f48097a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.r7$e */
    public static final class e extends AbstractC4525r7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f48098a = new e();

        public e() {
            super("Can't run inside main thread.", null, null, 6);
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.r7$f */
    public static final class f extends AbstractC4525r7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f48099a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Exception exception) {
            super("Unexpected error happened: " + exception.getMessage() + CoreConstants.DOT, null, null, 6);
            p013kotlin.jvm.internal.s.k(exception, "exception");
            this.f48099a = exception;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && p013kotlin.jvm.internal.s.f(this.f48099a, ((f) obj).f48099a);
        }

        public final int hashCode() {
            return this.f48099a.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "UnexpectedException(exception=" + this.f48099a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public AbstractC4525r7(String str, String str2, Exception exc, int i11) {
        str2 = (i11 & 2) != 0 ? null : str2;
        exc = (i11 & 4) != 0 ? null : exc;
        StringBuilder sb2 = new StringBuilder("\n    ");
        sb2.append(str);
        sb2.append("\n    TechnicalError: ");
        sb2.append(str2 == null ? "Undefined" : str2);
        sb2.append("\n  ");
        super(p013kotlin.text.t.n(sb2.toString()), exc);
    }
}
