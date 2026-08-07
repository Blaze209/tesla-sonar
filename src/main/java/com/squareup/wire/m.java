package com.squareup.wire;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/squareup/wire/m;", "E", "Lcom/squareup/wire/ProtoAdapter;", "", "originalAdapter", "<init>", "(Lcom/squareup/wire/ProtoAdapter;)V", "value", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)I", "tag", "e", "(ILjava/util/List;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Ljava/util/List;)V", "c", "(Lcom/squareup/wire/l;ILjava/util/List;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/util/List;", "f", "(Ljava/util/List;)Ljava/util/List;", "Lcom/squareup/wire/ProtoAdapter;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
public final class m<E> extends ProtoAdapter<List<? extends E>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ProtoAdapter<E> originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ProtoAdapter<E> originalAdapter) {
        super(originalAdapter.getFieldEncoding(), (co0.d<?>) o0.b(List.class), (String) null, originalAdapter.getSyntax(), v.m());
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
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void encodeWithTag(l writer, int tag, List<? extends E> value) {
        s.k(writer, "writer");
        if (value == null) {
            return;
        }
        int size = value.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.originalAdapter.encodeWithTag(writer, tag, value.get(i11));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int encodedSize(List<? extends E> value) {
        s.k(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int encodedSizeWithTag(int tag, List<? extends E> value) {
        if (value == null) {
            return 0;
        }
        int size = value.size();
        int iEncodedSizeWithTag = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iEncodedSizeWithTag += this.originalAdapter.encodedSizeWithTag(tag, value.get(i11));
        }
        return iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public List<E> redact(List<? extends E> value) {
        s.k(value, "value");
        return v.m();
    }
}
