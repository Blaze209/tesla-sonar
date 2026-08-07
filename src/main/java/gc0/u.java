package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import ezvcard.property.Gender;
import j$.time.Instant;
import java.util.ArrayList;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b.\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u009d\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0002H\u0017¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0015H\u0016¢\u0006\u0004\b-\u0010.J£\u0002\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b/\u00100R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b2\u0010,R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010,R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u0010,R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\"\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\"\u0010\u000e\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b5\u0010GR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bM\u0010KR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010I\u001a\u0004\bO\u0010KR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\b7\u0010.R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010Q\u001a\u0004\bC\u0010SR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010Q\u001a\u0004\b?\u0010SR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010Q\u001a\u0004\bE\u0010SR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010Q\u001a\u0004\b;\u0010SR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010I\u001a\u0004\bT\u0010KR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010Q\u001a\u0004\bP\u0010SR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010Q\u001a\u0004\bN\u0010SR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010Q\u001a\u0004\bH\u0010SR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010Q\u001a\u0004\bL\u0010S¨\u0006V"}, d2 = {"Lgc0/u;", "Lcom/squareup/wire/f;", "", "", "speed_OBSOLETE", "power_OBSOLETE", "odometer_in_hundredths_of_a_mile_OBSOLETE", "", "speed_float_OBSOLETE", "Lec0/y;", "shift_state", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "last_traffic_update", "Lec0/n;", "active_route_coordinates", "speed", "power", "odometer_in_hundredths_of_a_mile", "speed_float", "", "active_route_destination", "active_route_minutes_to_arrival", "active_route_miles_to_arrival", "active_route_traffic_minutes_delay", "active_route_energy_at_arrival", "last_route_update", "fsd_user_total_miles_travelled", "fsd_user_total_miles", "fsd_user_miles_hands_free_current", "fsd_user_miles_hands_free_max", "Lokio/k;", "unknownFields", "<init>", "(IIIFLec0/y;Lj$/time/Instant;Lj$/time/Instant;Lec0/n;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(IIIFLec0/y;Lj$/time/Instant;Lj$/time/Instant;Lec0/n;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lokio/k;)Lgc0/u;", "I", "u", "b", "r", "c", "p", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "w", "()F", "e", "Lec0/y;", "s", "()Lec0/y;", "f", "Lj$/time/Instant;", "x", "()Lj$/time/Instant;", "g", "n", "h", "Lec0/n;", "()Lec0/n;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "t", "()Ljava/lang/Integer;", "j", "q", "k", "o", "l", "Ljava/lang/Float;", "v", "()Ljava/lang/Float;", "m", "Ljava/lang/String;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u extends com.squareup.wire.f {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ProtoAdapter<u> f68505x = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(u.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "speedOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final int speed_OBSOLETE;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "powerOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final int power_OBSOLETE;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "odometerInHundredthsOfAMileOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final int odometer_in_hundredths_of_a_mile_OBSOLETE;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "speedFloatOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final float speed_float_OBSOLETE;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.ShiftState#ADAPTER", jsonName = "shiftState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final ec0.y shift_state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final Instant timestamp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "lastTrafficUpdate", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 15)
    private final Instant last_traffic_update;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.LatLong#ADAPTER", jsonName = "activeRouteCoordinates", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 12)
    private final ec0.n active_route_coordinates;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 102)
    private final Integer speed;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 103)
    private final Integer power;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "odometerInHundredthsOfAMile", tag = 105)
    private final Integer odometer_in_hundredths_of_a_mile;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "speedFloat", tag = 106)
    private final Float speed_float;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "activeRouteDestination", tag = 7)
    private final String active_route_destination;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "activeRouteMinutesToArrival", tag = 8)
    private final Float active_route_minutes_to_arrival;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "activeRouteMilesToArrival", tag = 9)
    private final Float active_route_miles_to_arrival;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "activeRouteTrafficMinutesDelay", tag = 10)
    private final Float active_route_traffic_minutes_delay;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "activeRouteEnergyAtArrival", tag = 11)
    private final Float active_route_energy_at_arrival;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "lastRouteUpdate", tag = 14)
    private final Integer last_route_update;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "fsdUserTotalMilesTravelled", tag = 16)
    private final Float fsd_user_total_miles_travelled;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "fsdUserTotalMiles", tag = 17)
    private final Float fsd_user_total_miles;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "fsdUserMilesHandsFreeCurrent", tag = 18)
    private final Float fsd_user_miles_hands_free_current;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "fsdUserMilesHandsFreeMax", tag = 19)
    private final Float fsd_user_miles_hands_free_max;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/u$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/u;", "value", "", "c", "(Lgc0/u;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/u;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/u;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/u;)Lgc0/u;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<u> {
        a(com.squareup.wire.b bVar, co0.d<u> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.DriveState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            ec0.y yVarDecode = null;
            int iIntValue = 0;
            int iIntValue2 = 0;
            int iIntValue3 = 0;
            float fFloatValue = 0.0f;
            Instant instantDecode = null;
            ec0.n nVarDecode = null;
            Integer numDecode = null;
            Integer numDecode2 = null;
            Integer numDecode3 = null;
            Float fDecode = null;
            String strDecode = null;
            Float fDecode2 = null;
            Float fDecode3 = null;
            Float fDecode4 = null;
            Float fDecode5 = null;
            Integer numDecode4 = null;
            Float fDecode6 = null;
            Float fDecode7 = null;
            Float fDecode8 = null;
            Float fDecode9 = null;
            Instant instantDecode2 = null;
            while (true) {
                int iG = reader.g();
                Instant instant = instantDecode;
                if (iG == -1) {
                    return new u(iIntValue, iIntValue2, iIntValue3, fFloatValue, yVarDecode, instantDecode2, instant, nVarDecode, numDecode, numDecode2, numDecode3, fDecode, strDecode, fDecode2, fDecode3, fDecode4, fDecode5, numDecode4, fDecode6, fDecode7, fDecode8, fDecode9, reader.e(jD));
                }
                if (iG == 102) {
                    numDecode = ProtoAdapter.UINT32.decode(reader);
                } else if (iG == 103) {
                    numDecode2 = ProtoAdapter.INT32.decode(reader);
                } else if (iG == 105) {
                    numDecode3 = ProtoAdapter.INT32.decode(reader);
                } else if (iG != 106) {
                    switch (iG) {
                        case 1:
                            yVarDecode = ec0.y.f62784h.decode(reader);
                            break;
                        case 2:
                            iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                            break;
                        case 3:
                            iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 4:
                            instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 5:
                            iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 6:
                            fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            break;
                        case 7:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 8:
                            fDecode2 = ProtoAdapter.FLOAT.decode(reader);
                            break;
                        case 9:
                            fDecode3 = ProtoAdapter.FLOAT.decode(reader);
                            break;
                        case 10:
                            fDecode4 = ProtoAdapter.FLOAT.decode(reader);
                            break;
                        case 11:
                            fDecode5 = ProtoAdapter.FLOAT.decode(reader);
                            break;
                        case 12:
                            nVarDecode = ec0.n.f62721d.decode(reader);
                            break;
                        default:
                            switch (iG) {
                                case 14:
                                    numDecode4 = ProtoAdapter.UINT32.decode(reader);
                                    break;
                                case 15:
                                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                    continue;
                                case 16:
                                    fDecode6 = ProtoAdapter.FLOAT.decode(reader);
                                    break;
                                case 17:
                                    fDecode7 = ProtoAdapter.FLOAT.decode(reader);
                                    break;
                                case 18:
                                    fDecode8 = ProtoAdapter.FLOAT.decode(reader);
                                    break;
                                case 19:
                                    fDecode9 = ProtoAdapter.FLOAT.decode(reader);
                                    break;
                                default:
                                    reader.m(iG);
                                    break;
                            }
                            break;
                    }
                } else {
                    fDecode = ProtoAdapter.FLOAT.decode(reader);
                }
                instantDecode = instant;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, u value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getSpeed_OBSOLETE() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getSpeed_OBSOLETE()));
            }
            if (value.getPower_OBSOLETE() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getPower_OBSOLETE()));
            }
            if (value.getOdometer_in_hundredths_of_a_mile_OBSOLETE() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 5, Integer.valueOf(value.getOdometer_in_hundredths_of_a_mile_OBSOLETE()));
            }
            if (value.getSpeed_float_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 6, Float.valueOf(value.getSpeed_float_OBSOLETE()));
            }
            if (value.getShift_state() != null) {
                ec0.y.f62784h.encodeWithTag(writer, 1, value.getShift_state());
            }
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 4, value.getTimestamp());
            }
            if (value.getLast_traffic_update() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 15, value.getLast_traffic_update());
            }
            if (value.getActive_route_coordinates() != null) {
                ec0.n.f62721d.encodeWithTag(writer, 12, value.getActive_route_coordinates());
            }
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(writer, 102, value.getSpeed());
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(writer, 103, value.getPower());
            protoAdapter2.encodeWithTag(writer, 105, value.getOdometer_in_hundredths_of_a_mile());
            ProtoAdapter<Float> protoAdapter3 = ProtoAdapter.FLOAT;
            protoAdapter3.encodeWithTag(writer, 106, value.getSpeed_float());
            ProtoAdapter.STRING.encodeWithTag(writer, 7, value.getActive_route_destination());
            protoAdapter3.encodeWithTag(writer, 8, value.getActive_route_minutes_to_arrival());
            protoAdapter3.encodeWithTag(writer, 9, value.getActive_route_miles_to_arrival());
            protoAdapter3.encodeWithTag(writer, 10, value.getActive_route_traffic_minutes_delay());
            protoAdapter3.encodeWithTag(writer, 11, value.getActive_route_energy_at_arrival());
            protoAdapter.encodeWithTag(writer, 14, value.getLast_route_update());
            protoAdapter3.encodeWithTag(writer, 16, value.getFsd_user_total_miles_travelled());
            protoAdapter3.encodeWithTag(writer, 17, value.getFsd_user_total_miles());
            protoAdapter3.encodeWithTag(writer, 18, value.getFsd_user_miles_hands_free_current());
            protoAdapter3.encodeWithTag(writer, 19, value.getFsd_user_miles_hands_free_max());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(u value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getSpeed_OBSOLETE() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getSpeed_OBSOLETE()));
            }
            if (value.getPower_OBSOLETE() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getPower_OBSOLETE()));
            }
            if (value.getOdometer_in_hundredths_of_a_mile_OBSOLETE() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getOdometer_in_hundredths_of_a_mile_OBSOLETE()));
            }
            if (value.getSpeed_float_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(6, Float.valueOf(value.getSpeed_float_OBSOLETE()));
            }
            if (value.getShift_state() != null) {
                iD += ec0.y.f62784h.encodedSizeWithTag(1, value.getShift_state());
            }
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getTimestamp());
            }
            if (value.getLast_traffic_update() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(15, value.getLast_traffic_update());
            }
            if (value.getActive_route_coordinates() != null) {
                iD += ec0.n.f62721d.encodedSizeWithTag(12, value.getActive_route_coordinates());
            }
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            int iEncodedSizeWithTag = iD + protoAdapter.encodedSizeWithTag(102, value.getSpeed());
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(103, value.getPower()) + protoAdapter2.encodedSizeWithTag(105, value.getOdometer_in_hundredths_of_a_mile());
            ProtoAdapter<Float> protoAdapter3 = ProtoAdapter.FLOAT;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(106, value.getSpeed_float()) + ProtoAdapter.STRING.encodedSizeWithTag(7, value.getActive_route_destination()) + protoAdapter3.encodedSizeWithTag(8, value.getActive_route_minutes_to_arrival()) + protoAdapter3.encodedSizeWithTag(9, value.getActive_route_miles_to_arrival()) + protoAdapter3.encodedSizeWithTag(10, value.getActive_route_traffic_minutes_delay()) + protoAdapter3.encodedSizeWithTag(11, value.getActive_route_energy_at_arrival()) + protoAdapter.encodedSizeWithTag(14, value.getLast_route_update()) + protoAdapter3.encodedSizeWithTag(16, value.getFsd_user_total_miles_travelled()) + protoAdapter3.encodedSizeWithTag(17, value.getFsd_user_total_miles()) + protoAdapter3.encodedSizeWithTag(18, value.getFsd_user_miles_hands_free_current()) + protoAdapter3.encodedSizeWithTag(19, value.getFsd_user_miles_hands_free_max());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u redact(u value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            ec0.y shift_state = value.getShift_state();
            ec0.y yVarRedact = shift_state != null ? ec0.y.f62784h.redact(shift_state) : null;
            Instant timestamp = value.getTimestamp();
            Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
            Instant last_traffic_update = value.getLast_traffic_update();
            Instant instantRedact2 = last_traffic_update != null ? ProtoAdapter.INSTANT.redact(last_traffic_update) : null;
            ec0.n active_route_coordinates = value.getActive_route_coordinates();
            return u.b(value, 0, 0, 0, BitmapDescriptorFactory.HUE_RED, yVarRedact, instantRedact, instantRedact2, active_route_coordinates != null ? ec0.n.f62721d.redact(active_route_coordinates) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, okio.k.f97943e, 4194063, null);
        }
    }

    public u() {
        this(0, 0, 0, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    public static /* synthetic */ u b(u uVar, int i11, int i12, int i13, float f11, ec0.y yVar, Instant instant, Instant instant2, ec0.n nVar, Integer num, Integer num2, Integer num3, Float f12, String str, Float f13, Float f14, Float f15, Float f16, Integer num4, Float f17, Float f18, Float f19, Float f21, okio.k kVar, int i14, Object obj) {
        return uVar.a((i14 & 1) != 0 ? uVar.speed_OBSOLETE : i11, (i14 & 2) != 0 ? uVar.power_OBSOLETE : i12, (i14 & 4) != 0 ? uVar.odometer_in_hundredths_of_a_mile_OBSOLETE : i13, (i14 & 8) != 0 ? uVar.speed_float_OBSOLETE : f11, (i14 & 16) != 0 ? uVar.shift_state : yVar, (i14 & 32) != 0 ? uVar.timestamp : instant, (i14 & 64) != 0 ? uVar.last_traffic_update : instant2, (i14 & 128) != 0 ? uVar.active_route_coordinates : nVar, (i14 & 256) != 0 ? uVar.speed : num, (i14 & 512) != 0 ? uVar.power : num2, (i14 & 1024) != 0 ? uVar.odometer_in_hundredths_of_a_mile : num3, (i14 & 2048) != 0 ? uVar.speed_float : f12, (i14 & 4096) != 0 ? uVar.active_route_destination : str, (i14 & PKIFailureInfo.certRevoked) != 0 ? uVar.active_route_minutes_to_arrival : f13, (i14 & 16384) != 0 ? uVar.active_route_miles_to_arrival : f14, (i14 & 32768) != 0 ? uVar.active_route_traffic_minutes_delay : f15, (i14 & 65536) != 0 ? uVar.active_route_energy_at_arrival : f16, (i14 & 131072) != 0 ? uVar.last_route_update : num4, (i14 & 262144) != 0 ? uVar.fsd_user_total_miles_travelled : f17, (i14 & PKIFailureInfo.signerNotTrusted) != 0 ? uVar.fsd_user_total_miles : f18, (i14 & PKIFailureInfo.badCertTemplate) != 0 ? uVar.fsd_user_miles_hands_free_current : f19, (i14 & PKIFailureInfo.badSenderNonce) != 0 ? uVar.fsd_user_miles_hands_free_max : f21, (i14 & 4194304) != 0 ? uVar.unknownFields() : kVar);
    }

    public final u a(int speed_OBSOLETE, int power_OBSOLETE, int odometer_in_hundredths_of_a_mile_OBSOLETE, float speed_float_OBSOLETE, ec0.y shift_state, Instant timestamp, Instant last_traffic_update, ec0.n active_route_coordinates, Integer speed, Integer power, Integer odometer_in_hundredths_of_a_mile, Float speed_float, String active_route_destination, Float active_route_minutes_to_arrival, Float active_route_miles_to_arrival, Float active_route_traffic_minutes_delay, Float active_route_energy_at_arrival, Integer last_route_update, Float fsd_user_total_miles_travelled, Float fsd_user_total_miles, Float fsd_user_miles_hands_free_current, Float fsd_user_miles_hands_free_max, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new u(speed_OBSOLETE, power_OBSOLETE, odometer_in_hundredths_of_a_mile_OBSOLETE, speed_float_OBSOLETE, shift_state, timestamp, last_traffic_update, active_route_coordinates, speed, power, odometer_in_hundredths_of_a_mile, speed_float, active_route_destination, active_route_minutes_to_arrival, active_route_miles_to_arrival, active_route_traffic_minutes_delay, active_route_energy_at_arrival, last_route_update, fsd_user_total_miles_travelled, fsd_user_total_miles, fsd_user_miles_hands_free_current, fsd_user_miles_hands_free_max, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ec0.n getActive_route_coordinates() {
        return this.active_route_coordinates;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getActive_route_destination() {
        return this.active_route_destination;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Float getActive_route_energy_at_arrival() {
        return this.active_route_energy_at_arrival;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof u)) {
            return false;
        }
        u uVar = (u) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), uVar.unknownFields()) && this.speed_OBSOLETE == uVar.speed_OBSOLETE && this.power_OBSOLETE == uVar.power_OBSOLETE && this.odometer_in_hundredths_of_a_mile_OBSOLETE == uVar.odometer_in_hundredths_of_a_mile_OBSOLETE && this.speed_float_OBSOLETE == uVar.speed_float_OBSOLETE && p013kotlin.jvm.internal.s.f(this.shift_state, uVar.shift_state) && p013kotlin.jvm.internal.s.f(this.timestamp, uVar.timestamp) && p013kotlin.jvm.internal.s.f(this.last_traffic_update, uVar.last_traffic_update) && p013kotlin.jvm.internal.s.f(this.active_route_coordinates, uVar.active_route_coordinates) && p013kotlin.jvm.internal.s.f(this.speed, uVar.speed) && p013kotlin.jvm.internal.s.f(this.power, uVar.power) && p013kotlin.jvm.internal.s.f(this.odometer_in_hundredths_of_a_mile, uVar.odometer_in_hundredths_of_a_mile) && p013kotlin.jvm.internal.s.e(this.speed_float, uVar.speed_float) && p013kotlin.jvm.internal.s.f(this.active_route_destination, uVar.active_route_destination) && p013kotlin.jvm.internal.s.e(this.active_route_minutes_to_arrival, uVar.active_route_minutes_to_arrival) && p013kotlin.jvm.internal.s.e(this.active_route_miles_to_arrival, uVar.active_route_miles_to_arrival) && p013kotlin.jvm.internal.s.e(this.active_route_traffic_minutes_delay, uVar.active_route_traffic_minutes_delay) && p013kotlin.jvm.internal.s.e(this.active_route_energy_at_arrival, uVar.active_route_energy_at_arrival) && p013kotlin.jvm.internal.s.f(this.last_route_update, uVar.last_route_update) && p013kotlin.jvm.internal.s.e(this.fsd_user_total_miles_travelled, uVar.fsd_user_total_miles_travelled) && p013kotlin.jvm.internal.s.e(this.fsd_user_total_miles, uVar.fsd_user_total_miles) && p013kotlin.jvm.internal.s.e(this.fsd_user_miles_hands_free_current, uVar.fsd_user_miles_hands_free_current) && p013kotlin.jvm.internal.s.e(this.fsd_user_miles_hands_free_max, uVar.fsd_user_miles_hands_free_max);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Float getActive_route_miles_to_arrival() {
        return this.active_route_miles_to_arrival;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Float getActive_route_minutes_to_arrival() {
        return this.active_route_minutes_to_arrival;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Float getActive_route_traffic_minutes_delay() {
        return this.active_route_traffic_minutes_delay;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.speed_OBSOLETE)) * 37) + Integer.hashCode(this.power_OBSOLETE)) * 37) + Integer.hashCode(this.odometer_in_hundredths_of_a_mile_OBSOLETE)) * 37) + Float.hashCode(this.speed_float_OBSOLETE)) * 37;
        ec0.y yVar = this.shift_state;
        int iHashCode2 = (iHashCode + (yVar != null ? yVar.hashCode() : 0)) * 37;
        Instant instant = this.timestamp;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.last_traffic_update;
        int iHashCode4 = (iHashCode3 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        ec0.n nVar = this.active_route_coordinates;
        int iHashCode5 = (iHashCode4 + (nVar != null ? nVar.hashCode() : 0)) * 37;
        Integer num = this.speed;
        int iHashCode6 = (iHashCode5 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.power;
        int iHashCode7 = (iHashCode6 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.odometer_in_hundredths_of_a_mile;
        int iHashCode8 = (iHashCode7 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Float f11 = this.speed_float;
        int iHashCode9 = (iHashCode8 + (f11 != null ? f11.hashCode() : 0)) * 37;
        String str = this.active_route_destination;
        int iHashCode10 = (iHashCode9 + (str != null ? str.hashCode() : 0)) * 37;
        Float f12 = this.active_route_minutes_to_arrival;
        int iHashCode11 = (iHashCode10 + (f12 != null ? f12.hashCode() : 0)) * 37;
        Float f13 = this.active_route_miles_to_arrival;
        int iHashCode12 = (iHashCode11 + (f13 != null ? f13.hashCode() : 0)) * 37;
        Float f14 = this.active_route_traffic_minutes_delay;
        int iHashCode13 = (iHashCode12 + (f14 != null ? f14.hashCode() : 0)) * 37;
        Float f15 = this.active_route_energy_at_arrival;
        int iHashCode14 = (iHashCode13 + (f15 != null ? f15.hashCode() : 0)) * 37;
        Integer num4 = this.last_route_update;
        int iHashCode15 = (iHashCode14 + (num4 != null ? num4.hashCode() : 0)) * 37;
        Float f16 = this.fsd_user_total_miles_travelled;
        int iHashCode16 = (iHashCode15 + (f16 != null ? f16.hashCode() : 0)) * 37;
        Float f17 = this.fsd_user_total_miles;
        int iHashCode17 = (iHashCode16 + (f17 != null ? f17.hashCode() : 0)) * 37;
        Float f18 = this.fsd_user_miles_hands_free_current;
        int iHashCode18 = (iHashCode17 + (f18 != null ? f18.hashCode() : 0)) * 37;
        Float f19 = this.fsd_user_miles_hands_free_max;
        int iHashCode19 = iHashCode18 + (f19 != null ? f19.hashCode() : 0);
        this.hashCode = iHashCode19;
        return iHashCode19;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Float getFsd_user_miles_hands_free_current() {
        return this.fsd_user_miles_hands_free_current;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Float getFsd_user_miles_hands_free_max() {
        return this.fsd_user_miles_hands_free_max;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Float getFsd_user_total_miles() {
        return this.fsd_user_total_miles;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Float getFsd_user_total_miles_travelled() {
        return this.fsd_user_total_miles_travelled;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Integer getLast_route_update() {
        return this.last_route_update;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Instant getLast_traffic_update() {
        return this.last_traffic_update;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m439newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Integer getOdometer_in_hundredths_of_a_mile() {
        return this.odometer_in_hundredths_of_a_mile;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getOdometer_in_hundredths_of_a_mile_OBSOLETE() {
        return this.odometer_in_hundredths_of_a_mile_OBSOLETE;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Integer getPower() {
        return this.power;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getPower_OBSOLETE() {
        return this.power_OBSOLETE;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final ec0.y getShift_state() {
        return this.shift_state;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Integer getSpeed() {
        return this.speed;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("speed_OBSOLETE=" + this.speed_OBSOLETE);
        arrayList.add("power_OBSOLETE=" + this.power_OBSOLETE);
        arrayList.add("odometer_in_hundredths_of_a_mile_OBSOLETE=" + this.odometer_in_hundredths_of_a_mile_OBSOLETE);
        arrayList.add("speed_float_OBSOLETE=" + this.speed_float_OBSOLETE);
        ec0.y yVar = this.shift_state;
        if (yVar != null) {
            arrayList.add("shift_state=" + yVar);
        }
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        Instant instant2 = this.last_traffic_update;
        if (instant2 != null) {
            arrayList.add("last_traffic_update=" + instant2);
        }
        ec0.n nVar = this.active_route_coordinates;
        if (nVar != null) {
            arrayList.add("active_route_coordinates=" + nVar);
        }
        Integer num = this.speed;
        if (num != null) {
            arrayList.add("speed=" + num);
        }
        Integer num2 = this.power;
        if (num2 != null) {
            arrayList.add("power=" + num2);
        }
        Integer num3 = this.odometer_in_hundredths_of_a_mile;
        if (num3 != null) {
            arrayList.add("odometer_in_hundredths_of_a_mile=" + num3);
        }
        Float f11 = this.speed_float;
        if (f11 != null) {
            arrayList.add("speed_float=" + f11);
        }
        String str = this.active_route_destination;
        if (str != null) {
            arrayList.add("active_route_destination=" + x20.d.i(str));
        }
        Float f12 = this.active_route_minutes_to_arrival;
        if (f12 != null) {
            arrayList.add("active_route_minutes_to_arrival=" + f12);
        }
        Float f13 = this.active_route_miles_to_arrival;
        if (f13 != null) {
            arrayList.add("active_route_miles_to_arrival=" + f13);
        }
        Float f14 = this.active_route_traffic_minutes_delay;
        if (f14 != null) {
            arrayList.add("active_route_traffic_minutes_delay=" + f14);
        }
        Float f15 = this.active_route_energy_at_arrival;
        if (f15 != null) {
            arrayList.add("active_route_energy_at_arrival=" + f15);
        }
        Integer num4 = this.last_route_update;
        if (num4 != null) {
            arrayList.add("last_route_update=" + num4);
        }
        Float f16 = this.fsd_user_total_miles_travelled;
        if (f16 != null) {
            arrayList.add("fsd_user_total_miles_travelled=" + f16);
        }
        Float f17 = this.fsd_user_total_miles;
        if (f17 != null) {
            arrayList.add("fsd_user_total_miles=" + f17);
        }
        Float f18 = this.fsd_user_miles_hands_free_current;
        if (f18 != null) {
            arrayList.add("fsd_user_miles_hands_free_current=" + f18);
        }
        Float f19 = this.fsd_user_miles_hands_free_max;
        if (f19 != null) {
            arrayList.add("fsd_user_miles_hands_free_max=" + f19);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "DriveState{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getSpeed_OBSOLETE() {
        return this.speed_OBSOLETE;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Float getSpeed_float() {
        return this.speed_float;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final float getSpeed_float_OBSOLETE() {
        return this.speed_float_OBSOLETE;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public /* synthetic */ u(int i11, int i12, int i13, float f11, ec0.y yVar, Instant instant, Instant instant2, ec0.n nVar, Integer num, Integer num2, Integer num3, Float f12, String str, Float f13, Float f14, Float f15, Float f16, Integer num4, Float f17, Float f18, Float f19, Float f21, okio.k kVar, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) == 0 ? i13 : 0, (i14 & 8) != 0 ? BitmapDescriptorFactory.HUE_RED : f11, (i14 & 16) != 0 ? null : yVar, (i14 & 32) != 0 ? null : instant, (i14 & 64) != 0 ? null : instant2, (i14 & 128) != 0 ? null : nVar, (i14 & 256) != 0 ? null : num, (i14 & 512) != 0 ? null : num2, (i14 & 1024) != 0 ? null : num3, (i14 & 2048) != 0 ? null : f12, (i14 & 4096) != 0 ? null : str, (i14 & PKIFailureInfo.certRevoked) != 0 ? null : f13, (i14 & 16384) != 0 ? null : f14, (i14 & 32768) != 0 ? null : f15, (i14 & 65536) != 0 ? null : f16, (i14 & 131072) != 0 ? null : num4, (i14 & 262144) != 0 ? null : f17, (i14 & PKIFailureInfo.signerNotTrusted) != 0 ? null : f18, (i14 & PKIFailureInfo.badCertTemplate) != 0 ? null : f19, (i14 & PKIFailureInfo.badSenderNonce) != 0 ? null : f21, (i14 & 4194304) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m439newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i11, int i12, int i13, float f11, ec0.y yVar, Instant instant, Instant instant2, ec0.n nVar, Integer num, Integer num2, Integer num3, Float f12, String str, Float f13, Float f14, Float f15, Float f16, Integer num4, Float f17, Float f18, Float f19, Float f21, okio.k unknownFields) {
        super(f68505x, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.speed_OBSOLETE = i11;
        this.power_OBSOLETE = i12;
        this.odometer_in_hundredths_of_a_mile_OBSOLETE = i13;
        this.speed_float_OBSOLETE = f11;
        this.shift_state = yVar;
        this.timestamp = instant;
        this.last_traffic_update = instant2;
        this.active_route_coordinates = nVar;
        this.speed = num;
        this.power = num2;
        this.odometer_in_hundredths_of_a_mile = num3;
        this.speed_float = f12;
        this.active_route_destination = str;
        this.active_route_minutes_to_arrival = f13;
        this.active_route_miles_to_arrival = f14;
        this.active_route_traffic_minutes_delay = f15;
        this.active_route_energy_at_arrival = f16;
        this.last_route_update = num4;
        this.fsd_user_total_miles_travelled = f17;
        this.fsd_user_total_miles = f18;
        this.fsd_user_miles_hands_free_current = f19;
        this.fsd_user_miles_hands_free_max = f21;
    }
}
