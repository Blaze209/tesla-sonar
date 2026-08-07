package androidx.compose.foundation;

import b4.r;
import b4.s;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import jn0.h0;
import jn0.t;
import k3.p1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.l0;
import q1.e0;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/g;", "Lq1/e0;", "<init>", "()V", "Lu1/j;", "interactionSource", "Lb4/j;", "a", "(Lu1/j;)Lb4/j;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class g implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f4291a = new g();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/g$a;", "Landroidx/compose/ui/d$c;", "Lb4/r;", "Lu1/j;", "interactionSource", "<init>", "(Lu1/j;)V", "Ljn0/h0;", "h2", "()V", "Lm3/c;", Gender.FEMALE, "(Lm3/c;)V", "n", "Lu1/j;", "", "o", "Z", "isPressed", "p", "isHovered", "q", "isFocused", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a extends androidx.compose.ui.d.c implements r {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final u1.j interactionSource;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private boolean isPressed;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private boolean isHovered;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private boolean isFocused;

        /* JADX INFO: renamed from: androidx.compose.foundation.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class C0089a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f4296n;

            /* JADX INFO: renamed from: androidx.compose.foundation.g$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu1/i;", "interaction", "Ljn0/h0;", "a", "(Lu1/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
            static final class C0090a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ l0 f4298a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ l0 f4299b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ l0 f4300c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ a f4301d;

                C0090a(l0 l0Var, l0 l0Var2, l0 l0Var3, a aVar) {
                    this.f4298a = l0Var;
                    this.f4299b = l0Var2;
                    this.f4300c = l0Var3;
                    this.f4301d = aVar;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(u1.i iVar, Continuation<? super h0> continuation) {
                    boolean z11 = true;
                    if (iVar instanceof u1.n.b) {
                        this.f4298a.f86527a++;
                    } else if (iVar instanceof u1.n.c) {
                        this.f4298a.f86527a--;
                    } else if (iVar instanceof u1.n.a) {
                        this.f4298a.f86527a--;
                    } else if (iVar instanceof u1.g) {
                        this.f4299b.f86527a++;
                    } else if (iVar instanceof u1.h) {
                        this.f4299b.f86527a--;
                    } else if (iVar instanceof u1.d) {
                        this.f4300c.f86527a++;
                    } else if (iVar instanceof u1.e) {
                        this.f4300c.f86527a--;
                    }
                    boolean z12 = false;
                    boolean z13 = this.f4298a.f86527a > 0;
                    boolean z14 = this.f4299b.f86527a > 0;
                    boolean z15 = this.f4300c.f86527a > 0;
                    if (this.f4301d.isPressed != z13) {
                        this.f4301d.isPressed = z13;
                        z12 = true;
                    }
                    if (this.f4301d.isHovered != z14) {
                        this.f4301d.isHovered = z14;
                        z12 = true;
                    }
                    if (this.f4301d.isFocused != z15) {
                        this.f4301d.isFocused = z15;
                    } else {
                        z11 = z12;
                    }
                    if (z11) {
                        s.a(this.f4301d);
                    }
                    return h0.f84049a;
                }
            }

            C0089a(Continuation<? super C0089a> continuation) {
                super(2, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return a.this.new C0089a(continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f4296n;
                if (i11 == 0) {
                    t.b(obj);
                    l0 l0Var = new l0();
                    l0 l0Var2 = new l0();
                    l0 l0Var3 = new l0();
                    Flow<u1.i> flowC = a.this.interactionSource.c();
                    C0090a c0090a = new C0090a(l0Var, l0Var2, l0Var3, a.this);
                    this.f4296n = 1;
                    if (flowC.collect(c0090a, this) == coroutine_suspended) {
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

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C0089a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        public a(u1.j jVar) {
            this.interactionSource = jVar;
        }

        @Override // b4.r
        public void F(m3.c cVar) {
            cVar.M0();
            if (this.isPressed) {
                m3.f.C0(cVar, p1.p(p1.INSTANCE.a(), 0.3f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), 0L, cVar.b(), BitmapDescriptorFactory.HUE_RED, null, null, 0, 122, null);
            } else if (this.isHovered || this.isFocused) {
                m3.f.C0(cVar, p1.p(p1.INSTANCE.a(), 0.1f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), 0L, cVar.b(), BitmapDescriptorFactory.HUE_RED, null, null, 0, 122, null);
            }
        }

        @Override // androidx.compose.ui.d.c
        public void h2() {
            BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new C0089a(null), 3, null);
        }
    }

    private g() {
    }

    @Override // q1.e0
    public b4.j a(u1.j interactionSource) {
        return new a(interactionSource);
    }

    public boolean equals(Object other) {
        return other == this;
    }

    public int hashCode() {
        return -1;
    }
}
