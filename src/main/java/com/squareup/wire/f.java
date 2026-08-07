package com.squareup.wire;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.f;
import com.squareup.wire.f.a;
import ezvcard.property.Gender;
import java.io.EOFException;
import java.io.OutputStream;
import java.io.Serializable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b&\u0018\u0000 ,*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004:\u0002-.B\u001f\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0001H&¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u0018\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u0018\u0010 R\u0017\u0010\b\u001a\u00020\u00078G¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\b\u0010\u001dR\"\u0010#\u001a\u00020\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\"8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b)\u0010$R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b\u0006\u0010+¨\u0006/"}, d2 = {"Lcom/squareup/wire/f;", Gender.MALE, "Lcom/squareup/wire/f$a;", "B", "Ljava/io/Serializable;", "Lcom/squareup/wire/ProtoAdapter;", "adapter", "Lokio/k;", "unknownFields", "<init>", "(Lcom/squareup/wire/ProtoAdapter;Lokio/k;)V", "newBuilder", "()Lcom/squareup/wire/f$a;", "withoutUnknownFields", "()Lcom/squareup/wire/f;", "", "toString", "()Ljava/lang/String;", "", "writeReplace", "()Ljava/lang/Object;", "Lokio/i;", "sink", "Ljn0/h0;", "encode", "(Lokio/i;)V", "", "()[B", "encodeByteString", "()Lokio/k;", "Ljava/io/OutputStream;", "stream", "(Ljava/io/OutputStream;)V", "Lokio/k;", "", "cachedSerializedSize", "I", "getCachedSerializedSize$wire_runtime", "()I", "setCachedSerializedSize$wire_runtime", "(I)V", "hashCode", "Lcom/squareup/wire/ProtoAdapter;", "()Lcom/squareup/wire/ProtoAdapter;", "Companion", "a", "b", "wire-runtime"}, k = 1, mv = {1, 4, 0})
public abstract class f<M extends f<M, B>, B extends a<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    private transient int cachedSerializedSize;
    protected transient int hashCode;
    private final transient okio.k unknownFields;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0014\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0001*\u0014\b\u0003\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u00020\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J3\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00028\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010!\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010(\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/squareup/wire/f$a;", "Lcom/squareup/wire/f;", Gender.MALE, "B", "", "<init>", "()V", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "", "tag", "Lcom/squareup/wire/b;", "fieldEncoding", "value", "a", "(ILcom/squareup/wire/b;Ljava/lang/Object;)Lcom/squareup/wire/f$a;", "c", "()Lcom/squareup/wire/f$a;", "b", "()Lcom/squareup/wire/f;", "Lokio/k;", "Lokio/k;", "getUnknownFieldsByteString$wire_runtime", "()Lokio/k;", "setUnknownFieldsByteString$wire_runtime", "(Lokio/k;)V", "unknownFieldsByteString", "Lokio/h;", "Lokio/h;", "getUnknownFieldsBuffer$wire_runtime", "()Lokio/h;", "setUnknownFieldsBuffer$wire_runtime", "(Lokio/h;)V", "unknownFieldsBuffer", "Lcom/squareup/wire/l;", "Lcom/squareup/wire/l;", "getUnknownFieldsWriter$wire_runtime", "()Lcom/squareup/wire/l;", "setUnknownFieldsWriter$wire_runtime", "(Lcom/squareup/wire/l;)V", "unknownFieldsWriter", "wire-runtime"}, k = 1, mv = {1, 4, 0})
    public static abstract class a<M extends f<M, B>, B extends a<M, B>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private transient okio.k unknownFieldsByteString = okio.k.f97943e;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private transient okio.h unknownFieldsBuffer;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private transient l unknownFieldsWriter;

        protected a() {
        }

        private final void d() {
            if (this.unknownFieldsBuffer == null) {
                this.unknownFieldsBuffer = new okio.h();
                okio.h hVar = this.unknownFieldsBuffer;
                s.h(hVar);
                l lVar = new l(hVar);
                this.unknownFieldsWriter = lVar;
                s.h(lVar);
                lVar.a(this.unknownFieldsByteString);
                this.unknownFieldsByteString = okio.k.f97943e;
            }
        }

        public final a<M, B> a(int tag, b fieldEncoding, Object value) {
            s.k(fieldEncoding, "fieldEncoding");
            d();
            ProtoAdapter<?> protoAdapterRawProtoAdapter = fieldEncoding.rawProtoAdapter();
            if (protoAdapterRawProtoAdapter == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            }
            l lVar = this.unknownFieldsWriter;
            s.h(lVar);
            protoAdapterRawProtoAdapter.encodeWithTag(lVar, tag, value);
            return this;
        }

        public abstract M b();

        public final a<M, B> c() throws EOFException {
            this.unknownFieldsByteString = okio.k.f97943e;
            okio.h hVar = this.unknownFieldsBuffer;
            if (hVar != null) {
                s.h(hVar);
                hVar.c();
                this.unknownFieldsBuffer = null;
            }
            this.unknownFieldsWriter = null;
            return this;
        }
    }

    protected f(ProtoAdapter<M> adapter, okio.k unknownFields) {
        s.k(adapter, "adapter");
        s.k(unknownFields, "unknownFields");
        this.adapter = adapter;
        this.unknownFields = unknownFields;
    }

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public final void encode(okio.i sink) {
        s.k(sink, "sink");
        this.adapter.encode(sink, this);
    }

    public final okio.k encodeByteString() {
        return this.adapter.encodeByteString(this);
    }

    /* JADX INFO: renamed from: getCachedSerializedSize$wire_runtime, reason: from getter */
    public final int getCachedSerializedSize() {
        return this.cachedSerializedSize;
    }

    public abstract B newBuilder();

    public final void setCachedSerializedSize$wire_runtime(int i11) {
        this.cachedSerializedSize = i11;
    }

    public String toString() {
        return this.adapter.toString(this);
    }

    public final okio.k unknownFields() {
        okio.k kVar = this.unknownFields;
        return kVar == null ? okio.k.f97943e : kVar;
    }

    public final M withoutUnknownFields() {
        return (M) newBuilder().c().b();
    }

    protected final Object writeReplace() {
        return new g(encode(), getClass());
    }

    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public final void encode(OutputStream stream) {
        s.k(stream, "stream");
        this.adapter.encode(stream, this);
    }
}
