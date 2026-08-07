package com.squareup.wire;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/squareup/wire/i;", "E", "Lcom/squareup/wire/ProtoAdapter;", "", "originalAdapter", "<init>", "(Lcom/squareup/wire/ProtoAdapter;)V", "Lcom/squareup/wire/l;", "writer", "", "tag", "value", "Ljn0/h0;", "c", "(Lcom/squareup/wire/l;ILjava/util/List;)V", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)I", "e", "(ILjava/util/List;)I", "b", "(Lcom/squareup/wire/l;Ljava/util/List;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/util/List;", "f", "(Ljava/util/List;)Ljava/util/List;", "Lcom/squareup/wire/ProtoAdapter;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
public final class i<E> extends ProtoAdapter<List<? extends E>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ProtoAdapter<E> originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ProtoAdapter<E> originalAdapter) {
        super(b.LENGTH_DELIMITED, (co0.d<?>) o0.b(List.class), (String) null, originalAdapter.getSyntax(), v.m());
        s.k(originalAdapter, "originalAdapter");
        this.originalAdapter = originalAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<E> decode(k reader) {
        s.k(reader, "reader");
        return v.e(this.originalAdapter.decode(reader));
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void encode(l writer, List<? extends E> value) {
        s.k(writer, "writer");
        s.k(value, "value");
        int size = value.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.originalAdapter.encode(writer, value.get(i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void encodeWithTag(l writer, int tag, List<? extends E> value) {
        s.k(writer, "writer");
        if (value == 0 || value.isEmpty()) {
            return;
        }
        super.encodeWithTag(writer, tag, value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int encodedSize(List<? extends E> value) {
        s.k(value, "value");
        int size = value.size();
        int iEncodedSize = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iEncodedSize += this.originalAdapter.encodedSize(value.get(i11));
        }
        return iEncodedSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int encodedSizeWithTag(int tag, List<? extends E> value) {
        if (value == 0 || value.isEmpty()) {
            return 0;
        }
        return super.encodedSizeWithTag(tag, value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public List<E> redact(List<? extends E> value) {
        s.k(value, "value");
        return v.m();
    }
}
