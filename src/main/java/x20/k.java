package x20;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.q;
import ezvcard.property.Gender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000e\u0018\u0000 @*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001$B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u001c\u0010&\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R/\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(0'8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R)\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(0-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u00108\u001a\b\u0012\u0004\u0012\u00020\u001c038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001f\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c038\u0006¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u00107R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001d\u0010?\u001a\u00020\u001c*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030(8F¢\u0006\u0006\u001a\u0004\b$\u0010>¨\u0006A"}, d2 = {"Lx20/k;", "", Gender.MALE, "B", "Lcom/squareup/wire/ProtoAdapter;", "Lx20/g;", "binding", "<init>", "(Lx20/g;)V", "b", "()Ljava/lang/Object;", "value", "", "encodedSize", "(Ljava/lang/Object;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "encode", "(Lcom/squareup/wire/l;Ljava/lang/Object;)V", "redact", "(Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/squareup/wire/k;", "reader", "decode", "(Lcom/squareup/wire/k;)Ljava/lang/Object;", "Lco0/d;", "a", "Lco0/d;", "messageType", "", "Lx20/b;", "Ljava/util/Map;", "getFields", "()Ljava/util/Map;", "fields", "", "c", "[Lx20/b;", "getFieldBindingsArray", "()[Lx20/b;", "fieldBindingsArray", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getJsonNames", "()Ljava/util/List;", "jsonNames", "e", "getJsonAlternateNames", "jsonAlternateNames", "f", "Lx20/g;", "(Lx20/b;)Ljava/lang/String;", "jsonName", "g", "wire-runtime"}, k = 1, mv = {1, 4, 0})
public final class k<M, B> extends ProtoAdapter<M> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final co0.d<? super M> messageType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, b<M, B>> fields;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b<M, B>[] fieldBindingsArray;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> jsonNames;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<String> jsonAlternateNames;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g<M, B> binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g<M, B> binding) {
        super(com.squareup.wire.b.LENGTH_DELIMITED, binding.h(), binding.getTypeUrl(), binding.getSyntax());
        s.k(binding, "binding");
        this.binding = binding;
        this.messageType = binding.h();
        Map<Integer, b<M, B>> fields = binding.getFields();
        this.fields = fields;
        Object[] array = fields.values().toArray(new b[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        b<M, B>[] bVarArr = (b[]) array;
        this.fieldBindingsArray = bVarArr;
        ArrayList arrayList = new ArrayList(bVarArr.length);
        for (b<M, B> bVar : bVarArr) {
            arrayList.add(a(bVar));
        }
        this.jsonNames = arrayList;
        b<M, B>[] bVarArr2 = this.fieldBindingsArray;
        ArrayList arrayList2 = new ArrayList(bVarArr2.length);
        for (b<M, B> bVar2 : bVarArr2) {
            arrayList2.add(!s.f(a(bVar2), bVar2.getDeclaredName()) ? bVar2.getDeclaredName() : !s.f(a(bVar2), bVar2.getName()) ? bVar2.getName() : null);
        }
        this.jsonAlternateNames = arrayList2;
    }

    public final String a(b<?, ?> jsonName) {
        s.k(jsonName, "$this$jsonName");
        return jsonName.getWireFieldJsonName().length() == 0 ? jsonName.getDeclaredName() : jsonName.getWireFieldJsonName();
    }

    public final B b() {
        return this.binding.g();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M decode(com.squareup.wire.k reader) throws IOException {
        s.k(reader, "reader");
        B b11 = b();
        long jD = reader.d();
        while (true) {
            int iG = reader.g();
            if (iG == -1) {
                reader.e(jD);
                return this.binding.b(b11);
            }
            b<M, B> bVar = this.fields.get(Integer.valueOf(iG));
            if (bVar != null) {
                try {
                    Object objDecode = (bVar.l() ? bVar.b() : bVar.i()).decode(reader);
                    s.h(objDecode);
                    bVar.o(b11, objDecode);
                } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                    this.binding.c(b11, iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                }
            } else {
                com.squareup.wire.b nextFieldEncoding = reader.getNextFieldEncoding();
                s.h(nextFieldEncoding);
                this.binding.c(b11, iG, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(reader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(com.squareup.wire.l writer, M value) {
        s.k(writer, "writer");
        s.k(value, "value");
        for (b<M, B> bVar : this.fields.values()) {
            Object objA = bVar.a(value);
            if (objA != null) {
                bVar.b().encodeWithTag(writer, bVar.getTag(), objA);
            }
        }
        writer.a(this.binding.e(value));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(M value) {
        s.k(value, "value");
        int iD = this.binding.d(value);
        if (iD != 0) {
            return iD;
        }
        int iEncodedSizeWithTag = 0;
        for (b<M, B> bVar : this.fields.values()) {
            Object objA = bVar.a(value);
            if (objA != null) {
                iEncodedSizeWithTag += bVar.b().encodedSizeWithTag(bVar.getTag(), objA);
            }
        }
        int iD2 = iEncodedSizeWithTag + this.binding.e(value).D();
        this.binding.f(value, iD2);
        return iD2;
    }

    public boolean equals(Object other) {
        return (other instanceof k) && s.f(((k) other).messageType, this.messageType);
    }

    public int hashCode() {
        return this.messageType.hashCode();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M redact(M value) {
        s.k(value, "value");
        B bG = this.binding.g();
        for (b<M, B> bVar : this.fields.values()) {
            if (bVar.getRedacted() && bVar.getLabel() == q.a.REQUIRED) {
                throw new UnsupportedOperationException("Field '" + bVar.getName() + "' in " + getType() + " is required and cannot be redacted.");
            }
            boolean zM = bVar.m();
            if (bVar.getRedacted() || (zM && !bVar.getLabel().isRepeated())) {
                Object objD = bVar.d(bG);
                if (objD != null) {
                    bVar.n(bG, bVar.b().redact(objD));
                }
            } else if (zM && bVar.getLabel().isRepeated()) {
                Object objD2 = bVar.d(bG);
                if (objD2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                }
                List list = (List) objD2;
                ProtoAdapter<?> protoAdapterI = bVar.i();
                if (protoAdapterI == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                }
                bVar.n(bG, d.a(list, protoAdapterI));
            }
        }
        this.binding.a(bG);
        return this.binding.b(bG);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public String toString(M value) {
        s.k(value, "value");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.messageType.l());
        sb2.append(CoreConstants.CURLY_LEFT);
        boolean z11 = true;
        for (b<M, B> bVar : this.fields.values()) {
            Object objA = bVar.a(value);
            if (objA != null) {
                if (!z11) {
                    sb2.append(", ");
                }
                sb2.append(bVar.getName());
                sb2.append('=');
                if (bVar.getRedacted()) {
                    objA = "██";
                }
                sb2.append(objA);
                z11 = false;
            }
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        String string = sb2.toString();
        s.j(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
