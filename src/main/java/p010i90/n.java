package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import jn0.x;
import kotlinx.coroutines.flow.StateFlow;
import n90.FormFieldEntry;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import r90.g;
import wn0.l;
import x30.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, d2 = {"Li90/n;", "Li90/d0;", "Li90/g0;", "identifier", "Li90/m;", "controller", "<init>", "(Li90/g0;Li90/m;)V", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlin/Pair;", "Ln90/a;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "a", "Li90/g0;", "()Li90/g0;", "b", "Li90/m;", "f", "()Li90/m;", "", "Z", "()Z", "allowsUserInteraction", "Lx30/c;", DateTokenConverter.CONVERTER_KEY, "Lx30/c;", "()Lx30/c;", "mandateText", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class n implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IdentifierSpec identifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m controller;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean allowsUserInteraction;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c mandateText;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "isChecked", "", "Lkotlin/Pair;", "Li90/g0;", "Ln90/a;", "a", "(Z)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<Boolean, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> {
        a() {
            super(1);
        }

        public final List<Pair<IdentifierSpec, FormFieldEntry>> a(boolean z11) {
            return v.e(x.a(n.this.getIdentifier(), new FormFieldEntry(String.valueOf(z11), z11)));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    public n(IdentifierSpec identifier, m controller) {
        s.k(identifier, "identifier");
        s.k(controller, "controller");
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
        return g.m(getController().x(), new a());
    }

    @Override // p010i90.d0
    /* JADX INFO: renamed from: d, reason: from getter */
    public c getMandateText() {
        return this.mandateText;
    }

    @Override // p010i90.d0
    public StateFlow<List<IdentifierSpec>> e() {
        return d0.a.a(this);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public m getController() {
        return this.controller;
    }
}
