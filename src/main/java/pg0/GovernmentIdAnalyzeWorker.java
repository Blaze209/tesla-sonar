package pg0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import java.io.IOException;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import wg0.AutocaptureState;
import zf0.ExtractedTexts;
import zf0.ImageIdMetadata;

/* JADX INFO: renamed from: pg0.e0, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0019B5\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00182\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lpg0/e0;", "Ly20/o;", "Ljn0/s;", "Lpg0/d0$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzf0/e0;", "governmentIdFeed", "Lfi0/c;", "sdkFilesManager", "Lpg0/d4$e;", "side", "", "idClassKey", "<init>", "(Landroid/content/Context;Lzf0/e0;Lfi0/c;Lpg0/d4$e;Ljava/lang/String;)V", "Lzf0/q0$b;", "parsedIdSide", "e", "(Lzf0/q0$b;)Ljava/lang/Object;", "Lpg0/k0;", "f", "(Lzf0/q0$b;)Lpg0/k0;", "otherWorker", "", "a", "(Ly20/o;)Z", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Landroid/content/Context;", "c", "Lzf0/e0;", DateTokenConverter.CONVERTER_KEY, "Lfi0/c;", "Lpg0/d4$e;", "Ljava/lang/String;", "Lwg0/a;", "g", "Lwg0/a;", "autocaptureState", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GovernmentIdAnalyzeWorker implements y20.o<jn0.s<? extends d0.GovernmentIdImage>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final zf0.e0 governmentIdFeed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final fi0.c sdkFilesManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final IdConfig.e side;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String idClassKey;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private AutocaptureState autocaptureState;

    /* JADX INFO: renamed from: pg0.e0$a */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpg0/e0$a;", "", "Lpg0/d4$e;", "side", "", "idClassKey", "Lpg0/e0;", "a", "(Lpg0/d4$e;Ljava/lang/String;)Lpg0/e0;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        GovernmentIdAnalyzeWorker a(IdConfig.e side, String idClassKey);
    }

    /* JADX INFO: renamed from: pg0.e0$b */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102291a;

        static {
            int[] iArr = new int[zf0.q0.c.values().length];
            try {
                iArr[zf0.q0.c.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zf0.q0.c.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f102291a = iArr;
        }
    }

    /* JADX INFO: renamed from: pg0.e0$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements Flow<jn0.s<? extends d0.GovernmentIdImage>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f102292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GovernmentIdAnalyzeWorker f102293b;

        /* JADX INFO: renamed from: pg0.e0$c$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f102294a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GovernmentIdAnalyzeWorker f102295b;

            /* JADX INFO: renamed from: pg0.e0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker$run$$inlined$mapNotNull$1$2", f = "GovernmentIdAnalyzeWorker.kt", i = {}, l = {72}, m = "emit", n = {}, s = {})
            public static final class C2173a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f102296n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f102297o;

                public C2173a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f102296n = obj;
                    this.f102297o |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker) {
                this.f102294a = flowCollector;
                this.f102295b = governmentIdAnalyzeWorker;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x007f  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                C2173a c2173a;
                jn0.s sVarA;
                if (continuation instanceof C2173a) {
                    c2173a = (C2173a) continuation;
                    int i11 = c2173a.f102297o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c2173a.f102297o = i11 - Integer.MIN_VALUE;
                    } else {
                        c2173a = new C2173a(continuation);
                    }
                } else {
                    c2173a = new C2173a(continuation);
                }
                Object obj2 = c2173a.f102296n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c2173a.f102297o;
                if (i12 == 0) {
                    jn0.t.b(obj2);
                    FlowCollector flowCollector = this.f102294a;
                    Object value = ((jn0.s) obj).getValue();
                    Throwable thE = jn0.s.e(value);
                    if (thE == null) {
                        zf0.q0 q0Var = (zf0.q0) value;
                        if (q0Var instanceof zf0.q0.ParsedIdSide) {
                            zf0.q0.ParsedIdSide parsedIdSide = (zf0.q0.ParsedIdSide) q0Var;
                            ImageIdMetadata metadata = parsedIdSide.getMetadata();
                            if (metadata != null) {
                                GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker = this.f102295b;
                                governmentIdAnalyzeWorker.autocaptureState = wg0.b.b(governmentIdAnalyzeWorker.autocaptureState, metadata);
                                if (wg0.b.a(this.f102295b.autocaptureState)) {
                                    sVarA = jn0.s.a(this.f102295b.e(parsedIdSide));
                                } else {
                                    sVarA = null;
                                }
                            } else {
                                sVarA = jn0.s.a(this.f102295b.e(parsedIdSide));
                            }
                        } else {
                            sVarA = null;
                        }
                    } else {
                        sVarA = jn0.s.a(jn0.s.b(jn0.t.a(thE)));
                    }
                    if (sVarA != null) {
                        c2173a.f102297o = 1;
                        if (flowCollector.emit(sVarA, c2173a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj2);
                }
                return jn0.h0.f84049a;
            }
        }

        public c(Flow flow, GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker) {
            this.f102292a = flow;
            this.f102293b = governmentIdAnalyzeWorker;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super jn0.s<? extends d0.GovernmentIdImage>> flowCollector, Continuation continuation) {
            Object objCollect = this.f102292a.collect(new a(flowCollector, this.f102293b), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : jn0.h0.f84049a;
        }
    }

    public GovernmentIdAnalyzeWorker(Context context, zf0.e0 governmentIdFeed, fi0.c sdkFilesManager, IdConfig.e side, String idClassKey) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(governmentIdFeed, "governmentIdFeed");
        p013kotlin.jvm.internal.s.k(sdkFilesManager, "sdkFilesManager");
        p013kotlin.jvm.internal.s.k(side, "side");
        p013kotlin.jvm.internal.s.k(idClassKey, "idClassKey");
        this.context = context;
        this.governmentIdFeed = governmentIdFeed;
        this.sdkFilesManager = sdkFilesManager;
        this.side = side;
        this.idClassKey = idClassKey;
        this.autocaptureState = new AutocaptureState(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(zf0.q0.ParsedIdSide parsedIdSide) {
        d0.d dVar;
        try {
            String absolutePath = r0.a(parsedIdSide.getBitmap(), this.sdkFilesManager).getAbsolutePath();
            p013kotlin.jvm.internal.s.j(absolutePath, "getAbsolutePath(...)");
            List listE = p013kotlin.collections.v.e(new Frame(absolutePath, null, 2, null));
            int i11 = b.f102291a[parsedIdSide.getSide().ordinal()];
            if (i11 == 1) {
                dVar = d0.d.FRONT;
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = d0.d.BACK;
            }
            String str = this.idClassKey;
            RawExtraction rawExtractionA = null;
            d0.a aVar = d0.a.AUTO;
            zf0.g extractedBarcode = parsedIdSide.getExtractedBarcode();
            if (extractedBarcode != null) {
                rawExtractionA = r4.a(extractedBarcode);
            }
            return jn0.s.b(new d0.GovernmentIdImage(listE, dVar, str, aVar, rawExtractionA, f(parsedIdSide)));
        } catch (IOException e11) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            return jn0.s.b(jn0.t.a(e11));
        }
    }

    private final GovernmentIdDetails f(zf0.q0.ParsedIdSide parsedIdSide) {
        GovernmentIdDetails governmentIdDetailsL;
        zf0.g extractedBarcode = parsedIdSide.getExtractedBarcode();
        if (extractedBarcode != null && (governmentIdDetailsL = z.l(extractedBarcode)) != null) {
            return governmentIdDetailsL;
        }
        ExtractedTexts extractedTexts = parsedIdSide.getExtractedTexts();
        if (extractedTexts != null) {
            return z.m(extractedTexts);
        }
        return null;
    }

    @Override // y20.o
    public boolean a(y20.o<?> otherWorker) {
        p013kotlin.jvm.internal.s.k(otherWorker, "otherWorker");
        return (otherWorker instanceof GovernmentIdAnalyzeWorker) && ((GovernmentIdAnalyzeWorker) otherWorker).side == this.side;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdAnalyzeWorker)) {
            return false;
        }
        GovernmentIdAnalyzeWorker governmentIdAnalyzeWorker = (GovernmentIdAnalyzeWorker) other;
        return p013kotlin.jvm.internal.s.f(this.context, governmentIdAnalyzeWorker.context) && p013kotlin.jvm.internal.s.f(this.governmentIdFeed, governmentIdAnalyzeWorker.governmentIdFeed) && p013kotlin.jvm.internal.s.f(this.sdkFilesManager, governmentIdAnalyzeWorker.sdkFilesManager) && this.side == governmentIdAnalyzeWorker.side && p013kotlin.jvm.internal.s.f(this.idClassKey, governmentIdAnalyzeWorker.idClassKey);
    }

    public int hashCode() {
        return (((((((this.context.hashCode() * 31) + this.governmentIdFeed.hashCode()) * 31) + this.sdkFilesManager.hashCode()) * 31) + this.side.hashCode()) * 31) + this.idClassKey.hashCode();
    }

    @Override // y20.o
    public Flow<jn0.s<? extends d0.GovernmentIdImage>> run() {
        return new c(this.governmentIdFeed, this);
    }

    public String toString() {
        return "GovernmentIdAnalyzeWorker(context=" + this.context + ", governmentIdFeed=" + this.governmentIdFeed + ", sdkFilesManager=" + this.sdkFilesManager + ", side=" + this.side + ", idClassKey=" + this.idClassKey + ")";
    }
}
