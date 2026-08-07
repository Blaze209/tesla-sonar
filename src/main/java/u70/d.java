package u70;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.paymentsheet.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
import n90.FormFieldEntry;
import p010i90.IdentifierSpec;
import p010i90.SectionElement;
import p010i90.d0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w70.j;
import wn0.p;
import wn0.q;
import y70.FormArguments;
import z80.a0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001:B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001c0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001c0 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001f\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\t8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010\u000eR \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\"R\u001f\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0 8\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010$R&\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u000204038FX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106¨\u0006;"}, d2 = {"Lu70/d;", "Landroidx/lifecycle/c1;", "", "Li90/d0;", "elements", "Ly70/a;", "formArguments", "<init>", "(Ljava/util/List;Ly70/a;)V", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "Li90/g0;", "Ln90/a;", "f", "()Lkotlinx/coroutines/flow/Flow;", "s", "Ljava/util/List;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "t", "Ly70/a;", "getFormArguments", "()Ly70/a;", "Lz80/a0;", "u", "Lz80/a0;", "cardBillingElement", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "v", "Lkotlinx/coroutines/flow/MutableStateFlow;", "externalHiddenIdentifiers", "Lkotlinx/coroutines/flow/StateFlow;", "w", "Lkotlinx/coroutines/flow/StateFlow;", "j", "()Lkotlinx/coroutines/flow/StateFlow;", "hiddenIdentifiers", "Lw70/j$a;", "x", "Lkotlinx/coroutines/flow/Flow;", "userRequestedReuse", "Lu70/c;", "y", "g", "completeFormValues", "z", "textFieldControllerIdsFlow", "A", "k", "lastTextFieldIdentifier", "", "", "h", "()Ljava/util/Map;", "getDefaultValuesToInclude$annotations", "()V", "defaultValuesToInclude", "b", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d extends c1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final StateFlow<IdentifierSpec> lastTextFieldIdentifier;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final List<d0> elements;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final FormArguments formArguments;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final a0 cardBillingElement;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private MutableStateFlow<Set<IdentifierSpec>> externalHiddenIdentifiers;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Set<IdentifierSpec>> hiddenIdentifiers;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Flow<j.a> userRequestedReuse;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Flow<FormFieldValues> completeFormValues;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<List<IdentifierSpec>> textFieldControllerIdsFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.forms.FormViewModel$1", f = "FormViewModel.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f115818n;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return d.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f115818n;
            if (i11 == 0) {
                t.b(obj);
                u70.f fVar = u70.f.f115846a;
                List<d0> listI = d.this.i();
                this.f115818n = 1;
                if (fVar.b(listI, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lu70/d$b;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "", "Li90/d0;", "formElements", "Ly70/a;", "formArguments", "<init>", "(Ljava/util/List;Ly70/a;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "a", "Ljava/util/List;", "getFormElements", "()Ljava/util/List;", "b", "Ly70/a;", "getFormArguments", "()Ly70/a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<d0> formElements;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final FormArguments formArguments;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends d0> formElements, FormArguments formArguments) {
            s.k(formElements, "formElements");
            s.k(formArguments, "formArguments");
            this.formElements = formElements;
            this.formArguments = formArguments;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass) {
            s.k(modelClass, "modelClass");
            return new d(this.formElements, this.formArguments);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$$inlined$unsafeFlow$3", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Flow<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow[] f115822a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$1"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[]> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Flow[] f115823c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Flow[] flowArr) {
                super(0);
                this.f115823c = flowArr;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] invoke() {
                return new List[this.f115823c.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.forms.FormViewModel$currentFieldValues$$inlined$combine$1$3", f = "FormViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements q<FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[], Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f115824n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f115825o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f115826p;

            public b(Continuation continuation) {
                super(3, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f115824n;
                if (i11 == 0) {
                    t.b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f115825o;
                    List listA = v.A(n.w1((List[]) ((Object[]) this.f115826p)));
                    this.f115824n = 1;
                    if (flowCollector.emit(listA, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return h0.f84049a;
            }

            @Override // wn0.q
            public final Object invoke(FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> flowCollector, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] listArr, Continuation<? super h0> continuation) {
                b bVar = new b(continuation);
                bVar.f115825o = flowCollector;
                bVar.f115826p = listArr;
                return bVar.invokeSuspend(h0.f84049a);
            }
        }

        public c(Flow[] flowArr) {
            this.f115822a = flowArr;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> flowCollector, Continuation continuation) {
            Flow[] flowArr = this.f115822a;
            Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new a(flowArr), new b(null), continuation);
            return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: u70.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Li90/g0;", "cardBillingIdentifiers", "externalHiddenIdentifiers", "a", "(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;"}, k = 3, mv = {1, 9, 0})
    static final class C2491d extends u implements p<Set<? extends IdentifierSpec>, Set<? extends IdentifierSpec>, Set<? extends IdentifierSpec>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2491d f115827c = new C2491d();

        C2491d() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set<IdentifierSpec> invoke(Set<IdentifierSpec> cardBillingIdentifiers, Set<IdentifierSpec> externalHiddenIdentifiers) {
            s.k(cardBillingIdentifiers, "cardBillingIdentifiers");
            s.k(externalHiddenIdentifiers, "externalHiddenIdentifiers");
            return d1.n(externalHiddenIdentifiers, cardBillingIdentifiers);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Li90/g0;", "hiddenIds", "", "textFieldControllerIds", "a", "(Ljava/util/Set;Ljava/util/List;)Li90/g0;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements p<Set<? extends IdentifierSpec>, List<? extends IdentifierSpec>, IdentifierSpec> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f115828c = new e();

        e() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IdentifierSpec invoke(Set<IdentifierSpec> hiddenIds, List<IdentifierSpec> textFieldControllerIds) {
            IdentifierSpec identifierSpecPrevious;
            s.k(hiddenIds, "hiddenIds");
            s.k(textFieldControllerIds, "textFieldControllerIds");
            ListIterator<IdentifierSpec> listIterator = textFieldControllerIds.listIterator(textFieldControllerIds.size());
            while (listIterator.hasPrevious()) {
                identifierSpecPrevious = listIterator.previous();
                if (!hiddenIds.contains(identifierSpecPrevious)) {
                    return identifierSpecPrevious;
                }
            }
            identifierSpecPrevious = null;
            return identifierSpecPrevious;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements Flow<List<? extends IdentifierSpec>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow[] f115829a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<List<? extends IdentifierSpec>[]> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Flow[] f115830c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Flow[] flowArr) {
                super(0);
                this.f115830c = flowArr;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final List<? extends IdentifierSpec>[] invoke() {
                return new List[this.f115830c.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$combineAsStateFlow$1$3", f = "FormViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements q<FlowCollector<? super List<? extends IdentifierSpec>>, List<? extends IdentifierSpec>[], Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f115831n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f115832o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f115833p;

            public b(Continuation continuation) {
                super(3, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f115831n;
                if (i11 == 0) {
                    t.b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f115832o;
                    List listA = v.A(v.m1(n.w1((Object[]) this.f115833p)));
                    this.f115831n = 1;
                    if (flowCollector.emit(listA, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return h0.f84049a;
            }

            @Override // wn0.q
            public final Object invoke(FlowCollector<? super List<? extends IdentifierSpec>> flowCollector, List<? extends IdentifierSpec>[] listArr, Continuation<? super h0> continuation) {
                b bVar = new b(continuation);
                bVar.f115832o = flowCollector;
                bVar.f115833p = listArr;
                return bVar.invokeSuspend(h0.f84049a);
            }
        }

        public f(Flow[] flowArr) {
            this.f115829a = flowArr;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends IdentifierSpec>> flowCollector, Continuation continuation) {
            Flow[] flowArr = this.f115829a;
            Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new a(flowArr), new b(null), continuation);
            return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0004\u001a\u00028\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "R", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends u implements wn0.a<List<? extends IdentifierSpec>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f115834c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List list) {
            super(0);
            this.f115834c = list;
        }

        @Override // wn0.a
        public final List<? extends IdentifierSpec> invoke() {
            List list = this.f115834c;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((StateFlow) it.next()).getValue());
            }
            return v.A(v.m1(arrayList));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements Flow<j.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f115835a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f115836a;

            /* JADX INFO: renamed from: u70.d$h$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1$2", f = "FormViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
            public static final class C2492a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f115837n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f115838o;

                public C2492a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f115837n = obj;
                    this.f115838o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f115836a = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                C2492a c2492a;
                if (continuation instanceof C2492a) {
                    c2492a = (C2492a) continuation;
                    int i11 = c2492a.f115838o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c2492a.f115838o = i11 - Integer.MIN_VALUE;
                    } else {
                        c2492a = new C2492a(continuation);
                    }
                } else {
                    c2492a = new C2492a(continuation);
                }
                Object obj2 = c2492a.f115837n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c2492a.f115838o;
                if (i12 == 0) {
                    t.b(obj2);
                    FlowCollector flowCollector = this.f115836a;
                    ArrayList arrayList = new ArrayList();
                    for (T t11 : (List) obj) {
                        if (s.f(((Pair) t11).e(), IdentifierSpec.INSTANCE.x())) {
                            arrayList.add(t11);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Boxing.boxBoolean(Boolean.parseBoolean(((FormFieldEntry) ((Pair) it.next()).f()).getValue())));
                    }
                    ArrayList arrayList3 = new ArrayList(v.y(arrayList2, 10));
                    Iterator<T> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((Boolean) it2.next()).booleanValue() ? j.a.RequestReuse : j.a.RequestNoReuse);
                    }
                    j.a aVar = (j.a) v.q0(arrayList3);
                    if (aVar == null) {
                        aVar = j.a.NoRequest;
                    }
                    c2492a.f115838o = 1;
                    if (flowCollector.emit(aVar, c2492a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj2);
                }
                return h0.f84049a;
            }
        }

        public h(Flow flow) {
            this.f115835a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super j.a> flowCollector, Continuation continuation) {
            Object objCollect = this.f115835a.collect(new a(flowCollector), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements Flow<Map<IdentifierSpec, ? extends FormFieldEntry>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f115840a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f115841a;

            /* JADX INFO: renamed from: u70.d$i$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2$2", f = "FormViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
            public static final class C2493a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f115842n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f115843o;

                public C2493a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f115842n = obj;
                    this.f115843o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f115841a = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                C2493a c2493a;
                if (continuation instanceof C2493a) {
                    c2493a = (C2493a) continuation;
                    int i11 = c2493a.f115843o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c2493a.f115843o = i11 - Integer.MIN_VALUE;
                    } else {
                        c2493a = new C2493a(continuation);
                    }
                } else {
                    c2493a = new C2493a(continuation);
                }
                Object obj2 = c2493a.f115842n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c2493a.f115843o;
                if (i12 == 0) {
                    t.b(obj2);
                    FlowCollector flowCollector = this.f115841a;
                    Map mapY = v0.y((List) obj);
                    c2493a.f115843o = 1;
                    if (flowCollector.emit(mapY, c2493a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj2);
                }
                return h0.f84049a;
            }
        }

        public i(Flow flow) {
            this.f115840a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Map<IdentifierSpec, ? extends FormFieldEntry>> flowCollector, Continuation continuation) {
            Object objCollect = this.f115840a.collect(new a(flowCollector), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(List<? extends d0> elements, FormArguments formArguments) {
        StateFlow<Set<IdentifierSpec>> stateFlowW;
        s.k(elements, "elements");
        s.k(formArguments, "formArguments");
        this.elements = elements;
        this.formArguments = formArguments;
        ArrayList arrayList = new ArrayList();
        for (Object obj : elements) {
            if (obj instanceof SectionElement) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v.E(arrayList2, ((SectionElement) it.next()).g());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof a0) {
                arrayList3.add(obj2);
            }
        }
        a0 a0Var = (a0) v.q0(arrayList3);
        this.cardBillingElement = a0Var;
        this.externalHiddenIdentifiers = StateFlowKt.MutableStateFlow(d1.d());
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new a(null), 3, null);
        StateFlow<Set<IdentifierSpec>> stateFlowH = r90.g.h((a0Var == null || (stateFlowW = a0Var.w()) == null) ? r90.g.n(d1.d()) : stateFlowW, this.externalHiddenIdentifiers, C2491d.f115827c);
        this.hiddenIdentifiers = stateFlowH;
        h hVar = new h(f());
        this.userRequestedReuse = hVar;
        this.completeFormValues = new u70.a(new i(f()), stateFlowH, hVar, h()).c();
        List<d0> list = this.elements;
        ArrayList arrayList4 = new ArrayList(v.y(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((d0) it2.next()).e());
        }
        r90.e eVar = new r90.e(arrayList4.isEmpty() ? r90.g.n(v.A(v.m1(v.m()))) : new f((Flow[]) v.m1(arrayList4).toArray(new Flow[0])), new g(arrayList4));
        this.textFieldControllerIdsFlow = eVar;
        this.lastTextFieldIdentifier = r90.g.h(this.hiddenIdentifiers, eVar, e.f115828c);
    }

    private final Flow<List<Pair<IdentifierSpec, FormFieldEntry>>> f() {
        if (this.elements.isEmpty()) {
            return FlowKt.flowOf(v.m());
        }
        List<d0> list = this.elements;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((d0) it.next()).c());
        }
        return new c((Flow[]) v.m1(arrayList).toArray(new Flow[0]));
    }

    public final Flow<FormFieldValues> g() {
        return this.completeFormValues;
    }

    public final Map<IdentifierSpec, String> h() {
        y.BillingDetails billingDetails;
        String country;
        String postalCode;
        String state;
        String city;
        String line2;
        String line1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.formArguments.getBillingDetailsCollectionConfiguration().getAttachDefaultsToPaymentMethod() && (billingDetails = this.formArguments.getBillingDetails()) != null) {
            String name = billingDetails.getName();
            if (name != null) {
                linkedHashMap.put(IdentifierSpec.INSTANCE.r(), name);
            }
            String email = billingDetails.getEmail();
            if (email != null) {
                linkedHashMap.put(IdentifierSpec.INSTANCE.n(), email);
            }
            String phone = billingDetails.getPhone();
            if (phone != null) {
                linkedHashMap.put(IdentifierSpec.INSTANCE.t(), phone);
            }
            y.Address address = billingDetails.getAddress();
            if (address != null && (line1 = address.getLine1()) != null) {
                linkedHashMap.put(IdentifierSpec.INSTANCE.p(), line1);
            }
            y.Address address2 = billingDetails.getAddress();
            if (address2 != null && (line2 = address2.getLine2()) != null) {
                linkedHashMap.put(IdentifierSpec.INSTANCE.q(), line2);
            }
            y.Address address3 = billingDetails.getAddress();
            if (address3 != null && (city = address3.getCity()) != null) {
                linkedHashMap.put(IdentifierSpec.INSTANCE.k(), city);
            }
            y.Address address4 = billingDetails.getAddress();
            if (address4 != null && (state = address4.getState()) != null) {
                linkedHashMap.put(IdentifierSpec.INSTANCE.z(), state);
            }
            y.Address address5 = billingDetails.getAddress();
            if (address5 != null && (postalCode = address5.getPostalCode()) != null) {
                linkedHashMap.put(IdentifierSpec.INSTANCE.u(), postalCode);
            }
            y.Address address6 = billingDetails.getAddress();
            if (address6 != null && (country = address6.getCountry()) != null) {
                linkedHashMap.put(IdentifierSpec.INSTANCE.l(), country);
            }
        }
        return linkedHashMap;
    }

    public final List<d0> i() {
        return this.elements;
    }

    public final StateFlow<Set<IdentifierSpec>> j() {
        return this.hiddenIdentifiers;
    }

    public final StateFlow<IdentifierSpec> k() {
        return this.lastTextFieldIdentifier;
    }
}
