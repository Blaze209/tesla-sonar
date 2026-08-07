package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: renamed from: com.plaid.internal.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4471l6 {

    /* JADX INFO: renamed from: com.plaid.internal.l6$a */
    public static final class a implements InterfaceC4471l6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC4525r7 f47844a;

        public a(AbstractC4525r7 twilioVerifySnaException) {
            p013kotlin.jvm.internal.s.k(twilioVerifySnaException, "twilioVerifySnaException");
            this.f47844a = twilioVerifySnaException;
        }

        public final AbstractC4525r7 a() {
            return this.f47844a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p013kotlin.jvm.internal.s.f(this.f47844a, ((a) obj).f47844a);
        }

        public final int hashCode() {
            return this.f47844a.hashCode();
        }

        public final String toString() {
            return "Fail(twilioVerifySnaException=" + this.f47844a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.l6$b */
    public static final class b implements InterfaceC4471l6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C4433h4 f47845a;

        public b(C4433h4 networkRequestResult) {
            p013kotlin.jvm.internal.s.k(networkRequestResult, "networkRequestResult");
            this.f47845a = networkRequestResult;
        }

        public final C4433h4 a() {
            return this.f47845a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p013kotlin.jvm.internal.s.f(this.f47845a, ((b) obj).f47845a);
        }

        public final int hashCode() {
            return this.f47845a.hashCode();
        }

        public final String toString() {
            return "Success(networkRequestResult=" + this.f47845a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }
}
