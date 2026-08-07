package p013kotlin.reflect.jvm.internal.impl.descriptors;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Map;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class MultiFieldValueClassRepresentation<Type extends SimpleTypeMarker> extends ValueClassRepresentation<Type> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Pair<Name, Type>> f86699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Name, Type> f86700b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MultiFieldValueClassRepresentation(List<? extends Pair<Name, ? extends Type>> underlyingPropertyNamesToTypes) {
        super(null);
        s.k(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f86699a = underlyingPropertyNamesToTypes;
        Map<Name, Type> mapY = v0.y(getUnderlyingPropertyNamesToTypes());
        if (mapY.size() != getUnderlyingPropertyNamesToTypes().size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.f86700b = mapY;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    public boolean containsPropertyWithName(Name name) {
        s.k(name, "name");
        return this.f86700b.containsKey(name);
    }

    public List<Pair<Name, Type>> getUnderlyingPropertyNamesToTypes() {
        return this.f86699a;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + getUnderlyingPropertyNamesToTypes() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
