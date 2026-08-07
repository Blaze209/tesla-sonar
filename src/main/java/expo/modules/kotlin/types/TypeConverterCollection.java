package expo.modules.kotlin.types;

import ch.qos.logback.core.CoreConstants;
import co0.f;
import co0.q;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.MissingTypeConverter;
import expo.modules.kotlin.jni.ExpectedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.TypeCastException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0006\b\u0001\u0010\n\u0018\u00012\u0014\b\u0004\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019RB\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u000b0\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006#"}, d2 = {"Lexpo/modules/kotlin/types/TypeConverterCollection;", "", "Type", "Lexpo/modules/kotlin/types/NullAwareTypeConverter;", "Lco0/q;", "type", "", "isOptional", "<init>", "(Lco0/q;Z)V", "P0", "Lkotlin/Function1;", "body", "from", "(Lwn0/l;)Lexpo/modules/kotlin/types/TypeConverterCollection;", "value", "Lexpo/modules/kotlin/AppContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "convertNonOptional", "(Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Ljava/lang/Object;", "Lexpo/modules/kotlin/jni/ExpectedType;", "getCppRequiredTypes", "()Lexpo/modules/kotlin/jni/ExpectedType;", "Lco0/q;", "getType", "()Lco0/q;", "", "converters", "Ljava/util/Map;", "getConverters", "()Ljava/util/Map;", "setConverters", "(Ljava/util/Map;)V", "getConverters$annotations", "()V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TypeConverterCollection<Type> extends NullAwareTypeConverter<Type> {
    private Map<q, l<Object, Type>> converters;
    private final q type;

    /* JADX INFO: renamed from: expo.modules.kotlin.types.TypeConverterCollection$from$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public static final class AnonymousClass1 implements l<Object, Type> {
        final /* synthetic */ l<P0, Type> $body;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(l<? super P0, ? extends Type> lVar) {
            this.$body = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // wn0.l
        public final Type invoke(Object obj) {
            return this.$body.invoke((P0) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeConverterCollection(q type, boolean z11) {
        super(z11);
        s.k(type, "type");
        this.type = type;
        this.converters = new LinkedHashMap();
    }

    public static /* synthetic */ void getConverters$annotations() {
    }

    @Override // expo.modules.kotlin.types.NullAwareTypeConverter
    public Type convertNonOptional(Object value, AppContext context) throws MissingTypeConverter {
        s.k(value, "value");
        Map<q, l<Object, Type>> map = this.converters;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<q, l<Object, Type>> entry : map.entrySet()) {
            arrayList.add(x.a(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            f classifier = ((q) ((Pair) obj).a()).getClassifier();
            co0.d dVar = classifier instanceof co0.d ? (co0.d) classifier : null;
            if (dVar != null && dVar.j(value)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            if (value instanceof Dynamic) {
                return convertNonOptional(new ExpoDynamic((Dynamic) value), context);
            }
            throw new MissingTypeConverter(this.type);
        }
        if (arrayList2.size() <= 1) {
            return (Type) ((l) ((Pair) v.o0(arrayList2)).f()).invoke(value);
        }
        throw new TypeCastException("Cannot cast '" + value + "' to '" + this.type + "'. Type converters conflict");
    }

    public final /* synthetic */ <P0> TypeConverterCollection<Type> from(l<? super P0, ? extends Type> body) {
        s.k(body, "body");
        Map<q, l<Object, Type>> converters = getConverters();
        s.q(6, "P0");
        converters.put(null, new AnonymousClass1(body));
        return this;
    }

    public final Map<q, l<Object, Type>> getConverters() {
        return this.converters;
    }

    @Override // expo.modules.kotlin.types.TypeConverter
    public ExpectedType getCppRequiredTypes() {
        ExpectedType.Companion companion = ExpectedType.INSTANCE;
        Set<q> setKeySet = this.converters.keySet();
        ArrayList arrayList = new ArrayList(v.y(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(ExpectedType.INSTANCE.fromKType((q) it.next()));
        }
        ExpectedType[] expectedTypeArr = (ExpectedType[]) arrayList.toArray(new ExpectedType[0]);
        return companion.merge((ExpectedType[]) Arrays.copyOf(expectedTypeArr, expectedTypeArr.length));
    }

    public final q getType() {
        return this.type;
    }

    public final void setConverters(Map<q, l<Object, Type>> map) {
        s.k(map, "<set-?>");
        this.converters = map;
    }
}
