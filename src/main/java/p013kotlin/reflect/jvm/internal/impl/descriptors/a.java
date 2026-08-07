package p013kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes9.dex */
final class a implements TypeParameterDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeParameterDescriptor f86723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DeclarationDescriptor f86724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f86725c;

    public a(TypeParameterDescriptor originalDescriptor, DeclarationDescriptor declarationDescriptor, int i11) {
        s.k(originalDescriptor, "originalDescriptor");
        s.k(declarationDescriptor, "declarationDescriptor");
        this.f86723a = originalDescriptor;
        this.f86724b = declarationDescriptor;
        this.f86725c = i11;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d11) {
        return (R) this.f86723a.accept(declarationDescriptorVisitor, d11);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.f86723a.getAnnotations();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        return this.f86724b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public SimpleType getDefaultType() {
        SimpleType defaultType = this.f86723a.getDefaultType();
        s.j(defaultType, "getDefaultType(...)");
        return defaultType;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public int getIndex() {
        return this.f86725c + this.f86723a.getIndex();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.Named
    public Name getName() {
        Name name = this.f86723a.getName();
        s.j(name, "getName(...)");
        return name;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement getSource() {
        SourceElement source = this.f86723a.getSource();
        s.j(source, "getSource(...)");
        return source;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public StorageManager getStorageManager() {
        StorageManager storageManager = this.f86723a.getStorageManager();
        s.j(storageManager, "getStorageManager(...)");
        return storageManager;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor = this.f86723a.getTypeConstructor();
        s.j(typeConstructor, "getTypeConstructor(...)");
        return typeConstructor;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public List<KotlinType> getUpperBounds() {
        List<KotlinType> upperBounds = this.f86723a.getUpperBounds();
        s.j(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public Variance getVariance() {
        Variance variance = this.f86723a.getVariance();
        s.j(variance, "getVariance(...)");
        return variance;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isCapturedFromOuterDeclaration() {
        return true;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isReified() {
        return this.f86723a.isReified();
    }

    public String toString() {
        return this.f86723a + "[inner-copy]";
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public TypeParameterDescriptor getOriginal() {
        TypeParameterDescriptor original = this.f86723a.getOriginal();
        s.j(original, "getOriginal(...)");
        return original;
    }
}
