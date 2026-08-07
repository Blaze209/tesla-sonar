package w20;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co0.l;
import co0.o;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.i;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: w20.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u001b\u001fBW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u001c\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0005\u0012\u001a\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR-\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R+\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u00058\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lw20/a;", "T", "Lcom/squareup/moshi/h;", "Lco0/h;", "constructor", "", "Lw20/a$a;", "", "allBindings", "nonIgnoredBindings", "Lcom/squareup/moshi/k$b;", "options", "<init>", "(Lco0/h;Ljava/util/List;Ljava/util/List;Lcom/squareup/moshi/k$b;)V", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Ljava/lang/Object;", "Lcom/squareup/moshi/r;", "writer", "value", "Ljn0/h0;", "toJson", "(Lcom/squareup/moshi/r;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "a", "Lco0/h;", "getConstructor", "()Lco0/h;", "b", "Ljava/util/List;", "getAllBindings", "()Ljava/util/List;", "c", "getNonIgnoredBindings", DateTokenConverter.CONVERTER_KEY, "Lcom/squareup/moshi/k$b;", "getOptions", "()Lcom/squareup/moshi/k$b;", "moshi-kotlin"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KotlinJsonAdapter<T> extends h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final co0.h<T> constructor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Binding<T, Object>> allBindings;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Binding<T, Object>> nonIgnoredBindings;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k.b options;

    /* JADX INFO: renamed from: w20.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u0003BC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00028\u0002¢\u0006\u0004\b\u0015\u0010\u0016Jb\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\"\u0010-\u001a\u0004\b.\u0010\u001c¨\u0006/"}, d2 = {"Lw20/a$a;", "K", "P", "", "", "jsonName", "Lcom/squareup/moshi/h;", "adapter", "Lco0/o;", "property", "Lco0/l;", "parameter", "", "propertyIndex", "<init>", "(Ljava/lang/String;Lcom/squareup/moshi/h;Lco0/o;Lco0/l;I)V", "value", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "result", "Ljn0/h0;", "h", "(Ljava/lang/Object;Ljava/lang/Object;)V", "a", "(Ljava/lang/String;Lcom/squareup/moshi/h;Lco0/o;Lco0/l;I)Lw20/a$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Lcom/squareup/moshi/h;", DateTokenConverter.CONVERTER_KEY, "()Lcom/squareup/moshi/h;", "Lco0/o;", "f", "()Lco0/o;", "Lco0/l;", "getParameter", "()Lco0/l;", "I", "g", "moshi-kotlin"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Binding<K, P> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String jsonName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final h<P> adapter;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final o<K, P> property;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l parameter;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int propertyIndex;

        /* JADX WARN: Multi-variable type inference failed */
        public Binding(String jsonName, h<P> adapter, o<K, ? extends P> property, l lVar, int i11) {
            s.k(jsonName, "jsonName");
            s.k(adapter, "adapter");
            s.k(property, "property");
            this.jsonName = jsonName;
            this.adapter = adapter;
            this.property = property;
            this.parameter = lVar;
            this.propertyIndex = i11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Binding b(Binding binding, String str, h hVar, o oVar, l lVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = binding.jsonName;
            }
            if ((i12 & 2) != 0) {
                hVar = binding.adapter;
            }
            if ((i12 & 4) != 0) {
                oVar = binding.property;
            }
            if ((i12 & 8) != 0) {
                lVar = binding.parameter;
            }
            if ((i12 & 16) != 0) {
                i11 = binding.propertyIndex;
            }
            int i13 = i11;
            o oVar2 = oVar;
            return binding.a(str, hVar, oVar2, lVar, i13);
        }

        public final Binding<K, P> a(String jsonName, h<P> adapter, o<K, ? extends P> property, l parameter, int propertyIndex) {
            s.k(jsonName, "jsonName");
            s.k(adapter, "adapter");
            s.k(property, "property");
            return new Binding<>(jsonName, adapter, property, parameter, propertyIndex);
        }

        public final P c(K value) {
            return this.property.get(value);
        }

        public final h<P> d() {
            return this.adapter;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getJsonName() {
            return this.jsonName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Binding)) {
                return false;
            }
            Binding binding = (Binding) other;
            return s.f(this.jsonName, binding.jsonName) && s.f(this.adapter, binding.adapter) && s.f(this.property, binding.property) && s.f(this.parameter, binding.parameter) && this.propertyIndex == binding.propertyIndex;
        }

        public final o<K, P> f() {
            return this.property;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getPropertyIndex() {
            return this.propertyIndex;
        }

        public final void h(K result, P value) {
            if (value != c.f120524b) {
                o<K, P> oVar = this.property;
                s.i(oVar, "null cannot be cast to non-null type kotlin.reflect.KMutableProperty1<K of com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter.Binding, P of com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter.Binding>");
                ((co0.k) oVar).h(result, value);
            }
        }

        public int hashCode() {
            int iHashCode = ((((this.jsonName.hashCode() * 31) + this.adapter.hashCode()) * 31) + this.property.hashCode()) * 31;
            l lVar = this.parameter;
            return ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + Integer.hashCode(this.propertyIndex);
        }

        public String toString() {
            return "Binding(jsonName=" + this.jsonName + ", adapter=" + this.adapter + ", property=" + this.property + ", parameter=" + this.parameter + ", propertyIndex=" + this.propertyIndex + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX INFO: renamed from: w20.a$b */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R(\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00170\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lw20/a$b;", "Lkotlin/collections/i;", "Lco0/l;", "", "", "parameterKeys", "", "parameterValues", "<init>", "(Ljava/util/List;[Ljava/lang/Object;)V", Action.KEY_ATTRIBUTE, "value", "h", "(Lco0/l;Ljava/lang/Object;)Ljava/lang/Object;", "", "b", "(Lco0/l;)Z", DateTokenConverter.CONVERTER_KEY, "(Lco0/l;)Ljava/lang/Object;", "a", "Ljava/util/List;", "[Ljava/lang/Object;", "", "", "getEntries", "()Ljava/util/Set;", "entries", "moshi-kotlin"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends i<l, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<l> parameterKeys;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Object[] parameterValues;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends l> parameterKeys, Object[] parameterValues) {
            s.k(parameterKeys, "parameterKeys");
            s.k(parameterValues, "parameterValues");
            this.parameterKeys = parameterKeys;
            this.parameterValues = parameterValues;
        }

        public boolean b(l key) {
            s.k(key, "key");
            return this.parameterValues[key.getIndex()] != c.f120524b;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof l) {
                return b((l) obj);
            }
            return false;
        }

        public Object d(l key) {
            s.k(key, "key");
            Object obj = this.parameterValues[key.getIndex()];
            if (obj != c.f120524b) {
                return obj;
            }
            return null;
        }

        public /* bridge */ Object e(l lVar, Object obj) {
            return super.getOrDefault(lVar, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof l) {
                return d((l) obj);
            }
            return null;
        }

        @Override // p013kotlin.collections.i
        public Set<Map.Entry<l, Object>> getEntries() {
            List<l> list = this.parameterKeys;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            int i11 = 0;
            for (T t11 : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    v.x();
                }
                arrayList.add(new AbstractMap.SimpleEntry((l) t11, this.parameterValues[i11]));
                i11 = i12;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t12 : arrayList) {
                if (((AbstractMap.SimpleEntry) t12).getValue() != c.f120524b) {
                    linkedHashSet.add(t12);
                }
            }
            return linkedHashSet;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof l) ? obj2 : e((l) obj, obj2);
        }

        @Override // p013kotlin.collections.i, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Object put(l key, Object value) {
            s.k(key, "key");
            return null;
        }

        public /* bridge */ Object i(l lVar) {
            return super.remove(lVar);
        }

        public /* bridge */ boolean j(l lVar, Object obj) {
            return super.remove(lVar, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof l) {
                return i((l) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj instanceof l) {
                return j((l) obj, obj2);
            }
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinJsonAdapter(co0.h<? extends T> constructor, List<Binding<T, Object>> allBindings, List<Binding<T, Object>> nonIgnoredBindings, k.b options) {
        s.k(constructor, "constructor");
        s.k(allBindings, "allBindings");
        s.k(nonIgnoredBindings, "nonIgnoredBindings");
        s.k(options, "options");
        this.constructor = constructor;
        this.allBindings = allBindings;
        this.nonIgnoredBindings = nonIgnoredBindings;
        this.options = options;
    }

    @Override // com.squareup.moshi.h
    public T fromJson(k reader) {
        s.k(reader, "reader");
        int size = this.constructor.getParameters().size();
        int size2 = this.allBindings.size();
        Object[] objArr = new Object[size2];
        for (int i11 = 0; i11 < size2; i11++) {
            objArr[i11] = c.f120524b;
        }
        reader.h();
        while (reader.hasNext()) {
            int iT = reader.T(this.options);
            if (iT == -1) {
                reader.e0();
                reader.F();
            } else {
                Binding<T, Object> binding = this.nonIgnoredBindings.get(iT);
                int propertyIndex = binding.getPropertyIndex();
                if (objArr[propertyIndex] != c.f120524b) {
                    throw new JsonDataException("Multiple values for '" + binding.f().getName() + "' at " + reader.getPath());
                }
                Object objFromJson = binding.d().fromJson(reader);
                objArr[propertyIndex] = objFromJson;
                if (objFromJson == null && !binding.f().getReturnType().getIsMarkedNullable()) {
                    JsonDataException jsonDataExceptionX = v20.c.x(binding.f().getName(), binding.getJsonName(), reader);
                    s.j(jsonDataExceptionX, "unexpectedNull(\n        …         reader\n        )");
                    throw jsonDataExceptionX;
                }
            }
        }
        reader.j();
        boolean z11 = this.allBindings.size() == size;
        for (int i12 = 0; i12 < size; i12++) {
            if (objArr[i12] == c.f120524b) {
                if (this.constructor.getParameters().get(i12).e()) {
                    z11 = false;
                } else {
                    if (!this.constructor.getParameters().get(i12).getType().getIsMarkedNullable()) {
                        String name = this.constructor.getParameters().get(i12).getName();
                        Binding<T, Object> binding2 = this.allBindings.get(i12);
                        JsonDataException jsonDataExceptionO = v20.c.o(name, binding2 != null ? binding2.getJsonName() : null, reader);
                        s.j(jsonDataExceptionO, "missingProperty(\n       …       reader\n          )");
                        throw jsonDataExceptionO;
                    }
                    objArr[i12] = null;
                }
            }
        }
        T tCall = z11 ? this.constructor.call(Arrays.copyOf(objArr, size2)) : this.constructor.callBy(new b(this.constructor.getParameters(), objArr));
        int size3 = this.allBindings.size();
        while (size < size3) {
            Binding binding3 = this.allBindings.get(size);
            s.h(binding3);
            binding3.h(tCall, objArr[size]);
            size++;
        }
        return tCall;
    }

    @Override // com.squareup.moshi.h
    public void toJson(r writer, T value) {
        s.k(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value == null");
        }
        writer.o();
        for (Binding<T, Object> binding : this.allBindings) {
            if (binding != null) {
                writer.b0(binding.getJsonName());
                binding.d().toJson(writer, binding.c(value));
            }
        }
        writer.C();
    }

    public String toString() {
        return "KotlinJsonAdapter(" + this.constructor.getReturnType() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
