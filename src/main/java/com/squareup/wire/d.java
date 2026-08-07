package com.squareup.wire;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B%\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/squareup/wire/d;", "K", "V", "Lcom/squareup/wire/ProtoAdapter;", "", "keyAdapter", "valueAdapter", "<init>", "(Lcom/squareup/wire/ProtoAdapter;Lcom/squareup/wire/ProtoAdapter;)V", "value", "", "c", "(Ljava/util/Map$Entry;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Ljava/util/Map$Entry;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ljava/util/Map$Entry;", "f", "(Ljava/util/Map$Entry;)Ljava/util/Map$Entry;", "Lcom/squareup/wire/ProtoAdapter;", DateTokenConverter.CONVERTER_KEY, "()Lcom/squareup/wire/ProtoAdapter;", "e", "wire-runtime"}, k = 1, mv = {1, 4, 0})
final class d<K, V> extends ProtoAdapter<Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ProtoAdapter<K> keyAdapter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProtoAdapter<V> valueAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
        super(b.LENGTH_DELIMITED, (co0.d<?>) o0.b(Map.Entry.class), (String) null, valueAdapter.getSyntax());
        s.k(keyAdapter, "keyAdapter");
        s.k(valueAdapter, "valueAdapter");
        this.keyAdapter = keyAdapter;
        this.valueAdapter = valueAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> decode(k reader) {
        s.k(reader, "reader");
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void encode(l writer, Map.Entry<? extends K, ? extends V> value) {
        s.k(writer, "writer");
        s.k(value, "value");
        this.keyAdapter.encodeWithTag(writer, 1, value.getKey());
        this.valueAdapter.encodeWithTag(writer, 2, value.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int encodedSize(Map.Entry<? extends K, ? extends V> value) {
        s.k(value, "value");
        return this.keyAdapter.encodedSizeWithTag(1, value.getKey()) + this.valueAdapter.encodedSizeWithTag(2, value.getValue());
    }

    public final ProtoAdapter<K> d() {
        return this.keyAdapter;
    }

    public final ProtoAdapter<V> e() {
        return this.valueAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> redact(Map.Entry<? extends K, ? extends V> value) {
        s.k(value, "value");
        throw new UnsupportedOperationException();
    }
}
