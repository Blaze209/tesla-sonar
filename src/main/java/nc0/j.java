package nc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Lnc0/j;", "Lcom/squareup/wire/f;", "", "", "initialProductListFetch", "", "productCount", "Lnc0/k;", "destination", "Lokio/k;", "unknownFields", "<init>", "(ZILnc0/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ZILnc0/k;Lokio/k;)Lnc0/j;", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "b", "I", "e", "c", "Lnc0/k;", "()Lnc0/k;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<j> f93811e = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(j.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = q.a.OMIT_IDENTITY, tag = 1)
    private final boolean initialProductListFetch;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = q.a.OMIT_IDENTITY, tag = 2)
    private final int productCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.monitoring.TimeToInteractiveDestination#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 3)
    private final k destination;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"nc0/j$a", "Lcom/squareup/wire/ProtoAdapter;", "Lnc0/j;", "value", "", "c", "(Lnc0/j;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lnc0/j;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lnc0/j;", DateTokenConverter.CONVERTER_KEY, "(Lnc0/j;)Lnc0/j;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<j> {
        a(com.squareup.wire.b bVar, co0.d<j> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/monitoring.TimeToInteractiveAttributes", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            k kVarDecode = k.VEHICLE;
            long jD = reader.d();
            boolean zBooleanValue = false;
            int iIntValue = 0;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new j(zBooleanValue, iIntValue, kVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (iG == 2) {
                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    try {
                        kVarDecode = k.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, j value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getInitialProductListFetch()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.getInitialProductListFetch()));
            }
            if (value.getProductCount() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(value.getProductCount()));
            }
            if (value.getDestination() != k.VEHICLE) {
                k.ADAPTER.encodeWithTag(writer, 3, value.getDestination());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(j value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getInitialProductListFetch()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getInitialProductListFetch()));
            }
            if (value.getProductCount() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getProductCount()));
            }
            return value.getDestination() != k.VEHICLE ? iD + k.ADAPTER.encodedSizeWithTag(3, value.getDestination()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public j redact(j value) {
            s.k(value, "value");
            return j.b(value, false, 0, null, okio.k.f97943e, 7, null);
        }
    }

    public j() {
        this(false, 0, null, null, 15, null);
    }

    public static /* synthetic */ j b(j jVar, boolean z11, int i11, k kVar, okio.k kVar2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = jVar.initialProductListFetch;
        }
        if ((i12 & 2) != 0) {
            i11 = jVar.productCount;
        }
        if ((i12 & 4) != 0) {
            kVar = jVar.destination;
        }
        if ((i12 & 8) != 0) {
            kVar2 = jVar.unknownFields();
        }
        return jVar.a(z11, i11, kVar, kVar2);
    }

    public final j a(boolean initialProductListFetch, int productCount, k destination, okio.k unknownFields) {
        s.k(destination, "destination");
        s.k(unknownFields, "unknownFields");
        return new j(initialProductListFetch, productCount, destination, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getInitialProductListFetch() {
        return this.initialProductListFetch;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getProductCount() {
        return this.productCount;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof j)) {
            return false;
        }
        j jVar = (j) other;
        return s.f(unknownFields(), jVar.unknownFields()) && this.initialProductListFetch == jVar.initialProductListFetch && this.productCount == jVar.productCount && this.destination == jVar.destination;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.initialProductListFetch)) * 37) + Integer.hashCode(this.productCount)) * 37) + this.destination.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m607newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("initialProductListFetch=" + this.initialProductListFetch);
        arrayList.add("productCount=" + this.productCount);
        arrayList.add("destination=" + this.destination);
        return v.y0(arrayList, ", ", "TimeToInteractiveAttributes{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ j(boolean z11, int i11, k kVar, okio.k kVar2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? k.VEHICLE : kVar, (i12 & 8) != 0 ? okio.k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m607newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z11, int i11, k destination, okio.k unknownFields) {
        super(f93811e, unknownFields);
        s.k(destination, "destination");
        s.k(unknownFields, "unknownFields");
        this.initialProductListFetch = z11;
        this.productCount = i11;
        this.destination = destination;
    }
}
