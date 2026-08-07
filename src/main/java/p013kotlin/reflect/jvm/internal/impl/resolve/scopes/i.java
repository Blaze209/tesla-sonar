package p013kotlin.reflect.jvm.internal.impl.resolve.scopes;

import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f88547a = new i();

    @Override // wn0.l
    public Object invoke(Object obj) {
        return TypeIntersectionScope.g((PropertyDescriptor) obj);
    }
}
