package a30;

import java.util.ArrayList;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B%\b\u0002\u0012\u001a\u0010\u0005\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\b\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\tJ1\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\b\b\u0000\u0010\u000b*\u00020\n2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0005\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"La30/y;", "La30/e0;", "", "Lco0/d;", "La30/c0;", "bindings", "<init>", "(Ljava/util/Map;)V", "", "([La30/c0;)V", "", "RenderingT", "renderingType", "a", "(Lco0/d;)La30/c0;", "b", "Ljava/util/Map;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class y implements e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<co0.d<?>, c0<?>> bindings;

    /* JADX WARN: Multi-variable type inference failed */
    private y(Map<co0.d<?>, ? extends c0<?>> map) {
        this.bindings = map;
    }

    @Override // a30.e0
    public <RenderingT> c0<RenderingT> a(co0.d<? extends RenderingT> renderingType) {
        p013kotlin.jvm.internal.s.k(renderingType, "renderingType");
        Object obj = this.bindings.get(renderingType);
        if (obj instanceof c0) {
            return (c0) obj;
        }
        return null;
    }

    public y(c0<?>... bindings) {
        p013kotlin.jvm.internal.s.k(bindings, "bindings");
        ArrayList arrayList = new ArrayList(bindings.length);
        int length = bindings.length;
        int i11 = 0;
        int i12 = 0;
        while (i12 < length) {
            c0<?> c0Var = bindings[i12];
            i12++;
            arrayList.add(jn0.x.a(c0Var.getType(), c0Var));
        }
        Map mapY = v0.y(arrayList);
        if (mapY.keySet().size() == bindings.length) {
            this((Map<co0.d<?>, ? extends c0<?>>) mapY);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList(bindings.length);
        int length2 = bindings.length;
        while (i11 < length2) {
            c0<?> c0Var2 = bindings[i11];
            i11++;
            arrayList2.add(c0Var2.getType());
        }
        sb2.append(arrayList2);
        sb2.append(" must not have duplicate entries.");
        throw new IllegalStateException(sb2.toString().toString());
    }
}
