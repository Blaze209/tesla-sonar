package com.teslamotors.plugins.ble;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/teslamotors/plugins/ble/y;", "", "<init>", "()V", "b", "c", "a", "Lcom/teslamotors/plugins/ble/y$a;", "Lcom/teslamotors/plugins/ble/y$b;", "Lcom/teslamotors/plugins/ble/y$c;", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class y {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lcom/teslamotors/plugins/ble/y$a;", "Lcom/teslamotors/plugins/ble/y;", "", "id", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "Lcom/teslamotors/plugins/ble/y$a$a;", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class a extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: com.teslamotors.plugins.ble.y$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0017B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/teslamotors/plugins/ble/y$a$a;", "Lcom/teslamotors/plugins/ble/y$a;", "", "id", "vin", "Lcom/teslamotors/plugins/ble/y$a$a$b;", "type", "Lcom/teslamotors/plugins/ble/y$a$a$a;", "messageFormat", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/teslamotors/plugins/ble/y$a$a$b;Lcom/teslamotors/plugins/ble/y$a$a$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "a", "c", DateTokenConverter.CONVERTER_KEY, "Lcom/teslamotors/plugins/ble/y$a$a$b;", "()Lcom/teslamotors/plugins/ble/y$a$a$b;", "e", "Lcom/teslamotors/plugins/ble/y$a$a$a;", "()Lcom/teslamotors/plugins/ble/y$a$a$a;", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TransmissionError extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String vin;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final b type;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final EnumC1153a messageFormat;

            /* JADX INFO: renamed from: com.teslamotors.plugins.ble.y$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/teslamotors/plugins/ble/y$a$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "ROUTABLE_MESSAGE", "TO_VCSEC_MESSAGE", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public enum EnumC1153a {
                ROUTABLE_MESSAGE,
                TO_VCSEC_MESSAGE;

                private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

                public static EnumEntries<EnumC1153a> getEntries() {
                    return $ENTRIES;
                }
            }

            /* JADX INFO: renamed from: com.teslamotors.plugins.ble.y$a$a$b */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/teslamotors/plugins/ble/y$a$a$b;", "", "Lic0/h;", "commandResult", "<init>", "(Ljava/lang/String;ILic0/h;)V", "Lic0/h;", "getCommandResult", "()Lic0/h;", "SERVICE_NOT_BOUND", "SERVICE_NULL", "SERVICE_REMOTE_EXCEPTION", "TRANSMISSION_ERROR", "NOT_CONNECTED", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public enum b {
                SERVICE_NOT_BOUND(ic0.h.RESULT_BLE_SERVICE_DISCONNECTED),
                SERVICE_NULL(ic0.h.RESULT_BLE_SERVICE_NULL),
                SERVICE_REMOTE_EXCEPTION(ic0.h.RESULT_BLE_SERVICE_REMOTE_EXCEPTION),
                TRANSMISSION_ERROR(ic0.h.RESULT_TRANSMISSION_FAILURE),
                NOT_CONNECTED(ic0.h.RESULT_NOT_CONNECTED);

                private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
                private final ic0.h commandResult;

                b(ic0.h hVar) {
                    this.commandResult = hVar;
                }

                public static EnumEntries<b> getEntries() {
                    return $ENTRIES;
                }

                public final ic0.h getCommandResult() {
                    return this.commandResult;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TransmissionError(String id2, String vin, b type, EnumC1153a messageFormat) {
                super(id2, null);
                p013kotlin.jvm.internal.s.k(id2, "id");
                p013kotlin.jvm.internal.s.k(vin, "vin");
                p013kotlin.jvm.internal.s.k(type, "type");
                p013kotlin.jvm.internal.s.k(messageFormat, "messageFormat");
                this.id = id2;
                this.vin = vin;
                this.type = type;
                this.messageFormat = messageFormat;
            }

            @Override // com.teslamotors.plugins.ble.y.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final EnumC1153a getMessageFormat() {
                return this.messageFormat;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final b getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getVin() {
                return this.vin;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TransmissionError)) {
                    return false;
                }
                TransmissionError transmissionError = (TransmissionError) other;
                return p013kotlin.jvm.internal.s.f(this.id, transmissionError.id) && p013kotlin.jvm.internal.s.f(this.vin, transmissionError.vin) && this.type == transmissionError.type && this.messageFormat == transmissionError.messageFormat;
            }

            public int hashCode() {
                return (((((this.id.hashCode() * 31) + this.vin.hashCode()) * 31) + this.type.hashCode()) * 31) + this.messageFormat.hashCode();
            }

            public String toString() {
                return "TransmissionError(id=" + this.id + ", vin=" + this.vin + ", type=" + this.type + ", messageFormat=" + this.messageFormat + ")";
            }
        }

        public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* JADX INFO: renamed from: a */
        public abstract String getId();

        private a(String str) {
            super(null);
            this.id = str;
        }
    }

    /* JADX INFO: renamed from: com.teslamotors.plugins.ble.y$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/teslamotors/plugins/ble/y$b;", "Lcom/teslamotors/plugins/ble/y;", "Lsc0/h;", "message", "", "receivedBytesTimestamp", "<init>", "(Lsc0/h;J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsc0/h;", "()Lsc0/h;", "b", "J", "()J", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReceivedData extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final sc0.h message;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long receivedBytesTimestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceivedData(sc0.h message, long j11) {
            super(null);
            p013kotlin.jvm.internal.s.k(message, "message");
            this.message = message;
            this.receivedBytesTimestamp = j11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final sc0.h getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getReceivedBytesTimestamp() {
            return this.receivedBytesTimestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReceivedData)) {
                return false;
            }
            ReceivedData receivedData = (ReceivedData) other;
            return p013kotlin.jvm.internal.s.f(this.message, receivedData.message) && this.receivedBytesTimestamp == receivedData.receivedBytesTimestamp;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + Long.hashCode(this.receivedBytesTimestamp);
        }

        public String toString() {
            return "ReceivedData(message=" + this.message + ", receivedBytesTimestamp=" + this.receivedBytesTimestamp + ")";
        }
    }

    /* JADX INFO: renamed from: com.teslamotors.plugins.ble.y$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/teslamotors/plugins/ble/y$c;", "Lcom/teslamotors/plugins/ble/y;", "", "id", "vin", "Ldf0/b;", PermissionsResponse.STATUS_KEY, "", "receivedBytesTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ldf0/b;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", DateTokenConverter.CONVERTER_KEY, "c", "Ldf0/b;", "()Ldf0/b;", "Ljava/lang/Long;", "()Ljava/lang/Long;", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReceivedLegacyCommandResult extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String vin;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final df0.b status;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long receivedBytesTimestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceivedLegacyCommandResult(String id2, String vin, df0.b status, Long l11) {
            super(null);
            p013kotlin.jvm.internal.s.k(id2, "id");
            p013kotlin.jvm.internal.s.k(vin, "vin");
            p013kotlin.jvm.internal.s.k(status, "status");
            this.id = id2;
            this.vin = vin;
            this.status = status;
            this.receivedBytesTimestamp = l11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Long getReceivedBytesTimestamp() {
            return this.receivedBytesTimestamp;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final df0.b getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getVin() {
            return this.vin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReceivedLegacyCommandResult)) {
                return false;
            }
            ReceivedLegacyCommandResult receivedLegacyCommandResult = (ReceivedLegacyCommandResult) other;
            return p013kotlin.jvm.internal.s.f(this.id, receivedLegacyCommandResult.id) && p013kotlin.jvm.internal.s.f(this.vin, receivedLegacyCommandResult.vin) && this.status == receivedLegacyCommandResult.status && p013kotlin.jvm.internal.s.f(this.receivedBytesTimestamp, receivedLegacyCommandResult.receivedBytesTimestamp);
        }

        public int hashCode() {
            int iHashCode = ((((this.id.hashCode() * 31) + this.vin.hashCode()) * 31) + this.status.hashCode()) * 31;
            Long l11 = this.receivedBytesTimestamp;
            return iHashCode + (l11 == null ? 0 : l11.hashCode());
        }

        public String toString() {
            return "ReceivedLegacyCommandResult(id=" + this.id + ", vin=" + this.vin + ", status=" + this.status + ", receivedBytesTimestamp=" + this.receivedBytesTimestamp + ")";
        }
    }

    public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private y() {
    }
}
