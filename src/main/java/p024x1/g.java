package p024x1;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.j0;
import p013kotlin.jvm.internal.k0;
import p013kotlin.jvm.internal.l0;
import p013kotlin.jvm.internal.n0;
import p019p1.AnimationState;
import p019p1.m;
import p021s1.u;
import w4.d;
import w4.h;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a4\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0080@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0015"}, d2 = {"Lx1/h;", "", "index", "", "e", "(Lx1/h;I)Z", "scrollOffset", "numOfItemsForTeleport", "Lw4/d;", "density", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lx1/h;IIILw4/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lw4/h;", "a", Gender.FEMALE, "TargetDistance", "b", "BoundDistance", "c", "MinimumDistance", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f122559a = h.g(2500);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f122560b = h.g(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f122561c = h.g(50);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls1/u;", "Ljn0/h0;", "<anonymous>", "(Ls1/u;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, l = {174, EnumC4419g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
    static final class a extends SuspendLambda implements p<u, Continuation<? super h0>, Object> {
        final /* synthetic */ int A;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f122562n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f122563o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f122564p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f122565q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        float f122566r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        float f122567s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f122568t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f122569u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private /* synthetic */ Object f122570v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f122571w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ d f122572x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ h f122573y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f122574z;

        /* JADX INFO: renamed from: x1.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/h;", "", "Lp1/m;", "Ljn0/h0;", "a", "(Lp1/h;)V"}, k = 3, mv = {1, 8, 0})
        static final class C2635a extends p013kotlin.jvm.internal.u implements l<p019p1.h<Float, m>, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f122575c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f122576d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ float f122577e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ k0 f122578f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ u f122579g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ j0 f122580h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ boolean f122581i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ float f122582j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ l0 f122583k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f122584l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ int f122585m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ n0<AnimationState<Float, m>> f122586n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2635a(h hVar, int i11, float f11, k0 k0Var, u uVar, j0 j0Var, boolean z11, float f12, l0 l0Var, int i12, int i13, n0<AnimationState<Float, m>> n0Var) {
                super(1);
                this.f122575c = hVar;
                this.f122576d = i11;
                this.f122577e = f11;
                this.f122578f = k0Var;
                this.f122579g = uVar;
                this.f122580h = j0Var;
                this.f122581i = z11;
                this.f122582j = f12;
                this.f122583k = l0Var;
                this.f122584l = i12;
                this.f122585m = i13;
                this.f122586n = n0Var;
            }

            public final void a(p019p1.h<Float, m> hVar) {
                if (!g.e(this.f122575c, this.f122576d)) {
                    float fI = (this.f122577e > BitmapDescriptorFactory.HUE_RED ? n.i(hVar.e().floatValue(), this.f122577e) : n.e(hVar.e().floatValue(), this.f122577e)) - this.f122578f.f86525a;
                    float fA = this.f122579g.a(fI);
                    if (!g.e(this.f122575c, this.f122576d) && !a.c(this.f122581i, this.f122575c, this.f122576d, this.f122585m)) {
                        if (fI != fA) {
                            hVar.a();
                            this.f122580h.f86523a = false;
                            return;
                        }
                        this.f122578f.f86525a += fI;
                        if (this.f122581i) {
                            if (hVar.e().floatValue() > this.f122582j) {
                                hVar.a();
                            }
                        } else if (hVar.e().floatValue() < (-this.f122582j)) {
                            hVar.a();
                        }
                        if (this.f122581i) {
                            if (this.f122583k.f86527a >= 2) {
                                int iE = this.f122576d - this.f122575c.e();
                                int i11 = this.f122584l;
                                if (iE > i11) {
                                    this.f122575c.b(this.f122579g, this.f122576d - i11, 0);
                                }
                            }
                        } else if (this.f122583k.f86527a >= 2) {
                            int iD = this.f122575c.d();
                            int i12 = this.f122576d;
                            int i13 = iD - i12;
                            int i14 = this.f122584l;
                            if (i13 > i14) {
                                this.f122575c.b(this.f122579g, i12 + i14, 0);
                            }
                        }
                    }
                }
                if (!a.c(this.f122581i, this.f122575c, this.f122576d, this.f122585m)) {
                    if (g.e(this.f122575c, this.f122576d)) {
                        throw new f(yn0.a.d(this.f122575c.f(this.f122576d)), this.f122586n.f86529a);
                    }
                } else {
                    this.f122575c.b(this.f122579g, this.f122576d, this.f122585m);
                    this.f122580h.f86523a = false;
                    hVar.a();
                }
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(p019p1.h<Float, m> hVar) {
                a(hVar);
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/h;", "", "Lp1/m;", "Ljn0/h0;", "a", "(Lp1/h;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends p013kotlin.jvm.internal.u implements l<p019p1.h<Float, m>, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f122587c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ k0 f122588d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ u f122589e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(float f11, k0 k0Var, u uVar) {
                super(1);
                this.f122587c = f11;
                this.f122588d = k0Var;
                this.f122589e = uVar;
            }

            public final void a(p019p1.h<Float, m> hVar) {
                float f11 = this.f122587c;
                float fE = BitmapDescriptorFactory.HUE_RED;
                if (f11 > BitmapDescriptorFactory.HUE_RED) {
                    fE = n.i(hVar.e().floatValue(), this.f122587c);
                } else if (f11 < BitmapDescriptorFactory.HUE_RED) {
                    fE = n.e(hVar.e().floatValue(), this.f122587c);
                }
                float f12 = fE - this.f122588d.f86525a;
                if (f12 != this.f122589e.a(f12) || fE != hVar.e().floatValue()) {
                    hVar.a();
                }
                this.f122588d.f86525a += f12;
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(p019p1.h<Float, m> hVar) {
                a(hVar);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, d dVar, h hVar, int i12, int i13, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f122571w = i11;
            this.f122572x = dVar;
            this.f122573y = hVar;
            this.f122574z = i12;
            this.A = i13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean c(boolean z11, h hVar, int i11, int i12) {
            if (z11) {
                if (hVar.d() > i11) {
                    return true;
                }
                return hVar.d() == i11 && hVar.g() > i12;
            }
            if (hVar.d() < i11) {
                return true;
            }
            return hVar.d() == i11 && hVar.g() < i12;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(u uVar, Continuation<? super h0> continuation) {
            return ((a) create(uVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f122571w, this.f122572x, this.f122573y, this.f122574z, this.A, continuation);
            aVar.f122570v = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00c9 A[Catch: f -> 0x00f4, TryCatch #2 {f -> 0x00f4, blocks: (B:27:0x00c5, B:29:0x00c9, B:31:0x00d1, B:33:0x00e5, B:43:0x0102, B:47:0x013f), top: B:92:0x00c5 }] */
        /* JADX WARN: Code duplicated, block: B:40:0x00fb A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:41:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:45:0x013c  */
        /* JADX WARN: Code duplicated, block: B:46:0x013e  */
        /* JADX WARN: Code duplicated, block: B:51:0x014a  */
        /* JADX WARN: Code duplicated, block: B:52:0x014d  */
        /* JADX WARN: Code duplicated, block: B:59:0x018f  */
        /* JADX WARN: Code duplicated, block: B:60:0x0191  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v14, types: [T, p1.k] */
        /* JADX WARN: Type inference failed for: r7v0, types: [T, p1.k] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0191 -> B:90:0x0197). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r36) {
            /*
                Method dump skipped, instruction units count: 591
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: x1.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object d(h hVar, int i11, int i12, int i13, d dVar, Continuation<? super h0> continuation) {
        Object objC = hVar.c(new a(i11, dVar, hVar, i12, i13, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : h0.f84049a;
    }

    public static final boolean e(h hVar, int i11) {
        return i11 <= hVar.e() && hVar.d() <= i11;
    }
}
