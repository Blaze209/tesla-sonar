package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import n90.FormFieldEntry;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.Pair;

/* JADX INFO: renamed from: z80.b2, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\t0\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u001a\u0010\u001f\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010$\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001a\u0010*\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010-\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b\u0018\u0010,¨\u0006."}, d2 = {"Lz80/b2;", "Li90/d0;", "", "initialValue", "", "merchantName", "<init>", "(ZLjava/lang/String;)V", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlin/Pair;", "Li90/g0;", "Ln90/a;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getInitialValue", "()Z", "b", "Ljava/lang/String;", "g", "allowsUserInteraction", "Lx30/c;", DateTokenConverter.CONVERTER_KEY, "Lx30/c;", "()Lx30/c;", "mandateText", "Lz80/a2;", "e", "Lz80/a2;", "f", "()Lz80/a2;", "controller", "Li90/g0;", "()Li90/g0;", "identifier", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SaveForFutureUseElement implements p010i90.d0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f127366g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean initialValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String merchantName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final x30.c mandateText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a2 controller;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean allowsUserInteraction = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final IdentifierSpec identifier = IdentifierSpec.INSTANCE.x();

    /* JADX INFO: renamed from: z80.b2$a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln90/a;", "it", "", "Lkotlin/Pair;", "Li90/g0;", "a", "(Ln90/a;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<FormFieldEntry, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> {
        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Pair<IdentifierSpec, FormFieldEntry>> invoke(FormFieldEntry it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return p013kotlin.collections.v.e(jn0.x.a(SaveForFutureUseElement.this.getIdentifier(), it));
        }
    }

    public SaveForFutureUseElement(boolean z11, String str) {
        this.initialValue = z11;
        this.merchantName = str;
        this.controller = new a2(z11);
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
        return r90.g.m(getController().m(), new a());
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
        if (!(other instanceof SaveForFutureUseElement)) {
            return false;
        }
        SaveForFutureUseElement saveForFutureUseElement = (SaveForFutureUseElement) other;
        return this.initialValue == saveForFutureUseElement.initialValue && p013kotlin.jvm.internal.s.f(this.merchantName, saveForFutureUseElement.merchantName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public a2 getController() {
        return this.controller;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.initialValue) * 31;
        String str = this.merchantName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SaveForFutureUseElement(initialValue=" + this.initialValue + ", merchantName=" + this.merchantName + ")";
    }
}
