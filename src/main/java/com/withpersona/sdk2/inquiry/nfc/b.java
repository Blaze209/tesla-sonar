package com.withpersona.sdk2.inquiry.nfc;

import android.content.Context;
import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import nh0.MrzKey;
import nh0.PassportNfcReaderConfig;
import nh0.PassportNfcStrings;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;
import y20.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0083\u0001\b\u0007\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u001e2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/b;", "Ly20/o;", "Lcom/withpersona/sdk2/inquiry/nfc/a;", "Landroidx/activity/result/ActivityResultLauncher;", "Lnh0/e;", "passportNfcReaderLauncher", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lrh0/c;", "sandboxFlags", "Lfi0/c;", "sdkFilesManager", "", "cardAccessNumber", "Lnh0/b;", "mrzKey", "Lnh0/k;", "passportNfcStrings", "", "Lnh0/c;", "enabledDataGroups", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "stepStyles", "", "theme", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "componentStyles", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroid/content/Context;Lrh0/c;Lfi0/c;Ljava/lang/String;Lnh0/b;Lnh0/k;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;)V", "otherWorker", "", "a", "(Ly20/o;)Z", "Lkotlinx/coroutines/flow/Flow;", "run", "()Lkotlinx/coroutines/flow/Flow;", "b", "Landroidx/activity/result/ActivityResultLauncher;", "c", "Landroid/content/Context;", DateTokenConverter.CONVERTER_KEY, "Lrh0/c;", "e", "Lfi0/c;", "f", "Ljava/lang/String;", "g", "Lnh0/b;", "h", "Lnh0/k;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "j", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "k", "Ljava/lang/Integer;", "l", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements o<com.withpersona.sdk2.inquiry.nfc.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<PassportNfcReaderConfig> passportNfcReaderLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final rh0.c sandboxFlags;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final fi0.c sdkFilesManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String cardAccessNumber;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final MrzKey mrzKey;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final PassportNfcStrings passportNfcStrings;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<nh0.c> enabledDataGroups;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final StepStyles.UiStepStyle stepStyles;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Integer theme;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final GovernmentIdNfcScan.GovernmentIdNfcScanStyles componentStyles;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JU\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/b$a;", "", "", "cardAccessNumber", "Lnh0/b;", "mrzKey", "Lnh0/k;", "passportNfcStrings", "", "Lnh0/c;", "enabledDataGroups", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "", "theme", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "componentStyles", "Lcom/withpersona/sdk2/inquiry/nfc/b;", "a", "(Ljava/lang/String;Lnh0/b;Lnh0/k;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;)Lcom/withpersona/sdk2/inquiry/nfc/b;", "nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        b a(String cardAccessNumber, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends nh0.c> enabledDataGroups, StepStyles.UiStepStyle styles, Integer theme, GovernmentIdNfcScan.GovernmentIdNfcScanStyles componentStyles);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/nfc/a;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker$run$1", f = "ScanNfcWorker.kt", i = {}, l = {63, 87}, m = "invokeSuspend", n = {}, s = {})
    static final class C1196b extends SuspendLambda implements p<FlowCollector<? super com.withpersona.sdk2.inquiry.nfc.a>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f58345n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f58346o;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.b$b$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f58348a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FlowCollector<com.withpersona.sdk2.inquiry.nfc.a> f58349b;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.b$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker$run$1$1", f = "ScanNfcWorker.kt", i = {0, 0}, l = {91, 96}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
            static final class C1197a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f58350n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                Object f58351o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                /* synthetic */ Object f58352p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ a<T> f58353q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f58354r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1197a(a<? super T> aVar, Continuation<? super C1197a> continuation) {
                    super(continuation);
                    this.f58353q = aVar;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f58352p = obj;
                    this.f58354r |= Integer.MIN_VALUE;
                    return this.f58353q.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(b bVar, FlowCollector<? super com.withpersona.sdk2.inquiry.nfc.a> flowCollector) {
                this.f58348a = bVar;
                this.f58349b = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
            
                if (kotlinx.coroutines.DelayKt.delay(r5, r0) == r1) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
            
                if (r9.emit(r8, r0) == r1) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
            
                return r1;
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.withpersona.sdk2.inquiry.nfc.a r8, p013kotlin.coroutines.Continuation<? super jn0.h0> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.withpersona.sdk2.inquiry.nfc.b.C1196b.a.C1197a
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.withpersona.sdk2.inquiry.nfc.b$b$a$a r0 = (com.withpersona.sdk2.inquiry.nfc.b.C1196b.a.C1197a) r0
                    int r1 = r0.f58354r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f58354r = r1
                    goto L18
                L13:
                    com.withpersona.sdk2.inquiry.nfc.b$b$a$a r0 = new com.withpersona.sdk2.inquiry.nfc.b$b$a$a
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f58352p
                    java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f58354r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    jn0.t.b(r9)
                    goto L72
                L2c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L34:
                    java.lang.Object r8 = r0.f58351o
                    com.withpersona.sdk2.inquiry.nfc.a r8 = (com.withpersona.sdk2.inquiry.nfc.a) r8
                    java.lang.Object r2 = r0.f58350n
                    com.withpersona.sdk2.inquiry.nfc.b$b$a r2 = (com.withpersona.sdk2.inquiry.nfc.b.C1196b.a) r2
                    jn0.t.b(r9)     // Catch: android.content.res.Resources.NotFoundException -> L62
                    goto L62
                L40:
                    jn0.t.b(r9)
                    com.withpersona.sdk2.inquiry.nfc.b r9 = r7.f58348a     // Catch: android.content.res.Resources.NotFoundException -> L61
                    android.content.Context r9 = com.withpersona.sdk2.inquiry.nfc.b.d(r9)     // Catch: android.content.res.Resources.NotFoundException -> L61
                    android.content.res.Resources r9 = r9.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L61
                    int r2 = nh0.l.f95044a     // Catch: android.content.res.Resources.NotFoundException -> L61
                    int r9 = r9.getInteger(r2)     // Catch: android.content.res.Resources.NotFoundException -> L61
                    long r5 = (long) r9     // Catch: android.content.res.Resources.NotFoundException -> L61
                    r0.f58350n = r7     // Catch: android.content.res.Resources.NotFoundException -> L61
                    r0.f58351o = r8     // Catch: android.content.res.Resources.NotFoundException -> L61
                    r0.f58354r = r4     // Catch: android.content.res.Resources.NotFoundException -> L61
                    java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r5, r0)     // Catch: android.content.res.Resources.NotFoundException -> L61
                    if (r9 != r1) goto L61
                    goto L71
                L61:
                    r2 = r7
                L62:
                    kotlinx.coroutines.flow.FlowCollector<com.withpersona.sdk2.inquiry.nfc.a> r9 = r2.f58349b
                    r2 = 0
                    r0.f58350n = r2
                    r0.f58351o = r2
                    r0.f58354r = r3
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto L72
                L71:
                    return r1
                L72:
                    jn0.h0 r8 = jn0.h0.f84049a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.nfc.b.C1196b.a.emit(com.withpersona.sdk2.inquiry.nfc.a, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        C1196b(Continuation<? super C1196b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C1196b c1196b = b.this.new C1196b(continuation);
            c1196b.f58346o = obj;
            return c1196b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
        
            if (r13.emit(r3, r12) == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x010e, code lost:
        
            if (r1.collect(r2, r12) == r0) goto L43;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 279
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.nfc.b.C1196b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super com.withpersona.sdk2.inquiry.nfc.a> flowCollector, Continuation<? super h0> continuation) {
            return ((C1196b) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(ActivityResultLauncher<PassportNfcReaderConfig> passportNfcReaderLauncher, Context context, rh0.c sandboxFlags, fi0.c sdkFilesManager, String cardAccessNumber, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List<? extends nh0.c> enabledDataGroups, StepStyles.UiStepStyle uiStepStyle, Integer num, GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        s.k(passportNfcReaderLauncher, "passportNfcReaderLauncher");
        s.k(context, "context");
        s.k(sandboxFlags, "sandboxFlags");
        s.k(sdkFilesManager, "sdkFilesManager");
        s.k(cardAccessNumber, "cardAccessNumber");
        s.k(mrzKey, "mrzKey");
        s.k(passportNfcStrings, "passportNfcStrings");
        s.k(enabledDataGroups, "enabledDataGroups");
        this.passportNfcReaderLauncher = passportNfcReaderLauncher;
        this.context = context;
        this.sandboxFlags = sandboxFlags;
        this.sdkFilesManager = sdkFilesManager;
        this.cardAccessNumber = cardAccessNumber;
        this.mrzKey = mrzKey;
        this.passportNfcStrings = passportNfcStrings;
        this.enabledDataGroups = enabledDataGroups;
        this.stepStyles = uiStepStyle;
        this.theme = num;
        this.componentStyles = governmentIdNfcScanStyles;
    }

    @Override // y20.o
    public boolean a(o<?> otherWorker) {
        s.k(otherWorker, "otherWorker");
        return otherWorker instanceof b;
    }

    @Override // y20.o
    public Flow<com.withpersona.sdk2.inquiry.nfc.a> run() {
        return FlowKt.flow(new C1196b(null));
    }
}
