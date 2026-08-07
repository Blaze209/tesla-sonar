package nz;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class z extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<jz.o> f95520c;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(jz.o.f84538g);
        linkedHashSet.add(jz.o.f84539h);
        linkedHashSet.add(jz.o.f84540i);
        linkedHashSet.add(jz.o.f84545n);
        linkedHashSet.add(jz.o.f84546o);
        linkedHashSet.add(jz.o.f84547p);
        f95520c = Collections.unmodifiableSet(linkedHashSet);
    }

    protected z() {
        super(f95520c);
    }
}
