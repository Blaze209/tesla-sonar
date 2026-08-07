package p014n4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.util.List;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.p1;
import p020r2.s3;
import p020r2.y3;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0002*\u00020\u0004H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R+\u0010(\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Ln4/l;", "Lr2/y3;", "", "", "Ln4/p;", "fontList", "initialType", "Ln4/e1;", "typefaceRequest", "Ln4/m;", "asyncTypefaceCache", "Lkotlin/Function1;", "Ln4/g1$b;", "Ljn0/h0;", "onCompletion", "Ln4/m0;", "platformFontLoader", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ln4/e1;Ln4/m;Lwn0/l;Ln4/m0;)V", "o", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "(Ln4/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljava/util/List;", "b", "Ln4/e1;", "c", "Ln4/m;", DateTokenConverter.CONVERTER_KEY, "Lwn0/l;", "e", "Ln4/m0;", "<set-?>", "f", "Lr2/p1;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "", "g", "Z", "n", "()Z", "setCacheable$ui_text_release", "(Z)V", "cacheable", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l implements y3<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<p> fontList;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TypefaceRequest typefaceRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m asyncTypefaceCache;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<g1.b, h0> onCompletion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final m0 platformFontLoader;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p1 value;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean cacheable = true;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE}, m = "load", n = {"this", "$this$fastForEach$iv", "font", "index$iv", "this", "$this$fastForEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f92967n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f92968o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f92969p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f92970q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f92971r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f92972s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f92974u;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f92972s = obj;
            this.f92974u |= Integer.MIN_VALUE;
            return l.this.o(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.l<Continuation<? super Object>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f92975n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p f92977p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p pVar, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f92977p = pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return l.this.new b(this.f92977p, continuation);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Object> continuation) {
            return invoke2((Continuation<Object>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f92975n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            l lVar = l.this;
            p pVar = this.f92977p;
            this.f92975n = 1;
            Object objP = lVar.p(pVar, this);
            return objP == coroutine_suspended ? coroutine_suspended : objP;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<Object> continuation) {
            return ((b) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE}, m = "loadWithTimeoutOrNull$ui_text_release", n = {"$this$loadWithTimeoutOrNull"}, s = {"L$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f92978n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f92979o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f92981q;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f92979o = obj;
            this.f92981q |= Integer.MIN_VALUE;
            return l.this.p(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super Object>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f92982n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p f92984p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p pVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f92984p = pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new d(this.f92984p, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, (Continuation<Object>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f92982n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            m0 m0Var = l.this.platformFontLoader;
            p pVar = this.f92984p;
            this.f92982n = 1;
            Object objA = m0Var.a(pVar, this);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(List<? extends p> list, Object obj, TypefaceRequest typefaceRequest, m mVar, wn0.l<? super g1.b, h0> lVar, m0 m0Var) {
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = mVar;
        this.onCompletion = lVar;
        this.platformFontLoader = m0Var;
        this.value = s3.d(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.value.setValue(obj);
    }

    @Override // p020r2.y3
    public Object getValue() {
        return this.value.getValue();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getCacheable() {
        return this.cacheable;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c A[Catch: all -> 0x00fe, TRY_LEAVE, TryCatch #2 {all -> 0x00fe, blocks: (B:28:0x0075, B:30:0x008c), top: B:56:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:35:0x00b1, B:38:0x00e5, B:20:0x005a), top: B:54:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:35:0x00b1, B:38:0x00e5, B:20:0x005a), top: B:54:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:56:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008a -> B:45:0x0102). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f8 -> B:42:0x00f9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object o(p013kotlin.coroutines.Continuation<? super jn0.h0> r18) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p014n4.l.o(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(p pVar, Continuation<Object> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f92981q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f92981q = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f92979o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f92981q;
        try {
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            d dVar = new d(pVar, null);
            cVar.f92978n = pVar;
            cVar.f92981q = 1;
            Object objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, dVar, cVar);
            return objWithTimeoutOrNull == coroutine_suspended ? coroutine_suspended : objWithTimeoutOrNull;
        } catch (CancellationException e11) {
            if (!JobKt.isActive(cVar.getContext())) {
                throw e11;
            }
            return null;
        } catch (Exception e12) {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) cVar.getContext().get(CoroutineExceptionHandler.INSTANCE);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(cVar.getContext(), new IllegalStateException("Unable to load font " + pVar, e12));
            }
            return null;
        }
    }
}
