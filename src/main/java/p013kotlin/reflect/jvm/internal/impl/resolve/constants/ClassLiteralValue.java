package p013kotlin.reflect.jvm.internal.impl.resolve.constants;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes9.dex */
public final class ClassLiteralValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassId f88453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f88454b;

    public ClassLiteralValue(ClassId classId, int i11) {
        s.k(classId, "classId");
        this.f88453a = classId;
        this.f88454b = i11;
    }

    public final ClassId component1() {
        return this.f88453a;
    }

    public final int component2() {
        return this.f88454b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassLiteralValue)) {
            return false;
        }
        ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj;
        return s.f(this.f88453a, classLiteralValue.f88453a) && this.f88454b == classLiteralValue.f88454b;
    }

    public final int getArrayNestedness() {
        return this.f88454b;
    }

    public final ClassId getClassId() {
        return this.f88453a;
    }

    public int hashCode() {
        return (this.f88453a.hashCode() * 31) + Integer.hashCode(this.f88454b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i11 = this.f88454b;
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f88453a);
        int i13 = this.f88454b;
        for (int i14 = 0; i14 < i13; i14++) {
            sb2.append(">");
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }
}
