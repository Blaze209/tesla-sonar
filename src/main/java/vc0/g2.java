package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\"&(!Ba\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJg\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b(\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b&\u0010\u001aR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lvc0/g2;", "Lcom/squareup/wire/f;", "", "", "permissionsBitmask", "Lvc0/g2$d;", "serviceRunningState", "runningState_timeSince_S", "processStartTime_timeSince_S", "osStartTime_timeSince_S", "screenOnReceiver_timeSince_S", "bootReceiver_timeSince_S", "Lvc0/g2$e;", "serviceStartReason", "Lokio/k;", "unknownFields", "<init>", "(ILvc0/g2$d;IIIIILvc0/g2$e;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ILvc0/g2$d;IIIIILvc0/g2$e;Lokio/k;)Lvc0/g2;", "I", "e", "b", "Lvc0/g2$d;", IntegerTokenConverter.CONVERTER_KEY, "()Lvc0/g2$d;", "c", "g", DateTokenConverter.CONVERTER_KEY, "f", "h", "Lvc0/g2$e;", "j", "()Lvc0/g2$e;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ProtoAdapter<g2> f118699j = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(g2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FIXED32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final int permissionsBitmask;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PhoneKeyTelemetry_Android$ServiceRunningState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final d serviceRunningState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "runningStateTimeSinceS", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final int runningState_timeSince_S;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "processStartTimeTimeSinceS", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final int processStartTime_timeSince_S;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "osStartTimeTimeSinceS", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final int osStartTime_timeSince_S;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "screenOnReceiverTimeSinceS", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final int screenOnReceiver_timeSince_S;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "bootReceiverTimeSinceS", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final int bootReceiver_timeSince_S;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PhoneKeyTelemetry_Android$ServiceStartReason#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final e serviceStartReason;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/g2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/g2;", "value", "", "c", "(Lvc0/g2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/g2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/g2;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/g2;)Lvc0/g2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<g2> {
        a(com.squareup.wire.b bVar, co0.d<g2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.PhoneKeyTelemetry_Android", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g2 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            d dVarDecode = d.SERVICERUNNINGSTATE_SNA;
            e eVar = e.SERVICE_START_REASON_SNA;
            long jD = reader.d();
            int iIntValue = 0;
            int iIntValue2 = 0;
            int iIntValue3 = 0;
            int iIntValue4 = 0;
            int iIntValue5 = 0;
            int iIntValue6 = 0;
            e eVarDecode = eVar;
            while (true) {
                d dVar = dVarDecode;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new g2(iIntValue, dVar, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, eVarDecode, reader.e(jD));
                    }
                    switch (iG) {
                        case 1:
                            iIntValue = ProtoAdapter.FIXED32.decode(reader).intValue();
                            break;
                        case 2:
                            try {
                                dVarDecode = d.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            }
                            break;
                        case 3:
                            iIntValue2 = ProtoAdapter.SINT32.decode(reader).intValue();
                            break;
                        case 4:
                            iIntValue3 = ProtoAdapter.SINT32.decode(reader).intValue();
                            break;
                        case 5:
                            iIntValue4 = ProtoAdapter.SINT32.decode(reader).intValue();
                            break;
                        case 6:
                            iIntValue5 = ProtoAdapter.SINT32.decode(reader).intValue();
                            break;
                        case 7:
                            iIntValue6 = ProtoAdapter.SINT32.decode(reader).intValue();
                            break;
                        case 8:
                            try {
                                eVarDecode = e.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                            }
                            break;
                        default:
                            reader.m(iG);
                            break;
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, g2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getPermissionsBitmask() != 0) {
                ProtoAdapter.FIXED32.encodeWithTag(writer, 1, Integer.valueOf(value.getPermissionsBitmask()));
            }
            if (value.getServiceRunningState() != d.SERVICERUNNINGSTATE_SNA) {
                d.ADAPTER.encodeWithTag(writer, 2, value.getServiceRunningState());
            }
            if (value.getRunningState_timeSince_S() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 3, Integer.valueOf(value.getRunningState_timeSince_S()));
            }
            if (value.getProcessStartTime_timeSince_S() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 4, Integer.valueOf(value.getProcessStartTime_timeSince_S()));
            }
            if (value.getOsStartTime_timeSince_S() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 5, Integer.valueOf(value.getOsStartTime_timeSince_S()));
            }
            if (value.getScreenOnReceiver_timeSince_S() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 6, Integer.valueOf(value.getScreenOnReceiver_timeSince_S()));
            }
            if (value.getBootReceiver_timeSince_S() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 7, Integer.valueOf(value.getBootReceiver_timeSince_S()));
            }
            if (value.getServiceStartReason() != e.SERVICE_START_REASON_SNA) {
                e.ADAPTER.encodeWithTag(writer, 8, value.getServiceStartReason());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(g2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getPermissionsBitmask() != 0) {
                iD += ProtoAdapter.FIXED32.encodedSizeWithTag(1, Integer.valueOf(value.getPermissionsBitmask()));
            }
            if (value.getServiceRunningState() != d.SERVICERUNNINGSTATE_SNA) {
                iD += d.ADAPTER.encodedSizeWithTag(2, value.getServiceRunningState());
            }
            if (value.getRunningState_timeSince_S() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(3, Integer.valueOf(value.getRunningState_timeSince_S()));
            }
            if (value.getProcessStartTime_timeSince_S() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(4, Integer.valueOf(value.getProcessStartTime_timeSince_S()));
            }
            if (value.getOsStartTime_timeSince_S() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(5, Integer.valueOf(value.getOsStartTime_timeSince_S()));
            }
            if (value.getScreenOnReceiver_timeSince_S() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(6, Integer.valueOf(value.getScreenOnReceiver_timeSince_S()));
            }
            if (value.getBootReceiver_timeSince_S() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(7, Integer.valueOf(value.getBootReceiver_timeSince_S()));
            }
            return value.getServiceStartReason() != e.SERVICE_START_REASON_SNA ? iD + e.ADAPTER.encodedSizeWithTag(8, value.getServiceStartReason()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public g2 redact(g2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return g2.b(value, 0, null, 0, 0, 0, 0, 0, null, okio.k.f97943e, 255, null);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 vc0.g2$c, still in use, count: 1, list:
      (r0v0 vc0.g2$c) from 0x006e: CONSTRUCTOR 
      (wrap co0.d:0x0066: INVOKE (wrap java.lang.Class:0x0064: CONST_CLASS  A[WRAPPED] (LINE:101) vc0.g2$c.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:103))
      (wrap com.squareup.wire.o:0x006a: SGET  A[WRAPPED] (LINE:107) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 vc0.g2$c)
     A[MD:(co0.d<vc0.g2$c>, com.squareup.wire.o, vc0.g2$c):void (m), WRAPPED] (LINE:111) call: vc0.g2.c.a.<init>(co0.d, com.squareup.wire.o, vc0.g2$c):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lvc0/g2$c;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "BLUETOOTH_SCAN", "BLUETOOTH_CONNECT", "ACCESS_FINE_LOCATION", "LEGACY_BLUETOOTH", "LEGACY_BLUETOOTH_ADMIN", "UWB_RANGING", "BATTERY_OPTIMIZATION", "IMU_ENABLED", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements com.squareup.wire.p {
        BLUETOOTH_SCAN(0),
        BLUETOOTH_CONNECT(1),
        ACCESS_FINE_LOCATION(2),
        LEGACY_BLUETOOTH(3),
        LEGACY_BLUETOOTH_ADMIN(4),
        UWB_RANGING(5),
        BATTERY_OPTIMIZATION(6),
        IMU_ENABLED(7);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<c> ADAPTER = new a(p013kotlin.jvm.internal.o0.b(c.class), com.squareup.wire.o.PROTO_3, new c(0));

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"vc0/g2$c$a", "Lcom/squareup/wire/a;", "Lvc0/g2$c;", "", "value", "f", "(I)Lvc0/g2$c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends com.squareup.wire.a<c> {
            a(co0.d<c> dVar, com.squareup.wire.o oVar, c cVar) {
                super(dVar, oVar, cVar);
            }

            @Override // com.squareup.wire.a
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public c d(int value) {
                return c.INSTANCE.a(value);
            }
        }

        /* JADX INFO: renamed from: vc0.g2$c$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvc0/g2$c$b;", "", "<init>", "()V", "", "value", "Lvc0/g2$c;", "a", "(I)Lvc0/g2$c;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(int value) {
                switch (value) {
                    case 0:
                        return c.BLUETOOTH_SCAN;
                    case 1:
                        return c.BLUETOOTH_CONNECT;
                    case 2:
                        return c.ACCESS_FINE_LOCATION;
                    case 3:
                        return c.LEGACY_BLUETOOTH;
                    case 4:
                        return c.LEGACY_BLUETOOTH_ADMIN;
                    case 5:
                        return c.UWB_RANGING;
                    case 6:
                        return c.BATTERY_OPTIMIZATION;
                    case 7:
                        return c.IMU_ENABLED;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }

        static {
        }

        private c(int i11) {
            super(str, i);
            this.value = i11;
        }

        public static final c fromValue(int i11) {
            return INSTANCE.a(i11);
        }

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 vc0.g2$d, still in use, count: 1, list:
      (r0v0 vc0.g2$d) from 0x0046: CONSTRUCTOR 
      (wrap co0.d:0x003e: INVOKE (wrap java.lang.Class:0x003c: CONST_CLASS  A[WRAPPED] (LINE:61) vc0.g2$d.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:63))
      (wrap com.squareup.wire.o:0x0042: SGET  A[WRAPPED] (LINE:67) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 vc0.g2$d)
     A[MD:(co0.d<vc0.g2$d>, com.squareup.wire.o, vc0.g2$d):void (m), WRAPPED] (LINE:71) call: vc0.g2.d.a.<init>(co0.d, com.squareup.wire.o, vc0.g2$d):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lvc0/g2$d;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "SERVICERUNNINGSTATE_SNA", "SERVICERUNNINGSTATE_BACKGROUND", "SERVICERUNNINGSTATE_FOREGROUND", "SERVICERUNNINGSTATE_OFF", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements com.squareup.wire.p {
        SERVICERUNNINGSTATE_SNA(0),
        SERVICERUNNINGSTATE_BACKGROUND(1),
        SERVICERUNNINGSTATE_FOREGROUND(2),
        SERVICERUNNINGSTATE_OFF(3);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<d> ADAPTER = new a(p013kotlin.jvm.internal.o0.b(d.class), com.squareup.wire.o.PROTO_3, new d(0));

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"vc0/g2$d$a", "Lcom/squareup/wire/a;", "Lvc0/g2$d;", "", "value", "f", "(I)Lvc0/g2$d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends com.squareup.wire.a<d> {
            a(co0.d<d> dVar, com.squareup.wire.o oVar, d dVar2) {
                super(dVar, oVar, dVar2);
            }

            @Override // com.squareup.wire.a
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public d d(int value) {
                return d.INSTANCE.a(value);
            }
        }

        /* JADX INFO: renamed from: vc0.g2$d$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvc0/g2$d$b;", "", "<init>", "()V", "", "value", "Lvc0/g2$d;", "a", "(I)Lvc0/g2$d;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(int value) {
                if (value == 0) {
                    return d.SERVICERUNNINGSTATE_SNA;
                }
                if (value == 1) {
                    return d.SERVICERUNNINGSTATE_BACKGROUND;
                }
                if (value == 2) {
                    return d.SERVICERUNNINGSTATE_FOREGROUND;
                }
                if (value != 3) {
                    return null;
                }
                return d.SERVICERUNNINGSTATE_OFF;
            }

            private Companion() {
            }
        }

        static {
        }

        private d(int i11) {
            super(str, i);
            this.value = i11;
        }

        public static final d fromValue(int i11) {
            return INSTANCE.a(i11);
        }

        public static EnumEntries<d> getEntries() {
            return $ENTRIES;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 vc0.g2$e, still in use, count: 1, list:
      (r0v0 vc0.g2$e) from 0x0070: CONSTRUCTOR 
      (wrap co0.d:0x0068: INVOKE (wrap java.lang.Class:0x0066: CONST_CLASS  A[WRAPPED] (LINE:103) vc0.g2$e.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:105))
      (wrap com.squareup.wire.o:0x006c: SGET  A[WRAPPED] (LINE:109) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 vc0.g2$e)
     A[MD:(co0.d<vc0.g2$e>, com.squareup.wire.o, vc0.g2$e):void (m), WRAPPED] (LINE:113) call: vc0.g2.e.a.<init>(co0.d, com.squareup.wire.o, vc0.g2$e):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lvc0/g2$e;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "SERVICE_START_REASON_SNA", "SERVICE_START_REASON_JS", "SERVICE_START_REASON_BOOT_COMPLETE", "SERVICE_START_REASON_MI_BEACON", "SERVICE_START_REASON_HONOR_WALLET", "SERVICE_START_REASON_OPPO_WALLET", "SERVICE_START_REASON_VIVO_WALLET", "SERVICE_START_REASON_PACKAGE_REPLACED", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e implements com.squareup.wire.p {
        SERVICE_START_REASON_SNA(0),
        SERVICE_START_REASON_JS(1),
        SERVICE_START_REASON_BOOT_COMPLETE(2),
        SERVICE_START_REASON_MI_BEACON(3),
        SERVICE_START_REASON_HONOR_WALLET(4),
        SERVICE_START_REASON_OPPO_WALLET(5),
        SERVICE_START_REASON_VIVO_WALLET(6),
        SERVICE_START_REASON_PACKAGE_REPLACED(10);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<e> ADAPTER = new a(p013kotlin.jvm.internal.o0.b(e.class), com.squareup.wire.o.PROTO_3, new e(0));

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"vc0/g2$e$a", "Lcom/squareup/wire/a;", "Lvc0/g2$e;", "", "value", "f", "(I)Lvc0/g2$e;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends com.squareup.wire.a<e> {
            a(co0.d<e> dVar, com.squareup.wire.o oVar, e eVar) {
                super(dVar, oVar, eVar);
            }

            @Override // com.squareup.wire.a
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public e d(int value) {
                return e.INSTANCE.a(value);
            }
        }

        /* JADX INFO: renamed from: vc0.g2$e$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lvc0/g2$e$b;", "", "<init>", "()V", "", "value", "Lvc0/g2$e;", "a", "(I)Lvc0/g2$e;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final e a(int value) {
                if (value == 10) {
                    return e.SERVICE_START_REASON_PACKAGE_REPLACED;
                }
                switch (value) {
                    case 0:
                        return e.SERVICE_START_REASON_SNA;
                    case 1:
                        return e.SERVICE_START_REASON_JS;
                    case 2:
                        return e.SERVICE_START_REASON_BOOT_COMPLETE;
                    case 3:
                        return e.SERVICE_START_REASON_MI_BEACON;
                    case 4:
                        return e.SERVICE_START_REASON_HONOR_WALLET;
                    case 5:
                        return e.SERVICE_START_REASON_OPPO_WALLET;
                    case 6:
                        return e.SERVICE_START_REASON_VIVO_WALLET;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }

        static {
        }

        private e(int i11) {
            super(str, i);
            this.value = i11;
        }

        public static final e fromValue(int i11) {
            return INSTANCE.a(i11);
        }

        public static EnumEntries<e> getEntries() {
            return $ENTRIES;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    public g2() {
        this(0, null, 0, 0, 0, 0, 0, null, null, 511, null);
    }

    public static /* synthetic */ g2 b(g2 g2Var, int i11, d dVar, int i12, int i13, int i14, int i15, int i16, e eVar, okio.k kVar, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i11 = g2Var.permissionsBitmask;
        }
        if ((i17 & 2) != 0) {
            dVar = g2Var.serviceRunningState;
        }
        if ((i17 & 4) != 0) {
            i12 = g2Var.runningState_timeSince_S;
        }
        if ((i17 & 8) != 0) {
            i13 = g2Var.processStartTime_timeSince_S;
        }
        if ((i17 & 16) != 0) {
            i14 = g2Var.osStartTime_timeSince_S;
        }
        if ((i17 & 32) != 0) {
            i15 = g2Var.screenOnReceiver_timeSince_S;
        }
        if ((i17 & 64) != 0) {
            i16 = g2Var.bootReceiver_timeSince_S;
        }
        if ((i17 & 128) != 0) {
            eVar = g2Var.serviceStartReason;
        }
        if ((i17 & 256) != 0) {
            kVar = g2Var.unknownFields();
        }
        e eVar2 = eVar;
        okio.k kVar2 = kVar;
        int i18 = i15;
        int i19 = i16;
        int i21 = i14;
        int i22 = i12;
        return g2Var.a(i11, dVar, i22, i13, i21, i18, i19, eVar2, kVar2);
    }

    public final g2 a(int permissionsBitmask, d serviceRunningState, int runningState_timeSince_S, int processStartTime_timeSince_S, int osStartTime_timeSince_S, int screenOnReceiver_timeSince_S, int bootReceiver_timeSince_S, e serviceStartReason, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(serviceRunningState, "serviceRunningState");
        p013kotlin.jvm.internal.s.k(serviceStartReason, "serviceStartReason");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new g2(permissionsBitmask, serviceRunningState, runningState_timeSince_S, processStartTime_timeSince_S, osStartTime_timeSince_S, screenOnReceiver_timeSince_S, bootReceiver_timeSince_S, serviceStartReason, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBootReceiver_timeSince_S() {
        return this.bootReceiver_timeSince_S;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getOsStartTime_timeSince_S() {
        return this.osStartTime_timeSince_S;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getPermissionsBitmask() {
        return this.permissionsBitmask;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), g2Var.unknownFields()) && this.permissionsBitmask == g2Var.permissionsBitmask && this.serviceRunningState == g2Var.serviceRunningState && this.runningState_timeSince_S == g2Var.runningState_timeSince_S && this.processStartTime_timeSince_S == g2Var.processStartTime_timeSince_S && this.osStartTime_timeSince_S == g2Var.osStartTime_timeSince_S && this.screenOnReceiver_timeSince_S == g2Var.screenOnReceiver_timeSince_S && this.bootReceiver_timeSince_S == g2Var.bootReceiver_timeSince_S && this.serviceStartReason == g2Var.serviceStartReason;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getProcessStartTime_timeSince_S() {
        return this.processStartTime_timeSince_S;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getRunningState_timeSince_S() {
        return this.runningState_timeSince_S;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getScreenOnReceiver_timeSince_S() {
        return this.screenOnReceiver_timeSince_S;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.permissionsBitmask)) * 37) + this.serviceRunningState.hashCode()) * 37) + Integer.hashCode(this.runningState_timeSince_S)) * 37) + Integer.hashCode(this.processStartTime_timeSince_S)) * 37) + Integer.hashCode(this.osStartTime_timeSince_S)) * 37) + Integer.hashCode(this.screenOnReceiver_timeSince_S)) * 37) + Integer.hashCode(this.bootReceiver_timeSince_S)) * 37) + this.serviceStartReason.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final d getServiceRunningState() {
        return this.serviceRunningState;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final e getServiceStartReason() {
        return this.serviceStartReason;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m801newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("permissionsBitmask=" + this.permissionsBitmask);
        arrayList.add("serviceRunningState=" + this.serviceRunningState);
        arrayList.add("runningState_timeSince_S=" + this.runningState_timeSince_S);
        arrayList.add("processStartTime_timeSince_S=" + this.processStartTime_timeSince_S);
        arrayList.add("osStartTime_timeSince_S=" + this.osStartTime_timeSince_S);
        arrayList.add("screenOnReceiver_timeSince_S=" + this.screenOnReceiver_timeSince_S);
        arrayList.add("bootReceiver_timeSince_S=" + this.bootReceiver_timeSince_S);
        arrayList.add("serviceStartReason=" + this.serviceStartReason);
        return p013kotlin.collections.v.y0(arrayList, ", ", "PhoneKeyTelemetry_Android{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ g2(int i11, d dVar, int i12, int i13, int i14, int i15, int i16, e eVar, okio.k kVar, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? 0 : i11, (i17 & 2) != 0 ? d.SERVICERUNNINGSTATE_SNA : dVar, (i17 & 4) != 0 ? 0 : i12, (i17 & 8) != 0 ? 0 : i13, (i17 & 16) != 0 ? 0 : i14, (i17 & 32) != 0 ? 0 : i15, (i17 & 64) != 0 ? 0 : i16, (i17 & 128) != 0 ? e.SERVICE_START_REASON_SNA : eVar, (i17 & 256) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m801newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(int i11, d serviceRunningState, int i12, int i13, int i14, int i15, int i16, e serviceStartReason, okio.k unknownFields) {
        super(f118699j, unknownFields);
        p013kotlin.jvm.internal.s.k(serviceRunningState, "serviceRunningState");
        p013kotlin.jvm.internal.s.k(serviceStartReason, "serviceStartReason");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.permissionsBitmask = i11;
        this.serviceRunningState = serviceRunningState;
        this.runningState_timeSince_S = i12;
        this.processStartTime_timeSince_S = i13;
        this.osStartTime_timeSince_S = i14;
        this.screenOnReceiver_timeSince_S = i15;
        this.bootReceiver_timeSince_S = i16;
        this.serviceStartReason = serviceStartReason;
    }
}
