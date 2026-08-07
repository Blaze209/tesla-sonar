package de;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.paymentmethod.IssuerListPaymentMethod;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0003\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lde/a;", "", "", "a", "()Z", "shouldForceSend", "b", "Lde/a$a;", "Lde/a$b;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {
    /* JADX INFO: renamed from: a */
    boolean getShouldForceSend();

    /* JADX INFO: renamed from: de.a$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aBk\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001a\u0010\"R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b(\u0010\u0012R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001b\u001a\u0004\b$\u0010\u0012R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b)\u0010\u0012R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b#\u0010\u0012¨\u0006*"}, d2 = {"Lde/a$b;", "Lde/a;", "", "id", "", "timestamp", "", "shouldForceSend", "component", "Lde/a$b$a;", "type", "subType", "result", "target", "message", "<init>", "(Ljava/lang/String;JZLjava/lang/String;Lde/a$b$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "J", "h", "()J", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "e", "Lde/a$b$a;", IntegerTokenConverter.CONVERTER_KEY, "()Lde/a$b$a;", "f", "g", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Log implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timestamp;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldForceSend;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String component;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC1234a type;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String subType;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String result;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String target;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String message;

        /* JADX INFO: renamed from: de.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lde/a$b$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ACTION", "SUBMIT", "THREEDS2", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum EnumC1234a {
            ACTION("action"),
            SUBMIT("submit"),
            THREEDS2("ThreeDS2");

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            private final String value;

            EnumC1234a(String str) {
                this.value = str;
            }

            public static EnumEntries<EnumC1234a> getEntries() {
                return $ENTRIES;
            }

            public final String getValue() {
                return this.value;
            }
        }

        public Log(String id2, long j11, boolean z11, String component, EnumC1234a enumC1234a, String str, String str2, String str3, String str4) {
            s.k(id2, "id");
            s.k(component, "component");
            this.id = id2;
            this.timestamp = j11;
            this.shouldForceSend = z11;
            this.component = component;
            this.type = enumC1234a;
            this.subType = str;
            this.result = str2;
            this.target = str3;
            this.message = str4;
        }

        @Override // de.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getShouldForceSend() {
            return this.shouldForceSend;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getComponent() {
            return this.component;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Log)) {
                return false;
            }
            Log log = (Log) other;
            return s.f(this.id, log.id) && this.timestamp == log.timestamp && this.shouldForceSend == log.shouldForceSend && s.f(this.component, log.component) && this.type == log.type && s.f(this.subType, log.subType) && s.f(this.result, log.result) && s.f(this.target, log.target) && s.f(this.message, log.message);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSubType() {
            return this.subType;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getTarget() {
            return this.target;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + Boolean.hashCode(this.shouldForceSend)) * 31) + this.component.hashCode()) * 31;
            EnumC1234a enumC1234a = this.type;
            int iHashCode2 = (iHashCode + (enumC1234a == null ? 0 : enumC1234a.hashCode())) * 31;
            String str = this.subType;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.result;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.target;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.message;
            return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final EnumC1234a getType() {
            return this.type;
        }

        public String toString() {
            return "Log(id=" + this.id + ", timestamp=" + this.timestamp + ", shouldForceSend=" + this.shouldForceSend + ", component=" + this.component + ", type=" + this.type + ", subType=" + this.subType + ", result=" + this.result + ", target=" + this.target + ", message=" + this.message + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Log(String str, long j11, boolean z11, String str2, EnumC1234a enumC1234a, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i11 & 1) != 0) {
                str = UUID.randomUUID().toString();
                s.j(str, "toString(...)");
            }
            this(str, (i11 & 2) != 0 ? new Date().getTime() : j11, (i11 & 4) != 0 ? true : z11, str2, (i11 & 16) != 0 ? null : enumC1234a, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : str6);
        }
    }

    /* JADX INFO: renamed from: de.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u009b\u0001\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001e\u0010'R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b%\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b!\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b,\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u001f\u001a\u0004\b1\u0010\u0016R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u001f\u001a\u0004\b2\u0010\u0016R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b/\u00103\u001a\u0004\b(\u00104¨\u00065"}, d2 = {"Lde/a$a;", "Lde/a;", "", "id", "", "timestamp", "", "shouldForceSend", "component", "Lde/a$a$a;", "type", "target", "isStoredPaymentMethod", "brand", IssuerListPaymentMethod.ISSUER, "validationErrorCode", "validationErrorMessage", "", "configData", "<init>", "(Ljava/lang/String;JZLjava/lang/String;Lde/a$a$a;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "J", "h", "()J", "c", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "Lde/a$a$a;", IntegerTokenConverter.CONVERTER_KEY, "()Lde/a$a$a;", "f", "g", "Ljava/lang/Boolean;", "l", "()Ljava/lang/Boolean;", "j", "k", "Ljava/util/Map;", "()Ljava/util/Map;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Info implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timestamp;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldForceSend;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String component;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC1233a type;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String target;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isStoredPaymentMethod;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String brand;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String issuer;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String validationErrorCode;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String validationErrorMessage;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, String> configData;

        /* JADX INFO: renamed from: de.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lde/a$a$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "DISPLAYED", "DOWNLOAD", "FOCUS", "INPUT", "RENDERED", "SELECTED", "UNFOCUS", "VALIDATION_ERROR", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public enum EnumC1233a {
            DISPLAYED("displayed"),
            DOWNLOAD("download"),
            FOCUS("focus"),
            INPUT("input"),
            RENDERED("rendered"),
            SELECTED("selected"),
            UNFOCUS("unfocus"),
            VALIDATION_ERROR("validationError");

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
            private final String value;

            EnumC1233a(String str) {
                this.value = str;
            }

            public static EnumEntries<EnumC1233a> getEntries() {
                return $ENTRIES;
            }

            public final String getValue() {
                return this.value;
            }
        }

        public Info(String id2, long j11, boolean z11, String component, EnumC1233a enumC1233a, String str, Boolean bool, String str2, String str3, String str4, String str5, Map<String, String> map) {
            s.k(id2, "id");
            s.k(component, "component");
            this.id = id2;
            this.timestamp = j11;
            this.shouldForceSend = z11;
            this.component = component;
            this.type = enumC1233a;
            this.target = str;
            this.isStoredPaymentMethod = bool;
            this.brand = str2;
            this.issuer = str3;
            this.validationErrorCode = str4;
            this.validationErrorMessage = str5;
            this.configData = map;
        }

        @Override // de.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getShouldForceSend() {
            return this.shouldForceSend;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBrand() {
            return this.brand;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getComponent() {
            return this.component;
        }

        public final Map<String, String> d() {
            return this.configData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                return false;
            }
            Info info = (Info) other;
            return s.f(this.id, info.id) && this.timestamp == info.timestamp && this.shouldForceSend == info.shouldForceSend && s.f(this.component, info.component) && this.type == info.type && s.f(this.target, info.target) && s.f(this.isStoredPaymentMethod, info.isStoredPaymentMethod) && s.f(this.brand, info.brand) && s.f(this.issuer, info.issuer) && s.f(this.validationErrorCode, info.validationErrorCode) && s.f(this.validationErrorMessage, info.validationErrorMessage) && s.f(this.configData, info.configData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getIssuer() {
            return this.issuer;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getTarget() {
            return this.target;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + Boolean.hashCode(this.shouldForceSend)) * 31) + this.component.hashCode()) * 31;
            EnumC1233a enumC1233a = this.type;
            int iHashCode2 = (iHashCode + (enumC1233a == null ? 0 : enumC1233a.hashCode())) * 31;
            String str = this.target;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isStoredPaymentMethod;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.brand;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.issuer;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.validationErrorCode;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.validationErrorMessage;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Map<String, String> map = this.configData;
            return iHashCode8 + (map != null ? map.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final EnumC1233a getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getValidationErrorCode() {
            return this.validationErrorCode;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getValidationErrorMessage() {
            return this.validationErrorMessage;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final Boolean getIsStoredPaymentMethod() {
            return this.isStoredPaymentMethod;
        }

        public String toString() {
            return "Info(id=" + this.id + ", timestamp=" + this.timestamp + ", shouldForceSend=" + this.shouldForceSend + ", component=" + this.component + ", type=" + this.type + ", target=" + this.target + ", isStoredPaymentMethod=" + this.isStoredPaymentMethod + ", brand=" + this.brand + ", issuer=" + this.issuer + ", validationErrorCode=" + this.validationErrorCode + ", validationErrorMessage=" + this.validationErrorMessage + ", configData=" + this.configData + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Info(String str, long j11, boolean z11, String str2, EnumC1233a enumC1233a, String str3, Boolean bool, String str4, String str5, String str6, String str7, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            String str8;
            if ((i11 & 1) != 0) {
                String string = UUID.randomUUID().toString();
                s.j(string, "toString(...)");
                str8 = string;
            } else {
                str8 = str;
            }
            this(str8, (i11 & 2) != 0 ? new Date().getTime() : j11, (i11 & 4) != 0 ? false : z11, str2, (i11 & 16) != 0 ? null : enumC1233a, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : bool, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? null : str5, (i11 & 512) != 0 ? null : str6, (i11 & 1024) != 0 ? null : str7, (i11 & 2048) != 0 ? null : map);
        }
    }
}
