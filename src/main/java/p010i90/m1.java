package p010i90;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Li90/m1;", "Li90/j1;", "Li90/g0;", "identifier", "<init>", "(Li90/g0;)V", "a", "Li90/g0;", "()Li90/g0;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class m1 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IdentifierSpec identifier;

    public m1(IdentifierSpec identifier) {
        s.k(identifier, "identifier");
        this.identifier = identifier;
    }

    @Override // p010i90.j1
    /* JADX INFO: renamed from: a, reason: from getter */
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // p010i90.j1
    public boolean f() {
        return j1.a.a(this);
    }
}
