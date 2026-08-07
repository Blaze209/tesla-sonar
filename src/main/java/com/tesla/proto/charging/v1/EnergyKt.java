package com.tesla.proto.charging.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/tesla/proto/charging/v1/EnergyKt;", "", "()V", "Dsl", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class EnergyKt {
    public static final EnergyKt INSTANCE = new EnergyKt();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/tesla/proto/charging/v1/EnergyKt$Dsl;", "", "Lcom/tesla/proto/charging/v1/EnergyProto$Energy$Builder;", "_builder", "<init>", "(Lcom/tesla/proto/charging/v1/EnergyProto$Energy$Builder;)V", "Lcom/tesla/proto/charging/v1/EnergyProto$Energy;", "_build", "()Lcom/tesla/proto/charging/v1/EnergyProto$Energy;", "Ljn0/h0;", "clearWattHours", "()V", "clearMilliWattHours", "Lcom/tesla/proto/charging/v1/EnergyProto$Energy$Builder;", "", "value", "getWattHours", "()I", "setWattHours", "(I)V", "wattHours", "getMilliWattHours", "setMilliWattHours", "milliWattHours", "Companion", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final EnergyProto.Energy.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/tesla/proto/charging/v1/EnergyKt$Dsl$Companion;", "", "()V", "_create", "Lcom/tesla/proto/charging/v1/EnergyKt$Dsl;", "builder", "Lcom/tesla/proto/charging/v1/EnergyProto$Energy$Builder;", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(EnergyProto.Energy.Builder builder) {
                s.k(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(EnergyProto.Energy.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ EnergyProto.Energy _build() {
            EnergyProto.Energy energyBuild = this._builder.build();
            s.j(energyBuild, "_builder.build()");
            return energyBuild;
        }

        public final void clearMilliWattHours() {
            this._builder.clearMilliWattHours();
        }

        public final void clearWattHours() {
            this._builder.clearWattHours();
        }

        public final int getMilliWattHours() {
            return this._builder.getMilliWattHours();
        }

        public final int getWattHours() {
            return this._builder.getWattHours();
        }

        public final void setMilliWattHours(int i11) {
            this._builder.setMilliWattHours(i11);
        }

        public final void setWattHours(int i11) {
            this._builder.setWattHours(i11);
        }

        private Dsl(EnergyProto.Energy.Builder builder) {
            this._builder = builder;
        }
    }

    private EnergyKt() {
    }
}
