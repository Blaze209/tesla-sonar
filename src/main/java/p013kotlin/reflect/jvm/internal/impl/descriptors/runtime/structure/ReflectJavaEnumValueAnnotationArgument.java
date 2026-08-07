package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes9.dex */
public final class ReflectJavaEnumValueAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaEnumValueAnnotationArgument {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Enum<?> f87038b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaEnumValueAnnotationArgument(Name name, Enum<?> value) {
        super(name, null);
        s.k(value, "value");
        this.f87038b = value;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    public Name getEntryName() {
        return Name.identifier(this.f87038b.name());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    public ClassId getEnumClassId() {
        Class<?> enclosingClass = this.f87038b.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        s.h(enclosingClass);
        return ReflectClassUtilKt.getClassId(enclosingClass);
    }
}
