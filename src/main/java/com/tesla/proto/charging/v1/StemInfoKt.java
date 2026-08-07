package com.tesla.proto.charging.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/tesla/proto/charging/v1/StemInfoKt;", "", "()V", "Dsl", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class StemInfoKt {
    public static final StemInfoKt INSTANCE = new StemInfoKt();

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010\"\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001b¨\u0006$"}, d2 = {"Lcom/tesla/proto/charging/v1/StemInfoKt$Dsl;", "", "Lcom/tesla/proto/charging/v1/StemCommonProto$StemInfo$Builder;", "_builder", "<init>", "(Lcom/tesla/proto/charging/v1/StemCommonProto$StemInfo$Builder;)V", "Lcom/tesla/proto/charging/v1/StemCommonProto$StemInfo;", "_build", "()Lcom/tesla/proto/charging/v1/StemCommonProto$StemInfo;", "Ljn0/h0;", "clearFwGithash", "()V", "clearSerialNumber", "clearPartNumber", "clearMeterId", "Lcom/tesla/proto/charging/v1/StemCommonProto$StemInfo$Builder;", "Lcom/google/protobuf/ByteString;", "value", "getFwGithash", "()Lcom/google/protobuf/ByteString;", "setFwGithash", "(Lcom/google/protobuf/ByteString;)V", "fwGithash", "", "getSerialNumber", "()Ljava/lang/String;", "setSerialNumber", "(Ljava/lang/String;)V", "serialNumber", "getPartNumber", "setPartNumber", "partNumber", "getMeterId", "setMeterId", "meterId", "Companion", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final StemCommonProto.StemInfo.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/tesla/proto/charging/v1/StemInfoKt$Dsl$Companion;", "", "()V", "_create", "Lcom/tesla/proto/charging/v1/StemInfoKt$Dsl;", "builder", "Lcom/tesla/proto/charging/v1/StemCommonProto$StemInfo$Builder;", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(StemCommonProto.StemInfo.Builder builder) {
                s.k(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(StemCommonProto.StemInfo.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ StemCommonProto.StemInfo _build() {
            StemCommonProto.StemInfo stemInfoBuild = this._builder.build();
            s.j(stemInfoBuild, "_builder.build()");
            return stemInfoBuild;
        }

        public final void clearFwGithash() {
            this._builder.clearFwGithash();
        }

        public final void clearMeterId() {
            this._builder.clearMeterId();
        }

        public final void clearPartNumber() {
            this._builder.clearPartNumber();
        }

        public final void clearSerialNumber() {
            this._builder.clearSerialNumber();
        }

        public final ByteString getFwGithash() {
            ByteString fwGithash = this._builder.getFwGithash();
            s.j(fwGithash, "_builder.getFwGithash()");
            return fwGithash;
        }

        public final String getMeterId() {
            String meterId = this._builder.getMeterId();
            s.j(meterId, "_builder.getMeterId()");
            return meterId;
        }

        public final String getPartNumber() {
            String partNumber = this._builder.getPartNumber();
            s.j(partNumber, "_builder.getPartNumber()");
            return partNumber;
        }

        public final String getSerialNumber() {
            String serialNumber = this._builder.getSerialNumber();
            s.j(serialNumber, "_builder.getSerialNumber()");
            return serialNumber;
        }

        public final void setFwGithash(ByteString value) {
            s.k(value, "value");
            this._builder.setFwGithash(value);
        }

        public final void setMeterId(String value) {
            s.k(value, "value");
            this._builder.setMeterId(value);
        }

        public final void setPartNumber(String value) {
            s.k(value, "value");
            this._builder.setPartNumber(value);
        }

        public final void setSerialNumber(String value) {
            s.k(value, "value");
            this._builder.setSerialNumber(value);
        }

        private Dsl(StemCommonProto.StemInfo.Builder builder) {
            this._builder = builder;
        }
    }

    private StemInfoKt() {
    }
}
