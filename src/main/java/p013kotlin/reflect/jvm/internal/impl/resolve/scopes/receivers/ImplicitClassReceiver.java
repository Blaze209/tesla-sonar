package p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes9.dex */
public class ImplicitClassReceiver implements ImplicitReceiver, ThisClassReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassDescriptor f88556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImplicitClassReceiver f88557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ClassDescriptor f88558c;

    public ImplicitClassReceiver(ClassDescriptor classDescriptor, ImplicitClassReceiver implicitClassReceiver) {
        s.k(classDescriptor, "classDescriptor");
        this.f88556a = classDescriptor;
        this.f88557b = implicitClassReceiver == null ? this : implicitClassReceiver;
        this.f88558c = classDescriptor;
    }

    public boolean equals(Object obj) {
        ClassDescriptor classDescriptor = this.f88556a;
        ImplicitClassReceiver implicitClassReceiver = obj instanceof ImplicitClassReceiver ? (ImplicitClassReceiver) obj : null;
        return s.f(classDescriptor, implicitClassReceiver != null ? implicitClassReceiver.f88556a : null);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver
    public final ClassDescriptor getClassDescriptor() {
        return this.f88556a;
    }

    public int hashCode() {
        return this.f88556a.hashCode();
    }

    public String toString() {
        return "Class{" + getType() + CoreConstants.CURLY_RIGHT;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    public SimpleType getType() {
        SimpleType defaultType = this.f88556a.getDefaultType();
        s.j(defaultType, "getDefaultType(...)");
        return defaultType;
    }
}
