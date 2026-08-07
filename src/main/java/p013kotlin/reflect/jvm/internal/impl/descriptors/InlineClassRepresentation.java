package p013kotlin.reflect.jvm.internal.impl.descriptors;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class InlineClassRepresentation<Type extends SimpleTypeMarker> extends ValueClassRepresentation<Type> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Name f86695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f86696b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineClassRepresentation(Name underlyingPropertyName, Type underlyingType) {
        super(null);
        s.k(underlyingPropertyName, "underlyingPropertyName");
        s.k(underlyingType, "underlyingType");
        this.f86695a = underlyingPropertyName;
        this.f86696b = underlyingType;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    public boolean containsPropertyWithName(Name name) {
        s.k(name, "name");
        return s.f(this.f86695a, name);
    }

    public final Name getUnderlyingPropertyName() {
        return this.f86695a;
    }

    public final Type getUnderlyingType() {
        return this.f86696b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f86695a + ", underlyingType=" + this.f86696b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
