package x20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.o;
import ezvcard.property.Gender;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0001H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H&¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0001H&¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR,\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!0 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u0004\u0018\u00010%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lx20/g;", "", Gender.MALE, "B", "message", "Lokio/k;", "e", "(Ljava/lang/Object;)Lokio/k;", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)I", "size", "Ljn0/h0;", "f", "(Ljava/lang/Object;I)V", "g", "()Ljava/lang/Object;", "builder", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "tag", "Lcom/squareup/wire/b;", "fieldEncoding", "value", "c", "(Ljava/lang/Object;ILcom/squareup/wire/b;Ljava/lang/Object;)V", "a", "(Ljava/lang/Object;)V", "Lco0/d;", "h", "()Lco0/d;", "messageType", "", "Lx20/b;", "getFields", "()Ljava/util/Map;", "fields", "", "getTypeUrl", "()Ljava/lang/String;", "typeUrl", "Lcom/squareup/wire/o;", "getSyntax", "()Lcom/squareup/wire/o;", "syntax", "wire-runtime"}, k = 1, mv = {1, 4, 0})
public interface g<M, B> {
    void a(B builder);

    M b(B builder);

    void c(B builder, int tag, com.squareup.wire.b fieldEncoding, Object value);

    int d(M message);

    okio.k e(M message);

    void f(M message, int size);

    B g();

    Map<Integer, b<M, B>> getFields();

    o getSyntax();

    String getTypeUrl();

    co0.d<? super M> h();
}
