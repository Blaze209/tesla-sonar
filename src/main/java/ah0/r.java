package ah0;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import hi0.InquirySessionConfig;
import java.util.List;
import jn0.h0;
import oh0.l1;
import oi0.n5;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import y20.Snapshot;
import y20.w;
import y20.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0005.23,0B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0012\u001a\u00020\u0011*\u001e0\u000eR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\"\u0010\u0017\u001a\u001e0\u000eR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JU\u0010 \u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00110\u001e0\u001c0\u001b*\u00020\u001a2\"\u0010\u0017\u001a\u001e0\u000eR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020#2\u0006\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b(\u0010)JC\u0010*\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00032\"\u0010\u0017\u001a\u001e0\u000eR\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lah0/r;", "Ly20/k;", "Lah0/r$b;", "Lah0/r$e;", "Lah0/r$c;", "", "Landroid/content/Context;", "applicationContext", "Lii0/b;", "navigationStateManager", "Lah0/b$a;", "integrationBrowserWorkerFactory", "<init>", "(Landroid/content/Context;Lii0/b;Lah0/b$a;)V", "Ly20/k$a;", "Lah0/r$a;", "event", "Ljn0/h0;", "t", "(Ly20/k$a;Lah0/r$a;)V", "renderProps", "Lah0/r$e$a;", "renderState", CoreConstants.CONTEXT_SCOPE_VALUE, "p", "(Lah0/r$b;Lah0/r$e$a;Ly20/k$a;)V", "Lah0/e;", "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Loi0/n5;", "n", "(Lah0/e;Ly20/k$a;)Ljava/util/List;", "props", "Ly20/i;", "snapshot", "s", "(Lah0/r$b;Ly20/i;)Lah0/r$e;", "state", "y", "(Lah0/r$e;)Ly20/i;", "w", "(Lah0/r$b;Lah0/r$e;Ly20/k$a;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "b", "Lii0/b;", "c", "Lah0/b$a;", "e", DateTokenConverter.CONVERTER_KEY, "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r extends y20.k<Input, e, c, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ii0.b navigationStateManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b.a integrationBrowserWorkerFactory;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lah0/r$a;", "", "a", "b", "Lah0/r$a$a;", "Lah0/r$a$b;", "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ah0.r$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lah0/r$a$a;", "Lah0/r$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class C0039a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0039a f1092a = new C0039a();

            private C0039a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0039a);
            }

            public int hashCode() {
                return 224778200;
            }

            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lah0/r$a$b;", "Lah0/r$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f1093a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1979122029;
            }

            public String toString() {
                return "OpenBrowser";
            }
        }
    }

    /* JADX INFO: renamed from: ah0.r$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b#\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001e\u0010*R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b!\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b%\u0010:R\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b;\u0010)\u001a\u0004\b'\u0010*¨\u0006<"}, d2 = {"Lah0/r$b;", "", "", "inquiryId", "sessionToken", "stepName", "type", "flowUrl", "", "backStepEnabled", "cancelButtonEnabled", "Lhi0/g;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "transitionError", "Lah0/e;", "startPage", "isSubmitting", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLhi0/g;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lah0/e;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getInquiryId", "b", "getSessionToken", "c", "getStepName", DateTokenConverter.CONVERTER_KEY, "getType", "e", "f", "Z", "()Z", "g", "h", "Lhi0/g;", "getInquirySessionConfig", "()Lhi0/g;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "j", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "getTransitionError", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "k", "Lah0/e;", "()Lah0/e;", "l", "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String inquiryId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionToken;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stepName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String type;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String flowUrl;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean backStepEnabled;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final StepStyles.IntegrationStepStyle styles;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final InternalErrorInfo transitionError;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final ah0.e startPage;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSubmitting;

        public Input(String inquiryId, String sessionToken, String stepName, String type, String flowUrl, boolean z11, boolean z12, InquirySessionConfig inquirySessionConfig, StepStyles.IntegrationStepStyle integrationStepStyle, InternalErrorInfo internalErrorInfo, ah0.e eVar, boolean z13) {
            s.k(inquiryId, "inquiryId");
            s.k(sessionToken, "sessionToken");
            s.k(stepName, "stepName");
            s.k(type, "type");
            s.k(flowUrl, "flowUrl");
            s.k(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.stepName = stepName;
            this.type = type;
            this.flowUrl = flowUrl;
            this.backStepEnabled = z11;
            this.cancelButtonEnabled = z12;
            this.inquirySessionConfig = inquirySessionConfig;
            this.styles = integrationStepStyle;
            this.transitionError = internalErrorInfo;
            this.startPage = eVar;
            this.isSubmitting = z13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFlowUrl() {
            return this.flowUrl;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ah0.e getStartPage() {
            return this.startPage;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsSubmitting() {
            return this.isSubmitting;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return s.f(this.inquiryId, input.inquiryId) && s.f(this.sessionToken, input.sessionToken) && s.f(this.stepName, input.stepName) && s.f(this.type, input.type) && s.f(this.flowUrl, input.flowUrl) && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && s.f(this.inquirySessionConfig, input.inquirySessionConfig) && s.f(this.styles, input.styles) && s.f(this.transitionError, input.transitionError) && s.f(this.startPage, input.startPage) && this.isSubmitting == input.isSubmitting;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31) + this.stepName.hashCode()) * 31) + this.type.hashCode()) * 31) + this.flowUrl.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.inquirySessionConfig.hashCode()) * 31;
            StepStyles.IntegrationStepStyle integrationStepStyle = this.styles;
            int iHashCode2 = (iHashCode + (integrationStepStyle == null ? 0 : integrationStepStyle.hashCode())) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            int iHashCode3 = (iHashCode2 + (internalErrorInfo == null ? 0 : internalErrorInfo.hashCode())) * 31;
            ah0.e eVar = this.startPage;
            return ((iHashCode3 + (eVar != null ? eVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSubmitting);
        }

        public String toString() {
            return "Input(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", stepName=" + this.stepName + ", type=" + this.type + ", flowUrl=" + this.flowUrl + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", inquirySessionConfig=" + this.inquirySessionConfig + ", styles=" + this.styles + ", transitionError=" + this.transitionError + ", startPage=" + this.startPage + ", isSubmitting=" + this.isSubmitting + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lah0/r$c;", "", "b", "c", "a", "Lah0/r$c$a;", "Lah0/r$c$b;", "Lah0/r$c$c;", "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lah0/r$c$a;", "Lah0/r$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f1106a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1494152841;
            }

            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lah0/r$c$b;", "Lah0/r$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f1107a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 929193848;
            }

            public String toString() {
                return "Error";
            }
        }

        /* JADX INFO: renamed from: ah0.r$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lah0/r$c$c;", "Lah0/r$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class C0040c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0040c f1108a = new C0040c();

            private C0040c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0040c);
            }

            public int hashCode() {
                return -1519977214;
            }

            public String toString() {
                return "Finished";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lah0/r$d;", "Landroid/os/Parcelable;", "a", "Lah0/r$d$a;", "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface d extends Parcelable {

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lah0/r$d$a;", "Lah0/r$d;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f1109a = new a();
            public static final Parcelable.Creator<a> CREATOR = new C0041a();

            /* JADX INFO: renamed from: ah0.r$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C0041a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    parcel.readInt();
                    return a.f1109a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            private a() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 2035883520;
            }

            public String toString() {
                return "OpenBrowser";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                s.k(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lah0/r$e;", "Landroid/os/Parcelable;", "a", "Lah0/r$e$a;", "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface e extends Parcelable {

        /* JADX INFO: renamed from: ah0.r$e$a, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lah0/r$e$a;", "Lah0/r$e;", "Lah0/r$d;", "pendingAction", "<init>", "(Lah0/r$d;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Lah0/r$d;)Lah0/r$e$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lah0/r$d;", "b", "()Lah0/r$d;", "integration_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Starting implements e {
            public static final Parcelable.Creator<Starting> CREATOR = new C0042a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final d pendingAction;

            /* JADX INFO: renamed from: ah0.r$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C0042a implements Parcelable.Creator<Starting> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Starting createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new Starting((d) parcel.readParcelable(Starting.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Starting[] newArray(int i11) {
                    return new Starting[i11];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Starting() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final Starting a(d pendingAction) {
                return new Starting(pendingAction);
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final d getPendingAction() {
                return this.pendingAction;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Starting) && s.f(this.pendingAction, ((Starting) other).pendingAction);
            }

            public int hashCode() {
                d dVar = this.pendingAction;
                if (dVar == null) {
                    return 0;
                }
                return dVar.hashCode();
            }

            public String toString() {
                return "Starting(pendingAction=" + this.pendingAction + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                s.k(dest, "dest");
                dest.writeParcelable(this.pendingAction, flags);
            }

            public Starting(d dVar) {
                this.pendingAction = dVar;
            }

            public /* synthetic */ Starting(d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : dVar);
            }
        }
    }

    public r(Context applicationContext, ii0.b navigationStateManager, b.a integrationBrowserWorkerFactory) {
        s.k(applicationContext, "applicationContext");
        s.k(navigationStateManager, "navigationStateManager");
        s.k(integrationBrowserWorkerFactory, "integrationBrowserWorkerFactory");
        this.applicationContext = applicationContext;
        this.navigationStateManager = navigationStateManager;
        this.integrationBrowserWorkerFactory = integrationBrowserWorkerFactory;
    }

    private final List<Pair<String, wn0.l<n5, h0>>> n(ah0.e eVar, final y20.k<? super Input, e, ? extends c, ? extends Object>.a aVar) {
        return new mi0.b.a().a(eVar.getOpenBrowserButton(), new wn0.l() { // from class: ah0.p
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return r.o(this.f1086a, aVar, (n5) obj);
            }
        }).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 o(r rVar, y20.k.a aVar, n5 it) {
        s.k(it, "it");
        rVar.t(aVar, a.b.f1093a);
        return h0.f84049a;
    }

    private final void p(Input renderProps, final e.Starting renderState, y20.k<? super Input, e, ? extends c, ? extends Object>.a context) {
        d pendingAction = renderState.getPendingAction();
        if (!(pendingAction instanceof d.a)) {
            if (pendingAction != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            w.l(context, this.integrationBrowserWorkerFactory.a(renderProps.getFlowUrl(), f.f1063a.d(this.applicationContext)), o0.o(b.class), "", new wn0.l() { // from class: ah0.m
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r.q(this.f1084a, renderState, (b.InterfaceC0038b) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r q(r rVar, final e.Starting starting, b.InterfaceC0038b it) {
        s.k(it, "it");
        if (it instanceof b.InterfaceC0038b.a) {
            return z.d(rVar, null, new wn0.l() { // from class: ah0.q
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r.r(starting, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 r(e.Starting starting, y20.r.c action) {
        s.k(action, "$this$action");
        action.e(starting.a(null));
        action.d(c.C0040c.f1108a);
        return h0.f84049a;
    }

    private final void t(y20.k<? super Input, e, ? extends c, ? extends Object>.a aVar, a aVar2) {
        if (aVar2 instanceof a.C0039a) {
            aVar.c().b(z.d(this, null, new wn0.l() { // from class: ah0.n
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r.u((y20.r.c) obj);
                }
            }, 1, null));
        } else {
            if (!(aVar2 instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.c().b(z.d(this, null, new wn0.l() { // from class: ah0.o
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r.v((y20.r.c) obj);
                }
            }, 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 u(y20.r.c action) {
        s.k(action, "$this$action");
        action.d(c.a.f1106a);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 v(y20.r.c action) {
        s.k(action, "$this$action");
        Object objC = action.c();
        s.i(objC, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow.State.Starting");
        action.e(((e.Starting) objC).a(d.a.f1109a));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 x(r rVar, y20.k.a aVar) {
        rVar.t(aVar, a.C0039a.f1092a);
        return h0.f84049a;
    }

    @Override // y20.k
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e d(Input props, Snapshot snapshot) {
        s.k(props, "props");
        if (snapshot != null) {
            okio.k kVarB = snapshot.b();
            Parcelable parcelable = null;
            if (kVarB.D() <= 0) {
                kVarB = null;
            }
            if (kVarB != null) {
                Parcel parcelObtain = Parcel.obtain();
                s.j(parcelObtain, "obtain()");
                byte[] bArrJ = kVarB.J();
                parcelObtain.unmarshall(bArrJ, 0, bArrJ.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                s.h(parcelable);
                s.j(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
            }
            e eVar = (e) parcelable;
            if (eVar != null) {
                return eVar;
            }
        }
        return new e.Starting(d.a.f1109a);
    }

    @Override // y20.k
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Object f(Input renderProps, e renderState, final y20.k<? super Input, e, ? extends c, ? extends Object>.a context) {
        s.k(renderProps, "renderProps");
        s.k(renderState, "renderState");
        s.k(context, "context");
        if (!(renderState instanceof e.Starting)) {
            throw new NoWhenBranchMatchedException();
        }
        e.Starting starting = (e.Starting) renderState;
        p(renderProps, starting, context);
        this.navigationStateManager.c(renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), starting.getPendingAction() == null && !renderProps.getIsSubmitting());
        ah0.e startPage = renderProps.getStartPage();
        s.h(startPage);
        k kVar = new k(mi0.c.a(startPage), this.navigationStateManager.b(), new wn0.a() { // from class: ah0.l
            @Override // wn0.a
            public final Object invoke() {
                return r.x(this.f1082a, context);
            }
        }, n(renderProps.getStartPage(), context), starting.getPendingAction() != null || renderProps.getIsSubmitting());
        l1.c(kVar);
        return kVar;
    }

    @Override // y20.k
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Snapshot g(e state) {
        s.k(state, "state");
        return a30.s.a(state);
    }
}
