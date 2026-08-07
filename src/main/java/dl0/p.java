package dl0;

import ch.qos.logback.core.joran.action.Action;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00028\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019\"\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Ldl0/p;", "Key", "Value", "", Action.KEY_ATTRIBUTE, "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "b", "getValue", "(Ljava/lang/Object;)V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class p<Key, Value> implements Map.Entry<Key, Value>, xn0.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Key key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Value value;

    public p(Key key, Value value) {
        this.key = key;
        this.value = value;
    }

    public void b(Value value) {
        this.value = value;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object other) {
        if (other != null && (other instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) other;
            if (p013kotlin.jvm.internal.s.f(entry.getKey(), getKey()) && p013kotlin.jvm.internal.s.f(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public Key getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public Value getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Key key = getKey();
        p013kotlin.jvm.internal.s.h(key);
        int iHashCode = key.hashCode() + 527;
        Value value = getValue();
        p013kotlin.jvm.internal.s.h(value);
        return iHashCode + value.hashCode();
    }

    @Override // java.util.Map.Entry
    public Value setValue(Value newValue) {
        b(newValue);
        return getValue();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
