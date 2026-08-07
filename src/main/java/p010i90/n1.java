package p010i90;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.List;
import java.util.Map;
import jn0.x;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n90.FormFieldEntry;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import r90.g;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b0\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\tH\u0016¢\u0006\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Li90/n1;", "Li90/j1;", "Li90/g0;", "identifier", "<init>", "(Li90/g0;)V", "Li90/l1;", "h", "()Li90/l1;", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlin/Pair;", "Ln90/a;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "", "", "rawValuesMap", "Ljn0/h0;", "g", "(Ljava/util/Map;)V", "e", "a", "Li90/g0;", "()Li90/g0;", "Li90/h0;", IntegerTokenConverter.CONVERTER_KEY, "()Li90/h0;", "controller", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class n1 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IdentifierSpec identifier;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln90/a;", "formFieldEntry", "", "Lkotlin/Pair;", "Li90/g0;", "a", "(Ln90/a;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<FormFieldEntry, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> {
        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Pair<IdentifierSpec, FormFieldEntry>> invoke(FormFieldEntry formFieldEntry) {
            s.k(formFieldEntry, "formFieldEntry");
            return v.e(x.a(n1.this.getIdentifier(), formFieldEntry));
        }
    }

    public n1(IdentifierSpec identifier) {
        s.k(identifier, "identifier");
        this.identifier = identifier;
    }

    @Override // p010i90.j1
    /* JADX INFO: renamed from: a, reason: from getter */
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // p010i90.j1
    public StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> c() {
        return g.m(i().m(), new a());
    }

    @Override // p010i90.j1
    public StateFlow<List<IdentifierSpec>> e() {
        List listE = v.e(getIdentifier());
        if (!(i() instanceof v1)) {
            listE = null;
        }
        if (listE == null) {
            listE = v.m();
        }
        return StateFlowKt.MutableStateFlow(listE);
    }

    @Override // p010i90.j1
    public boolean f() {
        return j1.a.a(this);
    }

    @Override // p010i90.j1
    public void g(Map<IdentifierSpec, String> rawValuesMap) {
        s.k(rawValuesMap, "rawValuesMap");
        String str = rawValuesMap.get(getIdentifier());
        if (str != null) {
            i().t(str);
        }
    }

    @Override // p010i90.j1
    public l1 h() {
        return i();
    }

    public abstract h0 i();
}
