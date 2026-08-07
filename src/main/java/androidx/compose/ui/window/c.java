package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.z0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import g4.y;
import java.util.List;
import java.util.UUID;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.Function0;
import p020r2.d4;
import p020r2.g2;
import p020r2.k0;
import p020r2.k2;
import p020r2.l0;
import p020r2.n3;
import p020r2.w;
import p020r2.w2;
import p020r2.x;
import p020r2.y3;
import z3.i0;
import z3.j0;
import z3.v;
import z3.w0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aP\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aA\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0010*\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001c\u001a\u00020\u0015*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!\" \u0010'\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)²\u0006\u0012\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, d2 = {"Ld3/c;", "alignment", "Lw4/n;", "offset", "Lkotlin/Function0;", "Ljn0/h0;", "onDismissRequest", "Landroidx/compose/ui/window/s;", "properties", "content", "c", "(Ld3/c;JLwn0/a;Landroidx/compose/ui/window/s;Lwn0/p;Lr2/l;II)V", "Landroidx/compose/ui/window/r;", "popupPositionProvider", "a", "(Landroidx/compose/ui/window/r;Lwn0/a;Landroidx/compose/ui/window/s;Lwn0/p;Lr2/l;II)V", "", "focusable", "Landroidx/compose/ui/window/t;", "securePolicy", "clippingEnabled", "", "h", "(ZLandroidx/compose/ui/window/t;Z)I", "Landroid/view/View;", "j", "(Landroid/view/View;)Z", "isParentFlagSecureEnabled", IntegerTokenConverter.CONVERTER_KEY, "(Landroidx/compose/ui/window/s;Z)I", "Landroid/graphics/Rect;", "Lw4/p;", "k", "(Landroid/graphics/Rect;)Lw4/p;", "Lr2/g2;", "", "Lr2/g2;", "getLocalPopupTestTag", "()Lr2/g2;", "LocalPopupTestTag", "currentContent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<String> f6313a = w.d(null, a.f6314c, 1, null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f6314c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d3.c f6315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f6316d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f6317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ s f6318f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f6319g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f6320h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f6321i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(d3.c cVar, long j11, wn0.a<h0> aVar, s sVar, wn0.p<? super p020r2.l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f6315c = cVar;
            this.f6316d = j11;
            this.f6317e = aVar;
            this.f6318f = sVar;
            this.f6319g = pVar;
            this.f6320h = i11;
            this.f6321i = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            c.c(this.f6315c, this.f6316d, this.f6317e, this.f6318f, this.f6319g, lVar, k2.a(this.f6320h | 1), this.f6321i);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.window.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class C0142c extends p013kotlin.jvm.internal.u implements wn0.l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f6322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f6323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ s f6324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f6325f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ w4.t f6326g;

        /* JADX INFO: renamed from: androidx.compose.ui.window.c$c$a */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/c$c$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ m f6327a;

            public a(m mVar) {
                this.f6327a = mVar;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f6327a.e();
                this.f6327a.m();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0142c(m mVar, wn0.a<h0> aVar, s sVar, String str, w4.t tVar) {
            super(1);
            this.f6322c = mVar;
            this.f6323d = aVar;
            this.f6324e = sVar;
            this.f6325f = str;
            this.f6326g = tVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 l0Var) {
            this.f6322c.q();
            this.f6322c.s(this.f6323d, this.f6324e, this.f6325f, this.f6326g);
            return new a(this.f6322c);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f6328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f6329d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ s f6330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f6331f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ w4.t f6332g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(m mVar, wn0.a<h0> aVar, s sVar, String str, w4.t tVar) {
            super(0);
            this.f6328c = mVar;
            this.f6329d = aVar;
            this.f6330e = sVar;
            this.f6331f = str;
            this.f6332g = tVar;
        }

        public final void b() {
            this.f6328c.s(this.f6329d, this.f6330e, this.f6331f, this.f6332g);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.l<l0, k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f6333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r f6334d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/c$e$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements k0 {
            @Override // p020r2.k0
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(m mVar, r rVar) {
            super(1);
            this.f6333c = mVar;
            this.f6334d = rVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke(l0 l0Var) {
            this.f6333c.setPositionProvider(this.f6334d);
            this.f6333c.w();
            return new a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", i = {0}, l = {377}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6335n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f6336o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ m f6337p;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<Long, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f6338c = new a();

            a() {
                super(1);
            }

            public final void a(long j11) {
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(Long l11) {
                a(l11.longValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(m mVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f6337p = mVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = new f(this.f6337p, continuation);
            fVar.f6336o = obj;
            return fVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0029  */
        /* JADX WARN: Code duplicated, block: B:13:0x0035 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.f6335n
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r3.f6336o
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                jn0.t.b(r4)
                goto L36
            L13:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L1b:
                jn0.t.b(r4)
                java.lang.Object r4 = r3.f6336o
                kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
                r1 = r4
            L23:
                boolean r4 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
                if (r4 == 0) goto L3c
                androidx.compose.ui.window.c$f$a r4 = androidx.compose.ui.window.c.f.a.f6338c
                r3.f6336o = r1
                r3.f6335n = r2
                java.lang.Object r4 = androidx.compose.ui.platform.l1.a(r4, r3)
                if (r4 != r0) goto L36
                return r0
            L36:
                androidx.compose.ui.window.m r4 = r3.f6337p
                r4.p()
                goto L23
            L3c:
                jn0.h0 r4 = jn0.h0.f84049a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz3/v;", "childCoordinates", "Ljn0/h0;", "a", "(Lz3/v;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.l<v, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f6339c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(m mVar) {
            super(1);
            this.f6339c = mVar;
        }

        public final void a(v vVar) {
            v vVarM = vVar.M();
            p013kotlin.jvm.internal.s.h(vVarM);
            this.f6339c.u(vVarM);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(v vVar) {
            a(vVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f6343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f6344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ s f6345e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, h0> f6346f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f6347g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f6348h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(r rVar, wn0.a<h0> aVar, s sVar, wn0.p<? super p020r2.l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f6343c = rVar;
            this.f6344d = aVar;
            this.f6345e = sVar;
            this.f6346f = pVar;
            this.f6347g = i11;
            this.f6348h = i12;
        }

        public final void a(p020r2.l lVar, int i11) {
            c.a(this.f6343c, this.f6344d, this.f6345e, this.f6346f, lVar, k2.a(this.f6347g | 1), this.f6348h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "b", "()Ljava/util/UUID;"}, k = 3, mv = {1, 8, 0})
    static final class j extends p013kotlin.jvm.internal.u implements wn0.a<UUID> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f6349c = new j();

        j() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class k extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f6350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y3<wn0.p<p020r2.l, Integer, h0>> f6351d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg4/y;", "Ljn0/h0;", "a", "(Lg4/y;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<y, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f6352c = new a();

            a() {
                super(1);
            }

            public final void a(y yVar) {
                g4.v.R(yVar);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(y yVar) {
                a(yVar);
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw4/r;", "it", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.l<w4.r, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m f6353c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(m mVar) {
                super(1);
                this.f6353c = mVar;
            }

            public final void a(long j11) {
                this.f6353c.m5setPopupContentSizefhxjrPA(w4.r.b(j11));
                this.f6353c.w();
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(w4.r rVar) {
                a(rVar.getPackedValue());
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.window.c$k$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class C0143c extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y3<wn0.p<p020r2.l, Integer, h0>> f6354c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0143c(y3<? extends wn0.p<? super p020r2.l, ? super Integer, h0>> y3Var) {
                super(2);
                this.f6354c = y3Var;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(606497925, i11, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:332)");
                }
                c.b(this.f6354c).invoke(lVar, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(m mVar, y3<? extends wn0.p<? super p020r2.l, ? super Integer, h0>> y3Var) {
            super(2);
            this.f6350c = mVar;
            this.f6351d = y3Var;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1302892335, i11, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:321)");
            }
            androidx.compose.ui.d dVarD = g4.o.d(androidx.compose.ui.d.INSTANCE, false, a.f6352c, 1, null);
            boolean zK = lVar.K(this.f6350c);
            m mVar = this.f6350c;
            Object objI = lVar.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new b(mVar);
                lVar.B(objI);
            }
            androidx.compose.ui.d dVarA = h3.a.a(androidx.compose.ui.layout.e.a(dVarD, (wn0.l) objI), this.f6350c.getCanCalculatePosition() ? 1.0f : BitmapDescriptorFactory.HUE_RED);
            z2.a aVarE = z2.c.e(606497925, true, new C0143c(this.f6351d), lVar, 54);
            androidx.compose.ui.window.d dVar = androidx.compose.ui.window.d.f6355a;
            int iA = p020r2.j.a(lVar, 0);
            x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarA);
            b4.g.Companion aVar = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = aVar.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = d4.a(lVar);
            d4.b(lVarA, dVar, aVar.c());
            d4.b(lVarA, xVarC, aVar.e());
            wn0.p<b4.g, Integer, h0> pVarB = aVar.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE, aVar.d());
            aVarE.invoke(lVar, 6);
            lVar.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:103:0x0207  */
    /* JADX WARN: Code duplicated, block: B:105:0x020d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0228  */
    /* JADX WARN: Code duplicated, block: B:110:0x022e  */
    /* JADX WARN: Code duplicated, block: B:113:0x024b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0251  */
    /* JADX WARN: Code duplicated, block: B:118:0x0274  */
    /* JADX WARN: Code duplicated, block: B:121:0x0280  */
    /* JADX WARN: Code duplicated, block: B:122:0x0284  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:130:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:134:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x0068  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x0119  */
    /* JADX WARN: Code duplicated, block: B:65:0x0149  */
    /* JADX WARN: Code duplicated, block: B:68:0x015c  */
    /* JADX WARN: Code duplicated, block: B:69:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0166  */
    /* JADX WARN: Code duplicated, block: B:73:0x0168  */
    /* JADX WARN: Code duplicated, block: B:76:0x017c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0182  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ea  */
    public static final void a(r rVar, wn0.a<h0> aVar, s sVar, wn0.p<? super p020r2.l, ? super Integer, h0> pVar, p020r2.l lVar, int i11, int i12) {
        int i13;
        wn0.a<h0> aVar2;
        int i14;
        s sVar2;
        int i15;
        int i16;
        int i17;
        wn0.a<h0> aVar3;
        s sVar3;
        View view;
        w4.d dVar;
        String str;
        w4.t tVar;
        p020r2.q qVarD;
        y3 y3VarO;
        UUID uuid;
        Object objI;
        p020r2.l.Companion aVar4;
        p020r2.l lVar2;
        int i18;
        String str2;
        boolean z11;
        m mVar;
        int i19;
        boolean z12;
        int i21;
        boolean z13;
        boolean zN;
        Object objI2;
        boolean z14;
        boolean z15;
        boolean zN2;
        Object objI3;
        int i22;
        boolean z16;
        Object objI4;
        boolean zK;
        Object objI5;
        boolean zK2;
        Object objI6;
        boolean zK3;
        Object objI7;
        int iA;
        wn0.a<b4.g> aVarA;
        p020r2.l lVarA;
        wn0.p<b4.g, Integer, h0> pVarB;
        wn0.a<h0> aVar5;
        s sVar4;
        w2 w2VarX;
        r rVar2 = rVar;
        p020r2.l lVarV = lVar.v(-830247068);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(rVar2) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i23 = i12 & 2;
        if (i23 == 0) {
            if ((i11 & 48) == 0) {
                aVar2 = aVar;
                i13 |= lVarV.K(aVar2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    sVar2 = sVar;
                    if (lVarV.n(sVar2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                if ((i12 & 8) != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    if (lVarV.K(pVar)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i13 |= i16;
                }
                i17 = i13;
                if ((i17 & 1171) == 1170 || !lVarV.b()) {
                    if (i23 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if (i14 != 0) {
                        sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        sVar3 = sVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(-830247068, i17, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:302)");
                    }
                    view = (View) lVarV.U(AndroidCompositionLocals_androidKt.k());
                    dVar = (w4.d) lVarV.U(z0.g());
                    str = (String) lVarV.U(f6313a);
                    tVar = (w4.t) lVarV.U(z0.m());
                    qVarD = p020r2.j.d(lVarV, 0);
                    y3VarO = n3.o(pVar, lVarV, (i17 >> 9) & 14);
                    uuid = (UUID) a3.b.c(new Object[0], null, null, j.f6349c, lVarV, 3072, 6);
                    objI = lVarV.I();
                    aVar4 = p020r2.l.INSTANCE;
                    if (objI == aVar4.a()) {
                        i18 = i17;
                        lVar2 = lVarV;
                        z11 = true;
                        str2 = str;
                        m mVar2 = new m(aVar3, sVar3, str2, view, dVar, rVar2, uuid, null, 128, null);
                        rVar2 = rVar2;
                        mVar2.setContent(qVarD, z2.c.c(1302892335, true, new k(mVar2, y3VarO)));
                        lVar2.B(mVar2);
                        objI = mVar2;
                    } else {
                        lVar2 = lVarV;
                        i18 = i17;
                        str2 = str;
                        z11 = true;
                    }
                    mVar = (m) objI;
                    boolean zK4 = lVar2.K(mVar);
                    i19 = i18 & 112;
                    if (i19 == 32) {
                        z12 = z11;
                    } else {
                        z12 = false;
                    }
                    boolean z17 = zK4 | z12;
                    i21 = i18 & 896;
                    if (i21 == 256) {
                        z13 = z11;
                    } else {
                        z13 = false;
                    }
                    zN = z17 | z13 | lVar2.n(str2) | lVar2.n(tVar);
                    objI2 = lVar2.I();
                    if (zN || objI2 == aVar4.a()) {
                        objI2 = new C0142c(mVar, aVar3, sVar3, str2, tVar);
                        lVar2.B(objI2);
                    }
                    Function0.c(mVar, (wn0.l) objI2, lVar2, 0);
                    boolean zK5 = lVar2.K(mVar);
                    if (i19 == 32) {
                        z14 = z11;
                    } else {
                        z14 = false;
                    }
                    boolean z18 = zK5 | z14;
                    if (i21 == 256) {
                        z15 = z11;
                    } else {
                        z15 = false;
                    }
                    zN2 = z18 | z15 | lVar2.n(str2) | lVar2.n(tVar);
                    objI3 = lVar2.I();
                    if (zN2 || objI3 == aVar4.a()) {
                        objI3 = new d(mVar, aVar3, sVar3, str2, tVar);
                        lVar2.B(objI3);
                    }
                    Function0.i((wn0.a) objI3, lVar2, 0);
                    boolean zK6 = lVar2.K(mVar);
                    i22 = i18 & 14;
                    if (i22 != 4) {
                        z11 = false;
                    }
                    z16 = zK6 | z11;
                    objI4 = lVar2.I();
                    if (z16 || objI4 == aVar4.a()) {
                        objI4 = new e(mVar, rVar2);
                        lVar2.B(objI4);
                    }
                    Function0.c(rVar2, (wn0.l) objI4, lVar2, i22);
                    zK = lVar2.K(mVar);
                    objI5 = lVar2.I();
                    if (zK || objI5 == aVar4.a()) {
                        objI5 = new f(mVar, null);
                        lVar2.B(objI5);
                    }
                    Function0.g(mVar, (wn0.p) objI5, lVar2, 0);
                    androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
                    zK2 = lVar2.K(mVar);
                    objI6 = lVar2.I();
                    if (zK2 || objI6 == aVar4.a()) {
                        objI6 = new g(mVar);
                        lVar2.B(objI6);
                    }
                    androidx.compose.ui.d dVarA = androidx.compose.ui.layout.c.a(companion, (wn0.l) objI6);
                    zK3 = lVar2.K(mVar) | lVar2.n(tVar);
                    objI7 = lVar2.I();
                    if (zK3 || objI7 == aVar4.a()) {
                        objI7 = new h(mVar, tVar);
                        lVar2.B(objI7);
                    }
                    i0 i0Var = (i0) objI7;
                    iA = p020r2.j.a(lVar2, 0);
                    x xVarC = lVar2.c();
                    androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar2, dVarA);
                    b4.g.Companion aVar6 = b4.g.INSTANCE;
                    aVarA = aVar6.a();
                    if (lVar2.w() == null) {
                        p020r2.j.c();
                    }
                    lVar2.h();
                    if (lVar2.getInserting()) {
                        lVar2.z(aVarA);
                    } else {
                        lVar2.d();
                    }
                    lVarA = d4.a(lVar2);
                    d4.b(lVarA, i0Var, aVar6.c());
                    d4.b(lVarA, xVarC, aVar6.e());
                    pVarB = aVar6.b();
                    if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    d4.b(lVarA, dVarE, aVar6.d());
                    lVar2.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    aVar5 = aVar3;
                    sVar4 = sVar3;
                } else {
                    lVarV.j();
                    aVar5 = aVar2;
                    lVar2 = lVarV;
                    sVar4 = sVar2;
                }
                w2VarX = lVar2.x();
                if (w2VarX != null) {
                    w2VarX.a(new i(rVar2, aVar5, sVar4, pVar, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            sVar2 = sVar;
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                if (lVarV.K(pVar)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i13 |= i16;
            }
            i17 = i13;
            if ((i17 & 1171) == 1170) {
                if (i23 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (i14 != 0) {
                    sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                } else {
                    sVar3 = sVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-830247068, i17, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:302)");
                }
                view = (View) lVarV.U(AndroidCompositionLocals_androidKt.k());
                dVar = (w4.d) lVarV.U(z0.g());
                str = (String) lVarV.U(f6313a);
                tVar = (w4.t) lVarV.U(z0.m());
                qVarD = p020r2.j.d(lVarV, 0);
                y3VarO = n3.o(pVar, lVarV, (i17 >> 9) & 14);
                uuid = (UUID) a3.b.c(new Object[0], null, null, j.f6349c, lVarV, 3072, 6);
                objI = lVarV.I();
                aVar4 = p020r2.l.INSTANCE;
                if (objI == aVar4.a()) {
                    i18 = i17;
                    lVar2 = lVarV;
                    z11 = true;
                    str2 = str;
                    m mVar3 = new m(aVar3, sVar3, str2, view, dVar, rVar2, uuid, null, 128, null);
                    rVar2 = rVar2;
                    mVar3.setContent(qVarD, z2.c.c(1302892335, true, new k(mVar3, y3VarO)));
                    lVar2.B(mVar3);
                    objI = mVar3;
                } else {
                    lVar2 = lVarV;
                    i18 = i17;
                    str2 = str;
                    z11 = true;
                }
                mVar = (m) objI;
                boolean zK7 = lVar2.K(mVar);
                i19 = i18 & 112;
                if (i19 == 32) {
                    z12 = z11;
                } else {
                    z12 = false;
                }
                boolean z19 = zK7 | z12;
                i21 = i18 & 896;
                if (i21 == 256) {
                    z13 = z11;
                } else {
                    z13 = false;
                }
                zN = z19 | z13 | lVar2.n(str2) | lVar2.n(tVar);
                objI2 = lVar2.I();
                if (zN) {
                    objI2 = new C0142c(mVar, aVar3, sVar3, str2, tVar);
                    lVar2.B(objI2);
                } else {
                    objI2 = new C0142c(mVar, aVar3, sVar3, str2, tVar);
                    lVar2.B(objI2);
                }
                Function0.c(mVar, (wn0.l) objI2, lVar2, 0);
                boolean zK8 = lVar2.K(mVar);
                if (i19 == 32) {
                    z14 = z11;
                } else {
                    z14 = false;
                }
                boolean z110 = zK8 | z14;
                if (i21 == 256) {
                    z15 = z11;
                } else {
                    z15 = false;
                }
                zN2 = z110 | z15 | lVar2.n(str2) | lVar2.n(tVar);
                objI3 = lVar2.I();
                if (zN2) {
                    objI3 = new d(mVar, aVar3, sVar3, str2, tVar);
                    lVar2.B(objI3);
                } else {
                    objI3 = new d(mVar, aVar3, sVar3, str2, tVar);
                    lVar2.B(objI3);
                }
                Function0.i((wn0.a) objI3, lVar2, 0);
                boolean zK9 = lVar2.K(mVar);
                i22 = i18 & 14;
                if (i22 != 4) {
                    z11 = false;
                }
                z16 = zK9 | z11;
                objI4 = lVar2.I();
                if (z16) {
                    objI4 = new e(mVar, rVar2);
                    lVar2.B(objI4);
                } else {
                    objI4 = new e(mVar, rVar2);
                    lVar2.B(objI4);
                }
                Function0.c(rVar2, (wn0.l) objI4, lVar2, i22);
                zK = lVar2.K(mVar);
                objI5 = lVar2.I();
                if (zK) {
                    objI5 = new f(mVar, null);
                    lVar2.B(objI5);
                } else {
                    objI5 = new f(mVar, null);
                    lVar2.B(objI5);
                }
                Function0.g(mVar, (wn0.p) objI5, lVar2, 0);
                androidx.compose.ui.d.Companion companion2 = androidx.compose.ui.d.INSTANCE;
                zK2 = lVar2.K(mVar);
                objI6 = lVar2.I();
                if (zK2) {
                    objI6 = new g(mVar);
                    lVar2.B(objI6);
                } else {
                    objI6 = new g(mVar);
                    lVar2.B(objI6);
                }
                androidx.compose.ui.d dVarA2 = androidx.compose.ui.layout.c.a(companion2, (wn0.l) objI6);
                zK3 = lVar2.K(mVar) | lVar2.n(tVar);
                objI7 = lVar2.I();
                if (zK3) {
                    objI7 = new h(mVar, tVar);
                    lVar2.B(objI7);
                } else {
                    objI7 = new h(mVar, tVar);
                    lVar2.B(objI7);
                }
                i0 i0Var2 = (i0) objI7;
                iA = p020r2.j.a(lVar2, 0);
                x xVarC2 = lVar2.c();
                androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVar2, dVarA2);
                b4.g.Companion aVar7 = b4.g.INSTANCE;
                aVarA = aVar7.a();
                if (lVar2.w() == null) {
                    p020r2.j.c();
                }
                lVar2.h();
                if (lVar2.getInserting()) {
                    lVar2.z(aVarA);
                } else {
                    lVar2.d();
                }
                lVarA = d4.a(lVar2);
                d4.b(lVarA, i0Var2, aVar7.c());
                d4.b(lVarA, xVarC2, aVar7.e());
                pVarB = aVar7.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE2, aVar7.d());
                lVar2.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                aVar5 = aVar3;
                sVar4 = sVar3;
            } else {
                if (i23 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (i14 != 0) {
                    sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                } else {
                    sVar3 = sVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-830247068, i17, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:302)");
                }
                view = (View) lVarV.U(AndroidCompositionLocals_androidKt.k());
                dVar = (w4.d) lVarV.U(z0.g());
                str = (String) lVarV.U(f6313a);
                tVar = (w4.t) lVarV.U(z0.m());
                qVarD = p020r2.j.d(lVarV, 0);
                y3VarO = n3.o(pVar, lVarV, (i17 >> 9) & 14);
                uuid = (UUID) a3.b.c(new Object[0], null, null, j.f6349c, lVarV, 3072, 6);
                objI = lVarV.I();
                aVar4 = p020r2.l.INSTANCE;
                if (objI == aVar4.a()) {
                    i18 = i17;
                    lVar2 = lVarV;
                    z11 = true;
                    str2 = str;
                    m mVar4 = new m(aVar3, sVar3, str2, view, dVar, rVar2, uuid, null, 128, null);
                    rVar2 = rVar2;
                    mVar4.setContent(qVarD, z2.c.c(1302892335, true, new k(mVar4, y3VarO)));
                    lVar2.B(mVar4);
                    objI = mVar4;
                } else {
                    lVar2 = lVarV;
                    i18 = i17;
                    str2 = str;
                    z11 = true;
                }
                mVar = (m) objI;
                boolean zK10 = lVar2.K(mVar);
                i19 = i18 & 112;
                if (i19 == 32) {
                    z12 = z11;
                } else {
                    z12 = false;
                }
                boolean z111 = zK10 | z12;
                i21 = i18 & 896;
                if (i21 == 256) {
                    z13 = z11;
                } else {
                    z13 = false;
                }
                zN = z111 | z13 | lVar2.n(str2) | lVar2.n(tVar);
                objI2 = lVar2.I();
                if (zN) {
                    objI2 = new C0142c(mVar, aVar3, sVar3, str2, tVar);
                    lVar2.B(objI2);
                } else {
                    objI2 = new C0142c(mVar, aVar3, sVar3, str2, tVar);
                    lVar2.B(objI2);
                }
                Function0.c(mVar, (wn0.l) objI2, lVar2, 0);
                boolean zK11 = lVar2.K(mVar);
                if (i19 == 32) {
                    z14 = z11;
                } else {
                    z14 = false;
                }
                boolean z112 = zK11 | z14;
                if (i21 == 256) {
                    z15 = z11;
                } else {
                    z15 = false;
                }
                zN2 = z112 | z15 | lVar2.n(str2) | lVar2.n(tVar);
                objI3 = lVar2.I();
                if (zN2) {
                    objI3 = new d(mVar, aVar3, sVar3, str2, tVar);
                    lVar2.B(objI3);
                } else {
                    objI3 = new d(mVar, aVar3, sVar3, str2, tVar);
                    lVar2.B(objI3);
                }
                Function0.i((wn0.a) objI3, lVar2, 0);
                boolean zK12 = lVar2.K(mVar);
                i22 = i18 & 14;
                if (i22 != 4) {
                    z11 = false;
                }
                z16 = zK12 | z11;
                objI4 = lVar2.I();
                if (z16) {
                    objI4 = new e(mVar, rVar2);
                    lVar2.B(objI4);
                } else {
                    objI4 = new e(mVar, rVar2);
                    lVar2.B(objI4);
                }
                Function0.c(rVar2, (wn0.l) objI4, lVar2, i22);
                zK = lVar2.K(mVar);
                objI5 = lVar2.I();
                if (zK) {
                    objI5 = new f(mVar, null);
                    lVar2.B(objI5);
                } else {
                    objI5 = new f(mVar, null);
                    lVar2.B(objI5);
                }
                Function0.g(mVar, (wn0.p) objI5, lVar2, 0);
                androidx.compose.ui.d.Companion companion3 = androidx.compose.ui.d.INSTANCE;
                zK2 = lVar2.K(mVar);
                objI6 = lVar2.I();
                if (zK2) {
                    objI6 = new g(mVar);
                    lVar2.B(objI6);
                } else {
                    objI6 = new g(mVar);
                    lVar2.B(objI6);
                }
                androidx.compose.ui.d dVarA3 = androidx.compose.ui.layout.c.a(companion3, (wn0.l) objI6);
                zK3 = lVar2.K(mVar) | lVar2.n(tVar);
                objI7 = lVar2.I();
                if (zK3) {
                    objI7 = new h(mVar, tVar);
                    lVar2.B(objI7);
                } else {
                    objI7 = new h(mVar, tVar);
                    lVar2.B(objI7);
                }
                i0 i0Var3 = (i0) objI7;
                iA = p020r2.j.a(lVar2, 0);
                x xVarC3 = lVar2.c();
                androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVar2, dVarA3);
                b4.g.Companion aVar8 = b4.g.INSTANCE;
                aVarA = aVar8.a();
                if (lVar2.w() == null) {
                    p020r2.j.c();
                }
                lVar2.h();
                if (lVar2.getInserting()) {
                    lVar2.z(aVarA);
                } else {
                    lVar2.d();
                }
                lVarA = d4.a(lVar2);
                d4.b(lVarA, i0Var3, aVar8.c());
                d4.b(lVarA, xVarC3, aVar8.e());
                pVarB = aVar8.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE3, aVar8.d());
                lVar2.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                aVar5 = aVar3;
                sVar4 = sVar3;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new i(rVar2, aVar5, sVar4, pVar, i11, i12));
            }
        }
        i13 |= 48;
        aVar2 = aVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                sVar2 = sVar;
                if (lVarV.n(sVar2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                if (lVarV.K(pVar)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i13 |= i16;
            }
            i17 = i13;
            if ((i17 & 1171) == 1170) {
                if (i23 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (i14 != 0) {
                    sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                } else {
                    sVar3 = sVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-830247068, i17, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:302)");
                }
                view = (View) lVarV.U(AndroidCompositionLocals_androidKt.k());
                dVar = (w4.d) lVarV.U(z0.g());
                str = (String) lVarV.U(f6313a);
                tVar = (w4.t) lVarV.U(z0.m());
                qVarD = p020r2.j.d(lVarV, 0);
                y3VarO = n3.o(pVar, lVarV, (i17 >> 9) & 14);
                uuid = (UUID) a3.b.c(new Object[0], null, null, j.f6349c, lVarV, 3072, 6);
                objI = lVarV.I();
                aVar4 = p020r2.l.INSTANCE;
                if (objI == aVar4.a()) {
                    i18 = i17;
                    lVar2 = lVarV;
                    z11 = true;
                    str2 = str;
                    m mVar5 = new m(aVar3, sVar3, str2, view, dVar, rVar2, uuid, null, 128, null);
                    rVar2 = rVar2;
                    mVar5.setContent(qVarD, z2.c.c(1302892335, true, new k(mVar5, y3VarO)));
                    lVar2.B(mVar5);
                    objI = mVar5;
                } else {
                    lVar2 = lVarV;
                    i18 = i17;
                    str2 = str;
                    z11 = true;
                }
                mVar = (m) objI;
                boolean zK13 = lVar2.K(mVar);
                i19 = i18 & 112;
                if (i19 == 32) {
                    z12 = z11;
                } else {
                    z12 = false;
                }
                boolean z113 = zK13 | z12;
                i21 = i18 & 896;
                if (i21 == 256) {
                    z13 = z11;
                } else {
                    z13 = false;
                }
                zN = z113 | z13 | lVar2.n(str2) | lVar2.n(tVar);
                objI2 = lVar2.I();
                if (zN) {
                    objI2 = new C0142c(mVar, aVar3, sVar3, str2, tVar);
                    lVar2.B(objI2);
                } else {
                    objI2 = new C0142c(mVar, aVar3, sVar3, str2, tVar);
                    lVar2.B(objI2);
                }
                Function0.c(mVar, (wn0.l) objI2, lVar2, 0);
                boolean zK14 = lVar2.K(mVar);
                if (i19 == 32) {
                    z14 = z11;
                } else {
                    z14 = false;
                }
                boolean z114 = zK14 | z14;
                if (i21 == 256) {
                    z15 = z11;
                } else {
                    z15 = false;
                }
                zN2 = z114 | z15 | lVar2.n(str2) | lVar2.n(tVar);
                objI3 = lVar2.I();
                if (zN2) {
                    objI3 = new d(mVar, aVar3, sVar3, str2, tVar);
                    lVar2.B(objI3);
                } else {
                    objI3 = new d(mVar, aVar3, sVar3, str2, tVar);
                    lVar2.B(objI3);
                }
                Function0.i((wn0.a) objI3, lVar2, 0);
                boolean zK15 = lVar2.K(mVar);
                i22 = i18 & 14;
                if (i22 != 4) {
                    z11 = false;
                }
                z16 = zK15 | z11;
                objI4 = lVar2.I();
                if (z16) {
                    objI4 = new e(mVar, rVar2);
                    lVar2.B(objI4);
                } else {
                    objI4 = new e(mVar, rVar2);
                    lVar2.B(objI4);
                }
                Function0.c(rVar2, (wn0.l) objI4, lVar2, i22);
                zK = lVar2.K(mVar);
                objI5 = lVar2.I();
                if (zK) {
                    objI5 = new f(mVar, null);
                    lVar2.B(objI5);
                } else {
                    objI5 = new f(mVar, null);
                    lVar2.B(objI5);
                }
                Function0.g(mVar, (wn0.p) objI5, lVar2, 0);
                androidx.compose.ui.d.Companion companion4 = androidx.compose.ui.d.INSTANCE;
                zK2 = lVar2.K(mVar);
                objI6 = lVar2.I();
                if (zK2) {
                    objI6 = new g(mVar);
                    lVar2.B(objI6);
                } else {
                    objI6 = new g(mVar);
                    lVar2.B(objI6);
                }
                androidx.compose.ui.d dVarA4 = androidx.compose.ui.layout.c.a(companion4, (wn0.l) objI6);
                zK3 = lVar2.K(mVar) | lVar2.n(tVar);
                objI7 = lVar2.I();
                if (zK3) {
                    objI7 = new h(mVar, tVar);
                    lVar2.B(objI7);
                } else {
                    objI7 = new h(mVar, tVar);
                    lVar2.B(objI7);
                }
                i0 i0Var4 = (i0) objI7;
                iA = p020r2.j.a(lVar2, 0);
                x xVarC4 = lVar2.c();
                androidx.compose.ui.d dVarE4 = androidx.compose.ui.c.e(lVar2, dVarA4);
                b4.g.Companion aVar9 = b4.g.INSTANCE;
                aVarA = aVar9.a();
                if (lVar2.w() == null) {
                    p020r2.j.c();
                }
                lVar2.h();
                if (lVar2.getInserting()) {
                    lVar2.z(aVarA);
                } else {
                    lVar2.d();
                }
                lVarA = d4.a(lVar2);
                d4.b(lVarA, i0Var4, aVar9.c());
                d4.b(lVarA, xVarC4, aVar9.e());
                pVarB = aVar9.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE4, aVar9.d());
                lVar2.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                aVar5 = aVar3;
                sVar4 = sVar3;
            } else {
                if (i23 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (i14 != 0) {
                    sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                } else {
                    sVar3 = sVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-830247068, i17, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:302)");
                }
                view = (View) lVarV.U(AndroidCompositionLocals_androidKt.k());
                dVar = (w4.d) lVarV.U(z0.g());
                str = (String) lVarV.U(f6313a);
                tVar = (w4.t) lVarV.U(z0.m());
                qVarD = p020r2.j.d(lVarV, 0);
                y3VarO = n3.o(pVar, lVarV, (i17 >> 9) & 14);
                uuid = (UUID) a3.b.c(new Object[0], null, null, j.f6349c, lVarV, 3072, 6);
                objI = lVarV.I();
                aVar4 = p020r2.l.INSTANCE;
                if (objI == aVar4.a()) {
                    i18 = i17;
                    lVar2 = lVarV;
                    z11 = true;
                    str2 = str;
                    m mVar6 = new m(aVar3, sVar3, str2, view, dVar, rVar2, uuid, null, 128, null);
                    rVar2 = rVar2;
                    mVar6.setContent(qVarD, z2.c.c(1302892335, true, new k(mVar6, y3VarO)));
                    lVar2.B(mVar6);
                    objI = mVar6;
                } else {
                    lVar2 = lVarV;
                    i18 = i17;
                    str2 = str;
                    z11 = true;
                }
                mVar = (m) objI;
                boolean zK16 = lVar2.K(mVar);
                i19 = i18 & 112;
                if (i19 == 32) {
                    z12 = z11;
                } else {
                    z12 = false;
                }
                boolean z115 = zK16 | z12;
                i21 = i18 & 896;
                if (i21 == 256) {
                    z13 = z11;
                } else {
                    z13 = false;
                }
                zN = z115 | z13 | lVar2.n(str2) | lVar2.n(tVar);
                objI2 = lVar2.I();
                if (zN) {
                    objI2 = new C0142c(mVar, aVar3, sVar3, str2, tVar);
                    lVar2.B(objI2);
                } else {
                    objI2 = new C0142c(mVar, aVar3, sVar3, str2, tVar);
                    lVar2.B(objI2);
                }
                Function0.c(mVar, (wn0.l) objI2, lVar2, 0);
                boolean zK17 = lVar2.K(mVar);
                if (i19 == 32) {
                    z14 = z11;
                } else {
                    z14 = false;
                }
                boolean z116 = zK17 | z14;
                if (i21 == 256) {
                    z15 = z11;
                } else {
                    z15 = false;
                }
                zN2 = z116 | z15 | lVar2.n(str2) | lVar2.n(tVar);
                objI3 = lVar2.I();
                if (zN2) {
                    objI3 = new d(mVar, aVar3, sVar3, str2, tVar);
                    lVar2.B(objI3);
                } else {
                    objI3 = new d(mVar, aVar3, sVar3, str2, tVar);
                    lVar2.B(objI3);
                }
                Function0.i((wn0.a) objI3, lVar2, 0);
                boolean zK18 = lVar2.K(mVar);
                i22 = i18 & 14;
                if (i22 != 4) {
                    z11 = false;
                }
                z16 = zK18 | z11;
                objI4 = lVar2.I();
                if (z16) {
                    objI4 = new e(mVar, rVar2);
                    lVar2.B(objI4);
                } else {
                    objI4 = new e(mVar, rVar2);
                    lVar2.B(objI4);
                }
                Function0.c(rVar2, (wn0.l) objI4, lVar2, i22);
                zK = lVar2.K(mVar);
                objI5 = lVar2.I();
                if (zK) {
                    objI5 = new f(mVar, null);
                    lVar2.B(objI5);
                } else {
                    objI5 = new f(mVar, null);
                    lVar2.B(objI5);
                }
                Function0.g(mVar, (wn0.p) objI5, lVar2, 0);
                androidx.compose.ui.d.Companion companion5 = androidx.compose.ui.d.INSTANCE;
                zK2 = lVar2.K(mVar);
                objI6 = lVar2.I();
                if (zK2) {
                    objI6 = new g(mVar);
                    lVar2.B(objI6);
                } else {
                    objI6 = new g(mVar);
                    lVar2.B(objI6);
                }
                androidx.compose.ui.d dVarA5 = androidx.compose.ui.layout.c.a(companion5, (wn0.l) objI6);
                zK3 = lVar2.K(mVar) | lVar2.n(tVar);
                objI7 = lVar2.I();
                if (zK3) {
                    objI7 = new h(mVar, tVar);
                    lVar2.B(objI7);
                } else {
                    objI7 = new h(mVar, tVar);
                    lVar2.B(objI7);
                }
                i0 i0Var5 = (i0) objI7;
                iA = p020r2.j.a(lVar2, 0);
                x xVarC5 = lVar2.c();
                androidx.compose.ui.d dVarE5 = androidx.compose.ui.c.e(lVar2, dVarA5);
                b4.g.Companion aVar10 = b4.g.INSTANCE;
                aVarA = aVar10.a();
                if (lVar2.w() == null) {
                    p020r2.j.c();
                }
                lVar2.h();
                if (lVar2.getInserting()) {
                    lVar2.z(aVarA);
                } else {
                    lVar2.d();
                }
                lVarA = d4.a(lVar2);
                d4.b(lVarA, i0Var5, aVar10.c());
                d4.b(lVarA, xVarC5, aVar10.e());
                pVarB = aVar10.b();
                if (lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                d4.b(lVarA, dVarE5, aVar10.d());
                lVar2.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                aVar5 = aVar3;
                sVar4 = sVar3;
            }
            w2VarX = lVar2.x();
            if (w2VarX != null) {
                w2VarX.a(new i(rVar2, aVar5, sVar4, pVar, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        sVar2 = sVar;
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            if (lVarV.K(pVar)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i13 |= i16;
        }
        i17 = i13;
        if ((i17 & 1171) == 1170) {
            if (i23 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar2;
            }
            if (i14 != 0) {
                sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
            } else {
                sVar3 = sVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-830247068, i17, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:302)");
            }
            view = (View) lVarV.U(AndroidCompositionLocals_androidKt.k());
            dVar = (w4.d) lVarV.U(z0.g());
            str = (String) lVarV.U(f6313a);
            tVar = (w4.t) lVarV.U(z0.m());
            qVarD = p020r2.j.d(lVarV, 0);
            y3VarO = n3.o(pVar, lVarV, (i17 >> 9) & 14);
            uuid = (UUID) a3.b.c(new Object[0], null, null, j.f6349c, lVarV, 3072, 6);
            objI = lVarV.I();
            aVar4 = p020r2.l.INSTANCE;
            if (objI == aVar4.a()) {
                i18 = i17;
                lVar2 = lVarV;
                z11 = true;
                str2 = str;
                m mVar7 = new m(aVar3, sVar3, str2, view, dVar, rVar2, uuid, null, 128, null);
                rVar2 = rVar2;
                mVar7.setContent(qVarD, z2.c.c(1302892335, true, new k(mVar7, y3VarO)));
                lVar2.B(mVar7);
                objI = mVar7;
            } else {
                lVar2 = lVarV;
                i18 = i17;
                str2 = str;
                z11 = true;
            }
            mVar = (m) objI;
            boolean zK19 = lVar2.K(mVar);
            i19 = i18 & 112;
            if (i19 == 32) {
                z12 = z11;
            } else {
                z12 = false;
            }
            boolean z117 = zK19 | z12;
            i21 = i18 & 896;
            if (i21 == 256) {
                z13 = z11;
            } else {
                z13 = false;
            }
            zN = z117 | z13 | lVar2.n(str2) | lVar2.n(tVar);
            objI2 = lVar2.I();
            if (zN) {
                objI2 = new C0142c(mVar, aVar3, sVar3, str2, tVar);
                lVar2.B(objI2);
            } else {
                objI2 = new C0142c(mVar, aVar3, sVar3, str2, tVar);
                lVar2.B(objI2);
            }
            Function0.c(mVar, (wn0.l) objI2, lVar2, 0);
            boolean zK110 = lVar2.K(mVar);
            if (i19 == 32) {
                z14 = z11;
            } else {
                z14 = false;
            }
            boolean z118 = zK110 | z14;
            if (i21 == 256) {
                z15 = z11;
            } else {
                z15 = false;
            }
            zN2 = z118 | z15 | lVar2.n(str2) | lVar2.n(tVar);
            objI3 = lVar2.I();
            if (zN2) {
                objI3 = new d(mVar, aVar3, sVar3, str2, tVar);
                lVar2.B(objI3);
            } else {
                objI3 = new d(mVar, aVar3, sVar3, str2, tVar);
                lVar2.B(objI3);
            }
            Function0.i((wn0.a) objI3, lVar2, 0);
            boolean zK111 = lVar2.K(mVar);
            i22 = i18 & 14;
            if (i22 != 4) {
                z11 = false;
            }
            z16 = zK111 | z11;
            objI4 = lVar2.I();
            if (z16) {
                objI4 = new e(mVar, rVar2);
                lVar2.B(objI4);
            } else {
                objI4 = new e(mVar, rVar2);
                lVar2.B(objI4);
            }
            Function0.c(rVar2, (wn0.l) objI4, lVar2, i22);
            zK = lVar2.K(mVar);
            objI5 = lVar2.I();
            if (zK) {
                objI5 = new f(mVar, null);
                lVar2.B(objI5);
            } else {
                objI5 = new f(mVar, null);
                lVar2.B(objI5);
            }
            Function0.g(mVar, (wn0.p) objI5, lVar2, 0);
            androidx.compose.ui.d.Companion companion6 = androidx.compose.ui.d.INSTANCE;
            zK2 = lVar2.K(mVar);
            objI6 = lVar2.I();
            if (zK2) {
                objI6 = new g(mVar);
                lVar2.B(objI6);
            } else {
                objI6 = new g(mVar);
                lVar2.B(objI6);
            }
            androidx.compose.ui.d dVarA6 = androidx.compose.ui.layout.c.a(companion6, (wn0.l) objI6);
            zK3 = lVar2.K(mVar) | lVar2.n(tVar);
            objI7 = lVar2.I();
            if (zK3) {
                objI7 = new h(mVar, tVar);
                lVar2.B(objI7);
            } else {
                objI7 = new h(mVar, tVar);
                lVar2.B(objI7);
            }
            i0 i0Var6 = (i0) objI7;
            iA = p020r2.j.a(lVar2, 0);
            x xVarC6 = lVar2.c();
            androidx.compose.ui.d dVarE6 = androidx.compose.ui.c.e(lVar2, dVarA6);
            b4.g.Companion aVar11 = b4.g.INSTANCE;
            aVarA = aVar11.a();
            if (lVar2.w() == null) {
                p020r2.j.c();
            }
            lVar2.h();
            if (lVar2.getInserting()) {
                lVar2.z(aVarA);
            } else {
                lVar2.d();
            }
            lVarA = d4.a(lVar2);
            d4.b(lVarA, i0Var6, aVar11.c());
            d4.b(lVarA, xVarC6, aVar11.e());
            pVarB = aVar11.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE6, aVar11.d());
            lVar2.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            aVar5 = aVar3;
            sVar4 = sVar3;
        } else {
            if (i23 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar2;
            }
            if (i14 != 0) {
                sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
            } else {
                sVar3 = sVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-830247068, i17, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:302)");
            }
            view = (View) lVarV.U(AndroidCompositionLocals_androidKt.k());
            dVar = (w4.d) lVarV.U(z0.g());
            str = (String) lVarV.U(f6313a);
            tVar = (w4.t) lVarV.U(z0.m());
            qVarD = p020r2.j.d(lVarV, 0);
            y3VarO = n3.o(pVar, lVarV, (i17 >> 9) & 14);
            uuid = (UUID) a3.b.c(new Object[0], null, null, j.f6349c, lVarV, 3072, 6);
            objI = lVarV.I();
            aVar4 = p020r2.l.INSTANCE;
            if (objI == aVar4.a()) {
                i18 = i17;
                lVar2 = lVarV;
                z11 = true;
                str2 = str;
                m mVar8 = new m(aVar3, sVar3, str2, view, dVar, rVar2, uuid, null, 128, null);
                rVar2 = rVar2;
                mVar8.setContent(qVarD, z2.c.c(1302892335, true, new k(mVar8, y3VarO)));
                lVar2.B(mVar8);
                objI = mVar8;
            } else {
                lVar2 = lVarV;
                i18 = i17;
                str2 = str;
                z11 = true;
            }
            mVar = (m) objI;
            boolean zK112 = lVar2.K(mVar);
            i19 = i18 & 112;
            if (i19 == 32) {
                z12 = z11;
            } else {
                z12 = false;
            }
            boolean z119 = zK112 | z12;
            i21 = i18 & 896;
            if (i21 == 256) {
                z13 = z11;
            } else {
                z13 = false;
            }
            zN = z119 | z13 | lVar2.n(str2) | lVar2.n(tVar);
            objI2 = lVar2.I();
            if (zN) {
                objI2 = new C0142c(mVar, aVar3, sVar3, str2, tVar);
                lVar2.B(objI2);
            } else {
                objI2 = new C0142c(mVar, aVar3, sVar3, str2, tVar);
                lVar2.B(objI2);
            }
            Function0.c(mVar, (wn0.l) objI2, lVar2, 0);
            boolean zK113 = lVar2.K(mVar);
            if (i19 == 32) {
                z14 = z11;
            } else {
                z14 = false;
            }
            boolean z1110 = zK113 | z14;
            if (i21 == 256) {
                z15 = z11;
            } else {
                z15 = false;
            }
            zN2 = z1110 | z15 | lVar2.n(str2) | lVar2.n(tVar);
            objI3 = lVar2.I();
            if (zN2) {
                objI3 = new d(mVar, aVar3, sVar3, str2, tVar);
                lVar2.B(objI3);
            } else {
                objI3 = new d(mVar, aVar3, sVar3, str2, tVar);
                lVar2.B(objI3);
            }
            Function0.i((wn0.a) objI3, lVar2, 0);
            boolean zK114 = lVar2.K(mVar);
            i22 = i18 & 14;
            if (i22 != 4) {
                z11 = false;
            }
            z16 = zK114 | z11;
            objI4 = lVar2.I();
            if (z16) {
                objI4 = new e(mVar, rVar2);
                lVar2.B(objI4);
            } else {
                objI4 = new e(mVar, rVar2);
                lVar2.B(objI4);
            }
            Function0.c(rVar2, (wn0.l) objI4, lVar2, i22);
            zK = lVar2.K(mVar);
            objI5 = lVar2.I();
            if (zK) {
                objI5 = new f(mVar, null);
                lVar2.B(objI5);
            } else {
                objI5 = new f(mVar, null);
                lVar2.B(objI5);
            }
            Function0.g(mVar, (wn0.p) objI5, lVar2, 0);
            androidx.compose.ui.d.Companion companion7 = androidx.compose.ui.d.INSTANCE;
            zK2 = lVar2.K(mVar);
            objI6 = lVar2.I();
            if (zK2) {
                objI6 = new g(mVar);
                lVar2.B(objI6);
            } else {
                objI6 = new g(mVar);
                lVar2.B(objI6);
            }
            androidx.compose.ui.d dVarA7 = androidx.compose.ui.layout.c.a(companion7, (wn0.l) objI6);
            zK3 = lVar2.K(mVar) | lVar2.n(tVar);
            objI7 = lVar2.I();
            if (zK3) {
                objI7 = new h(mVar, tVar);
                lVar2.B(objI7);
            } else {
                objI7 = new h(mVar, tVar);
                lVar2.B(objI7);
            }
            i0 i0Var7 = (i0) objI7;
            iA = p020r2.j.a(lVar2, 0);
            x xVarC7 = lVar2.c();
            androidx.compose.ui.d dVarE7 = androidx.compose.ui.c.e(lVar2, dVarA7);
            b4.g.Companion aVar12 = b4.g.INSTANCE;
            aVarA = aVar12.a();
            if (lVar2.w() == null) {
                p020r2.j.c();
            }
            lVar2.h();
            if (lVar2.getInserting()) {
                lVar2.z(aVarA);
            } else {
                lVar2.d();
            }
            lVarA = d4.a(lVar2);
            d4.b(lVarA, i0Var7, aVar12.c());
            d4.b(lVarA, xVarC7, aVar12.e());
            pVarB = aVar12.b();
            if (lVarA.getInserting()) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            } else {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            d4.b(lVarA, dVarE7, aVar12.d());
            lVar2.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            aVar5 = aVar3;
            sVar4 = sVar3;
        }
        w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new i(rVar2, aVar5, sVar4, pVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wn0.p<p020r2.l, Integer, h0> b(y3<? extends wn0.p<? super p020r2.l, ? super Integer, h0>> y3Var) {
        return (wn0.p) y3Var.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x0121  */
    /* JADX WARN: Code duplicated, block: B:98:0x012d  */
    public static final void c(d3.c cVar, long j11, wn0.a<h0> aVar, s sVar, wn0.p<? super p020r2.l, ? super Integer, h0> pVar, p020r2.l lVar, int i11, int i12) {
        d3.c cVar2;
        int i13;
        long j12;
        int i14;
        wn0.a<h0> aVar2;
        int i15;
        int i16;
        s sVar2;
        int i17;
        wn0.p<? super p020r2.l, ? super Integer, h0> pVar2;
        int i18;
        d3.c cVarO;
        long jA;
        DefaultConstructorMarker defaultConstructorMarker;
        wn0.a<h0> aVar3;
        s sVar3;
        boolean z11;
        boolean z12;
        Object objI;
        long j13;
        wn0.a<h0> aVar4;
        s sVar4;
        w2 w2VarX;
        p020r2.l lVarV = lVar.v(295309329);
        int i19 = i12 & 1;
        if (i19 != 0) {
            i13 = i11 | 6;
            cVar2 = cVar;
        } else if ((i11 & 6) == 0) {
            cVar2 = cVar;
            i13 = (lVarV.n(cVar2) ? 4 : 2) | i11;
        } else {
            cVar2 = cVar;
            i13 = i11;
        }
        int i21 = i12 & 2;
        if (i21 == 0) {
            if ((i11 & 48) == 0) {
                j12 = j11;
                i13 |= lVarV.s(j12) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    aVar2 = aVar;
                    if (lVarV.K(aVar2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 3072) == 0) {
                        sVar2 = sVar;
                        if (lVarV.n(sVar2)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 16) != 0) {
                        if ((i11 & 24576) == 0) {
                            pVar2 = pVar;
                            if (lVarV.K(pVar2)) {
                                i18 = 16384;
                            } else {
                                i18 = PKIFailureInfo.certRevoked;
                            }
                            i13 |= i18;
                        }
                        if ((i13 & 9363) == 9362 || !lVarV.b()) {
                            if (i19 != 0) {
                                cVarO = d3.c.INSTANCE.o();
                            } else {
                                cVarO = cVar2;
                            }
                            if (i21 != 0) {
                                jA = w4.o.a(0, 0);
                            } else {
                                jA = j12;
                            }
                            defaultConstructorMarker = null;
                            if (i14 != 0) {
                                aVar3 = null;
                            } else {
                                aVar3 = aVar2;
                            }
                            if (i16 != 0) {
                                sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                            } else {
                                sVar3 = sVar2;
                            }
                            if (p020r2.o.J()) {
                                p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                            }
                            if ((i13 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = z11 | ((i13 & 112) == 32);
                            objI = lVarV.I();
                            if (z12 || objI == p020r2.l.INSTANCE.a()) {
                                objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                                lVarV.B(objI);
                            }
                            a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                            if (p020r2.o.J()) {
                                p020r2.o.R();
                            }
                            j13 = jA;
                            aVar4 = aVar3;
                            sVar4 = sVar3;
                        } else {
                            lVarV.j();
                            cVarO = cVar2;
                            j13 = j12;
                            aVar4 = aVar2;
                            sVar4 = sVar2;
                        }
                        w2VarX = lVarV.x();
                        if (w2VarX != null) {
                            w2VarX.a(new b(cVarO, j13, aVar4, sVar4, pVar, i11, i12));
                        }
                    }
                    i13 |= 24576;
                    pVar2 = pVar;
                    if ((i13 & 9363) == 9362) {
                        if (i19 != 0) {
                            cVarO = d3.c.INSTANCE.o();
                        } else {
                            cVarO = cVar2;
                        }
                        if (i21 != 0) {
                            jA = w4.o.a(0, 0);
                        } else {
                            jA = j12;
                        }
                        defaultConstructorMarker = null;
                        if (i14 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if (i16 != 0) {
                            sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                        } else {
                            sVar3 = sVar2;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                        }
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z11 | ((i13 & 112) == 32);
                        objI = lVarV.I();
                        if (z12) {
                            objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                            lVarV.B(objI);
                        } else {
                            objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                            lVarV.B(objI);
                        }
                        a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        j13 = jA;
                        aVar4 = aVar3;
                        sVar4 = sVar3;
                    } else {
                        if (i19 != 0) {
                            cVarO = d3.c.INSTANCE.o();
                        } else {
                            cVarO = cVar2;
                        }
                        if (i21 != 0) {
                            jA = w4.o.a(0, 0);
                        } else {
                            jA = j12;
                        }
                        defaultConstructorMarker = null;
                        if (i14 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if (i16 != 0) {
                            sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                        } else {
                            sVar3 = sVar2;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                        }
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z11 | ((i13 & 112) == 32);
                        objI = lVarV.I();
                        if (z12) {
                            objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                            lVarV.B(objI);
                        } else {
                            objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                            lVarV.B(objI);
                        }
                        a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        j13 = jA;
                        aVar4 = aVar3;
                        sVar4 = sVar3;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(cVarO, j13, aVar4, sVar4, pVar, i11, i12));
                    }
                }
                i13 |= 3072;
                sVar2 = sVar;
                if ((i12 & 16) != 0) {
                    if ((i11 & 24576) == 0) {
                        pVar2 = pVar;
                        if (lVarV.K(pVar2)) {
                            i18 = 16384;
                        } else {
                            i18 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i18;
                    }
                    if ((i13 & 9363) == 9362) {
                        if (i19 != 0) {
                            cVarO = d3.c.INSTANCE.o();
                        } else {
                            cVarO = cVar2;
                        }
                        if (i21 != 0) {
                            jA = w4.o.a(0, 0);
                        } else {
                            jA = j12;
                        }
                        defaultConstructorMarker = null;
                        if (i14 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if (i16 != 0) {
                            sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                        } else {
                            sVar3 = sVar2;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                        }
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z11 | ((i13 & 112) == 32);
                        objI = lVarV.I();
                        if (z12) {
                            objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                            lVarV.B(objI);
                        } else {
                            objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                            lVarV.B(objI);
                        }
                        a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        j13 = jA;
                        aVar4 = aVar3;
                        sVar4 = sVar3;
                    } else {
                        if (i19 != 0) {
                            cVarO = d3.c.INSTANCE.o();
                        } else {
                            cVarO = cVar2;
                        }
                        if (i21 != 0) {
                            jA = w4.o.a(0, 0);
                        } else {
                            jA = j12;
                        }
                        defaultConstructorMarker = null;
                        if (i14 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if (i16 != 0) {
                            sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                        } else {
                            sVar3 = sVar2;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                        }
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z11 | ((i13 & 112) == 32);
                        objI = lVarV.I();
                        if (z12) {
                            objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                            lVarV.B(objI);
                        } else {
                            objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                            lVarV.B(objI);
                        }
                        a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        j13 = jA;
                        aVar4 = aVar3;
                        sVar4 = sVar3;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(cVarO, j13, aVar4, sVar4, pVar, i11, i12));
                    }
                }
                i13 |= 24576;
                pVar2 = pVar;
                if ((i13 & 9363) == 9362) {
                    if (i19 != 0) {
                        cVarO = d3.c.INSTANCE.o();
                    } else {
                        cVarO = cVar2;
                    }
                    if (i21 != 0) {
                        jA = w4.o.a(0, 0);
                    } else {
                        jA = j12;
                    }
                    defaultConstructorMarker = null;
                    if (i14 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if (i16 != 0) {
                        sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        sVar3 = sVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                    }
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | ((i13 & 112) == 32);
                    objI = lVarV.I();
                    if (z12) {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    } else {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    }
                    a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    j13 = jA;
                    aVar4 = aVar3;
                    sVar4 = sVar3;
                } else {
                    if (i19 != 0) {
                        cVarO = d3.c.INSTANCE.o();
                    } else {
                        cVarO = cVar2;
                    }
                    if (i21 != 0) {
                        jA = w4.o.a(0, 0);
                    } else {
                        jA = j12;
                    }
                    defaultConstructorMarker = null;
                    if (i14 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if (i16 != 0) {
                        sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        sVar3 = sVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                    }
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | ((i13 & 112) == 32);
                    objI = lVarV.I();
                    if (z12) {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    } else {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    }
                    a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    j13 = jA;
                    aVar4 = aVar3;
                    sVar4 = sVar3;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(cVarO, j13, aVar4, sVar4, pVar, i11, i12));
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            aVar2 = aVar;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    sVar2 = sVar;
                    if (lVarV.n(sVar2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i12 & 16) != 0) {
                    if ((i11 & 24576) == 0) {
                        pVar2 = pVar;
                        if (lVarV.K(pVar2)) {
                            i18 = 16384;
                        } else {
                            i18 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i18;
                    }
                    if ((i13 & 9363) == 9362) {
                        if (i19 != 0) {
                            cVarO = d3.c.INSTANCE.o();
                        } else {
                            cVarO = cVar2;
                        }
                        if (i21 != 0) {
                            jA = w4.o.a(0, 0);
                        } else {
                            jA = j12;
                        }
                        defaultConstructorMarker = null;
                        if (i14 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if (i16 != 0) {
                            sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                        } else {
                            sVar3 = sVar2;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                        }
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z11 | ((i13 & 112) == 32);
                        objI = lVarV.I();
                        if (z12) {
                            objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                            lVarV.B(objI);
                        } else {
                            objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                            lVarV.B(objI);
                        }
                        a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        j13 = jA;
                        aVar4 = aVar3;
                        sVar4 = sVar3;
                    } else {
                        if (i19 != 0) {
                            cVarO = d3.c.INSTANCE.o();
                        } else {
                            cVarO = cVar2;
                        }
                        if (i21 != 0) {
                            jA = w4.o.a(0, 0);
                        } else {
                            jA = j12;
                        }
                        defaultConstructorMarker = null;
                        if (i14 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if (i16 != 0) {
                            sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                        } else {
                            sVar3 = sVar2;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                        }
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z11 | ((i13 & 112) == 32);
                        objI = lVarV.I();
                        if (z12) {
                            objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                            lVarV.B(objI);
                        } else {
                            objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                            lVarV.B(objI);
                        }
                        a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        j13 = jA;
                        aVar4 = aVar3;
                        sVar4 = sVar3;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(cVarO, j13, aVar4, sVar4, pVar, i11, i12));
                    }
                }
                i13 |= 24576;
                pVar2 = pVar;
                if ((i13 & 9363) == 9362) {
                    if (i19 != 0) {
                        cVarO = d3.c.INSTANCE.o();
                    } else {
                        cVarO = cVar2;
                    }
                    if (i21 != 0) {
                        jA = w4.o.a(0, 0);
                    } else {
                        jA = j12;
                    }
                    defaultConstructorMarker = null;
                    if (i14 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if (i16 != 0) {
                        sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        sVar3 = sVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                    }
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | ((i13 & 112) == 32);
                    objI = lVarV.I();
                    if (z12) {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    } else {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    }
                    a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    j13 = jA;
                    aVar4 = aVar3;
                    sVar4 = sVar3;
                } else {
                    if (i19 != 0) {
                        cVarO = d3.c.INSTANCE.o();
                    } else {
                        cVarO = cVar2;
                    }
                    if (i21 != 0) {
                        jA = w4.o.a(0, 0);
                    } else {
                        jA = j12;
                    }
                    defaultConstructorMarker = null;
                    if (i14 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if (i16 != 0) {
                        sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        sVar3 = sVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                    }
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | ((i13 & 112) == 32);
                    objI = lVarV.I();
                    if (z12) {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    } else {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    }
                    a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    j13 = jA;
                    aVar4 = aVar3;
                    sVar4 = sVar3;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(cVarO, j13, aVar4, sVar4, pVar, i11, i12));
                }
            }
            i13 |= 3072;
            sVar2 = sVar;
            if ((i12 & 16) != 0) {
                if ((i11 & 24576) == 0) {
                    pVar2 = pVar;
                    if (lVarV.K(pVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
                if ((i13 & 9363) == 9362) {
                    if (i19 != 0) {
                        cVarO = d3.c.INSTANCE.o();
                    } else {
                        cVarO = cVar2;
                    }
                    if (i21 != 0) {
                        jA = w4.o.a(0, 0);
                    } else {
                        jA = j12;
                    }
                    defaultConstructorMarker = null;
                    if (i14 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if (i16 != 0) {
                        sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        sVar3 = sVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                    }
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | ((i13 & 112) == 32);
                    objI = lVarV.I();
                    if (z12) {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    } else {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    }
                    a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    j13 = jA;
                    aVar4 = aVar3;
                    sVar4 = sVar3;
                } else {
                    if (i19 != 0) {
                        cVarO = d3.c.INSTANCE.o();
                    } else {
                        cVarO = cVar2;
                    }
                    if (i21 != 0) {
                        jA = w4.o.a(0, 0);
                    } else {
                        jA = j12;
                    }
                    defaultConstructorMarker = null;
                    if (i14 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if (i16 != 0) {
                        sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        sVar3 = sVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                    }
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | ((i13 & 112) == 32);
                    objI = lVarV.I();
                    if (z12) {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    } else {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    }
                    a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    j13 = jA;
                    aVar4 = aVar3;
                    sVar4 = sVar3;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(cVarO, j13, aVar4, sVar4, pVar, i11, i12));
                }
            }
            i13 |= 24576;
            pVar2 = pVar;
            if ((i13 & 9363) == 9362) {
                if (i19 != 0) {
                    cVarO = d3.c.INSTANCE.o();
                } else {
                    cVarO = cVar2;
                }
                if (i21 != 0) {
                    jA = w4.o.a(0, 0);
                } else {
                    jA = j12;
                }
                defaultConstructorMarker = null;
                if (i14 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (i16 != 0) {
                    sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                } else {
                    sVar3 = sVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                }
                if ((i13 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | ((i13 & 112) == 32);
                objI = lVarV.I();
                if (z12) {
                    objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                    lVarV.B(objI);
                } else {
                    objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                    lVarV.B(objI);
                }
                a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                j13 = jA;
                aVar4 = aVar3;
                sVar4 = sVar3;
            } else {
                if (i19 != 0) {
                    cVarO = d3.c.INSTANCE.o();
                } else {
                    cVarO = cVar2;
                }
                if (i21 != 0) {
                    jA = w4.o.a(0, 0);
                } else {
                    jA = j12;
                }
                defaultConstructorMarker = null;
                if (i14 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (i16 != 0) {
                    sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                } else {
                    sVar3 = sVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                }
                if ((i13 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | ((i13 & 112) == 32);
                objI = lVarV.I();
                if (z12) {
                    objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                    lVarV.B(objI);
                } else {
                    objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                    lVarV.B(objI);
                }
                a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                j13 = jA;
                aVar4 = aVar3;
                sVar4 = sVar3;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(cVarO, j13, aVar4, sVar4, pVar, i11, i12));
            }
        }
        i13 |= 48;
        j12 = j11;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                aVar2 = aVar;
                if (lVarV.K(aVar2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 3072) == 0) {
                    sVar2 = sVar;
                    if (lVarV.n(sVar2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((i12 & 16) != 0) {
                    if ((i11 & 24576) == 0) {
                        pVar2 = pVar;
                        if (lVarV.K(pVar2)) {
                            i18 = 16384;
                        } else {
                            i18 = PKIFailureInfo.certRevoked;
                        }
                        i13 |= i18;
                    }
                    if ((i13 & 9363) == 9362) {
                        if (i19 != 0) {
                            cVarO = d3.c.INSTANCE.o();
                        } else {
                            cVarO = cVar2;
                        }
                        if (i21 != 0) {
                            jA = w4.o.a(0, 0);
                        } else {
                            jA = j12;
                        }
                        defaultConstructorMarker = null;
                        if (i14 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if (i16 != 0) {
                            sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                        } else {
                            sVar3 = sVar2;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                        }
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z11 | ((i13 & 112) == 32);
                        objI = lVarV.I();
                        if (z12) {
                            objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                            lVarV.B(objI);
                        } else {
                            objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                            lVarV.B(objI);
                        }
                        a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        j13 = jA;
                        aVar4 = aVar3;
                        sVar4 = sVar3;
                    } else {
                        if (i19 != 0) {
                            cVarO = d3.c.INSTANCE.o();
                        } else {
                            cVarO = cVar2;
                        }
                        if (i21 != 0) {
                            jA = w4.o.a(0, 0);
                        } else {
                            jA = j12;
                        }
                        defaultConstructorMarker = null;
                        if (i14 != 0) {
                            aVar3 = null;
                        } else {
                            aVar3 = aVar2;
                        }
                        if (i16 != 0) {
                            sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                        } else {
                            sVar3 = sVar2;
                        }
                        if (p020r2.o.J()) {
                            p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                        }
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z11 | ((i13 & 112) == 32);
                        objI = lVarV.I();
                        if (z12) {
                            objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                            lVarV.B(objI);
                        } else {
                            objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                            lVarV.B(objI);
                        }
                        a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                        if (p020r2.o.J()) {
                            p020r2.o.R();
                        }
                        j13 = jA;
                        aVar4 = aVar3;
                        sVar4 = sVar3;
                    }
                    w2VarX = lVarV.x();
                    if (w2VarX != null) {
                        w2VarX.a(new b(cVarO, j13, aVar4, sVar4, pVar, i11, i12));
                    }
                }
                i13 |= 24576;
                pVar2 = pVar;
                if ((i13 & 9363) == 9362) {
                    if (i19 != 0) {
                        cVarO = d3.c.INSTANCE.o();
                    } else {
                        cVarO = cVar2;
                    }
                    if (i21 != 0) {
                        jA = w4.o.a(0, 0);
                    } else {
                        jA = j12;
                    }
                    defaultConstructorMarker = null;
                    if (i14 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if (i16 != 0) {
                        sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        sVar3 = sVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                    }
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | ((i13 & 112) == 32);
                    objI = lVarV.I();
                    if (z12) {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    } else {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    }
                    a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    j13 = jA;
                    aVar4 = aVar3;
                    sVar4 = sVar3;
                } else {
                    if (i19 != 0) {
                        cVarO = d3.c.INSTANCE.o();
                    } else {
                        cVarO = cVar2;
                    }
                    if (i21 != 0) {
                        jA = w4.o.a(0, 0);
                    } else {
                        jA = j12;
                    }
                    defaultConstructorMarker = null;
                    if (i14 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if (i16 != 0) {
                        sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        sVar3 = sVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                    }
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | ((i13 & 112) == 32);
                    objI = lVarV.I();
                    if (z12) {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    } else {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    }
                    a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    j13 = jA;
                    aVar4 = aVar3;
                    sVar4 = sVar3;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(cVarO, j13, aVar4, sVar4, pVar, i11, i12));
                }
            }
            i13 |= 3072;
            sVar2 = sVar;
            if ((i12 & 16) != 0) {
                if ((i11 & 24576) == 0) {
                    pVar2 = pVar;
                    if (lVarV.K(pVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
                if ((i13 & 9363) == 9362) {
                    if (i19 != 0) {
                        cVarO = d3.c.INSTANCE.o();
                    } else {
                        cVarO = cVar2;
                    }
                    if (i21 != 0) {
                        jA = w4.o.a(0, 0);
                    } else {
                        jA = j12;
                    }
                    defaultConstructorMarker = null;
                    if (i14 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if (i16 != 0) {
                        sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        sVar3 = sVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                    }
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | ((i13 & 112) == 32);
                    objI = lVarV.I();
                    if (z12) {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    } else {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    }
                    a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    j13 = jA;
                    aVar4 = aVar3;
                    sVar4 = sVar3;
                } else {
                    if (i19 != 0) {
                        cVarO = d3.c.INSTANCE.o();
                    } else {
                        cVarO = cVar2;
                    }
                    if (i21 != 0) {
                        jA = w4.o.a(0, 0);
                    } else {
                        jA = j12;
                    }
                    defaultConstructorMarker = null;
                    if (i14 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if (i16 != 0) {
                        sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        sVar3 = sVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                    }
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | ((i13 & 112) == 32);
                    objI = lVarV.I();
                    if (z12) {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    } else {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    }
                    a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    j13 = jA;
                    aVar4 = aVar3;
                    sVar4 = sVar3;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(cVarO, j13, aVar4, sVar4, pVar, i11, i12));
                }
            }
            i13 |= 24576;
            pVar2 = pVar;
            if ((i13 & 9363) == 9362) {
                if (i19 != 0) {
                    cVarO = d3.c.INSTANCE.o();
                } else {
                    cVarO = cVar2;
                }
                if (i21 != 0) {
                    jA = w4.o.a(0, 0);
                } else {
                    jA = j12;
                }
                defaultConstructorMarker = null;
                if (i14 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (i16 != 0) {
                    sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                } else {
                    sVar3 = sVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                }
                if ((i13 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | ((i13 & 112) == 32);
                objI = lVarV.I();
                if (z12) {
                    objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                    lVarV.B(objI);
                } else {
                    objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                    lVarV.B(objI);
                }
                a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                j13 = jA;
                aVar4 = aVar3;
                sVar4 = sVar3;
            } else {
                if (i19 != 0) {
                    cVarO = d3.c.INSTANCE.o();
                } else {
                    cVarO = cVar2;
                }
                if (i21 != 0) {
                    jA = w4.o.a(0, 0);
                } else {
                    jA = j12;
                }
                defaultConstructorMarker = null;
                if (i14 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (i16 != 0) {
                    sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                } else {
                    sVar3 = sVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                }
                if ((i13 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | ((i13 & 112) == 32);
                objI = lVarV.I();
                if (z12) {
                    objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                    lVarV.B(objI);
                } else {
                    objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                    lVarV.B(objI);
                }
                a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                j13 = jA;
                aVar4 = aVar3;
                sVar4 = sVar3;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(cVarO, j13, aVar4, sVar4, pVar, i11, i12));
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        aVar2 = aVar;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 3072) == 0) {
                sVar2 = sVar;
                if (lVarV.n(sVar2)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            if ((i12 & 16) != 0) {
                if ((i11 & 24576) == 0) {
                    pVar2 = pVar;
                    if (lVarV.K(pVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = PKIFailureInfo.certRevoked;
                    }
                    i13 |= i18;
                }
                if ((i13 & 9363) == 9362) {
                    if (i19 != 0) {
                        cVarO = d3.c.INSTANCE.o();
                    } else {
                        cVarO = cVar2;
                    }
                    if (i21 != 0) {
                        jA = w4.o.a(0, 0);
                    } else {
                        jA = j12;
                    }
                    defaultConstructorMarker = null;
                    if (i14 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if (i16 != 0) {
                        sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        sVar3 = sVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                    }
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | ((i13 & 112) == 32);
                    objI = lVarV.I();
                    if (z12) {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    } else {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    }
                    a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    j13 = jA;
                    aVar4 = aVar3;
                    sVar4 = sVar3;
                } else {
                    if (i19 != 0) {
                        cVarO = d3.c.INSTANCE.o();
                    } else {
                        cVarO = cVar2;
                    }
                    if (i21 != 0) {
                        jA = w4.o.a(0, 0);
                    } else {
                        jA = j12;
                    }
                    defaultConstructorMarker = null;
                    if (i14 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar2;
                    }
                    if (i16 != 0) {
                        sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                    } else {
                        sVar3 = sVar2;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                    }
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | ((i13 & 112) == 32);
                    objI = lVarV.I();
                    if (z12) {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    } else {
                        objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                        lVarV.B(objI);
                    }
                    a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    j13 = jA;
                    aVar4 = aVar3;
                    sVar4 = sVar3;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new b(cVarO, j13, aVar4, sVar4, pVar, i11, i12));
                }
            }
            i13 |= 24576;
            pVar2 = pVar;
            if ((i13 & 9363) == 9362) {
                if (i19 != 0) {
                    cVarO = d3.c.INSTANCE.o();
                } else {
                    cVarO = cVar2;
                }
                if (i21 != 0) {
                    jA = w4.o.a(0, 0);
                } else {
                    jA = j12;
                }
                defaultConstructorMarker = null;
                if (i14 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (i16 != 0) {
                    sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                } else {
                    sVar3 = sVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                }
                if ((i13 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | ((i13 & 112) == 32);
                objI = lVarV.I();
                if (z12) {
                    objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                    lVarV.B(objI);
                } else {
                    objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                    lVarV.B(objI);
                }
                a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                j13 = jA;
                aVar4 = aVar3;
                sVar4 = sVar3;
            } else {
                if (i19 != 0) {
                    cVarO = d3.c.INSTANCE.o();
                } else {
                    cVarO = cVar2;
                }
                if (i21 != 0) {
                    jA = w4.o.a(0, 0);
                } else {
                    jA = j12;
                }
                defaultConstructorMarker = null;
                if (i14 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (i16 != 0) {
                    sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                } else {
                    sVar3 = sVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                }
                if ((i13 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | ((i13 & 112) == 32);
                objI = lVarV.I();
                if (z12) {
                    objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                    lVarV.B(objI);
                } else {
                    objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                    lVarV.B(objI);
                }
                a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                j13 = jA;
                aVar4 = aVar3;
                sVar4 = sVar3;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(cVarO, j13, aVar4, sVar4, pVar, i11, i12));
            }
        }
        i13 |= 3072;
        sVar2 = sVar;
        if ((i12 & 16) != 0) {
            if ((i11 & 24576) == 0) {
                pVar2 = pVar;
                if (lVarV.K(pVar2)) {
                    i18 = 16384;
                } else {
                    i18 = PKIFailureInfo.certRevoked;
                }
                i13 |= i18;
            }
            if ((i13 & 9363) == 9362) {
                if (i19 != 0) {
                    cVarO = d3.c.INSTANCE.o();
                } else {
                    cVarO = cVar2;
                }
                if (i21 != 0) {
                    jA = w4.o.a(0, 0);
                } else {
                    jA = j12;
                }
                defaultConstructorMarker = null;
                if (i14 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (i16 != 0) {
                    sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                } else {
                    sVar3 = sVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                }
                if ((i13 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | ((i13 & 112) == 32);
                objI = lVarV.I();
                if (z12) {
                    objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                    lVarV.B(objI);
                } else {
                    objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                    lVarV.B(objI);
                }
                a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                j13 = jA;
                aVar4 = aVar3;
                sVar4 = sVar3;
            } else {
                if (i19 != 0) {
                    cVarO = d3.c.INSTANCE.o();
                } else {
                    cVarO = cVar2;
                }
                if (i21 != 0) {
                    jA = w4.o.a(0, 0);
                } else {
                    jA = j12;
                }
                defaultConstructorMarker = null;
                if (i14 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar2;
                }
                if (i16 != 0) {
                    sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
                } else {
                    sVar3 = sVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
                }
                if ((i13 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | ((i13 & 112) == 32);
                objI = lVarV.I();
                if (z12) {
                    objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                    lVarV.B(objI);
                } else {
                    objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                    lVarV.B(objI);
                }
                a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                j13 = jA;
                aVar4 = aVar3;
                sVar4 = sVar3;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new b(cVarO, j13, aVar4, sVar4, pVar, i11, i12));
            }
        }
        i13 |= 24576;
        pVar2 = pVar;
        if ((i13 & 9363) == 9362) {
            if (i19 != 0) {
                cVarO = d3.c.INSTANCE.o();
            } else {
                cVarO = cVar2;
            }
            if (i21 != 0) {
                jA = w4.o.a(0, 0);
            } else {
                jA = j12;
            }
            defaultConstructorMarker = null;
            if (i14 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar2;
            }
            if (i16 != 0) {
                sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
            } else {
                sVar3 = sVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
            }
            if ((i13 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | ((i13 & 112) == 32);
            objI = lVarV.I();
            if (z12) {
                objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                lVarV.B(objI);
            } else {
                objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                lVarV.B(objI);
            }
            a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            j13 = jA;
            aVar4 = aVar3;
            sVar4 = sVar3;
        } else {
            if (i19 != 0) {
                cVarO = d3.c.INSTANCE.o();
            } else {
                cVarO = cVar2;
            }
            if (i21 != 0) {
                jA = w4.o.a(0, 0);
            } else {
                jA = j12;
            }
            defaultConstructorMarker = null;
            if (i14 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar2;
            }
            if (i16 != 0) {
                sVar3 = new s(false, false, false, false, 15, (DefaultConstructorMarker) null);
            } else {
                sVar3 = sVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(295309329, i13, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
            }
            if ((i13 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | ((i13 & 112) == 32);
            objI = lVarV.I();
            if (z12) {
                objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                lVarV.B(objI);
            } else {
                objI = new androidx.compose.ui.window.a(cVarO, jA, defaultConstructorMarker);
                lVarV.B(objI);
            }
            a((androidx.compose.ui.window.a) objI, aVar3, sVar3, pVar2, lVarV, (i13 >> 3) & 8176, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            j13 = jA;
            aVar4 = aVar3;
            sVar4 = sVar3;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(cVarO, j13, aVar4, sVar4, pVar, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(boolean z11, t tVar, boolean z12) {
        int i11 = !z11 ? 262152 : 262144;
        if (tVar == t.SecureOn) {
            i11 |= PKIFailureInfo.certRevoked;
        }
        return !z12 ? i11 | 512 : i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(s sVar, boolean z11) {
        if (sVar.getInheritSecurePolicy() && z11) {
            return sVar.getFlags() | PKIFailureInfo.certRevoked;
        }
        return (!sVar.getInheritSecurePolicy() || z11) ? sVar.getFlags() : sVar.getFlags() & (-8193);
    }

    public static final boolean j(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & PKIFailureInfo.certRevoked) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w4.p k(Rect rect) {
        return new w4.p(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz3/k0;", "", "Lz3/h0;", "<anonymous parameter 0>", "Lw4/b;", "<anonymous parameter 1>", "Lz3/j0;", "c", "(Lz3/k0;Ljava/util/List;J)Lz3/j0;"}, k = 3, mv = {1, 8, 0})
    static final class h implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f6340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w4.t f6341b;

        h(m mVar, w4.t tVar) {
            this.f6340a = mVar;
            this.f6341b = tVar;
        }

        @Override // z3.i0
        public final j0 c(z3.k0 k0Var, List<? extends z3.h0> list, long j11) {
            this.f6340a.setParentLayoutDirection(this.f6341b);
            return z3.k0.N1(k0Var, 0, 0, null, a.f6342c, 4, null);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<w0.a, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f6342c = new a();

            a() {
                super(1);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
                a(aVar);
                return h0.f84049a;
            }

            public final void a(w0.a aVar) {
            }
        }
    }
}
