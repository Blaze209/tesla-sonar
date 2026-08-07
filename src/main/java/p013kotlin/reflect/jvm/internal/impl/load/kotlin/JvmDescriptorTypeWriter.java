package p013kotlin.reflect.jvm.internal.impl.load.kotlin;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public class JvmDescriptorTypeWriter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JvmTypeFactory<T> f87567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f87568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T f87569c;

    protected final void a(T type) {
        s.k(type, "type");
        if (this.f87569c == null) {
            if (this.f87568b > 0) {
                type = this.f87567a.createFromString(t.R("[", this.f87568b) + this.f87567a.toString(type));
            }
            this.f87569c = type;
        }
    }

    public void writeArrayEnd() {
    }

    public void writeArrayType() {
        if (this.f87569c == null) {
            this.f87568b++;
        }
    }

    public void writeClass(T objectType) {
        s.k(objectType, "objectType");
        a(objectType);
    }

    public void writeTypeVariable(Name name, T type) {
        s.k(name, "name");
        s.k(type, "type");
        a(type);
    }
}
