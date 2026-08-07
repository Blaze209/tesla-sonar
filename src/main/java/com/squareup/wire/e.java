package com.squareup.wire;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B%\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001e¨\u0006 "}, d2 = {"Lcom/squareup/wire/e;", "K", "V", "Lcom/squareup/wire/ProtoAdapter;", "", "keyAdapter", "valueAdapter", "<init>", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoAdapter;)V", "value", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;)I", "tag", "e", "(ILjava/util/Map;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Ljava/util/Map;)V", "c", "(Lcom/squareup/wire/l;ILjava/util/Map;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/util/Map;", "f", "(Ljava/util/Map;)Ljava/util/Map;", "Lcom/squareup/wire/d;", "Lcom/squareup/wire/d;", "entryAdapter", "wire-runtime"}, k = 1, mv = {1, 4, 0})
public final class e<K, V> extends ProtoAdapter<Map<K, ? extends V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d<K, V> entryAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
        super(b.LENGTH_DELIMITED, (co0.d<?>) o0.b(Map.class), (String) null, valueAdapter.getSyntax(), v0.i());
        s.k(keyAdapter, "keyAdapter");
        s.k(valueAdapter, "valueAdapter");
        this.entryAdapter = new d<>(keyAdapter, valueAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<K, V> decode(k reader) throws IOException {
        s.k(reader, "reader");
        long jD = reader.d();
        K kDecode = null;
        V vDecode = null;
        while (true) {
            int iG = reader.g();
            if (iG == -1) {
                break;
            }
            if (iG == 1) {
                kDecode = this.entryAdapter.d().decode(reader);
            } else if (iG == 2) {
                vDecode = this.entryAdapter.e().decode(reader);
            }
        }
        reader.e(jD);
        if (!(kDecode != null)) {
            throw new IllegalStateException("Map entry with null key");
        }
        if (vDecode != null) {
            return v0.f(x.a(kDecode, vDecode));
        }
        throw new IllegalStateException("Map entry with null value");
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void encode(l writer, Map<K, ? extends V> value) {
        s.k(writer, "writer");
        s.k(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void encodeWithTag(l writer, int tag, Map<K, ? extends V> value) {
        s.k(writer, "writer");
        if (value == null) {
            return;
        }
        Iterator<Map.Entry<K, ? extends V>> it = value.entrySet().iterator();
        while (it.hasNext()) {
            this.entryAdapter.encodeWithTag(writer, tag, it.next());
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int encodedSize(Map<K, ? extends V> value) {
        s.k(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int encodedSizeWithTag(int tag, Map<K, ? extends V> value) {
        int iEncodedSizeWithTag = 0;
        if (value == null) {
            return 0;
        }
        Iterator<Map.Entry<K, ? extends V>> it = value.entrySet().iterator();
        while (it.hasNext()) {
            iEncodedSizeWithTag += this.entryAdapter.encodedSizeWithTag(tag, it.next());
        }
        return iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map<K, V> redact(Map<K, ? extends V> value) {
        s.k(value, "value");
        return v0.i();
    }
}
