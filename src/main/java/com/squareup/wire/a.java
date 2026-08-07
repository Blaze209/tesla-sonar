package com.squareup.wire;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.p;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\fH$¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/squareup/wire/a;", "Lcom/squareup/wire/p;", "E", "Lcom/squareup/wire/ProtoAdapter;", "Lco0/d;", "type", "Lcom/squareup/wire/o;", "syntax", "identity", "<init>", "(Lco0/d;Lcom/squareup/wire/o;Lcom/squareup/wire/p;)V", "value", "", "c", "(Lcom/squareup/wire/p;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lcom/squareup/wire/p;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lcom/squareup/wire/p;", "e", "(Lcom/squareup/wire/p;)Lcom/squareup/wire/p;", DateTokenConverter.CONVERTER_KEY, "(I)Lcom/squareup/wire/p;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
public abstract class a<E extends p> extends ProtoAdapter<E> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected a(co0.d<E> type, o syntax, E e11) {
        super(b.VARINT, (co0.d<?>) type, (String) null, syntax, e11);
        s.k(type, "type");
        s.k(syntax, "syntax");
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public E decode(k reader) {
        s.k(reader, "reader");
        int iN = reader.n();
        E e11 = (E) d(iN);
        if (e11 != null) {
            return e11;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(iN, getType());
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void encode(l writer, E value) {
        s.k(writer, "writer");
        s.k(value, "value");
        writer.g(value.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int encodedSize(E value) {
        s.k(value, "value");
        return l.INSTANCE.i(value.getValue());
    }

    protected abstract E d(int value);

    @Override // com.squareup.wire.ProtoAdapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public E redact(E value) {
        s.k(value, "value");
        throw new UnsupportedOperationException();
    }
}
