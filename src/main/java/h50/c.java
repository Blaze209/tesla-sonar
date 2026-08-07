package h50;

import android.os.Bundle;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.util.Date;
import java.util.Map;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import m40.p;
import n40.p0;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import q50.TopAppBarStateUpdate;
import s50.i;
import t50.u;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0000\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"B3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u0010J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001b\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lh50/c;", "Ls50/i;", "Lh50/b;", "initialState", "Ln40/p0;", "nativeAuthFlowCoordinator", "Lo50/f;", "navigationManager", "Lt50/u;", "noticeSheetContentRepository", "Lv50/d;", "handleClickableUrl", "<init>", "(Lh50/b;Ln40/p0;Lo50/f;Lt50/u;Lv50/d;)V", "Ljn0/h0;", "u", "()V", "state", "Lq50/c;", "w", "(Lh50/b;)Lq50/c;", "", "uri", "s", "(Ljava/lang/String;)V", "t", "v", "onCleared", "Lo50/f;", "Lt50/u;", "x", "Lv50/d;", "y", "a", "b", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c extends i<NoticeSheetState> {

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f70870z = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final o50.f navigationManager;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final u noticeSheetContentRepository;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final v50.d handleClickableUrl;

    /* JADX INFO: renamed from: h50.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lh50/c$a;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroid/os/Bundle;", "arguments", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;Landroid/os/Bundle;)Landroidx/lifecycle/ViewModelProvider$Factory;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: h50.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Lh50/c;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Lh50/c;"}, k = 3, mv = {1, 9, 0})
        static final class C1477a extends p013kotlin.jvm.internal.u implements l<CreationExtras, c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p f70874c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f70875d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1477a(p pVar, Bundle bundle) {
                super(1);
                this.f70874c = pVar;
                this.f70875d = bundle;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(CreationExtras initializer) {
                s.k(initializer, "$this$initializer");
                return this.f70874c.p().a(new NoticeSheetState(this.f70875d));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewModelProvider.Factory a(p parentComponent, Bundle arguments) {
            s.k(parentComponent, "parentComponent");
            m7.b bVar = new m7.b();
            bVar.a(o0.b(c.class), new C1477a(parentComponent, arguments));
            return bVar.b();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh50/c$b;", "", "Lh50/b;", "initialState", "Lh50/c;", "a", "(Lh50/b;)Lh50/c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        c a(NoticeSheetState initialState);
    }

    /* JADX INFO: renamed from: h50.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel$handleClickableTextClick$1", f = "NoticeSheetViewModel.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    static final class C1478c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70876n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f70878p;

        /* JADX INFO: renamed from: h50.c$c$a */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements l<String, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f70879c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f70880d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ Date f70881e;

            /* JADX INFO: renamed from: h50.c$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh50/b;", "a", "(Lh50/b;)Lh50/b;"}, k = 3, mv = {1, 9, 0})
            static final class C1479a extends p013kotlin.jvm.internal.u implements l<NoticeSheetState, NoticeSheetState> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f70882c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Date f70883d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1479a(String str, Date date) {
                    super(1);
                    this.f70882c = str;
                    this.f70883d = date;
                }

                @Override // wn0.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final NoticeSheetState invoke(NoticeSheetState setState) {
                    s.k(setState, "$this$setState");
                    return NoticeSheetState.b(setState, null, null, new NoticeSheetState.InterfaceC1476b.OpenUrl(this.f70882c, this.f70883d.getTime()), 3, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, String str, Date date) {
                super(1);
                this.f70879c = cVar;
                this.f70880d = str;
                this.f70881e = date;
            }

            public final void a(String it) {
                s.k(it, "it");
                this.f70879c.k(new C1479a(this.f70880d, this.f70881e));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(String str) {
                a(str);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1478c(String str, Continuation<? super C1478c> continuation) {
            super(2, continuation);
            this.f70878p = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new C1478c(this.f70878p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f70876n;
            if (i11 == 0) {
                t.b(obj);
                Date date = new Date();
                FinancialConnectionsSessionManifest.Pane pane = c.this.h().getValue().getPane();
                v50.d dVar = c.this.handleClickableUrl;
                String str = this.f70878p;
                a aVar = new a(c.this, str, date);
                Map<String, ? extends wn0.p<? super v50.d.DeeplinkPayload, ? super Continuation<? super h0>, ? extends Object>> mapI = v0.i();
                this.f70876n = 1;
                if (dVar.b(pane, str, aVar, mapI, this) == coroutine_suspended) {
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
            return ((C1478c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel$loadNoticeSheetContent$1", f = "NoticeSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70884n;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh50/b;", "a", "(Lh50/b;)Lh50/b;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements l<NoticeSheetState, NoticeSheetState> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ NoticeSheetState.a f70886c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(NoticeSheetState.a aVar) {
                super(1);
                this.f70886c = aVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NoticeSheetState invoke(NoticeSheetState setState) {
                s.k(setState, "$this$setState");
                return NoticeSheetState.b(setState, null, this.f70886c, null, 5, null);
            }
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f70884n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            u.State stateB = c.this.noticeSheetContentRepository.b();
            NoticeSheetState.a content = stateB != null ? stateB.getContent() : null;
            if (content != null) {
                c.this.k(new a(content));
            } else {
                c.this.navigationManager.c();
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh50/b;", "a", "(Lh50/b;)Lh50/b;"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements l<NoticeSheetState, NoticeSheetState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f70887c = new e();

        e() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NoticeSheetState invoke(NoticeSheetState setState) {
            s.k(setState, "$this$setState");
            return NoticeSheetState.b(setState, null, null, null, 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NoticeSheetState initialState, p0 nativeAuthFlowCoordinator, o50.f navigationManager, u noticeSheetContentRepository, v50.d handleClickableUrl) {
        super(initialState, nativeAuthFlowCoordinator);
        s.k(initialState, "initialState");
        s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        s.k(navigationManager, "navigationManager");
        s.k(noticeSheetContentRepository, "noticeSheetContentRepository");
        s.k(handleClickableUrl, "handleClickableUrl");
        this.navigationManager = navigationManager;
        this.noticeSheetContentRepository = noticeSheetContentRepository;
        this.handleClickableUrl = handleClickableUrl;
        u();
    }

    private final void u() {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new d(null), 3, null);
    }

    @Override // androidx.p003lifecycle.c1
    protected void onCleared() {
        this.noticeSheetContentRepository.a();
        super.onCleared();
    }

    public final void s(String uri) {
        s.k(uri, "uri");
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new C1478c(uri, null), 3, null);
    }

    public final void t() {
        this.navigationManager.c();
    }

    public final void v() {
        k(e.f70887c);
    }

    @Override // s50.i
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(NoticeSheetState state) {
        s.k(state, "state");
        return null;
    }
}
