package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ClassDescriptorBase extends AbstractClassDescriptor {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final DeclarationDescriptor f86790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SourceElement f86791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f86792g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected ClassDescriptorBase(StorageManager storageManager, DeclarationDescriptor declarationDescriptor, Name name, SourceElement sourceElement, boolean z11) {
        super(storageManager, name);
        if (storageManager == null) {
            a(0);
        }
        if (declarationDescriptor == null) {
            a(1);
        }
        if (name == null) {
            a(2);
        }
        if (sourceElement == null) {
            a(3);
        }
        this.f86790e = declarationDescriptor;
        this.f86791f = sourceElement;
        this.f86792g = z11;
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 4 || i11 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 4 || i11 == 5) ? 2 : 3];
        if (i11 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i11 == 2) {
            objArr[0] = "name";
        } else if (i11 == 3) {
            objArr[0] = "source";
        } else if (i11 == 4 || i11 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i11 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i11 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i11 != 4 && i11 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i11 != 4 && i11 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        DeclarationDescriptor declarationDescriptor = this.f86790e;
        if (declarationDescriptor == null) {
            a(4);
        }
        return declarationDescriptor;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement getSource() {
        SourceElement sourceElement = this.f86791f;
        if (sourceElement == null) {
            a(5);
        }
        return sourceElement;
    }

    public boolean isExternal() {
        return this.f86792g;
    }
}
