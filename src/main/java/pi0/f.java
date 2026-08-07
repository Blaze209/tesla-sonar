package pi0;

import a30.t;
import a30.w;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001f\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0013\u0010%\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010$¨\u0006&"}, d2 = {"Lpi0/f;", "", "", "initialValue", "monthPlaceholder", "", "monthList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "year", "month", "day", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/List;", "getMonthList", "()Ljava/util/List;", "La30/t;", "b", "La30/t;", "g", "()La30/t;", "yearController", "c", DateTokenConverter.CONVERTER_KEY, "monthController", "dayController", "Lkotlinx/coroutines/flow/Flow;", "e", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "onChanged", "f", "()Ljava/lang/String;", "value", "Ljava/util/Date;", "()Ljava/util/Date;", "dateValue", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<String> monthList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t yearController;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t monthController;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t dayController;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Flow<String> onChanged;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.steps.ui.components.utils.DateController$1", f = "DateController.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<FlowCollector<? super String>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f103052n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f103053o;

        /* JADX INFO: renamed from: pi0.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C2187a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector<String> f103055a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f103056b;

            /* JADX WARN: Multi-variable type inference failed */
            C2187a(FlowCollector<? super String> flowCollector, f fVar) {
                this.f103055a = flowCollector;
                this.f103056b = fVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, Continuation<? super h0> continuation) {
                Object objEmit = this.f103055a.emit(this.f103056b.f(), continuation);
                return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : h0.f84049a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.f103053o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f103052n;
            if (i11 == 0) {
                jn0.t.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f103053o;
                Flow flowMerge = FlowKt.merge(f.this.getYearController().b(), f.this.getMonthController().b(), f.this.getDayController().b());
                C2187a c2187a = new C2187a(flowCollector, f.this);
                this.f103052n = 1;
                if (flowMerge.collect(c2187a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super String> flowCollector, Continuation<? super h0> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public f(String str, String str2, List<String> monthList) {
        String str3;
        s.k(monthList, "monthList");
        this.monthList = monthList;
        List listE1 = str != null ? p013kotlin.text.t.e1(str, new char[]{CoreConstants.DASH_CHAR}, false, 0, 6, null) : null;
        listE1 = (listE1 == null || listE1.size() != 3) ? v.p("", "", "") : listE1;
        this.yearController = w.a((String) listE1.get(0));
        try {
            str3 = monthList.get(Integer.parseInt((String) listE1.get(1)) - 1);
        } catch (NumberFormatException unused) {
            str3 = str2 == null ? "" : str2;
        }
        this.monthController = w.a(str3);
        this.dayController = w.a((String) listE1.get(2));
        this.onChanged = FlowKt.flow(new a(null));
    }

    private final String a(String year, String month, String day) {
        int iT0 = v.t0(this.monthList, month);
        String strK0 = iT0 > -1 ? p013kotlin.text.t.K0(String.valueOf(iT0 + 1), 2, '0') : null;
        if (year == null || year.length() == 0 || strK0 == null || strK0.length() == 0 || day == null || day.length() == 0) {
            return "";
        }
        return year + "-" + strK0 + "-" + day;
    }

    public final Date b() {
        try {
            List listE1 = p013kotlin.text.t.e1(f(), new char[]{CoreConstants.DASH_CHAR}, false, 0, 6, null);
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, Integer.parseInt((String) listE1.get(0)));
            calendar.set(2, Integer.parseInt((String) listE1.get(1)) - 1);
            calendar.set(5, Integer.parseInt((String) listE1.get(2)));
            return calendar.getTime();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final t getDayController() {
        return this.dayController;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final t getMonthController() {
        return this.monthController;
    }

    public final Flow<String> e() {
        return this.onChanged;
    }

    public final String f() {
        return a(this.yearController.c(), this.monthController.c(), this.dayController.c());
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final t getYearController() {
        return this.yearController;
    }
}
