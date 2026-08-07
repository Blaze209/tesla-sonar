package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.wire.ProtoAdapter;
import expo.modules.interfaces.permissions.PermissionsResponse;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001e\u001bB+\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lfc0/o2;", "Lcom/squareup/wire/f;", "", "", PlaceTypes.ROUTE, "", "Lfc0/o2$c;", "traffic_detail", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Ljava/util/List;Lokio/k;)Lfc0/o2;", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<o2> f65278d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(o2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final String route;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.NavigationRouteResponse$TrafficDetail#ADAPTER", jsonName = "trafficDetail", label = com.squareup.wire.q.a.REPEATED, tag = 2)
    private final List<c> traffic_detail;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/o2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/o2;", "value", "", "c", "(Lfc0/o2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/o2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/o2;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/o2;)Lfc0/o2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<o2> {
        a(com.squareup.wire.b bVar, co0.d<o2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.NavigationRouteResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o2 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            String strDecode = "";
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new o2(strDecode, arrayList, reader.e(jD));
                }
                if (iG == 1) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    arrayList.add(c.f65282d.decode(reader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, o2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (!p013kotlin.jvm.internal.s.f(value.getRoute(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getRoute());
            }
            c.f65282d.asRepeated().encodeWithTag(writer, 2, value.d());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(o2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!p013kotlin.jvm.internal.s.f(value.getRoute(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRoute());
            }
            return iD + c.f65282d.asRepeated().encodedSizeWithTag(2, value.d());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public o2 redact(o2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return o2.b(value, null, x20.d.a(value.d(), c.f65282d), okio.k.f97943e, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lfc0/o2$c;", "Lcom/squareup/wire/f;", "", "", "offset_to_dest", "Lfc0/o2$d;", PermissionsResponse.STATUS_KEY, "Lokio/k;", "unknownFields", "<init>", "(FLfc0/o2$d;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(FLfc0/o2$d;Lokio/k;)Lfc0/o2$c;", Gender.FEMALE, "c", "()F", "b", "Lfc0/o2$d;", DateTokenConverter.CONVERTER_KEY, "()Lfc0/o2$d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends com.squareup.wire.f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ProtoAdapter<c> f65282d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(c.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "offsetToDest", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
        private final float offset_to_dest;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.NavigationRouteResponse$TrafficStatus#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
        private final d status;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/o2$c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/o2$c;", "value", "", "c", "(Lfc0/o2$c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/o2$c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/o2$c;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/o2$c;)Lfc0/o2$c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, co0.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.NavigationRouteResponse.TrafficDetail", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                d dVarDecode = d.TS_NO_DATA;
                long jD = reader.d();
                float fFloatValue = BitmapDescriptorFactory.HUE_RED;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new c(fFloatValue, dVarDecode, reader.e(jD));
                    }
                    if (iG == 1) {
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else if (iG != 2) {
                        reader.m(iG);
                    } else {
                        try {
                            dVarDecode = d.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void encode(com.squareup.wire.l writer, c value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                if (value.getOffset_to_dest() != BitmapDescriptorFactory.HUE_RED) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 1, Float.valueOf(value.getOffset_to_dest()));
                }
                if (value.getStatus() != d.TS_NO_DATA) {
                    d.ADAPTER.encodeWithTag(writer, 2, value.getStatus());
                }
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                if (value.getOffset_to_dest() != BitmapDescriptorFactory.HUE_RED) {
                    iD += ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.getOffset_to_dest()));
                }
                return value.getStatus() != d.TS_NO_DATA ? iD + d.ADAPTER.encodedSizeWithTag(2, value.getStatus()) : iD;
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public c redact(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                return c.b(value, BitmapDescriptorFactory.HUE_RED, null, okio.k.f97943e, 3, null);
            }
        }

        public c() {
            this(BitmapDescriptorFactory.HUE_RED, null, null, 7, null);
        }

        public static /* synthetic */ c b(c cVar, float f11, d dVar, okio.k kVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = cVar.offset_to_dest;
            }
            if ((i11 & 2) != 0) {
                dVar = cVar.status;
            }
            if ((i11 & 4) != 0) {
                kVar = cVar.unknownFields();
            }
            return cVar.a(f11, dVar, kVar);
        }

        public final c a(float offset_to_dest, d status, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(status, "status");
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new c(offset_to_dest, status, unknownFields);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getOffset_to_dest() {
            return this.offset_to_dest;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final d getStatus() {
            return this.status;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), cVar.unknownFields()) && this.offset_to_dest == cVar.offset_to_dest && this.status == cVar.status;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + Float.hashCode(this.offset_to_dest)) * 37) + this.status.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m301newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("offset_to_dest=" + this.offset_to_dest);
            arrayList.add("status=" + this.status);
            return p013kotlin.collections.v.y0(arrayList, ", ", "TrafficDetail{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ c(float f11, d dVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? BitmapDescriptorFactory.HUE_RED : f11, (i11 & 2) != 0 ? d.TS_NO_DATA : dVar, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m301newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f11, d status, okio.k unknownFields) {
            super(f65282d, unknownFields);
            p013kotlin.jvm.internal.s.k(status, "status");
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.offset_to_dest = f11;
            this.status = status;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 fc0.o2$d, still in use, count: 1, list:
      (r0v0 fc0.o2$d) from 0x0050: CONSTRUCTOR 
      (wrap co0.d:0x0048: INVOKE (wrap java.lang.Class:0x0046: CONST_CLASS  A[WRAPPED] (LINE:71) fc0.o2$d.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:73))
      (wrap com.squareup.wire.o:0x004c: SGET  A[WRAPPED] (LINE:77) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 fc0.o2$d)
     A[MD:(co0.d<fc0.o2$d>, com.squareup.wire.o, fc0.o2$d):void (m), WRAPPED] (LINE:81) call: fc0.o2.d.a.<init>(co0.d, com.squareup.wire.o, fc0.o2$d):void type: CONSTRUCTOR
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lfc0/o2$d;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "TS_NO_DATA", "TS_LIGHT", "TS_MODERATE", "TS_CONGESTION", "TS_SEVERE_CONGESTION", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements com.squareup.wire.p {
        TS_NO_DATA(0),
        TS_LIGHT(1),
        TS_MODERATE(2),
        TS_CONGESTION(3),
        TS_SEVERE_CONGESTION(4);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<d> ADAPTER = new a(p013kotlin.jvm.internal.o0.b(d.class), com.squareup.wire.o.PROTO_3, new d(0));

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"fc0/o2$d$a", "Lcom/squareup/wire/a;", "Lfc0/o2$d;", "", "value", "f", "(I)Lfc0/o2$d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        /* JADX INFO: renamed from: fc0.o2$d$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfc0/o2$d$b;", "", "<init>", "()V", "", "value", "Lfc0/o2$d;", "a", "(I)Lfc0/o2$d;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(int value) {
                if (value == 0) {
                    return d.TS_NO_DATA;
                }
                if (value == 1) {
                    return d.TS_LIGHT;
                }
                if (value == 2) {
                    return d.TS_MODERATE;
                }
                if (value == 3) {
                    return d.TS_CONGESTION;
                }
                if (value != 4) {
                    return null;
                }
                return d.TS_SEVERE_CONGESTION;
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

    public o2() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o2 b(o2 o2Var, String str, List list, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = o2Var.route;
        }
        if ((i11 & 2) != 0) {
            list = o2Var.traffic_detail;
        }
        if ((i11 & 4) != 0) {
            kVar = o2Var.unknownFields();
        }
        return o2Var.a(str, list, kVar);
    }

    public final o2 a(String route, List<c> traffic_detail, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(route, "route");
        p013kotlin.jvm.internal.s.k(traffic_detail, "traffic_detail");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new o2(route, traffic_detail, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    public final List<c> d() {
        return this.traffic_detail;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), o2Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.route, o2Var.route) && p013kotlin.jvm.internal.s.f(this.traffic_detail, o2Var.traffic_detail);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.route.hashCode()) * 37) + this.traffic_detail.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m300newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("route=" + x20.d.i(this.route));
        if (!this.traffic_detail.isEmpty()) {
            arrayList.add("traffic_detail=" + this.traffic_detail);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "NavigationRouteResponse{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ o2(String str, List list, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m300newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(String route, List<c> traffic_detail, okio.k unknownFields) {
        super(f65278d, unknownFields);
        p013kotlin.jvm.internal.s.k(route, "route");
        p013kotlin.jvm.internal.s.k(traffic_detail, "traffic_detail");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.route = route;
        this.traffic_detail = x20.d.g("traffic_detail", traffic_detail);
    }
}
