package p010i90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.CombineKt;
import n90.FormFieldEntry;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import r90.g;
import wn0.a;
import wn0.q;

/* JADX INFO: renamed from: i90.g1, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f0\u00040\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010)\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001f\u0010(R\u001c\u0010-\u001a\u0004\u0018\u00010*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b&\u0010,¨\u0006."}, d2 = {"Li90/g1;", "Li90/d0;", "Li90/g0;", "identifier", "", "Li90/j1;", "fields", "Li90/f1;", "controller", "<init>", "(Li90/g0;Ljava/util/List;Li90/f1;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlin/Pair;", "Ln90/a;", "c", "()Lkotlinx/coroutines/flow/StateFlow;", "e", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li90/g0;", "()Li90/g0;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "Li90/f1;", "f", "()Li90/f1;", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "allowsUserInteraction", "Lx30/c;", "Lx30/c;", "()Lx30/c;", "mandateText", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SectionElement implements d0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f76567g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdentifierSpec identifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<j1> fields;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final f1 controller;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean allowsUserInteraction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final x30.c mandateText;

    /* JADX INFO: renamed from: i90.g1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Li90/g1$a;", "", "<init>", "()V", "Li90/j1;", "sectionFieldElement", "", AnnotatedPrivateKey.LABEL, "Li90/g1;", "a", "(Li90/j1;Ljava/lang/Integer;)Li90/g1;", "", "sectionFieldElements", "b", "(Ljava/util/List;Ljava/lang/Integer;)Li90/g1;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SectionElement c(Companion companion, j1 j1Var, Integer num, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                num = null;
            }
            return companion.a(j1Var, num);
        }

        public final SectionElement a(j1 sectionFieldElement, Integer label) {
            s.k(sectionFieldElement, "sectionFieldElement");
            return b(v.e(sectionFieldElement), label);
        }

        public final SectionElement b(List<? extends j1> sectionFieldElements, Integer label) {
            s.k(sectionFieldElements, "sectionFieldElements");
            List<? extends j1> list = sectionFieldElements;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((j1) it.next()).h());
            }
            return new SectionElement(IdentifierSpec.INSTANCE.a(((j1) v.o0(sectionFieldElements)).getIdentifier().getV1() + "_section"), sectionFieldElements, new f1(label, arrayList));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: i90.g1$b */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Flow<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow[] f76573a;

        /* JADX INFO: renamed from: i90.g1$b$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[]> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Flow[] f76574c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Flow[] flowArr) {
                super(0);
                this.f76574c = flowArr;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] invoke() {
                return new List[this.f76574c.length];
            }
        }

        /* JADX INFO: renamed from: i90.g1$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.uicore.elements.SectionElement$getFormFieldValueFlow$$inlined$combineAsStateFlow$1$3", f = "SectionElement.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
        public static final class C1618b extends SuspendLambda implements q<FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[], Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f76575n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f76576o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f76577p;

            public C1618b(Continuation continuation) {
                super(3, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f76575n;
                if (i11 == 0) {
                    t.b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f76576o;
                    List listA = v.A(v.m1(n.w1((Object[]) this.f76577p)));
                    this.f76575n = 1;
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
                C1618b c1618b = new C1618b(continuation);
                c1618b.f76576o = flowCollector;
                c1618b.f76577p = listArr;
                return c1618b.invokeSuspend(h0.f84049a);
            }
        }

        public b(Flow[] flowArr) {
            this.f76573a = flowArr;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> flowCollector, Continuation continuation) {
            Flow[] flowArr = this.f76573a;
            Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new a(flowArr), new C1618b(null), continuation);
            return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.g1$c */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0004\u001a\u00028\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "R", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends u implements a<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f76578c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.f76578c = list;
        }

        @Override // wn0.a
        public final List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> invoke() {
            List list = this.f76578c;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((StateFlow) it.next()).getValue());
            }
            return v.A(v.m1(arrayList));
        }
    }

    /* JADX INFO: renamed from: i90.g1$d */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements Flow<List<? extends IdentifierSpec>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow[] f76579a;

        /* JADX INFO: renamed from: i90.g1$d$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<List<? extends IdentifierSpec>[]> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Flow[] f76580c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Flow[] flowArr) {
                super(0);
                this.f76580c = flowArr;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final List<? extends IdentifierSpec>[] invoke() {
                return new List[this.f76580c.length];
            }
        }

        /* JADX INFO: renamed from: i90.g1$d$b */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.uicore.elements.SectionElement$getTextFieldIdentifiers$$inlined$combineAsStateFlow$1$3", f = "SectionElement.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements q<FlowCollector<? super List<? extends IdentifierSpec>>, List<? extends IdentifierSpec>[], Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f76581n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f76582o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f76583p;

            public b(Continuation continuation) {
                super(3, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f76581n;
                if (i11 == 0) {
                    t.b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f76582o;
                    List listA = v.A(v.m1(n.w1((Object[]) this.f76583p)));
                    this.f76581n = 1;
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
                bVar.f76582o = flowCollector;
                bVar.f76583p = listArr;
                return bVar.invokeSuspend(h0.f84049a);
            }
        }

        public d(Flow[] flowArr) {
            this.f76579a = flowArr;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends IdentifierSpec>> flowCollector, Continuation continuation) {
            Flow[] flowArr = this.f76579a;
            Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new a(flowArr), new b(null), continuation);
            return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: i90.g1$e */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0004\u001a\u00028\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "R", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends u implements a<List<? extends IdentifierSpec>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f76584c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list) {
            super(0);
            this.f76584c = list;
        }

        @Override // wn0.a
        public final List<? extends IdentifierSpec> invoke() {
            List list = this.f76584c;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((StateFlow) it.next()).getValue());
            }
            return v.A(v.m1(arrayList));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SectionElement(IdentifierSpec identifier, List<? extends j1> fields, f1 controller) {
        x30.c cVarD;
        s.k(identifier, "identifier");
        s.k(fields, "fields");
        s.k(controller, "controller");
        this.identifier = identifier;
        this.fields = fields;
        this.controller = controller;
        List<? extends j1> list = fields;
        boolean z11 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((j1) it.next()).getAllowsUserInteraction()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.allowsUserInteraction = z11;
        Iterator<T> it2 = this.fields.iterator();
        while (it2.hasNext()) {
            cVarD = ((j1) it2.next()).getMandateText();
            if (cVarD != null) {
                this.mandateText = cVarD;
            }
        }
        cVarD = null;
        this.mandateText = cVarD;
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
        List<j1> list = this.fields;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((j1) it.next()).c());
        }
        return new r90.e(arrayList.isEmpty() ? g.n(v.A(v.m1(v.m()))) : new b((Flow[]) v.m1(arrayList).toArray(new Flow[0])), new c(arrayList));
    }

    @Override // p010i90.d0
    /* JADX INFO: renamed from: d, reason: from getter */
    public x30.c getMandateText() {
        return this.mandateText;
    }

    @Override // p010i90.d0
    public StateFlow<List<IdentifierSpec>> e() {
        List<j1> list = this.fields;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((j1) it.next()).e());
        }
        return new r90.e(arrayList.isEmpty() ? g.n(v.A(v.m1(v.m()))) : new d((Flow[]) v.m1(arrayList).toArray(new Flow[0])), new e(arrayList));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SectionElement)) {
            return false;
        }
        SectionElement sectionElement = (SectionElement) other;
        return s.f(this.identifier, sectionElement.identifier) && s.f(this.fields, sectionElement.fields) && s.f(this.controller, sectionElement.controller);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public f1 getController() {
        return this.controller;
    }

    public final List<j1> g() {
        return this.fields;
    }

    public int hashCode() {
        return (((this.identifier.hashCode() * 31) + this.fields.hashCode()) * 31) + this.controller.hashCode();
    }

    public String toString() {
        return "SectionElement(identifier=" + this.identifier + ", fields=" + this.fields + ", controller=" + this.controller + ")";
    }
}
