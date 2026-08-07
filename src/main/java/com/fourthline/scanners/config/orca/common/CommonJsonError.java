package com.fourthline.scanners.config.orca.common;

import ch.qos.logback.core.joran.action.Action;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/fourthline/scanners/config/orca/common/CommonJsonError;", "Lcom/fourthline/scanners/config/orca/common/JsonError;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "errorCode", "", "getErrorCode", "()I", "DecodingError", "MissingFont", "UserCanceled", "JsonParseError", "ResultSerializationError", "IncorrectConfiguration", "FrameworkNotImported", "Unexpected", "Lcom/fourthline/scanners/config/orca/common/CommonJsonError$DecodingError;", "Lcom/fourthline/scanners/config/orca/common/CommonJsonError$FrameworkNotImported;", "Lcom/fourthline/scanners/config/orca/common/CommonJsonError$IncorrectConfiguration;", "Lcom/fourthline/scanners/config/orca/common/CommonJsonError$JsonParseError;", "Lcom/fourthline/scanners/config/orca/common/CommonJsonError$MissingFont;", "Lcom/fourthline/scanners/config/orca/common/CommonJsonError$ResultSerializationError;", "Lcom/fourthline/scanners/config/orca/common/CommonJsonError$Unexpected;", "Lcom/fourthline/scanners/config/orca/common/CommonJsonError$UserCanceled;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CommonJsonError extends JsonError {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/fourthline/scanners/config/orca/common/CommonJsonError$DecodingError;", "Lcom/fourthline/scanners/config/orca/common/CommonJsonError;", AnalyticsAttribute.Reason, "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DecodingError extends CommonJsonError {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String reason;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tJ\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¨\u0006\u000b"}, d2 = {"Lcom/fourthline/scanners/config/orca/common/CommonJsonError$DecodingError$Companion;", "", "<init>", "()V", "errorDecodingValueAtPath", "Lcom/fourthline/scanners/config/orca/common/CommonJsonError$DecodingError;", Action.KEY_ATTRIBUTE, "", "path", "", "errorMissingValueAtPath", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ DecodingError errorDecodingValueAtPath$default(Companion companion, String str, List list, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    list = v.m();
                }
                return companion.errorDecodingValueAtPath(str, list);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ DecodingError errorMissingValueAtPath$default(Companion companion, String str, List list, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    list = v.m();
                }
                return companion.errorMissingValueAtPath(str, list);
            }

            public final DecodingError errorDecodingValueAtPath(String key, List<String> path) {
                String str;
                s.k(key, "key");
                s.k(path, "path");
                if (path.isEmpty()) {
                    str = "root";
                } else {
                    str = v.y0(path, ".", null, null, 0, null, null, 62, null) + "." + key;
                }
                return new DecodingError("Could not deserialize the value for field '" + key + "' at path '" + str + "'.");
            }

            public final DecodingError errorMissingValueAtPath(String key, List<String> path) {
                s.k(key, "key");
                s.k(path, "path");
                return new DecodingError("Missing required field '" + key + "' at path '" + (path.isEmpty() ? "root" : v.y0(path, ".", null, null, 0, null, null, 62, null)) + "'.");
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DecodingError(String reason) {
            super(reason, null);
            s.k(reason, "reason");
            this.reason = reason;
        }

        public static /* synthetic */ DecodingError copy$default(DecodingError decodingError, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = decodingError.reason;
            }
            return decodingError.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final DecodingError copy(String reason) {
            s.k(reason, "reason");
            return new DecodingError(reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DecodingError) && s.f(this.reason, ((DecodingError) other).reason);
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "DecodingError(reason=" + this.reason + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/fourthline/scanners/config/orca/common/CommonJsonError$FrameworkNotImported;", "Lcom/fourthline/scanners/config/orca/common/CommonJsonError;", "framework", "", "<init>", "(Ljava/lang/String;)V", "getFramework", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FrameworkNotImported extends CommonJsonError {
        private final String framework;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FrameworkNotImported(String framework) {
            super(framework + " framework not found", null);
            s.k(framework, "framework");
            this.framework = framework;
        }

        public static /* synthetic */ FrameworkNotImported copy$default(FrameworkNotImported frameworkNotImported, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = frameworkNotImported.framework;
            }
            return frameworkNotImported.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFramework() {
            return this.framework;
        }

        public final FrameworkNotImported copy(String framework) {
            s.k(framework, "framework");
            return new FrameworkNotImported(framework);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FrameworkNotImported) && s.f(this.framework, ((FrameworkNotImported) other).framework);
        }

        public final String getFramework() {
            return this.framework;
        }

        public int hashCode() {
            return this.framework.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "FrameworkNotImported(framework=" + this.framework + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/scanners/config/orca/common/CommonJsonError$IncorrectConfiguration;", "Lcom/fourthline/scanners/config/orca/common/CommonJsonError;", "<init>", "()V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IncorrectConfiguration extends CommonJsonError {
        public static final IncorrectConfiguration INSTANCE = new IncorrectConfiguration();

        private IncorrectConfiguration() {
            super("Incorrect Configuration", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/scanners/config/orca/common/CommonJsonError$JsonParseError;", "Lcom/fourthline/scanners/config/orca/common/CommonJsonError;", "<init>", "()V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class JsonParseError extends CommonJsonError {
        public static final JsonParseError INSTANCE = new JsonParseError();

        private JsonParseError() {
            super("Json parse error", null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/fourthline/scanners/config/orca/common/CommonJsonError$MissingFont;", "Lcom/fourthline/scanners/config/orca/common/CommonJsonError;", "fontName", "", "<init>", "(Ljava/lang/String;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MissingFont extends CommonJsonError {
        private final String fontName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MissingFont(String fontName) {
            super("Could not find font: " + fontName, null);
            s.k(fontName, "fontName");
            this.fontName = fontName;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        private final String getFontName() {
            return this.fontName;
        }

        public static /* synthetic */ MissingFont copy$default(MissingFont missingFont, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = missingFont.fontName;
            }
            return missingFont.copy(str);
        }

        public final MissingFont copy(String fontName) {
            s.k(fontName, "fontName");
            return new MissingFont(fontName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MissingFont) && s.f(this.fontName, ((MissingFont) other).fontName);
        }

        public int hashCode() {
            return this.fontName.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "MissingFont(fontName=" + this.fontName + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/scanners/config/orca/common/CommonJsonError$ResultSerializationError;", "Lcom/fourthline/scanners/config/orca/common/CommonJsonError;", "<init>", "()V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResultSerializationError extends CommonJsonError {
        public static final ResultSerializationError INSTANCE = new ResultSerializationError();

        private ResultSerializationError() {
            super("Result serialization error", null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/fourthline/scanners/config/orca/common/CommonJsonError$Unexpected;", "Lcom/fourthline/scanners/config/orca/common/CommonJsonError;", AnalyticsAttribute.Reason, "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unexpected extends CommonJsonError {
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unexpected(String reason) {
            super("Unexpected - " + reason, null);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/scanners/config/orca/common/CommonJsonError$UserCanceled;", "Lcom/fourthline/scanners/config/orca/common/CommonJsonError;", "<init>", "()V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UserCanceled extends CommonJsonError {
        public static final UserCanceled INSTANCE = new UserCanceled();

        private UserCanceled() {
            super("User canceled", null);
        }
    }

    public /* synthetic */ CommonJsonError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.fourthline.scanners.config.orca.common.JsonError
    public int getErrorCode() {
        if (this instanceof DecodingError) {
            return 800;
        }
        if (this instanceof MissingFont) {
            return 802;
        }
        if (this instanceof UserCanceled) {
            return 803;
        }
        if (this instanceof JsonParseError) {
            return 830;
        }
        if (this instanceof ResultSerializationError) {
            return 840;
        }
        if (this instanceof IncorrectConfiguration) {
            return 850;
        }
        if (this instanceof FrameworkNotImported) {
            return 860;
        }
        if (this instanceof Unexpected) {
            return 870;
        }
        throw new NoWhenBranchMatchedException();
    }

    private CommonJsonError(String str) {
        super(str);
    }
}
