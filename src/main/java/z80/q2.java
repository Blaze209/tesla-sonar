package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lz80/q2;", "Li90/n1;", "Li90/h0;", "controller", "<init>", "(Li90/h0;)V", "b", "Li90/h0;", IntegerTokenConverter.CONVERTER_KEY, "()Li90/h0;", "", "c", "Z", "()Z", "allowsUserInteraction", "Lx30/c;", DateTokenConverter.CONVERTER_KEY, "Lx30/c;", "()Lx30/c;", "mandateText", "Li90/g0;", "e", "Li90/g0;", "a", "()Li90/g0;", "identifier", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class q2 extends p010i90.n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p010i90.h0 controller;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean allowsUserInteraction;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final x30.c mandateText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final IdentifierSpec identifier;

    public /* synthetic */ q2(p010i90.h0 h0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new p010i90.r1(new p2(), false, null, 6, null) : h0Var);
    }

    @Override // p010i90.n1, p010i90.j1
    /* JADX INFO: renamed from: a, reason: from getter */
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // p010i90.j1
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getAllowsUserInteraction() {
        return this.allowsUserInteraction;
    }

    @Override // p010i90.j1
    /* JADX INFO: renamed from: d, reason: from getter */
    public x30.c getMandateText() {
        return this.mandateText;
    }

    @Override // p010i90.n1
    /* JADX INFO: renamed from: i, reason: from getter */
    public p010i90.h0 getController() {
        return this.controller;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q2(p010i90.h0 controller) {
        p013kotlin.jvm.internal.s.k(controller, "controller");
        IdentifierSpec.Companion companion = IdentifierSpec.INSTANCE;
        super(companion.A());
        this.controller = controller;
        this.allowsUserInteraction = true;
        this.identifier = companion.A();
    }
}
