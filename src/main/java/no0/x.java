package no0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lno0/x;", "Object", "Field", "Lno0/b;", "Lco0/k;", "property", "<init>", "(Lco0/k;)V", "container", "newValue", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lco0/k;", "", "getName", "()Ljava/lang/String;", "name", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class x<Object, Field> implements b<Object, Field> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final co0.k<Object, Field> property;

    public x(co0.k<Object, Field> property) {
        p013kotlin.jvm.internal.s.k(property, "property");
        this.property = property;
    }

    @Override // no0.b
    public Field a(Object container) {
        return this.property.get(container);
    }

    @Override // no0.b
    public Field b(Object object) {
        return (Field) b.a.a(this, object);
    }

    @Override // po0.a
    public Field c(Object container, Field newValue) {
        Field field = this.property.get(container);
        if (field == null) {
            this.property.h(container, newValue);
            return null;
        }
        if (p013kotlin.jvm.internal.s.f(field, newValue)) {
            return null;
        }
        return field;
    }

    @Override // po0.a
    public String getName() {
        return this.property.getName();
    }
}
