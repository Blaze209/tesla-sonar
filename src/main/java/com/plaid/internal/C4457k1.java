package com.plaid.internal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p003lifecycle.Lifecycle;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/plaid/internal/k1;", "Lcom/plaid/internal/k8;", "Lcom/plaid/internal/l1;", "<init>", "()V", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class C4457k1 extends k8<C4466l1> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f47787e = 0;

    /* JADX INFO: renamed from: com.plaid.internal.k1$a */
    @DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthFragment$onCreate$1", f = "HeadlessOAuthFragment.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47788a;

        /* JADX INFO: renamed from: com.plaid.internal.k1$a$a, reason: collision with other inner class name */
        @DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthFragment$onCreate$1$1", f = "HeadlessOAuthFragment.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0757a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f47790a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C4457k1 f47791b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0757a(C4457k1 c4457k1, Continuation<? super C0757a> continuation) {
                super(2, continuation);
                this.f47791b = c4457k1;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new C0757a(this.f47791b, continuation);
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return new C0757a(this.f47791b, continuation).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f47790a;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    C4457k1 c4457k1 = this.f47791b;
                    int i12 = C4457k1.f47787e;
                    Object obj2 = c4457k1.f47816b;
                    if (obj2 == null) {
                        p013kotlin.jvm.internal.s.B("viewModel");
                        obj2 = null;
                    }
                    this.f47790a = 1;
                    if (((C4466l1) obj2).a(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                return jn0.h0.f84049a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return C4457k1.this.new a(continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return C4457k1.this.new a(continuation).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f47788a;
            if (i11 == 0) {
                jn0.t.b(obj);
                C4457k1 c4457k1 = C4457k1.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                C0757a c0757a = new C0757a(c4457k1, null);
                this.f47788a = 1;
                if (androidx.p003lifecycle.p0.b(c4457k1, state, c0757a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }
    }

    @Override // com.plaid.internal.k8
    public final C4466l1 a(m8 paneId, J4 component) {
        p013kotlin.jvm.internal.s.k(paneId, "paneId");
        p013kotlin.jvm.internal.s.k(component, "component");
        return new C4466l1(paneId, component);
    }

    @Override // com.plaid.internal.k8, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(this), null, null, new a(null), 3, null);
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        p013kotlin.jvm.internal.s.k(inflater, "inflater");
        return null;
    }
}
