package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lz80/z1;", "Li90/d0;", "Li90/g0;", "identifier", "", "allowsUserInteraction", "<init>", "(Li90/g0;Z)V", "enabled", "Ljn0/h0;", "f", "(ZLr2/l;I)V", "a", "Li90/g0;", "()Li90/g0;", "b", "Z", "()Z", "Lx30/c;", "c", "Lx30/c;", DateTokenConverter.CONVERTER_KEY, "()Lx30/c;", "mandateText", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class z1 implements p010i90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IdentifierSpec identifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean allowsUserInteraction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x30.c mandateText;

    public z1(IdentifierSpec identifier, boolean z11) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        this.identifier = identifier;
        this.allowsUserInteraction = z11;
    }

    @Override // p010i90.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // p010i90.d0
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getAllowsUserInteraction() {
        return this.allowsUserInteraction;
    }

    @Override // p010i90.d0
    /* JADX INFO: renamed from: d, reason: from getter */
    public x30.c getMandateText() {
        return this.mandateText;
    }

    @Override // p010i90.d0
    public StateFlow<List<IdentifierSpec>> e() {
        return i90.d0.a.a(this);
    }

    public abstract void f(boolean z11, p020r2.l lVar, int i11);
}
