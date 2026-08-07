package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\"\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0093\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0099\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010$R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010.\u001a\u0004\b4\u0010$R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010.\u001a\u0004\b>\u0010$R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b9\u0010@R\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b:\u0010$R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bA\u0010CR\u001a\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010.\u001a\u0004\bD\u0010$R\u001a\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010E\u001a\u0004\b0\u0010F¨\u0006G"}, d2 = {"Lvc0/h2;", "Lcom/squareup/wire/f;", "", "Lvc0/q3;", "VCSEC_iBeaconState", "", "iBeaconState_timeSince_S", "Lvc0/x;", "VCSEC_CBManagerState", "CBManagerState_timeSince_S", "Lvc0/w;", "VCSEC_CBManagerAuthorization", "CBManagerAuthorization_timeSince_S", "Lvc0/t3;", "CoreBTError", "CoreBTError_timeSince_S", "Lvc0/s3;", "CoreBTATTErrorCode", "CoreBTATTError_timeSince_S", "Lvc0/u3;", "launchReason", "launchReason_timeSince_S", "Lvc0/r3;", "appState", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/q3;ILvc0/x;ILvc0/w;ILvc0/t3;ILvc0/s3;ILvc0/u3;ILvc0/r3;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/q3;ILvc0/x;ILvc0/w;ILvc0/t3;ILvc0/s3;ILvc0/u3;ILvc0/r3;Lokio/k;)Lvc0/h2;", "Lvc0/q3;", "o", "()Lvc0/q3;", "b", "I", "j", "c", "Lvc0/x;", "n", "()Lvc0/x;", DateTokenConverter.CONVERTER_KEY, "e", "Lvc0/w;", "m", "()Lvc0/w;", "f", "g", "Lvc0/t3;", "h", "()Lvc0/t3;", IntegerTokenConverter.CONVERTER_KEY, "Lvc0/s3;", "()Lvc0/s3;", "k", "Lvc0/u3;", "()Lvc0/u3;", "l", "Lvc0/r3;", "()Lvc0/r3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ProtoAdapter<h2> f118721o = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(h2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.iBeaconState#ADAPTER", declaredName = "iBeaconState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final q3 VCSEC_iBeaconState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "iBeaconStateTimeSinceS", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final int iBeaconState_timeSince_S;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.CBManagerState#ADAPTER", declaredName = "CBManagerState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final x VCSEC_CBManagerState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "CBManagerStateTimeSinceS", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final int CBManagerState_timeSince_S;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.CBManagerAuthorization#ADAPTER", declaredName = "CBManagerAuthorization", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final w VCSEC_CBManagerAuthorization;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "CBManagerAuthorizationTimeSinceS", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final int CBManagerAuthorization_timeSince_S;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.iOS_CoreBTError#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final t3 CoreBTError;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "CoreBTErrorTimeSinceS", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final int CoreBTError_timeSince_S;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.iOS_CoreBTATTErrorCode#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 9)
    private final s3 CoreBTATTErrorCode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "CoreBTATTErrorTimeSinceS", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 10)
    private final int CoreBTATTError_timeSince_S;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.iOS_LaunchReason#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 11)
    private final u3 launchReason;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "launchReasonTimeSinceS", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 12)
    private final int launchReason_timeSince_S;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.iOS_AppState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 13)
    private final r3 appState;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/h2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/h2;", "value", "", "c", "(Lvc0/h2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/h2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/h2;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/h2;)Lvc0/h2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<h2> {
        a(com.squareup.wire.b bVar, co0.d<h2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.PhoneKeyTelemetry_iOS", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h2 decode(com.squareup.wire.k reader) {
            w wVar;
            p013kotlin.jvm.internal.s.k(reader, "reader");
            q3 q3Var = q3.IBEACON_STATE_SNA;
            x xVar = x.CBMANAGERSTATE_UNKNOWN;
            w wVar2 = w.CBMANAGERAUTHORIZATION_UNKNOWN;
            t3 t3Var = t3.IOS_COREBTERROR_SNA;
            s3 s3Var = s3.IOS_COREBTATTERRORCODE_SNA;
            u3 u3Var = u3.IOS_LAUNCHREASON_SNA;
            r3 r3Var = r3.IOS_APPSTATE_SNA;
            long jD = reader.d();
            int iIntValue = 0;
            int iIntValue2 = 0;
            int iIntValue3 = 0;
            int iIntValue4 = 0;
            int iIntValue5 = 0;
            int iIntValue6 = 0;
            r3 r3VarDecode = r3Var;
            u3 u3VarDecode = u3Var;
            s3 s3VarDecode = s3Var;
            t3 t3VarDecode = t3Var;
            w wVarDecode = wVar2;
            x xVarDecode = xVar;
            q3 q3VarDecode = q3Var;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new h2(q3VarDecode, iIntValue, xVarDecode, iIntValue2, wVarDecode, iIntValue3, t3VarDecode, iIntValue4, s3VarDecode, iIntValue5, u3VarDecode, iIntValue6, r3VarDecode, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        q3VarDecode = q3VarDecode;
                        xVarDecode = xVarDecode;
                        wVar = wVarDecode;
                        try {
                            q3VarDecode = q3.ADAPTER.decode(reader);
                            wVarDecode = wVar;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            wVarDecode = wVar;
                            q3VarDecode = q3VarDecode;
                        }
                        xVarDecode = xVarDecode;
                        break;
                    case 2:
                        iIntValue = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 3:
                        q3VarDecode = q3VarDecode;
                        xVarDecode = xVarDecode;
                        wVar = wVarDecode;
                        try {
                            xVarDecode = x.ADAPTER.decode(reader);
                            wVarDecode = wVar;
                            q3VarDecode = q3VarDecode;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                            wVarDecode = wVar;
                            q3VarDecode = q3VarDecode;
                            xVarDecode = xVarDecode;
                        }
                        break;
                    case 4:
                        iIntValue2 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 5:
                        q3VarDecode = q3VarDecode;
                        xVarDecode = xVarDecode;
                        wVar = wVarDecode;
                        try {
                            wVarDecode = w.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e13.value));
                            wVarDecode = wVar;
                        }
                        q3VarDecode = q3VarDecode;
                        xVarDecode = xVarDecode;
                        break;
                    case 6:
                        iIntValue3 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 7:
                        q3VarDecode = q3VarDecode;
                        xVarDecode = xVarDecode;
                        wVar = wVarDecode;
                        try {
                            t3VarDecode = t3.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e14.value));
                        }
                        wVarDecode = wVar;
                        q3VarDecode = q3VarDecode;
                        xVarDecode = xVarDecode;
                        break;
                    case 8:
                        iIntValue4 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 9:
                        q3VarDecode = q3VarDecode;
                        xVarDecode = xVarDecode;
                        wVar = wVarDecode;
                        try {
                            s3VarDecode = s3.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e15) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e15.value));
                        }
                        wVarDecode = wVar;
                        q3VarDecode = q3VarDecode;
                        xVarDecode = xVarDecode;
                        break;
                    case 10:
                        iIntValue5 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 11:
                        q3VarDecode = q3VarDecode;
                        xVarDecode = xVarDecode;
                        try {
                            u3VarDecode = u3.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e16) {
                            wVar = wVarDecode;
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e16.value));
                            wVarDecode = wVar;
                        }
                        q3VarDecode = q3VarDecode;
                        xVarDecode = xVarDecode;
                        break;
                    case 12:
                        iIntValue6 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 13:
                        try {
                            r3VarDecode = r3.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e17) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e17.value));
                            wVar = wVarDecode;
                            wVarDecode = wVar;
                            q3VarDecode = q3VarDecode;
                            xVarDecode = xVarDecode;
                        }
                        break;
                    default:
                        reader.m(iG);
                        wVar = wVarDecode;
                        wVarDecode = wVar;
                        q3VarDecode = q3VarDecode;
                        xVarDecode = xVarDecode;
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, h2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getVCSEC_iBeaconState() != q3.IBEACON_STATE_SNA) {
                q3.ADAPTER.encodeWithTag(writer, 1, value.getVCSEC_iBeaconState());
            }
            if (value.getIBeaconState_timeSince_S() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getIBeaconState_timeSince_S()));
            }
            if (value.getVCSEC_CBManagerState() != x.CBMANAGERSTATE_UNKNOWN) {
                x.ADAPTER.encodeWithTag(writer, 3, value.getVCSEC_CBManagerState());
            }
            if (value.getCBManagerState_timeSince_S() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 4, Integer.valueOf(value.getCBManagerState_timeSince_S()));
            }
            if (value.getVCSEC_CBManagerAuthorization() != w.CBMANAGERAUTHORIZATION_UNKNOWN) {
                w.ADAPTER.encodeWithTag(writer, 5, value.getVCSEC_CBManagerAuthorization());
            }
            if (value.getCBManagerAuthorization_timeSince_S() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 6, Integer.valueOf(value.getCBManagerAuthorization_timeSince_S()));
            }
            if (value.getCoreBTError() != t3.IOS_COREBTERROR_SNA) {
                t3.ADAPTER.encodeWithTag(writer, 7, value.getCoreBTError());
            }
            if (value.getCoreBTError_timeSince_S() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 8, Integer.valueOf(value.getCoreBTError_timeSince_S()));
            }
            if (value.getCoreBTATTErrorCode() != s3.IOS_COREBTATTERRORCODE_SNA) {
                s3.ADAPTER.encodeWithTag(writer, 9, value.getCoreBTATTErrorCode());
            }
            if (value.getCoreBTATTError_timeSince_S() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 10, Integer.valueOf(value.getCoreBTATTError_timeSince_S()));
            }
            if (value.getLaunchReason() != u3.IOS_LAUNCHREASON_SNA) {
                u3.ADAPTER.encodeWithTag(writer, 11, value.getLaunchReason());
            }
            if (value.getLaunchReason_timeSince_S() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 12, Integer.valueOf(value.getLaunchReason_timeSince_S()));
            }
            if (value.getAppState() != r3.IOS_APPSTATE_SNA) {
                r3.ADAPTER.encodeWithTag(writer, 13, value.getAppState());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(h2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getVCSEC_iBeaconState() != q3.IBEACON_STATE_SNA) {
                iD += q3.ADAPTER.encodedSizeWithTag(1, value.getVCSEC_iBeaconState());
            }
            if (value.getIBeaconState_timeSince_S() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(2, Integer.valueOf(value.getIBeaconState_timeSince_S()));
            }
            if (value.getVCSEC_CBManagerState() != x.CBMANAGERSTATE_UNKNOWN) {
                iD += x.ADAPTER.encodedSizeWithTag(3, value.getVCSEC_CBManagerState());
            }
            if (value.getCBManagerState_timeSince_S() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(4, Integer.valueOf(value.getCBManagerState_timeSince_S()));
            }
            if (value.getVCSEC_CBManagerAuthorization() != w.CBMANAGERAUTHORIZATION_UNKNOWN) {
                iD += w.ADAPTER.encodedSizeWithTag(5, value.getVCSEC_CBManagerAuthorization());
            }
            if (value.getCBManagerAuthorization_timeSince_S() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(6, Integer.valueOf(value.getCBManagerAuthorization_timeSince_S()));
            }
            if (value.getCoreBTError() != t3.IOS_COREBTERROR_SNA) {
                iD += t3.ADAPTER.encodedSizeWithTag(7, value.getCoreBTError());
            }
            if (value.getCoreBTError_timeSince_S() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(8, Integer.valueOf(value.getCoreBTError_timeSince_S()));
            }
            if (value.getCoreBTATTErrorCode() != s3.IOS_COREBTATTERRORCODE_SNA) {
                iD += s3.ADAPTER.encodedSizeWithTag(9, value.getCoreBTATTErrorCode());
            }
            if (value.getCoreBTATTError_timeSince_S() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(10, Integer.valueOf(value.getCoreBTATTError_timeSince_S()));
            }
            if (value.getLaunchReason() != u3.IOS_LAUNCHREASON_SNA) {
                iD += u3.ADAPTER.encodedSizeWithTag(11, value.getLaunchReason());
            }
            if (value.getLaunchReason_timeSince_S() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(12, Integer.valueOf(value.getLaunchReason_timeSince_S()));
            }
            return value.getAppState() != r3.IOS_APPSTATE_SNA ? iD + r3.ADAPTER.encodedSizeWithTag(13, value.getAppState()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public h2 redact(h2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return h2.b(value, null, 0, null, 0, null, 0, null, 0, null, 0, null, 0, null, okio.k.f97943e, 8191, null);
        }
    }

    public h2() {
        this(null, 0, null, 0, null, 0, null, 0, null, 0, null, 0, null, null, 16383, null);
    }

    public static /* synthetic */ h2 b(h2 h2Var, q3 q3Var, int i11, x xVar, int i12, w wVar, int i13, t3 t3Var, int i14, s3 s3Var, int i15, u3 u3Var, int i16, r3 r3Var, okio.k kVar, int i17, Object obj) {
        return h2Var.a((i17 & 1) != 0 ? h2Var.VCSEC_iBeaconState : q3Var, (i17 & 2) != 0 ? h2Var.iBeaconState_timeSince_S : i11, (i17 & 4) != 0 ? h2Var.VCSEC_CBManagerState : xVar, (i17 & 8) != 0 ? h2Var.CBManagerState_timeSince_S : i12, (i17 & 16) != 0 ? h2Var.VCSEC_CBManagerAuthorization : wVar, (i17 & 32) != 0 ? h2Var.CBManagerAuthorization_timeSince_S : i13, (i17 & 64) != 0 ? h2Var.CoreBTError : t3Var, (i17 & 128) != 0 ? h2Var.CoreBTError_timeSince_S : i14, (i17 & 256) != 0 ? h2Var.CoreBTATTErrorCode : s3Var, (i17 & 512) != 0 ? h2Var.CoreBTATTError_timeSince_S : i15, (i17 & 1024) != 0 ? h2Var.launchReason : u3Var, (i17 & 2048) != 0 ? h2Var.launchReason_timeSince_S : i16, (i17 & 4096) != 0 ? h2Var.appState : r3Var, (i17 & PKIFailureInfo.certRevoked) != 0 ? h2Var.unknownFields() : kVar);
    }

    public final h2 a(q3 VCSEC_iBeaconState, int iBeaconState_timeSince_S, x VCSEC_CBManagerState, int CBManagerState_timeSince_S, w VCSEC_CBManagerAuthorization, int CBManagerAuthorization_timeSince_S, t3 CoreBTError, int CoreBTError_timeSince_S, s3 CoreBTATTErrorCode, int CoreBTATTError_timeSince_S, u3 launchReason, int launchReason_timeSince_S, r3 appState, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(VCSEC_iBeaconState, "VCSEC_iBeaconState");
        p013kotlin.jvm.internal.s.k(VCSEC_CBManagerState, "VCSEC_CBManagerState");
        p013kotlin.jvm.internal.s.k(VCSEC_CBManagerAuthorization, "VCSEC_CBManagerAuthorization");
        p013kotlin.jvm.internal.s.k(CoreBTError, "CoreBTError");
        p013kotlin.jvm.internal.s.k(CoreBTATTErrorCode, "CoreBTATTErrorCode");
        p013kotlin.jvm.internal.s.k(launchReason, "launchReason");
        p013kotlin.jvm.internal.s.k(appState, "appState");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new h2(VCSEC_iBeaconState, iBeaconState_timeSince_S, VCSEC_CBManagerState, CBManagerState_timeSince_S, VCSEC_CBManagerAuthorization, CBManagerAuthorization_timeSince_S, CoreBTError, CoreBTError_timeSince_S, CoreBTATTErrorCode, CoreBTATTError_timeSince_S, launchReason, launchReason_timeSince_S, appState, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final r3 getAppState() {
        return this.appState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCBManagerAuthorization_timeSince_S() {
        return this.CBManagerAuthorization_timeSince_S;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getCBManagerState_timeSince_S() {
        return this.CBManagerState_timeSince_S;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), h2Var.unknownFields()) && this.VCSEC_iBeaconState == h2Var.VCSEC_iBeaconState && this.iBeaconState_timeSince_S == h2Var.iBeaconState_timeSince_S && this.VCSEC_CBManagerState == h2Var.VCSEC_CBManagerState && this.CBManagerState_timeSince_S == h2Var.CBManagerState_timeSince_S && this.VCSEC_CBManagerAuthorization == h2Var.VCSEC_CBManagerAuthorization && this.CBManagerAuthorization_timeSince_S == h2Var.CBManagerAuthorization_timeSince_S && this.CoreBTError == h2Var.CoreBTError && this.CoreBTError_timeSince_S == h2Var.CoreBTError_timeSince_S && this.CoreBTATTErrorCode == h2Var.CoreBTATTErrorCode && this.CoreBTATTError_timeSince_S == h2Var.CoreBTATTError_timeSince_S && this.launchReason == h2Var.launchReason && this.launchReason_timeSince_S == h2Var.launchReason_timeSince_S && this.appState == h2Var.appState;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final s3 getCoreBTATTErrorCode() {
        return this.CoreBTATTErrorCode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getCoreBTATTError_timeSince_S() {
        return this.CoreBTATTError_timeSince_S;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final t3 getCoreBTError() {
        return this.CoreBTError;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.VCSEC_iBeaconState.hashCode()) * 37) + Integer.hashCode(this.iBeaconState_timeSince_S)) * 37) + this.VCSEC_CBManagerState.hashCode()) * 37) + Integer.hashCode(this.CBManagerState_timeSince_S)) * 37) + this.VCSEC_CBManagerAuthorization.hashCode()) * 37) + Integer.hashCode(this.CBManagerAuthorization_timeSince_S)) * 37) + this.CoreBTError.hashCode()) * 37) + Integer.hashCode(this.CoreBTError_timeSince_S)) * 37) + this.CoreBTATTErrorCode.hashCode()) * 37) + Integer.hashCode(this.CoreBTATTError_timeSince_S)) * 37) + this.launchReason.hashCode()) * 37) + Integer.hashCode(this.launchReason_timeSince_S)) * 37) + this.appState.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getCoreBTError_timeSince_S() {
        return this.CoreBTError_timeSince_S;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getIBeaconState_timeSince_S() {
        return this.iBeaconState_timeSince_S;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final u3 getLaunchReason() {
        return this.launchReason;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getLaunchReason_timeSince_S() {
        return this.launchReason_timeSince_S;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final w getVCSEC_CBManagerAuthorization() {
        return this.VCSEC_CBManagerAuthorization;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final x getVCSEC_CBManagerState() {
        return this.VCSEC_CBManagerState;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m804newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final q3 getVCSEC_iBeaconState() {
        return this.VCSEC_iBeaconState;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("VCSEC_iBeaconState=" + this.VCSEC_iBeaconState);
        arrayList.add("iBeaconState_timeSince_S=" + this.iBeaconState_timeSince_S);
        arrayList.add("VCSEC_CBManagerState=" + this.VCSEC_CBManagerState);
        arrayList.add("CBManagerState_timeSince_S=" + this.CBManagerState_timeSince_S);
        arrayList.add("VCSEC_CBManagerAuthorization=" + this.VCSEC_CBManagerAuthorization);
        arrayList.add("CBManagerAuthorization_timeSince_S=" + this.CBManagerAuthorization_timeSince_S);
        arrayList.add("CoreBTError=" + this.CoreBTError);
        arrayList.add("CoreBTError_timeSince_S=" + this.CoreBTError_timeSince_S);
        arrayList.add("CoreBTATTErrorCode=" + this.CoreBTATTErrorCode);
        arrayList.add("CoreBTATTError_timeSince_S=" + this.CoreBTATTError_timeSince_S);
        arrayList.add("launchReason=" + this.launchReason);
        arrayList.add("launchReason_timeSince_S=" + this.launchReason_timeSince_S);
        arrayList.add("appState=" + this.appState);
        return p013kotlin.collections.v.y0(arrayList, ", ", "PhoneKeyTelemetry_iOS{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ h2(q3 q3Var, int i11, x xVar, int i12, w wVar, int i13, t3 t3Var, int i14, s3 s3Var, int i15, u3 u3Var, int i16, r3 r3Var, okio.k kVar, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? q3.IBEACON_STATE_SNA : q3Var, (i17 & 2) != 0 ? 0 : i11, (i17 & 4) != 0 ? x.CBMANAGERSTATE_UNKNOWN : xVar, (i17 & 8) != 0 ? 0 : i12, (i17 & 16) != 0 ? w.CBMANAGERAUTHORIZATION_UNKNOWN : wVar, (i17 & 32) != 0 ? 0 : i13, (i17 & 64) != 0 ? t3.IOS_COREBTERROR_SNA : t3Var, (i17 & 128) != 0 ? 0 : i14, (i17 & 256) != 0 ? s3.IOS_COREBTATTERRORCODE_SNA : s3Var, (i17 & 512) != 0 ? 0 : i15, (i17 & 1024) != 0 ? u3.IOS_LAUNCHREASON_SNA : u3Var, (i17 & 2048) == 0 ? i16 : 0, (i17 & 4096) != 0 ? r3.IOS_APPSTATE_SNA : r3Var, (i17 & PKIFailureInfo.certRevoked) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m804newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(q3 VCSEC_iBeaconState, int i11, x VCSEC_CBManagerState, int i12, w VCSEC_CBManagerAuthorization, int i13, t3 CoreBTError, int i14, s3 CoreBTATTErrorCode, int i15, u3 launchReason, int i16, r3 appState, okio.k unknownFields) {
        super(f118721o, unknownFields);
        p013kotlin.jvm.internal.s.k(VCSEC_iBeaconState, "VCSEC_iBeaconState");
        p013kotlin.jvm.internal.s.k(VCSEC_CBManagerState, "VCSEC_CBManagerState");
        p013kotlin.jvm.internal.s.k(VCSEC_CBManagerAuthorization, "VCSEC_CBManagerAuthorization");
        p013kotlin.jvm.internal.s.k(CoreBTError, "CoreBTError");
        p013kotlin.jvm.internal.s.k(CoreBTATTErrorCode, "CoreBTATTErrorCode");
        p013kotlin.jvm.internal.s.k(launchReason, "launchReason");
        p013kotlin.jvm.internal.s.k(appState, "appState");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.VCSEC_iBeaconState = VCSEC_iBeaconState;
        this.iBeaconState_timeSince_S = i11;
        this.VCSEC_CBManagerState = VCSEC_CBManagerState;
        this.CBManagerState_timeSince_S = i12;
        this.VCSEC_CBManagerAuthorization = VCSEC_CBManagerAuthorization;
        this.CBManagerAuthorization_timeSince_S = i13;
        this.CoreBTError = CoreBTError;
        this.CoreBTError_timeSince_S = i14;
        this.CoreBTATTErrorCode = CoreBTATTErrorCode;
        this.CoreBTATTError_timeSince_S = i15;
        this.launchReason = launchReason;
        this.launchReason_timeSince_S = i16;
        this.appState = appState;
    }
}
