package q1;

import android.view.View;
import b4.e1;
import b4.f1;
import b4.s1;
import ezvcard.property.Gender;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.n3;
import p020r2.p1;
import p020r2.y3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0091\u0001\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0088\u0001\u0010\u001f\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00102\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u001cJ\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u001cJ\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\u001cJ\u0013\u0010%\u001a\u00020\f*\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020\f*\u00020+H\u0016¢\u0006\u0004\b,\u0010-R.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R0\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010%\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR(\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bK\u0010%\u001a\u0004\bL\u0010<\"\u0004\bM\u0010>R(\u0010\u0015\u001a\u00020\u00138\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bN\u0010%\u001a\u0004\bO\u0010<\"\u0004\bP\u0010>R\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010@\u001a\u0004\bR\u0010B\"\u0004\bS\u0010DR\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR/\u0010k\u001a\u0004\u0018\u00010'2\b\u0010e\u001a\u0004\u0018\u00010'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010*R\u001e\u0010o\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u001c\u0010q\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bp\u0010FR\u001e\u0010u\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bs\u0010tR\u001e\u0010y\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u001a\u0010{\u001a\u00020\b8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bz\u0010H\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006|"}, d2 = {"Lq1/f0;", "Landroidx/compose/ui/d$c;", "Lb4/t;", "Lb4/r;", "Lb4/s1;", "Lb4/e1;", "Lkotlin/Function1;", "Lw4/d;", "Lj3/g;", "sourceCenter", "magnifierCenter", "Lw4/k;", "Ljn0/h0;", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Lw4/h;", "cornerRadius", "elevation", "clippingEnabled", "Lq1/q0;", "platformMagnifierFactory", "<init>", "(Lwn0/l;Lwn0/l;Lwn0/l;FZJFFZLq1/q0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "D2", "()V", "G2", "H2", "F2", "(Lwn0/l;Lwn0/l;FZJFFZLwn0/l;Lq1/q0;)V", "h2", "i2", "g1", "Lm3/c;", Gender.FEMALE, "(Lm3/c;)V", "Lz3/v;", "coordinates", "P", "(Lz3/v;)V", "Lg4/y;", "G0", "(Lg4/y;)V", "n", "Lwn0/l;", "getSourceCenter", "()Lwn0/l;", "setSourceCenter", "(Lwn0/l;)V", "o", "getMagnifierCenter", "setMagnifierCenter", "p", "getOnSizeChanged", "setOnSizeChanged", "q", "getZoom", "()F", "setZoom", "(F)V", "r", "Z", "getUseTextDefault", "()Z", "setUseTextDefault", "(Z)V", "s", "J", "getSize-MYxV2XQ", "()J", "setSize-EaSLcWc", "(J)V", "t", "getCornerRadius-D9Ej5fM", "setCornerRadius-0680j_4", "u", "getElevation-D9Ej5fM", "setElevation-0680j_4", "v", "getClippingEnabled", "setClippingEnabled", "w", "Lq1/q0;", "getPlatformMagnifierFactory", "()Lq1/q0;", "setPlatformMagnifierFactory", "(Lq1/q0;)V", "Landroid/view/View;", "x", "Landroid/view/View;", "view", "y", "Lw4/d;", "density", "Lq1/p0;", "z", "Lq1/p0;", "magnifier", "<set-?>", "A", "Lr2/p1;", "i0", "()Lz3/v;", "E2", "layoutCoordinates", "Lr2/y3;", "B", "Lr2/y3;", "anchorPositionInRootState", "C", "sourceCenterInRoot", "Lw4/r;", "D", "Lw4/r;", "previousSize", "Lkotlinx/coroutines/channels/Channel;", "E", "Lkotlinx/coroutines/channels/Channel;", "drawSignalChannel", "C2", "anchorPositionInRoot", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f0 extends androidx.compose.ui.d.c implements b4.t, b4.r, s1, e1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final p1 layoutCoordinates;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private y3<j3.g> anchorPositionInRootState;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private long sourceCenterInRoot;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private w4.r previousSize;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private Channel<jn0.h0> drawSignalChannel;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super w4.d, j3.g> sourceCenter;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super w4.d, j3.g> magnifierCenter;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super w4.k, jn0.h0> onSizeChanged;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float zoom;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean useTextDefault;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float cornerRadius;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private float elevation;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean clippingEnabled;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private q0 platformMagnifierFactory;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private View view;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private w4.d density;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private p0 magnifier;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj3/g;", "b", "()J"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<j3.g> {
        a() {
            super(0);
        }

        public final long b() {
            z3.v vVarI0 = f0.this.i0();
            return vVarI0 != null ? z3.w.f(vVarI0) : j3.g.INSTANCE.b();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ j3.g invoke() {
            return j3.g.d(b());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj3/g;", "b", "()J"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<j3.g> {
        b() {
            super(0);
        }

        public final long b() {
            return f0.this.sourceCenterInRoot;
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ j3.g invoke() {
            return j3.g.d(b());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", i = {}, l = {380, KyberEngine.KyberPolyBytes}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f104260n;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return f0.this.new c(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0021  */
        /* JADX WARN: Code duplicated, block: B:13:0x0029  */
        /* JADX WARN: Code duplicated, block: B:16:0x0032  */
        /* JADX WARN: Code duplicated, block: B:18:0x003a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0038 -> B:11:0x0021). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0042 -> B:21:0x0045). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f104260n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r5)
                goto L45
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                jn0.t.b(r5)
                goto L32
            L1e:
                jn0.t.b(r5)
            L21:
                q1.f0 r5 = q1.f0.this
                kotlinx.coroutines.channels.Channel r5 = q1.f0.x2(r5)
                if (r5 == 0) goto L32
                r4.f104260n = r3
                java.lang.Object r5 = r5.receive(r4)
                if (r5 != r0) goto L32
                goto L44
            L32:
                q1.f0 r5 = q1.f0.this
                q1.p0 r5 = q1.f0.z2(r5)
                if (r5 == 0) goto L21
                q1.f0$c$a r5 = q1.f0.c.a.f104262c
                r4.f104260n = r2
                java.lang.Object r5 = p020r2.h1.b(r5, r4)
                if (r5 != r0) goto L45
            L44:
                return r0
            L45:
                q1.f0 r5 = q1.f0.this
                q1.p0 r5 = q1.f0.z2(r5)
                if (r5 == 0) goto L21
                r5.g()
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: q1.f0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<Long, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f104262c = new a();

            a() {
                super(1);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(Long l11) {
                a(l11.longValue());
                return jn0.h0.f84049a;
            }

            public final void a(long j11) {
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {
        d() {
            super(0);
        }

        public final void b() {
            f0.this.G2();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    public /* synthetic */ f0(wn0.l lVar, wn0.l lVar2, wn0.l lVar3, float f11, boolean z11, long j11, float f12, float f13, boolean z12, q0 q0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, lVar2, lVar3, f11, z11, j11, f12, f13, z12, q0Var);
    }

    private final long C2() {
        if (this.anchorPositionInRootState == null) {
            this.anchorPositionInRootState = n3.e(new a());
        }
        y3<j3.g> y3Var = this.anchorPositionInRootState;
        return y3Var != null ? y3Var.getValue().getPackedValue() : j3.g.INSTANCE.b();
    }

    private final void D2() {
        p0 p0Var = this.magnifier;
        if (p0Var != null) {
            p0Var.dismiss();
        }
        View viewA = this.view;
        if (viewA == null) {
            viewA = b4.l.a(this);
        }
        View view = viewA;
        this.view = view;
        w4.d dVarI = this.density;
        if (dVarI == null) {
            dVarI = b4.k.i(this);
        }
        w4.d dVar = dVarI;
        this.density = dVar;
        this.magnifier = this.platformMagnifierFactory.a(view, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, dVar, this.zoom);
        H2();
    }

    private final void E2(z3.v vVar) {
        this.layoutCoordinates.setValue(vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    public final void G2() {
        long jB;
        w4.d dVarI = this.density;
        if (dVarI == null) {
            dVarI = b4.k.i(this);
            this.density = dVarI;
        }
        long packedValue = this.sourceCenter.invoke(dVarI).getPackedValue();
        if (!j3.h.c(packedValue) || !j3.h.c(C2())) {
            this.sourceCenterInRoot = j3.g.INSTANCE.b();
            p0 p0Var = this.magnifier;
            if (p0Var != null) {
                p0Var.dismiss();
                return;
            }
            return;
        }
        this.sourceCenterInRoot = j3.g.r(C2(), packedValue);
        wn0.l<? super w4.d, j3.g> lVar = this.magnifierCenter;
        if (lVar != null) {
            j3.g gVarD = j3.g.d(lVar.invoke(dVarI).getPackedValue());
            if (!j3.h.c(gVarD.getPackedValue())) {
                gVarD = null;
            }
            if (gVarD != null) {
                jB = j3.g.r(C2(), gVarD.getPackedValue());
            } else {
                jB = j3.g.INSTANCE.b();
            }
        } else {
            jB = j3.g.INSTANCE.b();
        }
        long j11 = jB;
        if (this.magnifier == null) {
            D2();
        }
        p0 p0Var2 = this.magnifier;
        if (p0Var2 != null) {
            p0Var2.f(this.sourceCenterInRoot, j11, this.zoom);
        }
        H2();
    }

    private final void H2() {
        w4.d dVar;
        p0 p0Var = this.magnifier;
        if (p0Var == null || (dVar = this.density) == null || w4.r.d(p0Var.e(), this.previousSize)) {
            return;
        }
        wn0.l<? super w4.k, jn0.h0> lVar = this.onSizeChanged;
        if (lVar != null) {
            lVar.invoke(w4.k.c(dVar.o(w4.s.d(p0Var.e()))));
        }
        this.previousSize = w4.r.b(p0Var.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z3.v i0() {
        return (z3.v) this.layoutCoordinates.getValue();
    }

    @Override // b4.r
    public void F(m3.c cVar) {
        cVar.M0();
        Channel<jn0.h0> channel = this.drawSignalChannel;
        if (channel != null) {
            ChannelResult.m530boximpl(channel.mo85trySendJP2dKIU(jn0.h0.f84049a));
        }
    }

    public final void F2(wn0.l<? super w4.d, j3.g> sourceCenter, wn0.l<? super w4.d, j3.g> magnifierCenter, float zoom, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, wn0.l<? super w4.k, jn0.h0> onSizeChanged, q0 platformMagnifierFactory) {
        float f11 = this.zoom;
        long j11 = this.size;
        float f12 = this.cornerRadius;
        boolean z11 = this.useTextDefault;
        float f13 = this.elevation;
        boolean z12 = this.clippingEnabled;
        q0 q0Var = this.platformMagnifierFactory;
        View view = this.view;
        w4.d dVar = this.density;
        this.sourceCenter = sourceCenter;
        this.magnifierCenter = magnifierCenter;
        this.zoom = zoom;
        this.useTextDefault = useTextDefault;
        this.size = size;
        this.cornerRadius = cornerRadius;
        this.elevation = elevation;
        this.clippingEnabled = clippingEnabled;
        this.onSizeChanged = onSizeChanged;
        this.platformMagnifierFactory = platformMagnifierFactory;
        View viewA = b4.l.a(this);
        w4.d dVarI = b4.k.i(this);
        if (this.magnifier != null && ((!g0.a(zoom, f11) && !platformMagnifierFactory.b()) || !w4.k.f(size, j11) || !w4.h.i(cornerRadius, f12) || !w4.h.i(elevation, f13) || useTextDefault != z11 || clippingEnabled != z12 || !p013kotlin.jvm.internal.s.f(platformMagnifierFactory, q0Var) || !p013kotlin.jvm.internal.s.f(viewA, view) || !p013kotlin.jvm.internal.s.f(dVarI, dVar))) {
            D2();
        }
        G2();
    }

    @Override // b4.s1
    public void G0(g4.y yVar) {
        yVar.b(g0.b(), new b());
    }

    @Override // b4.t
    public void P(z3.v coordinates) {
        E2(coordinates);
    }

    @Override // b4.e1
    public void g1() {
        f1.a(this, new d());
    }

    @Override // androidx.compose.ui.d.c
    public void h2() {
        g1();
        this.drawSignalChannel = ChannelKt.Channel$default(0, null, null, 7, null);
        BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new c(null), 3, null);
    }

    @Override // androidx.compose.ui.d.c
    public void i2() {
        p0 p0Var = this.magnifier;
        if (p0Var != null) {
            p0Var.dismiss();
        }
        this.magnifier = null;
    }

    private f0(wn0.l<? super w4.d, j3.g> lVar, wn0.l<? super w4.d, j3.g> lVar2, wn0.l<? super w4.k, jn0.h0> lVar3, float f11, boolean z11, long j11, float f12, float f13, boolean z12, q0 q0Var) {
        this.sourceCenter = lVar;
        this.magnifierCenter = lVar2;
        this.onSizeChanged = lVar3;
        this.zoom = f11;
        this.useTextDefault = z11;
        this.size = j11;
        this.cornerRadius = f12;
        this.elevation = f13;
        this.clippingEnabled = z12;
        this.platformMagnifierFactory = q0Var;
        this.layoutCoordinates = n3.h(null, n3.j());
        this.sourceCenterInRoot = j3.g.INSTANCE.b();
    }
}
