package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import n90.FormFieldEntry;
import p010i90.IdentifierSpec;
import p010i90.SimpleTextElement;
import p013kotlin.Metadata;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f0\u00040\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000fR\u0014\u0010(\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010'¨\u0006)"}, d2 = {"Lz80/v;", "Li90/d0;", "Li90/g0;", "identifierSpec", "", "Lcom/stripe/android/view/q$a;", "banks", "", "initialValue", "<init>", "(Li90/g0;Ljava/util/List;Ljava/lang/String;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlin/Pair;", "Ln90/a;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "a", "Li90/g0;", "b", "Ljava/util/List;", "", "Z", "()Z", "allowsUserInteraction", "Lx30/c;", DateTokenConverter.CONVERTER_KEY, "Lx30/c;", "()Lx30/c;", "mandateText", "Li90/p1;", "e", "Li90/p1;", "h", "()Li90/p1;", "textElement", "f", "Lkotlinx/coroutines/flow/StateFlow;", "g", "bankName", "()Li90/g0;", "identifier", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class v implements p010i90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IdentifierSpec identifierSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<com.stripe.android.view.q.Bank> banks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean allowsUserInteraction;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final x30.c mandateText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final SimpleTextElement textElement;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> bankName;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "textFieldValue", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<String, String> {
        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String textFieldValue) {
            p013kotlin.jvm.internal.s.k(textFieldValue, "textFieldValue");
            List list = v.this.banks;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (p013kotlin.text.t.b0(textFieldValue, ((com.stripe.android.view.q.Bank) obj).getPrefix(), false, 2, null)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((com.stripe.android.view.q.Bank) it.next()).getName());
            }
            return (String) p013kotlin.collections.v.q0(arrayList2);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "complete", "", "fieldValue", "", "Lkotlin/Pair;", "Li90/g0;", "Ln90/a;", "a", "(ZLjava/lang/String;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<Boolean, String, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> {
        b() {
            super(2);
        }

        public final List<Pair<IdentifierSpec, FormFieldEntry>> a(boolean z11, String fieldValue) {
            p013kotlin.jvm.internal.s.k(fieldValue, "fieldValue");
            return p013kotlin.collections.v.e(jn0.x.a(v.this.getIdentifier(), new FormFieldEntry(fieldValue, z11)));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> invoke(Boolean bool, String str) {
            return a(bool.booleanValue(), str);
        }
    }

    public v(IdentifierSpec identifierSpec, List<com.stripe.android.view.q.Bank> banks, String str) {
        p013kotlin.jvm.internal.s.k(identifierSpec, "identifierSpec");
        p013kotlin.jvm.internal.s.k(banks, "banks");
        this.identifierSpec = identifierSpec;
        this.banks = banks;
        this.allowsUserInteraction = true;
        SimpleTextElement simpleTextElement = new SimpleTextElement(IdentifierSpec.INSTANCE.a("au_becs_debit[bsb_number]"), new p010i90.r1(new u(banks), false, str, 2, null));
        this.textElement = simpleTextElement;
        this.bankName = r90.g.m(simpleTextElement.i().p(), new a());
    }

    @Override // p010i90.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public IdentifierSpec getIdentifier() {
        return this.identifierSpec;
    }

    @Override // p010i90.d0
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getAllowsUserInteraction() {
        return this.allowsUserInteraction;
    }

    @Override // p010i90.d0
    public StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> c() {
        return r90.g.h(this.textElement.i().isComplete(), this.textElement.i().p(), new b());
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

    public final StateFlow<String> g() {
        return this.bankName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final SimpleTextElement getTextElement() {
        return this.textElement;
    }
}
