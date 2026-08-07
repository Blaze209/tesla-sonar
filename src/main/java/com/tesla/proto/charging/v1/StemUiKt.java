package com.tesla.proto.charging.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/tesla/proto/charging/v1/StemUiKt;", "", "()V", "Dsl", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class StemUiKt {
    public static final StemUiKt INSTANCE = new StemUiKt();

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R$\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010)\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010,\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R$\u0010/\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020$8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R$\u00105\u001a\u0002002\u0006\u0010\u0018\u001a\u0002008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010;\u001a\u0002062\u0006\u0010\u0018\u001a\u0002068G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/tesla/proto/charging/v1/StemUiKt$Dsl;", "", "Lcom/tesla/proto/charging/v1/StemUiProto$StemUi$Builder;", "_builder", "<init>", "(Lcom/tesla/proto/charging/v1/StemUiProto$StemUi$Builder;)V", "Lcom/tesla/proto/charging/v1/StemUiProto$StemUi;", "_build", "()Lcom/tesla/proto/charging/v1/StemUiProto$StemUi;", "Ljn0/h0;", "clearStemInfo", "()V", "", "hasStemInfo", "()Z", "clearSessionId", "clearSystemTimeEpochS", "clearIdleTimeS", "clearStartTimeEpochS", "clearStemEventInfo", "hasStemEventInfo", "clearSessionEnergyKwh", "Lcom/tesla/proto/charging/v1/StemUiProto$StemUi$Builder;", "Lcom/tesla/proto/charging/v1/StemCommonProto$StemInfo;", "value", "getStemInfo", "()Lcom/tesla/proto/charging/v1/StemCommonProto$StemInfo;", "setStemInfo", "(Lcom/tesla/proto/charging/v1/StemCommonProto$StemInfo;)V", "stemInfo", "", "getSessionId", "()I", "setSessionId", "(I)V", "sessionId", "", "getSystemTimeEpochS", "()J", "setSystemTimeEpochS", "(J)V", "systemTimeEpochS", "getIdleTimeS", "setIdleTimeS", "idleTimeS", "getStartTimeEpochS", "setStartTimeEpochS", "startTimeEpochS", "Lcom/tesla/proto/charging/v1/StemCommonProto$StemEventInfo;", "getStemEventInfo", "()Lcom/tesla/proto/charging/v1/StemCommonProto$StemEventInfo;", "setStemEventInfo", "(Lcom/tesla/proto/charging/v1/StemCommonProto$StemEventInfo;)V", "stemEventInfo", "", "getSessionEnergyKwh", "()F", "setSessionEnergyKwh", "(F)V", "sessionEnergyKwh", "Companion", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final StemUiProto.StemUi.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/tesla/proto/charging/v1/StemUiKt$Dsl$Companion;", "", "()V", "_create", "Lcom/tesla/proto/charging/v1/StemUiKt$Dsl;", "builder", "Lcom/tesla/proto/charging/v1/StemUiProto$StemUi$Builder;", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(StemUiProto.StemUi.Builder builder) {
                s.k(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(StemUiProto.StemUi.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ StemUiProto.StemUi _build() {
            StemUiProto.StemUi stemUiBuild = this._builder.build();
            s.j(stemUiBuild, "_builder.build()");
            return stemUiBuild;
        }

        public final void clearIdleTimeS() {
            this._builder.clearIdleTimeS();
        }

        public final void clearSessionEnergyKwh() {
            this._builder.clearSessionEnergyKwh();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final void clearStartTimeEpochS() {
            this._builder.clearStartTimeEpochS();
        }

        public final void clearStemEventInfo() {
            this._builder.clearStemEventInfo();
        }

        public final void clearStemInfo() {
            this._builder.clearStemInfo();
        }

        public final void clearSystemTimeEpochS() {
            this._builder.clearSystemTimeEpochS();
        }

        public final int getIdleTimeS() {
            return this._builder.getIdleTimeS();
        }

        public final float getSessionEnergyKwh() {
            return this._builder.getSessionEnergyKwh();
        }

        public final int getSessionId() {
            return this._builder.getSessionId();
        }

        public final long getStartTimeEpochS() {
            return this._builder.getStartTimeEpochS();
        }

        public final StemCommonProto.StemEventInfo getStemEventInfo() {
            StemCommonProto.StemEventInfo stemEventInfo = this._builder.getStemEventInfo();
            s.j(stemEventInfo, "_builder.getStemEventInfo()");
            return stemEventInfo;
        }

        public final StemCommonProto.StemInfo getStemInfo() {
            StemCommonProto.StemInfo stemInfo = this._builder.getStemInfo();
            s.j(stemInfo, "_builder.getStemInfo()");
            return stemInfo;
        }

        public final long getSystemTimeEpochS() {
            return this._builder.getSystemTimeEpochS();
        }

        public final boolean hasStemEventInfo() {
            return this._builder.hasStemEventInfo();
        }

        public final boolean hasStemInfo() {
            return this._builder.hasStemInfo();
        }

        public final void setIdleTimeS(int i11) {
            this._builder.setIdleTimeS(i11);
        }

        public final void setSessionEnergyKwh(float f11) {
            this._builder.setSessionEnergyKwh(f11);
        }

        public final void setSessionId(int i11) {
            this._builder.setSessionId(i11);
        }

        public final void setStartTimeEpochS(long j11) {
            this._builder.setStartTimeEpochS(j11);
        }

        public final void setStemEventInfo(StemCommonProto.StemEventInfo value) {
            s.k(value, "value");
            this._builder.setStemEventInfo(value);
        }

        public final void setStemInfo(StemCommonProto.StemInfo value) {
            s.k(value, "value");
            this._builder.setStemInfo(value);
        }

        public final void setSystemTimeEpochS(long j11) {
            this._builder.setSystemTimeEpochS(j11);
        }

        private Dsl(StemUiProto.StemUi.Builder builder) {
            this._builder = builder;
        }
    }

    private StemUiKt() {
    }
}
