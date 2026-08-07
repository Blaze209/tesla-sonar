package com.fourthline.scanners.config.orca.workflow;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.scanners.config.orca.common.JsonError;
import com.google.android.gms.location.GeofenceStatusCodes;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError;", "Lcom/fourthline/scanners/config/orca/common/JsonError;", "errorMessage", "", "errorCode", "", "<init>", "(Ljava/lang/String;I)V", "getErrorCode", "()I", "MissingSession", "ClientRejected", "InvalidSession", "ModuleError", "ConfigurationNotSupported", "InvalidWorkflowStatus", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError$ClientRejected;", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError$ConfigurationNotSupported;", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError$InvalidSession;", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError$InvalidWorkflowStatus;", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError$MissingSession;", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError$ModuleError;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WorkflowJsonError extends JsonError {
    private final int errorCode;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError$ClientRejected;", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClientRejected extends WorkflowJsonError {
        public static final ClientRejected INSTANCE = new ClientRejected();

        private ClientRejected() {
            super("ClientRejected", 1000, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ClientRejected);
        }

        public int hashCode() {
            return -648903618;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ClientRejected";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError$ConfigurationNotSupported;", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError;", AnalyticsAttribute.Reason, "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConfigurationNotSupported extends WorkflowJsonError {
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfigurationNotSupported(String reason) {
            super("ConfigurationNotSupported - " + reason, 1003, null);
            s.k(reason, "reason");
            this.reason = reason;
        }

        public static /* synthetic */ ConfigurationNotSupported copy$default(ConfigurationNotSupported configurationNotSupported, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = configurationNotSupported.reason;
            }
            return configurationNotSupported.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final ConfigurationNotSupported copy(String reason) {
            s.k(reason, "reason");
            return new ConfigurationNotSupported(reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConfigurationNotSupported) && s.f(this.reason, ((ConfigurationNotSupported) other).reason);
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ConfigurationNotSupported(reason=" + this.reason + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError$InvalidSession;", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError;", AnalyticsAttribute.Reason, "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidSession extends WorkflowJsonError {
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidSession(String reason) {
            super("InvalidSession - " + reason, 1001, null);
            s.k(reason, "reason");
            this.reason = reason;
        }

        public static /* synthetic */ InvalidSession copy$default(InvalidSession invalidSession, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = invalidSession.reason;
            }
            return invalidSession.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final InvalidSession copy(String reason) {
            s.k(reason, "reason");
            return new InvalidSession(reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InvalidSession) && s.f(this.reason, ((InvalidSession) other).reason);
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidSession(reason=" + this.reason + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError$InvalidWorkflowStatus;", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidWorkflowStatus extends WorkflowJsonError {
        public static final InvalidWorkflowStatus INSTANCE = new InvalidWorkflowStatus();

        private InvalidWorkflowStatus() {
            super("InvalidWorkflowStatus", GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof InvalidWorkflowStatus);
        }

        public int hashCode() {
            return -796848653;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidWorkflowStatus";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError$MissingSession;", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MissingSession extends WorkflowJsonError {
        public static final MissingSession INSTANCE = new MissingSession();

        private MissingSession() {
            super("Incorrect Configuration: Workflow Session must be started before any operation.", 850, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MissingSession);
        }

        public int hashCode() {
            return -664244955;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "MissingSession";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError$ModuleError;", "Lcom/fourthline/scanners/config/orca/workflow/WorkflowJsonError;", AnalyticsAttribute.Reason, "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ModuleError extends WorkflowJsonError {
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ModuleError(String reason) {
            super("ModuleError - " + reason, 1002, null);
            s.k(reason, "reason");
            this.reason = reason;
        }

        public static /* synthetic */ ModuleError copy$default(ModuleError moduleError, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = moduleError.reason;
            }
            return moduleError.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final ModuleError copy(String reason) {
            s.k(reason, "reason");
            return new ModuleError(reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ModuleError) && s.f(this.reason, ((ModuleError) other).reason);
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ModuleError(reason=" + this.reason + ")";
        }
    }

    public /* synthetic */ WorkflowJsonError(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11);
    }

    @Override // com.fourthline.scanners.config.orca.common.JsonError
    public int getErrorCode() {
        return this.errorCode;
    }

    private WorkflowJsonError(String str, int i11) {
        super(str);
        this.errorCode = i11;
    }
}
