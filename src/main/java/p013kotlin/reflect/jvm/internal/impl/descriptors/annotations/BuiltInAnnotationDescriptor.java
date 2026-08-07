package p013kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import jn0.m;
import jn0.p;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes9.dex */
public final class BuiltInAnnotationDescriptor implements AnnotationDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KotlinBuiltIns f86738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FqName f86739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Name, ConstantValue<?>> f86740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f86741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f86742e;

    /* JADX WARN: Multi-variable type inference failed */
    public BuiltInAnnotationDescriptor(KotlinBuiltIns builtIns, FqName fqName, Map<Name, ? extends ConstantValue<?>> allValueArguments, boolean z11) {
        s.k(builtIns, "builtIns");
        s.k(fqName, "fqName");
        s.k(allValueArguments, "allValueArguments");
        this.f86738a = builtIns;
        this.f86739b = fqName;
        this.f86740c = allValueArguments;
        this.f86741d = z11;
        this.f86742e = m.a(p.PUBLICATION, new b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType b(BuiltInAnnotationDescriptor builtInAnnotationDescriptor) {
        return builtInAnnotationDescriptor.f86738a.getBuiltInClassByFqName(builtInAnnotationDescriptor.getFqName()).getDefaultType();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return this.f86740c;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public FqName getFqName() {
        return this.f86739b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SourceElement getSource() {
        SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
        s.j(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public KotlinType getType() {
        Object value = this.f86742e.getValue();
        s.j(value, "getValue(...)");
        return (KotlinType) value;
    }

    public /* synthetic */ BuiltInAnnotationDescriptor(KotlinBuiltIns kotlinBuiltIns, FqName fqName, Map map, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinBuiltIns, fqName, map, (i11 & 8) != 0 ? false : z11);
    }
}
