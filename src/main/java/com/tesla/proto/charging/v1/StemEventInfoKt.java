package com.tesla.proto.charging.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/tesla/proto/charging/v1/StemEventInfoKt;", "", "()V", "Dsl", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class StemEventInfoKt {
    public static final StemEventInfoKt INSTANCE = new StemEventInfoKt();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/tesla/proto/charging/v1/StemEventInfoKt$Dsl;", "", "Lcom/tesla/proto/charging/v1/StemCommonProto$StemEventInfo$Builder;", "_builder", "<init>", "(Lcom/tesla/proto/charging/v1/StemCommonProto$StemEventInfo$Builder;)V", "Lcom/tesla/proto/charging/v1/StemCommonProto$StemEventInfo;", "_build", "()Lcom/tesla/proto/charging/v1/StemCommonProto$StemEventInfo;", "Ljn0/h0;", "clearEventOccurred", "()V", "clearInvalidated", "clearTimeSynchronized", "Lcom/tesla/proto/charging/v1/StemCommonProto$StemEventInfo$Builder;", "", "value", "getEventOccurred", "()Z", "setEventOccurred", "(Z)V", "eventOccurred", "getInvalidated", "setInvalidated", "invalidated", "getTimeSynchronized", "setTimeSynchronized", "timeSynchronized", "Companion", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final StemCommonProto.StemEventInfo.Builder _builder;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/tesla/proto/charging/v1/StemEventInfoKt$Dsl$Companion;", "", "()V", "_create", "Lcom/tesla/proto/charging/v1/StemEventInfoKt$Dsl;", "builder", "Lcom/tesla/proto/charging/v1/StemCommonProto$StemEventInfo$Builder;", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(StemCommonProto.StemEventInfo.Builder builder) {
                s.k(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(StemCommonProto.StemEventInfo.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ StemCommonProto.StemEventInfo _build() {
            StemCommonProto.StemEventInfo stemEventInfoBuild = this._builder.build();
            s.j(stemEventInfoBuild, "_builder.build()");
            return stemEventInfoBuild;
        }

        public final void clearEventOccurred() {
            this._builder.clearEventOccurred();
        }

        public final void clearInvalidated() {
            this._builder.clearInvalidated();
        }

        public final void clearTimeSynchronized() {
            this._builder.clearTimeSynchronized();
        }

        public final boolean getEventOccurred() {
            return this._builder.getEventOccurred();
        }

        public final boolean getInvalidated() {
            return this._builder.getInvalidated();
        }

        public final boolean getTimeSynchronized() {
            return this._builder.getTimeSynchronized();
        }

        public final void setEventOccurred(boolean z11) {
            this._builder.setEventOccurred(z11);
        }

        public final void setInvalidated(boolean z11) {
            this._builder.setInvalidated(z11);
        }

        public final void setTimeSynchronized(boolean z11) {
            this._builder.setTimeSynchronized(z11);
        }

        private Dsl(StemCommonProto.StemEventInfo.Builder builder) {
            this._builder = builder;
        }
    }

    private StemEventInfoKt() {
    }
}
