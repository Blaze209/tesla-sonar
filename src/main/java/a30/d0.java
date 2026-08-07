package a30;

import android.content.res.Resources;
import android.view.View;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.CoreConstants;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0003¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroid/view/View;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "block", "Lkotlinx/coroutines/Job;", "b", "(Landroid/view/View;Lkotlin/coroutines/CoroutineContext;Lwn0/p;)Lkotlinx/coroutines/Job;", "La30/c;", "a", "(Landroid/view/View;)La30/c;", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class d0 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 6, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> f130e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c cVar, CoroutineContext coroutineContext, wn0.p<? super CoroutineScope, ? super Continuation<? super jn0.h0>, ? extends Object> pVar) {
            super(0);
            this.f128c = cVar;
            this.f129d = coroutineContext;
            this.f130e = pVar;
        }

        public final void b() {
            BuildersKt.launch(this.f128c.getCoroutineScope(), this.f129d, CoroutineStart.UNDISPATCHED, this.f130e);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    private static final c a(View view) {
        Object tag = view.getTag(q.f191b);
        c cVar = null;
        c cVar2 = tag instanceof c ? (c) tag : null;
        if (cVar2 != null && CoroutineScopeKt.isActive(cVar2.getCoroutineScope())) {
            cVar = cVar2;
        }
        if (cVar != null) {
            return cVar;
        }
        LifecycleOwner lifecycleOwnerA = b30.c.f16002a.a(view);
        if (lifecycleOwnerA == null) {
            throw new IllegalStateException("ViewTreeLifecycleOwner is required by View.ensureAttachedScope");
        }
        androidx.p003lifecycle.r rVarA = androidx.p003lifecycle.x.a(lifecycleOwnerA);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((Object) view.getClass().getName());
        sb3.append('@');
        sb3.append(view.hashCode());
        sb2.append(sb3.toString());
        if (view.getId() != -1) {
            try {
                String resourceEntryName = view.getResources().getResourceEntryName(view.getId());
                sb2.append(CoreConstants.DASH_CHAR);
                sb2.append(resourceEntryName);
            } catch (Resources.NotFoundException unused) {
            }
        }
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "StringBuilder().apply(builderAction).toString()");
        c cVar3 = new c(CoroutineScopeKt.plus(rVarA, new CoroutineName(string)));
        view.setTag(q.f191b, cVar3);
        view.addOnAttachStateChangeListener(cVar3);
        return cVar3;
    }

    public static final Job b(View view, CoroutineContext context, wn0.p<? super CoroutineScope, ? super Continuation<? super jn0.h0>, ? extends Object> block) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(block, "block");
        if (context.get(Job.INSTANCE) != null) {
            throw new IllegalArgumentException("Expected custom CoroutineContext to not contain a Job.");
        }
        c cVarA = a(view);
        a aVar = new a(cVarA, context, block);
        if (view.isAttachedToWindow()) {
            aVar.invoke();
        } else {
            cVarA.c(aVar);
        }
        return JobKt.getJob(cVarA.getCoroutineScope().getCoroutineContext());
    }

    public static /* synthetic */ Job c(View view, CoroutineContext coroutineContext, wn0.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return b(view, coroutineContext, pVar);
    }
}
