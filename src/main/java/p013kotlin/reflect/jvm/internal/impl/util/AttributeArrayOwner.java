package p013kotlin.reflect.jvm.internal.impl.util;

import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AttributeArrayOwner<K, T> extends AbstractArrayMapOwner<K, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayMap<T> f89054a;

    protected AttributeArrayOwner(ArrayMap<T> arrayMap) {
        s.k(arrayMap, "arrayMap");
        this.f89054a = arrayMap;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    protected final ArrayMap<T> b() {
        return this.f89054a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p013kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    protected final void h(String keyQualifiedName, T value) {
        s.k(keyQualifiedName, "keyQualifiedName");
        s.k(value, "value");
        int id2 = d().getId(keyQualifiedName);
        int size = this.f89054a.getSize();
        if (size == 0) {
            this.f89054a = new OneElementArrayMap(value, id2);
            return;
        }
        if (size == 1) {
            ArrayMap<T> arrayMap = this.f89054a;
            s.i(arrayMap, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
            OneElementArrayMap oneElementArrayMap = (OneElementArrayMap) arrayMap;
            if (oneElementArrayMap.getIndex() == id2) {
                this.f89054a = new OneElementArrayMap(value, id2);
                return;
            } else {
                ArrayMapImpl arrayMapImpl = new ArrayMapImpl();
                this.f89054a = arrayMapImpl;
                arrayMapImpl.set(oneElementArrayMap.getIndex(), oneElementArrayMap.getValue());
            }
        }
        this.f89054a.set(id2, value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AttributeArrayOwner() {
        EmptyArrayMap emptyArrayMap = EmptyArrayMap.INSTANCE;
        s.i(emptyArrayMap, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(emptyArrayMap);
    }
}
