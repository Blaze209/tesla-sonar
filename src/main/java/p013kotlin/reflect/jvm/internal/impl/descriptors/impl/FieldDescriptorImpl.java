package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: loaded from: classes9.dex */
public final class FieldDescriptorImpl extends AnnotatedImpl implements FieldDescriptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PropertyDescriptor f86820b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldDescriptorImpl(Annotations annotations, PropertyDescriptor correspondingProperty) {
        super(annotations);
        s.k(annotations, "annotations");
        s.k(correspondingProperty, "correspondingProperty");
        this.f86820b = correspondingProperty;
    }
}
