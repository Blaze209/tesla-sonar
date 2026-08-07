package jc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co0.d;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Ljc0/c;", "Lcom/squareup/wire/f;", "", "Ljc0/a;", "genericError", "Ljc0/b;", "keyNotFound", "Lokio/k;", "unknownFields", "<init>", "(Ljc0/a;Ljc0/b;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Ljc0/a;Ljc0/b;Lokio/k;)Ljc0/c;", "Ljc0/a;", "c", "()Ljc0/a;", "b", "Ljc0/b;", DateTokenConverter.CONVERTER_KEY, "()Ljc0/b;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<c> f83593d = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(c.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.tesla.generated.errors.GenericError_E#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)
    private final jc0.a genericError;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.errors.KeyNotFoundContext#ADAPTER", tag = 8)
    private final b keyNotFound;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"jc0/c$a", "Lcom/squareup/wire/ProtoAdapter;", "Ljc0/c;", "value", "", "c", "(Ljc0/c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Ljc0/c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljc0/c;", DateTokenConverter.CONVERTER_KEY, "(Ljc0/c;)Ljc0/c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, d<c> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/Errors.NominalError", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c decode(k reader) {
            s.k(reader, "reader");
            jc0.a aVarDecode = jc0.a.GENERICERROR_NONE;
            long jD = reader.d();
            b bVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new c(aVarDecode, bVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        aVarDecode = jc0.a.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG != 8) {
                    reader.m(iG);
                } else {
                    bVarDecode = b.f83589d.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, c value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getGenericError() != jc0.a.GENERICERROR_NONE) {
                jc0.a.ADAPTER.encodeWithTag(writer, 1, value.getGenericError());
            }
            b.f83589d.encodeWithTag(writer, 8, value.getKeyNotFound());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(c value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getGenericError() != jc0.a.GENERICERROR_NONE) {
                iD += jc0.a.ADAPTER.encodedSizeWithTag(1, value.getGenericError());
            }
            return iD + b.f83589d.encodedSizeWithTag(8, value.getKeyNotFound());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c redact(c value) {
            s.k(value, "value");
            b keyNotFound = value.getKeyNotFound();
            return c.b(value, null, keyNotFound != null ? b.f83589d.redact(keyNotFound) : null, okio.k.f97943e, 1, null);
        }
    }

    public c() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ c b(c cVar, jc0.a aVar, b bVar, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = cVar.genericError;
        }
        if ((i11 & 2) != 0) {
            bVar = cVar.keyNotFound;
        }
        if ((i11 & 4) != 0) {
            kVar = cVar.unknownFields();
        }
        return cVar.a(aVar, bVar, kVar);
    }

    public final c a(jc0.a genericError, b keyNotFound, okio.k unknownFields) {
        s.k(genericError, "genericError");
        s.k(unknownFields, "unknownFields");
        return new c(genericError, keyNotFound, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jc0.a getGenericError() {
        return this.genericError;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getKeyNotFound() {
        return this.keyNotFound;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return s.f(unknownFields(), cVar.unknownFields()) && this.genericError == cVar.genericError && s.f(this.keyNotFound, cVar.keyNotFound);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.genericError.hashCode()) * 37;
        b bVar = this.keyNotFound;
        int iHashCode2 = iHashCode + (bVar != null ? bVar.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m487newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("genericError=" + this.genericError);
        b bVar = this.keyNotFound;
        if (bVar != null) {
            arrayList.add("keyNotFound=" + bVar);
        }
        return v.y0(arrayList, ", ", "NominalError{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ c(jc0.a aVar, b bVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? jc0.a.GENERICERROR_NONE : aVar, (i11 & 2) != 0 ? null : bVar, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m487newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jc0.a genericError, b bVar, okio.k unknownFields) {
        super(f83593d, unknownFields);
        s.k(genericError, "genericError");
        s.k(unknownFields, "unknownFields");
        this.genericError = genericError;
        this.keyNotFound = bVar;
    }
}
