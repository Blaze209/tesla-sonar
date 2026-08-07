package p021s1;

import androidx.compose.ui.d;
import b4.a0;
import b4.h;
import b4.k;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import j3.g;
import j3.i;
import j3.m;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import u3.e;
import w4.r;
import wn0.l;
import wn0.p;
import z3.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001ZB)\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\"\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\u00020\t*\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\"\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020'*\u00020\u001c2\u0006\u0010&\u001a\u00020\u001cH\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020'*\u00020*2\u0006\u0010&\u001a\u00020*H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010)J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010.J \u00100\u001a\u00020\u00142\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110/H\u0096@¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00142\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J\u001a\u00106\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107J'\u00108\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b8\u00109R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010E\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010Q\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010?R*\u0010W\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020\u001c8\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, d2 = {"Ls1/f;", "Landroidx/compose/ui/d$c;", "Lz1/c;", "Lb4/a0;", "Lb4/h;", "Ls1/p;", "orientation", "Ls1/z;", "scrollingLogic", "", "reverseDirection", "Ls1/d;", "bringIntoViewSpec", "<init>", "(Ls1/p;Ls1/z;ZLs1/d;)V", "T2", "()Ls1/d;", "Lj3/i;", "M2", "()Lj3/i;", "Ljn0/h0;", "Q2", "()V", "", "H2", "(Ls1/d;)F", "L2", "childBounds", "Lw4/r;", "containerSize", "K2", "(Lj3/i;J)Lj3/i;", "size", "O2", "(Lj3/i;J)Z", "Lj3/g;", "S2", "(Lj3/i;J)J", "other", "", "I2", "(JJ)I", "Lj3/m;", "J2", "localRect", "R0", "(Lj3/i;)Lj3/i;", "Lkotlin/Function0;", "N0", "(Lwn0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lz3/v;", "newBounds", "R2", "(Lz3/v;)V", "D", "(J)V", "U2", "(Ls1/p;ZLs1/d;)V", "n", "Ls1/p;", "o", "Ls1/z;", "p", "Z", "q", "Ls1/d;", "r", "c2", "()Z", "shouldAutoInvalidate", "Ls1/c;", "s", "Ls1/c;", "bringIntoViewRequests", "t", "Lz3/v;", "focusedChild", "u", "Lj3/i;", "focusedChildBoundsFromPreviousRemeasure", "v", "trackingFocusedChild", "<set-?>", "w", "J", "N2", "()J", "viewportSize", "x", "isAnimationRunning", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f extends d.c implements z1.c, a0, h {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private p orientation;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final z scrollingLogic;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean reverseDirection;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private d bringIntoViewSpec;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private v focusedChild;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private i focusedChildBoundsFromPreviousRemeasure;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean trackingFocusedChild;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean isAnimationRunning;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final p021s1.c bringIntoViewRequests = new p021s1.c();

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private long viewportSize = r.INSTANCE.a();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Ls1/f$a;", "", "Lkotlin/Function0;", "Lj3/i;", "currentBounds", "Lkotlinx/coroutines/CancellableContinuation;", "Ljn0/h0;", "continuation", "<init>", "(Lwn0/a;Lkotlinx/coroutines/CancellableContinuation;)V", "", "toString", "()Ljava/lang/String;", "a", "Lwn0/a;", "b", "()Lwn0/a;", "Lkotlinx/coroutines/CancellableContinuation;", "()Lkotlinx/coroutines/CancellableContinuation;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<i> currentBounds;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final CancellableContinuation<h0> continuation;

        /* JADX WARN: Multi-variable type inference failed */
        public a(wn0.a<i> aVar, CancellableContinuation<? super h0> cancellableContinuation) {
            this.currentBounds = aVar;
            this.continuation = cancellableContinuation;
        }

        public final CancellableContinuation<h0> a() {
            return this.continuation;
        }

        public final wn0.a<i> b() {
            return this.currentBounds;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0050  */
        public String toString() {
            String str;
            CoroutineName coroutineName = (CoroutineName) this.continuation.getContext().get(CoroutineName.INSTANCE);
            String name = coroutineName != null ? coroutineName.getName() : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Request@");
            String string = Integer.toString(hashCode(), p013kotlin.text.a.a(16));
            s.j(string, "toString(this, checkRadix(radix))");
            sb2.append(string);
            if (name != null) {
                str = '[' + name + "](";
                if (str == null) {
                    str = "(";
                }
            } else {
                str = "(";
            }
            sb2.append(str);
            sb2.append("currentBounds()=");
            sb2.append(this.currentBounds.invoke());
            sb2.append(", continuation=");
            sb2.append(this.continuation);
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sb2.toString();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f109479a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f109479a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f109480n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f109481o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ f0 f109483q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ d f109484r;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls1/o;", "Ljn0/h0;", "<anonymous>", "(Ls1/o;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<o, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f109485n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f109486o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ f0 f109487p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ f f109488q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ d f109489r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ Job f109490s;

            /* JADX INFO: renamed from: s1.f$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "Ljn0/h0;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
            static final class C2324a extends u implements l<Float, h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ f f109491c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ f0 f109492d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ Job f109493e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ o f109494f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2324a(f fVar, f0 f0Var, Job job, o oVar) {
                    super(1);
                    this.f109491c = fVar;
                    this.f109492d = f0Var;
                    this.f109493e = job;
                    this.f109494f = oVar;
                }

                public final void a(float f11) {
                    float f12 = this.f109491c.reverseDirection ? 1.0f : -1.0f;
                    z zVar = this.f109491c.scrollingLogic;
                    float fA = f12 * zVar.A(zVar.u(this.f109494f.b(zVar.u(zVar.B(f12 * f11)), e.INSTANCE.c())));
                    if (Math.abs(fA) < Math.abs(f11)) {
                        JobKt__JobKt.cancel$default(this.f109493e, "Scroll animation cancelled because scroll was not consumed (" + fA + " < " + f11 + CoreConstants.RIGHT_PARENTHESIS_CHAR, null, 2, null);
                    }
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ h0 invoke(Float f11) {
                    a(f11.floatValue());
                    return h0.f84049a;
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
            static final class b extends u implements wn0.a<h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ f f109495c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ f0 f109496d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ d f109497e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(f fVar, f0 f0Var, d dVar) {
                    super(0);
                    this.f109495c = fVar;
                    this.f109496d = f0Var;
                    this.f109497e = dVar;
                }

                public final void b() {
                    p021s1.c cVar = this.f109495c.bringIntoViewRequests;
                    f fVar = this.f109495c;
                    while (true) {
                        if (!cVar.requests.q()) {
                            break;
                        }
                        i iVarInvoke = ((a) cVar.requests.r()).b().invoke();
                        if (!(iVarInvoke == null ? true : f.P2(fVar, iVarInvoke, 0L, 1, null))) {
                            break;
                        } else {
                            ((a) cVar.requests.v(cVar.requests.getSize() - 1)).a().resumeWith(jn0.s.b(h0.f84049a));
                        }
                    }
                    if (this.f109495c.trackingFocusedChild) {
                        i iVarM2 = this.f109495c.M2();
                        if (iVarM2 != null && f.P2(this.f109495c, iVarM2, 0L, 1, null)) {
                            this.f109495c.trackingFocusedChild = false;
                        }
                    }
                    this.f109496d.j(this.f109495c.H2(this.f109497e));
                }

                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    b();
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f0 f0Var, f fVar, d dVar, Job job, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f109487p = f0Var;
                this.f109488q = fVar;
                this.f109489r = dVar;
                this.f109490s = job;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(o oVar, Continuation<? super h0> continuation) {
                return ((a) create(oVar, continuation)).invokeSuspend(h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f109487p, this.f109488q, this.f109489r, this.f109490s, continuation);
                aVar.f109486o = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f109485n;
                if (i11 == 0) {
                    t.b(obj);
                    o oVar = (o) this.f109486o;
                    this.f109487p.j(this.f109488q.H2(this.f109489r));
                    f0 f0Var = this.f109487p;
                    C2324a c2324a = new C2324a(this.f109488q, f0Var, this.f109490s, oVar);
                    b bVar = new b(this.f109488q, this.f109487p, this.f109489r);
                    this.f109485n = 1;
                    if (f0Var.h(c2324a, bVar, this) == coroutine_suspended) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f0 f0Var, d dVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f109483q = f0Var;
            this.f109484r = dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = f.this.new c(this.f109483q, this.f109484r, continuation);
            cVar.f109481o = obj;
            return cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f109480n;
            try {
                try {
                    if (i11 == 0) {
                        t.b(obj);
                        Job job = JobKt.getJob(((CoroutineScope) this.f109481o).getCoroutineContext());
                        f.this.isAnimationRunning = true;
                        z zVar = f.this.scrollingLogic;
                        q1.h0 h0Var = q1.h0.Default;
                        a aVar = new a(this.f109483q, f.this, this.f109484r, job, null);
                        this.f109480n = 1;
                        if (zVar.v(h0Var, aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t.b(obj);
                    }
                    f.this.bringIntoViewRequests.d();
                    f.this.isAnimationRunning = false;
                    f.this.bringIntoViewRequests.b(null);
                    f.this.trackingFocusedChild = false;
                    return h0.f84049a;
                } catch (CancellationException e11) {
                    throw e11;
                }
            } catch (Throwable th2) {
                f.this.isAnimationRunning = false;
                f.this.bringIntoViewRequests.b(null);
                f.this.trackingFocusedChild = false;
                throw th2;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public f(p pVar, z zVar, boolean z11, d dVar) {
        this.orientation = pVar;
        this.scrollingLogic = zVar;
        this.reverseDirection = z11;
        this.bringIntoViewSpec = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float H2(d bringIntoViewSpec) {
        if (r.e(this.viewportSize, r.INSTANCE.a())) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        i iVarL2 = L2();
        if (iVarL2 == null) {
            iVarL2 = this.trackingFocusedChild ? M2() : null;
            if (iVarL2 == null) {
                return BitmapDescriptorFactory.HUE_RED;
            }
        }
        long jD = w4.s.d(this.viewportSize);
        int i11 = b.f109479a[this.orientation.ordinal()];
        if (i11 == 1) {
            return bringIntoViewSpec.b(iVarL2.getTop(), iVarL2.getBottom() - iVarL2.getTop(), m.i(jD));
        }
        if (i11 == 2) {
            return bringIntoViewSpec.b(iVarL2.getLeft(), iVarL2.getRight() - iVarL2.getLeft(), m.k(jD));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int I2(long j11, long j12) {
        int i11 = b.f109479a[this.orientation.ordinal()];
        if (i11 == 1) {
            return s.m(r.f(j11), r.f(j12));
        }
        if (i11 == 2) {
            return s.m(r.g(j11), r.g(j12));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int J2(long j11, long j12) {
        int i11 = b.f109479a[this.orientation.ordinal()];
        if (i11 == 1) {
            return Float.compare(m.i(j11), m.i(j12));
        }
        if (i11 == 2) {
            return Float.compare(m.k(j11), m.k(j12));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final i K2(i childBounds, long containerSize) {
        return childBounds.u(g.u(S2(childBounds, containerSize)));
    }

    private final i L2() {
        t2.b bVar = this.bringIntoViewRequests.requests;
        int size = bVar.getSize();
        i iVar = null;
        if (size > 0) {
            int i11 = size - 1;
            Object[] objArrM = bVar.m();
            do {
                i iVarInvoke = ((a) objArrM[i11]).b().invoke();
                if (iVarInvoke != null) {
                    if (J2(iVarInvoke.k(), w4.s.d(this.viewportSize)) > 0) {
                        return iVar == null ? iVarInvoke : iVar;
                    }
                    iVar = iVarInvoke;
                }
                i11--;
            } while (i11 >= 0);
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i M2() {
        if (!getIsAttached()) {
            return null;
        }
        v vVarK = k.k(this);
        v vVar = this.focusedChild;
        if (vVar != null) {
            if (!vVar.b0()) {
                vVar = null;
            }
            if (vVar != null) {
                return vVarK.F(vVar, false);
            }
        }
        return null;
    }

    private final boolean O2(i iVar, long j11) {
        long jS2 = S2(iVar, j11);
        return Math.abs(g.m(jS2)) <= 0.5f && Math.abs(g.n(jS2)) <= 0.5f;
    }

    static /* synthetic */ boolean P2(f fVar, i iVar, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = fVar.viewportSize;
        }
        return fVar.O2(iVar, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q2() {
        d dVarT2 = T2();
        if (this.isAnimationRunning) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        BuildersKt__Builders_commonKt.launch$default(X1(), null, CoroutineStart.UNDISPATCHED, new c(new f0(dVarT2.a()), dVarT2, null), 1, null);
    }

    private final long S2(i childBounds, long containerSize) {
        long jD = w4.s.d(containerSize);
        int i11 = b.f109479a[this.orientation.ordinal()];
        if (i11 == 1) {
            return j3.h.a(BitmapDescriptorFactory.HUE_RED, T2().b(childBounds.getTop(), childBounds.getBottom() - childBounds.getTop(), m.i(jD)));
        }
        if (i11 == 2) {
            return j3.h.a(T2().b(childBounds.getLeft(), childBounds.getRight() - childBounds.getLeft(), m.k(jD)), BitmapDescriptorFactory.HUE_RED);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final d T2() {
        d dVar = this.bringIntoViewSpec;
        return dVar == null ? (d) b4.i.a(this, e.a()) : dVar;
    }

    @Override // b4.a0
    public void D(long size) {
        i iVarM2;
        long j11 = this.viewportSize;
        this.viewportSize = size;
        if (I2(size, j11) < 0 && (iVarM2 = M2()) != null) {
            i iVar = this.focusedChildBoundsFromPreviousRemeasure;
            if (iVar == null) {
                iVar = iVarM2;
            }
            if (!this.isAnimationRunning && !this.trackingFocusedChild && O2(iVar, j11) && !O2(iVarM2, size)) {
                this.trackingFocusedChild = true;
                Q2();
            }
            this.focusedChildBoundsFromPreviousRemeasure = iVarM2;
        }
    }

    @Override // z1.c
    public Object N0(wn0.a<i> aVar, Continuation<? super h0> continuation) {
        i iVarInvoke = aVar.invoke();
        if (iVarInvoke == null || P2(this, iVarInvoke, 0L, 1, null)) {
            return h0.f84049a;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (this.bringIntoViewRequests.c(new a(aVar, cancellableContinuationImpl)) && !this.isAnimationRunning) {
            Q2();
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : h0.f84049a;
    }

    /* JADX INFO: renamed from: N2, reason: from getter */
    public final long getViewportSize() {
        return this.viewportSize;
    }

    @Override // z1.c
    public i R0(i localRect) {
        if (r.e(this.viewportSize, r.INSTANCE.a())) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return K2(localRect, this.viewportSize);
    }

    public final void R2(v newBounds) {
        this.focusedChild = newBounds;
    }

    public final void U2(p orientation, boolean reverseDirection, d bringIntoViewSpec) {
        this.orientation = orientation;
        this.reverseDirection = reverseDirection;
        this.bringIntoViewSpec = bringIntoViewSpec;
    }

    @Override // androidx.compose.ui.d.c
    /* JADX INFO: renamed from: c2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }
}
