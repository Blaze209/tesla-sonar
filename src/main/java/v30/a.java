package v30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import expo.modules.contacts.Columns;
import java.lang.Enum;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.o;
import to0.e;
import to0.f;
import to0.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\b'\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00028\u00000\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001e\u0010!\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00028\u00000\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010 ¨\u0006\""}, d2 = {"Lv30/a;", "", "T", "Lro0/d;", "", "values", "defaultValue", "<init>", "([Ljava/lang/Enum;Ljava/lang/Enum;)V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "c", "(Luo0/f;Ljava/lang/Enum;)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)Ljava/lang/Enum;", "Ljava/lang/Enum;", "Lto0/f;", "b", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "", "", "Ljava/util/Map;", Columns.LOOKUP_KEY, DateTokenConverter.CONVERTER_KEY, "revLookup", "(Ljava/lang/Enum;)Ljava/lang/String;", "serialName", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class a<T extends Enum<T>> implements d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T defaultValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f descriptor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<T, String> lookup;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, T> revLookup;

    /* JADX WARN: Multi-variable type inference failed */
    public a(T[] values, T defaultValue) {
        s.k(values, "values");
        s.k(defaultValue, "defaultValue");
        this.defaultValue = defaultValue;
        String strC = o0.b(n.k0(values).getClass()).c();
        s.h(strC);
        this.descriptor = m.c(strC, e.i.f114883a);
        LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(v0.e(values.length), 16));
        for (T t11 : values) {
            linkedHashMap.put(t11, b(t11));
        }
        this.lookup = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(bo0.n.f(v0.e(values.length), 16));
        for (T t12 : values) {
            linkedHashMap2.put(b(t12), t12);
        }
        this.revLookup = linkedHashMap2;
    }

    private final String b(Enum<T> r11) {
        String strValue;
        o oVar = (o) r11.getClass().getField(r11.name()).getAnnotation(o.class);
        return (oVar == null || (strValue = oVar.value()) == null) ? r11.name() : strValue;
    }

    @Override // ro0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T deserialize(uo0.e decoder) {
        s.k(decoder, "decoder");
        T t11 = this.revLookup.get(decoder.r());
        return t11 == null ? this.defaultValue : t11;
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, T value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        encoder.q((String) v0.j(this.lookup, value));
    }

    @Override // ro0.d, ro0.q, ro0.c
    public f getDescriptor() {
        return this.descriptor;
    }
}
