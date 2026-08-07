package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import n90.FormFieldEntry;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z80.s1, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u00100\u00060\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00100\u001a\u00020\u001a8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010.\u001a\u0004\b \u0010/R\u001a\u00104\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u00102\u001a\u0004\b&\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Lz80/s1;", "Li90/d0;", "Li90/g0;", "identifier", "", "stringResId", "", "", "args", "Lw4/h;", "topPadding", "Li90/h0;", "controller", "<init>", "(Li90/g0;ILjava/util/List;FLi90/h0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlin/Pair;", "Ln90/a;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li90/g0;", "()Li90/g0;", "b", "I", "g", "Ljava/util/List;", "f", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "h", "()F", "e", "Li90/h0;", "getController", "()Li90/h0;", "Z", "()Z", "allowsUserInteraction", "Lx30/c;", "Lx30/c;", "()Lx30/c;", "mandateText", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MandateTextElement implements p010i90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentifierSpec identifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int stringResId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> args;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float topPadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final p010i90.h0 controller;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean allowsUserInteraction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final x30.c mandateText;

    public /* synthetic */ MandateTextElement(IdentifierSpec identifierSpec, int i11, List list, float f11, p010i90.h0 h0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, i11, list, f11, h0Var);
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
        if (!(other instanceof MandateTextElement)) {
            return false;
        }
        MandateTextElement mandateTextElement = (MandateTextElement) other;
        return p013kotlin.jvm.internal.s.f(this.identifier, mandateTextElement.identifier) && this.stringResId == mandateTextElement.stringResId && p013kotlin.jvm.internal.s.f(this.args, mandateTextElement.args) && w4.h.i(this.topPadding, mandateTextElement.topPadding) && p013kotlin.jvm.internal.s.f(this.controller, mandateTextElement.controller);
    }

    public final List<String> f() {
        return this.args;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getStringResId() {
        return this.stringResId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getTopPadding() {
        return this.topPadding;
    }

    public int hashCode() {
        int iHashCode = ((((((this.identifier.hashCode() * 31) + Integer.hashCode(this.stringResId)) * 31) + this.args.hashCode()) * 31) + w4.h.j(this.topPadding)) * 31;
        p010i90.h0 h0Var = this.controller;
        return iHashCode + (h0Var == null ? 0 : h0Var.hashCode());
    }

    public String toString() {
        return "MandateTextElement(identifier=" + this.identifier + ", stringResId=" + this.stringResId + ", args=" + this.args + ", topPadding=" + w4.h.k(this.topPadding) + ", controller=" + this.controller + ")";
    }

    private MandateTextElement(IdentifierSpec identifier, int i11, List<String> args, float f11, p010i90.h0 h0Var) {
        p013kotlin.jvm.internal.s.k(identifier, "identifier");
        p013kotlin.jvm.internal.s.k(args, "args");
        this.identifier = identifier;
        this.stringResId = i11;
        this.args = args;
        this.topPadding = f11;
        this.controller = h0Var;
        String[] strArr = (String[]) args.toArray(new String[0]);
        this.mandateText = x30.d.g(i11, Arrays.copyOf(strArr, strArr.length), null, 4, null);
    }

    public /* synthetic */ MandateTextElement(IdentifierSpec identifierSpec, int i11, List list, float f11, p010i90.h0 h0Var, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(identifierSpec, i11, list, (i12 & 8) != 0 ? w4.h.g(8) : f11, (i12 & 16) != 0 ? null : h0Var, null);
    }
}
