package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001f\u0018\u0000 =2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B¡\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J§\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\"R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010\"R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010\"R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b2\u00106R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b7\u00109R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010:\u001a\u0004\b4\u0010;R\u001a\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b.\u0010\"R\u001a\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b<\u0010\"R\u001a\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b=\u0010\"R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010>\u001a\u0004\b0\u0010?R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010@\u001a\u0004\b,\u0010A¨\u0006B"}, d2 = {"Lvc0/i2;", "Lcom/squareup/wire/f;", "", "", "timeSinceBLESwitchEnableInSeconds", "timeSinceAppLaunchInSeconds", "timeSinceBeaconInSeconds", "timeSinceConnectInSeconds", "timeSinceForegroundInSeconds", "timeSinceBackgroundInSeconds", "Lvc0/o1;", "locationPermission", "", "remoteStartIssued", "Lvc0/d2;", "peripheralState", "GATTDiscoveryBitmask", "timeSinceLastMessageCurrentSession", "timeSinceLastMessageAckCurrentSession", "Lvc0/h2;", "iOS", "Lvc0/g2;", "android", "Lokio/k;", "unknownFields", "<init>", "(IIIIIILvc0/o1;ZLvc0/d2;IIILvc0/h2;Lvc0/g2;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(IIIIIILvc0/o1;ZLvc0/d2;IIILvc0/h2;Lvc0/g2;Lokio/k;)Lvc0/i2;", "I", "j", "b", IntegerTokenConverter.CONVERTER_KEY, "c", "l", DateTokenConverter.CONVERTER_KEY, "m", "e", "n", "f", "k", "g", "Lvc0/o1;", "()Lvc0/o1;", "h", "Z", "()Z", "Lvc0/d2;", "()Lvc0/d2;", "p", "o", "Lvc0/h2;", "()Lvc0/h2;", "Lvc0/g2;", "()Lvc0/g2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ProtoAdapter<i2> f118750p = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(i2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final int timeSinceBLESwitchEnableInSeconds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final int timeSinceAppLaunchInSeconds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final int timeSinceBeaconInSeconds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final int timeSinceConnectInSeconds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final int timeSinceForegroundInSeconds;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final int timeSinceBackgroundInSeconds;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.LocationPermission#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final o1 locationPermission;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final boolean remoteStartIssued;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PeripheralState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 11)
    private final d2 peripheralState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 12)
    private final int GATTDiscoveryBitmask;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 13)
    private final int timeSinceLastMessageCurrentSession;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 14)
    private final int timeSinceLastMessageAckCurrentSession;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PhoneKeyTelemetry_iOS#ADAPTER", tag = 9)
    private final h2 iOS;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PhoneKeyTelemetry_Android#ADAPTER", tag = 10)
    private final g2 android;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/i2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/i2;", "value", "", "c", "(Lvc0/i2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/i2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/i2;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/i2;)Lvc0/i2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<i2> {
        a(com.squareup.wire.b bVar, co0.d<i2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.PhoneLogForHandlePulledWithoutAuthentication", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i2 decode(com.squareup.wire.k reader) {
            d2 d2Var;
            h2 h2Var;
            p013kotlin.jvm.internal.s.k(reader, "reader");
            o1 o1Var = o1.LOCATION_PERMISSION_UNKNOWN;
            d2 d2Var2 = d2.PERIPHERALSTATE_SNA;
            long jD = reader.d();
            h2 h2VarDecode = null;
            int iIntValue = 0;
            int iIntValue2 = 0;
            int iIntValue3 = 0;
            int iIntValue4 = 0;
            int iIntValue5 = 0;
            int iIntValue6 = 0;
            boolean zBooleanValue = false;
            int iIntValue7 = 0;
            int iIntValue8 = 0;
            int iIntValue9 = 0;
            g2 g2VarDecode = null;
            d2 d2VarDecode = d2Var2;
            o1 o1VarDecode = o1Var;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new i2(iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, o1VarDecode, zBooleanValue, d2VarDecode, iIntValue7, iIntValue8, iIntValue9, h2VarDecode, g2VarDecode, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        iIntValue = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 2:
                        iIntValue2 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 3:
                        iIntValue3 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 4:
                        iIntValue4 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 5:
                        iIntValue5 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 6:
                        iIntValue6 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 7:
                        d2Var = d2VarDecode;
                        h2Var = h2VarDecode;
                        try {
                            o1VarDecode = o1.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            o1VarDecode = o1VarDecode;
                        }
                        h2VarDecode = h2Var;
                        d2VarDecode = d2Var;
                        break;
                    case 8:
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 9:
                        h2VarDecode = h2.f118721o.decode(reader);
                        break;
                    case 10:
                        g2VarDecode = g2.f118699j.decode(reader);
                        break;
                    case 11:
                        try {
                            d2VarDecode = d2.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            d2Var = d2VarDecode;
                            h2Var = h2VarDecode;
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                            o1VarDecode = o1VarDecode;
                            h2VarDecode = h2Var;
                            d2VarDecode = d2Var;
                        }
                        break;
                    case 12:
                        iIntValue7 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 13:
                        iIntValue8 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 14:
                        iIntValue9 = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    default:
                        reader.m(iG);
                        d2Var = d2VarDecode;
                        h2Var = h2VarDecode;
                        o1VarDecode = o1VarDecode;
                        h2VarDecode = h2Var;
                        d2VarDecode = d2Var;
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, i2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getTimeSinceBLESwitchEnableInSeconds() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getTimeSinceBLESwitchEnableInSeconds()));
            }
            if (value.getTimeSinceAppLaunchInSeconds() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getTimeSinceAppLaunchInSeconds()));
            }
            if (value.getTimeSinceBeaconInSeconds() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 3, Integer.valueOf(value.getTimeSinceBeaconInSeconds()));
            }
            if (value.getTimeSinceConnectInSeconds() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 4, Integer.valueOf(value.getTimeSinceConnectInSeconds()));
            }
            if (value.getTimeSinceForegroundInSeconds() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 5, Integer.valueOf(value.getTimeSinceForegroundInSeconds()));
            }
            if (value.getTimeSinceBackgroundInSeconds() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 6, Integer.valueOf(value.getTimeSinceBackgroundInSeconds()));
            }
            if (value.getLocationPermission() != o1.LOCATION_PERMISSION_UNKNOWN) {
                o1.ADAPTER.encodeWithTag(writer, 7, value.getLocationPermission());
            }
            if (value.getRemoteStartIssued()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, Boolean.valueOf(value.getRemoteStartIssued()));
            }
            if (value.getPeripheralState() != d2.PERIPHERALSTATE_SNA) {
                d2.ADAPTER.encodeWithTag(writer, 11, value.getPeripheralState());
            }
            if (value.getGATTDiscoveryBitmask() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 12, Integer.valueOf(value.getGATTDiscoveryBitmask()));
            }
            if (value.getTimeSinceLastMessageCurrentSession() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 13, Integer.valueOf(value.getTimeSinceLastMessageCurrentSession()));
            }
            if (value.getTimeSinceLastMessageAckCurrentSession() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 14, Integer.valueOf(value.getTimeSinceLastMessageAckCurrentSession()));
            }
            h2.f118721o.encodeWithTag(writer, 9, value.getIOS());
            g2.f118699j.encodeWithTag(writer, 10, value.getAndroid());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(i2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getTimeSinceBLESwitchEnableInSeconds() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(1, Integer.valueOf(value.getTimeSinceBLESwitchEnableInSeconds()));
            }
            if (value.getTimeSinceAppLaunchInSeconds() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(2, Integer.valueOf(value.getTimeSinceAppLaunchInSeconds()));
            }
            if (value.getTimeSinceBeaconInSeconds() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(3, Integer.valueOf(value.getTimeSinceBeaconInSeconds()));
            }
            if (value.getTimeSinceConnectInSeconds() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(4, Integer.valueOf(value.getTimeSinceConnectInSeconds()));
            }
            if (value.getTimeSinceForegroundInSeconds() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(5, Integer.valueOf(value.getTimeSinceForegroundInSeconds()));
            }
            if (value.getTimeSinceBackgroundInSeconds() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(6, Integer.valueOf(value.getTimeSinceBackgroundInSeconds()));
            }
            if (value.getLocationPermission() != o1.LOCATION_PERMISSION_UNKNOWN) {
                iD += o1.ADAPTER.encodedSizeWithTag(7, value.getLocationPermission());
            }
            if (value.getRemoteStartIssued()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getRemoteStartIssued()));
            }
            if (value.getPeripheralState() != d2.PERIPHERALSTATE_SNA) {
                iD += d2.ADAPTER.encodedSizeWithTag(11, value.getPeripheralState());
            }
            if (value.getGATTDiscoveryBitmask() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(12, Integer.valueOf(value.getGATTDiscoveryBitmask()));
            }
            if (value.getTimeSinceLastMessageCurrentSession() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(13, Integer.valueOf(value.getTimeSinceLastMessageCurrentSession()));
            }
            if (value.getTimeSinceLastMessageAckCurrentSession() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(14, Integer.valueOf(value.getTimeSinceLastMessageAckCurrentSession()));
            }
            return iD + h2.f118721o.encodedSizeWithTag(9, value.getIOS()) + g2.f118699j.encodedSizeWithTag(10, value.getAndroid());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public i2 redact(i2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            h2 ios = value.getIOS();
            h2 h2VarRedact = ios != null ? h2.f118721o.redact(ios) : null;
            g2 android2 = value.getAndroid();
            return i2.b(value, 0, 0, 0, 0, 0, 0, null, false, null, 0, 0, 0, h2VarRedact, android2 != null ? g2.f118699j.redact(android2) : null, okio.k.f97943e, 4095, null);
        }
    }

    public i2() {
        this(0, 0, 0, 0, 0, 0, null, false, null, 0, 0, 0, null, null, null, 32767, null);
    }

    public static /* synthetic */ i2 b(i2 i2Var, int i11, int i12, int i13, int i14, int i15, int i16, o1 o1Var, boolean z11, d2 d2Var, int i17, int i18, int i19, h2 h2Var, g2 g2Var, okio.k kVar, int i21, Object obj) {
        return i2Var.a((i21 & 1) != 0 ? i2Var.timeSinceBLESwitchEnableInSeconds : i11, (i21 & 2) != 0 ? i2Var.timeSinceAppLaunchInSeconds : i12, (i21 & 4) != 0 ? i2Var.timeSinceBeaconInSeconds : i13, (i21 & 8) != 0 ? i2Var.timeSinceConnectInSeconds : i14, (i21 & 16) != 0 ? i2Var.timeSinceForegroundInSeconds : i15, (i21 & 32) != 0 ? i2Var.timeSinceBackgroundInSeconds : i16, (i21 & 64) != 0 ? i2Var.locationPermission : o1Var, (i21 & 128) != 0 ? i2Var.remoteStartIssued : z11, (i21 & 256) != 0 ? i2Var.peripheralState : d2Var, (i21 & 512) != 0 ? i2Var.GATTDiscoveryBitmask : i17, (i21 & 1024) != 0 ? i2Var.timeSinceLastMessageCurrentSession : i18, (i21 & 2048) != 0 ? i2Var.timeSinceLastMessageAckCurrentSession : i19, (i21 & 4096) != 0 ? i2Var.iOS : h2Var, (i21 & PKIFailureInfo.certRevoked) != 0 ? i2Var.android : g2Var, (i21 & 16384) != 0 ? i2Var.unknownFields() : kVar);
    }

    public final i2 a(int timeSinceBLESwitchEnableInSeconds, int timeSinceAppLaunchInSeconds, int timeSinceBeaconInSeconds, int timeSinceConnectInSeconds, int timeSinceForegroundInSeconds, int timeSinceBackgroundInSeconds, o1 locationPermission, boolean remoteStartIssued, d2 peripheralState, int GATTDiscoveryBitmask, int timeSinceLastMessageCurrentSession, int timeSinceLastMessageAckCurrentSession, h2 iOS, g2 android2, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(locationPermission, "locationPermission");
        p013kotlin.jvm.internal.s.k(peripheralState, "peripheralState");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new i2(timeSinceBLESwitchEnableInSeconds, timeSinceAppLaunchInSeconds, timeSinceBeaconInSeconds, timeSinceConnectInSeconds, timeSinceForegroundInSeconds, timeSinceBackgroundInSeconds, locationPermission, remoteStartIssued, peripheralState, GATTDiscoveryBitmask, timeSinceLastMessageCurrentSession, timeSinceLastMessageAckCurrentSession, iOS, android2, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g2 getAndroid() {
        return this.android;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getGATTDiscoveryBitmask() {
        return this.GATTDiscoveryBitmask;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h2 getIOS() {
        return this.iOS;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), i2Var.unknownFields()) && this.timeSinceBLESwitchEnableInSeconds == i2Var.timeSinceBLESwitchEnableInSeconds && this.timeSinceAppLaunchInSeconds == i2Var.timeSinceAppLaunchInSeconds && this.timeSinceBeaconInSeconds == i2Var.timeSinceBeaconInSeconds && this.timeSinceConnectInSeconds == i2Var.timeSinceConnectInSeconds && this.timeSinceForegroundInSeconds == i2Var.timeSinceForegroundInSeconds && this.timeSinceBackgroundInSeconds == i2Var.timeSinceBackgroundInSeconds && this.locationPermission == i2Var.locationPermission && this.remoteStartIssued == i2Var.remoteStartIssued && this.peripheralState == i2Var.peripheralState && this.GATTDiscoveryBitmask == i2Var.GATTDiscoveryBitmask && this.timeSinceLastMessageCurrentSession == i2Var.timeSinceLastMessageCurrentSession && this.timeSinceLastMessageAckCurrentSession == i2Var.timeSinceLastMessageAckCurrentSession && p013kotlin.jvm.internal.s.f(this.iOS, i2Var.iOS) && p013kotlin.jvm.internal.s.f(this.android, i2Var.android);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final o1 getLocationPermission() {
        return this.locationPermission;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final d2 getPeripheralState() {
        return this.peripheralState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getRemoteStartIssued() {
        return this.remoteStartIssued;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((((((((((((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.timeSinceBLESwitchEnableInSeconds)) * 37) + Integer.hashCode(this.timeSinceAppLaunchInSeconds)) * 37) + Integer.hashCode(this.timeSinceBeaconInSeconds)) * 37) + Integer.hashCode(this.timeSinceConnectInSeconds)) * 37) + Integer.hashCode(this.timeSinceForegroundInSeconds)) * 37) + Integer.hashCode(this.timeSinceBackgroundInSeconds)) * 37) + this.locationPermission.hashCode()) * 37) + Boolean.hashCode(this.remoteStartIssued)) * 37) + this.peripheralState.hashCode()) * 37) + Integer.hashCode(this.GATTDiscoveryBitmask)) * 37) + Integer.hashCode(this.timeSinceLastMessageCurrentSession)) * 37) + Integer.hashCode(this.timeSinceLastMessageAckCurrentSession)) * 37;
        h2 h2Var = this.iOS;
        int iHashCode2 = (iHashCode + (h2Var != null ? h2Var.hashCode() : 0)) * 37;
        g2 g2Var = this.android;
        int iHashCode3 = iHashCode2 + (g2Var != null ? g2Var.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getTimeSinceAppLaunchInSeconds() {
        return this.timeSinceAppLaunchInSeconds;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getTimeSinceBLESwitchEnableInSeconds() {
        return this.timeSinceBLESwitchEnableInSeconds;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getTimeSinceBackgroundInSeconds() {
        return this.timeSinceBackgroundInSeconds;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getTimeSinceBeaconInSeconds() {
        return this.timeSinceBeaconInSeconds;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getTimeSinceConnectInSeconds() {
        return this.timeSinceConnectInSeconds;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getTimeSinceForegroundInSeconds() {
        return this.timeSinceForegroundInSeconds;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m808newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getTimeSinceLastMessageAckCurrentSession() {
        return this.timeSinceLastMessageAckCurrentSession;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getTimeSinceLastMessageCurrentSession() {
        return this.timeSinceLastMessageCurrentSession;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("timeSinceBLESwitchEnableInSeconds=" + this.timeSinceBLESwitchEnableInSeconds);
        arrayList.add("timeSinceAppLaunchInSeconds=" + this.timeSinceAppLaunchInSeconds);
        arrayList.add("timeSinceBeaconInSeconds=" + this.timeSinceBeaconInSeconds);
        arrayList.add("timeSinceConnectInSeconds=" + this.timeSinceConnectInSeconds);
        arrayList.add("timeSinceForegroundInSeconds=" + this.timeSinceForegroundInSeconds);
        arrayList.add("timeSinceBackgroundInSeconds=" + this.timeSinceBackgroundInSeconds);
        arrayList.add("locationPermission=" + this.locationPermission);
        arrayList.add("remoteStartIssued=" + this.remoteStartIssued);
        arrayList.add("peripheralState=" + this.peripheralState);
        arrayList.add("GATTDiscoveryBitmask=" + this.GATTDiscoveryBitmask);
        arrayList.add("timeSinceLastMessageCurrentSession=" + this.timeSinceLastMessageCurrentSession);
        arrayList.add("timeSinceLastMessageAckCurrentSession=" + this.timeSinceLastMessageAckCurrentSession);
        h2 h2Var = this.iOS;
        if (h2Var != null) {
            arrayList.add("iOS=" + h2Var);
        }
        g2 g2Var = this.android;
        if (g2Var != null) {
            arrayList.add("android=" + g2Var);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "PhoneLogForHandlePulledWithoutAuthentication{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ i2(int i11, int i12, int i13, int i14, int i15, int i16, o1 o1Var, boolean z11, d2 d2Var, int i17, int i18, int i19, h2 h2Var, g2 g2Var, okio.k kVar, int i21, DefaultConstructorMarker defaultConstructorMarker) {
        this((i21 & 1) != 0 ? 0 : i11, (i21 & 2) != 0 ? 0 : i12, (i21 & 4) != 0 ? 0 : i13, (i21 & 8) != 0 ? 0 : i14, (i21 & 16) != 0 ? 0 : i15, (i21 & 32) != 0 ? 0 : i16, (i21 & 64) != 0 ? o1.LOCATION_PERMISSION_UNKNOWN : o1Var, (i21 & 128) != 0 ? false : z11, (i21 & 256) != 0 ? d2.PERIPHERALSTATE_SNA : d2Var, (i21 & 512) != 0 ? 0 : i17, (i21 & 1024) != 0 ? 0 : i18, (i21 & 2048) == 0 ? i19 : 0, (i21 & 4096) != 0 ? null : h2Var, (i21 & PKIFailureInfo.certRevoked) == 0 ? g2Var : null, (i21 & 16384) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m808newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(int i11, int i12, int i13, int i14, int i15, int i16, o1 locationPermission, boolean z11, d2 peripheralState, int i17, int i18, int i19, h2 h2Var, g2 g2Var, okio.k unknownFields) {
        super(f118750p, unknownFields);
        p013kotlin.jvm.internal.s.k(locationPermission, "locationPermission");
        p013kotlin.jvm.internal.s.k(peripheralState, "peripheralState");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.timeSinceBLESwitchEnableInSeconds = i11;
        this.timeSinceAppLaunchInSeconds = i12;
        this.timeSinceBeaconInSeconds = i13;
        this.timeSinceConnectInSeconds = i14;
        this.timeSinceForegroundInSeconds = i15;
        this.timeSinceBackgroundInSeconds = i16;
        this.locationPermission = locationPermission;
        this.remoteStartIssued = z11;
        this.peripheralState = peripheralState;
        this.GATTDiscoveryBitmask = i17;
        this.timeSinceLastMessageCurrentSession = i18;
        this.timeSinceLastMessageAckCurrentSession = i19;
        this.iOS = h2Var;
        this.android = g2Var;
        if (x20.d.c(h2Var, g2Var) > 1) {
            throw new IllegalArgumentException("At most one of iOS, android may be non-null");
        }
    }
}
