package com.fourthline.orca.internal;

import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3839t2 {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.t2$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/fourthline/orca/internal/t2$a;", "", "", "provider", "Lcom/fourthline/orca/internal/n2;", "values", "<init>", "(Ljava/lang/String;Lcom/fourthline/orca/internal/n2;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getProvider", "b", "Lcom/fourthline/orca/internal/n2;", "()Lcom/fourthline/orca/internal/n2;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ro0.p(with = C3796s2.class)
    public static final /* data */ class BavStartPaymentResult {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String provider;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC3582n2 values;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.t2$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final ro0.d<BavStartPaymentResult> serializer() {
                return C3796s2.f35191a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public BavStartPaymentResult(String provider, AbstractC3582n2 values) {
            p013kotlin.jvm.internal.s.k(provider, "provider");
            p013kotlin.jvm.internal.s.k(values, "values");
            this.provider = provider;
            this.values = values;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC3582n2 getValues() {
            return this.values;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BavStartPaymentResult)) {
                return false;
            }
            BavStartPaymentResult bavStartPaymentResult = (BavStartPaymentResult) other;
            return p013kotlin.jvm.internal.s.f(this.provider, bavStartPaymentResult.provider) && p013kotlin.jvm.internal.s.f(this.values, bavStartPaymentResult.values);
        }

        public int hashCode() {
            return (this.provider.hashCode() * 31) + this.values.hashCode();
        }

        public String toString() {
            return "BavStartPaymentResult(provider=" + this.provider + ", values=" + this.values + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.t2$b */
    public interface b {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.t2$b$a */
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f35523a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f35524b;

            public a(String workflowId, String redirectUrl) {
                p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
                p013kotlin.jvm.internal.s.k(redirectUrl, "redirectUrl");
                this.f35523a = workflowId;
                this.f35524b = redirectUrl;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3839t2.b
            public String a() {
                return this.f35523a;
            }

            public final String b() {
                return this.f35524b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return p013kotlin.jvm.internal.s.f(this.f35523a, aVar.f35523a) && p013kotlin.jvm.internal.s.f(this.f35524b, aVar.f35524b);
            }

            public int hashCode() {
                return (this.f35523a.hashCode() * 31) + this.f35524b.hashCode();
            }

            public String toString() {
                return "Online(workflowId=" + this.f35523a + ", redirectUrl=" + this.f35524b + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.t2$b$b, reason: collision with other inner class name */
        public static final class C0616b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f35525a;

            public C0616b(String workflowId) {
                p013kotlin.jvm.internal.s.k(workflowId, "workflowId");
                this.f35525a = workflowId;
            }

            @Override // com.fourthline.orca.internal.InterfaceC3839t2.b
            public String a() {
                return this.f35525a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0616b) && p013kotlin.jvm.internal.s.f(this.f35525a, ((C0616b) obj).f35525a);
            }

            public int hashCode() {
                return this.f35525a.hashCode();
            }

            public String toString() {
                return "Sepa(workflowId=" + this.f35525a + ")";
            }
        }

        String a();
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.t2$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BavStartPaymentResult f35526a;

        public c(BavStartPaymentResult result) {
            p013kotlin.jvm.internal.s.k(result, "result");
            this.f35526a = result;
        }

        public final BavStartPaymentResult a() {
            return this.f35526a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p013kotlin.jvm.internal.s.f(this.f35526a, ((c) obj).f35526a);
        }

        public int hashCode() {
            return this.f35526a.hashCode();
        }

        public String toString() {
            return "Output(result=" + this.f35526a + ")";
        }
    }

    Object a(b bVar, Continuation continuation);
}
