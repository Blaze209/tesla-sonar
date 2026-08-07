package expo.modules.kotlin.modules;

import co0.d;
import co0.q;
import expo.modules.kotlin.exception.MissingTypeConverter;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverter;
import expo.modules.kotlin.types.TypeConverterComponent;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\tJU\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0001\"\n\b\u0001\u0010\n\u0018\u0001*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R2\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"Lexpo/modules/kotlin/modules/ModuleConvertersBuilder;", "", "<init>", "()V", "T", "Lco0/d;", "classifier", "Lexpo/modules/kotlin/types/TypeConverterComponent;", "TypeConverter", "(Lco0/d;)Lexpo/modules/kotlin/types/TypeConverterComponent;", "P0", "Lkotlin/Function1;", "body", "(Lco0/d;Lwn0/l;)Lexpo/modules/kotlin/types/TypeConverterComponent;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "buildTypeConverterProvider", "()Lexpo/modules/kotlin/types/TypeConverterProvider;", "", "convertersComponent", "Ljava/util/List;", "getConvertersComponent", "()Ljava/util/List;", "setConvertersComponent", "(Ljava/util/List;)V", "getConvertersComponent$annotations", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ModuleConvertersBuilder {
    private List<TypeConverterComponent<?>> convertersComponent = new ArrayList();

    public static /* synthetic */ void getConvertersComponent$annotations() {
    }

    public final /* synthetic */ <T> TypeConverterComponent<T> TypeConverter(d<T> classifier) {
        s.k(classifier, "classifier");
        s.p();
        ModuleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$1 moduleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$1 = new wn0.a<q>() { // from class: expo.modules.kotlin.modules.ModuleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // wn0.a
            public final q invoke() {
                s.q(6, "T");
                return null;
            }
        };
        s.q(4, "T");
        d dVarB = o0.b(Object.class);
        s.q(3, "T");
        LazyKType lazyKType = new LazyKType(dVarB, false, moduleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$1);
        s.p();
        ModuleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$2 moduleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$2 = new wn0.a<q>() { // from class: expo.modules.kotlin.modules.ModuleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // wn0.a
            public final q invoke() {
                s.q(6, "T?");
                return null;
            }
        };
        s.q(4, "T?");
        d dVarB2 = o0.b(Object.class);
        s.q(3, "T?");
        TypeConverterComponent<T> typeConverterComponent = new TypeConverterComponent<>(lazyKType, new LazyKType(dVarB2, false, moduleConvertersBuilder$TypeConverter$$inlined$lazyTypeOf$2));
        getConvertersComponent().add(typeConverterComponent);
        return typeConverterComponent;
    }

    public final TypeConverterProvider buildTypeConverterProvider() {
        List<TypeConverterComponent<?>> list = this.convertersComponent;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TypeConverterComponent) it.next()).build());
        }
        final Map mapY = v0.y(v.A(arrayList));
        return new TypeConverterProvider() { // from class: expo.modules.kotlin.modules.ModuleConvertersBuilder.buildTypeConverterProvider.1
            @Override // expo.modules.kotlin.types.TypeConverterProvider
            public TypeConverter<?> obtainTypeConverter(q type) throws MissingTypeConverter {
                s.k(type, "type");
                TypeConverter<?> typeConverter = mapY.get(type);
                if (typeConverter != null) {
                    return typeConverter;
                }
                throw new MissingTypeConverter(type);
            }
        };
    }

    public final List<TypeConverterComponent<?>> getConvertersComponent() {
        return this.convertersComponent;
    }

    public final void setConvertersComponent(List<TypeConverterComponent<?>> list) {
        s.k(list, "<set-?>");
        this.convertersComponent = list;
    }

    public final /* synthetic */ <T, P0> TypeConverterComponent<T> TypeConverter(d<T> classifier, final l<? super P0, ? extends T> body) {
        s.k(classifier, "classifier");
        s.k(body, "body");
        s.p();
        ModuleConvertersBuilder$TypeConverter$$inlined$TypeConverter$1 moduleConvertersBuilder$TypeConverter$$inlined$TypeConverter$1 = new wn0.a<q>() { // from class: expo.modules.kotlin.modules.ModuleConvertersBuilder$TypeConverter$$inlined$TypeConverter$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // wn0.a
            public final q invoke() {
                s.q(6, "T");
                return null;
            }
        };
        s.q(4, "T");
        d dVarB = o0.b(Object.class);
        s.q(3, "T");
        LazyKType lazyKType = new LazyKType(dVarB, false, moduleConvertersBuilder$TypeConverter$$inlined$TypeConverter$1);
        s.p();
        ModuleConvertersBuilder$TypeConverter$$inlined$TypeConverter$2 moduleConvertersBuilder$TypeConverter$$inlined$TypeConverter$2 = new wn0.a<q>() { // from class: expo.modules.kotlin.modules.ModuleConvertersBuilder$TypeConverter$$inlined$TypeConverter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // wn0.a
            public final q invoke() {
                s.q(6, "T?");
                return null;
            }
        };
        s.q(4, "T?");
        d dVarB2 = o0.b(Object.class);
        s.q(3, "T?");
        TypeConverterComponent<T> typeConverterComponent = new TypeConverterComponent<>(lazyKType, new LazyKType(dVarB2, false, moduleConvertersBuilder$TypeConverter$$inlined$TypeConverter$2));
        getConvertersComponent().add(typeConverterComponent);
        Map<q, l<Object, T>> converters = typeConverterComponent.getNonNullableConverter().getValue().getConverters();
        s.q(6, "P0");
        s.p();
        converters.put(null, new l() { // from class: expo.modules.kotlin.modules.ModuleConvertersBuilder$TypeConverter$lambda$1$$inlined$from$1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return body.invoke(obj);
            }
        });
        Map<q, l<Object, T>> converters2 = typeConverterComponent.getNullableConverter().getValue().getConverters();
        s.q(6, "P0");
        s.p();
        converters2.put(null, new l() { // from class: expo.modules.kotlin.modules.ModuleConvertersBuilder$TypeConverter$lambda$1$$inlined$from$2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return body.invoke(obj);
            }
        });
        return typeConverterComponent;
    }
}
