package p010i90;

import bo0.j;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
import o4.y;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import r90.e;
import r90.g;
import wn0.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001\u0012B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\u00020\u00198\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001e0\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Li90/k0;", "Li90/r;", "", "otpLength", "<init>", "(I)V", "", "userTyped", "u", "(Ljava/lang/String;)Ljava/lang/String;", "index", "text", "z", "(ILjava/lang/String;)I", "digit", "Ljn0/h0;", "y", "(Ljava/lang/String;)V", "a", "I", "x", "()I", "b", "Ljava/lang/String;", "autofillAccumulator", "Lo4/y;", "c", "w", "keyboardType", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "v", "()Ljava/util/List;", "fieldValues", "Lkotlinx/coroutines/flow/StateFlow;", "e", "Lkotlinx/coroutines/flow/StateFlow;", "p", "()Lkotlinx/coroutines/flow/StateFlow;", "fieldValue", "f", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k0 implements r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f76646f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f76647g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final bo0.c f76648h = new bo0.c('0', '9');

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int otpLength;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String autofillAccumulator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int keyboardType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<MutableStateFlow<String>> fieldValues;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<String> fieldValue;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li90/k0$a;", "", "<init>", "()V", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Flow<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow[] f76654a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<String[]> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Flow[] f76655c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Flow[] flowArr) {
                super(0);
                this.f76655c = flowArr;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String[] invoke() {
                return new String[this.f76655c.length];
            }
        }

        /* JADX INFO: renamed from: i90.k0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.uicore.elements.OTPController$special$$inlined$combineAsStateFlow$1$3", f = "OTPController.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
        public static final class C1621b extends SuspendLambda implements q<FlowCollector<? super String>, String[], Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f76656n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f76657o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f76658p;

            public C1621b(Continuation continuation) {
                super(3, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f76656n;
                if (i11 == 0) {
                    t.b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f76657o;
                    String strY0 = v.y0(n.w1((Object[]) this.f76658p), "", null, null, 0, null, null, 62, null);
                    this.f76656n = 1;
                    if (flowCollector.emit(strY0, this) == coroutine_suspended) {
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
            public final Object invoke(FlowCollector<? super String> flowCollector, String[] strArr, Continuation<? super h0> continuation) {
                C1621b c1621b = new C1621b(continuation);
                c1621b.f76657o = flowCollector;
                c1621b.f76658p = strArr;
                return c1621b.invokeSuspend(h0.f84049a);
            }
        }

        public b(Flow[] flowArr) {
            this.f76654a = flowArr;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
            Flow[] flowArr = this.f76654a;
            Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new a(flowArr), new C1621b(null), continuation);
            return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0004\u001a\u00028\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "R", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f76659c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(0);
            this.f76659c = list;
        }

        @Override // wn0.a
        public final String invoke() {
            List list = this.f76659c;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((StateFlow) it.next()).getValue());
            }
            return v.y0(arrayList, "", null, null, 0, null, null, 62, null);
        }
    }

    public k0() {
        this(0, 1, null);
    }

    private final String u(String userTyped) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        int length = userTyped.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = userTyped.charAt(i11);
            if (f76648h.k(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    public final StateFlow<String> p() {
        return this.fieldValue;
    }

    public final List<MutableStateFlow<String>> v() {
        return this.fieldValues;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final int getKeyboardType() {
        return this.keyboardType;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final int getOtpLength() {
        return this.otpLength;
    }

    public final void y(String digit) throws IOException {
        s.k(digit, "digit");
        String str = this.autofillAccumulator + digit;
        this.autofillAccumulator = str;
        if (str.length() == this.otpLength) {
            z(0, this.autofillAccumulator);
            this.autofillAccumulator = "";
        }
    }

    public final int z(int index, String text) throws IOException {
        s.k(text, "text");
        if (s.f(text, this.fieldValues.get(index).getValue())) {
            return 1;
        }
        if (text.length() == 0) {
            this.fieldValues.get(index).setValue("");
            return 0;
        }
        String strU = u(text);
        int length = strU.length();
        int i11 = this.otpLength;
        if (length == i11) {
            index = 0;
        }
        int iMin = Math.min(i11, strU.length());
        Iterator<Integer> it = bo0.n.w(0, iMin).iterator();
        while (it.hasNext()) {
            int iNextInt = ((s0) it).nextInt();
            this.fieldValues.get(index + iNextInt).setValue(String.valueOf(strU.charAt(iNextInt)));
        }
        return iMin;
    }

    public k0(int i11) {
        this.otpLength = i11;
        this.autofillAccumulator = "";
        this.keyboardType = y.INSTANCE.e();
        j jVarW = bo0.n.w(0, i11);
        ArrayList arrayList = new ArrayList(v.y(jVarW, 10));
        Iterator<Integer> it = jVarW.iterator();
        while (it.hasNext()) {
            ((s0) it).nextInt();
            arrayList.add(StateFlowKt.MutableStateFlow(""));
        }
        this.fieldValues = arrayList;
        this.fieldValue = new e(arrayList.isEmpty() ? g.n(v.y0(v.m(), "", null, null, 0, null, null, 62, null)) : new b((Flow[]) v.m1(arrayList).toArray(new Flow[0])), new c(arrayList));
    }

    public /* synthetic */ k0(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 6 : i11);
    }
}
