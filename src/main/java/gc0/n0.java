package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import j$.time.Instant;
import java.util.ArrayList;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b(\u0018\u0000 A2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002,.B¿\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010&JÅ\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010$R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b2\u0010$R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00107\u001a\u0004\b8\u00109R\"\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010>\u001a\u0004\bA\u0010@R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010B\u001a\u0004\b4\u0010CR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010B\u001a\u0004\b1\u0010CR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010B\u001a\u0004\b:\u0010CR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u00105\u001a\u0004\bD\u0010&R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010E\u001a\u0004\b.\u0010F¨\u0006G"}, d2 = {"Lgc0/n0;", "Lcom/squareup/wire/f;", "", "", "scheduled_time_ms_OBSOLETE", "warning_time_remaining_ms_OBSOLETE", "", "expected_duration_sec_OBSOLETE", "download_perc_OBSOLETE", "install_perc_OBSOLETE", "", "version_OBSOLETE", "Lgc0/n0$c;", PermissionsResponse.STATUS_KEY, "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "scheduled_time_ms", "warning_time_remaining_ms", "expected_duration_sec", "download_perc", "install_perc", "version", "", "auto_scheduled", "Lokio/k;", "unknownFields", "<init>", "(JJIIILjava/lang/String;Lgc0/n0$c;Lj$/time/Instant;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(JJIIILjava/lang/String;Lgc0/n0$c;Lj$/time/Instant;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lokio/k;)Lgc0/n0;", "J", "k", "()J", "b", "q", "c", "I", "g", DateTokenConverter.CONVERTER_KEY, "e", IntegerTokenConverter.CONVERTER_KEY, "f", "Ljava/lang/String;", "o", "Lgc0/n0$c;", "l", "()Lgc0/n0$c;", "h", "Lj$/time/Instant;", "m", "()Lj$/time/Instant;", "Ljava/lang/Long;", "j", "()Ljava/lang/Long;", "p", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "n", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ProtoAdapter<n0> f68142q = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(n0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "scheduledTimeMsOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final long scheduled_time_ms_OBSOLETE;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "warningTimeRemainingMsOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final long warning_time_remaining_ms_OBSOLETE;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "expectedDurationSecOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final int expected_duration_sec_OBSOLETE;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "downloadPercOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final int download_perc_OBSOLETE;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "installPercOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final int install_perc_OBSOLETE;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "versionOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final String version_OBSOLETE;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.SoftwareUpdateState$SoftwareUpdateStatus#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final c status;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 108)
    private final Instant timestamp;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "scheduledTimeMs", tag = 102)
    private final Long scheduled_time_ms;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "warningTimeRemainingMs", tag = 103)
    private final Long warning_time_remaining_ms;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "expectedDurationSec", tag = 104)
    private final Integer expected_duration_sec;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "downloadPerc", tag = 105)
    private final Integer download_perc;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "installPerc", tag = 106)
    private final Integer install_perc;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 107)
    private final String version;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "autoScheduled", tag = 109)
    private final Boolean auto_scheduled;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/n0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/n0;", "value", "", "c", "(Lgc0/n0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/n0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/n0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/n0;)Lgc0/n0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<n0> {
        a(com.squareup.wire.b bVar, co0.d<n0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.SoftwareUpdateState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            String strDecode = "";
            c cVarDecode = null;
            long jLongValue = 0;
            long jLongValue2 = 0;
            int iIntValue = 0;
            int iIntValue2 = 0;
            int iIntValue3 = 0;
            Long lDecode = null;
            Long lDecode2 = null;
            Integer numDecode = null;
            Integer numDecode2 = null;
            Integer numDecode3 = null;
            String strDecode2 = null;
            Boolean boolDecode = null;
            Instant instantDecode = null;
            while (true) {
                int iG = reader.g();
                Long l11 = lDecode;
                if (iG == -1) {
                    return new n0(jLongValue, jLongValue2, iIntValue, iIntValue2, iIntValue3, strDecode, cVarDecode, instantDecode, l11, lDecode2, numDecode, numDecode2, numDecode3, strDecode2, boolDecode, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        cVarDecode = c.f68159h.decode(reader);
                        lDecode = l11;
                        break;
                    case 2:
                        jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
                        lDecode = l11;
                        break;
                    case 3:
                        jLongValue2 = ProtoAdapter.UINT64.decode(reader).longValue();
                        lDecode = l11;
                        break;
                    case 4:
                        iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                        lDecode = l11;
                        break;
                    case 5:
                        iIntValue2 = ProtoAdapter.UINT32.decode(reader).intValue();
                        lDecode = l11;
                        break;
                    case 6:
                        iIntValue3 = ProtoAdapter.UINT32.decode(reader).intValue();
                        lDecode = l11;
                        break;
                    case 7:
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        lDecode = l11;
                        break;
                    default:
                        switch (iG) {
                            case 102:
                                lDecode = ProtoAdapter.UINT64.decode(reader);
                                continue;
                            case 103:
                                lDecode2 = ProtoAdapter.UINT64.decode(reader);
                                break;
                            case 104:
                                numDecode = ProtoAdapter.UINT32.decode(reader);
                                break;
                            case 105:
                                numDecode2 = ProtoAdapter.UINT32.decode(reader);
                                break;
                            case 106:
                                numDecode3 = ProtoAdapter.UINT32.decode(reader);
                                break;
                            case 107:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 108:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 109:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            default:
                                reader.m(iG);
                                break;
                        }
                        lDecode = l11;
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, n0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getScheduled_time_ms_OBSOLETE() != 0) {
                ProtoAdapter.UINT64.encodeWithTag(writer, 2, Long.valueOf(value.getScheduled_time_ms_OBSOLETE()));
            }
            if (value.getWarning_time_remaining_ms_OBSOLETE() != 0) {
                ProtoAdapter.UINT64.encodeWithTag(writer, 3, Long.valueOf(value.getWarning_time_remaining_ms_OBSOLETE()));
            }
            if (value.getExpected_duration_sec_OBSOLETE() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 4, Integer.valueOf(value.getExpected_duration_sec_OBSOLETE()));
            }
            if (value.getDownload_perc_OBSOLETE() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 5, Integer.valueOf(value.getDownload_perc_OBSOLETE()));
            }
            if (value.getInstall_perc_OBSOLETE() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, Integer.valueOf(value.getInstall_perc_OBSOLETE()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getVersion_OBSOLETE(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 7, value.getVersion_OBSOLETE());
            }
            if (value.getStatus() != null) {
                c.f68159h.encodeWithTag(writer, 1, value.getStatus());
            }
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 108, value.getTimestamp());
            }
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.UINT64;
            protoAdapter.encodeWithTag(writer, 102, value.getScheduled_time_ms());
            protoAdapter.encodeWithTag(writer, 103, value.getWarning_time_remaining_ms());
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.UINT32;
            protoAdapter2.encodeWithTag(writer, 104, value.getExpected_duration_sec());
            protoAdapter2.encodeWithTag(writer, 105, value.getDownload_perc());
            protoAdapter2.encodeWithTag(writer, 106, value.getInstall_perc());
            ProtoAdapter.STRING.encodeWithTag(writer, 107, value.getVersion());
            ProtoAdapter.BOOL.encodeWithTag(writer, 109, value.getAuto_scheduled());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(n0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getScheduled_time_ms_OBSOLETE() != 0) {
                iD += ProtoAdapter.UINT64.encodedSizeWithTag(2, Long.valueOf(value.getScheduled_time_ms_OBSOLETE()));
            }
            if (value.getWarning_time_remaining_ms_OBSOLETE() != 0) {
                iD += ProtoAdapter.UINT64.encodedSizeWithTag(3, Long.valueOf(value.getWarning_time_remaining_ms_OBSOLETE()));
            }
            if (value.getExpected_duration_sec_OBSOLETE() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(4, Integer.valueOf(value.getExpected_duration_sec_OBSOLETE()));
            }
            if (value.getDownload_perc_OBSOLETE() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(5, Integer.valueOf(value.getDownload_perc_OBSOLETE()));
            }
            if (value.getInstall_perc_OBSOLETE() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(6, Integer.valueOf(value.getInstall_perc_OBSOLETE()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getVersion_OBSOLETE(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getVersion_OBSOLETE());
            }
            if (value.getStatus() != null) {
                iD += c.f68159h.encodedSizeWithTag(1, value.getStatus());
            }
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(108, value.getTimestamp());
            }
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.UINT64;
            int iEncodedSizeWithTag = iD + protoAdapter.encodedSizeWithTag(102, value.getScheduled_time_ms()) + protoAdapter.encodedSizeWithTag(103, value.getWarning_time_remaining_ms());
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.UINT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(104, value.getExpected_duration_sec()) + protoAdapter2.encodedSizeWithTag(105, value.getDownload_perc()) + protoAdapter2.encodedSizeWithTag(106, value.getInstall_perc()) + ProtoAdapter.STRING.encodedSizeWithTag(107, value.getVersion()) + ProtoAdapter.BOOL.encodedSizeWithTag(109, value.getAuto_scheduled());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public n0 redact(n0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            c status = value.getStatus();
            c cVarRedact = status != null ? c.f68159h.redact(status) : null;
            Instant timestamp = value.getTimestamp();
            return n0.b(value, 0L, 0L, 0, 0, 0, null, cVarRedact, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, null, null, null, null, null, okio.k.f97943e, 32575, null);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BY\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ_\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b\"\u0010\u001f¨\u0006%"}, d2 = {"Lgc0/n0$c;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "Unknown", "Installing", "Scheduled", "Available", "DownloadingWifiWait", "Downloading", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lgc0/n0$c;", "Lec0/h0;", "g", "()Lec0/h0;", "b", "e", "c", "f", DateTokenConverter.CONVERTER_KEY, "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends com.squareup.wire.f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final ProtoAdapter<c> f68159h = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(c.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
        private final ec0.h0 Unknown;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
        private final ec0.h0 Installing;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
        private final ec0.h0 Scheduled;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
        private final ec0.h0 Available;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)
        private final ec0.h0 DownloadingWifiWait;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)
        private final ec0.h0 Downloading;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/n0$c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/n0$c;", "value", "", "c", "(Lgc0/n0$c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/n0$c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/n0$c;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/n0$c;)Lgc0/n0$c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, co0.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.SoftwareUpdateState.SoftwareUpdateStatus", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                long jD = reader.d();
                ec0.h0 h0VarDecode = null;
                ec0.h0 h0VarDecode2 = null;
                ec0.h0 h0VarDecode3 = null;
                ec0.h0 h0VarDecode4 = null;
                ec0.h0 h0VarDecode5 = null;
                ec0.h0 h0VarDecode6 = null;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new c(h0VarDecode, h0VarDecode2, h0VarDecode3, h0VarDecode4, h0VarDecode5, h0VarDecode6, reader.e(jD));
                    }
                    switch (iG) {
                        case 1:
                            h0VarDecode = ec0.h0.f62622b.decode(reader);
                            break;
                        case 2:
                            h0VarDecode2 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 3:
                            h0VarDecode3 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 4:
                            h0VarDecode4 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 5:
                            h0VarDecode5 = ec0.h0.f62622b.decode(reader);
                            break;
                        case 6:
                            h0VarDecode6 = ec0.h0.f62622b.decode(reader);
                            break;
                        default:
                            reader.m(iG);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void encode(com.squareup.wire.l writer, c value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                protoAdapter.encodeWithTag(writer, 1, value.getUnknown());
                protoAdapter.encodeWithTag(writer, 2, value.getInstalling());
                protoAdapter.encodeWithTag(writer, 3, value.getScheduled());
                protoAdapter.encodeWithTag(writer, 4, value.getAvailable());
                protoAdapter.encodeWithTag(writer, 5, value.getDownloadingWifiWait());
                protoAdapter.encodeWithTag(writer, 6, value.getDownloading());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                return iD + protoAdapter.encodedSizeWithTag(1, value.getUnknown()) + protoAdapter.encodedSizeWithTag(2, value.getInstalling()) + protoAdapter.encodedSizeWithTag(3, value.getScheduled()) + protoAdapter.encodedSizeWithTag(4, value.getAvailable()) + protoAdapter.encodedSizeWithTag(5, value.getDownloadingWifiWait()) + protoAdapter.encodedSizeWithTag(6, value.getDownloading());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public c redact(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                ec0.h0 unknown = value.getUnknown();
                ec0.h0 h0VarRedact = unknown != null ? ec0.h0.f62622b.redact(unknown) : null;
                ec0.h0 installing = value.getInstalling();
                ec0.h0 h0VarRedact2 = installing != null ? ec0.h0.f62622b.redact(installing) : null;
                ec0.h0 scheduled = value.getScheduled();
                ec0.h0 h0VarRedact3 = scheduled != null ? ec0.h0.f62622b.redact(scheduled) : null;
                ec0.h0 available = value.getAvailable();
                ec0.h0 h0VarRedact4 = available != null ? ec0.h0.f62622b.redact(available) : null;
                ec0.h0 downloadingWifiWait = value.getDownloadingWifiWait();
                ec0.h0 h0VarRedact5 = downloadingWifiWait != null ? ec0.h0.f62622b.redact(downloadingWifiWait) : null;
                ec0.h0 downloading = value.getDownloading();
                return value.a(h0VarRedact, h0VarRedact2, h0VarRedact3, h0VarRedact4, h0VarRedact5, downloading != null ? ec0.h0.f62622b.redact(downloading) : null, okio.k.f97943e);
            }
        }

        public c() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public final c a(ec0.h0 Unknown, ec0.h0 Installing, ec0.h0 Scheduled, ec0.h0 Available, ec0.h0 DownloadingWifiWait, ec0.h0 Downloading, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new c(Unknown, Installing, Scheduled, Available, DownloadingWifiWait, Downloading, unknownFields);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ec0.h0 getAvailable() {
            return this.Available;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ec0.h0 getDownloading() {
            return this.Downloading;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ec0.h0 getDownloadingWifiWait() {
            return this.DownloadingWifiWait;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ec0.h0 getInstalling() {
            return this.Installing;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), cVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.Unknown, cVar.Unknown) && p013kotlin.jvm.internal.s.f(this.Installing, cVar.Installing) && p013kotlin.jvm.internal.s.f(this.Scheduled, cVar.Scheduled) && p013kotlin.jvm.internal.s.f(this.Available, cVar.Available) && p013kotlin.jvm.internal.s.f(this.DownloadingWifiWait, cVar.DownloadingWifiWait) && p013kotlin.jvm.internal.s.f(this.Downloading, cVar.Downloading);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ec0.h0 getScheduled() {
            return this.Scheduled;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ec0.h0 getUnknown() {
            return this.Unknown;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ec0.h0 h0Var = this.Unknown;
            int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
            ec0.h0 h0Var2 = this.Installing;
            int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
            ec0.h0 h0Var3 = this.Scheduled;
            int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
            ec0.h0 h0Var4 = this.Available;
            int iHashCode5 = (iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0)) * 37;
            ec0.h0 h0Var5 = this.DownloadingWifiWait;
            int iHashCode6 = (iHashCode5 + (h0Var5 != null ? h0Var5.hashCode() : 0)) * 37;
            ec0.h0 h0Var6 = this.Downloading;
            int iHashCode7 = iHashCode6 + (h0Var6 != null ? h0Var6.hashCode() : 0);
            this.hashCode = iHashCode7;
            return iHashCode7;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m415newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ec0.h0 h0Var = this.Unknown;
            if (h0Var != null) {
                arrayList.add("Unknown=" + h0Var);
            }
            ec0.h0 h0Var2 = this.Installing;
            if (h0Var2 != null) {
                arrayList.add("Installing=" + h0Var2);
            }
            ec0.h0 h0Var3 = this.Scheduled;
            if (h0Var3 != null) {
                arrayList.add("Scheduled=" + h0Var3);
            }
            ec0.h0 h0Var4 = this.Available;
            if (h0Var4 != null) {
                arrayList.add("Available=" + h0Var4);
            }
            ec0.h0 h0Var5 = this.DownloadingWifiWait;
            if (h0Var5 != null) {
                arrayList.add("DownloadingWifiWait=" + h0Var5);
            }
            ec0.h0 h0Var6 = this.Downloading;
            if (h0Var6 != null) {
                arrayList.add("Downloading=" + h0Var6);
            }
            return p013kotlin.collections.v.y0(arrayList, ", ", "SoftwareUpdateStatus{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ c(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, ec0.h0 h0Var5, ec0.h0 h0Var6, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? null : h0Var5, (i11 & 32) != 0 ? null : h0Var6, (i11 & 64) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m415newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, ec0.h0 h0Var5, ec0.h0 h0Var6, okio.k unknownFields) {
            super(f68159h, unknownFields);
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.Unknown = h0Var;
            this.Installing = h0Var2;
            this.Scheduled = h0Var3;
            this.Available = h0Var4;
            this.DownloadingWifiWait = h0Var5;
            this.Downloading = h0Var6;
            if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, h0Var5, h0Var6) > 1) {
                throw new IllegalArgumentException("At most one of Unknown, Installing, Scheduled, Available, DownloadingWifiWait, Downloading may be non-null");
            }
        }
    }

    public n0() {
        this(0L, 0L, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public static /* synthetic */ n0 b(n0 n0Var, long j11, long j12, int i11, int i12, int i13, String str, c cVar, Instant instant, Long l11, Long l12, Integer num, Integer num2, Integer num3, String str2, Boolean bool, okio.k kVar, int i14, Object obj) {
        long j13 = (i14 & 1) != 0 ? n0Var.scheduled_time_ms_OBSOLETE : j11;
        return n0Var.a(j13, (i14 & 2) != 0 ? n0Var.warning_time_remaining_ms_OBSOLETE : j12, (i14 & 4) != 0 ? n0Var.expected_duration_sec_OBSOLETE : i11, (i14 & 8) != 0 ? n0Var.download_perc_OBSOLETE : i12, (i14 & 16) != 0 ? n0Var.install_perc_OBSOLETE : i13, (i14 & 32) != 0 ? n0Var.version_OBSOLETE : str, (i14 & 64) != 0 ? n0Var.status : cVar, (i14 & 128) != 0 ? n0Var.timestamp : instant, (i14 & 256) != 0 ? n0Var.scheduled_time_ms : l11, (i14 & 512) != 0 ? n0Var.warning_time_remaining_ms : l12, (i14 & 1024) != 0 ? n0Var.expected_duration_sec : num, (i14 & 2048) != 0 ? n0Var.download_perc : num2, (i14 & 4096) != 0 ? n0Var.install_perc : num3, (i14 & PKIFailureInfo.certRevoked) != 0 ? n0Var.version : str2, (i14 & 16384) != 0 ? n0Var.auto_scheduled : bool, (i14 & 32768) != 0 ? n0Var.unknownFields() : kVar);
    }

    public final n0 a(long scheduled_time_ms_OBSOLETE, long warning_time_remaining_ms_OBSOLETE, int expected_duration_sec_OBSOLETE, int download_perc_OBSOLETE, int install_perc_OBSOLETE, String version_OBSOLETE, c status, Instant timestamp, Long scheduled_time_ms, Long warning_time_remaining_ms, Integer expected_duration_sec, Integer download_perc, Integer install_perc, String version, Boolean auto_scheduled, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(version_OBSOLETE, "version_OBSOLETE");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new n0(scheduled_time_ms_OBSOLETE, warning_time_remaining_ms_OBSOLETE, expected_duration_sec_OBSOLETE, download_perc_OBSOLETE, install_perc_OBSOLETE, version_OBSOLETE, status, timestamp, scheduled_time_ms, warning_time_remaining_ms, expected_duration_sec, download_perc, install_perc, version, auto_scheduled, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getAuto_scheduled() {
        return this.auto_scheduled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getDownload_perc() {
        return this.download_perc;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getDownload_perc_OBSOLETE() {
        return this.download_perc_OBSOLETE;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), n0Var.unknownFields()) && this.scheduled_time_ms_OBSOLETE == n0Var.scheduled_time_ms_OBSOLETE && this.warning_time_remaining_ms_OBSOLETE == n0Var.warning_time_remaining_ms_OBSOLETE && this.expected_duration_sec_OBSOLETE == n0Var.expected_duration_sec_OBSOLETE && this.download_perc_OBSOLETE == n0Var.download_perc_OBSOLETE && this.install_perc_OBSOLETE == n0Var.install_perc_OBSOLETE && p013kotlin.jvm.internal.s.f(this.version_OBSOLETE, n0Var.version_OBSOLETE) && p013kotlin.jvm.internal.s.f(this.status, n0Var.status) && p013kotlin.jvm.internal.s.f(this.timestamp, n0Var.timestamp) && p013kotlin.jvm.internal.s.f(this.scheduled_time_ms, n0Var.scheduled_time_ms) && p013kotlin.jvm.internal.s.f(this.warning_time_remaining_ms, n0Var.warning_time_remaining_ms) && p013kotlin.jvm.internal.s.f(this.expected_duration_sec, n0Var.expected_duration_sec) && p013kotlin.jvm.internal.s.f(this.download_perc, n0Var.download_perc) && p013kotlin.jvm.internal.s.f(this.install_perc, n0Var.install_perc) && p013kotlin.jvm.internal.s.f(this.version, n0Var.version) && p013kotlin.jvm.internal.s.f(this.auto_scheduled, n0Var.auto_scheduled);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getExpected_duration_sec() {
        return this.expected_duration_sec;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getExpected_duration_sec_OBSOLETE() {
        return this.expected_duration_sec_OBSOLETE;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getInstall_perc() {
        return this.install_perc;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + Long.hashCode(this.scheduled_time_ms_OBSOLETE)) * 37) + Long.hashCode(this.warning_time_remaining_ms_OBSOLETE)) * 37) + Integer.hashCode(this.expected_duration_sec_OBSOLETE)) * 37) + Integer.hashCode(this.download_perc_OBSOLETE)) * 37) + Integer.hashCode(this.install_perc_OBSOLETE)) * 37) + this.version_OBSOLETE.hashCode()) * 37;
        c cVar = this.status;
        int iHashCode2 = (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 37;
        Instant instant = this.timestamp;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        Long l11 = this.scheduled_time_ms;
        int iHashCode4 = (iHashCode3 + (l11 != null ? l11.hashCode() : 0)) * 37;
        Long l12 = this.warning_time_remaining_ms;
        int iHashCode5 = (iHashCode4 + (l12 != null ? l12.hashCode() : 0)) * 37;
        Integer num = this.expected_duration_sec;
        int iHashCode6 = (iHashCode5 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.download_perc;
        int iHashCode7 = (iHashCode6 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.install_perc;
        int iHashCode8 = (iHashCode7 + (num3 != null ? num3.hashCode() : 0)) * 37;
        String str = this.version;
        int iHashCode9 = (iHashCode8 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.auto_scheduled;
        int iHashCode10 = iHashCode9 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getInstall_perc_OBSOLETE() {
        return this.install_perc_OBSOLETE;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getScheduled_time_ms() {
        return this.scheduled_time_ms;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getScheduled_time_ms_OBSOLETE() {
        return this.scheduled_time_ms_OBSOLETE;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final c getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m414newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getVersion_OBSOLETE() {
        return this.version_OBSOLETE;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Long getWarning_time_remaining_ms() {
        return this.warning_time_remaining_ms;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getWarning_time_remaining_ms_OBSOLETE() {
        return this.warning_time_remaining_ms_OBSOLETE;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("scheduled_time_ms_OBSOLETE=" + this.scheduled_time_ms_OBSOLETE);
        arrayList.add("warning_time_remaining_ms_OBSOLETE=" + this.warning_time_remaining_ms_OBSOLETE);
        arrayList.add("expected_duration_sec_OBSOLETE=" + this.expected_duration_sec_OBSOLETE);
        arrayList.add("download_perc_OBSOLETE=" + this.download_perc_OBSOLETE);
        arrayList.add("install_perc_OBSOLETE=" + this.install_perc_OBSOLETE);
        arrayList.add("version_OBSOLETE=" + x20.d.i(this.version_OBSOLETE));
        c cVar = this.status;
        if (cVar != null) {
            arrayList.add("status=" + cVar);
        }
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        Long l11 = this.scheduled_time_ms;
        if (l11 != null) {
            arrayList.add("scheduled_time_ms=" + l11);
        }
        Long l12 = this.warning_time_remaining_ms;
        if (l12 != null) {
            arrayList.add("warning_time_remaining_ms=" + l12);
        }
        Integer num = this.expected_duration_sec;
        if (num != null) {
            arrayList.add("expected_duration_sec=" + num);
        }
        Integer num2 = this.download_perc;
        if (num2 != null) {
            arrayList.add("download_perc=" + num2);
        }
        Integer num3 = this.install_perc;
        if (num3 != null) {
            arrayList.add("install_perc=" + num3);
        }
        String str = this.version;
        if (str != null) {
            arrayList.add("version=" + x20.d.i(str));
        }
        Boolean bool = this.auto_scheduled;
        if (bool != null) {
            arrayList.add("auto_scheduled=" + bool);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "SoftwareUpdateState{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ n0(long j11, long j12, int i11, int i12, int i13, String str, c cVar, Instant instant, Long l11, Long l12, Integer num, Integer num2, Integer num3, String str2, Boolean bool, okio.k kVar, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0L : j11, (i14 & 2) == 0 ? j12 : 0L, (i14 & 4) != 0 ? 0 : i11, (i14 & 8) != 0 ? 0 : i12, (i14 & 16) == 0 ? i13 : 0, (i14 & 32) != 0 ? "" : str, (i14 & 64) != 0 ? null : cVar, (i14 & 128) != 0 ? null : instant, (i14 & 256) != 0 ? null : l11, (i14 & 512) != 0 ? null : l12, (i14 & 1024) != 0 ? null : num, (i14 & 2048) != 0 ? null : num2, (i14 & 4096) != 0 ? null : num3, (i14 & PKIFailureInfo.certRevoked) != 0 ? null : str2, (i14 & 16384) != 0 ? null : bool, (i14 & 32768) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m414newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(long j11, long j12, int i11, int i12, int i13, String version_OBSOLETE, c cVar, Instant instant, Long l11, Long l12, Integer num, Integer num2, Integer num3, String str, Boolean bool, okio.k unknownFields) {
        super(f68142q, unknownFields);
        p013kotlin.jvm.internal.s.k(version_OBSOLETE, "version_OBSOLETE");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.scheduled_time_ms_OBSOLETE = j11;
        this.warning_time_remaining_ms_OBSOLETE = j12;
        this.expected_duration_sec_OBSOLETE = i11;
        this.download_perc_OBSOLETE = i12;
        this.install_perc_OBSOLETE = i13;
        this.version_OBSOLETE = version_OBSOLETE;
        this.status = cVar;
        this.timestamp = instant;
        this.scheduled_time_ms = l11;
        this.warning_time_remaining_ms = l12;
        this.expected_duration_sec = num;
        this.download_perc = num2;
        this.install_perc = num3;
        this.version = str;
        this.auto_scheduled = bool;
    }
}
