package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public final class ReflectKotlinClass implements KotlinJvmBinaryClass {
    public static final Factory Factory = new Factory(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f86992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final KotlinClassHeader f86993b;

    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReflectKotlinClass create(Class<?> klass) {
            s.k(klass, "klass");
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = new ReadKotlinClassHeaderAnnotationVisitor();
            a.f87000a.b(klass, readKotlinClassHeaderAnnotationVisitor);
            KotlinClassHeader kotlinClassHeaderCreateHeaderWithDefaultMetadataVersion = readKotlinClassHeaderAnnotationVisitor.createHeaderWithDefaultMetadataVersion();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (kotlinClassHeaderCreateHeaderWithDefaultMetadataVersion == null) {
                return null;
            }
            return new ReflectKotlinClass(klass, kotlinClassHeaderCreateHeaderWithDefaultMetadataVersion, defaultConstructorMarker);
        }

        private Factory() {
        }
    }

    public /* synthetic */ ReflectKotlinClass(Class cls, KotlinClassHeader kotlinClassHeader, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, kotlinClassHeader);
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectKotlinClass) && s.f(this.f86992a, ((ReflectKotlinClass) obj).f86992a);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public KotlinClassHeader getClassHeader() {
        return this.f86993b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public ClassId getClassId() {
        return ReflectClassUtilKt.getClassId(this.f86992a);
    }

    public final Class<?> getKlass() {
        return this.f86992a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public String getLocation() {
        StringBuilder sb2 = new StringBuilder();
        String name = this.f86992a.getName();
        s.j(name, "getName(...)");
        sb2.append(t.U(name, CoreConstants.DOT, '/', false, 4, null));
        sb2.append(".class");
        return sb2.toString();
    }

    public int hashCode() {
        return this.f86992a.hashCode();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public void loadClassAnnotations(KotlinJvmBinaryClass.AnnotationVisitor visitor, byte[] bArr) {
        s.k(visitor, "visitor");
        a.f87000a.b(this.f86992a, visitor);
    }

    public String toString() {
        return ReflectKotlinClass.class.getName() + ": " + this.f86992a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public void visitMembers(KotlinJvmBinaryClass.MemberVisitor visitor, byte[] bArr) {
        s.k(visitor, "visitor");
        a.f87000a.i(this.f86992a, visitor);
    }

    private ReflectKotlinClass(Class<?> cls, KotlinClassHeader kotlinClassHeader) {
        this.f86992a = cls;
        this.f86993b = kotlinClassHeader;
    }
}
