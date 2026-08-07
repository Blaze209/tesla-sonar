package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import n90.FormFieldEntry;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z80.l2, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f0\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001d\u0010%R\u001c\u0010+\u001a\u0004\u0018\u00010'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b#\u0010*¨\u0006,"}, d2 = {"Lz80/l2;", "Li90/d0;", "Li90/g0;", "identifier", "", "stringResId", "Li90/h0;", "controller", "<init>", "(Li90/g0;ILi90/h0;)V", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlin/Pair;", "Ln90/a;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li90/g0;", "()Li90/g0;", "b", "I", "f", "Li90/h0;", "getController", "()Li90/h0;", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "allowsUserInteraction", "Lx30/c;", "e", "Lx30/c;", "()Lx30/c;", "mandateText", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StaticTextElement implements p010i90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentifierSpec identifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int stringResId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final p010i90.h0 controller;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean allowsUserInteraction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final x30.c mandateText;

    public StaticTextElement(IdentifierSpec identifier, int i11, p010i90.h0 h0Var) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        this.identifier = identifier;
        this.stringResId = i11;
        this.controller = h0Var;
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
        return r90.g.n(p013kotlin.collections.v.m());
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

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StaticTextElement)) {
            return false;
        }
        StaticTextElement staticTextElement = (StaticTextElement) other;
        return p013kotlin.jvm.internal.s.f(this.identifier, staticTextElement.identifier) && this.stringResId == staticTextElement.stringResId && p013kotlin.jvm.internal.s.f(this.controller, staticTextElement.controller);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getStringResId() {
        return this.stringResId;
    }

    public int hashCode() {
        int iHashCode = ((this.identifier.hashCode() * 31) + Integer.hashCode(this.stringResId)) * 31;
        p010i90.h0 h0Var = this.controller;
        return iHashCode + (h0Var == null ? 0 : h0Var.hashCode());
    }

    public String toString() {
        return "StaticTextElement(identifier=" + this.identifier + ", stringResId=" + this.stringResId + ", controller=" + this.controller + ")";
    }

    public /* synthetic */ StaticTextElement(IdentifierSpec identifierSpec, int i11, p010i90.h0 h0Var, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, i11, (i12 & 4) != 0 ? null : h0Var);
    }
}
