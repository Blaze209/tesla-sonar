package p013kotlin.reflect.jvm.internal.impl.descriptors;

import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DelegatedDescriptorVisibility extends DescriptorVisibility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Visibility f86689a;

    public DelegatedDescriptorVisibility(Visibility delegate) {
        s.k(delegate, "delegate");
        this.f86689a = delegate;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public Visibility getDelegate() {
        return this.f86689a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public String getInternalDisplayName() {
        return getDelegate().getInternalDisplayName();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    public DescriptorVisibility normalize() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.toDescriptorVisibility(getDelegate().normalize());
        s.j(descriptorVisibility, "toDescriptorVisibility(...)");
        return descriptorVisibility;
    }
}
