package expo.modules.kotlin.types;

import co0.q;
import java.util.List;
import java.util.Map;
import jn0.m;
import jn0.x;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\n\b\u0001\u0010\b\u0018\u0001*\u00020\u00012\u0014\b\u0004\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"Lexpo/modules/kotlin/types/TypeConverterComponent;", "", "Type", "Lco0/q;", "notNullableType", "nullableType", "<init>", "(Lco0/q;Lco0/q;)V", "P0", "Lkotlin/Function1;", "body", "from", "(Lwn0/l;)Lexpo/modules/kotlin/types/TypeConverterComponent;", "", "Lkotlin/Pair;", "Lexpo/modules/kotlin/types/TypeConverter;", "build", "()Ljava/util/List;", "Lco0/q;", "getNotNullableType", "()Lco0/q;", "getNullableType", "Lkotlin/Lazy;", "Lexpo/modules/kotlin/types/TypeConverterCollection;", "nonNullableConverter", "Lkotlin/Lazy;", "getNonNullableConverter", "()Lkotlin/Lazy;", "nullableConverter", "getNullableConverter", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TypeConverterComponent<Type> {
    private final Lazy<TypeConverterCollection<Type>> nonNullableConverter;
    private final q notNullableType;
    private final Lazy<TypeConverterCollection<Type>> nullableConverter;
    private final q nullableType;

    public TypeConverterComponent(q notNullableType, q nullableType) {
        s.k(notNullableType, "notNullableType");
        s.k(nullableType, "nullableType");
        this.notNullableType = notNullableType;
        this.nullableType = nullableType;
        this.nonNullableConverter = m.b(new wn0.a() { // from class: expo.modules.kotlin.types.c
            @Override // wn0.a
            public final Object invoke() {
                return TypeConverterComponent.nonNullableConverter$lambda$0(this.f63387a);
            }
        });
        this.nullableConverter = m.b(new wn0.a() { // from class: expo.modules.kotlin.types.d
            @Override // wn0.a
            public final Object invoke() {
                return TypeConverterComponent.nullableConverter$lambda$1(this.f63388a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeConverterCollection nonNullableConverter$lambda$0(TypeConverterComponent typeConverterComponent) {
        return new TypeConverterCollection(typeConverterComponent.notNullableType, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeConverterCollection nullableConverter$lambda$1(TypeConverterComponent typeConverterComponent) {
        return new TypeConverterCollection(typeConverterComponent.nullableType, true);
    }

    public final List<Pair<q, TypeConverter<?>>> build() {
        return (this.nonNullableConverter.isInitialized() && this.nullableConverter.isInitialized()) ? v.p(x.a(this.notNullableType, this.nonNullableConverter.getValue()), x.a(this.nullableType, this.nullableConverter.getValue())) : v.m();
    }

    public final /* synthetic */ <P0> TypeConverterComponent<Type> from(l<? super P0, ? extends Type> body) {
        s.k(body, "body");
        Map<q, l<Object, Type>> converters = getNonNullableConverter().getValue().getConverters();
        s.q(6, "P0");
        converters.put(null, new TypeConverterCollection.AnonymousClass1(body));
        Map<q, l<Object, Type>> converters2 = getNullableConverter().getValue().getConverters();
        s.q(6, "P0");
        converters2.put(null, new TypeConverterCollection.AnonymousClass1(body));
        return this;
    }

    public final Lazy<TypeConverterCollection<Type>> getNonNullableConverter() {
        return this.nonNullableConverter;
    }

    public final q getNotNullableType() {
        return this.notNullableType;
    }

    public final Lazy<TypeConverterCollection<Type>> getNullableConverter() {
        return this.nullableConverter;
    }

    public final q getNullableType() {
        return this.nullableType;
    }
}
