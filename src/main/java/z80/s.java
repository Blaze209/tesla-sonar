package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import n90.FormFieldEntry;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000e\u0010\u0018R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001f"}, d2 = {"Lz80/s;", "Li90/n1;", "Li90/g0;", "identifier", "Li90/h0;", "controller", "<init>", "(Li90/g0;Li90/h0;)V", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlin/Pair;", "Ln90/a;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "b", "Li90/g0;", "a", "()Li90/g0;", "Li90/h0;", IntegerTokenConverter.CONVERTER_KEY, "()Li90/h0;", "", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "allowsUserInteraction", "Lx30/c;", "e", "Lx30/c;", "()Lx30/c;", "mandateText", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class s extends p010i90.n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final IdentifierSpec identifier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p010i90.h0 controller;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean allowsUserInteraction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final x30.c mandateText;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln90/a;", "entry", "", "Lkotlin/Pair;", "Li90/g0;", "a", "(Ln90/a;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<FormFieldEntry, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> {
        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Pair<IdentifierSpec, FormFieldEntry>> invoke(FormFieldEntry entry) {
            p013kotlin.jvm.internal.s.k(entry, "entry");
            return p013kotlin.collections.v.e(jn0.x.a(s.this.getIdentifier(), entry));
        }
    }

    public /* synthetic */ s(IdentifierSpec identifierSpec, p010i90.h0 h0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? IdentifierSpec.INSTANCE.e() : identifierSpec, (i11 & 2) != 0 ? new p010i90.r1(new r(), false, null, 6, null) : h0Var);
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

    @Override // p010i90.n1, p010i90.j1
    public StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> c() {
        return r90.g.m(getController().m(), new a());
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(IdentifierSpec identifier, p010i90.h0 controller) {
        super(identifier);
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        p013kotlin.jvm.internal.s.k(controller, "controller");
        this.identifier = identifier;
        this.controller = controller;
        this.allowsUserInteraction = true;
    }
}
