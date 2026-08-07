package ce;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"Lce/u;", "", "T", "Lkotlin/properties/d;", "Lce/t;", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;)V", "thisRef", "Lco0/m;", "property", "a", "(Lce/t;Lco0/m;)Ljava/lang/Object;", "value", "Ljn0/h0;", "b", "(Lce/t;Lco0/m;Ljava/lang/Object;)V", "Ljava/lang/String;", "Ljava/lang/Object;", "backingProperty", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class u<T> implements p013kotlin.properties.d<t, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private T backingProperty;

    public u(String key) {
        p013kotlin.jvm.internal.s.k(key, "key");
        this.key = key;
    }

    @Override // p013kotlin.properties.d, p013kotlin.properties.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T getValue(t thisRef, co0.m<?> property) {
        p013kotlin.jvm.internal.s.k(thisRef, "thisRef");
        p013kotlin.jvm.internal.s.k(property, "property");
        if (this.backingProperty == null) {
            this.backingProperty = (T) thisRef.k().f(this.key);
        }
        return this.backingProperty;
    }

    @Override // p013kotlin.properties.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void setValue(t thisRef, co0.m<?> property, T value) {
        p013kotlin.jvm.internal.s.k(thisRef, "thisRef");
        p013kotlin.jvm.internal.s.k(property, "property");
        thisRef.k().n(this.key, value);
        this.backingProperty = value;
    }
}
