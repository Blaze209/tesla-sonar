package com.plaid.internal;

import android.content.Intent;
import com.plaid.internal.link.LinkActivity;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.redirect.LinkRedirectActivityViewModel$redirectToLink$1", f = "LinkRedirectActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class J2 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkRedirectActivity f46370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC4587y6 f46371b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(LinkRedirectActivity linkRedirectActivity, AbstractC4587y6 abstractC4587y6, Continuation continuation) {
        super(2, continuation);
        this.f46370a = linkRedirectActivity;
        this.f46371b = abstractC4587y6;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new J2(this.f46370a, this.f46371b, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return new J2(this.f46370a, this.f46371b, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        jn0.t.b(obj);
        X5.f46812a.getClass();
        X5.a.a("Launching LinkActivity", true);
        LinkRedirectActivity context = this.f46370a;
        int i11 = LinkActivity.f47849e;
        AbstractC4587y6 state = this.f46371b;
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(state, "redirectState");
        Intent intent = new Intent(context, (Class<?>) LinkActivity.class);
        intent.setFlags(603979776);
        p013kotlin.jvm.internal.s.k(intent, "<this>");
        p013kotlin.jvm.internal.s.k(state, "state");
        if (state instanceof AbstractC4587y6.a) {
            intent.putExtra("link_oauth_redirect", true);
            intent.putExtra("link_oauth_received_redirect_uri", ((AbstractC4587y6.a) state).f48245a);
        } else if (state instanceof AbstractC4587y6.b) {
            intent.putExtra("link_out_of_process_complete_redirect", true);
            intent.putExtra("link_out_of_process_complete_redirect_uri", ((AbstractC4587y6.b) state).f48246a);
        } else if (state instanceof AbstractC4587y6.d) {
            intent.putExtra("redirect_error", true);
            intent.putExtra("redirect_error_exception", ((AbstractC4587y6.d) state).f48247a);
        } else if (state instanceof AbstractC4587y6.e) {
            intent.putExtra("link_resume_redirect", true);
        }
        context.startActivity(intent);
        return jn0.h0.f84049a;
    }
}
