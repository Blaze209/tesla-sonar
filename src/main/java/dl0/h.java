package dl0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0006J!\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u00122\u0014\u0010\u0017\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R&\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000*0&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010(R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Ldl0/h;", "", "Value", "", "", "<init>", "()V", Action.KEY_ATTRIBUTE, "", "b", "(Ljava/lang/String;)Z", "value", "containsValue", "(Ljava/lang/Object;)Z", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/Object;", "isEmpty", "()Z", "Ljn0/h0;", "clear", "k", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "l", "other", "equals", "", "hashCode", "()I", "Ldl0/i;", "a", "Ljava/util/Map;", "delegate", IntegerTokenConverter.CONVERTER_KEY, "size", "", "h", "()Ljava/util/Set;", "keys", "", "e", "entries", "", "j", "()Ljava/util/Collection;", "values", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h<Value> implements Map<String, Value>, xn0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<i, Value> delegate = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Value", "", "Ldl0/i;", "", "a", "(Ljava/util/Map$Entry;)Ljava/util/Map$Entry;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<Map.Entry<i, Value>, Map.Entry<String, Value>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f60757c = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map.Entry<String, Value> invoke(Map.Entry<i, Value> $receiver) {
            p013kotlin.jvm.internal.s.k($receiver, "$this$$receiver");
            return new p($receiver.getKey().getContent(), $receiver.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Value", "", "", "Ldl0/i;", "a", "(Ljava/util/Map$Entry;)Ljava/util/Map$Entry;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<Map.Entry<String, Value>, Map.Entry<i, Value>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f60758c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map.Entry<i, Value> invoke(Map.Entry<String, Value> $receiver) {
            p013kotlin.jvm.internal.s.k($receiver, "$this$$receiver");
            return new p(b0.a($receiver.getKey()), $receiver.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Value", "Ldl0/i;", "", "a", "(Ldl0/i;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<i, String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f60759c = new c();

        c() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(i $receiver) {
            p013kotlin.jvm.internal.s.k($receiver, "$this$$receiver");
            return $receiver.getContent();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Value", "", "Ldl0/i;", "a", "(Ljava/lang/String;)Ldl0/i;"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.l<String, i> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f60760c = new d();

        d() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i invoke(String $receiver) {
            p013kotlin.jvm.internal.s.k($receiver, "$this$$receiver");
            return b0.a($receiver);
        }
    }

    public boolean b(String key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        return this.delegate.containsKey(new i(key));
    }

    @Override // java.util.Map
    public void clear() {
        this.delegate.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return b((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        if (value == null) {
            return false;
        }
        return this.delegate.containsValue(value);
    }

    public Value d(String key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        return this.delegate.get(b0.a(key));
    }

    public Set<Map.Entry<String, Value>> e() {
        return new o(this.delegate.entrySet(), a.f60757c, b.f60758c);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Value>> entrySet() {
        return e();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        if (other == null || !(other instanceof h)) {
            return false;
        }
        return p013kotlin.jvm.internal.s.f(((h) other).delegate, this.delegate);
    }

    @Override // java.util.Map
    public final /* bridge */ Value get(Object obj) {
        if (obj instanceof String) {
            return d((String) obj);
        }
        return null;
    }

    public Set<String> h() {
        return new o(this.delegate.keySet(), c.f60759c, d.f60760c);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.delegate.hashCode();
    }

    public int i() {
        return this.delegate.size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    public Collection<Value> j() {
        return this.delegate.values();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Value put(String key, Value value) {
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(value, "value");
        return this.delegate.put(b0.a(key), value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return h();
    }

    public Value l(String key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        return this.delegate.remove(b0.a(key));
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends Value> from) {
        p013kotlin.jvm.internal.s.k(from, "from");
        for (Map.Entry<? extends String, ? extends Value> entry : from.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Value remove(Object obj) {
        if (obj instanceof String) {
            return l((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Value> values() {
        return j();
    }
}
