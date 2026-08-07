package nz;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public abstract class x extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<jz.h> f95518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set<jz.d> f95519e = l.f95505a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(jz.h.f84467d);
        linkedHashSet.add(jz.h.f84468e);
        linkedHashSet.add(jz.h.f84469f);
        linkedHashSet.add(jz.h.f84470g);
        linkedHashSet.add(jz.h.f84471h);
        f95518d = Collections.unmodifiableSet(linkedHashSet);
    }

    protected x() {
        super(f95518d, l.f95505a);
    }

    @Override // nz.g, jz.n
    public /* bridge */ /* synthetic */ Set b() {
        return super.b();
    }

    @Override // nz.g, jz.n
    public /* bridge */ /* synthetic */ Set c() {
        return super.c();
    }

    @Override // nz.g
    public /* bridge */ /* synthetic */ pz.c g() {
        return super.g();
    }
}
