package com.tesla.proto.charging.v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/tesla/proto/charging/v1/ChargeSessionTimeSeriesKt;", "", "()V", "Dsl", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ChargeSessionTimeSeriesKt {
    public static final ChargeSessionTimeSeriesKt INSTANCE = new ChargeSessionTimeSeriesKt();

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b!\b\u0007\u0018\u0000 S2\u00020\u0001:\u0003TUSB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ'\u0010\u001a\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u0015H\u0087\n¢\u0006\u0004\b\u001b\u0010\u0019J-\u0010!\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J.\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001dH\u0087\n¢\u0006\u0004\b\"\u0010 J0\u0010&\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010#\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0087\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0007¢\u0006\u0004\b'\u0010(J'\u0010\u001a\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0\u00142\u0006\u0010\u0017\u001a\u00020*H\u0007¢\u0006\u0004\b,\u0010-J(\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0\u00142\u0006\u0010\u0017\u001a\u00020*H\u0087\n¢\u0006\u0004\b.\u0010-J-\u0010!\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020*0\u001dH\u0007¢\u0006\u0004\b/\u0010 J.\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020*0\u001dH\u0087\n¢\u0006\u0004\b0\u0010 J0\u0010&\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0\u00142\u0006\u0010#\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020*H\u0087\u0002¢\u0006\u0004\b1\u00102J\u001f\u0010)\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0\u0014H\u0007¢\u0006\u0004\b3\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R$\u0010:\u001a\u0002052\u0006\u0010\u0017\u001a\u0002058G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010=\u001a\u0002052\u0006\u0010\u0017\u001a\u0002058G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u00107\"\u0004\b<\u00109R$\u0010B\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010G\u001a\u00020*2\u0006\u0010\u0017\u001a\u00020*8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010J\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010?\"\u0004\bI\u0010AR$\u0010M\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010?\"\u0004\bL\u0010AR\u001d\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148F¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001d\u0010R\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0\u00148F¢\u0006\u0006\u001a\u0004\bQ\u0010O¨\u0006V"}, d2 = {"Lcom/tesla/proto/charging/v1/ChargeSessionTimeSeriesKt$Dsl;", "", "Lcom/tesla/proto/charging/v1/ChargeSessionTimeSeriesProto$ChargeSessionTimeSeries$Builder;", "_builder", "<init>", "(Lcom/tesla/proto/charging/v1/ChargeSessionTimeSeriesProto$ChargeSessionTimeSeries$Builder;)V", "Lcom/tesla/proto/charging/v1/ChargeSessionTimeSeriesProto$ChargeSessionTimeSeries;", "_build", "()Lcom/tesla/proto/charging/v1/ChargeSessionTimeSeriesProto$ChargeSessionTimeSeries;", "Ljn0/h0;", "clearStartTimeEpochS", "()V", "clearEndTimeEpochS", "clearTotalEnergyVendedWh", "clearTotalEnergyVended", "", "hasTotalEnergyVended", "()Z", "clearBucketDurationS", "clearFirstBucketDurationS", "Lcom/google/protobuf/kotlin/DslList;", "", "Lcom/tesla/proto/charging/v1/ChargeSessionTimeSeriesKt$Dsl$BucketEnergyVendedWhProxy;", "value", "addBucketEnergyVendedWh", "(Lcom/google/protobuf/kotlin/DslList;I)V", "add", "plusAssignBucketEnergyVendedWh", "plusAssign", "", "values", "addAllBucketEnergyVendedWh", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllBucketEnergyVendedWh", "index", "setBucketEnergyVendedWh", "(Lcom/google/protobuf/kotlin/DslList;II)V", "set", "clearBucketEnergyVendedWh", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "Lcom/tesla/proto/charging/v1/EnergyProto$Energy;", "Lcom/tesla/proto/charging/v1/ChargeSessionTimeSeriesKt$Dsl$BucketEnergyVendedProxy;", "addBucketEnergyVended", "(Lcom/google/protobuf/kotlin/DslList;Lcom/tesla/proto/charging/v1/EnergyProto$Energy;)V", "plusAssignBucketEnergyVended", "addAllBucketEnergyVended", "plusAssignAllBucketEnergyVended", "setBucketEnergyVended", "(Lcom/google/protobuf/kotlin/DslList;ILcom/tesla/proto/charging/v1/EnergyProto$Energy;)V", "clearBucketEnergyVended", "Lcom/tesla/proto/charging/v1/ChargeSessionTimeSeriesProto$ChargeSessionTimeSeries$Builder;", "", "getStartTimeEpochS", "()J", "setStartTimeEpochS", "(J)V", "startTimeEpochS", "getEndTimeEpochS", "setEndTimeEpochS", "endTimeEpochS", "getTotalEnergyVendedWh", "()I", "setTotalEnergyVendedWh", "(I)V", "totalEnergyVendedWh", "getTotalEnergyVended", "()Lcom/tesla/proto/charging/v1/EnergyProto$Energy;", "setTotalEnergyVended", "(Lcom/tesla/proto/charging/v1/EnergyProto$Energy;)V", "totalEnergyVended", "getBucketDurationS", "setBucketDurationS", "bucketDurationS", "getFirstBucketDurationS", "setFirstBucketDurationS", "firstBucketDurationS", "getBucketEnergyVendedWh", "()Lcom/google/protobuf/kotlin/DslList;", "bucketEnergyVendedWh", "getBucketEnergyVended", "bucketEnergyVended", "Companion", "BucketEnergyVendedProxy", "BucketEnergyVendedWhProxy", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @ProtoDslMarker
    public static final class Dsl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries.Builder _builder;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tesla/proto/charging/v1/ChargeSessionTimeSeriesKt$Dsl$BucketEnergyVendedProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class BucketEnergyVendedProxy extends DslProxy {
            private BucketEnergyVendedProxy() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tesla/proto/charging/v1/ChargeSessionTimeSeriesKt$Dsl$BucketEnergyVendedWhProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class BucketEnergyVendedWhProxy extends DslProxy {
            private BucketEnergyVendedWhProxy() {
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/tesla/proto/charging/v1/ChargeSessionTimeSeriesKt$Dsl$Companion;", "", "()V", "_create", "Lcom/tesla/proto/charging/v1/ChargeSessionTimeSeriesKt$Dsl;", "builder", "Lcom/tesla/proto/charging/v1/ChargeSessionTimeSeriesProto$ChargeSessionTimeSeries$Builder;", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries.Builder builder) {
                s.k(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries _build() {
            ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries chargeSessionTimeSeriesBuild = this._builder.build();
            s.j(chargeSessionTimeSeriesBuild, "_builder.build()");
            return chargeSessionTimeSeriesBuild;
        }

        public final /* synthetic */ void addAllBucketEnergyVended(DslList dslList, Iterable values) {
            s.k(dslList, "<this>");
            s.k(values, "values");
            this._builder.addAllBucketEnergyVended(values);
        }

        public final /* synthetic */ void addAllBucketEnergyVendedWh(DslList dslList, Iterable values) {
            s.k(dslList, "<this>");
            s.k(values, "values");
            this._builder.addAllBucketEnergyVendedWh(values);
        }

        public final /* synthetic */ void addBucketEnergyVended(DslList dslList, EnergyProto.Energy value) {
            s.k(dslList, "<this>");
            s.k(value, "value");
            this._builder.addBucketEnergyVended(value);
        }

        public final /* synthetic */ void addBucketEnergyVendedWh(DslList dslList, int i11) {
            s.k(dslList, "<this>");
            this._builder.addBucketEnergyVendedWh(i11);
        }

        public final void clearBucketDurationS() {
            this._builder.clearBucketDurationS();
        }

        public final /* synthetic */ void clearBucketEnergyVended(DslList dslList) {
            s.k(dslList, "<this>");
            this._builder.clearBucketEnergyVended();
        }

        public final /* synthetic */ void clearBucketEnergyVendedWh(DslList dslList) {
            s.k(dslList, "<this>");
            this._builder.clearBucketEnergyVendedWh();
        }

        public final void clearEndTimeEpochS() {
            this._builder.clearEndTimeEpochS();
        }

        public final void clearFirstBucketDurationS() {
            this._builder.clearFirstBucketDurationS();
        }

        public final void clearStartTimeEpochS() {
            this._builder.clearStartTimeEpochS();
        }

        public final void clearTotalEnergyVended() {
            this._builder.clearTotalEnergyVended();
        }

        public final void clearTotalEnergyVendedWh() {
            this._builder.clearTotalEnergyVendedWh();
        }

        public final int getBucketDurationS() {
            return this._builder.getBucketDurationS();
        }

        public final /* synthetic */ DslList getBucketEnergyVended() {
            List<EnergyProto.Energy> bucketEnergyVendedList = this._builder.getBucketEnergyVendedList();
            s.j(bucketEnergyVendedList, "_builder.getBucketEnergyVendedList()");
            return new DslList(bucketEnergyVendedList);
        }

        public final /* synthetic */ DslList getBucketEnergyVendedWh() {
            List<Integer> bucketEnergyVendedWhList = this._builder.getBucketEnergyVendedWhList();
            s.j(bucketEnergyVendedWhList, "_builder.getBucketEnergyVendedWhList()");
            return new DslList(bucketEnergyVendedWhList);
        }

        public final long getEndTimeEpochS() {
            return this._builder.getEndTimeEpochS();
        }

        public final int getFirstBucketDurationS() {
            return this._builder.getFirstBucketDurationS();
        }

        public final long getStartTimeEpochS() {
            return this._builder.getStartTimeEpochS();
        }

        public final EnergyProto.Energy getTotalEnergyVended() {
            EnergyProto.Energy totalEnergyVended = this._builder.getTotalEnergyVended();
            s.j(totalEnergyVended, "_builder.getTotalEnergyVended()");
            return totalEnergyVended;
        }

        public final int getTotalEnergyVendedWh() {
            return this._builder.getTotalEnergyVendedWh();
        }

        public final boolean hasTotalEnergyVended() {
            return this._builder.hasTotalEnergyVended();
        }

        public final /* synthetic */ void plusAssignAllBucketEnergyVended(DslList<EnergyProto.Energy, BucketEnergyVendedProxy> dslList, Iterable<EnergyProto.Energy> values) {
            s.k(dslList, "<this>");
            s.k(values, "values");
            addAllBucketEnergyVended(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllBucketEnergyVendedWh(DslList<Integer, BucketEnergyVendedWhProxy> dslList, Iterable<Integer> values) {
            s.k(dslList, "<this>");
            s.k(values, "values");
            addAllBucketEnergyVendedWh(dslList, values);
        }

        public final /* synthetic */ void plusAssignBucketEnergyVended(DslList<EnergyProto.Energy, BucketEnergyVendedProxy> dslList, EnergyProto.Energy value) {
            s.k(dslList, "<this>");
            s.k(value, "value");
            addBucketEnergyVended(dslList, value);
        }

        public final /* synthetic */ void plusAssignBucketEnergyVendedWh(DslList<Integer, BucketEnergyVendedWhProxy> dslList, int i11) {
            s.k(dslList, "<this>");
            addBucketEnergyVendedWh(dslList, i11);
        }

        public final void setBucketDurationS(int i11) {
            this._builder.setBucketDurationS(i11);
        }

        public final /* synthetic */ void setBucketEnergyVended(DslList dslList, int i11, EnergyProto.Energy value) {
            s.k(dslList, "<this>");
            s.k(value, "value");
            this._builder.setBucketEnergyVended(i11, value);
        }

        public final /* synthetic */ void setBucketEnergyVendedWh(DslList dslList, int i11, int i12) {
            s.k(dslList, "<this>");
            this._builder.setBucketEnergyVendedWh(i11, i12);
        }

        public final void setEndTimeEpochS(long j11) {
            this._builder.setEndTimeEpochS(j11);
        }

        public final void setFirstBucketDurationS(int i11) {
            this._builder.setFirstBucketDurationS(i11);
        }

        public final void setStartTimeEpochS(long j11) {
            this._builder.setStartTimeEpochS(j11);
        }

        public final void setTotalEnergyVended(EnergyProto.Energy value) {
            s.k(value, "value");
            this._builder.setTotalEnergyVended(value);
        }

        public final void setTotalEnergyVendedWh(int i11) {
            this._builder.setTotalEnergyVendedWh(i11);
        }

        private Dsl(ChargeSessionTimeSeriesProto.ChargeSessionTimeSeries.Builder builder) {
            this._builder = builder;
        }
    }

    private ChargeSessionTimeSeriesKt() {
    }
}
