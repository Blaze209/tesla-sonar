package com.fourthline.orca.workflow;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0015\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowError;", "", "", "message", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Canceled", "InvalidSession", "InvalidWorkflowStatus", "ConfigurationNotSupported", "ClientRejected", "ModuleError", "Unexpected", "Lcom/fourthline/orca/workflow/WorkflowError$Canceled;", "Lcom/fourthline/orca/workflow/WorkflowError$ClientRejected;", "Lcom/fourthline/orca/workflow/WorkflowError$ConfigurationNotSupported;", "Lcom/fourthline/orca/workflow/WorkflowError$InvalidSession;", "Lcom/fourthline/orca/workflow/WorkflowError$InvalidWorkflowStatus;", "Lcom/fourthline/orca/workflow/WorkflowError$ModuleError;", "Lcom/fourthline/orca/workflow/WorkflowError$Unexpected;", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WorkflowError extends Throwable {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String message;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowError$Canceled;", "Lcom/fourthline/orca/workflow/WorkflowError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Canceled extends WorkflowError {
        public static final int $stable = 0;
        public static final Canceled INSTANCE = new Canceled();

        /* JADX WARN: Multi-variable type inference failed */
        private Canceled() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Canceled);
        }

        public int hashCode() {
            return 848846003;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Canceled";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowError$ClientRejected;", "Lcom/fourthline/orca/workflow/WorkflowError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClientRejected extends WorkflowError {
        public static final int $stable = 0;
        public static final ClientRejected INSTANCE = new ClientRejected();

        /* JADX WARN: Multi-variable type inference failed */
        private ClientRejected() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ClientRejected);
        }

        public int hashCode() {
            return 1348029955;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ClientRejected";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowError$ConfigurationNotSupported;", "Lcom/fourthline/orca/workflow/WorkflowError;", "", AnalyticsAttribute.Reason, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/fourthline/orca/workflow/WorkflowError$ConfigurationNotSupported;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getReason", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConfigurationNotSupported extends WorkflowError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfigurationNotSupported(String reason) {
            super(reason, null);
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowError$InvalidSession;", "Lcom/fourthline/orca/workflow/WorkflowError;", "", AnalyticsAttribute.Reason, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/fourthline/orca/workflow/WorkflowError$InvalidSession;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getReason", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidSession extends WorkflowError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidSession(String reason) {
            super(reason, null);
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowError$InvalidWorkflowStatus;", "Lcom/fourthline/orca/workflow/WorkflowError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidWorkflowStatus extends WorkflowError {
        public static final int $stable = 0;
        public static final InvalidWorkflowStatus INSTANCE = new InvalidWorkflowStatus();

        /* JADX WARN: Multi-variable type inference failed */
        private InvalidWorkflowStatus() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof InvalidWorkflowStatus);
        }

        public int hashCode() {
            return 1128115342;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidWorkflowStatus";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowError$ModuleError;", "Lcom/fourthline/orca/workflow/WorkflowError;", "", AnalyticsAttribute.Reason, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/fourthline/orca/workflow/WorkflowError$ModuleError;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getReason", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ModuleError extends WorkflowError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ModuleError(String reason) {
            super(reason, null);
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowError$Unexpected;", "Lcom/fourthline/orca/workflow/WorkflowError;", "", AnalyticsAttribute.Reason, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/fourthline/orca/workflow/WorkflowError$Unexpected;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getReason", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unexpected extends WorkflowError {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unexpected(String reason) {
            super(reason, null);
            s.k(reason, "reason");
            this.reason = reason;
        }

        public static /* synthetic */ Unexpected copy$default(Unexpected unexpected, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = unexpected.reason;
            }
            return unexpected.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final Unexpected copy(String reason) {
            s.k(reason, "reason");
            return new Unexpected(reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unexpected) && s.f(this.reason, ((Unexpected) other).reason);
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unexpected(reason=" + this.reason + ")";
        }
    }

    public /* synthetic */ WorkflowError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    private WorkflowError(String str) {
        super(str);
        this.message = str;
    }

    public /* synthetic */ WorkflowError(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, null);
    }
}
