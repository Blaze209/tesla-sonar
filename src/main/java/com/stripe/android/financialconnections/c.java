package com.stripe.android.financialconnections;

import com.google.android.gms.common.internal.ImagesContract;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/c;", "", "<init>", "()V", "a", "b", "c", "Lcom/stripe/android/financialconnections/c$a;", "Lcom/stripe/android/financialconnections/c$b;", "Lcom/stripe/android/financialconnections/c$c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/financialconnections/c$a;", "Lcom/stripe/android/financialconnections/c;", "Lcom/stripe/android/financialconnections/launcher/b;", "result", "", "finishToast", "<init>", "(Lcom/stripe/android/financialconnections/launcher/b;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/financialconnections/launcher/b;", "b", "()Lcom/stripe/android/financialconnections/launcher/b;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishWithResult extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final com.stripe.android.financialconnections.launcher.b result;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer finishToast;

        public /* synthetic */ FinishWithResult(com.stripe.android.financialconnections.launcher.b bVar, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i11 & 2) != 0 ? null : num);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getFinishToast() {
            return this.finishToast;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final com.stripe.android.financialconnections.launcher.b getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinishWithResult)) {
                return false;
            }
            FinishWithResult finishWithResult = (FinishWithResult) other;
            return s.f(this.result, finishWithResult.result) && s.f(this.finishToast, finishWithResult.finishToast);
        }

        public int hashCode() {
            int iHashCode = this.result.hashCode() * 31;
            Integer num = this.finishToast;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "FinishWithResult(result=" + this.result + ", finishToast=" + this.finishToast + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinishWithResult(com.stripe.android.financialconnections.launcher.b result, Integer num) {
            super(null);
            s.k(result, "result");
            this.result = result;
            this.finishToast = num;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/c$b;", "Lcom/stripe/android/financialconnections/c;", "", ImagesContract.URL, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAuthFlowWithUrl extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenAuthFlowWithUrl(String url) {
            super(null);
            s.k(url, "url");
            this.url = url;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenAuthFlowWithUrl) && s.f(this.url, ((OpenAuthFlowWithUrl) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "OpenAuthFlowWithUrl(url=" + this.url + ")";
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.financialconnections.c$c, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/financialconnections/c$c;", "Lcom/stripe/android/financialconnections/c;", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "Lcom/stripe/android/financialconnections/model/k0;", "initialSyncResponse", "Lcom/stripe/android/financialconnections/a$c;", "elementsSessionContext", "<init>", "(Lcom/stripe/android/financialconnections/a$b;Lcom/stripe/android/financialconnections/model/k0;Lcom/stripe/android/financialconnections/a$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/financialconnections/a$b;", "()Lcom/stripe/android/financialconnections/a$b;", "b", "Lcom/stripe/android/financialconnections/model/k0;", "c", "()Lcom/stripe/android/financialconnections/model/k0;", "Lcom/stripe/android/financialconnections/a$c;", "()Lcom/stripe/android/financialconnections/a$c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenNativeAuthFlow extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a.Configuration configuration;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final SynchronizeSessionResponse initialSyncResponse;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final a.ElementsSessionContext elementsSessionContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenNativeAuthFlow(a.Configuration configuration, SynchronizeSessionResponse initialSyncResponse, a.ElementsSessionContext elementsSessionContext) {
            super(null);
            s.k(configuration, "configuration");
            s.k(initialSyncResponse, "initialSyncResponse");
            this.configuration = configuration;
            this.initialSyncResponse = initialSyncResponse;
            this.elementsSessionContext = elementsSessionContext;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a.Configuration getConfiguration() {
            return this.configuration;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a.ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final SynchronizeSessionResponse getInitialSyncResponse() {
            return this.initialSyncResponse;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenNativeAuthFlow)) {
                return false;
            }
            OpenNativeAuthFlow openNativeAuthFlow = (OpenNativeAuthFlow) other;
            return s.f(this.configuration, openNativeAuthFlow.configuration) && s.f(this.initialSyncResponse, openNativeAuthFlow.initialSyncResponse) && s.f(this.elementsSessionContext, openNativeAuthFlow.elementsSessionContext);
        }

        public int hashCode() {
            int iHashCode = ((this.configuration.hashCode() * 31) + this.initialSyncResponse.hashCode()) * 31;
            a.ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            return iHashCode + (elementsSessionContext == null ? 0 : elementsSessionContext.hashCode());
        }

        public String toString() {
            return "OpenNativeAuthFlow(configuration=" + this.configuration + ", initialSyncResponse=" + this.initialSyncResponse + ", elementsSessionContext=" + this.elementsSessionContext + ")";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
