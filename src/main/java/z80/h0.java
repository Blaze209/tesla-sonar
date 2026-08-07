package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.StateFlow;
import n90.FormFieldEntry;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u00130\u00120\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00120\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\"R\u001c\u0010'\u001a\u0004\u0018\u00010$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b\u001e\u0010&¨\u0006("}, d2 = {"Lz80/h0;", "Li90/d0;", "Lh30/b$a;", "cardAccountRangeRepositoryFactory", "", "Li90/g0;", "", "initialValues", "", "collectName", "Lx80/a;", "cbcEligibility", "identifier", "Lz80/g0;", "controller", "<init>", "(Lh30/b$a;Ljava/util/Map;ZLx80/a;Li90/g0;Lz80/g0;)V", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlin/Pair;", "Ln90/a;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "e", "a", "Z", "b", "Lx80/a;", "Li90/g0;", "()Li90/g0;", DateTokenConverter.CONVERTER_KEY, "Lz80/g0;", "f", "()Lz80/g0;", "()Z", "allowsUserInteraction", "Lx30/c;", "Lx30/c;", "()Lx30/c;", "mandateText", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h0 implements p010i90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean collectName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x80.a cbcEligibility;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final IdentifierSpec identifier;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g0 controller;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean allowsUserInteraction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final x30.c mandateText;

    public h0(h30.b.a cardAccountRangeRepositoryFactory, Map<IdentifierSpec, String> initialValues, boolean z11, x80.a cbcEligibility, IdentifierSpec identifier, g0 controller) {
        p013kotlin.jvm.internal.s.k(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        p013kotlin.jvm.internal.s.k(initialValues, "initialValues");
        p013kotlin.jvm.internal.s.k(cbcEligibility, "cbcEligibility");
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        p013kotlin.jvm.internal.s.k(controller, "controller");
        this.collectName = z11;
        this.cbcEligibility = cbcEligibility;
        this.identifier = identifier;
        this.controller = controller;
        this.allowsUserInteraction = true;
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
    public StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> c() {
        return getController().getCardDetailsElement().c();
    }

    @Override // p010i90.d0
    /* JADX INFO: renamed from: d, reason: from getter */
    public x30.c getMandateText() {
        return this.mandateText;
    }

    @Override // p010i90.d0
    public StateFlow<List<IdentifierSpec>> e() {
        return getController().getCardDetailsElement().e();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public g0 getController() {
        return this.controller;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ h0(h30.b.a aVar, Map map, boolean z11, x80.a aVar2, IdentifierSpec identifierSpec, g0 g0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z12 = (i11 & 4) != 0 ? false : z11;
        x80.a aVar3 = (i11 & 8) != 0 ? x80.a.c.f123091a : aVar2;
        this(aVar, map, z12, aVar3, identifierSpec, (i11 & 32) != 0 ? new g0(aVar, map, z12, aVar3) : g0Var);
    }
}
