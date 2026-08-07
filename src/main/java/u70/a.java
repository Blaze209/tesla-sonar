package u70;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import n90.FormFieldEntry;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import w70.j;
import wn0.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BW\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0004\b\r\u0010\u000eJO\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0002¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018¨\u0006\u0019"}, d2 = {"Lu70/a;", "", "Lkotlinx/coroutines/flow/Flow;", "", "Li90/g0;", "Ln90/a;", "currentFieldValueMap", "", "hiddenIdentifiers", "Lw70/j$a;", "userRequestedReuse", "", "defaultValues", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Ljava/util/Map;)V", "idFieldSnapshotMap", "Lu70/c;", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;Ljava/util/Set;Lw70/j$a;Ljava/util/Map;)Lu70/c;", "c", "()Lkotlinx/coroutines/flow/Flow;", "a", "Lkotlinx/coroutines/flow/Flow;", "b", "Ljava/util/Map;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Flow<Map<IdentifierSpec, FormFieldEntry>> currentFieldValueMap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Flow<Set<IdentifierSpec>> hiddenIdentifiers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Flow<j.a> userRequestedReuse;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<IdentifierSpec, String> defaultValues;

    /* JADX INFO: renamed from: u70.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u008a@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Li90/g0;", "Ln90/a;", "idFieldSnapshotMap", "", "hiddenIdentifiers", "Lw70/j$a;", "userRequestedReuse", "Lu70/c;", "<anonymous>", "(Ljava/util/Map;Ljava/util/Set;Lw70/j$a;)Lu70/c;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.forms.CompleteFormFieldValueFilter$filterFlow$1", f = "CompleteFormFieldValueFilter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C2490a extends SuspendLambda implements r<Map<IdentifierSpec, ? extends FormFieldEntry>, Set<? extends IdentifierSpec>, j.a, Continuation<? super FormFieldValues>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f115802n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f115803o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f115804p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f115805q;

        C2490a(Continuation<? super C2490a> continuation) {
            super(4, continuation);
        }

        @Override // wn0.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Map<IdentifierSpec, FormFieldEntry> map, Set<IdentifierSpec> set, j.a aVar, Continuation<? super FormFieldValues> continuation) {
            C2490a c2490a = a.this.new C2490a(continuation);
            c2490a.f115803o = map;
            c2490a.f115804p = set;
            c2490a.f115805q = aVar;
            return c2490a.invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f115802n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Map map = (Map) this.f115803o;
            Set set = (Set) this.f115804p;
            j.a aVar = (j.a) this.f115805q;
            a aVar2 = a.this;
            return aVar2.d(map, set, aVar, aVar2.defaultValues);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Flow<? extends Map<IdentifierSpec, FormFieldEntry>> currentFieldValueMap, Flow<? extends Set<IdentifierSpec>> hiddenIdentifiers, Flow<? extends j.a> userRequestedReuse, Map<IdentifierSpec, String> defaultValues) {
        s.k(currentFieldValueMap, "currentFieldValueMap");
        s.k(hiddenIdentifiers, "hiddenIdentifiers");
        s.k(userRequestedReuse, "userRequestedReuse");
        s.k(defaultValues, "defaultValues");
        this.currentFieldValueMap = currentFieldValueMap;
        this.hiddenIdentifiers = hiddenIdentifiers;
        this.userRequestedReuse = userRequestedReuse;
        this.defaultValues = defaultValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FormFieldValues d(Map<IdentifierSpec, FormFieldEntry> idFieldSnapshotMap, Set<IdentifierSpec> hiddenIdentifiers, j.a userRequestedReuse, Map<IdentifierSpec, String> defaultValues) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<IdentifierSpec, FormFieldEntry> entry : idFieldSnapshotMap.entrySet()) {
            if (!hiddenIdentifiers.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map mapD = v0.D(linkedHashMap);
        Iterator<Map.Entry<IdentifierSpec, String>> it = defaultValues.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<IdentifierSpec, String> next = it.next();
            FormFieldEntry formFieldEntry = (FormFieldEntry) mapD.get(next.getKey());
            String value = formFieldEntry != null ? formFieldEntry.getValue() : null;
            if (value == null || p013kotlin.text.t.y0(value)) {
                String value2 = next.getValue();
                if (value2 != null && !p013kotlin.text.t.y0(value2)) {
                    mapD.put(next.getKey(), new FormFieldEntry(next.getValue(), true));
                }
            }
        }
        FormFieldValues formFieldValues = new FormFieldValues(mapD, userRequestedReuse);
        Collection collectionValues = mapD.values();
        ArrayList arrayList = new ArrayList(v.y(collectionValues, 10));
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayList.add(Boolean.valueOf(((FormFieldEntry) it2.next()).getIsComplete()));
        }
        if (arrayList.isEmpty()) {
            return formFieldValues;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            if (!((Boolean) it3.next()).booleanValue()) {
                return null;
            }
        }
        return formFieldValues;
    }

    public final Flow<FormFieldValues> c() {
        return FlowKt.combine(this.currentFieldValueMap, this.hiddenIdentifiers, this.userRequestedReuse, new C2490a(null));
    }
}
